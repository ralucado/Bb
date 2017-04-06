// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 01:10:16

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "BOOLEAN", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "INTASSIGN", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MINUS", "MOD", "MUL", "NEQ", "NEWLINE", "NOT", "NOTA", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "RB", "RETURN", "RP", "THEN", "TRUE", "VOICE", "WHILE", "WS", "'&'", "','", "'.'", "';'", "'Ensemble'", "'Melody'", "'Note'", "'Notes'", "'Playable'", "'Poli'", "'int'", "'|'"
    };

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
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int BOOLEAN=6;
    public static final int COMMENT=7;
    public static final int DIV=8;
    public static final int ELSE=9;
    public static final int EQ=10;
    public static final int ESC_SEQ=11;
    public static final int FALSE=12;
    public static final int FUNC=13;
    public static final int FUNCALL=14;
    public static final int GE=15;
    public static final int GT=16;
    public static final int ID=17;
    public static final int IF=18;
    public static final int INT=19;
    public static final int INTASSIGN=20;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:30:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:30:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:30:11: ( func )+ EOF
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:30:11: ( func )+
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
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:30:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog160);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog163);  
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
            // 30:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:30:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:34:1: func : FUNC ^ ID LB ! params block_instructions RB !;
    public final BbParser.func_return func() throws RecognitionException {
        BbParser.func_return retval = new BbParser.func_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token FUNC3=null;
        Token ID4=null;
        Token LB5=null;
        Token RB8=null;
        BbParser.params_return params6 =null;

        BbParser.block_instructions_return block_instructions7 =null;


        BbTree FUNC3_tree=null;
        BbTree ID4_tree=null;
        BbTree LB5_tree=null;
        BbTree RB8_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:34:9: ( FUNC ^ ID LB ! params block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:34:11: FUNC ^ ID LB ! params block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func193); 
            FUNC3_tree = 
            (BbTree)adaptor.create(FUNC3)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func196); 
            ID4_tree = 
            (BbTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            LB5=(Token)match(input,LB,FOLLOW_LB_in_func198); 

            pushFollow(FOLLOW_params_in_func201);
            params6=params();

            state._fsp--;

            adaptor.addChild(root_0, params6.getTree());

            pushFollow(FOLLOW_block_instructions_in_func203);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            RB8=(Token)match(input,RB,FOLLOW_RB_in_func205); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:11: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,LP,FOLLOW_LP_in_params225);  
            stream_LP.add(char_literal9);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID||LA2_0==47) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params227);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,RP,FOLLOW_RP_in_params230);  
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
            // 38:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:33: ^( PARAMS ( paramlist )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:38:42: ( paramlist )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:1: paramlist : param ( ',' ! param )* ;
    public final BbParser.paramlist_return paramlist() throws RecognitionException {
        BbParser.paramlist_return retval = new BbParser.paramlist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal13=null;
        BbParser.param_return param12 =null;

        BbParser.param_return param14 =null;


        BbTree char_literal13_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:10: ( param ( ',' ! param )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:12: param ( ',' ! param )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist256);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:42:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,48,FOLLOW_48_in_paramlist259); 

            	    pushFollow(FOLLOW_param_in_paramlist262);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:1: param : ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) );
    public final BbParser.param_return param() throws RecognitionException {
        BbParser.param_return retval = new BbParser.param_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token id=null;
        Token char_literal15=null;

        BbTree id_tree=null;
        BbTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:9: ( '&' id= ID -> ^( PREF[$id,$id.text] ) |id= ID -> ^( PVALUE[$id,$id.text] ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( (LA4_0==ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:13: '&' id= ID
                    {
                    char_literal15=(Token)match(input,47,FOLLOW_47_in_param287);  
                    stream_47.add(char_literal15);


                    id=(Token)match(input,ID,FOLLOW_ID_in_param291);  
                    stream_ID.add(id);


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
                    // 47:23: -> ^( PREF[$id,$id.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:26: ^( PREF[$id,$id.text] )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:48:13: id= ID
                    {
                    id=(Token)match(input,ID,FOLLOW_ID_in_param314);  
                    stream_ID.add(id);


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
                    // 48:19: -> ^( PVALUE[$id,$id.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:48:22: ^( PVALUE[$id,$id.text] )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

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
    // $ANTLR end "param"


    public static class block_instructions_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block_instructions"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final BbParser.block_instructions_return block_instructions() throws RecognitionException {
        BbParser.block_instructions_return retval = new BbParser.block_instructions_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal17=null;
        BbParser.instruction_return instruction16 =null;

        BbParser.instruction_return instruction18 =null;


        BbTree char_literal17_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:52:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:52:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions365);
            instruction16=instruction();

            state._fsp--;

            stream_instruction.add(instruction16.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:52:26: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==50) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:52:27: ';' instruction
            	    {
            	    char_literal17=(Token)match(input,50,FOLLOW_50_in_block_instructions368);  
            	    stream_50.add(char_literal17);


            	    pushFollow(FOLLOW_instruction_in_block_instructions370);
            	    instruction18=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction18.getTree());

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
            // 53:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:53:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:57:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | playable |);
    public final BbParser.instruction_return instruction() throws RecognitionException {
        BbParser.instruction_return retval = new BbParser.instruction_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.assign_return assign19 =null;

        BbParser.ite_stmt_return ite_stmt20 =null;

        BbParser.while_stmt_return while_stmt21 =null;

        BbParser.funcall_return funcall22 =null;

        BbParser.return_stmt_return return_stmt23 =null;

        BbParser.playable_return playable24 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:58:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | playable |)
            int alt6=7;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 57:
                {
                alt6=1;
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
            case ID:
                {
                alt6=4;
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case LP:
            case NOTA:
            case 56:
                {
                alt6=6;
                }
                break;
            case ELSE:
            case RB:
            case 50:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:58:13: assign
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction429);
                    assign19=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign19.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:59:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction453);
                    ite_stmt20=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt20.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction475);
                    while_stmt21=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt21.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction495);
                    funcall22=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall22.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:62:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction518);
                    return_stmt23=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt23.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction537);
                    playable24=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable24.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:65:9: 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:1: assign : ( 'int' ID eq= EQ expr -> ^( INTASSIGN[$eq,\":=\"] ID expr ) | 'Note' ID EQ | 'Notes' ID EQ | 'Playable' ID EQ | 'Melody' ID EQ | 'Ensemble' ID EQ );
    public final BbParser.assign_return assign() throws RecognitionException {
        BbParser.assign_return retval = new BbParser.assign_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token eq=null;
        Token string_literal25=null;
        Token ID26=null;
        Token string_literal28=null;
        Token ID29=null;
        Token EQ30=null;
        Token string_literal31=null;
        Token ID32=null;
        Token EQ33=null;
        Token string_literal34=null;
        Token ID35=null;
        Token EQ36=null;
        Token string_literal37=null;
        Token ID38=null;
        Token EQ39=null;
        Token string_literal40=null;
        Token ID41=null;
        Token EQ42=null;
        BbParser.expr_return expr27 =null;


        BbTree eq_tree=null;
        BbTree string_literal25_tree=null;
        BbTree ID26_tree=null;
        BbTree string_literal28_tree=null;
        BbTree ID29_tree=null;
        BbTree EQ30_tree=null;
        BbTree string_literal31_tree=null;
        BbTree ID32_tree=null;
        BbTree EQ33_tree=null;
        BbTree string_literal34_tree=null;
        BbTree ID35_tree=null;
        BbTree EQ36_tree=null;
        BbTree string_literal37_tree=null;
        BbTree ID38_tree=null;
        BbTree EQ39_tree=null;
        BbTree string_literal40_tree=null;
        BbTree ID41_tree=null;
        BbTree EQ42_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:9: ( 'int' ID eq= EQ expr -> ^( INTASSIGN[$eq,\":=\"] ID expr ) | 'Note' ID EQ | 'Notes' ID EQ | 'Playable' ID EQ | 'Melody' ID EQ | 'Ensemble' ID EQ )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt7=1;
                }
                break;
            case 53:
                {
                alt7=2;
                }
                break;
            case 54:
                {
                alt7=3;
                }
                break;
            case 55:
                {
                alt7=4;
                }
                break;
            case 52:
                {
                alt7=5;
                }
                break;
            case 51:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:13: 'int' ID eq= EQ expr
                    {
                    string_literal25=(Token)match(input,57,FOLLOW_57_in_assign595);  
                    stream_57.add(string_literal25);


                    ID26=(Token)match(input,ID,FOLLOW_ID_in_assign597);  
                    stream_ID.add(ID26);


                    eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign601);  
                    stream_EQ.add(eq);


                    pushFollow(FOLLOW_expr_in_assign603);
                    expr27=expr();

                    state._fsp--;

                    stream_expr.add(expr27.getTree());

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
                    // 68:33: -> ^( INTASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:36: ^( INTASSIGN[$eq,\":=\"] ID expr )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(INTASSIGN, eq, ":=")
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:70: 'Note' ID EQ
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal28=(Token)match(input,53,FOLLOW_53_in_assign619); 
                    string_literal28_tree = 
                    (BbTree)adaptor.create(string_literal28)
                    ;
                    adaptor.addChild(root_0, string_literal28_tree);


                    ID29=(Token)match(input,ID,FOLLOW_ID_in_assign621); 
                    ID29_tree = 
                    (BbTree)adaptor.create(ID29)
                    ;
                    adaptor.addChild(root_0, ID29_tree);


                    EQ30=(Token)match(input,EQ,FOLLOW_EQ_in_assign623); 
                    EQ30_tree = 
                    (BbTree)adaptor.create(EQ30)
                    ;
                    adaptor.addChild(root_0, EQ30_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:13: 'Notes' ID EQ
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal31=(Token)match(input,54,FOLLOW_54_in_assign638); 
                    string_literal31_tree = 
                    (BbTree)adaptor.create(string_literal31)
                    ;
                    adaptor.addChild(root_0, string_literal31_tree);


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_assign640); 
                    ID32_tree = 
                    (BbTree)adaptor.create(ID32)
                    ;
                    adaptor.addChild(root_0, ID32_tree);


                    EQ33=(Token)match(input,EQ,FOLLOW_EQ_in_assign642); 
                    EQ33_tree = 
                    (BbTree)adaptor.create(EQ33)
                    ;
                    adaptor.addChild(root_0, EQ33_tree);


                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:13: 'Playable' ID EQ
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal34=(Token)match(input,55,FOLLOW_55_in_assign657); 
                    string_literal34_tree = 
                    (BbTree)adaptor.create(string_literal34)
                    ;
                    adaptor.addChild(root_0, string_literal34_tree);


                    ID35=(Token)match(input,ID,FOLLOW_ID_in_assign659); 
                    ID35_tree = 
                    (BbTree)adaptor.create(ID35)
                    ;
                    adaptor.addChild(root_0, ID35_tree);


                    EQ36=(Token)match(input,EQ,FOLLOW_EQ_in_assign661); 
                    EQ36_tree = 
                    (BbTree)adaptor.create(EQ36)
                    ;
                    adaptor.addChild(root_0, EQ36_tree);


                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:71:13: 'Melody' ID EQ
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal37=(Token)match(input,52,FOLLOW_52_in_assign676); 
                    string_literal37_tree = 
                    (BbTree)adaptor.create(string_literal37)
                    ;
                    adaptor.addChild(root_0, string_literal37_tree);


                    ID38=(Token)match(input,ID,FOLLOW_ID_in_assign678); 
                    ID38_tree = 
                    (BbTree)adaptor.create(ID38)
                    ;
                    adaptor.addChild(root_0, ID38_tree);


                    EQ39=(Token)match(input,EQ,FOLLOW_EQ_in_assign680); 
                    EQ39_tree = 
                    (BbTree)adaptor.create(EQ39)
                    ;
                    adaptor.addChild(root_0, EQ39_tree);


                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:13: 'Ensemble' ID EQ
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal40=(Token)match(input,51,FOLLOW_51_in_assign694); 
                    string_literal40_tree = 
                    (BbTree)adaptor.create(string_literal40)
                    ;
                    adaptor.addChild(root_0, string_literal40_tree);


                    ID41=(Token)match(input,ID,FOLLOW_ID_in_assign696); 
                    ID41_tree = 
                    (BbTree)adaptor.create(ID41)
                    ;
                    adaptor.addChild(root_0, ID41_tree);


                    EQ42=(Token)match(input,EQ,FOLLOW_EQ_in_assign698); 
                    EQ42_tree = 
                    (BbTree)adaptor.create(EQ42)
                    ;
                    adaptor.addChild(root_0, EQ42_tree);


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


    public static class ite_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:1: ite_stmt : IF ^ LP ! expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF43=null;
        Token LP44=null;
        Token RP46=null;
        Token LB47=null;
        Token ELSE49=null;
        Token RB51=null;
        BbParser.expr_return expr45 =null;

        BbParser.block_instructions_return block_instructions48 =null;

        BbParser.block_instructions_return block_instructions50 =null;


        BbTree IF43_tree=null;
        BbTree LP44_tree=null;
        BbTree RP46_tree=null;
        BbTree LB47_tree=null;
        BbTree ELSE49_tree=null;
        BbTree RB51_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:13: ( IF ^ LP ! expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:17: IF ^ LP ! expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !
            {
            root_0 = (BbTree)adaptor.nil();


            IF43=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt721); 
            IF43_tree = 
            (BbTree)adaptor.create(IF43)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF43_tree, root_0);


            LP44=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt724); 

            pushFollow(FOLLOW_expr_in_ite_stmt727);
            expr45=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr45.getTree());

            RP46=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt729); 

            LB47=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt732); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt735);
            block_instructions48=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions48.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:57: ( ELSE ! block_instructions )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ELSE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:58: ELSE ! block_instructions
                    {
                    ELSE49=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt738); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt741);
                    block_instructions50=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions50.getTree());

                    }
                    break;

            }


            RB51=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt745); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:1: while_stmt : WHILE ^ expr LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE52=null;
        Token LB54=null;
        Token RB56=null;
        BbParser.expr_return expr53 =null;

        BbParser.block_instructions_return block_instructions55 =null;


        BbTree WHILE52_tree=null;
        BbTree LB54_tree=null;
        BbTree RB56_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:13: ( WHILE ^ expr LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:17: WHILE ^ expr LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE52=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt771); 
            WHILE52_tree = 
            (BbTree)adaptor.create(WHILE52)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE52_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt774);
            expr53=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr53.getTree());

            LB54=(Token)match(input,LB,FOLLOW_LB_in_while_stmt776); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt779);
            block_instructions55=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions55.getTree());

            RB56=(Token)match(input,RB,FOLLOW_RB_in_while_stmt781); 

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


    public static class return_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:1: return_stmt : RETURN ^ ( expr )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN57=null;
        BbParser.expr_return expr58 =null;


        BbTree RETURN57_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:13: ( RETURN ^ ( expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:17: RETURN ^ ( expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN57=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt806); 
            RETURN57_tree = 
            (BbTree)adaptor.create(RETURN57)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN57_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:25: ( expr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==FALSE||LA9_0==ID||LA9_0==INT||LA9_0==LP||LA9_0==MINUS||LA9_0==NOT||LA9_0==PLUS||LA9_0==TRUE||LA9_0==56) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt809);
                    expr58=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr58.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:1: playable : ( melodia | polifon );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.melodia_return melodia59 =null;

        BbParser.polifon_return polifon60 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:9: ( melodia | polifon )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LP||LA10_0==NOTA) ) {
                alt10=1;
            }
            else if ( (LA10_0==56) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable827);
                    melodia59=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia59.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:89:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable839);
                    polifon60=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon60.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:1: melodia : ( notas '.' duration ( '*' )? )+ ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal62=null;
        Token char_literal64=null;
        BbParser.notas_return notas61 =null;

        BbParser.duration_return duration63 =null;


        BbTree char_literal62_tree=null;
        BbTree char_literal64_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:8: ( ( notas '.' duration ( '*' )? )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:10: ( notas '.' duration ( '*' )? )+
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:10: ( notas '.' duration ( '*' )? )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==LP||LA12_0==NOTA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:11: notas '.' duration ( '*' )?
            	    {
            	    pushFollow(FOLLOW_notas_in_melodia856);
            	    notas61=notas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notas61.getTree());

            	    char_literal62=(Token)match(input,49,FOLLOW_49_in_melodia858); 
            	    char_literal62_tree = 
            	    (BbTree)adaptor.create(char_literal62)
            	    ;
            	    adaptor.addChild(root_0, char_literal62_tree);


            	    pushFollow(FOLLOW_duration_in_melodia860);
            	    duration63=duration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, duration63.getTree());

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:30: ( '*' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==MUL) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:31: '*'
            	            {
            	            char_literal64=(Token)match(input,MUL,FOLLOW_MUL_in_melodia863); 
            	            char_literal64_tree = 
            	            (BbTree)adaptor.create(char_literal64)
            	            ;
            	            adaptor.addChild(root_0, char_literal64_tree);


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "melodia"


    public static class notas_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notas"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:1: notas : ( NOTA | '(' NOTA ( NOTA )* ')' );
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTA65=null;
        Token char_literal66=null;
        Token NOTA67=null;
        Token NOTA68=null;
        Token char_literal69=null;

        BbTree NOTA65_tree=null;
        BbTree char_literal66_tree=null;
        BbTree NOTA67_tree=null;
        BbTree NOTA68_tree=null;
        BbTree char_literal69_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:6: ( NOTA | '(' NOTA ( NOTA )* ')' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NOTA) ) {
                alt14=1;
            }
            else if ( (LA14_0==LP) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:8: NOTA
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTA65=(Token)match(input,NOTA,FOLLOW_NOTA_in_notas883); 
                    NOTA65_tree = 
                    (BbTree)adaptor.create(NOTA65)
                    ;
                    adaptor.addChild(root_0, NOTA65_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:8: '(' NOTA ( NOTA )* ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal66=(Token)match(input,LP,FOLLOW_LP_in_notas893); 
                    char_literal66_tree = 
                    (BbTree)adaptor.create(char_literal66)
                    ;
                    adaptor.addChild(root_0, char_literal66_tree);


                    NOTA67=(Token)match(input,NOTA,FOLLOW_NOTA_in_notas895); 
                    NOTA67_tree = 
                    (BbTree)adaptor.create(NOTA67)
                    ;
                    adaptor.addChild(root_0, NOTA67_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:17: ( NOTA )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==NOTA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:18: NOTA
                    	    {
                    	    NOTA68=(Token)match(input,NOTA,FOLLOW_NOTA_in_notas898); 
                    	    NOTA68_tree = 
                    	    (BbTree)adaptor.create(NOTA68)
                    	    ;
                    	    adaptor.addChild(root_0, NOTA68_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    char_literal69=(Token)match(input,RP,FOLLOW_RP_in_notas902); 
                    char_literal69_tree = 
                    (BbTree)adaptor.create(char_literal69)
                    ;
                    adaptor.addChild(root_0, char_literal69_tree);


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


    public static class duration_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "duration"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:1: duration : ( INT | '(' expr ')' );
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT70=null;
        Token char_literal71=null;
        Token char_literal73=null;
        BbParser.expr_return expr72 =null;


        BbTree INT70_tree=null;
        BbTree char_literal71_tree=null;
        BbTree char_literal73_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:9: ( INT | '(' expr ')' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==LP) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT70=(Token)match(input,INT,FOLLOW_INT_in_duration915); 
                    INT70_tree = 
                    (BbTree)adaptor.create(INT70)
                    ;
                    adaptor.addChild(root_0, INT70_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:7: '(' expr ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal71=(Token)match(input,LP,FOLLOW_LP_in_duration924); 
                    char_literal71_tree = 
                    (BbTree)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    pushFollow(FOLLOW_expr_in_duration926);
                    expr72=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr72.getTree());

                    char_literal73=(Token)match(input,RP,FOLLOW_RP_in_duration928); 
                    char_literal73_tree = 
                    (BbTree)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:1: polifon : 'Poli' ID LB ! ( ( VOICE ID )? ( melodia '|' !) )* RB !;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal74=null;
        Token ID75=null;
        Token LB76=null;
        Token VOICE77=null;
        Token ID78=null;
        Token char_literal80=null;
        Token RB81=null;
        BbParser.melodia_return melodia79 =null;


        BbTree string_literal74_tree=null;
        BbTree ID75_tree=null;
        BbTree LB76_tree=null;
        BbTree VOICE77_tree=null;
        BbTree ID78_tree=null;
        BbTree char_literal80_tree=null;
        BbTree RB81_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:9: ( 'Poli' ID LB ! ( ( VOICE ID )? ( melodia '|' !) )* RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:11: 'Poli' ID LB ! ( ( VOICE ID )? ( melodia '|' !) )* RB !
            {
            root_0 = (BbTree)adaptor.nil();


            string_literal74=(Token)match(input,56,FOLLOW_56_in_polifon941); 
            string_literal74_tree = 
            (BbTree)adaptor.create(string_literal74)
            ;
            adaptor.addChild(root_0, string_literal74_tree);


            ID75=(Token)match(input,ID,FOLLOW_ID_in_polifon943); 
            ID75_tree = 
            (BbTree)adaptor.create(ID75)
            ;
            adaptor.addChild(root_0, ID75_tree);


            LB76=(Token)match(input,LB,FOLLOW_LB_in_polifon945); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:25: ( ( VOICE ID )? ( melodia '|' !) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LP||LA17_0==NOTA||LA17_0==VOICE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:26: ( VOICE ID )? ( melodia '|' !)
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:26: ( VOICE ID )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==VOICE) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:27: VOICE ID
            	            {
            	            VOICE77=(Token)match(input,VOICE,FOLLOW_VOICE_in_polifon950); 
            	            VOICE77_tree = 
            	            (BbTree)adaptor.create(VOICE77)
            	            ;
            	            adaptor.addChild(root_0, VOICE77_tree);


            	            ID78=(Token)match(input,ID,FOLLOW_ID_in_polifon952); 
            	            ID78_tree = 
            	            (BbTree)adaptor.create(ID78)
            	            ;
            	            adaptor.addChild(root_0, ID78_tree);


            	            }
            	            break;

            	    }


            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:38: ( melodia '|' !)
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:39: melodia '|' !
            	    {
            	    pushFollow(FOLLOW_melodia_in_polifon957);
            	    melodia79=melodia();

            	    state._fsp--;

            	    adaptor.addChild(root_0, melodia79.getTree());

            	    char_literal80=(Token)match(input,58,FOLLOW_58_in_polifon959); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            RB81=(Token)match(input,RB,FOLLOW_RB_in_polifon965); 

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


    public static class expr_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:1: expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR83=null;
        BbParser.boolterm_return boolterm82 =null;

        BbParser.boolterm_return boolterm84 =null;


        BbTree OR83_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:9: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:13: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr989);
            boolterm82=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm82.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:22: ( OR ^ boolterm )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==OR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:23: OR ^ boolterm
            	    {
            	    OR83=(Token)match(input,OR,FOLLOW_OR_in_expr992); 
            	    OR83_tree = 
            	    (BbTree)adaptor.create(OR83)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR83_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr995);
            	    boolterm84=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm84.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:110:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND86=null;
        BbParser.boolfact_return boolfact85 =null;

        BbParser.boolfact_return boolfact87 =null;


        BbTree AND86_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:110:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:110:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1015);
            boolfact85=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact85.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:110:22: ( AND ^ boolfact )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:110:23: AND ^ boolfact
            	    {
            	    AND86=(Token)match(input,AND,FOLLOW_AND_in_boolterm1018); 
            	    AND86_tree = 
            	    (BbTree)adaptor.create(AND86)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND86_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1021);
            	    boolfact87=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact87.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ89=null;
        Token NEQ90=null;
        Token LT91=null;
        Token LE92=null;
        Token GT93=null;
        Token GE94=null;
        BbParser.num_expr_return num_expr88 =null;

        BbParser.num_expr_return num_expr95 =null;


        BbTree EQ89_tree=null;
        BbTree NEQ90_tree=null;
        BbTree LT91_tree=null;
        BbTree LE92_tree=null;
        BbTree GT93_tree=null;
        BbTree GE94_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1041);
            num_expr88=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr88.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EQ||(LA21_0 >= GE && LA21_0 <= GT)||LA21_0==LE||LA21_0==LT||LA21_0==NEQ) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
                    int alt20=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt20=1;
                        }
                        break;
                    case NEQ:
                        {
                        alt20=2;
                        }
                        break;
                    case LT:
                        {
                        alt20=3;
                        }
                        break;
                    case LE:
                        {
                        alt20=4;
                        }
                        break;
                    case GT:
                        {
                        alt20=5;
                        }
                        break;
                    case GE:
                        {
                        alt20=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }

                    switch (alt20) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:24: EQ ^
                            {
                            EQ89=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1045); 
                            EQ89_tree = 
                            (BbTree)adaptor.create(EQ89)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ89_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:30: NEQ ^
                            {
                            NEQ90=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1050); 
                            NEQ90_tree = 
                            (BbTree)adaptor.create(NEQ90)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ90_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:37: LT ^
                            {
                            LT91=(Token)match(input,LT,FOLLOW_LT_in_boolfact1055); 
                            LT91_tree = 
                            (BbTree)adaptor.create(LT91)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT91_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:43: LE ^
                            {
                            LE92=(Token)match(input,LE,FOLLOW_LE_in_boolfact1060); 
                            LE92_tree = 
                            (BbTree)adaptor.create(LE92)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE92_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:49: GT ^
                            {
                            GT93=(Token)match(input,GT,FOLLOW_GT_in_boolfact1065); 
                            GT93_tree = 
                            (BbTree)adaptor.create(GT93)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT93_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:55: GE ^
                            {
                            GE94=(Token)match(input,GE,FOLLOW_GE_in_boolfact1070); 
                            GE94_tree = 
                            (BbTree)adaptor.create(GE94)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE94_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1074);
                    num_expr95=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr95.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS97=null;
        Token MINUS98=null;
        BbParser.term_return term96 =null;

        BbParser.term_return term99 =null;


        BbTree PLUS97_tree=null;
        BbTree MINUS98_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1094);
            term96=term();

            state._fsp--;

            adaptor.addChild(root_0, term96.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:18: ( ( PLUS ^| MINUS ^) term )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==MINUS||LA23_0==PLUS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:20: ( PLUS ^| MINUS ^)
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==PLUS) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==MINUS) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:21: PLUS ^
            	            {
            	            PLUS97=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1099); 
            	            PLUS97_tree = 
            	            (BbTree)adaptor.create(PLUS97)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS97_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:116:29: MINUS ^
            	            {
            	            MINUS98=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1104); 
            	            MINUS98_tree = 
            	            (BbTree)adaptor.create(MINUS98)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS98_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1108);
            	    term99=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term99.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL101=null;
        Token DIV102=null;
        Token MOD103=null;
        BbParser.factor_return factor100 =null;

        BbParser.factor_return factor104 =null;


        BbTree MUL101_tree=null;
        BbTree DIV102_tree=null;
        BbTree MOD103_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1132);
            factor100=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor100.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==DIV||(LA25_0 >= MOD && LA25_0 <= MUL)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt24=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:23: MUL ^
            	            {
            	            MUL101=(Token)match(input,MUL,FOLLOW_MUL_in_term1137); 
            	            MUL101_tree = 
            	            (BbTree)adaptor.create(MUL101)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL101_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:30: DIV ^
            	            {
            	            DIV102=(Token)match(input,DIV,FOLLOW_DIV_in_term1142); 
            	            DIV102_tree = 
            	            (BbTree)adaptor.create(DIV102)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV102_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:37: MOD ^
            	            {
            	            MOD103=(Token)match(input,MOD,FOLLOW_MOD_in_term1147); 
            	            MOD103_tree = 
            	            (BbTree)adaptor.create(MOD103)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD103_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1152);
            	    factor104=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor104.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT105=null;
        Token PLUS106=null;
        Token MINUS107=null;
        BbParser.atom_return atom108 =null;


        BbTree NOT105_tree=null;
        BbTree PLUS106_tree=null;
        BbTree MINUS107_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt26=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt26=1;
                    }
                    break;
                case PLUS:
                    {
                    alt26=2;
                    }
                    break;
                case MINUS:
                    {
                    alt26=3;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:14: NOT ^
                    {
                    NOT105=(Token)match(input,NOT,FOLLOW_NOT_in_factor1175); 
                    NOT105_tree = 
                    (BbTree)adaptor.create(NOT105)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT105_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:21: PLUS ^
                    {
                    PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1180); 
                    PLUS106_tree = 
                    (BbTree)adaptor.create(PLUS106)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS106_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:29: MINUS ^
                    {
                    MINUS107=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1185); 
                    MINUS107_tree = 
                    (BbTree)adaptor.create(MINUS107)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS107_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1190);
            atom108=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom108.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| polifon );
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID109=null;
        Token INT110=null;
        Token char_literal112=null;
        Token char_literal114=null;
        BbParser.funcall_return funcall111 =null;

        BbParser.expr_return expr113 =null;

        BbParser.polifon_return polifon115 =null;


        BbTree b_tree=null;
        BbTree ID109_tree=null;
        BbTree INT110_tree=null;
        BbTree char_literal112_tree=null;
        BbTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !| polifon )
            int alt28=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LP) ) {
                    alt28=4;
                }
                else if ( (LA28_1==AND||(LA28_1 >= DIV && LA28_1 <= EQ)||(LA28_1 >= GE && LA28_1 <= GT)||(LA28_1 >= LB && LA28_1 <= LE)||(LA28_1 >= LT && LA28_1 <= NEQ)||LA28_1==OR||LA28_1==PLUS||LA28_1==RB||LA28_1==RP||LA28_1==48||LA28_1==50) ) {
                    alt28=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt28=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt28=3;
                }
                break;
            case LP:
                {
                alt28=5;
                }
                break;
            case 56:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID109=(Token)match(input,ID,FOLLOW_ID_in_atom1215); 
                    ID109_tree = 
                    (BbTree)adaptor.create(ID109)
                    ;
                    adaptor.addChild(root_0, ID109_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT110=(Token)match(input,INT,FOLLOW_INT_in_atom1230); 
                    INT110_tree = 
                    (BbTree)adaptor.create(INT110)
                    ;
                    adaptor.addChild(root_0, INT110_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:13: (b= TRUE |b= FALSE )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==TRUE) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==FALSE) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1247);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1253);  
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
                    // 130:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1276);
                    funcall111=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall111.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:13: '(' ! expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal112=(Token)match(input,LP,FOLLOW_LP_in_atom1290); 

                    pushFollow(FOLLOW_expr_in_atom1293);
                    expr113=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr113.getTree());

                    char_literal114=(Token)match(input,RP,FOLLOW_RP_in_atom1295); 

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:13: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_atom1310);
                    polifon115=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon115.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        BbParser.expr_list_return expr_list118 =null;


        BbTree ID116_tree=null;
        BbTree char_literal117_tree=null;
        BbTree char_literal119_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:13: ID '(' ( expr_list )? ')'
            {
            ID116=(Token)match(input,ID,FOLLOW_ID_in_funcall1331);  
            stream_ID.add(ID116);


            char_literal117=(Token)match(input,LP,FOLLOW_LP_in_funcall1333);  
            stream_LP.add(char_literal117);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:20: ( expr_list )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==FALSE||LA29_0==ID||LA29_0==INT||LA29_0==LP||LA29_0==MINUS||LA29_0==NOT||LA29_0==PLUS||LA29_0==TRUE||LA29_0==56) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1335);
                    expr_list118=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list118.getTree());

                    }
                    break;

            }


            char_literal119=(Token)match(input,RP,FOLLOW_RP_in_funcall1338);  
            stream_RP.add(char_literal119);


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
            // 138:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:138:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal121=null;
        BbParser.expr_return expr120 =null;

        BbParser.expr_return expr122 =null;


        BbTree char_literal121_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1371);
            expr120=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr120.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:18: ( ',' ! expr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==48) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:19: ',' ! expr
            	    {
            	    char_literal121=(Token)match(input,48,FOLLOW_48_in_expr_list1374); 

            	    pushFollow(FOLLOW_expr_in_expr_list1377);
            	    expr122=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr122.getTree());

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
    // $ANTLR end "expr_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog160 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func193 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_func196 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_func198 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_params_in_func201 = new BitSet(new long[]{0x03FC210202060000L});
    public static final BitSet FOLLOW_block_instructions_in_func203 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RB_in_func205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params225 = new BitSet(new long[]{0x0000820000020000L});
    public static final BitSet FOLLOW_paramlist_in_params227 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_params230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist256 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_paramlist259 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_param_in_paramlist262 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_47_in_param287 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_param291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_param314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions365 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_block_instructions368 = new BitSet(new long[]{0x03FC210202060000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions370 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_assign595 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assign597 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_assign601 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_expr_in_assign603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_assign619 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assign621 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_assign623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_assign638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assign640 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_assign642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_assign657 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assign659 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_assign661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_assign676 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assign678 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_assign680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_assign694 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_assign696 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_assign698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt721 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt724 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt727 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt729 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt732 = new BitSet(new long[]{0x03FC210202060000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt735 = new BitSet(new long[]{0x0000008000000200L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt738 = new BitSet(new long[]{0x03FC210202060000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt741 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt771 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_expr_in_while_stmt774 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_while_stmt776 = new BitSet(new long[]{0x03FC210202060000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt779 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt806 = new BitSet(new long[]{0x010008110A0A1002L});
    public static final BitSet FOLLOW_expr_in_return_stmt809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notas_in_melodia856 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_melodia858 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_duration_in_melodia860 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_MUL_in_melodia863 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_NOTA_in_notas883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas893 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_NOTA_in_notas895 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_NOTA_in_notas898 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_RP_in_notas902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration924 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_expr_in_duration926 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_duration928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_polifon941 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_polifon943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_polifon945 = new BitSet(new long[]{0x0000108202000000L});
    public static final BitSet FOLLOW_VOICE_in_polifon950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_polifon952 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_melodia_in_polifon957 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_polifon959 = new BitSet(new long[]{0x0000108202000000L});
    public static final BitSet FOLLOW_RB_in_polifon965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr989 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_expr992 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_boolterm_in_expr995 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1015 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1018 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1021 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1041 = new BitSet(new long[]{0x0000000044418402L});
    public static final BitSet FOLLOW_EQ_in_boolfact1045 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1050 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_LT_in_boolfact1055 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_LE_in_boolfact1060 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_GT_in_boolfact1065 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_GE_in_boolfact1070 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1094 = new BitSet(new long[]{0x0000001008000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1099 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1104 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_term_in_num_expr1108 = new BitSet(new long[]{0x0000001008000002L});
    public static final BitSet FOLLOW_factor_in_term1132 = new BitSet(new long[]{0x0000000030000102L});
    public static final BitSet FOLLOW_MUL_in_term1137 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_DIV_in_term1142 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_MOD_in_term1147 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_factor_in_term1152 = new BitSet(new long[]{0x0000000030000102L});
    public static final BitSet FOLLOW_NOT_in_factor1175 = new BitSet(new long[]{0x01000800020A1000L});
    public static final BitSet FOLLOW_PLUS_in_factor1180 = new BitSet(new long[]{0x01000800020A1000L});
    public static final BitSet FOLLOW_MINUS_in_factor1185 = new BitSet(new long[]{0x01000800020A1000L});
    public static final BitSet FOLLOW_atom_in_factor1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1290 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_expr_in_atom1293 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_atom1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_atom1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1331 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LP_in_funcall1333 = new BitSet(new long[]{0x01000A110A0A1000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1335 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1371 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_expr_list1374 = new BitSet(new long[]{0x010008110A0A1000L});
    public static final BitSet FOLLOW_expr_in_expr_list1377 = new BitSet(new long[]{0x0001000000000002L});

}