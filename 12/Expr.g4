grammar Expr;

// Número de control: 21031117  (cambia por el tuyo)

root: classDef;

classDef: 'public' 'class' ID '{' methodDef '}';

methodDef:
	'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')' '{' statement* '}';

// ---- REGLAS PARA INSTRUCCIONES (AHORA CON IF) ----
statement: declaration | assignment | printStmt | ifStmt;

// Declaración soporta 'int' y 'String'
declaration: tipo ID '=' expr ';';
tipo: INT | STRING;

assignment: ID '=' expr ';';

// Estructura del IF: if (condicion) { instrucciones }
ifStmt: 'if' '(' expr ')' '{' statement* '}';

printStmt: 'System.out.println' '(' printArg ')' ';';

printArg:
	CADENA ('+' expr)? // "texto" + variable
	| expr; // solo expresión

// ---- EXPRESIONES (SOPORTA SUMA, RESTA, COMPARACIÓN Y TEXTO) ----
expr:
	expr SUMA expr
	| expr RESTA expr
	| expr MAYOR_IGUAL expr // <--- NUEVO: Mayor o igual
	| NUM
	| ID
	| CADENA; // <--- NUEVO: permitir "Hola" como expresión

// ---------- LÉXICO (TOKENS EN ESPAÑOL) ----------
PUBLIC: 'public';
CLASS: 'class';
STATIC: 'static';
VOID: 'void';
MAIN: 'main';
STRING: 'String'; // tipo de dato
INT: 'int';
SYSTEM: 'System';
OUT: 'out';
PRINTLN: 'println';
IF: 'if'; // <--- NUEVO: palabra reservada

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
CADENA: '"' .*? '"'; // texto entre comillas dobles

SUMA: '+';
RESTA: '-';
MAYOR_IGUAL: '>='; // <--- NUEVO: token para >=
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