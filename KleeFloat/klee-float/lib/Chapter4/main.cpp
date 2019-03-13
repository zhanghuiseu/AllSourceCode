#include <iostream>
using namespace std;
#include <Python.h>
int main()
{

    Py_Initialize();//使用python之前，要调用Py_Initialize();这个函数进行初始化
    if (!Py_IsInitialized())
    {
        printf("Python 初始化失败！");
        return 0;
    }
    PyRun_SimpleString("import sys");
    PyRun_SimpleString("sys.path.append('/home/zy/Desktop/Chapter4/')");//这一步很重要，修改Python路径

    PyObject * pModule = NULL;//声明变量
    PyObject * pFunc = NULL;// 声明变量
    pModule = PyImport_ImportModule("chapter4");//这里是要调用的文件名hello.py
    if (pModule == NULL)
    {
        cout << "没找到chapter4.py 文件" << endl;
    }

    pFunc = PyObject_GetAttrString(pModule, "beginSolver");//这里是要调用的函数名
    PyObject* pRet = PyObject_CallObject(pFunc, NULL);//调用函数
    Py_Finalize();//调用Py_Finalize，这个根Py_Initialize相对应的。
    return 0;
}

