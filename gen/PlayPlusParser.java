// Generated from /Users/patmol/repos/1920_IHDCB332_GROUPE19/src/main/antlr4/tmp/PlayPlus.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFFECT=1, LPAR=2, RPAR=3, COMMA=4, PLUS=5, MINUS=6, ID=7, NUMBER=8, COMMENT=9, 
		NEWLINE=10, WS=11;
	public static final int
		RULE_root = 0, RULE_instruction = 1, RULE_expression = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "instruction", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'affect'", "'('", "')'", "','", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "ID", "NUMBER", 
			"COMMENT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayPlusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				instruction();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AFFECT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AffectInstrContext extends InstructionContext {
		public TerminalNode AFFECT() { return getToken(PlayPlusParser.AFFECT, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(PlayPlusParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public AffectInstrContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterAffectInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitAffectInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitAffectInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			_localctx = new AffectInstrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			match(AFFECT);
			setState(12);
			match(LPAR);
			setState(13);
			match(ID);
			setState(14);
			match(COMMA);
			setState(15);
			expression(0);
			setState(16);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public VariableExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusExprContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(PlayPlusParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlayPlusParser.MINUS, 0); }
		public PlusMinusExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterPlusMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitPlusMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitPlusMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantExprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(PlayPlusParser.NUMBER, 0); }
		public ConstantExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterConstantExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitConstantExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitConstantExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new ConstantExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(NUMBER);
				}
				break;
			case ID:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PlusMinusExprContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(23);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(24);
					((PlusMinusExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((PlusMinusExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(25);
					expression(2);
					}
					} 
				}
				setState(30);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r\"\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\5\4\30\n\4\3\4\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\3\4\2\3\6\5\2"+
		"\4\6\2\3\3\2\7\b\2!\2\t\3\2\2\2\4\r\3\2\2\2\6\27\3\2\2\2\b\n\5\4\3\2\t"+
		"\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\7\3"+
		"\2\2\16\17\7\4\2\2\17\20\7\t\2\2\20\21\7\6\2\2\21\22\5\6\4\2\22\23\7\5"+
		"\2\2\23\5\3\2\2\2\24\25\b\4\1\2\25\30\7\n\2\2\26\30\7\t\2\2\27\24\3\2"+
		"\2\2\27\26\3\2\2\2\30\36\3\2\2\2\31\32\f\3\2\2\32\33\t\2\2\2\33\35\5\6"+
		"\4\4\34\31\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\7\3\2\2"+
		"\2 \36\3\2\2\2\5\13\27\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}