#ifndef GLOBALFUNCTION_H_INCLUDED
#define GLOBALFUNCTION_H_INCLUDED
#include <string>
#include <regex>
#include <vector>
#include <sstream>
#include "Expression.h"

class GlobalFunction
{
public:
    /*
        判断是否是Number
    */
    static bool isNumber(string str)
    {
        string numPatStr = "([0-9_]+|0b[01_]+|0o[0-7_]+|0x[0-9a-fA-F_]+)";
        string numPat = "true|false";
        numPat = numPat + "|([+|-]" + numPatStr + ")" + "|" + numPatStr;
        regex numPattern(numPat);

        return regex_match(str,numPattern);
    };

    /*
        判断是否是Idetifier
    */
    static bool isIdentifier(string str)
    {
        string idStr = "[a-zA-Z][a-zA-Z0-9_]*";
        regex idPattern(idStr);
        return regex_match(str,idPattern);
    };

    /*
        获取二元算术运算的转换运算符
        Add|Sub|Mul|UDiv|URem|SDiv|SRem|FAdd|FSub|FMul|FDiv|FRem
    */
    static string getArithBinStr(string op)
    {
        string res = "";
        if(op == "Add" || op == "FAdd")
        {
            res = "+";
        }else if(op == "Sub" || op == "FSub")
        {
            res = "-";
        }else if(op == "Mul" || op == "FMul")
        {
            res = "*";
        }else if(op == "UDiv" || op == "SDiv" || op == "FDiv")
        {
            res = "/";
        }else if(op == "URem" || op == "SRem" || op == "FRem")
        {
            res = "%";
        }else
        {
            cerr<<"In Function: static string getArithBinStr(string op) ";
            cerr<<" Encounter InVaild ArithBinaryOp of Class GlobalFunction "<<endl;
        }
        return res;
    }

    /*
        获取逻辑二元运算的转换运算符
        And|Or|Xor|Shl|LShr|AShr
    */
    static string getBitBinStr(string op, Expression* exp)
    {
        string res = "";
        if( op == "And" )
        {
            bool tmp = isContainsCmpOp(exp->getOneChild())
                    || isContainsCmpOp(exp->getTwoChild())
                    || isContainsCmpOp(exp->getThreeChild()) ;
            //res = tmp ? "&&" : "&";
              res = tmp ? "&&" : "+";

        }else if( op == "Or" )
        {
            bool tmp = isContainsCmpOp(exp->getOneChild())
                    || isContainsCmpOp(exp->getTwoChild())
                    || isContainsCmpOp(exp->getThreeChild()) ;
            //res = tmp ? "||" : "|";
              res = tmp ? "||" : "+";

        }else if( op == "Not" )
        {
            bool tmp = isContainsCmpOp(exp->getOneChild())
                    || isContainsCmpOp(exp->getTwoChild())
                    || isContainsCmpOp(exp->getThreeChild()) ;
            //res = tmp ? "!" : "~";
              res = tmp ? "!" : "!";

        }else if( op == "Xor" )
        {
            //res = "^";
              res="+";
        }else if( op == "Shl" )
        {
            //res = "<<";
              res="+";
        }else if( op == "LShr" )
        {
            //res = ">>";
              res="+";
        }else if( op == "AShr" )
        {
            //res = ">>";
              res="+";
        }else
        {
            cerr<<"In Function: static string getCompBinStr(string op, string operator1, string operator2) ";
            cerr<<" Encounter InVaild ArithBinaryOp of Class GlobalFunction "<<endl;
        }
        return res;
    }

    /*
        获取二元比较运算的转换运算符
        Eq|Ne|Ult|Ule|Ugt|Uge|Slt|Sle|Sgt|Sge|FOGe|FOGt|FOLe|FOLt|FOEq
    */
    static string getCompBinStr(string op)
    {
        string res = "";
        if( op == "Eq" || op == "FOEq")
        {
            res = "==";
        }else if( op == "Ne" )
        {
            res = "!=";
        }else if( op == "Ult" || op == "Slt" || op == "FOLt")
        {
            res = "<";
        }else if( op == "Ule" || op == "Sle" || op == "FOLe")
        {
            res = "<=";
        }else if( op == "Ugt" || op == "Sgt" || op == "FOGt")
        {
            res = ">";
        }else if( op == "Uge" || op == "Sge" || op == "FOGe")
        {
            res = ">=";
        }else
        {
            cerr<<"In Function: static string getArithBinStr(string op) ";
            cerr<<" Encounter InVaild ArithBinaryOp of Class GlobalFunction "<<endl;
        }
        return res;
    }
    /*
        递归去判断expression是否包含比较运算符,这么做的原如下:
        KQuery是不区分逻辑运算和位运算,特别对于 && 和 &  , || 和 | 是不做区分的
        但是我们在分析自约束的时候是必须要做区分的,所以大致可以这么去做一个判断
        链接比较运算符的是&&或者||,其余的肯定是位运算
        要使用Expression的数据库结构去递归判断,
        假如使用转换后的string去判断,对于位运算>> 和 << ,对于大于小于>和<是无法
        通过字符串匹配做区分的
    */
    static bool isContainsCmpOp(Expression* exp)
    {
        if(exp == NULL || exp->isAtomExpression)
            return false;
        else
        {
            string compBinStr = "Eq|Ne|Ult|Ule|Ugt|Uge|Slt|Sle|Sgt|Sge|FOGe|FOGt|FOLe|FOLt|FOEq";
            regex compBinStrPattern(compBinStr);
            if(regex_match(exp->getOp(),compBinStrPattern))
                return true;
            else
            {
                bool res = isContainsCmpOp(exp->getOneChild())
                        || isContainsCmpOp(exp->getTwoChild())
                        || isContainsCmpOp(exp->getThreeChild()) ;
                return res;
            }
        }
    }

    /*
        递归去判断expression是否包含比较运算符,这么做的原如下:
        KQuery是不区分逻辑运算和位运算,特别对于 && 和 &  , || 和 | 是不做区分的
        但是我们在分析自约束的时候是必须要做区分的,所以大致可以这么去做一个判断
        链接比较运算符的是&&或者||,其余的肯定是位运算
        要使用Expression的数据库结构去递归判断,
        假如使用转换后的string去判断,对于位运算>> 和 << ,对于大于小于>和<是无法
        通过字符串匹配做区分的
    */
    /*
static bool isContainsCmpOp1(string operator1)
    {
        vector<string> containList;
        containList.push_back("<=");
        containList.push_back(">=");
        containList.push_back("==");
        containList.push_back("!=");

        for(int i=0; i<containList.size(); i++)
        {
            if(operator1.find(containList[i]) != string::npos)
            {
                return true;
            }
        }

        if(operator1.find("<<") != string::npos)
            return false;
        else
        {
            if(operator1.find("<") != string::npos)
                return true;
            else
                return false;
        }

        if(operator1.find(">>") != string::npos)
            return false;
        else
        {
            if(operator1.find(">") != string::npos)
                return true;
            else
                return false;
        }
    }
    */


    /*
        这个是专门为了KleeFp定义的Fcmp运算来做的转换结果
        UNO<=>       UNO<=>      UNO<=>        UNO<=>
          0000  0 X    0001  1 >   0010  2 ==    0011  3 >=
          0100  4 <    0101  5 !=  0110  6 <=    0111  7 X
          1000  8 X    1001  9 >   1010  10 ==   1011  11 >=
          1100  12 <   1101  13 != 1110  14 <=   1111  15 X
    */
    static string getFcmpOpStr(string opStr)
    {
        stringstream ss;
        int op = -1;
        ss<<opStr;
        ss>>op;
        string res = "";
        if( op == 1 || op == 9)
        {
            res = ">";
        }else if( op == 2 || op == 10)
        {
            res = "==";
        }else if( op == 3 || op == 11)
        {
            res = ">=";
        }else if( op == 4 || op == 12)
        {
            res = "<";
        }else if( op == 5 || op == 13)
        {
            res = "!=";
        }else if( op == 6 || op == 14)
        {
            res = "<=";
        }else if( op == 0 || op == 7 || op == 8 || op == 15 )
        {
            cerr<<"In Function: static string getFcmpOpStr(string opStr) ";
            cerr<<" 1:Encounter InVaild ArithBinaryOp of Class GlobalFunction "<<endl;
        }else
        {
            cerr<<"In Function: static string getFcmpOpStr(string opStr) ";
            cerr<<" 2:Encounter InVaild ArithBinaryOp of Class GlobalFunction "<<op<<endl;
        }
        return res;
    }


    /*
        根据width和num转换对应的浮点数, 有符号整数也是这样的
        isFloat为true的时候是做浮点数类型的转化
        isFloat为false的时候是考虑做整形类型的转化
        width是数据类型的宽度
        numStr是对应的大整数的字符串,但是也可能不是数字
    */
    static string getFloatNum(bool isFloat, int width, string numStr , bool &isNum)
    {
        string numPatStr = "([0-9_]+|0b[01_]+|0o[0-7_]+|0x[0-9a-fA-F_]+)";
        string numPat = "true|false";
        numPat = numPat + "|([+|-]" + numPatStr + ")" + "|" + numPatStr ;
        regex numPattern(numPat);

        string res = numStr;
        if(regex_match(numStr,numPattern))
        {
            isNum = true;
            if(numStr=="true" || numStr=="false")
            {
                res = numStr;
                return res;
            }

            if(isFloat == true)
            {
                stringstream ss;
                if(width == 64)
                {
                    unsigned long num = 0;
                    ss<<numStr;
                    ss>>num;
                    double* doubleNum = (double*)(&num);

                    //负数添加括号,为了便于观察
                    res = (*doubleNum < 0)? "("+to_string((*doubleNum))+")": to_string((*doubleNum));
                    return res;
                }else if(width == 32)
                {
                    unsigned int num = 0;
                    ss<<numStr;
                    ss>>num;
                    float* floatNum = (float*)(&num);

                    //负数添加括号,为了便于观察
                    res = (*floatNum < 0)? "("+to_string((*floatNum))+")": to_string((*floatNum));
                    return res;
                }else
                {
                    //cerr<<"*** WARNING *** In Function: string getFloatNum(bool isFloat, int width, string numStr) ";
                    //cerr<<width<<" For Float Number May Wrong "<<endl;
                }
                return res;
            }else
            {
                stringstream ss;
                if(width == 64)
                {
                    unsigned long num = 0;
                    ss<<numStr;
                    ss>>num;
                    long* longNum = (long*)(&num);

                    //负数添加括号,为了便于观察
                    res = (*longNum < 0)? "("+to_string((*longNum))+")": to_string((*longNum));
                    return res;
                }else if(width == 32)
                {
                    unsigned int num = 0;
                    ss<<numStr;
                    ss>>num;
                    int* intNum = (int*)(&num);

                    //负数添加括号,为了便于观察
                    res = (*intNum < 0)? "("+to_string((*intNum))+")": to_string((*intNum));
                    return res;
                }else if(width == 16)
                {
                    unsigned short num = 0;
                    ss<<numStr;
                    ss>>num;
                    short* shortNum = (short*)(&num);

                    //负数添加括号,为了便于观察
                    res = (*shortNum < 0)? "("+to_string((*shortNum))+")": to_string((*shortNum));
                    return res;
                }else
                {
                    //cerr<<"*** WARNING *** In Function: string getFloatNum(bool isFloat, int width, string numStr) ";
                    //cerr<<width<<" For Float Number May Wrong "<<endl;
                }

                return res;
            }
        }else
        {
            isNum = false;
            return res;
        }

    }


};
#endif // GLOBALFUNCTION_H_INCLUDED
