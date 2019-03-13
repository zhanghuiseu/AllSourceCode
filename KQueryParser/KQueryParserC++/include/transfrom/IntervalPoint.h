#ifndef INTERVAL_POINT_H_INCLUDED
#define INTERVAL_POINT_H_INCLUDED

#include <ostream>
#include <iostream>
#include <limits>

using namespace std;



class IntervalPoint
{
public:
    static double minLen;

    friend ostream& operator<<(ostream& out,const IntervalPoint one);

    friend IntervalPoint operator+(const IntervalPoint a,const IntervalPoint b);
    friend IntervalPoint operator+(const IntervalPoint a,const double b);
    friend IntervalPoint operator+(const double a,const IntervalPoint b);

    friend IntervalPoint& operator+=(IntervalPoint& a,const IntervalPoint b);
    friend IntervalPoint& operator+=(IntervalPoint& a,const double b);

    friend IntervalPoint operator-(const IntervalPoint a,const IntervalPoint b);
    friend IntervalPoint operator-(const IntervalPoint a,const double b);
    friend IntervalPoint operator-(const double a,const IntervalPoint b);
    friend IntervalPoint operator-(const IntervalPoint a);

    friend IntervalPoint& operator-=(IntervalPoint& a,const IntervalPoint b);
    friend IntervalPoint& operator-=(IntervalPoint& a,const double b);

    friend IntervalPoint& operator++(IntervalPoint &a);
    friend IntervalPoint operator++(IntervalPoint &a,int add);
    friend IntervalPoint& operator--(IntervalPoint &a);
    friend IntervalPoint operator--(IntervalPoint &a,int sub);


    friend IntervalPoint operator*(const IntervalPoint a,const IntervalPoint b);
    friend IntervalPoint operator*(const IntervalPoint a,const double b);
    friend IntervalPoint operator*(const double a,const IntervalPoint b);

    friend IntervalPoint& operator*=(IntervalPoint& a,const IntervalPoint b);
    friend IntervalPoint& operator*=(IntervalPoint& a,const double b);

    friend IntervalPoint operator/(const IntervalPoint a,const IntervalPoint b);
    friend IntervalPoint operator/(const IntervalPoint a,const double b);
    friend IntervalPoint operator/(const double a,const IntervalPoint b);

    friend IntervalPoint& operator/=(IntervalPoint& a,const IntervalPoint b);
    friend IntervalPoint& operator/=(IntervalPoint& a,const double b);

    friend bool operator==(const IntervalPoint a,const IntervalPoint b);
    friend bool operator==(const IntervalPoint a,const double b);
    friend bool operator==(const double a,const IntervalPoint b);

    friend bool operator!=(const IntervalPoint a,const IntervalPoint b);
    friend bool operator!=(const IntervalPoint a,const double b);
    friend bool operator!=(const double a,const IntervalPoint b);

    friend bool operator>(const IntervalPoint a,const IntervalPoint b);
    friend bool operator>(const IntervalPoint a,const double b);
    friend bool operator>(const double a,const IntervalPoint b);

    friend bool operator>=(const IntervalPoint a,const IntervalPoint b);
    friend bool operator>=(const IntervalPoint a,const double b);
    friend bool operator>=(const double a,const IntervalPoint b);

    friend bool operator<(const IntervalPoint a,const IntervalPoint b);
    friend bool operator<(const IntervalPoint a,const double b);
    friend bool operator<(const double a,const IntervalPoint b);

    friend bool operator<=(const IntervalPoint a,const IntervalPoint b);
    friend bool operator<=(const IntervalPoint a,const double b);
    friend bool operator<=(const double a,const IntervalPoint b);


    double left;
    double right;
    IntervalPoint()
    {
        left = numeric_limits<double>::min();
        right = numeric_limits<double>::max();
    }

    IntervalPoint(const IntervalPoint& a)
    {
        left=a.left;
        right=a.right;
    }

    IntervalPoint(double a)
    {
        left=right=a;
    }

    IntervalPoint(double left,double right)
    {
        this->left =left;
        this->right=right;
    }
};


#endif // INTERVAL_POINT_H_INCLUDED
