// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-05-31 12:30:43

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CHORD", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INST", "INSTRUMENT", "INT", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MELODY", "MINUS", "MOD", "MUL", "NEQ", "NOT", "NOTE", "NOTEASSIGN", "NOTEID", "OR", "PACK", "PARAMS", "PITCH", "PLAYABLE", "PLUS", "POLIFONE", "PREF", "PVALUE", "QUIET", "RB", "READ", "RETURN", "RP", "SPEED", "STRING", "THEN", "TRUE", "VOICE", "VOL", "WHILE", "WRITE", "WS", "','", "'.'", "';'", "'Chord'", "'Melody'", "'Note'", "'Poli'", "'Speed'", "'['", "']'", "'bool'", "'int'", "'void'", "'|'"
    };

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:39:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:39:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:39:11: ( func )+ EOF
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:39:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNC) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:39:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog225);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog228);  
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
            // 39:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:39:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:1: func : FUNC ^ ID params LB ! block_instructions RB !;
    public final BbParser.func_return func() throws RecognitionException {
        BbParser.func_return retval = new BbParser.func_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token LB6=null;
        Token RB8=null;
        BbParser.params_return params5 =null;

        BbParser.block_instructions_return block_instructions7 =null;


        BbTree FUNC3_tree=null;
        BbTree ID4_tree=null;
        BbTree LB6_tree=null;
        BbTree RB8_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:9: ( FUNC ^ ID params LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:11: FUNC ^ ID params LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func258); 
            FUNC3_tree = 
            (BbTree)adaptor.create(FUNC3)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func261); 
            ID4_tree = 
            (BbTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func263);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            LB6=(Token)match(input,LB,FOLLOW_LB_in_func265); 

            pushFollow(FOLLOW_block_instructions_in_func268);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            RB8=(Token)match(input,RB,FOLLOW_RB_in_func270); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
    public final BbParser.params_return params() throws RecognitionException {
        BbParser.params_return retval = new BbParser.params_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        BbParser.paramlist_return paramlist10 =null;


        BbTree char_literal9_tree=null;
        BbTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:11: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,LP,FOLLOW_LP_in_params290);  
            stream_LP.add(char_literal9);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 67 && LA2_0 <= 70)||(LA2_0 >= 74 && LA2_0 <= 76)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params292);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,RP,FOLLOW_RP_in_params295);  
            stream_RP.add(char_literal11);


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
            // 47:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:33: ^( PARAMS ( paramlist )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:42: ( paramlist )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:1: paramlist : param ( ',' ! param )* ;
    public final BbParser.paramlist_return paramlist() throws RecognitionException {
        BbParser.paramlist_return retval = new BbParser.paramlist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal13=null;
        BbParser.param_return param12 =null;

        BbParser.param_return param14 =null;


        BbTree char_literal13_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:10: ( param ( ',' ! param )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:12: param ( ',' ! param )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist321);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==64) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,64,FOLLOW_64_in_paramlist324); 

            	    pushFollow(FOLLOW_param_in_paramlist327);
            	    param14=param();

            	    state._fsp--;

            	    adaptor.addChild(root_0, param14.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:1: param : ( type ^ ID | notetype ^ NOTEID );
    public final BbParser.param_return param() throws RecognitionException {
        BbParser.param_return retval = new BbParser.param_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID16=null;
        Token NOTEID18=null;
        BbParser.type_return type15 =null;

        BbParser.notetype_return notetype17 =null;


        BbTree ID16_tree=null;
        BbTree NOTEID18_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:9: ( type ^ ID | notetype ^ NOTEID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= 74 && LA4_0 <= 76)) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= 67 && LA4_0 <= 70)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:13: type ^ ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_param352);
                    type15=type();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(type15.getTree(), root_0);

                    ID16=(Token)match(input,ID,FOLLOW_ID_in_param355); 
                    ID16_tree = 
                    (BbTree)adaptor.create(ID16)
                    ;
                    adaptor.addChild(root_0, ID16_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:57:13: notetype ^ NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notetype_in_param369);
                    notetype17=notetype();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(notetype17.getTree(), root_0);

                    NOTEID18=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_param372); 
                    NOTEID18_tree = 
                    (BbTree)adaptor.create(NOTEID18)
                    ;
                    adaptor.addChild(root_0, NOTEID18_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final BbParser.block_instructions_return block_instructions() throws RecognitionException {
        BbParser.block_instructions_return retval = new BbParser.block_instructions_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal20=null;
        BbParser.instruction_return instruction19 =null;

        BbParser.instruction_return instruction21 =null;


        BbTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions416);
            instruction19=instruction();

            state._fsp--;

            stream_instruction.add(instruction19.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:26: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==66) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:27: ';' instruction
            	    {
            	    char_literal20=(Token)match(input,66,FOLLOW_66_in_block_instructions419);  
            	    stream_66.add(char_literal20);


            	    pushFollow(FOLLOW_instruction_in_block_instructions421);
            	    instruction21=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // 62:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:62:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:66:1: instruction : ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed | instrument | volume | read | write |);
    public final BbParser.instruction_return instruction() throws RecognitionException {
        BbParser.instruction_return retval = new BbParser.instruction_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.assign_return assign22 =null;

        BbParser.ite_stmt_return ite_stmt23 =null;

        BbParser.while_stmt_return while_stmt24 =null;

        BbParser.for_stmt_return for_stmt25 =null;

        BbParser.funcall_return funcall26 =null;

        BbParser.return_stmt_return return_stmt27 =null;

        BbParser.playable_return playable28 =null;

        BbParser.speed_return speed29 =null;

        BbParser.instrument_return instrument30 =null;

        BbParser.volume_return volume31 =null;

        BbParser.read_return read32 =null;

        BbParser.write_return write33 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:9: ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed | instrument | volume | read | write |)
            int alt6=13;
            switch ( input.LA(1) ) {
            case 74:
            case 75:
            case 76:
                {
                alt6=1;
                }
                break;
            case ID:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EQ) ) {
                    alt6=1;
                }
                else if ( (LA6_2==LP) ) {
                    alt6=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;

                }
                }
                break;
            case NOTEID:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EQ) ) {
                    alt6=1;
                }
                else if ( (LA6_3==LP||LA6_3==RB||(LA6_3 >= 65 && LA6_3 <= 66)) ) {
                    alt6=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;

                }
                }
                break;
            case IF:
                {
                alt6=2;
                }
                break;
            case WHILE:
                {
                alt6=3;
                }
                break;
            case FOR:
                {
                alt6=4;
                }
                break;
            case RETURN:
                {
                alt6=6;
                }
                break;
            case LP:
            case PITCH:
            case QUIET:
            case 68:
            case 70:
            case 72:
                {
                alt6=7;
                }
                break;
            case 71:
                {
                alt6=8;
                }
                break;
            case INSTRUMENT:
                {
                alt6=9;
                }
                break;
            case VOL:
                {
                alt6=10;
                }
                break;
            case READ:
                {
                alt6=11;
                }
                break;
            case WRITE:
                {
                alt6=12;
                }
                break;
            case RB:
            case 66:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:13: assign
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction480);
                    assign22=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction504);
                    ite_stmt23=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt23.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction526);
                    while_stmt24=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt24.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:11: for_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction544);
                    for_stmt25=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt25.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:71:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction560);
                    funcall26=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall26.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction583);
                    return_stmt27=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt27.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction602);
                    playable28=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable28.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:74:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction621);
                    speed29=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed29.getTree());

                    }
                    break;
                case 9 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:75:11: instrument
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_instruction636);
                    instrument30=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument30.getTree());

                    }
                    break;
                case 10 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:11: volume
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_volume_in_instruction650);
                    volume31=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume31.getTree());

                    }
                    break;
                case 11 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:77:11: read
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction665);
                    read32=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read32.getTree());

                    }
                    break;
                case 12 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:12: write
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction690);
                    write33=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write33.getTree());

                    }
                    break;
                case 13 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:9: 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:83:1: assign : ( ( type )? ID EQ expr -> ^( ASSIGN ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) );
    public final BbParser.assign_return assign() throws RecognitionException {
        BbParser.assign_return retval = new BbParser.assign_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID35=null;
        Token EQ36=null;
        Token NOTEID38=null;
        Token EQ39=null;
        BbParser.type_return type34 =null;

        BbParser.expr_return expr37 =null;

        BbParser.musicnotation_return musicnotation40 =null;


        BbTree ID35_tree=null;
        BbTree EQ36_tree=null;
        BbTree NOTEID38_tree=null;
        BbTree EQ39_tree=null;
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_musicnotation=new RewriteRuleSubtreeStream(adaptor,"rule musicnotation");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:83:9: ( ( type )? ID EQ expr -> ^( ASSIGN ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||(LA8_0 >= 74 && LA8_0 <= 76)) ) {
                alt8=1;
            }
            else if ( (LA8_0==NOTEID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:83:13: ( type )? ID EQ expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:83:13: ( type )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0 >= 74 && LA7_0 <= 76)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:83:14: type
                            {
                            pushFollow(FOLLOW_type_in_assign752);
                            type34=type();

                            state._fsp--;

                            stream_type.add(type34.getTree());

                            }
                            break;

                    }


                    ID35=(Token)match(input,ID,FOLLOW_ID_in_assign756);  
                    stream_ID.add(ID35);


                    EQ36=(Token)match(input,EQ,FOLLOW_EQ_in_assign758);  
                    stream_EQ.add(EQ36);


                    pushFollow(FOLLOW_expr_in_assign760);
                    expr37=expr();

                    state._fsp--;

                    stream_expr.add(expr37.getTree());

                    // AST REWRITE
                    // elements: ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 83:32: -> ^( ASSIGN ID expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:83:35: ^( ASSIGN ID expr )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(ASSIGN, "ASSIGN")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:5: NOTEID EQ musicnotation
                    {
                    NOTEID38=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign776);  
                    stream_NOTEID.add(NOTEID38);


                    EQ39=(Token)match(input,EQ,FOLLOW_EQ_in_assign778);  
                    stream_EQ.add(EQ39);


                    pushFollow(FOLLOW_musicnotation_in_assign780);
                    musicnotation40=musicnotation();

                    state._fsp--;

                    stream_musicnotation.add(musicnotation40.getTree());

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
                    // 84:29: -> ^( NOTEASSIGN NOTEID musicnotation )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:32: ^( NOTEASSIGN NOTEID musicnotation )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:87:1: type : ( 'int' | 'bool' | 'void' );
    public final BbParser.type_return type() throws RecognitionException {
        BbParser.type_return retval = new BbParser.type_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set41=null;

        BbTree set41_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:87:6: ( 'int' | 'bool' | 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set41=(Token)input.LT(1);

            if ( (input.LA(1) >= 74 && input.LA(1) <= 76) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set41)
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:1: notetype : ( 'Note' | 'Chord' | 'Melody' | 'Poli' );
    public final BbParser.notetype_return notetype() throws RecognitionException {
        BbParser.notetype_return retval = new BbParser.notetype_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set42=null;

        BbTree set42_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:9: ( 'Note' | 'Chord' | 'Melody' | 'Poli' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set42=(Token)input.LT(1);

            if ( (input.LA(1) >= 67 && input.LA(1) <= 70) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set42)
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:98:1: musicnotation : ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| melodia | polifon | NOTEID );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal43=null;
        Token string_literal45=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token NOTEID51=null;
        BbParser.notabasica_return notabasica44 =null;

        BbParser.chord_return chord47 =null;

        BbParser.melodia_return melodia49 =null;

        BbParser.polifon_return polifon50 =null;


        BbTree string_literal43_tree=null;
        BbTree string_literal45_tree=null;
        BbTree char_literal46_tree=null;
        BbTree char_literal48_tree=null;
        BbTree NOTEID51_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:98:15: ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| melodia | polifon | NOTEID )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt9=1;
                }
                break;
            case 67:
                {
                alt9=2;
                }
                break;
            case 68:
                {
                alt9=3;
                }
                break;
            case 70:
                {
                alt9=4;
                }
                break;
            case NOTEID:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:98:17: 'Note' notabasica
                    {
                    string_literal43=(Token)match(input,69,FOLLOW_69_in_musicnotation917);  
                    stream_69.add(string_literal43);


                    pushFollow(FOLLOW_notabasica_in_musicnotation919);
                    notabasica44=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica44.getTree());

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
                    // 98:35: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:98:38: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:7: 'Chord' ! '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal45=(Token)match(input,67,FOLLOW_67_in_musicnotation935); 

                    char_literal46=(Token)match(input,LP,FOLLOW_LP_in_musicnotation938); 

                    pushFollow(FOLLOW_chord_in_musicnotation941);
                    chord47=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord47.getTree());

                    char_literal48=(Token)match(input,RP,FOLLOW_RP_in_musicnotation943); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:7: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_musicnotation952);
                    melodia49=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia49.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation960);
                    polifon50=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon50.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:102:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID51=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation968); 
                    NOTEID51_tree = 
                    (BbTree)adaptor.create(NOTEID51)
                    ;
                    adaptor.addChild(root_0, NOTEID51_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:1: ite_stmt : IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? ;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF52=null;
        Token LP53=null;
        Token RP55=null;
        Token LB56=null;
        Token RB58=null;
        Token ELSE59=null;
        Token LB60=null;
        Token RB62=null;
        BbParser.expr_return expr54 =null;

        BbParser.block_instructions_return block_instructions57 =null;

        BbParser.block_instructions_return block_instructions61 =null;


        BbTree IF52_tree=null;
        BbTree LP53_tree=null;
        BbTree RP55_tree=null;
        BbTree LB56_tree=null;
        BbTree RB58_tree=null;
        BbTree ELSE59_tree=null;
        BbTree LB60_tree=null;
        BbTree RB62_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:13: ( IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:17: IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)?
            {
            root_0 = (BbTree)adaptor.nil();


            IF52=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt988); 
            IF52_tree = 
            (BbTree)adaptor.create(IF52)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF52_tree, root_0);


            LP53=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt991); 

            pushFollow(FOLLOW_expr_in_ite_stmt994);
            expr54=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr54.getTree());

            RP55=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt996); 

            LB56=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt999); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1002);
            block_instructions57=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions57.getTree());

            RB58=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt1004); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:61: ( ELSE ! LB ! block_instructions RB !)?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:62: ELSE ! LB ! block_instructions RB !
                    {
                    ELSE59=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1008); 

                    LB60=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt1011); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1014);
                    block_instructions61=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions61.getTree());

                    RB62=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt1016); 

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
    // $ANTLR end "ite_stmt"


    public static class while_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "while_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:1: while_stmt : WHILE ^ LP ! expr RP ! LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE63=null;
        Token LP64=null;
        Token RP66=null;
        Token LB67=null;
        Token RB69=null;
        BbParser.expr_return expr65 =null;

        BbParser.block_instructions_return block_instructions68 =null;


        BbTree WHILE63_tree=null;
        BbTree LP64_tree=null;
        BbTree RP66_tree=null;
        BbTree LB67_tree=null;
        BbTree RB69_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:13: ( WHILE ^ LP ! expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:17: WHILE ^ LP ! expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE63=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1044); 
            WHILE63_tree = 
            (BbTree)adaptor.create(WHILE63)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE63_tree, root_0);


            LP64=(Token)match(input,LP,FOLLOW_LP_in_while_stmt1047); 

            pushFollow(FOLLOW_expr_in_while_stmt1050);
            expr65=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr65.getTree());

            RP66=(Token)match(input,RP,FOLLOW_RP_in_while_stmt1052); 

            LB67=(Token)match(input,LB,FOLLOW_LB_in_while_stmt1055); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1058);
            block_instructions68=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions68.getTree());

            RB69=(Token)match(input,RB,FOLLOW_RB_in_while_stmt1060); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:1: for_stmt : FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !;
    public final BbParser.for_stmt_return for_stmt() throws RecognitionException {
        BbParser.for_stmt_return retval = new BbParser.for_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token FOR70=null;
        Token LP71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token RP77=null;
        Token LB78=null;
        Token RB80=null;
        BbParser.assign_return assign72 =null;

        BbParser.expr_return expr74 =null;

        BbParser.assign_return assign76 =null;

        BbParser.block_instructions_return block_instructions79 =null;


        BbTree FOR70_tree=null;
        BbTree LP71_tree=null;
        BbTree char_literal73_tree=null;
        BbTree char_literal75_tree=null;
        BbTree RP77_tree=null;
        BbTree LB78_tree=null;
        BbTree RB80_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:11: ( FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:15: FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR70=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1098); 
            FOR70_tree = 
            (BbTree)adaptor.create(FOR70)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR70_tree, root_0);


            LP71=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1101); 

            pushFollow(FOLLOW_assign_in_for_stmt1104);
            assign72=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign72.getTree());

            char_literal73=(Token)match(input,66,FOLLOW_66_in_for_stmt1106); 

            pushFollow(FOLLOW_expr_in_for_stmt1109);
            expr74=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr74.getTree());

            char_literal75=(Token)match(input,66,FOLLOW_66_in_for_stmt1111); 

            pushFollow(FOLLOW_assign_in_for_stmt1114);
            assign76=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign76.getTree());

            RP77=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1116); 

            LB78=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1119); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1122);
            block_instructions79=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions79.getTree());

            RB80=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1124); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:1: return_stmt : RETURN ^ ( expr | musicnotation )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN81=null;
        BbParser.expr_return expr82 =null;

        BbParser.musicnotation_return musicnotation83 =null;


        BbTree RETURN81_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:13: ( RETURN ^ ( expr | musicnotation )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:17: RETURN ^ ( expr | musicnotation )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN81=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1149); 
            RETURN81_tree = 
            (BbTree)adaptor.create(RETURN81)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN81_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:25: ( expr | musicnotation )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==LP||LA11_0==MINUS||LA11_0==NOT||LA11_0==PLUS||LA11_0==TRUE) ) {
                alt11=1;
            }
            else if ( (LA11_0==NOTEID||(LA11_0 >= 67 && LA11_0 <= 70)) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:26: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1153);
                    expr82=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr82.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:33: musicnotation
                    {
                    pushFollow(FOLLOW_musicnotation_in_return_stmt1157);
                    musicnotation83=musicnotation();

                    state._fsp--;

                    adaptor.addChild(root_0, musicnotation83.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:1: playable : ( melodia | polifon | NOTEID -> ^( PLAYABLE NOTEID ) | notelist );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID86=null;
        BbParser.melodia_return melodia84 =null;

        BbParser.polifon_return polifon85 =null;

        BbParser.notelist_return notelist87 =null;


        BbTree NOTEID86_tree=null;
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:9: ( melodia | polifon | NOTEID -> ^( PLAYABLE NOTEID ) | notelist )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt12=1;
                }
                break;
            case 70:
                {
                alt12=2;
                }
                break;
            case NOTEID:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==RB||LA12_3==66) ) {
                    alt12=3;
                }
                else if ( (LA12_3==LP||LA12_3==65) ) {
                    alt12=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;

                }
                }
                break;
            case LP:
            case PITCH:
            case QUIET:
            case 72:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1176);
                    melodia84=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia84.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1188);
                    polifon85=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon85.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:11: NOTEID
                    {
                    NOTEID86=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1200);  
                    stream_NOTEID.add(NOTEID86);


                    // AST REWRITE
                    // elements: NOTEID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 125:18: -> ^( PLAYABLE NOTEID )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:21: ^( PLAYABLE NOTEID )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NOTEID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:126:11: notelist
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notelist_in_playable1220);
                    notelist87=notelist();

                    state._fsp--;

                    adaptor.addChild(root_0, notelist87.getTree());

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


    public static class read_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:1: read : READ ^ ID ;
    public final BbParser.read_return read() throws RecognitionException {
        BbParser.read_return retval = new BbParser.read_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token READ88=null;
        Token ID89=null;

        BbTree READ88_tree=null;
        BbTree ID89_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:6: ( READ ^ ID )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:8: READ ^ ID
            {
            root_0 = (BbTree)adaptor.nil();


            READ88=(Token)match(input,READ,FOLLOW_READ_in_read1247); 
            READ88_tree = 
            (BbTree)adaptor.create(READ88)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(READ88_tree, root_0);


            ID89=(Token)match(input,ID,FOLLOW_ID_in_read1250); 
            ID89_tree = 
            (BbTree)adaptor.create(ID89)
            ;
            adaptor.addChild(root_0, ID89_tree);


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
    // $ANTLR end "read"


    public static class write_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:135:1: write : WRITE ^ ( expr | STRING ) ;
    public final BbParser.write_return write() throws RecognitionException {
        BbParser.write_return retval = new BbParser.write_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WRITE90=null;
        Token STRING92=null;
        BbParser.expr_return expr91 =null;


        BbTree WRITE90_tree=null;
        BbTree STRING92_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:135:7: ( WRITE ^ ( expr | STRING ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:135:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (BbTree)adaptor.nil();


            WRITE90=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1270); 
            WRITE90_tree = 
            (BbTree)adaptor.create(WRITE90)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WRITE90_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:135:18: ( expr | STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==FALSE||LA13_0==ID||LA13_0==INT||LA13_0==LP||LA13_0==MINUS||LA13_0==NOT||LA13_0==PLUS||LA13_0==TRUE) ) {
                alt13=1;
            }
            else if ( (LA13_0==STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:135:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1274);
                    expr91=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr91.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:135:26: STRING
                    {
                    STRING92=(Token)match(input,STRING,FOLLOW_STRING_in_write1278); 
                    STRING92_tree = 
                    (BbTree)adaptor.create(STRING92)
                    ;
                    adaptor.addChild(root_0, STRING92_tree);


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
    // $ANTLR end "write"


    public static class instrument_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrument"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:1: instrument : INSTRUMENT ^ INT ;
    public final BbParser.instrument_return instrument() throws RecognitionException {
        BbParser.instrument_return retval = new BbParser.instrument_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INSTRUMENT93=null;
        Token INT94=null;

        BbTree INSTRUMENT93_tree=null;
        BbTree INT94_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:12: ( INSTRUMENT ^ INT )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:14: INSTRUMENT ^ INT
            {
            root_0 = (BbTree)adaptor.nil();


            INSTRUMENT93=(Token)match(input,INSTRUMENT,FOLLOW_INSTRUMENT_in_instrument1297); 
            INSTRUMENT93_tree = 
            (BbTree)adaptor.create(INSTRUMENT93)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(INSTRUMENT93_tree, root_0);


            INT94=(Token)match(input,INT,FOLLOW_INT_in_instrument1300); 
            INT94_tree = 
            (BbTree)adaptor.create(INT94)
            ;
            adaptor.addChild(root_0, INT94_tree);


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
    // $ANTLR end "instrument"


    public static class volume_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "volume"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:1: volume : VOL ^ INT ;
    public final BbParser.volume_return volume() throws RecognitionException {
        BbParser.volume_return retval = new BbParser.volume_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token VOL95=null;
        Token INT96=null;

        BbTree VOL95_tree=null;
        BbTree INT96_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:9: ( VOL ^ INT )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:11: VOL ^ INT
            {
            root_0 = (BbTree)adaptor.nil();


            VOL95=(Token)match(input,VOL,FOLLOW_VOL_in_volume1312); 
            VOL95_tree = 
            (BbTree)adaptor.create(VOL95)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(VOL95_tree, root_0);


            INT96=(Token)match(input,INT,FOLLOW_INT_in_volume1315); 
            INT96_tree = 
            (BbTree)adaptor.create(INT96)
            ;
            adaptor.addChild(root_0, INT96_tree);


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
    // $ANTLR end "volume"


    public static class melodia_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "melodia"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:1: melodia : 'Melody' '(' INT ( notelist )+ ')' -> ^( MELODY INT ( notelist )+ ) ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal97=null;
        Token char_literal98=null;
        Token INT99=null;
        Token char_literal101=null;
        BbParser.notelist_return notelist100 =null;


        BbTree string_literal97_tree=null;
        BbTree char_literal98_tree=null;
        BbTree INT99_tree=null;
        BbTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:8: ( 'Melody' '(' INT ( notelist )+ ')' -> ^( MELODY INT ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:10: 'Melody' '(' INT ( notelist )+ ')'
            {
            string_literal97=(Token)match(input,68,FOLLOW_68_in_melodia1323);  
            stream_68.add(string_literal97);


            char_literal98=(Token)match(input,LP,FOLLOW_LP_in_melodia1325);  
            stream_LP.add(char_literal98);


            INT99=(Token)match(input,INT,FOLLOW_INT_in_melodia1327);  
            stream_INT.add(INT99);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:27: ( notelist )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LP||LA14_0==NOTEID||LA14_0==PITCH||LA14_0==QUIET||LA14_0==72) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:27: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1329);
            	    notelist100=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist100.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            char_literal101=(Token)match(input,RP,FOLLOW_RP_in_melodia1332);  
            stream_RP.add(char_literal101);


            // AST REWRITE
            // elements: notelist, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 142:41: -> ^( MELODY INT ( notelist )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:44: ^( MELODY INT ( notelist )+ )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(MELODY, "MELODY")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:1: notelist : notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) ;
    public final BbParser.notelist_return notelist() throws RecognitionException {
        BbParser.notelist_return retval = new BbParser.notelist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal103=null;
        Token MUL105=null;
        BbParser.notas_return notas102 =null;

        BbParser.duration_return duration104 =null;


        BbTree char_literal103_tree=null;
        BbTree MUL105_tree=null;
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1359);
            notas102=notas();

            state._fsp--;

            stream_notas.add(notas102.getTree());

            char_literal103=(Token)match(input,65,FOLLOW_65_in_notelist1361);  
            stream_65.add(char_literal103);


            pushFollow(FOLLOW_duration_in_notelist1363);
            duration104=duration();

            state._fsp--;

            stream_duration.add(duration104.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:30: ( MUL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MUL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:30: MUL
                    {
                    MUL105=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1365);  
                    stream_MUL.add(MUL105);


                    }
                    break;

            }


            // AST REWRITE
            // elements: MUL, notas, duration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 145:35: -> ^( PLAYABLE notas duration ( MUL )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:38: ^( PLAYABLE notas duration ( MUL )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                , root_1);

                adaptor.addChild(root_1, stream_notas.nextTree());

                adaptor.addChild(root_1, stream_duration.nextTree());

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:145:64: ( MUL )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:1: notas : ( nota | '[' ! pack ']' !| '(' ! chord ')' !);
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal107=null;
        Token char_literal109=null;
        Token char_literal110=null;
        Token char_literal112=null;
        BbParser.nota_return nota106 =null;

        BbParser.pack_return pack108 =null;

        BbParser.chord_return chord111 =null;


        BbTree char_literal107_tree=null;
        BbTree char_literal109_tree=null;
        BbTree char_literal110_tree=null;
        BbTree char_literal112_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
            int alt16=3;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
            case QUIET:
                {
                alt16=1;
                }
                break;
            case 72:
                {
                alt16=2;
                }
                break;
            case LP:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1386);
                    nota106=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota106.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal107=(Token)match(input,72,FOLLOW_72_in_notas1395); 

                    pushFollow(FOLLOW_pack_in_notas1398);
                    pack108=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack108.getTree());

                    char_literal109=(Token)match(input,73,FOLLOW_73_in_notas1400); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:149:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal110=(Token)match(input,LP,FOLLOW_LP_in_notas1410); 

                    pushFollow(FOLLOW_chord_in_notas1413);
                    chord111=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord111.getTree());

                    char_literal112=(Token)match(input,RP,FOLLOW_RP_in_notas1415); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:1: nota : ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID114=null;
        Token char_literal115=null;
        Token PLUS116=null;
        Token char_literal118=null;
        Token QUIET119=null;
        BbParser.notabasica_return notabasica113 =null;

        BbParser.num_expr_return num_expr117 =null;


        BbTree NOTEID114_tree=null;
        BbTree char_literal115_tree=null;
        BbTree PLUS116_tree=null;
        BbTree char_literal118_tree=null;
        BbTree QUIET119_tree=null;
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET )
            int alt18=3;
            switch ( input.LA(1) ) {
            case PITCH:
                {
                alt18=1;
                }
                break;
            case NOTEID:
                {
                alt18=2;
                }
                break;
            case QUIET:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1434);
                    notabasica113=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica113.getTree());

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
                    // 152:19: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:22: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:4: NOTEID ( '(' ! PLUS ^ num_expr ')' !)?
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID114=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1448); 
                    NOTEID114_tree = 
                    (BbTree)adaptor.create(NOTEID114)
                    ;
                    adaptor.addChild(root_0, NOTEID114_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LP) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal115=(Token)match(input,LP,FOLLOW_LP_in_nota1452); 

                            PLUS116=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1455); 
                            PLUS116_tree = 
                            (BbTree)adaptor.create(PLUS116)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS116_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1458);
                            num_expr117=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr117.getTree());

                            char_literal118=(Token)match(input,RP,FOLLOW_RP_in_nota1460); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:4: QUIET
                    {
                    root_0 = (BbTree)adaptor.nil();


                    QUIET119=(Token)match(input,QUIET,FOLLOW_QUIET_in_nota1468); 
                    QUIET119_tree = 
                    (BbTree)adaptor.create(QUIET119)
                    ;
                    adaptor.addChild(root_0, QUIET119_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:1: chord : sub_chord -> ^( CHORD sub_chord ) ;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord120 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1480);
            sub_chord120=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord120.getTree());

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
            // 158:18: -> ^( CHORD sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:21: ^( CHORD sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:1: sub_chord : nota ( ',' ! ( nota ) )* ;
    public final BbParser.sub_chord_return sub_chord() throws RecognitionException {
        BbParser.sub_chord_return retval = new BbParser.sub_chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal122=null;
        BbParser.nota_return nota121 =null;

        BbParser.nota_return nota123 =null;


        BbTree char_literal122_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1498);
            nota121=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota121.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:17: ( ',' ! ( nota ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==64) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:19: ',' ! ( nota )
            	    {
            	    char_literal122=(Token)match(input,64,FOLLOW_64_in_sub_chord1502); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:161:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1506);
            	    nota123=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota123.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:1: pack : sub_chord -> ^( PACK sub_chord ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord124 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1519);
            sub_chord124=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord124.getTree());

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
            // 164:17: -> ^( PACK sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:20: ^( PACK sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:1: duration : ( INT | '(' ! num_expr ')' !);
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT125=null;
        Token char_literal126=null;
        Token char_literal128=null;
        BbParser.num_expr_return num_expr127 =null;


        BbTree INT125_tree=null;
        BbTree char_literal126_tree=null;
        BbTree char_literal128_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:9: ( INT | '(' ! num_expr ')' !)
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==LP) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT125=(Token)match(input,INT,FOLLOW_INT_in_duration1538); 
                    INT125_tree = 
                    (BbTree)adaptor.create(INT125)
                    ;
                    adaptor.addChild(root_0, INT125_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal126=(Token)match(input,LP,FOLLOW_LP_in_duration1547); 

                    pushFollow(FOLLOW_num_expr_in_duration1550);
                    num_expr127=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr127.getTree());

                    char_literal128=(Token)match(input,RP,FOLLOW_RP_in_duration1552); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:1: polifon : 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) ;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal129=null;
        Token LB130=null;
        Token RB132=null;
        BbParser.voices_return voices131 =null;


        BbTree string_literal129_tree=null;
        BbTree LB130_tree=null;
        BbTree RB132_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:9: ( 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:11: 'Poli' LB ( voices )+ RB
            {
            string_literal129=(Token)match(input,70,FOLLOW_70_in_polifon1566);  
            stream_70.add(string_literal129);


            LB130=(Token)match(input,LB,FOLLOW_LB_in_polifon1568);  
            stream_LB.add(LB130);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:21: ( voices )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==NOTEID||LA21_0==68) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:21: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1570);
            	    voices131=voices();

            	    state._fsp--;

            	    stream_voices.add(voices131.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            RB132=(Token)match(input,RB,FOLLOW_RB_in_polifon1573);  
            stream_RB.add(RB132);


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
            // 172:32: -> ^( POLIFONE ( voices )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:35: ^( POLIFONE ( voices )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:1: voices : ( melodia '|' !| NOTEID '|' !);
    public final BbParser.voices_return voices() throws RecognitionException {
        BbParser.voices_return retval = new BbParser.voices_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal134=null;
        Token NOTEID135=null;
        Token char_literal136=null;
        BbParser.melodia_return melodia133 =null;


        BbTree char_literal134_tree=null;
        BbTree NOTEID135_tree=null;
        BbTree char_literal136_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:7: ( melodia '|' !| NOTEID '|' !)
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==68) ) {
                alt22=1;
            }
            else if ( (LA22_0==NOTEID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:9: melodia '|' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_voices1606);
                    melodia133=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia133.getTree());

                    char_literal134=(Token)match(input,77,FOLLOW_77_in_voices1608); 

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:4: NOTEID '|' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID135=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_voices1614); 
                    NOTEID135_tree = 
                    (BbTree)adaptor.create(NOTEID135)
                    ;
                    adaptor.addChild(root_0, NOTEID135_tree);


                    char_literal136=(Token)match(input,77,FOLLOW_77_in_voices1617); 

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
    // $ANTLR end "voices"


    public static class speed_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:1: speed : 'Speed' num_expr -> ^( SPEED num_expr ) ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal137=null;
        BbParser.num_expr_return num_expr138 =null;


        BbTree string_literal137_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:7: ( 'Speed' num_expr -> ^( SPEED num_expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:9: 'Speed' num_expr
            {
            string_literal137=(Token)match(input,71,FOLLOW_71_in_speed1629);  
            stream_71.add(string_literal137);


            pushFollow(FOLLOW_num_expr_in_speed1631);
            num_expr138=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr138.getTree());

            // AST REWRITE
            // elements: num_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 179:26: -> ^( SPEED num_expr )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:29: ^( SPEED num_expr )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(SPEED, "SPEED")
                , root_1);

                adaptor.addChild(root_1, stream_num_expr.nextTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:1: expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR140=null;
        BbParser.boolterm_return boolterm139 =null;

        BbParser.boolterm_return boolterm141 =null;


        BbTree OR140_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:6: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1648);
            boolterm139=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm139.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:17: ( OR ^ boolterm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:18: OR ^ boolterm
            	    {
            	    OR140=(Token)match(input,OR,FOLLOW_OR_in_expr1651); 
            	    OR140_tree = 
            	    (BbTree)adaptor.create(OR140)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR140_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1654);
            	    boolterm141=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm141.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND143=null;
        BbParser.boolfact_return boolfact142 =null;

        BbParser.boolfact_return boolfact144 =null;


        BbTree AND143_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1665);
            boolfact142=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact142.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:22: ( AND ^ boolfact )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:23: AND ^ boolfact
            	    {
            	    AND143=(Token)match(input,AND,FOLLOW_AND_in_boolterm1668); 
            	    AND143_tree = 
            	    (BbTree)adaptor.create(AND143)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND143_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1671);
            	    boolfact144=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact144.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ146=null;
        Token NEQ147=null;
        Token LT148=null;
        Token LE149=null;
        Token GT150=null;
        Token GE151=null;
        BbParser.num_expr_return num_expr145 =null;

        BbParser.num_expr_return num_expr152 =null;


        BbTree EQ146_tree=null;
        BbTree NEQ147_tree=null;
        BbTree LT148_tree=null;
        BbTree LE149_tree=null;
        BbTree GT150_tree=null;
        BbTree GE151_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1691);
            num_expr145=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr145.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQ||(LA26_0 >= GE && LA26_0 <= GT)||LA26_0==LE||LA26_0==LT||LA26_0==NEQ) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
                    int alt25=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt25=1;
                        }
                        break;
                    case NEQ:
                        {
                        alt25=2;
                        }
                        break;
                    case LT:
                        {
                        alt25=3;
                        }
                        break;
                    case LE:
                        {
                        alt25=4;
                        }
                        break;
                    case GT:
                        {
                        alt25=5;
                        }
                        break;
                    case GE:
                        {
                        alt25=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }

                    switch (alt25) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:24: EQ ^
                            {
                            EQ146=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1695); 
                            EQ146_tree = 
                            (BbTree)adaptor.create(EQ146)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ146_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:30: NEQ ^
                            {
                            NEQ147=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1700); 
                            NEQ147_tree = 
                            (BbTree)adaptor.create(NEQ147)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ147_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:37: LT ^
                            {
                            LT148=(Token)match(input,LT,FOLLOW_LT_in_boolfact1705); 
                            LT148_tree = 
                            (BbTree)adaptor.create(LT148)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT148_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:43: LE ^
                            {
                            LE149=(Token)match(input,LE,FOLLOW_LE_in_boolfact1710); 
                            LE149_tree = 
                            (BbTree)adaptor.create(LE149)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE149_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:49: GT ^
                            {
                            GT150=(Token)match(input,GT,FOLLOW_GT_in_boolfact1715); 
                            GT150_tree = 
                            (BbTree)adaptor.create(GT150)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT150_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:55: GE ^
                            {
                            GE151=(Token)match(input,GE,FOLLOW_GE_in_boolfact1720); 
                            GE151_tree = 
                            (BbTree)adaptor.create(GE151)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE151_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1724);
                    num_expr152=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr152.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS154=null;
        Token MINUS155=null;
        BbParser.term_return term153 =null;

        BbParser.term_return term156 =null;


        BbTree PLUS154_tree=null;
        BbTree MINUS155_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1744);
            term153=term();

            state._fsp--;

            adaptor.addChild(root_0, term153.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:18: ( ( PLUS ^| MINUS ^) term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS||LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: ( PLUS ^| MINUS ^)
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==PLUS) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==MINUS) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:21: PLUS ^
            	            {
            	            PLUS154=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1749); 
            	            PLUS154_tree = 
            	            (BbTree)adaptor.create(PLUS154)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS154_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:29: MINUS ^
            	            {
            	            MINUS155=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1754); 
            	            MINUS155_tree = 
            	            (BbTree)adaptor.create(MINUS155)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS155_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1758);
            	    term156=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term156.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL158=null;
        Token DIV159=null;
        Token MOD160=null;
        BbParser.factor_return factor157 =null;

        BbParser.factor_return factor161 =null;


        BbTree MUL158_tree=null;
        BbTree DIV159_tree=null;
        BbTree MOD160_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1782);
            factor157=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor157.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DIV||(LA30_0 >= MOD && LA30_0 <= MUL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:23: MUL ^
            	            {
            	            MUL158=(Token)match(input,MUL,FOLLOW_MUL_in_term1787); 
            	            MUL158_tree = 
            	            (BbTree)adaptor.create(MUL158)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL158_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:30: DIV ^
            	            {
            	            DIV159=(Token)match(input,DIV,FOLLOW_DIV_in_term1792); 
            	            DIV159_tree = 
            	            (BbTree)adaptor.create(DIV159)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV159_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:37: MOD ^
            	            {
            	            MOD160=(Token)match(input,MOD,FOLLOW_MOD_in_term1797); 
            	            MOD160_tree = 
            	            (BbTree)adaptor.create(MOD160)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD160_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1802);
            	    factor161=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor161.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT162=null;
        Token PLUS163=null;
        Token MINUS164=null;
        BbParser.atom_return atom165 =null;


        BbTree NOT162_tree=null;
        BbTree PLUS163_tree=null;
        BbTree MINUS164_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt31=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt31=1;
                    }
                    break;
                case PLUS:
                    {
                    alt31=2;
                    }
                    break;
                case MINUS:
                    {
                    alt31=3;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:14: NOT ^
                    {
                    NOT162=(Token)match(input,NOT,FOLLOW_NOT_in_factor1825); 
                    NOT162_tree = 
                    (BbTree)adaptor.create(NOT162)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT162_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:21: PLUS ^
                    {
                    PLUS163=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1830); 
                    PLUS163_tree = 
                    (BbTree)adaptor.create(PLUS163)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS163_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:29: MINUS ^
                    {
                    MINUS164=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1835); 
                    MINUS164_tree = 
                    (BbTree)adaptor.create(MINUS164)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS164_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1840);
            atom165=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom165.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID166=null;
        Token INT167=null;
        Token char_literal169=null;
        Token char_literal171=null;
        BbParser.funcall_return funcall168 =null;

        BbParser.expr_return expr170 =null;


        BbTree b_tree=null;
        BbTree ID166_tree=null;
        BbTree INT167_tree=null;
        BbTree char_literal169_tree=null;
        BbTree char_literal171_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt33=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LP) ) {
                    alt33=4;
                }
                else if ( (LA33_1==AND||LA33_1==DIV||LA33_1==EQ||(LA33_1 >= GE && LA33_1 <= GT)||LA33_1==LE||LA33_1==LT||(LA33_1 >= MINUS && LA33_1 <= NEQ)||LA33_1==OR||LA33_1==PLUS||LA33_1==RB||LA33_1==RP||LA33_1==64||LA33_1==66) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt33=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt33=3;
                }
                break;
            case LP:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID166=(Token)match(input,ID,FOLLOW_ID_in_atom1865); 
                    ID166_tree = 
                    (BbTree)adaptor.create(ID166)
                    ;
                    adaptor.addChild(root_0, ID166_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:203:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT167=(Token)match(input,INT,FOLLOW_INT_in_atom1879); 
                    INT167_tree = 
                    (BbTree)adaptor.create(INT167)
                    ;
                    adaptor.addChild(root_0, INT167_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:13: (b= TRUE |b= FALSE )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==TRUE) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==FALSE) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1896);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1902);  
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
                    // 204:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:205:11: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1923);
                    funcall168=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall168.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:13: '(' ! expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal169=(Token)match(input,LP,FOLLOW_LP_in_atom1937); 

                    pushFollow(FOLLOW_expr_in_atom1940);
                    expr170=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr170.getTree());

                    char_literal171=(Token)match(input,RP,FOLLOW_RP_in_atom1942); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID172=null;
        Token char_literal173=null;
        Token char_literal175=null;
        BbParser.expr_list_return expr_list174 =null;


        BbTree ID172_tree=null;
        BbTree char_literal173_tree=null;
        BbTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:13: ID '(' ( expr_list )? ')'
            {
            ID172=(Token)match(input,ID,FOLLOW_ID_in_funcall1962);  
            stream_ID.add(ID172);


            char_literal173=(Token)match(input,LP,FOLLOW_LP_in_funcall1964);  
            stream_LP.add(char_literal173);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:20: ( expr_list )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==FALSE||LA34_0==ID||LA34_0==INT||LA34_0==LP||LA34_0==MINUS||LA34_0==NOT||LA34_0==PLUS||LA34_0==TRUE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1966);
                    expr_list174=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list174.getTree());

                    }
                    break;

            }


            char_literal175=(Token)match(input,RP,FOLLOW_RP_in_funcall1969);  
            stream_RP.add(char_literal175);


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
            // 209:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal177=null;
        BbParser.expr_return expr176 =null;

        BbParser.expr_return expr178 =null;


        BbTree char_literal177_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list2002);
            expr176=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr176.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:18: ( ',' ! expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==64) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:213:19: ',' ! expr
            	    {
            	    char_literal177=(Token)match(input,64,FOLLOW_64_in_expr_list2005); 

            	    pushFollow(FOLLOW_expr_in_expr_list2008);
            	    expr178=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr178.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:1: notabasica : PITCH ( ALT )? ( INT )? ;
    public final BbParser.notabasica_return notabasica() throws RecognitionException {
        BbParser.notabasica_return retval = new BbParser.notabasica_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PITCH179=null;
        Token ALT180=null;
        Token INT181=null;

        BbTree PITCH179_tree=null;
        BbTree ALT180_tree=null;
        BbTree INT181_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:12: ( PITCH ( ALT )? ( INT )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:14: PITCH ( ALT )? ( INT )?
            {
            root_0 = (BbTree)adaptor.nil();


            PITCH179=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica2027); 
            PITCH179_tree = 
            (BbTree)adaptor.create(PITCH179)
            ;
            adaptor.addChild(root_0, PITCH179_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:20: ( ALT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ALT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:20: ALT
                    {
                    ALT180=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica2029); 
                    ALT180_tree = 
                    (BbTree)adaptor.create(ALT180)
                    ;
                    adaptor.addChild(root_0, ALT180_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:25: ( INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:25: INT
                    {
                    INT181=(Token)match(input,INT,FOLLOW_INT_in_notabasica2032); 
                    INT181_tree = 
                    (BbTree)adaptor.create(INT181)
                    ;
                    adaptor.addChild(root_0, INT181_tree);


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


 

    public static final BitSet FOLLOW_func_in_prog225 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EOF_in_prog228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func258 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_func261 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_func263 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_func265 = new BitSet(new long[]{0x7034110041610000L,0x0000000000001DD4L});
    public static final BitSet FOLLOW_block_instructions_in_func268 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_func270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params290 = new BitSet(new long[]{0x0040000000000000L,0x0000000000001C78L});
    public static final BitSet FOLLOW_paramlist_in_params292 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_params295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist321 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_paramlist324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C78L});
    public static final BitSet FOLLOW_param_in_paramlist327 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_param352 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_param369 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOTEID_in_param372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_block_instructions419 = new BitSet(new long[]{0x7034110041610000L,0x0000000000001DD4L});
    public static final BitSet FOLLOW_instruction_in_block_instructions421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_assign_in_instruction480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_instruction636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_instruction650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign752 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_assign756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign758 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_assign760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_assign776 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign778 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_musicnotation_in_assign780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_musicnotation917 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_notabasica_in_musicnotation919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_musicnotation935 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation938 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation941 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_musicnotation952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt988 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt991 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt994 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt996 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt999 = new BitSet(new long[]{0x7034110041610000L,0x0000000000001DD4L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1002 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt1004 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1008 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt1011 = new BitSet(new long[]{0x7034110041610000L,0x0000000000001DD4L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1014 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1044 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt1047 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1050 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt1052 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt1055 = new BitSet(new long[]{0x7034110041610000L,0x0000000000001DD4L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1058 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1098 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1101 = new BitSet(new long[]{0x0000010000200000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_assign_in_for_stmt1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_stmt1106 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_stmt1111 = new BitSet(new long[]{0x0000010000200000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_assign_in_for_stmt1114 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1116 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1119 = new BitSet(new long[]{0x7034110041610000L,0x0000000000001DD4L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1122 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1149 = new BitSet(new long[]{0x0400412242208002L,0x0000000000000078L});
    public static final BitSet FOLLOW_expr_in_return_stmt1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_return_stmt1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_playable1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1247 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_read1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1270 = new BitSet(new long[]{0x0500402242208000L});
    public static final BitSet FOLLOW_expr_in_write1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUMENT_in_instrument1297 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_instrument1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOL_in_volume1312 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_volume1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_melodia1323 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_melodia1325 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_melodia1327 = new BitSet(new long[]{0x0004110040000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_notelist_in_melodia1329 = new BitSet(new long[]{0x0044110040000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RP_in_melodia1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notas_in_notelist1359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_notelist1361 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_duration_in_notelist1363 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_notas1395 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_pack_in_notas1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_notas1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1410 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_chord_in_notas1413 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1448 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LP_in_nota1452 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1455 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_nota1458 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIET_in_nota1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_sub_chord1502 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1506 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_sub_chord_in_pack1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1547 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_duration1550 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_polifon1566 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_polifon1568 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_voices_in_polifon1570 = new BitSet(new long[]{0x0008010000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RB_in_polifon1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_voices1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_voices1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_voices1614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_voices1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_speed1629 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_speed1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1648 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OR_in_expr1651 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_boolterm_in_expr1654 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1665 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1668 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1671 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1691 = new BitSet(new long[]{0x0000001088182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1695 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1700 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_LT_in_boolfact1705 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_LE_in_boolfact1710 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_GT_in_boolfact1715 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_GE_in_boolfact1720 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1744 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1749 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1754 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_term_in_num_expr1758 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_factor_in_term1782 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_MUL_in_term1787 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_DIV_in_term1792 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_MOD_in_term1797 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_factor_in_term1802 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_NOT_in_factor1825 = new BitSet(new long[]{0x0400000042208000L});
    public static final BitSet FOLLOW_PLUS_in_factor1830 = new BitSet(new long[]{0x0400000042208000L});
    public static final BitSet FOLLOW_MINUS_in_factor1835 = new BitSet(new long[]{0x0400000042208000L});
    public static final BitSet FOLLOW_atom_in_factor1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1937 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_atom1940 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1962 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_funcall1964 = new BitSet(new long[]{0x0440402242208000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1966 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list2002 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_expr_list2005 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_expr_list2008 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_PITCH_in_notabasica2027 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_ALT_in_notabasica2029 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_INT_in_notabasica2032 = new BitSet(new long[]{0x0000000000000002L});

}