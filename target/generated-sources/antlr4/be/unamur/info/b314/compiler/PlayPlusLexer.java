// Generated from be/unamur/info/b314/compiler/PlayPlus.g4 by ANTLR 4.6
package be.unamur.info.b314.compiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAP=1, ROBOT=2, CHEST=3, GRASS=4, PALMTREE=5, BRIDGE=6, BUSH=7, CASK=8, 
		WELL=9, EMPTY=10, SQUELETON=11, COLON=12, NUMBER=13, COMMENT_MULTILINE=14, 
		COMMENT_SINGLELINE=15, NEWLINE=16, WS=17, DASH=18, IMPORT=19, MAPFILE=20, 
		LPAR=21, RPAR=22, COMMA=23, SEMICOLON=24, RBRA=25, LBRA=26, AS=27, EQUAL=28, 
		QUOTE=29, SINGLE_QUOTE=30, ASSIGN=31, MAIN=32, FUNCTION=33, VOID=34, DO=35, 
		END=36, CONST=37, ENUM=38, PLUS=39, MINUS=40, MULTI=41, DIV=42, MOD=43, 
		TRUE=44, FALSE=45, AND=46, OR=47, NOT=48, LESS=49, LESS_EQUAL=50, GREAT=51, 
		GREAT_EQUAL=52, NOT_EQUAL=53, LEFT=54, RIGHT=55, UP=56, DOWN=57, JUMP=58, 
		FIGHT=59, DIG=60, SCALAR=61, RECORD=62, ID=63, STRING=64, CHAR=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", "CASK", 
		"WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "LETTER", "DIGIT", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "DASH", "IMPORT", "MAPFILE", "LPAR", 
		"RPAR", "COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", 
		"SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", 
		"ENUM", "PLUS", "MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", 
		"OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", 
		"ID", "STRING", "CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'@'", "'X'", "'G'", "'P'", "'A'", "'B'", "'T'", "'S'", 
		"'_'", "'Q'", "':'", null, null, null, null, null, "'#'", "'import'", 
		null, "'('", "')'", "','", "';'", "']'", "'['", "'as'", "'='", "'\"'", 
		"'''", "':='", "'main'", "'function'", "'void'", "'do'", "'end'", "'const'", 
		"'enum'", "'+'", "'-'", "'*'", "'/'", "'%'", "'true'", "'false'", "'and'", 
		"'or'", "'not'", "'<'", "'<='", "'>'", "'>='", "'<>'", "'left'", "'right'", 
		"'up'", "'down'", "'jump'", "'fight'", "'dig'", null, "'record'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAP", "ROBOT", "CHEST", "GRASS", "PALMTREE", "BRIDGE", "BUSH", 
		"CASK", "WELL", "EMPTY", "SQUELETON", "COLON", "NUMBER", "COMMENT_MULTILINE", 
		"COMMENT_SINGLELINE", "NEWLINE", "WS", "DASH", "IMPORT", "MAPFILE", "LPAR", 
		"RPAR", "COMMA", "SEMICOLON", "RBRA", "LBRA", "AS", "EQUAL", "QUOTE", 
		"SINGLE_QUOTE", "ASSIGN", "MAIN", "FUNCTION", "VOID", "DO", "END", "CONST", 
		"ENUM", "PLUS", "MINUS", "MULTI", "DIV", "MOD", "TRUE", "FALSE", "AND", 
		"OR", "NOT", "LESS", "LESS_EQUAL", "GREAT", "GREAT_EQUAL", "NOT_EQUAL", 
		"LEFT", "RIGHT", "UP", "DOWN", "JUMP", "FIGHT", "DIG", "SCALAR", "RECORD", 
		"ID", "STRING", "CHAR"
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


	public PlayPlusLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlus.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2C\u01ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\6\16\u00a5\n\16\r\16\16\16\u00a6\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00bf\n\22\f\22\16\22\u00c2\13\22"+
		"\3\22\3\22\5\22\u00c6\n\22\3\22\5\22\u00c9\n\22\3\22\3\22\3\23\5\23\u00ce"+
		"\n\23\3\23\3\23\3\23\3\23\3\24\6\24\u00d5\n\24\r\24\16\24\u00d6\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\3/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38"+
		"\38\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3="+
		"\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\5@\u0188\n@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\7B\u0194"+
		"\nB\fB\16B\u0197\13B\3C\3C\3C\3C\3C\5C\u019e\nC\3C\7C\u01a1\nC\fC\16C"+
		"\u01a4\13C\3C\3C\3D\3D\3D\5D\u01ab\nD\3D\3D\4\u00b2\u00c0\2E\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\2!\20#\21"+
		"%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!"+
		"E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w"+
		";y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\3\2\4\4\2C\\c|\4\2\13\13\"\""+
		"\u01bc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\3\u0089\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2"+
		"\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u0099\3\2\2\2"+
		"\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3\2\2\2\33"+
		"\u00a4\3\2\2\2\35\u00a8\3\2\2\2\37\u00aa\3\2\2\2!\u00ac\3\2\2\2#\u00ba"+
		"\3\2\2\2%\u00cd\3\2\2\2\'\u00d4\3\2\2\2)\u00da\3\2\2\2+\u00dc\3\2\2\2"+
		"-\u00e3\3\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef"+
		"\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2\2\2;\u00f5\3\2\2\2=\u00f8\3\2\2\2"+
		"?\u00fa\3\2\2\2A\u00fc\3\2\2\2C\u00fe\3\2\2\2E\u0101\3\2\2\2G\u0106\3"+
		"\2\2\2I\u010f\3\2\2\2K\u0114\3\2\2\2M\u0117\3\2\2\2O\u011b\3\2\2\2Q\u0121"+
		"\3\2\2\2S\u0126\3\2\2\2U\u0128\3\2\2\2W\u012a\3\2\2\2Y\u012c\3\2\2\2["+
		"\u012e\3\2\2\2]\u0130\3\2\2\2_\u0135\3\2\2\2a\u013b\3\2\2\2c\u013f\3\2"+
		"\2\2e\u0142\3\2\2\2g\u0146\3\2\2\2i\u0148\3\2\2\2k\u014b\3\2\2\2m\u014d"+
		"\3\2\2\2o\u0150\3\2\2\2q\u0153\3\2\2\2s\u0158\3\2\2\2u\u015e\3\2\2\2w"+
		"\u0161\3\2\2\2y\u0166\3\2\2\2{\u016b\3\2\2\2}\u0171\3\2\2\2\177\u0187"+
		"\3\2\2\2\u0081\u0189\3\2\2\2\u0083\u0190\3\2\2\2\u0085\u0198\3\2\2\2\u0087"+
		"\u01a7\3\2\2\2\u0089\u008a\7o\2\2\u008a\u008b\7c\2\2\u008b\u008c\7r\2"+
		"\2\u008c\4\3\2\2\2\u008d\u008e\7B\2\2\u008e\6\3\2\2\2\u008f\u0090\7Z\2"+
		"\2\u0090\b\3\2\2\2\u0091\u0092\7I\2\2\u0092\n\3\2\2\2\u0093\u0094\7R\2"+
		"\2\u0094\f\3\2\2\2\u0095\u0096\7C\2\2\u0096\16\3\2\2\2\u0097\u0098\7D"+
		"\2\2\u0098\20\3\2\2\2\u0099\u009a\7V\2\2\u009a\22\3\2\2\2\u009b\u009c"+
		"\7U\2\2\u009c\24\3\2\2\2\u009d\u009e\7a\2\2\u009e\26\3\2\2\2\u009f\u00a0"+
		"\7S\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7<\2\2\u00a2\32\3\2\2\2\u00a3\u00a5"+
		"\5\37\20\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\36\3\2"+
		"\2\2\u00aa\u00ab\4\62;\2\u00ab \3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae"+
		"\7,\2\2\u00ae\u00b2\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\b\21\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7\61\2"+
		"\2\u00bb\u00bc\7\61\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bf\13\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\5%\23\2\u00c4"+
		"\u00c6\7\2\2\3\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c9\7\2\2\3\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\22\2\2\u00cb$\3\2\2\2\u00cc\u00ce\7\17\2"+
		"\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\7\f\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\23\2\2\u00d2&\3\2\2\2\u00d3"+
		"\u00d5\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\24\2\2\u00d9"+
		"(\3\2\2\2\u00da\u00db\7%\2\2\u00db*\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de"+
		"\7o\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2,\3\2\2\2\u00e3\u00e4\5\u0083B\2\u00e4\u00e5\7\60\2"+
		"\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7r\2\2\u00e8.\3\2"+
		"\2\2\u00e9\u00ea\7*\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7+\2\2\u00ec\62\3"+
		"\2\2\2\u00ed\u00ee\7.\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7=\2\2\u00f0\66"+
		"\3\2\2\2\u00f1\u00f2\7_\2\2\u00f28\3\2\2\2\u00f3\u00f4\7]\2\2\u00f4:\3"+
		"\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7u\2\2\u00f7<\3\2\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9>\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7"+
		")\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7<\2\2\u00ff\u0100\7?\2\2\u0100D\3\2"+
		"\2\2\u0101\u0102\7o\2\2\u0102\u0103\7c\2\2\u0103\u0104\7k\2\2\u0104\u0105"+
		"\7p\2\2\u0105F\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108\7w\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7e\2\2\u010a\u010b\7v\2\2\u010b\u010c\7k\2\2\u010c"+
		"\u010d\7q\2\2\u010d\u010e\7p\2\2\u010eH\3\2\2\2\u010f\u0110\7x\2\2\u0110"+
		"\u0111\7q\2\2\u0111\u0112\7k\2\2\u0112\u0113\7f\2\2\u0113J\3\2\2\2\u0114"+
		"\u0115\7f\2\2\u0115\u0116\7q\2\2\u0116L\3\2\2\2\u0117\u0118\7g\2\2\u0118"+
		"\u0119\7p\2\2\u0119\u011a\7f\2\2\u011aN\3\2\2\2\u011b\u011c\7e\2\2\u011c"+
		"\u011d\7q\2\2\u011d\u011e\7p\2\2\u011e\u011f\7u\2\2\u011f\u0120\7v\2\2"+
		"\u0120P\3\2\2\2\u0121\u0122\7g\2\2\u0122\u0123\7p\2\2\u0123\u0124\7w\2"+
		"\2\u0124\u0125\7o\2\2\u0125R\3\2\2\2\u0126\u0127\7-\2\2\u0127T\3\2\2\2"+
		"\u0128\u0129\7/\2\2\u0129V\3\2\2\2\u012a\u012b\7,\2\2\u012bX\3\2\2\2\u012c"+
		"\u012d\7\61\2\2\u012dZ\3\2\2\2\u012e\u012f\7\'\2\2\u012f\\\3\2\2\2\u0130"+
		"\u0131\7v\2\2\u0131\u0132\7t\2\2\u0132\u0133\7w\2\2\u0133\u0134\7g\2\2"+
		"\u0134^\3\2\2\2\u0135\u0136\7h\2\2\u0136\u0137\7c\2\2\u0137\u0138\7n\2"+
		"\2\u0138\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a`\3\2\2\2\u013b\u013c\7"+
		"c\2\2\u013c\u013d\7p\2\2\u013d\u013e\7f\2\2\u013eb\3\2\2\2\u013f\u0140"+
		"\7q\2\2\u0140\u0141\7t\2\2\u0141d\3\2\2\2\u0142\u0143\7p\2\2\u0143\u0144"+
		"\7q\2\2\u0144\u0145\7v\2\2\u0145f\3\2\2\2\u0146\u0147\7>\2\2\u0147h\3"+
		"\2\2\2\u0148\u0149\7>\2\2\u0149\u014a\7?\2\2\u014aj\3\2\2\2\u014b\u014c"+
		"\7@\2\2\u014cl\3\2\2\2\u014d\u014e\7@\2\2\u014e\u014f\7?\2\2\u014fn\3"+
		"\2\2\2\u0150\u0151\7>\2\2\u0151\u0152\7@\2\2\u0152p\3\2\2\2\u0153\u0154"+
		"\7n\2\2\u0154\u0155\7g\2\2\u0155\u0156\7h\2\2\u0156\u0157\7v\2\2\u0157"+
		"r\3\2\2\2\u0158\u0159\7t\2\2\u0159\u015a\7k\2\2\u015a\u015b\7i\2\2\u015b"+
		"\u015c\7j\2\2\u015c\u015d\7v\2\2\u015dt\3\2\2\2\u015e\u015f\7w\2\2\u015f"+
		"\u0160\7r\2\2\u0160v\3\2\2\2\u0161\u0162\7f\2\2\u0162\u0163\7q\2\2\u0163"+
		"\u0164\7y\2\2\u0164\u0165\7p\2\2\u0165x\3\2\2\2\u0166\u0167\7l\2\2\u0167"+
		"\u0168\7w\2\2\u0168\u0169\7o\2\2\u0169\u016a\7r\2\2\u016az\3\2\2\2\u016b"+
		"\u016c\7h\2\2\u016c\u016d\7k\2\2\u016d\u016e\7i\2\2\u016e\u016f\7j\2\2"+
		"\u016f\u0170\7v\2\2\u0170|\3\2\2\2\u0171\u0172\7f\2\2\u0172\u0173\7k\2"+
		"\2\u0173\u0174\7i\2\2\u0174~\3\2\2\2\u0175\u0176\7d\2\2\u0176\u0177\7"+
		"q\2\2\u0177\u0178\7q\2\2\u0178\u0179\7n\2\2\u0179\u017a\7g\2\2\u017a\u017b"+
		"\7c\2\2\u017b\u0188\7p\2\2\u017c\u017d\7k\2\2\u017d\u017e\7p\2\2\u017e"+
		"\u017f\7v\2\2\u017f\u0180\7g\2\2\u0180\u0181\7i\2\2\u0181\u0182\7g\2\2"+
		"\u0182\u0188\7t\2\2\u0183\u0184\7e\2\2\u0184\u0185\7j\2\2\u0185\u0186"+
		"\7c\2\2\u0186\u0188\7t\2\2\u0187\u0175\3\2\2\2\u0187\u017c\3\2\2\2\u0187"+
		"\u0183\3\2\2\2\u0188\u0080\3\2\2\2\u0189\u018a\7t\2\2\u018a\u018b\7g\2"+
		"\2\u018b\u018c\7e\2\2\u018c\u018d\7q\2\2\u018d\u018e\7t\2\2\u018e\u018f"+
		"\7f\2\2\u018f\u0082\3\2\2\2\u0190\u0195\5\35\17\2\u0191\u0194\5\35\17"+
		"\2\u0192\u0194\5\37\20\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0084\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u01a2\7$\2\2\u0199\u01a1\5\35\17\2\u019a"+
		"\u01a1\5\37\20\2\u019b\u01a1\t\3\2\2\u019c\u019e\7\17\2\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\7\f\2\2\u01a0"+
		"\u0199\3\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u019d\3\2"+
		"\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7$\2\2\u01a6\u0086\3\2"+
		"\2\2\u01a7\u01aa\7)\2\2\u01a8\u01ab\5\35\17\2\u01a9\u01ab\5\37\20\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7)"+
		"\2\2\u01ad\u0088\3\2\2\2\21\2\u00a6\u00b2\u00c0\u00c5\u00c8\u00cd\u00d6"+
		"\u0187\u0193\u0195\u019d\u01a0\u01a2\u01aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}