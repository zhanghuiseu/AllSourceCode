
// Generated from KQuery.g4 by ANTLR 4.7


#include "KQueryListener.h"
#include "KQueryVisitor.h"

#include "KQueryParser.h"


using namespace antlrcpp;
using namespace antlr4;

KQueryParser::KQueryParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

KQueryParser::~KQueryParser() {
  delete _interpreter;
}

std::string KQueryParser::getGrammarFileName() const {
  return "KQuery.g4";
}

const std::vector<std::string>& KQueryParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& KQueryParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- KqueryContext ------------------------------------------------------------------

KQueryParser::KqueryContext::KqueryContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KQueryParser::ArrayDeclarationContext *> KQueryParser::KqueryContext::arrayDeclaration() {
  return getRuleContexts<KQueryParser::ArrayDeclarationContext>();
}

KQueryParser::ArrayDeclarationContext* KQueryParser::KqueryContext::arrayDeclaration(size_t i) {
  return getRuleContext<KQueryParser::ArrayDeclarationContext>(i);
}

std::vector<KQueryParser::QueryCommandContext *> KQueryParser::KqueryContext::queryCommand() {
  return getRuleContexts<KQueryParser::QueryCommandContext>();
}

KQueryParser::QueryCommandContext* KQueryParser::KqueryContext::queryCommand(size_t i) {
  return getRuleContext<KQueryParser::QueryCommandContext>(i);
}


size_t KQueryParser::KqueryContext::getRuleIndex() const {
  return KQueryParser::RuleKquery;
}

void KQueryParser::KqueryContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterKquery(this);
}

void KQueryParser::KqueryContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitKquery(this);
}


antlrcpp::Any KQueryParser::KqueryContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitKquery(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::KqueryContext* KQueryParser::kquery() {
  KqueryContext *_localctx = _tracker.createInstance<KqueryContext>(_ctx, getState());
  enterRule(_localctx, 0, KQueryParser::RuleKquery);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(30); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(30);
      _errHandler->sync(this);
      switch (_input->LA(1)) {
        case KQueryParser::T__0: {
          setState(28);
          arrayDeclaration();
          break;
        }

        case KQueryParser::T__8: {
          setState(29);
          queryCommand();
          break;
        }

      default:
        throw NoViableAltException(this);
      }
      setState(32); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == KQueryParser::T__0

    || _la == KQueryParser::T__8);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayDeclarationContext ------------------------------------------------------------------

KQueryParser::ArrayDeclarationContext::ArrayDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::ArrayDeclarationContext::IDENTIFIER() {
  return getToken(KQueryParser::IDENTIFIER, 0);
}

tree::TerminalNode* KQueryParser::ArrayDeclarationContext::NUMBER() {
  return getToken(KQueryParser::NUMBER, 0);
}

std::vector<tree::TerminalNode *> KQueryParser::ArrayDeclarationContext::TYPE() {
  return getTokens(KQueryParser::TYPE);
}

tree::TerminalNode* KQueryParser::ArrayDeclarationContext::TYPE(size_t i) {
  return getToken(KQueryParser::TYPE, i);
}

KQueryParser::ArrayInitializerContext* KQueryParser::ArrayDeclarationContext::arrayInitializer() {
  return getRuleContext<KQueryParser::ArrayInitializerContext>(0);
}

KQueryParser::ConstInitializerContext* KQueryParser::ArrayDeclarationContext::constInitializer() {
  return getRuleContext<KQueryParser::ConstInitializerContext>(0);
}


size_t KQueryParser::ArrayDeclarationContext::getRuleIndex() const {
  return KQueryParser::RuleArrayDeclaration;
}

void KQueryParser::ArrayDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayDeclaration(this);
}

void KQueryParser::ArrayDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayDeclaration(this);
}


antlrcpp::Any KQueryParser::ArrayDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitArrayDeclaration(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::ArrayDeclarationContext* KQueryParser::arrayDeclaration() {
  ArrayDeclarationContext *_localctx = _tracker.createInstance<ArrayDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 2, KQueryParser::RuleArrayDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(58);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(34);
      match(KQueryParser::T__0);
      setState(35);
      match(KQueryParser::IDENTIFIER);
      setState(36);
      match(KQueryParser::T__1);
      setState(37);
      match(KQueryParser::NUMBER);
      setState(38);
      match(KQueryParser::T__2);
      setState(39);
      match(KQueryParser::T__3);
      setState(40);
      match(KQueryParser::TYPE);
      setState(41);
      match(KQueryParser::T__4);
      setState(42);
      match(KQueryParser::TYPE);
      setState(43);
      match(KQueryParser::T__5);
      setState(44);
      arrayInitializer();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(45);
      match(KQueryParser::T__0);
      setState(46);
      match(KQueryParser::IDENTIFIER);
      setState(47);
      match(KQueryParser::T__1);
      setState(48);
      match(KQueryParser::T__2);
      setState(49);
      match(KQueryParser::T__3);
      setState(50);
      match(KQueryParser::TYPE);
      setState(51);
      match(KQueryParser::T__4);
      setState(52);
      match(KQueryParser::TYPE);
      setState(53);
      match(KQueryParser::T__5);
      setState(54);
      match(KQueryParser::T__1);
      setState(55);
      constInitializer(0);
      setState(56);
      match(KQueryParser::T__2);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArrayInitializerContext ------------------------------------------------------------------

KQueryParser::ArrayInitializerContext::ArrayInitializerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KQueryParser::ConstInitializerContext* KQueryParser::ArrayInitializerContext::constInitializer() {
  return getRuleContext<KQueryParser::ConstInitializerContext>(0);
}


size_t KQueryParser::ArrayInitializerContext::getRuleIndex() const {
  return KQueryParser::RuleArrayInitializer;
}

void KQueryParser::ArrayInitializerContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayInitializer(this);
}

void KQueryParser::ArrayInitializerContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayInitializer(this);
}


antlrcpp::Any KQueryParser::ArrayInitializerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitArrayInitializer(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::ArrayInitializerContext* KQueryParser::arrayInitializer() {
  ArrayInitializerContext *_localctx = _tracker.createInstance<ArrayInitializerContext>(_ctx, getState());
  enterRule(_localctx, 4, KQueryParser::RuleArrayInitializer);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(65);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KQueryParser::T__6: {
        enterOuterAlt(_localctx, 1);
        setState(60);
        match(KQueryParser::T__6);
        break;
      }

      case KQueryParser::T__1: {
        enterOuterAlt(_localctx, 2);
        setState(61);
        match(KQueryParser::T__1);
        setState(62);
        constInitializer(0);
        setState(63);
        match(KQueryParser::T__2);
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstInitializerContext ------------------------------------------------------------------

KQueryParser::ConstInitializerContext::ConstInitializerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::ConstInitializerContext::NUMBER() {
  return getToken(KQueryParser::NUMBER, 0);
}

KQueryParser::ConstInitializerContext* KQueryParser::ConstInitializerContext::constInitializer() {
  return getRuleContext<KQueryParser::ConstInitializerContext>(0);
}


size_t KQueryParser::ConstInitializerContext::getRuleIndex() const {
  return KQueryParser::RuleConstInitializer;
}

void KQueryParser::ConstInitializerContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConstInitializer(this);
}

void KQueryParser::ConstInitializerContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConstInitializer(this);
}


antlrcpp::Any KQueryParser::ConstInitializerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitConstInitializer(this);
  else
    return visitor->visitChildren(this);
}


KQueryParser::ConstInitializerContext* KQueryParser::constInitializer() {
   return constInitializer(0);
}

KQueryParser::ConstInitializerContext* KQueryParser::constInitializer(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  KQueryParser::ConstInitializerContext *_localctx = _tracker.createInstance<ConstInitializerContext>(_ctx, parentState);
  KQueryParser::ConstInitializerContext *previousContext = _localctx;
  size_t startState = 6;
  enterRecursionRule(_localctx, 6, KQueryParser::RuleConstInitializer, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(70);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      setState(68);
      match(KQueryParser::NUMBER);
      break;
    }

    case 2: {
      setState(69);
      match(KQueryParser::NUMBER);
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(79);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(77);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<ConstInitializerContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleConstInitializer);
          setState(72);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");
          setState(73);
          match(KQueryParser::T__7);
          setState(74);
          match(KQueryParser::NUMBER);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<ConstInitializerContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleConstInitializer);
          setState(75);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(76);
          match(KQueryParser::NUMBER);
          break;
        }

        } 
      }
      setState(81);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- QueryCommandContext ------------------------------------------------------------------

KQueryParser::QueryCommandContext::QueryCommandContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

KQueryParser::ConstraintListContext* KQueryParser::QueryCommandContext::constraintList() {
  return getRuleContext<KQueryParser::ConstraintListContext>(0);
}

KQueryParser::ExpressionContext* KQueryParser::QueryCommandContext::expression() {
  return getRuleContext<KQueryParser::ExpressionContext>(0);
}

KQueryParser::EvalExprListContext* KQueryParser::QueryCommandContext::evalExprList() {
  return getRuleContext<KQueryParser::EvalExprListContext>(0);
}

KQueryParser::EvalArrayListContext* KQueryParser::QueryCommandContext::evalArrayList() {
  return getRuleContext<KQueryParser::EvalArrayListContext>(0);
}


size_t KQueryParser::QueryCommandContext::getRuleIndex() const {
  return KQueryParser::RuleQueryCommand;
}

void KQueryParser::QueryCommandContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterQueryCommand(this);
}

void KQueryParser::QueryCommandContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitQueryCommand(this);
}


antlrcpp::Any KQueryParser::QueryCommandContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitQueryCommand(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::QueryCommandContext* KQueryParser::queryCommand() {
  QueryCommandContext *_localctx = _tracker.createInstance<QueryCommandContext>(_ctx, getState());
  enterRule(_localctx, 8, KQueryParser::RuleQueryCommand);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(96);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(82);
      match(KQueryParser::T__8);
      setState(83);
      match(KQueryParser::T__9);
      setState(84);
      constraintList();
      setState(85);
      expression();
      setState(86);
      match(KQueryParser::T__10);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(88);
      match(KQueryParser::T__8);
      setState(89);
      match(KQueryParser::T__9);
      setState(90);
      constraintList();
      setState(91);
      expression();
      setState(92);
      evalExprList();
      setState(93);
      evalArrayList();
      setState(94);
      match(KQueryParser::T__10);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstraintListContext ------------------------------------------------------------------

KQueryParser::ConstraintListContext::ConstraintListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KQueryParser::ExpressionContext *> KQueryParser::ConstraintListContext::expression() {
  return getRuleContexts<KQueryParser::ExpressionContext>();
}

KQueryParser::ExpressionContext* KQueryParser::ConstraintListContext::expression(size_t i) {
  return getRuleContext<KQueryParser::ExpressionContext>(i);
}


size_t KQueryParser::ConstraintListContext::getRuleIndex() const {
  return KQueryParser::RuleConstraintList;
}

void KQueryParser::ConstraintListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConstraintList(this);
}

void KQueryParser::ConstraintListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConstraintList(this);
}


antlrcpp::Any KQueryParser::ConstraintListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitConstraintList(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::ConstraintListContext* KQueryParser::constraintList() {
  ConstraintListContext *_localctx = _tracker.createInstance<ConstraintListContext>(_ctx, getState());
  enterRule(_localctx, 10, KQueryParser::RuleConstraintList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(98);
    match(KQueryParser::T__1);
    setState(102);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KQueryParser::T__1)
      | (1ULL << KQueryParser::T__8)
      | (1ULL << KQueryParser::NUMBER))) != 0) || _la == KQueryParser::IDENTIFIER) {
      setState(99);
      expression();
      setState(104);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(105);
    match(KQueryParser::T__2);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EvalExprListContext ------------------------------------------------------------------

KQueryParser::EvalExprListContext::EvalExprListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KQueryParser::ExpressionContext *> KQueryParser::EvalExprListContext::expression() {
  return getRuleContexts<KQueryParser::ExpressionContext>();
}

KQueryParser::ExpressionContext* KQueryParser::EvalExprListContext::expression(size_t i) {
  return getRuleContext<KQueryParser::ExpressionContext>(i);
}


size_t KQueryParser::EvalExprListContext::getRuleIndex() const {
  return KQueryParser::RuleEvalExprList;
}

void KQueryParser::EvalExprListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEvalExprList(this);
}

void KQueryParser::EvalExprListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEvalExprList(this);
}


antlrcpp::Any KQueryParser::EvalExprListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitEvalExprList(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::EvalExprListContext* KQueryParser::evalExprList() {
  EvalExprListContext *_localctx = _tracker.createInstance<EvalExprListContext>(_ctx, getState());
  enterRule(_localctx, 12, KQueryParser::RuleEvalExprList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(107);
    match(KQueryParser::T__1);
    setState(111);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KQueryParser::T__1)
      | (1ULL << KQueryParser::T__8)
      | (1ULL << KQueryParser::NUMBER))) != 0) || _la == KQueryParser::IDENTIFIER) {
      setState(108);
      expression();
      setState(113);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(114);
    match(KQueryParser::T__2);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- EvalArrayListContext ------------------------------------------------------------------

KQueryParser::EvalArrayListContext::EvalArrayListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> KQueryParser::EvalArrayListContext::IDENTIFIER() {
  return getTokens(KQueryParser::IDENTIFIER);
}

tree::TerminalNode* KQueryParser::EvalArrayListContext::IDENTIFIER(size_t i) {
  return getToken(KQueryParser::IDENTIFIER, i);
}


size_t KQueryParser::EvalArrayListContext::getRuleIndex() const {
  return KQueryParser::RuleEvalArrayList;
}

void KQueryParser::EvalArrayListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEvalArrayList(this);
}

void KQueryParser::EvalArrayListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEvalArrayList(this);
}


antlrcpp::Any KQueryParser::EvalArrayListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitEvalArrayList(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::EvalArrayListContext* KQueryParser::evalArrayList() {
  EvalArrayListContext *_localctx = _tracker.createInstance<EvalArrayListContext>(_ctx, getState());
  enterRule(_localctx, 14, KQueryParser::RuleEvalArrayList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(116);
    match(KQueryParser::T__1);
    setState(120);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == KQueryParser::IDENTIFIER) {
      setState(117);
      match(KQueryParser::IDENTIFIER);
      setState(122);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(123);
    match(KQueryParser::T__2);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

KQueryParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::ExpressionContext::IDENTIFIER() {
  return getToken(KQueryParser::IDENTIFIER, 0);
}

std::vector<KQueryParser::ExpressionContext *> KQueryParser::ExpressionContext::expression() {
  return getRuleContexts<KQueryParser::ExpressionContext>();
}

KQueryParser::ExpressionContext* KQueryParser::ExpressionContext::expression(size_t i) {
  return getRuleContext<KQueryParser::ExpressionContext>(i);
}

KQueryParser::ArithmeticBinaryOpContext* KQueryParser::ExpressionContext::arithmeticBinaryOp() {
  return getRuleContext<KQueryParser::ArithmeticBinaryOpContext>(0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::TYPE() {
  return getToken(KQueryParser::TYPE, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::BITWISE_NOT() {
  return getToken(KQueryParser::BITWISE_NOT, 0);
}

KQueryParser::BitwiseBinaryOpContext* KQueryParser::ExpressionContext::bitwiseBinaryOp() {
  return getRuleContext<KQueryParser::BitwiseBinaryOpContext>(0);
}

KQueryParser::ComparisonBinaryOPContext* KQueryParser::ExpressionContext::comparisonBinaryOP() {
  return getRuleContext<KQueryParser::ComparisonBinaryOPContext>(0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_CONCAT() {
  return getToken(KQueryParser::SP_CONCAT, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_EXTRACT() {
  return getToken(KQueryParser::SP_EXTRACT, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_ZEXT() {
  return getToken(KQueryParser::SP_ZEXT, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_SEXT() {
  return getToken(KQueryParser::SP_SEXT, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_READ() {
  return getToken(KQueryParser::SP_READ, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_SELECT() {
  return getToken(KQueryParser::SP_SELECT, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_NEG() {
  return getToken(KQueryParser::SP_NEG, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_READLSB() {
  return getToken(KQueryParser::SP_READLSB, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::SP_READMSB() {
  return getToken(KQueryParser::SP_READMSB, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::FP_FCMP() {
  return getToken(KQueryParser::FP_FCMP, 0);
}

KQueryParser::FpConversionOpContext* KQueryParser::ExpressionContext::fpConversionOp() {
  return getRuleContext<KQueryParser::FpConversionOpContext>(0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::FP_FPEXT() {
  return getToken(KQueryParser::FP_FPEXT, 0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::FP_FPTRUNC() {
  return getToken(KQueryParser::FP_FPTRUNC, 0);
}

KQueryParser::UpdateListContext* KQueryParser::ExpressionContext::updateList() {
  return getRuleContext<KQueryParser::UpdateListContext>(0);
}

tree::TerminalNode* KQueryParser::ExpressionContext::NUMBER() {
  return getToken(KQueryParser::NUMBER, 0);
}


size_t KQueryParser::ExpressionContext::getRuleIndex() const {
  return KQueryParser::RuleExpression;
}

void KQueryParser::ExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpression(this);
}

void KQueryParser::ExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpression(this);
}


antlrcpp::Any KQueryParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::ExpressionContext* KQueryParser::expression() {
  ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, getState());
  enterRule(_localctx, 16, KQueryParser::RuleExpression);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(289);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(125);
      match(KQueryParser::IDENTIFIER);
      setState(126);
      match(KQueryParser::T__3);
      setState(127);
      expression();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(128);
      match(KQueryParser::T__8);
      setState(129);
      arithmeticBinaryOp();
      setState(130);
      match(KQueryParser::TYPE);
      setState(131);
      expression();
      setState(132);
      expression();
      setState(133);
      match(KQueryParser::T__10);
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(135);
      match(KQueryParser::T__8);
      setState(136);
      match(KQueryParser::BITWISE_NOT);
      setState(137);
      match(KQueryParser::TYPE);
      setState(138);
      expression();
      setState(139);
      match(KQueryParser::T__10);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(141);
      match(KQueryParser::T__8);
      setState(142);
      match(KQueryParser::BITWISE_NOT);
      setState(143);
      expression();
      setState(144);
      match(KQueryParser::T__10);
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(146);
      match(KQueryParser::T__8);
      setState(147);
      bitwiseBinaryOp();
      setState(148);
      match(KQueryParser::TYPE);
      setState(149);
      expression();
      setState(150);
      expression();
      setState(151);
      match(KQueryParser::T__10);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(153);
      match(KQueryParser::T__8);
      setState(154);
      bitwiseBinaryOp();
      setState(155);
      expression();
      setState(156);
      expression();
      setState(157);
      match(KQueryParser::T__10);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(159);
      match(KQueryParser::T__8);
      setState(160);
      comparisonBinaryOP();
      setState(161);
      match(KQueryParser::TYPE);
      setState(162);
      expression();
      setState(163);
      expression();
      setState(164);
      match(KQueryParser::T__10);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(166);
      match(KQueryParser::T__8);
      setState(167);
      comparisonBinaryOP();
      setState(168);
      expression();
      setState(169);
      expression();
      setState(170);
      match(KQueryParser::T__10);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(172);
      match(KQueryParser::T__8);
      setState(173);
      match(KQueryParser::SP_CONCAT);
      setState(174);
      match(KQueryParser::TYPE);
      setState(175);
      expression();
      setState(176);
      expression();
      setState(177);
      match(KQueryParser::T__10);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(179);
      match(KQueryParser::T__8);
      setState(180);
      match(KQueryParser::SP_CONCAT);
      setState(181);
      expression();
      setState(182);
      expression();
      setState(183);
      match(KQueryParser::T__10);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(185);
      match(KQueryParser::T__8);
      setState(186);
      match(KQueryParser::SP_EXTRACT);
      setState(187);
      match(KQueryParser::TYPE);
      setState(188);
      expression();
      setState(189);
      expression();
      setState(190);
      match(KQueryParser::T__10);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(192);
      match(KQueryParser::T__8);
      setState(193);
      match(KQueryParser::SP_ZEXT);
      setState(194);
      match(KQueryParser::TYPE);
      setState(195);
      expression();
      setState(196);
      match(KQueryParser::T__10);
      break;
    }

    case 13: {
      enterOuterAlt(_localctx, 13);
      setState(198);
      match(KQueryParser::T__8);
      setState(199);
      match(KQueryParser::SP_SEXT);
      setState(200);
      match(KQueryParser::TYPE);
      setState(201);
      expression();
      setState(202);
      match(KQueryParser::T__10);
      break;
    }

    case 14: {
      enterOuterAlt(_localctx, 14);
      setState(204);
      match(KQueryParser::T__8);
      setState(205);
      match(KQueryParser::SP_READ);
      setState(206);
      match(KQueryParser::TYPE);
      setState(207);
      expression();
      setState(208);
      expression();
      setState(209);
      match(KQueryParser::T__10);
      break;
    }

    case 15: {
      enterOuterAlt(_localctx, 15);
      setState(211);
      match(KQueryParser::T__8);
      setState(212);
      match(KQueryParser::SP_SELECT);
      setState(213);
      match(KQueryParser::TYPE);
      setState(214);
      expression();
      setState(215);
      expression();
      setState(216);
      expression();
      setState(217);
      match(KQueryParser::T__10);
      break;
    }

    case 16: {
      enterOuterAlt(_localctx, 16);
      setState(219);
      match(KQueryParser::T__8);
      setState(220);
      match(KQueryParser::SP_NEG);
      setState(221);
      match(KQueryParser::TYPE);
      setState(222);
      expression();
      setState(223);
      match(KQueryParser::T__10);
      break;
    }

    case 17: {
      enterOuterAlt(_localctx, 17);
      setState(225);
      match(KQueryParser::T__8);
      setState(226);
      match(KQueryParser::SP_NEG);
      setState(227);
      expression();
      setState(228);
      match(KQueryParser::T__10);
      break;
    }

    case 18: {
      enterOuterAlt(_localctx, 18);
      setState(230);
      match(KQueryParser::T__8);
      setState(231);
      match(KQueryParser::SP_READLSB);
      setState(232);
      match(KQueryParser::TYPE);
      setState(233);
      expression();
      setState(234);
      expression();
      setState(235);
      match(KQueryParser::T__10);
      break;
    }

    case 19: {
      enterOuterAlt(_localctx, 19);
      setState(237);
      match(KQueryParser::T__8);
      setState(238);
      match(KQueryParser::SP_READMSB);
      setState(239);
      match(KQueryParser::TYPE);
      setState(240);
      expression();
      setState(241);
      expression();
      setState(242);
      match(KQueryParser::T__10);
      break;
    }

    case 20: {
      enterOuterAlt(_localctx, 20);
      setState(244);
      match(KQueryParser::T__8);
      setState(245);
      match(KQueryParser::FP_FCMP);
      setState(246);
      expression();
      setState(247);
      expression();
      setState(248);
      expression();
      setState(249);
      match(KQueryParser::T__10);
      break;
    }

    case 21: {
      enterOuterAlt(_localctx, 21);
      setState(251);
      match(KQueryParser::T__8);
      setState(252);
      fpConversionOp();
      setState(253);
      match(KQueryParser::TYPE);
      setState(254);
      expression();
      setState(255);
      match(KQueryParser::T__10);
      break;
    }

    case 22: {
      enterOuterAlt(_localctx, 22);
      setState(257);
      match(KQueryParser::T__8);
      setState(258);
      match(KQueryParser::FP_FPEXT);
      setState(259);
      match(KQueryParser::TYPE);
      setState(260);
      expression();
      setState(261);
      match(KQueryParser::T__10);
      break;
    }

    case 23: {
      enterOuterAlt(_localctx, 23);
      setState(263);
      match(KQueryParser::T__8);
      setState(264);
      match(KQueryParser::FP_FPTRUNC);
      setState(265);
      match(KQueryParser::TYPE);
      setState(266);
      expression();
      setState(267);
      match(KQueryParser::T__10);
      break;
    }

    case 24: {
      enterOuterAlt(_localctx, 24);
      setState(269);
      match(KQueryParser::T__1);
      setState(270);
      updateList();
      setState(271);
      match(KQueryParser::T__2);
      setState(272);
      match(KQueryParser::T__11);
      setState(273);
      match(KQueryParser::IDENTIFIER);
      break;
    }

    case 25: {
      enterOuterAlt(_localctx, 25);
      setState(275);
      match(KQueryParser::T__1);
      setState(276);
      match(KQueryParser::T__2);
      setState(277);
      match(KQueryParser::T__11);
      setState(278);
      match(KQueryParser::IDENTIFIER);
      break;
    }

    case 26: {
      enterOuterAlt(_localctx, 26);
      setState(279);
      match(KQueryParser::T__8);
      setState(280);
      match(KQueryParser::TYPE);
      setState(281);
      match(KQueryParser::NUMBER);
      setState(282);
      match(KQueryParser::T__10);
      break;
    }

    case 27: {
      enterOuterAlt(_localctx, 27);
      setState(283);
      match(KQueryParser::T__8);
      setState(284);
      match(KQueryParser::TYPE);
      setState(285);
      match(KQueryParser::IDENTIFIER);
      setState(286);
      match(KQueryParser::T__10);
      break;
    }

    case 28: {
      enterOuterAlt(_localctx, 28);
      setState(287);
      match(KQueryParser::IDENTIFIER);
      break;
    }

    case 29: {
      enterOuterAlt(_localctx, 29);
      setState(288);
      match(KQueryParser::NUMBER);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- UpdateListContext ------------------------------------------------------------------

KQueryParser::UpdateListContext::UpdateListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<KQueryParser::ExpressionContext *> KQueryParser::UpdateListContext::expression() {
  return getRuleContexts<KQueryParser::ExpressionContext>();
}

KQueryParser::ExpressionContext* KQueryParser::UpdateListContext::expression(size_t i) {
  return getRuleContext<KQueryParser::ExpressionContext>(i);
}


size_t KQueryParser::UpdateListContext::getRuleIndex() const {
  return KQueryParser::RuleUpdateList;
}

void KQueryParser::UpdateListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterUpdateList(this);
}

void KQueryParser::UpdateListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitUpdateList(this);
}


antlrcpp::Any KQueryParser::UpdateListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitUpdateList(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::UpdateListContext* KQueryParser::updateList() {
  UpdateListContext *_localctx = _tracker.createInstance<UpdateListContext>(_ctx, getState());
  enterRule(_localctx, 18, KQueryParser::RuleUpdateList);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(300);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case KQueryParser::T__7: {
        enterOuterAlt(_localctx, 1);
        setState(291);
        match(KQueryParser::T__7);
        setState(292);
        expression();
        setState(293);
        match(KQueryParser::T__5);
        setState(294);
        expression();
        break;
      }

      case KQueryParser::T__1:
      case KQueryParser::T__8:
      case KQueryParser::NUMBER:
      case KQueryParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 2);
        setState(296);
        expression();
        setState(297);
        match(KQueryParser::T__5);
        setState(298);
        expression();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArithmeticBinaryOpContext ------------------------------------------------------------------

KQueryParser::ArithmeticBinaryOpContext::ArithmeticBinaryOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_ADD() {
  return getToken(KQueryParser::ARITH_ADD, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_SUB() {
  return getToken(KQueryParser::ARITH_SUB, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_MUL() {
  return getToken(KQueryParser::ARITH_MUL, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_UDIV() {
  return getToken(KQueryParser::ARITH_UDIV, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_UREM() {
  return getToken(KQueryParser::ARITH_UREM, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_SDIV() {
  return getToken(KQueryParser::ARITH_SDIV, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::ARITH_SREM() {
  return getToken(KQueryParser::ARITH_SREM, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::FP_ARITH_FADD() {
  return getToken(KQueryParser::FP_ARITH_FADD, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::FP_ARITH_FSUB() {
  return getToken(KQueryParser::FP_ARITH_FSUB, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::FP_ARITH_FMUL() {
  return getToken(KQueryParser::FP_ARITH_FMUL, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::FP_ARITH_FDIV() {
  return getToken(KQueryParser::FP_ARITH_FDIV, 0);
}

tree::TerminalNode* KQueryParser::ArithmeticBinaryOpContext::FP_ARITH_FREM() {
  return getToken(KQueryParser::FP_ARITH_FREM, 0);
}


size_t KQueryParser::ArithmeticBinaryOpContext::getRuleIndex() const {
  return KQueryParser::RuleArithmeticBinaryOp;
}

void KQueryParser::ArithmeticBinaryOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArithmeticBinaryOp(this);
}

void KQueryParser::ArithmeticBinaryOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArithmeticBinaryOp(this);
}


antlrcpp::Any KQueryParser::ArithmeticBinaryOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitArithmeticBinaryOp(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::ArithmeticBinaryOpContext* KQueryParser::arithmeticBinaryOp() {
  ArithmeticBinaryOpContext *_localctx = _tracker.createInstance<ArithmeticBinaryOpContext>(_ctx, getState());
  enterRule(_localctx, 20, KQueryParser::RuleArithmeticBinaryOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(302);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KQueryParser::ARITH_ADD)
      | (1ULL << KQueryParser::ARITH_SUB)
      | (1ULL << KQueryParser::ARITH_MUL)
      | (1ULL << KQueryParser::ARITH_UDIV)
      | (1ULL << KQueryParser::ARITH_UREM)
      | (1ULL << KQueryParser::ARITH_SDIV)
      | (1ULL << KQueryParser::ARITH_SREM)
      | (1ULL << KQueryParser::FP_ARITH_FADD)
      | (1ULL << KQueryParser::FP_ARITH_FSUB)
      | (1ULL << KQueryParser::FP_ARITH_FMUL)
      | (1ULL << KQueryParser::FP_ARITH_FDIV)
      | (1ULL << KQueryParser::FP_ARITH_FREM))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BitwiseBinaryOpContext ------------------------------------------------------------------

KQueryParser::BitwiseBinaryOpContext::BitwiseBinaryOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::BitwiseBinaryOpContext::BITWISE_AND() {
  return getToken(KQueryParser::BITWISE_AND, 0);
}

tree::TerminalNode* KQueryParser::BitwiseBinaryOpContext::BITWISE_OR() {
  return getToken(KQueryParser::BITWISE_OR, 0);
}

tree::TerminalNode* KQueryParser::BitwiseBinaryOpContext::BITWISE_XOR() {
  return getToken(KQueryParser::BITWISE_XOR, 0);
}

tree::TerminalNode* KQueryParser::BitwiseBinaryOpContext::BITWISE_SHL() {
  return getToken(KQueryParser::BITWISE_SHL, 0);
}

tree::TerminalNode* KQueryParser::BitwiseBinaryOpContext::BITWISE_LSHR() {
  return getToken(KQueryParser::BITWISE_LSHR, 0);
}

tree::TerminalNode* KQueryParser::BitwiseBinaryOpContext::BITWISE_ASHR() {
  return getToken(KQueryParser::BITWISE_ASHR, 0);
}


size_t KQueryParser::BitwiseBinaryOpContext::getRuleIndex() const {
  return KQueryParser::RuleBitwiseBinaryOp;
}

void KQueryParser::BitwiseBinaryOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBitwiseBinaryOp(this);
}

void KQueryParser::BitwiseBinaryOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBitwiseBinaryOp(this);
}


antlrcpp::Any KQueryParser::BitwiseBinaryOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitBitwiseBinaryOp(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::BitwiseBinaryOpContext* KQueryParser::bitwiseBinaryOp() {
  BitwiseBinaryOpContext *_localctx = _tracker.createInstance<BitwiseBinaryOpContext>(_ctx, getState());
  enterRule(_localctx, 22, KQueryParser::RuleBitwiseBinaryOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(304);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KQueryParser::BITWISE_AND)
      | (1ULL << KQueryParser::BITWISE_OR)
      | (1ULL << KQueryParser::BITWISE_XOR)
      | (1ULL << KQueryParser::BITWISE_SHL)
      | (1ULL << KQueryParser::BITWISE_LSHR)
      | (1ULL << KQueryParser::BITWISE_ASHR))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ComparisonBinaryOPContext ------------------------------------------------------------------

KQueryParser::ComparisonBinaryOPContext::ComparisonBinaryOPContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_EQ() {
  return getToken(KQueryParser::CMP_EQ, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_NE() {
  return getToken(KQueryParser::CMP_NE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_ULT() {
  return getToken(KQueryParser::CMP_ULT, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_ULE() {
  return getToken(KQueryParser::CMP_ULE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_UGT() {
  return getToken(KQueryParser::CMP_UGT, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_UGE() {
  return getToken(KQueryParser::CMP_UGE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_SLT() {
  return getToken(KQueryParser::CMP_SLT, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_SLE() {
  return getToken(KQueryParser::CMP_SLE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_SGT() {
  return getToken(KQueryParser::CMP_SGT, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_SGE() {
  return getToken(KQueryParser::CMP_SGE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_FOGE() {
  return getToken(KQueryParser::CMP_FOGE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_FOGT() {
  return getToken(KQueryParser::CMP_FOGT, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_FOLE() {
  return getToken(KQueryParser::CMP_FOLE, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_FOLT() {
  return getToken(KQueryParser::CMP_FOLT, 0);
}

tree::TerminalNode* KQueryParser::ComparisonBinaryOPContext::CMP_FOEQ() {
  return getToken(KQueryParser::CMP_FOEQ, 0);
}


size_t KQueryParser::ComparisonBinaryOPContext::getRuleIndex() const {
  return KQueryParser::RuleComparisonBinaryOP;
}

void KQueryParser::ComparisonBinaryOPContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterComparisonBinaryOP(this);
}

void KQueryParser::ComparisonBinaryOPContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitComparisonBinaryOP(this);
}


antlrcpp::Any KQueryParser::ComparisonBinaryOPContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitComparisonBinaryOP(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::ComparisonBinaryOPContext* KQueryParser::comparisonBinaryOP() {
  ComparisonBinaryOPContext *_localctx = _tracker.createInstance<ComparisonBinaryOPContext>(_ctx, getState());
  enterRule(_localctx, 24, KQueryParser::RuleComparisonBinaryOP);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(306);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KQueryParser::CMP_EQ)
      | (1ULL << KQueryParser::CMP_NE)
      | (1ULL << KQueryParser::CMP_ULT)
      | (1ULL << KQueryParser::CMP_ULE)
      | (1ULL << KQueryParser::CMP_UGT)
      | (1ULL << KQueryParser::CMP_UGE)
      | (1ULL << KQueryParser::CMP_SLT)
      | (1ULL << KQueryParser::CMP_SLE)
      | (1ULL << KQueryParser::CMP_SGT)
      | (1ULL << KQueryParser::CMP_SGE)
      | (1ULL << KQueryParser::CMP_FOGE)
      | (1ULL << KQueryParser::CMP_FOGT)
      | (1ULL << KQueryParser::CMP_FOLE)
      | (1ULL << KQueryParser::CMP_FOLT)
      | (1ULL << KQueryParser::CMP_FOEQ))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FpConversionOpContext ------------------------------------------------------------------

KQueryParser::FpConversionOpContext::FpConversionOpContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* KQueryParser::FpConversionOpContext::FP_UITOFP() {
  return getToken(KQueryParser::FP_UITOFP, 0);
}

tree::TerminalNode* KQueryParser::FpConversionOpContext::FP_SITOFP() {
  return getToken(KQueryParser::FP_SITOFP, 0);
}

tree::TerminalNode* KQueryParser::FpConversionOpContext::FP_FPTOUI() {
  return getToken(KQueryParser::FP_FPTOUI, 0);
}

tree::TerminalNode* KQueryParser::FpConversionOpContext::FP_FPTOSI() {
  return getToken(KQueryParser::FP_FPTOSI, 0);
}


size_t KQueryParser::FpConversionOpContext::getRuleIndex() const {
  return KQueryParser::RuleFpConversionOp;
}

void KQueryParser::FpConversionOpContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFpConversionOp(this);
}

void KQueryParser::FpConversionOpContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<KQueryListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFpConversionOp(this);
}


antlrcpp::Any KQueryParser::FpConversionOpContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<KQueryVisitor*>(visitor))
    return parserVisitor->visitFpConversionOp(this);
  else
    return visitor->visitChildren(this);
}

KQueryParser::FpConversionOpContext* KQueryParser::fpConversionOp() {
  FpConversionOpContext *_localctx = _tracker.createInstance<FpConversionOpContext>(_ctx, getState());
  enterRule(_localctx, 26, KQueryParser::RuleFpConversionOp);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(308);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << KQueryParser::FP_UITOFP)
      | (1ULL << KQueryParser::FP_SITOFP)
      | (1ULL << KQueryParser::FP_FPTOUI)
      | (1ULL << KQueryParser::FP_FPTOSI))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool KQueryParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 3: return constInitializerSempred(dynamic_cast<ConstInitializerContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool KQueryParser::constInitializerSempred(ConstInitializerContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 4);
    case 1: return precpred(_ctx, 2);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> KQueryParser::_decisionToDFA;
atn::PredictionContextCache KQueryParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN KQueryParser::_atn;
std::vector<uint16_t> KQueryParser::_serializedATN;

std::vector<std::string> KQueryParser::_ruleNames = {
  "kquery", "arrayDeclaration", "arrayInitializer", "constInitializer", 
  "queryCommand", "constraintList", "evalExprList", "evalArrayList", "expression", 
  "updateList", "arithmeticBinaryOp", "bitwiseBinaryOp", "comparisonBinaryOP", 
  "fpConversionOp"
};

std::vector<std::string> KQueryParser::_literalNames = {
  "", "'array'", "'['", "']'", "':'", "'->'", "'='", "'symbolic'", "','", 
  "'('", "'query'", "')'", "'@'", "'Add'", "'Sub'", "'Mul'", "'UDiv'", "'URem'", 
  "'SDiv'", "'SRem'", "'Not'", "'And'", "'Or'", "'Xor'", "'Shl'", "'LShr'", 
  "'AShr'", "'Eq'", "'Ne'", "'Ult'", "'Ule'", "'Ugt'", "'Uge'", "'Slt'", 
  "'Sle'", "'Sgt'", "'Sge'", "'FOGe'", "'FOGt'", "'FOLe'", "'FOLt'", "'FOEq'", 
  "'Concat'", "'Extract'", "'ZExt'", "'SExt'", "'Read'", "'Select'", "'Neg'", 
  "'ReadLSB'", "'ReadMSB'", "'UIToFP'", "'SIToFP'", "'FPToUI'", "'FPToSI'", 
  "'FPExt'", "'FPTrunc'", "'FAdd'", "'FSub'", "'FMul'", "'FDiv'", "'FRem'", 
  "'FCmp'"
};

std::vector<std::string> KQueryParser::_symbolicNames = {
  "", "", "", "", "", "", "", "", "", "", "", "", "", "ARITH_ADD", "ARITH_SUB", 
  "ARITH_MUL", "ARITH_UDIV", "ARITH_UREM", "ARITH_SDIV", "ARITH_SREM", "BITWISE_NOT", 
  "BITWISE_AND", "BITWISE_OR", "BITWISE_XOR", "BITWISE_SHL", "BITWISE_LSHR", 
  "BITWISE_ASHR", "CMP_EQ", "CMP_NE", "CMP_ULT", "CMP_ULE", "CMP_UGT", "CMP_UGE", 
  "CMP_SLT", "CMP_SLE", "CMP_SGT", "CMP_SGE", "CMP_FOGE", "CMP_FOGT", "CMP_FOLE", 
  "CMP_FOLT", "CMP_FOEQ", "SP_CONCAT", "SP_EXTRACT", "SP_ZEXT", "SP_SEXT", 
  "SP_READ", "SP_SELECT", "SP_NEG", "SP_READLSB", "SP_READMSB", "FP_UITOFP", 
  "FP_SITOFP", "FP_FPTOUI", "FP_FPTOSI", "FP_FPEXT", "FP_FPTRUNC", "FP_ARITH_FADD", 
  "FP_ARITH_FSUB", "FP_ARITH_FMUL", "FP_ARITH_FDIV", "FP_ARITH_FREM", "FP_FCMP", 
  "NUMBER", "SIGNED_CONSTANT", "UNSIGNED_CONSTANT", "DEC_CONSTANT", "BIN_CONSTANT", 
  "OCT_CONSTANT", "HEX_CONSTANT", "SCIENTIFIC_CONSTANT", "TYPE", "IDENTIFIER", 
  "WS"
};

dfa::Vocabulary KQueryParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> KQueryParser::_tokenNames;

KQueryParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x4b, 0x139, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x3, 0x2, 0x3, 0x2, 0x6, 0x2, 0x21, 0xa, 0x2, 0xd, 
    0x2, 0xe, 0x2, 0x22, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x3, 0x5, 0x3, 0x3d, 0xa, 
    0x3, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x44, 
    0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x5, 0x5, 0x49, 0xa, 0x5, 0x3, 
    0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x5, 0x7, 0x5, 0x50, 0xa, 0x5, 
    0xc, 0x5, 0xe, 0x5, 0x53, 0xb, 0x5, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 
    0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 
    0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 0x63, 0xa, 0x6, 0x3, 0x7, 
    0x3, 0x7, 0x7, 0x7, 0x67, 0xa, 0x7, 0xc, 0x7, 0xe, 0x7, 0x6a, 0xb, 0x7, 
    0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x7, 0x8, 0x70, 0xa, 0x8, 0xc, 
    0x8, 0xe, 0x8, 0x73, 0xb, 0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x9, 0x3, 0x9, 
    0x7, 0x9, 0x79, 0xa, 0x9, 0xc, 0x9, 0xe, 0x9, 0x7c, 0xb, 0x9, 0x3, 0x9, 
    0x3, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 
    0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xa, 0x5, 0xa, 0x124, 0xa, 0xa, 0x3, 
    0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 
    0xb, 0x3, 0xb, 0x5, 0xb, 0x12f, 0xa, 0xb, 0x3, 0xc, 0x3, 0xc, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x2, 0x3, 
    0x8, 0x10, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 
    0x18, 0x1a, 0x1c, 0x2, 0x6, 0x4, 0x2, 0xf, 0x15, 0x3b, 0x3f, 0x3, 0x2, 
    0x17, 0x1c, 0x3, 0x2, 0x1d, 0x2b, 0x3, 0x2, 0x35, 0x38, 0x2, 0x152, 
    0x2, 0x20, 0x3, 0x2, 0x2, 0x2, 0x4, 0x3c, 0x3, 0x2, 0x2, 0x2, 0x6, 0x43, 
    0x3, 0x2, 0x2, 0x2, 0x8, 0x48, 0x3, 0x2, 0x2, 0x2, 0xa, 0x62, 0x3, 0x2, 
    0x2, 0x2, 0xc, 0x64, 0x3, 0x2, 0x2, 0x2, 0xe, 0x6d, 0x3, 0x2, 0x2, 0x2, 
    0x10, 0x76, 0x3, 0x2, 0x2, 0x2, 0x12, 0x123, 0x3, 0x2, 0x2, 0x2, 0x14, 
    0x12e, 0x3, 0x2, 0x2, 0x2, 0x16, 0x130, 0x3, 0x2, 0x2, 0x2, 0x18, 0x132, 
    0x3, 0x2, 0x2, 0x2, 0x1a, 0x134, 0x3, 0x2, 0x2, 0x2, 0x1c, 0x136, 0x3, 
    0x2, 0x2, 0x2, 0x1e, 0x21, 0x5, 0x4, 0x3, 0x2, 0x1f, 0x21, 0x5, 0xa, 
    0x6, 0x2, 0x20, 0x1e, 0x3, 0x2, 0x2, 0x2, 0x20, 0x1f, 0x3, 0x2, 0x2, 
    0x2, 0x21, 0x22, 0x3, 0x2, 0x2, 0x2, 0x22, 0x20, 0x3, 0x2, 0x2, 0x2, 
    0x22, 0x23, 0x3, 0x2, 0x2, 0x2, 0x23, 0x3, 0x3, 0x2, 0x2, 0x2, 0x24, 
    0x25, 0x7, 0x3, 0x2, 0x2, 0x25, 0x26, 0x7, 0x4a, 0x2, 0x2, 0x26, 0x27, 
    0x7, 0x4, 0x2, 0x2, 0x27, 0x28, 0x7, 0x41, 0x2, 0x2, 0x28, 0x29, 0x7, 
    0x5, 0x2, 0x2, 0x29, 0x2a, 0x7, 0x6, 0x2, 0x2, 0x2a, 0x2b, 0x7, 0x49, 
    0x2, 0x2, 0x2b, 0x2c, 0x7, 0x7, 0x2, 0x2, 0x2c, 0x2d, 0x7, 0x49, 0x2, 
    0x2, 0x2d, 0x2e, 0x7, 0x8, 0x2, 0x2, 0x2e, 0x3d, 0x5, 0x6, 0x4, 0x2, 
    0x2f, 0x30, 0x7, 0x3, 0x2, 0x2, 0x30, 0x31, 0x7, 0x4a, 0x2, 0x2, 0x31, 
    0x32, 0x7, 0x4, 0x2, 0x2, 0x32, 0x33, 0x7, 0x5, 0x2, 0x2, 0x33, 0x34, 
    0x7, 0x6, 0x2, 0x2, 0x34, 0x35, 0x7, 0x49, 0x2, 0x2, 0x35, 0x36, 0x7, 
    0x7, 0x2, 0x2, 0x36, 0x37, 0x7, 0x49, 0x2, 0x2, 0x37, 0x38, 0x7, 0x8, 
    0x2, 0x2, 0x38, 0x39, 0x7, 0x4, 0x2, 0x2, 0x39, 0x3a, 0x5, 0x8, 0x5, 
    0x2, 0x3a, 0x3b, 0x7, 0x5, 0x2, 0x2, 0x3b, 0x3d, 0x3, 0x2, 0x2, 0x2, 
    0x3c, 0x24, 0x3, 0x2, 0x2, 0x2, 0x3c, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x3d, 
    0x5, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x44, 0x7, 0x9, 0x2, 0x2, 0x3f, 0x40, 
    0x7, 0x4, 0x2, 0x2, 0x40, 0x41, 0x5, 0x8, 0x5, 0x2, 0x41, 0x42, 0x7, 
    0x5, 0x2, 0x2, 0x42, 0x44, 0x3, 0x2, 0x2, 0x2, 0x43, 0x3e, 0x3, 0x2, 
    0x2, 0x2, 0x43, 0x3f, 0x3, 0x2, 0x2, 0x2, 0x44, 0x7, 0x3, 0x2, 0x2, 
    0x2, 0x45, 0x46, 0x8, 0x5, 0x1, 0x2, 0x46, 0x49, 0x7, 0x41, 0x2, 0x2, 
    0x47, 0x49, 0x7, 0x41, 0x2, 0x2, 0x48, 0x45, 0x3, 0x2, 0x2, 0x2, 0x48, 
    0x47, 0x3, 0x2, 0x2, 0x2, 0x49, 0x51, 0x3, 0x2, 0x2, 0x2, 0x4a, 0x4b, 
    0xc, 0x6, 0x2, 0x2, 0x4b, 0x4c, 0x7, 0xa, 0x2, 0x2, 0x4c, 0x50, 0x7, 
    0x41, 0x2, 0x2, 0x4d, 0x4e, 0xc, 0x4, 0x2, 0x2, 0x4e, 0x50, 0x7, 0x41, 
    0x2, 0x2, 0x4f, 0x4a, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x4d, 0x3, 0x2, 0x2, 
    0x2, 0x50, 0x53, 0x3, 0x2, 0x2, 0x2, 0x51, 0x4f, 0x3, 0x2, 0x2, 0x2, 
    0x51, 0x52, 0x3, 0x2, 0x2, 0x2, 0x52, 0x9, 0x3, 0x2, 0x2, 0x2, 0x53, 
    0x51, 0x3, 0x2, 0x2, 0x2, 0x54, 0x55, 0x7, 0xb, 0x2, 0x2, 0x55, 0x56, 
    0x7, 0xc, 0x2, 0x2, 0x56, 0x57, 0x5, 0xc, 0x7, 0x2, 0x57, 0x58, 0x5, 
    0x12, 0xa, 0x2, 0x58, 0x59, 0x7, 0xd, 0x2, 0x2, 0x59, 0x63, 0x3, 0x2, 
    0x2, 0x2, 0x5a, 0x5b, 0x7, 0xb, 0x2, 0x2, 0x5b, 0x5c, 0x7, 0xc, 0x2, 
    0x2, 0x5c, 0x5d, 0x5, 0xc, 0x7, 0x2, 0x5d, 0x5e, 0x5, 0x12, 0xa, 0x2, 
    0x5e, 0x5f, 0x5, 0xe, 0x8, 0x2, 0x5f, 0x60, 0x5, 0x10, 0x9, 0x2, 0x60, 
    0x61, 0x7, 0xd, 0x2, 0x2, 0x61, 0x63, 0x3, 0x2, 0x2, 0x2, 0x62, 0x54, 
    0x3, 0x2, 0x2, 0x2, 0x62, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x63, 0xb, 0x3, 
    0x2, 0x2, 0x2, 0x64, 0x68, 0x7, 0x4, 0x2, 0x2, 0x65, 0x67, 0x5, 0x12, 
    0xa, 0x2, 0x66, 0x65, 0x3, 0x2, 0x2, 0x2, 0x67, 0x6a, 0x3, 0x2, 0x2, 
    0x2, 0x68, 0x66, 0x3, 0x2, 0x2, 0x2, 0x68, 0x69, 0x3, 0x2, 0x2, 0x2, 
    0x69, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x68, 0x3, 0x2, 0x2, 0x2, 0x6b, 
    0x6c, 0x7, 0x5, 0x2, 0x2, 0x6c, 0xd, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x71, 
    0x7, 0x4, 0x2, 0x2, 0x6e, 0x70, 0x5, 0x12, 0xa, 0x2, 0x6f, 0x6e, 0x3, 
    0x2, 0x2, 0x2, 0x70, 0x73, 0x3, 0x2, 0x2, 0x2, 0x71, 0x6f, 0x3, 0x2, 
    0x2, 0x2, 0x71, 0x72, 0x3, 0x2, 0x2, 0x2, 0x72, 0x74, 0x3, 0x2, 0x2, 
    0x2, 0x73, 0x71, 0x3, 0x2, 0x2, 0x2, 0x74, 0x75, 0x7, 0x5, 0x2, 0x2, 
    0x75, 0xf, 0x3, 0x2, 0x2, 0x2, 0x76, 0x7a, 0x7, 0x4, 0x2, 0x2, 0x77, 
    0x79, 0x7, 0x4a, 0x2, 0x2, 0x78, 0x77, 0x3, 0x2, 0x2, 0x2, 0x79, 0x7c, 
    0x3, 0x2, 0x2, 0x2, 0x7a, 0x78, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7b, 0x3, 
    0x2, 0x2, 0x2, 0x7b, 0x7d, 0x3, 0x2, 0x2, 0x2, 0x7c, 0x7a, 0x3, 0x2, 
    0x2, 0x2, 0x7d, 0x7e, 0x7, 0x5, 0x2, 0x2, 0x7e, 0x11, 0x3, 0x2, 0x2, 
    0x2, 0x7f, 0x80, 0x7, 0x4a, 0x2, 0x2, 0x80, 0x81, 0x7, 0x6, 0x2, 0x2, 
    0x81, 0x124, 0x5, 0x12, 0xa, 0x2, 0x82, 0x83, 0x7, 0xb, 0x2, 0x2, 0x83, 
    0x84, 0x5, 0x16, 0xc, 0x2, 0x84, 0x85, 0x7, 0x49, 0x2, 0x2, 0x85, 0x86, 
    0x5, 0x12, 0xa, 0x2, 0x86, 0x87, 0x5, 0x12, 0xa, 0x2, 0x87, 0x88, 0x7, 
    0xd, 0x2, 0x2, 0x88, 0x124, 0x3, 0x2, 0x2, 0x2, 0x89, 0x8a, 0x7, 0xb, 
    0x2, 0x2, 0x8a, 0x8b, 0x7, 0x16, 0x2, 0x2, 0x8b, 0x8c, 0x7, 0x49, 0x2, 
    0x2, 0x8c, 0x8d, 0x5, 0x12, 0xa, 0x2, 0x8d, 0x8e, 0x7, 0xd, 0x2, 0x2, 
    0x8e, 0x124, 0x3, 0x2, 0x2, 0x2, 0x8f, 0x90, 0x7, 0xb, 0x2, 0x2, 0x90, 
    0x91, 0x7, 0x16, 0x2, 0x2, 0x91, 0x92, 0x5, 0x12, 0xa, 0x2, 0x92, 0x93, 
    0x7, 0xd, 0x2, 0x2, 0x93, 0x124, 0x3, 0x2, 0x2, 0x2, 0x94, 0x95, 0x7, 
    0xb, 0x2, 0x2, 0x95, 0x96, 0x5, 0x18, 0xd, 0x2, 0x96, 0x97, 0x7, 0x49, 
    0x2, 0x2, 0x97, 0x98, 0x5, 0x12, 0xa, 0x2, 0x98, 0x99, 0x5, 0x12, 0xa, 
    0x2, 0x99, 0x9a, 0x7, 0xd, 0x2, 0x2, 0x9a, 0x124, 0x3, 0x2, 0x2, 0x2, 
    0x9b, 0x9c, 0x7, 0xb, 0x2, 0x2, 0x9c, 0x9d, 0x5, 0x18, 0xd, 0x2, 0x9d, 
    0x9e, 0x5, 0x12, 0xa, 0x2, 0x9e, 0x9f, 0x5, 0x12, 0xa, 0x2, 0x9f, 0xa0, 
    0x7, 0xd, 0x2, 0x2, 0xa0, 0x124, 0x3, 0x2, 0x2, 0x2, 0xa1, 0xa2, 0x7, 
    0xb, 0x2, 0x2, 0xa2, 0xa3, 0x5, 0x1a, 0xe, 0x2, 0xa3, 0xa4, 0x7, 0x49, 
    0x2, 0x2, 0xa4, 0xa5, 0x5, 0x12, 0xa, 0x2, 0xa5, 0xa6, 0x5, 0x12, 0xa, 
    0x2, 0xa6, 0xa7, 0x7, 0xd, 0x2, 0x2, 0xa7, 0x124, 0x3, 0x2, 0x2, 0x2, 
    0xa8, 0xa9, 0x7, 0xb, 0x2, 0x2, 0xa9, 0xaa, 0x5, 0x1a, 0xe, 0x2, 0xaa, 
    0xab, 0x5, 0x12, 0xa, 0x2, 0xab, 0xac, 0x5, 0x12, 0xa, 0x2, 0xac, 0xad, 
    0x7, 0xd, 0x2, 0x2, 0xad, 0x124, 0x3, 0x2, 0x2, 0x2, 0xae, 0xaf, 0x7, 
    0xb, 0x2, 0x2, 0xaf, 0xb0, 0x7, 0x2c, 0x2, 0x2, 0xb0, 0xb1, 0x7, 0x49, 
    0x2, 0x2, 0xb1, 0xb2, 0x5, 0x12, 0xa, 0x2, 0xb2, 0xb3, 0x5, 0x12, 0xa, 
    0x2, 0xb3, 0xb4, 0x7, 0xd, 0x2, 0x2, 0xb4, 0x124, 0x3, 0x2, 0x2, 0x2, 
    0xb5, 0xb6, 0x7, 0xb, 0x2, 0x2, 0xb6, 0xb7, 0x7, 0x2c, 0x2, 0x2, 0xb7, 
    0xb8, 0x5, 0x12, 0xa, 0x2, 0xb8, 0xb9, 0x5, 0x12, 0xa, 0x2, 0xb9, 0xba, 
    0x7, 0xd, 0x2, 0x2, 0xba, 0x124, 0x3, 0x2, 0x2, 0x2, 0xbb, 0xbc, 0x7, 
    0xb, 0x2, 0x2, 0xbc, 0xbd, 0x7, 0x2d, 0x2, 0x2, 0xbd, 0xbe, 0x7, 0x49, 
    0x2, 0x2, 0xbe, 0xbf, 0x5, 0x12, 0xa, 0x2, 0xbf, 0xc0, 0x5, 0x12, 0xa, 
    0x2, 0xc0, 0xc1, 0x7, 0xd, 0x2, 0x2, 0xc1, 0x124, 0x3, 0x2, 0x2, 0x2, 
    0xc2, 0xc3, 0x7, 0xb, 0x2, 0x2, 0xc3, 0xc4, 0x7, 0x2e, 0x2, 0x2, 0xc4, 
    0xc5, 0x7, 0x49, 0x2, 0x2, 0xc5, 0xc6, 0x5, 0x12, 0xa, 0x2, 0xc6, 0xc7, 
    0x7, 0xd, 0x2, 0x2, 0xc7, 0x124, 0x3, 0x2, 0x2, 0x2, 0xc8, 0xc9, 0x7, 
    0xb, 0x2, 0x2, 0xc9, 0xca, 0x7, 0x2f, 0x2, 0x2, 0xca, 0xcb, 0x7, 0x49, 
    0x2, 0x2, 0xcb, 0xcc, 0x5, 0x12, 0xa, 0x2, 0xcc, 0xcd, 0x7, 0xd, 0x2, 
    0x2, 0xcd, 0x124, 0x3, 0x2, 0x2, 0x2, 0xce, 0xcf, 0x7, 0xb, 0x2, 0x2, 
    0xcf, 0xd0, 0x7, 0x30, 0x2, 0x2, 0xd0, 0xd1, 0x7, 0x49, 0x2, 0x2, 0xd1, 
    0xd2, 0x5, 0x12, 0xa, 0x2, 0xd2, 0xd3, 0x5, 0x12, 0xa, 0x2, 0xd3, 0xd4, 
    0x7, 0xd, 0x2, 0x2, 0xd4, 0x124, 0x3, 0x2, 0x2, 0x2, 0xd5, 0xd6, 0x7, 
    0xb, 0x2, 0x2, 0xd6, 0xd7, 0x7, 0x31, 0x2, 0x2, 0xd7, 0xd8, 0x7, 0x49, 
    0x2, 0x2, 0xd8, 0xd9, 0x5, 0x12, 0xa, 0x2, 0xd9, 0xda, 0x5, 0x12, 0xa, 
    0x2, 0xda, 0xdb, 0x5, 0x12, 0xa, 0x2, 0xdb, 0xdc, 0x7, 0xd, 0x2, 0x2, 
    0xdc, 0x124, 0x3, 0x2, 0x2, 0x2, 0xdd, 0xde, 0x7, 0xb, 0x2, 0x2, 0xde, 
    0xdf, 0x7, 0x32, 0x2, 0x2, 0xdf, 0xe0, 0x7, 0x49, 0x2, 0x2, 0xe0, 0xe1, 
    0x5, 0x12, 0xa, 0x2, 0xe1, 0xe2, 0x7, 0xd, 0x2, 0x2, 0xe2, 0x124, 0x3, 
    0x2, 0x2, 0x2, 0xe3, 0xe4, 0x7, 0xb, 0x2, 0x2, 0xe4, 0xe5, 0x7, 0x32, 
    0x2, 0x2, 0xe5, 0xe6, 0x5, 0x12, 0xa, 0x2, 0xe6, 0xe7, 0x7, 0xd, 0x2, 
    0x2, 0xe7, 0x124, 0x3, 0x2, 0x2, 0x2, 0xe8, 0xe9, 0x7, 0xb, 0x2, 0x2, 
    0xe9, 0xea, 0x7, 0x33, 0x2, 0x2, 0xea, 0xeb, 0x7, 0x49, 0x2, 0x2, 0xeb, 
    0xec, 0x5, 0x12, 0xa, 0x2, 0xec, 0xed, 0x5, 0x12, 0xa, 0x2, 0xed, 0xee, 
    0x7, 0xd, 0x2, 0x2, 0xee, 0x124, 0x3, 0x2, 0x2, 0x2, 0xef, 0xf0, 0x7, 
    0xb, 0x2, 0x2, 0xf0, 0xf1, 0x7, 0x34, 0x2, 0x2, 0xf1, 0xf2, 0x7, 0x49, 
    0x2, 0x2, 0xf2, 0xf3, 0x5, 0x12, 0xa, 0x2, 0xf3, 0xf4, 0x5, 0x12, 0xa, 
    0x2, 0xf4, 0xf5, 0x7, 0xd, 0x2, 0x2, 0xf5, 0x124, 0x3, 0x2, 0x2, 0x2, 
    0xf6, 0xf7, 0x7, 0xb, 0x2, 0x2, 0xf7, 0xf8, 0x7, 0x40, 0x2, 0x2, 0xf8, 
    0xf9, 0x5, 0x12, 0xa, 0x2, 0xf9, 0xfa, 0x5, 0x12, 0xa, 0x2, 0xfa, 0xfb, 
    0x5, 0x12, 0xa, 0x2, 0xfb, 0xfc, 0x7, 0xd, 0x2, 0x2, 0xfc, 0x124, 0x3, 
    0x2, 0x2, 0x2, 0xfd, 0xfe, 0x7, 0xb, 0x2, 0x2, 0xfe, 0xff, 0x5, 0x1c, 
    0xf, 0x2, 0xff, 0x100, 0x7, 0x49, 0x2, 0x2, 0x100, 0x101, 0x5, 0x12, 
    0xa, 0x2, 0x101, 0x102, 0x7, 0xd, 0x2, 0x2, 0x102, 0x124, 0x3, 0x2, 
    0x2, 0x2, 0x103, 0x104, 0x7, 0xb, 0x2, 0x2, 0x104, 0x105, 0x7, 0x39, 
    0x2, 0x2, 0x105, 0x106, 0x7, 0x49, 0x2, 0x2, 0x106, 0x107, 0x5, 0x12, 
    0xa, 0x2, 0x107, 0x108, 0x7, 0xd, 0x2, 0x2, 0x108, 0x124, 0x3, 0x2, 
    0x2, 0x2, 0x109, 0x10a, 0x7, 0xb, 0x2, 0x2, 0x10a, 0x10b, 0x7, 0x3a, 
    0x2, 0x2, 0x10b, 0x10c, 0x7, 0x49, 0x2, 0x2, 0x10c, 0x10d, 0x5, 0x12, 
    0xa, 0x2, 0x10d, 0x10e, 0x7, 0xd, 0x2, 0x2, 0x10e, 0x124, 0x3, 0x2, 
    0x2, 0x2, 0x10f, 0x110, 0x7, 0x4, 0x2, 0x2, 0x110, 0x111, 0x5, 0x14, 
    0xb, 0x2, 0x111, 0x112, 0x7, 0x5, 0x2, 0x2, 0x112, 0x113, 0x7, 0xe, 
    0x2, 0x2, 0x113, 0x114, 0x7, 0x4a, 0x2, 0x2, 0x114, 0x124, 0x3, 0x2, 
    0x2, 0x2, 0x115, 0x116, 0x7, 0x4, 0x2, 0x2, 0x116, 0x117, 0x7, 0x5, 
    0x2, 0x2, 0x117, 0x118, 0x7, 0xe, 0x2, 0x2, 0x118, 0x124, 0x7, 0x4a, 
    0x2, 0x2, 0x119, 0x11a, 0x7, 0xb, 0x2, 0x2, 0x11a, 0x11b, 0x7, 0x49, 
    0x2, 0x2, 0x11b, 0x11c, 0x7, 0x41, 0x2, 0x2, 0x11c, 0x124, 0x7, 0xd, 
    0x2, 0x2, 0x11d, 0x11e, 0x7, 0xb, 0x2, 0x2, 0x11e, 0x11f, 0x7, 0x49, 
    0x2, 0x2, 0x11f, 0x120, 0x7, 0x4a, 0x2, 0x2, 0x120, 0x124, 0x7, 0xd, 
    0x2, 0x2, 0x121, 0x124, 0x7, 0x4a, 0x2, 0x2, 0x122, 0x124, 0x7, 0x41, 
    0x2, 0x2, 0x123, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x123, 0x82, 0x3, 0x2, 0x2, 
    0x2, 0x123, 0x89, 0x3, 0x2, 0x2, 0x2, 0x123, 0x8f, 0x3, 0x2, 0x2, 0x2, 
    0x123, 0x94, 0x3, 0x2, 0x2, 0x2, 0x123, 0x9b, 0x3, 0x2, 0x2, 0x2, 0x123, 
    0xa1, 0x3, 0x2, 0x2, 0x2, 0x123, 0xa8, 0x3, 0x2, 0x2, 0x2, 0x123, 0xae, 
    0x3, 0x2, 0x2, 0x2, 0x123, 0xb5, 0x3, 0x2, 0x2, 0x2, 0x123, 0xbb, 0x3, 
    0x2, 0x2, 0x2, 0x123, 0xc2, 0x3, 0x2, 0x2, 0x2, 0x123, 0xc8, 0x3, 0x2, 
    0x2, 0x2, 0x123, 0xce, 0x3, 0x2, 0x2, 0x2, 0x123, 0xd5, 0x3, 0x2, 0x2, 
    0x2, 0x123, 0xdd, 0x3, 0x2, 0x2, 0x2, 0x123, 0xe3, 0x3, 0x2, 0x2, 0x2, 
    0x123, 0xe8, 0x3, 0x2, 0x2, 0x2, 0x123, 0xef, 0x3, 0x2, 0x2, 0x2, 0x123, 
    0xf6, 0x3, 0x2, 0x2, 0x2, 0x123, 0xfd, 0x3, 0x2, 0x2, 0x2, 0x123, 0x103, 
    0x3, 0x2, 0x2, 0x2, 0x123, 0x109, 0x3, 0x2, 0x2, 0x2, 0x123, 0x10f, 
    0x3, 0x2, 0x2, 0x2, 0x123, 0x115, 0x3, 0x2, 0x2, 0x2, 0x123, 0x119, 
    0x3, 0x2, 0x2, 0x2, 0x123, 0x11d, 0x3, 0x2, 0x2, 0x2, 0x123, 0x121, 
    0x3, 0x2, 0x2, 0x2, 0x123, 0x122, 0x3, 0x2, 0x2, 0x2, 0x124, 0x13, 0x3, 
    0x2, 0x2, 0x2, 0x125, 0x126, 0x7, 0xa, 0x2, 0x2, 0x126, 0x127, 0x5, 
    0x12, 0xa, 0x2, 0x127, 0x128, 0x7, 0x8, 0x2, 0x2, 0x128, 0x129, 0x5, 
    0x12, 0xa, 0x2, 0x129, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x12a, 0x12b, 0x5, 
    0x12, 0xa, 0x2, 0x12b, 0x12c, 0x7, 0x8, 0x2, 0x2, 0x12c, 0x12d, 0x5, 
    0x12, 0xa, 0x2, 0x12d, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x125, 0x3, 
    0x2, 0x2, 0x2, 0x12e, 0x12a, 0x3, 0x2, 0x2, 0x2, 0x12f, 0x15, 0x3, 0x2, 
    0x2, 0x2, 0x130, 0x131, 0x9, 0x2, 0x2, 0x2, 0x131, 0x17, 0x3, 0x2, 0x2, 
    0x2, 0x132, 0x133, 0x9, 0x3, 0x2, 0x2, 0x133, 0x19, 0x3, 0x2, 0x2, 0x2, 
    0x134, 0x135, 0x9, 0x4, 0x2, 0x2, 0x135, 0x1b, 0x3, 0x2, 0x2, 0x2, 0x136, 
    0x137, 0x9, 0x5, 0x2, 0x2, 0x137, 0x1d, 0x3, 0x2, 0x2, 0x2, 0xf, 0x20, 
    0x22, 0x3c, 0x43, 0x48, 0x4f, 0x51, 0x62, 0x68, 0x71, 0x7a, 0x123, 0x12e, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

KQueryParser::Initializer KQueryParser::_init;
