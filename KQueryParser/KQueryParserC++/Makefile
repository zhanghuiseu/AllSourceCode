
#By Zhang Hui 

#File for binary file (Final exe file)
BIN = ./bin

#File for Source Code
SRC = ./src
SRC1 = ./src/runtime
SRC2 = ./src/parser
SRC3 = ./src/transfrom

#File for Head code 
INC  = ./include/parser
INC1 = ./include/runtime
INC2 = ./include/runtime/atn
INC3 = ./include/runtime/dfa
INC4 = ./include/runtime/misc
INC5 = ./include/runtime/support
INC6 = ./include/runtime/tree
INC7 = ./include/runtime/tree/pattern
INC8 = ./include/runtime/tree/xpath
INC9  = ./include/transfrom
INC10 = /usr/include/python2.7/

LDFLAGS := /usr/lib/python2.7/config-x86_64-linux-gnu/libpython2.7.so

#obj file
OBJ = ./obj

# cpp File
SOURCE = $(wildcard ${SRC}/*.cpp ${SRC1}/*.cpp ${SRC2}/*.cpp ${SRC3}/*.cpp) 

SOURCE1 = $(wildcard ${SRC3}/*.cpp) 

OBJECT = $(patsubst %.cpp,${OBJ}/%.o,$(notdir ${SOURCE}))

#Final exe name is TARGET 
TARGET = main
BIN_TARGET = ${BIN}/${TARGET}
 
CPP = g++ -std=c++14 
CFLAGS = -g -Wall -fPIC -I${INC} -I${INC1} -I${INC2} -I${INC3} -I${INC4} -I${INC5} -I${INC6} -I${INC7} -I${INC8} -I${INC9} -I${INC10} 

#在调用动态链接库的时候，要把最基础的链接库放到最后，自己写的程序放到最前面
${BIN_TARGET}:${OBJECT}
	$(CPP) ${OBJECT} -o $@  $(LDFLAGS)

${OBJ}/%.o:${SRC}/%.cpp   #cpp file
	$(CPP) $(CFLAGS) -o $@ -c $< 

${OBJ}/%.o:${SRC1}/%.cpp   #cpp file
	$(CPP) $(CFLAGS) -o $@ -c $< 

${OBJ}/%.o:${SRC2}/%.cpp   #cpp file
	$(CPP) $(CFLAGS) -o $@ -c $< 

${OBJ}/%.o:${SRC3}/%.cpp   #cpp file
	$(CPP) $(CFLAGS) -o $@ -c $< 

.PHONY:clean
clean:
	find $(OBJ) -name *.o -exec rm -rf {} \; 
	rm -rf $(BIN_TARGET)
