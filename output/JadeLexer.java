// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\Personal\\Programs\\JadeEditor\\Jade.g 2010-11-11 21:29:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JadeLexer extends Lexer {
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
    public static final int PIPE=23;
    public static final int RIGHTBRACE=25;
    public static final int DOCTYPE=8;
    public static final int LEFTVAR=29;
    public static final int COMMENT=10;
    public static final int RIGHTBRACK=27;
    public static final int LEFTBRACK=26;
    public static final int RAND1=28;
    public static final int STRING=19;

    // delegates
    // delegators

    public JadeLexer() {;} 
    public JadeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JadeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "F:\\Personal\\Programs\\JadeEditor\\Jade.g"; }

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:77:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:77:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:77:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* ( ' ' )* ( ':' | '=' ) ( ' ' )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* ( ' ' )* ( ':' | '=' ) ( ' ' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:63: ( ' ' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:64: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( input.LA(1)==':'||input.LA(1)=='=' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:78: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:78:79: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:79:5: ( ( '0' .. '9' )+ )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:79:7: ( '0' .. '9' )+
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:79:7: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:79:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOCTYPE"
    public final void mDOCTYPE() throws RecognitionException {
        try {
            int _type = DOCTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:80:9: ( ( '!!!' ) ( ' ' '0' .. '9' )? )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:80:11: ( '!!!' ) ( ' ' '0' .. '9' )?
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:80:11: ( '!!!' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:80:12: '!!!'
            {
            match("!!!"); 


            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:80:18: ( ' ' '0' .. '9' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==' ') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:80:19: ' ' '0' .. '9'
                    {
                    match(' '); 
                    matchRange('0','9'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOCTYPE"

    // $ANTLR start "LEFTPAREN"
    public final void mLEFTPAREN() throws RecognitionException {
        try {
            int _type = LEFTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:81:12: ( '(' ( ' ' )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:81:14: '(' ( ' ' )*
            {
            match('('); 
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:81:18: ( ' ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:81:18: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTPAREN"

    // $ANTLR start "RIGHTPAREN"
    public final void mRIGHTPAREN() throws RecognitionException {
        try {
            int _type = RIGHTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:82:12: ( ( ' ' )* ')' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:82:14: ( ' ' )* ')'
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:82:14: ( ' ' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:82:14: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTPAREN"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:83:4: ( ( '#' ) ( NAME ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:83:6: ( '#' ) ( NAME )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:83:6: ( '#' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:83:7: '#'
            {
            match('#'); 

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:83:11: ( NAME )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:83:12: NAME
            {
            mNAME(); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:84:7: ( '.' ( NAME ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:84:9: '.' ( NAME )
            {
            match('.'); 
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:84:12: ( NAME )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:84:13: NAME
            {
            mNAME(); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:85:7: ( '=' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:85:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:86:7: ( ':' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:86:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "CODE"
    public final void mCODE() throws RecognitionException {
        try {
            int _type = CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:87:6: ( '-' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:87:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CODE"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:88:6: ( '|' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:88:8: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:89:4: ( '@' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:89:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:90:7: ( ( ' ' )* ',' ( ' ' )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:90:9: ( ' ' )* ',' ( ' ' )*
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:90:9: ( ' ' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:90:9: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(','); 
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:90:18: ( ' ' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:90:18: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "RIGHTBRACE"
    public final void mRIGHTBRACE() throws RecognitionException {
        try {
            int _type = RIGHTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:91:13: ( '}' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:91:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTBRACE"

    // $ANTLR start "LEFTBRACK"
    public final void mLEFTBRACK() throws RecognitionException {
        try {
            int _type = LEFTBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:92:12: ( '[' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:92:14: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTBRACK"

    // $ANTLR start "RIGHTBRACK"
    public final void mRIGHTBRACK() throws RecognitionException {
        try {
            int _type = RIGHTBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:93:12: ( ']' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:93:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTBRACK"

    // $ANTLR start "RAND1"
    public final void mRAND1() throws RecognitionException {
        try {
            int _type = RAND1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:94:8: ( '#' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:94:11: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAND1"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:95:8: ( ( ' ' | '\\t' )+ )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:95:10: ( ' ' | '\\t' )+
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:95:10: ( ' ' | '\\t' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==' ') ) {
                    alt11=1;
                }
                else if ( (LA11_0=='\t') ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:95:11: ' '
            	    {
            	    match("  "); 


            	    }
            	    break;
            	case 2 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:95:18: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "LEFTVAR"
    public final void mLEFTVAR() throws RecognitionException {
        try {
            int _type = LEFTVAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:96:9: ( '#' '{' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:96:11: '#' '{'
            {
            match('#'); 
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTVAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:98:5: ( ( '\"' (~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:98:9: ( '\"' (~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:98:9: ( '\"' (~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' (~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:98:13: '\"' (~ ( '\\\\' | '\\n' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:98:17: (~ ( '\\\\' | '\\n' | '\"' ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:98:18: ~ ( '\\\\' | '\\n' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:99:12: '\\'' (~ ( '\\\\' | '\\n' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:99:17: (~ ( '\\\\' | '\\n' | '\\'' ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:99:18: ~ ( '\\\\' | '\\n' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:103:2: ( ' ' LEFTVAR ( NAME ) ( RIGHTBRACE ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:103:4: ' ' LEFTVAR ( NAME ) ( RIGHTBRACE )
            {
            match(' '); 
            mLEFTVAR(); 
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:103:14: ( NAME )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:103:15: NAME
            {
            mNAME(); 

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:103:20: ( RIGHTBRACE )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:103:21: RIGHTBRACE
            {
            mRIGHTBRACE(); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:6: ( ( ' ' ) ( (~ ( '\\r\\n' | '\\r' | '\\n' | ' ' ) )* ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:8: ( ' ' ) ( (~ ( '\\r\\n' | '\\r' | '\\n' | ' ' ) )* )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:8: ( ' ' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:9: ' '
            {
            match(' '); 

            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:14: ( (~ ( '\\r\\n' | '\\r' | '\\n' | ' ' ) )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:15: (~ ( '\\r\\n' | '\\r' | '\\n' | ' ' ) )*
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:15: (~ ( '\\r\\n' | '\\r' | '\\n' | ' ' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='!' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:106:15: ~ ( '\\r\\n' | '\\r' | '\\n' | ' ' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:9: ( ( '// ' ) ( (~ ( '\\r\\n' | '\\r' | '\\n' ) )* ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:11: ( '// ' ) ( (~ ( '\\r\\n' | '\\r' | '\\n' ) )* )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:11: ( '// ' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:12: '// '
            {
            match("// "); 


            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:18: ( (~ ( '\\r\\n' | '\\r' | '\\n' ) )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:19: (~ ( '\\r\\n' | '\\r' | '\\n' ) )*
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:19: (~ ( '\\r\\n' | '\\r' | '\\n' ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:108:19: ~ ( '\\r\\n' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "SERVERCOMMENT"
    public final void mSERVERCOMMENT() throws RecognitionException {
        try {
            int _type = SERVERCOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:2: ( ( '//- ' ) ( (~ ( '\\r\\n' | '\\r' | '\\n' ) )* ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:4: ( '//- ' ) ( (~ ( '\\r\\n' | '\\r' | '\\n' ) )* )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:4: ( '//- ' )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:5: '//- '
            {
            match("//- "); 


            }

            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:13: ( (~ ( '\\r\\n' | '\\r' | '\\n' ) )* )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:14: (~ ( '\\r\\n' | '\\r' | '\\n' ) )*
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:14: (~ ( '\\r\\n' | '\\r' | '\\n' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:111:14: ~ ( '\\r\\n' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SERVERCOMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:114:6: ( ( '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:114:8: ( '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:114:8: ( '\\f' | ( '\\r\\n' | '\\r' | '\\n' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\f') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:114:10: '\\f'
                    {
                    match('\f'); 

                    }
                    break;
                case 2 :
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:115:4: ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    // F:\\Personal\\Programs\\JadeEditor\\Jade.g:115:4: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1=='\n') ) {
                            alt18=1;
                        }
                        else {
                            alt18=2;}
                    }
                    else if ( (LA18_0=='\n') ) {
                        alt18=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:115:5: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:116:6: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // F:\\Personal\\Programs\\JadeEditor\\Jade.g:117:6: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:8: ( NAME | KEY | INT | DOCTYPE | LEFTPAREN | RIGHTPAREN | ID | CLASS | EQUAL | COLON | CODE | PIPE | AT | COMMA | RIGHTBRACE | LEFTBRACK | RIGHTBRACK | RAND1 | INDENT | LEFTVAR | STRING | VARIABLE | TEXT | COMMENT | SERVERCOMMENT | WS )
        int alt20=26;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:10: NAME
                {
                mNAME(); 

                }
                break;
            case 2 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:15: KEY
                {
                mKEY(); 

                }
                break;
            case 3 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:19: INT
                {
                mINT(); 

                }
                break;
            case 4 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:23: DOCTYPE
                {
                mDOCTYPE(); 

                }
                break;
            case 5 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:31: LEFTPAREN
                {
                mLEFTPAREN(); 

                }
                break;
            case 6 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:41: RIGHTPAREN
                {
                mRIGHTPAREN(); 

                }
                break;
            case 7 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:52: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:55: CLASS
                {
                mCLASS(); 

                }
                break;
            case 9 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:61: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 10 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:67: COLON
                {
                mCOLON(); 

                }
                break;
            case 11 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:73: CODE
                {
                mCODE(); 

                }
                break;
            case 12 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:78: PIPE
                {
                mPIPE(); 

                }
                break;
            case 13 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:83: AT
                {
                mAT(); 

                }
                break;
            case 14 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:86: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 15 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:92: RIGHTBRACE
                {
                mRIGHTBRACE(); 

                }
                break;
            case 16 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:103: LEFTBRACK
                {
                mLEFTBRACK(); 

                }
                break;
            case 17 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:113: RIGHTBRACK
                {
                mRIGHTBRACK(); 

                }
                break;
            case 18 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:124: RAND1
                {
                mRAND1(); 

                }
                break;
            case 19 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:130: INDENT
                {
                mINDENT(); 

                }
                break;
            case 20 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:137: LEFTVAR
                {
                mLEFTVAR(); 

                }
                break;
            case 21 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:145: STRING
                {
                mSTRING(); 

                }
                break;
            case 22 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:152: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 23 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:161: TEXT
                {
                mTEXT(); 

                }
                break;
            case 24 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:166: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 25 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:174: SERVERCOMMENT
                {
                mSERVERCOMMENT(); 

                }
                break;
            case 26 :
                // F:\\Personal\\Programs\\JadeEditor\\Jade.g:1:188: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\1\27\3\uffff\1\34\1\uffff\1\40\16\uffff\1\27\2\uffff\1"+
        "\22\1\6\1\34\1\uffff\1\16\5\uffff\1\34\2\uffff\2\34\1\51\1\uffff";
    static final String DFA20_eofS =
        "\52\uffff";
    static final String DFA20_minS =
        "\1\11\1\40\3\uffff\1\40\1\uffff\1\101\14\uffff\1\57\1\uffff\1\40"+
        "\2\uffff\1\40\1\0\1\173\1\uffff\1\0\3\uffff\2\40\1\101\2\uffff\2"+
        "\55\1\0\1\uffff";
    static final String DFA20_maxS =
        "\1\175\1\172\3\uffff\1\54\1\uffff\1\173\14\uffff\1\57\1\uffff\1"+
        "\172\2\uffff\1\54\1\uffff\1\173\1\uffff\1\uffff\3\uffff\1\55\1\54"+
        "\1\172\2\uffff\2\175\1\uffff\1\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\23\1\25\1\uffff\1\32\1\uffff\1\1"+
        "\1\2\3\uffff\1\27\1\uffff\1\24\1\7\1\22\3\uffff\1\30\1\31\3\uffff"+
        "\1\26";
    static final String DFA20_specialS =
        "\32\uffff\1\1\2\uffff\1\2\12\uffff\1\0\1\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\22\1\25\1\uffff\2\25\22\uffff\1\5\1\3\1\23\1\7\3\uffff\1"+
            "\23\1\4\1\6\2\uffff\1\16\1\13\1\10\1\24\12\2\1\12\2\uffff\1"+
            "\11\2\uffff\1\15\32\1\1\20\1\uffff\1\21\3\uffff\32\1\1\uffff"+
            "\1\14\1\17",
            "\1\30\14\uffff\1\26\2\uffff\12\26\1\30\2\uffff\1\30\3\uffff"+
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "\1\31\2\uffff\1\33\5\uffff\1\32\2\uffff\1\35",
            "",
            "\32\37\6\uffff\32\37\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41",
            "",
            "\1\30\14\uffff\1\26\2\uffff\12\26\1\30\2\uffff\1\30\3\uffff"+
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\42\10\uffff\1\6\2\uffff\1\16",
            "\12\34\1\uffff\2\34\1\uffff\22\34\1\uffff\uffdf\34",
            "\1\43",
            "",
            "\12\34\1\uffff\2\34\1\uffff\22\34\1\uffff\uffdf\34",
            "",
            "",
            "",
            "\1\44\14\uffff\1\45",
            "\1\31\10\uffff\1\6\2\uffff\1\16",
            "\32\46\6\uffff\32\46",
            "",
            "",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\2\uffff\1\50",
            "\1\47\2\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47\2\uffff\1\50",
            "\12\34\1\uffff\2\34\1\uffff\22\34\1\uffff\uffdf\34",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( NAME | KEY | INT | DOCTYPE | LEFTPAREN | RIGHTPAREN | ID | CLASS | EQUAL | COLON | CODE | PIPE | AT | COMMA | RIGHTBRACE | LEFTBRACK | RIGHTBRACK | RAND1 | INDENT | LEFTVAR | STRING | VARIABLE | TEXT | COMMENT | SERVERCOMMENT | WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_40 = input.LA(1);

                        s = -1;
                        if ( ((LA20_40>='\u0000' && LA20_40<='\t')||(LA20_40>='\u000B' && LA20_40<='\f')||(LA20_40>='\u000E' && LA20_40<='\u001F')||(LA20_40>='!' && LA20_40<='\uFFFF')) ) {s = 28;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_26 = input.LA(1);

                        s = -1;
                        if ( ((LA20_26>='\u0000' && LA20_26<='\t')||(LA20_26>='\u000B' && LA20_26<='\f')||(LA20_26>='\u000E' && LA20_26<='\u001F')||(LA20_26>='!' && LA20_26<='\uFFFF')) ) {s = 28;}

                        else s = 6;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_29 = input.LA(1);

                        s = -1;
                        if ( ((LA20_29>='\u0000' && LA20_29<='\t')||(LA20_29>='\u000B' && LA20_29<='\f')||(LA20_29>='\u000E' && LA20_29<='\u001F')||(LA20_29>='!' && LA20_29<='\uFFFF')) ) {s = 28;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}