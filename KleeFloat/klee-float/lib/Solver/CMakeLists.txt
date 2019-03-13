#===------------------------------------------------------------------------===#
#
#                     The KLEE Symbolic Virtual Machine
#
# This file is distributed under the University of Illinois Open Source
# License. See LICENSE.TXT for details.
#
#===------------------------------------------------------------------------===#
klee_add_component(kleaverSolver
  AssignmentValidatingSolver.cpp
  CachingSolver.cpp
  CexCachingSolver.cpp
  ConstantDivision.cpp
  CoreSolver.cpp
  DummySolver.cpp
  FastCexSolver.cpp
  IncompleteSolver.cpp
  IndependentSolver.cpp
  MetaSMTSolver.cpp
  KQueryLoggingSolver.cpp
  QueryLoggingSolver.cpp
  SMTLIBLoggingSolver.cpp
  Solver.cpp
  SolverImpl.cpp
  SolverStats.cpp
  STPBuilder.cpp
  STPSolver.cpp
  ValidatingSolver.cpp
  Z3Builder.cpp
  Z3Solver.cpp
  
  LFFSolver.cpp  #add by zhanghui 20181025
  PLFFSolver.cpp #add by zhanghui 20181025
  CacheFlag.cpp  #add by zhanghui 20181110
)

set(LLVM_COMPONENTS
  support
)
klee_get_llvm_libs(LLVM_LIBS ${LLVM_COMPONENTS})
target_link_libraries(kleaverSolver PUBLIC ${LLVM_LIBS})

#add By ShaMeng
add_definitions("-std=c++14")
include_directories(/home/zy/C++/KQueryParserC++/include/transfrom /home/zy/C++/KQueryParserC++/include/runtime /home/zy/C++/KQueryParserC++/include/parser /usr/include/python2.7)
link_directories(/usr/lib /usr/lib/python2.7)
target_link_libraries(kleaverSolver PUBLIC ${LLVM_LIBS} liblffsolver.so /usr/lib/python2.7/config-x86_64-linux-gnu/libpython2.7.so)    
#add byShaMeng


target_link_libraries(kleaverSolver PRIVATE
  kleeBasic
  kleaverExpr
  kleeSupport
  ${KLEE_SOLVER_LIBRARIES})

