


#ifndef _SYN_NAME_H
#define _SYN_NAME_H


#include <iostream>
#include <vector>
#include <string>
#include <sstream>
using namespace std;

class SymName
{

public:
	string name;   //变量的名字
	int index;    //下标，假如是数组的情况下表示数组偏移，不是数组的情况下是0
	bool isSigned; //是否是无符号数
	int width;
	unsigned char* finalRes;

	//分割字符串
    static vector<string> split(string str, string delim);


	/*
	   TYPE_Name  或者   UTYPE_Name
	   TYPE_ARRAY_K_Len1_Len2......_Lenk_Name_index
	   UTYPE_ARRAY_K_Len1_Len2......_Lenk_Name_index
	 */
	SymName(string name,string valueStr)
	{
		//处理
		string delim="_";
		vector<string> res = split(name,delim);
		if(res.size()==2)
		{
			this->name = name;
			this->index=0;
		}else if(res.size()>2 && res[1]=="ARRAY")
		{
			this->name = name.substr(0,name.length()-1-res[res.size()-1].length());
			stringstream ss;
			ss<<res[res.size()-1];
			ss>>this->index;
		}else
			cerr<<"***  ERROR *** struct SymName Encounter KQuery Name Not Obey Name Rules"<<endl;

		string typeStr="";
		if(res[0][0]=='U')
		{
			typeStr = res[0].substr(1,res[0].length());
			this->isSigned = false;
		}
		else
		{
			typeStr = res[0];
			this->isSigned = true;
		}

		this->finalRes = NULL;
		if(typeStr == "BOOL")
        {
			this->width = 1;
			stringstream ss;
			ss<<valueStr;
			bool* a = new bool;
			ss>>(*a);
			this->finalRes = (unsigned char*) a;
        }else if(typeStr == "CHAR")
        {
			this->width = sizeof(char);
			stringstream ss;
			ss<<valueStr;
			int a = 0;
			ss>>a;
			char* charA=new char;
			*charA = (char)a;
			this->finalRes =  (unsigned char*) charA;

        }else if(typeStr == "SHORTINT" || typeStr == "SHORT")
        {
			this->width = sizeof(short);
			stringstream ss;
			ss<<valueStr;
			short* a = new short;
			ss>>(*a);
			this->finalRes =  (unsigned char*) a;
        }else if(typeStr == "INT")
        {
			this->width = sizeof(int);
			stringstream ss;
			ss<<valueStr;
			int* a = new int;
			ss>>(*a);
			this->finalRes =  (unsigned char*) a;
        }else if(typeStr == "LONG" || typeStr == "LONGINT")
        {
			this->width = sizeof(long);
			stringstream ss;
			ss<<valueStr;
			long* a = new long;
			ss>>(*a);
			this->finalRes =  (unsigned char*) a;
        }else if(typeStr == "FLOAT")
        {
			this->width = sizeof(float);
			stringstream ss;
			ss<<valueStr;
			float* a = new float;
			ss>>(*a);
			this->finalRes =  (unsigned char*) a;
        }else if(typeStr == "DOUBLE")
        {
			this->width = sizeof(double);
			stringstream ss;
			ss<<valueStr;
			double* a = new double;
			ss>>(*a);
			this->finalRes =  (unsigned char*) a;
        }else if(typeStr == "LONGDOUBLE")
        {
			this->width = sizeof(long double);
			stringstream ss;
			ss<<valueStr;
			long double* a = new long double;
			ss>>(*a);
			this->finalRes =  (unsigned char*) a;
        }else 
			cerr<<"***  ERROR *** struct SymName Encounter KQuery Type Not Obey Name Rules"<<endl;
	}
};



/*
	分割字符串
*/
static vector<string> split(string str, string delim)
{
	vector<string> res;
	const char* strSC = str.c_str();
    char* strC = new char[strlen(strSC)];
    strcpy(strC,strSC);

    const char* delimSC = delim.c_str();
    char* delimC = new char[strlen(delimSC)];
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

#endif //_SYN_NAME_H


  
