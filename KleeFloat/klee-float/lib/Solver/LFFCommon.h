
#ifndef _LFF_COMMON_H
#define _LFF_COMMON_H

#include <iostream>
#include <string>
#include <set>
#include <unordered_set>
#include <map>
#include <unordered_map>
#include <vector>
#include <algorithm>
#include <sstream>
#include <fstream>
#include <ctime>
#include <unistd.h>
#include <Python.h>

#include "LFFBuilder.h"
#include "PLFFBuilder.h"
#include "InverseIIBasedOIBuilder.h"
#include "LFFSolverCache.h"
#define NameLen 6

//结果输出的文件标号
static long long pathIndex = 0;

using namespace std;
/*%%%%%%%%%%%%%%%%%%%  Begin add by zhanghui 20181026 %%%%%%%%%%%%%%%%%%%%%%%%*/

class CacheFlag
{
public:
  //是否使用求解器缓存，true表示使用,false表示不使用，
  static bool useSolverCache;
  //在使用求解器缓存的时候，false表示第一次去做初始化，否则直接使用map查询
  static bool isNowCached;
  //求解器结果的缓存,注意这里使用的是hash map
  static unordered_map<string,string> dataCache_map;
};


/*
//这个类是用到的部分公共函数:

//获取文件名字
static string getFileName(long long index);

//下面是处理Z3的结果
static string getZ3VarType(string name);

//获取Z3处理的结果数据
static string getZ3VarData(string type,vector<unsigned char>& data);


1. 下面是把求解器的求解过程放到bool Z3SolverImpl::internalRunSolver这里后添加的LFF和PLFF的处理函数；
2. 这里还有Z3的一些痕迹，可能还需要去掉 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//LFF Solver处理
static bool dealWithLFFSolver(string kqueryInfo,double Z3TotalTime);

//PLFF Solver处理
static bool dealWithPLFFSolver(string kqueryInfo,double Z3TotalTime);

//LFF Solver或者PLFF Solver的求解处理
static bool calaSolver(string solverType,string kqueryInfo,double Z3TotalTime)
*/

//获取文件名字
static string getFileName(long long index)
{
  string res = to_string(index);
  int size = NameLen-res.length();
  for(int i=0; i<size; i++)
    res = "0"+res;
  res = "output" + res + ".result";
  return res;
}

//下面是处理Z3的结果
static string getZ3VarType(string name)
{
  string res = "";
  string type = name.substr(0,name.find_first_of('_'));
  if(type == "INT")
      res = "int";
  else if(type == "UINT")
      res = "unsigned int";
  else if(type == "FLOAT")
      res = "float";
  else if(type == "DOUBLE")
      res = "double";
  else
      res = "";
  return res;
}

//获取Z3处理的结果数据
static string getZ3VarData(string type,vector<unsigned char> data)
{
  string res = "";
  void* ptr = (void*)(&(data[0]));
  if(type == "INT" && data.size()%4 == 0)
  {
      int* pp=(int*)(ptr);
      res = to_string(*pp);
  }else if(type == "UINT" && data.size()%4 == 0)
  {
      unsigned int* pp=(unsigned int*)(ptr);
      res = to_string(*pp);
  }else if(type == "FLOAT" && data.size()%4 == 0)
  {
      float* pp=(float*)(ptr);
      res = to_string(*pp);
  }
  else if(type == "DOUBLE" && data.size()%4 == 0)
  {
      double* pp=(double*)(ptr);
      res = to_string(*pp);
  }else
  {
    //int* pp=(int*)(ptr);
    //res = to_string(*pp); 
    res = "LFFCommon.h: static string getZ3VarData(string type,vector<unsigned char>& data) Warning:Wrong Cala Type ";
    res += "Name Rules Wrong!!!!";
  }
  return res;
}


/*
//是否使用求解器缓存，true表示使用,false表示不使用，
static bool useSolverCache = true;
//在使用求解器缓存的时候，false表示第一次去做初始化，否则直接使用map查询
static bool isNowCached = false;
//求解器结果的缓存
static unordered_map<string,string> dataCache_map = unordered_map<string,string>();
读取文件缓存并初始化map，使用isNowCached来确定只初始化一次
*/
static bool initSolverCache(string solverType)
{
  //如果已经初始化，那么不在读取文件缓存
  if(CacheFlag::isNowCached == true)
  	return true;

  ifstream cacheFd;
  string path = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/lib/Solver/Cache/";

  if(solverType == "LFF" || solverType == "IIP")
  	cacheFd.open(path+"LFFSolver.cache");
  else if(solverType == "PLFF")
  	cacheFd.open(path+"PLFFSolver.cache");
 
  string delim = "$";
  string line;
  while(getline(cacheFd,line))
  {
  	auto pos = line.find_first_of(delim,0);
  	if(pos == line.npos)
  		continue;
  	string key = line.substr(0,pos);
  	string value = line.substr(pos+delim.length());
  	line = "";
  	CacheFlag::dataCache_map[key]=value;
  }

  //设置已经做过文件缓存初始化流程
  CacheFlag::isNowCached = true;
  cacheFd.close();
  return true;
}

//添加数据cache到文件缓存
static bool addOneCache(string solverType,string key,string value)
{
  ofstream cacheFd;
  string path = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/lib/Solver/Cache/";

  if(solverType == "LFF")
  	cacheFd.open(path+"LFFSolver.cache",ios::app);
  else if(solverType == "PLFF")
  	cacheFd.open(path+"PLFFSolver.cache",ios::app);
 
  string delim = "$";
  string line = key + delim + value;
  cacheFd<<line<<endl;

  cacheFd.close();
  return true;
}


//LFF Solver处理
static bool dealWithLFFSolver(string kqueryInfo, double Z3TotalTime)
{
  cout<<"************   Begin In KQuery Parser And LFF Solver   ************"<<endl;
  clock_t start,end;
  bool Z3Res = true , LFFRes = false;
  double LFFTotalTime=0.0;
  stringstream ss;
  
  //LFF Parser And Solver
  ofstream fd;  
  string filePath = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/examples/AllResult/LFFSolverRes/" + getFileName(pathIndex);
  pathIndex += 1;
  fd.open(filePath,ios::out);

  string solverpath="/home/zy/KleeFloat/LFFSolver/LFFSolver.jar";
  char* type = NULL;
  char* name = NULL;
  char* constraint = NULL;
  bool isValid;
  int resType;
  double coverage;
  char* solverRes=NULL;

  bool findDataCache = false;
  CacheData* cacheData = NULL;
  if(CacheFlag::useSolverCache == true)
  {
    cacheData = new CacheData(kqueryInfo);
    if(CacheFlag::dataCache_map.find(cacheData->key) != CacheFlag::dataCache_map.end())
    	findDataCache = true;
  }
  
  //直接获取缓存的value
  if(findDataCache == true)
  {
  	cacheData->decode(CacheFlag::dataCache_map[cacheData->key]);

    //1秒(s) = 1000 毫秒(ms) = 1,000,000 微秒(μs)
    double sleepTime = 1000000*stod(cacheData->LFFTotalTime);
    usleep((int)sleepTime);
  }else
  {
  	start = clock();
    LFFRes = beginParserAndSolver(kqueryInfo.c_str(),solverpath.c_str(),type,name,constraint,isValid,resType,coverage,solverRes);
    end = clock();
    LFFTotalTime = (double)(end-start)/CLOCKS_PER_SEC;
    sleep(2);

    //根据求解结果存入到缓存文件和map映射
    cacheData->encode(kqueryInfo,solverpath, 
		              type, name, constraint, 
					  resType, coverage, solverRes, 
					  LFFTotalTime, Z3Res, Z3TotalTime);
    CacheFlag::dataCache_map[cacheData->key] = cacheData->value;
    addOneCache("LFF", cacheData->key, cacheData->value);
  }
  ss<<"KQuery Constraint : "<<cacheData->kqueryInfo<<"\n";
  ss<<"SolverPath : "<<cacheData->solverpath<<"\n";
  ss<<"Type : "<<cacheData->type<<"\n";
  ss<<"Name : "<<cacheData->name<<"\n";
  ss<<"Constraint : "<<cacheData->constraint<<"\n";
  ss<<"ResType : "<<cacheData->resType<<"\n";
  ss<<"Coverage : "<<cacheData->coverage<<"\n";
  ss<<"SolverRes : "<<cacheData->solverRes<<"\n";
  ss<<"LFFTotalTime : "<<cacheData->LFFTotalTime<<"\n";
  fd<<ss.str()<<endl;
  cout<<ss.str();
  ss.clear();
  fd.close();
  delete [] type;
  delete [] name;
  delete [] constraint;
  delete [] solverRes;
  if(cacheData != NULL)
  	delete cacheData;
  cout<<"************    End In KQuery Parser And LFF Solver    ************"<<endl<<endl<<endl;
  return true;
}

//PLFF Solver处理
static bool dealWithPLFFSolver(string kqueryInfo,double Z3TotalTime)
{
  cout<<"************   Begin In KQuery Parser And PLFF Solver  ************"<<endl;
  clock_t start,end;
  bool Z3Res = true , PLFFRes = false;
  double PLFFTotalTime=0.0;
  stringstream ss;

  //PLFF Parser And Solver
  ofstream fd;  
  string filePath = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/examples/AllResult/PLFFSolverRes/" + getFileName(pathIndex);
  pathIndex += 1;
  fd.open(filePath,ios::out);

  string solverpath = "/home/zy/cudaWorkspaceServer/JavaJar/AGPC.jar";
  char* type = NULL;
  char* name = NULL;
  char* constraint = NULL;
  bool isValid;
  int resType;
  double coverage;
  char* solverRes=NULL;

  bool findDataCache = false;
  CacheData* cacheData = NULL;
  if(CacheFlag::useSolverCache == true)
  {
    cacheData = new CacheData(kqueryInfo);
    if(CacheFlag::dataCache_map.find(cacheData->key) != CacheFlag::dataCache_map.end())
    	findDataCache = true;
  }

  //直接获取缓存的value
  if(findDataCache == true)
  {
  	cacheData->decode(CacheFlag::dataCache_map[cacheData->key]);

    //1秒(s) = 1000 毫秒(ms) = 1,000,000 微秒(μs)
    double sleepTime = 1000000*stod(cacheData->LFFTotalTime);
    usleep((int)sleepTime);
  }else
  {
  	start = clock();
  	PLFFRes = beginParserAndPLFFSolver(kqueryInfo.c_str(),solverpath.c_str(),type,name,constraint,isValid,resType,coverage,solverRes);
  	end = clock();
  	PLFFTotalTime = (double)(end-start)/CLOCKS_PER_SEC;

    //根据求解结果存入到缓存文件和map映射
    cacheData->encode(kqueryInfo,solverpath, 
		              type, name, constraint, 
					  resType, coverage, solverRes, 
					  PLFFTotalTime, Z3Res, Z3TotalTime);
    CacheFlag::dataCache_map[cacheData->key] = cacheData->value;
    addOneCache("PLFF", cacheData->key, cacheData->value);
  }

  ss<<"KQuery Constraint : "<<cacheData->kqueryInfo<<"\n";
  ss<<"SolverPath : "<<cacheData->solverpath<<"\n";
  ss<<"Type : "<<cacheData->type<<"\n";
  ss<<"Name : "<<cacheData->name<<"\n";
  ss<<"Constraint : "<<cacheData->constraint<<"\n";
  ss<<"ResType : "<<cacheData->resType<<"\n";
  ss<<"Coverage : "<<cacheData->coverage<<"\n";
  ss<<"SolverRes : "<<cacheData->solverRes<<"\n";
  ss<<"PLFFTotalTime : "<<cacheData->LFFTotalTime<<"\n";
  fd<<ss.str()<<endl;
  cout<<ss.str();

  ss.clear();
  fd.close();
  delete [] type;
  delete [] name;
  delete [] constraint;
  delete [] solverRes;
  if(cacheData != NULL)
  	delete cacheData;

  cout<<"************    End In KQuery Parser And PLFF Solver   ************"<<endl<<endl<<endl;
  return true;
}


//IIP Solver处理
static bool dealWithIIPSolver(string kqueryInfo, double Z3TotalTime)
{
  cout<<"************   Begin In KQuery Parser And IIP Solver   ************"<<endl;
  clock_t start,end;
  bool Z3Res = true , IIPRes = false;
  double IIPTotalTime=0.0;
  stringstream ss;
  
  //IIP Parser And Solver
  ofstream fd;  
  string filePath = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/examples/AllResult/IIPSolverRes/" + getFileName(pathIndex);
  pathIndex += 1;
  fd.open(filePath,ios::out);

  string solverpath="/home/zy/KleeFloat/LFFSolver/LFFSolver.jar";
  char* type = NULL;
  char* name = NULL;
  char* constraint = NULL;
  bool isValid;
  int resType;
  double coverage;
  char* solverRes=NULL;

  bool findDataCache = false;
  CacheData* cacheData = NULL;
  if(CacheFlag::useSolverCache == true)
  {
    cacheData = new CacheData(kqueryInfo);
    if(CacheFlag::dataCache_map.find(cacheData->key+"IIP") != CacheFlag::dataCache_map.end())
      findDataCache = true;
  }
  
  //直接获取缓存的value
  if(findDataCache == true)
  {
    cacheData->decode(CacheFlag::dataCache_map[cacheData->key+"IIP"]);

    //1秒(s) = 1000 毫秒(ms) = 1,000,000 微秒(μs)
    double sleepTime = 1000000*stod(cacheData->LFFTotalTime);
    usleep((int)sleepTime);
  }else
  {
    start = clock();
    IIPRes = beginParserAndInverseIIBasedOI(kqueryInfo.c_str(),solverpath.c_str(),type,name,constraint,isValid,resType,coverage,solverRes);
    end = clock();
    IIPTotalTime = (double)(end-start)/CLOCKS_PER_SEC;
    sleep(2);

    //根据求解结果存入到缓存文件和map映射
    cacheData->encode(kqueryInfo,solverpath, 
                  type, name, constraint, 
            resType, coverage, solverRes, 
            IIPTotalTime, Z3Res, Z3TotalTime);
    CacheFlag::dataCache_map[cacheData->key+"IIP"] = cacheData->value;
    addOneCache("LFF", cacheData->key+"IIP", cacheData->value);

  }
  
  ss<<"KQuery Constraint : "<<cacheData->kqueryInfo<<"\n";
  ss<<"SolverPath : "<<cacheData->solverpath<<"\n";
  ss<<"Type : "<<cacheData->type<<"\n";
  ss<<"Name : "<<cacheData->name<<"\n";
  ss<<"Constraint : "<<cacheData->constraint<<"\n";
  ss<<"ResType : "<<cacheData->resType<<"\n";
  string iipCouverge = (cacheData->solverRes.find("FAIL") != cacheData->solverRes.npos ? "0.0" : "1.0");
  ss<<"Coverage : "<<iipCouverge<<"\n";
  ss<<"SolverRes : "<<cacheData->solverRes<<"\n";
  ss<<"IIPTotalTime : "<<cacheData->LFFTotalTime<<"\n";
  fd<<ss.str()<<endl;
  cout<<ss.str();

  ss.clear();
  fd.close();
  delete [] type;
  delete [] name;
  delete [] constraint;
  delete [] solverRes;
  if(cacheData != NULL)
    delete cacheData;

  cout<<"************    End In KQuery Parser And IIP Solver    ************"<<endl<<endl<<endl;
  return true;
}


//LFF Solver或者PLFF Solver的求解处理
static bool calaSolver(string solverType,string kqueryInfo,double Z3TotalTime)
{
  if(CacheFlag::useSolverCache == true)
  	initSolverCache(solverType);

  if(solverType == "LFF")
  {
  	return dealWithLFFSolver(kqueryInfo,Z3TotalTime);
  } else if(solverType == "PLFF")
  {
  	return dealWithPLFFSolver(kqueryInfo,Z3TotalTime);
  } else if(solverType == "IIP")
  {
    return dealWithIIPSolver(kqueryInfo,Z3TotalTime);
  }
  else
  {
    cout<<"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  Wrong Solver Choose %%%%%%%%%%%%%%%%%%%%%%%%%"<<endl;
    return false;
  }
}

#endif //_LFF_COMMON_H

/*  // handleSolverResult();
  string nameStr(name);
  string solverResStr(solverRes);
  string delim=",";
  vector<string> nameList = split(nameStr,delim);
  vector<string> resList = split(solverResStr,delim);
  vector<SymName*> symList;
  for(int i=0;i<nameList.size();i++)
  {
     SymName* one = new SymName(nameList[i],resList[i]);
     symList.push_back(one);
  }
  cout<<"handle result : "<<nameStr<<"     "<<solverResStr<<endl;
  if (hasSolution) 
  {
    values.reserve(objects.size());
    for (std::vector<const Array*>::const_iterator it = objects.begin(), ie = objects.end(); it != ie; ++it) 
   {
      const Array *array = *it;
      std::vector<unsigned char> data;
      data.reserve(array->size);

      for(int j=0;j < array->size;j++)
             data.push_back('0');
     for(int i=0;i<symList.size();i++)
     {
         SymName* one = symList[i];
         if(array->name == one->name)
         {
    unsigned char* point = one->finalRes;
    for(int j=0;j < one->width;j++)
                     data[one->index * one->width + j]  =(*(point+j));
         }
     }
      values.push_back(data);
    }
  }
  return hasSolution;
 */



/*%%%%%%%%%%%%%%%%%%%  End add by zhanghui 20181026 %%%%%%%%%%%%%%%%%%%%%%%%*/