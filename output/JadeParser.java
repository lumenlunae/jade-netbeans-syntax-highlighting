// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\Personal\\Programs\\JadeEditor\\Jade.g 2010-11-11 21:29:05

import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class JadeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "LEFTPAREN", "COMMA", "RIGHTPAREN", "DOCTYPE", "EQUAL", "COMMENT", "SERVERCOMMENT", "TEXT", "VARIABLE", "WS", "NAME", "CLASS", "ID", "KEY", "STRING", "INT", "COLON", "CODE", "PIPE", "AT", "RIGHTBRACE", "LEFTBRACK", "RIGHTBRACK", "RAND1", "LEFTVAR"
    };
    public static final int CLASS=16;
    public static final int KEY=18;
    public static final int INT=20;
    public static final int SERVERCOMMENT=11;
    public static final int TEXT=12;
    public static final int ID=17;
    public static final int EOF=-1;
    public static final int INDENT=4;
    public static final int CODE=22;
    public static final int AT=24;
    public static final int COLON=21;
    public static final int LEFTPAREN=5;
    public static final int NAME=15;
    public static final int WS=14;
    public static final int VARIABLE=13;
    public static final int RIGHTPAREN=7;
    public static final int COMMA=6;
    public static final int EQUAL=9;
    public static final int RIGHTBRACE=25;
    public static final int PIPE=23;
    public static final int DOCTYPE=8;
    public static final int LEFTVAR=29;
    public static final int COMMENT=10;
    public static final int RIGHTBRACK=27;
    public static final int LEFTBRACK=26;
    public static final int RAND1=28;
    public static final int STRING=19;

    // delegates
    // delegators

    protected static class slist_scope {
        List locals;
        // must be defined one per semicolon
            List stats;
    }
    protected Stack slist_stack = new Stack();


        public JadeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JadeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("JadeParserTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return JadeParser.tokenNames; }
    public String getGrammarFileName() { return "F:\\Personal\\Programs\\JadeEditor\\Jade.g"; }


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
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:17:1: program : ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions);
    public final JadeParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        JadeParser.program_return retval = new JadeParser.program_return();
        retval.start = input.LT(1);


          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:26:5: ( ( declaration )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:26:9: ( declaration )+
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:26:9: ( declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==INDENT||LA1_0==DOCTYPE||(LA1_0>=COMMENT && LA1_0<=SERVERCOMMENT)||(LA1_0>=NAME && LA1_0<=ID)||LA1_0==PIPE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:26:9: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_program45);
            	    declaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // TEMPLATE REWRITE
            // 27:9: -> program(globals=$program::globalsfunctions=$program::functions)
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
        return retval;
    }
    // $ANTLR end "program"

    public static class declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:30:1: declaration : ( INDENT )* ( doctype | article | pipetext | comment ) ( ws )+ ;
    public final JadeParser.declaration_return declaration() throws RecognitionException {
        JadeParser.declaration_return retval = new JadeParser.declaration_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:2: ( ( INDENT )* ( doctype | article | pipetext | comment ) ( ws )+ )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:4: ( INDENT )* ( doctype | article | pipetext | comment ) ( ws )+
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:4: ( INDENT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==INDENT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:5: INDENT
            	    {
            	    match(input,INDENT,FOLLOW_INDENT_in_declaration82); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:13: ( doctype | article | pipetext | comment )
            int alt3=4;
            switch ( input.LA(1) ) {
            case DOCTYPE:
                {
                alt3=1;
                }
                break;
            case NAME:
            case CLASS:
            case ID:
                {
                alt3=2;
                }
                break;
            case PIPE:
                {
                alt3=3;
                }
                break;
            case COMMENT:
            case SERVERCOMMENT:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:14: doctype
                    {
                    pushFollow(FOLLOW_doctype_in_declaration86);
                    doctype();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:22: article
                    {
                    pushFollow(FOLLOW_article_in_declaration88);
                    article();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:30: pipetext
                    {
                    pushFollow(FOLLOW_pipetext_in_declaration90);
                    pipetext();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:39: comment
                    {
                    pushFollow(FOLLOW_comment_in_declaration92);
                    comment();

                    state._fsp--;


                    }
                    break;

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:47: ( ws )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==WS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:31:48: ws
            	    {
            	    pushFollow(FOLLOW_ws_in_declaration95);
            	    ws();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            ((program_scope)program_stack.peek()).globals.add($variable.st);

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class attributes_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attributes"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:33:1: attributes : LEFTPAREN ( formalParameter ( COMMA formalParameter )* )? RIGHTPAREN ;
    public final JadeParser.attributes_return attributes() throws RecognitionException {
        JadeParser.attributes_return retval = new JadeParser.attributes_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:34:2: ( LEFTPAREN ( formalParameter ( COMMA formalParameter )* )? RIGHTPAREN )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:34:4: LEFTPAREN ( formalParameter ( COMMA formalParameter )* )? RIGHTPAREN
            {
            match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_attributes109); 
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:34:14: ( formalParameter ( COMMA formalParameter )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEY) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:34:16: formalParameter ( COMMA formalParameter )*
                    {
                    pushFollow(FOLLOW_formalParameter_in_attributes113);
                    formalParameter();

                    state._fsp--;

                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:34:32: ( COMMA formalParameter )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:34:33: COMMA formalParameter
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_attributes116); 
                    	    pushFollow(FOLLOW_formalParameter_in_attributes118);
                    	    formalParameter();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_attributes125); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attributes"

    public static class doctype_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "doctype"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:36:1: doctype : DOCTYPE ;
    public final JadeParser.doctype_return doctype() throws RecognitionException {
        JadeParser.doctype_return retval = new JadeParser.doctype_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:37:2: ( DOCTYPE )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:37:4: DOCTYPE
            {
            match(input,DOCTYPE,FOLLOW_DOCTYPE_in_doctype135); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doctype"

    public static class article_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "article"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:38:1: article : ( tag | id | class ) ( attributes )? ( EQUAL )? ( data )* ;
    public final JadeParser.article_return article() throws RecognitionException {
        JadeParser.article_return retval = new JadeParser.article_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:2: ( ( tag | id | class ) ( attributes )? ( EQUAL )? ( data )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:4: ( tag | id | class ) ( attributes )? ( EQUAL )? ( data )*
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:4: ( tag | id | class )
            int alt7=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                alt7=2;
                }
                break;
            case CLASS:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:5: tag
                    {
                    pushFollow(FOLLOW_tag_in_article144);
                    tag();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:9: id
                    {
                    pushFollow(FOLLOW_id_in_article146);
                    id();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:12: class
                    {
                    pushFollow(FOLLOW_class_in_article148);
                    class();

                    state._fsp--;


                    }
                    break;

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:19: ( attributes )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==LEFTPAREN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:20: attributes
                    {
                    pushFollow(FOLLOW_attributes_in_article152);
                    attributes();

                    state._fsp--;


                    }
                    break;

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:33: ( EQUAL )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EQUAL) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:34: EQUAL
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_article157); 

                    }
                    break;

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:42: ( data )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=TEXT && LA10_0<=VARIABLE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:39:43: data
            	    {
            	    pushFollow(FOLLOW_data_in_article162);
            	    data();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "article"

    public static class comment_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "comment"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:41:1: comment : ( COMMENT | SERVERCOMMENT );
    public final JadeParser.comment_return comment() throws RecognitionException {
        JadeParser.comment_return retval = new JadeParser.comment_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:42:2: ( COMMENT | SERVERCOMMENT )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:
            {
            if ( (input.LA(1)>=COMMENT && input.LA(1)<=SERVERCOMMENT) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
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
        return retval;
    }
    // $ANTLR end "comment"

    public static class data_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:44:1: data : ( text | var );
    public final JadeParser.data_return data() throws RecognitionException {
        JadeParser.data_return retval = new JadeParser.data_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:45:2: ( text | var )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TEXT) ) {
                alt11=1;
            }
            else if ( (LA11_0==VARIABLE) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:45:4: text
                    {
                    pushFollow(FOLLOW_text_in_data186);
                    text();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:45:9: var
                    {
                    pushFollow(FOLLOW_var_in_data188);
                    var();

                    state._fsp--;


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
        return retval;
    }
    // $ANTLR end "data"

    public static class text_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "text"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:47:1: text : TEXT ;
    public final JadeParser.text_return text() throws RecognitionException {
        JadeParser.text_return retval = new JadeParser.text_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:48:2: ( TEXT )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:48:4: TEXT
            {
            match(input,TEXT,FOLLOW_TEXT_in_text198); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "text"

    public static class var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:50:1: var : VARIABLE ;
    public final JadeParser.var_return var() throws RecognitionException {
        JadeParser.var_return retval = new JadeParser.var_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:51:2: ( VARIABLE )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:51:4: VARIABLE
            {
            match(input,VARIABLE,FOLLOW_VARIABLE_in_var209); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class ws_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ws"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:53:1: ws : WS ;
    public final JadeParser.ws_return ws() throws RecognitionException {
        JadeParser.ws_return retval = new JadeParser.ws_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:54:2: ( WS )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:54:4: WS
            {
            match(input,WS,FOLLOW_WS_in_ws219); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ws"

    public static class tag_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "tag"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:56:1: tag : ( elem ) ( id )? ( ( class )* ) ;
    public final JadeParser.tag_return tag() throws RecognitionException {
        JadeParser.tag_return retval = new JadeParser.tag_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:2: ( ( elem ) ( id )? ( ( class )* ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:4: ( elem ) ( id )? ( ( class )* )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:4: ( elem )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:5: elem
            {
            pushFollow(FOLLOW_elem_in_tag231);
            elem();

            state._fsp--;


            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:10: ( id )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:11: id
                    {
                    pushFollow(FOLLOW_id_in_tag234);
                    id();

                    state._fsp--;


                    }
                    break;

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:15: ( ( class )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:16: ( class )*
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:16: ( class )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==CLASS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:57:16: class
            	    {
            	    pushFollow(FOLLOW_class_in_tag238);
            	    class();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
        return retval;
    }
    // $ANTLR end "tag"

    public static class elem_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elem"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:59:1: elem : NAME ;
    public final JadeParser.elem_return elem() throws RecognitionException {
        JadeParser.elem_return retval = new JadeParser.elem_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:60:2: ( NAME )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:60:4: NAME
            {
            match(input,NAME,FOLLOW_NAME_in_elem250); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elem"

    public static class class_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "class"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:61:1: class : ( CLASS ) ;
    public final JadeParser.class_return class() throws RecognitionException {
        JadeParser.class_return retval = new JadeParser.class_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:62:2: ( ( CLASS ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:62:4: ( CLASS )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:62:4: ( CLASS )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:62:5: CLASS
            {
            match(input,CLASS,FOLLOW_CLASS_in_class259); 

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
        return retval;
    }
    // $ANTLR end "class"

    public static class id_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:63:1: id : ( ID ) ;
    public final JadeParser.id_return id() throws RecognitionException {
        JadeParser.id_return retval = new JadeParser.id_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:64:2: ( ( ID ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:64:4: ( ID )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:64:4: ( ID )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:64:5: ID
            {
            match(input,ID,FOLLOW_ID_in_id269); 

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
        return retval;
    }
    // $ANTLR end "id"

    public static class pipetext_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "pipetext"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:65:1: pipetext : '|' ( data )* ;
    public final JadeParser.pipetext_return pipetext() throws RecognitionException {
        JadeParser.pipetext_return retval = new JadeParser.pipetext_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:66:2: ( '|' ( data )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:67:3: '|' ( data )*
            {
            match(input,PIPE,FOLLOW_PIPE_in_pipetext280); 
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:67:7: ( data )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=TEXT && LA14_0<=VARIABLE)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:67:8: data
            	    {
            	    pushFollow(FOLLOW_data_in_pipetext283);
            	    data();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pipetext"

    public static class formalParameter_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameter"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:69:1: formalParameter : key value ;
    public final JadeParser.formalParameter_return formalParameter() throws RecognitionException {
        JadeParser.formalParameter_return retval = new JadeParser.formalParameter_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:70:2: ( key value )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:70:4: key value
            {
            pushFollow(FOLLOW_key_in_formalParameter295);
            key();

            state._fsp--;

            pushFollow(FOLLOW_value_in_formalParameter297);
            value();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formalParameter"

    public static class key_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "key"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:71:1: key : KEY ;
    public final JadeParser.key_return key() throws RecognitionException {
        JadeParser.key_return retval = new JadeParser.key_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:72:2: ( KEY )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:72:4: KEY
            {
            match(input,KEY,FOLLOW_KEY_in_key305); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "key"

    public static class value_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "value"
    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:73:1: value : ( STRING ) ;
    public final JadeParser.value_return value() throws RecognitionException {
        JadeParser.value_return retval = new JadeParser.value_return();
        retval.start = input.LT(1);

        try {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:74:2: ( ( STRING ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:74:4: ( STRING )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:74:4: ( STRING )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:74:5: STRING
            {
            match(input,STRING,FOLLOW_STRING_in_value314); 

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
        return retval;
    }
    // $ANTLR end "value"

    // Delegated rules


 

    public static final BitSet FOLLOW_declaration_in_program45 = new BitSet(new long[]{0x0000000000838D12L});
    public static final BitSet FOLLOW_INDENT_in_declaration82 = new BitSet(new long[]{0x000000000083CD10L});
    public static final BitSet FOLLOW_doctype_in_declaration86 = new BitSet(new long[]{0x000000000083CD10L});
    public static final BitSet FOLLOW_article_in_declaration88 = new BitSet(new long[]{0x000000000083CD10L});
    public static final BitSet FOLLOW_pipetext_in_declaration90 = new BitSet(new long[]{0x000000000083CD10L});
    public static final BitSet FOLLOW_comment_in_declaration92 = new BitSet(new long[]{0x000000000083CD10L});
    public static final BitSet FOLLOW_ws_in_declaration95 = new BitSet(new long[]{0x000000000083CD12L});
    public static final BitSet FOLLOW_LEFTPAREN_in_attributes109 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_formalParameter_in_attributes113 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_COMMA_in_attributes116 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_formalParameter_in_attributes118 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_attributes125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCTYPE_in_doctype135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tag_in_article144 = new BitSet(new long[]{0x0000000000003222L});
    public static final BitSet FOLLOW_id_in_article146 = new BitSet(new long[]{0x0000000000003222L});
    public static final BitSet FOLLOW_class_in_article148 = new BitSet(new long[]{0x0000000000003222L});
    public static final BitSet FOLLOW_attributes_in_article152 = new BitSet(new long[]{0x0000000000003202L});
    public static final BitSet FOLLOW_EQUAL_in_article157 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_data_in_article162 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_set_in_comment0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_text_in_data186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_data188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_text198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_var209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_ws219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elem_in_tag231 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_id_in_tag234 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_class_in_tag238 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_NAME_in_elem250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_in_class259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PIPE_in_pipetext280 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_data_in_pipetext283 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_key_in_formalParameter295 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_value_in_formalParameter297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_in_key305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value314 = new BitSet(new long[]{0x0000000000000002L});

}