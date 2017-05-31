// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-05-31 12:30:43

package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class BbLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
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
    public static final int INST=23;
    public static final int INSTRUMENT=24;
    public static final int INT=25;
    public static final int LB=26;
    public static final int LE=27;
    public static final int LIST_FUNCTIONS=28;
    public static final int LIST_INSTR=29;
    public static final int LP=30;
    public static final int LT=31;
    public static final int MELODY=32;
    public static final int MINUS=33;
    public static final int MOD=34;
    public static final int MUL=35;
    public static final int NEQ=36;
    public static final int NOT=37;
    public static final int NOTE=38;
    public static final int NOTEASSIGN=39;
    public static final int NOTEID=40;
    public static final int OR=41;
    public static final int PACK=42;
    public static final int PARAMS=43;
    public static final int PITCH=44;
    public static final int PLAYABLE=45;
    public static final int PLUS=46;
    public static final int POLIFONE=47;
    public static final int PREF=48;
    public static final int PVALUE=49;
    public static final int QUIET=50;
    public static final int RB=51;
    public static final int READ=52;
    public static final int RETURN=53;
    public static final int RP=54;
    public static final int SPEED=55;
    public static final int STRING=56;
    public static final int THEN=57;
    public static final int TRUE=58;
    public static final int VOICE=59;
    public static final int VOL=60;
    public static final int WHILE=61;
    public static final int WRITE=62;
    public static final int WS=63;

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

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:16:7: ( 'bool' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:16:9: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:17:7: ( 'int' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:17:9: 'int'
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:18:7: ( 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:18:9: 'void'
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:19:7: ( '|' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:19:9: '|'
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
    // $ANTLR end "T__77"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:218:4: ( '&&' | 'and' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:218:9: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:218:16: 'and'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:3: ( '||' | 'or' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:9: '||'
                    {
                    match("||"); 



                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:16: 'or'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:220:4: ( '!' | 'not' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:220:9: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:220:15: 'not'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:221:6: ( 'Voice' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:221:8: 'Voice'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:222:5: ( 'function' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:222:7: 'function'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:223:5: ( '{' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:223:7: '{'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:224:5: ( '}' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:224:7: '}'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:225:5: ( '(' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:225:7: '('
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:226:5: ( ')' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:226:7: ')'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:227:6: ( '=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:227:8: '='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:228:4: ( '!=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:228:6: '!='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:229:9: ( '<' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:229:11: '<'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:230:9: ( '<=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:230:11: '<='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:231:9: ( '>' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:231:11: '>'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:232:9: ( '>=' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:232:11: '>='
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:233:5: ( '*' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:233:7: '*'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:5: ( '/' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:234:7: '/'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:235:5: ( '%' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:235:7: '%'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:236:6: ( '+' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:236:8: '+'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:237:7: ( '-' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:237:9: '-'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:238:9: ( 'true' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:238:11: 'true'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:239:9: ( 'false' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:239:11: 'false'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:240:9: ( 'if' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:240:11: 'if'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:241:9: ( 'then' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:241:11: 'then'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:242:9: ( 'else' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:242:11: 'else'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:243:9: ( 'while' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:243:11: 'while'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:244:6: ( 'for' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:244:8: 'for'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:245:9: ( 'return' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:245:11: 'return'
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

    // $ANTLR start "READ"
    public final void mREAD() throws RecognitionException {
        try {
            int _type = READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:246:6: ( 'read' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:246:8: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READ"

    // $ANTLR start "WRITE"
    public final void mWRITE() throws RecognitionException {
        try {
            int _type = WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:247:7: ( 'write' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:247:9: 'write'
            {
            match("write"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WRITE"

    // $ANTLR start "INSTRUMENT"
    public final void mINSTRUMENT() throws RecognitionException {
        try {
            int _type = INSTRUMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:248:11: ( 'instrument' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:248:13: 'instrument'
            {
            match("instrument"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTRUMENT"

    // $ANTLR start "VOL"
    public final void mVOL() throws RecognitionException {
        try {
            int _type = VOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:249:6: ( 'vol' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:249:8: 'vol'
            {
            match("vol"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOL"

    // $ANTLR start "PITCH"
    public final void mPITCH() throws RecognitionException {
        try {
            int _type = PITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:250:7: ( ( 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' ) )
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:251:6: ( ( '#' | 'b' ) )
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:252:7: ( 'Z' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:252:9: 'Z'
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:253:6: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:253:10: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:253:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:254:9: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:254:13: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:254:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:255:5: ( ( '0' .. '9' )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:255:9: ( '0' .. '9' )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:255:9: ( '0' .. '9' )+
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:257:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:257:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:257:16: (~ ( '\\n' | '\\r' ) )*
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


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:257:30: ( '\\r' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:257:30: '\\r'
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:258:11: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:258:16: ( options {greedy=false; } : . )*
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
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:258:44: .
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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:261:9: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:261:12: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:261:16: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:261:18: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    }
            	    break;
            	case 2 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:261:28: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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
            	    break loop11;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:266:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:266:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:269:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:269:11: ( ' ' | '\\t' | '\\n' | '\\r' )
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
        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:8: ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | AND | OR | NOT | VOICE | FUNC | LB | RB | LP | RP | EQ | NEQ | LT | LE | GT | GE | MUL | DIV | MOD | PLUS | MINUS | TRUE | FALSE | IF | THEN | ELSE | WHILE | FOR | RETURN | READ | WRITE | INSTRUMENT | VOL | PITCH | ALT | QUIET | ID | NOTEID | INT | COMMENT | STRING | WS )
        int alt12=55;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:10: T__64
                {
                mT__64(); 


                }
                break;
            case 2 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:16: T__65
                {
                mT__65(); 


                }
                break;
            case 3 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:22: T__66
                {
                mT__66(); 


                }
                break;
            case 4 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:28: T__67
                {
                mT__67(); 


                }
                break;
            case 5 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:34: T__68
                {
                mT__68(); 


                }
                break;
            case 6 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:40: T__69
                {
                mT__69(); 


                }
                break;
            case 7 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:46: T__70
                {
                mT__70(); 


                }
                break;
            case 8 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:52: T__71
                {
                mT__71(); 


                }
                break;
            case 9 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:58: T__72
                {
                mT__72(); 


                }
                break;
            case 10 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:64: T__73
                {
                mT__73(); 


                }
                break;
            case 11 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:70: T__74
                {
                mT__74(); 


                }
                break;
            case 12 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:76: T__75
                {
                mT__75(); 


                }
                break;
            case 13 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:82: T__76
                {
                mT__76(); 


                }
                break;
            case 14 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:88: T__77
                {
                mT__77(); 


                }
                break;
            case 15 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:94: AND
                {
                mAND(); 


                }
                break;
            case 16 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:98: OR
                {
                mOR(); 


                }
                break;
            case 17 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:101: NOT
                {
                mNOT(); 


                }
                break;
            case 18 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:105: VOICE
                {
                mVOICE(); 


                }
                break;
            case 19 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:111: FUNC
                {
                mFUNC(); 


                }
                break;
            case 20 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:116: LB
                {
                mLB(); 


                }
                break;
            case 21 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:119: RB
                {
                mRB(); 


                }
                break;
            case 22 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:122: LP
                {
                mLP(); 


                }
                break;
            case 23 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:125: RP
                {
                mRP(); 


                }
                break;
            case 24 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:128: EQ
                {
                mEQ(); 


                }
                break;
            case 25 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:131: NEQ
                {
                mNEQ(); 


                }
                break;
            case 26 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:135: LT
                {
                mLT(); 


                }
                break;
            case 27 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:138: LE
                {
                mLE(); 


                }
                break;
            case 28 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:141: GT
                {
                mGT(); 


                }
                break;
            case 29 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:144: GE
                {
                mGE(); 


                }
                break;
            case 30 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:147: MUL
                {
                mMUL(); 


                }
                break;
            case 31 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:151: DIV
                {
                mDIV(); 


                }
                break;
            case 32 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:155: MOD
                {
                mMOD(); 


                }
                break;
            case 33 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:159: PLUS
                {
                mPLUS(); 


                }
                break;
            case 34 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:164: MINUS
                {
                mMINUS(); 


                }
                break;
            case 35 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:170: TRUE
                {
                mTRUE(); 


                }
                break;
            case 36 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:175: FALSE
                {
                mFALSE(); 


                }
                break;
            case 37 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:181: IF
                {
                mIF(); 


                }
                break;
            case 38 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:184: THEN
                {
                mTHEN(); 


                }
                break;
            case 39 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:189: ELSE
                {
                mELSE(); 


                }
                break;
            case 40 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:194: WHILE
                {
                mWHILE(); 


                }
                break;
            case 41 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:200: FOR
                {
                mFOR(); 


                }
                break;
            case 42 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:204: RETURN
                {
                mRETURN(); 


                }
                break;
            case 43 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:211: READ
                {
                mREAD(); 


                }
                break;
            case 44 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:216: WRITE
                {
                mWRITE(); 


                }
                break;
            case 45 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:222: INSTRUMENT
                {
                mINSTRUMENT(); 


                }
                break;
            case 46 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:233: VOL
                {
                mVOL(); 


                }
                break;
            case 47 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:237: PITCH
                {
                mPITCH(); 


                }
                break;
            case 48 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:243: ALT
                {
                mALT(); 


                }
                break;
            case 49 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:247: QUIET
                {
                mQUIET(); 


                }
                break;
            case 50 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:253: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:256: NOTEID
                {
                mNOTEID(); 


                }
                break;
            case 52 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:263: INT
                {
                mINT(); 


                }
                break;
            case 53 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:267: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 54 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:275: STRING
                {
                mSTRING(); 


                }
                break;
            case 55 :
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:1:282: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\4\uffff\1\57\6\uffff\1\47\2\51\1\71\1\uffff\2\51\1\75\1\51\1\uffff"+
        "\1\51\5\uffff\1\104\1\106\1\uffff\1\110\3\uffff\4\51\1\57\1\uffff"+
        "\1\117\5\uffff\1\52\1\uffff\4\52\2\51\1\130\1\51\2\uffff\1\51\1"+
        "\70\2\uffff\1\51\1\52\3\51\6\uffff\6\51\1\uffff\5\52\1\51\1\156"+
        "\1\51\1\uffff\1\51\1\161\1\17\1\75\1\52\2\51\1\165\7\51\2\52\1\177"+
        "\1\u0080\1\52\1\u0082\1\uffff\1\51\1\u0084\1\uffff\1\52\2\51\1\uffff"+
        "\1\u0088\1\u0089\1\u008a\3\51\1\u008e\1\u008f\1\52\2\uffff\1\u0091"+
        "\1\uffff\1\51\1\uffff\1\u0093\1\51\1\u0095\3\uffff\1\u0096\1\u0097"+
        "\1\51\2\uffff\1\u0099\1\uffff\1\51\1\uffff\1\51\3\uffff\1\u009c"+
        "\1\uffff\2\51\1\uffff\1\51\1\u00a0\1\51\1\uffff\1\u00a2\1\uffff";
    static final String DFA12_eofS =
        "\u00a3\uffff";
    static final String DFA12_minS =
        "\1\11\3\uffff\5\60\2\uffff\1\60\1\146\1\157\1\174\1\uffff\1\156"+
        "\1\162\1\75\1\157\1\60\1\141\5\uffff\2\75\1\uffff\1\52\3\uffff\1"+
        "\150\1\154\1\150\1\145\1\60\1\uffff\1\60\5\uffff\1\157\1\uffff\1"+
        "\154\1\164\1\154\1\145\1\157\1\163\1\60\1\151\2\uffff\1\144\1\60"+
        "\2\uffff\1\164\1\151\1\156\1\154\1\162\6\uffff\1\165\1\145\1\163"+
        "\2\151\1\141\1\uffff\1\162\1\157\1\145\1\151\1\145\1\154\1\60\1"+
        "\164\1\uffff\1\144\3\60\2\143\1\163\1\60\1\145\1\156\1\145\1\154"+
        "\1\164\1\165\3\144\2\60\1\144\1\60\1\uffff\1\162\1\60\1\uffff\1"+
        "\145\1\164\1\145\1\uffff\3\60\2\145\1\162\2\60\1\171\2\uffff\1\60"+
        "\1\uffff\1\165\1\uffff\1\60\1\151\1\60\3\uffff\2\60\1\156\2\uffff"+
        "\1\60\1\uffff\1\155\1\uffff\1\157\3\uffff\1\60\1\uffff\1\145\1\156"+
        "\1\uffff\1\156\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\175\3\uffff\5\172\2\uffff\1\172\1\156\1\157\1\174\1\uffff\1\156"+
        "\1\162\1\75\1\157\1\172\1\165\5\uffff\2\75\1\uffff\1\57\3\uffff"+
        "\1\162\1\154\1\162\1\145\1\172\1\uffff\1\172\5\uffff\1\157\1\uffff"+
        "\1\154\1\164\1\154\1\145\1\157\1\164\1\172\1\154\2\uffff\1\144\1"+
        "\172\2\uffff\1\164\1\151\1\156\1\154\1\162\6\uffff\1\165\1\145\1"+
        "\163\2\151\1\164\1\uffff\1\162\1\157\1\145\1\151\1\145\1\154\1\172"+
        "\1\164\1\uffff\1\144\3\172\2\143\1\163\1\172\1\145\1\156\1\145\1"+
        "\154\1\164\1\165\3\144\2\172\1\144\1\172\1\uffff\1\162\1\172\1\uffff"+
        "\1\145\1\164\1\145\1\uffff\3\172\2\145\1\162\2\172\1\171\2\uffff"+
        "\1\172\1\uffff\1\165\1\uffff\1\172\1\151\1\172\3\uffff\2\172\1\156"+
        "\2\uffff\1\172\1\uffff\1\155\1\uffff\1\157\3\uffff\1\172\1\uffff"+
        "\1\145\1\156\1\uffff\1\156\1\172\1\164\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\11\1\12\4\uffff\1\17\6\uffff\1\24"+
        "\1\25\1\26\1\27\1\30\2\uffff\1\36\1\uffff\1\40\1\41\1\42\5\uffff"+
        "\1\60\1\uffff\1\62\1\63\1\64\1\66\1\67\1\uffff\1\57\10\uffff\1\20"+
        "\1\16\2\uffff\1\31\1\21\5\uffff\1\33\1\32\1\35\1\34\1\65\1\37\6"+
        "\uffff\1\61\10\uffff\1\45\25\uffff\1\14\2\uffff\1\56\3\uffff\1\51"+
        "\11\uffff\1\6\1\7\1\uffff\1\13\1\uffff\1\15\3\uffff\1\43\1\46\1"+
        "\47\3\uffff\1\53\1\4\1\uffff\1\10\1\uffff\1\22\1\uffff\1\44\1\50"+
        "\1\54\1\uffff\1\5\2\uffff\1\52\3\uffff\1\23\1\uffff\1\55";
    static final String DFA12_specialS =
        "\u00a3\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\55\2\uffff\1\55\22\uffff\1\55\1\22\1\54\1\47\1\uffff\1\37"+
            "\1\17\1\uffff\1\30\1\31\1\35\1\40\1\1\1\41\1\2\1\36\12\53\1"+
            "\uffff\1\3\1\33\1\32\1\34\2\uffff\2\46\1\4\4\46\5\52\1\5\1\6"+
            "\1\52\1\7\2\52\1\10\2\52\1\24\3\52\1\50\1\11\1\uffff\1\12\3"+
            "\uffff\1\20\1\13\2\51\1\43\1\25\2\51\1\14\4\51\1\23\1\21\2\51"+
            "\1\45\1\51\1\42\1\51\1\15\1\44\3\51\1\26\1\16\1\27",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\6\uffff\7\52\1\56\22\52",
            "\12\52\7\uffff\32\52\6\uffff\4\52\1\60\25\52",
            "\12\52\7\uffff\32\52\6\uffff\16\52\1\61\13\52",
            "\12\52\7\uffff\32\52\6\uffff\16\52\1\62\13\52",
            "\12\52\7\uffff\32\52\6\uffff\17\52\1\63\12\52",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\16\51\1\64\13\51",
            "\1\66\7\uffff\1\65",
            "\1\67",
            "\1\70",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\76",
            "\12\52\7\uffff\32\52\6\uffff\16\52\1\77\13\52",
            "\1\101\15\uffff\1\102\5\uffff\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\105",
            "",
            "\1\107\4\uffff\1\107",
            "",
            "",
            "",
            "\1\112\11\uffff\1\111",
            "\1\113",
            "\1\114\11\uffff\1\115",
            "\1\116",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\127\1\126",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\131\2\uffff\1\132",
            "",
            "",
            "\1\133",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\147\22\uffff\1\146",
            "",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\157",
            "",
            "\1\160",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\u0081",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u0083",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\u0090",
            "",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "\1\u0092",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "\1\u0094",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u0098",
            "",
            "",
            "\12\52\7\uffff\32\52\6\uffff\32\52",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "",
            "",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            "\1\u00a1",
            "",
            "\12\51\7\uffff\32\51\6\uffff\32\51",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | AND | OR | NOT | VOICE | FUNC | LB | RB | LP | RP | EQ | NEQ | LT | LE | GT | GE | MUL | DIV | MOD | PLUS | MINUS | TRUE | FALSE | IF | THEN | ELSE | WHILE | FOR | RETURN | READ | WRITE | INSTRUMENT | VOL | PITCH | ALT | QUIET | ID | NOTEID | INT | COMMENT | STRING | WS );";
        }
    }
 

}