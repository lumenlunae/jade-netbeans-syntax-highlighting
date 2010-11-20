// $ANTLR 3.2 Sep 23, 2009 12:02:23 F:\\Personal\\Programs\\JadeEditor\\grammarTest.g 2010-11-10 00:19:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class grammarTestLexer extends Lexer {
    public static final int LESSTHAN=16;
    public static final int TYPE_INT=9;
    public static final int DOC=22;
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
    public static final int PLUS=17;
    public static final int RIGHTBRACE=12;
    public static final int PIPE=20;

    // delegates
    // delegators

    public grammarTestLexer() {;} 
    public grammarTestLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammarTestLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "F:\\Personal\\Programs\\JadeEditor\\grammarTest.g"; }

    // $ANTLR start "TYPE_INT"
    public final void mTYPE_INT() throws RecognitionException {
        try {
            int _type = TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:140:10: ( 'int' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:140:12: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_INT"

    // $ANTLR start "TYPE_CHAR"
    public final void mTYPE_CHAR() throws RecognitionException {
        try {
            int _type = TYPE_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:141:11: ( 'char' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:141:13: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_CHAR"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:142:5: ( 'for' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:142:7: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "ELEM"
    public final void mELEM() throws RecognitionException {
        try {
            int _type = ELEM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:144:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:144:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:144:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "ELEM"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:147:5: ( ( '0' .. '9' )+ )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:147:7: ( '0' .. '9' )+
            {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:147:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:147:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:150:7: ( '=' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:150:9: '='
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

    // $ANTLR start "EQUALEQUAL"
    public final void mEQUALEQUAL() throws RecognitionException {
        try {
            int _type = EQUALEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:151:12: ( '==' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:151:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALEQUAL"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:152:10: ( '<' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:152:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:153:11: ( ';' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:153:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LEFTPAREN"
    public final void mLEFTPAREN() throws RecognitionException {
        try {
            int _type = LEFTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:154:11: ( '(' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:154:13: '('
            {
            match('('); 

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
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:155:12: ( ')' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:155:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTPAREN"

    // $ANTLR start "LEFTBRACE"
    public final void mLEFTBRACE() throws RecognitionException {
        try {
            int _type = LEFTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:156:11: ( '{' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:156:13: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTBRACE"

    // $ANTLR start "RIGHTBRACE"
    public final void mRIGHTBRACE() throws RecognitionException {
        try {
            int _type = RIGHTBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:157:12: ( '}' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:157:14: '}'
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

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:158:6: ( '+' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:158:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:159:7: ( ',' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:159:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:160:7: ( ':' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:160:9: ':'
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

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:161:6: ( '|' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:161:8: '|'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:162:4: ( '#' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:162:6: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DOC"
    public final void mDOC() throws RecognitionException {
        try {
            int _type = DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:163:5: ( '!!!' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:163:7: '!!!'
            {
            match("!!!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOC"

    // $ANTLR start "CODE"
    public final void mCODE() throws RecognitionException {
        try {
            int _type = CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:164:6: ( '-' )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:164:8: '-'
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:168:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:168:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:168:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:8: ( TYPE_INT | TYPE_CHAR | FOR | ELEM | INT | EQUAL | EQUALEQUAL | LESSTHAN | SEMICOLON | LEFTPAREN | RIGHTPAREN | LEFTBRACE | RIGHTBRACE | PLUS | COMMA | COLON | PIPE | ID | DOC | CODE | WS )
        int alt4=21;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:10: TYPE_INT
                {
                mTYPE_INT(); 

                }
                break;
            case 2 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:19: TYPE_CHAR
                {
                mTYPE_CHAR(); 

                }
                break;
            case 3 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:29: FOR
                {
                mFOR(); 

                }
                break;
            case 4 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:33: ELEM
                {
                mELEM(); 

                }
                break;
            case 5 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:38: INT
                {
                mINT(); 

                }
                break;
            case 6 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:42: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 7 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:48: EQUALEQUAL
                {
                mEQUALEQUAL(); 

                }
                break;
            case 8 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:59: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 9 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:68: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 10 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:78: LEFTPAREN
                {
                mLEFTPAREN(); 

                }
                break;
            case 11 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:88: RIGHTPAREN
                {
                mRIGHTPAREN(); 

                }
                break;
            case 12 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:99: LEFTBRACE
                {
                mLEFTBRACE(); 

                }
                break;
            case 13 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:109: RIGHTBRACE
                {
                mRIGHTBRACE(); 

                }
                break;
            case 14 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:120: PLUS
                {
                mPLUS(); 

                }
                break;
            case 15 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:125: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 16 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:131: COLON
                {
                mCOLON(); 

                }
                break;
            case 17 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:137: PIPE
                {
                mPIPE(); 

                }
                break;
            case 18 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:142: ID
                {
                mID(); 

                }
                break;
            case 19 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:145: DOC
                {
                mDOC(); 

                }
                break;
            case 20 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:149: CODE
                {
                mCODE(); 

                }
                break;
            case 21 :
                // F:\\Personal\\Programs\\JadeEditor\\grammarTest.g:1:154: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\uffff\3\4\2\uffff\1\31\16\uffff\3\4\2\uffff\1\35\1\4\1\37\1"+
        "\uffff\1\40\2\uffff";
    static final String DFA4_eofS =
        "\41\uffff";
    static final String DFA4_minS =
        "\1\11\1\156\1\150\1\157\2\uffff\1\75\16\uffff\1\164\1\141\1\162"+
        "\2\uffff\1\60\1\162\1\60\1\uffff\1\60\2\uffff";
    static final String DFA4_maxS =
        "\1\175\1\156\1\150\1\157\2\uffff\1\75\16\uffff\1\164\1\141\1\162"+
        "\2\uffff\1\172\1\162\1\172\1\uffff\1\172\2\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
        "\1\20\1\21\1\22\1\23\1\24\1\25\3\uffff\1\7\1\6\3\uffff\1\1\1\uffff"+
        "\1\3\1\2";
    static final String DFA4_specialS =
        "\41\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\1\22\1\uffff\1\21\4\uffff"+
            "\1\11\1\12\1\uffff\1\15\1\16\1\23\2\uffff\12\5\1\17\1\10\1\7"+
            "\1\6\3\uffff\32\4\6\uffff\2\4\1\2\2\4\1\3\2\4\1\1\21\4\1\13"+
            "\1\20\1\14",
            "\1\25",
            "\1\26",
            "\1\27",
            "",
            "",
            "\1\30",
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
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\12\4\7\uffff\32\4\4\uffff\1\4\1\uffff\32\4",
            "\1\36",
            "\12\4\7\uffff\32\4\4\uffff\1\4\1\uffff\32\4",
            "",
            "\12\4\7\uffff\32\4\4\uffff\1\4\1\uffff\32\4",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( TYPE_INT | TYPE_CHAR | FOR | ELEM | INT | EQUAL | EQUALEQUAL | LESSTHAN | SEMICOLON | LEFTPAREN | RIGHTPAREN | LEFTBRACE | RIGHTBRACE | PLUS | COMMA | COLON | PIPE | ID | DOC | CODE | WS );";
        }
    }
 

}