// Generated from Millenium.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MilleniumLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HT_NL_CR=1, INT_DTYPE=2, FLOAT_DTYPE=3, CHAR_DTYPE=4, STRING_DTYPE=5, 
		BOOLEAN_DTYPE=6, IF_CONDITIONAL=7, ELSE_IF_CONDITIONAL=8, ELSE_CONDITIONAL=9, 
		FOR_LOOP=10, WHILE_LOOP=11, DO_LOOP=12, PRINT=13, PRINT_NL=14, SCAN=15, 
		OPEN_PAR=16, CLOSE_PAR=17, OPEN_CURLY_BRACK=18, CLOSE_CURLY_BRACK=19, 
		OPEN_SQUARE_BRACK=20, CLOSE_SQUARE_BRACK=21, ENUMERATION=22, COMMENT_BLOCK=23, 
		END=24, ADDITION_OPE=25, SUBTRACTION_OPE=26, MULTIPLICATION_OPE=27, DIVISION_OPE=28, 
		ADDITION_ASSIGNMENT_OPE=29, SUBTRACTION_ASSIGNMENT_OPE=30, MULTIPLICATION_ASSIGNMENT_OPE=31, 
		DIVISION_ASSIGNMENT_OPE=32, MODULO_ASSIGNMENT_OPE=33, MODULO_OPE=34, LESS_THAN_OPE=35, 
		LESS_THAN_EQUAL_TO_OPE=36, GREATER_THAN_OPE=37, GREATER_THAN_EQUAL_TO_OPE=38, 
		EQUAL_OPE=39, NOT_EQUAL_OPE=40, INCREMENT_OPE=41, DECREMENT_OPE=42, ASSINGMENT_OPE=43, 
		AND_OPE=44, OR_OPE=45, NOT_OPE=46, ARRAY_SIZE_DELIMETER=47, CONSTANT_KEYWORD=48, 
		FUNCTION_CALL=49, MAIN_FUNC=50, RETURN=51, VOID=52, INTEGER_LITERAL=53, 
		FLOAT_LITERAL=54, CHAR_LITERAL=55, STRING_LITERAL=56, BOOLEAN_LITERAL=57, 
		VARIABLE_IDENTIFIER=58, FUNCTION_IDENTIFIER=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"HT_NL_CR", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
		"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "PRINT_NL", "SCAN", "OPEN_PAR", 
		"CLOSE_PAR", "OPEN_CURLY_BRACK", "CLOSE_CURLY_BRACK", "OPEN_SQUARE_BRACK", 
		"CLOSE_SQUARE_BRACK", "ENUMERATION", "COMMENT_BLOCK", "END", "ADDITION_OPE", 
		"SUBTRACTION_OPE", "MULTIPLICATION_OPE", "DIVISION_OPE", "ADDITION_ASSIGNMENT_OPE", 
		"SUBTRACTION_ASSIGNMENT_OPE", "MULTIPLICATION_ASSIGNMENT_OPE", "DIVISION_ASSIGNMENT_OPE", 
		"MODULO_ASSIGNMENT_OPE", "MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", 
		"GREATER_THAN_OPE", "GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", 
		"INCREMENT_OPE", "DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", 
		"NOT_OPE", "ARRAY_SIZE_DELIMETER", "CONSTANT_KEYWORD", "FUNCTION_CALL", 
		"MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "BOOLEAN_LITERAL", "VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'digitz'", "'lutang'", "'single'", "'Msg'", "'weh'", "'priority'", 
		"'optionlang'", "'nochoice'", "'willingtowait'", "'hanggatkeri'", "'gora'", 
		"'post'", "'postln'", "'gimmeinput'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "','", null, "';'", "'+'", "'-'", "'*'", "'/'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
		"'++'", "'--'", "'='", "'AND'", "'OR'", "'NOT'", "'#'", "'consistent'", 
		"'shoutout'", "'LEZGO'", "'uwina'", "'walangibabalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "HT_NL_CR", "INT_DTYPE", "FLOAT_DTYPE", "CHAR_DTYPE", "STRING_DTYPE", 
		"BOOLEAN_DTYPE", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_LOOP", "PRINT", "PRINT_NL", "SCAN", "OPEN_PAR", 
		"CLOSE_PAR", "OPEN_CURLY_BRACK", "CLOSE_CURLY_BRACK", "OPEN_SQUARE_BRACK", 
		"CLOSE_SQUARE_BRACK", "ENUMERATION", "COMMENT_BLOCK", "END", "ADDITION_OPE", 
		"SUBTRACTION_OPE", "MULTIPLICATION_OPE", "DIVISION_OPE", "ADDITION_ASSIGNMENT_OPE", 
		"SUBTRACTION_ASSIGNMENT_OPE", "MULTIPLICATION_ASSIGNMENT_OPE", "DIVISION_ASSIGNMENT_OPE", 
		"MODULO_ASSIGNMENT_OPE", "MODULO_OPE", "LESS_THAN_OPE", "LESS_THAN_EQUAL_TO_OPE", 
		"GREATER_THAN_OPE", "GREATER_THAN_EQUAL_TO_OPE", "EQUAL_OPE", "NOT_EQUAL_OPE", 
		"INCREMENT_OPE", "DECREMENT_OPE", "ASSINGMENT_OPE", "AND_OPE", "OR_OPE", 
		"NOT_OPE", "ARRAY_SIZE_DELIMETER", "CONSTANT_KEYWORD", "FUNCTION_CALL", 
		"MAIN_FUNC", "RETURN", "VOID", "INTEGER_LITERAL", "FLOAT_LITERAL", "CHAR_LITERAL", 
		"STRING_LITERAL", "BOOLEAN_LITERAL", "VARIABLE_IDENTIFIER", "FUNCTION_IDENTIFIER"
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


	public MilleniumLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Millenium.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01bb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\6"+
		"\2{\n\2\r\2\16\2|\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0104\n\30\f\30\16"+
		"\30\u0107\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\3*\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\6\66\u017f\n\66\r\66\16\66\u0180\3\67\5"+
		"\67\u0184\n\67\3\67\3\67\6\67\u0188\n\67\r\67\16\67\u0189\3\67\5\67\u018d"+
		"\n\67\38\38\38\38\39\39\79\u0195\n9\f9\169\u0198\139\39\39\3:\3:\3:\3"+
		":\3:\3:\3:\3:\5:\u01a4\n:\3;\6;\u01a7\n;\r;\16;\u01a8\3;\7;\u01ac\n;\f"+
		";\16;\u01af\13;\3<\6<\u01b2\n<\r<\16<\u01b3\3<\7<\u01b7\n<\f<\16<\u01ba"+
		"\13<\4\u0105\u0196\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=\3\2\6\6\2\13\f\17\17\"\"~~\3\2\62;\3\2c|"+
		"\3\2C\\\2\u01c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\3z\3\2\2\2\5\u0080\3\2\2\2\7\u0087\3\2\2\2\t\u008e\3\2\2\2\13\u0095"+
		"\3\2\2\2\r\u0099\3\2\2\2\17\u009d\3\2\2\2\21\u00a6\3\2\2\2\23\u00b1\3"+
		"\2\2\2\25\u00ba\3\2\2\2\27\u00c8\3\2\2\2\31\u00d4\3\2\2\2\33\u00d9\3\2"+
		"\2\2\35\u00de\3\2\2\2\37\u00e5\3\2\2\2!\u00f0\3\2\2\2#\u00f2\3\2\2\2%"+
		"\u00f4\3\2\2\2\'\u00f6\3\2\2\2)\u00f8\3\2\2\2+\u00fa\3\2\2\2-\u00fc\3"+
		"\2\2\2/\u00fe\3\2\2\2\61\u010e\3\2\2\2\63\u0110\3\2\2\2\65\u0112\3\2\2"+
		"\2\67\u0114\3\2\2\29\u0116\3\2\2\2;\u0118\3\2\2\2=\u011b\3\2\2\2?\u011e"+
		"\3\2\2\2A\u0121\3\2\2\2C\u0124\3\2\2\2E\u0127\3\2\2\2G\u0129\3\2\2\2I"+
		"\u012b\3\2\2\2K\u012e\3\2\2\2M\u0130\3\2\2\2O\u0133\3\2\2\2Q\u0136\3\2"+
		"\2\2S\u0139\3\2\2\2U\u013c\3\2\2\2W\u013f\3\2\2\2Y\u0141\3\2\2\2[\u0145"+
		"\3\2\2\2]\u0148\3\2\2\2_\u014c\3\2\2\2a\u014e\3\2\2\2c\u0159\3\2\2\2e"+
		"\u0162\3\2\2\2g\u0168\3\2\2\2i\u016e\3\2\2\2k\u017e\3\2\2\2m\u0183\3\2"+
		"\2\2o\u018e\3\2\2\2q\u0192\3\2\2\2s\u01a3\3\2\2\2u\u01a6\3\2\2\2w\u01b1"+
		"\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~"+
		"\177\b\2\2\2\177\4\3\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7i\2\2\u0083\u0084\7k\2\2\u0084\u0085\7v\2\2\u0085\u0086\7|\2\2"+
		"\u0086\6\3\2\2\2\u0087\u0088\7n\2\2\u0088\u0089\7w\2\2\u0089\u008a\7v"+
		"\2\2\u008a\u008b\7c\2\2\u008b\u008c\7p\2\2\u008c\u008d\7i\2\2\u008d\b"+
		"\3\2\2\2\u008e\u008f\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7i\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094\n\3\2\2\2\u0095"+
		"\u0096\7O\2\2\u0096\u0097\7u\2\2\u0097\u0098\7i\2\2\u0098\f\3\2\2\2\u0099"+
		"\u009a\7y\2\2\u009a\u009b\7g\2\2\u009b\u009c\7j\2\2\u009c\16\3\2\2\2\u009d"+
		"\u009e\7r\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5"+
		"\7{\2\2\u00a5\20\3\2\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7i\2\2"+
		"\u00b0\22\3\2\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7"+
		"e\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7e\2\2\u00b8\u00b9\7g\2\2\u00b9\24\3\2\2\2\u00ba\u00bb\7y\2\2\u00bb\u00bc"+
		"\7k\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7k\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7i\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7q\2\2"+
		"\u00c3\u00c4\7y\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7"+
		"\7v\2\2\u00c7\26\3\2\2\2\u00c8\u00c9\7j\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7p\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7i\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7m\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2"+
		"\u00d2\u00d3\7k\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6\7"+
		"q\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7c\2\2\u00d8\32\3\2\2\2\u00d9\u00da"+
		"\7r\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"\34\3\2\2\2\u00de\u00df\7r\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7u\2\2\u00e1"+
		"\u00e2\7v\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7p\2\2\u00e4\36\3\2\2\2\u00e5"+
		"\u00e6\7i\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7o\2\2"+
		"\u00e9\u00ea\7g\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed"+
		"\7r\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7v\2\2\u00ef \3\2\2\2\u00f0\u00f1"+
		"\7*\2\2\u00f1\"\3\2\2\2\u00f2\u00f3\7+\2\2\u00f3$\3\2\2\2\u00f4\u00f5"+
		"\7}\2\2\u00f5&\3\2\2\2\u00f6\u00f7\7\177\2\2\u00f7(\3\2\2\2\u00f8\u00f9"+
		"\7]\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7_\2\2\u00fb,\3\2\2\2\u00fc\u00fd\7"+
		".\2\2\u00fd.\3\2\2\2\u00fe\u00ff\7A\2\2\u00ff\u0100\7A\2\2\u0100\u0101"+
		"\7A\2\2\u0101\u0105\3\2\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7A\2\2\u0109\u010a\7A\2\2\u010a\u010b"+
		"\7A\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b\30\2\2\u010d\60\3\2\2\2\u010e"+
		"\u010f\7=\2\2\u010f\62\3\2\2\2\u0110\u0111\7-\2\2\u0111\64\3\2\2\2\u0112"+
		"\u0113\7/\2\2\u0113\66\3\2\2\2\u0114\u0115\7,\2\2\u01158\3\2\2\2\u0116"+
		"\u0117\7\61\2\2\u0117:\3\2\2\2\u0118\u0119\7-\2\2\u0119\u011a\7?\2\2\u011a"+
		"<\3\2\2\2\u011b\u011c\7/\2\2\u011c\u011d\7?\2\2\u011d>\3\2\2\2\u011e\u011f"+
		"\7,\2\2\u011f\u0120\7?\2\2\u0120@\3\2\2\2\u0121\u0122\7\61\2\2\u0122\u0123"+
		"\7?\2\2\u0123B\3\2\2\2\u0124\u0125\7\'\2\2\u0125\u0126\7?\2\2\u0126D\3"+
		"\2\2\2\u0127\u0128\7\'\2\2\u0128F\3\2\2\2\u0129\u012a\7>\2\2\u012aH\3"+
		"\2\2\2\u012b\u012c\7>\2\2\u012c\u012d\7?\2\2\u012dJ\3\2\2\2\u012e\u012f"+
		"\7@\2\2\u012fL\3\2\2\2\u0130\u0131\7@\2\2\u0131\u0132\7?\2\2\u0132N\3"+
		"\2\2\2\u0133\u0134\7?\2\2\u0134\u0135\7?\2\2\u0135P\3\2\2\2\u0136\u0137"+
		"\7#\2\2\u0137\u0138\7?\2\2\u0138R\3\2\2\2\u0139\u013a\7-\2\2\u013a\u013b"+
		"\7-\2\2\u013bT\3\2\2\2\u013c\u013d\7/\2\2\u013d\u013e\7/\2\2\u013eV\3"+
		"\2\2\2\u013f\u0140\7?\2\2\u0140X\3\2\2\2\u0141\u0142\7C\2\2\u0142\u0143"+
		"\7P\2\2\u0143\u0144\7F\2\2\u0144Z\3\2\2\2\u0145\u0146\7Q\2\2\u0146\u0147"+
		"\7T\2\2\u0147\\\3\2\2\2\u0148\u0149\7P\2\2\u0149\u014a\7Q\2\2\u014a\u014b"+
		"\7V\2\2\u014b^\3\2\2\2\u014c\u014d\7%\2\2\u014d`\3\2\2\2\u014e\u014f\7"+
		"e\2\2\u014f\u0150\7q\2\2\u0150\u0151\7p\2\2\u0151\u0152\7u\2\2\u0152\u0153"+
		"\7k\2\2\u0153\u0154\7u\2\2\u0154\u0155\7v\2\2\u0155\u0156\7g\2\2\u0156"+
		"\u0157\7p\2\2\u0157\u0158\7v\2\2\u0158b\3\2\2\2\u0159\u015a\7u\2\2\u015a"+
		"\u015b\7j\2\2\u015b\u015c\7q\2\2\u015c\u015d\7w\2\2\u015d\u015e\7v\2\2"+
		"\u015e\u015f\7q\2\2\u015f\u0160\7w\2\2\u0160\u0161\7v\2\2\u0161d\3\2\2"+
		"\2\u0162\u0163\7N\2\2\u0163\u0164\7G\2\2\u0164\u0165\7\\\2\2\u0165\u0166"+
		"\7I\2\2\u0166\u0167\7Q\2\2\u0167f\3\2\2\2\u0168\u0169\7w\2\2\u0169\u016a"+
		"\7y\2\2\u016a\u016b\7k\2\2\u016b\u016c\7p\2\2\u016c\u016d\7c\2\2\u016d"+
		"h\3\2\2\2\u016e\u016f\7y\2\2\u016f\u0170\7c\2\2\u0170\u0171\7n\2\2\u0171"+
		"\u0172\7c\2\2\u0172\u0173\7p\2\2\u0173\u0174\7i\2\2\u0174\u0175\7k\2\2"+
		"\u0175\u0176\7d\2\2\u0176\u0177\7c\2\2\u0177\u0178\7d\2\2\u0178\u0179"+
		"\7c\2\2\u0179\u017a\7n\2\2\u017a\u017b\7k\2\2\u017b\u017c\7m\2\2\u017c"+
		"j\3\2\2\2\u017d\u017f\t\3\2\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2"+
		"\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181l\3\2\2\2\u0182\u0184\5"+
		"k\66\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0187\7\60\2\2\u0186\u0188\t\3\2\2\u0187\u0186\3\2\2\2\u0188\u0189\3"+
		"\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u018d\7h\2\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018dn\3\2\2\2\u018e"+
		"\u018f\7)\2\2\u018f\u0190\13\2\2\2\u0190\u0191\7)\2\2\u0191p\3\2\2\2\u0192"+
		"\u0196\7$\2\2\u0193\u0195\13\2\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019a\7$\2\2\u019ar\3\2\2\2\u019b\u019c\7{\2\2\u019c"+
		"\u019d\7c\2\2\u019d\u01a4\7u\2\2\u019e\u019f\7f\2\2\u019f\u01a0\7g\2\2"+
		"\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a4\7u\2\2\u01a3\u019b"+
		"\3\2\2\2\u01a3\u019e\3\2\2\2\u01a4t\3\2\2\2\u01a5\u01a7\t\4\2\2\u01a6"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01ad\3\2\2\2\u01aa\u01ac\t\3\2\2\u01ab\u01aa\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01aev\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01b0\u01b2\t\5\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b8\3\2\2\2\u01b5"+
		"\u01b7\t\3\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9x\3\2\2\2\u01ba\u01b8\3\2\2\2\17\2|\u0105"+
		"\u0180\u0183\u0189\u018c\u0196\u01a3\u01a8\u01ad\u01b3\u01b8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}