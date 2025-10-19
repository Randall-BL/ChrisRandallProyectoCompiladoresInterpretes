grammar VGraph;

// --- Parser Rules ---
start: statement* EOF;

statement
    : varStmt         # StmtVar
    | incStmt         # StmtInc
    | turtleMoveStmt  # StmtTurtleMove
    | turtleTurnStmt  # StmtTurtleTurn
    | turtleStateStmt # StmtTurtleState
    | turtlePosStmt   # StmtTurtlePos
    | esperaStmt      # StmtEspera
    | ejecutaStmt     # StmtEjecuta
    | repiteStmt      # StmtRepite
    | siStmt          # StmtSi
    | hazHastaStmt    # StmtHazHasta
    | hastaStmt       # StmtHasta
    | hazMientrasStmt # StmtHazMientras
    | mientrasStmt    # StmtMientras
    | expr ';'        # StmtExpr
    ;


varStmt
    : HAZ ID expr ';'          # StmtHaz
    | INIC ID '=' expr ';'     # StmtInic
    ;

incStmt
    : INC '[' ID (expr)? ']' ';'
    ;

// HASTA (condición primero, luego instrucciones)
hastaStmt
    : HASTA '(' condition ')' '[' ordenList ']' ';'
    ;

// HAZ.MIENTRAS (instrucciones primero, luego condición)
hazMientrasStmt
    : HAZMIENTRAS '[' ordenList ']' '(' condition ')' ';'
    ;

// MIENTRAS (condición primero, luego instrucciones)
mientrasStmt
    : MIENTRAS '(' condition ')' '[' ordenList ']' ';'
    ;

repiteStmt
    : REPITE expr '[' ordenList ']' ';'
    ;

ejecutaStmt
    : EJECUTA '[' ordenList ']' ';'
    ;

ordenList
    : ordenSinPuntoYComa (',' ordenSinPuntoYComa)*
    ;

ordenSinPuntoYComa
    : turtleMoveStmtSinPC
    | turtleTurnStmtSinPC
    | turtleStateStmtSinPC
    | turtlePosStmtSinPC
    | esperaStmtSinPC
    | siSinPuntoYComa      // <-- AGREGAR ESTO
    | incStmtSinPC
    ;

// Versiones SIN punto y coma (solo para usar dentro de repite/ejecuta)
turtleMoveStmtSinPC
    : AVANZA expr         # MoveAvanzaSinPC
    | RETROCEDE expr      # MoveRetrocedeSinPC
    ;

turtleTurnStmtSinPC
    : GIRADERECHA expr    # TurnRightSinPC
    | GIRAIZQUIERDA expr  # TurnLeftSinPC
    ;

turtleStateStmtSinPC
    : OCULTATORTUGA       # StateHideSinPC
    | PONCOLORLAPIZ colorName    # StateSetColorSinPC
    | BAJALAPIZ           # StatePenDownSinPC
    | SUBELAPIZ           # StatePenUpSinPC
    ;

turtlePosStmtSinPC
    : CENTRO                           # PosCenterSinPC
    | PONPOS '[' expr expr ']'         # PosSetXYBracketsSinPC
    | PONPOS expr expr                 # PosSetXYNoBracketsSinPC
    | PONRUMBO expr                    # PosSetHeadingSinPC
    | PONX expr                        # PosSetXSinPC
    | PONY expr                        # PosSetYSinPC
    ;

esperaStmtSinPC
    : ESPERA expr
    ;


siStmt
    : SI '(' condition ')' '[' ordenList ']' ('[' ordenList ']')? ';'
    ;

// Nueva estructura HAZ.HASTA
hazHastaStmt
    : HAZHASTA '[' ordenList ']' '(' condition ')' ';'
    ;


siSinPuntoYComa
    : SI '(' condition ')' '[' ordenList ']' ('[' ordenList ']')?
    ;

// Inc sin punto y coma
incStmtSinPC
    : INC '[' ID (expr)? ']'
    ;
turtleMoveStmt
    : AVANZA expr ';'    # MoveAvanza
    | RETROCEDE expr ';' # MoveRetrocede
    ;

turtleTurnStmt // Comandos de giro
    : GIRADERECHA expr ';'    # TurnRight
    | GIRAIZQUIERDA expr ';'  # TurnLeft
    ;

turtleStateStmt // Comandos que cambian el estado de la tortuga
    : OCULTATORTUGA ';'       # StateHide
    | PONCOLORLAPIZ colorName ';'    # StateSetColor // El color es un ID: 'rojo', 'azul', etc.
    | BAJALAPIZ ';'           # StatePenDown
    | SUBELAPIZ ';'           # StatePenUp
    ;

turtlePosStmt // Comandos que establecen la posición o dirección
    : CENTRO ';'                           # PosCenter
    | PONPOS '[' expr expr ']' ';'         # PosSetXYBrackets
    | PONPOS expr expr ';'                 # PosSetXYNoBrackets
    | PONRUMBO expr ';'                    # PosSetHeading
    | PONX expr ';'                        # PosSetX
    | PONY expr ';'                        # PosSetY
    ;

colorName
    : ROJO | VERDE | AZUL | AMARILLO | CYAN | MAGENTA | BLANCO | NEGRO
    ;
esperaStmt
    : ESPERA expr ';'
    ;

type
    : INT_TYPE
    | COLOR_TYPE
    ;

drawStmt
    : 'draw' 'line'   '(' expr ',' expr ',' expr ',' expr ')' ';'   # DrawLine
    | 'draw' 'rect'   '(' expr ',' expr ',' expr ',' expr ')' ';'   # DrawRect
    | 'draw' 'circle' '(' expr ',' expr ',' expr ')' ';'            # DrawCircle
    | 'draw' 'pixel'  '(' expr ',' expr ')' ';'                     # DrawPixel
    ;

setcolorStmt: 'setcolor' '(' expr ')' ';';
frameStmt:    'frame' '{' statement* '}';
loopStmt:     'loop' '(' init=assignment ';' cond=condition ';' update=assignment ')' '{' statement* '}';
ifStmt
    : 'if' '(' cond=condition ')' '{' statement* '}' 
      ('else' '{' statement* '}')?
    ;
waitStmt:     'wait' '(' expr ')' ';';
assignment:   ID '=' expr;
condition
    : expr op=(COMP_OP | '=') expr
    ;

expr
    : '(' expr ')'                      # Parens
    | RUMBO                             # ExprRumbo
    | IGUALES expr expr                 # Iguales
    | Y expr expr                       # YLogico
    | O expr expr                       # OLogico
    | MAYORQUE expr expr                # Mayorque
    | MENORQUE expr expr                # Menorque
    | DIFERENCIA expr expr+             # Diferencia
    | AZAR expr                         # Azar
    | PRODUCTO expr expr+               # Producto
    | SUMA expr expr+                   # Suma
    | POTENCIA expr expr                # Potencia
    | DIVISION expr expr                # Division
    | left=expr op=('*'|'/') right=expr # MulDiv
    | left=expr op=('+'|'-') right=expr # AddSub
    | left=expr op='%' right=expr       # Mod
    | ID                                # Var
    | INT                               # IntLiteral
    ;

// --- Lexer Rules ---
INT_TYPE:    'int';
COLOR_TYPE:  'color';
DRAW:        'draw';
SETCOLOR:    'setcolor';
FRAME:       'frame';
LOOP:        'loop';
IF:          'if';
ELSE:        'else';
WAIT:        'wait';
LINE:        'line';
RECT:        'rect';
CIRCLE:      'circle';
PIXEL:       'pixel';
COS:         'cos';
SIN:         'sin';
COMP_OP:     '==' | '!=' | '<=' | '>=' | '<' | '>'|'=' ;
//Cosas antiguas arriba

HAZ:       'Haz';
INIC:      'inic';
INC:       'inc';
AVANZA:    'avanza' | 'av' | 'AV';
RETROCEDE: 'retrocede' | 're' | 'RE';
GIRADERECHA:   'giraderecha' | 'gd' | 'GD';
GIRAIZQUIERDA: 'giraizquierda' | 'gi' | 'GI';
OCULTATORTUGA: 'ocultatortuga' | 'ot';
PONCOLORLAPIZ: 'poncolorlapiz' | 'poncl';
CENTRO:        'centro';
ESPERA:        'espera';
PONPOS:        'ponpos' | 'ponxy';
PONRUMBO:      'ponrumbo';
RUMBO:         'rumbo'; // Este es especial, devuelve un valor
PONX:          'ponx';
PONY:          'pony';
BAJALAPIZ:     'bajalapiz' | 'bl';
SUBELAPIZ:     'subelapiz' | 'sb';
EJECUTA: 'ejecuta' | 'Ejecuta' ;
REPITE: 'repite' | 'Repite' ;
SI:        'SI';
HAZHASTA:  'HAZ.HASTA';
HASTA:       'HASTA';
HAZMIENTRAS: 'HAZ.MIENTRAS';
MIENTRAS:    'MIENTRAS';
IGUALES:    'iguales?';
Y:          'Y';
O:          'O';
MAYORQUE:   'mayorque?';
MENORQUE:   'menorque?';
DIFERENCIA: 'Diferencia';
AZAR:       'azar';
PRODUCTO:  'producto';
SUMA:      'suma';
POTENCIA:  'potencia';
DIVISION:  'division';


ROJO:      'Rojo' | 'rojo';
VERDE:     'Verde' | 'verde';
AZUL:      'Azul' | 'azul';
AMARILLO:  'Amarillo' | 'amarillo';
CYAN:      'Cyan' | 'cyan';
MAGENTA:   'Magenta' | 'magenta';
BLANCO:    'Blanco' | 'blanco';
NEGRO:     'Negro' | 'negro';

// Actualizar COLOR_LITERAL para usar los tokens
COLOR_LITERAL
    : '#' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    | ROJO | VERDE | AZUL | AMARILLO | CYAN | MAGENTA | BLANCO | NEGRO
    ;


//COLOR_LITERAL
    //: '#' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
 //   | COLOR_NAMED
    //;
fragment HEX_DIGIT:   [0-9A-Fa-f];
//fragment COLOR_NAMED: 'rojo' | 'verde' | 'azul' | 'amarillo'
                 //  | 'cyan' | 'magenta' | 'blanco' | 'negro'
    //;

ID
    : [a-z] [a-zA-Z0-9_]*
      {
        String text = getText();
        if (text.length() > 10) {
            LexerNoViableAltException e =
                new LexerNoViableAltException(this, _input, _tokenStartCharIndex, null);
            notifyListeners(e);
        }
      }
    ;


// Separados: enteros y flotantes
INT:   [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;
