grammar Mx;

program: programBlock* EOF;

programBlock: valueDefine | classDefine | functionDefine;

baseType: IDENTIFIER | INT | BOOL | STRING;
type: type'['']' | baseType;
valueDef: IDENTIFIER ('=' expression)? ;
valueDefine: type valueDef (',' valueDef)* ';';
valueList: expression (',' expression)*;
newType: baseType '('')' | baseType ('['expression?']')*;

returnType: type | VOID;
functionParameter: (type IDENTIFIER (',' type IDENTIFIER)*)?;
functionDefine: returnType IDENTIFIER '(' functionParameter ')' suite;
lambdaFunction: '[''&'']'('('functionParameter')')? '->' '{' statement '}' '('valueList')';
functionCall: IDENTIFIER'('valueList?')';

classConstructor: IDENTIFIER '('')' suite;
classDefine: CLASS IDENTIFIER '{' (valueDefine | classConstructor | functionDefine)* '}'';';
classAccess: IDENTIFIER '.' IDENTIFIER('('valueList?')')? | THIS;

suite: '{' statement* '}';

statement
    : suite                                                 #block
    | valueDefine                                           #valueDefStmt
    | IF '(' expression ')' trueStatement=statement
      (ELSE falseStatement=statement)?                      #ifStmt
    | RETURN expression? ';'                                #returnStmt
    | BREAK ';'                                             #breakStmt
    | CONTINUE ';'                                          #continueStmt
    | WHILE '(' condition=expression? ')' statement         #whileStmt
    | FOR '(' init=expression?';'condition=expression?';'
      incr=expression? ')' statement                        #forStmt
    | expression ';'                                        #pureExprStmt
    | ';'                                                   #emptyStmt
;

expression
    : primary                                               #atomExpr
    | expression '[' expression ']'                         #indexExpr
    | expression op = ('*'|'/'|'%') expression              #binaryExpr
    | expression op = ('<<'|'>>') expression                #binaryExpr
    | expression op = ('<'|'<='|'>'|'>=') expression        #binaryExpr
    | expression op = ('=='|'!=') expression                #binaryExpr
    | expression op = ('&'|'|'|'^') expression              #binaryExpr
    | expression op = ('&&'|'||') expression                #binaryExpr
    | expression op=('++'|'--')                             #incrExpr
    | expression op = ('+'|'-') expression                  #binaryExpr
    | <assoc=right> op = ('~'|'!'|'-'|'+') expression       #unaryExpr
    | <assoc=right> op=('++'|'--') expression               #unaryExpr
    | <assoc=right> expression '=' expression               #assignExpr
    | <assoc=right> NEW newType                             #newExpr
    | functionCall                                          #funtionExpr
    | lambdaFunction                                        #lambdaExpr
    | classAccess                                           #classExpr

;

primary
    : '(' expression ')'
    | IDENTIFIER
    | literal
;

literal
    : INTEGERCONST
    | STRINGCONST
    | BOOLCONST
    | NULLCONST
;

INTEGERCONST:   [1-9][0-9]* | '0';
STRINGCONST:    '"' ('\\n' | '\\\\' | '\\"' | .)*? '"';
BOOLCONST:      TRUE | FALSE;
NULLCONST:      NULL;


// Key words.
INT:    'int';
BOOL:   'bool';
STRING: 'string';
NULL:   'null';
VOID:   'void';
TRUE:   'true';
FALSE:  'false';
IF:     'if';
ELSE:   'else';
FOR:    'for';
WHILE:  'while';
BREAK:  'break';
RETURN: 'return';
NEW:    'new';
CLASS:  'class';
THIS:   'this';
CONTINUE:   'continue';

// Marks.
DOT:            '.';
LEFTPAREN:      '(';
RIGHTPAREN:     ')';
LEFTBRACKET:    '[';
RIGHTBRACKET:   ']';
LEFTBRACE:      '{';
RIGHTBRACE:     '}';

LESS:           '<';
GREATER:        '>';
LESSEQUAL:      '<=';
GREATEREQUAL:   '>=';
EQUAL:          '==';
NOTEQUAL:       '!=';

LEFTSHIFT:      '<<';
RIGHTSHIFT:     '>>';

SELFPLUS:       '++';
SELFMINUS:      '--';

PLUS:           '+';
MINUS:          '-';
MUL:            '*';
DIV:            '/';
MOD:            '%';

TILDE:          '~';
AND:            '&';
OR:             '|';
CARET:          '^';

NOT:            '!';
ANDAND:         '&&';
OROR:           '||';

COLON:          ':';
SEMI:           ';';
COMMA:          ',';
ASSIGN:         '=';
BACKSLASH:      '\\\\';
DBQUOTATION:    '\\"';

IDENTIFIER:     [a-zA-Z][a-zA-Z0-9_]* ;



SPACE:      [ \t]+ -> skip;
NEWLINE:    ('\r''\n'? | '\n')->skip;
LINECOMMENT:    '//' ~[\r\n]* -> skip;
BLOCKCOMMENT:   '/*' .*? '*/' ->skip;

