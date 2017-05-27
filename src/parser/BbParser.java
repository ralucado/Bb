// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-05-27 16:16:49

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALT", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CHORD", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INST", "INT", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MELODY", "MINUS", "MOD", "MUL", "NEQ", "NOT", "NOTE", "NOTEASSIGN", "NOTEID", "OR", "PACK", "PARAMS", "PITCH", "PLAYABLE", "PLUS", "POLIFONE", "PREF", "PVALUE", "QUIET", "RB", "READ", "RETURN", "RP", "SPEED", "STRING", "THEN", "TRUE", "VOICE", "WHILE", "WRITE", "WS", "','", "'.'", "';'", "'Chord'", "'Melody'", "'Note'", "'Poli'", "'Speed'", "'['", "']'", "'bool'", "'int'", "'void'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__62=62;
    public static final int T__63=63;
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
    public static final int INT=24;
    public static final int LB=25;
    public static final int LE=26;
    public static final int LIST_FUNCTIONS=27;
    public static final int LIST_INSTR=28;
    public static final int LP=29;
    public static final int LT=30;
    public static final int MELODY=31;
    public static final int MINUS=32;
    public static final int MOD=33;
    public static final int MUL=34;
    public static final int NEQ=35;
    public static final int NOT=36;
    public static final int NOTE=37;
    public static final int NOTEASSIGN=38;
    public static final int NOTEID=39;
    public static final int OR=40;
    public static final int PACK=41;
    public static final int PARAMS=42;
    public static final int PITCH=43;
    public static final int PLAYABLE=44;
    public static final int PLUS=45;
    public static final int POLIFONE=46;
    public static final int PREF=47;
    public static final int PVALUE=48;
    public static final int QUIET=49;
    public static final int RB=50;
    public static final int READ=51;
    public static final int RETURN=52;
    public static final int RP=53;
    public static final int SPEED=54;
    public static final int STRING=55;
    public static final int THEN=56;
    public static final int TRUE=57;
    public static final int VOICE=58;
    public static final int WHILE=59;
    public static final int WRITE=60;
    public static final int WS=61;

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

                if ( ((LA1_0 >= 65 && LA1_0 <= 68)||(LA1_0 >= 72 && LA1_0 <= 74)) ) {
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:1: func : ( type | notetype ) ID ^ params LB ! block_instructions RB !;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:9: ( ( type | notetype ) ID ^ params LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:11: ( type | notetype ) ID ^ params LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:11: ( type | notetype )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 72 && LA2_0 <= 74)) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= 65 && LA2_0 <= 68)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:12: type
                    {
                    pushFollow(FOLLOW_type_in_func259);
                    type3=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type3.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:43:19: notetype
                    {
                    pushFollow(FOLLOW_notetype_in_func263);
                    notetype4=notetype();

                    state._fsp--;

                    adaptor.addChild(root_0, notetype4.getTree());

                    }
                    break;

            }


            ID5=(Token)match(input,ID,FOLLOW_ID_in_func266); 
            ID5_tree = 
            (BbTree)adaptor.create(ID5)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(ID5_tree, root_0);


            pushFollow(FOLLOW_params_in_func269);
            params6=params();

            state._fsp--;

            adaptor.addChild(root_0, params6.getTree());

            LB7=(Token)match(input,LB,FOLLOW_LB_in_func271); 

            pushFollow(FOLLOW_block_instructions_in_func274);
            block_instructions8=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions8.getTree());

            RB9=(Token)match(input,RB,FOLLOW_RB_in_func276); 

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

        Token char_literal10=null;
        Token char_literal12=null;
        BbParser.paramlist_return paramlist11 =null;


        BbTree char_literal10_tree=null;
        BbTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:11: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,LP,FOLLOW_LP_in_params296);  
            stream_LP.add(char_literal10);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:15: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 65 && LA3_0 <= 68)||(LA3_0 >= 72 && LA3_0 <= 74)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:47:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params298);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,RP,FOLLOW_RP_in_params301);  
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

        Token char_literal14=null;
        BbParser.param_return param13 =null;

        BbParser.param_return param15 =null;


        BbTree char_literal14_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:10: ( param ( ',' ! param )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:12: param ( ',' ! param )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist327);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==62) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,62,FOLLOW_62_in_paramlist330); 

            	    pushFollow(FOLLOW_param_in_paramlist333);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:1: param : ( type ^ ID | notetype ^ NOTEID );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:9: ( type ^ ID | notetype ^ NOTEID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 72 && LA5_0 <= 74)) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= 65 && LA5_0 <= 68)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:13: type ^ ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_param358);
                    type16=type();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(type16.getTree(), root_0);

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_param361); 
                    ID17_tree = 
                    (BbTree)adaptor.create(ID17)
                    ;
                    adaptor.addChild(root_0, ID17_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:57:13: notetype ^ NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notetype_in_param375);
                    notetype18=notetype();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(notetype18.getTree(), root_0);

                    NOTEID19=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_param378); 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final BbParser.block_instructions_return block_instructions() throws RecognitionException {
        BbParser.block_instructions_return retval = new BbParser.block_instructions_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal21=null;
        BbParser.instruction_return instruction20 =null;

        BbParser.instruction_return instruction22 =null;


        BbTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions422);
            instruction20=instruction();

            state._fsp--;

            stream_instruction.add(instruction20.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:26: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==64) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:27: ';' instruction
            	    {
            	    char_literal21=(Token)match(input,64,FOLLOW_64_in_block_instructions425);  
            	    stream_64.add(char_literal21);


            	    pushFollow(FOLLOW_instruction_in_block_instructions427);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:66:1: instruction : ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed | read | write |);
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

        BbParser.read_return read31 =null;

        BbParser.write_return write32 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:9: ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed | read | write |)
            int alt7=11;
            switch ( input.LA(1) ) {
            case 72:
            case 73:
            case 74:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EQ) ) {
                    alt7=1;
                }
                else if ( (LA7_2==LP) ) {
                    alt7=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

                }
                }
                break;
            case NOTEID:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==EQ) ) {
                    alt7=1;
                }
                else if ( (LA7_3==LP||LA7_3==RB||(LA7_3 >= 63 && LA7_3 <= 64)) ) {
                    alt7=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

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
            case RETURN:
                {
                alt7=6;
                }
                break;
            case LP:
            case PITCH:
            case QUIET:
            case 68:
            case 70:
                {
                alt7=7;
                }
                break;
            case 69:
                {
                alt7=8;
                }
                break;
            case READ:
                {
                alt7=9;
                }
                break;
            case WRITE:
                {
                alt7=10;
                }
                break;
            case RB:
            case 64:
                {
                alt7=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:13: assign
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction486);
                    assign23=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign23.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction510);
                    ite_stmt24=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt24.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction532);
                    while_stmt25=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt25.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:11: for_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction550);
                    for_stmt26=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt26.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:71:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction566);
                    funcall27=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall27.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction589);
                    return_stmt28=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt28.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction608);
                    playable29=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable29.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:74:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction628);
                    speed30=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed30.getTree());

                    }
                    break;
                case 9 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:75:11: read
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_read_in_instruction643);
                    read31=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read31.getTree());

                    }
                    break;
                case 10 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:76:12: write
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_write_in_instruction668);
                    write32=write();

                    state._fsp--;

                    adaptor.addChild(root_0, write32.getTree());

                    }
                    break;
                case 11 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:9: 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:1: assign : ( ( type )? ID eq= EQ expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) );
    public final BbParser.assign_return assign() throws RecognitionException {
        BbParser.assign_return retval = new BbParser.assign_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token eq=null;
        Token ID34=null;
        Token NOTEID36=null;
        Token EQ37=null;
        BbParser.type_return type33 =null;

        BbParser.expr_return expr35 =null;

        BbParser.musicnotation_return musicnotation38 =null;


        BbTree eq_tree=null;
        BbTree ID34_tree=null;
        BbTree NOTEID36_tree=null;
        BbTree EQ37_tree=null;
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_musicnotation=new RewriteRuleSubtreeStream(adaptor,"rule musicnotation");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:9: ( ( type )? ID eq= EQ expr -> ^( ASSIGN[$eq,\":=\"] ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID||(LA9_0 >= 72 && LA9_0 <= 74)) ) {
                alt9=1;
            }
            else if ( (LA9_0==NOTEID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:13: ( type )? ID eq= EQ expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:13: ( type )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0 >= 72 && LA8_0 <= 74)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:14: type
                            {
                            pushFollow(FOLLOW_type_in_assign730);
                            type33=type();

                            state._fsp--;

                            stream_type.add(type33.getTree());

                            }
                            break;

                    }


                    ID34=(Token)match(input,ID,FOLLOW_ID_in_assign734);  
                    stream_ID.add(ID34);


                    eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign738);  
                    stream_EQ.add(eq);


                    pushFollow(FOLLOW_expr_in_assign740);
                    expr35=expr();

                    state._fsp--;

                    stream_expr.add(expr35.getTree());

                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 81:35: -> ^( ASSIGN[$eq,\":=\"] ID expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:38: ^( ASSIGN[$eq,\":=\"] ID expr )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(ASSIGN, eq, ":=")
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:82:5: NOTEID EQ musicnotation
                    {
                    NOTEID36=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign757);  
                    stream_NOTEID.add(NOTEID36);


                    EQ37=(Token)match(input,EQ,FOLLOW_EQ_in_assign759);  
                    stream_EQ.add(EQ37);


                    pushFollow(FOLLOW_musicnotation_in_assign761);
                    musicnotation38=musicnotation();

                    state._fsp--;

                    stream_musicnotation.add(musicnotation38.getTree());

                    // AST REWRITE
                    // elements: NOTEID, musicnotation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 82:29: -> ^( NOTEASSIGN NOTEID musicnotation )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:82:32: ^( NOTEASSIGN NOTEID musicnotation )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:1: type : ( 'int' | 'bool' | 'void' );
    public final BbParser.type_return type() throws RecognitionException {
        BbParser.type_return retval = new BbParser.type_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set39=null;

        BbTree set39_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:85:6: ( 'int' | 'bool' | 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set39=(Token)input.LT(1);

            if ( (input.LA(1) >= 72 && input.LA(1) <= 74) ) {
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
    // $ANTLR end "type"


    public static class notetype_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "notetype"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:90:1: notetype : ( 'Note' | 'Chord' | 'Melody' | 'Poli' );
    public final BbParser.notetype_return notetype() throws RecognitionException {
        BbParser.notetype_return retval = new BbParser.notetype_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set40=null;

        BbTree set40_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:90:9: ( 'Note' | 'Chord' | 'Melody' | 'Poli' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set40=(Token)input.LT(1);

            if ( (input.LA(1) >= 65 && input.LA(1) <= 68) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set40)
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:1: musicnotation : ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| 'Melody' ! '(' ! melodia ')' !| polifon | NOTEID );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal41=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token string_literal47=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token NOTEID52=null;
        BbParser.notabasica_return notabasica42 =null;

        BbParser.chord_return chord45 =null;

        BbParser.melodia_return melodia49 =null;

        BbParser.polifon_return polifon51 =null;


        BbTree string_literal41_tree=null;
        BbTree string_literal43_tree=null;
        BbTree char_literal44_tree=null;
        BbTree char_literal46_tree=null;
        BbTree string_literal47_tree=null;
        BbTree char_literal48_tree=null;
        BbTree char_literal50_tree=null;
        BbTree NOTEID52_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:15: ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| 'Melody' ! '(' ! melodia ')' !| polifon | NOTEID )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt10=1;
                }
                break;
            case 65:
                {
                alt10=2;
                }
                break;
            case 66:
                {
                alt10=3;
                }
                break;
            case 68:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:17: 'Note' notabasica
                    {
                    string_literal41=(Token)match(input,67,FOLLOW_67_in_musicnotation898);  
                    stream_67.add(string_literal41);


                    pushFollow(FOLLOW_notabasica_in_musicnotation900);
                    notabasica42=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica42.getTree());

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
                    // 96:35: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:38: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:97:7: 'Chord' ! '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal43=(Token)match(input,65,FOLLOW_65_in_musicnotation916); 

                    char_literal44=(Token)match(input,LP,FOLLOW_LP_in_musicnotation919); 

                    pushFollow(FOLLOW_chord_in_musicnotation922);
                    chord45=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord45.getTree());

                    char_literal46=(Token)match(input,RP,FOLLOW_RP_in_musicnotation924); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:98:7: 'Melody' ! '(' ! melodia ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal47=(Token)match(input,66,FOLLOW_66_in_musicnotation933); 

                    char_literal48=(Token)match(input,LP,FOLLOW_LP_in_musicnotation936); 

                    pushFollow(FOLLOW_melodia_in_musicnotation939);
                    melodia49=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia49.getTree());

                    char_literal50=(Token)match(input,RP,FOLLOW_RP_in_musicnotation941); 

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation950);
                    polifon51=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon51.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID52=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation958); 
                    NOTEID52_tree = 
                    (BbTree)adaptor.create(NOTEID52)
                    ;
                    adaptor.addChild(root_0, NOTEID52_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:1: ite_stmt : IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? ;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF53=null;
        Token LP54=null;
        Token RP56=null;
        Token LB57=null;
        Token RB59=null;
        Token ELSE60=null;
        Token LB61=null;
        Token RB63=null;
        BbParser.expr_return expr55 =null;

        BbParser.block_instructions_return block_instructions58 =null;

        BbParser.block_instructions_return block_instructions62 =null;


        BbTree IF53_tree=null;
        BbTree LP54_tree=null;
        BbTree RP56_tree=null;
        BbTree LB57_tree=null;
        BbTree RB59_tree=null;
        BbTree ELSE60_tree=null;
        BbTree LB61_tree=null;
        BbTree RB63_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:13: ( IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:17: IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)?
            {
            root_0 = (BbTree)adaptor.nil();


            IF53=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt978); 
            IF53_tree = 
            (BbTree)adaptor.create(IF53)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF53_tree, root_0);


            LP54=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt981); 

            pushFollow(FOLLOW_expr_in_ite_stmt984);
            expr55=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr55.getTree());

            RP56=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt986); 

            LB57=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt989); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt992);
            block_instructions58=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions58.getTree());

            RB59=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt994); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:61: ( ELSE ! LB ! block_instructions RB !)?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:62: ELSE ! LB ! block_instructions RB !
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt998); 

                    LB61=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt1001); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt1004);
                    block_instructions62=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions62.getTree());

                    RB63=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt1006); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:1: while_stmt : WHILE ^ LP ! expr RP ! LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE64=null;
        Token LP65=null;
        Token RP67=null;
        Token LB68=null;
        Token RB70=null;
        BbParser.expr_return expr66 =null;

        BbParser.block_instructions_return block_instructions69 =null;


        BbTree WHILE64_tree=null;
        BbTree LP65_tree=null;
        BbTree RP67_tree=null;
        BbTree LB68_tree=null;
        BbTree RB70_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:13: ( WHILE ^ LP ! expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:17: WHILE ^ LP ! expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE64=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1034); 
            WHILE64_tree = 
            (BbTree)adaptor.create(WHILE64)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE64_tree, root_0);


            LP65=(Token)match(input,LP,FOLLOW_LP_in_while_stmt1037); 

            pushFollow(FOLLOW_expr_in_while_stmt1040);
            expr66=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr66.getTree());

            RP67=(Token)match(input,RP,FOLLOW_RP_in_while_stmt1042); 

            LB68=(Token)match(input,LB,FOLLOW_LB_in_while_stmt1045); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1048);
            block_instructions69=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions69.getTree());

            RB70=(Token)match(input,RB,FOLLOW_RB_in_while_stmt1050); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:1: for_stmt : FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !;
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

        BbParser.expr_return expr75 =null;

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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:11: ( FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:15: FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR71=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1088); 
            FOR71_tree = 
            (BbTree)adaptor.create(FOR71)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR71_tree, root_0);


            LP72=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1091); 

            pushFollow(FOLLOW_assign_in_for_stmt1094);
            assign73=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign73.getTree());

            char_literal74=(Token)match(input,64,FOLLOW_64_in_for_stmt1096); 

            pushFollow(FOLLOW_expr_in_for_stmt1099);
            expr75=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr75.getTree());

            char_literal76=(Token)match(input,64,FOLLOW_64_in_for_stmt1101); 

            pushFollow(FOLLOW_assign_in_for_stmt1104);
            assign77=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign77.getTree());

            RP78=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1106); 

            LB79=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1109); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1112);
            block_instructions80=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions80.getTree());

            RB81=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1114); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:1: return_stmt : RETURN ^ ( expr | musicnotation )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN82=null;
        BbParser.expr_return expr83 =null;

        BbParser.musicnotation_return musicnotation84 =null;


        BbTree RETURN82_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:13: ( RETURN ^ ( expr | musicnotation )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:17: RETURN ^ ( expr | musicnotation )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN82=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1139); 
            RETURN82_tree = 
            (BbTree)adaptor.create(RETURN82)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN82_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:25: ( expr | musicnotation )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INT||LA12_0==LP||LA12_0==MINUS||LA12_0==NOT||LA12_0==PLUS||LA12_0==TRUE) ) {
                alt12=1;
            }
            else if ( (LA12_0==NOTEID||(LA12_0 >= 65 && LA12_0 <= 68)) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:26: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1143);
                    expr83=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr83.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:33: musicnotation
                    {
                    pushFollow(FOLLOW_musicnotation_in_return_stmt1147);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:1: playable : ( melodia | polifon | NOTEID );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID87=null;
        BbParser.melodia_return melodia85 =null;

        BbParser.polifon_return polifon86 =null;


        BbTree NOTEID87_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:9: ( melodia | polifon | NOTEID )
            int alt13=3;
            switch ( input.LA(1) ) {
            case LP:
            case PITCH:
            case QUIET:
            case 70:
                {
                alt13=1;
                }
                break;
            case NOTEID:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==LP||LA13_2==63) ) {
                    alt13=1;
                }
                else if ( (LA13_2==RB||LA13_2==64) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case 68:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1166);
                    melodia85=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia85.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1178);
                    polifon86=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon86.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:11: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID87=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1190); 
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


    public static class read_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:1: read : READ ^ ID ;
    public final BbParser.read_return read() throws RecognitionException {
        BbParser.read_return retval = new BbParser.read_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token READ88=null;
        Token ID89=null;

        BbTree READ88_tree=null;
        BbTree ID89_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:6: ( READ ^ ID )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:8: READ ^ ID
            {
            root_0 = (BbTree)adaptor.nil();


            READ88=(Token)match(input,READ,FOLLOW_READ_in_read1217); 
            READ88_tree = 
            (BbTree)adaptor.create(READ88)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(READ88_tree, root_0);


            ID89=(Token)match(input,ID,FOLLOW_ID_in_read1220); 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:1: write : WRITE ^ ( expr | STRING ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:7: ( WRITE ^ ( expr | STRING ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (BbTree)adaptor.nil();


            WRITE90=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1240); 
            WRITE90_tree = 
            (BbTree)adaptor.create(WRITE90)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WRITE90_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:18: ( expr | STRING )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1244);
                    expr91=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr91.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:26: STRING
                    {
                    STRING92=(Token)match(input,STRING,FOLLOW_STRING_in_write1248); 
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


    public static class melodia_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "melodia"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:136:1: melodia : ( notelist )+ -> ^( MELODY ( notelist )+ ) ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.notelist_return notelist93 =null;


        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:136:8: ( ( notelist )+ -> ^( MELODY ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:136:10: ( notelist )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:136:10: ( notelist )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==LP||LA15_0==NOTEID||LA15_0==PITCH||LA15_0==QUIET||LA15_0==70) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:136:10: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1267);
            	    notelist93=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist93.getTree());

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
            // 136:20: -> ^( MELODY ( notelist )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:136:23: ^( MELODY ( notelist )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:1: notelist : notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) ;
    public final BbParser.notelist_return notelist() throws RecognitionException {
        BbParser.notelist_return retval = new BbParser.notelist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal95=null;
        Token MUL97=null;
        BbParser.notas_return notas94 =null;

        BbParser.duration_return duration96 =null;


        BbTree char_literal95_tree=null;
        BbTree MUL97_tree=null;
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1293);
            notas94=notas();

            state._fsp--;

            stream_notas.add(notas94.getTree());

            char_literal95=(Token)match(input,63,FOLLOW_63_in_notelist1295);  
            stream_63.add(char_literal95);


            pushFollow(FOLLOW_duration_in_notelist1297);
            duration96=duration();

            state._fsp--;

            stream_duration.add(duration96.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:30: ( MUL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MUL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:30: MUL
                    {
                    MUL97=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1299);  
                    stream_MUL.add(MUL97);


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
            // 139:35: -> ^( PLAYABLE notas duration ( MUL )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:38: ^( PLAYABLE notas duration ( MUL )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                , root_1);

                adaptor.addChild(root_1, stream_notas.nextTree());

                adaptor.addChild(root_1, stream_duration.nextTree());

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:139:64: ( MUL )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:1: notas : ( nota | '[' ! pack ']' !| '(' ! chord ')' !);
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal99=null;
        Token char_literal101=null;
        Token char_literal102=null;
        Token char_literal104=null;
        BbParser.nota_return nota98 =null;

        BbParser.pack_return pack100 =null;

        BbParser.chord_return chord103 =null;


        BbTree char_literal99_tree=null;
        BbTree char_literal101_tree=null;
        BbTree char_literal102_tree=null;
        BbTree char_literal104_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
            int alt17=3;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
            case QUIET:
                {
                alt17=1;
                }
                break;
            case 70:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1320);
                    nota98=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota98.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal99=(Token)match(input,70,FOLLOW_70_in_notas1329); 

                    pushFollow(FOLLOW_pack_in_notas1332);
                    pack100=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack100.getTree());

                    char_literal101=(Token)match(input,71,FOLLOW_71_in_notas1334); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal102=(Token)match(input,LP,FOLLOW_LP_in_notas1344); 

                    pushFollow(FOLLOW_chord_in_notas1347);
                    chord103=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord103.getTree());

                    char_literal104=(Token)match(input,RP,FOLLOW_RP_in_notas1349); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:146:1: nota : ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID106=null;
        Token char_literal107=null;
        Token PLUS108=null;
        Token char_literal110=null;
        Token QUIET111=null;
        BbParser.notabasica_return notabasica105 =null;

        BbParser.num_expr_return num_expr109 =null;


        BbTree NOTEID106_tree=null;
        BbTree char_literal107_tree=null;
        BbTree PLUS108_tree=null;
        BbTree char_literal110_tree=null;
        BbTree QUIET111_tree=null;
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:146:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:146:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1368);
                    notabasica105=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica105.getTree());

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
                    // 146:19: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:146:22: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:4: NOTEID ( '(' ! PLUS ^ num_expr ')' !)?
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID106=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1382); 
                    NOTEID106_tree = 
                    (BbTree)adaptor.create(NOTEID106)
                    ;
                    adaptor.addChild(root_0, NOTEID106_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LP) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal107=(Token)match(input,LP,FOLLOW_LP_in_nota1386); 

                            PLUS108=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1389); 
                            PLUS108_tree = 
                            (BbTree)adaptor.create(PLUS108)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS108_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1392);
                            num_expr109=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr109.getTree());

                            char_literal110=(Token)match(input,RP,FOLLOW_RP_in_nota1394); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:4: QUIET
                    {
                    root_0 = (BbTree)adaptor.nil();


                    QUIET111=(Token)match(input,QUIET,FOLLOW_QUIET_in_nota1402); 
                    QUIET111_tree = 
                    (BbTree)adaptor.create(QUIET111)
                    ;
                    adaptor.addChild(root_0, QUIET111_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:1: chord : sub_chord -> ^( CHORD sub_chord ) ;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord112 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1414);
            sub_chord112=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord112.getTree());

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
            // 152:18: -> ^( CHORD sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:152:21: ^( CHORD sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:1: sub_chord : nota ( ',' ! ( nota ) )* ;
    public final BbParser.sub_chord_return sub_chord() throws RecognitionException {
        BbParser.sub_chord_return retval = new BbParser.sub_chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal114=null;
        BbParser.nota_return nota113 =null;

        BbParser.nota_return nota115 =null;


        BbTree char_literal114_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1432);
            nota113=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota113.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:17: ( ',' ! ( nota ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==62) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:19: ',' ! ( nota )
            	    {
            	    char_literal114=(Token)match(input,62,FOLLOW_62_in_sub_chord1436); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:155:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1440);
            	    nota115=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota115.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:1: pack : sub_chord -> ^( PACK sub_chord ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord116 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1453);
            sub_chord116=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord116.getTree());

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
            // 158:17: -> ^( PACK sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:158:20: ^( PACK sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:1: duration : ( INT | '(' ! num_expr ')' !);
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        BbParser.num_expr_return num_expr119 =null;


        BbTree INT117_tree=null;
        BbTree char_literal118_tree=null;
        BbTree char_literal120_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:9: ( INT | '(' ! num_expr ')' !)
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT117=(Token)match(input,INT,FOLLOW_INT_in_duration1472); 
                    INT117_tree = 
                    (BbTree)adaptor.create(INT117)
                    ;
                    adaptor.addChild(root_0, INT117_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal118=(Token)match(input,LP,FOLLOW_LP_in_duration1481); 

                    pushFollow(FOLLOW_num_expr_in_duration1484);
                    num_expr119=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr119.getTree());

                    char_literal120=(Token)match(input,RP,FOLLOW_RP_in_duration1486); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:1: polifon : 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) ;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal121=null;
        Token LB122=null;
        Token RB124=null;
        BbParser.voices_return voices123 =null;


        BbTree string_literal121_tree=null;
        BbTree LB122_tree=null;
        BbTree RB124_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:9: ( 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:11: 'Poli' LB ( voices )+ RB
            {
            string_literal121=(Token)match(input,68,FOLLOW_68_in_polifon1500);  
            stream_68.add(string_literal121);


            LB122=(Token)match(input,LB,FOLLOW_LB_in_polifon1502);  
            stream_LB.add(LB122);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:21: ( voices )+
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
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:21: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1504);
            	    voices123=voices();

            	    state._fsp--;

            	    stream_voices.add(voices123.getTree());

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


            RB124=(Token)match(input,RB,FOLLOW_RB_in_polifon1507);  
            stream_RB.add(RB124);


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
            // 166:32: -> ^( POLIFONE ( voices )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:166:35: ^( POLIFONE ( voices )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:1: voices : VOICE num_expr EQ melodia '|' -> ^( INST num_expr melodia ) ;
    public final BbParser.voices_return voices() throws RecognitionException {
        BbParser.voices_return retval = new BbParser.voices_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token VOICE125=null;
        Token EQ127=null;
        Token char_literal129=null;
        BbParser.num_expr_return num_expr126 =null;

        BbParser.melodia_return melodia128 =null;


        BbTree VOICE125_tree=null;
        BbTree EQ127_tree=null;
        BbTree char_literal129_tree=null;
        RewriteRuleTokenStream stream_VOICE=new RewriteRuleTokenStream(adaptor,"token VOICE");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_melodia=new RewriteRuleSubtreeStream(adaptor,"rule melodia");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:7: ( VOICE num_expr EQ melodia '|' -> ^( INST num_expr melodia ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:9: VOICE num_expr EQ melodia '|'
            {
            VOICE125=(Token)match(input,VOICE,FOLLOW_VOICE_in_voices1540);  
            stream_VOICE.add(VOICE125);


            pushFollow(FOLLOW_num_expr_in_voices1542);
            num_expr126=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr126.getTree());

            EQ127=(Token)match(input,EQ,FOLLOW_EQ_in_voices1544);  
            stream_EQ.add(EQ127);


            pushFollow(FOLLOW_melodia_in_voices1546);
            melodia128=melodia();

            state._fsp--;

            stream_melodia.add(melodia128.getTree());

            char_literal129=(Token)match(input,75,FOLLOW_75_in_voices1548);  
            stream_75.add(char_literal129);


            // AST REWRITE
            // elements: num_expr, melodia
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 169:39: -> ^( INST num_expr melodia )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:169:42: ^( INST num_expr melodia )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(INST, "INST")
                , root_1);

                adaptor.addChild(root_1, stream_num_expr.nextTree());

                adaptor.addChild(root_1, stream_melodia.nextTree());

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
    // $ANTLR end "voices"


    public static class speed_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "speed"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:1: speed : 'Speed' num_expr -> ^( SPEED num_expr ) ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal130=null;
        BbParser.num_expr_return num_expr131 =null;


        BbTree string_literal130_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:7: ( 'Speed' num_expr -> ^( SPEED num_expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:9: 'Speed' num_expr
            {
            string_literal130=(Token)match(input,69,FOLLOW_69_in_speed1569);  
            stream_69.add(string_literal130);


            pushFollow(FOLLOW_num_expr_in_speed1571);
            num_expr131=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr131.getTree());

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
            // 172:26: -> ^( SPEED num_expr )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:172:29: ^( SPEED num_expr )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:1: expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR133=null;
        BbParser.boolterm_return boolterm132 =null;

        BbParser.boolterm_return boolterm134 =null;


        BbTree OR133_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:6: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1588);
            boolterm132=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm132.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:17: ( OR ^ boolterm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:18: OR ^ boolterm
            	    {
            	    OR133=(Token)match(input,OR,FOLLOW_OR_in_expr1591); 
            	    OR133_tree = 
            	    (BbTree)adaptor.create(OR133)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR133_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1594);
            	    boolterm134=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm134.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND136=null;
        BbParser.boolfact_return boolfact135 =null;

        BbParser.boolfact_return boolfact137 =null;


        BbTree AND136_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1605);
            boolfact135=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact135.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:22: ( AND ^ boolfact )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:23: AND ^ boolfact
            	    {
            	    AND136=(Token)match(input,AND,FOLLOW_AND_in_boolterm1608); 
            	    AND136_tree = 
            	    (BbTree)adaptor.create(AND136)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND136_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1611);
            	    boolfact137=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact137.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ139=null;
        Token NEQ140=null;
        Token LT141=null;
        Token LE142=null;
        Token GT143=null;
        Token GE144=null;
        BbParser.num_expr_return num_expr138 =null;

        BbParser.num_expr_return num_expr145 =null;


        BbTree EQ139_tree=null;
        BbTree NEQ140_tree=null;
        BbTree LT141_tree=null;
        BbTree LE142_tree=null;
        BbTree GT143_tree=null;
        BbTree GE144_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1631);
            num_expr138=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr138.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQ||(LA26_0 >= GE && LA26_0 <= GT)||LA26_0==LE||LA26_0==LT||LA26_0==NEQ) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:24: EQ ^
                            {
                            EQ139=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1635); 
                            EQ139_tree = 
                            (BbTree)adaptor.create(EQ139)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ139_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:30: NEQ ^
                            {
                            NEQ140=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1640); 
                            NEQ140_tree = 
                            (BbTree)adaptor.create(NEQ140)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ140_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:37: LT ^
                            {
                            LT141=(Token)match(input,LT,FOLLOW_LT_in_boolfact1645); 
                            LT141_tree = 
                            (BbTree)adaptor.create(LT141)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT141_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:43: LE ^
                            {
                            LE142=(Token)match(input,LE,FOLLOW_LE_in_boolfact1650); 
                            LE142_tree = 
                            (BbTree)adaptor.create(LE142)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE142_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:49: GT ^
                            {
                            GT143=(Token)match(input,GT,FOLLOW_GT_in_boolfact1655); 
                            GT143_tree = 
                            (BbTree)adaptor.create(GT143)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT143_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:180:55: GE ^
                            {
                            GE144=(Token)match(input,GE,FOLLOW_GE_in_boolfact1660); 
                            GE144_tree = 
                            (BbTree)adaptor.create(GE144)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE144_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1664);
                    num_expr145=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr145.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS147=null;
        Token MINUS148=null;
        BbParser.term_return term146 =null;

        BbParser.term_return term149 =null;


        BbTree PLUS147_tree=null;
        BbTree MINUS148_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1684);
            term146=term();

            state._fsp--;

            adaptor.addChild(root_0, term146.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:18: ( ( PLUS ^| MINUS ^) term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS||LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:20: ( PLUS ^| MINUS ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:21: PLUS ^
            	            {
            	            PLUS147=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1689); 
            	            PLUS147_tree = 
            	            (BbTree)adaptor.create(PLUS147)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS147_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:29: MINUS ^
            	            {
            	            MINUS148=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1694); 
            	            MINUS148_tree = 
            	            (BbTree)adaptor.create(MINUS148)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS148_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1698);
            	    term149=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term149.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL151=null;
        Token DIV152=null;
        Token MOD153=null;
        BbParser.factor_return factor150 =null;

        BbParser.factor_return factor154 =null;


        BbTree MUL151_tree=null;
        BbTree DIV152_tree=null;
        BbTree MOD153_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1722);
            factor150=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor150.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DIV||(LA30_0 >= MOD && LA30_0 <= MUL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:23: MUL ^
            	            {
            	            MUL151=(Token)match(input,MUL,FOLLOW_MUL_in_term1727); 
            	            MUL151_tree = 
            	            (BbTree)adaptor.create(MUL151)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL151_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:30: DIV ^
            	            {
            	            DIV152=(Token)match(input,DIV,FOLLOW_DIV_in_term1732); 
            	            DIV152_tree = 
            	            (BbTree)adaptor.create(DIV152)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV152_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:186:37: MOD ^
            	            {
            	            MOD153=(Token)match(input,MOD,FOLLOW_MOD_in_term1737); 
            	            MOD153_tree = 
            	            (BbTree)adaptor.create(MOD153)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD153_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1742);
            	    factor154=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor154.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT155=null;
        Token PLUS156=null;
        Token MINUS157=null;
        BbParser.atom_return atom158 =null;


        BbTree NOT155_tree=null;
        BbTree PLUS156_tree=null;
        BbTree MINUS157_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:14: NOT ^
                    {
                    NOT155=(Token)match(input,NOT,FOLLOW_NOT_in_factor1765); 
                    NOT155_tree = 
                    (BbTree)adaptor.create(NOT155)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT155_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:21: PLUS ^
                    {
                    PLUS156=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1770); 
                    PLUS156_tree = 
                    (BbTree)adaptor.create(PLUS156)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS156_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:189:29: MINUS ^
                    {
                    MINUS157=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1775); 
                    MINUS157_tree = 
                    (BbTree)adaptor.create(MINUS157)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS157_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1780);
            atom158=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom158.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:195:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID159=null;
        Token INT160=null;
        Token char_literal162=null;
        Token char_literal164=null;
        BbParser.funcall_return funcall161 =null;

        BbParser.expr_return expr163 =null;


        BbTree b_tree=null;
        BbTree ID159_tree=null;
        BbTree INT160_tree=null;
        BbTree char_literal162_tree=null;
        BbTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:195:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt33=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LP) ) {
                    alt33=4;
                }
                else if ( (LA33_1==AND||LA33_1==DIV||LA33_1==EQ||(LA33_1 >= GE && LA33_1 <= GT)||LA33_1==LE||LA33_1==LT||(LA33_1 >= MINUS && LA33_1 <= NEQ)||LA33_1==OR||LA33_1==PLUS||LA33_1==RB||LA33_1==RP||LA33_1==62||LA33_1==64) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:195:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID159=(Token)match(input,ID,FOLLOW_ID_in_atom1805); 
                    ID159_tree = 
                    (BbTree)adaptor.create(ID159)
                    ;
                    adaptor.addChild(root_0, ID159_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:196:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT160=(Token)match(input,INT,FOLLOW_INT_in_atom1819); 
                    INT160_tree = 
                    (BbTree)adaptor.create(INT160)
                    ;
                    adaptor.addChild(root_0, INT160_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:13: (b= TRUE |b= FALSE )
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1836);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1842);  
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
                    // 197:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:198:11: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1863);
                    funcall161=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall161.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:13: '(' ! expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal162=(Token)match(input,LP,FOLLOW_LP_in_atom1877); 

                    pushFollow(FOLLOW_expr_in_atom1880);
                    expr163=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr163.getTree());

                    char_literal164=(Token)match(input,RP,FOLLOW_RP_in_atom1882); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID165=null;
        Token char_literal166=null;
        Token char_literal168=null;
        BbParser.expr_list_return expr_list167 =null;


        BbTree ID165_tree=null;
        BbTree char_literal166_tree=null;
        BbTree char_literal168_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:13: ID '(' ( expr_list )? ')'
            {
            ID165=(Token)match(input,ID,FOLLOW_ID_in_funcall1902);  
            stream_ID.add(ID165);


            char_literal166=(Token)match(input,LP,FOLLOW_LP_in_funcall1904);  
            stream_LP.add(char_literal166);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:20: ( expr_list )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==FALSE||LA34_0==ID||LA34_0==INT||LA34_0==LP||LA34_0==MINUS||LA34_0==NOT||LA34_0==PLUS||LA34_0==TRUE) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1906);
                    expr_list167=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list167.getTree());

                    }
                    break;

            }


            char_literal168=(Token)match(input,RP,FOLLOW_RP_in_funcall1909);  
            stream_RP.add(char_literal168);


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
            // 202:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:202:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal170=null;
        BbParser.expr_return expr169 =null;

        BbParser.expr_return expr171 =null;


        BbTree char_literal170_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1942);
            expr169=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr169.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:18: ( ',' ! expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==62) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:206:19: ',' ! expr
            	    {
            	    char_literal170=(Token)match(input,62,FOLLOW_62_in_expr_list1945); 

            	    pushFollow(FOLLOW_expr_in_expr_list1948);
            	    expr171=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr171.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:1: notabasica : PITCH ( ALT )? ( INT )? ;
    public final BbParser.notabasica_return notabasica() throws RecognitionException {
        BbParser.notabasica_return retval = new BbParser.notabasica_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PITCH172=null;
        Token ALT173=null;
        Token INT174=null;

        BbTree PITCH172_tree=null;
        BbTree ALT173_tree=null;
        BbTree INT174_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:12: ( PITCH ( ALT )? ( INT )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:14: PITCH ( ALT )? ( INT )?
            {
            root_0 = (BbTree)adaptor.nil();


            PITCH172=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica1967); 
            PITCH172_tree = 
            (BbTree)adaptor.create(PITCH172)
            ;
            adaptor.addChild(root_0, PITCH172_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:20: ( ALT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ALT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:20: ALT
                    {
                    ALT173=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica1969); 
                    ALT173_tree = 
                    (BbTree)adaptor.create(ALT173)
                    ;
                    adaptor.addChild(root_0, ALT173_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:25: ( INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:209:25: INT
                    {
                    INT174=(Token)match(input,INT,FOLLOW_INT_in_notabasica1972); 
                    INT174_tree = 
                    (BbTree)adaptor.create(INT174)
                    ;
                    adaptor.addChild(root_0, INT174_tree);


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


 

    public static final BitSet FOLLOW_func_in_prog225 = new BitSet(new long[]{0x0000000000000000L,0x000000000000071EL});
    public static final BitSet FOLLOW_EOF_in_prog228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_func259 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_notetype_in_func263 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_func266 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_params_in_func269 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_func271 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000771L});
    public static final BitSet FOLLOW_block_instructions_in_func274 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_func276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params296 = new BitSet(new long[]{0x0020000000000000L,0x000000000000071EL});
    public static final BitSet FOLLOW_paramlist_in_params298 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_params301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist327 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_paramlist330 = new BitSet(new long[]{0x0000000000000000L,0x000000000000071EL});
    public static final BitSet FOLLOW_param_in_paramlist333 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_type_in_param358 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_param361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_param375 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_NOTEID_in_param378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions422 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_block_instructions425 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000771L});
    public static final BitSet FOLLOW_instruction_in_block_instructions427 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_assign_in_instruction486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_in_instruction643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_in_instruction668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign730 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_assign734 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign738 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_assign740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_assign757 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign759 = new BitSet(new long[]{0x0000008000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_musicnotation_in_assign761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_musicnotation898 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_notabasica_in_musicnotation900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_musicnotation916 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation919 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation922 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_musicnotation933 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation936 = new BitSet(new long[]{0x0002088020000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_melodia_in_musicnotation939 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt978 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt981 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt984 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt986 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt989 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000771L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt992 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt994 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt998 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt1001 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000771L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt1004 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1034 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt1037 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1040 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt1042 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt1045 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000771L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1048 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1088 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1091 = new BitSet(new long[]{0x0000008000200000L,0x0000000000000700L});
    public static final BitSet FOLLOW_assign_in_for_stmt1094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_for_stmt1096 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_for_stmt1101 = new BitSet(new long[]{0x0000008000200000L,0x0000000000000700L});
    public static final BitSet FOLLOW_assign_in_for_stmt1104 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1106 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1109 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000771L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1112 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1139 = new BitSet(new long[]{0x0200209121208002L,0x000000000000001EL});
    public static final BitSet FOLLOW_expr_in_return_stmt1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_return_stmt1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1217 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_read1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1240 = new BitSet(new long[]{0x0280201121208000L});
    public static final BitSet FOLLOW_expr_in_write1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_melodia1267 = new BitSet(new long[]{0x0002088020000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_notas_in_notelist1293 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_notelist1295 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_duration_in_notelist1297 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_notas1329 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_pack_in_notas1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_notas1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1344 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_chord_in_notas1347 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1382 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_LP_in_nota1386 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1389 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_nota1392 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIET_in_nota1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1432 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_sub_chord1436 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1440 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_pack1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1481 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_duration1484 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_polifon1500 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_polifon1502 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_voices_in_polifon1504 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_RB_in_polifon1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOICE_in_voices1540 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_voices1542 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_voices1544 = new BitSet(new long[]{0x0002088020000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_melodia_in_voices1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_voices1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_speed1569 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_speed1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1588 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_OR_in_expr1591 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_boolterm_in_expr1594 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1605 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1608 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1611 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1631 = new BitSet(new long[]{0x0000000844182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1635 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1640 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_LT_in_boolfact1645 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_LE_in_boolfact1650 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_GT_in_boolfact1655 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_GE_in_boolfact1660 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1684 = new BitSet(new long[]{0x0000200100000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1689 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1694 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_term_in_num_expr1698 = new BitSet(new long[]{0x0000200100000002L});
    public static final BitSet FOLLOW_factor_in_term1722 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_MUL_in_term1727 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_DIV_in_term1732 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_MOD_in_term1737 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_factor_in_term1742 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_NOT_in_factor1765 = new BitSet(new long[]{0x0200000021208000L});
    public static final BitSet FOLLOW_PLUS_in_factor1770 = new BitSet(new long[]{0x0200000021208000L});
    public static final BitSet FOLLOW_MINUS_in_factor1775 = new BitSet(new long[]{0x0200000021208000L});
    public static final BitSet FOLLOW_atom_in_factor1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1877 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_atom1880 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1902 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_funcall1904 = new BitSet(new long[]{0x0220201121208000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1906 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1942 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_expr_list1945 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_expr_list1948 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_PITCH_in_notabasica1967 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_ALT_in_notabasica1969 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_INT_in_notabasica1972 = new BitSet(new long[]{0x0000000000000002L});

}