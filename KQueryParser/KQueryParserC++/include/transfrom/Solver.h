#ifndef SOLVER_H_INCLUDED
#define SOLVER_H_INCLUDED
#include <string>
#include <map>
#include <iostream>

#define LFFSolver  0
#define PLFFSolver 1
#define InverseIIBasedOISolver 2


using namespace std;

class Solver
{
public:
    /*
        默认构造函数
    */
    Solver(){};

    /*
        主要使用道德构造函数,path是LFFSolver.jar的文件位置
        solverType 表示solver的区分，0表示LFF SOlver，1表示PLFF Solver
    */
    Solver(string path,int solverType);

    /*
        析构函数
    */
    ~Solver();

    /*
        这个数solver的入口函数
        string expStr:表示的是越是
        string typeStr:表示的是类型信息
        string nameStr:表示的是变量名字信息
    */
    void solveProcess(string expStr,string typeStr,string nameStr);


    /*
        这个是通过IO管道来实现LFFSOlver的调用
        从而记录实验结果
    */
    void dealWithShellForLFF(string expStr,string typeStr,string nameStr);

    /*
        这个是通过IO管道来实现PLFFSOlver的调用
        从而记录实验结果
    */
    void dealWithShellForPLFF(string expStr,string typeStr,string nameStr);


    /*
        expStr的转义字符替换处理
    */
    string dealWithSPChar(string expStr);


    /*
        这个是把originStr中分oldStr替换为newStr
    */
    string Replace(string orignStr, string oldStr, string newStr );


    /*
        处理求解其返回的结果
    */
    void dealWithResStr(string solverReturnRes);

    /*
        分解字符串
    */
    vector<string> split(string str, string delim);


    /*
        这个是处理LFF Solver出现意外的情况专门处理
    */
    bool isVaild(string oneStr);


    /*
        打印函数
    */
    void printInfo();




    void setSolverPath(string a)      {  this->solverPath = a;      };
    string getSolverPath()            {  return this->solverPath;   };
    void setSolverRes(string a)       {  this->solverRes = a;       };
    string getSolverRes()             {  return solverRes;          };
    void setResType(int a)            {  this->resType = a;         };
    int getResType()                  {  return this->resType;      };
    vector<string> & getSolutionVec() {  return this->solutionVec;  };
    void setCoverage(double a)        {  this->coverage = a;        };
    double getCoverage()              {  return this->coverage;     };


public:
    //LffSolver的路径
    string solverPath = "";

    //solverType 表示solver的区分，0表示LFF SOlver，1表示PLFF Solver
    int solverType;

    /*
        这个保存的是实验实验结果,
    */
    string solverRes = "";
    int resType = 0;
    map<string,string> replaceMap;

    vector<string> solutionVec;
    double coverage = 0;

    double shellTime = 0.0;
};



#endif // SOLVER_H_INCLUDED
