// Generated from tmp/PlayPlus.g4 by ANTLR 4.6
package tmp;
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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IMPORT=1, QUOTE=2, MAPFILE=3, LPAR=4, RPAR=5, COLON=6, COMMA=7, SEMICOLON=8, 
		RCRO=9, LCRO=10, AS=11, MAIN=12, FUNCTION=13, VOID=14, DO=15, END=16, 
		DIG=17, SCALAR=18, RECORD=19, ID=20, NUMBER=21, COMMENT_MULTILINE=22, 
		COMMENT_SINGLELINE=23, NEWLINE=24, WS=25;
	public static final int
		RULE_root = 0, RULE_programme = 1, RULE_mapImport = 2, RULE_mainFunction = 3, 
		RULE_instruction = 4, RULE_variableDeclaration = 5, RULE_variableType = 6, 
		RULE_arrayType = 7, RULE_structure = 8;
	public static final String[] ruleNames = {
		"root", "programme", "mapImport", "mainFunction", "instruction", "variableDeclaration", 
		"variableType", "arrayType", "structure"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#import'", "'\"'", null, "'('", "')'", "':'", "','", "';'", "']'", 
		"'['", "'as'", "'main'", "'function'", "'void'", "'do'", "'end'", "'dig()'", 
		null, "'record'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IMPORT", "QUOTE", "MAPFILE", "LPAR", "RPAR", "COLON", "COMMA", 
		"SEMICOLON", "RCRO", "LCRO", "AS", "MAIN", "FUNCTION", "VOID", "DO", "END", 
		"DIG", "SCALAR", "RECORD", "ID", "NUMBER", "COMMENT_MULTILINE", "COMMENT_SINGLELINE", 
		"NEWLINE", "WS"
	};
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
		public ProgrammeContext programme() {
			return getRuleContext(ProgrammeContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			programme();
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

	public static class ProgrammeContext extends ParserRuleContext {
		public MapImportContext mapImport() {
			return getRuleContext(MapImportContext.class,0);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public List<TerminalNode> COMMENT_MULTILINE() { return getTokens(PlayPlusParser.COMMENT_MULTILINE); }
		public TerminalNode COMMENT_MULTILINE(int i) {
			return getToken(PlayPlusParser.COMMENT_MULTILINE, i);
		}
		public List<TerminalNode> COMMENT_SINGLELINE() { return getTokens(PlayPlusParser.COMMENT_SINGLELINE); }
		public TerminalNode COMMENT_SINGLELINE(int i) {
			return getToken(PlayPlusParser.COMMENT_SINGLELINE, i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ProgrammeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programme; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterProgramme(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitProgramme(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitProgramme(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammeContext programme() throws RecognitionException {
		ProgrammeContext _localctx = new ProgrammeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programme);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			mapImport();
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_MULTILINE) {
					{
					{
					setState(21);
					match(COMMENT_MULTILINE);
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT_SINGLELINE) {
					{
					{
					setState(27);
					match(COMMENT_SINGLELINE);
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(33);
					variableDeclaration();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(41);
			mainFunction();
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

	public static class MapImportContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PlayPlusParser.IMPORT, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(PlayPlusParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(PlayPlusParser.QUOTE, i);
		}
		public TerminalNode MAPFILE() { return getToken(PlayPlusParser.MAPFILE, 0); }
		public MapImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMapImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMapImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMapImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapImportContext mapImport() throws RecognitionException {
		MapImportContext _localctx = new MapImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mapImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IMPORT);
			setState(44);
			match(QUOTE);
			setState(45);
			match(MAPFILE);
			setState(46);
			match(QUOTE);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(PlayPlusParser.MAIN, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode FUNCTION() { return getToken(PlayPlusParser.FUNCTION, 0); }
		public TerminalNode LPAR() { return getToken(PlayPlusParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PlayPlusParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PlayPlusParser.COLON, 0); }
		public TerminalNode VOID() { return getToken(PlayPlusParser.VOID, 0); }
		public TerminalNode DO() { return getToken(PlayPlusParser.DO, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public TerminalNode DIG() { return getToken(PlayPlusParser.DIG, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(MAIN);
			setState(49);
			match(AS);
			setState(50);
			match(FUNCTION);
			setState(51);
			match(LPAR);
			setState(52);
			match(RPAR);
			setState(53);
			match(COLON);
			setState(54);
			match(VOID);
			setState(55);
			match(DO);
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIG:
				{
				{
				setState(56);
				match(DIG);
				setState(57);
				match(SEMICOLON);
				}
				}
				break;
			case ID:
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					instruction();
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(65);
			match(END);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(67);
			variableDeclaration();
			}
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PlayPlusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PlayPlusParser.ID, i);
		}
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclaration);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69);
				match(ID);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(70);
					match(COMMA);
					setState(71);
					match(ID);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(AS);
				setState(78);
				variableType();
				setState(79);
				match(SEMICOLON);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				structure();
				}
				break;
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

	public static class VariableTypeContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitVariableType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitVariableType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableType);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(SCALAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				arrayType();
				}
				break;
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode SCALAR() { return getToken(PlayPlusParser.SCALAR, 0); }
		public TerminalNode LCRO() { return getToken(PlayPlusParser.LCRO, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(PlayPlusParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(PlayPlusParser.NUMBER, i);
		}
		public TerminalNode RCRO() { return getToken(PlayPlusParser.RCRO, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlayPlusParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayPlusParser.COMMA, i);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arrayType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SCALAR);
			setState(89);
			match(LCRO);
			setState(90);
			match(NUMBER);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				match(NUMBER);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(RCRO);
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

	public static class StructureContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PlayPlusParser.ID, 0); }
		public TerminalNode AS() { return getToken(PlayPlusParser.AS, 0); }
		public TerminalNode RECORD() { return getToken(PlayPlusParser.RECORD, 0); }
		public TerminalNode END() { return getToken(PlayPlusParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(PlayPlusParser.SEMICOLON, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayPlusListener ) ((PlayPlusListener)listener).exitStructure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayPlusVisitor ) return ((PlayPlusVisitor<? extends T>)visitor).visitStructure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_structure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(AS);
			setState(102);
			match(RECORD);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				variableDeclaration();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(108);
			match(END);
			setState(109);
			match(SEMICOLON);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5>\n\5\r\5\16\5?\5\5B\n\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\7\7K\n\7\f\7\16\7N\13\7\3\7\3\7\3\7\3\7\3\7\5\7U"+
		"\n\7\3\b\3\b\5\bY\n\b\3\t\3\t\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\6\nk\n\n\r\n\16\nl\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b"+
		"\n\f\16\20\22\2\2u\2\24\3\2\2\2\4\26\3\2\2\2\6-\3\2\2\2\b\62\3\2\2\2\n"+
		"E\3\2\2\2\fT\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22f\3\2\2\2\24\25\5\4\3\2"+
		"\25\3\3\2\2\2\26)\5\6\4\2\27\31\7\30\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32"+
		"\30\3\2\2\2\32\33\3\2\2\2\33*\3\2\2\2\34\32\3\2\2\2\35\37\7\31\2\2\36"+
		"\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!*\3\2\2\2\" \3\2\2\2#%"+
		"\5\f\7\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2"+
		")\32\3\2\2\2) \3\2\2\2)&\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\b\5\2,\5\3\2"+
		"\2\2-.\7\3\2\2./\7\4\2\2/\60\7\5\2\2\60\61\7\4\2\2\61\7\3\2\2\2\62\63"+
		"\7\16\2\2\63\64\7\r\2\2\64\65\7\17\2\2\65\66\7\6\2\2\66\67\7\7\2\2\67"+
		"8\7\b\2\289\7\20\2\29A\7\21\2\2:;\7\23\2\2;B\7\n\2\2<>\5\n\6\2=<\3\2\2"+
		"\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A:\3\2\2\2A=\3\2\2\2BC\3\2\2"+
		"\2CD\7\22\2\2D\t\3\2\2\2EF\5\f\7\2F\13\3\2\2\2GL\7\26\2\2HI\7\t\2\2IK"+
		"\7\26\2\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2"+
		"OP\7\r\2\2PQ\5\16\b\2QR\7\n\2\2RU\3\2\2\2SU\5\22\n\2TG\3\2\2\2TS\3\2\2"+
		"\2U\r\3\2\2\2VY\7\24\2\2WY\5\20\t\2XV\3\2\2\2XW\3\2\2\2Y\17\3\2\2\2Z["+
		"\7\24\2\2[\\\7\f\2\2\\a\7\27\2\2]^\7\t\2\2^`\7\27\2\2_]\3\2\2\2`c\3\2"+
		"\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\13\2\2e\21\3\2\2\2fg"+
		"\7\26\2\2gh\7\r\2\2hj\7\25\2\2ik\5\f\7\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2mn\3\2\2\2no\7\22\2\2op\7\n\2\2p\23\3\2\2\2\r\32 &)?ALTXal";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}