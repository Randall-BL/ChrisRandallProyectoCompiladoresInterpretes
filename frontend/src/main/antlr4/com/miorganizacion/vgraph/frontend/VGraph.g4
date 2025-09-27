grammar VGraph;

// --- Parser Rules ---
start: statement* EOF;

statement
    : varDeclaration       # StmtVarDecl
    | setcolorStmt         # StmtSetColor
    | drawStmt             # StmtDraw
    | frameStmt            # StmtFrame
    | loopStmt             # StmtLoop
    | ifStmt               # StmtIf
    | waitStmt             # StmtWait
    | assignment ';'       # StmtAssign
    ;

varDeclaration
    : '(' type ')' ID ('=' expr)? ';'
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
    : '(' expr ')'                          # Parens
    | 'cos' '(' expr ')'                    # Cos
    | 'sin' '(' expr ')'                    # Sin
    | left=expr op=('*'|'/') right=expr     # MulDiv
    | left=expr op=('+'|'-') right=expr     # AddSub
    | left=expr op='%' right=expr           # Mod
    | ID                                    # Var
    | INT                                   # IntLiteral
    | FLOAT                                 # FloatLiteral
    | COLOR_LITERAL                         # ColorLiteral
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
