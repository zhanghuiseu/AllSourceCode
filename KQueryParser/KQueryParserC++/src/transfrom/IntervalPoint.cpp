
#include "IntervalPoint.h"
#include <iostream>
#include <algorithm>

using namespace std;

double IntervalPoint::minLen = 1e-6;

ostream& operator<<(ostream& out,const IntervalPoint one)
{
    out<<"("<<one.left<<","<<one.right<<")";
    return out;
}

IntervalPoint operator+(const IntervalPoint a,const IntervalPoint b)
{
    IntervalPoint res=IntervalPoint(a.left+b.left,a.right+b.right);
    return res;
}

IntervalPoint operator+(const IntervalPoint a,const double b)
{
    IntervalPoint res=IntervalPoint(a.left+b,a.right+b);
    return res;
}

IntervalPoint operator+(const double a,const IntervalPoint b)
{
    return (b+a);
}

IntervalPoint& operator+=(IntervalPoint& a,const IntervalPoint b)
{
    a.left+=b.left;
    a.right+=b.right;
    return a;
}

IntervalPoint& operator+=(IntervalPoint& a,const double b)
{
    a.left+=b;
    a.right+=b;
    return a;
}

IntervalPoint operator-(const IntervalPoint a,const IntervalPoint b)
{
    IntervalPoint res=IntervalPoint(a.left-b.right,a.right-b.left);
    return res;
}

IntervalPoint operator-(const IntervalPoint a,const double b)
{
    IntervalPoint res=IntervalPoint(a.left-b,a.right-b);
    return res;
}

IntervalPoint operator-(const double a,const IntervalPoint b)
{
    IntervalPoint res=IntervalPoint(a-b.right,a-b.left);
    return res;
}

IntervalPoint operator-(const IntervalPoint a)
{
    IntervalPoint res=IntervalPoint(-a.right,-a.left);
    return res;
}

IntervalPoint& operator-=(IntervalPoint& a,const IntervalPoint b)
{
    a.left-=b.right;
    a.right-=b.left;
    return a;
}

IntervalPoint& operator-=(IntervalPoint& a,const double b)
{
    a.left-=b;
    a.right-=b;
    return a;
}


IntervalPoint& operator++(IntervalPoint &a)
{
    a.left+=1;
    a.right+=1;
    return a;
}

IntervalPoint operator++(IntervalPoint &a,int add)
{
    IntervalPoint res=IntervalPoint(a.left,a.right);
    a.left+=1;
    a.right+=1;
    return res;
}

IntervalPoint& operator--(IntervalPoint &a)
{
    a.left-=1;
    a.right-=1;
    return a;
}

IntervalPoint operator--(IntervalPoint &a,int sub)
{
   IntervalPoint res=IntervalPoint(a.left,a.right);
    a.left-=1;
    a.right-=1;
    return res;
}


IntervalPoint operator*(const IntervalPoint a,const IntervalPoint b)
{
    vector<double> all= {a.left*b.left,a.left*b.right,a.right*b.left,a.right*b.right};
    double left= *min_element(all.begin(),all.end());
    double right= *max_element(all.begin(),all.end());
    IntervalPoint res = IntervalPoint(left,right);
    return res;
}

IntervalPoint operator*(const IntervalPoint a,const double b)
{
    double left = min(a.left*b,a.right*b);
    double right = max(a.left*b,a.right*b);
    IntervalPoint res = IntervalPoint(left,right);
    return res;
}

IntervalPoint operator*(const double a,const IntervalPoint b)
{
    return (b*a);
}

IntervalPoint& operator*=(IntervalPoint& a,const IntervalPoint b)
{
    IntervalPoint bb=a;
    bb=bb*b;
    a.left=bb.left;
    a.right=bb.right;
    return a;
}

IntervalPoint& operator*=(IntervalPoint& a,const double b)
{
    IntervalPoint bb=a;
    bb=bb*b;
    a.left=bb.left;
    a.right=bb.right;
    return a;
}


IntervalPoint operator/(const IntervalPoint a,const IntervalPoint b)
{
    if(b.left<=0 && 0<=b.right)
    {
        //cout<<"IntervalPoint operator/(const IntervalPoint a,const IntervalPoint b) 除数为0"<<endl;
        return a;
    }else
    {
        IntervalPoint bb = IntervalPoint(1/b.right,1/b.left);
        IntervalPoint res=(a*bb);
        return res;
    }
}

IntervalPoint operator/(const IntervalPoint a,const double b)
{
    if(b==0)
        ;//cout<<"IntervalPoint operator/(const IntervalPoint a,const double b) 除数为0"<<endl;

    IntervalPoint bb=IntervalPoint(b,b);
    IntervalPoint res=(a/bb);
    return res;
}

IntervalPoint operator/(const double a,const IntervalPoint b)
{
    if(a==0)
        ;//cout<<"IntervalPoint operator/(const double a,const IntervalPoint b) 除数为0"<<endl;

    IntervalPoint aa=IntervalPoint(a,a);
    IntervalPoint res=(aa/b);
    return res;
}

IntervalPoint& operator/=(IntervalPoint& a,const IntervalPoint b)
{
    IntervalPoint bb=a;
    bb=bb/b;
    a.left=bb.left;
    a.right=bb.right;
    return a;
}

IntervalPoint& operator/=(IntervalPoint& a,const double b)
{
    IntervalPoint bb=a;
    bb=bb/b;
    a.left=bb.left;
    a.right=bb.right;
    return a;
}


bool operator==(const IntervalPoint a,const IntervalPoint b)
{
    return abs(a.left-b.left)<=IntervalPoint::minLen && abs(a.right-b.right)<=IntervalPoint::minLen;
}
bool operator==(const IntervalPoint a,const double b)
{
    return abs(a.left-b)<=IntervalPoint::minLen && abs(a.right-b)<=IntervalPoint::minLen;
}
bool operator==(const double a,const IntervalPoint b)
{
    return abs(a-b.left)<=IntervalPoint::minLen && abs(a-b.right)<=IntervalPoint::minLen;
}

bool operator!=(const IntervalPoint a,const IntervalPoint b)
{
    return !(a==b);
}
bool operator!=(const IntervalPoint a,const double b)
{
    return !(a==b);
}
bool operator!=(const double a,const IntervalPoint b)
{
    return !(a==b);
}

bool operator>(const IntervalPoint a,const IntervalPoint b)
{
    return a.left>b.right;
    //return a.left>b.left;
}
bool operator>(const IntervalPoint a,const double b)
{
     return a.left>b;
     //return a.left>b;
}
bool operator>(const double a,const IntervalPoint b)
{
    return a>b.right;
    //return a>b.left;
}

bool operator>=(const IntervalPoint a,const IntervalPoint b)
{
    return a.left>=b.right;
    //return a.left>b.left;
}
bool operator>=(const IntervalPoint a,const double b)
{
    return a.left>=b;
    //return a.left>b;
}
bool operator>=(const double a,const IntervalPoint b)
{
    return a>=b.right;
    //return a>b.left;
}

bool operator<(const IntervalPoint a,const IntervalPoint b)
{
    return !(a>=b);
}
bool operator<(const IntervalPoint a,const double b)
{
    return !(a>=b);
}
bool operator<(const double a,const IntervalPoint b)
{
    return !(a>=b);
}
bool operator<=(const IntervalPoint a,const IntervalPoint b)
{
    return !(a>b);
}
bool operator<=(const IntervalPoint a,const double b)
{
    return !(a>b);
}
bool operator<=(const double a,const IntervalPoint b)
{
    return !(a>b);
}

