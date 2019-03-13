/**
	By Zhang Hui 20170602

	Expression canonicalization: we define certain rules for
	canonicalization rules for Exprs in order to simplify code that
	pattern matches Exprs (since the number of forms are reduced), to open
	up further chances for optimization, and to increase similarity for
	caching and other purposes.

	The general rules are:
		No Expr has all constant arguments.

		Booleans:
			Ne, Ugt, Uge, Sgt, Sge are not used 
			The only acceptable operations with boolean arguments are 
				Not And, Or, Xor, Eq, 
		  as well as SExt, ZExt, Select and NotOptimized. 
		The only boolean operation which may involve a constant is boolean not 
		 
		 
	Linear Formulas: 
	   <ol TYPE='a'>
	   <li> For any subtree representing a linear formula, a constant
	   term must be on the LHS of the root node of the subtree.  In particular, 
	   in a BinaryExpr a constant must always be on the LHS.  For example, subtraction 
	   by a constant c is written as <tt>add(-c, ?)</tt>. 

  
	  Width InvalidWidth = 0;
	  Width Bool = 1; //boolean
	  Width Int8 = 8; //char
	  Width Int16 = 16; //short int
	  Width Int32 = 32; //int float  long
	  Width Int64 = 64; //double
	  Width Fl80 = 80; //long double 一般是10，但是也可能是12,16等等
	  上述是KQuery可以处理的Type的长度，除了上述之外的长度均是无法处理的，理论上不应该出现
	   type ID 命名要规范,不可以重叠
  
*/



grammar KQuery;
 
/*
@header
{
package KQueryParser;
}
*/
 

/*
     About The Definition of All Function 
     Binary arithmetic Function
*/
ARITH_ADD  : 'Add'  ;
ARITH_SUB  : 'Sub'  ;
ARITH_MUL  : 'Mul'  ;
ARITH_UDIV : 'UDiv' ;
ARITH_UREM : 'URem' ;
ARITH_SDIV : 'SDiv' ;
ARITH_SREM : 'SRem' ;

/*
   Bitwise Function
*/
BITWISE_NOT  : 'Not'  ;
BITWISE_AND  : 'And'  ;
BITWISE_OR   : 'Or'   ;
BITWISE_XOR  : 'Xor'  ; 
BITWISE_SHL  : 'Shl'  ;
BITWISE_LSHR : 'LShr' ;
BITWISE_ASHR : 'AShr' ;

/*
   Comparison Function
*/
CMP_EQ  : 'Eq'  ;
CMP_NE  : 'Ne'  ;
CMP_ULT : 'Ult' ;
CMP_ULE : 'Ule' ;
CMP_UGT : 'Ugt' ;
CMP_UGE : 'Uge' ;
CMP_SLT : 'Slt' ;
CMP_SLE : 'Sle' ;
CMP_SGT : 'Sgt' ;
CMP_SGE : 'Sge' ;

//Added By ZhuBoLun
CMP_FOGE: 'FOGe' ;
CMP_FOGT: 'FOGt' ;
CMP_FOLE: 'FOLe' ;
CMP_FOLT: 'FOLt' ;
CMP_FOEQ: 'FOEq' ;

/*
  Special Function
*/  
SP_CONCAT  : 'Concat'  ;
SP_EXTRACT : 'Extract' ;
SP_ZEXT    : 'ZExt'    ; 
SP_SEXT    : 'SExt'    ;
SP_READ    : 'Read'    ;
SP_SELECT  : 'Select'  ;
SP_NEG     : 'Neg'     ;
SP_READLSB : 'ReadLSB' ;
SP_READMSB : 'ReadMSB' ;

/*
	For KleeFp Spectial Function
        I <-> F Conversion
*/
FP_UITOFP  : 'UIToFP'  ;  
FP_SITOFP  : 'SIToFP'  ;
FP_FPTOUI  : 'FPToUI'  ;
FP_FPTOSI  : 'FPToSI'  ;
FP_FPEXT   : 'FPExt'   ;
FP_FPTRUNC : 'FPTrunc' ;
  
/*
   KleeFp  Functions
*/
FP_ARITH_FADD : 'FAdd' ;
FP_ARITH_FSUB : 'FSub' ;
FP_ARITH_FMUL : 'FMul' ;
FP_ARITH_FDIV : 'FDiv' ;
FP_ARITH_FREM : 'FRem' ;
  
FP_FCMP       : 'FCmp' ;

/*

    显示暂时不知道如何处理的，所以忽略
    // Unary NaN check
    FOrd1,
    Any,
    // Unary FP  kleeFp好像不支持这些运算
    FSqrt, FCos,  FSin,
*/

/*
	main KQuery Language For 
*/

kquery : ( arrayDeclaration | queryCommand )+ ;

/*
	KQuery Array Declaration Part
*/
arrayDeclaration : 'array' IDENTIFIER '[' NUMBER ']' ':' TYPE '->'TYPE '=' arrayInitializer 
                 | 'array' IDENTIFIER '[' ']' ':' TYPE '->'TYPE '=' '[' constInitializer ']' ;

arrayInitializer : 'symbolic' | '[' constInitializer ']' ;

//Added By ZhuBoLun 逗号似乎无用，其实直接空格即可
constInitializer : constInitializer ',' NUMBER | NUMBER   
                 | constInitializer NUMBER|NUMBER;

/*
	KQuery Query Command Part
*/

queryCommand : '(' 'query' constraintList expression ')'  
             | '(' 'query' constraintList expression evalExprList evalArrayList ')' ;

constraintList :  '['  (expression)*  ']'  ;

/*
    一般下面两项不会出现,至少目前不会出现
*/
evalExprList   :  '['  (expression)*  ']'  ;
evalArrayList  :  '['  (IDENTIFIER)*  ']'  ; 


/*
   Attention: 来到这里你会发现,这里其实针对运算的优先级并没有做太多的区分和定义,为什么呢?
              因为每一个运算都是按照一个expression的形式出现,同时每一个expression都是代表着某一个运算,比如Add或者Mul
	      这里不会出现这种形式 a Add b Mul c 的运算, 因为他就需要优先级, 因为这个计算的优先级在我们难道KQuery格式的
              约束已经定义好了,我们直接按照相关的操作区解析即可.所以这里没有考虑优先级,这并不代表着不需要考虑,在我们转换
  	      为我们需要的约束格式的时候, 就必须考虑优先级 

*/

expression : IDENTIFIER ':' expression  
                        /*
				arithmeticBinaryOp must have Type
			*/
			| '('  arithmeticBinaryOp  TYPE  expression  expression  ')'

			/*
				bitwiseBinaryOp May not Have Type
			*/
			| '('  BITWISE_NOT         TYPE  expression  ')'
			| '('  BITWISE_NOT               expression  ')'
			| '('  bitwiseBinaryOp     TYPE  expression  expression  ')'
			| '('  bitwiseBinaryOp           expression  expression  ')'

			/*
				comparisonBinaryOP May not Have Type
			*/
			| '('  comparisonBinaryOP  TYPE   expression  expression  ')'
			| '('  comparisonBinaryOP         expression  expression  ')'


			| '(' SP_CONCAT  TYPE  expression  expression  ')'
			| '(' SP_CONCAT        expression  expression  ')'

			| '(' SP_EXTRACT TYPE  expression  expression  ')'
			| '(' SP_ZEXT    TYPE  expression  ')'
			| '(' SP_SEXT    TYPE  expression  ')'
			| '(' SP_READ    TYPE  expression  expression  ')'
			| '(' SP_SELECT  TYPE  expression  expression  expression  ')'

			| '(' SP_NEG     TYPE  expression  ')'
			| '(' SP_NEG           expression  ')'

			| '(' SP_READLSB TYPE  expression  expression  ')'
			| '(' SP_READMSB TYPE  expression  expression  ')'  

			/*
			   The Following is For KleeFp
			*/
			| '('  FP_FCMP         expression  expression  expression  ')'  
			| '('  fpConversionOp  TYPE  expression  ')'
			| '('  FP_FPEXT        TYPE  expression  ')'
			| '('  FP_FPTRUNC      TYPE  expression  ')'  

			/*
			    Version, this is for Array Write
			*/
			| '[' updateList ']'   '@'   IDENTIFIER 
			| '['            ']'   '@'   IDENTIFIER

			/*
			    Tremin 
		        */
			| '('  TYPE  NUMBER        ')'
			| '('  TYPE  IDENTIFIER    ')'
			| IDENTIFIER
			| NUMBER  ;

/*
    Version, this is for Array Write
*/
updateList : ','  expression  '='  expression  |  expression  '='  expression;


/*
	All Functions
*/	   
arithmeticBinaryOp :  ARITH_ADD | ARITH_SUB | ARITH_MUL | ARITH_UDIV | ARITH_UREM | ARITH_SDIV | ARITH_SREM
					| FP_ARITH_FADD | FP_ARITH_FSUB | FP_ARITH_FMUL 
					| FP_ARITH_FDIV | FP_ARITH_FREM ;

bitwiseBinaryOp :  BITWISE_AND | BITWISE_OR | BITWISE_XOR | BITWISE_SHL | BITWISE_LSHR | BITWISE_ASHR ;

//Added By ZhuBoLun
comparisonBinaryOP :  CMP_EQ | CMP_NE | CMP_ULT | CMP_ULE | CMP_UGT | CMP_UGE | CMP_SLT | CMP_SLE | CMP_SGT | CMP_SGE | CMP_FOGE | CMP_FOGT | CMP_FOLE | CMP_FOLT | CMP_FOEQ;

fpConversionOp : FP_UITOFP | FP_SITOFP | FP_FPTOUI | FP_FPTOSI ;


/*
	Signed Unmber And Unsigned Number 
*/
NUMBER : 'true' | 'false' | SIGNED_CONSTANT | UNSIGNED_CONSTANT | SCIENTIFIC_CONSTANT ;
SIGNED_CONSTANT : ( '+' | '-' ) UNSIGNED_CONSTANT  ;
UNSIGNED_CONSTANT : DEC_CONSTANT | BIN_CONSTANT | OCT_CONSTANT | HEX_CONSTANT  ;
DEC_CONSTANT : [0-9_]+  ;
BIN_CONSTANT :  '0b' [01_]+  ;
OCT_CONSTANT :  '0o' [0-7_]+  ;
HEX_CONSTANT :  '0x' [0-9a-fA-F_]+  ;

//Added By ZhuBoLun
SCIENTIFIC_CONSTANT : ('+' | '-')?[0-9]+'.'[0-9]+'E'('+' | '-')[0-9]+ ;


/*
	Identifier and TYPE
*/
TYPE : 'w' [0-9]+  ;
IDENTIFIER : [a-zA-Z] [a-zA-Z0-9_]* ;  //[a-zA-Z]+; //;  

WS          : [ \t\n\r]+ -> skip ;










