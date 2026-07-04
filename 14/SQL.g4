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

// --- INSERT ---
insertStmt:
	INSERT INTO tableName '(' columnName (',' columnName)* ')' VALUES '(' expr (
		',' expr
	)* ')';

// --- UPDATE ---
updateStmt:
	UPDATE tableName SET setClause (',' setClause)* (WHERE expr)?;

setClause: columnName '=' expr;

// --- SELECT ---
selectStmt:
	SELECT selectList FROM tableRef (JOIN tableRef ON expr)? (
		WHERE expr
	)?;

selectList: '*' | columnName (',' columnName)*;

tableRef: ID (ID)?; // alias opcional

// --- EXPRESIONES (para WHERE y SET) ---
expr:
	expr '=' expr // comparación de igualdad
	| expr '>' expr
	| expr '<' expr
	| expr '>=' expr
	| expr '<=' expr
	| expr '<>' expr
	| STRING
	| NUM
	| ID;

// --- LÉXICO ---
CREATE: 'CREATE';
TABLE: 'TABLE';
SERIAL: 'SERIAL';
PRIMARY: 'PRIMARY';
KEY: 'KEY';
VARCHAR: 'VARCHAR';
INTEGER: 'INTEGER';
NOT: 'NOT';
NULL: 'NULL';
DATE: 'DATE';
INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';
UPDATE: 'UPDATE';
SET: 'SET';
WHERE: 'WHERE';
SELECT: 'SELECT';
FROM: 'FROM';
JOIN: 'JOIN';
ON: 'ON';
INNER: 'INNER';
LEFT: 'LEFT';
RIGHT: 'RIGHT';

LPAREN: '(';
RPAREN: ')';
COMMA: ',';
SEMI: ';';
DOT: '.';
EQ: '=';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
NE: '<>';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
STRING: '\'' .*? '\''; // comillas simples

WS: [ \t\r\n]+ -> skip;