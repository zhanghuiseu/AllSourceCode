
#ifndef _LFF_SOLVER_CACHE_H
#define _LFF_SOLVER_CACHE_H

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

using namespace std;

/*
 * Add By zhanghui 20181109
 *这个是测试报告输出的相关属性，这里做了一个打包整理，便于编码和解编码
 *
*/
class CacheData
{
public:
	string kqueryInfo;
	string solverpath;
	string type;
	string name;
	string constraint;
	string resType;
	string coverage;
	string solverRes;
	string LFFTotalTime;
	string Z3Res;
	string Z3TotalTime;

	string key;
	string value;

	//构造函数
	CacheData(string kqueryInfo) 
	{
		this->kqueryInfo = removeSpace(string(kqueryInfo));
		this->solverpath = "";
		this->type = "";
		this->name = "";
		this->constraint = "";

		this->resType = "";
		this->coverage = "";
		this->solverRes = "";
		this->LFFTotalTime = "";
		this->Z3Res = "";
		this->Z3TotalTime = "";

		this->key = calaKey();
		this->value = "";;
	}

	//这个构造函数用来编码
	void encode(string kqueryInfo, string solverpath, 
		char* type, char* name, char* constraint, 
		int resType, double coverage, char* solverRes, 
		double LFFTotalTime, bool Z3Res, double Z3TotalTime) 
	{
		this->kqueryInfo = removeSpace(string(kqueryInfo));
		this->solverpath = removeSpace(string(solverpath));
		this->type = removeSpace(string(type));
		this->name = removeSpace(string(name));
		this->constraint = removeSpace(string(constraint));

		this->resType = removeSpace(to_string(resType));
		this->coverage = removeSpace(to_string(coverage));
		this->solverRes = removeSpace(string(solverRes));

		//注意这里把Z3时间和LFF时间加到一起了
		this->LFFTotalTime = removeSpace(to_string(LFFTotalTime+Z3TotalTime));

		this->Z3Res = removeSpace(to_string(Z3Res));
		this->Z3TotalTime = removeSpace(to_string(Z3TotalTime));

		this->key = calaKey();
		this->value = calaValue();
	}

	//编码函数,计算map映射的Key值
	string calaKey()
	{
		string res = "";
		for(char c 	: this->kqueryInfo)
		{
			if(c == ' ' || c == '\t' || c == '\n')
				continue;
			else
				res+=c;
		}
		return res;
	}

	//编码函数,计算map映射的value值
	string calaValue()
	{
		string delim = "$";;
		string res = "";
		res = res 
			  + this->kqueryInfo + delim
			  + this->solverpath + delim
			  + this->type + delim
			  + this->name + delim
			  + this->constraint + delim
			  
			  + this->resType + delim
			  + this->coverage + delim
			  + this->solverRes + delim
			  + this->LFFTotalTime + delim
			  + this->Z3Res + delim
			  + this->Z3TotalTime;
		return res;
	}


	//解编码,根据value值还原相关打包属性值
	void decode(string value)
	{
		string delim = "$";
		vector<string> all = split(value,delim);
		if(all.size() < 11)
		{
			cout<<"******************* void decode(string value) *******************"<<endl;
			return ;
		}

		this->kqueryInfo = all[0];
		this->solverpath = all[1];
		this->type = all[2];
		this->name = all[3];
		this->constraint = all[4];

		this->resType = all[5];
		this->coverage = all[6];
		this->solverRes = all[7];
		this->LFFTotalTime = all[8];
		this->Z3Res = all[9];
		this->Z3TotalTime = all[10];

		this->key = calaKey();
		this->value = value;

	}

	//解编码，按照delim符号分割value字符串
	vector<string> split(string value ,string delim)
	{
		vector<string> all;
		int index=0;
		auto pos = value.find_first_of(delim,index);
		while(pos != value.npos)
		{
			all.push_back(value.substr(index,pos-index));
			index = pos + delim.length();
			pos = value.find_first_of(delim,index);
		}
		all.push_back(value.substr(index));
		return all;
	}


	//去除字符串所有的空格和换行符,这样便于编码
	string removeSpace(string s)
	{
		string res = "";
		for(char c : s)
		{
			if(c == '\n' || c == '\t')
			{
				if(res.length() > 0 && res.back() == ' ')
					continue;
				else
					c += ' ';
			}
			else if(c == ' ' && res.length() > 0 && res.back() == ' ')
				continue;
			else
				res += c;
		}
		return res;
	}
};


#endif //_LFF_SOLVER_CACHE_H
