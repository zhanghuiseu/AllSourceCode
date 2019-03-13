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
    #include <unistd.h>

    #include<unistd.h>
    #include<sys/types.h>
    #include<sys/wait.h>


    #include "Solver.h"
    using namespace std;

    /*
        主要使用道德构造函数,path是LFFSolver.jar的文件位置
         这个map保存的是shell特殊字符的转义字符处理
        solverType 表示solver的区分，0表示LFF SOlver，1表示PLFF Solver
    */
    Solver::Solver(string path,int solverType)
    {
        this->solverPath = path;
        this->solverType = solverType;

        //下面是距离转义字符的对应关系
        replaceMap["="] = "\\=";
        replaceMap["$"] = "\\$";
        replaceMap[">"] = "\\>";
        replaceMap["<"] = "\\<";
        replaceMap["|"] = "\\|";
        replaceMap["||"] = "\\|\\|";
        replaceMap["&"] = "\\&";
        replaceMap["&&"] = "\\&\\&";
        replaceMap["("] = "\\(";
        replaceMap[")"] = "\\)";
        replaceMap["{"] = "\\{";
        replaceMap["}"] = "\\}";
        replaceMap[";"] = "\\;";
        replaceMap["!"] = "\\!";
    }


    /*
        析构函数
    */
    Solver::~Solver()
    {
        this->replaceMap.clear();
        this->solutionVec.clear();

        this->solverPath.clear();
        this->solverRes.clear();
    }

    /*
        这个数solver的入口函数
        string expStr:表示的是越是
        string typeStr:表示的是类型信息
        string nameStr:表示的是变量名字信息
    */
    void Solver::solveProcess(string expStr,string typeStr,string nameStr)
    {
        //cout<<nameStr<<endl;
        //cout<<typeStr<<endl;
        //cout<<expStr<<endl;

        //处理这种情况的约束 (query [] false)
        if(expStr == "")
        {
            this->solverRes = "1@1@1";
            this->dealWithResStr(this->solverRes);
        }
        else if(this->solverType == LFFSolver)
        {
            //expStr = dealWithSPChar(expStr);
            //typeStr = dealWithSPChar(typeStr);
            //nameStr = dealWithSPChar(nameStr);
            this->dealWithShellForLFF(expStr,typeStr,nameStr);
            this->dealWithResStr(this->solverRes);

        }else if(this->solverType == PLFFSolver)
        {
            this->dealWithShellForPLFF(expStr,typeStr,nameStr);
            this->dealWithResStr(this->solverRes);
        }else
        {
            cout<<"找不到求解器void Solver::solveProcess(string expStr,string typeStr,string nameStr)  "<<endl;

            /*
            ofstream fd;
            string filePath = "/home/zy/Desktop/KleeFloatExamples/AllResult/benchmark.result";
            fd.open(filePath,ios::out);
            fd<<typeStr<<"\n\n";
            fd<<nameStr<<"\n\n";
            fd<<expStr<<"\n\n";
            fd.close();
            */

            exit(0);
        }
    }


    /*
        expStr的转义字符替换处理
    */
    string Solver::dealWithSPChar(string target)
    {
        map<string,string>::iterator iter = replaceMap.begin();

        for(;iter != replaceMap.end();iter++)
            target = Replace(target,iter->first,iter->second);

        return target;
    }

    /*
        这个是把originStr中分oldStr替换为newStr
    */
    string Solver::Replace(string orignStr, string oldStr, string newStr)
    {
        size_t pos = 0;
        string tempStr = orignStr;
        string::size_type newStrLen = newStr.length();
        string::size_type oldStrLen = oldStr.length();
        while(true)
        {
            pos = tempStr.find(oldStr, pos);
            if (pos == string::npos) break;
            tempStr.replace(pos, oldStrLen, newStr);
            pos += newStrLen;
        }
        return tempStr;
    }


    /*
        这个是通过IO管道来实现LFFSOlver的调用
        从而记录实验结果
    */
    void Solver::dealWithShellForLFF(string expStr,string typeStr,string nameStr)
    {
        ofstream fd;
        string filePath = this->solverPath.substr(0,this->solverPath.find_last_of("/"))+"/one.constraint";
        filePath = dealWithSPChar(filePath);
        fd.open(filePath,ios::out);
        fd<<expStr<<"\n";
        fd<<typeStr<<"\n";
        fd<<nameStr<<"\n";
        fd.close();

        clock_t start = clock();

        string cmd = "java -jar "+this->solverPath + " ";
        cmd = cmd + filePath;
        FILE *pp = popen(cmd.c_str(), "r"); //建立管道
        if (!pp)
            this->setResType(-1);

        char tmp[4096]; //设置一个合适的长度，以存储每一行输出
        int countReadFromShell = 5;
        for(int i=0;i<countReadFromShell;i++)
        {
            if(fgets(tmp, sizeof(tmp), pp)!=NULL)
            {
                if (tmp[strlen(tmp) - 1] == '\n')
                    tmp[strlen(tmp) - 1] = '\0'; //去除换行符
                this->solverRes = this->solverRes + tmp;
            }else
                break;
        }

        int rc = pclose(pp); //关闭管道
        if(-1 == rc)
        {
            perror("关闭文件指针失败");
            this->setResType(-1);
        }

        clock_t finish = clock();
        shellTime = (double)(finish - start) / CLOCKS_PER_SEC;
    }


    /*
        这个是通过IO管道来实现PLFFSOlver的调用
        从而记录实验结果
    */
    void Solver::dealWithShellForPLFF(string expStr,string typeStr,string nameStr)
    {
        string path = this->solverPath.substr(0,this->solverPath.find_last_of("/"));
        string agpcPath = path +"/one.constraint";

        ofstream fd;
        agpcPath = dealWithSPChar(agpcPath);
        fd.open(agpcPath,ios::out);
        fd<<expStr<<"\n";
        fd<<typeStr<<"\n";
        fd<<nameStr<<"\n";
        fd.close();

        clock_t start = clock();

        string agpcShell = "java -jar "+this->solverPath + " ";
        agpcShell = agpcShell + agpcPath;

        FILE *pp = popen(agpcShell.c_str(), "r"); //建立管道
        if (!pp)
            this->setResType(-1);

        string agpcRes = "";
        char tmp[20]; //设置一个合适的长度，以存储每一行输出
        int countReadFromShell = 5;
        for(int i=0;i<countReadFromShell;i++)
        {
            if(fgets(tmp, sizeof(tmp), pp)!=NULL)
            {
                if (tmp[strlen(tmp) - 1] == '\n')
                    tmp[strlen(tmp) - 1] = '\0'; //去除换行符
                agpcRes = agpcRes + tmp;
            }else
                break;
        }
        int rc = pclose(pp); //关闭管道
        if(-1 == rc)
        {
            perror("关闭文件指针失败");
            this->setResType(-1);
        }

        if(agpcRes=="SUCC")
            cout<<"ATPC Work Well"<<endl;
        else
        {
             cout<<"ATPC Failed"<<endl;
             exit(-1);
        }


        string cudaPath = path.substr(0,path.find_last_of("/")) + "/CUDA/LFFSolver/Debug";
        string resPath = path + "/PLFFSolver.result";
        int status;
        pid_t ret = fork();
        if (ret<0)
            cout<<" process created failed!\n";
        else if (ret==0)
        {
            //第一个参数是命令，第二个参数是main函数的参数
            string cmd = cudaPath + "/run.sh";
            execl(cmd.c_str(),NULL,NULL);
            exit(0);
        }else
        {
             waitpid(ret,&status,0);
        }

        ret = fork();
        if (ret<0)
            cout<<" process created failed!\n";
        else if (ret==0)
        {
            //第一个参数是命令，第二个参数是main函数的参数
            string cmd = cudaPath + "/LFFSolver";
            execl(cmd.c_str(),resPath.c_str(),NULL);
            exit(0);
        }
        waitpid(ret,&status,0);
        //cout<<"in the parent process"<<getpid()<<" now!\n";

        ifstream resFd(resPath);
        string t;
        while(getline(resFd,t))
            this->solverRes += t;

        cout<<this->solverRes<<endl;

        clock_t finish = clock();
        shellTime = (double)(finish - start) / CLOCKS_PER_SEC;
    }




    /*
        处理求解其返回的结果
    */
    void Solver::dealWithResStr(string solverReturnRes)
    {
        string delim = "@";
        vector<string> resTmp = split(solverReturnRes,delim);
        if( isVaild(solverReturnRes) && resTmp.size()==3)
        {
            //处理求解结果,1表示有解,0表示无解,-1表示状态不正确;2表示确认无解
            if(resTmp[0] == "1")
                this->setResType(1);
            else  if(resTmp[0] == "0")
                this->setResType(0);
            else if(resTmp[0] == "2")
                this->setResType(2);
            else
                this->setResType(-1);

            if(this->getResType()==2)
            {
                this->solutionVec.push_back(resTmp[2]);
            }else
            {
                //处理覆盖率,有解的覆盖率是1,其余的小于1
                this->setCoverage( atof(resTmp[1].c_str()) );

                //处理求出的解,这里之所以不做任何的处理,是因为我们要在链接Kleefp的时候
                //还要做类似的处理,所以这里就同意留在后面处理
                vector<string>  tt = split(resTmp[2],",");
                for(int i=0;i<(int)tt.size();i++)
                    this->solutionVec.push_back(tt[i]);
            }

        }else
        {
            this->setResType(-1);
            this->setCoverage(-1);
            cerr<<"*** ERROR *** In Function:void Solver::dealWithResStr()  ";
            cerr<<"LFF Solver May Printf Something Wrong "<<endl;
        }
    }


    //分割字符串
    vector<string> Solver::split(string str, string delim)
    {
        vector<string> res;

        const char* strSC = str.c_str();
        char* strC = new char[strlen(strSC)+1];
        strcpy(strC,strSC);

        const char* delimSC = delim.c_str();
        char* delimC = new char[strlen(delimSC)+1];
        strcpy(delimC,delimSC);

        char* arrayChar = strtok(strC,delimC);

        while(arrayChar!=NULL)
        {
            string tmp(arrayChar);
            res.push_back(tmp);
            arrayChar = strtok(NULL,delimC);
        }
        return res;
    }

    /*
        这个是处理LFF Solver出现意外的情况专门处理
    */
    bool Solver::isVaild(string oneStr)
    {
        if(oneStr.length() <= 0)
            return true;
        for(int i=0;i<(int)oneStr.length();i++)
        {
            //char one = oneStr[i];
            //if( (one>='a' && one<='z') || (one>='A' && one<='Z'))
                //return false;
        }
        return true;
    }

    /*
        打印函数
    */
    void Solver::printInfo()
    {
        cout<<"Solver Path: "<<this->solverPath<<endl;
        cout<<"Res:     "<<this->solverRes<<endl;
        cout<<"resType: "<<this->resType<<endl;
        cout<<"Coverage: "<<this->coverage<<endl;
        cout<<"solutionVec:  ";
        for(int i=0;i<(int)this->solutionVec.size();i++)
        {
            cout<<this->solutionVec[i]<<"  ";
        }
        cout<<endl;
    }




