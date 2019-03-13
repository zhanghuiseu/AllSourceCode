
// Generated from KQuery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"
#include "KQueryParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by KQueryParser.
 */
class  KQueryListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterKquery(KQueryParser::KqueryContext *ctx) = 0;
  virtual void exitKquery(KQueryParser::KqueryContext *ctx) = 0;

  virtual void enterArrayDeclaration(KQueryParser::ArrayDeclarationContext *ctx) = 0;
  virtual void exitArrayDeclaration(KQueryParser::ArrayDeclarationContext *ctx) = 0;

  virtual void enterArrayInitializer(KQueryParser::ArrayInitializerContext *ctx) = 0;
  virtual void exitArrayInitializer(KQueryParser::ArrayInitializerContext *ctx) = 0;

  virtual void enterConstInitializer(KQueryParser::ConstInitializerContext *ctx) = 0;
  virtual void exitConstInitializer(KQueryParser::ConstInitializerContext *ctx) = 0;

  virtual void enterQueryCommand(KQueryParser::QueryCommandContext *ctx) = 0;
  virtual void exitQueryCommand(KQueryParser::QueryCommandContext *ctx) = 0;

  virtual void enterConstraintList(KQueryParser::ConstraintListContext *ctx) = 0;
  virtual void exitConstraintList(KQueryParser::ConstraintListContext *ctx) = 0;

  virtual void enterEvalExprList(KQueryParser::EvalExprListContext *ctx) = 0;
  virtual void exitEvalExprList(KQueryParser::EvalExprListContext *ctx) = 0;

  virtual void enterEvalArrayList(KQueryParser::EvalArrayListContext *ctx) = 0;
  virtual void exitEvalArrayList(KQueryParser::EvalArrayListContext *ctx) = 0;

  virtual void enterExpression(KQueryParser::ExpressionContext *ctx) = 0;
  virtual void exitExpression(KQueryParser::ExpressionContext *ctx) = 0;

  virtual void enterUpdateList(KQueryParser::UpdateListContext *ctx) = 0;
  virtual void exitUpdateList(KQueryParser::UpdateListContext *ctx) = 0;

  virtual void enterArithmeticBinaryOp(KQueryParser::ArithmeticBinaryOpContext *ctx) = 0;
  virtual void exitArithmeticBinaryOp(KQueryParser::ArithmeticBinaryOpContext *ctx) = 0;

  virtual void enterBitwiseBinaryOp(KQueryParser::BitwiseBinaryOpContext *ctx) = 0;
  virtual void exitBitwiseBinaryOp(KQueryParser::BitwiseBinaryOpContext *ctx) = 0;

  virtual void enterComparisonBinaryOP(KQueryParser::ComparisonBinaryOPContext *ctx) = 0;
  virtual void exitComparisonBinaryOP(KQueryParser::ComparisonBinaryOPContext *ctx) = 0;

  virtual void enterFpConversionOp(KQueryParser::FpConversionOpContext *ctx) = 0;
  virtual void exitFpConversionOp(KQueryParser::FpConversionOpContext *ctx) = 0;


};

