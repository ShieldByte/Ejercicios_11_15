grammar Expr;

root: classDef;

classDef: 'public' 'class' ID '{' methodDef '}';

methodDef:
	'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' statement* '}';

statement: declaration | assignment | printStmt;

declaration: 'int' ID '=' expr ';';

assignment: ID '=' expr ';';

printStmt: 'System.out.println' '(' printArg ')' ';';

printArg: CADENA ('+' expr)? | expr;

expr: expr SUMA expr | expr RESTA expr | NUM | ID;

// palabras clave
PUBLIC: 'public';
CLASS: 'class';
STATIC: 'static';
VOID: 'void';
MAIN: 'main';
STRING: 'String';
INT: 'int';
SYSTEM: 'System';
OUT: 'out';
PRINTLN: 'println';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
CADENA: '"' .*? '"';

SUMA: '+';
RESTA: '-';
ASIGNAR: '=';
PUNTOCOMA: ';';
PAR_IZQ: '(';
PAR_DER: ')';
LLAVE_IZQ: '{';
LLAVE_DER: '}';
COR_IZQ: '[';
COR_DER: ']';
PUNTO: '.';

WS: [ \t\r\n]+ -> skip;
