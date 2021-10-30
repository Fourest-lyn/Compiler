grammar Mx;

program: programBlock* EOF;

programBlock: valueDefine | classDefine | functionDefine;

baseType: IDENTIFIER | INT | BOOL | STRING;
type: type'['']' | baseType;
valueDef: IDENTIFIER ('=' expression)? ;
valueDefine: type valueDef (',' valueDef)* ';';
valueList: expression (',' expression)*;
newType
    : baseType ('('')')?                                                        #objectInitial
    | baseType ('['expression']')+('['']')*                                     #arrayInitial
    | baseType ('['expression']')+('['']')+'['expression']'('['expression?']')* #wrongInitial
;

returnType: type | VOID;
functionParameter: (type IDENTIFIER (',' type IDENTIFIER)*)?;
functionDefine: returnType IDENTIFIER '(' functionParameter ')' suite;
lambdaFunction: '[''&'']'('('functionParameter')')? '->' suite '('valueList')';

classConstructor: IDENTIFIER '('')' suite;
classDefine: CLASS IDENTIFIER '{' (valueDefine | classConstructor | functionDefine)* '}'';';

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
    | name=expression '[' index=expression ']'              #indexExpr
    | left=expression op = ('*'|'/'|'%') right=expression   #binaryExpr
    | left=expression op = ('<<'|'>>') right=expression     #binaryExpr
    | left=expression op = ('<'|'<=') right=expression      #binaryExpr
    | left=expression op = ('>'|'>=') right=expression      #binaryExpr
    | left=expression op = ('=='|'!=') right=expression     #binaryExpr
    | left=expression op = ('&'|'|'|'^') right=expression   #binaryExpr
    | left=expression op = ('&&'|'||') right=expression     #binaryExpr
    | left=expression op = ('+'|'-') right=expression       #binaryExpr
    | expression op=('++'|'--')                             #incrExpr
    | <assoc=right> op = ('~'|'!'|'-'|'+') expression       #unaryExpr
    | <assoc=right> op=('++'|'--') expression               #unaryExpr
    | <assoc=right> left=expression '=' right=expression    #assignExpr
    | <assoc=right> NEW newType                             #newExpr
    | IDENTIFIER'('valueList?')'                            #functionExpr
    | lambdaFunction                                        #lambdaExpr
    | id=IDENTIFIER '.' func=IDENTIFIER('('valueList?')')?  #classExpr
    | THIS                                                  #classExpr

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

