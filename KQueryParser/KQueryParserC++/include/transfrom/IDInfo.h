#ifndef IDINFO_H_INCLUDED
#define IDINFO_H_INCLUDED

#include <iostream>
#include <string>

/*
    这个主要就是保存ID和width的信息
*/
class IDInfo
{
public:
    IDInfo()
    {
        this->IDStr = "";
        this->width = 0;
    }

    ~IDInfo()
    {
        //Do Nothing
        this->IDStr.clear();
    }

    IDInfo(string id,int width)
    {
        this->IDStr = id;
        this->width = width;
    }

    void setIDStr(string id)
    {
        this->IDStr = id;
    }

    string getIDStr()
    {
        return this->IDStr;
    }

    void setWidth(int wid)
    {
        this->width = wid;
    }

    int getWidth()
    {
        return this->width;
    }

private:
    string IDStr = "";
    int width = 0;

};

#endif // IDINFO_H_INCLUDED
