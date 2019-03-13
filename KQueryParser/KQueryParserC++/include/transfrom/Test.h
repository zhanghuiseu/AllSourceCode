#ifndef TEST_H_INCLUDED
#define TEST_H_INCLUDED

    #include <iostream>
    #include <vector>
    #include <string>
    #include <string.h>
    #include <regex>
    #include <map>


    #include "SymbolicVar.h"
    #include "Transform.h"
    #include "string.h"
    #include "ArrayElement.h"
    #include "time.h"
    #include "Expression.h"


    using namespace std;



class Test
{
public:
    static void testCalaRuntimeValue(vector< Expression* > expList);
};

void testCalaRuntimeValue(vector< Expression* > expList)
{

}
#endif // TEST_H_INCLUDED
