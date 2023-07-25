grammar BrinoLexer;

PORTA : 'porta' ;
IMPORTAR: 'importar';
MODOPINO: 'modoPino';
REPETIR : 'repetir';
LERANALOG: 'lerAnalog';
ESCREVERANALOG: 'escreverAnalog';
LERDIGITAL: 'lerDigital';
LIGAR:'ligar';
DESLIGAR:'desligar';
ESPERAR:'esperar';

CONFIG: 'config';
LOOP: 'loop';

MODO: (SAIDA | ENTRADA);
SAIDA : 'saida';
ENTRADA : 'entrada';

LITERAL: (NUMINT | NUMREAL | CADEIA | LITERAL_BINARIO);
NUMINT: ('+'|'-')? ('0'..'9')+;
NUMREAL: ('+'|'-')?  ('0'..'9')+ '.' ('0'..'9')+;
CADEIA: '\'' (ESC_SEQ | ~('\'' | '\\'))* '\'';
LITERAL_BINARIO: 'verdadeiro' | 'falso';

TIPO_VAR: (INTEIRO | REAL | BINARIO | TEXTO);
INTEIRO: 'inteiro';
REAL: 'real';
BINARIO: 'binario';
TEXTO: 'texto';

OP_BOOL:  'e' | 'ou' | 'n';
OP_REL: '>' | '>=' | '<' | '<=' | 'n=' | '==';
OP_ARIT: '+' | '-' ;
OP_ARIT2: '*' | '/';

VARIAVEL: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;

fragment
ESC_SEQ: '\\\'';

VIRGULA: ',';
ATRIB: '=';

ABREPAR: '(';
FECHAPAR: ')';
ABRECHAVE: '{';
FECHACHAVE: '}';

COMENTARIO: '//' ~('\n')* '\n' {skip();};
EB: ( ' ' | '\t' | '\r' | '\n') {skip();};

programa
	:       escopoExt CONFIG '{' escopoConfig '}' LOOP '{' escopoLoop '}' EOF
	;

escopoExt
        :       (define | importpc | comando | declaracao)*
        ;

define
        :       VARIAVEL PORTA variavelouliteral
        ;

importpc 
        :       IMPORTAR VARIAVEL
        ;

escopoLoop
	:	(comando | declaracao)*
	;

escopoConfig
	:	(comando | declaracao)*
	;
	
declaracao
	:	TIPO_VAR VARIAVEL ATRIB LITERAL
	;

comando
	:	comandoModopino
	|	comandoRepetir
	|	comandoLerAnalog
	|	comandoEscreverAnalog
        |       comandoLerDigital
	|	comandoLigar
        |       comandoDesligar
        |       comandoEsperar
	;
	
comandoModopino
	:	MODOPINO ABREPAR variavelouliteral VIRGULA MODO FECHAPAR
	;
	
comandoRepetir
	:	REPETIR ABREPAR variavelouliteral FECHAPAR ABRECHAVE (comando)* FECHACHAVE
	;

comandoLerDigital
	:	VARIAVEL ATRIB LERDIGITAL ABREPAR variavelouliteral FECHAPAR
	;

comandoLerAnalog
	:	VARIAVEL ATRIB LERANALOG ABREPAR variavelouliteral FECHAPAR
	;

comandoEscreverAnalog
	:	ESCREVERANALOG ABREPAR variavelouliteral VIRGULA LITERAL FECHAPAR
	;
	
comandoLigar
	:	LIGAR ABREPAR (variavelouliteral) FECHAPAR
	;
	
comandoDesligar
	:	DESLIGAR ABREPAR (variavelouliteral) FECHAPAR
	;

comandoEsperar
	:	ESPERAR ABREPAR (variavelouliteral) FECHAPAR
	;

variavelouliteral
        :       (VARIAVEL | LITERAL)
        ;
