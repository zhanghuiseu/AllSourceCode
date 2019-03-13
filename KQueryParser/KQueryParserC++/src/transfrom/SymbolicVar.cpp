#include <string>
#include <string.h>
#include <sstream>
#include <vector>
#include <stack>
#include <iostream>
#include "SymbolicVar.h"
using namespace std;

	/*
	 * 与C语言不同，Java里没有无符号（unsigned）整型。
	 * JAVA的8种基本类型（boolean，byte，short，char，int，long，float，double）都是有符号的。
	 * 与C语言不同，JAVA里的char类型，占2个字节，专为存放Unicode字符所设计；
	 * 与C语言不同，JAVA里的boolean只能赋值为true或false，不能直接赋值0或1；
	 * 与C语言不同，JAVA里的long类型，不是占4字节，而是占8字节。
	 * */

    SymbolicVar::SymbolicVar(string id)
    {
        //这个保存的是全部信息的name
        setFullName(id);

        string delim="_";
        vector<string> res = split(id,delim);
         /*
         for(int i=0;i<res.size();i++)
         {
             cout<<res[i]<<endl;
         }

         */

        dealWithName(res);
    }


    SymbolicVar::SymbolicVar(const SymbolicVar& a)
    {
        cerr<<"Warning!!! Copy Constractor: SymbolicVar(const SymbolicVar& a) in SymbolicVar.cpp "<<endl;
    }

    /*
        析构函数, 主要是清空所有的vector
    */
    SymbolicVar::~SymbolicVar()
    {
        this->name.clear();
        this->fullName.clear();
        this->type.clear();
        this->transType.clear();

        this->dimensionArray.clear();
        this->boolArrayElement.clear();
        this->charArrayElement.clear();
        this->shortArrayElement.clear();
        this->intArrayElement.clear();
        this->longArrayElement.clear();
        this->floatArrayElement.clear();
        this->doubleArrayElement.clear();
        this->longDoubleArrayElement.clear();
    }

     /*
     * 按照命名规范解析相关信息
	 * KQuary 约束解析规范:
	 * TYPE_Name
	 * UTYPE_Name
	 * TYPE_ARRAY_K_Len1_Len2......_Lenk_Name
	 * UTYPE_ARRAY_K_Len1_Len2......_Lenk_Name
	 * */
    void SymbolicVar::dealWithName(vector<string> res)
    {
        if(res.size()<2)
        {
            cerr<<"Error!!!  void SymbolicVar::dealWithName(vector<string> res)"
            <<" in SymbolicVar.cpp.";
            cerr<<" It does not obey KQuery Name Rules"<<endl;
            setIsVaild(false);
            return ;

        }else
        {
            if(res.size()==2)
            {
                dealWithType(res[0]);
                setName(res[1]);

            }else
            {
                dealWithType(res[0]);
                if(res[1]=="ARRAY")
                {
                    setIsArray(true);

                    stringstream strStream;

                    int dime = 0;
                    strStream<<res[2];
                    strStream>>dime;
                    setDimension(dime);
                    strStream.clear();

                    if(res.size() == (unsigned int)(dime+4))
                    {
                        for(int i=3; i < (int)(dime+3); i++)
                        {
                            int tmp =0;
                            strStream<<res[i];
                            strStream>>tmp;
                            addDimensionArray(tmp);
                            strStream.clear();
                        }

                    }else
                    {
                        setIsVaild(false);
                        cerr<<"In the Function: void SymbolicVar::dealWithName(vector<string> res)[1] "
                        <<getFullName()<<"breaks the Name Rules By Zhang Hui "<<endl;
                        return ;
                    }

                    setName(res[res.size()-1]);

                }
                else
                {
                    setIsVaild(false);
                    cerr<<"In the Function: void SymbolicVar::dealWithName(vector<string> res)[2] "
                    <<getFullName()<<"breaks the Name Rules By Zhang Hui "<<endl;
                    return ;
                }
            }
        }

    }

     /*
     * 按照命名规范解析相关信息
	 * KQuary 约束解析规范:
	 * TYPE
	 * UTYPE
	 * */
    void SymbolicVar::dealWithType(string typeStr)
    {
        //处理无符号类型
        if(typeStr[0]=='U')
        {
            setIsSigned(false);
            typeStr = typeStr.substr(1);
            dealWithTypeBit(typeStr);
        }else
        {
            //处理有符号类型
            setIsSigned(true);
            dealWithTypeBit(typeStr);
        }
    }

     /*
     * 按照命名规范解析相关信息
	 * KQuary 约束解析规范:
	 * TYPE
	 * C++ 数据类型
	 *   static const Width InvalidWidth = 0;
	 *   static const Width Bool = 1; //bool
	 *   static const Width Int8 = 8; //char
	 *   static const Width Int16 = 16; //short int
	 *   static const Width Int32 = 32; //int float  long
	 *   static const Width Int64 = 64; //double
	 *   static const Width Fl80 = 80; //long double 一般是10，但是也可能是12,16等等
	 *
	 *   数据类型 降低转换(这个暂时不考虑)
	 *   long long       ---->    long
	 *   long double     ---->    double
	 *
	 * */
    void SymbolicVar::dealWithTypeBit(string typeStr)
    {
        if(typeStr == "BOOL")
        {
            setType("bool");
            setTypeBit(1);
            setTransType("boolean");
        }else if(typeStr == "CHAR")
        {
            setType("char");
            setTypeBit(sizeof(char)*8);
            setTransType("char");
        }else if(typeStr == "SHORTINT")
        {
            setType("short");
            setTypeBit(sizeof(short int)*8);
            setTransType("int");
        }else if(typeStr == "SHORT")
        {
            setType("short");
            setTypeBit(sizeof(short)*8);
            setTransType("int");
        }else if(typeStr == "INT")
        {
            setType("int");
            setTypeBit(sizeof(int)*8);
            setTransType("int");
        }else if(typeStr == "LONG")
        {
            setType("long");
            setTypeBit(sizeof(long)*8);
            setTransType("long");
        }else if(typeStr == "LONGINT")
        {
            setType("long");
            setTypeBit(sizeof(long int)*8);
            setTransType("long");
        }else if(typeStr == "FLOAT")
        {
            setType("float");
            setTypeBit(sizeof(float)*8);
            setTransType("float");
        }else if(typeStr == "DOUBLE")
        {
            setType("double");
            setTypeBit(sizeof(double)*8);
            setTransType("double");
        }else if(typeStr == "LONGDOUBLE")
        {
            setType("long double");
            setTypeBit(sizeof(long double)*8);
            setTransType("long double");
        }else
        {
            setIsVaild(false);
            cerr<<"In Function: void SymbolicVar::dealWithTypeBit(string typeStr)[1] "
                <<"Type is not deal. Type is "<<typeStr<<endl;
            return ;
        }

        //这里只处理刚好可以处理的数据类型,其余的不处理
        if(getIsVaild())
        {
            int len = getTypeBit();
            if(len!=1 && len!=8 && len!=16 && len!=32 && len!=64 && len!=80 )
            {
                setIsVaild(false);
                cerr<<"In Function: void SymbolicVar::dealWithTypeBit(string typeStr)[2] "
                <<"Type is not matched. Type is "<<typeStr<<", TypeBit is "<<len<<endl;
                return ;
            }
        }

    }


    //分割字符串
    vector<string> SymbolicVar::split(string str, string delim)
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
        打印了所有的信息
    */
    void SymbolicVar::printInfo()
    {
        cout<<"********************* Symbolic Var Info *********************"<<endl;
        cout<<"IsVaild    : "<<getIsVaild()<<endl;
        cout<<"FullName   : "<<getFullName()<<endl;
        cout<<"Name       : "<<getName()<<endl;
        cout<<"Type       : "<<getType()<<endl;
        cout<<"TransType  : "<<getTransType()<<endl;
        cout<<"TypeBit    : "<<getTypeBit()<<endl;
        cout<<"TotalBit   : "<<getTotalBit()<<endl;
        cout<<"IsSigned   : "<<getIsSigned()<<endl;
        cout<<"IsArray    : "<<getIsArray()<<endl;
        if(getIsArray())
        {
            cout<<"Dimension  : "<<getDimension()<<" of {  ";
            vector<int> tmp = getDimensionArray();
            for(unsigned int i=0;i<tmp.size();i++)
            {
                cout<<tmp[i]<<"  ";
            }
            cout<<"} "<<endl;
        }
        cout<<"IsSymbolic : "<<getIsSymbolic()<<endl;

        if(getIsSymbolic()==false)
        {
            if(getType()=="bool")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<boolArrayElement.size();i++)
                {
                    cout<<boolArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else if(getType()=="char")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<charArrayElement.size();i++)
                {
                    cout<<charArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else if(getType()=="short")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<shortArrayElement.size();i++)
                {
                    cout<<shortArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else if(getType()=="int")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<intArrayElement.size();i++)
                {
                    cout<<intArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else if(getType()=="long")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<longArrayElement.size();i++)
                {
                    cout<<longArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else if(getType()=="float")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<floatArrayElement.size();i++)
                {
                    cout<<floatArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;

            }else if(getType()=="double")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<doubleArrayElement.size();i++)
                {
                    cout<<doubleArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else if(getType()=="long double")
            {
                cout<<"[ ";
                for(unsigned int i=0;i<longDoubleArrayElement.size();i++)
                {
                    cout<<longDoubleArrayElement[i]<<" ";
                }
                cout<<"]"<<endl;
            }else
            {
                cerr<<"You Should Never Get Here In Function: void Transform::dealWithArrayInit(SymbolicVar* oneVar, antlr4::tree::ParseTree* initList)"<<endl;
            }
        }

        cout<<endl<<endl;
    }
