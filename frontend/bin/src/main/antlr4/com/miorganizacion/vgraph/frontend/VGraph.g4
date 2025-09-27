grammar VGraph;

// Reglas del parser (sintaxis)
start
    : statement* EOF        // Un programa es una secuencia de sentencias hasta el fin de archivo
    ;

statement
    : drawStmt              // Sentencia de dibujo
    | frameStmt              // Definición de un frame con sentencias dentro
    | loopStmt               // Bucle con número de iteraciones
    | ifStmt                 // Condicional if/else
    | waitStmt               // Pausa en milisegundos
    | assignmentStmt         // Asignación de variables
    ;

// Comandos de dibujo con número exacto de parámetros
// Círculo: centerX, centerY, radio, color
// Rectángulo: x1, y1, x2, y2, color
// Línea: x1, y1, x2, y2, grosor, color
drawStmt
    : drawCircle
    | drawRect
    | drawLine
    ;

// Dibuja un círculo
drawCircle
    : 'draw' 'circle' '(' expr ',' expr ',' expr ',' expr ')' ';'
    ;

// Dibuja un rectángulo
drawRect
    : 'draw' 'rect' '(' expr ',' expr ',' expr ',' expr ',' expr ')' ';'
    ;

// Dibuja una línea
drawLine
    : 'draw' 'line' '(' expr ',' expr ',' expr ',' expr ',' expr ',' expr ')' ';'
    ;

// Define un frame: bloque de sentencias que se pueden animar
frameStmt
    : 'frame' '{' statement* '}'
    ;

// Bucle de ejecución: numero de veces que se repite el bloque
loopStmt
    : 'loop' INT_LITERAL 'times' '{' statement* '}'
    ;

// Estructura condicional if-else
ifStmt
    : 'if' '(' condition ')' '{' statement* '}' ('else' '{' statement* '}')?
    ;

// Pausa la ejecución en milisegundos
waitStmt
    : 'wait' INT_LITERAL 'ms' ';'
    ;

// Asignación de variable: identificador = expresión
assignmentStmt
    : IDENTIFIER '=' expr ';'
    ;

// Lista de expresiones (para futuras extensiones)
exprList
    : expr (',' expr)*
    ;

// Expresiones aritméticas y literales
expr
    : INT_LITERAL              // Enteros
    | COLOR_LITERAL            // Literales de color #RRGGBB
    | IDENTIFIER               // Variables
    | expr ('*' | '/') expr    // Multiplicación, división
    | expr ('+' | '-') expr    // Suma, resta
    | '(' expr ')'             // Agrupación
    ;

// Condiciones comparativas
condition
    : expr compOp expr         // Expresión comparada con operador relacional
    ;

// Operadores de comparación
compOp
    : '=='                     // Igualdad
    | '!='                     // Desigualdad
    | '<'                      // Menor que
    | '<='                     // Menor o igual
    | '>'                      // Mayor que
    | '>='                     // Mayor o igual
    ;

// Reglas del lexer (tokens)

// Literal de color en formato hexadecimal
COLOR_LITERAL
  : '#' [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f] [0-9A-Fa-f]
  ;


// Literal entero (se asume no negativo)
INT_LITERAL
    : [0-9]+
    ;

// Identificador: letra o guión bajo seguido de letras, dígitos o guión bajo
IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

// Espacios en blanco y saltos de línea: se ignoran
WS
    : [ \t\r\n]+ -> skip
    ;

// Comentarios de línea: desde '//' hasta el final de línea
COMMENT
    : '//' ~[\r\n]* -> skip
    ;