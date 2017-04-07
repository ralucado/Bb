// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 01:59:36

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MINUS", "MOD", "MUL", "NEQ", "NEWLINE", "NOT", "NOTA", "OR", "PARAMS", "PLUS", "PREF", "PVALUE", "RB", "RETURN", "RP", "THEN", "TRUE", "VOICE", "WHILE", "WS", "'&'", "','", "'.'", "';'", "'Chord'", "'Ensemble'", "'Melody'", "'Note'", "'Poli'", "'Speed'", "'int'", "'void'", "'|'"
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

                if ( ((LA1_0 >= 51 && LA1_0 <= 54)||(LA1_0 >= 57 && LA1_0 <= 58)) ) {
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:34:1: func : type ID ^ params LB ! block_instructions RB !;
    public final BbParser.func_return func() throws RecognitionException {
        BbParser.func_return retval = new BbParser.func_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID4=null;
        Token LB6=null;
        Token RB8=null;
        BbParser.type_return type3 =null;

        BbParser.params_return params5 =null;

        BbParser.block_instructions_return block_instructions7 =null;


        BbTree ID4_tree=null;
        BbTree LB6_tree=null;
        BbTree RB8_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:34:9: ( type ID ^ params LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:34:11: type ID ^ params LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_type_in_func193);
            type3=type();

            state._fsp--;

            adaptor.addChild(root_0, type3.getTree());

            ID4=(Token)match(input,ID,FOLLOW_ID_in_func195); 
            ID4_tree = 
            (BbTree)adaptor.create(ID4)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(ID4_tree, root_0);


            pushFollow(FOLLOW_params_in_func198);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            LB6=(Token)match(input,LB,FOLLOW_LB_in_func200); 

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

            if ( (LA2_0==47||(LA2_0 >= 51 && LA2_0 <= 54)||(LA2_0 >= 57 && LA2_0 <= 58)) ) {
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:1: param : ( '&' type id= ID -> ^( PREF[$id,$id.text] ) type | type id= ID -> ^( PVALUE[$id,$id.text] ) type );
    public final BbParser.param_return param() throws RecognitionException {
        BbParser.param_return retval = new BbParser.param_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token id=null;
        Token char_literal15=null;
        BbParser.type_return type16 =null;

        BbParser.type_return type17 =null;


        BbTree id_tree=null;
        BbTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:9: ( '&' type id= ID -> ^( PREF[$id,$id.text] ) type | type id= ID -> ^( PVALUE[$id,$id.text] ) type )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==47) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= 51 && LA4_0 <= 54)||(LA4_0 >= 57 && LA4_0 <= 58)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:13: '&' type id= ID
                    {
                    char_literal15=(Token)match(input,47,FOLLOW_47_in_param287);  
                    stream_47.add(char_literal15);


                    pushFollow(FOLLOW_type_in_param289);
                    type16=type();

                    state._fsp--;

                    stream_type.add(type16.getTree());

                    id=(Token)match(input,ID,FOLLOW_ID_in_param293);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 47:28: -> ^( PREF[$id,$id.text] ) type
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:31: ^( PREF[$id,$id.text] )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(PREF, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_type.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:48:13: type id= ID
                    {
                    pushFollow(FOLLOW_type_in_param316);
                    type17=type();

                    state._fsp--;

                    stream_type.add(type17.getTree());

                    id=(Token)match(input,ID,FOLLOW_ID_in_param320);  
                    stream_ID.add(id);


                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 48:24: -> ^( PVALUE[$id,$id.text] ) type
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:48:27: ^( PVALUE[$id,$id.text] )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(PVALUE, id, (id!=null?id.getText():null))
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                        adaptor.addChild(root_0, stream_type.nextTree());

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

        Token char_literal19=null;
        BbParser.instruction_return instruction18 =null;

        BbParser.instruction_return instruction20 =null;


        BbTree char_literal19_tree=null;
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:52:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:52:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions373);
            instruction18=instruction();

            state._fsp--;

            stream_instruction.add(instruction18.getTree());

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
            	    char_literal19=(Token)match(input,50,FOLLOW_50_in_block_instructions376);  
            	    stream_50.add(char_literal19);


            	    pushFollow(FOLLOW_instruction_in_block_instructions378);
            	    instruction20=instruction();

            	    state._fsp--;

            	    stream_instruction.add(instruction20.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:57:1: instruction : ( assign | ite_stmt | while_stmt | funcall | return_stmt | playable | speed |);
    public final BbParser.instruction_return instruction() throws RecognitionException {
        BbParser.instruction_return retval = new BbParser.instruction_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.assign_return assign21 =null;

        BbParser.ite_stmt_return ite_stmt22 =null;

        BbParser.while_stmt_return while_stmt23 =null;

        BbParser.funcall_return funcall24 =null;

        BbParser.return_stmt_return return_stmt25 =null;

        BbParser.playable_return playable26 =null;

        BbParser.speed_return speed27 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:58:9: ( assign | ite_stmt | while_stmt | funcall | return_stmt | playable | speed |)
            int alt6=8;
            switch ( input.LA(1) ) {
            case 51:
            case 52:
            case 53:
            case 54:
            case 57:
            case 58:
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
                int LA6_4 = input.LA(2);

                if ( (LA6_4==LP) ) {
                    alt6=4;
                }
                else if ( (LA6_4==ELSE||LA6_4==RB||LA6_4==50) ) {
                    alt6=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;

                }
                }
                break;
            case RETURN:
                {
                alt6=5;
                }
                break;
            case LP:
            case NOTA:
            case 55:
                {
                alt6=6;
                }
                break;
            case 56:
                {
                alt6=7;
                }
                break;
            case ELSE:
            case RB:
            case 50:
                {
                alt6=8;
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


                    pushFollow(FOLLOW_assign_in_instruction437);
                    assign21=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign21.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:59:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction461);
                    ite_stmt22=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt22.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction483);
                    while_stmt23=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt23.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction503);
                    funcall24=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall24.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:62:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction526);
                    return_stmt25=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt25.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction545);
                    playable26=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable26.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:64:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction565);
                    speed27=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed27.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:66:9: 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:1: assign : type ID eq= EQ expr -> ^( ASSIGN[$eq,\":=\"] type ID expr ) ;
    public final BbParser.assign_return assign() throws RecognitionException {
        BbParser.assign_return retval = new BbParser.assign_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token eq=null;
        Token ID29=null;
        BbParser.type_return type28 =null;

        BbParser.expr_return expr30 =null;


        BbTree eq_tree=null;
        BbTree ID29_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:9: ( type ID eq= EQ expr -> ^( ASSIGN[$eq,\":=\"] type ID expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:13: type ID eq= EQ expr
            {
            pushFollow(FOLLOW_type_in_assign618);
            type28=type();

            state._fsp--;

            stream_type.add(type28.getTree());

            ID29=(Token)match(input,ID,FOLLOW_ID_in_assign620);  
            stream_ID.add(ID29);


            eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign624);  
            stream_EQ.add(eq);


            pushFollow(FOLLOW_expr_in_assign626);
            expr30=expr();

            state._fsp--;

            stream_expr.add(expr30.getTree());

            // AST REWRITE
            // elements: type, ID, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 69:32: -> ^( ASSIGN[$eq,\":=\"] type ID expr )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:35: ^( ASSIGN[$eq,\":=\"] type ID expr )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ASSIGN, eq, ":=")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_expr.nextTree());

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
    // $ANTLR end "assign"


    public static class type_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:1: type : ( 'int' | 'Note' | 'Chord' | 'Melody' | 'Ensemble' | 'void' );
    public final BbParser.type_return type() throws RecognitionException {
        BbParser.type_return retval = new BbParser.type_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set31=null;

        BbTree set31_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:6: ( 'int' | 'Note' | 'Chord' | 'Melody' | 'Ensemble' | 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set31=(Token)input.LT(1);

            if ( (input.LA(1) >= 51 && input.LA(1) <= 54)||(input.LA(1) >= 57 && input.LA(1) <= 58) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set31)
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


    public static class ite_stmt_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ite_stmt"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:1: ite_stmt : IF ^ LP ! expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF32=null;
        Token LP33=null;
        Token RP35=null;
        Token LB36=null;
        Token ELSE38=null;
        Token RB40=null;
        BbParser.expr_return expr34 =null;

        BbParser.block_instructions_return block_instructions37 =null;

        BbParser.block_instructions_return block_instructions39 =null;


        BbTree IF32_tree=null;
        BbTree LP33_tree=null;
        BbTree RP35_tree=null;
        BbTree LB36_tree=null;
        BbTree ELSE38_tree=null;
        BbTree RB40_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:13: ( IF ^ LP ! expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:17: IF ^ LP ! expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !
            {
            root_0 = (BbTree)adaptor.nil();


            IF32=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt743); 
            IF32_tree = 
            (BbTree)adaptor.create(IF32)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF32_tree, root_0);


            LP33=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt746); 

            pushFollow(FOLLOW_expr_in_ite_stmt749);
            expr34=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr34.getTree());

            RP35=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt751); 

            LB36=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt754); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt757);
            block_instructions37=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions37.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:57: ( ELSE ! block_instructions )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ELSE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:58: ELSE ! block_instructions
                    {
                    ELSE38=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt760); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt763);
                    block_instructions39=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions39.getTree());

                    }
                    break;

            }


            RB40=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt767); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:1: while_stmt : WHILE ^ expr LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE41=null;
        Token LB43=null;
        Token RB45=null;
        BbParser.expr_return expr42 =null;

        BbParser.block_instructions_return block_instructions44 =null;


        BbTree WHILE41_tree=null;
        BbTree LB43_tree=null;
        BbTree RB45_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:13: ( WHILE ^ expr LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:84:17: WHILE ^ expr LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE41=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt793); 
            WHILE41_tree = 
            (BbTree)adaptor.create(WHILE41)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE41_tree, root_0);


            pushFollow(FOLLOW_expr_in_while_stmt796);
            expr42=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr42.getTree());

            LB43=(Token)match(input,LB,FOLLOW_LB_in_while_stmt798); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt801);
            block_instructions44=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions44.getTree());

            RB45=(Token)match(input,RB,FOLLOW_RB_in_while_stmt803); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:1: return_stmt : RETURN ^ ( expr )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN46=null;
        BbParser.expr_return expr47 =null;


        BbTree RETURN46_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:13: ( RETURN ^ ( expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:17: RETURN ^ ( expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN46=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt828); 
            RETURN46_tree = 
            (BbTree)adaptor.create(RETURN46)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN46_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:25: ( expr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==FALSE||LA8_0==ID||LA8_0==INT||LA8_0==LP||LA8_0==MINUS||(LA8_0 >= NOT && LA8_0 <= NOTA)||LA8_0==PLUS||LA8_0==TRUE||LA8_0==55) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt831);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:1: playable : ( melodia | polifon | ID );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID50=null;
        BbParser.melodia_return melodia48 =null;

        BbParser.polifon_return polifon49 =null;


        BbTree ID50_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:9: ( melodia | polifon | ID )
            int alt9=3;
            switch ( input.LA(1) ) {
            case LP:
            case NOTA:
                {
                alt9=1;
                }
                break;
            case 55:
                {
                alt9=2;
                }
                break;
            case ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable849);
                    melodia48=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia48.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:93:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable861);
                    polifon49=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon49.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:11: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID50=(Token)match(input,ID,FOLLOW_ID_in_playable873); 
                    ID50_tree = 
                    (BbTree)adaptor.create(ID50)
                    ;
                    adaptor.addChild(root_0, ID50_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:1: melodia : ( notas '.' duration ( '*' )? )+ ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal52=null;
        Token char_literal54=null;
        BbParser.notas_return notas51 =null;

        BbParser.duration_return duration53 =null;


        BbTree char_literal52_tree=null;
        BbTree char_literal54_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:8: ( ( notas '.' duration ( '*' )? )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:10: ( notas '.' duration ( '*' )? )+
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:10: ( notas '.' duration ( '*' )? )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==LP||LA11_0==NOTA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:11: notas '.' duration ( '*' )?
            	    {
            	    pushFollow(FOLLOW_notas_in_melodia890);
            	    notas51=notas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notas51.getTree());

            	    char_literal52=(Token)match(input,49,FOLLOW_49_in_melodia892); 
            	    char_literal52_tree = 
            	    (BbTree)adaptor.create(char_literal52)
            	    ;
            	    adaptor.addChild(root_0, char_literal52_tree);


            	    pushFollow(FOLLOW_duration_in_melodia894);
            	    duration53=duration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, duration53.getTree());

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:30: ( '*' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==MUL) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:31: '*'
            	            {
            	            char_literal54=(Token)match(input,MUL,FOLLOW_MUL_in_melodia897); 
            	            char_literal54_tree = 
            	            (BbTree)adaptor.create(char_literal54)
            	            ;
            	            adaptor.addChild(root_0, char_literal54_tree);


            	            }
            	            break;

            	    }


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:1: notas : ( nota | '(' nota ( nota )* ')' );
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal56=null;
        Token char_literal59=null;
        BbParser.nota_return nota55 =null;

        BbParser.nota_return nota57 =null;

        BbParser.nota_return nota58 =null;


        BbTree char_literal56_tree=null;
        BbTree char_literal59_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:6: ( nota | '(' nota ( nota )* ')' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOTA) ) {
                alt13=1;
            }
            else if ( (LA13_0==LP) ) {
                switch ( input.LA(2) ) {
                case NOTA:
                    {
                    switch ( input.LA(3) ) {
                    case 48:
                        {
                        alt13=1;
                        }
                        break;
                    case RP:
                        {
                        alt13=1;
                        }
                        break;
                    case LP:
                    case NOTA:
                        {
                        alt13=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case ID:
                    {
                    alt13=1;
                    }
                    break;
                case LP:
                    {
                    alt13=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas917);
                    nota55=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota55.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:8: '(' nota ( nota )* ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal56=(Token)match(input,LP,FOLLOW_LP_in_notas927); 
                    char_literal56_tree = 
                    (BbTree)adaptor.create(char_literal56)
                    ;
                    adaptor.addChild(root_0, char_literal56_tree);


                    pushFollow(FOLLOW_nota_in_notas929);
                    nota57=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota57.getTree());

                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:17: ( nota )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==LP||LA12_0==NOTA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:18: nota
                    	    {
                    	    pushFollow(FOLLOW_nota_in_notas932);
                    	    nota58=nota();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, nota58.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    char_literal59=(Token)match(input,RP,FOLLOW_RP_in_notas936); 
                    char_literal59_tree = 
                    (BbTree)adaptor.create(char_literal59)
                    ;
                    adaptor.addChild(root_0, char_literal59_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:104:1: nota : ( NOTA | chord );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTA60=null;
        BbParser.chord_return chord61 =null;


        BbTree NOTA60_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:104:5: ( NOTA | chord )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:104:7: NOTA
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTA60=(Token)match(input,NOTA,FOLLOW_NOTA_in_nota954); 
                    NOTA60_tree = 
                    (BbTree)adaptor.create(NOTA60)
                    ;
                    adaptor.addChild(root_0, NOTA60_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:104:14: chord
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_chord_in_nota958);
                    chord61=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord61.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:1: chord : LP ! ( NOTA | ID ) ( ',' ( NOTA | ID ) )* RP !;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token LP62=null;
        Token set63=null;
        Token char_literal64=null;
        Token set65=null;
        Token RP66=null;

        BbTree LP62_tree=null;
        BbTree set63_tree=null;
        BbTree char_literal64_tree=null;
        BbTree set65_tree=null;
        BbTree RP66_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:6: ( LP ! ( NOTA | ID ) ( ',' ( NOTA | ID ) )* RP !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:8: LP ! ( NOTA | ID ) ( ',' ( NOTA | ID ) )* RP !
            {
            root_0 = (BbTree)adaptor.nil();


            LP62=(Token)match(input,LP,FOLLOW_LP_in_chord964); 

            set63=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==NOTA ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set63)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:24: ( ',' ( NOTA | ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:26: ',' ( NOTA | ID )
            	    {
            	    char_literal64=(Token)match(input,48,FOLLOW_48_in_chord977); 
            	    char_literal64_tree = 
            	    (BbTree)adaptor.create(char_literal64)
            	    ;
            	    adaptor.addChild(root_0, char_literal64_tree);


            	    set65=(Token)input.LT(1);

            	    if ( input.LA(1)==ID||input.LA(1)==NOTA ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (BbTree)adaptor.create(set65)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            RP66=(Token)match(input,RP,FOLLOW_RP_in_chord989); 

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


    public static class duration_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "duration"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:1: duration : ( INT | '(' expr ')' );
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT67=null;
        Token char_literal68=null;
        Token char_literal70=null;
        BbParser.expr_return expr69 =null;


        BbTree INT67_tree=null;
        BbTree char_literal68_tree=null;
        BbTree char_literal70_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:9: ( INT | '(' expr ')' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INT) ) {
                alt16=1;
            }
            else if ( (LA16_0==LP) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT67=(Token)match(input,INT,FOLLOW_INT_in_duration997); 
                    INT67_tree = 
                    (BbTree)adaptor.create(INT67)
                    ;
                    adaptor.addChild(root_0, INT67_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:108:7: '(' expr ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal68=(Token)match(input,LP,FOLLOW_LP_in_duration1006); 
                    char_literal68_tree = 
                    (BbTree)adaptor.create(char_literal68)
                    ;
                    adaptor.addChild(root_0, char_literal68_tree);


                    pushFollow(FOLLOW_expr_in_duration1008);
                    expr69=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr69.getTree());

                    char_literal70=(Token)match(input,RP,FOLLOW_RP_in_duration1010); 
                    char_literal70_tree = 
                    (BbTree)adaptor.create(char_literal70)
                    ;
                    adaptor.addChild(root_0, char_literal70_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:1: polifon : 'Poli' ID LB ! ( ( VOICE ID )? ( melodia '|' !) )* RB !;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal71=null;
        Token ID72=null;
        Token LB73=null;
        Token VOICE74=null;
        Token ID75=null;
        Token char_literal77=null;
        Token RB78=null;
        BbParser.melodia_return melodia76 =null;


        BbTree string_literal71_tree=null;
        BbTree ID72_tree=null;
        BbTree LB73_tree=null;
        BbTree VOICE74_tree=null;
        BbTree ID75_tree=null;
        BbTree char_literal77_tree=null;
        BbTree RB78_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:9: ( 'Poli' ID LB ! ( ( VOICE ID )? ( melodia '|' !) )* RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:11: 'Poli' ID LB ! ( ( VOICE ID )? ( melodia '|' !) )* RB !
            {
            root_0 = (BbTree)adaptor.nil();


            string_literal71=(Token)match(input,55,FOLLOW_55_in_polifon1023); 
            string_literal71_tree = 
            (BbTree)adaptor.create(string_literal71)
            ;
            adaptor.addChild(root_0, string_literal71_tree);


            ID72=(Token)match(input,ID,FOLLOW_ID_in_polifon1025); 
            ID72_tree = 
            (BbTree)adaptor.create(ID72)
            ;
            adaptor.addChild(root_0, ID72_tree);


            LB73=(Token)match(input,LB,FOLLOW_LB_in_polifon1027); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:25: ( ( VOICE ID )? ( melodia '|' !) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LP||LA18_0==NOTA||LA18_0==VOICE) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:26: ( VOICE ID )? ( melodia '|' !)
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:26: ( VOICE ID )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==VOICE) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:27: VOICE ID
            	            {
            	            VOICE74=(Token)match(input,VOICE,FOLLOW_VOICE_in_polifon1032); 
            	            VOICE74_tree = 
            	            (BbTree)adaptor.create(VOICE74)
            	            ;
            	            adaptor.addChild(root_0, VOICE74_tree);


            	            ID75=(Token)match(input,ID,FOLLOW_ID_in_polifon1034); 
            	            ID75_tree = 
            	            (BbTree)adaptor.create(ID75)
            	            ;
            	            adaptor.addChild(root_0, ID75_tree);


            	            }
            	            break;

            	    }


            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:38: ( melodia '|' !)
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:39: melodia '|' !
            	    {
            	    pushFollow(FOLLOW_melodia_in_polifon1039);
            	    melodia76=melodia();

            	    state._fsp--;

            	    adaptor.addChild(root_0, melodia76.getTree());

            	    char_literal77=(Token)match(input,59,FOLLOW_59_in_polifon1041); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            RB78=(Token)match(input,RB,FOLLOW_RB_in_polifon1047); 

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


    public static class speed_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:114:1: speed : 'Speed' expr ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal79=null;
        BbParser.expr_return expr80 =null;


        BbTree string_literal79_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:114:7: ( 'Speed' expr )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:114:9: 'Speed' expr
            {
            root_0 = (BbTree)adaptor.nil();


            string_literal79=(Token)match(input,56,FOLLOW_56_in_speed1065); 
            string_literal79_tree = 
            (BbTree)adaptor.create(string_literal79)
            ;
            adaptor.addChild(root_0, string_literal79_tree);


            pushFollow(FOLLOW_expr_in_speed1067);
            expr80=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr80.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:1: expr : ( playable | boolterm ( OR ^ boolterm )* );
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR83=null;
        BbParser.playable_return playable81 =null;

        BbParser.boolterm_return boolterm82 =null;

        BbParser.boolterm_return boolterm84 =null;


        BbTree OR83_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:9: ( playable | boolterm ( OR ^ boolterm )* )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:11: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_expr1079);
                    playable81=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable81.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:5: boolterm ( OR ^ boolterm )*
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_boolterm_in_expr1085);
                    boolterm82=boolterm();

                    state._fsp--;

                    adaptor.addChild(root_0, boolterm82.getTree());

                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:14: ( OR ^ boolterm )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==OR) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:15: OR ^ boolterm
                    	    {
                    	    OR83=(Token)match(input,OR,FOLLOW_OR_in_expr1088); 
                    	    OR83_tree = 
                    	    (BbTree)adaptor.create(OR83)
                    	    ;
                    	    root_0 = (BbTree)adaptor.becomeRoot(OR83_tree, root_0);


                    	    pushFollow(FOLLOW_boolterm_in_expr1091);
                    	    boolterm84=boolterm();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, boolterm84.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


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


    public static class boolterm_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND86=null;
        BbParser.boolfact_return boolfact85 =null;

        BbParser.boolfact_return boolfact87 =null;


        BbTree AND86_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1111);
            boolfact85=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact85.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:22: ( AND ^ boolfact )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:23: AND ^ boolfact
            	    {
            	    AND86=(Token)match(input,AND,FOLLOW_AND_in_boolterm1114); 
            	    AND86_tree = 
            	    (BbTree)adaptor.create(AND86)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND86_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1117);
            	    boolfact87=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact87.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1137);
            num_expr88=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr88.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EQ||(LA23_0 >= GE && LA23_0 <= GT)||LA23_0==LE||LA23_0==LT||LA23_0==NEQ) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
                    int alt22=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt22=1;
                        }
                        break;
                    case NEQ:
                        {
                        alt22=2;
                        }
                        break;
                    case LT:
                        {
                        alt22=3;
                        }
                        break;
                    case LE:
                        {
                        alt22=4;
                        }
                        break;
                    case GT:
                        {
                        alt22=5;
                        }
                        break;
                    case GE:
                        {
                        alt22=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;

                    }

                    switch (alt22) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:24: EQ ^
                            {
                            EQ89=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1141); 
                            EQ89_tree = 
                            (BbTree)adaptor.create(EQ89)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ89_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:30: NEQ ^
                            {
                            NEQ90=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1146); 
                            NEQ90_tree = 
                            (BbTree)adaptor.create(NEQ90)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ90_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:37: LT ^
                            {
                            LT91=(Token)match(input,LT,FOLLOW_LT_in_boolfact1151); 
                            LT91_tree = 
                            (BbTree)adaptor.create(LT91)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT91_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:43: LE ^
                            {
                            LE92=(Token)match(input,LE,FOLLOW_LE_in_boolfact1156); 
                            LE92_tree = 
                            (BbTree)adaptor.create(LE92)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE92_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:49: GT ^
                            {
                            GT93=(Token)match(input,GT,FOLLOW_GT_in_boolfact1161); 
                            GT93_tree = 
                            (BbTree)adaptor.create(GT93)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT93_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:55: GE ^
                            {
                            GE94=(Token)match(input,GE,FOLLOW_GE_in_boolfact1166); 
                            GE94_tree = 
                            (BbTree)adaptor.create(GE94)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE94_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1170);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1190);
            term96=term();

            state._fsp--;

            adaptor.addChild(root_0, term96.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:18: ( ( PLUS ^| MINUS ^) term )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==MINUS||LA25_0==PLUS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:20: ( PLUS ^| MINUS ^)
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==PLUS) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==MINUS) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:21: PLUS ^
            	            {
            	            PLUS97=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1195); 
            	            PLUS97_tree = 
            	            (BbTree)adaptor.create(PLUS97)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS97_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:29: MINUS ^
            	            {
            	            MINUS98=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1200); 
            	            MINUS98_tree = 
            	            (BbTree)adaptor.create(MINUS98)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS98_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1204);
            	    term99=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term99.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1228);
            factor100=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor100.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==DIV||(LA27_0 >= MOD && LA27_0 <= MUL)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:23: MUL ^
            	            {
            	            MUL101=(Token)match(input,MUL,FOLLOW_MUL_in_term1233); 
            	            MUL101_tree = 
            	            (BbTree)adaptor.create(MUL101)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL101_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:30: DIV ^
            	            {
            	            DIV102=(Token)match(input,DIV,FOLLOW_DIV_in_term1238); 
            	            DIV102_tree = 
            	            (BbTree)adaptor.create(DIV102)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV102_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:130:37: MOD ^
            	            {
            	            MOD103=(Token)match(input,MOD,FOLLOW_MOD_in_term1243); 
            	            MOD103_tree = 
            	            (BbTree)adaptor.create(MOD103)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD103_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1248);
            	    factor104=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor104.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt28=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt28=1;
                    }
                    break;
                case PLUS:
                    {
                    alt28=2;
                    }
                    break;
                case MINUS:
                    {
                    alt28=3;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:14: NOT ^
                    {
                    NOT105=(Token)match(input,NOT,FOLLOW_NOT_in_factor1271); 
                    NOT105_tree = 
                    (BbTree)adaptor.create(NOT105)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT105_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:21: PLUS ^
                    {
                    PLUS106=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1276); 
                    PLUS106_tree = 
                    (BbTree)adaptor.create(PLUS106)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS106_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:29: MINUS ^
                    {
                    MINUS107=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1281); 
                    MINUS107_tree = 
                    (BbTree)adaptor.create(MINUS107)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS107_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1286);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
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


        BbTree b_tree=null;
        BbTree ID109_tree=null;
        BbTree INT110_tree=null;
        BbTree char_literal112_tree=null;
        BbTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt30=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==LP) ) {
                    alt30=4;
                }
                else if ( (LA30_1==AND||(LA30_1 >= DIV && LA30_1 <= EQ)||(LA30_1 >= GE && LA30_1 <= GT)||(LA30_1 >= LB && LA30_1 <= LE)||(LA30_1 >= LT && LA30_1 <= NEQ)||LA30_1==OR||LA30_1==PLUS||LA30_1==RB||LA30_1==RP||LA30_1==48||LA30_1==50) ) {
                    alt30=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt30=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt30=3;
                }
                break;
            case LP:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID109=(Token)match(input,ID,FOLLOW_ID_in_atom1311); 
                    ID109_tree = 
                    (BbTree)adaptor.create(ID109)
                    ;
                    adaptor.addChild(root_0, ID109_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT110=(Token)match(input,INT,FOLLOW_INT_in_atom1326); 
                    INT110_tree = 
                    (BbTree)adaptor.create(INT110)
                    ;
                    adaptor.addChild(root_0, INT110_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:13: (b= TRUE |b= FALSE )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==TRUE) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==FALSE) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1343);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1349);  
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
                    // 141:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1372);
                    funcall111=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall111.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:13: '(' ! expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal112=(Token)match(input,LP,FOLLOW_LP_in_atom1386); 

                    pushFollow(FOLLOW_expr_in_atom1389);
                    expr113=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr113.getTree());

                    char_literal114=(Token)match(input,RP,FOLLOW_RP_in_atom1391); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID115=null;
        Token char_literal116=null;
        Token char_literal118=null;
        BbParser.expr_list_return expr_list117 =null;


        BbTree ID115_tree=null;
        BbTree char_literal116_tree=null;
        BbTree char_literal118_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:13: ID '(' ( expr_list )? ')'
            {
            ID115=(Token)match(input,ID,FOLLOW_ID_in_funcall1413);  
            stream_ID.add(ID115);


            char_literal116=(Token)match(input,LP,FOLLOW_LP_in_funcall1415);  
            stream_LP.add(char_literal116);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:20: ( expr_list )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FALSE||LA31_0==ID||LA31_0==INT||LA31_0==LP||LA31_0==MINUS||(LA31_0 >= NOT && LA31_0 <= NOTA)||LA31_0==PLUS||LA31_0==TRUE||LA31_0==55) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1417);
                    expr_list117=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list117.getTree());

                    }
                    break;

            }


            char_literal118=(Token)match(input,RP,FOLLOW_RP_in_funcall1420);  
            stream_RP.add(char_literal118);


            // AST REWRITE
            // elements: ID, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 148:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal120=null;
        BbParser.expr_return expr119 =null;

        BbParser.expr_return expr121 =null;


        BbTree char_literal120_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1453);
            expr119=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr119.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:18: ( ',' ! expr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:19: ',' ! expr
            	    {
            	    char_literal120=(Token)match(input,48,FOLLOW_48_in_expr_list1456); 

            	    pushFollow(FOLLOW_expr_in_expr_list1459);
            	    expr121=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr121.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
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


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\21\uffff";
    static final String DFA20_eofS =
        "\21\uffff";
    static final String DFA20_minS =
        "\1\15\1\uffff\1\15\2\uffff\1\31\1\4\1\15\1\4\1\31\1\4\1\22\1\31"+
        "\1\4\1\51\1\4\1\31";
    static final String DFA20_maxS =
        "\1\67\1\uffff\1\67\2\uffff\1\61\1\60\1\67\1\62\1\61\1\60\1\41\2"+
        "\61\1\60\1\62\1\61";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\1\uffff\1\1\1\2\14\uffff";
    static final String DFA20_specialS =
        "\21\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\4\4\uffff\1\3\1\uffff\1\4\4\uffff\1\2\1\uffff\1\4\4\uffff"+
            "\1\4\1\1\2\uffff\1\4\6\uffff\1\4\13\uffff\1\1",
            "",
            "\1\4\4\uffff\1\6\1\uffff\1\4\4\uffff\1\7\1\uffff\1\4\4\uffff"+
            "\1\4\1\5\2\uffff\1\4\6\uffff\1\4\13\uffff\1\4",
            "",
            "",
            "\1\3\7\uffff\1\3\7\uffff\1\3\6\uffff\1\3\1\4",
            "\1\4\4\uffff\1\4\1\uffff\1\4\4\uffff\2\4\4\uffff\1\4\2\uffff"+
            "\6\4\3\uffff\1\4\1\uffff\1\4\4\uffff\1\10\6\uffff\1\3",
            "\1\4\4\uffff\1\12\1\uffff\1\4\4\uffff\1\4\1\uffff\1\4\4\uffff"+
            "\1\4\1\11\2\uffff\1\4\6\uffff\1\4\13\uffff\1\4",
            "\1\4\4\uffff\3\4\4\uffff\2\4\3\uffff\2\4\3\uffff\5\4\3\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\3\1\4",
            "\1\4\7\uffff\1\4\7\uffff\1\14\6\uffff\1\13\1\4",
            "\1\4\4\uffff\1\4\1\uffff\1\4\4\uffff\2\4\4\uffff\1\4\2\uffff"+
            "\6\4\3\uffff\1\4\1\uffff\1\4\4\uffff\1\15\6\uffff\1\13",
            "\1\16\16\uffff\1\16",
            "\1\3\7\uffff\1\3\7\uffff\1\3\7\uffff\1\4",
            "\1\4\4\uffff\1\4\1\uffff\1\4\4\uffff\2\4\4\uffff\1\4\2\uffff"+
            "\1\3\5\4\2\uffff\1\3\1\4\1\uffff\1\4\4\uffff\1\17\7\uffff\1"+
            "\4",
            "\1\20\6\uffff\1\13",
            "\1\4\4\uffff\3\4\4\uffff\2\4\3\uffff\2\4\3\uffff\5\4\3\uffff"+
            "\1\4\1\uffff\1\4\2\uffff\1\4\1\uffff\1\4\6\uffff\1\4\1\3\1\4",
            "\1\3\7\uffff\1\3\7\uffff\1\3\7\uffff\1\4"
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
            return "117:1: expr : ( playable | boolterm ( OR ^ boolterm )* );";
        }
    }
 

    public static final BitSet FOLLOW_func_in_prog160 = new BitSet(new long[]{0x0678000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_func193 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_func195 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_params_in_func198 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_func200 = new BitSet(new long[]{0x07FC2102020C0000L});
    public static final BitSet FOLLOW_block_instructions_in_func203 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RB_in_func205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params225 = new BitSet(new long[]{0x0678820000000000L});
    public static final BitSet FOLLOW_paramlist_in_params227 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_params230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist256 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_paramlist259 = new BitSet(new long[]{0x0678800000000000L});
    public static final BitSet FOLLOW_param_in_paramlist262 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_47_in_param287 = new BitSet(new long[]{0x0678000000000000L});
    public static final BitSet FOLLOW_type_in_param289 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_param293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_param316 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_param320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions373 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_block_instructions376 = new BitSet(new long[]{0x07FC2102020C0000L});
    public static final BitSet FOLLOW_instruction_in_block_instructions378 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign618 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_assign620 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQ_in_assign624 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_assign626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt743 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt746 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt749 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt751 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt754 = new BitSet(new long[]{0x07FC2102020C0000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt757 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt760 = new BitSet(new long[]{0x07FC2102020C0000L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt763 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt793 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_while_stmt796 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_while_stmt798 = new BitSet(new long[]{0x07FC2102020C0000L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt801 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt828 = new BitSet(new long[]{0x008008130A142002L});
    public static final BitSet FOLLOW_expr_in_return_stmt831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_playable873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notas_in_melodia890 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_melodia892 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_duration_in_melodia894 = new BitSet(new long[]{0x0000000222000002L});
    public static final BitSet FOLLOW_MUL_in_melodia897 = new BitSet(new long[]{0x0000000202000002L});
    public static final BitSet FOLLOW_nota_in_notas917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas927 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_nota_in_notas929 = new BitSet(new long[]{0x0000020202000000L});
    public static final BitSet FOLLOW_nota_in_notas932 = new BitSet(new long[]{0x0000020202000000L});
    public static final BitSet FOLLOW_RP_in_notas936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTA_in_nota954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_chord_in_nota958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_chord964 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_set_in_chord967 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_48_in_chord977 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_set_in_chord979 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_RP_in_chord989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1006 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_duration1008 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_duration1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_polifon1023 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_polifon1025 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LB_in_polifon1027 = new BitSet(new long[]{0x0000108202000000L});
    public static final BitSet FOLLOW_VOICE_in_polifon1032 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_polifon1034 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_melodia_in_polifon1039 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_polifon1041 = new BitSet(new long[]{0x0000108202000000L});
    public static final BitSet FOLLOW_RB_in_polifon1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_speed1065 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_speed1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_expr1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1085 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_OR_in_expr1088 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_boolterm_in_expr1091 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1111 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1114 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1117 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1137 = new BitSet(new long[]{0x0000000044430802L});
    public static final BitSet FOLLOW_EQ_in_boolfact1141 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1146 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_LT_in_boolfact1151 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_LE_in_boolfact1156 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_GT_in_boolfact1161 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_GE_in_boolfact1166 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1190 = new BitSet(new long[]{0x0000001008000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1195 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1200 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_term_in_num_expr1204 = new BitSet(new long[]{0x0000001008000002L});
    public static final BitSet FOLLOW_factor_in_term1228 = new BitSet(new long[]{0x0000000030000202L});
    public static final BitSet FOLLOW_MUL_in_term1233 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_DIV_in_term1238 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_MOD_in_term1243 = new BitSet(new long[]{0x000008110A142000L});
    public static final BitSet FOLLOW_factor_in_term1248 = new BitSet(new long[]{0x0000000030000202L});
    public static final BitSet FOLLOW_NOT_in_factor1271 = new BitSet(new long[]{0x0000080002142000L});
    public static final BitSet FOLLOW_PLUS_in_factor1276 = new BitSet(new long[]{0x0000080002142000L});
    public static final BitSet FOLLOW_MINUS_in_factor1281 = new BitSet(new long[]{0x0000080002142000L});
    public static final BitSet FOLLOW_atom_in_factor1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1386 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_atom1389 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_atom1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1413 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LP_in_funcall1415 = new BitSet(new long[]{0x00800A130A142000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1417 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1453 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_expr_list1456 = new BitSet(new long[]{0x008008130A142000L});
    public static final BitSet FOLLOW_expr_in_expr_list1459 = new BitSet(new long[]{0x0001000000000002L});

}