
// Generated from KQuery.g4 by ANTLR 4.7

#pragma once


#include "antlr4-runtime.h"




class  KQueryLexer : public antlr4::Lexer {
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

  KQueryLexer(antlr4::CharStream *input);
  ~KQueryLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

