#ifndef EXPRESSION_H_INCLUDED
#define EXPRESSION_H_INCLUDED

#include <string>
using namespace std;

class Expression
{
public:
    /*
    所有的构造函数
    */
    Expression();
    Expression(string op , int width);
    Expression(string op);


    /*
        析构函数
        为什么设计这三个函数呢?这是因为我把所有的Expression的数据涉及到一起了
        若不分开这三个函数,必然会出错
    */
    ~Expression();

    /*
        调用deleteByRecursion(Expression* root)递归析构当前AST树
        这个是需要当前对象主动调用makeClean()函数
    */
    void makeClean();

    /*
        递归析构当前的树
    */
    void deleteByRecursion(Expression* root);

    /*
    相关set()和get()函数
    */
    void setOp(string a);
    string getOp();
    void setWidth(int a);
    void setWidthStr(string a);
    int getWidth();
    void setIsAtomExpression(bool a);
    bool getIsAtomExpression();

    /*
    这些是终点expression的标志
    */
    void setOneChildStr(string a);
    string getOneChildStr();

    void setTwoChildStr(string a);
    string getTwoChildStr();

    void setThreeChildStr(string a);
    string getThreeChildStr();

    /*
    这些是孩子节点expression的标志
    */
    void setParent(Expression* a);
    Expression* getParent();

    void setOneChild(Expression* a);
    Expression* getOneChild();

    void setTwoChild(Expression* a);
    Expression* getTwoChild();

    void setThreeChild(Expression* a);
    Expression* getThreeChild();

public:
    Expression* parent = NULL;
    Expression* oneChild = NULL;
    Expression* twoChild = NULL;
    Expression* threeChild = NULL;
    bool isAtomExpression = false;

private:
    string op = "";
    int width = -1;

    string oneChildStr = "";
    string twoChildStr = "";
    string threeChildStr = "";

};

#endif // EXPRESSION_H_INCLUDED
