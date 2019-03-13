    #include <string>
    #include <vector>
    #include <map>
    #include <string.h>
    #include <stdio.h>
    #include <stdlib.h>
    #include <iostream>
    #include <sstream>
    #include <fstream>
    #include <istream>
    #include<regex>
    #include <Python.h>

    #include <unistd.h>
    #include<sys/types.h>
    #include<sys/wait.h>

    #include "SymbolicVar.h"
    #include "Transform.h"
    #include "Expression.h"
    #include "IDInfo.h"
    #include "ArrayElement.h"
    #include "GlobalFunction.h"
    #include "Expression.h"
    #include "IntervalPoint.h"

    #include "InverseIIBasedOI.h"

    using namespace std;

    /*

        InverseIIBasedOISolver
    */

    /*
        构造函数,参数初始化
        vector< Expression* >  expressionList 约束二叉树
        vector<string> symbolicVarName        变量名字
        vector<string> symbolicVarType        变量类型
        vector<string> SolutionVec            求解结果
        int resType                           求解类型，1表示可以求解，0表示无法求解
        只要可以求解的情况下才可以做基于区间的计算
    */
    InverseIIBasedOI::InverseIIBasedOI(vector< Expression* >  expressionList,
                     vector<string> symbolicVarName, vector<string> symbolicVarType,
                     vector<string> solutionVec, int resType)
    {
        this->isVaild = true;

        this->expressionList = expressionList;
        //this->dealWithEqFalse();

        this->symbolicVarName = symbolicVarName;
        this->symbolicVarType = symbolicVarType;


        for(int i=0; i<(int)solutionVec.size(); i++)
            this->solverRes.push_back(stod(solutionVec[i]));
        this->resType = resType;

        //区间计算相关参数的配置
        this->fixIntervalPointLen = 5.0;
        this->minIntervalPointLen = 1e-5;

        this->intervalRes = "";
    }

    /*
        默认析构函数
    */
    InverseIIBasedOI::~InverseIIBasedOI()
    {
        for(map<string,IDInfo*>::iterator iter = this->mapAlias.begin();iter!=this->mapAlias.end();iter++)
            delete iter->second;
        this->mapAlias.clear();
    }

    /*
        这个数solver的入口函数
    */
    bool InverseIIBasedOI::solveProcess()
    {
        //约束求解器失败之后无法求解直接返回即可
        if(this->resType != 1)
        {
            this->intervalRes = "LFF Solver Can't Find Feasible Solution,So Input Inverse Prediction Failed";
            return false;
        }

        //处理无效情况
        if(this->isVaild == false)
        {
            for(int i=0; i<(int)this->solverRes.size(); i++)
            {
                double mid   = this->solverRes[i];
                double left  = mid - this->minIntervalPointLen;
                double right = mid + this->minIntervalPointLen;
                this->intervalPointSolverRes.push_back(IntervalPoint(left,right));
            }
            setIntervalPointSolverRes();
            return true;
        }

        return pythonSolver();



        //下面是基于区间削减的代码，这里暂时忽略
        //根据求解向量做区间的初始化
        for(int i=0; i<(int)this->symbolicVarName.size(); i++)
        {
            double mid   = this->solverRes[i];
            double left  = mid;mid - this->fixIntervalPointLen;
            double right = mid;mid + this->fixIntervalPointLen;

            string key = this->symbolicVarName[i];
            IntervalPoint value = IntervalPoint(left,right);
            this->mapValueAlias[key] = value;
        }

        cout<<"---------------   Begin bool InverseIIBasedOI::solveProcess() "<<endl;
        for(int i=0;i<(int)this->symbolicVarName.size();i++)
        {
            cout<<this->symbolicVarName[i]<<"  "<<this->symbolicVarType[i]<<"  ";
            cout<<this->solverRes[i]<<"   "<<this->mapValueAlias[this->symbolicVarName[i]]<<endl;
        }
        cout<<"Solver Res Type: "<<this->resType<<endl;

        for(int i = 0; i < (int)(this->expressionList.size()); i++)
        {
            Expression* one = this->expressionList[i];
            //cout<<to_string(one->getOneChild())<<"    "<<calaRuntimeValue(one->getOneChild())<<endl<<endl;
            //cout<<to_string(one->getTwoChild())<<"    "<<calaRuntimeValue(one->getTwoChild())<<endl<<endl;
            cout<<to_string(one)<<"    "<<IntervalPointToBool(calaRuntimeValue(one))<<endl<<endl<<endl<<endl;
        }

    /* for(auto i : mapValueAlias)
            cout<<i.first<<"   "<<i.second<<endl;
    */
        cout<<"---------------     End bool InverseIIBasedOI::solveProcess() "<<endl;

        return true;
    }

    /*
        直接调用Python脚本
    */
    bool InverseIIBasedOI::pythonSolver()
    {
        string path = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/lib/Chapter4/";
        this->writeToFile(path);

        Py_Initialize();//使用python之前，要调用Py_Initialize();这个函数进行初始化
        if (!Py_IsInitialized())
        {
            printf("Python 初始化失败！");
            return false;
        }
        PyRun_SimpleString("import sys");
        string sysPath = "sys.path.append('" + path + "')";
        PyRun_SimpleString(sysPath.c_str());//这一步很重要，修改Python路径

        PyObject * pModule = NULL;//声明变量
        PyObject * pFunc = NULL;// 声明变量
        pModule = PyImport_ImportModule("chapter4");//这里是要调用的文件名hello.py
        if (pModule == NULL)
        {
            cout << "没找到chapter4.py 文件" << endl;
            return false;
        }

        pFunc = PyObject_GetAttrString(pModule, "beginSolver");//这里是要调用的函数名
        PyObject* pRet = PyObject_CallObject(pFunc, NULL);//调用函数
        Py_Finalize();//调用Py_Finalize，这个根Py_Initialize相对应的。

        this->intervalRes = this->readResult(path);
        return true;
    }

    bool InverseIIBasedOI::writeToFile(string path)
    {
        string varName = "", valueStr = "" , pcStr = "";
        if(this->symbolicVarName.size() != 0)
        {
            varName = this->symbolicVarName[0];
            valueStr = to_string(this->solverRes[0]);
            for(int i = 1; i < (int)this->symbolicVarName.size(); i++)
            {
                varName = varName + "," + this->symbolicVarName[i];
                valueStr= valueStr+ "," + to_string(this->solverRes[i]);
            }
        }

        ifstream fd(path+"constraint.info");
        getline(fd, pcStr);
        fd.close();

        ofstream fd1(path+"constraint.info");
        if(!fd1)
            return false;
        fd1<<varName<<endl;
        fd1<<valueStr<<endl;
        fd1<<pcStr<<endl;
        fd1.close();

        return true;
    }
    string InverseIIBasedOI::readResult(string path)
    {
        ifstream fd(path+"IIP.result");
        string res = "";
        string line = "";
        while(getline(fd,line))
            res = res + line + "\n";
        fd.close();
        return res;
    }
    /*
        打印相关信息
    */
    void InverseIIBasedOI::printInfo()
    {
        cout<<this->intervalRes;
    }

    /*
        计算最简约是表达式的运行时刻值
    */
    IntervalPoint InverseIIBasedOI::calaRuntimeValue(Expression* expression)
    {
        if(expression == NULL)
            return IntervalPoint(0,0);
        else if(expression->isAtomExpression)
        {
            string key = expression->getOneChildStr();
            if(isNumber(key) == true)
            {
                double left,right;
                if(key == "false")
                    left = right = -1.0;
                else if(key == "true")
                    left = right = 1.0;
                else
                    left = right = stod(key);
                return IntervalPoint(left,right);
            }
            else
            {
                map<string,IntervalPoint>::iterator iter = mapValueAlias.find(key);
                if(iter != mapValueAlias.end())
                    return iter->second;
                else
                {
                    cerr<<"-----ERROR-----  IntervalPoint calaRuntimeValue(Expression* expression)   ";
                    cerr<<key<<endl;
                    return IntervalPoint(0.0,0.0);
                }
            }
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
                IntervalPoint op1 = calaRuntimeValue(expression->getOneChild());
                IntervalPoint op2 = calaRuntimeValue(expression->getTwoChild());
                return calaArithIntervalPoint(op1,op2,op);

            }else if( regex_match(op,bitBinStrPattern) )
            {
                //| '('  bitwiseBinaryOp     TYPE  expression  expression  ')'  //6
                //| '('  bitwiseBinaryOp           expression  expression  ')'  //5
                IntervalPoint op1 = calaRuntimeValue(expression->getOneChild());
                IntervalPoint op2 = calaRuntimeValue(expression->getTwoChild());
                return calaBitIntervalPoint(op1,op2,op);

            }else if( regex_match(op,compBinStrPattern) )
            {
                //| '('  comparisonBinaryOP  TYPE   expression  expression  ')'  //6
                //| '('  comparisonBinaryOP         expression  expression  ')'  //5
                IntervalPoint op1 = calaRuntimeValue(expression->getOneChild());
                IntervalPoint op2 = calaRuntimeValue(expression->getTwoChild());
                if( op == "Eq" || op == "FOEq")
                {
                    bool op1Bool = IntervalPointToBool(op1);
                    bool op2Bool = IntervalPointToBool(op2);

                    string op1Str = to_string(expression->getOneChild());
                    string op2Str = to_string(expression->getTwoChild());
                    if(op1Str == "true" || op1Str == "false" || op2Str == "true" || op2Str == "false")
                    {
                        bool res = true;
                        if(op1Bool == true && op2Bool == true
                        || op1Bool == false && op2Bool == false)
                            res=true;
                        else
                            res = false;
                        return BoolToIntervalPoint(res);
                    }

                }
                return calaCompIntervalPoint(op1,op2,op);

            }else if( regex_match(op,fpConPattern) )
            {
                //| '('  fpConversionOp  TYPE  expression  ')' //5
                return calaRuntimeValue(expression->getOneChild());

            }else if(op == "Not" || op == "Concat")
            {
                //| '('  BITWISE_NOT         TYPE  expression  ')'  //5
			    //| '('  BITWISE_NOT               expression  ')'  //4
                setIsVaild(false);
                cerr<<"----- WARNING ----- IntervalPoint InverseIIBasedOI::calaRuntimeValue(Expression* expression) ";
                cerr <<"  op: "<<op<<endl;
                return IntervalPoint(0.0,0.0);

            }else if( op == "Extract")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                return calaRuntimeValue(expression->getTwoChild());

            }else if(op == "ZExt" || op == "SExt")
            {
                //| '(' SP_ZEXT    TYPE  expression  ')'  //5
                //| '(' SP_SEXT    TYPE  expression  ')'  //5
                return calaRuntimeValue(expression->getOneChild());

            }else if(op == "ReadLSB" || op == "ReadMSB")
            {
                //| '(' SP_READLSB TYPE  expression  expression  ')'  //6 常见
                //| '(' SP_READMSB TYPE  expression  expression  ')'   //6 没见过
                //eg: (ReadLSB w32 8 intB)
                return calaRuntimeValue(expression->getTwoChild());

            }else if(op == "FCmp")
            {
                //| '('  FP_FCMP         expression  expression  expression ')' //6
                //这个是针对KleeFP的，所欲对于KleeFLoat基本不会遇到
                IntervalPoint op1 = calaRuntimeValue(expression->getOneChild());
                IntervalPoint op2 = calaRuntimeValue(expression->getTwoChild());
                string op3 = expression->getThreeChildStr();
                return calaArithIntervalPoint(op1,op2,op3);

            }else if(op == "FPExt")
            {
                //| '('  FP_FPEXT        TYPE  expression  ')'  //5
                return calaRuntimeValue(expression->getOneChild());
            }else if(op == ":")
            {
                //IDENTIFIER ':' expression
                string alianKey = expression->getTwoChildStr();
                IntervalPoint op1 = calaRuntimeValue(expression->getOneChild());
                this->mapValueAlias[alianKey]=op1;
                return op1;

            }else if(op == "Read" || op == "Select" || op == "Neg" || op == "FPTrunc")
            {
                //异常情况处理
                //| '(' SP_READ    TYPE  expression  expression  ')' //6
                //| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                //| '('  FP_FPTRUNC      TYPE  expression  ')' //5
                setIsVaild(false);
                cerr<<"----- WARNING ----- IntervalPoint InverseIIBasedOI::calaRuntimeValue(Expression* expression) ";
                cerr <<"  op: "<<op<<endl;
                return IntervalPoint(0.0,0.0);
            }else
            {
                //异常情况处理
                setIsVaild(false);
                cerr<<"----- WARNING ----- IntervalPoint InverseIIBasedOI::calaRuntimeValue(Expression* expression) ";
                cerr<<"Encounter Invaild Situations ";
                cerr<<"Op: "<<expression->getOp()<<" "
                    <<"Width: "<<expression->getWidth()<<" "
                    <<"Op1: "<<expression->getOneChildStr()<<" "
                    <<"Op2: "<<expression->getTwoChild()<<" "
                    <<"Op3: "<<expression->getThreeChild()<<endl;
                return IntervalPoint(0.0,0.0);
            }
        }

        return IntervalPoint(0.0,0.0);
    }

    /*
        两个区间的计算,比较运算
        Eq|Ne|Ult|Ule|Ugt|Uge|Slt|Sle|Sgt|Sge|FOGe|FOGt|FOLe|FOLt|FOEq
    */
    IntervalPoint InverseIIBasedOI::calaCompIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op)
    {
        bool res = false;
        if( op == "Eq" || op == "FOEq")
        {
            res = op1 == op2;
        }else if( op == "Ne" )
        {
            res = op1 != op2;
        }else if( op == "Ult" || op == "Slt" || op == "FOLt")
        {
            res = op1 < op2;
        }else if( op == "Ule" || op == "Sle" || op == "FOLe")
        {
            res = op1 <= op2;
        }else if( op == "Ugt" || op == "Sgt" || op == "FOGt")
        {
            res = op1 > op2;
        }else if( op == "Uge" || op == "Sge" || op == "FOGe")
        {
            res = op1 >= op2;
        }else
        {
            cerr<<"------ ERROR -----  IntervalPoint InverseIIBasedOI::calaCompIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op) ";
            cerr<<op1<<op<<op2<<endl;
            res = true;
        }
        if(res == true)
            return IntervalPoint(1.0,1.0);
        else
            return IntervalPoint(-1.0,-1.0);
    }
    /*
        把一个区间转化为bool类型
    */
    bool InverseIIBasedOI::IntervalPointToBool(IntervalPoint op)
    {
        if(op.left > 0 && op.right > 0)
            return true;
        else if(op.left < 0 && op.right < 0)
            return false;
        else
        {
            cerr<<"----- WARNING ----- bool InverseIIBasedOI::IntervalPointToBool(IntervalPoint op)  ";
            cerr<<"op "<<op<<" change to bool type failed"<<endl;
            return true;
        }
    }
    /*
        把一个bool类型转化为区间类型
    */
    IntervalPoint InverseIIBasedOI::BoolToIntervalPoint(bool op)
    {
        if(op == true)
            return IntervalPoint(1.0,1.0);
        else
            return IntervalPoint(0.0,0.0);
    }

    /*
        两个区间的计算
        Add|Sub|Mul|UDiv|URem|SDiv|SRem|FAdd|FSub|FMul|FDiv|FRem
    */
    IntervalPoint InverseIIBasedOI::calaArithIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op)
    {
        if(op == "Add" || op == "FAdd")
        {
            return op1+op2;
        }else if(op == "Sub" || op == "FSub")
        {
            return op1-op2;
        }else if(op == "Mul" || op == "FMul")
        {
            return op1*op2;
        }else if(op == "UDiv" || op == "SDiv" || op == "FDiv")
        {
            return op1/op2;
        }else if(op == "URem" || op == "SRem" || op == "FRem")
        {
            cerr<<"------ WARNING -----  IntervalPoint InverseIIBasedOI::calaArithIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op) ";
            cerr<<op1<<op<<op2<<endl;
            return op1;
        }else
        {
            cerr<<"------ ERROR -----  IntervalPoint InverseIIBasedOI::calaArithIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op) ";
            cerr<<op1<<op<<op2<<endl;
            return op1;
        }
        return op1;
    }

    /*
        两个区间的计算,位运算
         And|Or|Xor|Shl|LShr|AShr
    */
    IntervalPoint InverseIIBasedOI::calaBitIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op)
    {
        bool opp1 = IntervalPointToBool(op1);
        bool opp2 = IntervalPointToBool(op2);
        if(op == "And" || op == "Or")
        {
            bool res = (op == "And") ? (opp1 && opp2) : (opp1 || opp2);
            if(res == true)
                return IntervalPoint(1.0,1.0);
            else
                return IntervalPoint(-1.0,-1.0);
        }
        else if(op == "Not" || op == "Xor" || op == "Shl" || op == "LShr" || op == "AShr")
        {
            setIsVaild(false);
            cerr<<"----- WARNING ----- IntervalPoint InverseIIBasedOI::calaBitIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op) ";
            cerr <<"  op: "<<op<<endl;
            return op1+op2;
        }else
        {
            cerr<<"------ ERROR -----   IntervalPoint InverseIIBasedOI::calaBitIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op) ";
            cerr<<op1<<op<<op2<<endl;
            return op1;
        }
        return op1;
    }


    /*
        使用正则表达式确定是否是数字
    */
    bool InverseIIBasedOI::isNumber(string numStr)
    {
        string numPatStr = "([0-9_]+|0b[01_]+|0o[0-7_]+|0x[0-9a-fA-F_]+)";
        string numPat = "true|false";
        string sciPatStr = "[+-]?[\\d]+([\\.][\\d]*)?([Ee][+-]?[0-9]{0,2})?";
        numPat = numPat + "|([+|-]" + numPatStr + ")" + "|" + numPatStr + "|" + sciPatStr;
        regex numPattern(numPat);
        if(regex_match(numStr,numPattern))
            return true;
        else
            return false;
    }


    /*
        设置最后的区间结果
    */
    void InverseIIBasedOI::setIntervalPointSolverRes()
    {
        if(this->intervalPointSolverRes.size() == 0)
            this->intervalRes = "";
        else
        {
            this->intervalRes = "[[" + to_string(this->intervalPointSolverRes[0].left)
                              + "," + to_string(this->intervalPointSolverRes[0].right)
                              + "]";
            for(int i=1; i<(int)(this->intervalPointSolverRes.size()); i++)
            {
                this->intervalRes = this->intervalRes + ","
                                  +"[" + to_string(this->intervalPointSolverRes[i].left)
                                  + ","+ to_string(this->intervalPointSolverRes[i].right)
                                  + "]";
            }
            this->intervalRes = this->intervalRes + "]";
        }
    }

    /*
        把转化为string
    */
    string InverseIIBasedOI::to_string(double d)
    {
        stringstream ss;
        ss<<d;
        string res = ss.str();
        ss.clear();
        return res;
    }

    /*
        处理Eq 为false的情况
        这个暂时用不到
    */
    void InverseIIBasedOI::dealWithEqFalse()
    {
        for(int i = 0; i < (int)(this->expressionList.size()); i++)
        {
            Expression* express = this->expressionList[i];
            string op = express->getOp();
            if(op == "Eq" || op == "FOEq")
            {
                string op1 = to_string(express->getOneChild());
                string op2 = to_string(express->getTwoChild());
                if(op1 == "true")
                {
                    this->expressionList[i] = express->getTwoChild();
                    continue;
                }

                if(op2 == "true")
                {
                    this->expressionList[i] = express->getOneChild();
                    continue;
                }

                if(op1 == "false")
                {
                    this->expressionList[i] = express->getTwoChild();
                    string inverOp = getInverseOp(this->expressionList[i]->getOp());
                    this->expressionList[i]->setOp(inverOp);
                    continue;
                }

                if(op2 == "false")
                {
                    this->expressionList[i] = express->getOneChild();
                    string inverOp = getInverseOp(this->expressionList[i]->getOp());
                    this->expressionList[i]->setOp(inverOp);
                    continue;
                }
            }
        }
    }


    /*
        运算符取反操作
        这个暂时用不到
    */
    string InverseIIBasedOI::getInverseOp(string op)
    {
        //二元逻辑运算符的取反
        if(op == "And")
        {
            return "Or";
        }else if(op == "Or")
        {
            return "And";
        }else if(op == "Not" || op == "Xor" || op == "Shl" || op == "LShr" || op == "AShr")
        {
            return "FAdd";
        }

        //比较运算符的取反
        if( op == "Eq" || op == "FOEq")
        {
            return "Ne";
        }else if( op == "Ne" )
        {
            return "Eq";
        }else if( op == "Ult" || op == "Slt" || op == "FOLt")
        {
            return "FOGe";
        }else if( op == "Ule" || op == "Sle" || op == "FOLe")
        {
            return "FOGt";
        }else if( op == "Ugt" || op == "Sgt" || op == "FOGt")
        {
            return "FOLe";
        }else if( op == "Uge" || op == "Sge" || op == "FOGe")
        {
            return "FOLt";
        }else
        {
            cerr<<"------ ERROR -----  string InverseIIBasedOI::getInverseOp(string op) ";
            cerr<<op<<endl;
            return op;
        }
        return op;
    }




    /*
        把Expression二叉树转化为字符串,
    */
    string InverseIIBasedOI::to_string(Expression* expression)
    {
        if(expression == NULL)
            return "";
        else if(expression->isAtomExpression)
        {
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "Not")
            {
                //| '('  BITWISE_NOT         TYPE  expression  ')'  //5
                //| '('  BITWISE_NOT               expression  ')'  //4
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                string transOp = GlobalFunction::getBitBinStr(op,expression);
                string res = "(" + transOp + op1 + ")";
                return res;

            }else if(op == "Concat")
            {
                //| '(' SP_CONCAT  TYPE  expression  expression  ')' //6
                //| '(' SP_CONCAT        expression  expression  ')' //5
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Concact Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if( op == "Extract")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                //cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                //cerr<<"Extract Can't Be Handled!!!"<<endl;
                //setIsVaild(false);
                //return "";

                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                return op2;

            }else if(op == "ZExt")
            {
                //| '(' SP_ZEXT    TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "SExt")
            {
                //| '(' SP_SEXT    TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "Read")
            {
                //| '(' SP_READ    TYPE  expression  expression  ')' //6
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Read Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == "Select")
            {
                //| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Select Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if( op == "Neg")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Neg Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == "ReadLSB")
            {
                //| '(' SP_READLSB TYPE  expression  expression  ')'  //6
                // (ReadLSB w32 8 intB)
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();
                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                return op2;

            }else if(op == "ReadMSB")
            {
                //| '(' SP_READMSB TYPE  expression  expression  ')'   //6
                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                return op2;
            }else if(op == "FCmp")
            {
                //| '('  FP_FCMP         expression  expression  expression ')' //6
                string op1 = "" , op2 = "" , op3 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                if( expression->getThreeChild()!=NULL )
                    op3 = to_string(expression->getThreeChild());
                else
                    op3 = expression->getThreeChildStr();

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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "FPTrunc")
            {
                //| '('  FP_FPTRUNC      TYPE  expression  ')' //5
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"FPTrunc Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == ":")
            {
                //IDENTIFIER ':' expression

                string op1 = "";
                if( expression->getOneChild()!=NULL )
                {
                    if(expression->getWidth() < expression->getOneChild()->getWidth())
                        expression->setWidth(expression->getOneChild()->getWidth());

                    op1 = to_string(expression->getOneChild());
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
                cerr<<"In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Encounter Invaild Situations ";
                cerr<<"Op: "<<expression->getOp()<<" "
                    <<"Width: "<<expression->getWidth()<<" "
                    <<"Op1: "<<expression->getOneChildStr()<<" "
                    <<"Op2: "<<expression->getTwoChild()<<" "
                    <<"Op3: "<<expression->getThreeChild()<<endl;
            }

        }

        return "";
    }


    /*
        把Expression二叉树转化为字符串,
        这里要消除所有的 ！ 运算，
    */
    string InverseIIBasedOI::to_stringForPython(Expression* expression)
    {
        if(expression == NULL)
            return "";
        else if(expression->isAtomExpression)
        {
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();
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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
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
                        res = op1 + transOp + op2 ;
                }else
                    res = op1 + transOp + op2 ;
                return res;
            }else if( regex_match(op,fpConPattern) )
            {
                //| '('  fpConversionOp  TYPE  expression  ')' //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "Not")
            {
                //| '('  BITWISE_NOT         TYPE  expression  ')'  //5
                //| '('  BITWISE_NOT               expression  ')'  //4
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                string transOp = GlobalFunction::getBitBinStr(op,expression);
                string res = "(" + transOp + op1 + ")";
                return res;

            }else if(op == "Concat")
            {
                //| '(' SP_CONCAT  TYPE  expression  expression  ')' //6
                //| '(' SP_CONCAT        expression  expression  ')' //5
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Concact Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if( op == "Extract")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                //cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                //cerr<<"Extract Can't Be Handled!!!"<<endl;
                //setIsVaild(false);
                //return "";

                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                return op2;

            }else if(op == "ZExt")
            {
                //| '(' SP_ZEXT    TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "SExt")
            {
                //| '(' SP_SEXT    TYPE  expression  ')'  //5
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "Read")
            {
                //| '(' SP_READ    TYPE  expression  expression  ')' //6
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Read Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == "Select")
            {
                //| '(' SP_SELECT  TYPE  expression  expression  expression  ')'  //7
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Select Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if( op == "Neg")
            {
                //| '(' SP_EXTRACT TYPE  expression  expression  ')'         //6
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Neg Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == "ReadLSB")
            {
                //| '(' SP_READLSB TYPE  expression  expression  ')'  //6
                // (ReadLSB w32 8 intB)
                string op1 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();
                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();
                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                return op2;

            }else if(op == "ReadMSB")
            {
                //| '(' SP_READMSB TYPE  expression  expression  ')'   //6
                string op2 = "";
                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                op2 = TransFloatNumAndMapAlias(op2, op, expression->getWidth());
                return op2;
            }else if(op == "FCmp")
            {
                //| '('  FP_FCMP         expression  expression  expression ')' //6
                string op1 = "" , op2 = "" , op3 = "";
                if( expression->getOneChild()!=NULL )
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                if( expression->getTwoChild()!=NULL )
                    op2 = to_string(expression->getTwoChild());
                else
                    op2 = expression->getTwoChildStr();

                if( expression->getThreeChild()!=NULL )
                    op3 = to_string(expression->getThreeChild());
                else
                    op3 = expression->getThreeChildStr();

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
                    op1 = to_string(expression->getOneChild());
                else
                    op1 = expression->getOneChildStr();

                op1 = TransFloatNumAndMapAlias(op1, op, expression->getWidth());
                return op1;
            }else if(op == "FPTrunc")
            {
                //| '('  FP_FPTRUNC      TYPE  expression  ')' //5
                cerr<<"*** WARNING *** In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"FPTrunc Can't Be Handled!!!"<<endl;
                setIsVaild(false);
                return "";
            }else if(op == ":")
            {
                //IDENTIFIER ':' expression

                string op1 = "";
                if( expression->getOneChild()!=NULL )
                {
                    if(expression->getWidth() < expression->getOneChild()->getWidth())
                        expression->setWidth(expression->getOneChild()->getWidth());

                    op1 = to_string(expression->getOneChild());
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
                cerr<<"In Function: string InverseIIBasedOI::to_string(Expression* expression) ";
                cerr<<"Encounter Invaild Situations ";
                cerr<<"Op: "<<expression->getOp()<<" "
                    <<"Width: "<<expression->getWidth()<<" "
                    <<"Op1: "<<expression->getOneChildStr()<<" "
                    <<"Op2: "<<expression->getTwoChild()<<" "
                    <<"Op3: "<<expression->getThreeChild()<<endl;
            }

        }

        return "";
    }



    /*
        根据操作数numStr和操作符op来判断是否做转换,如何做转换
        当op是浮点数类型的操作的时候,根据浮点数的转换去做转换
        其余的就按照整数类型的转换去做,
        再出现不是num的时候还要做别名的一个替换
    */
    string InverseIIBasedOI::TransFloatNumAndMapAlias(string numStr, string op, int width)
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







