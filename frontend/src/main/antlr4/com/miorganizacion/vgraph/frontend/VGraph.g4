grammar VGraph;

// --- Parser Rules ---
start: statement* EOF;

statement
    : varStmt         # StmtVar
    | ID '=' expr ';' # StmtAssign
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
    : HAZ ID expr ';'      # StmtHaz
    | INIC ID '=' expr ';' # StmtInic
    ;

incStmt
    : INC '[' ID (expr)? ']' ';'
    ;

// --- ESTRUCTURAS DE CONTROL (con punto y coma) ---
repiteStmt:      REPITE expr '[' ordenList ']' ';';
ejecutaStmt:     EJECUTA '[' ordenList ']' ';';
siStmt:          SI '(' condition ')' '[' ordenList ']' ('[' ordenList ']')? ';';
hazHastaStmt:    HAZHASTA '[' ordenList ']' '(' condition ')' ';';
hastaStmt:       HASTA '(' condition ')' '[' ordenList ']' ';';
hazMientrasStmt: HAZMIENTRAS '[' ordenList ']' '(' condition ')' ';';
mientrasStmt:    MIENTRAS '(' condition ')' '[' ordenList ']' ';';

// --- LISTA DE ÓRDENES (para dentro de los bloques) ---
ordenList
    : ordenSinPuntoYComa (',' ordenSinPuntoYComa)*
    ;

ordenSinPuntoYComa
    : turtleMoveStmtSinPC
    | turtleTurnStmtSinPC
    | turtleStateStmtSinPC
    | turtlePosStmtSinPC
    | esperaStmtSinPC
    | siSinPuntoYComa
    | incStmtSinPC
    | repiteStmtSinPC       // Corregido: anidación permitida
    | mientrasStmtSinPC     // Corregido: anidación permitida
    | hastaStmtSinPC        // Corregido: anidación permitida
    | hazMientrasStmtSinPC  // Corregido: anidación permitida
    | hazHastaStmtSinPC     // Corregido: anidación permitida
    ;

// --- ESTRUCTURAS DE CONTROL (SIN punto y coma) ---
siSinPuntoYComa:      SI '(' condition ')' '[' ordenList ']' ('[' ordenList ']')?            # SiSinPC;
incStmtSinPC:         INC '[' ID (expr)? ']'                                                 # IncSinPC;
repiteStmtSinPC:      REPITE expr '[' ordenList ']'                                          # RepiteSinPC;
mientrasStmtSinPC:    MIENTRAS '(' condition ')' '[' ordenList ']'                           # MientrasSinPC;
hastaStmtSinPC:       HASTA '(' condition ')' '[' ordenList ']'                              # HastaSinPC;
hazMientrasStmtSinPC: HAZMIENTRAS '[' ordenList ']' '(' condition ')'                        # HazMientrasSinPC;
hazHastaStmtSinPC:    HAZHASTA '[' ordenList ']' '(' condition ')'                           # HazHastaSinPC;

// --- COMANDOS DE TORTUGA (con punto y coma) ---
turtleMoveStmt
    : AVANZA expr ';'    # MoveAvanza
    | RETROCEDE expr ';' # MoveRetrocede
    ;
turtleTurnStmt
    : GIRADERECHA expr ';'   # TurnRight
    | GIRAIZQUIERDA expr ';' # TurnLeft
    ;
turtleStateStmt
    : OCULTATORTUGA ';'      # StateHide
    | PONCOLORLAPIZ colorName ';' # StateSetColor
    | BAJALAPIZ ';'          # StatePenDown
    | SUBELAPIZ ';'          # StatePenUp
    ;
turtlePosStmt
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

// --- COMANDOS DE TORTUGA (SIN punto y coma) ---
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
    | PONCOLORLAPIZ colorName # StateSetColorSinPC
    | BAJALAPIZ           # StatePenDownSinPC
    | SUBELAPIZ           # StatePenUpSinPC
    ;
turtlePosStmtSinPC
    : CENTRO                           # PosCenterSinPC
    | PONPOS '[' expr expr ']' ';'     # PosSetXYBracketsSinPC // Note: Semicolon inside brackets is weird, but keeping as per original
    | PONPOS expr expr                 # PosSetXYNoBracketsSinPC
    | PONRUMBO expr                    # PosSetHeadingSinPC
    | PONX expr                        # PosSetXSinPC
    | PONY expr                        # PosSetYSinPC
    ;
esperaStmtSinPC
    : ESPERA expr                      # EsperaSinPC
    ;

colorName
    : ROJO | VERDE | AZUL | AMARILLO | CYAN | MAGENTA | BLANCO | NEGRO
    ;

condition
    : expr  // Corregido: Permite que cualquier expresión sea una condición
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
    | expr COMP_OP expr                 # CompExpr
    | ID                                # Var
    | INT                               # IntLiteral
    ;

// --- Lexer Rules ---
COMP_OP: '==' | '!=' | '<=' | '>=' | '<' | '>';

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
RUMBO:         'rumbo';
PONX:          'ponx';
PONY:          'pony';
BAJALAPIZ:     'bajalapiz' | 'bl';
SUBELAPIZ:     'subelapiz' | 'sb';
EJECUTA: 'ejecuta' | 'Ejecuta';
REPITE: 'repite' | 'Repite';
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

INT:   [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+ ([eE] [+-]? [0-9]+)?;

WS: [ \t\r\n]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;