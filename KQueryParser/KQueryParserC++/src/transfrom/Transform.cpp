#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <stack>
#include <regex>

#include "antlr4-runtime.h"
#include "KQueryLexer.h"
#include "KQueryParser.h"
#include "ParserRuleContext.h"
#include "ParseTree.h"

#include "SymbolicVar.h"
#include "Transform.h"
#include "Expression.h"
#include "GlobalFunction.h"
#include "IDInfo.h"
#include "ArrayElement.h"
#include "Solver.h"
#include "InverseIIBasedOI.h"


using namespace std;
using namespace antlr4;
using namespace antlrcpp;

    /*
        构造函数
    */
    Transform::Transform( KQueryParser::KqueryContext* ctx,string solverPath)
    {
        this->ctx = ctx;
        this->solverPath = solverPath;
    }


    /*
        写上如下的析构函数会报错,这个问题的有待解决
        通过遍历析构所有的申请的内存空间
    */
    Transform::~Transform()
    {
        for(int i=0;i<(int)this->symbolicVarList.size();i++)
            delete this->symbolicVarList[i];
        this->symbolicVarList.clear();

        for(int i=0;i<(int)this->expressionList.size();i++)
            this->expressionList[i]->makeClean();
        this->expressionList.clear();

        for(map<string,IDInfo*>::iterator iter = this->mapAlias.begin();iter!=this->mapAlias.end();iter++)
            delete iter->second;
        this->mapAlias.clear();

        for(map< string,ArrayElement* >::iterator iter = this->mapInputSymbolic.begin();iter!=this->mapInputSymbolic.end();iter++)
            delete iter->second;
        this->mapInputSymbolic.clear();

        this->constraints.clear();
        this->finalComplexConstraints.clear();
        this->symbolicVarType.clear();
        this->finalSymbolicType.clear();
        this->symbolicVarName.clear();
        this->finalSymbolicVarName.clear();

        delete this->solver;
        this->solver = NULL;
        this->solverPath.clear();

        delete this->inverseIIBasedOIHandler;
        this->inverseIIBasedOIHandler = NULL;
    }



    /*
        这个就是主函数部分,在完成对象实例化的同事完成Parser过程
        主要分为生命变量的即系和约束的解析
        在整个解析环节主要出现一个无法解析的地方,就立刻停止解析,直接返回,
    */
    bool Transform::beginParser()
    {
        vector<KQueryParser::ArrayDeclarationContext *> arrayDeclarList = ctx->arrayDeclaration();

        parserArrayDeclCtx(arrayDeclarList);

        vector<KQueryParser::QueryCommandContext *> queryList = ctx->queryCommand();
        if(isVaild)
        {
            parserQueryComCtx(queryList);
        }else
        {
            cerr<<"*** STOP *** Something can be handled!!!!"<<endl;
        }
        return isVaild;
    }

    /*
        这个函数主主要处理定义声明部分的解析
    */
    void Transform::parserArrayDeclCtx( vector<KQueryParser::ArrayDeclarationContext *> arrayDeclarList )
    {
          for(unsigned int i=0;i<arrayDeclarList.size();i++)
          {
              vector<antlr4::tree::ParseTree *>  childList = arrayDeclarList[i]->children;
              //cout<<arrayDeclarList[i]->getText()<<endl;
              //childList 默认的size是 11 或者 10 ,如下
              /*
                0: array                    0: array
                1: UINT_heheInt             1: UINT_heheInt
              */
              SymbolicVar* oneVar = new SymbolicVar(childList[1]->getText());

              //解析其余的变量
              dealWithArrayDeclar(oneVar,childList);

              //判断当前的是否满足可解析的规则
              if( (oneVar->getTotalBit() == oneVar->getTypeBit() && oneVar->getIsArray() == true)
              || (oneVar->getTotalBit() != oneVar->getTypeBit() && oneVar->getIsArray() == false) )
              {
                 oneVar->setIsVaild(false);
              }

              if(oneVar->getIsVaild()==false)
              {
                  isVaild = false;
              }

              if(isVaild==false)
              {
                  cerr<<"*** ERROR STOP **** In Function: void Transform::parserArrayDeclCtx( vector<KQueryParser::ArrayDeclarationContext *> arrayDeclarList )"<<endl;
                  cerr<<arrayDeclarList[i]->getText()<<endl;
                  break ;
              }
              else
              {
                 //cout<<arrayDeclarList[i]->getText()<<endl<<endl;
                 //oneVar->printInfo();
                 symbolicVarList.push_back(oneVar);
              }
          }
    }


    // 这个函数主要处理每一个声明语句的具体分析
    //childList 默认的size是 11 或者 12 ,如下
    /*
    0: array                    0: array
    1: UINT_heheInt             1: UINT_heheInt
    2: [                        2: [
    3: 4                        3: ]
    4: ]                        4: :
    5: :                        5: w32
    6: w32                      6: ->
    7: ->                       7: w8
    8: w8                       8: =
    9: =                        9: [
    10: symbolic 或者 实例化的定义 10: 实例化的定义
                                 11: ]
    */
    void Transform::dealWithArrayDeclar(SymbolicVar* oneVar, vector<antlr4::tree::ParseTree *>  childList)
    {
        //处理上述的左边的情况
        if(childList.size()==11)
        {
            stringstream ss;
            int arraySize=0;
            ss<<(childList[3]->getText());
            ss>>arraySize;
            ss.clear();

            if(oneVar->getType()=="bool")
                oneVar->setTotalBit(arraySize*1);
            else
                oneVar->setTotalBit(arraySize*8);

            if(childList[10]->getText()=="symbolic")
            {
                oneVar->setIsSymbolic(true);
            }else
            {
                oneVar->setIsSymbolic(false);
                // [  init  ]
                dealWithArrayInit(oneVar,childList[10]->children[1]);
            }

        //处理上述的右边的情况
        }else if(childList.size()==12)
        {
            oneVar->setIsSymbolic(false);
            dealWithArrayInit(oneVar,childList[10]);
        }else
        {
            cerr<<"In Function: void Transform::dealWithArrayDeclar(SymbolicVar* oneVar, vector<antlr4::tree::ParseTree *>  childList)"
                <<"May Break the KQuery Rules"<<endl;
        }

    }

    /*
        这个要是处理声明变量的实例化部分
        根据KQuery语法设计,分为了两种格式
    */
    void Transform::dealWithArrayInit(SymbolicVar* oneVar, antlr4::tree::ParseTree* initList)
    {
        //这个是根据KQuery的语法规则来完成对应的解析的
        //使用栈逆序保存数组元素
        stack<string> initStack;
        antlr4::tree::ParseTree* iter = initList;
        while(iter->children.size()==3)
        {
            initStack.push(iter->children[2]->getText());
            iter = iter->children[0];
        }
        initStack.push(iter->getText());

        //按照不同类型完成元素解析,char,long double可能存在问题
        if(oneVar->getType()=="bool")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(bool)*initStack.size()*1);

            bool num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                istringstream(numStr) >> boolalpha >> num;
                oneVar->addBoolElement(num);
                initStack.pop();
            }

        }else if(oneVar->getType()=="char")
        {
            //这处理的可能有问题,因为暂时没遇到这种情况
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(char)*initStack.size()*8);

            stringstream ss;
            char num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                oneVar->addCharElement(num);
                ss.clear();
                initStack.pop();
            }

        }else if(oneVar->getType()=="short")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(short)*initStack.size()*8);

            stringstream ss;
            short num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                oneVar->addShortElement(num);
                ss.clear();
                initStack.pop();
            }
        }else if(oneVar->getType()=="int")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(int)*initStack.size()*8);

            stringstream ss;
            int num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                oneVar->addIntElement(num);
                ss.clear();
                initStack.pop();
            }
        }else if(oneVar->getType()=="long")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(long)*initStack.size()*8);

            stringstream ss;
            long num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                oneVar->addLongElement(num);
                ss.clear();
                initStack.pop();
            }
        }else if(oneVar->getType()=="float")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(float)*initStack.size()*8);

            stringstream ss;
            long num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                long* point = &num;
                float* fPoint = (float*)(point);
                oneVar->addFloatElement((*fPoint));
                ss.clear();
                initStack.pop();
            }

        }else if(oneVar->getType()=="double")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(double)*initStack.size()*8);

            stringstream ss;
            long num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                long* point = &num;
                double* fPoint = (double*)(point);
                oneVar->addDoubleElement((*fPoint));
                ss.clear();
                initStack.pop();
            }
        }else if(oneVar->getType()=="long double")
        {
            if(oneVar->getTotalBit()==0)
                oneVar->setTotalBit(sizeof(long double)*initStack.size()*8);

            stringstream ss;
            long long num;
            while(initStack.empty()==false)
            {
                string numStr = initStack.top();
                ss<<numStr;
                ss>>num;
                long long * point = &num;
                long double* fPoint = (long double*)(point);
                oneVar->addLongDoubleElement((*fPoint));
                ss.clear();
                initStack.pop();
            }
        }else
        {
            cerr<<"You Should Never Get Here In Function: void Transform::dealWithArrayInit(SymbolicVar* oneVar, antlr4::tree::ParseTree* initList)"<<endl;
        }

    }


    void Transform::parserQueryComCtx( vector<KQueryParser::QueryCommandContext *> queryList)
    {
        for(int i=0; i < (int)queryList.size(); i++)
        {
            //print all queryCommendCtx
            //cout<<queryList[i]->getText()<<endl;
            vector< antlr4::tree::ParseTree* > childList = queryList[i]->children;


            //处理constraintList
            //cout<<childList[2]->getText()<<"  ";
            //cout<<childList[2]->children.size()<<endl;
            dealWithConstraint(childList[2]);

            //处理queryCommand的两种情况
            int tmpSize = childList.size();
            if(tmpSize == 5)
            {
                //一般情况都是这样
            }
            else if(tmpSize == 7)
            {
               // cerr<<"*** Warning ***  In Function : void Transform::parserQueryComCtx( vector<KQueryParser::QueryCommandContext *> queryList)"<<endl;
               // cerr<<"Encounter this situation: ( query constraintList expression evalExprList evalArrayList ). ";
               // cerr<<"We deal this as ( query constraintList expression )"<<endl;
            }else
            {
                cerr<<"*** ERROR STOP **** In Function: void Transform::parserQueryComCtx( vector<KQueryParser::QueryCommandContext *> queryList)"<<endl;
                cerr<<"Not Obey KQuery Rules. "<<endl;
                this->isVaild = false;
                break;
            }

            //处理expression可能出现的值的情况，这个必须要处理
            string tmpStr = childList[3]->getText();
            if(tmpStr == "false")
            {
                //cout<<"In KQuery: ( query constraintList expression ,  expression is false "<<endl;
            }else
            {
                //这个是决定谁否是处理 expression的问题
                Expression* root = new Expression();
                root->setParent(NULL);
                vector< antlr4::tree::ParseTree* > tmp = childList[3]->children;
                // | '('  comparisonBinaryOP  expression  expression  ')'   //5
                if( tmp.size() == 5 && tmp[1]->getText() == "Eq" && tmp[2]->getText()=="false")
                {
                    //应该这么做，要不然会处理出错
                    transToExpression(root, tmp[3]);
                    this->expressionList.push_back(root);
                }else
                {
                    //应该这么做，要不然会处理出错
                    transToExpression(root, childList[3]);
                    this->expressionList.push_back(root);
                }
            }
        }

        //把我们自定义的Expression转换为目标格式
        if(this->isVaild == false)
        {
            cerr<<"*** ERROR STOP **** In Function: void Transform::parserQueryComCtx( vector<KQueryParser::QueryCommandContext *> queryList) ";
            cerr<<"  isVaild is false"<<endl;
            //return ;
        }

        dealWithExpression(this->expressionList);
    }

    /*
        把我们自定义的Expression转换为目标格式
    */
    void Transform::dealWithExpression(vector< Expression* > expList)
    {
        for(int i = 0; i < (int)(expList.size()); i++)
        {
            Expression* one = expList[i];
            vector<Expression*> terminateExp;
            getAllNodeByDFS(one, terminateExp);
            adjustExpWidth(one, terminateExp);
        }


        for(int i = 0; i < (int)(expList.size()); i++)
        {
            Expression* one = expList[i];
            string res = expTransToConstraint(one);
            this->constraints.push_back(res);
        }

        map< string,ArrayElement* >::iterator input = mapInputSymbolic.begin();
        for(;input!=mapInputSymbolic.end();input++)
        {
            this->symbolicVarName.push_back(input->first);
            ArrayElement* tmp = input->second;
            this->symbolicVarType.push_back(tmp->symVar->getType());
        }

        setFinalComplexConstraints();
        setFinalSymbolicName();
        setFinalSymbolicType();

        /*
        cout<<endl<<"Map Alias: "<<endl;
        map<string,IDInfo*>::iterator iter;
        for(iter = mapAlias.begin(); iter!=mapAlias.end(); iter++)
        {
            IDInfo* tmp = iter->second;
            cout<<iter->first <<"      "<<tmp->getIDStr()<<"  "<<tmp->getWidth()<<endl;
        }
        cout<<endl<<"Final Symbolic Type      :  "<<getFinalSymbolicType()<<endl;
        cout<<endl<<"Final SYmbolic Name      :  "<<getFinalSymbolicVarName()<<endl;
        cout<<endl<<"Final Complex Constraints:  "<<getFinalComplexConstraints()<<endl;

        cout<<endl<<"Input Symbolic Var: "<<endl;
        map< string,ArrayElement* >::iterator input = mapInputSymbolic.begin();
        for(;input!=mapInputSymbolic.end();input++)
        {
            ArrayElement* tmp = input->second;
            cout<<input->first<<"  "<<tmp->getSymVar()->getFullName()<<"   "<<tmp->getSymVar()->getName()<<endl;
        }
        */
    }


    /*
        约束求解部分
    */
    void Transform::solveProblem(int solverType)
    {
        if(solverType == InverseIIBasedOISolver)
        {
            solverType = LFFSolver;
            this->solver = new Solver(this->getSolverPath(),solverType);
            this->solver->solveProcess(getFinalComplexConstraints(),getFinalSymbolicType(),getFinalSymbolicVarName());

            this->inverseIIBasedOIHandler = new InverseIIBasedOI(this->getExpressionList(),
                                           this->symbolicVarName, this->symbolicVarType,
                                           this->solver->getSolutionVec(), this->solver->getResType());
            this->inverseIIBasedOIHandler->solveProcess();
        }else
        {
            this->solver = new Solver(this->getSolverPath(),solverType);
            this->solver->solveProcess(getFinalComplexConstraints(),getFinalSymbolicType(),getFinalSymbolicVarName());
        }
    }


    /*
        这个函数主要就是打印复合约束
    */
    void Transform::setFinalComplexConstraints()
    {
        if(this->constraints.size() == 0)
        {
            this->finalComplexConstraints = "";
        }else
        {
            string res = "(" + this->constraints[0] + ")";
            for(int i = 1; i < (int)constraints.size(); i++)
            {
                res = res + "&&" + "(" + this->constraints[i] + ")";
            }
            this->finalComplexConstraints = res;
        }
    }

    /*
        这个函数主要设置相关变量的Type
    */
    void Transform::setFinalSymbolicType()
    {
        if(this->symbolicVarType.size() == 0)
        {
            this->finalSymbolicType = "";
        }else
        {
            string res = this->symbolicVarType[0];
            for(int i = 1; i < (int)this->symbolicVarType.size(); i++)
            {
                res = res + "," + this->symbolicVarType[i];
            }
            this->finalSymbolicType = res;
        }
    }

    /*
         主要主要设置相关变量的Name
    */
    void Transform::setFinalSymbolicName()
    {
        if(this->symbolicVarName.size() == 0)
        {
            this->finalSymbolicVarName = "";
        }else
        {
            string res = this->symbolicVarName[0];
            for(int i = 1; i < (int)this->symbolicVarName.size(); i++)
            {
                res = res + "," + this->symbolicVarName[i];
            }
            this->finalSymbolicVarName = res;
        }
    }


    /*
        这个函数是为了手机所有的叶子节点和非叶子节点,用于从上至上动态调整width
    */
    void Transform::getAllNodeByDFS(Expression* expression, vector<Expression*>  &terminateExp)
    {
        if(expression->isAtomExpression)
        {
            terminateExp.push_back(expression);
            return ;
        }else
        {
            if(expression->getOneChild()!=NULL)
                getAllNodeByDFS(expression->getOneChild(),terminateExp);

            if(expression->getTwoChild()!=NULL)
                getAllNodeByDFS(expression->getTwoChild(),terminateExp);

            if(expression->getThreeChild()!=NULL)
                getAllNodeByDFS(expression->getThreeChild(),terminateExp);
        }
    }

    /*
        动态的调整所有expression的width, 这个是为了做到无符号大整数到浮点数的转换
        递归实现,这个需要从叶节点到父亲节点的动态调整
    */
    void Transform::adjustExpWidth(Expression* expression, vector<Expression*>  &terminateExp)
    {
        for(int i=0; i < (int)terminateExp.size();i++)
        {
            Expression* iter = terminateExp[i];
            while(iter->getParent()!=NULL)
            {
                Expression* parent = iter->getParent();
                if(parent->getWidth() < iter->getWidth())
                {
                    parent->setWidth(iter->getWidth());
                }
                iter = parent;
            }
        }

/*
        cout<<"Terminal Node is following:  "<<endl;
        for(int i=0;i<terminateExp.size();i++)
        {
            printExpression(terminateExp[i]);
            cout<<endl<<endl;
        }

        cout<<"Not Terminal Node is following:  "<<endl;
        for(int i=0;i<NotTerminateExp.size();i++)
        {
            printExpression(NotTerminateExp[i]);
            cout<<endl<<endl;
        }
*/
    }

    /*
        把我们自定义的Expression转换为目标格式,递归实现
    */
    string Transform::expTransToConstraint(Expression* expression)
    {
        if(expression == NULL)
            return "";
        else if(expression->isAtomExpression)
        {
            //string terStr = expression->getOneChildStr();
            //return expression->getOneChildStr();

            map<string,IDInfo*>::iterator iter;
            string res = expression->getOneChildStr();
            for(iter = mapAlias.begin(); iter!=mapAlias.end(); iter++)
            {
                if(iter->first == expression->getOneChildStr())
                {
                    IDInfo* tmp = iter->second;
                    res = tmp->getIDStr();
                    break;
                }
            }
            return res;
        }else
        {

            string op = expression->getOp();

            string arithBinStr = "Add|Sub|Mul|UDiv|URem|SDiv|SRem|FAdd|FSub|FMul|FDiv|FRem";
            regex arithBinPattern(arithBinStr);

            string bitBinStr = "And|Or|Xor|Shl|LShr|AShr";
            regex bitBinStrPattern(bitBinStr);

            string compBinStr = "Eq|Ne|Ult|Ule|Ugt|Uge|Slt|Sle|Sgt|Sge|FOGe|FOGt|FOLe|FOLt|FOEq";
            regex compBinStrPattern(compBinStr);

            string fpConStr = "UIToFP|SIToFP|FPToUI|FPToSI";
            regex fpConPattern(fpConStr);

            if( regex_match(op,arithBinPattern) )
            {
                //| '('  arithmeticBinaryOp  TYPE  expression  expression  ')'   //6
                string op1 = "",op2 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                updateWidthForAlias(expression,op1);
                updateWidthForAlias(expression,op2);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                string transOp = GlobalFunction::getArithBinStr(op);
                string res = "("+ op1 + transOp + op2 + ")";
                return res;

            }else if( regex_match(op,bitBinStrPattern) )
            {
                //| '('  bitwiseBinaryOp     TYPE  expression  expression  ')'  //6
                //| '('  bitwiseBinaryOp           expression  expression  ')'  //5

                string op1 = "",op2 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                updateWidthForAlias(expression,op1);
                updateWidthForAlias(expression,op2);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                string transOp = GlobalFunction::getBitBinStr(op,expression);
                string res = "("+ op1 + transOp + op2 + ")";
                return res;

            }else if( regex_match(op,compBinStrPattern) )
            {
                //| '('  comparisonBinaryOP  TYPE   expression  expression  ')'  //6
                //| '('  comparisonBinaryOP         expression  expression  ')'  //5
                string op1 = "",op2 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                //fix by qingyang
                map<string,IDInfo*>::iterator it = this->mapAlias.find(op1);
                if(it != this->mapAlias.end())
                    op1 = it->second->getIDStr();

                it = this->mapAlias.find(op2);
                if(it != this->mapAlias.end())
                    op2 = it->second->getIDStr();
                //end

                updateWidthForAlias(expression,op1);
                updateWidthForAlias(expression,op2);

                //fix by qingyang
               // regex numPattern1("[0-9]+");
               // if(regex_match(op1,numPattern1) && op1.size() == 19)
                  //  op1 = to_string(DecimalStringToDouble(op1));

               // if(regex_match(op2,numPattern1) && op2.size() == 19)
                  //  op2 = to_string(DecimalStringToDouble(op2));

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                string transOp = GlobalFunction::getCompBinStr(op);

                string res = "";
                if(transOp == "==")
                {
                    if(op1 == "false" && op2 != "false" )
                        res = "(!"+op2+")";
                    else if(op1 != "false" && op2 == "false" )
                        res = "(!"+op1+")";
                    else
                        res = "("+ op1 + transOp + op2 + ")";
                }else
                    res = "("+ op1 + transOp + op2 + ")";
                return res;
            }else if( regex_match(op,fpConPattern) )
            {
                //| '('  fpConversionOp  TYPE  expression  ')' //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "Not")
            {
                //| '('  BITWISE_NOT         TYPE  expression  ')'  //5
			    //| '('  BITWISE_NOT               expression  ')'  //4
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                string transOp = GlobalFunction::getBitBinStr(op,expression);
                string res = "(" + transOp + op1 + ")";
                return res;

            }else if(op == "Concat")
            {
                //| '(' SP_CONCAT  TYPE  expression  expression  ')' //6
                //| '(' SP_CONCAT        expression  expression  ')' //5
                cerr<<"*** WARNING *** In Function: string Transform::expTransToConstraint(Expression* expression) ";
                cerr<<"Concact Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if( op == "Extract")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                //cerr<<"*** WARNING *** In Function: string Transform::expTransToConstraint(Expression* expression) ";
                //cerr<<"Extract Can't Be Handled!!!"<<endl;
                //setIsVaild(false);
                //return "";

                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                return op2;

            }else if(op == "ZExt")
            {
                //| '(' SP_ZEXT    TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "SExt")
            {
                //| '(' SP_SEXT    TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "Read")
            {
                //| '(' SP_READ    TYPE  expression  expression  ')' //6
                cerr<<"*** WARNING *** In Function: string Transform::expTransToConstraint(Expression* expression) ";
                cerr<<"Read Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == "Select")
            {
                //| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
                string op1 = "",op2 = "",op3 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();


                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                if( expression->getThreeChild()!=NULL )
                    op2 = expTransToConstraint(expression->getThreeChild());
                else
                    op2 = expression->getThreeChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());

                updateWidthForAlias(expression,op2);
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());

                updateWidthForAlias(expression,op3);
                op3 = TransFloatNumAndMapAlias(op3, op, expression->getWidth());

                //cout<<"Select Op1:  "<<op1<<endl;
                //cout<<"Select Op2:  "<<op2<<endl;
                //cout<<"Select Op3:  "<<op3<<endl<<endl<<endl;

                //select width cond true false  这个语句语句， 如果op1为true，返回op2，否则返回op3
                //一般情况下，把op1直接添加到constraints里面，然后返回op2，op3一般是NULL空值
                int selectIndex=0;
                for(selectIndex=0; selectIndex<(int)(this->constraints.size()); selectIndex++)
                {
                    if(op1 == this->constraints[selectIndex])
                        break;
                }
                if (selectIndex == (int)(this->constraints.size()))
                    this->constraints.push_back(op1);

                return op2;
            }else if( op == "Neg")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                cerr<<"*** WARNING *** In Function: string Transform::expTransToConstraint(Expression* expression) ";
                cerr<<"Neg Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == "ReadLSB")
            {
                //| '(' SP_READLSB TYPE  expression  expression  ')'  //6
                // (ReadLSB w32 8 intB)
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                updateWidthForAlias(expression,op2);
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());

                string finRes = dealWithArray(op2,op1);
                return finRes;

            }else if(op == "ReadMSB")
            {
                //| '(' SP_READMSB TYPE  expression  expression  ')'   //6
                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                updateWidthForAlias(expression,op2);
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                return op2;
            }else if(op == "FCmp")
            {
                //| '('  FP_FCMP         expression  expression  expression ')' //6
                string op1 = "" , op2 = "" , op3 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = expTransToConstraint(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                if( expression->getThreeChild()!=NULL )
                    op3 = expTransToConstraint(expression->getThreeChild());
                else
                    op3 = expression->getThreeChildStr();

                updateWidthForAlias(expression,op1);
                updateWidthForAlias(expression,op2);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                string transOp = GlobalFunction::getFcmpOpStr(op3);
                string res = "("+ op1 + transOp + op2 + ")";
                return res;

            }else if(op == "FPExt")
            {
                //| '('  FP_FPEXT        TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "FPTrunc")
            {
                //| '('  FP_FPTRUNC      TYPE  expression  ')' //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = expTransToConstraint(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                updateWidthForAlias(expression,op1);
                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == ":")
            {
                //IDENTIFIER ':' expression
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                {
                    if(expression->getWidth() < expression->getOneChild()->getWidth())
                        expression->setWidth(expression->getOneChild()->getWidth());

                    op1 = expTransToConstraint(expression->getOneChild());
                }
                else
                    op1 = expression->getOneChildStr();

                // 这个是不需要的,这是因为别名的expression必然是一个其他的expression,不可能直接就是Terminate节点
                //op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                string alian = expression->getTwoChildStr();

                //添加映射
                IDInfo* idinfo = new IDInfo(op1,expression->getWidth());
                pair<string,IDInfo*> onePair(alian,idinfo);
                this->mapAlias.insert(onePair);
                return op1;
            }else
            {
                cerr<<"In Function: string Transform::expTransToConstraint(Expression* expression) ";
                cerr<<"Encounter Invaild Situations ";
                cerr<<"Op: "<<expression->getOp()<<" "
                    <<"Width: "<<expression->getWidth()<<" "
                    <<"Op1: "<<expression->getOneChildStr()<<" "
                    <<"Op2: "<<expression->getTwoChildStr()<<" "
                    <<"Op3: "<<expression->getThreeChildStr()<<endl;
            }

        }

        return "";
    }

    /*
        这个是针对数组的处理,因为到了这里数组下标是某一下标,也就是index是固定的
        主要就是遍历vector< SymbolicVar* > symbolicVarList,然后确定index
    */
    string Transform::dealWithArray(string id,string width)
    {
        ArrayElement* one = new ArrayElement(id,width);
        bool findIt = one->dealWithArrayElement(this->symbolicVarList);

        if(!findIt)
        {
            cerr<<"*** ERROR *** In Function: string Transform::dealWithArray(string id,string width) ";
            cerr<<id<<" Is Not Matched With symbolicVarList!!! "<<endl;
            this->isVaild = false;
            return id;
        }

        string res = "";
        if(one->symVar->getIsArray())
        {
            res = id + "_" + to_string(one->index);
            pair< string,ArrayElement* > onePair(res,one);
            this->mapInputSymbolic.insert(onePair);
        }else
        {
            res = id;
            pair< string,ArrayElement* > onePair(res,one);
            this->mapInputSymbolic.insert(onePair);
        }

        return res;
    }


    /*
        这个是专门为了别名Alias的width设置的,因为在使用width的地方是没有相关的信息
        同时Alias的收集实在transform的过程中一边收集一边转换的,所以,要专门针对Alias做一下width的更新
    */
    void Transform::updateWidthForAlias(Expression* expression , string aliadId)
    {
        map<string,IDInfo*>::iterator iter;
        for(iter = mapAlias.begin(); iter!=mapAlias.end(); iter++)
        {

            if(iter->first == aliadId)
            {
                IDInfo* tmp = iter->second;
                if( expression->getWidth() < tmp->getWidth())
                    expression->setWidth( tmp->getWidth() );
                break;
            }
        }
    }


    /*
        通过DFS递归来吧包含别名的操作替换掉
        这个函数应该用不到了
    */
    void Transform::MapAliasByDFS(Expression* expression)
    {
        if(expression->isAtomExpression)
        {
            string res = MapOneAlias(expression->getOneChildStr());
            expression->setOneChildStr(res);
        }else
        {
            if(expression->getOneChild()!=NULL)
                MapAliasByDFS(expression->getOneChild());
            else
            {
                string res = MapOneAlias(expression->getOneChildStr());
                expression->setOneChildStr(res);
            }

            if(expression->getTwoChild()!=NULL)
                MapAliasByDFS(expression->getTwoChild());
            else
            {
                string res = MapOneAlias(expression->getTwoChildStr());
                expression->setTwoChildStr(res);
            }

            if(expression->getThreeChild()!=NULL)
                MapAliasByDFS(expression->getThreeChild());
            else
            {
                string res = MapOneAlias(expression->getThreeChildStr());
                expression->setThreeChildStr(res);
            }
        }
    }

    /*
        Map one Alias 通过循环遍历来实现替换
    */
    string Transform::MapOneAlias(string aliadId)
    {
        string res = aliadId;
        map<string,IDInfo*>::iterator iter;
        for(iter = mapAlias.begin(); iter!=mapAlias.end(); iter++)
        {

            if(iter->first == aliadId)
            {
                IDInfo* tmp = iter->second;
                res = tmp->getIDStr();
                break;
            }
        }
        return res;
    }


    /*
        根据操作数numStr和操作符op来判断是否做转换,如何做转换
        当op是浮点数类型的操作的时候,根据浮点数的转换去做转换
        其余的就按照整数类型的转换去做,

        再出现不是num的时候还要做别名的一个替换
    */
    string Transform::TransFloatNumAndMapAlias(string numStr, string op, int width)
    {

            //string floatOpStr = "FAdd|FSub|FMul|FDiv|FRem|UIToFP|SIToFP|FPToUI|FPToSI|FCmp|FPExt|FPTrunc";
            //fix by qingyang
            string floatOpStr = "FAdd|FSub|FMul|FDiv|FRem|UIToFP|SIToFP|FPToUI|FPToSI|FCmp|FPExt|FPTrunc|FOEq|FOGt|FOLt|FOGe|FOLe";
            regex floatPattern(floatOpStr);

            //浮点数类型的操作,可能做数据转换和别名映射
            bool isNum = false;
            if(regex_match(op,floatPattern))
            {
                string res = GlobalFunction::getFloatNum(true,width,numStr,isNum);
                if(isNum)  //是浮点数的转换,所以直接返回转换结果
                    return res;
                else   //不是浮点数,而是一个表达式,这个要做一些转换
                {
                    map<string,IDInfo*>::iterator iter;
                    string res = numStr;
                    for(iter = mapAlias.begin(); iter!=mapAlias.end(); iter++)
                    {
                        if(iter->first == numStr)
                        {
                            IDInfo* tmp = iter->second;
                            res = tmp->getIDStr();
                            break;
                        }
                    }
                    return res;
                }
            }else
            {
                //整形类型的操作
                string res = GlobalFunction::getFloatNum(false,width,numStr,isNum);
                if(isNum)  //是整形数的转换,所以直接返回转换结果
                    return res;
                else   //不是整形数,而是一个表达式,这个要做一些转换
                {
                    map<string,IDInfo*>::iterator iter;
                    string res = numStr;
                    for(iter = mapAlias.begin(); iter!=mapAlias.end(); iter++)
                    {
                        if(iter->first == numStr)
                        {
                            IDInfo* tmp = iter->second;
                            res = tmp->getIDStr();
                            break;
                        }
                    }
                    return res;
                }
            }
            return "";
    }



    /*
        这个函数主要处理每一个constraint
    */
    void Transform::dealWithConstraint( antlr4::tree::ParseTree* child)
    {
        vector< antlr4::tree::ParseTree* > childList = child->children;
        int tmpSize = childList.size();
        if(tmpSize == 2)
        {
            //cerr<<"Encounter this benchmark: ( query [ ] ) "<<endl;
            return ;
        }else
        {
            for(int i=1; i < (int)childList.size()-1;i++)
            {
                /*
                cout<<childList[i]->getText()<<"  "<<childList[i]->children.size()
                <<"  "<<isAtomExpression(childList[i])<<endl;
                vector< antlr4::tree::ParseTree* > tmp = childList[i]->children;
                for(int j=0;j<(int)tmp.size();j++)
                {
                    cout<<tmp[j]->getText()<<"  "<<tmp[j]->children.size()<<endl;
                }
                cout<<"*********************"<<endl;
                */

                //cout<<childList[i]->getText()<<endl;
                if(this->isVaild == false)
                {
                    cerr<<"*** ERROR *** In Function: string Transform::void Transform::dealWithConstraint( antlr4::tree::ParseTree* child):";
                    cerr<<" isVaild is false "<<endl;
                    return ;
                }

                Expression* root = new Expression();
                root->setParent(NULL);
                transToExpression(root, childList[i]);
                this->expressionList.push_back(root);
            }

        }
    }


    /*
        把每一个KQuery的Expression设置为自定的数据结构Expression
    */
    void Transform::transToExpression(Expression* root , antlr4::tree::ParseTree* expression)
    {
        if(this->isVaild == false)
            return ;

        if(isAtomExpression(expression))
        {
            root->setOp("");
            root->setIsAtomExpression(true);
            if(expression->children.size()==1)
            {
                root->setWidth(-1);
                root->setOneChildStr(expression->getText());
            }else if(expression->children.size()==4)
            {
                root->setWidthStr((expression->children)[1]->getText());
                root->setOneChildStr((expression->children)[2]->getText());

            }else
            {
                cerr<<"*** ERROR *** You Should Never Get Here void Transform::transToExpression(Expression* root , antlr4::tree::ParseTree* expression) ";
                cerr<<" isAtomExpression(expression) May Wrong "<<endl;
            }
            return ;
            /*
            vector< antlr4::tree::ParseTree* > childList = expression->children;
            int tmpSize = childList.size();

            if(tmpSize == 3)
            {
                 //IDENTIFIER ':' expression
                cerr<<"*** WARNING *** In Function: void Transform::transToExpression(Expression* root , antlr4::tree::ParseTree* expression ) ";
                cerr<<" IDENTIFIER ':' expression Should Show Up Here!!!"<<endl;
            }else if(tmpSize == 7)
            {
                 //| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
                cerr<<"*** ERROR *** In Function: void Transform::transToExpression(Expression* root , antlr4::tree::ParseTree* expression ) ";
                cerr<<expression->getText()<<" Can't be handled "<<endl;
                isVaild = false;
            }else if(tmpSize == 4)
            {
                //| '('  BITWISE_NOT  expression  ')'   //4
                //| '('  SP_NEG       expression  ')'   //4
                root->setOp(childList[1]->getText());
                root->setWidth(-1);
                root->setOneChildStr(childList[2]->getText());
            }else if(tmpSize == 5)
            {

                //| '('  bitwiseBinaryOp     expression  expression  ')'   //5
                //| '('  comparisonBinaryOP  eroot->setIsAtomExpression(false);xpression  expression  ')'   //5
                //| '('  SP_CONCAT           expression  expression  ')'   //5

                //| '('  BITWISE_NOT     TYPE  expression  ')'  //5
                //| '('  SP_ZEXT         TYPE  expression  ')'  //5
                //| '('  SP_SEXT         TYPE  expression  ')'  //5
                //| '('  SP_NEG          TYPE  expression  ')'  //5
                //| '('  fpConversionOp  TYPE  expression  ')'  //5
                //| '('  FP_FPEXT        TYPE  expression  ')'  //5
                //| '('  FP_FPTRUNC      TYPE  expression  ')'  //5

                root->setOp(childList[1]->getText());
                regex typePattern("w[0-9]+");
                if( regex_match(childList[2]->getText(),typePattern) )
                {
                    root->setWidthStr(childList[2]->getText());
                    root->setOneChildStr(childList[3]->getText());
                }else
                {
                    root->setWidth(-1);
                    root->setOneChildStr(childList[2]->getText());
                    root->setTwoChildStr(childList[3]->getText());
                }
            }else if(tmpSize == 6)
            {
                //| '('  arithmeticBinaryOp  TYPE  expression  expression  ')'  //6
                //| '('  bitwiseBinaryOp     TYPE  expression  expression  ')'  //6
                //| '('  comparisonBinaryOP  TYPE  expression  expression  ')'  //6
                //| '('  SP_CONCAT           TYPE  expression  expression  ')'  //6
                //| '('  SP_EXTRACT          TYPE  expression  expression  ')'  //6
                //| '('  SP_READ             TYPE  expression  expression  ')'  //6
                //| '('  SP_READLSB          TYPE  expression  expression  ')'  //6
                //| '('  SP_READMSB          TYPE  expression  expression  ')'  //6

                //| '('  FP_FCMP       expression  expression  expression  ')'  //6

                root->setOp(childList[1]->getText());
                regex typePattern("w[0-9]+");
                if( regex_match(childList[2]->getText(),typePattern) )
                {
                    root->setWidthStr(childList[2]->getText());
                    root->setOneChildStr(childList[3]->getText());
                    root->setTwoChildStr(childList[4]->getText());
                }else
                {
                    root->setWidth(-1);
                    root->setOneChildStr(childList[2]->getText());
                    root->setTwoChildStr(childList[3]->getText());
                    root->setThreeChildStr(childList[4]->getText());
                }
            }else
            {
                cerr<<childList.size()<<"   "<<expression->getText()<<endl;
                cerr<<"*** ERROR *** In Function: void Transform::transToExpression(Expression* root , antlr4::tree::ParseTree* expression )  ";
                cerr<<"You Should Never Get Here !!!"<<endl<<endl;
            }
            return ;
            */

        }else
        {
            root->setIsAtomExpression(false);
            vector< antlr4::tree::ParseTree* > childList = expression->children;
            int tmpSize = childList.size();

            //IDENTIFIER ':' expression
            if(tmpSize == 3)
            {
                root->setWidth(-1);
                root->setOp(":");
                root->setTwoChildStr(childList[0]->getText());

                root->oneChild = new Expression();
                root->getOneChild()->setParent(root);
                transToExpression(root->getOneChild(),childList[2]);
            }
            else if(tmpSize == 7)
            {
                ////| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
                root->setOp(childList[1]->getText());
                root->setWidthStr(childList[2]->getText());

                root->oneChild = new Expression();
                root->getOneChild()->setParent(root);
                transToExpression(root->getOneChild(),childList[3]);

                root->twoChild = new Expression();
                root->getTwoChild()->setParent(root);
                transToExpression(root->getTwoChild(),childList[4]);

                root->threeChild = new Expression();
                root->getThreeChild()->setParent(root);
                transToExpression(root->getThreeChild(),childList[5]);
            }else if(tmpSize == 4)
            {
                //| '('  BITWISE_NOT  expression  ')'   //4
                //| '('  SP_NEG       expression  ')'   //4
                root->setOp(childList[1]->getText());
                root->setWidth(-1);

                root->oneChild = new Expression();
                root->getOneChild()->setParent(root);
                transToExpression(root->getOneChild(),childList[2]);
            }else if(tmpSize == 5)
            {
                /*
                | '('  bitwiseBinaryOp     expression  expression  ')'   //5
                | '('  comparisonBinaryOP  expression  expression  ')'   //5
                | '('  SP_CONCAT           expression  expression  ')'   //5

                | '('  BITWISE_NOT     TYPE  expression  ')'  //5
                | '('  SP_ZEXT         TYPE  expression  ')'  //5
                | '('  SP_SEXT         TYPE  expression  ')'  //5
                | '('  SP_NEG          TYPE  expression  ')'  //5
                | '('  fpConversionOp  TYPE  expression  ')'  //5
                | '('  FP_FPEXT        TYPE  expression  ')'  //5
                | '('  FP_FPTRUNC      TYPE  expression  ')'  //5
                */
                root->setOp(childList[1]->getText());
                regex typePattern("w[0-9]+");
                if( regex_match(childList[2]->getText(),typePattern) )
                {
                    root->setWidthStr(childList[2]->getText());
                    root->oneChild = new Expression();
                    root->getOneChild()->setParent(root);
                    transToExpression(root->getOneChild(),childList[3]);
                }else
                {
                    root->setWidth(-1);
                    root->oneChild = new Expression();
                    root->getOneChild()->setParent(root);
                    transToExpression(root->getOneChild(),childList[2]);

                    root->twoChild = new Expression();
                    root->getTwoChild()->setParent(root);
                    transToExpression(root->getTwoChild(),childList[3]);
                }
            }else if(tmpSize == 6)
            {
                /*| '('  arithmeticBinaryOp  TYPE  expression  expression  ')'  //6
                | '('  bitwiseBinaryOp     TYPE  expression  expression  ')'  //6
                | '('  comparisonBinaryOP  TYPE  expression  expression  ')'  //6
                | '('  SP_CONCAT           TYPE  expression  expression  ')'  //6
                | '('  SP_EXTRACT          TYPE  expression  expression  ')'  //6
                | '('  SP_READ             TYPE  expression  expression  ')'  //6
                | '('  SP_READLSB          TYPE  expression  expression  ')'  //6
                | '('  SP_READMSB          TYPE  expression  expression  ')'  //6

                | '('  FP_FCMP       expression  expression  expression  ')'  //6  */

                root->setOp(childList[1]->getText());
                regex typePattern("w[0-9]+");
                if( regex_match(childList[2]->getText(),typePattern) )
                {
                    root->setWidthStr(childList[2]->getText());

                    root->oneChild = new Expression();
                    root->getOneChild()->setParent(root);
                    transToExpression(root->getOneChild(),childList[3]);

                    root->twoChild = new Expression();
                    root->getTwoChild()->setParent(root);
                    transToExpression(root->getTwoChild(),childList[4]);
                }else
                {
                    root->setWidth(-1);

                    root->oneChild = new Expression();
                    root->getOneChild()->setParent(root);
                    transToExpression(root->getOneChild(),childList[2]);

                    root->twoChild = new Expression();
                    root->getTwoChild()->setParent(root);
                    transToExpression(root->getTwoChild(),childList[3]);

                    root->threeChild = new Expression();
                    root->getThreeChild()->setParent(root);
                    transToExpression(root->getThreeChild(),childList[4]);

                }
            }else
            {
                cerr<<"*** ERROR *** In Function: void Transform::transToExpression(Expression* root , antlr4::tree::ParseTree* expression )  ";
                cerr<<"You Should Never Get Here !!!"<<endl;
                this->setIsVaild(false);
                return ;
            }
        }
    }


    /*
        这个函数主要判断expression是不是原子expression
        判断的原则就是 expression 的每一个子节点都是原子expression
    */
    bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression)
    {
        if( isAtomSimpleExp(expression) )
            return true;
        else
        {
            return false;

            /*
                        vector< antlr4::tree::ParseTree* > childList = expression->children;
            int tmpSize = childList.size();

            //Type Number Identifier的RE表达式
            regex typePattern("w[0-9]+");

            string numStr = "([0-9_]+|0b[01_]+|0o[0-7_]+|0x[0-9a-fA-F_]+)";
            string numPat = "true|false";
            numPat = numPat + "|([+|-]" + numStr + ")" + "|" + numStr;
            regex numPattern(numPat);
            regex idPattern("[a-zA-Z][a-zA-Z0-9_]*");

            //IDENTIFIER ':' expression
            if(tmpSize == 3)
            {
                if( regex_match(childList[0]->getText(),idPattern) && childList[1]->getText()==":")
                {
                    //一般对于别名操作, 基本上都是复合约束,所以这个if 上基本是返回false
                    vector< antlr4::tree::ParseTree* > grandList = childList[2]->children;
                    if(grandList.size() > 1 )
                        return false;
                    else
                    {
                       cerr<<"In Function: bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression) "
                       <<expression->getText()<<"  Not Obey KQuery Rule "<<endl;
                       return true;
                    }
                }
                else
                {
                    cerr<<"In Function: bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression) "
                    <<"Encounter : IDENTIFIER : expression. May Break the KQuery Rules"<<endl;
                    isVaild = false;
                    return false;
                }
            }


            //arithmeticBinaryOp must have Type
            // '('  arithmeticBinaryOp  TYPE  expression  expression  ')'   //6
            string arithmeticBinaryOpPatStr = "Add|Sub|Mul|UDiv|URem|SDiv|SRem|FAdd|FSub|FMul|FDiv|FRem";
            regex arithmeticBinaryOpPattern(arithmeticBinaryOpPatStr);
            if(tmpSize == 6 && regex_match(childList[1]->getText(),arithmeticBinaryOpPattern))
            {
                if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                    return true;
                else
                    return false;
            }


			//	bitwiseBinaryOp May not Have Type
            //| '('  BITWISE_NOT         TYPE  expression  ')'              //5
			//| '('  BITWISE_NOT               expression  ')'              //4
			//| '('  bitwiseBinaryOp     TYPE  expression  expression  ')'  //6
			//| '('  bitwiseBinaryOp           expression  expression  ')'  //5

            string bitwiseBinaryOpPatStr = "And|Or|Xor|Shl|LShr|AShr";
            regex bitwiseBinaryOpPattern(bitwiseBinaryOpPatStr);

            if( (tmpSize == 5 || tmpSize == 4) && childList[1]->getText()=="Not" )
            {
                    if(tmpSize==5)
                        return isAtomExpression(childList[3]);
                    else
                        return isAtomExpression(childList[2]);
            }

            if( (tmpSize == 6 || tmpSize == 5) && regex_match(childList[1]->getText(),bitwiseBinaryOpPattern) )
            {
                    if(tmpSize==6)
                    {
                        if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                            return true;
                        else
                            return false;
                    }else
                    {
                        if( isAtomSimpleExp(childList[2]) && isAtomSimpleExp(childList[3]) )
                            return true;
                        else
                            return false;
                    }
            }


			//	comparisonBinaryOP May not Have Type
            //| '('  comparisonBinaryOP  TYPE   expression  expression  ')'  //6
			//| '('  comparisonBinaryOP         expression  expression  ')'  //5

            string comparisonBinaryOPPatStr = "Eq|Ne|Ult|Ule|Ugt|Uge|Slt|Sle|Sgt|Sge";
            regex comparisonBinaryOPPattern(comparisonBinaryOPPatStr);

            if( (tmpSize == 6 || tmpSize == 5) && regex_match(childList[1]->getText(),comparisonBinaryOPPattern) )
            {
                    if(tmpSize==6)
                    {
                        if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                            return true;
                        else
                            return false;
                    }else
                    {
                        if( isAtomSimpleExp(childList[2]) && isAtomSimpleExp(childList[3]) )
                            return true;
                        else
                            return false;
                    }
            }


            //| '(' SP_CONCAT  TYPE  expression  expression  ')'         //6
			//| '(' SP_CONCAT        expression  expression  ')'         //5
			//| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6

            if( ( tmpSize == 6 && (childList[1]->getText() == "Concat" || childList[1]->getText() == "Extract") )
            || ( tmpSize == 5 && childList[1]->getText() == "Concat" )  )
            {
                    if(tmpSize==6)
                    {
                        if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                            return true;
                        else
                            return false;
                    }else
                    {
                        if( isAtomSimpleExp(childList[2]) && isAtomSimpleExp(childList[3]) )
                            return true;
                        else
                            return false;
                    }
            }


			//| '(' SP_ZEXT    TYPE  expression  ')'                     //5
			//| '(' SP_SEXT    TYPE  expression  ')'                     //5
			//| '(' SP_READ    TYPE  expression  expression  ')'          //6
			//| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
            if( (tmpSize == 5 && (childList[1]->getText() == "ZExt" || childList[1]->getText() == "SExt"))
             || (tmpSize == 6 && childList[1]->getText() == "Read")
             || (tmpSize == 7 && childList[1]->getText() == "Select") )
            {
                if(tmpSize == 5)
                    return isAtomSimpleExp(childList[3]);
                else if(tmpSize == 6)
                {
                    if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                        return true;
                    else
                        return false;
                }else
                {
                    if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) && isAtomSimpleExp(childList[5]) )
                        return true;
                    else
                        return false;
                }
            }


			//| '(' SP_NEG     TYPE  expression  ')'                       //5
			//| '(' SP_NEG           expression  ')'                       //4
			//| '(' SP_READLSB TYPE  expression  expression  ')'           //6
			//| '(' SP_READMSB TYPE  expression  expression  ')'           //6


            if( ( (tmpSize == 5 || tmpSize == 4) &&  childList[1]->getText() == "Neg")
             || ( tmpSize == 6 && (childList[1]->getText() == "ReadLSB" || childList[1]->getText() == "ReadMSB") )  )
            {
                if(tmpSize == 5)
                    return isAtomSimpleExp(childList[3]);
                else if(tmpSize == 4)
                    return isAtomSimpleExp(childList[2]);
                else if(tmpSize == 6)
                {
                    if( isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                        return true;
                    else
                        return false;
                }
            }


			//   The Following is For KleeFp
            //| '('  FP_FCMP         expression  expression  expression  ')'    //6
			//| '('  fpConversionOp  TYPE  expression  ')'                     //5
			//| '('  FP_FPEXT        TYPE  expression  ')'                     //5
			//| '('  FP_FPTRUNC      TYPE  expression  ')'                     //5
            string fpConversionOpPatStr = "UIToFP|SIToFP|FPToUI|FPToSI";
            regex fpConversionOpPattern(fpConversionOpPatStr);

            if( (tmpSize == 6 && childList[1]->getText() == "FCmp")
             || ( tmpSize == 5 && ( regex_match(childList[1]->getText(),fpConversionOpPattern) || childList[1]->getText() == "FPExt" || childList[1]->getText() == "FPTrunc" ) )  )
             {
                 if(tmpSize == 6)
                 {
                    if( isAtomSimpleExp(childList[2]) && isAtomSimpleExp(childList[3]) && isAtomSimpleExp(childList[4]) )
                        return true;
                    else
                        return false;
                 }else
                     return isAtomSimpleExp(childList[3]);

             }

            cerr<<"*** ERROR *** In Function: bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression)  ";
            cerr<<"You Should Never Get Here 判断原子约束匹配失败 !!! "<<endl;
            return false;
            */
        }

    }

    /*
        isAtomExpression的辅助函数
    */
    bool Transform::isAtomSimpleExp(antlr4::tree::ParseTree* expression)
    {
        vector< antlr4::tree::ParseTree* > childList = expression->children;
        int tmpSize = childList.size();

        /*
          IDENTIFIER                                                 //1
          NUMBER
        */
        if(tmpSize == 1)
            return true;

        /*
        Type Number Identifier的RE表达式
        */
        regex typePattern("w[0-9]+");

        string numStr = "([0-9_]+|0b[01_]+|0o[0-7_]+|0x[0-9a-fA-F_]+)";
        string numPat = "true|false";
        numPat = numPat + "|([+|-]" + numStr + ")" + "|" + numStr;

        regex numPattern(numPat);
        regex idPattern("[a-zA-Z][a-zA-Z0-9_]*");

/*
        //IDENTIFIER ':' expression
        if(tmpSize == 3)
        {
            if(regex_match(childList[0]->getText(),idPattern)
            && childList[1]->getText()==":")
            {
                //一般对于别名操作, 基本上都是复合约束,所以这个if 上基本是返回false
                vector< antlr4::tree::ParseTree* > grandList = childList[2]->children;
                if(grandList.size() > 1 )
                    return false;
                else
                {
                   cerr<<"In Function: bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression) "
                   <<expression->getText()<<"  Not Obey KQuery Rule "<<endl;
                   return true;
                }
            }
            else
            {
                cerr<<"In Function: bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression) "
                <<"Encounter : IDENTIFIER : expression. May Break the KQuery Rules"<<endl;
                isVaild = false;
                return false;
            }
        }
*/

        /*
        | '('  TYPE  NUMBER        ')'                               //4
        | '('  TYPE  IDENTIFIER    ')'                               //4
        这种情况一般不会出现
        */
        if(tmpSize == 4 && regex_match(childList[1]->getText(),typePattern)
         && ( regex_match(childList[2]->getText(),idPattern) || regex_match(childList[2]->getText(),numPattern) )
        )
        {
            return true;
        }

        /*
        Version, this is for Array Write
        | '[' updateList ']'   '@'   IDENTIFIER                       //5
        | '['            ']'   '@'   IDENTIFIER                       //4
        这种情况无法处理,所以会给出warning
        */
        if( (tmpSize==5 && childList[3]->getText()=="@" && regex_match(childList[4]->getText(),idPattern) )
        ||  (tmpSize==4 && childList[2]->getText()=="@" && regex_match(childList[3]->getText(),idPattern) )
        )
        {
            cerr<<"In Function: bool Transform::isAtomExpression(antlr4::tree::ParseTree* expression) "
            <<"Encounter Array Write : [ updateList ] @ IDENTIFIER Or [ ] @ IDENTIFIER. May Break the KQuery Rules"<<endl;

            isVaild = false;
            return false;
        }


        return false;
    }

    /*
        打印函数
    */
    void Transform::printInfo(antlr4::tree::ParseTree* child)
    {
        if(child->children.size()<=1)
        {
            cout<<child->getText()<<endl;
        }
        else
        {
            vector< antlr4::tree::ParseTree* > childList = child->children;
            for(int i=0;i<(int)childList.size();i++)
            {
                printInfo(childList[i]);
            }
        }
    }


    void Transform::printExpression(Expression* one)
    {

        if(one == NULL)
        {
            cout<<"one is NULL "<<endl;
        }else if(one->getIsAtomExpression())
        {
            cout<<one->getOp()<<" ";
            if(one->getWidth()!=-1)
               cout<<one->getWidth()<<" ";

            if(one->getOneChildStr()!="")
                cout<<one->getOneChildStr()<<" ";

            if(one->getTwoChildStr()!="")
                cout<<one->getTwoChildStr()<<" ";

            if(one->getThreeChildStr()!="")
                cout<<one->getThreeChildStr()<<" ";
        }else
        {
            cout<<one->getOp()<<" ";
            if(one->getWidth()!=-1)
               cout<<one->getWidth()<<" ";

            if(one->getOneChild()!=NULL)
                printExpression(one->getOneChild());
            else
            {
                if(one->getOneChildStr()!="")
                    cout<<one->getOneChildStr()<<" ";
            }

            if(one->getTwoChild()!=NULL)
                printExpression(one->getTwoChild());
            else
            {
                if(one->getTwoChildStr()!="")
                    cout<<one->getTwoChildStr()<<" ";
            }

            if(one->getThreeChild()!=NULL)
                printExpression(one->getThreeChild());
            else
            {
                if(one->getThreeChildStr()!="")
                    cout<<one->getThreeChildStr()<<" ";
            }
        }
    }


