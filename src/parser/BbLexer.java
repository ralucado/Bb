// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 22:13:23

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BbLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int ALT=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ASSIGN=7;
    public static final int BOOLEAN=8;
    public static final int CHORD=9;
    public static final int COMMENT=10;
    public static final int DIV=11;
    public static final int ELSE=12;
    public static final int EQ=13;
    public static final int ESC_SEQ=14;
    public static final int FALSE=15;
    public static final int FOR=16;
    public static final int FUNC=17;
    public static final int FUNCALL=18;
    public static final int GE=19;
    public static final int GT=20;
    public static final int ID=21;
    public static final int IF=22;
    public static final int INT=23;
    public static final int LB=24;
    public static final int LE=25;
    public static final int LIST_FUNCTIONS=26;
    public static final int LIST_INSTR=27;
    public static final int LP=28;
    public static final int LT=29;
    public static final int MELODY=30;
    public static final int MINUS=31;
    public static final int MOD=32;
    public static final int MUL=33;
    public static final int NEQ=34;
    public static final int NOT=35;
    public static final int NOTE=36;
    public static final int NOTEASSIGN=37;
    public static final int NOTEID=38;
    public static final int OR=39;
    public static final int PACK=40;
    public static final int PARAMS=41;
    public static final int PITCH=42;
    public static final int PLAYABLE=43;
    public static final int PLUS=44;
    public static final int POLIFONE=45;
    public static final int PREF=46;
    public static final int PVALUE=47;
    public static final int QUIET=48;
    public static final int RB=49;
    public static final int RETURN=50;
    public static final int RP=51;
    public static final int SPEED=52;
    public static final int THEN=53;
    public static final int TRUE=54;
    public static final int VOICE=55;
    public static final int WHILE=56;
    public static final int WS=57;

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

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:6:7: ( ',' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:6:9: ','
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:7:7: ( '.' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:7:9: '.'
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:8:7: ( ';' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:8:9: ';'
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:9:7: ( 'Chord' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:9:9: 'Chord'
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:10:7: ( 'Melody' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:10:9: 'Melody'
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:11:7: ( 'Note' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:11:9: 'Note'
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:12:7: ( 'Poli' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:12:9: 'Poli'
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:13:7: ( 'Speed' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:13:9: 'Speed'
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:14:7: ( '[' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:15:7: ( ']' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:4: ( '&&' | 'and' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:16: 'and'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:200:3: ( '||' | 'or' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:200:9: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:200:16: 'or'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:201:4: ( '!' | 'not' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:201:9: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:201:15: 'not'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:6: ( 'Voice' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:8: 'Voice'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:203:5: ( 'function' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:203:7: 'function'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:5: ( '{' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:7: '{'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:205:5: ( '}' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:205:7: '}'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:5: ( '(' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:7: '('
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:5: ( ')' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:7: ')'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:6: ( '=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:8: '='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:4: ( '!=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:6: '!='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:210:9: ( '<' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:210:11: '<'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:9: ( '<=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:11: '<='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:9: ( '>' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:11: '>'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:9: ( '>=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:11: '>='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:214:5: ( '*' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:214:7: '*'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:215:5: ( '/' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:215:7: '/'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:5: ( '%' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:7: '%'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:217:6: ( '+' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:217:8: '+'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:218:7: ( '-' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:218:9: '-'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:9: ( 'true' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:11: 'true'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:220:9: ( 'false' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:220:11: 'false'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:221:9: ( 'if' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:221:11: 'if'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:222:9: ( 'then' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:222:11: 'then'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:223:9: ( 'else' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:223:11: 'else'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:224:9: ( 'while' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:224:11: 'while'
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

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:225:6: ( 'for' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:225:8: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:226:9: ( 'return' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:226:11: 'return'
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

    // $ANTLR start "PITCH"
    public final void mPITCH() throws RecognitionException {
        try {
            int _type = PITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:227:7: ( ( 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'G') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PITCH"

    // $ANTLR start "ALT"
    public final void mALT() throws RecognitionException {
        try {
            int _type = ALT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:228:6: ( ( '#' | 'b' ) )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALT"

    // $ANTLR start "QUIET"
    public final void mQUIET() throws RecognitionException {
        try {
            int _type = QUIET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:229:7: ( 'Z' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:229:9: 'Z'
            {
            match('Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUIET"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:230:6: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:230:10: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:230:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop4;
                }
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

    // $ANTLR start "NOTEID"
    public final void mNOTEID() throws RecognitionException {
        try {
            int _type = NOTEID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:231:9: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:231:13: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:231:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:232:5: ( ( '0' .. '9' )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:232:9: ( '0' .. '9' )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:232:9: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='/') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='*') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:16: (~ ( '\\n' | '\\r' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
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
                    	    break loop7;
                        }
                    } while (true);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:30: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:30: '\\r'
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:235:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:235:16: ( options {greedy=false; } : . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:235:44: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
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

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:241:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:241:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:244:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:244:11: ( ' ' | '\\t' | '\\n' | '\\r' )
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
        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:8: ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | AND | OR | NOT | VOICE | FUNC | LB | RB | LP | RP | EQ | NEQ | LT | LE | GT | GE | MUL | DIV | MOD | PLUS | MINUS | TRUE | FALSE | IF | THEN | ELSE | WHILE | FOR | RETURN | PITCH | ALT | QUIET | ID | NOTEID | INT | COMMENT | WS )
        int alt11=49;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:10: T__58
                {
                mT__58(); 


                }
                break;
            case 2 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:16: T__59
                {
                mT__59(); 


                }
                break;
            case 3 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:22: T__60
                {
                mT__60(); 


                }
                break;
            case 4 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:28: T__61
                {
                mT__61(); 


                }
                break;
            case 5 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:34: T__62
                {
                mT__62(); 


                }
                break;
            case 6 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:40: T__63
                {
                mT__63(); 


                }
                break;
            case 7 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:46: T__64
                {
                mT__64(); 


                }
                break;
            case 8 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:52: T__65
                {
                mT__65(); 


                }
                break;
            case 9 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:58: T__66
                {
                mT__66(); 


                }
                break;
            case 10 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:64: T__67
                {
                mT__67(); 


                }
                break;
            case 11 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:70: T__68
                {
                mT__68(); 


                }
                break;
            case 12 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:76: T__69
                {
                mT__69(); 


                }
                break;
            case 13 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:82: T__70
                {
                mT__70(); 


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
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:194: FOR
                {
                mFOR(); 


                }
                break;
            case 41 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:198: RETURN
                {
                mRETURN(); 


                }
                break;
            case 42 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:205: PITCH
                {
                mPITCH(); 


                }
                break;
            case 43 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:211: ALT
                {
                mALT(); 


                }
                break;
            case 44 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:215: QUIET
                {
                mQUIET(); 


                }
                break;
            case 45 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:221: ID
                {
                mID(); 


                }
                break;
            case 46 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:224: NOTEID
                {
                mNOTEID(); 


                }
                break;
            case 47 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:231: INT
                {
                mINT(); 


                }
                break;
            case 48 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:235: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 49 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:243: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\4\uffff\1\56\6\uffff\2\51\1\67\1\uffff\2\51\1\73\1\51\1\uffff\1"+
        "\51\5\uffff\1\102\1\104\1\uffff\1\106\3\uffff\4\51\1\56\1\50\1\114"+
        "\5\uffff\1\52\1\uffff\4\52\1\51\1\123\1\51\2\uffff\1\51\1\66\2\uffff"+
        "\1\51\1\52\3\51\6\uffff\5\51\1\uffff\5\52\1\145\1\uffff\1\51\1\16"+
        "\1\73\1\52\2\51\1\152\5\51\2\52\1\162\1\163\1\52\1\uffff\1\165\1"+
        "\52\2\51\1\uffff\1\171\1\172\1\173\2\51\1\176\1\52\2\uffff\1\u0080"+
        "\1\uffff\1\u0081\1\51\1\u0083\3\uffff\1\u0084\1\51\1\uffff\1\u0086"+
        "\2\uffff\1\51\2\uffff\1\u0088\1\uffff\1\51\1\uffff\1\u008a\1\uffff";
    static final String DFA11_eofS =
        "\u008b\uffff";
    static final String DFA11_minS =
        "\1\11\3\uffff\5\60\2\uffff\1\146\1\157\1\174\1\uffff\1\156\1\162"+
        "\1\75\1\157\1\60\1\141\5\uffff\2\75\1\uffff\1\52\3\uffff\1\150\1"+
        "\154\1\150\1\145\3\60\5\uffff\1\157\1\uffff\1\154\1\164\1\154\1"+
        "\145\1\164\1\60\1\151\2\uffff\1\144\1\60\2\uffff\1\164\1\151\1\156"+
        "\1\154\1\162\6\uffff\1\165\1\145\1\163\1\151\1\164\1\uffff\1\162"+
        "\1\157\1\145\1\151\1\145\1\60\1\uffff\1\144\2\60\2\143\1\163\1\60"+
        "\1\145\1\156\1\145\1\154\1\165\2\144\2\60\1\144\1\uffff\1\60\1\145"+
        "\1\164\1\145\1\uffff\3\60\1\145\1\162\1\60\1\171\2\uffff\1\60\1"+
        "\uffff\1\60\1\151\1\60\3\uffff\1\60\1\156\1\uffff\1\60\2\uffff\1"+
        "\157\2\uffff\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\3\uffff\5\172\2\uffff\1\156\1\157\1\174\1\uffff\1\156\1\162"+
        "\1\75\1\157\1\172\1\165\5\uffff\2\75\1\uffff\1\57\3\uffff\1\162"+
        "\1\154\1\150\1\145\3\172\5\uffff\1\157\1\uffff\1\154\1\164\1\154"+
        "\1\145\1\164\1\172\1\151\2\uffff\1\144\1\172\2\uffff\1\164\1\151"+
        "\1\156\1\154\1\162\6\uffff\1\165\1\145\1\163\1\151\1\164\1\uffff"+
        "\1\162\1\157\1\145\1\151\1\145\1\172\1\uffff\1\144\2\172\2\143\1"+
        "\163\1\172\1\145\1\156\1\145\1\154\1\165\2\144\2\172\1\144\1\uffff"+
        "\1\172\1\145\1\164\1\145\1\uffff\3\172\1\145\1\162\1\172\1\171\2"+
        "\uffff\1\172\1\uffff\1\172\1\151\1\172\3\uffff\1\172\1\156\1\uffff"+
        "\1\172\2\uffff\1\157\2\uffff\1\172\1\uffff\1\156\1\uffff\1\172\1"+
        "\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\11\1\12\3\uffff\1\16\6\uffff\1\23"+
        "\1\24\1\25\1\26\1\27\2\uffff\1\35\1\uffff\1\37\1\40\1\41\7\uffff"+
        "\1\53\1\55\1\56\1\57\1\61\1\uffff\1\52\7\uffff\1\17\1\15\2\uffff"+
        "\1\30\1\20\5\uffff\1\32\1\31\1\34\1\33\1\60\1\36\5\uffff\1\54\6"+
        "\uffff\1\44\21\uffff\1\13\4\uffff\1\50\7\uffff\1\6\1\7\1\uffff\1"+
        "\14\3\uffff\1\42\1\45\1\46\2\uffff\1\4\1\uffff\1\10\1\21\1\uffff"+
        "\1\43\1\47\1\uffff\1\5\1\uffff\1\51\1\uffff\1\22";
    static final String DFA11_specialS =
        "\u008b\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\54\2\uffff\1\54\22\uffff\1\54\1\21\1\uffff\1\50\1\uffff\1"+
            "\36\1\16\1\uffff\1\27\1\30\1\34\1\37\1\1\1\40\1\2\1\35\12\53"+
            "\1\uffff\1\3\1\32\1\31\1\33\2\uffff\2\45\1\4\4\45\5\52\1\5\1"+
            "\6\1\52\1\7\2\52\1\10\2\52\1\23\3\52\1\47\1\11\1\uffff\1\12"+
            "\3\uffff\1\17\1\46\2\51\1\42\1\24\2\51\1\13\4\51\1\22\1\20\2"+
            "\51\1\44\1\51\1\41\1\51\1\14\1\43\3\51\1\25\1\15\1\26",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\6\uffff\7\52\1\55\22\52",
            "\12\52\7\uffff\32\52\6\uffff\4\52\1\57\25\52",
            "\12\52\7\uffff\32\52\6\uffff\16\52\1\60\13\52",
            "\12\52\7\uffff\32\52\6\uffff\16\52\1\61\13\52",
            "\12\52\7\uffff\32\52\6\uffff\17\52\1\62\12\52",
            "",
            "",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "\1\66",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74",
            "\12\52\7\uffff\32\52\6\uffff\16\52\1\75\13\52",
            "\1\77\15\uffff\1\100\5\uffff\1\76",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\103",
            "",
            "\1\105\4\uffff\1\105",
            "",
            "",
            "",
            "\1\110\11\uffff\1\107",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\124",
            "",
            "",
            "\1\125",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\146",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\164",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\174",
            "\1\175",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\177",
            "",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\u0082",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u0085",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "",
            "\1\u0087",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u0089",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | AND | OR | NOT | VOICE | FUNC | LB | RB | LP | RP | EQ | NEQ | LT | LE | GT | GE | MUL | DIV | MOD | PLUS | MINUS | TRUE | FALSE | IF | THEN | ELSE | WHILE | FOR | RETURN | PITCH | ALT | QUIET | ID | NOTEID | INT | COMMENT | WS );";
        }
    }
 

}