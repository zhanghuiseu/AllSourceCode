    #include "Expression.h"
    #include <iostream>
    #include <string>
    #include <sstream>
    using namespace std;

    /*
    所有的构造函数
    */
    Expression::Expression()
    {
        setOp("");
        setWidth(-1);
        setIsAtomExpression(false);
        setParent(NULL);
        setOneChild(NULL);
        setTwoChild(NULL);
        setThreeChild(NULL);
    }

    Expression::Expression(string op , int width)
    {
        setOp(op);
        setWidth(width);
        setIsAtomExpression(false);
        setParent(NULL);
        setOneChild(NULL);
        setTwoChild(NULL);
        setThreeChild(NULL);
    }

    Expression::Expression(string op)
    {
        setOp(op);
        setWidth(-1);
        setIsAtomExpression(false);
        setParent(NULL);
        setOneChild(NULL);
        setTwoChild(NULL);
        setThreeChild(NULL);
    }

    /*
        析构函数
        为什么设计这三个函数呢?这是因为我把所有的Expression的数据涉及到一起了
        若不分开这三个函数,必然会出错
    */
    Expression::~Expression()
    {
        this->parent = NULL;

        this->op.clear();
        this->oneChildStr.clear();
        this->twoChildStr.clear();
        this->threeChildStr.clear();
    }

    /*
        调用deleteByRecursion(Expression* root)递归析构当前AST树
        这个是需要当前对象主动调用makeClean()函数
    */
    void Expression::makeClean()
    {
        deleteByRecursion(this);
    }

    /*
        递归析构当前的树
    */
    void Expression::deleteByRecursion(Expression* root)
    {
        if(root!=NULL)
        {
            deleteByRecursion(root->oneChild);
            deleteByRecursion(root->twoChild);
            deleteByRecursion(root->threeChild);
            delete root;
        }else
            return ;
    }

    /*
    相关set()和get()函数
    */
    void Expression::setOp(string a)
    {
        this->op = a;
    }

    string Expression::getOp()
    {
        return this->op;
    }

    void Expression::setWidthStr(string a)
    {
        string s = a.substr(1);

        stringstream ss;
        int n;
        ss<<s;
        ss>>n;
        setWidth(n);
    }

    void Expression::setWidth(int a)
    {
        this->width = a;
    }

    int Expression::getWidth()
    {
        return this->width;
    }

    void Expression::setIsAtomExpression(bool a)
    {
        this->isAtomExpression = a;
    }

    bool Expression::getIsAtomExpression()
    {
        return this->isAtomExpression;
    }

    /*
    这些是终点expression的标志
    */
    void Expression::setParent(Expression* a)
    {
        this->parent = a;
    }

    Expression* Expression::getParent()
    {
        return this->parent;
    }


    void Expression::setOneChildStr(string a)
    {
        this->oneChildStr = a;
    }

    string Expression::getOneChildStr()
    {
        return this->oneChildStr;
    }

    void Expression::setTwoChildStr(string a)
    {
        this->twoChildStr = a;
    }

    string Expression::getTwoChildStr()
    {
        return this->twoChildStr;
    }

    void Expression::setThreeChildStr(string a)
    {
        this->threeChildStr = a;
    }

    string Expression::getThreeChildStr()
    {
        return this->threeChildStr;
    }

    /*
    这些是孩子节点expression的标志
    */
    void Expression::setOneChild(Expression* a)
    {
        this->oneChild = a;
    }

    Expression* Expression::getOneChild()
    {
        return this->oneChild;
    }

    void Expression::setTwoChild(Expression* a)
    {
        this->twoChild = a;
    }

    Expression* Expression::getTwoChild()
    {
        return this->twoChild;
    }

    void Expression::setThreeChild(Expression* a)
    {
        this->threeChild = a;
    }

    Expression* Expression::getThreeChild()
    {
        return this->threeChild;
    }

