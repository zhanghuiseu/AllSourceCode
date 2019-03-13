
/*add by jackzhang*/
#include <iostream>
#include <string>

using namespace std;

//begin add by zhanghui20181025
//这个类是用到的部分公共函数，

#define NameLen 6

static string getFileName(long long index);
static string getZ3VarType(string name);
static string getZ3VarData(string type,vector<unsigned char>& data);



string getFileName(long long index)
{
  string res = to_string(index);
  int size = NameLen-res.length();
  for(int i=0; i<size; i++)
    res = "0"+res;
  res = "output" + res + ".result";
  return res;
}

//下面是处理Z3的结果
string getZ3VarType(string name)
{
  string res = "";
  string type = name.substr(0,name.find_first_of('_'));
  if(type == "INT")
      res = "int";
  else if(type == "UINT")
      res = "unsigned int";
  else if(type == "FLOAT")
      res = "float";
  else if(type == "DOUBLE")
      res = "double";
  else
    res = name;
  return res;
}

string getZ3VarData(string type,vector<unsigned char>& data)
{
  string res = "";
  void* ptr = (void*)(&(data[0]));
  if(type == "INT")
  {
      int* pp=(int*)(ptr);
      res = to_string(*pp);
  }else if(type == "UINT")
  {
      unsigned int* pp=(unsigned int*)(ptr);
      res = to_string(*pp);
  }else if(type == "FLOAT")
  {
      float* pp=(float*)(ptr);
      res = to_string(*pp);
  }
  else if(type == "DOUBLE")
  {
      double* pp=(double*)(ptr);
      res = to_string(*pp);
  }else
  {
    int* pp=(int*)(ptr);
    res = to_string(*pp);
  }
  return res;
}


//end add by zhanghui20181025