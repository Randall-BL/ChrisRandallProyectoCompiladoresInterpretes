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
    ;


varStmt
    : HAZ ID expr ';'          # StmtHaz
    | INIC ID '=' expr ';'     # StmtInic
    ;

incStmt
    : INC '[' ID (expr)? ']' ';'
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
    | PONCOLORLAPIZ ID ';'    # StateSetColor // El color es un ID: 'rojo', 'azul', etc.
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
condition:    expr op=COMP_OP expr;

expr
    : '(' expr ')'                      # Parens
    | RUMBO                             # ExprRumbo
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
COMP_OP:     '==' | '!=' | '<=' | '>=' | '<' | '>';
//Cosas antiguas arriba

HAZ:       'Haz';
INIC:      'inic';
INC:       'inc';
AVANZA:    'avanza' | 'av';
RETROCEDE: 'retrocede' | 're';
GIRADERECHA:   'giraderecha' | 'gd';
GIRAIZQUIERDA: 'giraizquierda' | 'gi';
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



COLOR_LITERAL
    : '#' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    | COLOR_NAMED
    ;
fragment HEX_DIGIT:   [0-9A-Fa-f];
fragment COLOR_NAMED: 'rojo' | 'verde' | 'azul' | 'amarillo'
                   | 'cyan' | 'magenta' | 'blanco' | 'negro'
    ;

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
