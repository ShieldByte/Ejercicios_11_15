grammar Cmd;

root: (lineaComando PUNTO_COMA?)* EOF;

lineaComando: (SUDO)? comando (argumento | opcion)*;

comando:
	NMAP
	| SS
	| TCPDUMP
	| CURL
	| DIG
	| JOURNALCTL
	| GREP
	| UFW;

opcion: OPCION_CORTA | OPCION_LARGA;

argumento:
	TEXTO
	| CADENA
	| RUTA
	| IP
	| CIDR
	| DOMINIO
	| PALABRA_CLAVE;

// comandos
NMAP: 'nmap';
SS: 'ss';
TCPDUMP: 'tcpdump';
CURL: 'curl';
DIG: 'dig';
JOURNALCTL: 'journalctl';
GREP: 'grep';
UFW: 'ufw';
SUDO: 'sudo';

// flags
OPCION_CORTA: '-' [a-zA-Z]+;
OPCION_LARGA: '--' [a-zA-Z-]+;

// formatos de red y archivos
IP: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+;
CIDR: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ '/' [0-9]+;
RUTA: '/' [a-zA-Z0-9_./-]+;
DOMINIO: [a-zA-Z0-9][a-zA-Z0-9.-]+ '.' [a-zA-Z]{2,};

// strings y palabras
TEXTO: [a-zA-Z0-9_]+;
CADENA: '"' .*? '"';
PALABRA_CLAVE: [a-zA-Z]+;

PUNTO_COMA: ';';

WS: [ \t\r\n]+ -> skip;
