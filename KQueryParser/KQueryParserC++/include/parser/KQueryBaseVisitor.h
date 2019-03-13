
// Generated from KQuery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"
#include "KQueryVisitor.h"


/**
 * This class provides an empty implementation of KQueryVisitor, which can be
 * extended to create a visitor which only needs to handle a subset of the available methods.
 */
class  KQueryBaseVisitor : public KQueryVisitor {
public:

  virtual antlrcpp::Any visitKquery(KQueryParser::KqueryContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayDeclaration(KQueryParser::ArrayDeclarationContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArrayInitializer(KQueryParser::ArrayInitializerContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstInitializer(KQueryParser::ConstInitializerContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitQueryCommand(KQueryParser::QueryCommandContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitConstraintList(KQueryParser::ConstraintListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEvalExprList(KQueryParser::EvalExprListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitEvalArrayList(KQueryParser::EvalArrayListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitExpression(KQueryParser::ExpressionContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitUpdateList(KQueryParser::UpdateListContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitArithmeticBinaryOp(KQueryParser::ArithmeticBinaryOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitBitwiseBinaryOp(KQueryParser::BitwiseBinaryOpContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitComparisonBinaryOP(KQueryParser::ComparisonBinaryOPContext *ctx) override {
    return visitChildren(ctx);
  }

  virtual antlrcpp::Any visitFpConversionOp(KQueryParser::FpConversionOpContext *ctx) override {
    return visitChildren(ctx);
  }


};

