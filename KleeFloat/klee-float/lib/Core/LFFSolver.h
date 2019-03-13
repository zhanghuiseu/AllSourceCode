
#ifndef _LFF_SOLVER_H
#define _LFF_SOLVER_H

#include <iostream>
#include <string>
#include <set>
#include <map>
#include <vector>
#include <algorithm>
#include <sstream>
#include <fstream>
#include <ctime>
#include <unistd.h>

#include "LFFSolverCache.h"

using namespace std;

/*%%%%%%%%%%%%%%%%%%%  Begin add by zhanghui 20181110 %%%%%%%%%%%%%%%%%%%%%%%%*/
//注意这个模块只能使用C++03标准编写，不可以使用C++11，所以这里要注意编码方式
#ifdef __cplusplus
extern "C" {
#endif
/*
    LFF Solver & PLFF Solver的接口
    const char* kqueryChar:kquery的待解析的约束
    const char* solverPath:solver的位置
    char* &symbolicType,解析出来的运算符类型
    char* &symbolicName:解析出来的运算符列表
    char* &symbolicFinalConstraint：解析出来的约束列表
    bool &isVaild:约束的vaild
    int &resType:返回类型 处理求解结果,1表示有解,0表示无解,-1表示状态不正确
    double &coverage:覆盖率
    char* &solverRes:solver的结果
*/
    bool beginParserAndSolver(const char* kqueryChar,const char* solverPathChar,
                               char* &symbolicType,
                               char* &symbolicName,
                               char* &symbolicFinalConstraint,
                               bool &isVaild,int &resType,double &coverage,char* &solverRes );
    bool beginParserAndPLFFSolver(const char* kqueryChar,const char* solverPathChar,
                               char* &symbolicType,
                               char* &symbolicName,
                               char* &symbolicFinalConstraint,
                               bool &isVaild,int &resType,double &coverage,char* &solverRes );  

/*
    Inverse Input Interval Based on Output Interval的接口
    const char* kqueryChar:kquery的待解析的约束
    const char* solverPath:solver的位置
    char* &symbolicType,解析出来的运算符类型
    char* &symbolicName:解析出来的运算符列表
    char* &symbolicFinalConstraint：解析出来的约束列表
    bool &isVaild:约束的vaild
    int &resType:返回类型 处理求解结果,1表示有解,0表示无解,-1表示状态不正确
    double &coverage:覆盖率
    char* &solverRes:solver的结果

*/
    bool beginParserAndInverseIIBasedOI(const char* kqueryChar,const char* solverPathChar,
                                   char* &symbolicType,
                                   char* &symbolicName,
                                   char* &symbolicFinalConstraint,
                                   bool &isVaild,int &resType,double &coverage,char* &solverRes
                                   );                 
#ifdef __cplusplus
}
#endif



class CacheFlag1
{
public:
  //是否使用求解器缓存，true表示使用,false表示不使用，
  static bool useSolverCache;
  //在使用求解器缓存的时候，false表示第一次去做初始化，否则直接使用map查询
  static bool isNowCached;
  //求解器结果的缓存,注意这里使用的是hash map
  static map<string,string> dataCache_map;
};

static double stod(string s)
{
  stringstream ss(s);
  double d;
  ss>>d;
  ss.clear();
  return d;
}


/*是否使用求解器缓存，true表示使用,false表示不使用，
*/
static bool initSolverCache(string solverType)
{
  //如果已经初始化，那么不在读取文件缓存
  if(CacheFlag1::isNowCached == true)
  	return true;

  ifstream cacheFd;
  string path = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/lib/Core/Cache/";

  //因为C++11之后的open函数才支持string，之前的只支持char*字符串，所以要这么写
  if(solverType == "LFF" || solverType == "IIP")
    path = path + "LFFSolver.cache";
  else if(solverType == "PLFF")
    path = path + "PLFFSolver.cache";
  cacheFd.open(path.c_str());

  string delim = "$";
  string line;
  while(getline(cacheFd,line))
  {
  	int pos = line.find_first_of(delim,0);
  	if(pos == line.npos)
  		continue;
  	string key = line.substr(0,pos);
  	string value = line.substr(pos+delim.length());
  	line = "";
  	CacheFlag1::dataCache_map[key]=value;
  }
  
  //设置已经做过文件缓存初始化流程
  CacheFlag1::isNowCached = true;
  cacheFd.close();
  return true;
}

//添加数据cache到文件缓存
static bool addOneCache(string solverType,string key,string value)
{
  ofstream cacheFd;
  string path = "/home/zy/KleeFloat/KLEE-FLOAT/klee-float/lib/Core/Cache/";

  //因为C++11之后的open函数才支持string，之前的只支持char*字符串，所以要这么写
  if(solverType == "LFF")
    path = path+"LFFSolver.cache"; 
  else if(solverType == "PLFF")
    path = path + "PLFFSolver.cache";
  cacheFd.open(path.c_str(),ios::app);
 
  string delim = "$";
  string line = key + delim + value;
  cacheFd<<line<<endl;

  cacheFd.close();
  return true;
}


//LFF Solver处理
static bool dealWithLFFSolver(string kqueryInfo, string& finalSolverRes)
{
  clock_t start,end;
  bool LFFRes = false;
  double LFFTotalTime=0.0;
  stringstream ss;
  
  //LFF Parser And Solver
  string solverpath="/home/zy/KleeFloat/LFFSolver/LFFSolver.jar";
  char* type = NULL;
  char* name = NULL;
  char* constraint = NULL;
  bool isValid;
  int resType;
  double coverage;
  char* solverRes=NULL;

  bool findDataCache = false;
  CacheData1* cacheData1 = NULL;
  if(CacheFlag1::useSolverCache == true)
  {
    cacheData1 = new CacheData1(kqueryInfo);
    if(CacheFlag1::dataCache_map.find(cacheData1->key) != CacheFlag1::dataCache_map.end())
    	findDataCache = true;
  }
  
  //直接获取缓存的value
  if(findDataCache == true)
  {
  	cacheData1->decode(CacheFlag1::dataCache_map[cacheData1->key]);

    //1秒(s) = 1000 毫秒(ms) = 1,000,000 微秒(μs)
    double sleepTime = 1000000*stod(cacheData1->LFFTotalTime);
    usleep((int)sleepTime);
  }else
  {
  	start = clock();
    LFFRes = beginParserAndSolver(kqueryInfo.c_str(),solverpath.c_str(),type,name,constraint,isValid,resType,coverage,solverRes);
    end = clock();
    LFFTotalTime = (double)(end-start)/CLOCKS_PER_SEC;
    sleep(2);

    //根据求解结果存入到缓存文件和map映射
    cacheData1->encode(kqueryInfo,solverpath, 
		              type, name, constraint, 
					  resType, coverage, solverRes, 
					  LFFTotalTime);
    CacheFlag1::dataCache_map[cacheData1->key] = cacheData1->value;
    addOneCache("LFF", cacheData1->key, cacheData1->value);
  }
  
  ss<<"KQuery Constraint : "<<cacheData1->kqueryInfo<<"\n";
  ss<<"SolverPath : "<<cacheData1->solverpath<<"\n";
  ss<<"Type : "<<cacheData1->type<<"\n";
  ss<<"Name : "<<cacheData1->name<<"\n";
  ss<<"Constraint : "<<cacheData1->constraint<<"\n";
  ss<<"ResType : "<<cacheData1->resType<<"\n";
  ss<<"Coverage : "<<cacheData1->coverage<<"\n";
  ss<<"SolverRes : "<<cacheData1->solverRes<<"\n";
  ss<<"LFFTotalTime : "<<cacheData1->LFFTotalTime<<"\n";
  finalSolverRes = ss.str();

  ss.clear();
  delete [] type;
  delete [] name;
  delete [] constraint;
  delete [] solverRes;
  if(cacheData1 != NULL)
  	delete cacheData1;

  return true;
}

//PLFF Solver处理
static bool dealWithPLFFSolver(string kqueryInfo, string& finalSolverRes)
{
  clock_t start,end;
  bool PLFFRes = false;
  double PLFFTotalTime=0.0;
  stringstream ss;

  //PLFF Parser And Solver
  string solverpath = "/home/zy/cudaWorkspaceServer/JavaJar/AGPC.jar";
  char* type = NULL;
  char* name = NULL;
  char* constraint = NULL;
  bool isValid;
  int resType;
  double coverage;
  char* solverRes=NULL;

  bool findDataCache = false;
  CacheData1* cacheData1 = NULL;
  if(CacheFlag1::useSolverCache == true)
  {
    cacheData1 = new CacheData1(kqueryInfo);
    if(CacheFlag1::dataCache_map.find(cacheData1->key) != CacheFlag1::dataCache_map.end())
    	findDataCache = true;
  }

  //直接获取缓存的value
  if(findDataCache == true)
  {
  	cacheData1->decode(CacheFlag1::dataCache_map[cacheData1->key]);

    //1秒(s) = 1000 毫秒(ms) = 1,000,000 微秒(μs)
    double sleepTime = 1000000*stod(cacheData1->LFFTotalTime);
    usleep((int)sleepTime);
  }else
  {
  	start = clock();
  	PLFFRes = beginParserAndPLFFSolver(kqueryInfo.c_str(),solverpath.c_str(),type,name,constraint,isValid,resType,coverage,solverRes);
  	end = clock();
  	PLFFTotalTime = (double)(end-start)/CLOCKS_PER_SEC;

    //根据求解结果存入到缓存文件和map映射
    cacheData1->encode(kqueryInfo,solverpath, 
		              type, name, constraint, 
					  resType, coverage, solverRes, 
					  PLFFTotalTime);
    CacheFlag1::dataCache_map[cacheData1->key] = cacheData1->value;
    addOneCache("PLFF", cacheData1->key, cacheData1->value);
  }

  ss<<"KQuery Constraint : "<<cacheData1->kqueryInfo<<"\n";
  ss<<"SolverPath : "<<cacheData1->solverpath<<"\n";
  ss<<"Type : "<<cacheData1->type<<"\n";
  ss<<"Name : "<<cacheData1->name<<"\n";
  ss<<"Constraint : "<<cacheData1->constraint<<"\n";
  ss<<"ResType : "<<cacheData1->resType<<"\n";
  ss<<"Coverage : "<<cacheData1->coverage<<"\n";
  ss<<"SolverRes : "<<cacheData1->solverRes<<"\n";
  ss<<"PLFFTotalTime : "<<cacheData1->LFFTotalTime<<"\n";  
  finalSolverRes = ss.str();

  ss.clear();
  delete [] type;
  delete [] name;
  delete [] constraint;
  delete [] solverRes;
  if(cacheData1 != NULL)
  	delete cacheData1;

  return true;
}


//IIP Solver处理
static bool dealWithIIPSolver(string kqueryInfo, string& finalSolverRes)
{
  clock_t start,end;
  bool IIPRes = false;
  double IIPTotalTime=0.0;
  stringstream ss;
  
  //IIP Parser And Solver
  string solverpath="/home/zy/KleeFloat/LFFSolver/LFFSolver.jar";
  char* type = NULL;
  char* name = NULL;
  char* constraint = NULL;
  bool isValid;
  int resType;
  double coverage;
  char* solverRes=NULL;

  bool findDataCache = false;
  CacheData1* cacheData1 = NULL;
  if(CacheFlag1::useSolverCache == true)
  {
    cacheData1 = new CacheData1(kqueryInfo);
    if(CacheFlag1::dataCache_map.find(cacheData1->key+"IIP") != CacheFlag1::dataCache_map.end())
      findDataCache = true;
  }
  
  //直接获取缓存的value
  if(findDataCache == true)
  {
    cacheData1->decode(CacheFlag1::dataCache_map[cacheData1->key+"IIP"]);

    //1秒(s) = 1000 毫秒(ms) = 1,000,000 微秒(μs)
    double sleepTime = 1000000*stod(cacheData1->LFFTotalTime);
    usleep((int)sleepTime);
  }else
  {
    start = clock();
    IIPRes = beginParserAndInverseIIBasedOI(kqueryInfo.c_str(),solverpath.c_str(),type,name,constraint,isValid,resType,coverage,solverRes);
    end = clock();
    IIPTotalTime = (double)(end-start)/CLOCKS_PER_SEC;
    sleep(2);

    //根据求解结果存入到缓存文件和map映射
    cacheData1->encode(kqueryInfo,solverpath, 
                  type, name, constraint, 
            resType, coverage, solverRes, 
            IIPTotalTime);
    CacheFlag1::dataCache_map[cacheData1->key+"IIP"] = cacheData1->value;
    addOneCache("LFF", cacheData1->key+"IIP", cacheData1->value);
  }
  
  ss<<"KQuery Constraint : "<<cacheData1->kqueryInfo<<"\n";
  ss<<"SolverPath : "<<cacheData1->solverpath<<"\n";
  ss<<"Type : "<<cacheData1->type<<"\n";
  ss<<"Name : "<<cacheData1->name<<"\n";
  ss<<"Constraint : "<<cacheData1->constraint<<"\n";
  ss<<"ResType : "<<cacheData1->resType<<"\n";
  string iipCouverge = (cacheData1->solverRes.find("FAIL") != cacheData1->solverRes.npos ? "0.0" : "1.0");
  ss<<"Coverage : "<<iipCouverge<<"\n";
  ss<<"SolverRes : "<<cacheData1->solverRes<<"\n";
  ss<<"IIPTotalTime : "<<cacheData1->LFFTotalTime<<"\n";
  finalSolverRes = ss.str();

  ss.clear();
  delete [] type;
  delete [] name;
  delete [] constraint;
  delete [] solverRes;
  if(cacheData1 != NULL)
    delete cacheData1;

  return true;
}


//LFF Solver或者PLFF Solver的求解处理
static bool calaSolver(string solverType, string kqueryInfo, string& finalSolverRes)
{
  if(CacheFlag1::useSolverCache == true)
  	initSolverCache(solverType);

  if(solverType == "LFF")
  {
  	return dealWithLFFSolver(kqueryInfo, finalSolverRes);
  } else if(solverType == "PLFF")
  {
  	return dealWithPLFFSolver(kqueryInfo, finalSolverRes);
  } else if(solverType == "IIP")
  {
    return dealWithIIPSolver(kqueryInfo, finalSolverRes);
  }
  else
    return true;
}


/*%%%%%%%%%%%%%%%%%%%  End add by zhanghui 20181110 %%%%%%%%%%%%%%%%%%%%%%%%*/

#endif //_LFF_SOLVER_H