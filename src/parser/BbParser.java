// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-06-06 22:40:48

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CHORD", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INST", "INSTRUMENT", "INT", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MELODY", "MINUS", "MOD", "MUL", "NEQ", "NOT", "NOTE", "NOTEASSIGN", "NOTEID", "OR", "PACK", "PARAMS", "PITCH", "PLAYABLE", "PLUS", "POLIFONE", "PREF", "PVALUE", "QUIET", "RB", "READ", "RETURN", "RP", "SPEED", "STRING", "THEN", "TRUE", "VOICE", "VOL", "WHILE", "WRITE", "WS", "','", "'.'", "';'", "'Chord'", "'Instrument'", "'Melody'", "'Note'", "'Poli'", "'Speed'", "'Vol'", "'['", "']'", "'bool'", "'int'", "'void'", "'|'"
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
    public static final int T__78=78;
    public static final int T__79=79;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:11: ( func )+ EOF
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:11: ( func )+
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
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog239);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog242);  
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
            // 41:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:1: func : FUNC ^ ID params LB ! block_instructions RB !;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:9: ( FUNC ^ ID params LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:11: FUNC ^ ID params LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FUNC3=(Token)match(input,FUNC,FOLLOW_FUNC_in_func272); 
            FUNC3_tree = 
            (BbTree)adaptor.create(FUNC3)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FUNC3_tree, root_0);


            ID4=(Token)match(input,ID,FOLLOW_ID_in_func275); 
            ID4_tree = 
            (BbTree)adaptor.create(ID4)
            ;
            adaptor.addChild(root_0, ID4_tree);


            pushFollow(FOLLOW_params_in_func277);
            params5=params();

            state._fsp--;

            adaptor.addChild(root_0, params5.getTree());

            LB6=(Token)match(input,LB,FOLLOW_LB_in_func279); 

            pushFollow(FOLLOW_block_instructions_in_func282);
            block_instructions7=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions7.getTree());

            RB8=(Token)match(input,RB,FOLLOW_RB_in_func284); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:11: '(' ( paramlist )? ')'
            {
            char_literal9=(Token)match(input,LP,FOLLOW_LP_in_params304);  
            stream_LP.add(char_literal9);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:15: ( paramlist )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==67||(LA2_0 >= 69 && LA2_0 <= 71)||(LA2_0 >= 76 && LA2_0 <= 78)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params306);
                    paramlist10=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist10.getTree());

                    }
                    break;

            }


            char_literal11=(Token)match(input,RP,FOLLOW_RP_in_params309);  
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
            // 49:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:33: ^( PARAMS ( paramlist )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:49:42: ( paramlist )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:53:1: paramlist : param ( ',' ! param )* ;
    public final BbParser.paramlist_return paramlist() throws RecognitionException {
        BbParser.paramlist_return retval = new BbParser.paramlist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal13=null;
        BbParser.param_return param12 =null;

        BbParser.param_return param14 =null;


        BbTree char_literal13_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:53:10: ( param ( ',' ! param )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:53:12: param ( ',' ! param )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist335);
            param12=param();

            state._fsp--;

            adaptor.addChild(root_0, param12.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:53:18: ( ',' ! param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==64) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:53:19: ',' ! param
            	    {
            	    char_literal13=(Token)match(input,64,FOLLOW_64_in_paramlist338); 

            	    pushFollow(FOLLOW_param_in_paramlist341);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:58:1: param : ( type ^ ID | notetype ^ NOTEID );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:58:9: ( type ^ ID | notetype ^ NOTEID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= 76 && LA4_0 <= 78)) ) {
                alt4=1;
            }
            else if ( (LA4_0==67||(LA4_0 >= 69 && LA4_0 <= 71)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:58:13: type ^ ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_param366);
                    type15=type();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(type15.getTree(), root_0);

                    ID16=(Token)match(input,ID,FOLLOW_ID_in_param369); 
                    ID16_tree = 
                    (BbTree)adaptor.create(ID16)
                    ;
                    adaptor.addChild(root_0, ID16_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:59:13: notetype ^ NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notetype_in_param383);
                    notetype17=notetype();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(notetype17.getTree(), root_0);

                    NOTEID18=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_param386); 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:62:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions430);
            instruction19=instruction();

            state._fsp--;

            stream_instruction.add(instruction19.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:26: ( ';' instruction )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==66) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:27: ';' instruction
            	    {
            	    char_literal20=(Token)match(input,66,FOLLOW_66_in_block_instructions433);  
            	    stream_66.add(char_literal20);


            	    pushFollow(FOLLOW_instruction_in_block_instructions435);
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
            // 64:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:64:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:1: instruction : ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed | instrument | volume | read | write |);
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:9: ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed | instrument | volume | read | write |)
            int alt6=13;
            switch ( input.LA(1) ) {
            case 76:
            case 77:
            case 78:
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
            case 69:
            case 71:
            case 74:
                {
                alt6=7;
                }
                break;
            case 72:
                {
                alt6=8;
                }
                break;
            case 68:
                {
                alt6=9;
                }
                break;
            case 73:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:13: assign
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction494);
                    assign22=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign22.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction518);
                    ite_stmt23=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt23.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:71:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction540);
                    while_stmt24=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt24.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:11: for_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction558);
                    for_stmt25=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt25.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction574);
                    funcall26=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall26.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:74:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction597);
                    return_stmt27=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt27.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:75:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction616);
                    playable28=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable28.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction635);
                    speed29=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed29.getTree());

                    }
                    break;
                case 9 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:77:11: instrument
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_instrument_in_instruction650);
                    instrument30=instrument();

                    state._fsp--;

                    adaptor.addChild(root_0, instrument30.getTree());

                    }
                    break;
                case 10 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:11: volume
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_volume_in_instruction664);
                    volume31=volume();

                    state._fsp--;

                    adaptor.addChild(root_0, volume31.getTree());

                    }
                    break;
                case 11 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:11: read
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction679);
                    read32=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read32.getTree());

                    }
                    break;
                case 12 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:80:12: write
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction704);
                    write33=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write33.getTree());

                    }
                    break;
                case 13 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:82:9: 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:1: assign : ( ( type )? ID EQ expr -> ^( ASSIGN ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:9: ( ( type )? ID EQ expr -> ^( ASSIGN ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||(LA8_0 >= 76 && LA8_0 <= 78)) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:13: ( type )? ID EQ expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:13: ( type )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0 >= 76 && LA7_0 <= 78)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:14: type
                            {
                            pushFollow(FOLLOW_type_in_assign766);
                            type34=type();

                            state._fsp--;

                            stream_type.add(type34.getTree());

                            }
                            break;

                    }


                    ID35=(Token)match(input,ID,FOLLOW_ID_in_assign770);  
                    stream_ID.add(ID35);


                    EQ36=(Token)match(input,EQ,FOLLOW_EQ_in_assign772);  
                    stream_EQ.add(EQ36);


                    pushFollow(FOLLOW_expr_in_assign774);
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
                    // 85:32: -> ^( ASSIGN ID expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:35: ^( ASSIGN ID expr )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:86:5: NOTEID EQ musicnotation
                    {
                    NOTEID38=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign790);  
                    stream_NOTEID.add(NOTEID38);


                    EQ39=(Token)match(input,EQ,FOLLOW_EQ_in_assign792);  
                    stream_EQ.add(EQ39);


                    pushFollow(FOLLOW_musicnotation_in_assign794);
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
                    // 86:29: -> ^( NOTEASSIGN NOTEID musicnotation )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:86:32: ^( NOTEASSIGN NOTEID musicnotation )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:89:1: type : ( 'int' | 'bool' | 'void' );
    public final BbParser.type_return type() throws RecognitionException {
        BbParser.type_return retval = new BbParser.type_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set41=null;

        BbTree set41_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:89:6: ( 'int' | 'bool' | 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set41=(Token)input.LT(1);

            if ( (input.LA(1) >= 76 && input.LA(1) <= 78) ) {
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:1: notetype : ( 'Note' -> NOTE | 'Chord' -> CHORD | 'Melody' -> MELODY | 'Poli' -> POLIFONE );
    public final BbParser.notetype_return notetype() throws RecognitionException {
        BbParser.notetype_return retval = new BbParser.notetype_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal42=null;
        Token string_literal43=null;
        Token string_literal44=null;
        Token string_literal45=null;

        BbTree string_literal42_tree=null;
        BbTree string_literal43_tree=null;
        BbTree string_literal44_tree=null;
        BbTree string_literal45_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:9: ( 'Note' -> NOTE | 'Chord' -> CHORD | 'Melody' -> MELODY | 'Poli' -> POLIFONE )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt9=1;
                }
                break;
            case 67:
                {
                alt9=2;
                }
                break;
            case 69:
                {
                alt9=3;
                }
                break;
            case 71:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:13: 'Note'
                    {
                    string_literal42=(Token)match(input,70,FOLLOW_70_in_notetype867);  
                    stream_70.add(string_literal42);


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
                    // 94:20: -> NOTE
                    {
                        adaptor.addChild(root_0, 
                        (BbTree)adaptor.create(NOTE, "NOTE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:13: 'Chord'
                    {
                    string_literal43=(Token)match(input,67,FOLLOW_67_in_notetype885);  
                    stream_67.add(string_literal43);


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
                    // 95:21: -> CHORD
                    {
                        adaptor.addChild(root_0, 
                        (BbTree)adaptor.create(CHORD, "CHORD")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:13: 'Melody'
                    {
                    string_literal44=(Token)match(input,69,FOLLOW_69_in_notetype903);  
                    stream_69.add(string_literal44);


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
                    // 96:22: -> MELODY
                    {
                        adaptor.addChild(root_0, 
                        (BbTree)adaptor.create(MELODY, "MELODY")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:13: 'Poli'
                    {
                    string_literal45=(Token)match(input,71,FOLLOW_71_in_notetype921);  
                    stream_71.add(string_literal45);


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
                    // 97:20: -> POLIFONE
                    {
                        adaptor.addChild(root_0, 
                        (BbTree)adaptor.create(POLIFONE, "POLIFONE")
                        );

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
    // $ANTLR end "notetype"


    public static class musicnotation_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "musicnotation"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:1: musicnotation : ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| melodia | polifon | NOTEID );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal46=null;
        Token string_literal48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token NOTEID54=null;
        BbParser.notabasica_return notabasica47 =null;

        BbParser.chord_return chord50 =null;

        BbParser.melodia_return melodia52 =null;

        BbParser.polifon_return polifon53 =null;


        BbTree string_literal46_tree=null;
        BbTree string_literal48_tree=null;
        BbTree char_literal49_tree=null;
        BbTree char_literal51_tree=null;
        BbTree NOTEID54_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:15: ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| melodia | polifon | NOTEID )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt10=1;
                }
                break;
            case 67:
                {
                alt10=2;
                }
                break;
            case 69:
                {
                alt10=3;
                }
                break;
            case 71:
                {
                alt10=4;
                }
                break;
            case NOTEID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:17: 'Note' notabasica
                    {
                    string_literal46=(Token)match(input,70,FOLLOW_70_in_musicnotation947);  
                    stream_70.add(string_literal46);


                    pushFollow(FOLLOW_notabasica_in_musicnotation949);
                    notabasica47=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica47.getTree());

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
                    // 100:35: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:38: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:7: 'Chord' ! '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal48=(Token)match(input,67,FOLLOW_67_in_musicnotation965); 

                    char_literal49=(Token)match(input,LP,FOLLOW_LP_in_musicnotation968); 

                    pushFollow(FOLLOW_chord_in_musicnotation971);
                    chord50=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord50.getTree());

                    char_literal51=(Token)match(input,RP,FOLLOW_RP_in_musicnotation973); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:102:7: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_musicnotation982);
                    melodia52=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia52.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation990);
                    polifon53=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon53.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:104:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID54=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation998); 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:1: ite_stmt : IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? ;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF55=null;
        Token LP56=null;
        Token RP58=null;
        Token LB59=null;
        Token RB61=null;
        Token ELSE62=null;
        Token LB63=null;
        Token RB65=null;
        BbParser.expr_return expr57 =null;

        BbParser.block_instructions_return block_instructions60 =null;

        BbParser.block_instructions_return block_instructions64 =null;


        BbTree IF55_tree=null;
        BbTree LP56_tree=null;
        BbTree RP58_tree=null;
        BbTree LB59_tree=null;
        BbTree RB61_tree=null;
        BbTree ELSE62_tree=null;
        BbTree LB63_tree=null;
        BbTree RB65_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:13: ( IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:17: IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)?
            {
            root_0 = (BbTree)adaptor.nil();


            IF55=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt1018); 
            IF55_tree = 
            (BbTree)adaptor.create(IF55)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF55_tree, root_0);


            LP56=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt1021); 

            pushFollow(FOLLOW_expr_in_ite_stmt1024);
            expr57=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr57.getTree());

            RP58=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt1026); 

            LB59=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt1029); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt1032);
            block_instructions60=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions60.getTree());

            RB61=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt1034); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:61: ( ELSE ! LB ! block_instructions RB !)?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:62: ELSE ! LB ! block_instructions RB !
                    {
                    ELSE62=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt1038); 

                    LB63=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt1041); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1044);
                    block_instructions64=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions64.getTree());

                    RB65=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt1046); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:1: while_stmt : WHILE ^ LP ! expr RP ! LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE66=null;
        Token LP67=null;
        Token RP69=null;
        Token LB70=null;
        Token RB72=null;
        BbParser.expr_return expr68 =null;

        BbParser.block_instructions_return block_instructions71 =null;


        BbTree WHILE66_tree=null;
        BbTree LP67_tree=null;
        BbTree RP69_tree=null;
        BbTree LB70_tree=null;
        BbTree RB72_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:13: ( WHILE ^ LP ! expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:17: WHILE ^ LP ! expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE66=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1074); 
            WHILE66_tree = 
            (BbTree)adaptor.create(WHILE66)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE66_tree, root_0);


            LP67=(Token)match(input,LP,FOLLOW_LP_in_while_stmt1077); 

            pushFollow(FOLLOW_expr_in_while_stmt1080);
            expr68=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr68.getTree());

            RP69=(Token)match(input,RP,FOLLOW_RP_in_while_stmt1082); 

            LB70=(Token)match(input,LB,FOLLOW_LB_in_while_stmt1085); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1088);
            block_instructions71=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions71.getTree());

            RB72=(Token)match(input,RB,FOLLOW_RB_in_while_stmt1090); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:1: for_stmt : FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !;
    public final BbParser.for_stmt_return for_stmt() throws RecognitionException {
        BbParser.for_stmt_return retval = new BbParser.for_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token FOR73=null;
        Token LP74=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token RP80=null;
        Token LB81=null;
        Token RB83=null;
        BbParser.assign_return assign75 =null;

        BbParser.expr_return expr77 =null;

        BbParser.assign_return assign79 =null;

        BbParser.block_instructions_return block_instructions82 =null;


        BbTree FOR73_tree=null;
        BbTree LP74_tree=null;
        BbTree char_literal76_tree=null;
        BbTree char_literal78_tree=null;
        BbTree RP80_tree=null;
        BbTree LB81_tree=null;
        BbTree RB83_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:11: ( FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:15: FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR73=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1128); 
            FOR73_tree = 
            (BbTree)adaptor.create(FOR73)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR73_tree, root_0);


            LP74=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1131); 

            pushFollow(FOLLOW_assign_in_for_stmt1134);
            assign75=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign75.getTree());

            char_literal76=(Token)match(input,66,FOLLOW_66_in_for_stmt1136); 

            pushFollow(FOLLOW_expr_in_for_stmt1139);
            expr77=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr77.getTree());

            char_literal78=(Token)match(input,66,FOLLOW_66_in_for_stmt1141); 

            pushFollow(FOLLOW_assign_in_for_stmt1144);
            assign79=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign79.getTree());

            RP80=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1146); 

            LB81=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1149); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1152);
            block_instructions82=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions82.getTree());

            RB83=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1154); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:1: return_stmt : RETURN ^ ( all_expr )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN84=null;
        BbParser.all_expr_return all_expr85 =null;


        BbTree RETURN84_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:13: ( RETURN ^ ( all_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:17: RETURN ^ ( all_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN84=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1179); 
            RETURN84_tree = 
            (BbTree)adaptor.create(RETURN84)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN84_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:25: ( all_expr )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INT||LA12_0==LP||LA12_0==MINUS||LA12_0==NOT||LA12_0==NOTEID||LA12_0==PLUS||LA12_0==TRUE||LA12_0==67||(LA12_0 >= 69 && LA12_0 <= 71)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:25: all_expr
                    {
                    pushFollow(FOLLOW_all_expr_in_return_stmt1182);
                    all_expr85=all_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, all_expr85.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:1: playable : ( melodia | polifon | NOTEID -> ^( PLAYABLE NOTEID ) | notelist );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID88=null;
        BbParser.melodia_return melodia86 =null;

        BbParser.polifon_return polifon87 =null;

        BbParser.notelist_return notelist89 =null;


        BbTree NOTEID88_tree=null;
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:9: ( melodia | polifon | NOTEID -> ^( PLAYABLE NOTEID ) | notelist )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt13=1;
                }
                break;
            case 71:
                {
                alt13=2;
                }
                break;
            case NOTEID:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==RB||LA13_3==66) ) {
                    alt13=3;
                }
                else if ( (LA13_3==LP||LA13_3==65) ) {
                    alt13=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            case LP:
            case PITCH:
            case QUIET:
            case 74:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1200);
                    melodia86=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia86.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:126:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1212);
                    polifon87=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon87.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:11: NOTEID
                    {
                    NOTEID88=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1224);  
                    stream_NOTEID.add(NOTEID88);


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
                    // 127:18: -> ^( PLAYABLE NOTEID )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:21: ^( PLAYABLE NOTEID )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:11: notelist
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notelist_in_playable1244);
                    notelist89=notelist();

                    state._fsp--;

                    adaptor.addChild(root_0, notelist89.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:1: read : READ ^ ID ;
    public final BbParser.read_return read() throws RecognitionException {
        BbParser.read_return retval = new BbParser.read_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token READ90=null;
        Token ID91=null;

        BbTree READ90_tree=null;
        BbTree ID91_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:6: ( READ ^ ID )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:8: READ ^ ID
            {
            root_0 = (BbTree)adaptor.nil();


            READ90=(Token)match(input,READ,FOLLOW_READ_in_read1271); 
            READ90_tree = 
            (BbTree)adaptor.create(READ90)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(READ90_tree, root_0);


            ID91=(Token)match(input,ID,FOLLOW_ID_in_read1274); 
            ID91_tree = 
            (BbTree)adaptor.create(ID91)
            ;
            adaptor.addChild(root_0, ID91_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:1: write : WRITE ^ ( expr | STRING ) ;
    public final BbParser.write_return write() throws RecognitionException {
        BbParser.write_return retval = new BbParser.write_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WRITE92=null;
        Token STRING94=null;
        BbParser.expr_return expr93 =null;


        BbTree WRITE92_tree=null;
        BbTree STRING94_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:7: ( WRITE ^ ( expr | STRING ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (BbTree)adaptor.nil();


            WRITE92=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1294); 
            WRITE92_tree = 
            (BbTree)adaptor.create(WRITE92)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WRITE92_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:18: ( expr | STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FALSE||LA14_0==ID||LA14_0==INT||LA14_0==LP||LA14_0==MINUS||LA14_0==NOT||LA14_0==PLUS||LA14_0==TRUE) ) {
                alt14=1;
            }
            else if ( (LA14_0==STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1298);
                    expr93=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr93.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:26: STRING
                    {
                    STRING94=(Token)match(input,STRING,FOLLOW_STRING_in_write1302); 
                    STRING94_tree = 
                    (BbTree)adaptor.create(STRING94)
                    ;
                    adaptor.addChild(root_0, STRING94_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:1: instrument : 'Instrument' INT -> ^( INSTRUMENT INT ) ;
    public final BbParser.instrument_return instrument() throws RecognitionException {
        BbParser.instrument_return retval = new BbParser.instrument_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal95=null;
        Token INT96=null;

        BbTree string_literal95_tree=null;
        BbTree INT96_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:12: ( 'Instrument' INT -> ^( INSTRUMENT INT ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:14: 'Instrument' INT
            {
            string_literal95=(Token)match(input,68,FOLLOW_68_in_instrument1321);  
            stream_68.add(string_literal95);


            INT96=(Token)match(input,INT,FOLLOW_INT_in_instrument1323);  
            stream_INT.add(INT96);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 140:31: -> ^( INSTRUMENT INT )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:34: ^( INSTRUMENT INT )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(INSTRUMENT, "INSTRUMENT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

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
    // $ANTLR end "instrument"


    public static class volume_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "volume"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:1: volume : 'Vol' INT -> ^( VOL INT ) ;
    public final BbParser.volume_return volume() throws RecognitionException {
        BbParser.volume_return retval = new BbParser.volume_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal97=null;
        Token INT98=null;

        BbTree string_literal97_tree=null;
        BbTree INT98_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:9: ( 'Vol' INT -> ^( VOL INT ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:11: 'Vol' INT
            {
            string_literal97=(Token)match(input,73,FOLLOW_73_in_volume1343);  
            stream_73.add(string_literal97);


            INT98=(Token)match(input,INT,FOLLOW_INT_in_volume1345);  
            stream_INT.add(INT98);


            // AST REWRITE
            // elements: INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 142:21: -> ^( VOL INT )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:24: ^( VOL INT )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(VOL, "VOL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT.nextNode()
                );

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
    // $ANTLR end "volume"


    public static class melodia_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "melodia"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:1: melodia : 'Melody' '(' INT ( notelist )+ ')' -> ^( MELODY INT ( notelist )+ ) ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal99=null;
        Token char_literal100=null;
        Token INT101=null;
        Token char_literal103=null;
        BbParser.notelist_return notelist102 =null;


        BbTree string_literal99_tree=null;
        BbTree char_literal100_tree=null;
        BbTree INT101_tree=null;
        BbTree char_literal103_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:8: ( 'Melody' '(' INT ( notelist )+ ')' -> ^( MELODY INT ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:10: 'Melody' '(' INT ( notelist )+ ')'
            {
            string_literal99=(Token)match(input,69,FOLLOW_69_in_melodia1361);  
            stream_69.add(string_literal99);


            char_literal100=(Token)match(input,LP,FOLLOW_LP_in_melodia1363);  
            stream_LP.add(char_literal100);


            INT101=(Token)match(input,INT,FOLLOW_INT_in_melodia1365);  
            stream_INT.add(INT101);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:27: ( notelist )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LP||LA15_0==NOTEID||LA15_0==PITCH||LA15_0==QUIET||LA15_0==74) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:27: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1367);
            	    notelist102=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist102.getTree());

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


            char_literal103=(Token)match(input,RP,FOLLOW_RP_in_melodia1370);  
            stream_RP.add(char_literal103);


            // AST REWRITE
            // elements: INT, notelist
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 144:41: -> ^( MELODY INT ( notelist )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:44: ^( MELODY INT ( notelist )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:1: notelist : notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) ;
    public final BbParser.notelist_return notelist() throws RecognitionException {
        BbParser.notelist_return retval = new BbParser.notelist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal105=null;
        Token MUL107=null;
        BbParser.notas_return notas104 =null;

        BbParser.duration_return duration106 =null;


        BbTree char_literal105_tree=null;
        BbTree MUL107_tree=null;
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1397);
            notas104=notas();

            state._fsp--;

            stream_notas.add(notas104.getTree());

            char_literal105=(Token)match(input,65,FOLLOW_65_in_notelist1399);  
            stream_65.add(char_literal105);


            pushFollow(FOLLOW_duration_in_notelist1401);
            duration106=duration();

            state._fsp--;

            stream_duration.add(duration106.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:30: ( MUL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MUL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:30: MUL
                    {
                    MUL107=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1403);  
                    stream_MUL.add(MUL107);


                    }
                    break;

            }


            // AST REWRITE
            // elements: notas, duration, MUL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 147:35: -> ^( PLAYABLE notas duration ( MUL )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:38: ^( PLAYABLE notas duration ( MUL )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                , root_1);

                adaptor.addChild(root_1, stream_notas.nextTree());

                adaptor.addChild(root_1, stream_duration.nextTree());

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:64: ( MUL )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:149:1: notas : ( nota | '[' ! pack ']' !| '(' ! chord ')' !);
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal109=null;
        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal114=null;
        BbParser.nota_return nota108 =null;

        BbParser.pack_return pack110 =null;

        BbParser.chord_return chord113 =null;


        BbTree char_literal109_tree=null;
        BbTree char_literal111_tree=null;
        BbTree char_literal112_tree=null;
        BbTree char_literal114_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:149:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
            int alt17=3;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
            case QUIET:
                {
                alt17=1;
                }
                break;
            case 74:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:149:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1424);
                    nota108=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota108.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:150:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal109=(Token)match(input,74,FOLLOW_74_in_notas1433); 

                    pushFollow(FOLLOW_pack_in_notas1436);
                    pack110=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack110.getTree());

                    char_literal111=(Token)match(input,75,FOLLOW_75_in_notas1438); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal112=(Token)match(input,LP,FOLLOW_LP_in_notas1448); 

                    pushFollow(FOLLOW_chord_in_notas1451);
                    chord113=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord113.getTree());

                    char_literal114=(Token)match(input,RP,FOLLOW_RP_in_notas1453); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:1: nota : ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET -> ^( NOTE QUIET ) );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID116=null;
        Token char_literal117=null;
        Token PLUS118=null;
        Token char_literal120=null;
        Token QUIET121=null;
        BbParser.notabasica_return notabasica115 =null;

        BbParser.num_expr_return num_expr119 =null;


        BbTree NOTEID116_tree=null;
        BbTree char_literal117_tree=null;
        BbTree PLUS118_tree=null;
        BbTree char_literal120_tree=null;
        BbTree QUIET121_tree=null;
        RewriteRuleTokenStream stream_QUIET=new RewriteRuleTokenStream(adaptor,"token QUIET");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET -> ^( NOTE QUIET ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case PITCH:
                {
                alt19=1;
                }
                break;
            case NOTEID:
                {
                alt19=2;
                }
                break;
            case QUIET:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1472);
                    notabasica115=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica115.getTree());

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
                    // 154:19: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:22: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:4: NOTEID ( '(' ! PLUS ^ num_expr ')' !)?
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID116=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1486); 
                    NOTEID116_tree = 
                    (BbTree)adaptor.create(NOTEID116)
                    ;
                    adaptor.addChild(root_0, NOTEID116_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LP) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal117=(Token)match(input,LP,FOLLOW_LP_in_nota1490); 

                            PLUS118=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1493); 
                            PLUS118_tree = 
                            (BbTree)adaptor.create(PLUS118)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS118_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1496);
                            num_expr119=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr119.getTree());

                            char_literal120=(Token)match(input,RP,FOLLOW_RP_in_nota1498); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:4: QUIET
                    {
                    QUIET121=(Token)match(input,QUIET,FOLLOW_QUIET_in_nota1506);  
                    stream_QUIET.add(QUIET121);


                    // AST REWRITE
                    // elements: QUIET
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 156:10: -> ^( NOTE QUIET )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:13: ^( NOTE QUIET )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(NOTE, "NOTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_QUIET.nextNode()
                        );

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
    // $ANTLR end "nota"


    public static class chord_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chord"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:1: chord : sub_chord -> ^( CHORD sub_chord ) ;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord122 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1526);
            sub_chord122=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord122.getTree());

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
            // 160:18: -> ^( CHORD sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:21: ^( CHORD sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:1: sub_chord : nota ( ',' ! ( nota ) )* ;
    public final BbParser.sub_chord_return sub_chord() throws RecognitionException {
        BbParser.sub_chord_return retval = new BbParser.sub_chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal124=null;
        BbParser.nota_return nota123 =null;

        BbParser.nota_return nota125 =null;


        BbTree char_literal124_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1544);
            nota123=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota123.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:17: ( ',' ! ( nota ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==64) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:19: ',' ! ( nota )
            	    {
            	    char_literal124=(Token)match(input,64,FOLLOW_64_in_sub_chord1548); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1552);
            	    nota125=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota125.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:1: pack : sub_chord -> ^( PACK sub_chord ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord126 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1565);
            sub_chord126=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord126.getTree());

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
            // 166:17: -> ^( PACK sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:20: ^( PACK sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:1: duration : ( INT | '(' ! num_expr ')' !);
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT127=null;
        Token char_literal128=null;
        Token char_literal130=null;
        BbParser.num_expr_return num_expr129 =null;


        BbTree INT127_tree=null;
        BbTree char_literal128_tree=null;
        BbTree char_literal130_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:9: ( INT | '(' ! num_expr ')' !)
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT127=(Token)match(input,INT,FOLLOW_INT_in_duration1584); 
                    INT127_tree = 
                    (BbTree)adaptor.create(INT127)
                    ;
                    adaptor.addChild(root_0, INT127_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal128=(Token)match(input,LP,FOLLOW_LP_in_duration1593); 

                    pushFollow(FOLLOW_num_expr_in_duration1596);
                    num_expr129=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr129.getTree());

                    char_literal130=(Token)match(input,RP,FOLLOW_RP_in_duration1598); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:1: polifon : 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) ;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal131=null;
        Token LB132=null;
        Token RB134=null;
        BbParser.voices_return voices133 =null;


        BbTree string_literal131_tree=null;
        BbTree LB132_tree=null;
        BbTree RB134_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:9: ( 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:11: 'Poli' LB ( voices )+ RB
            {
            string_literal131=(Token)match(input,71,FOLLOW_71_in_polifon1612);  
            stream_71.add(string_literal131);


            LB132=(Token)match(input,LB,FOLLOW_LB_in_polifon1614);  
            stream_LB.add(LB132);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:21: ( voices )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==NOTEID||LA22_0==69) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:21: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1616);
            	    voices133=voices();

            	    state._fsp--;

            	    stream_voices.add(voices133.getTree());

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


            RB134=(Token)match(input,RB,FOLLOW_RB_in_polifon1619);  
            stream_RB.add(RB134);


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
            // 174:32: -> ^( POLIFONE ( voices )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:35: ^( POLIFONE ( voices )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:1: voices : ( melodia '|' !| NOTEID '|' !);
    public final BbParser.voices_return voices() throws RecognitionException {
        BbParser.voices_return retval = new BbParser.voices_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal136=null;
        Token NOTEID137=null;
        Token char_literal138=null;
        BbParser.melodia_return melodia135 =null;


        BbTree char_literal136_tree=null;
        BbTree NOTEID137_tree=null;
        BbTree char_literal138_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:7: ( melodia '|' !| NOTEID '|' !)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==69) ) {
                alt23=1;
            }
            else if ( (LA23_0==NOTEID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:9: melodia '|' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_voices1652);
                    melodia135=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia135.getTree());

                    char_literal136=(Token)match(input,79,FOLLOW_79_in_voices1654); 

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:178:4: NOTEID '|' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID137=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_voices1660); 
                    NOTEID137_tree = 
                    (BbTree)adaptor.create(NOTEID137)
                    ;
                    adaptor.addChild(root_0, NOTEID137_tree);


                    char_literal138=(Token)match(input,79,FOLLOW_79_in_voices1663); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:1: speed : 'Speed' num_expr -> ^( SPEED num_expr ) ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal139=null;
        BbParser.num_expr_return num_expr140 =null;


        BbTree string_literal139_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:7: ( 'Speed' num_expr -> ^( SPEED num_expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:9: 'Speed' num_expr
            {
            string_literal139=(Token)match(input,72,FOLLOW_72_in_speed1675);  
            stream_72.add(string_literal139);


            pushFollow(FOLLOW_num_expr_in_speed1677);
            num_expr140=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr140.getTree());

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
            // 181:26: -> ^( SPEED num_expr )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:29: ^( SPEED num_expr )
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


    public static class all_expr_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "all_expr"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:1: all_expr : ( expr | musicnotation );
    public final BbParser.all_expr_return all_expr() throws RecognitionException {
        BbParser.all_expr_return retval = new BbParser.all_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.expr_return expr141 =null;

        BbParser.musicnotation_return musicnotation142 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:9: ( expr | musicnotation )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==FALSE||LA24_0==ID||LA24_0==INT||LA24_0==LP||LA24_0==MINUS||LA24_0==NOT||LA24_0==PLUS||LA24_0==TRUE) ) {
                alt24=1;
            }
            else if ( (LA24_0==NOTEID||LA24_0==67||(LA24_0 >= 69 && LA24_0 <= 71)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:12: expr
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_all_expr1694);
                    expr141=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr141.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:19: musicnotation
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_musicnotation_in_all_expr1698);
                    musicnotation142=musicnotation();

                    state._fsp--;

                    adaptor.addChild(root_0, musicnotation142.getTree());

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
    // $ANTLR end "all_expr"


    public static class expr_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:1: expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR144=null;
        BbParser.boolterm_return boolterm143 =null;

        BbParser.boolterm_return boolterm145 =null;


        BbTree OR144_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:6: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1705);
            boolterm143=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm143.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:17: ( OR ^ boolterm )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==OR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:18: OR ^ boolterm
            	    {
            	    OR144=(Token)match(input,OR,FOLLOW_OR_in_expr1708); 
            	    OR144_tree = 
            	    (BbTree)adaptor.create(OR144)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR144_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1711);
            	    boolterm145=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm145.getTree());

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
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND147=null;
        BbParser.boolfact_return boolfact146 =null;

        BbParser.boolfact_return boolfact148 =null;


        BbTree AND147_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1722);
            boolfact146=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact146.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:22: ( AND ^ boolfact )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==AND) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:23: AND ^ boolfact
            	    {
            	    AND147=(Token)match(input,AND,FOLLOW_AND_in_boolterm1725); 
            	    AND147_tree = 
            	    (BbTree)adaptor.create(AND147)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND147_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1728);
            	    boolfact148=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact148.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ150=null;
        Token NEQ151=null;
        Token LT152=null;
        Token LE153=null;
        Token GT154=null;
        Token GE155=null;
        BbParser.num_expr_return num_expr149 =null;

        BbParser.num_expr_return num_expr156 =null;


        BbTree EQ150_tree=null;
        BbTree NEQ151_tree=null;
        BbTree LT152_tree=null;
        BbTree LE153_tree=null;
        BbTree GT154_tree=null;
        BbTree GE155_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1748);
            num_expr149=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr149.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==EQ||(LA28_0 >= GE && LA28_0 <= GT)||LA28_0==LE||LA28_0==LT||LA28_0==NEQ) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
                    int alt27=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt27=1;
                        }
                        break;
                    case NEQ:
                        {
                        alt27=2;
                        }
                        break;
                    case LT:
                        {
                        alt27=3;
                        }
                        break;
                    case LE:
                        {
                        alt27=4;
                        }
                        break;
                    case GT:
                        {
                        alt27=5;
                        }
                        break;
                    case GE:
                        {
                        alt27=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }

                    switch (alt27) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:24: EQ ^
                            {
                            EQ150=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1752); 
                            EQ150_tree = 
                            (BbTree)adaptor.create(EQ150)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ150_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:30: NEQ ^
                            {
                            NEQ151=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1757); 
                            NEQ151_tree = 
                            (BbTree)adaptor.create(NEQ151)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ151_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:37: LT ^
                            {
                            LT152=(Token)match(input,LT,FOLLOW_LT_in_boolfact1762); 
                            LT152_tree = 
                            (BbTree)adaptor.create(LT152)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT152_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:43: LE ^
                            {
                            LE153=(Token)match(input,LE,FOLLOW_LE_in_boolfact1767); 
                            LE153_tree = 
                            (BbTree)adaptor.create(LE153)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE153_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:49: GT ^
                            {
                            GT154=(Token)match(input,GT,FOLLOW_GT_in_boolfact1772); 
                            GT154_tree = 
                            (BbTree)adaptor.create(GT154)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT154_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:55: GE ^
                            {
                            GE155=(Token)match(input,GE,FOLLOW_GE_in_boolfact1777); 
                            GE155_tree = 
                            (BbTree)adaptor.create(GE155)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE155_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1781);
                    num_expr156=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr156.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS158=null;
        Token MINUS159=null;
        BbParser.term_return term157 =null;

        BbParser.term_return term160 =null;


        BbTree PLUS158_tree=null;
        BbTree MINUS159_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1801);
            term157=term();

            state._fsp--;

            adaptor.addChild(root_0, term157.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:18: ( ( PLUS ^| MINUS ^) term )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==MINUS||LA30_0==PLUS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:20: ( PLUS ^| MINUS ^)
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==PLUS) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==MINUS) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:21: PLUS ^
            	            {
            	            PLUS158=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1806); 
            	            PLUS158_tree = 
            	            (BbTree)adaptor.create(PLUS158)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS158_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:193:29: MINUS ^
            	            {
            	            MINUS159=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1811); 
            	            MINUS159_tree = 
            	            (BbTree)adaptor.create(MINUS159)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS159_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1815);
            	    term160=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term160.getTree());

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
    // $ANTLR end "num_expr"


    public static class term_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL162=null;
        Token DIV163=null;
        Token MOD164=null;
        BbParser.factor_return factor161 =null;

        BbParser.factor_return factor165 =null;


        BbTree MUL162_tree=null;
        BbTree DIV163_tree=null;
        BbTree MOD164_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1839);
            factor161=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor161.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==DIV||(LA32_0 >= MOD && LA32_0 <= MUL)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt31=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt31=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt31=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt31=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt31) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:23: MUL ^
            	            {
            	            MUL162=(Token)match(input,MUL,FOLLOW_MUL_in_term1844); 
            	            MUL162_tree = 
            	            (BbTree)adaptor.create(MUL162)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL162_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:30: DIV ^
            	            {
            	            DIV163=(Token)match(input,DIV,FOLLOW_DIV_in_term1849); 
            	            DIV163_tree = 
            	            (BbTree)adaptor.create(DIV163)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV163_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:37: MOD ^
            	            {
            	            MOD164=(Token)match(input,MOD,FOLLOW_MOD_in_term1854); 
            	            MOD164_tree = 
            	            (BbTree)adaptor.create(MOD164)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD164_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1859);
            	    factor165=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor165.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT166=null;
        Token PLUS167=null;
        Token MINUS168=null;
        BbParser.atom_return atom169 =null;


        BbTree NOT166_tree=null;
        BbTree PLUS167_tree=null;
        BbTree MINUS168_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt33=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt33=1;
                    }
                    break;
                case PLUS:
                    {
                    alt33=2;
                    }
                    break;
                case MINUS:
                    {
                    alt33=3;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:14: NOT ^
                    {
                    NOT166=(Token)match(input,NOT,FOLLOW_NOT_in_factor1882); 
                    NOT166_tree = 
                    (BbTree)adaptor.create(NOT166)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT166_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:21: PLUS ^
                    {
                    PLUS167=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1887); 
                    PLUS167_tree = 
                    (BbTree)adaptor.create(PLUS167)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS167_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:29: MINUS ^
                    {
                    MINUS168=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1892); 
                    MINUS168_tree = 
                    (BbTree)adaptor.create(MINUS168)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS168_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1897);
            atom169=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom169.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:205:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID170=null;
        Token INT171=null;
        Token char_literal173=null;
        Token char_literal175=null;
        BbParser.funcall_return funcall172 =null;

        BbParser.expr_return expr174 =null;


        BbTree b_tree=null;
        BbTree ID170_tree=null;
        BbTree INT171_tree=null;
        BbTree char_literal173_tree=null;
        BbTree char_literal175_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:205:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt35=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==LP) ) {
                    alt35=4;
                }
                else if ( (LA35_1==AND||LA35_1==DIV||LA35_1==EQ||(LA35_1 >= GE && LA35_1 <= GT)||LA35_1==LE||LA35_1==LT||(LA35_1 >= MINUS && LA35_1 <= NEQ)||LA35_1==OR||LA35_1==PLUS||LA35_1==RB||LA35_1==RP||LA35_1==64||LA35_1==66) ) {
                    alt35=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt35=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt35=3;
                }
                break;
            case LP:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:205:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID170=(Token)match(input,ID,FOLLOW_ID_in_atom1922); 
                    ID170_tree = 
                    (BbTree)adaptor.create(ID170)
                    ;
                    adaptor.addChild(root_0, ID170_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT171=(Token)match(input,INT,FOLLOW_INT_in_atom1936); 
                    INT171_tree = 
                    (BbTree)adaptor.create(INT171)
                    ;
                    adaptor.addChild(root_0, INT171_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:13: (b= TRUE |b= FALSE )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==TRUE) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==FALSE) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;

                    }
                    switch (alt34) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1953);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1959);  
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
                    // 207:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:207:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:11: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1980);
                    funcall172=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall172.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:13: '(' ! expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal173=(Token)match(input,LP,FOLLOW_LP_in_atom1994); 

                    pushFollow(FOLLOW_expr_in_atom1997);
                    expr174=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr174.getTree());

                    char_literal175=(Token)match(input,RP,FOLLOW_RP_in_atom1999); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID176=null;
        Token char_literal177=null;
        Token char_literal179=null;
        BbParser.expr_list_return expr_list178 =null;


        BbTree ID176_tree=null;
        BbTree char_literal177_tree=null;
        BbTree char_literal179_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:13: ID '(' ( expr_list )? ')'
            {
            ID176=(Token)match(input,ID,FOLLOW_ID_in_funcall2019);  
            stream_ID.add(ID176);


            char_literal177=(Token)match(input,LP,FOLLOW_LP_in_funcall2021);  
            stream_LP.add(char_literal177);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:20: ( expr_list )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==FALSE||LA36_0==ID||LA36_0==INT||LA36_0==LP||LA36_0==MINUS||LA36_0==NOT||LA36_0==NOTEID||LA36_0==PLUS||LA36_0==TRUE||LA36_0==67||(LA36_0 >= 69 && LA36_0 <= 71)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall2023);
                    expr_list178=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list178.getTree());

                    }
                    break;

            }


            char_literal179=(Token)match(input,RP,FOLLOW_RP_in_funcall2026);  
            stream_RP.add(char_literal179);


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
            // 212:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:212:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:1: expr_list : all_expr ( ',' ! all_expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal181=null;
        BbParser.all_expr_return all_expr180 =null;

        BbParser.all_expr_return all_expr182 =null;


        BbTree char_literal181_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:10: ( all_expr ( ',' ! all_expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:13: all_expr ( ',' ! all_expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_all_expr_in_expr_list2059);
            all_expr180=all_expr();

            state._fsp--;

            adaptor.addChild(root_0, all_expr180.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:22: ( ',' ! all_expr )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==64) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:216:23: ',' ! all_expr
            	    {
            	    char_literal181=(Token)match(input,64,FOLLOW_64_in_expr_list2062); 

            	    pushFollow(FOLLOW_all_expr_in_expr_list2065);
            	    all_expr182=all_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, all_expr182.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:1: notabasica : PITCH ( ALT )? ( INT )? ;
    public final BbParser.notabasica_return notabasica() throws RecognitionException {
        BbParser.notabasica_return retval = new BbParser.notabasica_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PITCH183=null;
        Token ALT184=null;
        Token INT185=null;

        BbTree PITCH183_tree=null;
        BbTree ALT184_tree=null;
        BbTree INT185_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:12: ( PITCH ( ALT )? ( INT )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:14: PITCH ( ALT )? ( INT )?
            {
            root_0 = (BbTree)adaptor.nil();


            PITCH183=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica2084); 
            PITCH183_tree = 
            (BbTree)adaptor.create(PITCH183)
            ;
            adaptor.addChild(root_0, PITCH183_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:20: ( ALT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ALT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:20: ALT
                    {
                    ALT184=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica2086); 
                    ALT184_tree = 
                    (BbTree)adaptor.create(ALT184)
                    ;
                    adaptor.addChild(root_0, ALT184_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:25: ( INT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:219:25: INT
                    {
                    INT185=(Token)match(input,INT,FOLLOW_INT_in_notabasica2089); 
                    INT185_tree = 
                    (BbTree)adaptor.create(INT185)
                    ;
                    adaptor.addChild(root_0, INT185_tree);


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


 

    public static final BitSet FOLLOW_func_in_prog239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_EOF_in_prog242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_func272 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_func275 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_params_in_func277 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_func279 = new BitSet(new long[]{0x6034110040610000L,0x00000000000077B4L});
    public static final BitSet FOLLOW_block_instructions_in_func282 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_func284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params304 = new BitSet(new long[]{0x0040000000000000L,0x00000000000070E8L});
    public static final BitSet FOLLOW_paramlist_in_params306 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_params309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist335 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_paramlist338 = new BitSet(new long[]{0x0000000000000000L,0x00000000000070E8L});
    public static final BitSet FOLLOW_param_in_paramlist341 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_in_param366 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_param383 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_NOTEID_in_param386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_block_instructions433 = new BitSet(new long[]{0x6034110040610000L,0x00000000000077B4L});
    public static final BitSet FOLLOW_instruction_in_block_instructions435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_assign_in_instruction494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrument_in_instruction650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_volume_in_instruction664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign766 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_assign770 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign772 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_assign774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_assign790 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign792 = new BitSet(new long[]{0x0000010000000000L,0x00000000000000E8L});
    public static final BitSet FOLLOW_musicnotation_in_assign794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_notetype867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_notetype885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_notetype903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_notetype921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_musicnotation947 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_notabasica_in_musicnotation949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_musicnotation965 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation968 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation971 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_musicnotation982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt1018 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt1021 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt1024 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt1026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt1029 = new BitSet(new long[]{0x6034110040610000L,0x00000000000077B4L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1032 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt1034 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt1038 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt1041 = new BitSet(new long[]{0x6034110040610000L,0x00000000000077B4L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1044 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1074 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt1077 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1080 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt1082 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt1085 = new BitSet(new long[]{0x6034110040610000L,0x00000000000077B4L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1088 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1128 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1131 = new BitSet(new long[]{0x0000010000200000L,0x0000000000007000L});
    public static final BitSet FOLLOW_assign_in_for_stmt1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_stmt1136 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_for_stmt1141 = new BitSet(new long[]{0x0000010000200000L,0x0000000000007000L});
    public static final BitSet FOLLOW_assign_in_for_stmt1144 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1146 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1149 = new BitSet(new long[]{0x6034110040610000L,0x00000000000077B4L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1152 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1179 = new BitSet(new long[]{0x0400412242208002L,0x00000000000000E8L});
    public static final BitSet FOLLOW_all_expr_in_return_stmt1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_playable1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1271 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_read1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1294 = new BitSet(new long[]{0x0500402242208000L});
    public static final BitSet FOLLOW_expr_in_write1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_instrument1321 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_instrument1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_volume1343 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_volume1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_melodia1361 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_melodia1363 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_INT_in_melodia1365 = new BitSet(new long[]{0x0004110040000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_notelist_in_melodia1367 = new BitSet(new long[]{0x0044110040000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RP_in_melodia1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notas_in_notelist1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_notelist1399 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_duration_in_notelist1401 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_notas1433 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_pack_in_notas1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_notas1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1448 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_chord_in_notas1451 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1486 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_LP_in_nota1490 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1493 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_nota1496 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIET_in_nota1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1544 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_sub_chord1548 = new BitSet(new long[]{0x0004110000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1552 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_sub_chord_in_pack1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1593 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_duration1596 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_polifon1612 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LB_in_polifon1614 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_voices_in_polifon1616 = new BitSet(new long[]{0x0008010000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RB_in_polifon1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_voices1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_voices1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_voices1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_voices1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_speed1675 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_speed1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_all_expr1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_all_expr1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1705 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_OR_in_expr1708 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_boolterm_in_expr1711 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1722 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1725 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1728 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1748 = new BitSet(new long[]{0x0000001088182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1752 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1757 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_LT_in_boolfact1762 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_LE_in_boolfact1767 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_GT_in_boolfact1772 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_GE_in_boolfact1777 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1801 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1806 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1811 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_term_in_num_expr1815 = new BitSet(new long[]{0x0000400200000002L});
    public static final BitSet FOLLOW_factor_in_term1839 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_MUL_in_term1844 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_DIV_in_term1849 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_MOD_in_term1854 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_factor_in_term1859 = new BitSet(new long[]{0x0000000C00000802L});
    public static final BitSet FOLLOW_NOT_in_factor1882 = new BitSet(new long[]{0x0400000042208000L});
    public static final BitSet FOLLOW_PLUS_in_factor1887 = new BitSet(new long[]{0x0400000042208000L});
    public static final BitSet FOLLOW_MINUS_in_factor1892 = new BitSet(new long[]{0x0400000042208000L});
    public static final BitSet FOLLOW_atom_in_factor1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1994 = new BitSet(new long[]{0x0400402242208000L});
    public static final BitSet FOLLOW_expr_in_atom1997 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall2019 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_LP_in_funcall2021 = new BitSet(new long[]{0x0440412242208000L,0x00000000000000E8L});
    public static final BitSet FOLLOW_expr_list_in_funcall2023 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_all_expr_in_expr_list2059 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_expr_list2062 = new BitSet(new long[]{0x0400412242208000L,0x00000000000000E8L});
    public static final BitSet FOLLOW_all_expr_in_expr_list2065 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_PITCH_in_notabasica2084 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_ALT_in_notabasica2086 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_INT_in_notabasica2089 = new BitSet(new long[]{0x0000000000000002L});

}