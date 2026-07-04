grammar Cmd;

// Número de control: 21031117  (¡Cambia por el tuyo!)

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

opcion:
	OPCION_CORTA // ej: -sV, -sn, -I, -c
	| OPCION_LARGA; // ej: --since

argumento:
	TEXTO // ej: 192.168.1.10, eth0, 20, today
	| CADENA // ej: "Failed password"
	| RUTA // ej: /var/log/auth.log
	| IP // ej: 192.168.1.50
	| CIDR // ej: 192.168.1.0/24
	| DOMINIO // ej: ejemplo.com
	| PALABRA_CLAVE; // ej: deny, from, MX

// ---------- LÉXICO (TOKENS) ---------- Comandos
NMAP: 'nmap';
SS: 'ss';
TCPDUMP: 'tcpdump';
CURL: 'curl';
DIG: 'dig';
JOURNALCTL: 'journalctl';
GREP: 'grep';
UFW: 'ufw';
SUDO: 'sudo';

// Opciones
OPCION_CORTA: '-' [a-zA-Z]+; // -sV, -sn, -I, -tuln, -c
OPCION_LARGA: '--' [a-zA-Z-]+; // --since

// Argumentos especiales (para mejor legibilidad)
IP: [0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+; // 192.168.1.10
CIDR:
	[0-9]+ '.' [0-9]+ '.' [0-9]+ '.' [0-9]+ '/' [0-9]+; // 192.168.1.0/24
RUTA: '/' [a-zA-Z0-9_./-]+; // /var/log/auth.log
DOMINIO:
	[a-zA-Z0-9][a-zA-Z0-9.-]+ '.' [a-zA-Z]{2,}; // ejemplo.com

// Textos genéricos (palabras sueltas, números, etc.)
TEXTO: [a-zA-Z0-9_]+;

// Cadena entre comillas (para el grep)
CADENA: '"' .*? '"';

// Palabra clave para ufw (deny, from) o dig (MX)
PALABRA_CLAVE: [a-zA-Z]+;

// Puntuación
PUNTO_COMA: ';';

// Ignorar espacios
WS: [ \t\r\n]+ -> skip;