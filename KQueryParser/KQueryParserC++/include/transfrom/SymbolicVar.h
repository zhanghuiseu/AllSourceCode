#ifndef SYMBOLICVAR_H_INCLUDED
#define SYMBOLICVAR_H_INCLUDED

#include <string>
#include <vector>
#include <stack>
using namespace std;

	/*
	 * 与C语言不同，Java里没有无符号（unsigned）整型。
	 * JAVA的8种基本类型（boolean，byte，short，char，int，long，float，double）都是有符号的。
	 * 与C语言不同，JAVA里的char类型，占2个字节，专为存放Unicode字符所设计；
	 * 与C语言不同，JAVA里的boolean只能赋值为true或false，不能直接赋值0或1；
	 * 与C语言不同，JAVA里的long类型，不是占4字节，而是占8字节。
	 * */


class SymbolicVar
{
public:
    //默认构造函数
    SymbolicVar() { } ;

    //带参构造函数
    SymbolicVar(string id);

    //复制构造函数,注意不要恶意使用
    SymbolicVar(const SymbolicVar& a);

    /*
        析构函数, 主要是清空所有的vector
    */
    ~SymbolicVar();

     /*
     * 按照命名规范解析相关信息
	 * KQuary 约束解析规范:
	 * TYPE_Name
	 * UTYPE_Name
	 * TYPE_ARRAY_K_Len1_Len2......_Lenk_Name
	 * UTYPE_ARRAY_K_Len1_Len2......_Lenk_Name
	 * */
    void dealWithName(vector<string> res);

     /*
     * 按照命名规范解析相关信息
	 * KQuary 约束解析规范:
	 * TYPE
	 * UTYPE
	 * */
    void dealWithType(string typeStr);

    /*
     * 按照命名规范解析相关信息
	 * KQuary 约束解析规范:
	 * TYPE
	 * */
    void dealWithTypeBit(string typeStr);

    //分割字符串
    vector<string> split(string str, string delim);


    void printInfo();

    /*
    下面是set和get函数
    */
    void setIsVaild(bool a)       { isVaild = a;          };
    bool getIsVaild()             { return isVaild;       };

    void setName(string a)        { name = a;             };
    string getName()              { return name;          };

    void setFullName(string a)    { fullName = a;         };
    string getFullName()          { return fullName;      };


    void setType(string a)        { type = a;             };
    string getType()              { return type;          };

    void setTransType(string a)   { transType = a;        };
    string getTransType()         { return transType;     };

    void setIsSigned(bool a)      { isSigned = a;         };
    bool getIsSigned()            { return isSigned;      };

    void setIsArray(bool a)       { isArray = a;          };
    bool getIsArray()             { return isArray;       };

    void setDimension(int a)      { dimension = a;        };
    int getDimension()            { return dimension;     };

    void setTypeBit(int a)        { typebit = a;          };
    int getTypeBit()              { return typebit;       };

    void setTotalBit(int a)       { totalbit = a;         };
    int getTotalBit()             { return totalbit;      };

    void setIsSymbolic(bool a)    { isSymbolic = a;       };
    bool getIsSymbolic()          { return isSymbolic;    };

    /*
    针对vector,有专门的add函数
    */
    void addDimensionArray(int a)              { dimensionArray.push_back(a);           }
    void addBoolElement(bool a)                { boolArrayElement.push_back(a);         };
    void addCharElement(char a)                { charArrayElement.push_back(a);         };
    void addShortElement(short a)              { shortArrayElement.push_back(a);        };
    void addIntElement(int a)                  { intArrayElement.push_back(a);          };
    void addLongElement(long a)                { longArrayElement.push_back(a);         };
    void addFloatElement(float a)              { floatArrayElement.push_back(a);        };
    void addDoubleElement(double a)            { doubleArrayElement.push_back(a);       };
    void addLongDoubleElement(long double a)   { longDoubleArrayElement.push_back(a);   };

    /*
    这里返回的都是引用,为了防止复制构造函数的恶意使用
    */
    vector<int>&          getDimensionArray()              { return  dimensionArray;         }
    vector<bool>&         getBoolElement()                 { return  boolArrayElement;       };
    vector<char>&         getCharElement()                 { return  charArrayElement;       };
    vector<short>&        getShortElement()                { return  shortArrayElement;      };
    vector<int>&          getIntElement()                  { return  intArrayElement;        };
    vector<long>&         getLongElement()                 { return  longArrayElement;       };
    vector<float>&        getFloatElement()                { return  floatArrayElement;      };
    vector<double>&       getDoubleElement()               { return  doubleArrayElement;     };
    vector<long double>&  getLongDoubleElement()           { return  longDoubleArrayElement; };

private:
    //判断该AST是否可以解析,一旦无法直接解析,直接报错返回
    bool isVaild = true;

    //符号化变量name
    string name = "";

    //符号化变量name
    string fullName = "";

    //变量类型
    string type ="";

    //变量类型
    string transType ="";

    //有符号无符号判断
    bool isSigned = true;

    //是否是数组判断
    bool isArray =false;

    //维度的数量判断
    int dimension =0;

    //每个维度的size
    vector<int> dimensionArray;

    //类型的bit
    int typebit = 0;

    //该变量的bit
    int totalbit =0;

    //是否是符号化变量的判断
    bool isSymbolic = true;

    /*
     *   不是符号化变量的情况下,要保存可能出现的值
     *   static const Width InvalidWidth = 0;
	 *   static const Width Bool = 1; //bool
	 *   static const Width Int8 = 8; //char
	 *   static const Width Int16 = 16; //short int
	 *   static const Width Int32 = 32; //int float  long
	 *   static const Width Int64 = 64; //double
	 *   static const Width Fl80 = 80; //long double 一般是10，但是也可能是12,16等等
    */
    vector<bool> boolArrayElement;
    vector<char> charArrayElement;
    vector<short> shortArrayElement;
    vector<int> intArrayElement;
    vector<long> longArrayElement;
    vector<float> floatArrayElement;
    vector<double> doubleArrayElement;
    vector<long double> longDoubleArrayElement;
};

#endif
