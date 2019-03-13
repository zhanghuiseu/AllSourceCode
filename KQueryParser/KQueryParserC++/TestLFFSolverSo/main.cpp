#include <iostream>
#include <string>
#include "IntervalPoint.h"
#include "LFFBuilder.h"
#include "PLFFBuilder.h"
#include "InverseIIBasedOIBuilder.h"

#include<unistd.h>
#include<sys/types.h>
#include<sys/wait.h>

using namespace std;


int main()
{

	  string solverpath="/home/zy/C++/KQueryParserC++/Solver/LFFSolver.jar";
      char* type = NULL;
	  char* name = NULL;
	  char* constraint = NULL;
	  bool isVaild;
	  int resType;
	  double coverage;
	  char* solverRes=NULL;
	  bool flag;


	  string kqueryStr ="array DOUBLE_doubleA[8] : w32 -> w8 = symbolic array INT_intB[4] : w32 -> w8 = symbolic ( query [(FCmp (ReadLSB w64 0 DOUBLE_doubleA) 13835733595226269286 13) (Eq false (Eq 1 (ReadLSB w32 0 INT_intB)))] false)";
      kqueryStr = "array DOUBLE_intA[8] : w32 -> w8 = symbolic array DOUBLE_intB[8] : w32 -> w8 = symbolic (query [(FOGe N0:(ReadLSB w64 0 DOUBLE_intA) N1:(ReadLSB w64 0 DOUBLE_intB)) (FOGe N1 5.2999999999999998E+0) (FOEq N0 1.23E+2)] false [] [DOUBLE_intA DOUBLE_intB])";
      kqueryStr="array DOUBLE_ARRAY_1_5_doubleA[40] : w32 -> w8 = symbolic array INT_ARRAY_1_5_intB[20] : w32 -> w8 = symbolic (query [(FOGe (ReadLSB w64 0 DOUBLE_ARRAY_1_5_doubleA) (SIToFP w64 (ReadLSB w32 0 INT_ARRAY_1_5_intB))) (FOGt (ReadLSB w64 8 DOUBLE_ARRAY_1_5_doubleA) 3.3330000000000002E+0)] false [] [DOUBLE_ARRAY_1_5_doubleA INT_ARRAY_1_5_intB])";
      //kqueryStr="array DOUBLE_doubleB[8] : w32 -> w8 = symbolic (query [(FOLe N0:(ReadLSB w64 0 DOUBLE_doubleB) -1.0E+2) (FOLe N1:(FAdd w64 N0 1.0E+0) -1.0E+2) (FOLe N2:(FAdd w64 N1 1.0E+0) -1.0E+2) (FOLe N3:(FAdd w64 N2 1.0E+0) -1.0E+2) (FOLe N4:(FAdd w64 N3 1.0E+0) -1.0E+2) (FOLe N5:(FAdd w64 N4 1.0E+0) -1.0E+2) (FOLe N6:(FAdd w64 N5 1.0E+0) -1.0E+2) (FOLe N7:(FAdd w64 N6 1.0E+0) -1.0E+2) (FOLe N8:(FAdd w64 N7 1.0E+0) -1.0E+2) (FOLe N9:(FAdd w64 N8 1.0E+0) -1.0E+2) (FOLe N10:(FAdd w64 N9 1.0E+0) -1.0E+2) (FOLe N11:(FAdd w64 N10 1.0E+0) -1.0E+2) (FOLe N12:(FAdd w64 N11 1.0E+0) -1.0E+2) (FOLe N13:(FAdd w64 N12 1.0E+0) -1.0E+2) (FOLe N14:(FAdd w64 N13 1.0E+0) -1.0E+2) (FOLe N15:(FAdd w64 N14 1.0E+0) -1.0E+2) (FOLe N16:(FAdd w64 N15 1.0E+0) -1.0E+2) (FOLe N17:(FAdd w64 N16 1.0E+0) -1.0E+2) (FOLe N18:(FAdd w64 N17 1.0E+0) -1.0E+2) (FOLe N19:(FAdd w64 N18 1.0E+0) -1.0E+2) (FOLe N20:(FAdd w64 N19 1.0E+0) -1.0E+2) (FOLe N21:(FAdd w64 N20 1.0E+0) -1.0E+2) (FOLe N22:(FAdd w64 N21 1.0E+0) -1.0E+2) (FOLe N23:(FAdd w64 N22 1.0E+0) -1.0E+2) (FOLe N24:(FAdd w64 N23 1.0E+0) -1.0E+2) (FOLe N25:(FAdd w64 N24 1.0E+0) -1.0E+2) (FOLe N26:(FAdd w64 N25 1.0E+0) -1.0E+2) (FOLe N27:(FAdd w64 N26 1.0E+0) -1.0E+2) (FOLe N28:(FAdd w64 N27 1.0E+0) -1.0E+2) (FOLe N29:(FAdd w64 N28 1.0E+0) -1.0E+2) (FOLe N30:(FAdd w64 N29 1.0E+0) -1.0E+2) (FOLe N31:(FAdd w64 N30 1.0E+0) -1.0E+2) (FOLe N32:(FAdd w64 N31 1.0E+0) -1.0E+2)(FOLe N33:(FAdd w64 N32 1.0E+0) -1.0E+2) (FOLe N34:(FAdd w64 N33 1.0E+0) -1.0E+2) (FOLe N35:(FAdd w64 N34 1.0E+0) -1.0E+2) (FOLe N36:(FAdd w64 N35 1.0E+0) -1.0E+2) (FOLe N37:(FAdd w64 N36 1.0E+0) -1.0E+2) (FOLe N38:(FAdd w64 N37 1.0E+0) -1.0E+2) (FOLe N39:(FAdd w64 N38 1.0E+0) -1.0E+2) (FOLe N40:(FAdd w64 N39 1.0E+0) -1.0E+2) (FOLe N41:(FAdd w64 N40 1.0E+0) -1.0E+2) (FOLe N42:(FAdd w64 N41 1.0E+0) -1.0E+2) (FOLe N43:(FAdd w64 N42 1.0E+0) -1.0E+2) (FOLe N44:(FAdd w64 N43 1.0E+0) -1.0E+2) (FOLe N45:(FAdd w64 N44 1.0E+0) -1.0E+2) (FOLe N46:(FAdd w64 N45 1.0E+0) -1.0E+2) (FOLe N47:(FAdd w64 N46 1.0E+0) -1.0E+2) (FOLe N48:(FAdd w64 N47 1.0E+0) -1.0E+2) (FOLe N49:(FAdd w64 N48 1.0E+0) -1.0E+2) (FOLe N50:(FAdd w64 N49 1.0E+0) -1.0E+2) (FOLe N51:(FAdd w64 N50 1.0E+0) -1.0E+2) (FOLe N52:(FAdd w64 N51 1.0E+0) -1.0E+2) (FOLe N53:(FAdd w64 N52 1.0E+0) -1.0E+2) (FOLe N54:(FAdd w64 N53 1.0E+0) -1.0E+2) (FOLe N55:(FAdd w64 N54 1.0E+0) -1.0E+2) (FOLe N56:(FAdd w64 N55 1.0E+0) -1.0E+2) (FOLe N57:(FAdd w64 N56 1.0E+0) -1.0E+2) (FOLe (FAdd w64 N57 1.0E+0) -1.0E+2)] false)";
      //kqueryStr="array INT_intK[4] : w32 -> w8 = symbolic (query [(Slt 0 N0:(Add w32 1 (Mul w32 2 N1:(ReadLSB w32 0 INT_intK)))) (Slt 1 N0) (Eq false (Slt 3 N0))] (Eq false (Eq 0 (SRem w32 N1 2))))";
      kqueryStr="array INT_C1x1[4] : w32 -> w8 = symbolic array INT_C1x2[4] : w32 -> w8 = symbolic array INT_C1z1[4] : w32 -> w8 = symbolic array INT_C1z2[4] : w32 -> w8 = symbolic array LONG_C1y1[8] : w32 -> w8 = symbolic array LONG_C1y2[8] : w32 -> w8 = symbolic (query [(Eq (Add w32 (Mul w32 31 (Add w32 (Mul w32 31 (ReadLSB w32 0 INT_C1x1)) (Extract w32 0 (Xor w64 N0:(ReadLSB w64 0 LONG_C1y1) (AShr w64 N0 32))))) (ReadLSB w32 0 INT_C1z1)) (Add w32 (Mul w32 31  (Add w32 (Mul w32 31 (ReadLSB w32 0 INT_C1x2)) (Extract w32 0 (Xor w64 N1:(ReadLSB w64 0 LONG_C1y2) (AShr w64 N1 32))))) (ReadLSB w32 0 INT_C1z2)))] false)";
      kqueryStr="array DOUBLE_x[8] : w32 -> w8 = symbolic (query [(Eq 2047 (Extract w32 0 (And w64 (AShr w64 N0:(FPToSI w64 (ReadLSB w64 0 DOUBLE_x)) 52) 2047)))] false)";
      //kqueryStr="array DOUBLE_x[8] : w32 -> w8 = symbolic (query [(Eq 2047  (Extract w32 0 (And w64 (AShr w64 N0:(FPToSI w64 (ReadLSB w64 0 DOUBLE_x)) 52) 2047)))  (Eq false (Slt 0 (Extract w32 0 (And w64 (AShr w64 N0 31) 1048575)))) (Eq false  (Slt 0 (Extract w32 0 (And w64 N0 4294967295))))] false)";
      kqueryStr="(query [] false)";
      //kqueryStr="array INT_b[4] : w32 -> w8 = symbolic (query [] (Eq false (Slt 2 (ReadLSB w32 0 INT_b))))";
      //kqueryStr="array INT_a[4] : w32 -> w8 = symbolic array INT_b[4] : w32 -> w8 = symbolic (query [(Slt 2 N0:(ReadLSB w32 0 INT_b))] (Eq false (Eq N0 (Mul w32 (ReadLSB w32 0 INT_a) N0))))";
      kqueryStr = "array DOUBLE_x[8] : w32 -> w8 = symbolic array DOUBLE_y[8] : w32 -> w8 = symbolic (query [(Eq false (And (And (FOGt (FMul w64 N0:(ReadLSB w64 0 DOUBLE_x) N1:(ReadLSB w64 0 DOUBLE_y)) 0.0E+0) (FOLt N0 0.0E+0)) (FOLt N1 0.0E+0)))] (Eq false (FOGe N1 3.2999999999999998E+0)))";


      //基于输出的输入区间生成example
      kqueryStr = "array DOUBLE_a[8] : w32 -> w8 = symbolic array DOUBLE_b[8] : w32 -> w8 = symbolic (query [(FOGe N0:(FAdd w64 1.0E+0 (FMul w64 N1:(ReadLSB w64 0 DOUBLE_b) (FAdd w64 3.5156228999999999E+0 (FMul w64 N2:(ReadLSB w64 0 DOUBLE_a) (FAdd w64 3.0899424E+0 (FMul w64 N1 (FAdd w64 1.2067492E+0 (FMul w64 N2 (FAdd w64 2.6597320000000002E-1 (FMul w64 N1 (FAdd w64 3.6076799999999999E-2 (FMul w64 N1 4.5813E-3)))))))))))) 0.0E+0) (FOLe N0 2.0E+0)] false)";
      //kqueryStr = "array DOUBLE_a[8] : w32 -> w8 = symbolic array DOUBLE_b[8] : w32 -> w8 = symbolic (query [(FOGe N0:(FAdd w64 (ReadLSB w64 0 DOUBLE_a) (ReadLSB w64 0 DOUBLE_b)) 0.0E+0) (FOLe N0 2.0E+0)] false)";
      //kqueryStr = "array a[8] : w32 -> w8 = symbolic array b[8] : w32 -> w8 = symbolic (query [(FOGe N0:(FAdd w64 1.0E+0 (FMul w64 N1:(ReadLSB w64 0 b) (FAdd w64 3.5156228999999999E+0 (FMul w64 N2:(ReadLSB w64 0 a) (FAdd w64 3.0899424E+0 (FMul w64 N1 (FAdd w64 1.2067492E+0 (FMul w64 N2 (FAdd w64 2.6597320000000002E-1 (FMul w64 N1 (FAdd w64 3.6076799999999999E-2 (FMul w64 N1 4.5813E-3)))))))))))) 0.0E+0) (FOLe N0 2.0E+0)] false)";

      kqueryStr = "array DOUBLE_ax[8] : w32 -> w8 = symbolic array DOUBLE_bx[8] : w32 -> w8 = symbolic array DOUBLE_cx[8] : w32 -> w8 = symbolic array DOUBLE_tol[8] : w32 -> w8 = symbolic (query [(Eq false             (FOLe (Select w64 (FOGe N0:(FSub w64 N1:(ReadLSB w64 0 DOUBLE_bx)                                                  N2:(FMul w64 5.0E-1                               (FAdd w64 N3:(Select w64 (FOLt N4:(ReadLSB w64 0 DOUBLE_ax)                                                                                              N5:(ReadLSB w64 0 DOUBLE_cx))                                                                                    N4                                                                                       N5)                                                                        N6:(Select w64 (FOGt N4 N5) N4 N5))))                                     0.0E+0)                               N0                               -1.0E+0)                   (FSub w64 (FMul w64 2.0E+0                                       N7:(FAdd w64 (FMul w64 (ReadLSB w64 0 DOUBLE_tol)                                                             (Select w64 (FOGe N1 0.0E+0) N1 -1.0E+0))                                                    2.2204499999999999E-19))                             (FMul w64 5.0E-1 (FSub w64 N6 N3)))))         (FOGt 0 N7)         (FOGe (Select w64 (FOGe N8:(FSub w64 N9:(FMul w64 N10:(FSub w64 N1 N1)                                                           N11:(FMul w64 N10 N10))                                              N9)                                 0.0E+0)                           N8                           -1.0E+0)               (Select w64 (FOGe N12:(FMul w64 (FMul w64 5.0E-1                                                         (Select w64 (FOGe N13:(FMul w64 2.0E+0 (FSub w64 N11 N11))                                                                           0.0E+0)                                                                    N13                                                                     -1.0E+0))                                               0)                                 0.0E+0)                           N12                           -1.0E+0))         (FOGe N1 N2)         (Eq false            (FOGe (Select w64 (FOGe N14:(FMul w64 3.8196600000000003E-1 (FSub w64 N3 N1))                                     0.0E+0)                               N14                               -1.0E+0)                   N7))         (Eq false             (FOGe (FPTrunc w32 N14) 0.0E+0))]        (Eq false            (FOGe (FAdd w64 N1 N7) N1))) ";


	  solverpath="/home/zy/C++/KQueryParserC++/Solver/LFFSolver.jar";
	  flag = beginParserAndSolver(kqueryStr.c_str(),solverpath.c_str(),type,name,constraint,isVaild,resType,coverage,solverRes);
      delete []type;
      delete []name;
      delete []constraint;
      delete []solverRes;
    return 1;
/*
      solverpath = "/home/zy/cudaWorkspaceServer/JavaJar/AGPC.jar";
      flag = beginParserAndPLFFSolver(kqueryStr.c_str(),solverpath.c_str(),type,name,constraint,isVaild,resType,coverage,solverRes);
      delete []type;
      delete []name;
      delete []constraint;
      delete []solverRes;
*/



      //kqueryStr = "array DOUBLE_a[8] : w32 -> w8 = symbolic array DOUBLE_b[8] : w32 -> w8 = symbolic (query [(FOGe N0:(FAdd w64 1.0E+0 (FMul w64 N1:(ReadLSB w64 0 DOUBLE_b) (FAdd w64 3.5156228999999999E+0 (FMul w64 N2:(ReadLSB w64 0 DOUBLE_a) (FAdd w64 3.0899424E+0 (FMul w64 N1 (FAdd w64 1.2067492E+0 (FMul w64 N2 (FAdd w64 2.6597320000000002E-1 (FMul w64 N1 (FAdd w64 3.6076799999999999E-2 (FMul w64 N1 4.5813E-3)))))))))))) 0.0E+0) (FOLe N0 2.0E+0)] false)";
      //kqueryStr = "array DOUBLE_a[8] : w32 -> w8 = symbolic array DOUBLE_b[8] : w32 -> w8 = symbolic (query [(FOGe N0:(FAdd w64 (ReadLSB w64 0 DOUBLE_a) (ReadLSB w64 0 DOUBLE_b)) 0.0E+0) (FOLe N0 2.0E+0)] false)";
      //kqueryStr="array DOUBLE_a[8] : w32 -> w8 = symbolic array DOUBLE_b[8] : w32 -> w8 = symbolic (query [(FOGe N0:(FAdd w64 (FSub w64 (FMul w64 (ReadLSB w64 0 DOUBLE_a) (ReadLSB w64 0 DOUBLE_b)) 1.1000000000000001E+0) 2.2000000000000002E+0) 0.0E+0) (FOLe N0 2.0E+0)] false)";
      kqueryStr="array DOUBLE_a[8] : w32 -> w8 = symbolic array DOUBLE_b[8] : w32 -> w8 = symbolic (query [(Eq false (And (FOGe N0:(FAdd w64 (FSub w64 (FMul w64 (ReadLSB w64 0 DOUBLE_a) (ReadLSB w64 0 DOUBLE_b)) 1.1000000000000001E+0) 2.2000000000000002E+0) 0.0E+0) (FOLe N0 2.0E+0)))] false)";

      //Inverse Input Interval Based on Output Interval
      solverpath="/home/zy/C++/KQueryParserC++/Solver/LFFSolver.jar";
	  flag = beginParserAndInverseIIBasedOI(kqueryStr.c_str(),solverpath.c_str(),type,name,constraint,isVaild,resType,coverage,solverRes);
      delete []type;
      delete []name;
      delete []constraint;
      delete []solverRes;

/*
      IntervalPoint DOUBLE_a = IntervalPoint(0.0,5.0);
      IntervalPoint DOUBLE_b = IntervalPoint(0.0,5.0);
      IntervalPoint res = (((DOUBLE_a*DOUBLE_b)-1.1000000000000001E+0)+2.2000000000000002E+0);
      cout<<"Verfin Cala RES:  "<<res<<endl;
*/

	  return 0;
}







