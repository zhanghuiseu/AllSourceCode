#ifndef TRANSFORM_H_INCLUDED
#define TRANSFORM_H_INCLUDED

#include <iostream>
#include <string>
#include <sstream>
#include <vector>
#include <stack>
#include <map>

#include "antlr4-runtime.h"
#include "KQueryLexer.h"
#include "KQueryParser.h"
#include "ParserRuleContext.h"

#include "SymbolicVar.h"
#include "Transform.h"
#include "Expression.h"
#include "IDInfo.h"
#include "ArrayElement.h"
#include "Solver.h"
#include "InverseIIBasedOI.h"


using namespace std;
using namespace antlr4;
using namespace antlrcpp;

class Transform
{
public:
    /*
        构造函数
    */
    Transform(){};
    Transform( KQueryParser::KqueryContext* ctx,string solverPath);

    /*
        这个就是主函数部分,在完成对象实例化的同事完成Parser过程
        主要分为生命变量的即系和约束的解析
        在整个解析环节主要出现一个无法解析的地方,就立刻停止解析,直接返回,
    */
    bool beginParser();

    /*
        写上如下的析构函数会报错,这个问题的有待解决
    */
    ~Transform();

    /*
        约束求解部分
    */
    void solveProblem(int solverType);

    /*
        这个函数主主要处理定义声明部分的解析
    */
    void parserArrayDeclCtx( vector<KQueryParser::ArrayDeclarationContext *> arrayDeclarList );

    /*
        这个函数主要处理每一个声明语句的具体分析
    */
    void dealWithArrayDeclar(SymbolicVar* oneVar, vector<antlr4::tree::ParseTree *>  childList);

    /*
        这个要是处理声明变量的实例化部分
        根据KQuery语法设计,分为了两种格式
    */
    void dealWithArrayInit(SymbolicVar* oneVar, antlr4::tree::ParseTree* initList);

    /*
        这个主要是处理约束解析部分
    */
    void parserQueryComCtx( vector<KQueryParser::QueryCommandContext *> queryList);

    /*
        这个函数主要处理每一个constraint
    */
    void dealWithConstraint( antlr4::tree::ParseTree* child );

    /*
        把每一个KQuery的Expression设置为自定的数据结构Expression
    */
    void transToExpression(Expression* root , antlr4::tree::ParseTree* child);

    /*
        把我们自定义的Expression转换为目标格式
    */
    void dealWithExpression(vector< Expression* >  expressionList);

    /*
        动态的调整所有expression的width, 这个是为了做到无符号大整数到浮点数的转换
        递归实现,这个需要从叶节点到父亲节点的动态调整
    */
    void adjustExpWidth(Expression* expression, vector<Expression*>  &terminateExp);

    /*
        这个函数是为了手机所有的叶子节点和非叶子节点,用于从上至上动态调整width
    */
    void getAllNodeByDFS(Expression* expression, vector<Expression*>  &terminateExp);


    /*
        把我们自定义的Expression转换为目标格式,递归实现
    */
    string expTransToConstraint(Expression* expression);

    /*
        根据操作数numStr和操作符op来判断是否做转换,如何做转换
        当op是浮点数类型的操作的时候,根据浮点数的转换去做转换
        其余的就按照整数类型的转换去做,

        再出现不是num的时候还要做别名的一个替换
    */
    string TransFloatNumAndMapAlias(string numStr, string op, int width);

    /*
        根据别名ID来更新
    */
    void updateWidthForAlias(Expression* expression,string aliadId);


    /*
        应该没用了
        通过DFS递归来吧包含别名的操作替换掉
    */
    void MapAliasByDFS(Expression* expression);

    /*
        应该没用了
        Map one Alias 通过循环遍历来实现替换
    */
    string MapOneAlias(string aliadId);


    /*
        这个是针对数组的处理,因为到了这里数组下标是某一下标,也就是index是固定的
        主要就是遍历vector< SymbolicVar* > symbolicVarList,然后确定index
    */
    string dealWithArray(string id,string width);


    /*
        这个函数主要判断expression是不是原子expression
        判断的原则就是 expression 的每一个子节点都是原子expression
    */
    bool isAtomExpression( antlr4::tree::ParseTree* expression );

    /*
        isAtomExpression的辅助函数
    */
    bool isAtomSimpleExp(antlr4::tree::ParseTree* expression);


    /*
        递归打印Parser函数
    */
    void printInfo( antlr4::tree::ParseTree* child );

    /*
        递归打印Expression
    */
    void printExpression(Expression* one);


    /*
        下面主要是set和get函数
    */
    void setCtx(KQueryParser::KqueryContext* c)         {   ctx = c;                  };
    KQueryParser::KqueryContext* getCtx()               {   return ctx;               };
    void setIsVaild(bool a)                             {   isVaild =a;               };
    bool getIsVaild()                                   {   return isVaild;           };
    vector< SymbolicVar* >& getSymbolicVarList()        {   return symbolicVarList;   };
    vector< Expression* >& getExpressionList()          {   return expressionList;    };
    map<string,IDInfo*>&  getMapAlias()                 {   return mapAlias;          };
    map< string,ArrayElement* >& getMapInputSymbolic()  {   return mapInputSymbolic;  };
    vector<string>& getConstraints()                    {   return constraints;       };

    /*
        这个函数主要就是打印复合约束
        set函数主要是遍历vector<string> constraints; 这个默认自动完成
    */
    void setFinalComplexConstraints();

    /*
        这个函数主要设置相关变量的Type
    */
    void setFinalSymbolicType();

    /*
         主要主要设置相关变量的Name
    */
    void setFinalSymbolicName();

    string getFinalComplexConstraints()                 {   return finalComplexConstraints;   };
    string getFinalSymbolicType()                       {   return finalSymbolicType;         };
    string getFinalSymbolicVarName()                    {   return finalSymbolicVarName;      };
    Solver* getSolver()                                 {   return solver;                    };
    void setSolverPath(string a)                        {   solverPath = a;                   };
    string getSolverPath()                              {   return solverPath;                 };

    //InverseIIBasedOI* getInverseIIBasedOIHandler        {   return inverseIIBasedOIHandler;   };


public:
    KQueryParser::KqueryContext* ctx;
    vector< SymbolicVar* > symbolicVarList;
    vector< Expression* >  expressionList;
    map<string,IDInfo*> mapAlias;
    map< string,ArrayElement* > mapInputSymbolic;

    vector<string> constraints;
    string finalComplexConstraints = "";

    vector<string> symbolicVarType;
    string finalSymbolicType = "";

    vector<string> symbolicVarName;
    string finalSymbolicVarName = "";

    bool isVaild = true;

    Solver* solver = NULL;
    string solverPath = "";

    InverseIIBasedOI* inverseIIBasedOIHandler = NULL;

};

#endif // TRANSFORM_H_INCLUDED
