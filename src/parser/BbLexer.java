// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 01:59:36

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BbLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int COMMENT=8;
    public static final int DIV=9;
    public static final int ELSE=10;
    public static final int EQ=11;
    public static final int ESC_SEQ=12;
    public static final int FALSE=13;
    public static final int FUNC=14;
    public static final int FUNCALL=15;
    public static final int GE=16;
    public static final int GT=17;
    public static final int ID=18;
    public static final int IF=19;
    public static final int INT=20;
    public static final int LB=21;
    public static final int LE=22;
    public static final int LIST_FUNCTIONS=23;
    public static final int LIST_INSTR=24;
    public static final int LP=25;
    public static final int LT=26;
    public static final int MINUS=27;
    public static final int MOD=28;
    public static final int MUL=29;
    public static final int NEQ=30;
    public static final int NEWLINE=31;
    public static final int NOT=32;
    public static final int NOTA=33;
    public static final int OR=34;
    public static final int PARAMS=35;
    public static final int PLUS=36;
    public static final int PREF=37;
    public static final int PVALUE=38;
    public static final int RB=39;
    public static final int RETURN=40;
    public static final int RP=41;
    public static final int THEN=42;
    public static final int TRUE=43;
    public static final int VOICE=44;
    public static final int WHILE=45;
    public static final int WS=46;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public BbLexer() {} 
    public BbLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public BbLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g"; }

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:6:7: ( '&' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:6:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:7:7: ( ',' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:7:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:8:7: ( '.' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:8:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:9:7: ( ';' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:10:7: ( 'Chord' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:10:9: 'Chord'
            {
            match("Chord"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:11:7: ( 'Ensemble' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:11:9: 'Ensemble'
            {
            match("Ensemble"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:12:7: ( 'Melody' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:12:9: 'Melody'
            {
            match("Melody"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:13:7: ( 'Note' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:13:9: 'Note'
            {
            match("Note"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:14:7: ( 'Poli' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:14:9: 'Poli'
            {
            match("Poli"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:15:7: ( 'Speed' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:15:9: 'Speed'
            {
            match("Speed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:16:7: ( 'int' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:16:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:17:7: ( 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:17:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:18:7: ( '|' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:18:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:157:4: ( '&&' | 'and' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='&') ) {
                alt1=1;
            }
            else if ( (LA1_0=='a') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:157:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:157:16: 'and'
                    {
                    match("and"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:3: ( '||' | 'or' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='|') ) {
                alt2=1;
            }
            else if ( (LA2_0=='o') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:9: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:16: 'or'
                    {
                    match("or"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:4: ( '!' | 'not' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!') ) {
                alt3=1;
            }
            else if ( (LA3_0=='n') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:9: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:15: 'not'
                    {
                    match("not"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "VOICE"
    public final void mVOICE() throws RecognitionException {
        try {
            int _type = VOICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:6: ( 'Voice' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:8: 'Voice'
            {
            match("Voice"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOICE"

    // $ANTLR start "FUNC"
    public final void mFUNC() throws RecognitionException {
        try {
            int _type = FUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:5: ( 'function' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:7: 'function'
            {
            match("function"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FUNC"

    // $ANTLR start "LB"
    public final void mLB() throws RecognitionException {
        try {
            int _type = LB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:5: ( '{' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:7: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LB"

    // $ANTLR start "RB"
    public final void mRB() throws RecognitionException {
        try {
            int _type = RB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:5: ( '}' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:7: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RB"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:5: ( '(' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:7: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:5: ( ')' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:7: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:6: ( '=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:4: ( '!=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:6: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:9: ( '<' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:9: ( '<=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:11: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:9: ( '>' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:9: ( '>=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:11: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:5: ( '*' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:7: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:173:5: ( '/' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:173:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:5: ( '%' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:6: ( '+' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:7: ( '-' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:9: ( 'true' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:11: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:178:9: ( 'false' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:178:11: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:9: ( 'if' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:11: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:9: ( 'then' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:11: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:9: ( 'else' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:11: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:9: ( 'while' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:11: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:9: ( 'return' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:11: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "NOTA"
    public final void mNOTA() throws RecognitionException {
        try {
            int _type = NOTA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:5: ( ( 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' ) ( '0' .. '9' )? ( '#' | 'b' )? | 'Z' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= 'A' && LA6_0 <= 'G')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='Z') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:7: ( 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' ) ( '0' .. '9' )? ( '#' | 'b' )?
                    {
                    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'G') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:49: ( '0' .. '9' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
                            {
                            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:61: ( '#' | 'b' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='#'||LA5_0=='b') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
                            {
                            if ( input.LA(1)=='#'||input.LA(1)=='b' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:6: 'Z'
                    {
                    match('Z'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:5: ( ( '0' .. '9' )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:9: ( '0' .. '9' )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:9: ( '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:16: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:30: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:30: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:16: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:8: ( ( '\\r' )? '\\n' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:9: ( '\\r' )? '\\n'
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:9: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:9: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:198:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:198:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:201:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:201:11: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:8: ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | AND | OR | NOT | VOICE | FUNC | LB | RB | LP | RP | EQ | NEQ | LT | LE | GT | GE | MUL | DIV | MOD | PLUS | MINUS | TRUE | FALSE | IF | THEN | ELSE | WHILE | RETURN | NOTA | ID | INT | COMMENT | NEWLINE | WS )
        int alt14=46;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:10: T__47
                {
                mT__47(); 


                }
                break;
            case 2 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:16: T__48
                {
                mT__48(); 


                }
                break;
            case 3 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:22: T__49
                {
                mT__49(); 


                }
                break;
            case 4 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:28: T__50
                {
                mT__50(); 


                }
                break;
            case 5 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:34: T__51
                {
                mT__51(); 


                }
                break;
            case 6 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:40: T__52
                {
                mT__52(); 


                }
                break;
            case 7 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:46: T__53
                {
                mT__53(); 


                }
                break;
            case 8 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:52: T__54
                {
                mT__54(); 


                }
                break;
            case 9 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:58: T__55
                {
                mT__55(); 


                }
                break;
            case 10 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:64: T__56
                {
                mT__56(); 


                }
                break;
            case 11 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:70: T__57
                {
                mT__57(); 


                }
                break;
            case 12 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:76: T__58
                {
                mT__58(); 


                }
                break;
            case 13 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:82: T__59
                {
                mT__59(); 


                }
                break;
            case 14 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:88: AND
                {
                mAND(); 


                }
                break;
            case 15 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:92: OR
                {
                mOR(); 


                }
                break;
            case 16 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:95: NOT
                {
                mNOT(); 


                }
                break;
            case 17 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:99: VOICE
                {
                mVOICE(); 


                }
                break;
            case 18 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:105: FUNC
                {
                mFUNC(); 


                }
                break;
            case 19 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:110: LB
                {
                mLB(); 


                }
                break;
            case 20 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:113: RB
                {
                mRB(); 


                }
                break;
            case 21 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:116: LP
                {
                mLP(); 


                }
                break;
            case 22 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:119: RP
                {
                mRP(); 


                }
                break;
            case 23 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:122: EQ
                {
                mEQ(); 


                }
                break;
            case 24 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:125: NEQ
                {
                mNEQ(); 


                }
                break;
            case 25 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:129: LT
                {
                mLT(); 


                }
                break;
            case 26 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:132: LE
                {
                mLE(); 


                }
                break;
            case 27 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:135: GT
                {
                mGT(); 


                }
                break;
            case 28 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:138: GE
                {
                mGE(); 


                }
                break;
            case 29 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:141: MUL
                {
                mMUL(); 


                }
                break;
            case 30 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:145: DIV
                {
                mDIV(); 


                }
                break;
            case 31 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:149: MOD
                {
                mMOD(); 


                }
                break;
            case 32 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:153: PLUS
                {
                mPLUS(); 


                }
                break;
            case 33 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:158: MINUS
                {
                mMINUS(); 


                }
                break;
            case 34 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:164: TRUE
                {
                mTRUE(); 


                }
                break;
            case 35 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:169: FALSE
                {
                mFALSE(); 


                }
                break;
            case 36 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:175: IF
                {
                mIF(); 


                }
                break;
            case 37 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:178: THEN
                {
                mTHEN(); 


                }
                break;
            case 38 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:183: ELSE
                {
                mELSE(); 


                }
                break;
            case 39 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:188: WHILE
                {
                mWHILE(); 


                }
                break;
            case 40 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:194: RETURN
                {
                mRETURN(); 


                }
                break;
            case 41 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:201: NOTA
                {
                mNOTA(); 


                }
                break;
            case 42 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:206: ID
                {
                mID(); 


                }
                break;
            case 43 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:209: INT
                {
                mINT(); 


                }
                break;
            case 44 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:213: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 45 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:221: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 46 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:229: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\54\3\uffff\2\56\6\46\1\71\2\46\1\75\3\46\5\uffff\1\103"+
        "\1\105\1\uffff\1\107\3\uffff\4\46\2\56\2\uffff\1\52\4\uffff\1\46"+
        "\1\uffff\1\56\6\46\1\125\1\46\2\uffff\1\46\1\70\2\uffff\4\46\6\uffff"+
        "\5\46\1\uffff\6\46\1\147\1\uffff\1\46\1\53\1\75\13\46\1\164\1\165"+
        "\1\46\1\uffff\1\167\3\46\1\173\1\174\1\175\2\46\1\u0080\2\46\2\uffff"+
        "\1\u0083\1\uffff\1\u0084\1\46\1\u0086\3\uffff\1\u0087\1\46\1\uffff"+
        "\1\46\1\u008a\2\uffff\1\46\2\uffff\1\u008c\1\46\1\uffff\1\46\1\uffff"+
        "\1\u008f\1\u0090\2\uffff";
    static final String DFA14_eofS =
        "\u0091\uffff";
    static final String DFA14_minS =
        "\1\11\1\46\3\uffff\2\101\1\145\2\157\1\160\1\146\1\157\1\174\1\156"+
        "\1\162\1\75\2\157\1\141\5\uffff\2\75\1\uffff\1\52\3\uffff\1\150"+
        "\1\154\1\150\1\145\2\101\2\uffff\1\12\4\uffff\1\157\1\uffff\1\101"+
        "\1\163\1\154\1\164\1\154\1\145\1\164\1\101\1\151\2\uffff\1\144\1"+
        "\101\2\uffff\1\164\1\151\1\156\1\154\6\uffff\1\165\1\145\1\163\1"+
        "\151\1\164\1\uffff\1\162\1\145\1\157\1\145\1\151\1\145\1\101\1\uffff"+
        "\1\144\2\101\2\143\1\163\1\145\1\156\1\145\1\154\1\165\1\144\1\155"+
        "\1\144\2\101\1\144\1\uffff\1\101\1\145\1\164\1\145\3\101\1\145\1"+
        "\162\1\101\1\142\1\171\2\uffff\1\101\1\uffff\1\101\1\151\1\101\3"+
        "\uffff\1\101\1\156\1\uffff\1\154\1\101\2\uffff\1\157\2\uffff\1\101"+
        "\1\145\1\uffff\1\156\1\uffff\2\101\2\uffff";
    static final String DFA14_maxS =
        "\1\175\1\46\3\uffff\2\172\1\145\2\157\1\160\1\156\1\157\1\174\1"+
        "\156\1\162\1\75\2\157\1\165\5\uffff\2\75\1\uffff\1\57\3\uffff\1"+
        "\162\1\154\1\150\1\145\2\172\2\uffff\1\12\4\uffff\1\157\1\uffff"+
        "\1\172\1\163\1\154\1\164\1\154\1\145\1\164\1\172\1\151\2\uffff\1"+
        "\144\1\172\2\uffff\1\164\1\151\1\156\1\154\6\uffff\1\165\1\145\1"+
        "\163\1\151\1\164\1\uffff\1\162\1\145\1\157\1\145\1\151\1\145\1\172"+
        "\1\uffff\1\144\2\172\2\143\1\163\1\145\1\156\1\145\1\154\1\165\1"+
        "\144\1\155\1\144\2\172\1\144\1\uffff\1\172\1\145\1\164\1\145\3\172"+
        "\1\145\1\162\1\172\1\142\1\171\2\uffff\1\172\1\uffff\1\172\1\151"+
        "\1\172\3\uffff\1\172\1\156\1\uffff\1\154\1\172\2\uffff\1\157\2\uffff"+
        "\1\172\1\145\1\uffff\1\156\1\uffff\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\3\1\4\17\uffff\1\23\1\24\1\25\1\26\1\27\2\uffff\1"+
        "\35\1\uffff\1\37\1\40\1\41\6\uffff\1\52\1\53\1\uffff\1\55\1\56\1"+
        "\16\1\1\1\uffff\1\51\11\uffff\1\17\1\15\2\uffff\1\30\1\20\4\uffff"+
        "\1\32\1\31\1\34\1\33\1\54\1\36\5\uffff\1\55\7\uffff\1\44\21\uffff"+
        "\1\13\14\uffff\1\10\1\11\1\uffff\1\14\3\uffff\1\42\1\45\1\46\2\uffff"+
        "\1\5\2\uffff\1\12\1\21\1\uffff\1\43\1\47\2\uffff\1\7\1\uffff\1\50"+
        "\2\uffff\1\6\1\22";
    static final String DFA14_specialS =
        "\u0091\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\52\1\51\2\uffff\1\50\22\uffff\1\52\1\20\3\uffff\1\35\1\1"+
            "\1\uffff\1\26\1\27\1\33\1\36\1\2\1\37\1\3\1\34\12\47\1\uffff"+
            "\1\4\1\31\1\30\1\32\2\uffff\2\44\1\5\1\44\1\6\2\44\5\46\1\7"+
            "\1\10\1\46\1\11\2\46\1\12\2\46\1\22\3\46\1\45\6\uffff\1\16\3"+
            "\46\1\41\1\23\2\46\1\13\4\46\1\21\1\17\2\46\1\43\1\46\1\40\1"+
            "\46\1\14\1\42\3\46\1\24\1\15\1\25",
            "\1\53",
            "",
            "",
            "",
            "\32\46\6\uffff\1\46\1\57\5\46\1\55\22\46",
            "\32\46\6\uffff\1\46\1\57\13\46\1\60\14\46",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\66\7\uffff\1\65",
            "\1\67",
            "\1\70",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\76",
            "\1\77",
            "\1\101\23\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\104",
            "",
            "\1\106\4\uffff\1\106",
            "",
            "",
            "",
            "\1\111\11\uffff\1\110",
            "\1\112",
            "\1\113",
            "\1\114",
            "\32\46\6\uffff\1\46\1\57\30\46",
            "\32\46\6\uffff\32\46",
            "",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\116",
            "",
            "\32\46\6\uffff\32\46",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\32\46\6\uffff\32\46",
            "\1\126",
            "",
            "",
            "\1\127",
            "\32\46\6\uffff\32\46",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\32\46\6\uffff\32\46",
            "",
            "\1\150",
            "\32\46\6\uffff\32\46",
            "\32\46\6\uffff\32\46",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\32\46\6\uffff\32\46",
            "\32\46\6\uffff\32\46",
            "\1\166",
            "",
            "\32\46\6\uffff\32\46",
            "\1\170",
            "\1\171",
            "\1\172",
            "\32\46\6\uffff\32\46",
            "\32\46\6\uffff\32\46",
            "\32\46\6\uffff\32\46",
            "\1\176",
            "\1\177",
            "\32\46\6\uffff\32\46",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "\32\46\6\uffff\32\46",
            "",
            "\32\46\6\uffff\32\46",
            "\1\u0085",
            "\32\46\6\uffff\32\46",
            "",
            "",
            "",
            "\32\46\6\uffff\32\46",
            "\1\u0088",
            "",
            "\1\u0089",
            "\32\46\6\uffff\32\46",
            "",
            "",
            "\1\u008b",
            "",
            "",
            "\32\46\6\uffff\32\46",
            "\1\u008d",
            "",
            "\1\u008e",
            "",
            "\32\46\6\uffff\32\46",
            "\32\46\6\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | AND | OR | NOT | VOICE | FUNC | LB | RB | LP | RP | EQ | NEQ | LT | LE | GT | GE | MUL | DIV | MOD | PLUS | MINUS | TRUE | FALSE | IF | THEN | ELSE | WHILE | RETURN | NOTA | ID | INT | COMMENT | NEWLINE | WS );";
        }
    }
 

}