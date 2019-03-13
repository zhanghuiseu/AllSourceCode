#ifndef INVERSEIIBASEDOI_H_INCLUDED
#define INVERSEIIBASEDOI_H_INCLUDED

#include <string>
#include <vector>
#include <map>
#include <set>
#include <string>
#include <iostream>
#include <sstream>

#include "antlr4-runtime.h"
#include "KQueryLexer.h"
#include "KQueryParser.h"
#include "ParserRuleContext.h"

#include "SymbolicVar.h"
#include "Transform.h"
#include "Expression.h"
#include "IDInfo.h"
#include "ArrayElement.h"
#include "Expression.h"
#include "IntervalPoint.h"

using namespace std;
using namespace antlr4;
using namespace antlrcpp;


/*
    Inverse Input Interval Based on Output Interval
    InverseIIBasedOISolver
*/
class InverseIIBasedOI
{
public:
    /*
        默认构造函数
    */
    InverseIIBasedOI() {};

    /*
        构造函数,参数初始化
        vector< Expression* >  expressionList 约束二叉树
        vector<string> symbolicVarName        变量名字
        vector<string> symbolicVarType        变量类型
        vector<string> SolutionVec            求解结果
        int resType                           求解类型，1表示可以求解，0表示无法求解
        只要可以求解的情况下才可以做基于区间的计算
    */
    InverseIIBasedOI(vector< Expression* >  expressionList,
                     vector<string> symbolicVarName,
                     vector<string> symbolicVarType,
                     vector<string> SolutionVec,
                     int resType);

    /*
        默认析构函数
    */
    ~InverseIIBasedOI();

    /*
        这个数solver的入口函数
    */
    bool solveProcess();

    /*
        直接调用Python脚本
    */
    bool pythonSolver();

    bool writeToFile(string path);
    string readResult(string path);



    /*
        处理Eq 为false的情况
    */
    void dealWithEqFalse();

    /*
        计算最简约是表达式的运行时刻值
    */
    IntervalPoint calaRuntimeValue(Expression* expression);

    /*
        两个区间的计算,加，减，乘，除，取余计算
        Add|Sub|Mul|UDiv|URem|SDiv|SRem|FAdd|FSub|FMul|FDiv|FRem
    */
    IntervalPoint calaArithIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op);

    /*
        两个区间的计算,位运算
    */
    IntervalPoint calaBitIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op);

    /*
        两个区间的计算,比较运算
        Eq|Ne|Ult|Ule|Ugt|Uge|Slt|Sle|Sgt|Sge|FOGe|FOGt|FOLe|FOLt|FOEq
    */
    IntervalPoint calaCompIntervalPoint(IntervalPoint op1,IntervalPoint op2,string op);
    /*
        把一个区间转化为bool类型
    */
    bool IntervalPointToBool(IntervalPoint op);
    /*
        把一个bool类型转化为区间类型
    */
    IntervalPoint BoolToIntervalPoint(bool op);

    /*
        运算符取反操作
    */
    string getInverseOp(string op);

    /*
        使用正则表达式确定是否是数字
    */
    bool isNumber(string numStr);

    /*
        把Expression二叉树转化为字符串,
    */
    string to_string(Expression* expression);

    /*
        把Expression二叉树转化为字符串,
        这里要消除所有的 ！ 运算，
    */
    string to_stringForPython(Expression* expression);


    /*
        根据操作数numStr和操作符op来判断是否做转换,如何做转换
        当op是浮点数类型的操作的时候,根据浮点数的转换去做转换
        其余的就按照整数类型的转换去做,
        再出现不是num的时候还要做别名的一个替换
    */
    string TransFloatNumAndMapAlias(string numStr, string op, int width);
    /*
        把转化为string
    */
    string to_string(double d);

    /*
        打印相关信息
    */
    void printInfo();

    /*
        设置最后的区间结果
    */
    void setIntervalPointSolverRes();

    void setIsVaild(bool isVaild)       {  this->isVaild = isVaild;     };
    bool getIsVaild()                   {  return this->isVaild;        };
    void setSymbolicVarType(vector<string> symbolicVarType) {   this->symbolicVarType = symbolicVarType;};
    vector<string> getSymbolicVarType()                     {   return this->symbolicVarType;           };
    void setSymbolicVarName(vector<string> symbolicVarName) {   this->symbolicVarName = symbolicVarName;};
    vector<string> getSymbolicVarName()                     {   return this->symbolicVarName;           };
    void setResType(int resType)          {  this->resType = resType;   };
    int getResType()                      {  return this->resType;      };
    map<string,IDInfo*>  getMapAlias()    {   return mapAlias;          };
    void setIntervalRes(string intervalRes)  {   this->intervalRes=intervalRes;  };
    string getIntervalRes()                  {   return this->intervalRes;       };

public:
    //当前状态的有效性确定，这个主要做专门的路径约束的处理
    bool isVaild;

    //所有的简单自约束
    vector< Expression* >  expressionList;

    vector<string> symbolicVarType;
    vector<string> symbolicVarName;
    vector<double> solverRes;
    vector<IntervalPoint> intervalPointSolverRes;
    int resType;

    /*
        区间计算的先关参数
    */
    double fixIntervalPointLen;
    double minIntervalPointLen;


    //别名映射
    map<string,IntervalPoint> mapValueAlias;
    //打印字符串映射
    map<string,IDInfo*> mapAlias;

    string intervalRes;

};

#endif // INVERSEIIBASEDOI_H_INCLUDED
