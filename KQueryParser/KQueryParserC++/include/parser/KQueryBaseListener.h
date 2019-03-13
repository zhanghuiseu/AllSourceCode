
// Generated from KQuery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"
#include "KQueryListener.h"


/**
 * This class provides an empty implementation of KQueryListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  KQueryBaseListener : public KQueryListener {
public:

  virtual void enterKquery(KQueryParser::KqueryContext * /*ctx*/) override { }
  virtual void exitKquery(KQueryParser::KqueryContext * /*ctx*/) override { }

  virtual void enterArrayDeclaration(KQueryParser::ArrayDeclarationContext * /*ctx*/) override { }
  virtual void exitArrayDeclaration(KQueryParser::ArrayDeclarationContext * /*ctx*/) override { }

  virtual void enterArrayInitializer(KQueryParser::ArrayInitializerContext * /*ctx*/) override { }
  virtual void exitArrayInitializer(KQueryParser::ArrayInitializerContext * /*ctx*/) override { }

  virtual void enterConstInitializer(KQueryParser::ConstInitializerContext * /*ctx*/) override { }
  virtual void exitConstInitializer(KQueryParser::ConstInitializerContext * /*ctx*/) override { }

  virtual void enterQueryCommand(KQueryParser::QueryCommandContext * /*ctx*/) override { }
  virtual void exitQueryCommand(KQueryParser::QueryCommandContext * /*ctx*/) override { }

  virtual void enterConstraintList(KQueryParser::ConstraintListContext * /*ctx*/) override { }
  virtual void exitConstraintList(KQueryParser::ConstraintListContext * /*ctx*/) override { }

  virtual void enterEvalExprList(KQueryParser::EvalExprListContext * /*ctx*/) override { }
  virtual void exitEvalExprList(KQueryParser::EvalExprListContext * /*ctx*/) override { }

  virtual void enterEvalArrayList(KQueryParser::EvalArrayListContext * /*ctx*/) override { }
  virtual void exitEvalArrayList(KQueryParser::EvalArrayListContext * /*ctx*/) override { }

  virtual void enterExpression(KQueryParser::ExpressionContext * /*ctx*/) override { }
  virtual void exitExpression(KQueryParser::ExpressionContext * /*ctx*/) override { }

  virtual void enterUpdateList(KQueryParser::UpdateListContext * /*ctx*/) override { }
  virtual void exitUpdateList(KQueryParser::UpdateListContext * /*ctx*/) override { }

  virtual void enterArithmeticBinaryOp(KQueryParser::ArithmeticBinaryOpContext * /*ctx*/) override { }
  virtual void exitArithmeticBinaryOp(KQueryParser::ArithmeticBinaryOpContext * /*ctx*/) override { }

  virtual void enterBitwiseBinaryOp(KQueryParser::BitwiseBinaryOpContext * /*ctx*/) override { }
  virtual void exitBitwiseBinaryOp(KQueryParser::BitwiseBinaryOpContext * /*ctx*/) override { }

  virtual void enterComparisonBinaryOP(KQueryParser::ComparisonBinaryOPContext * /*ctx*/) override { }
  virtual void exitComparisonBinaryOP(KQueryParser::ComparisonBinaryOPContext * /*ctx*/) override { }

  virtual void enterFpConversionOp(KQueryParser::FpConversionOpContext * /*ctx*/) override { }
  virtual void exitFpConversionOp(KQueryParser::FpConversionOpContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

