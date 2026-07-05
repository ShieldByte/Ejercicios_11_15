grammar Expr;

// Numero de control: 21031117

root: classDef;

classDef: 'public' 'class' ID '{' methodDef '}';

methodDef:
	'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' statement* '}';

statement: declaration | assignment | printStmt | ifStmt;

declaration: tipo ID '=' expr ';';
tipo: INT | STRING;

assignment: ID '=' expr ';';

ifStmt: 'if' '(' expr ')' '{' statement* '}';

printStmt: 'System.out.println' '(' printArg ')' ';';

printArg: CADENA ('+' expr)? | expr;

expr:
	expr SUMA expr
	| expr RESTA expr
	| expr MAYOR_IGUAL expr
	| NUM
	| ID
	| CADENA;

// palabras clave de java
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
IF: 'if';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
CADENA: '"' .*? '"';

SUMA: '+';
RESTA: '-';
MAYOR_IGUAL: '>=';
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
