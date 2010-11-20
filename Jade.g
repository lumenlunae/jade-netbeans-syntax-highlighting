grammar Jade;
options {output=template;}
scope slist {
    List locals; // must be defined one per semicolon
    List stats;
}
/*
@slist::init {
    locals = new ArrayList();
    stats = new ArrayList();
}
*/
@header {
import org.antlr.stringtemplate.*;
}

program
scope {
  List globals;
  List functions;
}
@init {
  $program::globals = new ArrayList();
  $program::functions = new ArrayList();
}
    :   declaration+
        -> program(globals={$program::globals},functions={$program::functions})
    ;

declaration
	:	(INDENT)*(doctype|article|pipetext|comment)(ws)+ {$program::globals.add($variable.st);}
	;
attributes
	:	LEFTPAREN ( formalParameter (COMMA formalParameter)* )? RIGHTPAREN
	;
doctype
	:	DOCTYPE;
article
	:	(tag|id|class) (attributes)? (EQUAL)? (data)*
	;
comment
	:	COMMENT|SERVERCOMMENT
	;
data
	:	text|var
	;
text
	:	TEXT
	;
var	
	:	VARIABLE
	;
ws
	:	WS
	;	
tag
	:	(elem)(id)?(class*)
	;
elem
	:	NAME;
class
	:	(CLASS);
id
	:	(ID);
pipetext
	:
		'|' (data)*
	;
formalParameter
	:	key value;
key
	:	KEY;
value
	: (STRING)
	;

NAME 	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*;
KEY	: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'-')*(' ')*(':'|'=')(' ')*;
INT	: ('0'..'9')+;
DOCTYPE	: ('!!!')(' ' '0'..'9' )?;
LEFTPAREN 	: '(' ' '*;
RIGHTPAREN	: ' '* ')';
ID	:	('#')(NAME);
CLASS	:	'.'(NAME);
EQUAL	:	'=';
COLON	:	':';
CODE	:	'-';
PIPE	:	'|';
AT	:	'@';
COMMA	:	' '* ',' ' '*;
RIGHTBRACE 	: '}';
LEFTBRACK 	: '[';
RIGHTBRACK	: ']';
RAND1 	:	 '#';
INDENT	:	('  ' | '\t')+;
LEFTVAR :	'#' '{';
STRING
    :   (   '"' (~('\\'|'\n'|'"'))* '"'
        |  '\'' (~('\\'|'\n'|'\''))* '\''
        )
    ;
VARIABLE
	: ' 'LEFTVAR(NAME)(RIGHTBRACE)
	;
TEXT
    	:	(' ') (~('\r\n'|'\r'|'\n'|' ')*)
    	;
COMMENT :	('// ')(~('\r\n'|'\r'|'\n')*)
	;
SERVERCOMMENT 
	:	('//- ') (~('\r\n'|'\r'|'\n')*)
	;
//WS	:	('\r' | '\n')+ {$channel=HIDDEN;};
WS   :	( '\f'
	| ('\r\n'
	  | '\r'
	  | '\n'
	  )
	)
	  ;
