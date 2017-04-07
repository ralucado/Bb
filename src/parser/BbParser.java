// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 23:13:55

package parser;
import interp.BbTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class BbParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CHORD", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MELODY", "MINUS", "MOD", "MUL", "NEQ", "NOT", "NOTE", "NOTEASSIGN", "NOTEID", "OR", "PACK", "PARAMS", "PITCH", "PLAYABLE", "PLUS", "POLIFONE", "PREF", "PVALUE", "QUIET", "RB", "RETURN", "RP", "SPEED", "THEN", "TRUE", "VOICE", "WHILE", "WS", "','", "'.'", "';'", "'Chord'", "'Melody'", "'Note'", "'Poli'", "'Speed'", "'['", "']'", "'int'", "'void'", "'|'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public BbParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public BbParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return BbParser.tokenNames; }
    public String getGrammarFileName() { return "/home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
    public final BbParser.prog_return prog() throws RecognitionException {
        BbParser.prog_return retval = new BbParser.prog_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EOF2=null;
        BbParser.func_return func1 =null;


        BbTree EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_func=new RewriteRuleSubtreeStream(adaptor,"rule func");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:11: ( func )+ EOF
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 61 && LA1_0 <= 64)||(LA1_0 >= 68 && LA1_0 <= 69)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog216);
            	    func1=func();

            	    state._fsp--;

            	    stream_func.add(func1.getTree());

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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog219);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: func
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 38:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:24: ^( LIST_FUNCTIONS ( func )+ )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(LIST_FUNCTIONS, "LIST_FUNCTIONS")
                , root_1);

                if ( !(stream_func.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_func.hasNext() ) {
                    adaptor.addChild(root_1, stream_func.nextTree());

                }
                stream_func.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class func_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:1: func : ( type | notetype ) ID ^ params LB ! block_instructions RB !;
    public final BbParser.func_return func() throws RecognitionException {
        BbParser.func_return retval = new BbParser.func_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID5=null;
        Token LB7=null;
        Token RB9=null;
        BbParser.type_return type3 =null;

        BbParser.notetype_return notetype4 =null;

        BbParser.params_return params6 =null;

        BbParser.block_instructions_return block_instructions8 =null;


        BbTree ID5_tree=null;
        BbTree LB7_tree=null;
        BbTree RB9_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:9: ( ( type | notetype ) ID ^ params LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:11: ( type | notetype ) ID ^ params LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:11: ( type | notetype )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 68 && LA2_0 <= 69)) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= 61 && LA2_0 <= 64)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:12: type
                    {
                    pushFollow(FOLLOW_type_in_func250);
                    type3=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type3.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:19: notetype
                    {
                    pushFollow(FOLLOW_notetype_in_func254);
                    notetype4=notetype();

                    state._fsp--;

                    adaptor.addChild(root_0, notetype4.getTree());

                    }
                    break;

            }


            ID5=(Token)match(input,ID,FOLLOW_ID_in_func257); 
            ID5_tree = 
            (BbTree)adaptor.create(ID5)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(ID5_tree, root_0);


            pushFollow(FOLLOW_params_in_func260);
            params6=params();

            state._fsp--;

            adaptor.addChild(root_0, params6.getTree());

            LB7=(Token)match(input,LB,FOLLOW_LB_in_func262); 

            pushFollow(FOLLOW_block_instructions_in_func265);
            block_instructions8=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions8.getTree());

            RB9=(Token)match(input,RB,FOLLOW_RB_in_func267); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "func"


    public static class params_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final BbParser.params_return params() throws RecognitionException {
        BbParser.params_return retval = new BbParser.params_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal10=null;
        Token char_literal12=null;
        BbParser.paramlist_return paramlist11 =null;


        BbTree char_literal10_tree=null;
        BbTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:11: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,LP,FOLLOW_LP_in_params287);  
            stream_LP.add(char_literal10);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:15: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 61 && LA3_0 <= 64)||(LA3_0 >= 68 && LA3_0 <= 69)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params289);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,RP,FOLLOW_RP_in_params292);  
            stream_RP.add(char_literal12);


            // AST REWRITE
            // elements: paramlist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 46:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:33: ^( PARAMS ( paramlist )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:46:42: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class paramlist_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:1: paramlist : param ( ',' ! param )* ;
    public final BbParser.paramlist_return paramlist() throws RecognitionException {
        BbParser.paramlist_return retval = new BbParser.paramlist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal14=null;
        BbParser.param_return param13 =null;

        BbParser.param_return param15 =null;


        BbTree char_literal14_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:10: ( param ( ',' ! param )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:12: param ( ',' ! param )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist318);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==58) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,58,FOLLOW_58_in_paramlist321); 

            	    pushFollow(FOLLOW_param_in_paramlist324);
            	    param15=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param15.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"


    public static class param_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:1: param : ( type ID | notetype NOTEID );
    public final BbParser.param_return param() throws RecognitionException {
        BbParser.param_return retval = new BbParser.param_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID17=null;
        Token NOTEID19=null;
        BbParser.type_return type16 =null;

        BbParser.notetype_return notetype18 =null;


        BbTree ID17_tree=null;
        BbTree NOTEID19_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:9: ( type ID | notetype NOTEID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 68 && LA5_0 <= 69)) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= 61 && LA5_0 <= 64)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:13: type ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_param349);
                    type16=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type16.getTree());

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_param351); 
                    ID17_tree = 
                    (BbTree)adaptor.create(ID17)
                    ;
                    adaptor.addChild(root_0, ID17_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:13: notetype NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notetype_in_param365);
                    notetype18=notetype();

                    state._fsp--;

                    adaptor.addChild(root_0, notetype18.getTree());

                    NOTEID19=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_param367); 
                    NOTEID19_tree = 
                    (BbTree)adaptor.create(NOTEID19)
                    ;
                    adaptor.addChild(root_0, NOTEID19_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:59:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final BbParser.block_instructions_return block_instructions() throws RecognitionException {
        BbParser.block_instructions_return retval = new BbParser.block_instructions_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal21=null;
        BbParser.instruction_return instruction20 =null;

        BbParser.instruction_return instruction22 =null;


        BbTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions411);
            instruction20=instruction();

            state._fsp--;

            stream_instruction.add(instruction20.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:26: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==60) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:27: ';' instruction
            	    {
            	    char_literal21=(Token)match(input,60,FOLLOW_60_in_block_instructions414);  
            	    stream_60.add(char_literal21);


            	    pushFollow(FOLLOW_instruction_in_block_instructions416);
            	    instruction22=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // AST REWRITE
            // elements: instruction
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 61:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:16: ^( LIST_INSTR ( instruction )+ )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(LIST_INSTR, "LIST_INSTR")
                , root_1);

                if ( !(stream_instruction.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_instruction.hasNext() ) {
                    adaptor.addChild(root_1, stream_instruction.nextTree());

                }
                stream_instruction.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block_instructions"


    public static class instruction_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instruction"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:65:1: instruction : ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed |);
    public final BbParser.instruction_return instruction() throws RecognitionException {
        BbParser.instruction_return retval = new BbParser.instruction_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.assign_return assign23 =null;

        BbParser.ite_stmt_return ite_stmt24 =null;

        BbParser.while_stmt_return while_stmt25 =null;

        BbParser.for_stmt_return for_stmt26 =null;

        BbParser.funcall_return funcall27 =null;

        BbParser.return_stmt_return return_stmt28 =null;

        BbParser.playable_return playable29 =null;

        BbParser.speed_return speed30 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:66:9: ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed |)
            int alt7=9;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
            case 63:
            case 68:
            case 69:
                {
                alt7=1;
                }
                break;
            case 64:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==LB) ) {
                    alt7=7;
                }
                else if ( (LA7_2==NOTEID) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt7=2;
                }
                break;
            case WHILE:
                {
                alt7=3;
                }
                break;
            case FOR:
                {
                alt7=4;
                }
                break;
            case ID:
                {
                alt7=5;
                }
                break;
            case RETURN:
                {
                alt7=6;
                }
                break;
            case LP:
            case NOTEID:
            case PITCH:
            case 66:
                {
                alt7=7;
                }
                break;
            case 65:
                {
                alt7=8;
                }
                break;
            case ELSE:
            case RB:
            case 60:
                {
                alt7=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:66:13: assign
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction475);
                    assign23=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign23.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction499);
                    ite_stmt24=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt24.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction521);
                    while_stmt25=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt25.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:11: for_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction539);
                    for_stmt26=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt26.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction555);
                    funcall27=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall27.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:71:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction578);
                    return_stmt28=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt28.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction597);
                    playable29=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable29.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction617);
                    speed30=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed30.getTree());

                    }
                    break;
                case 9 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:75:9: 
                    {
                    root_0 = (BbTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instruction"


    public static class assign_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:1: assign : ( type ID eq= EQ n_expr -> ^( ASSIGN[$eq,\":=\"] ID n_expr ) | notetype NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) );
    public final BbParser.assign_return assign() throws RecognitionException {
        BbParser.assign_return retval = new BbParser.assign_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token eq=null;
        Token ID32=null;
        Token NOTEID35=null;
        Token EQ36=null;
        BbParser.type_return type31 =null;

        BbParser.n_expr_return n_expr33 =null;

        BbParser.notetype_return notetype34 =null;

        BbParser.musicnotation_return musicnotation37 =null;


        BbTree eq_tree=null;
        BbTree ID32_tree=null;
        BbTree NOTEID35_tree=null;
        BbTree EQ36_tree=null;
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_notetype=new RewriteRuleSubtreeStream(adaptor,"rule notetype");
        RewriteRuleSubtreeStream stream_musicnotation=new RewriteRuleSubtreeStream(adaptor,"rule musicnotation");
        RewriteRuleSubtreeStream stream_n_expr=new RewriteRuleSubtreeStream(adaptor,"rule n_expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:9: ( type ID eq= EQ n_expr -> ^( ASSIGN[$eq,\":=\"] ID n_expr ) | notetype NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= 68 && LA8_0 <= 69)) ) {
                alt8=1;
            }
            else if ( ((LA8_0 >= 61 && LA8_0 <= 64)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:13: type ID eq= EQ n_expr
                    {
                    pushFollow(FOLLOW_type_in_assign670);
                    type31=type();

                    state._fsp--;

                    stream_type.add(type31.getTree());

                    ID32=(Token)match(input,ID,FOLLOW_ID_in_assign672);  
                    stream_ID.add(ID32);


                    eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign676);  
                    stream_EQ.add(eq);


                    pushFollow(FOLLOW_n_expr_in_assign678);
                    n_expr33=n_expr();

                    state._fsp--;

                    stream_n_expr.add(n_expr33.getTree());

                    // AST REWRITE
                    // elements: ID, n_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 78:34: -> ^( ASSIGN[$eq,\":=\"] ID n_expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:37: ^( ASSIGN[$eq,\":=\"] ID n_expr )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_n_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:5: notetype NOTEID EQ musicnotation
                    {
                    pushFollow(FOLLOW_notetype_in_assign695);
                    notetype34=notetype();

                    state._fsp--;

                    stream_notetype.add(notetype34.getTree());

                    NOTEID35=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign697);  
                    stream_NOTEID.add(NOTEID35);


                    EQ36=(Token)match(input,EQ,FOLLOW_EQ_in_assign699);  
                    stream_EQ.add(EQ36);


                    pushFollow(FOLLOW_musicnotation_in_assign701);
                    musicnotation37=musicnotation();

                    state._fsp--;

                    stream_musicnotation.add(musicnotation37.getTree());

                    // AST REWRITE
                    // elements: musicnotation, NOTEID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 79:38: -> ^( NOTEASSIGN NOTEID musicnotation )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:41: ^( NOTEASSIGN NOTEID musicnotation )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(NOTEASSIGN, "NOTEASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NOTEID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_musicnotation.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class type_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:82:1: type : ( 'int' | 'void' );
    public final BbParser.type_return type() throws RecognitionException {
        BbParser.type_return retval = new BbParser.type_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set38=null;

        BbTree set38_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:82:6: ( 'int' | 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set38=(Token)input.LT(1);

            if ( (input.LA(1) >= 68 && input.LA(1) <= 69) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set38)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class notetype_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notetype"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:86:1: notetype : ( 'Note' | 'Chord' | 'Melody' | 'Poli' );
    public final BbParser.notetype_return notetype() throws RecognitionException {
        BbParser.notetype_return retval = new BbParser.notetype_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set39=null;

        BbTree set39_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:86:9: ( 'Note' | 'Chord' | 'Melody' | 'Poli' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( (input.LA(1) >= 61 && input.LA(1) <= 64) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set39)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notetype"


    public static class musicnotation_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "musicnotation"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:1: musicnotation : ( 'Note' notabasica ( '.' num_expr ( MUL )? )? -> ^( PLAYABLE ^( NOTE notabasica ) ( num_expr ( MUL )? )? ) | 'Chord' ! '(' ! chord ')' !| 'Melody' ! '(' ! melodia ')' !| polifon | NOTEID );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal40=null;
        Token char_literal42=null;
        Token MUL44=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token string_literal49=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token NOTEID54=null;
        BbParser.notabasica_return notabasica41 =null;

        BbParser.num_expr_return num_expr43 =null;

        BbParser.chord_return chord47 =null;

        BbParser.melodia_return melodia51 =null;

        BbParser.polifon_return polifon53 =null;


        BbTree string_literal40_tree=null;
        BbTree char_literal42_tree=null;
        BbTree MUL44_tree=null;
        BbTree string_literal45_tree=null;
        BbTree char_literal46_tree=null;
        BbTree char_literal48_tree=null;
        BbTree string_literal49_tree=null;
        BbTree char_literal50_tree=null;
        BbTree char_literal52_tree=null;
        BbTree NOTEID54_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:15: ( 'Note' notabasica ( '.' num_expr ( MUL )? )? -> ^( PLAYABLE ^( NOTE notabasica ) ( num_expr ( MUL )? )? ) | 'Chord' ! '(' ! chord ')' !| 'Melody' ! '(' ! melodia ')' !| polifon | NOTEID )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt11=1;
                }
                break;
            case 61:
                {
                alt11=2;
                }
                break;
            case 62:
                {
                alt11=3;
                }
                break;
            case 64:
                {
                alt11=4;
                }
                break;
            case NOTEID:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:17: 'Note' notabasica ( '.' num_expr ( MUL )? )?
                    {
                    string_literal40=(Token)match(input,63,FOLLOW_63_in_musicnotation832);  
                    stream_63.add(string_literal40);


                    pushFollow(FOLLOW_notabasica_in_musicnotation834);
                    notabasica41=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica41.getTree());

                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:35: ( '.' num_expr ( MUL )? )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==59) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:36: '.' num_expr ( MUL )?
                            {
                            char_literal42=(Token)match(input,59,FOLLOW_59_in_musicnotation837);  
                            stream_59.add(char_literal42);


                            pushFollow(FOLLOW_num_expr_in_musicnotation839);
                            num_expr43=num_expr();

                            state._fsp--;

                            stream_num_expr.add(num_expr43.getTree());

                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:49: ( MUL )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==MUL) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:49: MUL
                                    {
                                    MUL44=(Token)match(input,MUL,FOLLOW_MUL_in_musicnotation841);  
                                    stream_MUL.add(MUL44);


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: MUL, notabasica, num_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 92:56: -> ^( PLAYABLE ^( NOTE notabasica ) ( num_expr ( MUL )? )? )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:59: ^( PLAYABLE ^( NOTE notabasica ) ( num_expr ( MUL )? )? )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                        , root_1);

                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:70: ^( NOTE notabasica )
                        {
                        BbTree root_2 = (BbTree)adaptor.nil();
                        root_2 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(NOTE, "NOTE")
                        , root_2);

                        adaptor.addChild(root_2, stream_notabasica.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:89: ( num_expr ( MUL )? )?
                        if ( stream_MUL.hasNext()||stream_num_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_num_expr.nextTree());

                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:99: ( MUL )?
                            if ( stream_MUL.hasNext() ) {
                                adaptor.addChild(root_1, 
                                stream_MUL.nextNode()
                                );

                            }
                            stream_MUL.reset();

                        }
                        stream_MUL.reset();
                        stream_num_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:93:7: 'Chord' ! '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal45=(Token)match(input,61,FOLLOW_61_in_musicnotation872); 

                    char_literal46=(Token)match(input,LP,FOLLOW_LP_in_musicnotation875); 

                    pushFollow(FOLLOW_chord_in_musicnotation878);
                    chord47=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord47.getTree());

                    char_literal48=(Token)match(input,RP,FOLLOW_RP_in_musicnotation880); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:7: 'Melody' ! '(' ! melodia ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal49=(Token)match(input,62,FOLLOW_62_in_musicnotation889); 

                    char_literal50=(Token)match(input,LP,FOLLOW_LP_in_musicnotation892); 

                    pushFollow(FOLLOW_melodia_in_musicnotation895);
                    melodia51=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia51.getTree());

                    char_literal52=(Token)match(input,RP,FOLLOW_RP_in_musicnotation897); 

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation906);
                    polifon53=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon53.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID54=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation914); 
                    NOTEID54_tree = 
                    (BbTree)adaptor.create(NOTEID54)
                    ;
                    adaptor.addChild(root_0, NOTEID54_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "musicnotation"


    public static class ite_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:1: ite_stmt : IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF55=null;
        Token LP56=null;
        Token RP58=null;
        Token LB59=null;
        Token ELSE61=null;
        Token RB63=null;
        BbParser.n_expr_return n_expr57 =null;

        BbParser.block_instructions_return block_instructions60 =null;

        BbParser.block_instructions_return block_instructions62 =null;


        BbTree IF55_tree=null;
        BbTree LP56_tree=null;
        BbTree RP58_tree=null;
        BbTree LB59_tree=null;
        BbTree ELSE61_tree=null;
        BbTree RB63_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:13: ( IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:17: IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !
            {
            root_0 = (BbTree)adaptor.nil();


            IF55=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt934); 
            IF55_tree = 
            (BbTree)adaptor.create(IF55)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF55_tree, root_0);


            LP56=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt937); 

            pushFollow(FOLLOW_n_expr_in_ite_stmt940);
            n_expr57=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr57.getTree());

            RP58=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt942); 

            LB59=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt945); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt948);
            block_instructions60=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions60.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:59: ( ELSE ! block_instructions )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ELSE) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:60: ELSE ! block_instructions
                    {
                    ELSE61=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt951); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt954);
                    block_instructions62=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions62.getTree());

                    }
                    break;

            }


            RB63=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt958); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:1: while_stmt : WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE64=null;
        Token LP65=null;
        Token RP67=null;
        Token LB68=null;
        Token RB70=null;
        BbParser.n_expr_return n_expr66 =null;

        BbParser.block_instructions_return block_instructions69 =null;


        BbTree WHILE64_tree=null;
        BbTree LP65_tree=null;
        BbTree RP67_tree=null;
        BbTree LB68_tree=null;
        BbTree RB70_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:13: ( WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:17: WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE64=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt984); 
            WHILE64_tree = 
            (BbTree)adaptor.create(WHILE64)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE64_tree, root_0);


            LP65=(Token)match(input,LP,FOLLOW_LP_in_while_stmt987); 

            pushFollow(FOLLOW_n_expr_in_while_stmt990);
            n_expr66=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr66.getTree());

            RP67=(Token)match(input,RP,FOLLOW_RP_in_while_stmt992); 

            LB68=(Token)match(input,LB,FOLLOW_LB_in_while_stmt995); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt998);
            block_instructions69=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions69.getTree());

            RB70=(Token)match(input,RB,FOLLOW_RB_in_while_stmt1000); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "while_stmt"


    public static class for_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:1: for_stmt : FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !;
    public final BbParser.for_stmt_return for_stmt() throws RecognitionException {
        BbParser.for_stmt_return retval = new BbParser.for_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token FOR71=null;
        Token LP72=null;
        Token char_literal74=null;
        Token char_literal76=null;
        Token RP78=null;
        Token LB79=null;
        Token RB81=null;
        BbParser.assign_return assign73 =null;

        BbParser.n_expr_return n_expr75 =null;

        BbParser.assign_return assign77 =null;

        BbParser.block_instructions_return block_instructions80 =null;


        BbTree FOR71_tree=null;
        BbTree LP72_tree=null;
        BbTree char_literal74_tree=null;
        BbTree char_literal76_tree=null;
        BbTree RP78_tree=null;
        BbTree LB79_tree=null;
        BbTree RB81_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:11: ( FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:15: FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR71=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1038); 
            FOR71_tree = 
            (BbTree)adaptor.create(FOR71)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR71_tree, root_0);


            LP72=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1041); 

            pushFollow(FOLLOW_assign_in_for_stmt1044);
            assign73=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign73.getTree());

            char_literal74=(Token)match(input,60,FOLLOW_60_in_for_stmt1046); 
            char_literal74_tree = 
            (BbTree)adaptor.create(char_literal74)
            ;
            adaptor.addChild(root_0, char_literal74_tree);


            pushFollow(FOLLOW_n_expr_in_for_stmt1048);
            n_expr75=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr75.getTree());

            char_literal76=(Token)match(input,60,FOLLOW_60_in_for_stmt1050); 
            char_literal76_tree = 
            (BbTree)adaptor.create(char_literal76)
            ;
            adaptor.addChild(root_0, char_literal76_tree);


            pushFollow(FOLLOW_assign_in_for_stmt1052);
            assign77=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign77.getTree());

            RP78=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1054); 

            LB79=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1057); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1060);
            block_instructions80=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions80.getTree());

            RB81=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1062); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:1: return_stmt : RETURN ^ ( n_expr | musicnotation )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN82=null;
        BbParser.n_expr_return n_expr83 =null;

        BbParser.musicnotation_return musicnotation84 =null;


        BbTree RETURN82_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:13: ( RETURN ^ ( n_expr | musicnotation )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:17: RETURN ^ ( n_expr | musicnotation )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN82=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1087); 
            RETURN82_tree = 
            (BbTree)adaptor.create(RETURN82)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN82_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:25: ( n_expr | musicnotation )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==ID||LA13_0==INT||LA13_0==LP||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE) ) {
                alt13=1;
            }
            else if ( (LA13_0==NOTEID||(LA13_0 >= 61 && LA13_0 <= 64)) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:26: n_expr
                    {
                    pushFollow(FOLLOW_n_expr_in_return_stmt1091);
                    n_expr83=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr83.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:35: musicnotation
                    {
                    pushFollow(FOLLOW_musicnotation_in_return_stmt1095);
                    musicnotation84=musicnotation();

                    state._fsp--;

                    adaptor.addChild(root_0, musicnotation84.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class playable_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "playable"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:1: playable : ( melodia | polifon | NOTEID );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID87=null;
        BbParser.melodia_return melodia85 =null;

        BbParser.polifon_return polifon86 =null;


        BbTree NOTEID87_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:9: ( melodia | polifon | NOTEID )
            int alt14=3;
            switch ( input.LA(1) ) {
            case LP:
            case PITCH:
            case 66:
                {
                alt14=1;
                }
                break;
            case NOTEID:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==LP||LA14_2==59) ) {
                    alt14=1;
                }
                else if ( (LA14_2==ELSE||LA14_2==RB||LA14_2==RP||LA14_2==58||LA14_2==60) ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
                }
                break;
            case 64:
                {
                alt14=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1114);
                    melodia85=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia85.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1126);
                    polifon86=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon86.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:11: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID87=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1138); 
                    NOTEID87_tree = 
                    (BbTree)adaptor.create(NOTEID87)
                    ;
                    adaptor.addChild(root_0, NOTEID87_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "playable"


    public static class melodia_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "melodia"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:1: melodia : ( notelist )+ -> ^( MELODY ( notelist )+ ) ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.notelist_return notelist88 =null;


        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:8: ( ( notelist )+ -> ^( MELODY ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: ( notelist )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: ( notelist )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LP||LA15_0==NOTEID||LA15_0==PITCH||LA15_0==66) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1154);
            	    notelist88=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist88.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            // AST REWRITE
            // elements: notelist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 122:20: -> ^( MELODY ( notelist )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:23: ^( MELODY ( notelist )+ )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(MELODY, "MELODY")
                , root_1);

                if ( !(stream_notelist.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_notelist.hasNext() ) {
                    adaptor.addChild(root_1, stream_notelist.nextTree());

                }
                stream_notelist.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "melodia"


    public static class notelist_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notelist"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:1: notelist : notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) ;
    public final BbParser.notelist_return notelist() throws RecognitionException {
        BbParser.notelist_return retval = new BbParser.notelist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal90=null;
        Token MUL92=null;
        BbParser.notas_return notas89 =null;

        BbParser.duration_return duration91 =null;


        BbTree char_literal90_tree=null;
        BbTree MUL92_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1180);
            notas89=notas();

            state._fsp--;

            stream_notas.add(notas89.getTree());

            char_literal90=(Token)match(input,59,FOLLOW_59_in_notelist1182);  
            stream_59.add(char_literal90);


            pushFollow(FOLLOW_duration_in_notelist1184);
            duration91=duration();

            state._fsp--;

            stream_duration.add(duration91.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:30: ( MUL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MUL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:30: MUL
                    {
                    MUL92=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1186);  
                    stream_MUL.add(MUL92);


                    }
                    break;

            }


            // AST REWRITE
            // elements: duration, MUL, notas
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 125:35: -> ^( PLAYABLE notas duration ( MUL )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:38: ^( PLAYABLE notas duration ( MUL )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                , root_1);

                adaptor.addChild(root_1, stream_notas.nextTree());

                adaptor.addChild(root_1, stream_duration.nextTree());

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:64: ( MUL )?
                if ( stream_MUL.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_MUL.nextNode()
                    );

                }
                stream_MUL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notelist"


    public static class notas_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notas"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:1: notas : ( nota | '[' ! pack ']' !| '(' ! chord ')' !);
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        BbParser.nota_return nota93 =null;

        BbParser.pack_return pack95 =null;

        BbParser.chord_return chord98 =null;


        BbTree char_literal94_tree=null;
        BbTree char_literal96_tree=null;
        BbTree char_literal97_tree=null;
        BbTree char_literal99_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
            int alt17=3;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
                {
                alt17=1;
                }
                break;
            case 66:
                {
                alt17=2;
                }
                break;
            case LP:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1207);
                    nota93=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota93.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal94=(Token)match(input,66,FOLLOW_66_in_notas1216); 

                    pushFollow(FOLLOW_pack_in_notas1219);
                    pack95=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack95.getTree());

                    char_literal96=(Token)match(input,67,FOLLOW_67_in_notas1221); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal97=(Token)match(input,LP,FOLLOW_LP_in_notas1231); 

                    pushFollow(FOLLOW_chord_in_notas1234);
                    chord98=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord98.getTree());

                    char_literal99=(Token)match(input,RP,FOLLOW_RP_in_notas1236); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notas"


    public static class nota_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nota"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:1: nota : ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID101=null;
        Token char_literal102=null;
        Token PLUS103=null;
        Token char_literal105=null;
        BbParser.notabasica_return notabasica100 =null;

        BbParser.num_expr_return num_expr104 =null;


        BbTree NOTEID101_tree=null;
        BbTree char_literal102_tree=null;
        BbTree PLUS103_tree=null;
        BbTree char_literal105_tree=null;
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==PITCH) ) {
                alt19=1;
            }
            else if ( (LA19_0==NOTEID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1255);
                    notabasica100=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica100.getTree());

                    // AST REWRITE
                    // elements: notabasica
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 132:19: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:22: ^( NOTE notabasica )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(NOTE, "NOTE")
                        , root_1);

                        adaptor.addChild(root_1, stream_notabasica.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:4: NOTEID ( '(' ! PLUS ^ num_expr ')' !)?
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID101=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1269); 
                    NOTEID101_tree = 
                    (BbTree)adaptor.create(NOTEID101)
                    ;
                    adaptor.addChild(root_0, NOTEID101_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LP) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal102=(Token)match(input,LP,FOLLOW_LP_in_nota1273); 

                            PLUS103=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1276); 
                            PLUS103_tree = 
                            (BbTree)adaptor.create(PLUS103)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS103_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1279);
                            num_expr104=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr104.getTree());

                            char_literal105=(Token)match(input,RP,FOLLOW_RP_in_nota1281); 

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nota"


    public static class chord_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chord"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:1: chord : sub_chord -> ^( CHORD sub_chord ) ;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord106 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1296);
            sub_chord106=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord106.getTree());

            // AST REWRITE
            // elements: sub_chord
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 137:18: -> ^( CHORD sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:21: ^( CHORD sub_chord )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(CHORD, "CHORD")
                , root_1);

                adaptor.addChild(root_1, stream_sub_chord.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chord"


    public static class sub_chord_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sub_chord"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:1: sub_chord : nota ( ',' ! ( nota ) )* ;
    public final BbParser.sub_chord_return sub_chord() throws RecognitionException {
        BbParser.sub_chord_return retval = new BbParser.sub_chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal108=null;
        BbParser.nota_return nota107 =null;

        BbParser.nota_return nota109 =null;


        BbTree char_literal108_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1314);
            nota107=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota107.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:17: ( ',' ! ( nota ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==58) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:19: ',' ! ( nota )
            	    {
            	    char_literal108=(Token)match(input,58,FOLLOW_58_in_sub_chord1318); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1322);
            	    nota109=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota109.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sub_chord"


    public static class pack_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pack"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:1: pack : sub_chord -> ^( PACK sub_chord ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord110 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1335);
            sub_chord110=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord110.getTree());

            // AST REWRITE
            // elements: sub_chord
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 143:17: -> ^( PACK sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:20: ^( PACK sub_chord )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PACK, "PACK")
                , root_1);

                adaptor.addChild(root_1, stream_sub_chord.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pack"


    public static class duration_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "duration"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:1: duration : ( INT | '(' ! num_expr ')' !);
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        BbParser.num_expr_return num_expr113 =null;


        BbTree INT111_tree=null;
        BbTree char_literal112_tree=null;
        BbTree char_literal114_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:9: ( INT | '(' ! num_expr ')' !)
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==LP) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT111=(Token)match(input,INT,FOLLOW_INT_in_duration1354); 
                    INT111_tree = 
                    (BbTree)adaptor.create(INT111)
                    ;
                    adaptor.addChild(root_0, INT111_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal112=(Token)match(input,LP,FOLLOW_LP_in_duration1363); 

                    pushFollow(FOLLOW_num_expr_in_duration1366);
                    num_expr113=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr113.getTree());

                    char_literal114=(Token)match(input,RP,FOLLOW_RP_in_duration1368); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "duration"


    public static class polifon_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "polifon"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:1: polifon : 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) ;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal115=null;
        Token LB116=null;
        Token RB118=null;
        BbParser.voices_return voices117 =null;


        BbTree string_literal115_tree=null;
        BbTree LB116_tree=null;
        BbTree RB118_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:9: ( 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:11: 'Poli' LB ( voices )+ RB
            {
            string_literal115=(Token)match(input,64,FOLLOW_64_in_polifon1382);  
            stream_64.add(string_literal115);


            LB116=(Token)match(input,LB,FOLLOW_LB_in_polifon1384);  
            stream_LB.add(LB116);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:21: ( voices )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==VOICE) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:21: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1386);
            	    voices117=voices();

            	    state._fsp--;

            	    stream_voices.add(voices117.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            RB118=(Token)match(input,RB,FOLLOW_RB_in_polifon1389);  
            stream_RB.add(RB118);


            // AST REWRITE
            // elements: voices
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 151:32: -> ^( POLIFONE ( voices )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:35: ^( POLIFONE ( voices )+ )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(POLIFONE, "POLIFONE")
                , root_1);

                if ( !(stream_voices.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_voices.hasNext() ) {
                    adaptor.addChild(root_1, stream_voices.nextTree());

                }
                stream_voices.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "polifon"


    public static class voices_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "voices"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:1: voices : VOICE ! NOTEID ! melodia '|' !;
    public final BbParser.voices_return voices() throws RecognitionException {
        BbParser.voices_return retval = new BbParser.voices_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token VOICE119=null;
        Token NOTEID120=null;
        Token char_literal122=null;
        BbParser.melodia_return melodia121 =null;


        BbTree VOICE119_tree=null;
        BbTree NOTEID120_tree=null;
        BbTree char_literal122_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:7: ( VOICE ! NOTEID ! melodia '|' !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:9: VOICE ! NOTEID ! melodia '|' !
            {
            root_0 = (BbTree)adaptor.nil();


            VOICE119=(Token)match(input,VOICE,FOLLOW_VOICE_in_voices1422); 

            NOTEID120=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_voices1425); 

            pushFollow(FOLLOW_melodia_in_voices1428);
            melodia121=melodia();

            state._fsp--;

            adaptor.addChild(root_0, melodia121.getTree());

            char_literal122=(Token)match(input,70,FOLLOW_70_in_voices1430); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "voices"


    public static class speed_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:1: speed : 'Speed' n_expr -> ^( SPEED n_expr ) ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal123=null;
        BbParser.n_expr_return n_expr124 =null;


        BbTree string_literal123_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_n_expr=new RewriteRuleSubtreeStream(adaptor,"rule n_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:7: ( 'Speed' n_expr -> ^( SPEED n_expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:9: 'Speed' n_expr
            {
            string_literal123=(Token)match(input,65,FOLLOW_65_in_speed1439);  
            stream_65.add(string_literal123);


            pushFollow(FOLLOW_n_expr_in_speed1441);
            n_expr124=n_expr();

            state._fsp--;

            stream_n_expr.add(n_expr124.getTree());

            // AST REWRITE
            // elements: n_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 156:24: -> ^( SPEED n_expr )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:27: ^( SPEED n_expr )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(SPEED, "SPEED")
                , root_1);

                adaptor.addChild(root_1, stream_n_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "speed"


    public static class expr_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:1: expr : ( playable | n_expr );
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.playable_return playable125 =null;

        BbParser.n_expr_return n_expr126 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:9: ( playable | n_expr )
            int alt23=2;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
            case 64:
            case 66:
                {
                alt23=1;
                }
                break;
            case LP:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==NOTEID||LA23_2==PITCH) ) {
                    alt23=1;
                }
                else if ( (LA23_2==FALSE||LA23_2==ID||LA23_2==INT||LA23_2==LP||LA23_2==MINUS||LA23_2==NOT||LA23_2==PLUS||LA23_2==TRUE) ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;

                }
                }
                break;
            case FALSE:
            case ID:
            case INT:
            case MINUS:
            case NOT:
            case PLUS:
            case TRUE:
                {
                alt23=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:11: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_expr1461);
                    playable125=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable125.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:5: n_expr
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_n_expr_in_expr1467);
                    n_expr126=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr126.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class n_expr_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "n_expr"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:1: n_expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.n_expr_return n_expr() throws RecognitionException {
        BbParser.n_expr_return retval = new BbParser.n_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR128=null;
        BbParser.boolterm_return boolterm127 =null;

        BbParser.boolterm_return boolterm129 =null;


        BbTree OR128_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:8: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:10: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_n_expr1484);
            boolterm127=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm127.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:19: ( OR ^ boolterm )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:20: OR ^ boolterm
            	    {
            	    OR128=(Token)match(input,OR,FOLLOW_OR_in_n_expr1487); 
            	    OR128_tree = 
            	    (BbTree)adaptor.create(OR128)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR128_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_n_expr1490);
            	    boolterm129=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm129.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "n_expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND131=null;
        BbParser.boolfact_return boolfact130 =null;

        BbParser.boolfact_return boolfact132 =null;


        BbTree AND131_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1501);
            boolfact130=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact130.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:22: ( AND ^ boolfact )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:23: AND ^ boolfact
            	    {
            	    AND131=(Token)match(input,AND,FOLLOW_AND_in_boolterm1504); 
            	    AND131_tree = 
            	    (BbTree)adaptor.create(AND131)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND131_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1507);
            	    boolfact132=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact132.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ134=null;
        Token NEQ135=null;
        Token LT136=null;
        Token LE137=null;
        Token GT138=null;
        Token GE139=null;
        BbParser.num_expr_return num_expr133 =null;

        BbParser.num_expr_return num_expr140 =null;


        BbTree EQ134_tree=null;
        BbTree NEQ135_tree=null;
        BbTree LT136_tree=null;
        BbTree LE137_tree=null;
        BbTree GT138_tree=null;
        BbTree GE139_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1527);
            num_expr133=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr133.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQ||(LA27_0 >= GE && LA27_0 <= GT)||LA27_0==LE||LA27_0==LT||LA27_0==NEQ) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
                    int alt26=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt26=1;
                        }
                        break;
                    case NEQ:
                        {
                        alt26=2;
                        }
                        break;
                    case LT:
                        {
                        alt26=3;
                        }
                        break;
                    case LE:
                        {
                        alt26=4;
                        }
                        break;
                    case GT:
                        {
                        alt26=5;
                        }
                        break;
                    case GE:
                        {
                        alt26=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }

                    switch (alt26) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:24: EQ ^
                            {
                            EQ134=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1531); 
                            EQ134_tree = 
                            (BbTree)adaptor.create(EQ134)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ134_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:30: NEQ ^
                            {
                            NEQ135=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1536); 
                            NEQ135_tree = 
                            (BbTree)adaptor.create(NEQ135)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ135_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:37: LT ^
                            {
                            LT136=(Token)match(input,LT,FOLLOW_LT_in_boolfact1541); 
                            LT136_tree = 
                            (BbTree)adaptor.create(LT136)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT136_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:43: LE ^
                            {
                            LE137=(Token)match(input,LE,FOLLOW_LE_in_boolfact1546); 
                            LE137_tree = 
                            (BbTree)adaptor.create(LE137)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE137_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:49: GT ^
                            {
                            GT138=(Token)match(input,GT,FOLLOW_GT_in_boolfact1551); 
                            GT138_tree = 
                            (BbTree)adaptor.create(GT138)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT138_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:55: GE ^
                            {
                            GE139=(Token)match(input,GE,FOLLOW_GE_in_boolfact1556); 
                            GE139_tree = 
                            (BbTree)adaptor.create(GE139)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE139_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1560);
                    num_expr140=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr140.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class num_expr_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "num_expr"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS142=null;
        Token MINUS143=null;
        BbParser.term_return term141 =null;

        BbParser.term_return term144 =null;


        BbTree PLUS142_tree=null;
        BbTree MINUS143_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1580);
            term141=term();

            state._fsp--;

            adaptor.addChild(root_0, term141.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:18: ( ( PLUS ^| MINUS ^) term )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:20: ( PLUS ^| MINUS ^)
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==PLUS) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==MINUS) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:21: PLUS ^
            	            {
            	            PLUS142=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1585); 
            	            PLUS142_tree = 
            	            (BbTree)adaptor.create(PLUS142)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS142_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:29: MINUS ^
            	            {
            	            MINUS143=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1590); 
            	            MINUS143_tree = 
            	            (BbTree)adaptor.create(MINUS143)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS143_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1594);
            	    term144=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term144.getTree());

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL146=null;
        Token DIV147=null;
        Token MOD148=null;
        BbParser.factor_return factor145 =null;

        BbParser.factor_return factor149 =null;


        BbTree MUL146_tree=null;
        BbTree DIV147_tree=null;
        BbTree MOD148_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1618);
            factor145=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor145.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==MUL) ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2==FALSE||LA31_2==ID||LA31_2==INT||LA31_2==LP||LA31_2==MINUS||LA31_2==NOT||LA31_2==PLUS||LA31_2==TRUE) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==DIV||LA31_0==MOD) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt30=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt30=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt30=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt30=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt30) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:23: MUL ^
            	            {
            	            MUL146=(Token)match(input,MUL,FOLLOW_MUL_in_term1623); 
            	            MUL146_tree = 
            	            (BbTree)adaptor.create(MUL146)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL146_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:30: DIV ^
            	            {
            	            DIV147=(Token)match(input,DIV,FOLLOW_DIV_in_term1628); 
            	            DIV147_tree = 
            	            (BbTree)adaptor.create(DIV147)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV147_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:37: MOD ^
            	            {
            	            MOD148=(Token)match(input,MOD,FOLLOW_MOD_in_term1633); 
            	            MOD148_tree = 
            	            (BbTree)adaptor.create(MOD148)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD148_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1638);
            	    factor149=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor149.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT150=null;
        Token PLUS151=null;
        Token MINUS152=null;
        BbParser.atom_return atom153 =null;


        BbTree NOT150_tree=null;
        BbTree PLUS151_tree=null;
        BbTree MINUS152_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt32=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt32=1;
                    }
                    break;
                case PLUS:
                    {
                    alt32=2;
                    }
                    break;
                case MINUS:
                    {
                    alt32=3;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:14: NOT ^
                    {
                    NOT150=(Token)match(input,NOT,FOLLOW_NOT_in_factor1661); 
                    NOT150_tree = 
                    (BbTree)adaptor.create(NOT150)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT150_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:21: PLUS ^
                    {
                    PLUS151=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1666); 
                    PLUS151_tree = 
                    (BbTree)adaptor.create(PLUS151)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS151_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:29: MINUS ^
                    {
                    MINUS152=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1671); 
                    MINUS152_tree = 
                    (BbTree)adaptor.create(MINUS152)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS152_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1676);
            atom153=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom153.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! n_expr ')' !);
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID154=null;
        Token INT155=null;
        Token char_literal157=null;
        Token char_literal159=null;
        BbParser.funcall_return funcall156 =null;

        BbParser.n_expr_return n_expr158 =null;


        BbTree b_tree=null;
        BbTree ID154_tree=null;
        BbTree INT155_tree=null;
        BbTree char_literal157_tree=null;
        BbTree char_literal159_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! n_expr ')' !)
            int alt34=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==LP) ) {
                    alt34=4;
                }
                else if ( (LA34_1==AND||(LA34_1 >= DIV && LA34_1 <= EQ)||(LA34_1 >= GE && LA34_1 <= GT)||LA34_1==LE||LA34_1==LT||(LA34_1 >= MINUS && LA34_1 <= NEQ)||LA34_1==OR||LA34_1==PLUS||LA34_1==RB||LA34_1==RP||LA34_1==58||LA34_1==60) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt34=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt34=3;
                }
                break;
            case LP:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID154=(Token)match(input,ID,FOLLOW_ID_in_atom1701); 
                    ID154_tree = 
                    (BbTree)adaptor.create(ID154)
                    ;
                    adaptor.addChild(root_0, ID154_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT155=(Token)match(input,INT,FOLLOW_INT_in_atom1715); 
                    INT155_tree = 
                    (BbTree)adaptor.create(INT155)
                    ;
                    adaptor.addChild(root_0, INT155_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:13: (b= TRUE |b= FALSE )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==TRUE) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==FALSE) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;

                    }
                    switch (alt33) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1732);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1738);  
                            stream_FALSE.add(b);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 185:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:36: ^( BOOLEAN[$b,$b.text] )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(BOOLEAN, b, (b!=null?b.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:11: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1759);
                    funcall156=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall156.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:13: '(' ! n_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal157=(Token)match(input,LP,FOLLOW_LP_in_atom1773); 

                    pushFollow(FOLLOW_n_expr_in_atom1776);
                    n_expr158=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr158.getTree());

                    char_literal159=(Token)match(input,RP,FOLLOW_RP_in_atom1778); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class funcall_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funcall"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID160=null;
        Token char_literal161=null;
        Token char_literal163=null;
        BbParser.expr_list_return expr_list162 =null;


        BbTree ID160_tree=null;
        BbTree char_literal161_tree=null;
        BbTree char_literal163_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:13: ID '(' ( expr_list )? ')'
            {
            ID160=(Token)match(input,ID,FOLLOW_ID_in_funcall1798);  
            stream_ID.add(ID160);


            char_literal161=(Token)match(input,LP,FOLLOW_LP_in_funcall1800);  
            stream_LP.add(char_literal161);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: ( expr_list )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FALSE||LA35_0==ID||LA35_0==INT||LA35_0==LP||LA35_0==MINUS||LA35_0==NOT||LA35_0==NOTEID||LA35_0==PITCH||LA35_0==PLUS||LA35_0==TRUE||LA35_0==64||LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1802);
                    expr_list162=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list162.getTree());

                    }
                    break;

            }


            char_literal163=(Token)match(input,RP,FOLLOW_RP_in_funcall1805);  
            stream_RP.add(char_literal163);


            // AST REWRITE
            // elements: expr_list, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 190:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:61: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_2, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funcall"


    public static class expr_list_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal165=null;
        BbParser.expr_return expr164 =null;

        BbParser.expr_return expr166 =null;


        BbTree char_literal165_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1838);
            expr164=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr164.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:18: ( ',' ! expr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==58) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:19: ',' ! expr
            	    {
            	    char_literal165=(Token)match(input,58,FOLLOW_58_in_expr_list1841); 

            	    pushFollow(FOLLOW_expr_in_expr_list1844);
            	    expr166=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr166.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_list"


    public static class notabasica_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notabasica"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:1: notabasica : PITCH ( ALT )? ( INT )? ;
    public final BbParser.notabasica_return notabasica() throws RecognitionException {
        BbParser.notabasica_return retval = new BbParser.notabasica_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PITCH167=null;
        Token ALT168=null;
        Token INT169=null;

        BbTree PITCH167_tree=null;
        BbTree ALT168_tree=null;
        BbTree INT169_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:12: ( PITCH ( ALT )? ( INT )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:14: PITCH ( ALT )? ( INT )?
            {
            root_0 = (BbTree)adaptor.nil();


            PITCH167=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica1863); 
            PITCH167_tree = 
            (BbTree)adaptor.create(PITCH167)
            ;
            adaptor.addChild(root_0, PITCH167_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:20: ( ALT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ALT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:20: ALT
                    {
                    ALT168=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica1865); 
                    ALT168_tree = 
                    (BbTree)adaptor.create(ALT168)
                    ;
                    adaptor.addChild(root_0, ALT168_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:25: ( INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:25: INT
                    {
                    INT169=(Token)match(input,INT,FOLLOW_INT_in_notabasica1868); 
                    INT169_tree = 
                    (BbTree)adaptor.create(INT169)
                    ;
                    adaptor.addChild(root_0, INT169_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BbTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "notabasica"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog216 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_EOF_in_prog219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_func250 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_notetype_in_func254 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_func257 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_params_in_func260 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_func262 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_func265 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_func267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params287 = new BitSet(new long[]{0xE008000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_paramlist_in_params289 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_params292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist318 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_paramlist321 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_param_in_paramlist324 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_type_in_param349 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_param365 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_param367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions411 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_block_instructions414 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_instruction_in_block_instructions416 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign670 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_assign672 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign676 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_assign678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_assign695 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_assign697 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign699 = new BitSet(new long[]{0xE000004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_musicnotation_in_assign701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_musicnotation832 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_notabasica_in_musicnotation834 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_musicnotation837 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_musicnotation839 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_MUL_in_musicnotation841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_musicnotation872 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation875 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation878 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_musicnotation889 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation892 = new BitSet(new long[]{0x0000044010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_melodia_in_musicnotation895 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt934 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt937 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_ite_stmt940 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt942 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt945 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt948 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt951 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt954 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt984 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt987 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_while_stmt990 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt992 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt995 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt998 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1038 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1041 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_assign_in_for_stmt1044 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1046 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_for_stmt1048 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1050 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_assign_in_for_stmt1052 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1054 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1057 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1060 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1087 = new BitSet(new long[]{0xE040104890A08002L,0x0000000000000001L});
    public static final BitSet FOLLOW_n_expr_in_return_stmt1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_return_stmt1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_melodia1154 = new BitSet(new long[]{0x0000044010000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_notas_in_notelist1180 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_notelist1182 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_duration_in_notelist1184 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_notas1216 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_pack_in_notas1219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_notas1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1231 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_chord_in_notas1234 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1269 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LP_in_nota1273 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1276 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_nota1279 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1314 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_sub_chord1318 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1322 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_pack1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1363 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_duration1366 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_polifon1382 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_polifon1384 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_voices_in_polifon1386 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_RB_in_polifon1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOICE_in_voices1422 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_voices1425 = new BitSet(new long[]{0x0000044010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_melodia_in_voices1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_voices1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_speed1439 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_speed1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_expr1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_n_expr_in_expr1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1484 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_n_expr1487 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1490 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1501 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1504 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1507 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1527 = new BitSet(new long[]{0x0000000422182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1531 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1536 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_LT_in_boolfact1541 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_LE_in_boolfact1546 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_GT_in_boolfact1551 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_GE_in_boolfact1556 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1580 = new BitSet(new long[]{0x0000100080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1585 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1590 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_term_in_num_expr1594 = new BitSet(new long[]{0x0000100080000002L});
    public static final BitSet FOLLOW_factor_in_term1618 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_MUL_in_term1623 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_DIV_in_term1628 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_MOD_in_term1633 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_factor_in_term1638 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_NOT_in_factor1661 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_PLUS_in_factor1666 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_MINUS_in_factor1671 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_atom_in_factor1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1773 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_atom1776 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1798 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_funcall1800 = new BitSet(new long[]{0x0048144890A08000L,0x0000000000000005L});
    public static final BitSet FOLLOW_expr_list_in_funcall1802 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1838 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_expr_list1841 = new BitSet(new long[]{0x0040144890A08000L,0x0000000000000005L});
    public static final BitSet FOLLOW_expr_in_expr_list1844 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_PITCH_in_notabasica1863 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_ALT_in_notabasica1865 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_INT_in_notabasica1868 = new BitSet(new long[]{0x0000000000000002L});

}