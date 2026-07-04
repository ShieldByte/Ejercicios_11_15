grammar SQL;

// Número de control: 21031117  (¡Cambia por el tuyo!)

// REGLAS DEL PARSER 
root: (statement PUNTO_COMA)*;

statement: createTableStmt | insertStmt | selectStmt;

// CREATE TABLE 
createTableStmt:
	CREATE TABLE tableName '(' columnDef (',' columnDef)* ')';

tableName: ID;

columnDef: columnName dataType columnConstraint*;

columnName: ID;

dataType: SERIAL | INTEGER | VARCHAR '(' NUM ')' | DATE;

columnConstraint: PRIMARY KEY | NOT NULL;

// INSERT INTO 
insertStmt:
	INSERT INTO tableName '(' columnName (',' columnName)* ')' VALUES valueList (
		',' valueList
	)*;

valueList: '(' value (',' value)* ')';

value: NUM | CADENA;

// SELECT 
selectStmt:
	SELECT selectColumns FROM fromClause (WHERE whereCondition)?;

selectColumns: selectColumn (',' selectColumn)*;

selectColumn:
	tableAlias '.' columnName // ej: e.nombre_equipo
	| columnName; // ej: nombre_equipo

fromClause: tableRef (INNER JOIN tableRef ON joinCondition)?;

tableRef: tableName (ID)?; // ej: alertas_seguridad a

joinCondition: tableAlias '.' ID COMPARACION tableAlias '.' ID;

whereCondition: expr;

// EXPRESIONES 
expr:
	expr COMPARACION expr // a.severidad = 'Alta'
	| value
	| tableAlias '.' ID
	| ID;

tableAlias: ID;

// LÉXICO (TOKENS) 
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

COMPARACION:
	'='
	| '>'
	| '<'
	| '>='
	| '<='
	| '<>'; // operadores de comparación
PAR_IZQ: '(';
PAR_DER: ')';
COMA: ',';
PUNTO: '.';
PUNTO_COMA: ';';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUM: [0-9]+;
CADENA: '\'' .*? '\''; // texto entre comillas simples (SQL)

WS: [ \t\r\n]+ -> skip;