
// Generated from KQuery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"
#include "KQueryParser.h"



/**
 * This class defines an abstract visitor for a parse tree
 * produced by KQueryParser.
 */
class  KQueryVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by KQueryParser.
   */
    virtual antlrcpp::Any visitKquery(KQueryParser::KqueryContext *context) = 0;

    virtual antlrcpp::Any visitArrayDeclaration(KQueryParser::ArrayDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitArrayInitializer(KQueryParser::ArrayInitializerContext *context) = 0;

    virtual antlrcpp::Any visitConstInitializer(KQueryParser::ConstInitializerContext *context) = 0;

    virtual antlrcpp::Any visitQueryCommand(KQueryParser::QueryCommandContext *context) = 0;

    virtual antlrcpp::Any visitConstraintList(KQueryParser::ConstraintListContext *context) = 0;

    virtual antlrcpp::Any visitEvalExprList(KQueryParser::EvalExprListContext *context) = 0;

    virtual antlrcpp::Any visitEvalArrayList(KQueryParser::EvalArrayListContext *context) = 0;

    virtual antlrcpp::Any visitExpression(KQueryParser::ExpressionContext *context) = 0;

    virtual antlrcpp::Any visitUpdateList(KQueryParser::UpdateListContext *context) = 0;

    virtual antlrcpp::Any visitArithmeticBinaryOp(KQueryParser::ArithmeticBinaryOpContext *context) = 0;

    virtual antlrcpp::Any visitBitwiseBinaryOp(KQueryParser::BitwiseBinaryOpContext *context) = 0;

    virtual antlrcpp::Any visitComparisonBinaryOP(KQueryParser::ComparisonBinaryOPContext *context) = 0;

    virtual antlrcpp::Any visitFpConversionOp(KQueryParser::FpConversionOpContext *context) = 0;


};

