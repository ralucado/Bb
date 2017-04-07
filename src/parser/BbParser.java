// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 13:28:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGLIST", "ASSIGN", "BOOLEAN", "CHORD", "COMMENT", "DIV", "ELSE", "EQ", "ESC_SEQ", "FALSE", "FOR", "FUNC", "FUNCALL", "GE", "GT", "ID", "IF", "INT", "LB", "LE", "LIST_FUNCTIONS", "LIST_INSTR", "LP", "LT", "MINUS", "MOD", "MUL", "NEQ", "NEWLINE", "NOT", "NOTA", "NOTEASSIGN", "NOTEID", "OR", "PACK", "PARAMS", "PLUS", "PREF", "PVALUE", "RB", "RETURN", "RP", "THEN", "TRUE", "VOICE", "WHILE", "WS", "','", "'.'", "';'", "'Chord'", "'Ensemble'", "'Melody'", "'Note'", "'Poli'", "'Speed'", "'['", "']'", "'int'", "'void'", "'|'"
    };

    public static final int EOF=-1;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int AND=4;
    public static final int ARGLIST=5;
    public static final int ASSIGN=6;
    public static final int BOOLEAN=7;
    public static final int CHORD=8;
    public static final int COMMENT=9;
    public static final int DIV=10;
    public static final int ELSE=11;
    public static final int EQ=12;
    public static final int ESC_SEQ=13;
    public static final int FALSE=14;
    public static final int FOR=15;
    public static final int FUNC=16;
    public static final int FUNCALL=17;
    public static final int GE=18;
    public static final int GT=19;
    public static final int ID=20;
    public static final int IF=21;
    public static final int INT=22;
    public static final int LB=23;
    public static final int LE=24;
    public static final int LIST_FUNCTIONS=25;
    public static final int LIST_INSTR=26;
    public static final int LP=27;
    public static final int LT=28;
    public static final int MINUS=29;
    public static final int MOD=30;
    public static final int MUL=31;
    public static final int NEQ=32;
    public static final int NEWLINE=33;
    public static final int NOT=34;
    public static final int NOTA=35;
    public static final int NOTEASSIGN=36;
    public static final int NOTEID=37;
    public static final int OR=38;
    public static final int PACK=39;
    public static final int PARAMS=40;
    public static final int PLUS=41;
    public static final int PREF=42;
    public static final int PVALUE=43;
    public static final int RB=44;
    public static final int RETURN=45;
    public static final int RP=46;
    public static final int THEN=47;
    public static final int TRUE=48;
    public static final int VOICE=49;
    public static final int WHILE=50;
    public static final int WS=51;

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:33:1: prog : ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:33:9: ( ( func )+ EOF -> ^( LIST_FUNCTIONS ( func )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:33:11: ( func )+ EOF
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:33:11: ( func )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 55 && LA1_0 <= 58)||(LA1_0 >= 63 && LA1_0 <= 64)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:33:11: func
            	    {
            	    pushFollow(FOLLOW_func_in_prog181);
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


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog184);  
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
            // 33:21: -> ^( LIST_FUNCTIONS ( func )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:33:24: ^( LIST_FUNCTIONS ( func )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:37:1: func : ( type | notetype ) ID ^ params LB ! block_instructions RB !;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:37:9: ( ( type | notetype ) ID ^ params LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:37:11: ( type | notetype ) ID ^ params LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:37:11: ( type | notetype )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0 >= 63 && LA2_0 <= 64)) ) {
                alt2=1;
            }
            else if ( ((LA2_0 >= 55 && LA2_0 <= 58)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:37:12: type
                    {
                    pushFollow(FOLLOW_type_in_func215);
                    type3=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type3.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:37:19: notetype
                    {
                    pushFollow(FOLLOW_notetype_in_func219);
                    notetype4=notetype();

                    state._fsp--;

                    adaptor.addChild(root_0, notetype4.getTree());

                    }
                    break;

            }


            ID5=(Token)match(input,ID,FOLLOW_ID_in_func222); 
            ID5_tree = 
            (BbTree)adaptor.create(ID5)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(ID5_tree, root_0);


            pushFollow(FOLLOW_params_in_func225);
            params6=params();

            state._fsp--;

            adaptor.addChild(root_0, params6.getTree());

            LB7=(Token)match(input,LB,FOLLOW_LB_in_func227); 

            pushFollow(FOLLOW_block_instructions_in_func230);
            block_instructions8=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions8.getTree());

            RB9=(Token)match(input,RB,FOLLOW_RB_in_func232); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:1: params : '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:9: ( '(' ( paramlist )? ')' -> ^( PARAMS ( paramlist )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:11: '(' ( paramlist )? ')'
            {
            char_literal10=(Token)match(input,LP,FOLLOW_LP_in_params252);  
            stream_LP.add(char_literal10);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:15: ( paramlist )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= 55 && LA3_0 <= 58)||(LA3_0 >= 63 && LA3_0 <= 64)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:15: paramlist
                    {
                    pushFollow(FOLLOW_paramlist_in_params254);
                    paramlist11=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist11.getTree());

                    }
                    break;

            }


            char_literal12=(Token)match(input,RP,FOLLOW_RP_in_params257);  
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
            // 41:30: -> ^( PARAMS ( paramlist )? )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:33: ^( PARAMS ( paramlist )? )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:41:42: ( paramlist )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:1: paramlist : param ( ',' ! param )* ;
    public final BbParser.paramlist_return paramlist() throws RecognitionException {
        BbParser.paramlist_return retval = new BbParser.paramlist_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal14=null;
        BbParser.param_return param13 =null;

        BbParser.param_return param15 =null;


        BbTree char_literal14_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:10: ( param ( ',' ! param )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:12: param ( ',' ! param )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_param_in_paramlist283);
            param13=param();

            state._fsp--;

            adaptor.addChild(root_0, param13.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:18: ( ',' ! param )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==52) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:45:19: ',' ! param
            	    {
            	    char_literal14=(Token)match(input,52,FOLLOW_52_in_paramlist286); 

            	    pushFollow(FOLLOW_param_in_paramlist289);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:1: param : ( type ID | notetype NOTEID );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:9: ( type ID | notetype NOTEID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 63 && LA5_0 <= 64)) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= 55 && LA5_0 <= 58)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:50:13: type ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_param314);
                    type16=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type16.getTree());

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_param316); 
                    ID17_tree = 
                    (BbTree)adaptor.create(ID17)
                    ;
                    adaptor.addChild(root_0, ID17_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:51:13: notetype NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notetype_in_param330);
                    notetype18=notetype();

                    state._fsp--;

                    adaptor.addChild(root_0, notetype18.getTree());

                    NOTEID19=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_param332); 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:54:1: block_instructions : instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) ;
    public final BbParser.block_instructions_return block_instructions() throws RecognitionException {
        BbParser.block_instructions_return retval = new BbParser.block_instructions_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal21=null;
        BbParser.instruction_return instruction20 =null;

        BbParser.instruction_return instruction22 =null;


        BbTree char_literal21_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_instruction=new RewriteRuleSubtreeStream(adaptor,"rule instruction");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:9: ( instruction ( ';' instruction )* -> ^( LIST_INSTR ( instruction )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:14: instruction ( ';' instruction )*
            {
            pushFollow(FOLLOW_instruction_in_block_instructions376);
            instruction20=instruction();

            state._fsp--;

            stream_instruction.add(instruction20.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:26: ( ';' instruction )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==54) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:27: ';' instruction
            	    {
            	    char_literal21=(Token)match(input,54,FOLLOW_54_in_block_instructions379);  
            	    stream_54.add(char_literal21);


            	    pushFollow(FOLLOW_instruction_in_block_instructions381);
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
            // 56:13: -> ^( LIST_INSTR ( instruction )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:16: ^( LIST_INSTR ( instruction )+ )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:60:1: instruction : ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed |);
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:9: ( assign | ite_stmt | while_stmt | for_stmt | funcall | return_stmt | playable | speed |)
            int alt7=9;
            switch ( input.LA(1) ) {
            case 55:
            case 56:
            case 57:
            case 58:
            case 63:
            case 64:
                {
                alt7=1;
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
            case NOTA:
            case NOTEID:
            case 59:
            case 61:
                {
                alt7=7;
                }
                break;
            case 60:
                {
                alt7=8;
                }
                break;
            case ELSE:
            case RB:
            case 54:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:61:13: assign
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_assign_in_instruction440);
                    assign23=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign23.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:62:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction464);
                    ite_stmt24=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt24.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:63:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction486);
                    while_stmt25=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt25.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:64:11: for_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction504);
                    for_stmt26=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt26.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:65:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction520);
                    funcall27=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall27.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:66:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction543);
                    return_stmt28=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt28.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction562);
                    playable29=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable29.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction582);
                    speed30=speed();

                    state._fsp--;

                    adaptor.addChild(root_0, speed30.getTree());

                    }
                    break;
                case 9 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:9: 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:1: assign : ( type ID eq= EQ n_expr -> ^( ASSIGN[$eq,\":=\"] type ID n_expr ) | notetype NOTEID eq= EQ musicnotation -> ^( NOTEASSIGN[$eq,\":=\"] notetype NOTEID musicnotation ) );
    public final BbParser.assign_return assign() throws RecognitionException {
        BbParser.assign_return retval = new BbParser.assign_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token eq=null;
        Token ID32=null;
        Token NOTEID35=null;
        BbParser.type_return type31 =null;

        BbParser.n_expr_return n_expr33 =null;

        BbParser.notetype_return notetype34 =null;

        BbParser.musicnotation_return musicnotation36 =null;


        BbTree eq_tree=null;
        BbTree ID32_tree=null;
        BbTree NOTEID35_tree=null;
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_notetype=new RewriteRuleSubtreeStream(adaptor,"rule notetype");
        RewriteRuleSubtreeStream stream_musicnotation=new RewriteRuleSubtreeStream(adaptor,"rule musicnotation");
        RewriteRuleSubtreeStream stream_n_expr=new RewriteRuleSubtreeStream(adaptor,"rule n_expr");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:9: ( type ID eq= EQ n_expr -> ^( ASSIGN[$eq,\":=\"] type ID n_expr ) | notetype NOTEID eq= EQ musicnotation -> ^( NOTEASSIGN[$eq,\":=\"] notetype NOTEID musicnotation ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= 63 && LA8_0 <= 64)) ) {
                alt8=1;
            }
            else if ( ((LA8_0 >= 55 && LA8_0 <= 58)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:13: type ID eq= EQ n_expr
                    {
                    pushFollow(FOLLOW_type_in_assign635);
                    type31=type();

                    state._fsp--;

                    stream_type.add(type31.getTree());

                    ID32=(Token)match(input,ID,FOLLOW_ID_in_assign637);  
                    stream_ID.add(ID32);


                    eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign641);  
                    stream_EQ.add(eq);


                    pushFollow(FOLLOW_n_expr_in_assign643);
                    n_expr33=n_expr();

                    state._fsp--;

                    stream_n_expr.add(n_expr33.getTree());

                    // AST REWRITE
                    // elements: type, ID, n_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 73:34: -> ^( ASSIGN[$eq,\":=\"] type ID n_expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:37: ^( ASSIGN[$eq,\":=\"] type ID n_expr )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(ASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, stream_type.nextTree());

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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:74:5: notetype NOTEID eq= EQ musicnotation
                    {
                    pushFollow(FOLLOW_notetype_in_assign662);
                    notetype34=notetype();

                    state._fsp--;

                    stream_notetype.add(notetype34.getTree());

                    NOTEID35=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign664);  
                    stream_NOTEID.add(NOTEID35);


                    eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign668);  
                    stream_EQ.add(eq);


                    pushFollow(FOLLOW_musicnotation_in_assign670);
                    musicnotation36=musicnotation();

                    state._fsp--;

                    stream_musicnotation.add(musicnotation36.getTree());

                    // AST REWRITE
                    // elements: notetype, NOTEID, musicnotation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 74:41: -> ^( NOTEASSIGN[$eq,\":=\"] notetype NOTEID musicnotation )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:74:44: ^( NOTEASSIGN[$eq,\":=\"] notetype NOTEID musicnotation )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(NOTEASSIGN, eq, ":=")
                        , root_1);

                        adaptor.addChild(root_1, stream_notetype.nextTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:77:1: type : ( 'int' | 'void' );
    public final BbParser.type_return type() throws RecognitionException {
        BbParser.type_return retval = new BbParser.type_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set37=null;

        BbTree set37_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:77:6: ( 'int' | 'void' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set37=(Token)input.LT(1);

            if ( (input.LA(1) >= 63 && input.LA(1) <= 64) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BbTree)adaptor.create(set37)
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:1: notetype : ( 'Note' | 'Chord' | 'Melody' | 'Ensemble' );
    public final BbParser.notetype_return notetype() throws RecognitionException {
        BbParser.notetype_return retval = new BbParser.notetype_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token set38=null;

        BbTree set38_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:81:9: ( 'Note' | 'Chord' | 'Melody' | 'Ensemble' )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:
            {
            root_0 = (BbTree)adaptor.nil();


            set38=(Token)input.LT(1);

            if ( (input.LA(1) >= 55 && input.LA(1) <= 58) ) {
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
    // $ANTLR end "notetype"


    public static class musicnotation_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "musicnotation"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:87:1: musicnotation : ( 'Note' '(' NOTA ')' | 'Chord' '(' chord ')' | 'Melody' '(' melodia ')' | polifon );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal39=null;
        Token char_literal40=null;
        Token NOTA41=null;
        Token char_literal42=null;
        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token string_literal47=null;
        Token char_literal48=null;
        Token char_literal50=null;
        BbParser.chord_return chord45 =null;

        BbParser.melodia_return melodia49 =null;

        BbParser.polifon_return polifon51 =null;


        BbTree string_literal39_tree=null;
        BbTree char_literal40_tree=null;
        BbTree NOTA41_tree=null;
        BbTree char_literal42_tree=null;
        BbTree string_literal43_tree=null;
        BbTree char_literal44_tree=null;
        BbTree char_literal46_tree=null;
        BbTree string_literal47_tree=null;
        BbTree char_literal48_tree=null;
        BbTree char_literal50_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:87:15: ( 'Note' '(' NOTA ')' | 'Chord' '(' chord ')' | 'Melody' '(' melodia ')' | polifon )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt9=1;
                }
                break;
            case 55:
                {
                alt9=2;
                }
                break;
            case 57:
                {
                alt9=3;
                }
                break;
            case 59:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:87:17: 'Note' '(' NOTA ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal39=(Token)match(input,58,FOLLOW_58_in_musicnotation807); 
                    string_literal39_tree = 
                    (BbTree)adaptor.create(string_literal39)
                    ;
                    adaptor.addChild(root_0, string_literal39_tree);


                    char_literal40=(Token)match(input,LP,FOLLOW_LP_in_musicnotation809); 
                    char_literal40_tree = 
                    (BbTree)adaptor.create(char_literal40)
                    ;
                    adaptor.addChild(root_0, char_literal40_tree);


                    NOTA41=(Token)match(input,NOTA,FOLLOW_NOTA_in_musicnotation811); 
                    NOTA41_tree = 
                    (BbTree)adaptor.create(NOTA41)
                    ;
                    adaptor.addChild(root_0, NOTA41_tree);


                    char_literal42=(Token)match(input,RP,FOLLOW_RP_in_musicnotation813); 
                    char_literal42_tree = 
                    (BbTree)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:88:7: 'Chord' '(' chord ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal43=(Token)match(input,55,FOLLOW_55_in_musicnotation821); 
                    string_literal43_tree = 
                    (BbTree)adaptor.create(string_literal43)
                    ;
                    adaptor.addChild(root_0, string_literal43_tree);


                    char_literal44=(Token)match(input,LP,FOLLOW_LP_in_musicnotation823); 
                    char_literal44_tree = 
                    (BbTree)adaptor.create(char_literal44)
                    ;
                    adaptor.addChild(root_0, char_literal44_tree);


                    pushFollow(FOLLOW_chord_in_musicnotation825);
                    chord45=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord45.getTree());

                    char_literal46=(Token)match(input,RP,FOLLOW_RP_in_musicnotation827); 
                    char_literal46_tree = 
                    (BbTree)adaptor.create(char_literal46)
                    ;
                    adaptor.addChild(root_0, char_literal46_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:89:7: 'Melody' '(' melodia ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal47=(Token)match(input,57,FOLLOW_57_in_musicnotation835); 
                    string_literal47_tree = 
                    (BbTree)adaptor.create(string_literal47)
                    ;
                    adaptor.addChild(root_0, string_literal47_tree);


                    char_literal48=(Token)match(input,LP,FOLLOW_LP_in_musicnotation837); 
                    char_literal48_tree = 
                    (BbTree)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    pushFollow(FOLLOW_melodia_in_musicnotation839);
                    melodia49=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia49.getTree());

                    char_literal50=(Token)match(input,RP,FOLLOW_RP_in_musicnotation841); 
                    char_literal50_tree = 
                    (BbTree)adaptor.create(char_literal50)
                    ;
                    adaptor.addChild(root_0, char_literal50_tree);


                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:90:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation849);
                    polifon51=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon51.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:1: ite_stmt : IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !;
    public final BbParser.ite_stmt_return ite_stmt() throws RecognitionException {
        BbParser.ite_stmt_return retval = new BbParser.ite_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token IF52=null;
        Token LP53=null;
        Token RP55=null;
        Token LB56=null;
        Token ELSE58=null;
        Token RB60=null;
        BbParser.n_expr_return n_expr54 =null;

        BbParser.block_instructions_return block_instructions57 =null;

        BbParser.block_instructions_return block_instructions59 =null;


        BbTree IF52_tree=null;
        BbTree LP53_tree=null;
        BbTree RP55_tree=null;
        BbTree LB56_tree=null;
        BbTree ELSE58_tree=null;
        BbTree RB60_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:13: ( IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:17: IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !
            {
            root_0 = (BbTree)adaptor.nil();


            IF52=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt869); 
            IF52_tree = 
            (BbTree)adaptor.create(IF52)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF52_tree, root_0);


            LP53=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt872); 

            pushFollow(FOLLOW_n_expr_in_ite_stmt875);
            n_expr54=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr54.getTree());

            RP55=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt877); 

            LB56=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt880); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt883);
            block_instructions57=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions57.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:59: ( ELSE ! block_instructions )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:60: ELSE ! block_instructions
                    {
                    ELSE58=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt886); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt889);
                    block_instructions59=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions59.getTree());

                    }
                    break;

            }


            RB60=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt893); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:1: while_stmt : WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE61=null;
        Token LP62=null;
        Token RP64=null;
        Token LB65=null;
        Token RB67=null;
        BbParser.n_expr_return n_expr63 =null;

        BbParser.block_instructions_return block_instructions66 =null;


        BbTree WHILE61_tree=null;
        BbTree LP62_tree=null;
        BbTree RP64_tree=null;
        BbTree LB65_tree=null;
        BbTree RB67_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:13: ( WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:99:17: WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE61=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt919); 
            WHILE61_tree = 
            (BbTree)adaptor.create(WHILE61)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE61_tree, root_0);


            LP62=(Token)match(input,LP,FOLLOW_LP_in_while_stmt922); 

            pushFollow(FOLLOW_n_expr_in_while_stmt925);
            n_expr63=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr63.getTree());

            RP64=(Token)match(input,RP,FOLLOW_RP_in_while_stmt927); 

            LB65=(Token)match(input,LB,FOLLOW_LB_in_while_stmt930); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt933);
            block_instructions66=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions66.getTree());

            RB67=(Token)match(input,RB,FOLLOW_RB_in_while_stmt935); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:1: for_stmt : FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !;
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

        BbParser.n_expr_return n_expr72 =null;

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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:11: ( FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:103:15: FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR68=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt973); 
            FOR68_tree = 
            (BbTree)adaptor.create(FOR68)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR68_tree, root_0);


            LP69=(Token)match(input,LP,FOLLOW_LP_in_for_stmt976); 

            pushFollow(FOLLOW_assign_in_for_stmt979);
            assign70=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign70.getTree());

            char_literal71=(Token)match(input,54,FOLLOW_54_in_for_stmt981); 
            char_literal71_tree = 
            (BbTree)adaptor.create(char_literal71)
            ;
            adaptor.addChild(root_0, char_literal71_tree);


            pushFollow(FOLLOW_n_expr_in_for_stmt983);
            n_expr72=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr72.getTree());

            char_literal73=(Token)match(input,54,FOLLOW_54_in_for_stmt985); 
            char_literal73_tree = 
            (BbTree)adaptor.create(char_literal73)
            ;
            adaptor.addChild(root_0, char_literal73_tree);


            pushFollow(FOLLOW_assign_in_for_stmt987);
            assign74=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign74.getTree());

            RP75=(Token)match(input,RP,FOLLOW_RP_in_for_stmt989); 

            LB76=(Token)match(input,LB,FOLLOW_LB_in_for_stmt992); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt995);
            block_instructions77=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions77.getTree());

            RB78=(Token)match(input,RB,FOLLOW_RB_in_for_stmt997); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:1: return_stmt : RETURN ^ ( expr )? ;
    public final BbParser.return_stmt_return return_stmt() throws RecognitionException {
        BbParser.return_stmt_return retval = new BbParser.return_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token RETURN79=null;
        BbParser.expr_return expr80 =null;


        BbTree RETURN79_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:13: ( RETURN ^ ( expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:17: RETURN ^ ( expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN79=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1022); 
            RETURN79_tree = 
            (BbTree)adaptor.create(RETURN79)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN79_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:25: ( expr )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FALSE||LA11_0==ID||LA11_0==INT||LA11_0==LP||LA11_0==MINUS||(LA11_0 >= NOT && LA11_0 <= NOTA)||LA11_0==NOTEID||LA11_0==PLUS||LA11_0==TRUE||LA11_0==59||LA11_0==61) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:107:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_return_stmt1025);
                    expr80=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr80.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:1: playable : ( melodia | polifon );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.melodia_return melodia81 =null;

        BbParser.polifon_return polifon82 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:9: ( melodia | polifon )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==LP||LA12_0==NOTA||LA12_0==NOTEID||LA12_0==61) ) {
                alt12=1;
            }
            else if ( (LA12_0==59) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:111:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1043);
                    melodia81=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia81.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:112:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1055);
                    polifon82=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon82.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:1: melodia : ( notas '.' duration ( '*' )? )+ ;
    public final BbParser.melodia_return melodia() throws RecognitionException {
        BbParser.melodia_return retval = new BbParser.melodia_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal84=null;
        Token char_literal86=null;
        BbParser.notas_return notas83 =null;

        BbParser.duration_return duration85 =null;


        BbTree char_literal84_tree=null;
        BbTree char_literal86_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:8: ( ( notas '.' duration ( '*' )? )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:10: ( notas '.' duration ( '*' )? )+
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:10: ( notas '.' duration ( '*' )? )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LP||LA14_0==NOTA||LA14_0==NOTEID||LA14_0==61) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:11: notas '.' duration ( '*' )?
            	    {
            	    pushFollow(FOLLOW_notas_in_melodia1072);
            	    notas83=notas();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notas83.getTree());

            	    char_literal84=(Token)match(input,53,FOLLOW_53_in_melodia1074); 
            	    char_literal84_tree = 
            	    (BbTree)adaptor.create(char_literal84)
            	    ;
            	    adaptor.addChild(root_0, char_literal84_tree);


            	    pushFollow(FOLLOW_duration_in_melodia1076);
            	    duration85=duration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, duration85.getTree());

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:30: ( '*' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==MUL) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:115:31: '*'
            	            {
            	            char_literal86=(Token)match(input,MUL,FOLLOW_MUL_in_melodia1079); 
            	            char_literal86_tree = 
            	            (BbTree)adaptor.create(char_literal86)
            	            ;
            	            adaptor.addChild(root_0, char_literal86_tree);


            	            }
            	            break;

            	    }


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:1: notas : ( nota | '[' pack ']' | '(' chord ')' );
    public final BbParser.notas_return notas() throws RecognitionException {
        BbParser.notas_return retval = new BbParser.notas_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal88=null;
        Token char_literal90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        BbParser.nota_return nota87 =null;

        BbParser.pack_return pack89 =null;

        BbParser.chord_return chord92 =null;


        BbTree char_literal88_tree=null;
        BbTree char_literal90_tree=null;
        BbTree char_literal91_tree=null;
        BbTree char_literal93_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:6: ( nota | '[' pack ']' | '(' chord ')' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case NOTA:
            case NOTEID:
                {
                alt15=1;
                }
                break;
            case 61:
                {
                alt15=2;
                }
                break;
            case LP:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1099);
                    nota87=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota87.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:8: '[' pack ']'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal88=(Token)match(input,61,FOLLOW_61_in_notas1109); 
                    char_literal88_tree = 
                    (BbTree)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);


                    pushFollow(FOLLOW_pack_in_notas1111);
                    pack89=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack89.getTree());

                    char_literal90=(Token)match(input,62,FOLLOW_62_in_notas1113); 
                    char_literal90_tree = 
                    (BbTree)adaptor.create(char_literal90)
                    ;
                    adaptor.addChild(root_0, char_literal90_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:120:8: '(' chord ')'
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal91=(Token)match(input,LP,FOLLOW_LP_in_notas1122); 
                    char_literal91_tree = 
                    (BbTree)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);


                    pushFollow(FOLLOW_chord_in_notas1124);
                    chord92=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord92.getTree());

                    char_literal93=(Token)match(input,RP,FOLLOW_RP_in_notas1126); 
                    char_literal93_tree = 
                    (BbTree)adaptor.create(char_literal93)
                    ;
                    adaptor.addChild(root_0, char_literal93_tree);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:1: nota : ( NOTA | NOTEID ( PLUS num_expr )? );
    public final BbParser.nota_return nota() throws RecognitionException {
        BbParser.nota_return retval = new BbParser.nota_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTA94=null;
        Token NOTEID95=null;
        Token PLUS96=null;
        BbParser.num_expr_return num_expr97 =null;


        BbTree NOTA94_tree=null;
        BbTree NOTEID95_tree=null;
        BbTree PLUS96_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:5: ( NOTA | NOTEID ( PLUS num_expr )? )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NOTA) ) {
                alt17=1;
            }
            else if ( (LA17_0==NOTEID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:123:7: NOTA
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTA94=(Token)match(input,NOTA,FOLLOW_NOTA_in_nota1144); 
                    NOTA94_tree = 
                    (BbTree)adaptor.create(NOTA94)
                    ;
                    adaptor.addChild(root_0, NOTA94_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:4: NOTEID ( PLUS num_expr )?
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID95=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1149); 
                    NOTEID95_tree = 
                    (BbTree)adaptor.create(NOTEID95)
                    ;
                    adaptor.addChild(root_0, NOTEID95_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:11: ( PLUS num_expr )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==PLUS) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:124:12: PLUS num_expr
                            {
                            PLUS96=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1152); 
                            PLUS96_tree = 
                            (BbTree)adaptor.create(PLUS96)
                            ;
                            adaptor.addChild(root_0, PLUS96_tree);


                            pushFollow(FOLLOW_num_expr_in_nota1154);
                            num_expr97=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr97.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:1: chord : sub_chord -> ^( CHORD sub_chord ) ;
    public final BbParser.chord_return chord() throws RecognitionException {
        BbParser.chord_return retval = new BbParser.chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord98 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1168);
            sub_chord98=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord98.getTree());

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
            // 128:18: -> ^( CHORD sub_chord )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:21: ^( CHORD sub_chord )
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:1: sub_chord : nota ( ',' ( nota ) )* ;
    public final BbParser.sub_chord_return sub_chord() throws RecognitionException {
        BbParser.sub_chord_return retval = new BbParser.sub_chord_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal100=null;
        BbParser.nota_return nota99 =null;

        BbParser.nota_return nota101 =null;


        BbTree char_literal100_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:10: ( nota ( ',' ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:12: nota ( ',' ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1186);
            nota99=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota99.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:17: ( ',' ( nota ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==52) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:19: ',' ( nota )
            	    {
            	    char_literal100=(Token)match(input,52,FOLLOW_52_in_sub_chord1190); 
            	    char_literal100_tree = 
            	    (BbTree)adaptor.create(char_literal100)
            	    ;
            	    adaptor.addChild(root_0, char_literal100_tree);


            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:23: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:131:24: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1193);
            	    nota101=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota101.getTree());

            	    }


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
    // $ANTLR end "sub_chord"


    public static class pack_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pack"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:134:1: pack : sub_pack -> ^( PACK sub_pack ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_pack_return sub_pack102 =null;


        RewriteRuleSubtreeStream stream_sub_pack=new RewriteRuleSubtreeStream(adaptor,"rule sub_pack");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:134:5: ( sub_pack -> ^( PACK sub_pack ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:134:7: sub_pack
            {
            pushFollow(FOLLOW_sub_pack_in_pack1206);
            sub_pack102=sub_pack();

            state._fsp--;

            stream_sub_pack.add(sub_pack102.getTree());

            // AST REWRITE
            // elements: sub_pack
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 134:16: -> ^( PACK sub_pack )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:134:19: ^( PACK sub_pack )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(PACK, "PACK")
                , root_1);

                adaptor.addChild(root_1, stream_sub_pack.nextTree());

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


    public static class sub_pack_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sub_pack"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:1: sub_pack : ( nota )+ ;
    public final BbParser.sub_pack_return sub_pack() throws RecognitionException {
        BbParser.sub_pack_return retval = new BbParser.sub_pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.nota_return nota103 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:9: ( ( nota )+ )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:11: ( nota )+
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:11: ( nota )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==NOTA||LA19_0==NOTEID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:11: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_pack1224);
            	    nota103=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota103.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // $ANTLR end "sub_pack"


    public static class duration_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "duration"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:1: duration : ( INT | '(' ! num_expr ')' !);
    public final BbParser.duration_return duration() throws RecognitionException {
        BbParser.duration_return retval = new BbParser.duration_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token INT104=null;
        Token char_literal105=null;
        Token char_literal107=null;
        BbParser.num_expr_return num_expr106 =null;


        BbTree INT104_tree=null;
        BbTree char_literal105_tree=null;
        BbTree char_literal107_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:9: ( INT | '(' ! num_expr ')' !)
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT104=(Token)match(input,INT,FOLLOW_INT_in_duration1235); 
                    INT104_tree = 
                    (BbTree)adaptor.create(INT104)
                    ;
                    adaptor.addChild(root_0, INT104_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:141:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal105=(Token)match(input,LP,FOLLOW_LP_in_duration1244); 

                    pushFollow(FOLLOW_num_expr_in_duration1247);
                    num_expr106=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr106.getTree());

                    char_literal107=(Token)match(input,RP,FOLLOW_RP_in_duration1249); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:1: polifon : 'Poli' ID LB ! ( VOICE ID ( melodia '|' !) )* RB !;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal108=null;
        Token ID109=null;
        Token LB110=null;
        Token VOICE111=null;
        Token ID112=null;
        Token char_literal114=null;
        Token RB115=null;
        BbParser.melodia_return melodia113 =null;


        BbTree string_literal108_tree=null;
        BbTree ID109_tree=null;
        BbTree LB110_tree=null;
        BbTree VOICE111_tree=null;
        BbTree ID112_tree=null;
        BbTree char_literal114_tree=null;
        BbTree RB115_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:9: ( 'Poli' ID LB ! ( VOICE ID ( melodia '|' !) )* RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:11: 'Poli' ID LB ! ( VOICE ID ( melodia '|' !) )* RB !
            {
            root_0 = (BbTree)adaptor.nil();


            string_literal108=(Token)match(input,59,FOLLOW_59_in_polifon1263); 
            string_literal108_tree = 
            (BbTree)adaptor.create(string_literal108)
            ;
            adaptor.addChild(root_0, string_literal108_tree);


            ID109=(Token)match(input,ID,FOLLOW_ID_in_polifon1265); 
            ID109_tree = 
            (BbTree)adaptor.create(ID109)
            ;
            adaptor.addChild(root_0, ID109_tree);


            LB110=(Token)match(input,LB,FOLLOW_LB_in_polifon1267); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:25: ( VOICE ID ( melodia '|' !) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VOICE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:26: VOICE ID ( melodia '|' !)
            	    {
            	    VOICE111=(Token)match(input,VOICE,FOLLOW_VOICE_in_polifon1271); 
            	    VOICE111_tree = 
            	    (BbTree)adaptor.create(VOICE111)
            	    ;
            	    adaptor.addChild(root_0, VOICE111_tree);


            	    ID112=(Token)match(input,ID,FOLLOW_ID_in_polifon1273); 
            	    ID112_tree = 
            	    (BbTree)adaptor.create(ID112)
            	    ;
            	    adaptor.addChild(root_0, ID112_tree);


            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:35: ( melodia '|' !)
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:144:36: melodia '|' !
            	    {
            	    pushFollow(FOLLOW_melodia_in_polifon1276);
            	    melodia113=melodia();

            	    state._fsp--;

            	    adaptor.addChild(root_0, melodia113.getTree());

            	    char_literal114=(Token)match(input,65,FOLLOW_65_in_polifon1278); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            RB115=(Token)match(input,RB,FOLLOW_RB_in_polifon1284); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:1: speed : 'Speed' n_expr ;
    public final BbParser.speed_return speed() throws RecognitionException {
        BbParser.speed_return retval = new BbParser.speed_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal116=null;
        BbParser.n_expr_return n_expr117 =null;


        BbTree string_literal116_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:7: ( 'Speed' n_expr )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:9: 'Speed' n_expr
            {
            root_0 = (BbTree)adaptor.nil();


            string_literal116=(Token)match(input,60,FOLLOW_60_in_speed1302); 
            string_literal116_tree = 
            (BbTree)adaptor.create(string_literal116)
            ;
            adaptor.addChild(root_0, string_literal116_tree);


            pushFollow(FOLLOW_n_expr_in_speed1304);
            n_expr117=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr117.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:150:1: expr : ( playable | n_expr );
    public final BbParser.expr_return expr() throws RecognitionException {
        BbParser.expr_return retval = new BbParser.expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.playable_return playable118 =null;

        BbParser.n_expr_return n_expr119 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:150:9: ( playable | n_expr )
            int alt22=2;
            switch ( input.LA(1) ) {
            case NOTA:
            case NOTEID:
            case 59:
            case 61:
                {
                alt22=1;
                }
                break;
            case LP:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==NOTA||LA22_2==NOTEID) ) {
                    alt22=1;
                }
                else if ( (LA22_2==FALSE||LA22_2==ID||LA22_2==INT||LA22_2==LP||LA22_2==MINUS||LA22_2==NOT||LA22_2==PLUS||LA22_2==TRUE) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

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
                alt22=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:150:11: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_expr1316);
                    playable118=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable118.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:5: n_expr
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_n_expr_in_expr1322);
                    n_expr119=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr119.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:1: n_expr : boolterm ( OR ^ boolterm )* ;
    public final BbParser.n_expr_return n_expr() throws RecognitionException {
        BbParser.n_expr_return retval = new BbParser.n_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token OR121=null;
        BbParser.boolterm_return boolterm120 =null;

        BbParser.boolterm_return boolterm122 =null;


        BbTree OR121_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:8: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:10: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_n_expr1339);
            boolterm120=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm120.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:19: ( OR ^ boolterm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:20: OR ^ boolterm
            	    {
            	    OR121=(Token)match(input,OR,FOLLOW_OR_in_n_expr1342); 
            	    OR121_tree = 
            	    (BbTree)adaptor.create(OR121)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR121_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_n_expr1345);
            	    boolterm122=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm122.getTree());

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
    // $ANTLR end "n_expr"


    public static class boolterm_return extends ParserRuleReturnScope {
        BbTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final BbParser.boolterm_return boolterm() throws RecognitionException {
        BbParser.boolterm_return retval = new BbParser.boolterm_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token AND124=null;
        BbParser.boolfact_return boolfact123 =null;

        BbParser.boolfact_return boolfact125 =null;


        BbTree AND124_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1356);
            boolfact123=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact123.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:22: ( AND ^ boolfact )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:23: AND ^ boolfact
            	    {
            	    AND124=(Token)match(input,AND,FOLLOW_AND_in_boolterm1359); 
            	    AND124_tree = 
            	    (BbTree)adaptor.create(AND124)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND124_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1362);
            	    boolfact125=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact125.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:1: boolfact : num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? ;
    public final BbParser.boolfact_return boolfact() throws RecognitionException {
        BbParser.boolfact_return retval = new BbParser.boolfact_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token EQ127=null;
        Token NEQ128=null;
        Token LT129=null;
        Token LE130=null;
        Token GT131=null;
        Token GE132=null;
        BbParser.num_expr_return num_expr126 =null;

        BbParser.num_expr_return num_expr133 =null;


        BbTree EQ127_tree=null;
        BbTree NEQ128_tree=null;
        BbTree LT129_tree=null;
        BbTree LE130_tree=null;
        BbTree GT131_tree=null;
        BbTree GE132_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1382);
            num_expr126=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr126.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQ||(LA26_0 >= GE && LA26_0 <= GT)||LA26_0==LE||LA26_0==LT||LA26_0==NEQ) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:24: EQ ^
                            {
                            EQ127=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1386); 
                            EQ127_tree = 
                            (BbTree)adaptor.create(EQ127)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ127_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:30: NEQ ^
                            {
                            NEQ128=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1391); 
                            NEQ128_tree = 
                            (BbTree)adaptor.create(NEQ128)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ128_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:37: LT ^
                            {
                            LT129=(Token)match(input,LT,FOLLOW_LT_in_boolfact1396); 
                            LT129_tree = 
                            (BbTree)adaptor.create(LT129)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT129_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:43: LE ^
                            {
                            LE130=(Token)match(input,LE,FOLLOW_LE_in_boolfact1401); 
                            LE130_tree = 
                            (BbTree)adaptor.create(LE130)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE130_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:49: GT ^
                            {
                            GT131=(Token)match(input,GT,FOLLOW_GT_in_boolfact1406); 
                            GT131_tree = 
                            (BbTree)adaptor.create(GT131)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT131_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:55: GE ^
                            {
                            GE132=(Token)match(input,GE,FOLLOW_GE_in_boolfact1411); 
                            GE132_tree = 
                            (BbTree)adaptor.create(GE132)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE132_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1415);
                    num_expr133=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr133.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:1: num_expr : term ( ( PLUS ^| MINUS ^) term )* ;
    public final BbParser.num_expr_return num_expr() throws RecognitionException {
        BbParser.num_expr_return retval = new BbParser.num_expr_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token PLUS135=null;
        Token MINUS136=null;
        BbParser.term_return term134 =null;

        BbParser.term_return term137 =null;


        BbTree PLUS135_tree=null;
        BbTree MINUS136_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1435);
            term134=term();

            state._fsp--;

            adaptor.addChild(root_0, term134.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:18: ( ( PLUS ^| MINUS ^) term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS||LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:20: ( PLUS ^| MINUS ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:21: PLUS ^
            	            {
            	            PLUS135=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1440); 
            	            PLUS135_tree = 
            	            (BbTree)adaptor.create(PLUS135)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS135_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:162:29: MINUS ^
            	            {
            	            MINUS136=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1445); 
            	            MINUS136_tree = 
            	            (BbTree)adaptor.create(MINUS136)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS136_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1449);
            	    term137=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term137.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:1: term : factor ( ( MUL ^| DIV ^| MOD ^) factor )* ;
    public final BbParser.term_return term() throws RecognitionException {
        BbParser.term_return retval = new BbParser.term_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token MUL139=null;
        Token DIV140=null;
        Token MOD141=null;
        BbParser.factor_return factor138 =null;

        BbParser.factor_return factor142 =null;


        BbTree MUL139_tree=null;
        BbTree DIV140_tree=null;
        BbTree MOD141_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1473);
            factor138=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor138.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DIV||(LA30_0 >= MOD && LA30_0 <= MUL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:23: MUL ^
            	            {
            	            MUL139=(Token)match(input,MUL,FOLLOW_MUL_in_term1478); 
            	            MUL139_tree = 
            	            (BbTree)adaptor.create(MUL139)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL139_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:30: DIV ^
            	            {
            	            DIV140=(Token)match(input,DIV,FOLLOW_DIV_in_term1483); 
            	            DIV140_tree = 
            	            (BbTree)adaptor.create(DIV140)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV140_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:37: MOD ^
            	            {
            	            MOD141=(Token)match(input,MOD,FOLLOW_MOD_in_term1488); 
            	            MOD141_tree = 
            	            (BbTree)adaptor.create(MOD141)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD141_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1493);
            	    factor142=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor142.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:1: factor : ( NOT ^| PLUS ^| MINUS ^)? atom ;
    public final BbParser.factor_return factor() throws RecognitionException {
        BbParser.factor_return retval = new BbParser.factor_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOT143=null;
        Token PLUS144=null;
        Token MINUS145=null;
        BbParser.atom_return atom146 =null;


        BbTree NOT143_tree=null;
        BbTree PLUS144_tree=null;
        BbTree MINUS145_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:13: ( NOT ^| PLUS ^| MINUS ^)?
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:14: NOT ^
                    {
                    NOT143=(Token)match(input,NOT,FOLLOW_NOT_in_factor1516); 
                    NOT143_tree = 
                    (BbTree)adaptor.create(NOT143)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT143_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:21: PLUS ^
                    {
                    PLUS144=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1521); 
                    PLUS144_tree = 
                    (BbTree)adaptor.create(PLUS144)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS144_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:29: MINUS ^
                    {
                    MINUS145=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1526); 
                    MINUS145_tree = 
                    (BbTree)adaptor.create(MINUS145)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS145_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1531);
            atom146=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom146.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:1: atom : ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! n_expr ')' !);
    public final BbParser.atom_return atom() throws RecognitionException {
        BbParser.atom_return retval = new BbParser.atom_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token b=null;
        Token ID147=null;
        Token INT148=null;
        Token char_literal150=null;
        Token char_literal152=null;
        BbParser.funcall_return funcall149 =null;

        BbParser.n_expr_return n_expr151 =null;


        BbTree b_tree=null;
        BbTree ID147_tree=null;
        BbTree INT148_tree=null;
        BbTree char_literal150_tree=null;
        BbTree char_literal152_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! n_expr ')' !)
            int alt33=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LP) ) {
                    alt33=4;
                }
                else if ( (LA33_1==AND||(LA33_1 >= DIV && LA33_1 <= EQ)||(LA33_1 >= GE && LA33_1 <= GT)||LA33_1==LE||(LA33_1 >= LT && LA33_1 <= NEQ)||LA33_1==NOTA||(LA33_1 >= NOTEID && LA33_1 <= OR)||LA33_1==PLUS||LA33_1==RB||LA33_1==RP||(LA33_1 >= 52 && LA33_1 <= 54)||LA33_1==62) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID147=(Token)match(input,ID,FOLLOW_ID_in_atom1556); 
                    ID147_tree = 
                    (BbTree)adaptor.create(ID147)
                    ;
                    adaptor.addChild(root_0, ID147_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:175:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT148=(Token)match(input,INT,FOLLOW_INT_in_atom1570); 
                    INT148_tree = 
                    (BbTree)adaptor.create(INT148)
                    ;
                    adaptor.addChild(root_0, INT148_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:13: (b= TRUE |b= FALSE )
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1587);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1593);  
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
                    // 176:33: -> ^( BOOLEAN[$b,$b.text] )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:176:36: ^( BOOLEAN[$b,$b.text] )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:11: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_atom1614);
                    funcall149=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall149.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:178:13: '(' ! n_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal150=(Token)match(input,LP,FOLLOW_LP_in_atom1628); 

                    pushFollow(FOLLOW_n_expr_in_atom1631);
                    n_expr151=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr151.getTree());

                    char_literal152=(Token)match(input,RP,FOLLOW_RP_in_atom1633); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:1: funcall : ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) ;
    public final BbParser.funcall_return funcall() throws RecognitionException {
        BbParser.funcall_return retval = new BbParser.funcall_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token ID153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        BbParser.expr_list_return expr_list155 =null;


        BbTree ID153_tree=null;
        BbTree char_literal154_tree=null;
        BbTree char_literal156_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:13: ID '(' ( expr_list )? ')'
            {
            ID153=(Token)match(input,ID,FOLLOW_ID_in_funcall1653);  
            stream_ID.add(ID153);


            char_literal154=(Token)match(input,LP,FOLLOW_LP_in_funcall1655);  
            stream_LP.add(char_literal154);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:20: ( expr_list )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==FALSE||LA34_0==ID||LA34_0==INT||LA34_0==LP||LA34_0==MINUS||(LA34_0 >= NOT && LA34_0 <= NOTA)||LA34_0==NOTEID||LA34_0==PLUS||LA34_0==TRUE||LA34_0==59||LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1657);
                    expr_list155=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list155.getTree());

                    }
                    break;

            }


            char_literal156=(Token)match(input,RP,FOLLOW_RP_in_funcall1660);  
            stream_RP.add(char_literal156);


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
            // 181:35: -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:38: ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(FUNCALL, "FUNCALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:51: ^( ARGLIST ( expr_list )? )
                {
                BbTree root_2 = (BbTree)adaptor.nil();
                root_2 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_2);

                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:181:61: ( expr_list )?
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:1: expr_list : expr ( ',' ! expr )* ;
    public final BbParser.expr_list_return expr_list() throws RecognitionException {
        BbParser.expr_list_return retval = new BbParser.expr_list_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token char_literal158=null;
        BbParser.expr_return expr157 =null;

        BbParser.expr_return expr159 =null;


        BbTree char_literal158_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1693);
            expr157=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr157.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:18: ( ',' ! expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:19: ',' ! expr
            	    {
            	    char_literal158=(Token)match(input,52,FOLLOW_52_in_expr_list1696); 

            	    pushFollow(FOLLOW_expr_in_expr_list1699);
            	    expr159=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr159.getTree());

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

    // Delegated rules


 

    public static final BitSet FOLLOW_func_in_prog181 = new BitSet(new long[]{0x8780000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_EOF_in_prog184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_func215 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_notetype_in_func219 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_func222 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_params_in_func225 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LB_in_func227 = new BitSet(new long[]{0xBFC4202808308000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_func230 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RB_in_func232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_params252 = new BitSet(new long[]{0x8780400000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_paramlist_in_params254 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_params257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramlist283 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_paramlist286 = new BitSet(new long[]{0x8780000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_param_in_paramlist289 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_type_in_param314 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_param316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_param330 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NOTEID_in_param332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions376 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_block_instructions379 = new BitSet(new long[]{0xBFC4202808308000L,0x0000000000000001L});
    public static final BitSet FOLLOW_instruction_in_block_instructions381 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign635 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_assign637 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQ_in_assign641 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_n_expr_in_assign643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_assign662 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_NOTEID_in_assign664 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_EQ_in_assign668 = new BitSet(new long[]{0x0E80000000000000L});
    public static final BitSet FOLLOW_musicnotation_in_assign670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_musicnotation807 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation809 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_NOTA_in_musicnotation811 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_musicnotation821 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation823 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation825 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_musicnotation835 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation837 = new BitSet(new long[]{0x2000002808000000L});
    public static final BitSet FOLLOW_melodia_in_musicnotation839 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt869 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt872 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_n_expr_in_ite_stmt875 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt877 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt880 = new BitSet(new long[]{0xBFC4202808308000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt883 = new BitSet(new long[]{0x0000100000000800L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt886 = new BitSet(new long[]{0xBFC4202808308000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt889 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt919 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt922 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_n_expr_in_while_stmt925 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt927 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LB_in_while_stmt930 = new BitSet(new long[]{0xBFC4202808308000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt933 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt973 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt976 = new BitSet(new long[]{0x8780000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assign_in_for_stmt979 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_for_stmt981 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_n_expr_in_for_stmt983 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_for_stmt985 = new BitSet(new long[]{0x8780000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_assign_in_for_stmt987 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt989 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LB_in_for_stmt992 = new BitSet(new long[]{0xBFC4202808308000L,0x0000000000000001L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt995 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1022 = new BitSet(new long[]{0x2801022C28504002L});
    public static final BitSet FOLLOW_expr_in_return_stmt1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notas_in_melodia1072 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_melodia1074 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_duration_in_melodia1076 = new BitSet(new long[]{0x2000002888000002L});
    public static final BitSet FOLLOW_MUL_in_melodia1079 = new BitSet(new long[]{0x2000002808000002L});
    public static final BitSet FOLLOW_nota_in_notas1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_notas1109 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_pack_in_notas1111 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_notas1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1122 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_chord_in_notas1124 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_notas1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTA_in_nota1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1149 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_PLUS_in_nota1152 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_num_expr_in_nota1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1186 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_sub_chord1190 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1193 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_sub_pack_in_pack1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_pack1224 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_INT_in_duration1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1244 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_num_expr_in_duration1247 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_duration1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_polifon1263 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_polifon1265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_LB_in_polifon1267 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_VOICE_in_polifon1271 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ID_in_polifon1273 = new BitSet(new long[]{0x2000002808000000L});
    public static final BitSet FOLLOW_melodia_in_polifon1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_polifon1278 = new BitSet(new long[]{0x0002100000000000L});
    public static final BitSet FOLLOW_RB_in_polifon1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_speed1302 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_n_expr_in_speed1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_expr1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_n_expr_in_expr1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1339 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_OR_in_n_expr1342 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1345 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1356 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AND_in_boolterm1359 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1362 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1382 = new BitSet(new long[]{0x00000001110C1002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1386 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1391 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_LT_in_boolfact1396 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_LE_in_boolfact1401 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_GT_in_boolfact1406 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_GE_in_boolfact1411 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1435 = new BitSet(new long[]{0x0000020020000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1440 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1445 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_term_in_num_expr1449 = new BitSet(new long[]{0x0000020020000002L});
    public static final BitSet FOLLOW_factor_in_term1473 = new BitSet(new long[]{0x00000000C0000402L});
    public static final BitSet FOLLOW_MUL_in_term1478 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_DIV_in_term1483 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_MOD_in_term1488 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_factor_in_term1493 = new BitSet(new long[]{0x00000000C0000402L});
    public static final BitSet FOLLOW_NOT_in_factor1516 = new BitSet(new long[]{0x0001000008504000L});
    public static final BitSet FOLLOW_PLUS_in_factor1521 = new BitSet(new long[]{0x0001000008504000L});
    public static final BitSet FOLLOW_MINUS_in_factor1526 = new BitSet(new long[]{0x0001000008504000L});
    public static final BitSet FOLLOW_atom_in_factor1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1628 = new BitSet(new long[]{0x0001020428504000L});
    public static final BitSet FOLLOW_n_expr_in_atom1631 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_atom1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1653 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_LP_in_funcall1655 = new BitSet(new long[]{0x2801422C28504000L});
    public static final BitSet FOLLOW_expr_list_in_funcall1657 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1693 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_expr_list1696 = new BitSet(new long[]{0x2801022C28504000L});
    public static final BitSet FOLLOW_expr_in_expr_list1699 = new BitSet(new long[]{0x0010000000000002L});

}