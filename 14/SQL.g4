grammar SQL;

// Número de control: 21031117  (cambia por el tuyo)

root: (sqlStmt SEMI?)* EOF;

sqlStmt: createTableStmt | insertStmt | updateStmt | selectStmt;

// --- CREATE TABLE ---
createTableStmt:
	CREATE TABLE tableName '(' columnDef (',' columnDef)* ')';

tableName: ID;

columnDef: columnName dataType columnConstraint*;

columnName: ID;

dataType: SERIAL | INTEGER | VARCHAR '(' NUM ')' | DATE;

columnConstraint: PRIMARY KEY | NOT NULL;

// --- INSERT (admite múltiples filas de VALUES) ---
insertStmt:
	INSERT INTO tableName '(' columnName (',' columnName)* ')' VALUES
	'(' expr (',' expr)* ')'
	(',' '(' expr (',' expr)* ')')*;

// --- UPDATE ---
updateStmt:
	UPDATE tableName SET setClause (',' setClause)* (WHERE expr)?;

setClause: columnName '=' expr;

// --- SELECT (con soporte de alias y INNER/LEFT/RIGHT JOIN) ---
selectStmt:
	SELECT selectList FROM tableRef (joinClause)? (WHERE expr)?;

// Soporte de INNER JOIN, LEFT JOIN, RIGHT JOIN, JOIN simple
joinClause:
	(INNER | LEFT | RIGHT)? JOIN tableRef ON expr;

// Lista de columnas: *, col, alias.col
selectList: '*' | selectItem (',' selectItem)*;

selectItem: (ID DOT)? ID;     // soporta alias.columna o solo columna

tableRef: ID (ID)?;           // nombre de tabla con alias opcional

// --- EXPRESIONES (para WHERE y SET) ---
expr:
	expr AND expr                  // condición compuesta AND
	| expr OR  expr                // condición compuesta OR
	| expr '='  expr               // igualdad
	| expr '>'  expr
	| expr '<'  expr
	| expr '>=' expr
	| expr '<=' expr
	| expr '<>' expr
	| ID DOT ID                    // alias.columna en expresiones
	| STRING
	| NUM
	| ID;

// --- LÉXICO ---
CREATE:   'CREATE';
TABLE:    'TABLE';
SERIAL:   'SERIAL';
PRIMARY:  'PRIMARY';
KEY:      'KEY';
VARCHAR:  'VARCHAR';
INTEGER:  'INTEGER';
NOT:      'NOT';
NULL:     'NULL';
DATE:     'DATE';
INSERT:   'INSERT';
INTO:     'INTO';
VALUES:   'VALUES';
UPDATE:   'UPDATE';
SET:      'SET';
WHERE:    'WHERE';
SELECT:   'SELECT';
FROM:     'FROM';
JOIN:     'JOIN';
ON:       'ON';
INNER:    'INNER';
LEFT:     'LEFT';
RIGHT:    'RIGHT';
AND:      'AND';
OR:       'OR';

LPAREN: '(';
RPAREN: ')';
COMMA:  ',';
SEMI:   ';';
DOT:    '.';
EQ:     '=';
GT:     '>';
LT:     '<';
GE:     '>=';
LE:     '<=';
NE:     '<>';

ID:     [a-zA-Z_][a-zA-Z0-9_]*;
NUM:    [0-9]+;
STRING: '\'' .*? '\'';   // comillas simples

WS: [ \t\r\n]+ -> skip;