// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-05-28 01:03:50

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
            case 66:
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:1: assign : ( ( type )? ID eq= EQ expr -> ^( ASSIGN ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:9: ( ( type )? ID eq= EQ expr -> ^( ASSIGN ID expr ) | NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) )
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
                    // 81:35: -> ^( ASSIGN ID expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:38: ^( ASSIGN ID expr )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:82:5: NOTEID EQ musicnotation
                    {
                    NOTEID36=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign756);  
                    stream_NOTEID.add(NOTEID36);


                    EQ37=(Token)match(input,EQ,FOLLOW_EQ_in_assign758);  
                    stream_EQ.add(EQ37);


                    pushFollow(FOLLOW_musicnotation_in_assign760);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:1: musicnotation : ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| melodia | polifon | NOTEID );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal41=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token NOTEID49=null;
        BbParser.notabasica_return notabasica42 =null;

        BbParser.chord_return chord45 =null;

        BbParser.melodia_return melodia47 =null;

        BbParser.polifon_return polifon48 =null;


        BbTree string_literal41_tree=null;
        BbTree string_literal43_tree=null;
        BbTree char_literal44_tree=null;
        BbTree char_literal46_tree=null;
        BbTree NOTEID49_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:15: ( 'Note' notabasica -> ^( NOTE notabasica ) | 'Chord' ! '(' ! chord ')' !| melodia | polifon | NOTEID )
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
                    string_literal41=(Token)match(input,67,FOLLOW_67_in_musicnotation897);  
                    stream_67.add(string_literal41);


                    pushFollow(FOLLOW_notabasica_in_musicnotation899);
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


                    string_literal43=(Token)match(input,65,FOLLOW_65_in_musicnotation915); 

                    char_literal44=(Token)match(input,LP,FOLLOW_LP_in_musicnotation918); 

                    pushFollow(FOLLOW_chord_in_musicnotation921);
                    chord45=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord45.getTree());

                    char_literal46=(Token)match(input,RP,FOLLOW_RP_in_musicnotation923); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:98:7: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_musicnotation932);
                    melodia47=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia47.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation940);
                    polifon48=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon48.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:100:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID49=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation948); 
                    NOTEID49_tree = 
                    (BbTree)adaptor.create(NOTEID49)
                    ;
                    adaptor.addChild(root_0, NOTEID49_tree);


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

        Token IF50=null;
        Token LP51=null;
        Token RP53=null;
        Token LB54=null;
        Token RB56=null;
        Token ELSE57=null;
        Token LB58=null;
        Token RB60=null;
        BbParser.expr_return expr52 =null;

        BbParser.block_instructions_return block_instructions55 =null;

        BbParser.block_instructions_return block_instructions59 =null;


        BbTree IF50_tree=null;
        BbTree LP51_tree=null;
        BbTree RP53_tree=null;
        BbTree LB54_tree=null;
        BbTree RB56_tree=null;
        BbTree ELSE57_tree=null;
        BbTree LB58_tree=null;
        BbTree RB60_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:13: ( IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:17: IF ^ LP ! expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)?
            {
            root_0 = (BbTree)adaptor.nil();


            IF50=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt968); 
            IF50_tree = 
            (BbTree)adaptor.create(IF50)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF50_tree, root_0);


            LP51=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt971); 

            pushFollow(FOLLOW_expr_in_ite_stmt974);
            expr52=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr52.getTree());

            RP53=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt976); 

            LB54=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt979); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt982);
            block_instructions55=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions55.getTree());

            RB56=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt984); 

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
                    ELSE57=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt988); 

                    LB58=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt991); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt994);
                    block_instructions59=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions59.getTree());

                    RB60=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt996); 

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

        Token WHILE61=null;
        Token LP62=null;
        Token RP64=null;
        Token LB65=null;
        Token RB67=null;
        BbParser.expr_return expr63 =null;

        BbParser.block_instructions_return block_instructions66 =null;


        BbTree WHILE61_tree=null;
        BbTree LP62_tree=null;
        BbTree RP64_tree=null;
        BbTree LB65_tree=null;
        BbTree RB67_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:13: ( WHILE ^ LP ! expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:17: WHILE ^ LP ! expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE61=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt1024); 
            WHILE61_tree = 
            (BbTree)adaptor.create(WHILE61)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE61_tree, root_0);


            LP62=(Token)match(input,LP,FOLLOW_LP_in_while_stmt1027); 

            pushFollow(FOLLOW_expr_in_while_stmt1030);
            expr63=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr63.getTree());

            RP64=(Token)match(input,RP,FOLLOW_RP_in_while_stmt1032); 

            LB65=(Token)match(input,LB,FOLLOW_LB_in_while_stmt1035); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1038);
            block_instructions66=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions66.getTree());

            RB67=(Token)match(input,RB,FOLLOW_RB_in_while_stmt1040); 

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

        Token FOR68=null;
        Token LP69=null;
        Token char_literal71=null;
        Token char_literal73=null;
        Token RP75=null;
        Token LB76=null;
        Token RB78=null;
        BbParser.assign_return assign70 =null;

        BbParser.expr_return expr72 =null;

        BbParser.assign_return assign74 =null;

        BbParser.block_instructions_return block_instructions77 =null;


        BbTree FOR68_tree=null;
        BbTree LP69_tree=null;
        BbTree char_literal71_tree=null;
        BbTree char_literal73_tree=null;
        BbTree RP75_tree=null;
        BbTree LB76_tree=null;
        BbTree RB78_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:11: ( FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:15: FOR ^ LP ! assign ';' ! expr ';' ! assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR68=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1078); 
            FOR68_tree = 
            (BbTree)adaptor.create(FOR68)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR68_tree, root_0);


            LP69=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1081); 

            pushFollow(FOLLOW_assign_in_for_stmt1084);
            assign70=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign70.getTree());

            char_literal71=(Token)match(input,64,FOLLOW_64_in_for_stmt1086); 

            pushFollow(FOLLOW_expr_in_for_stmt1089);
            expr72=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr72.getTree());

            char_literal73=(Token)match(input,64,FOLLOW_64_in_for_stmt1091); 

            pushFollow(FOLLOW_assign_in_for_stmt1094);
            assign74=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign74.getTree());

            RP75=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1096); 

            LB76=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1099); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1102);
            block_instructions77=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions77.getTree());

            RB78=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1104); 

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

        Token RETURN79=null;
        BbParser.expr_return expr80 =null;

        BbParser.musicnotation_return musicnotation81 =null;


        BbTree RETURN79_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:13: ( RETURN ^ ( expr | musicnotation )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:17: RETURN ^ ( expr | musicnotation )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN79=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1129); 
            RETURN79_tree = 
            (BbTree)adaptor.create(RETURN79)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN79_tree, root_0);


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
                    pushFollow(FOLLOW_expr_in_return_stmt1133);
                    expr80=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr80.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:33: musicnotation
                    {
                    pushFollow(FOLLOW_musicnotation_in_return_stmt1137);
                    musicnotation81=musicnotation();

                    state._fsp--;

                    adaptor.addChild(root_0, musicnotation81.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:1: playable : ( melodia | polifon | NOTEID | notelist );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID84=null;
        BbParser.melodia_return melodia82 =null;

        BbParser.polifon_return polifon83 =null;

        BbParser.notelist_return notelist85 =null;


        BbTree NOTEID84_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:9: ( melodia | polifon | NOTEID | notelist )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt13=1;
                }
                break;
            case 68:
                {
                alt13=2;
                }
                break;
            case NOTEID:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==RB||LA13_3==64) ) {
                    alt13=3;
                }
                else if ( (LA13_3==LP||LA13_3==63) ) {
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
            case 70:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:121:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1156);
                    melodia82=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia82.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1168);
                    polifon83=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon83.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:11: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID84=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1180); 
                    NOTEID84_tree = 
                    (BbTree)adaptor.create(NOTEID84)
                    ;
                    adaptor.addChild(root_0, NOTEID84_tree);


                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:11: notelist
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notelist_in_playable1192);
                    notelist85=notelist();

                    state._fsp--;

                    adaptor.addChild(root_0, notelist85.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:1: read : READ ^ ID ;
    public final BbParser.read_return read() throws RecognitionException {
        BbParser.read_return retval = new BbParser.read_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token READ86=null;
        Token ID87=null;

        BbTree READ86_tree=null;
        BbTree ID87_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:6: ( READ ^ ID )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:8: READ ^ ID
            {
            root_0 = (BbTree)adaptor.nil();


            READ86=(Token)match(input,READ,FOLLOW_READ_in_read1219); 
            READ86_tree = 
            (BbTree)adaptor.create(READ86)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(READ86_tree, root_0);


            ID87=(Token)match(input,ID,FOLLOW_ID_in_read1222); 
            ID87_tree = 
            (BbTree)adaptor.create(ID87)
            ;
            adaptor.addChild(root_0, ID87_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:1: write : WRITE ^ ( expr | STRING ) ;
    public final BbParser.write_return write() throws RecognitionException {
        BbParser.write_return retval = new BbParser.write_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WRITE88=null;
        Token STRING90=null;
        BbParser.expr_return expr89 =null;


        BbTree WRITE88_tree=null;
        BbTree STRING90_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:7: ( WRITE ^ ( expr | STRING ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:11: WRITE ^ ( expr | STRING )
            {
            root_0 = (BbTree)adaptor.nil();


            WRITE88=(Token)match(input,WRITE,FOLLOW_WRITE_in_write1242); 
            WRITE88_tree = 
            (BbTree)adaptor.create(WRITE88)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WRITE88_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:18: ( expr | STRING )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:19: expr
                    {
                    pushFollow(FOLLOW_expr_in_write1246);
                    expr89=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr89.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:26: STRING
                    {
                    STRING90=(Token)match(input,STRING,FOLLOW_STRING_in_write1250); 
                    STRING90_tree = 
                    (BbTree)adaptor.create(STRING90)
                    ;
                    adaptor.addChild(root_0, STRING90_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:1: melodia : 'Melody' '(' INT ( notelist )+ ')' -> ^( MELODY INT ( notelist )+ ) ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal91=null;
        Token char_literal92=null;
        Token INT93=null;
        Token char_literal95=null;
        BbParser.notelist_return notelist94 =null;


        BbTree string_literal91_tree=null;
        BbTree char_literal92_tree=null;
        BbTree INT93_tree=null;
        BbTree char_literal95_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:8: ( 'Melody' '(' INT ( notelist )+ ')' -> ^( MELODY INT ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:10: 'Melody' '(' INT ( notelist )+ ')'
            {
            string_literal91=(Token)match(input,66,FOLLOW_66_in_melodia1269);  
            stream_66.add(string_literal91);


            char_literal92=(Token)match(input,LP,FOLLOW_LP_in_melodia1271);  
            stream_LP.add(char_literal92);


            INT93=(Token)match(input,INT,FOLLOW_INT_in_melodia1273);  
            stream_INT.add(INT93);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:27: ( notelist )+
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
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:27: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1275);
            	    notelist94=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist94.getTree());

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


            char_literal95=(Token)match(input,RP,FOLLOW_RP_in_melodia1278);  
            stream_RP.add(char_literal95);


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
            // 137:41: -> ^( MELODY INT ( notelist )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:44: ^( MELODY INT ( notelist )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:1: notelist : notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) ;
    public final BbParser.notelist_return notelist() throws RecognitionException {
        BbParser.notelist_return retval = new BbParser.notelist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal97=null;
        Token MUL99=null;
        BbParser.notas_return notas96 =null;

        BbParser.duration_return duration98 =null;


        BbTree char_literal97_tree=null;
        BbTree MUL99_tree=null;
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1305);
            notas96=notas();

            state._fsp--;

            stream_notas.add(notas96.getTree());

            char_literal97=(Token)match(input,63,FOLLOW_63_in_notelist1307);  
            stream_63.add(char_literal97);


            pushFollow(FOLLOW_duration_in_notelist1309);
            duration98=duration();

            state._fsp--;

            stream_duration.add(duration98.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:30: ( MUL )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==MUL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:30: MUL
                    {
                    MUL99=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1311);  
                    stream_MUL.add(MUL99);


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
            // 140:35: -> ^( PLAYABLE notas duration ( MUL )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:38: ^( PLAYABLE notas duration ( MUL )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PLAYABLE, "PLAYABLE")
                , root_1);

                adaptor.addChild(root_1, stream_notas.nextTree());

                adaptor.addChild(root_1, stream_duration.nextTree());

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:64: ( MUL )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:1: notas : ( nota | '[' ! pack ']' !| '(' ! chord ')' !);
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal101=null;
        Token char_literal103=null;
        Token char_literal104=null;
        Token char_literal106=null;
        BbParser.nota_return nota100 =null;

        BbParser.pack_return pack102 =null;

        BbParser.chord_return chord105 =null;


        BbTree char_literal101_tree=null;
        BbTree char_literal103_tree=null;
        BbTree char_literal104_tree=null;
        BbTree char_literal106_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:142:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1332);
                    nota100=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota100.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal101=(Token)match(input,70,FOLLOW_70_in_notas1341); 

                    pushFollow(FOLLOW_pack_in_notas1344);
                    pack102=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack102.getTree());

                    char_literal103=(Token)match(input,71,FOLLOW_71_in_notas1346); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal104=(Token)match(input,LP,FOLLOW_LP_in_notas1356); 

                    pushFollow(FOLLOW_chord_in_notas1359);
                    chord105=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord105.getTree());

                    char_literal106=(Token)match(input,RP,FOLLOW_RP_in_notas1361); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:1: nota : ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID108=null;
        Token char_literal109=null;
        Token PLUS110=null;
        Token char_literal112=null;
        Token QUIET113=null;
        BbParser.notabasica_return notabasica107 =null;

        BbParser.num_expr_return num_expr111 =null;


        BbTree NOTEID108_tree=null;
        BbTree char_literal109_tree=null;
        BbTree PLUS110_tree=null;
        BbTree char_literal112_tree=null;
        BbTree QUIET113_tree=null;
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? | QUIET )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1380);
                    notabasica107=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica107.getTree());

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
                    // 147:19: -> ^( NOTE notabasica )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:22: ^( NOTE notabasica )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:4: NOTEID ( '(' ! PLUS ^ num_expr ')' !)?
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID108=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1394); 
                    NOTEID108_tree = 
                    (BbTree)adaptor.create(NOTEID108)
                    ;
                    adaptor.addChild(root_0, NOTEID108_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==LP) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal109=(Token)match(input,LP,FOLLOW_LP_in_nota1398); 

                            PLUS110=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1401); 
                            PLUS110_tree = 
                            (BbTree)adaptor.create(PLUS110)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS110_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1404);
                            num_expr111=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr111.getTree());

                            char_literal112=(Token)match(input,RP,FOLLOW_RP_in_nota1406); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:149:4: QUIET
                    {
                    root_0 = (BbTree)adaptor.nil();


                    QUIET113=(Token)match(input,QUIET,FOLLOW_QUIET_in_nota1414); 
                    QUIET113_tree = 
                    (BbTree)adaptor.create(QUIET113)
                    ;
                    adaptor.addChild(root_0, QUIET113_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:1: chord : sub_chord -> ^( CHORD sub_chord ) ;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord114 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1426);
            sub_chord114=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord114.getTree());

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
            // 153:18: -> ^( CHORD sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:153:21: ^( CHORD sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:1: sub_chord : nota ( ',' ! ( nota ) )* ;
    public final BbParser.sub_chord_return sub_chord() throws RecognitionException {
        BbParser.sub_chord_return retval = new BbParser.sub_chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal116=null;
        BbParser.nota_return nota115 =null;

        BbParser.nota_return nota117 =null;


        BbTree char_literal116_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1444);
            nota115=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota115.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:17: ( ',' ! ( nota ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==62) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:19: ',' ! ( nota )
            	    {
            	    char_literal116=(Token)match(input,62,FOLLOW_62_in_sub_chord1448); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1452);
            	    nota117=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota117.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:1: pack : sub_chord -> ^( PACK sub_chord ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord118 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1465);
            sub_chord118=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord118.getTree());

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
            // 159:17: -> ^( PACK sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:20: ^( PACK sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:1: duration : ( INT | '(' ! num_expr ')' !);
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        BbParser.num_expr_return num_expr121 =null;


        BbTree INT119_tree=null;
        BbTree char_literal120_tree=null;
        BbTree char_literal122_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:9: ( INT | '(' ! num_expr ')' !)
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT119=(Token)match(input,INT,FOLLOW_INT_in_duration1484); 
                    INT119_tree = 
                    (BbTree)adaptor.create(INT119)
                    ;
                    adaptor.addChild(root_0, INT119_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:164:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal120=(Token)match(input,LP,FOLLOW_LP_in_duration1493); 

                    pushFollow(FOLLOW_num_expr_in_duration1496);
                    num_expr121=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr121.getTree());

                    char_literal122=(Token)match(input,RP,FOLLOW_RP_in_duration1498); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:1: polifon : 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) ;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal123=null;
        Token LB124=null;
        Token RB126=null;
        BbParser.voices_return voices125 =null;


        BbTree string_literal123_tree=null;
        BbTree LB124_tree=null;
        BbTree RB126_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:9: ( 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:11: 'Poli' LB ( voices )+ RB
            {
            string_literal123=(Token)match(input,68,FOLLOW_68_in_polifon1512);  
            stream_68.add(string_literal123);


            LB124=(Token)match(input,LB,FOLLOW_LB_in_polifon1514);  
            stream_LB.add(LB124);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:21: ( voices )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==NOTEID||LA22_0==66) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:21: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1516);
            	    voices125=voices();

            	    state._fsp--;

            	    stream_voices.add(voices125.getTree());

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


            RB126=(Token)match(input,RB,FOLLOW_RB_in_polifon1519);  
            stream_RB.add(RB126);


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
            // 167:32: -> ^( POLIFONE ( voices )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:167:35: ^( POLIFONE ( voices )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:1: voices : ( melodia '|' !| NOTEID '|' !);
    public final BbParser.voices_return voices() throws RecognitionException {
        BbParser.voices_return retval = new BbParser.voices_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal128=null;
        Token NOTEID129=null;
        Token char_literal130=null;
        BbParser.melodia_return melodia127 =null;


        BbTree char_literal128_tree=null;
        BbTree NOTEID129_tree=null;
        BbTree char_literal130_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:7: ( melodia '|' !| NOTEID '|' !)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:170:9: melodia '|' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_voices1552);
                    melodia127=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia127.getTree());

                    char_literal128=(Token)match(input,75,FOLLOW_75_in_voices1554); 

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:4: NOTEID '|' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID129=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_voices1560); 
                    NOTEID129_tree = 
                    (BbTree)adaptor.create(NOTEID129)
                    ;
                    adaptor.addChild(root_0, NOTEID129_tree);


                    char_literal130=(Token)match(input,75,FOLLOW_75_in_voices1563); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:1: speed : 'Speed' num_expr -> ^( SPEED num_expr ) ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal131=null;
        BbParser.num_expr_return num_expr132 =null;


        BbTree string_literal131_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:7: ( 'Speed' num_expr -> ^( SPEED num_expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:9: 'Speed' num_expr
            {
            string_literal131=(Token)match(input,69,FOLLOW_69_in_speed1575);  
            stream_69.add(string_literal131);


            pushFollow(FOLLOW_num_expr_in_speed1577);
            num_expr132=num_expr();

            state._fsp--;

            stream_num_expr.add(num_expr132.getTree());

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
            // 174:26: -> ^( SPEED num_expr )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:29: ^( SPEED num_expr )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:1: expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR134=null;
        BbParser.boolterm_return boolterm133 =null;

        BbParser.boolterm_return boolterm135 =null;


        BbTree OR134_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:6: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:8: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_expr1594);
            boolterm133=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm133.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:17: ( OR ^ boolterm )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==OR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:18: OR ^ boolterm
            	    {
            	    OR134=(Token)match(input,OR,FOLLOW_OR_in_expr1597); 
            	    OR134_tree = 
            	    (BbTree)adaptor.create(OR134)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR134_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_expr1600);
            	    boolterm135=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm135.getTree());

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
    // $ANTLR end "expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND137=null;
        BbParser.boolfact_return boolfact136 =null;

        BbParser.boolfact_return boolfact138 =null;


        BbTree AND137_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1611);
            boolfact136=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact136.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:22: ( AND ^ boolfact )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==AND) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:179:23: AND ^ boolfact
            	    {
            	    AND137=(Token)match(input,AND,FOLLOW_AND_in_boolterm1614); 
            	    AND137_tree = 
            	    (BbTree)adaptor.create(AND137)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND137_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1617);
            	    boolfact138=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact138.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ140=null;
        Token NEQ141=null;
        Token LT142=null;
        Token LE143=null;
        Token GT144=null;
        Token GE145=null;
        BbParser.num_expr_return num_expr139 =null;

        BbParser.num_expr_return num_expr146 =null;


        BbTree EQ140_tree=null;
        BbTree NEQ141_tree=null;
        BbTree LT142_tree=null;
        BbTree LE143_tree=null;
        BbTree GT144_tree=null;
        BbTree GE145_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1637);
            num_expr139=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr139.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==EQ||(LA27_0 >= GE && LA27_0 <= GT)||LA27_0==LE||LA27_0==LT||LA27_0==NEQ) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:24: EQ ^
                            {
                            EQ140=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1641); 
                            EQ140_tree = 
                            (BbTree)adaptor.create(EQ140)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ140_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:30: NEQ ^
                            {
                            NEQ141=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1646); 
                            NEQ141_tree = 
                            (BbTree)adaptor.create(NEQ141)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ141_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:37: LT ^
                            {
                            LT142=(Token)match(input,LT,FOLLOW_LT_in_boolfact1651); 
                            LT142_tree = 
                            (BbTree)adaptor.create(LT142)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT142_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:43: LE ^
                            {
                            LE143=(Token)match(input,LE,FOLLOW_LE_in_boolfact1656); 
                            LE143_tree = 
                            (BbTree)adaptor.create(LE143)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE143_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:49: GT ^
                            {
                            GT144=(Token)match(input,GT,FOLLOW_GT_in_boolfact1661); 
                            GT144_tree = 
                            (BbTree)adaptor.create(GT144)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT144_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:182:55: GE ^
                            {
                            GE145=(Token)match(input,GE,FOLLOW_GE_in_boolfact1666); 
                            GE145_tree = 
                            (BbTree)adaptor.create(GE145)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE145_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1670);
                    num_expr146=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr146.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS148=null;
        Token MINUS149=null;
        BbParser.term_return term147 =null;

        BbParser.term_return term150 =null;


        BbTree PLUS148_tree=null;
        BbTree MINUS149_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1690);
            term147=term();

            state._fsp--;

            adaptor.addChild(root_0, term147.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:18: ( ( PLUS ^| MINUS ^) term )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==MINUS||LA29_0==PLUS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:20: ( PLUS ^| MINUS ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:21: PLUS ^
            	            {
            	            PLUS148=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1695); 
            	            PLUS148_tree = 
            	            (BbTree)adaptor.create(PLUS148)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS148_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:29: MINUS ^
            	            {
            	            MINUS149=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1700); 
            	            MINUS149_tree = 
            	            (BbTree)adaptor.create(MINUS149)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS149_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1704);
            	    term150=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term150.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL152=null;
        Token DIV153=null;
        Token MOD154=null;
        BbParser.factor_return factor151 =null;

        BbParser.factor_return factor155 =null;


        BbTree MUL152_tree=null;
        BbTree DIV153_tree=null;
        BbTree MOD154_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1728);
            factor151=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor151.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==DIV||(LA31_0 >= MOD && LA31_0 <= MUL)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:23: MUL ^
            	            {
            	            MUL152=(Token)match(input,MUL,FOLLOW_MUL_in_term1733); 
            	            MUL152_tree = 
            	            (BbTree)adaptor.create(MUL152)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL152_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:30: DIV ^
            	            {
            	            DIV153=(Token)match(input,DIV,FOLLOW_DIV_in_term1738); 
            	            DIV153_tree = 
            	            (BbTree)adaptor.create(DIV153)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV153_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:188:37: MOD ^
            	            {
            	            MOD154=(Token)match(input,MOD,FOLLOW_MOD_in_term1743); 
            	            MOD154_tree = 
            	            (BbTree)adaptor.create(MOD154)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD154_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1748);
            	    factor155=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor155.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT156=null;
        Token PLUS157=null;
        Token MINUS158=null;
        BbParser.atom_return atom159 =null;


        BbTree NOT156_tree=null;
        BbTree PLUS157_tree=null;
        BbTree MINUS158_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:14: NOT ^
                    {
                    NOT156=(Token)match(input,NOT,FOLLOW_NOT_in_factor1771); 
                    NOT156_tree = 
                    (BbTree)adaptor.create(NOT156)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT156_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:21: PLUS ^
                    {
                    PLUS157=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1776); 
                    PLUS157_tree = 
                    (BbTree)adaptor.create(PLUS157)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS157_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:191:29: MINUS ^
                    {
                    MINUS158=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1781); 
                    MINUS158_tree = 
                    (BbTree)adaptor.create(MINUS158)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS158_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1786);
            atom159=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom159.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !);
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID160=null;
        Token INT161=null;
        Token char_literal163=null;
        Token char_literal165=null;
        BbParser.funcall_return funcall162 =null;

        BbParser.expr_return expr164 =null;


        BbTree b_tree=null;
        BbTree ID160_tree=null;
        BbTree INT161_tree=null;
        BbTree char_literal163_tree=null;
        BbTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! expr ')' !)
            int alt34=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==LP) ) {
                    alt34=4;
                }
                else if ( (LA34_1==AND||LA34_1==DIV||LA34_1==EQ||(LA34_1 >= GE && LA34_1 <= GT)||LA34_1==LE||LA34_1==LT||(LA34_1 >= MINUS && LA34_1 <= NEQ)||LA34_1==OR||LA34_1==PLUS||LA34_1==RB||LA34_1==RP||LA34_1==62||LA34_1==64) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID160=(Token)match(input,ID,FOLLOW_ID_in_atom1811); 
                    ID160_tree = 
                    (BbTree)adaptor.create(ID160)
                    ;
                    adaptor.addChild(root_0, ID160_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:198:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT161=(Token)match(input,INT,FOLLOW_INT_in_atom1825); 
                    INT161_tree = 
                    (BbTree)adaptor.create(INT161)
                    ;
                    adaptor.addChild(root_0, INT161_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:13: (b= TRUE |b= FALSE )
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1842);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1848);  
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
                    // 199:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:199:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:200:11: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1869);
                    funcall162=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall162.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:201:13: '(' ! expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal163=(Token)match(input,LP,FOLLOW_LP_in_atom1883); 

                    pushFollow(FOLLOW_expr_in_atom1886);
                    expr164=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr164.getTree());

                    char_literal165=(Token)match(input,RP,FOLLOW_RP_in_atom1888); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID166=null;
        Token char_literal167=null;
        Token char_literal169=null;
        BbParser.expr_list_return expr_list168 =null;


        BbTree ID166_tree=null;
        BbTree char_literal167_tree=null;
        BbTree char_literal169_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:13: ID '(' ( expr_list )? ')'
            {
            ID166=(Token)match(input,ID,FOLLOW_ID_in_funcall1908);  
            stream_ID.add(ID166);


            char_literal167=(Token)match(input,LP,FOLLOW_LP_in_funcall1910);  
            stream_LP.add(char_literal167);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:20: ( expr_list )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FALSE||LA35_0==ID||LA35_0==INT||LA35_0==LP||LA35_0==MINUS||LA35_0==NOT||LA35_0==PLUS||LA35_0==TRUE) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1912);
                    expr_list168=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list168.getTree());

                    }
                    break;

            }


            char_literal169=(Token)match(input,RP,FOLLOW_RP_in_funcall1915);  
            stream_RP.add(char_literal169);


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
            // 204:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:204:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal171=null;
        BbParser.expr_return expr170 =null;

        BbParser.expr_return expr172 =null;


        BbTree char_literal171_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1948);
            expr170=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr170.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:18: ( ',' ! expr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==62) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:208:19: ',' ! expr
            	    {
            	    char_literal171=(Token)match(input,62,FOLLOW_62_in_expr_list1951); 

            	    pushFollow(FOLLOW_expr_in_expr_list1954);
            	    expr172=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr172.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:1: notabasica : PITCH ( ALT )? ( INT )? ;
    public final BbParser.notabasica_return notabasica() throws RecognitionException {
        BbParser.notabasica_return retval = new BbParser.notabasica_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PITCH173=null;
        Token ALT174=null;
        Token INT175=null;

        BbTree PITCH173_tree=null;
        BbTree ALT174_tree=null;
        BbTree INT175_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:12: ( PITCH ( ALT )? ( INT )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:14: PITCH ( ALT )? ( INT )?
            {
            root_0 = (BbTree)adaptor.nil();


            PITCH173=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica1973); 
            PITCH173_tree = 
            (BbTree)adaptor.create(PITCH173)
            ;
            adaptor.addChild(root_0, PITCH173_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:20: ( ALT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==ALT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:20: ALT
                    {
                    ALT174=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica1975); 
                    ALT174_tree = 
                    (BbTree)adaptor.create(ALT174)
                    ;
                    adaptor.addChild(root_0, ALT174_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:25: ( INT )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==INT) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:211:25: INT
                    {
                    INT175=(Token)match(input,INT,FOLLOW_INT_in_notabasica1978); 
                    INT175_tree = 
                    (BbTree)adaptor.create(INT175)
                    ;
                    adaptor.addChild(root_0, INT175_tree);


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
    public static final BitSet FOLLOW_LB_in_func271 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000775L});
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
    public static final BitSet FOLLOW_64_in_block_instructions425 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000775L});
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
    public static final BitSet FOLLOW_NOTEID_in_assign756 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign758 = new BitSet(new long[]{0x0000008000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_musicnotation_in_assign760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_musicnotation897 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_notabasica_in_musicnotation899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_musicnotation915 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation918 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation921 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_musicnotation932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt968 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt971 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_ite_stmt974 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt976 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt979 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000775L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt982 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt984 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt988 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt991 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000775L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt994 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt1024 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt1027 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_while_stmt1030 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt1032 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt1035 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000775L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1038 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1078 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1081 = new BitSet(new long[]{0x0000008000200000L,0x0000000000000700L});
    public static final BitSet FOLLOW_assign_in_for_stmt1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_for_stmt1086 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_for_stmt1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_for_stmt1091 = new BitSet(new long[]{0x0000008000200000L,0x0000000000000700L});
    public static final BitSet FOLLOW_assign_in_for_stmt1094 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1096 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1099 = new BitSet(new long[]{0x181A088020610000L,0x0000000000000775L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1102 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1129 = new BitSet(new long[]{0x0200209121208002L,0x000000000000001EL});
    public static final BitSet FOLLOW_expr_in_return_stmt1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_return_stmt1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_playable1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_READ_in_read1219 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_read1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WRITE_in_write1242 = new BitSet(new long[]{0x0280201121208000L});
    public static final BitSet FOLLOW_expr_in_write1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_write1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_melodia1269 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_melodia1271 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_INT_in_melodia1273 = new BitSet(new long[]{0x0002088020000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_notelist_in_melodia1275 = new BitSet(new long[]{0x0022088020000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RP_in_melodia1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notas_in_notelist1305 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_notelist1307 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_duration_in_notelist1309 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_notas1341 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_pack_in_notas1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_notas1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1356 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_chord_in_notas1359 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1394 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_LP_in_nota1398 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1401 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_nota1404 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUIET_in_nota1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1444 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_sub_chord1448 = new BitSet(new long[]{0x0002088000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1452 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_pack1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1493 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_duration1496 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_polifon1512 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_LB_in_polifon1514 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_voices_in_polifon1516 = new BitSet(new long[]{0x0004008000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RB_in_polifon1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_voices1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_voices1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_voices1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_voices1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_speed1575 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_speed1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_expr1594 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_OR_in_expr1597 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_boolterm_in_expr1600 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1611 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1614 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1617 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1637 = new BitSet(new long[]{0x0000000844182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1641 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1646 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_LT_in_boolfact1651 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_LE_in_boolfact1656 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_GT_in_boolfact1661 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_GE_in_boolfact1666 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1690 = new BitSet(new long[]{0x0000200100000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1695 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1700 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_term_in_num_expr1704 = new BitSet(new long[]{0x0000200100000002L});
    public static final BitSet FOLLOW_factor_in_term1728 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_MUL_in_term1733 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_DIV_in_term1738 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_MOD_in_term1743 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_factor_in_term1748 = new BitSet(new long[]{0x0000000600000802L});
    public static final BitSet FOLLOW_NOT_in_factor1771 = new BitSet(new long[]{0x0200000021208000L});
    public static final BitSet FOLLOW_PLUS_in_factor1776 = new BitSet(new long[]{0x0200000021208000L});
    public static final BitSet FOLLOW_MINUS_in_factor1781 = new BitSet(new long[]{0x0200000021208000L});
    public static final BitSet FOLLOW_atom_in_factor1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1883 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_atom1886 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1908 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LP_in_funcall1910 = new BitSet(new long[]{0x0220201121208000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1912 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1948 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_expr_list1951 = new BitSet(new long[]{0x0200201121208000L});
    public static final BitSet FOLLOW_expr_in_expr_list1954 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_PITCH_in_notabasica1973 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_ALT_in_notabasica1975 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_INT_in_notabasica1978 = new BitSet(new long[]{0x0000000000000002L});

}