// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\Personal\\Programs\\JadeEditor\\grammarTest.g 2010-11-10 00:19:28

import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class grammarTestParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SEMICOLON", "ELEM", "LEFTPAREN", "COMMA", "RIGHTPAREN", "TYPE_INT", "TYPE_CHAR", "LEFTBRACE", "RIGHTBRACE", "FOR", "EQUAL", "EQUALEQUAL", "LESSTHAN", "PLUS", "INT", "COLON", "PIPE", "ID", "DOC", "CODE", "WS"
    };
    public static final int LESSTHAN=16;
    public static final int DOC=22;
    public static final int TYPE_INT=9;
    public static final int FOR=13;
    public static final int EQUALEQUAL=15;
    public static final int SEMICOLON=4;
    public static final int INT=18;
    public static final int ID=21;
    public static final int EOF=-1;
    public static final int ELEM=5;
    public static final int CODE=23;
    public static final int COLON=19;
    public static final int LEFTPAREN=6;
    public static final int WS=24;
    public static final int LEFTBRACE=11;
    public static final int RIGHTPAREN=8;
    public static final int COMMA=7;
    public static final int TYPE_CHAR=10;
    public static final int EQUAL=14;
    public static final int PIPE=20;
    public static final int RIGHTBRACE=12;
    public static final int PLUS=17;

    // delegates
    // delegators

    protected static class slist_scope {
        List locals;
        // must be defined one per semicolon
            List stats;
    }
    protected Stack slist_stack = new Stack();

    public static final String[] ruleNames = new String[] {
        "invalidRule", "declaration", "stat", "formalParameter", "assignStat", 
        "block", "atom", "function", "condExpr", "aexpr", "variable", "forStat", 
        "expr", "declarator", "type", "program"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public grammarTestParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public grammarTestParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public grammarTestParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("grammarTestParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return grammarTestParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\Personal\\Programs\\JadeEditor\\grammarTest.g"; }


    protected static class program_scope {
        List globals;
        List functions;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:21:1: program : ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions);
    public final grammarTestParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        grammarTestParser.program_return retval = new grammarTestParser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:30:5: ( ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions))
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:30:9: ( declaration )+
            {
            dbg.location(30,9);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:30:9: ( declaration )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==ELEM||(LA1_0>=TYPE_INT && LA1_0<=TYPE_CHAR)) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:30:9: declaration
            	    {
            	    dbg.location(30,9);
            	    pushFollow(FOLLOW_declaration_in_program49);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}



            // TEMPLATE REWRITE
            // 31:9: -> program(globals=$program::globalsfunctions=$program::functions)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("functions", ((program_scope)program_stack.peek()).functions));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            program_stack.pop();
        }
        dbg.location(32, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:34:1: declaration : ( variable | f= function );
    public final grammarTestParser.declaration_return declaration() throws RecognitionException {
        grammarTestParser.declaration_return retval = new grammarTestParser.declaration_return();
        retval.start = input.LT(1);

        grammarTestParser.function_return f = null;

        grammarTestParser.variable_return variable1 = null;


        try { dbg.enterRule(getGrammarFileName(), "declaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:35:5: ( variable | f= function )
            int alt2=2;
            try { dbg.enterDecision(2);

            switch ( input.LA(1) ) {
            case TYPE_INT:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ELEM) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==LEFTPAREN) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==SEMICOLON) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case TYPE_CHAR:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==ELEM) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==LEFTPAREN) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==SEMICOLON) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case ELEM:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==ELEM) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==LEFTPAREN) ) {
                        alt2=2;
                    }
                    else if ( (LA2_4==SEMICOLON) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:35:9: variable
                    {
                    dbg.location(35,9);
                    pushFollow(FOLLOW_variable_in_declaration90);
                    variable1=variable();

                    state._fsp--;

                    dbg.location(35,20);
                    ((program_scope)program_stack.peek()).globals.add((variable1!=null?variable1.st:null));

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:36:9: f= function
                    {
                    dbg.location(36,10);
                    pushFollow(FOLLOW_function_in_declaration106);
                    f=function();

                    state._fsp--;

                    dbg.location(36,20);
                    ((program_scope)program_stack.peek()).functions.add((f!=null?f.st:null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(37, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declaration"

    public static class variable_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variable"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:42:1: variable : type declarator SEMICOLON -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st);
    public final grammarTestParser.variable_return variable() throws RecognitionException {
        grammarTestParser.variable_return retval = new grammarTestParser.variable_return();
        retval.start = input.LT(1);

        grammarTestParser.type_return type2 = null;

        grammarTestParser.declarator_return declarator3 = null;


        try { dbg.enterRule(getGrammarFileName(), "variable");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(42, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:43:5: ( type declarator SEMICOLON -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st) -> variable(type=$type.stname=$declarator.st))
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:43:9: type declarator SEMICOLON
            {
            dbg.location(43,9);
            pushFollow(FOLLOW_type_in_variable130);
            type2=type();

            state._fsp--;

            dbg.location(43,14);
            pushFollow(FOLLOW_declarator_in_variable132);
            declarator3=declarator();

            state._fsp--;

            dbg.location(43,25);
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variable134); 


            // TEMPLATE REWRITE
            // 44:9: -> {$function.size()>0 && $function::name==null}? globalVariable(type=$type.stname=$declarator.st)
            if (function_stack.size()>0 && ((function_scope)function_stack.peek()).name==null) {
                retval.st = templateLib.getInstanceOf("globalVariable",
              new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
            }
            else // 46:9: -> variable(type=$type.stname=$declarator.st)
            {
                retval.st = templateLib.getInstanceOf("variable",
              new STAttrMap().put("type", (type2!=null?type2.st:null)).put("name", (declarator3!=null?declarator3.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(47, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "variable");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "variable"

    public static class declarator_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declarator"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:49:1: declarator : ELEM -> {new StringTemplate($ELEM.text)};
    public final grammarTestParser.declarator_return declarator() throws RecognitionException {
        grammarTestParser.declarator_return retval = new grammarTestParser.declarator_return();
        retval.start = input.LT(1);

        Token ELEM4=null;

        try { dbg.enterRule(getGrammarFileName(), "declarator");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:50:5: ( ELEM -> {new StringTemplate($ELEM.text)})
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:50:9: ELEM
            {
            dbg.location(50,9);
            ELEM4=(Token)match(input,ELEM,FOLLOW_ELEM_in_declarator208); 


            // TEMPLATE REWRITE
            // 50:14: -> {new StringTemplate($ELEM.text)}
            {
                retval.st = new StringTemplate((ELEM4!=null?ELEM4.getText():null));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(51, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "declarator");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "declarator"

    protected static class function_scope {
        String name;
    }
    protected Stack function_stack = new Stack();

    public static class function_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:53:1: function : type ELEM LEFTPAREN (p+= formalParameter ( COMMA p+= formalParameter )* )? RIGHTPAREN block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p);
    public final grammarTestParser.function_return function() throws RecognitionException {
        slist_stack.push(new slist_scope());
        function_stack.push(new function_scope());
        grammarTestParser.function_return retval = new grammarTestParser.function_return();
        retval.start = input.LT(1);

        Token ELEM5=null;
        List list_p=null;
        grammarTestParser.type_return type6 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:62:5: ( type ELEM LEFTPAREN (p+= formalParameter ( COMMA p+= formalParameter )* )? RIGHTPAREN block -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p))
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:62:9: type ELEM LEFTPAREN (p+= formalParameter ( COMMA p+= formalParameter )* )? RIGHTPAREN block
            {
            dbg.location(62,9);
            pushFollow(FOLLOW_type_in_function245);
            type6=type();

            state._fsp--;

            dbg.location(62,14);
            ELEM5=(Token)match(input,ELEM,FOLLOW_ELEM_in_function247); 
            dbg.location(62,19);
            ((function_scope)function_stack.peek()).name =(ELEM5!=null?ELEM5.getText():null);
            dbg.location(63,9);
            match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_function259); 
            dbg.location(63,19);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:63:19: (p+= formalParameter ( COMMA p+= formalParameter )* )?
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==ELEM||(LA4_0>=TYPE_INT && LA4_0<=TYPE_CHAR)) ) {
                alt4=1;
            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:63:21: p+= formalParameter ( COMMA p+= formalParameter )*
                    {
                    dbg.location(63,22);
                    pushFollow(FOLLOW_formalParameter_in_function265);
                    p=formalParameter();

                    state._fsp--;

                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());

                    dbg.location(63,40);
                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:63:40: ( COMMA p+= formalParameter )*
                    try { dbg.enterSubRule(3);

                    loop3:
                    do {
                        int alt3=2;
                        try { dbg.enterDecision(3);

                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        } finally {dbg.exitDecision(3);}

                        switch (alt3) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:63:42: COMMA p+= formalParameter
                    	    {
                    	    dbg.location(63,42);
                    	    match(input,COMMA,FOLLOW_COMMA_in_function269); 
                    	    dbg.location(63,49);
                    	    pushFollow(FOLLOW_formalParameter_in_function273);
                    	    p=formalParameter();

                    	    state._fsp--;

                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(3);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(63,73);
            match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_function281); 
            dbg.location(64,9);
            pushFollow(FOLLOW_block_in_function291);
            block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 65:9: -> function(type=$type.stname=$function::namelocals=$slist::localsstats=$slist::statsargs=$p)
            {
                retval.st = templateLib.getInstanceOf("function",
              new STAttrMap().put("type", (type6!=null?type6.st:null)).put("name", ((function_scope)function_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();
            function_stack.pop();
        }
        dbg.location(69, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "function"

    public static class formalParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameter"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:71:1: formalParameter : type declarator -> parameter(type=$type.stname=$declarator.st);
    public final grammarTestParser.formalParameter_return formalParameter() throws RecognitionException {
        grammarTestParser.formalParameter_return retval = new grammarTestParser.formalParameter_return();
        retval.start = input.LT(1);

        grammarTestParser.type_return type7 = null;

        grammarTestParser.declarator_return declarator8 = null;


        try { dbg.enterRule(getGrammarFileName(), "formalParameter");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:72:5: ( type declarator -> parameter(type=$type.stname=$declarator.st))
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:72:9: type declarator
            {
            dbg.location(72,9);
            pushFollow(FOLLOW_type_in_formalParameter407);
            type7=type();

            state._fsp--;

            dbg.location(72,14);
            pushFollow(FOLLOW_declarator_in_formalParameter409);
            declarator8=declarator();

            state._fsp--;



            // TEMPLATE REWRITE
            // 73:9: -> parameter(type=$type.stname=$declarator.st)
            {
                retval.st = templateLib.getInstanceOf("parameter",
              new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", (declarator8!=null?declarator8.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(74, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "formalParameter");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class type_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:76:1: type : ( TYPE_INT -> type_int() | TYPE_CHAR -> type_char() | ELEM -> type_user_object(name=$ELEM.text));
    public final grammarTestParser.type_return type() throws RecognitionException {
        grammarTestParser.type_return retval = new grammarTestParser.type_return();
        retval.start = input.LT(1);

        Token ELEM9=null;

        try { dbg.enterRule(getGrammarFileName(), "type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:77:5: ( TYPE_INT -> type_int() | TYPE_CHAR -> type_char() | ELEM -> type_user_object(name=$ELEM.text))
            int alt5=3;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case TYPE_INT:
                {
                alt5=1;
                }
                break;
            case TYPE_CHAR:
                {
                alt5=2;
                }
                break;
            case ELEM:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:77:9: TYPE_INT
                    {
                    dbg.location(77,9);
                    match(input,TYPE_INT,FOLLOW_TYPE_INT_in_type450); 


                    // TEMPLATE REWRITE
                    // 77:19: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:78:9: TYPE_CHAR
                    {
                    dbg.location(78,9);
                    match(input,TYPE_CHAR,FOLLOW_TYPE_CHAR_in_type467); 


                    // TEMPLATE REWRITE
                    // 78:19: -> type_char()
                    {
                        retval.st = templateLib.getInstanceOf("type_char");
                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:79:9: ELEM
                    {
                    dbg.location(79,9);
                    ELEM9=(Token)match(input,ELEM,FOLLOW_ELEM_in_type483); 


                    // TEMPLATE REWRITE
                    // 79:18: -> type_user_object(name=$ELEM.text)
                    {
                        retval.st = templateLib.getInstanceOf("type_user_object",
                      new STAttrMap().put("name", (ELEM9!=null?ELEM9.getText():null)));
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(80, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "type"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:82:1: block : LEFTBRACE ( variable )* ( stat )* RIGHTBRACE ;
    public final grammarTestParser.block_return block() throws RecognitionException {
        grammarTestParser.block_return retval = new grammarTestParser.block_return();
        retval.start = input.LT(1);

        grammarTestParser.variable_return variable10 = null;

        grammarTestParser.stat_return stat11 = null;


        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:83:5: ( LEFTBRACE ( variable )* ( stat )* RIGHTBRACE )
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:83:8: LEFTBRACE ( variable )* ( stat )* RIGHTBRACE
            {
            dbg.location(83,8);
            match(input,LEFTBRACE,FOLLOW_LEFTBRACE_in_block514); 
            dbg.location(84,8);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:84:8: ( variable )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==ELEM) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==ELEM) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>=TYPE_INT && LA6_0<=TYPE_CHAR)) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:84:10: variable
            	    {
            	    dbg.location(84,10);
            	    pushFollow(FOLLOW_variable_in_block525);
            	    variable10=variable();

            	    state._fsp--;

            	    dbg.location(84,19);
            	    ((slist_scope)slist_stack.peek()).locals.add((variable10!=null?variable10.st:null));

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}

            dbg.location(85,8);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:85:8: ( stat )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7);

                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=SEMICOLON && LA7_0<=LEFTPAREN)||LA7_0==LEFTBRACE||LA7_0==FOR||LA7_0==INT) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:85:10: stat
            	    {
            	    dbg.location(85,10);
            	    pushFollow(FOLLOW_stat_in_block541);
            	    stat11=stat();

            	    state._fsp--;

            	    dbg.location(85,15);
            	    ((slist_scope)slist_stack.peek()).stats.add((stat11!=null?stat11.st:null));

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}

            dbg.location(86,8);
            match(input,RIGHTBRACE,FOLLOW_RIGHTBRACE_in_block554); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(87, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    public static class stat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stat"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:89:1: stat : ( forStat -> {$forStat.st} | expr SEMICOLON -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat SEMICOLON -> {$assignStat.st} | SEMICOLON -> {new StringTemplate(\";\")});
    public final grammarTestParser.stat_return stat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        grammarTestParser.stat_return retval = new grammarTestParser.stat_return();
        retval.start = input.LT(1);

        grammarTestParser.forStat_return forStat12 = null;

        grammarTestParser.expr_return expr13 = null;

        grammarTestParser.assignStat_return assignStat14 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "stat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:95:5: ( forStat -> {$forStat.st} | expr SEMICOLON -> statement(expr=$expr.st) | block -> statementList(locals=$slist::localsstats=$slist::stats) | assignStat SEMICOLON -> {$assignStat.st} | SEMICOLON -> {new StringTemplate(\";\")})
            int alt8=5;
            try { dbg.enterDecision(8);

            switch ( input.LA(1) ) {
            case FOR:
                {
                alt8=1;
                }
                break;
            case ELEM:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EQUAL) ) {
                    alt8=4;
                }
                else if ( (LA8_2==SEMICOLON||(LA8_2>=EQUALEQUAL && LA8_2<=PLUS)) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
                }
                break;
            case LEFTPAREN:
            case INT:
                {
                alt8=2;
                }
                break;
            case LEFTBRACE:
                {
                alt8=3;
                }
                break;
            case SEMICOLON:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:95:7: forStat
                    {
                    dbg.location(95,7);
                    pushFollow(FOLLOW_forStat_in_stat581);
                    forStat12=forStat();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 95:15: -> {$forStat.st}
                    {
                        retval.st = (forStat12!=null?forStat12.st:null);
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:96:7: expr SEMICOLON
                    {
                    dbg.location(96,7);
                    pushFollow(FOLLOW_expr_in_stat593);
                    expr13=expr();

                    state._fsp--;

                    dbg.location(96,12);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stat595); 


                    // TEMPLATE REWRITE
                    // 96:22: -> statement(expr=$expr.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (expr13!=null?expr13.st:null)));
                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:97:7: block
                    {
                    dbg.location(97,7);
                    pushFollow(FOLLOW_block_in_stat612);
                    block();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 97:13: -> statementList(locals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("statementList",
                      new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                    }


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:98:7: assignStat SEMICOLON
                    {
                    dbg.location(98,7);
                    pushFollow(FOLLOW_assignStat_in_stat634);
                    assignStat14=assignStat();

                    state._fsp--;

                    dbg.location(98,18);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stat636); 


                    // TEMPLATE REWRITE
                    // 98:28: -> {$assignStat.st}
                    {
                        retval.st = (assignStat14!=null?assignStat14.st:null);
                    }


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:99:7: SEMICOLON
                    {
                    dbg.location(99,7);
                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_stat648); 


                    // TEMPLATE REWRITE
                    // 99:17: -> {new StringTemplate(\";\")}
                    {
                        retval.st = new StringTemplate(";");
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        dbg.location(100, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stat"

    public static class forStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forStat"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:102:1: forStat : FOR LEFTPAREN e1= assignStat SEMICOLON e2= expr SEMICOLON e3= assignStat RIGHTPAREN block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats);
    public final grammarTestParser.forStat_return forStat() throws RecognitionException {
        slist_stack.push(new slist_scope());

        grammarTestParser.forStat_return retval = new grammarTestParser.forStat_return();
        retval.start = input.LT(1);

        grammarTestParser.assignStat_return e1 = null;

        grammarTestParser.expr_return e2 = null;

        grammarTestParser.assignStat_return e3 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try { dbg.enterRule(getGrammarFileName(), "forStat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:108:5: ( FOR LEFTPAREN e1= assignStat SEMICOLON e2= expr SEMICOLON e3= assignStat RIGHTPAREN block -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats))
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:108:9: FOR LEFTPAREN e1= assignStat SEMICOLON e2= expr SEMICOLON e3= assignStat RIGHTPAREN block
            {
            dbg.location(108,9);
            match(input,FOR,FOLLOW_FOR_in_forStat681); 
            dbg.location(108,13);
            match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_forStat683); 
            dbg.location(108,25);
            pushFollow(FOLLOW_assignStat_in_forStat687);
            e1=assignStat();

            state._fsp--;

            dbg.location(108,37);
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forStat689); 
            dbg.location(108,49);
            pushFollow(FOLLOW_expr_in_forStat693);
            e2=expr();

            state._fsp--;

            dbg.location(108,55);
            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forStat695); 
            dbg.location(108,67);
            pushFollow(FOLLOW_assignStat_in_forStat699);
            e3=assignStat();

            state._fsp--;

            dbg.location(108,79);
            match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_forStat701); 
            dbg.location(108,90);
            pushFollow(FOLLOW_block_in_forStat703);
            block();

            state._fsp--;



            // TEMPLATE REWRITE
            // 109:9: -> forLoop(e1=$e1.ste2=$e2.ste3=$e3.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("forLoop",
              new STAttrMap().put("e1", (e1!=null?e1.st:null)).put("e2", (e2!=null?e2.st:null)).put("e3", (e3!=null?e3.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

        }
        dbg.location(111, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "forStat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "forStat"

    public static class assignStat_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "assignStat"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:113:1: assignStat : ELEM EQUAL expr -> assign(lhs=$ELEM.textrhs=$expr.st);
    public final grammarTestParser.assignStat_return assignStat() throws RecognitionException {
        grammarTestParser.assignStat_return retval = new grammarTestParser.assignStat_return();
        retval.start = input.LT(1);

        Token ELEM15=null;
        grammarTestParser.expr_return expr16 = null;


        try { dbg.enterRule(getGrammarFileName(), "assignStat");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(113, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:114:5: ( ELEM EQUAL expr -> assign(lhs=$ELEM.textrhs=$expr.st))
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:114:9: ELEM EQUAL expr
            {
            dbg.location(114,9);
            ELEM15=(Token)match(input,ELEM,FOLLOW_ELEM_in_assignStat776); 
            dbg.location(114,14);
            match(input,EQUAL,FOLLOW_EQUAL_in_assignStat778); 
            dbg.location(114,20);
            pushFollow(FOLLOW_expr_in_assignStat780);
            expr16=expr();

            state._fsp--;



            // TEMPLATE REWRITE
            // 114:25: -> assign(lhs=$ELEM.textrhs=$expr.st)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("lhs", (ELEM15!=null?ELEM15.getText():null)).put("rhs", (expr16!=null?expr16.st:null)));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(115, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assignStat");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assignStat"

    public static class expr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:117:1: expr : condExpr -> {$condExpr.st};
    public final grammarTestParser.expr_return expr() throws RecognitionException {
        grammarTestParser.expr_return retval = new grammarTestParser.expr_return();
        retval.start = input.LT(1);

        grammarTestParser.condExpr_return condExpr17 = null;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:117:5: ( condExpr -> {$condExpr.st})
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:117:9: condExpr
            {
            dbg.location(117,9);
            pushFollow(FOLLOW_condExpr_in_expr808);
            condExpr17=condExpr();

            state._fsp--;



            // TEMPLATE REWRITE
            // 117:18: -> {$condExpr.st}
            {
                retval.st = (condExpr17!=null?condExpr17.st:null);
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(118, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class condExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "condExpr"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:120:1: condExpr : a= aexpr ( ( EQUALEQUAL b= aexpr -> equals(left=$a.stright=$b.st) | LESSTHAN b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st}) ;
    public final grammarTestParser.condExpr_return condExpr() throws RecognitionException {
        grammarTestParser.condExpr_return retval = new grammarTestParser.condExpr_return();
        retval.start = input.LT(1);

        grammarTestParser.aexpr_return a = null;

        grammarTestParser.aexpr_return b = null;


        try { dbg.enterRule(getGrammarFileName(), "condExpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:121:5: (a= aexpr ( ( EQUALEQUAL b= aexpr -> equals(left=$a.stright=$b.st) | LESSTHAN b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st}) )
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:121:9: a= aexpr ( ( EQUALEQUAL b= aexpr -> equals(left=$a.stright=$b.st) | LESSTHAN b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st})
            {
            dbg.location(121,10);
            pushFollow(FOLLOW_aexpr_in_condExpr833);
            a=aexpr();

            state._fsp--;

            dbg.location(122,9);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:122:9: ( ( EQUALEQUAL b= aexpr -> equals(left=$a.stright=$b.st) | LESSTHAN b= aexpr -> lessThan(left=$a.stright=$b.st)) | -> {$a.st})
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10);

            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=EQUALEQUAL && LA10_0<=LESSTHAN)) ) {
                alt10=1;
            }
            else if ( (LA10_0==SEMICOLON||LA10_0==RIGHTPAREN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:122:13: ( EQUALEQUAL b= aexpr -> equals(left=$a.stright=$b.st) | LESSTHAN b= aexpr -> lessThan(left=$a.stright=$b.st))
                    {
                    dbg.location(122,13);
                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:122:13: ( EQUALEQUAL b= aexpr -> equals(left=$a.stright=$b.st) | LESSTHAN b= aexpr -> lessThan(left=$a.stright=$b.st))
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==EQUALEQUAL) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==LESSTHAN) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:122:16: EQUALEQUAL b= aexpr
                            {
                            dbg.location(122,16);
                            match(input,EQUALEQUAL,FOLLOW_EQUALEQUAL_in_condExpr850); 
                            dbg.location(122,28);
                            pushFollow(FOLLOW_aexpr_in_condExpr854);
                            b=aexpr();

                            state._fsp--;



                            // TEMPLATE REWRITE
                            // 122:35: -> equals(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("equals",
                              new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }


                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:123:16: LESSTHAN b= aexpr
                            {
                            dbg.location(123,16);
                            match(input,LESSTHAN,FOLLOW_LESSTHAN_in_condExpr884); 
                            dbg.location(123,26);
                            pushFollow(FOLLOW_aexpr_in_condExpr888);
                            b=aexpr();

                            state._fsp--;



                            // TEMPLATE REWRITE
                            // 123:35: -> lessThan(left=$a.stright=$b.st)
                            {
                                retval.st = templateLib.getInstanceOf("lessThan",
                              new STAttrMap().put("left", (a!=null?a.st:null)).put("right", (b!=null?b.st:null)));
                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:125:13: 
                    {

                    // TEMPLATE REWRITE
                    // 125:13: -> {$a.st}
                    {
                        retval.st = (a!=null?a.st:null);
                    }


                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(127, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "condExpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "condExpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "aexpr"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:129:1: aexpr : (a= atom -> {$a.st}) ( PLUS b= atom -> add(left=$aexpr.stright=$b.st))* ;
    public final grammarTestParser.aexpr_return aexpr() throws RecognitionException {
        grammarTestParser.aexpr_return retval = new grammarTestParser.aexpr_return();
        retval.start = input.LT(1);

        grammarTestParser.atom_return a = null;

        grammarTestParser.atom_return b = null;


        try { dbg.enterRule(getGrammarFileName(), "aexpr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(129, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:130:5: ( (a= atom -> {$a.st}) ( PLUS b= atom -> add(left=$aexpr.stright=$b.st))* )
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:130:9: (a= atom -> {$a.st}) ( PLUS b= atom -> add(left=$aexpr.stright=$b.st))*
            {
            dbg.location(130,9);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:130:9: (a= atom -> {$a.st})
            dbg.enterAlt(1);

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:130:10: a= atom
            {
            dbg.location(130,11);
            pushFollow(FOLLOW_atom_in_aexpr966);
            a=atom();

            state._fsp--;



            // TEMPLATE REWRITE
            // 130:17: -> {$a.st}
            {
                retval.st = (a!=null?a.st:null);
            }


            }

            dbg.location(131,9);
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:131:9: ( PLUS b= atom -> add(left=$aexpr.stright=$b.st))*
            try { dbg.enterSubRule(11);

            loop11:
            do {
                int alt11=2;
                try { dbg.enterDecision(11);

                int LA11_0 = input.LA(1);

                if ( (LA11_0==PLUS) ) {
                    alt11=1;
                }


                } finally {dbg.exitDecision(11);}

                switch (alt11) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:131:11: PLUS b= atom
            	    {
            	    dbg.location(131,11);
            	    match(input,PLUS,FOLLOW_PLUS_in_aexpr983); 
            	    dbg.location(131,17);
            	    pushFollow(FOLLOW_atom_in_aexpr987);
            	    b=atom();

            	    state._fsp--;



            	    // TEMPLATE REWRITE
            	    // 131:23: -> add(left=$aexpr.stright=$b.st)
            	    {
            	        retval.st = templateLib.getInstanceOf("add",
            	      new STAttrMap().put("left", retval.st).put("right", (b!=null?b.st:null)));
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);
            } finally {dbg.exitSubRule(11);}


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(132, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "aexpr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "aexpr"

    public static class atom_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:134:1: atom : ( ELEM -> refVar(id=$ELEM.text) | INT -> iconst(value=$INT.text) | LEFTPAREN expr RIGHTPAREN -> {$expr.st});
    public final grammarTestParser.atom_return atom() throws RecognitionException {
        grammarTestParser.atom_return retval = new grammarTestParser.atom_return();
        retval.start = input.LT(1);

        Token ELEM18=null;
        Token INT19=null;
        grammarTestParser.expr_return expr20 = null;


        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(134, 1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:135:5: ( ELEM -> refVar(id=$ELEM.text) | INT -> iconst(value=$INT.text) | LEFTPAREN expr RIGHTPAREN -> {$expr.st})
            int alt12=3;
            try { dbg.enterDecision(12);

            switch ( input.LA(1) ) {
            case ELEM:
                {
                alt12=1;
                }
                break;
            case INT:
                {
                alt12=2;
                }
                break;
            case LEFTPAREN:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:135:7: ELEM
                    {
                    dbg.location(135,7);
                    ELEM18=(Token)match(input,ELEM,FOLLOW_ELEM_in_atom1021); 


                    // TEMPLATE REWRITE
                    // 135:12: -> refVar(id=$ELEM.text)
                    {
                        retval.st = templateLib.getInstanceOf("refVar",
                      new STAttrMap().put("id", (ELEM18!=null?ELEM18.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:136:7: INT
                    {
                    dbg.location(136,7);
                    INT19=(Token)match(input,INT,FOLLOW_INT_in_atom1038); 


                    // TEMPLATE REWRITE
                    // 136:11: -> iconst(value=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("iconst",
                      new STAttrMap().put("value", (INT19!=null?INT19.getText():null)));
                    }


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:137:7: LEFTPAREN expr RIGHTPAREN
                    {
                    dbg.location(137,7);
                    match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_atom1055); 
                    dbg.location(137,17);
                    pushFollow(FOLLOW_expr_in_atom1057);
                    expr20=expr();

                    state._fsp--;

                    dbg.location(137,22);
                    match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_atom1059); 


                    // TEMPLATE REWRITE
                    // 137:33: -> {$expr.st}
                    {
                        retval.st = (expr20!=null?expr20.st:null);
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(138, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_program49 = new BitSet(new long[]{0x0000000000000622L});
    public static final BitSet FOLLOW_variable_in_declaration90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_variable130 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_declarator_in_variable132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_variable134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEM_in_declarator208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_function245 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ELEM_in_function247 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTPAREN_in_function259 = new BitSet(new long[]{0x0000000000000720L});
    public static final BitSet FOLLOW_formalParameter_in_function265 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_COMMA_in_function269 = new BitSet(new long[]{0x0000000000000620L});
    public static final BitSet FOLLOW_formalParameter_in_function273 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_function281 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_function291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_formalParameter407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_declarator_in_formalParameter409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_INT_in_type450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_CHAR_in_type467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEM_in_type483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACE_in_block514 = new BitSet(new long[]{0x0000000000043E70L});
    public static final BitSet FOLLOW_variable_in_block525 = new BitSet(new long[]{0x0000000000043E70L});
    public static final BitSet FOLLOW_stat_in_block541 = new BitSet(new long[]{0x0000000000043870L});
    public static final BitSet FOLLOW_RIGHTBRACE_in_block554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStat_in_stat581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_stat595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_stat612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignStat_in_stat634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_stat636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_stat648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStat681 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LEFTPAREN_in_forStat683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_assignStat_in_forStat687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_forStat689 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_expr_in_forStat693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_SEMICOLON_in_forStat695 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_assignStat_in_forStat699 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_forStat701 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_block_in_forStat703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEM_in_assignStat776 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_EQUAL_in_assignStat778 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_expr_in_assignStat780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpr_in_expr808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpr_in_condExpr833 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_EQUALEQUAL_in_condExpr850 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_aexpr_in_condExpr854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_condExpr884 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_aexpr_in_condExpr888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_aexpr966 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_PLUS_in_aexpr983 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_atom_in_aexpr987 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ELEM_in_atom1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPAREN_in_atom1055 = new BitSet(new long[]{0x0000000000040060L});
    public static final BitSet FOLLOW_expr_in_atom1057 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_atom1059 = new BitSet(new long[]{0x0000000000000002L});

}