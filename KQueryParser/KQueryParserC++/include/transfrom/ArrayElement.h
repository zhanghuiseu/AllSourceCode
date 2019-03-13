#ifndef ARRAYELEMENT_H_INCLUDED
#define ARRAYELEMENT_H_INCLUDED

#include <string>
#include <sstream>
#include <vector>
#include "SymbolicVar.h"
/*
    这个类主要保存的是声明元素的信息
*/
class ArrayElement
{
public:

    /*
        默认构造函数
    */
    ArrayElement()
    {
        this->id = "";
        this->width = "";
        this->index = -1;
        this->symVar = NULL;
    }

    /*
        要使用的构造函数
    */
    ArrayElement(string id,string width)
    {
        this->id = id;
        this->width = width;
        this->index = -1;
        this->symVar = NULL;
    }

    /*
        析构函数
    */
    ~ArrayElement()
    {
        this->symVar = NULL;
        this->id.clear();
        this->width.clear();
    }

    /*
        获取相关信息
    */
    bool dealWithArrayElement(vector< SymbolicVar* >& symbolicVarList)
    {
        //获得int类型的wwidth
        stringstream ss;
        ss<<(this->width);
        int numOfBytes = 0;
        ss>>numOfBytes;


        for(int i=0; i<(int)symbolicVarList.size();i++)
        {
            SymbolicVar* one = symbolicVarList[i];
            if(one->getFullName() == this->id)
            {
                 this->symVar = one;
                 break;
            }
        }

        //查找不到的情况,一般不会出现的
        if(this->symVar == NULL)
        {
            cerr<<"*** ERROR *** In Class: ArrayElement , In Function: bool dealWithArrayElement(vector< SymbolicVar* >& symbolicVarList) ";
            cerr<<"You Should Never Get Here,Name Is Not Matched!!! "<<endl;
            return false;
        }else
        {
            int typeBit = this->symVar->getTypeBit();
            int typeByte = (typeBit==1)? typeBit : (typeBit/8);
            this->index = numOfBytes / typeByte;
            return true;
        }
    }

    /*
        各种set和get函数
    */
    void setId(string a)             {  id = a;         };
    string getId()                   {  return id;      };
    void setWidth(string a)          {  width = a;      };
    string getWidth()                {   return width;  };
    void setIndex(int a)             {   index = a;     };
    int getIndex()                   {   return index;  };
    void setSymVar(SymbolicVar* a)   {   symVar = a;    };
    SymbolicVar* getSymVar()         {   return symVar; };


public:

    string id = "";
    string width = "";

    int index = -1;
    SymbolicVar* symVar = NULL;
};


#endif // ARRAYELEMENT_H_INCLUDED
