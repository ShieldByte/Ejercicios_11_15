grammar SQL;

root: (statement PUNTO_COMA)*;

statement: createTableStmt | insertStmt | selectStmt;

createTableStmt:
	CREATE TABLE tableName '(' columnDef (',' columnDef)* ')';

tableName: ID;

columnDef: columnName dataType columnConstraint*;

columnName: ID;

dataType: SERIAL | INTEGER | VARCHAR '(' NUM ')' | DATE;

columnConstraint: PRIMARY KEY | NOT NULL;

insertStmt:
	INSERT INTO tableName '(' columnName (',' columnName)* ')' VALUES valueList (
		',' valueList
	)*;

valueList: '(' value (',' value)* ')';

value: NUM | CADENA;

selectStmt:
	SELECT selectColumns FROM fromClause (WHERE whereCondition)?;

selectColumns: selectColumn (',' selectColumn)*;

selectColumn: tableAlias '.' columnName | columnName;

fromClause: tableRef (INNER JOIN tableRef ON joinCondition)?;

tableRef: tableName (ID)?;

joinCondition: tableAlias '.' ID COMPARACION tableAlias '.' ID;

whereCondition: expr;

expr: expr COMPARACION expr | value | tableAlias '.' ID | ID;

tableAlias: ID;

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
SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
INNER: 'INNER';
JOIN: 'JOIN';
ON: 'ON';

COMPARACION: '=' | '>' | '<' | '>=' | '<=' | '<>';
PAR_IZQ: '(';
PAR_DER: ')';
COMA: ',';
PUNTO: '.';
PUNTO_COMA: ';';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
CADENA: '\'' .*? '\'';

WS: [ \t\r\n]+ -> skip;
