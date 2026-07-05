grammar SQL;

// Numero de control: 21031117

root: (sqlStmt SEMI?)* EOF;

sqlStmt: createTableStmt | insertStmt | updateStmt | selectStmt;

// create table
createTableStmt:
	CREATE TABLE tableName '(' columnDef (',' columnDef)* ')';

tableName: ID;

columnDef: columnName dataType columnConstraint*;

columnName: ID;

dataType: SERIAL | INTEGER | VARCHAR '(' NUM ')' | DATE;

columnConstraint: PRIMARY KEY | NOT NULL;

// insert con multiples sets
insertStmt:
	INSERT INTO tableName '(' columnName (',' columnName)* ')' VALUES '(' expr (
		',' expr
	)* ')' (',' '(' expr (',' expr)* ')')*;

// update
updateStmt:
	UPDATE tableName SET setClause (',' setClause)* (WHERE expr)?;

setClause: columnName '=' expr;

// select y joins
selectStmt:
	SELECT selectList FROM tableRef (joinClause)? (WHERE expr)?;

joinClause: (INNER | LEFT | RIGHT)? JOIN tableRef ON expr;

selectList: '*' | selectItem (',' selectItem)*;

selectItem: (ID DOT)? ID;

tableRef: ID (ID)?;

// operaciones y variables
expr:
	expr AND expr
	| expr OR expr
	| expr '=' expr
	| expr '>' expr
	| expr '<' expr
	| expr '>=' expr
	| expr '<=' expr
	| expr '<>' expr
	| ID DOT ID
	| STRING
	| NUM
	| ID;

// tokens
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
AND: 'AND';
OR: 'OR';

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
STRING: '\'' .*? '\'';

WS: [ \t\r\n]+ -> skip;