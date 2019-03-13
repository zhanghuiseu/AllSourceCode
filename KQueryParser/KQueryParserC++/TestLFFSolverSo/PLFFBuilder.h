#ifndef PLFFBUILDER_H_INCLUDED
#define PLFFBUILDER_H_INCLUDED


#ifdef __cplusplus
extern "C" {
#endif

/*
    LFF Solver的接口
    const char* kqueryChar:kquery的待解析的约束
    const char* solverPath:solver的位置
    char* &symbolicType,解析出来的运算符类型
    char* &symbolicName:解析出来的运算符列表
    char* &symbolicFinalConstraint：解析出来的约束列表
    bool &isVaild:约束的vaild
    int &resType:返回类型 处理求解结果,1表示有解,0表示无解,-1表示状态不正确
    double &coverage:覆盖率
    char* &solverRes:solver的结果
*/
    bool beginParserAndPLFFSolver(const char* kqueryChar,const char* solverPathChar,
                               char* &symbolicType,
                               char* &symbolicName,
                               char* &symbolicFinalConstraint,
                               bool &isVaild,int &resType,double &coverage,char* &solverRes
                               );


#ifdef __cplusplus
}
#endif

#endif // PLFFBUILDER_H_INCLUDED
