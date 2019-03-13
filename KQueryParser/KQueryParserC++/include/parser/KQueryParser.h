
// Generated from KQuery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"




class  KQueryParser : public antlr4::Parser {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, 
    T__7 = 8, T__8 = 9, T__9 = 10, T__10 = 11, T__11 = 12, ARITH_ADD = 13, 
    ARITH_SUB = 14, ARITH_MUL = 15, ARITH_UDIV = 16, ARITH_UREM = 17, ARITH_SDIV = 18, 
    ARITH_SREM = 19, BITWISE_NOT = 20, BITWISE_AND = 21, BITWISE_OR = 22, 
    BITWISE_XOR = 23, BITWISE_SHL = 24, BITWISE_LSHR = 25, BITWISE_ASHR = 26, 
    CMP_EQ = 27, CMP_NE = 28, CMP_ULT = 29, CMP_ULE = 30, CMP_UGT = 31, 
    CMP_UGE = 32, CMP_SLT = 33, CMP_SLE = 34, CMP_SGT = 35, CMP_SGE = 36, 
    CMP_FOGE = 37, CMP_FOGT = 38, CMP_FOLE = 39, CMP_FOLT = 40, CMP_FOEQ = 41, 
    SP_CONCAT = 42, SP_EXTRACT = 43, SP_ZEXT = 44, SP_SEXT = 45, SP_READ = 46, 
    SP_SELECT = 47, SP_NEG = 48, SP_READLSB = 49, SP_READMSB = 50, FP_UITOFP = 51, 
    FP_SITOFP = 52, FP_FPTOUI = 53, FP_FPTOSI = 54, FP_FPEXT = 55, FP_FPTRUNC = 56, 
    FP_ARITH_FADD = 57, FP_ARITH_FSUB = 58, FP_ARITH_FMUL = 59, FP_ARITH_FDIV = 60, 
    FP_ARITH_FREM = 61, FP_FCMP = 62, NUMBER = 63, SIGNED_CONSTANT = 64, 
    UNSIGNED_CONSTANT = 65, DEC_CONSTANT = 66, BIN_CONSTANT = 67, OCT_CONSTANT = 68, 
    HEX_CONSTANT = 69, SCIENTIFIC_CONSTANT = 70, TYPE = 71, IDENTIFIER = 72, 
    WS = 73
  };

  enum {
    RuleKquery = 0, RuleArrayDeclaration = 1, RuleArrayInitializer = 2, 
    RuleConstInitializer = 3, RuleQueryCommand = 4, RuleConstraintList = 5, 
    RuleEvalExprList = 6, RuleEvalArrayList = 7, RuleExpression = 8, RuleUpdateList = 9, 
    RuleArithmeticBinaryOp = 10, RuleBitwiseBinaryOp = 11, RuleComparisonBinaryOP = 12, 
    RuleFpConversionOp = 13
  };

  KQueryParser(antlr4::TokenStream *input);
  ~KQueryParser();

  virtual std::string getGrammarFileName() const override;
  virtual const antlr4::atn::ATN& getATN() const override { return _atn; };
  virtual const std::vector<std::string>& getTokenNames() const override { return _tokenNames; }; // deprecated: use vocabulary instead.
  virtual const std::vector<std::string>& getRuleNames() const override;
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;


  class KqueryContext;
  class ArrayDeclarationContext;
  class ArrayInitializerContext;
  class ConstInitializerContext;
  class QueryCommandContext;
  class ConstraintListContext;
  class EvalExprListContext;
  class EvalArrayListContext;
  class ExpressionContext;
  class UpdateListContext;
  class ArithmeticBinaryOpContext;
  class BitwiseBinaryOpContext;
  class ComparisonBinaryOPContext;
  class FpConversionOpContext; 

  class  KqueryContext : public antlr4::ParserRuleContext {
  public:
    KqueryContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ArrayDeclarationContext *> arrayDeclaration();
    ArrayDeclarationContext* arrayDeclaration(size_t i);
    std::vector<QueryCommandContext *> queryCommand();
    QueryCommandContext* queryCommand(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  KqueryContext* kquery();

  class  ArrayDeclarationContext : public antlr4::ParserRuleContext {
  public:
    ArrayDeclarationContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IDENTIFIER();
    antlr4::tree::TerminalNode *NUMBER();
    std::vector<antlr4::tree::TerminalNode *> TYPE();
    antlr4::tree::TerminalNode* TYPE(size_t i);
    ArrayInitializerContext *arrayInitializer();
    ConstInitializerContext *constInitializer();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayDeclarationContext* arrayDeclaration();

  class  ArrayInitializerContext : public antlr4::ParserRuleContext {
  public:
    ArrayInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConstInitializerContext *constInitializer();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArrayInitializerContext* arrayInitializer();

  class  ConstInitializerContext : public antlr4::ParserRuleContext {
  public:
    ConstInitializerContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *NUMBER();
    ConstInitializerContext *constInitializer();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstInitializerContext* constInitializer();
  ConstInitializerContext* constInitializer(int precedence);
  class  QueryCommandContext : public antlr4::ParserRuleContext {
  public:
    QueryCommandContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    ConstraintListContext *constraintList();
    ExpressionContext *expression();
    EvalExprListContext *evalExprList();
    EvalArrayListContext *evalArrayList();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  QueryCommandContext* queryCommand();

  class  ConstraintListContext : public antlr4::ParserRuleContext {
  public:
    ConstraintListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ConstraintListContext* constraintList();

  class  EvalExprListContext : public antlr4::ParserRuleContext {
  public:
    EvalExprListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EvalExprListContext* evalExprList();

  class  EvalArrayListContext : public antlr4::ParserRuleContext {
  public:
    EvalArrayListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<antlr4::tree::TerminalNode *> IDENTIFIER();
    antlr4::tree::TerminalNode* IDENTIFIER(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  EvalArrayListContext* evalArrayList();

  class  ExpressionContext : public antlr4::ParserRuleContext {
  public:
    ExpressionContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *IDENTIFIER();
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);
    ArithmeticBinaryOpContext *arithmeticBinaryOp();
    antlr4::tree::TerminalNode *TYPE();
    antlr4::tree::TerminalNode *BITWISE_NOT();
    BitwiseBinaryOpContext *bitwiseBinaryOp();
    ComparisonBinaryOPContext *comparisonBinaryOP();
    antlr4::tree::TerminalNode *SP_CONCAT();
    antlr4::tree::TerminalNode *SP_EXTRACT();
    antlr4::tree::TerminalNode *SP_ZEXT();
    antlr4::tree::TerminalNode *SP_SEXT();
    antlr4::tree::TerminalNode *SP_READ();
    antlr4::tree::TerminalNode *SP_SELECT();
    antlr4::tree::TerminalNode *SP_NEG();
    antlr4::tree::TerminalNode *SP_READLSB();
    antlr4::tree::TerminalNode *SP_READMSB();
    antlr4::tree::TerminalNode *FP_FCMP();
    FpConversionOpContext *fpConversionOp();
    antlr4::tree::TerminalNode *FP_FPEXT();
    antlr4::tree::TerminalNode *FP_FPTRUNC();
    UpdateListContext *updateList();
    antlr4::tree::TerminalNode *NUMBER();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ExpressionContext* expression();

  class  UpdateListContext : public antlr4::ParserRuleContext {
  public:
    UpdateListContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    std::vector<ExpressionContext *> expression();
    ExpressionContext* expression(size_t i);

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  UpdateListContext* updateList();

  class  ArithmeticBinaryOpContext : public antlr4::ParserRuleContext {
  public:
    ArithmeticBinaryOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *ARITH_ADD();
    antlr4::tree::TerminalNode *ARITH_SUB();
    antlr4::tree::TerminalNode *ARITH_MUL();
    antlr4::tree::TerminalNode *ARITH_UDIV();
    antlr4::tree::TerminalNode *ARITH_UREM();
    antlr4::tree::TerminalNode *ARITH_SDIV();
    antlr4::tree::TerminalNode *ARITH_SREM();
    antlr4::tree::TerminalNode *FP_ARITH_FADD();
    antlr4::tree::TerminalNode *FP_ARITH_FSUB();
    antlr4::tree::TerminalNode *FP_ARITH_FMUL();
    antlr4::tree::TerminalNode *FP_ARITH_FDIV();
    antlr4::tree::TerminalNode *FP_ARITH_FREM();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ArithmeticBinaryOpContext* arithmeticBinaryOp();

  class  BitwiseBinaryOpContext : public antlr4::ParserRuleContext {
  public:
    BitwiseBinaryOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *BITWISE_AND();
    antlr4::tree::TerminalNode *BITWISE_OR();
    antlr4::tree::TerminalNode *BITWISE_XOR();
    antlr4::tree::TerminalNode *BITWISE_SHL();
    antlr4::tree::TerminalNode *BITWISE_LSHR();
    antlr4::tree::TerminalNode *BITWISE_ASHR();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  BitwiseBinaryOpContext* bitwiseBinaryOp();

  class  ComparisonBinaryOPContext : public antlr4::ParserRuleContext {
  public:
    ComparisonBinaryOPContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *CMP_EQ();
    antlr4::tree::TerminalNode *CMP_NE();
    antlr4::tree::TerminalNode *CMP_ULT();
    antlr4::tree::TerminalNode *CMP_ULE();
    antlr4::tree::TerminalNode *CMP_UGT();
    antlr4::tree::TerminalNode *CMP_UGE();
    antlr4::tree::TerminalNode *CMP_SLT();
    antlr4::tree::TerminalNode *CMP_SLE();
    antlr4::tree::TerminalNode *CMP_SGT();
    antlr4::tree::TerminalNode *CMP_SGE();
    antlr4::tree::TerminalNode *CMP_FOGE();
    antlr4::tree::TerminalNode *CMP_FOGT();
    antlr4::tree::TerminalNode *CMP_FOLE();
    antlr4::tree::TerminalNode *CMP_FOLT();
    antlr4::tree::TerminalNode *CMP_FOEQ();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  ComparisonBinaryOPContext* comparisonBinaryOP();

  class  FpConversionOpContext : public antlr4::ParserRuleContext {
  public:
    FpConversionOpContext(antlr4::ParserRuleContext *parent, size_t invokingState);
    virtual size_t getRuleIndex() const override;
    antlr4::tree::TerminalNode *FP_UITOFP();
    antlr4::tree::TerminalNode *FP_SITOFP();
    antlr4::tree::TerminalNode *FP_FPTOUI();
    antlr4::tree::TerminalNode *FP_FPTOSI();

    virtual void enterRule(antlr4::tree::ParseTreeListener *listener) override;
    virtual void exitRule(antlr4::tree::ParseTreeListener *listener) override;

    virtual antlrcpp::Any accept(antlr4::tree::ParseTreeVisitor *visitor) override;
   
  };

  FpConversionOpContext* fpConversionOp();


  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;
  bool constInitializerSempred(ConstInitializerContext *_localctx, size_t predicateIndex);

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

