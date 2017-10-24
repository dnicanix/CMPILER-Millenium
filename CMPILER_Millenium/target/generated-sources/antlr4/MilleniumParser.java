// Generated from Millenium.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MilleniumParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_vardecl_list = 2, RULE_var_decl = 3, 
		RULE_var_identifier_list = 4, RULE_array_size = 5, RULE_data_type = 6, 
		RULE_function_declaration = 7, RULE_function_return = 8, RULE_function_noreturn = 9, 
		RULE_parameters = 10, RULE_function_block = 11, RULE_main_function = 12, 
		RULE_expression = 13, RULE_string_expression = 14, RULE_num_expression = 15, 
		RULE_num_ope = 16, RULE_unary_ope = 17, RULE_num_factor = 18, RULE_var_func_expression = 19, 
		RULE_var_func_factor = 20, RULE_bool_expression = 21, RULE_relational_ope = 22, 
		RULE_logical_ope = 23, RULE_const_statement = 24, RULE_var_assignment_statement = 25, 
		RULE_assignment_statement = 26, RULE_assignment_num_ope = 27, RULE_assignment_factor = 28, 
		RULE_funccall_statement = 29, RULE_actual_parameter_list = 30, RULE_actual_params = 31, 
		RULE_conditional_factor = 32, RULE_if_statement = 33, RULE_conditional_block = 34, 
		RULE_code_block = 35, RULE_while_statement = 36, RULE_do_while_statement = 37, 
		RULE_for_statement = 38, RULE_return_statement = 39, RULE_scan_statement = 40, 
		RULE_print_statement = 41;
	public static final String[] ruleNames = {
		"program", "statement", "vardecl_list", "var_decl", "var_identifier_list", 
		"array_size", "data_type", "function_declaration", "function_return", 
		"function_noreturn", "parameters", "function_block", "main_function", 
		"expression", "string_expression", "num_expression", "num_ope", "unary_ope", 
		"num_factor", "var_func_expression", "var_func_factor", "bool_expression", 
		"relational_ope", "logical_ope", "const_statement", "var_assignment_statement", 
		"assignment_statement", "assignment_num_ope", "assignment_factor", "funccall_statement", 
		"actual_parameter_list", "actual_params", "conditional_factor", "if_statement", 
		"conditional_block", "code_block", "while_statement", "do_while_statement", 
		"for_statement", "return_statement", "scan_statement", "print_statement"
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

	@Override
	public String getGrammarFileName() { return "Millenium.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MilleniumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MilleniumParser.EOF, 0); }
		public List<Function_declarationContext> function_declaration() {
			return getRuleContexts(Function_declarationContext.class);
		}
		public Function_declarationContext function_declaration(int i) {
			return getRuleContext(Function_declarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					function_declaration();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(90);
			main_function();
			setState(91);
			match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public TerminalNode END() { return getToken(MilleniumParser.END, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public TerminalNode COMMENT_BLOCK() { return getToken(MilleniumParser.COMMENT_BLOCK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				const_statement();
				setState(95);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				const_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				assignment_statement();
				setState(101);
				match(END);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				funccall_statement();
				setState(104);
				match(END);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				if_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				while_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				do_while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				for_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				return_statement();
				setState(111);
				match(END);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(113);
				scan_statement();
				setState(114);
				match(END);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(116);
				scan_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(119);
				print_statement();
				setState(120);
				match(END);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(122);
				print_statement();
				notifyErrorListeners("Insert ';' to complete statement.");
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(125);
				match(COMMENT_BLOCK);
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

	public static class Vardecl_listContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode END() { return getToken(MilleniumParser.END, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVardecl_list(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardecl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			var_decl();
			setState(129);
			match(END);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(130);
				vardecl_list();
				}
				break;
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

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Var_identifier_listContext var_identifier_list() {
			return getRuleContext(Var_identifier_listContext.class,0);
		}
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			data_type();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY_SIZE_DELIMETER) {
				{
				setState(134);
				array_size();
				}
			}

			{
			setState(137);
			var_identifier_list();
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

	public static class Var_identifier_listContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ENUMERATION() { return getToken(MilleniumParser.ENUMERATION, 0); }
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public Var_identifier_listContext var_identifier_list() {
			return getRuleContext(Var_identifier_listContext.class,0);
		}
		public Var_identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_identifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_identifier_list(this);
		}
	}

	public final Var_identifier_listContext var_identifier_list() throws RecognitionException {
		Var_identifier_listContext _localctx = new Var_identifier_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_identifier_list);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(VARIABLE_IDENTIFIER);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSINGMENT_OPE) {
					{
					setState(140);
					var_assignment_statement();
					}
				}

				setState(143);
				match(ENUMERATION);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE_IDENTIFIER) {
					{
					setState(144);
					var_identifier_list();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(VARIABLE_IDENTIFIER);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSINGMENT_OPE) {
					{
					setState(148);
					var_assignment_statement();
					}
				}

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

	public static class Array_sizeContext extends ParserRuleContext {
		public TerminalNode ARRAY_SIZE_DELIMETER() { return getToken(MilleniumParser.ARRAY_SIZE_DELIMETER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(MilleniumParser.INTEGER_LITERAL, 0); }
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterArray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitArray_size(this);
		}
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ARRAY_SIZE_DELIMETER);
			setState(154);
			match(INTEGER_LITERAL);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT_DTYPE() { return getToken(MilleniumParser.INT_DTYPE, 0); }
		public TerminalNode FLOAT_DTYPE() { return getToken(MilleniumParser.FLOAT_DTYPE, 0); }
		public TerminalNode CHAR_DTYPE() { return getToken(MilleniumParser.CHAR_DTYPE, 0); }
		public TerminalNode STRING_DTYPE() { return getToken(MilleniumParser.STRING_DTYPE, 0); }
		public TerminalNode BOOLEAN_DTYPE() { return getToken(MilleniumParser.BOOLEAN_DTYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_noreturnContext function_noreturn() {
			return getRuleContext(Function_noreturnContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_declaration);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_DTYPE:
			case FLOAT_DTYPE:
			case CHAR_DTYPE:
			case STRING_DTYPE:
			case BOOLEAN_DTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				function_return();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				function_noreturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Function_returnContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(MilleniumParser.FUNCTION_IDENTIFIER, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_return(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			data_type();
			setState(163);
			match(FUNCTION_IDENTIFIER);
			setState(164);
			function_block();
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

	public static class Function_noreturnContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MilleniumParser.VOID, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(MilleniumParser.FUNCTION_IDENTIFIER, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public Function_noreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_noreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_noreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_noreturn(this);
		}
	}

	public final Function_noreturnContext function_noreturn() throws RecognitionException {
		Function_noreturnContext _localctx = new Function_noreturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_noreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(VOID);
			setState(167);
			match(FUNCTION_IDENTIFIER);
			setState(168);
			function_block();
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

	public static class ParametersContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ENUMERATION() { return getToken(MilleniumParser.ENUMERATION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			data_type();
			setState(171);
			match(VARIABLE_IDENTIFIER);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENUMERATION) {
				{
				setState(172);
				match(ENUMERATION);
				setState(173);
				parameters();
				}
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

	public static class Function_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunction_block(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(OPEN_PAR);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE))) != 0)) {
				{
				setState(177);
				parameters();
				}
			}

			setState(180);
			match(CLOSE_PAR);
			setState(181);
			code_block();
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

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MilleniumParser.VOID, 0); }
		public TerminalNode MAIN_FUNC() { return getToken(MilleniumParser.MAIN_FUNC, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_main_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(VOID);
			setState(184);
			match(MAIN_FUNC);
			setState(185);
			match(OPEN_PAR);
			setState(186);
			match(CLOSE_PAR);
			setState(187);
			code_block();
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
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode ADDITION_OPE() { return getToken(MilleniumParser.ADDITION_OPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_func_expressionContext var_func_expression() {
			return getRuleContext(Var_func_expressionContext.class,0);
		}
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Num_opeContext num_ope() {
			return getRuleContext(Num_opeContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				string_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				string_expression(0);
				setState(191);
				match(ADDITION_OPE);
				setState(192);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				var_func_expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				num_expression(0);
				setState(196);
				num_ope();
				setState(197);
				num_expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				bool_expression(0);
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

	public static class String_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ADDITION_OPE() { return getToken(MilleniumParser.ADDITION_OPE, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		return string_expression(0);
	}

	private String_expressionContext string_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		String_expressionContext _localctx = new String_expressionContext(_ctx, _parentState);
		String_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_string_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(203);
				match(OPEN_PAR);
				setState(204);
				string_expression(0);
				setState(205);
				match(CLOSE_PAR);
				}
				break;
			case STRING_LITERAL:
				{
				setState(207);
				match(STRING_LITERAL);
				}
				break;
			case FUNCTION_CALL:
				{
				setState(208);
				funccall_statement();
				}
				break;
			case VARIABLE_IDENTIFIER:
				{
				setState(209);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new String_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_string_expression);
					setState(212);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(213);
					match(ADDITION_OPE);
					setState(214);
					string_expression(5);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Num_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Num_opeContext num_ope() {
			return getRuleContext(Num_opeContext.class,0);
		}
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNum_expression(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		return num_expression(0);
	}

	private Num_expressionContext num_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, _parentState);
		Num_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_num_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(221);
				match(OPEN_PAR);
				setState(222);
				num_expression(0);
				setState(223);
				match(CLOSE_PAR);
				}
				break;
			case ADDITION_OPE:
			case SUBTRACTION_OPE:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
				{
				setState(225);
				num_factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Num_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_num_expression);
					setState(228);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(229);
					num_ope();
					setState(230);
					num_expression(3);
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Num_opeContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPE() { return getToken(MilleniumParser.ADDITION_OPE, 0); }
		public TerminalNode SUBTRACTION_OPE() { return getToken(MilleniumParser.SUBTRACTION_OPE, 0); }
		public TerminalNode MULTIPLICATION_OPE() { return getToken(MilleniumParser.MULTIPLICATION_OPE, 0); }
		public TerminalNode DIVISION_OPE() { return getToken(MilleniumParser.DIVISION_OPE, 0); }
		public TerminalNode MODULO_OPE() { return getToken(MilleniumParser.MODULO_OPE, 0); }
		public Num_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNum_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNum_ope(this);
		}
	}

	public final Num_opeContext num_ope() throws RecognitionException {
		Num_opeContext _localctx = new Num_opeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_num_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_OPE) | (1L << SUBTRACTION_OPE) | (1L << MULTIPLICATION_OPE) | (1L << DIVISION_OPE) | (1L << MODULO_OPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_opeContext extends ParserRuleContext {
		public Unary_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterUnary_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitUnary_ope(this);
		}
	}

	public final Unary_opeContext unary_ope() throws RecognitionException {
		Unary_opeContext _localctx = new Unary_opeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPE || _la==SUBTRACTION_OPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Num_factorContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(MilleniumParser.CHAR_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(MilleniumParser.INTEGER_LITERAL, 0); }
		public Unary_opeContext unary_ope() {
			return getRuleContext(Unary_opeContext.class,0);
		}
		public TerminalNode FLOAT_LITERAL() { return getToken(MilleniumParser.FLOAT_LITERAL, 0); }
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitNum_factor(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_num_factor);
		int _la;
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(CHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADDITION_OPE || _la==SUBTRACTION_OPE) {
					{
					setState(242);
					unary_ope();
					}
				}

				setState(245);
				match(INTEGER_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADDITION_OPE || _la==SUBTRACTION_OPE) {
					{
					setState(246);
					unary_ope();
					}
				}

				setState(249);
				match(FLOAT_LITERAL);
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

	public static class Var_func_expressionContext extends ParserRuleContext {
		public List<TerminalNode> OPEN_PAR() { return getTokens(MilleniumParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(MilleniumParser.OPEN_PAR, i);
		}
		public List<Var_func_expressionContext> var_func_expression() {
			return getRuleContexts(Var_func_expressionContext.class);
		}
		public Var_func_expressionContext var_func_expression(int i) {
			return getRuleContext(Var_func_expressionContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(MilleniumParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(MilleniumParser.CLOSE_PAR, i);
		}
		public Var_func_factorContext var_func_factor() {
			return getRuleContext(Var_func_factorContext.class,0);
		}
		public Relational_opeContext relational_ope() {
			return getRuleContext(Relational_opeContext.class,0);
		}
		public Num_opeContext num_ope() {
			return getRuleContext(Num_opeContext.class,0);
		}
		public Var_func_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_func_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_func_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_func_expression(this);
		}
	}

	public final Var_func_expressionContext var_func_expression() throws RecognitionException {
		return var_func_expression(0);
	}

	private Var_func_expressionContext var_func_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Var_func_expressionContext _localctx = new Var_func_expressionContext(_ctx, _parentState);
		Var_func_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_var_func_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(253);
				match(OPEN_PAR);
				setState(254);
				var_func_expression(0);
				setState(255);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(257);
				var_func_factor();
				}
				break;
			case 3:
				{
				setState(258);
				match(OPEN_PAR);
				setState(260); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(259);
						match(OPEN_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(262); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(264);
				var_func_expression(0);
				setState(265);
				match(CLOSE_PAR);
				notifyErrorListeners ("Uneven Parenthesis. Remove extra '('. ");
				}
				break;
			case 4:
				{
				setState(268);
				match(OPEN_PAR);
				setState(269);
				var_func_expression(0);
				setState(270);
				match(CLOSE_PAR);
				setState(272); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(271);
						match(CLOSE_PAR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(274); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				notifyErrorListeners ("Uneven Parenthesis. Remove extra ')'. ");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Var_func_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var_func_expression);
					setState(280);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(283);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN_OPE:
					case LESS_THAN_EQUAL_TO_OPE:
					case GREATER_THAN_OPE:
					case GREATER_THAN_EQUAL_TO_OPE:
					case EQUAL_OPE:
					case NOT_EQUAL_OPE:
						{
						setState(281);
						relational_ope();
						}
						break;
					case ADDITION_OPE:
					case SUBTRACTION_OPE:
					case MULTIPLICATION_OPE:
					case DIVISION_OPE:
					case MODULO_OPE:
						{
						setState(282);
						num_ope();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(285);
					var_func_expression(5);
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Var_func_factorContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Var_func_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_func_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_func_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_func_factor(this);
		}
	}

	public final Var_func_factorContext var_func_factor() throws RecognitionException {
		Var_func_factorContext _localctx = new Var_func_factorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_var_func_factor);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case FUNCTION_CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				funccall_statement();
				}
				break;
			case ADDITION_OPE:
			case SUBTRACTION_OPE:
			case INTEGER_LITERAL:
			case FLOAT_LITERAL:
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				num_factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public List<Bool_expressionContext> bool_expression() {
			return getRuleContexts(Bool_expressionContext.class);
		}
		public Bool_expressionContext bool_expression(int i) {
			return getRuleContext(Bool_expressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_OPE() { return getToken(MilleniumParser.NOT_OPE, 0); }
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Relational_opeContext relational_ope() {
			return getRuleContext(Relational_opeContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQUAL_OPE() { return getToken(MilleniumParser.EQUAL_OPE, 0); }
		public TerminalNode NOT_EQUAL_OPE() { return getToken(MilleniumParser.NOT_EQUAL_OPE, 0); }
		public List<Var_func_expressionContext> var_func_expression() {
			return getRuleContexts(Var_func_expressionContext.class);
		}
		public Var_func_expressionContext var_func_expression(int i) {
			return getRuleContext(Var_func_expressionContext.class,i);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Logical_opeContext logical_ope() {
			return getRuleContext(Logical_opeContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		return bool_expression(0);
	}

	private Bool_expressionContext bool_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, _parentState);
		Bool_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_bool_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_OPE) {
					{
					setState(298);
					match(NOT_OPE);
					}
				}

				setState(301);
				match(OPEN_PAR);
				setState(302);
				bool_expression(0);
				setState(303);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(305);
				num_expression(0);
				setState(306);
				relational_ope();
				setState(307);
				num_expression(0);
				}
				break;
			case 3:
				{
				setState(309);
				string_expression(0);
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==EQUAL_OPE || _la==NOT_EQUAL_OPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(311);
				string_expression(0);
				}
				break;
			case 4:
				{
				setState(313);
				var_func_expression(0);
				setState(314);
				relational_ope();
				setState(315);
				var_func_expression(0);
				}
				break;
			case 5:
				{
				setState(317);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 6:
				{
				setState(318);
				match(NOT_OPE);
				setState(319);
				match(OPEN_PAR);
				setState(320);
				match(BOOLEAN_LITERAL);
				setState(321);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expression);
					setState(324);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(325);
					logical_ope();
					setState(326);
					bool_expression(7);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Relational_opeContext extends ParserRuleContext {
		public TerminalNode LESS_THAN_OPE() { return getToken(MilleniumParser.LESS_THAN_OPE, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPE() { return getToken(MilleniumParser.LESS_THAN_EQUAL_TO_OPE, 0); }
		public TerminalNode GREATER_THAN_OPE() { return getToken(MilleniumParser.GREATER_THAN_OPE, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPE() { return getToken(MilleniumParser.GREATER_THAN_EQUAL_TO_OPE, 0); }
		public TerminalNode EQUAL_OPE() { return getToken(MilleniumParser.EQUAL_OPE, 0); }
		public TerminalNode NOT_EQUAL_OPE() { return getToken(MilleniumParser.NOT_EQUAL_OPE, 0); }
		public Relational_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterRelational_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitRelational_ope(this);
		}
	}

	public final Relational_opeContext relational_ope() throws RecognitionException {
		Relational_opeContext _localctx = new Relational_opeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_relational_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPE) | (1L << LESS_THAN_EQUAL_TO_OPE) | (1L << GREATER_THAN_OPE) | (1L << GREATER_THAN_EQUAL_TO_OPE) | (1L << EQUAL_OPE) | (1L << NOT_EQUAL_OPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Logical_opeContext extends ParserRuleContext {
		public TerminalNode AND_OPE() { return getToken(MilleniumParser.AND_OPE, 0); }
		public TerminalNode OR_OPE() { return getToken(MilleniumParser.OR_OPE, 0); }
		public Logical_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterLogical_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitLogical_ope(this);
		}
	}

	public final Logical_opeContext logical_ope() throws RecognitionException {
		Logical_opeContext _localctx = new Logical_opeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logical_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==AND_OPE || _la==OR_OPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Const_statementContext extends ParserRuleContext {
		public TerminalNode CONSTANT_KEYWORD() { return getToken(MilleniumParser.CONSTANT_KEYWORD, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public Var_assignment_statementContext var_assignment_statement() {
			return getRuleContext(Var_assignment_statementContext.class,0);
		}
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterConst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitConst_statement(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CONSTANT_KEYWORD);
			setState(338);
			match(VARIABLE_IDENTIFIER);
			setState(339);
			var_assignment_statement();
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

	public static class Var_assignment_statementContext extends ParserRuleContext {
		public TerminalNode ASSINGMENT_OPE() { return getToken(MilleniumParser.ASSINGMENT_OPE, 0); }
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public Var_assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterVar_assignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitVar_assignment_statement(this);
		}
	}

	public final Var_assignment_statementContext var_assignment_statement() throws RecognitionException {
		Var_assignment_statementContext _localctx = new Var_assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_var_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(ASSINGMENT_OPE);
			setState(342);
			assignment_factor();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSINGMENT_OPE() { return getToken(MilleniumParser.ASSINGMENT_OPE, 0); }
		public Assignment_factorContext assignment_factor() {
			return getRuleContext(Assignment_factorContext.class,0);
		}
		public TerminalNode INCREMENT_OPE() { return getToken(MilleniumParser.INCREMENT_OPE, 0); }
		public TerminalNode DECREMENT_OPE() { return getToken(MilleniumParser.DECREMENT_OPE, 0); }
		public Assignment_num_opeContext assignment_num_ope() {
			return getRuleContext(Assignment_num_opeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assignment_statement);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(VARIABLE_IDENTIFIER);
				setState(345);
				match(ASSINGMENT_OPE);
				setState(346);
				assignment_factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(VARIABLE_IDENTIFIER);
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT_OPE || _la==DECREMENT_OPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(VARIABLE_IDENTIFIER);
				setState(350);
				assignment_num_ope();
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(351);
					expression();
					}
					break;
				case 2:
					{
					setState(352);
					num_factor();
					}
					break;
				case 3:
					{
					setState(353);
					match(STRING_LITERAL);
					}
					break;
				}
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

	public static class Assignment_num_opeContext extends ParserRuleContext {
		public TerminalNode ADDITION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.ADDITION_ASSIGNMENT_OPE, 0); }
		public TerminalNode SUBTRACTION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.SUBTRACTION_ASSIGNMENT_OPE, 0); }
		public TerminalNode MULTIPLICATION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.MULTIPLICATION_ASSIGNMENT_OPE, 0); }
		public TerminalNode DIVISION_ASSIGNMENT_OPE() { return getToken(MilleniumParser.DIVISION_ASSIGNMENT_OPE, 0); }
		public Assignment_num_opeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_num_ope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterAssignment_num_ope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitAssignment_num_ope(this);
		}
	}

	public final Assignment_num_opeContext assignment_num_ope() throws RecognitionException {
		Assignment_num_opeContext _localctx = new Assignment_num_opeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignment_num_ope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDITION_ASSIGNMENT_OPE) | (1L << SUBTRACTION_ASSIGNMENT_OPE) | (1L << MULTIPLICATION_ASSIGNMENT_OPE) | (1L << DIVISION_ASSIGNMENT_OPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Assignment_factorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Assignment_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterAssignment_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitAssignment_factor(this);
		}
	}

	public final Assignment_factorContext assignment_factor() throws RecognitionException {
		Assignment_factorContext _localctx = new Assignment_factorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignment_factor);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				num_factor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(BOOLEAN_LITERAL);
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

	public static class Funccall_statementContext extends ParserRuleContext {
		public TerminalNode FUNCTION_CALL() { return getToken(MilleniumParser.FUNCTION_CALL, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(MilleniumParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFunccall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFunccall_statement(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funccall_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(FUNCTION_CALL);
			setState(367);
			match(FUNCTION_IDENTIFIER);
			setState(368);
			match(OPEN_PAR);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << ADDITION_OPE) | (1L << SUBTRACTION_OPE) | (1L << NOT_OPE) | (1L << FUNCTION_CALL) | (1L << INTEGER_LITERAL) | (1L << FLOAT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				setState(369);
				actual_parameter_list();
				}
			}

			setState(372);
			match(CLOSE_PAR);
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

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitActual_parameter_list(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_actual_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			actual_params();
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

	public static class Actual_paramsContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ENUMERATION() { return getToken(MilleniumParser.ENUMERATION, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitActual_params(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_actual_params);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(VARIABLE_IDENTIFIER);
				setState(377);
				match(ENUMERATION);
				setState(378);
				actual_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				expression();
				setState(381);
				match(ENUMERATION);
				setState(382);
				actual_params();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				expression();
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

	public static class Conditional_factorContext extends ParserRuleContext {
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Conditional_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterConditional_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitConditional_factor(this);
		}
	}

	public final Conditional_factorContext conditional_factor() throws RecognitionException {
		Conditional_factorContext _localctx = new Conditional_factorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditional_factor);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				bool_expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(BOOLEAN_LITERAL);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_CONDITIONAL() { return getToken(MilleniumParser.IF_CONDITIONAL, 0); }
		public List<Conditional_blockContext> conditional_block() {
			return getRuleContexts(Conditional_blockContext.class);
		}
		public Conditional_blockContext conditional_block(int i) {
			return getRuleContext(Conditional_blockContext.class,i);
		}
		public List<TerminalNode> ELSE_IF_CONDITIONAL() { return getTokens(MilleniumParser.ELSE_IF_CONDITIONAL); }
		public TerminalNode ELSE_IF_CONDITIONAL(int i) {
			return getToken(MilleniumParser.ELSE_IF_CONDITIONAL, i);
		}
		public List<TerminalNode> ELSE_CONDITIONAL() { return getTokens(MilleniumParser.ELSE_CONDITIONAL); }
		public TerminalNode ELSE_CONDITIONAL(int i) {
			return getToken(MilleniumParser.ELSE_CONDITIONAL, i);
		}
		public List<Code_blockContext> code_block() {
			return getRuleContexts(Code_blockContext.class);
		}
		public Code_blockContext code_block(int i) {
			return getRuleContext(Code_blockContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IF_CONDITIONAL);
			setState(392);
			conditional_block();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_CONDITIONAL) {
				{
				{
				setState(393);
				match(ELSE_IF_CONDITIONAL);
				setState(394);
				conditional_block();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_CONDITIONAL) {
				{
				{
				setState(400);
				match(ELSE_CONDITIONAL);
				setState(401);
				code_block();
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Conditional_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public Conditional_factorContext conditional_factor() {
			return getRuleContext(Conditional_factorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_CURLY_BRACK() { return getToken(MilleniumParser.OPEN_CURLY_BRACK, 0); }
		public TerminalNode CLOSE_CURLY_BRACK() { return getToken(MilleniumParser.CLOSE_CURLY_BRACK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterConditional_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitConditional_block(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditional_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(OPEN_PAR);
			setState(408);
			conditional_factor();
			setState(409);
			match(CLOSE_PAR);
			setState(410);
			match(OPEN_CURLY_BRACK);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_LOOP) | (1L << PRINT) | (1L << PRINT_NL) | (1L << SCAN) | (1L << COMMENT_BLOCK) | (1L << CONSTANT_KEYWORD) | (1L << FUNCTION_CALL) | (1L << RETURN) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(411);
				statement();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(CLOSE_CURLY_BRACK);
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

	public static class Code_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACK() { return getToken(MilleniumParser.OPEN_CURLY_BRACK, 0); }
		public TerminalNode CLOSE_CURLY_BRACK() { return getToken(MilleniumParser.CLOSE_CURLY_BRACK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(OPEN_CURLY_BRACK);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_DTYPE) | (1L << FLOAT_DTYPE) | (1L << CHAR_DTYPE) | (1L << STRING_DTYPE) | (1L << BOOLEAN_DTYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_LOOP) | (1L << PRINT) | (1L << PRINT_NL) | (1L << SCAN) | (1L << COMMENT_BLOCK) | (1L << CONSTANT_KEYWORD) | (1L << FUNCTION_CALL) | (1L << RETURN) | (1L << VARIABLE_IDENTIFIER))) != 0)) {
				{
				{
				setState(420);
				statement();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(CLOSE_CURLY_BRACK);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP() { return getToken(MilleniumParser.WHILE_LOOP, 0); }
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(WHILE_LOOP);
			setState(429);
			conditional_block();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO_LOOP() { return getToken(MilleniumParser.DO_LOOP, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public TerminalNode WHILE_LOOP() { return getToken(MilleniumParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public Conditional_factorContext conditional_factor() {
			return getRuleContext(Conditional_factorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode END() { return getToken(MilleniumParser.END, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_do_while_statement);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(DO_LOOP);
				setState(432);
				code_block();
				setState(433);
				match(WHILE_LOOP);
				setState(434);
				match(OPEN_PAR);
				setState(435);
				conditional_factor();
				setState(436);
				match(CLOSE_PAR);
				setState(437);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(DO_LOOP);
				setState(440);
				code_block();
				setState(441);
				match(WHILE_LOOP);
				setState(442);
				match(OPEN_PAR);
				setState(443);
				conditional_factor();
				setState(444);
				match(CLOSE_PAR);
				notifyErrorListeners("Insert ';' to complete statement'");
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(MilleniumParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public List<TerminalNode> END() { return getTokens(MilleniumParser.END); }
		public TerminalNode END(int i) {
			return getToken(MilleniumParser.END, i);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(FOR_LOOP);
			setState(450);
			match(OPEN_PAR);
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				{
				setState(451);
				assignment_statement();
				}
				break;
			case INT_DTYPE:
			case FLOAT_DTYPE:
			case CHAR_DTYPE:
			case STRING_DTYPE:
			case BOOLEAN_DTYPE:
				{
				setState(452);
				data_type();
				setState(453);
				assignment_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(457);
			match(END);
			setState(458);
			bool_expression(0);
			setState(459);
			match(END);
			setState(460);
			assignment_statement();
			setState(461);
			match(CLOSE_PAR);
			setState(462);
			code_block();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MilleniumParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MilleniumParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(MilleniumParser.BOOLEAN_LITERAL, 0); }
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(RETURN);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(465);
				expression();
				}
				break;
			case 2:
				{
				setState(466);
				match(STRING_LITERAL);
				}
				break;
			case 3:
				{
				setState(467);
				match(BOOLEAN_LITERAL);
				}
				break;
			case 4:
				{
				setState(468);
				num_factor();
				}
				break;
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

	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(MilleniumParser.SCAN, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(MilleniumParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterScan_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitScan_statement(this);
		}
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_scan_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(SCAN);
			setState(472);
			match(OPEN_PAR);
			setState(473);
			match(VARIABLE_IDENTIFIER);
			setState(474);
			match(CLOSE_PAR);
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(MilleniumParser.PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(MilleniumParser.OPEN_PAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(MilleniumParser.CLOSE_PAR, 0); }
		public TerminalNode PRINT_NL() { return getToken(MilleniumParser.PRINT_NL, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MilleniumListener ) ((MilleniumListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_print_statement);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				match(PRINT);
				setState(477);
				match(OPEN_PAR);
				setState(478);
				expression();
				setState(479);
				match(CLOSE_PAR);
				}
				break;
			case PRINT_NL:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(PRINT_NL);
				setState(482);
				match(OPEN_PAR);
				setState(483);
				expression();
				setState(484);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return string_expression_sempred((String_expressionContext)_localctx, predIndex);
		case 15:
			return num_expression_sempred((Num_expressionContext)_localctx, predIndex);
		case 19:
			return var_func_expression_sempred((Var_func_expressionContext)_localctx, predIndex);
		case 21:
			return bool_expression_sempred((Bool_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean string_expression_sempred(String_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean num_expression_sempred(Num_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean var_func_expression_sempred(Var_func_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean bool_expression_sempred(Bool_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01eb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0081\n\3\3\4\3\4\3\4\5\4\u0086\n\4"+
		"\3\5\3\5\5\5\u008a\n\5\3\5\3\5\3\6\3\6\5\6\u0090\n\6\3\6\3\6\5\6\u0094"+
		"\n\6\3\6\3\6\5\6\u0098\n\6\5\6\u009a\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5"+
		"\t\u00a3\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00b1"+
		"\n\f\3\r\3\r\5\r\u00b5\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00cb\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d5\n\20\3\20\3\20\3\20"+
		"\7\20\u00da\n\20\f\20\16\20\u00dd\13\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00e5\n\21\3\21\3\21\3\21\3\21\7\21\u00eb\n\21\f\21\16\21\u00ee"+
		"\13\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00f6\n\24\3\24\3\24\5\24\u00fa"+
		"\n\24\3\24\5\24\u00fd\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25"+
		"\u0107\n\25\r\25\16\25\u0108\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6"+
		"\25\u0113\n\25\r\25\16\25\u0114\3\25\3\25\5\25\u0119\n\25\3\25\3\25\3"+
		"\25\5\25\u011e\n\25\3\25\3\25\7\25\u0122\n\25\f\25\16\25\u0125\13\25\3"+
		"\26\3\26\3\26\5\26\u012a\n\26\3\27\3\27\5\27\u012e\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0145\n\27\3\27\3\27\3\27\3\27\7\27\u014b\n"+
		"\27\f\27\16\27\u014e\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0165"+
		"\n\34\5\34\u0167\n\34\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u016f\n\36\3"+
		"\37\3\37\3\37\3\37\5\37\u0175\n\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\5!\u0184\n!\3\"\3\"\5\"\u0188\n\"\3#\3#\3#\3#\7#\u018e\n#\f#\16"+
		"#\u0191\13#\3#\3#\7#\u0195\n#\f#\16#\u0198\13#\3$\3$\3$\3$\3$\7$\u019f"+
		"\n$\f$\16$\u01a2\13$\3$\3$\3%\3%\7%\u01a8\n%\f%\16%\u01ab\13%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\5\'\u01c2\n\'\3(\3(\3(\3(\3(\3(\5(\u01ca\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\5)\u01d8\n)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\5+\u01e9\n+\3+\2\6\36 (,,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\n\3\2\4\b\4\2\33\36$$\3\2\33\34\3"+
		"\2)*\3\2%*\3\2./\3\2+,\3\2\37\"\2\u020c\2Y\3\2\2\2\4\u0080\3\2\2\2\6\u0082"+
		"\3\2\2\2\b\u0087\3\2\2\2\n\u0099\3\2\2\2\f\u009b\3\2\2\2\16\u009e\3\2"+
		"\2\2\20\u00a2\3\2\2\2\22\u00a4\3\2\2\2\24\u00a8\3\2\2\2\26\u00ac\3\2\2"+
		"\2\30\u00b2\3\2\2\2\32\u00b9\3\2\2\2\34\u00ca\3\2\2\2\36\u00d4\3\2\2\2"+
		" \u00e4\3\2\2\2\"\u00ef\3\2\2\2$\u00f1\3\2\2\2&\u00fc\3\2\2\2(\u0118\3"+
		"\2\2\2*\u0129\3\2\2\2,\u0144\3\2\2\2.\u014f\3\2\2\2\60\u0151\3\2\2\2\62"+
		"\u0153\3\2\2\2\64\u0157\3\2\2\2\66\u0166\3\2\2\28\u0168\3\2\2\2:\u016e"+
		"\3\2\2\2<\u0170\3\2\2\2>\u0178\3\2\2\2@\u0183\3\2\2\2B\u0187\3\2\2\2D"+
		"\u0189\3\2\2\2F\u0199\3\2\2\2H\u01a5\3\2\2\2J\u01ae\3\2\2\2L\u01c1\3\2"+
		"\2\2N\u01c3\3\2\2\2P\u01d2\3\2\2\2R\u01d9\3\2\2\2T\u01e8\3\2\2\2VX\5\20"+
		"\t\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5"+
		"\32\16\2]^\7\2\2\3^\3\3\2\2\2_\u0081\5\6\4\2`a\5\62\32\2ab\7\32\2\2b\u0081"+
		"\3\2\2\2cd\5\62\32\2de\b\3\1\2e\u0081\3\2\2\2fg\5\66\34\2gh\7\32\2\2h"+
		"\u0081\3\2\2\2ij\5<\37\2jk\7\32\2\2k\u0081\3\2\2\2l\u0081\5D#\2m\u0081"+
		"\5J&\2n\u0081\5L\'\2o\u0081\5N(\2pq\5P)\2qr\7\32\2\2r\u0081\3\2\2\2st"+
		"\5R*\2tu\7\32\2\2u\u0081\3\2\2\2vw\5R*\2wx\b\3\1\2x\u0081\3\2\2\2yz\5"+
		"T+\2z{\7\32\2\2{\u0081\3\2\2\2|}\5T+\2}~\b\3\1\2~\u0081\3\2\2\2\177\u0081"+
		"\7\31\2\2\u0080_\3\2\2\2\u0080`\3\2\2\2\u0080c\3\2\2\2\u0080f\3\2\2\2"+
		"\u0080i\3\2\2\2\u0080l\3\2\2\2\u0080m\3\2\2\2\u0080n\3\2\2\2\u0080o\3"+
		"\2\2\2\u0080p\3\2\2\2\u0080s\3\2\2\2\u0080v\3\2\2\2\u0080y\3\2\2\2\u0080"+
		"|\3\2\2\2\u0080\177\3\2\2\2\u0081\5\3\2\2\2\u0082\u0083\5\b\5\2\u0083"+
		"\u0085\7\32\2\2\u0084\u0086\5\6\4\2\u0085\u0084\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\7\3\2\2\2\u0087\u0089\5\16\b\2\u0088\u008a\5\f\7\2\u0089"+
		"\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5\n"+
		"\6\2\u008c\t\3\2\2\2\u008d\u008f\7<\2\2\u008e\u0090\5\64\33\2\u008f\u008e"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\30\2\2"+
		"\u0092\u0094\5\n\6\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009a"+
		"\3\2\2\2\u0095\u0097\7<\2\2\u0096\u0098\5\64\33\2\u0097\u0096\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u0095"+
		"\3\2\2\2\u009a\13\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d\7\67\2\2\u009d"+
		"\r\3\2\2\2\u009e\u009f\t\2\2\2\u009f\17\3\2\2\2\u00a0\u00a3\5\22\n\2\u00a1"+
		"\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\21\3\2"+
		"\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6\7=\2\2\u00a6\u00a7\5\30\r\2\u00a7"+
		"\23\3\2\2\2\u00a8\u00a9\7\66\2\2\u00a9\u00aa\7=\2\2\u00aa\u00ab\5\30\r"+
		"\2\u00ab\25\3\2\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00b0\7<\2\2\u00ae\u00af"+
		"\7\30\2\2\u00af\u00b1\5\26\f\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\27\3\2\2\2\u00b2\u00b4\7\22\2\2\u00b3\u00b5\5\26\f\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\23\2\2"+
		"\u00b7\u00b8\5H%\2\u00b8\31\3\2\2\2\u00b9\u00ba\7\66\2\2\u00ba\u00bb\7"+
		"\64\2\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\5H%\2\u00be"+
		"\33\3\2\2\2\u00bf\u00cb\5\36\20\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7"+
		"\33\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00cb\3\2\2\2\u00c4\u00cb\5(\25\2"+
		"\u00c5\u00c6\5 \21\2\u00c6\u00c7\5\"\22\2\u00c7\u00c8\5 \21\2\u00c8\u00cb"+
		"\3\2\2\2\u00c9\u00cb\5,\27\2\u00ca\u00bf\3\2\2\2\u00ca\u00c0\3\2\2\2\u00ca"+
		"\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\35\3\2\2"+
		"\2\u00cc\u00cd\b\20\1\2\u00cd\u00ce\7\22\2\2\u00ce\u00cf\5\36\20\2\u00cf"+
		"\u00d0\7\23\2\2\u00d0\u00d5\3\2\2\2\u00d1\u00d5\7:\2\2\u00d2\u00d5\5<"+
		"\37\2\u00d3\u00d5\7<\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\f\6"+
		"\2\2\u00d7\u00d8\7\33\2\2\u00d8\u00da\5\36\20\7\u00d9\u00d6\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\37\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00df\b\21\1\2\u00df\u00e0\7\22\2\2\u00e0"+
		"\u00e1\5 \21\2\u00e1\u00e2\7\23\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e5\5"+
		"&\24\2\u00e4\u00de\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00ec\3\2\2\2\u00e6"+
		"\u00e7\f\4\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\5 \21\5\u00e9\u00eb\3"+
		"\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed!\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\t\3\2\2"+
		"\u00f0#\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2%\3\2\2\2\u00f3\u00fd\79\2\2"+
		"\u00f4\u00f6\5$\23\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00fd\7\67\2\2\u00f8\u00fa\5$\23\2\u00f9\u00f8\3\2\2\2"+
		"\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\78\2\2\u00fc\u00f3"+
		"\3\2\2\2\u00fc\u00f5\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd\'\3\2\2\2\u00fe"+
		"\u00ff\b\25\1\2\u00ff\u0100\7\22\2\2\u0100\u0101\5(\25\2\u0101\u0102\7"+
		"\23\2\2\u0102\u0119\3\2\2\2\u0103\u0119\5*\26\2\u0104\u0106\7\22\2\2\u0105"+
		"\u0107\7\22\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3"+
		"\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\5(\25\2\u010b"+
		"\u010c\7\23\2\2\u010c\u010d\b\25\1\2\u010d\u0119\3\2\2\2\u010e\u010f\7"+
		"\22\2\2\u010f\u0110\5(\25\2\u0110\u0112\7\23\2\2\u0111\u0113\7\23\2\2"+
		"\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\25\1\2\u0117\u0119\3\2\2\2"+
		"\u0118\u00fe\3\2\2\2\u0118\u0103\3\2\2\2\u0118\u0104\3\2\2\2\u0118\u010e"+
		"\3\2\2\2\u0119\u0123\3\2\2\2\u011a\u011d\f\6\2\2\u011b\u011e\5.\30\2\u011c"+
		"\u011e\5\"\22\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3"+
		"\2\2\2\u011f\u0120\5(\25\7\u0120\u0122\3\2\2\2\u0121\u011a\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124)\3\2\2\2"+
		"\u0125\u0123\3\2\2\2\u0126\u012a\7<\2\2\u0127\u012a\5<\37\2\u0128\u012a"+
		"\5&\24\2\u0129\u0126\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a"+
		"+\3\2\2\2\u012b\u012d\b\27\1\2\u012c\u012e\7\60\2\2\u012d\u012c\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\7\22\2\2\u0130"+
		"\u0131\5,\27\2\u0131\u0132\7\23\2\2\u0132\u0145\3\2\2\2\u0133\u0134\5"+
		" \21\2\u0134\u0135\5.\30\2\u0135\u0136\5 \21\2\u0136\u0145\3\2\2\2\u0137"+
		"\u0138\5\36\20\2\u0138\u0139\t\5\2\2\u0139\u013a\5\36\20\2\u013a\u0145"+
		"\3\2\2\2\u013b\u013c\5(\25\2\u013c\u013d\5.\30\2\u013d\u013e\5(\25\2\u013e"+
		"\u0145\3\2\2\2\u013f\u0145\7;\2\2\u0140\u0141\7\60\2\2\u0141\u0142\7\22"+
		"\2\2\u0142\u0143\7;\2\2\u0143\u0145\7\23\2\2\u0144\u012b\3\2\2\2\u0144"+
		"\u0133\3\2\2\2\u0144\u0137\3\2\2\2\u0144\u013b\3\2\2\2\u0144\u013f\3\2"+
		"\2\2\u0144\u0140\3\2\2\2\u0145\u014c\3\2\2\2\u0146\u0147\f\b\2\2\u0147"+
		"\u0148\5\60\31\2\u0148\u0149\5,\27\t\u0149\u014b\3\2\2\2\u014a\u0146\3"+
		"\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"-\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\t\6\2\2\u0150/\3\2\2\2\u0151"+
		"\u0152\t\7\2\2\u0152\61\3\2\2\2\u0153\u0154\7\62\2\2\u0154\u0155\7<\2"+
		"\2\u0155\u0156\5\64\33\2\u0156\63\3\2\2\2\u0157\u0158\7-\2\2\u0158\u0159"+
		"\5:\36\2\u0159\65\3\2\2\2\u015a\u015b\7<\2\2\u015b\u015c\7-\2\2\u015c"+
		"\u0167\5:\36\2\u015d\u015e\7<\2\2\u015e\u0167\t\b\2\2\u015f\u0160\7<\2"+
		"\2\u0160\u0164\58\35\2\u0161\u0165\5\34\17\2\u0162\u0165\5&\24\2\u0163"+
		"\u0165\7:\2\2\u0164\u0161\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2"+
		"\2\2\u0165\u0167\3\2\2\2\u0166\u015a\3\2\2\2\u0166\u015d\3\2\2\2\u0166"+
		"\u015f\3\2\2\2\u0167\67\3\2\2\2\u0168\u0169\t\t\2\2\u01699\3\2\2\2\u016a"+
		"\u016f\5\34\17\2\u016b\u016f\5&\24\2\u016c\u016f\7:\2\2\u016d\u016f\7"+
		";\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016f;\3\2\2\2\u0170\u0171\7\63\2\2\u0171\u0172\7=\2\2"+
		"\u0172\u0174\7\22\2\2\u0173\u0175\5> \2\u0174\u0173\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\23\2\2\u0177=\3\2\2\2\u0178"+
		"\u0179\5@!\2\u0179?\3\2\2\2\u017a\u017b\7<\2\2\u017b\u017c\7\30\2\2\u017c"+
		"\u0184\5@!\2\u017d\u0184\7<\2\2\u017e\u017f\5\34\17\2\u017f\u0180\7\30"+
		"\2\2\u0180\u0181\5@!\2\u0181\u0184\3\2\2\2\u0182\u0184\5\34\17\2\u0183"+
		"\u017a\3\2\2\2\u0183\u017d\3\2\2\2\u0183\u017e\3\2\2\2\u0183\u0182\3\2"+
		"\2\2\u0184A\3\2\2\2\u0185\u0188\5,\27\2\u0186\u0188\7;\2\2\u0187\u0185"+
		"\3\2\2\2\u0187\u0186\3\2\2\2\u0188C\3\2\2\2\u0189\u018a\7\t\2\2\u018a"+
		"\u018f\5F$\2\u018b\u018c\7\n\2\2\u018c\u018e\5F$\2\u018d\u018b\3\2\2\2"+
		"\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0196"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0193\7\13\2\2\u0193\u0195\5H%\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197E\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\7\22\2\2\u019a\u019b"+
		"\5B\"\2\u019b\u019c\7\23\2\2\u019c\u01a0\7\24\2\2\u019d\u019f\5\4\3\2"+
		"\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7\25\2\2"+
		"\u01a4G\3\2\2\2\u01a5\u01a9\7\24\2\2\u01a6\u01a8\5\4\3\2\u01a7\u01a6\3"+
		"\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\25\2\2\u01adI\3\2\2\2"+
		"\u01ae\u01af\7\r\2\2\u01af\u01b0\5F$\2\u01b0K\3\2\2\2\u01b1\u01b2\7\16"+
		"\2\2\u01b2\u01b3\5H%\2\u01b3\u01b4\7\r\2\2\u01b4\u01b5\7\22\2\2\u01b5"+
		"\u01b6\5B\"\2\u01b6\u01b7\7\23\2\2\u01b7\u01b8\7\32\2\2\u01b8\u01c2\3"+
		"\2\2\2\u01b9\u01ba\7\16\2\2\u01ba\u01bb\5H%\2\u01bb\u01bc\7\r\2\2\u01bc"+
		"\u01bd\7\22\2\2\u01bd\u01be\5B\"\2\u01be\u01bf\7\23\2\2\u01bf\u01c0\b"+
		"\'\1\2\u01c0\u01c2\3\2\2\2\u01c1\u01b1\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c2"+
		"M\3\2\2\2\u01c3\u01c4\7\f\2\2\u01c4\u01c9\7\22\2\2\u01c5\u01ca\5\66\34"+
		"\2\u01c6\u01c7\5\16\b\2\u01c7\u01c8\5\66\34\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\32"+
		"\2\2\u01cc\u01cd\5,\27\2\u01cd\u01ce\7\32\2\2\u01ce\u01cf\5\66\34\2\u01cf"+
		"\u01d0\7\23\2\2\u01d0\u01d1\5H%\2\u01d1O\3\2\2\2\u01d2\u01d7\7\65\2\2"+
		"\u01d3\u01d8\5\34\17\2\u01d4\u01d8\7:\2\2\u01d5\u01d8\7;\2\2\u01d6\u01d8"+
		"\5&\24\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7"+
		"\u01d6\3\2\2\2\u01d8Q\3\2\2\2\u01d9\u01da\7\21\2\2\u01da\u01db\7\22\2"+
		"\2\u01db\u01dc\7<\2\2\u01dc\u01dd\7\23\2\2\u01ddS\3\2\2\2\u01de\u01df"+
		"\7\17\2\2\u01df\u01e0\7\22\2\2\u01e0\u01e1\5\34\17\2\u01e1\u01e2\7\23"+
		"\2\2\u01e2\u01e9\3\2\2\2\u01e3\u01e4\7\20\2\2\u01e4\u01e5\7\22\2\2\u01e5"+
		"\u01e6\5\34\17\2\u01e6\u01e7\7\23\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01de"+
		"\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e9U\3\2\2\2,Y\u0080\u0085\u0089\u008f"+
		"\u0093\u0097\u0099\u00a2\u00b0\u00b4\u00ca\u00d4\u00db\u00e4\u00ec\u00f5"+
		"\u00f9\u00fc\u0108\u0114\u0118\u011d\u0123\u0129\u012d\u0144\u014c\u0164"+
		"\u0166\u016e\u0174\u0183\u0187\u018f\u0196\u01a0\u01a9\u01c1\u01c9\u01d7"+
		"\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}