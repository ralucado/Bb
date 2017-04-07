// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 22:13:23

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

                if ( (LA7_2==NOTEID) ) {
                    int LA7_11 = input.LA(3);

                    if ( (LA7_11==LB) ) {
                        alt7=7;
                    }
                    else if ( (LA7_11==EQ) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 11, input);

                        throw nvae;

                    }
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:1: musicnotation : ( 'Note' notabasica ( '.' num_expr )? -> ^( NOTE notabasica ( num_expr )? ) | 'Chord' ! '(' ! chord ')' !| 'Melody' ! '(' ! melodia ')' !| polifon | NOTEID );
    public final BbParser.musicnotation_return musicnotation() throws RecognitionException {
        BbParser.musicnotation_return retval = new BbParser.musicnotation_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal40=null;
        Token char_literal42=null;
        Token string_literal44=null;
        Token char_literal45=null;
        Token char_literal47=null;
        Token string_literal48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        Token NOTEID53=null;
        BbParser.notabasica_return notabasica41 =null;

        BbParser.num_expr_return num_expr43 =null;

        BbParser.chord_return chord46 =null;

        BbParser.melodia_return melodia50 =null;

        BbParser.polifon_return polifon52 =null;


        BbTree string_literal40_tree=null;
        BbTree char_literal42_tree=null;
        BbTree string_literal44_tree=null;
        BbTree char_literal45_tree=null;
        BbTree char_literal47_tree=null;
        BbTree string_literal48_tree=null;
        BbTree char_literal49_tree=null;
        BbTree char_literal51_tree=null;
        BbTree NOTEID53_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        RewriteRuleSubtreeStream stream_num_expr=new RewriteRuleSubtreeStream(adaptor,"rule num_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:15: ( 'Note' notabasica ( '.' num_expr )? -> ^( NOTE notabasica ( num_expr )? ) | 'Chord' ! '(' ! chord ')' !| 'Melody' ! '(' ! melodia ')' !| polifon | NOTEID )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt10=1;
                }
                break;
            case 61:
                {
                alt10=2;
                }
                break;
            case 62:
                {
                alt10=3;
                }
                break;
            case 64:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:17: 'Note' notabasica ( '.' num_expr )?
                    {
                    string_literal40=(Token)match(input,63,FOLLOW_63_in_musicnotation832);  
                    stream_63.add(string_literal40);


                    pushFollow(FOLLOW_notabasica_in_musicnotation834);
                    notabasica41=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica41.getTree());

                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:35: ( '.' num_expr )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==59) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:36: '.' num_expr
                            {
                            char_literal42=(Token)match(input,59,FOLLOW_59_in_musicnotation837);  
                            stream_59.add(char_literal42);


                            pushFollow(FOLLOW_num_expr_in_musicnotation839);
                            num_expr43=num_expr();

                            state._fsp--;

                            stream_num_expr.add(num_expr43.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: num_expr, notabasica
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BbTree)adaptor.nil();
                    // 92:51: -> ^( NOTE notabasica ( num_expr )? )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:54: ^( NOTE notabasica ( num_expr )? )
                        {
                        BbTree root_1 = (BbTree)adaptor.nil();
                        root_1 = (BbTree)adaptor.becomeRoot(
                        (BbTree)adaptor.create(NOTE, "NOTE")
                        , root_1);

                        adaptor.addChild(root_1, stream_notabasica.nextTree());

                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:72: ( num_expr )?
                        if ( stream_num_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_num_expr.nextTree());

                        }
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


                    string_literal44=(Token)match(input,61,FOLLOW_61_in_musicnotation862); 

                    char_literal45=(Token)match(input,LP,FOLLOW_LP_in_musicnotation865); 

                    pushFollow(FOLLOW_chord_in_musicnotation868);
                    chord46=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord46.getTree());

                    char_literal47=(Token)match(input,RP,FOLLOW_RP_in_musicnotation870); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:7: 'Melody' ! '(' ! melodia ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal48=(Token)match(input,62,FOLLOW_62_in_musicnotation879); 

                    char_literal49=(Token)match(input,LP,FOLLOW_LP_in_musicnotation882); 

                    pushFollow(FOLLOW_melodia_in_musicnotation885);
                    melodia50=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia50.getTree());

                    char_literal51=(Token)match(input,RP,FOLLOW_RP_in_musicnotation887); 

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation896);
                    polifon52=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon52.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID53=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation904); 
                    NOTEID53_tree = 
                    (BbTree)adaptor.create(NOTEID53)
                    ;
                    adaptor.addChild(root_0, NOTEID53_tree);


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

        Token IF54=null;
        Token LP55=null;
        Token RP57=null;
        Token LB58=null;
        Token ELSE60=null;
        Token RB62=null;
        BbParser.n_expr_return n_expr56 =null;

        BbParser.block_instructions_return block_instructions59 =null;

        BbParser.block_instructions_return block_instructions61 =null;


        BbTree IF54_tree=null;
        BbTree LP55_tree=null;
        BbTree RP57_tree=null;
        BbTree LB58_tree=null;
        BbTree ELSE60_tree=null;
        BbTree RB62_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:13: ( IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:17: IF ^ LP ! n_expr RP ! LB ! block_instructions ( ELSE ! block_instructions )? RB !
            {
            root_0 = (BbTree)adaptor.nil();


            IF54=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt924); 
            IF54_tree = 
            (BbTree)adaptor.create(IF54)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF54_tree, root_0);


            LP55=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt927); 

            pushFollow(FOLLOW_n_expr_in_ite_stmt930);
            n_expr56=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr56.getTree());

            RP57=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt932); 

            LB58=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt935); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt938);
            block_instructions59=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions59.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:59: ( ELSE ! block_instructions )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:60: ELSE ! block_instructions
                    {
                    ELSE60=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt941); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt944);
                    block_instructions61=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions61.getTree());

                    }
                    break;

            }


            RB62=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt948); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token WHILE63=null;
        Token LP64=null;
        Token RP66=null;
        Token LB67=null;
        Token RB69=null;
        BbParser.n_expr_return n_expr65 =null;

        BbParser.block_instructions_return block_instructions68 =null;


        BbTree WHILE63_tree=null;
        BbTree LP64_tree=null;
        BbTree RP66_tree=null;
        BbTree LB67_tree=null;
        BbTree RB69_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:13: ( WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:17: WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE63=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt974); 
            WHILE63_tree = 
            (BbTree)adaptor.create(WHILE63)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE63_tree, root_0);


            LP64=(Token)match(input,LP,FOLLOW_LP_in_while_stmt977); 

            pushFollow(FOLLOW_n_expr_in_while_stmt980);
            n_expr65=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr65.getTree());

            RP66=(Token)match(input,RP,FOLLOW_RP_in_while_stmt982); 

            LB67=(Token)match(input,LB,FOLLOW_LB_in_while_stmt985); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt988);
            block_instructions68=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions68.getTree());

            RB69=(Token)match(input,RB,FOLLOW_RB_in_while_stmt990); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token FOR70=null;
        Token LP71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token RP77=null;
        Token LB78=null;
        Token RB80=null;
        BbParser.assign_return assign72 =null;

        BbParser.n_expr_return n_expr74 =null;

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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:11: ( FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:15: FOR ^ LP ! assign ';' n_expr ';' assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR70=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1028); 
            FOR70_tree = 
            (BbTree)adaptor.create(FOR70)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR70_tree, root_0);


            LP71=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1031); 

            pushFollow(FOLLOW_assign_in_for_stmt1034);
            assign72=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign72.getTree());

            char_literal73=(Token)match(input,60,FOLLOW_60_in_for_stmt1036); 
            char_literal73_tree = 
            (BbTree)adaptor.create(char_literal73)
            ;
            adaptor.addChild(root_0, char_literal73_tree);


            pushFollow(FOLLOW_n_expr_in_for_stmt1038);
            n_expr74=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr74.getTree());

            char_literal75=(Token)match(input,60,FOLLOW_60_in_for_stmt1040); 
            char_literal75_tree = 
            (BbTree)adaptor.create(char_literal75)
            ;
            adaptor.addChild(root_0, char_literal75_tree);


            pushFollow(FOLLOW_assign_in_for_stmt1042);
            assign76=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign76.getTree());

            RP77=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1044); 

            LB78=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1047); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1050);
            block_instructions79=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions79.getTree());

            RB80=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1052); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token RETURN81=null;
        BbParser.n_expr_return n_expr82 =null;

        BbParser.musicnotation_return musicnotation83 =null;


        BbTree RETURN81_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:13: ( RETURN ^ ( n_expr | musicnotation )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:17: RETURN ^ ( n_expr | musicnotation )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN81=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1077); 
            RETURN81_tree = 
            (BbTree)adaptor.create(RETURN81)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN81_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:25: ( n_expr | musicnotation )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==FALSE||LA12_0==ID||LA12_0==INT||LA12_0==LP||LA12_0==MINUS||LA12_0==NOT||LA12_0==PLUS||LA12_0==TRUE) ) {
                alt12=1;
            }
            else if ( (LA12_0==NOTEID||(LA12_0 >= 61 && LA12_0 <= 64)) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:26: n_expr
                    {
                    pushFollow(FOLLOW_n_expr_in_return_stmt1081);
                    n_expr82=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr82.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:35: musicnotation
                    {
                    pushFollow(FOLLOW_musicnotation_in_return_stmt1085);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:1: playable : ( melodia | polifon | NOTEID );
    public final BbParser.playable_return playable() throws RecognitionException {
        BbParser.playable_return retval = new BbParser.playable_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token NOTEID86=null;
        BbParser.melodia_return melodia84 =null;

        BbParser.polifon_return polifon85 =null;


        BbTree NOTEID86_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:9: ( melodia | polifon | NOTEID )
            int alt13=3;
            switch ( input.LA(1) ) {
            case LP:
            case PITCH:
            case 66:
                {
                alt13=1;
                }
                break;
            case NOTEID:
                {
                int LA13_2 = input.LA(2);

                if ( (LA13_2==LP||LA13_2==59) ) {
                    alt13=1;
                }
                else if ( (LA13_2==ELSE||LA13_2==RB||LA13_2==RP||LA13_2==58||LA13_2==60) ) {
                    alt13=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;

                }
                }
                break;
            case 64:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1104);
                    melodia84=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia84.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1116);
                    polifon85=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon85.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:11: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID86=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1128); 
                    NOTEID86_tree = 
                    (BbTree)adaptor.create(NOTEID86)
                    ;
                    adaptor.addChild(root_0, NOTEID86_tree);


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

        BbParser.notelist_return notelist87 =null;


        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:8: ( ( notelist )+ -> ^( MELODY ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: ( notelist )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: ( notelist )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==LP||LA14_0==NOTEID||LA14_0==PITCH||LA14_0==66) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1144);
            	    notelist87=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist87.getTree());

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

        Token char_literal89=null;
        Token MUL91=null;
        BbParser.notas_return notas88 =null;

        BbParser.duration_return duration90 =null;


        BbTree char_literal89_tree=null;
        BbTree MUL91_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1170);
            notas88=notas();

            state._fsp--;

            stream_notas.add(notas88.getTree());

            char_literal89=(Token)match(input,59,FOLLOW_59_in_notelist1172);  
            stream_59.add(char_literal89);


            pushFollow(FOLLOW_duration_in_notelist1174);
            duration90=duration();

            state._fsp--;

            stream_duration.add(duration90.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:30: ( MUL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==MUL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:30: MUL
                    {
                    MUL91=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1176);  
                    stream_MUL.add(MUL91);


                    }
                    break;

            }


            // AST REWRITE
            // elements: duration, notas, MUL
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

        Token char_literal93=null;
        Token char_literal95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        BbParser.nota_return nota92 =null;

        BbParser.pack_return pack94 =null;

        BbParser.chord_return chord97 =null;


        BbTree char_literal93_tree=null;
        BbTree char_literal95_tree=null;
        BbTree char_literal96_tree=null;
        BbTree char_literal98_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
            int alt16=3;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
                {
                alt16=1;
                }
                break;
            case 66:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1197);
                    nota92=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota92.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal93=(Token)match(input,66,FOLLOW_66_in_notas1206); 

                    pushFollow(FOLLOW_pack_in_notas1209);
                    pack94=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack94.getTree());

                    char_literal95=(Token)match(input,67,FOLLOW_67_in_notas1211); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal96=(Token)match(input,LP,FOLLOW_LP_in_notas1221); 

                    pushFollow(FOLLOW_chord_in_notas1224);
                    chord97=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord97.getTree());

                    char_literal98=(Token)match(input,RP,FOLLOW_RP_in_notas1226); 

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

        Token NOTEID100=null;
        Token char_literal101=null;
        Token PLUS102=null;
        Token char_literal104=null;
        BbParser.notabasica_return notabasica99 =null;

        BbParser.num_expr_return num_expr103 =null;


        BbTree NOTEID100_tree=null;
        BbTree char_literal101_tree=null;
        BbTree PLUS102_tree=null;
        BbTree char_literal104_tree=null;
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PITCH) ) {
                alt18=1;
            }
            else if ( (LA18_0==NOTEID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1245);
                    notabasica99=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica99.getTree());

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


                    NOTEID100=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1259); 
                    NOTEID100_tree = 
                    (BbTree)adaptor.create(NOTEID100)
                    ;
                    adaptor.addChild(root_0, NOTEID100_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==LP) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal101=(Token)match(input,LP,FOLLOW_LP_in_nota1263); 

                            PLUS102=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1266); 
                            PLUS102_tree = 
                            (BbTree)adaptor.create(PLUS102)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS102_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1269);
                            num_expr103=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr103.getTree());

                            char_literal104=(Token)match(input,RP,FOLLOW_RP_in_nota1271); 

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

        BbParser.sub_chord_return sub_chord105 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1286);
            sub_chord105=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord105.getTree());

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

        Token char_literal107=null;
        BbParser.nota_return nota106 =null;

        BbParser.nota_return nota108 =null;


        BbTree char_literal107_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1304);
            nota106=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota106.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:17: ( ',' ! ( nota ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==58) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:19: ',' ! ( nota )
            	    {
            	    char_literal107=(Token)match(input,58,FOLLOW_58_in_sub_chord1308); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1312);
            	    nota108=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota108.getTree());

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:1: pack : sub_chord -> ^( PACK sub_chord ) ;
    public final BbParser.pack_return pack() throws RecognitionException {
        BbParser.pack_return retval = new BbParser.pack_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        BbParser.sub_chord_return sub_chord109 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1325);
            sub_chord109=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord109.getTree());

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

        Token INT110=null;
        Token char_literal111=null;
        Token char_literal113=null;
        BbParser.num_expr_return num_expr112 =null;


        BbTree INT110_tree=null;
        BbTree char_literal111_tree=null;
        BbTree char_literal113_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:9: ( INT | '(' ! num_expr ')' !)
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT110=(Token)match(input,INT,FOLLOW_INT_in_duration1344); 
                    INT110_tree = 
                    (BbTree)adaptor.create(INT110)
                    ;
                    adaptor.addChild(root_0, INT110_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal111=(Token)match(input,LP,FOLLOW_LP_in_duration1353); 

                    pushFollow(FOLLOW_num_expr_in_duration1356);
                    num_expr112=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr112.getTree());

                    char_literal113=(Token)match(input,RP,FOLLOW_RP_in_duration1358); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:1: polifon : 'Poli' NOTEID LB ( voices )+ RB -> ^( POLIFONE NOTEID ( voices )+ ) ;
    public final BbParser.polifon_return polifon() throws RecognitionException {
        BbParser.polifon_return retval = new BbParser.polifon_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token string_literal114=null;
        Token NOTEID115=null;
        Token LB116=null;
        Token RB118=null;
        BbParser.voices_return voices117 =null;


        BbTree string_literal114_tree=null;
        BbTree NOTEID115_tree=null;
        BbTree LB116_tree=null;
        BbTree RB118_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_NOTEID=new RewriteRuleTokenStream(adaptor,"token NOTEID");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:9: ( 'Poli' NOTEID LB ( voices )+ RB -> ^( POLIFONE NOTEID ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:11: 'Poli' NOTEID LB ( voices )+ RB
            {
            string_literal114=(Token)match(input,64,FOLLOW_64_in_polifon1372);  
            stream_64.add(string_literal114);


            NOTEID115=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_polifon1374);  
            stream_NOTEID.add(NOTEID115);


            LB116=(Token)match(input,LB,FOLLOW_LB_in_polifon1376);  
            stream_LB.add(LB116);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:28: ( voices )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==VOICE) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:28: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1378);
            	    voices117=voices();

            	    state._fsp--;

            	    stream_voices.add(voices117.getTree());

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


            RB118=(Token)match(input,RB,FOLLOW_RB_in_polifon1381);  
            stream_RB.add(RB118);


            // AST REWRITE
            // elements: voices, NOTEID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BbTree)adaptor.nil();
            // 151:39: -> ^( POLIFONE NOTEID ( voices )+ )
            {
                // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:42: ^( POLIFONE NOTEID ( voices )+ )
                {
                BbTree root_1 = (BbTree)adaptor.nil();
                root_1 = (BbTree)adaptor.becomeRoot(
                (BbTree)adaptor.create(POLIFONE, "POLIFONE")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NOTEID.nextNode()
                );

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:1: voices : VOICE ^ NOTEID ( melodia '|' !) ;
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:7: ( VOICE ^ NOTEID ( melodia '|' !) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:9: VOICE ^ NOTEID ( melodia '|' !)
            {
            root_0 = (BbTree)adaptor.nil();


            VOICE119=(Token)match(input,VOICE,FOLLOW_VOICE_in_voices1416); 
            VOICE119_tree = 
            (BbTree)adaptor.create(VOICE119)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(VOICE119_tree, root_0);


            NOTEID120=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_voices1419); 
            NOTEID120_tree = 
            (BbTree)adaptor.create(NOTEID120)
            ;
            adaptor.addChild(root_0, NOTEID120_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:23: ( melodia '|' !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:24: melodia '|' !
            {
            pushFollow(FOLLOW_melodia_in_voices1422);
            melodia121=melodia();

            state._fsp--;

            adaptor.addChild(root_0, melodia121.getTree());

            char_literal122=(Token)match(input,70,FOLLOW_70_in_voices1424); 

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
            string_literal123=(Token)match(input,65,FOLLOW_65_in_speed1434);  
            stream_65.add(string_literal123);


            pushFollow(FOLLOW_n_expr_in_speed1436);
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
            int alt22=2;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
            case 64:
            case 66:
                {
                alt22=1;
                }
                break;
            case LP:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==NOTEID||LA22_2==PITCH) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:11: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_expr1456);
                    playable125=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable125.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:5: n_expr
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_n_expr_in_expr1462);
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


            pushFollow(FOLLOW_boolterm_in_n_expr1479);
            boolterm127=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm127.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:19: ( OR ^ boolterm )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==OR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:20: OR ^ boolterm
            	    {
            	    OR128=(Token)match(input,OR,FOLLOW_OR_in_n_expr1482); 
            	    OR128_tree = 
            	    (BbTree)adaptor.create(OR128)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR128_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_n_expr1485);
            	    boolterm129=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm129.getTree());

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


            pushFollow(FOLLOW_boolfact_in_boolterm1496);
            boolfact130=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact130.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:22: ( AND ^ boolfact )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==AND) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:23: AND ^ boolfact
            	    {
            	    AND131=(Token)match(input,AND,FOLLOW_AND_in_boolterm1499); 
            	    AND131_tree = 
            	    (BbTree)adaptor.create(AND131)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND131_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1502);
            	    boolfact132=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact132.getTree());

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


            pushFollow(FOLLOW_num_expr_in_boolfact1522);
            num_expr133=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr133.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==EQ||(LA26_0 >= GE && LA26_0 <= GT)||LA26_0==LE||LA26_0==LT||LA26_0==NEQ) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:24: EQ ^
                            {
                            EQ134=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1526); 
                            EQ134_tree = 
                            (BbTree)adaptor.create(EQ134)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ134_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:30: NEQ ^
                            {
                            NEQ135=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1531); 
                            NEQ135_tree = 
                            (BbTree)adaptor.create(NEQ135)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ135_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:37: LT ^
                            {
                            LT136=(Token)match(input,LT,FOLLOW_LT_in_boolfact1536); 
                            LT136_tree = 
                            (BbTree)adaptor.create(LT136)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT136_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:43: LE ^
                            {
                            LE137=(Token)match(input,LE,FOLLOW_LE_in_boolfact1541); 
                            LE137_tree = 
                            (BbTree)adaptor.create(LE137)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE137_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:49: GT ^
                            {
                            GT138=(Token)match(input,GT,FOLLOW_GT_in_boolfact1546); 
                            GT138_tree = 
                            (BbTree)adaptor.create(GT138)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT138_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:55: GE ^
                            {
                            GE139=(Token)match(input,GE,FOLLOW_GE_in_boolfact1551); 
                            GE139_tree = 
                            (BbTree)adaptor.create(GE139)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE139_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1555);
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


            pushFollow(FOLLOW_term_in_num_expr1575);
            term141=term();

            state._fsp--;

            adaptor.addChild(root_0, term141.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:18: ( ( PLUS ^| MINUS ^) term )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS||LA28_0==PLUS) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:20: ( PLUS ^| MINUS ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:21: PLUS ^
            	            {
            	            PLUS142=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1580); 
            	            PLUS142_tree = 
            	            (BbTree)adaptor.create(PLUS142)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS142_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:29: MINUS ^
            	            {
            	            MINUS143=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1585); 
            	            MINUS143_tree = 
            	            (BbTree)adaptor.create(MINUS143)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS143_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1589);
            	    term144=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term144.getTree());

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


            pushFollow(FOLLOW_factor_in_term1613);
            factor145=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor145.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DIV||(LA30_0 >= MOD && LA30_0 <= MUL)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:22: ( MUL ^| DIV ^| MOD ^)
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
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:23: MUL ^
            	            {
            	            MUL146=(Token)match(input,MUL,FOLLOW_MUL_in_term1618); 
            	            MUL146_tree = 
            	            (BbTree)adaptor.create(MUL146)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL146_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:30: DIV ^
            	            {
            	            DIV147=(Token)match(input,DIV,FOLLOW_DIV_in_term1623); 
            	            DIV147_tree = 
            	            (BbTree)adaptor.create(DIV147)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV147_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:37: MOD ^
            	            {
            	            MOD148=(Token)match(input,MOD,FOLLOW_MOD_in_term1628); 
            	            MOD148_tree = 
            	            (BbTree)adaptor.create(MOD148)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD148_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1633);
            	    factor149=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor149.getTree());

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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:14: NOT ^
                    {
                    NOT150=(Token)match(input,NOT,FOLLOW_NOT_in_factor1656); 
                    NOT150_tree = 
                    (BbTree)adaptor.create(NOT150)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT150_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:21: PLUS ^
                    {
                    PLUS151=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1661); 
                    PLUS151_tree = 
                    (BbTree)adaptor.create(PLUS151)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS151_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:29: MINUS ^
                    {
                    MINUS152=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1666); 
                    MINUS152_tree = 
                    (BbTree)adaptor.create(MINUS152)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS152_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1671);
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
            int alt33=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LP) ) {
                    alt33=4;
                }
                else if ( (LA33_1==AND||(LA33_1 >= DIV && LA33_1 <= EQ)||(LA33_1 >= GE && LA33_1 <= GT)||LA33_1==LE||LA33_1==LT||(LA33_1 >= MINUS && LA33_1 <= NEQ)||LA33_1==OR||LA33_1==PLUS||LA33_1==RB||LA33_1==RP||LA33_1==58||LA33_1==60) ) {
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID154=(Token)match(input,ID,FOLLOW_ID_in_atom1696); 
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


                    INT155=(Token)match(input,INT,FOLLOW_INT_in_atom1710); 
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1727);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1733);  
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


                    pushFollow(FOLLOW_funcall_in_atom1754);
                    funcall156=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall156.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:13: '(' ! n_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal157=(Token)match(input,LP,FOLLOW_LP_in_atom1768); 

                    pushFollow(FOLLOW_n_expr_in_atom1771);
                    n_expr158=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr158.getTree());

                    char_literal159=(Token)match(input,RP,FOLLOW_RP_in_atom1773); 

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
            ID160=(Token)match(input,ID,FOLLOW_ID_in_funcall1793);  
            stream_ID.add(ID160);


            char_literal161=(Token)match(input,LP,FOLLOW_LP_in_funcall1795);  
            stream_LP.add(char_literal161);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: ( expr_list )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==FALSE||LA34_0==ID||LA34_0==INT||LA34_0==LP||LA34_0==MINUS||LA34_0==NOT||LA34_0==NOTEID||LA34_0==PITCH||LA34_0==PLUS||LA34_0==TRUE||LA34_0==64||LA34_0==66) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1797);
                    expr_list162=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list162.getTree());

                    }
                    break;

            }


            char_literal163=(Token)match(input,RP,FOLLOW_RP_in_funcall1800);  
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


            pushFollow(FOLLOW_expr_in_expr_list1833);
            expr164=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr164.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:18: ( ',' ! expr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==58) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:19: ',' ! expr
            	    {
            	    char_literal165=(Token)match(input,58,FOLLOW_58_in_expr_list1836); 

            	    pushFollow(FOLLOW_expr_in_expr_list1839);
            	    expr166=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr166.getTree());

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


            PITCH167=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica1858); 
            PITCH167_tree = 
            (BbTree)adaptor.create(PITCH167)
            ;
            adaptor.addChild(root_0, PITCH167_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:20: ( ALT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ALT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:20: ALT
                    {
                    ALT168=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica1860); 
                    ALT168_tree = 
                    (BbTree)adaptor.create(ALT168)
                    ;
                    adaptor.addChild(root_0, ALT168_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:25: ( INT )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:25: INT
                    {
                    INT169=(Token)match(input,INT,FOLLOW_INT_in_notabasica1863); 
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
    public static final BitSet FOLLOW_num_expr_in_musicnotation839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_musicnotation862 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation865 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation868 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_musicnotation879 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation882 = new BitSet(new long[]{0x0000044010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_melodia_in_musicnotation885 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt924 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt927 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_ite_stmt930 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt932 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt935 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt938 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt941 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt944 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt974 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt977 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_while_stmt980 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt982 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt985 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt988 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1028 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1031 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_assign_in_for_stmt1034 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1036 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_for_stmt1038 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1040 = new BitSet(new long[]{0xE000000000000000L,0x0000000000000031L});
    public static final BitSet FOLLOW_assign_in_for_stmt1042 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1044 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1047 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1050 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1077 = new BitSet(new long[]{0xE040104890A08002L,0x0000000000000001L});
    public static final BitSet FOLLOW_n_expr_in_return_stmt1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_return_stmt1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_melodia1144 = new BitSet(new long[]{0x0000044010000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_notas_in_notelist1170 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_notelist1172 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_duration_in_notelist1174 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_notas1206 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_pack_in_notas1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_notas1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1221 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_chord_in_notas1224 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1259 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LP_in_nota1263 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1266 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_nota1269 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1304 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_sub_chord1308 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1312 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_pack1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1353 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_duration1356 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_polifon1372 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_polifon1374 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_polifon1376 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_voices_in_polifon1378 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_RB_in_polifon1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOICE_in_voices1416 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_voices1419 = new BitSet(new long[]{0x0000044010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_melodia_in_voices1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_voices1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_speed1434 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_speed1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_expr1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_n_expr_in_expr1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1479 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_n_expr1482 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1485 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1496 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1499 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1502 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1522 = new BitSet(new long[]{0x0000000422182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1526 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1531 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_LT_in_boolfact1536 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_LE_in_boolfact1541 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_GT_in_boolfact1546 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_GE_in_boolfact1551 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1575 = new BitSet(new long[]{0x0000100080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1580 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1585 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_term_in_num_expr1589 = new BitSet(new long[]{0x0000100080000002L});
    public static final BitSet FOLLOW_factor_in_term1613 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_MUL_in_term1618 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_DIV_in_term1623 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_MOD_in_term1628 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_factor_in_term1633 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_NOT_in_factor1656 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_PLUS_in_factor1661 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_MINUS_in_factor1666 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_atom_in_factor1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1768 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_atom1771 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1793 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_funcall1795 = new BitSet(new long[]{0x0048144890A08000L,0x0000000000000005L});
    public static final BitSet FOLLOW_expr_list_in_funcall1797 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1833 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_expr_list1836 = new BitSet(new long[]{0x0040144890A08000L,0x0000000000000005L});
    public static final BitSet FOLLOW_expr_in_expr_list1839 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_PITCH_in_notabasica1858 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_ALT_in_notabasica1860 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_INT_in_notabasica1863 = new BitSet(new long[]{0x0000000000000002L});

}