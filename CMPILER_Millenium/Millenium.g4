/**
 * Define a grammar called Hello
 */
grammar Millenium;

r  : INTEGER_LITERAL ;    

/*** LEXICAL TOKENS ***/

HT_NL_CR					: [|\t | |\n | |\r]+ -> skip; 
//DIGIT 					: [0-9];
INT_DTYPE					: 'digitz';
FLOAT_DTYPE					: 'lutang';
CHAR_DTYPE					: 'single';
STRING_DTYPE				: 'Msg';
BOOLEAN_DTYPE				: 'weh';


IF_CONDITIONAL				: 'priority';
ELSE_IF_CONDITIONAL			: 'optionlang';
ELSE_CONDITIONAL			: 'nochoice';
FOR_LOOP					: 'willingtowait';
WHILE_LOOP					: 'hanggatkeri';
DO_LOOP						: 'gora';


PRINT						: 'post';
//PRINT_NL					: ''
SCAN						: 'gimmeinput';
OPEN_PAR					: '(';
CLOSE_PAR					: ')';
OPEN_CURLY_BRACK			: '{';
CLOSE_CURLY_BRACK			: '}';
OPEN_SQUARE_BRACK			: '[';
CLOSE_SQUARE_BRACK			: ']';
ENUMERATION					: ',';
COMMENT_BLOCK				: '???' .*? '???';
END							: ';';


ADDITION_OPE				: '+';
SUBTRACTION_OPE				: '-';
MULTIPLICTION_OPE			: '*';
DIVISION_OPE				: '/';
MODULO_OPE					: '%';
LESS_THAN_OPE				: '<';
LESS_THAN_EQUAL_TO_OPE		: '<=';
GREATER_THAN_OPE			: '>';
GREATER_THAN_EQUAL_TO_OPE	: '>=';
EQUAL_OPE					: '==';
NOT_EQUAL_OPE				: '!=';
INCREMENT_OPE				: '++';
DECREMENT_OPE   			: '--';
ASSINGMENT_OPE				: '='; 
AND_OPE						: 'AND';
OR_OPE						: 'OR';
NOT_OPE						: 'NOT';


ARRAY_SIZE_DELIMETER		: '#';
CONSTANT_KEYWORD			: 'consistent';
FUNCTION_CALL				: 'shoutout';
MAIN_FUNC					: 'LEZGO';
RETURN						: 'uwina';
VOID						: 'walangibabalik';



INTEGER_LITERAL				: ('+' | '-')? [0-9]+;
FLOAT_LITERAL				: INTEGER_LITERAL? '.' [0-9]+;
CHAR_LITERAL				: '\'' . '\'';
STRING_LITERAL				: '"' .*? '"';
BOOLEAN_LITERAL				: 'yas' | 'deins' ; 
VARIABLE_IDENTIFIER			: [a-z]+[0-9]*;
FUNCTION_IDENTIFIER			: [A-Z]+[0-9]*;














