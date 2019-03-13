    #include <iostream>
    #include <vector>
    #include <string>
    #include <string.h>
    #include <regex>
    #include <map>

    #include "antlr4-runtime.h"
    #include "KQueryLexer.h"
    #include "KQueryParser.h"
    #include "ParserRuleContext.h"

    #include "SymbolicVar.h"
    #include "Transform.h"
    #include "string.h"
    #include "ArrayElement.h"

    #include "InverseIIBasedOIBuilder.h"
    #include "time.h"


    #define LFFSolver  0
    #define PLFFSolver 1
    #define InverseIIBasedOISolver 2

    using namespace std;
    using namespace antlr4;
    using namespace antlrcpp;


    /*
        Inverse Input Interval Based on Output Interval的接口
        const char* kqueryChar:kquery的待解析的约束
        const char* solverPath:solver的位置
        char* &symbolicName:解析出来的运算符列表
        bool &isVaild:约束的vaild
        int &resType:返回类型 处理求解结果,1表示有解,0表示无解,-1表示状态不正确
        double &coverage:覆盖率
        char* &solverRes:solver的结果

        这个类是外围封装接口,以供调用
        注意借口部分不要使用string',要使用char* 字符数组差传递字符串
     */
     bool beginParserAndInverseIIBasedOI(const char* kqueryChar,const char* solverPathChar,
                               char* &symbolicType,
                               char* &symbolicName,
                               char* &symbolicFinalConstraint,
                               bool &isVaild,int &resType,double &coverage,char* &solverRes
                               )

     {
          clock_t start = clock();

          //变量初始化
          string str(kqueryChar);
          string solverpath(solverPathChar);

          //KQuery Parser解析
          ANTLRInputStream input(str);

          KQueryLexer lexer(&input);
          CommonTokenStream tokens(&lexer);
          KQueryParser parser(&tokens);
          KQueryParser::KqueryContext* ctx = parser.kquery();

          //转换求解模块开始工作
          Transform* trans = new Transform(ctx,solverpath);
          bool res =  trans->beginParser();

          //0表示LFF S0lver；1表示PLFF Solver; 2 表示InverseIIBasedOISolver
          int solverType = InverseIIBasedOISolver;
          //约束求解
          trans->solveProblem(solverType);

        //设置返回结果
         const char* typeChar = trans->finalSymbolicType.c_str();
         symbolicType = new char[strlen(typeChar)+1];
         strcpy(symbolicType,typeChar);

         const char* nameChar = trans->finalSymbolicVarName.c_str();
         symbolicName = new char[strlen(nameChar)+1];
         strcpy(symbolicName,nameChar);

         const char* constraintChar = trans->finalComplexConstraints.c_str();
         symbolicFinalConstraint = new char[strlen(constraintChar)+1];
         strcpy(symbolicFinalConstraint,constraintChar);

         isVaild = trans->getIsVaild();
         resType = trans->solver->getResType();
         coverage = trans->solver->getCoverage();

         /*
         string transRes = trans->solver->solutionVec[0];
         for(int i=1;i<(int)trans->solver->solutionVec.size();i++)
         {
             transRes = transRes + "," +trans->solver->solutionVec[i];
         }
         const char* resChar = transRes.c_str();
         solverRes = new char[strlen(resChar)+1];
         strcpy(solverRes,resChar);
         */
         //写入可行解区间
         string transRes = trans->inverseIIBasedOIHandler->intervalRes;
         const char* resChar = transRes.c_str();
         solverRes = new char[strlen(resChar)+1];
         strcpy(solverRes,resChar);

         //cout<<"************   Begin In KQuery Parser And IIP Solver   ************"<<endl;

         //cout<<"Expression List Size: "<<trans->constraints.size()<<endl;
         //for(int i = 0; i < (int)(trans->constraints.size()); i++)
            //cout<<trans->constraints[i]<<endl;

         //cout<<"Final Symbolic Type      :  "<<trans->getFinalSymbolicType()<<endl;
         //cout<<"Final SYmbolic Name      :  "<<trans->getFinalSymbolicVarName()<<endl;
         //cout<<"Final Complex Constraints:  "<<trans->getFinalComplexConstraints()<<endl;

         //cout<<endl<<"Solver Info Is Following: "<<endl;
         //trans->inverseIIBasedOIHandler->printInfo();
         //cout<<"Game Over!!!"<<endl;

         //cout<<"************    End In KQuery Parser And IIP Solver    ************"<<endl;

         clock_t finish=clock();
         double AllTime = (double)(finish - start) / CLOCKS_PER_SEC;
         double shellTime = trans->getSolver()->shellTime;
         //cout<<"*****    ShellTime is "<<shellTime<<endl;
         //cout<<"*****      AllTime is "<<AllTime<<endl;
         //cout<<"*****     Coverage is "<<(double)(shellTime/AllTime)*100<<"%"<<endl;

         delete trans;
         return res;
    }
