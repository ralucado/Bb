// $ANTLR 3.4 /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g 2017-04-07 23:39:20

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:1: param : ( type ^ ID | notetype ^ NOTEID );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:9: ( type ^ ID | notetype ^ NOTEID )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:55:13: type ^ ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_type_in_param349);
                    type16=type();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(type16.getTree(), root_0);

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_param352); 
                    ID17_tree = 
                    (BbTree)adaptor.create(ID17)
                    ;
                    adaptor.addChild(root_0, ID17_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:56:13: notetype ^ NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_notetype_in_param366);
                    notetype18=notetype();

                    state._fsp--;

                    root_0 = (BbTree)adaptor.becomeRoot(notetype18.getTree(), root_0);

                    NOTEID19=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_param369); 
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
            pushFollow(FOLLOW_instruction_in_block_instructions413);
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
            	    char_literal21=(Token)match(input,60,FOLLOW_60_in_block_instructions416);  
            	    stream_60.add(char_literal21);


            	    pushFollow(FOLLOW_instruction_in_block_instructions418);
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
            case 64:
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3==LB) ) {
                    alt7=7;
                }
                else if ( (LA7_3==NOTEID) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 3, input);

                    throw nvae;

                }
                }
                break;
            case NOTEID:
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4==EQ) ) {
                    alt7=1;
                }
                else if ( (LA7_4==LP||LA7_4==RB||(LA7_4 >= 59 && LA7_4 <= 60)) ) {
                    alt7=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 4, input);

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


                    pushFollow(FOLLOW_assign_in_instruction477);
                    assign23=assign();

                    state._fsp--;

                    adaptor.addChild(root_0, assign23.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:67:13: ite_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_ite_stmt_in_instruction501);
                    ite_stmt24=ite_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, ite_stmt24.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:68:13: while_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_while_stmt_in_instruction523);
                    while_stmt25=while_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, while_stmt25.getTree());

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:69:11: for_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_for_stmt_in_instruction541);
                    for_stmt26=for_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, for_stmt26.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:70:13: funcall
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_funcall_in_instruction557);
                    funcall27=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall27.getTree());

                    }
                    break;
                case 6 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:71:13: return_stmt
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_return_stmt_in_instruction580);
                    return_stmt28=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt28.getTree());

                    }
                    break;
                case 7 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:72:13: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_instruction599);
                    playable29=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable29.getTree());

                    }
                    break;
                case 8 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:73:11: speed
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_speed_in_instruction619);
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:1: assign : ( ( type )? ID eq= EQ n_expr -> ^( ASSIGN[$eq,\":=\"] ID n_expr ) | ( notetype )? NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) );
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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:9: ( ( type )? ID eq= EQ n_expr -> ^( ASSIGN[$eq,\":=\"] ID n_expr ) | ( notetype )? NOTEID EQ musicnotation -> ^( NOTEASSIGN NOTEID musicnotation ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0 >= 68 && LA10_0 <= 69)) ) {
                alt10=1;
            }
            else if ( (LA10_0==NOTEID||(LA10_0 >= 61 && LA10_0 <= 64)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:13: ( type )? ID eq= EQ n_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:13: ( type )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0 >= 68 && LA8_0 <= 69)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:14: type
                            {
                            pushFollow(FOLLOW_type_in_assign673);
                            type31=type();

                            state._fsp--;

                            stream_type.add(type31.getTree());

                            }
                            break;

                    }


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_assign677);  
                    stream_ID.add(ID32);


                    eq=(Token)match(input,EQ,FOLLOW_EQ_in_assign681);  
                    stream_EQ.add(eq);


                    pushFollow(FOLLOW_n_expr_in_assign683);
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
                    // 78:37: -> ^( ASSIGN[$eq,\":=\"] ID n_expr )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:78:40: ^( ASSIGN[$eq,\":=\"] ID n_expr )
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:5: ( notetype )? NOTEID EQ musicnotation
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:5: ( notetype )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0 >= 61 && LA9_0 <= 64)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:6: notetype
                            {
                            pushFollow(FOLLOW_notetype_in_assign701);
                            notetype34=notetype();

                            state._fsp--;

                            stream_notetype.add(notetype34.getTree());

                            }
                            break;

                    }


                    NOTEID35=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_assign705);  
                    stream_NOTEID.add(NOTEID35);


                    EQ36=(Token)match(input,EQ,FOLLOW_EQ_in_assign707);  
                    stream_EQ.add(EQ36);


                    pushFollow(FOLLOW_musicnotation_in_assign709);
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
                    // 79:41: -> ^( NOTEASSIGN NOTEID musicnotation )
                    {
                        // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:79:44: ^( NOTEASSIGN NOTEID musicnotation )
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
            int alt13=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt13=1;
                }
                break;
            case 61:
                {
                alt13=2;
                }
                break;
            case 62:
                {
                alt13=3;
                }
                break;
            case 64:
                {
                alt13=4;
                }
                break;
            case NOTEID:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:17: 'Note' notabasica ( '.' num_expr ( MUL )? )?
                    {
                    string_literal40=(Token)match(input,63,FOLLOW_63_in_musicnotation840);  
                    stream_63.add(string_literal40);


                    pushFollow(FOLLOW_notabasica_in_musicnotation842);
                    notabasica41=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica41.getTree());

                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:35: ( '.' num_expr ( MUL )? )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==59) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:36: '.' num_expr ( MUL )?
                            {
                            char_literal42=(Token)match(input,59,FOLLOW_59_in_musicnotation845);  
                            stream_59.add(char_literal42);


                            pushFollow(FOLLOW_num_expr_in_musicnotation847);
                            num_expr43=num_expr();

                            state._fsp--;

                            stream_num_expr.add(num_expr43.getTree());

                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:49: ( MUL )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==MUL) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:92:49: MUL
                                    {
                                    MUL44=(Token)match(input,MUL,FOLLOW_MUL_in_musicnotation849);  
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


                    string_literal45=(Token)match(input,61,FOLLOW_61_in_musicnotation880); 

                    char_literal46=(Token)match(input,LP,FOLLOW_LP_in_musicnotation883); 

                    pushFollow(FOLLOW_chord_in_musicnotation886);
                    chord47=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord47.getTree());

                    char_literal48=(Token)match(input,RP,FOLLOW_RP_in_musicnotation888); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:94:7: 'Melody' ! '(' ! melodia ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    string_literal49=(Token)match(input,62,FOLLOW_62_in_musicnotation897); 

                    char_literal50=(Token)match(input,LP,FOLLOW_LP_in_musicnotation900); 

                    pushFollow(FOLLOW_melodia_in_musicnotation903);
                    melodia51=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia51.getTree());

                    char_literal52=(Token)match(input,RP,FOLLOW_RP_in_musicnotation905); 

                    }
                    break;
                case 4 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:95:7: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_musicnotation914);
                    polifon53=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon53.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:96:7: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID54=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_musicnotation922); 
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:1: ite_stmt : IF ^ LP ! n_expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? ;
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
        BbParser.n_expr_return n_expr57 =null;

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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:13: ( IF ^ LP ! n_expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:17: IF ^ LP ! n_expr RP ! LB ! block_instructions RB ! ( ELSE ! LB ! block_instructions RB !)?
            {
            root_0 = (BbTree)adaptor.nil();


            IF55=(Token)match(input,IF,FOLLOW_IF_in_ite_stmt942); 
            IF55_tree = 
            (BbTree)adaptor.create(IF55)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(IF55_tree, root_0);


            LP56=(Token)match(input,LP,FOLLOW_LP_in_ite_stmt945); 

            pushFollow(FOLLOW_n_expr_in_ite_stmt948);
            n_expr57=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr57.getTree());

            RP58=(Token)match(input,RP,FOLLOW_RP_in_ite_stmt950); 

            LB59=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt953); 

            pushFollow(FOLLOW_block_instructions_in_ite_stmt956);
            block_instructions60=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions60.getTree());

            RB61=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt958); 

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:63: ( ELSE ! LB ! block_instructions RB !)?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:101:64: ELSE ! LB ! block_instructions RB !
                    {
                    ELSE62=(Token)match(input,ELSE,FOLLOW_ELSE_in_ite_stmt962); 

                    LB63=(Token)match(input,LB,FOLLOW_LB_in_ite_stmt965); 

                    pushFollow(FOLLOW_block_instructions_in_ite_stmt968);
                    block_instructions64=block_instructions();

                    state._fsp--;

                    adaptor.addChild(root_0, block_instructions64.getTree());

                    RB65=(Token)match(input,RB,FOLLOW_RB_in_ite_stmt970); 

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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:1: while_stmt : WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !;
    public final BbParser.while_stmt_return while_stmt() throws RecognitionException {
        BbParser.while_stmt_return retval = new BbParser.while_stmt_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token WHILE66=null;
        Token LP67=null;
        Token RP69=null;
        Token LB70=null;
        Token RB72=null;
        BbParser.n_expr_return n_expr68 =null;

        BbParser.block_instructions_return block_instructions71 =null;


        BbTree WHILE66_tree=null;
        BbTree LP67_tree=null;
        BbTree RP69_tree=null;
        BbTree LB70_tree=null;
        BbTree RB72_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:13: ( WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:105:17: WHILE ^ LP ! n_expr RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            WHILE66=(Token)match(input,WHILE,FOLLOW_WHILE_in_while_stmt998); 
            WHILE66_tree = 
            (BbTree)adaptor.create(WHILE66)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(WHILE66_tree, root_0);


            LP67=(Token)match(input,LP,FOLLOW_LP_in_while_stmt1001); 

            pushFollow(FOLLOW_n_expr_in_while_stmt1004);
            n_expr68=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr68.getTree());

            RP69=(Token)match(input,RP,FOLLOW_RP_in_while_stmt1006); 

            LB70=(Token)match(input,LB,FOLLOW_LB_in_while_stmt1009); 

            pushFollow(FOLLOW_block_instructions_in_while_stmt1012);
            block_instructions71=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions71.getTree());

            RB72=(Token)match(input,RB,FOLLOW_RB_in_while_stmt1014); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:1: for_stmt : FOR ^ LP ! assign ';' ! n_expr ';' ! assign RP ! LB ! block_instructions RB !;
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

        BbParser.n_expr_return n_expr77 =null;

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
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:11: ( FOR ^ LP ! assign ';' ! n_expr ';' ! assign RP ! LB ! block_instructions RB !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:109:15: FOR ^ LP ! assign ';' ! n_expr ';' ! assign RP ! LB ! block_instructions RB !
            {
            root_0 = (BbTree)adaptor.nil();


            FOR73=(Token)match(input,FOR,FOLLOW_FOR_in_for_stmt1052); 
            FOR73_tree = 
            (BbTree)adaptor.create(FOR73)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(FOR73_tree, root_0);


            LP74=(Token)match(input,LP,FOLLOW_LP_in_for_stmt1055); 

            pushFollow(FOLLOW_assign_in_for_stmt1058);
            assign75=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign75.getTree());

            char_literal76=(Token)match(input,60,FOLLOW_60_in_for_stmt1060); 

            pushFollow(FOLLOW_n_expr_in_for_stmt1063);
            n_expr77=n_expr();

            state._fsp--;

            adaptor.addChild(root_0, n_expr77.getTree());

            char_literal78=(Token)match(input,60,FOLLOW_60_in_for_stmt1065); 

            pushFollow(FOLLOW_assign_in_for_stmt1068);
            assign79=assign();

            state._fsp--;

            adaptor.addChild(root_0, assign79.getTree());

            RP80=(Token)match(input,RP,FOLLOW_RP_in_for_stmt1070); 

            LB81=(Token)match(input,LB,FOLLOW_LB_in_for_stmt1073); 

            pushFollow(FOLLOW_block_instructions_in_for_stmt1076);
            block_instructions82=block_instructions();

            state._fsp--;

            adaptor.addChild(root_0, block_instructions82.getTree());

            RB83=(Token)match(input,RB,FOLLOW_RB_in_for_stmt1078); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token RETURN84=null;
        BbParser.n_expr_return n_expr85 =null;

        BbParser.musicnotation_return musicnotation86 =null;


        BbTree RETURN84_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:13: ( RETURN ^ ( n_expr | musicnotation )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:17: RETURN ^ ( n_expr | musicnotation )?
            {
            root_0 = (BbTree)adaptor.nil();


            RETURN84=(Token)match(input,RETURN,FOLLOW_RETURN_in_return_stmt1103); 
            RETURN84_tree = 
            (BbTree)adaptor.create(RETURN84)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(RETURN84_tree, root_0);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:25: ( n_expr | musicnotation )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FALSE||LA15_0==ID||LA15_0==INT||LA15_0==LP||LA15_0==MINUS||LA15_0==NOT||LA15_0==PLUS||LA15_0==TRUE) ) {
                alt15=1;
            }
            else if ( (LA15_0==NOTEID||(LA15_0 >= 61 && LA15_0 <= 64)) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:26: n_expr
                    {
                    pushFollow(FOLLOW_n_expr_in_return_stmt1107);
                    n_expr85=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr85.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:113:35: musicnotation
                    {
                    pushFollow(FOLLOW_musicnotation_in_return_stmt1111);
                    musicnotation86=musicnotation();

                    state._fsp--;

                    adaptor.addChild(root_0, musicnotation86.getTree());

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

        Token NOTEID89=null;
        BbParser.melodia_return melodia87 =null;

        BbParser.polifon_return polifon88 =null;


        BbTree NOTEID89_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:9: ( melodia | polifon | NOTEID )
            int alt16=3;
            switch ( input.LA(1) ) {
            case LP:
            case PITCH:
            case 66:
                {
                alt16=1;
                }
                break;
            case NOTEID:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==LP||LA16_2==59) ) {
                    alt16=1;
                }
                else if ( (LA16_2==RB||LA16_2==RP||LA16_2==58||LA16_2==60) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
                }
                break;
            case 64:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:117:11: melodia
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_melodia_in_playable1130);
                    melodia87=melodia();

                    state._fsp--;

                    adaptor.addChild(root_0, melodia87.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:118:11: polifon
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_polifon_in_playable1142);
                    polifon88=polifon();

                    state._fsp--;

                    adaptor.addChild(root_0, polifon88.getTree());

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:119:11: NOTEID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    NOTEID89=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_playable1154); 
                    NOTEID89_tree = 
                    (BbTree)adaptor.create(NOTEID89)
                    ;
                    adaptor.addChild(root_0, NOTEID89_tree);


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

        BbParser.notelist_return notelist90 =null;


        RewriteRuleSubtreeStream stream_notelist=new RewriteRuleSubtreeStream(adaptor,"rule notelist");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:8: ( ( notelist )+ -> ^( MELODY ( notelist )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: ( notelist )+
            {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: ( notelist )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LP||LA17_0==NOTEID||LA17_0==PITCH||LA17_0==66) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:122:10: notelist
            	    {
            	    pushFollow(FOLLOW_notelist_in_melodia1170);
            	    notelist90=notelist();

            	    state._fsp--;

            	    stream_notelist.add(notelist90.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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

        Token char_literal92=null;
        Token MUL94=null;
        BbParser.notas_return notas91 =null;

        BbParser.duration_return duration93 =null;


        BbTree char_literal92_tree=null;
        BbTree MUL94_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");
        RewriteRuleSubtreeStream stream_duration=new RewriteRuleSubtreeStream(adaptor,"rule duration");
        RewriteRuleSubtreeStream stream_notas=new RewriteRuleSubtreeStream(adaptor,"rule notas");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:9: ( notas '.' duration ( MUL )? -> ^( PLAYABLE notas duration ( MUL )? ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:11: notas '.' duration ( MUL )?
            {
            pushFollow(FOLLOW_notas_in_notelist1196);
            notas91=notas();

            state._fsp--;

            stream_notas.add(notas91.getTree());

            char_literal92=(Token)match(input,59,FOLLOW_59_in_notelist1198);  
            stream_59.add(char_literal92);


            pushFollow(FOLLOW_duration_in_notelist1200);
            duration93=duration();

            state._fsp--;

            stream_duration.add(duration93.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:30: ( MUL )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==MUL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:125:30: MUL
                    {
                    MUL94=(Token)match(input,MUL,FOLLOW_MUL_in_notelist1202);  
                    stream_MUL.add(MUL94);


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

        Token char_literal96=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        BbParser.nota_return nota95 =null;

        BbParser.pack_return pack97 =null;

        BbParser.chord_return chord100 =null;


        BbTree char_literal96_tree=null;
        BbTree char_literal98_tree=null;
        BbTree char_literal99_tree=null;
        BbTree char_literal101_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:6: ( nota | '[' ! pack ']' !| '(' ! chord ')' !)
            int alt19=3;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
                {
                alt19=1;
                }
                break;
            case 66:
                {
                alt19=2;
                }
                break;
            case LP:
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
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:127:8: nota
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_nota_in_notas1223);
                    nota95=nota();

                    state._fsp--;

                    adaptor.addChild(root_0, nota95.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:128:8: '[' ! pack ']' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal96=(Token)match(input,66,FOLLOW_66_in_notas1232); 

                    pushFollow(FOLLOW_pack_in_notas1235);
                    pack97=pack();

                    state._fsp--;

                    adaptor.addChild(root_0, pack97.getTree());

                    char_literal98=(Token)match(input,67,FOLLOW_67_in_notas1237); 

                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:129:8: '(' ! chord ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal99=(Token)match(input,LP,FOLLOW_LP_in_notas1247); 

                    pushFollow(FOLLOW_chord_in_notas1250);
                    chord100=chord();

                    state._fsp--;

                    adaptor.addChild(root_0, chord100.getTree());

                    char_literal101=(Token)match(input,RP,FOLLOW_RP_in_notas1252); 

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

        Token NOTEID103=null;
        Token char_literal104=null;
        Token PLUS105=null;
        Token char_literal107=null;
        BbParser.notabasica_return notabasica102 =null;

        BbParser.num_expr_return num_expr106 =null;


        BbTree NOTEID103_tree=null;
        BbTree char_literal104_tree=null;
        BbTree PLUS105_tree=null;
        BbTree char_literal107_tree=null;
        RewriteRuleSubtreeStream stream_notabasica=new RewriteRuleSubtreeStream(adaptor,"rule notabasica");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:5: ( notabasica -> ^( NOTE notabasica ) | NOTEID ( '(' ! PLUS ^ num_expr ')' !)? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PITCH) ) {
                alt21=1;
            }
            else if ( (LA21_0==NOTEID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:132:7: notabasica
                    {
                    pushFollow(FOLLOW_notabasica_in_nota1271);
                    notabasica102=notabasica();

                    state._fsp--;

                    stream_notabasica.add(notabasica102.getTree());

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


                    NOTEID103=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_nota1285); 
                    NOTEID103_tree = 
                    (BbTree)adaptor.create(NOTEID103)
                    ;
                    adaptor.addChild(root_0, NOTEID103_tree);


                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:11: ( '(' ! PLUS ^ num_expr ')' !)?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==LP) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:133:13: '(' ! PLUS ^ num_expr ')' !
                            {
                            char_literal104=(Token)match(input,LP,FOLLOW_LP_in_nota1289); 

                            PLUS105=(Token)match(input,PLUS,FOLLOW_PLUS_in_nota1292); 
                            PLUS105_tree = 
                            (BbTree)adaptor.create(PLUS105)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(PLUS105_tree, root_0);


                            pushFollow(FOLLOW_num_expr_in_nota1295);
                            num_expr106=num_expr();

                            state._fsp--;

                            adaptor.addChild(root_0, num_expr106.getTree());

                            char_literal107=(Token)match(input,RP,FOLLOW_RP_in_nota1297); 

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

        BbParser.sub_chord_return sub_chord108 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:6: ( sub_chord -> ^( CHORD sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:137:8: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_chord1312);
            sub_chord108=sub_chord();

            state._fsp--;

            stream_sub_chord.add(sub_chord108.getTree());

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

        Token char_literal110=null;
        BbParser.nota_return nota109 =null;

        BbParser.nota_return nota111 =null;


        BbTree char_literal110_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:10: ( nota ( ',' ! ( nota ) )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:12: nota ( ',' ! ( nota ) )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_nota_in_sub_chord1330);
            nota109=nota();

            state._fsp--;

            adaptor.addChild(root_0, nota109.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:17: ( ',' ! ( nota ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==58) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:19: ',' ! ( nota )
            	    {
            	    char_literal110=(Token)match(input,58,FOLLOW_58_in_sub_chord1334); 

            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:24: ( nota )
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:140:25: nota
            	    {
            	    pushFollow(FOLLOW_nota_in_sub_chord1338);
            	    nota111=nota();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nota111.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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

        BbParser.sub_chord_return sub_chord112 =null;


        RewriteRuleSubtreeStream stream_sub_chord=new RewriteRuleSubtreeStream(adaptor,"rule sub_chord");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:5: ( sub_chord -> ^( PACK sub_chord ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:143:7: sub_chord
            {
            pushFollow(FOLLOW_sub_chord_in_pack1351);
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

        Token INT113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        BbParser.num_expr_return num_expr115 =null;


        BbTree INT113_tree=null;
        BbTree char_literal114_tree=null;
        BbTree char_literal116_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:9: ( INT | '(' ! num_expr ')' !)
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INT) ) {
                alt23=1;
            }
            else if ( (LA23_0==LP) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:147:11: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT113=(Token)match(input,INT,FOLLOW_INT_in_duration1370); 
                    INT113_tree = 
                    (BbTree)adaptor.create(INT113)
                    ;
                    adaptor.addChild(root_0, INT113_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:148:7: '(' ! num_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal114=(Token)match(input,LP,FOLLOW_LP_in_duration1379); 

                    pushFollow(FOLLOW_num_expr_in_duration1382);
                    num_expr115=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr115.getTree());

                    char_literal116=(Token)match(input,RP,FOLLOW_RP_in_duration1384); 

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

        Token string_literal117=null;
        Token LB118=null;
        Token RB120=null;
        BbParser.voices_return voices119 =null;


        BbTree string_literal117_tree=null;
        BbTree LB118_tree=null;
        BbTree RB120_tree=null;
        RewriteRuleTokenStream stream_RB=new RewriteRuleTokenStream(adaptor,"token RB");
        RewriteRuleTokenStream stream_LB=new RewriteRuleTokenStream(adaptor,"token LB");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_voices=new RewriteRuleSubtreeStream(adaptor,"rule voices");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:9: ( 'Poli' LB ( voices )+ RB -> ^( POLIFONE ( voices )+ ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:11: 'Poli' LB ( voices )+ RB
            {
            string_literal117=(Token)match(input,64,FOLLOW_64_in_polifon1398);  
            stream_64.add(string_literal117);


            LB118=(Token)match(input,LB,FOLLOW_LB_in_polifon1400);  
            stream_LB.add(LB118);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:21: ( voices )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==VOICE) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:151:21: voices
            	    {
            	    pushFollow(FOLLOW_voices_in_polifon1402);
            	    voices119=voices();

            	    state._fsp--;

            	    stream_voices.add(voices119.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            RB120=(Token)match(input,RB,FOLLOW_RB_in_polifon1405);  
            stream_RB.add(RB120);


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
    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:1: voices : VOICE ! NOTEID ^ melodia '|' !;
    public final BbParser.voices_return voices() throws RecognitionException {
        BbParser.voices_return retval = new BbParser.voices_return();
        retval.start = input.LT(1);


        BbTree root_0 = null;

        Token VOICE121=null;
        Token NOTEID122=null;
        Token char_literal124=null;
        BbParser.melodia_return melodia123 =null;


        BbTree VOICE121_tree=null;
        BbTree NOTEID122_tree=null;
        BbTree char_literal124_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:7: ( VOICE ! NOTEID ^ melodia '|' !)
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:154:9: VOICE ! NOTEID ^ melodia '|' !
            {
            root_0 = (BbTree)adaptor.nil();


            VOICE121=(Token)match(input,VOICE,FOLLOW_VOICE_in_voices1438); 

            NOTEID122=(Token)match(input,NOTEID,FOLLOW_NOTEID_in_voices1441); 
            NOTEID122_tree = 
            (BbTree)adaptor.create(NOTEID122)
            ;
            root_0 = (BbTree)adaptor.becomeRoot(NOTEID122_tree, root_0);


            pushFollow(FOLLOW_melodia_in_voices1444);
            melodia123=melodia();

            state._fsp--;

            adaptor.addChild(root_0, melodia123.getTree());

            char_literal124=(Token)match(input,70,FOLLOW_70_in_voices1446); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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

        Token string_literal125=null;
        BbParser.n_expr_return n_expr126 =null;


        BbTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_n_expr=new RewriteRuleSubtreeStream(adaptor,"rule n_expr");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:7: ( 'Speed' n_expr -> ^( SPEED n_expr ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:156:9: 'Speed' n_expr
            {
            string_literal125=(Token)match(input,65,FOLLOW_65_in_speed1455);  
            stream_65.add(string_literal125);


            pushFollow(FOLLOW_n_expr_in_speed1457);
            n_expr126=n_expr();

            state._fsp--;

            stream_n_expr.add(n_expr126.getTree());

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

        BbParser.playable_return playable127 =null;

        BbParser.n_expr_return n_expr128 =null;



        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:9: ( playable | n_expr )
            int alt25=2;
            switch ( input.LA(1) ) {
            case NOTEID:
            case PITCH:
            case 64:
            case 66:
                {
                alt25=1;
                }
                break;
            case LP:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==NOTEID||LA25_2==PITCH) ) {
                    alt25=1;
                }
                else if ( (LA25_2==FALSE||LA25_2==ID||LA25_2==INT||LA25_2==LP||LA25_2==MINUS||LA25_2==NOT||LA25_2==PLUS||LA25_2==TRUE) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

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
                alt25=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:159:11: playable
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_playable_in_expr1477);
                    playable127=playable();

                    state._fsp--;

                    adaptor.addChild(root_0, playable127.getTree());

                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:160:5: n_expr
                    {
                    root_0 = (BbTree)adaptor.nil();


                    pushFollow(FOLLOW_n_expr_in_expr1483);
                    n_expr128=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr128.getTree());

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

        Token OR130=null;
        BbParser.boolterm_return boolterm129 =null;

        BbParser.boolterm_return boolterm131 =null;


        BbTree OR130_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:8: ( boolterm ( OR ^ boolterm )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:10: boolterm ( OR ^ boolterm )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_n_expr1500);
            boolterm129=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm129.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:19: ( OR ^ boolterm )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==OR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:163:20: OR ^ boolterm
            	    {
            	    OR130=(Token)match(input,OR,FOLLOW_OR_in_n_expr1503); 
            	    OR130_tree = 
            	    (BbTree)adaptor.create(OR130)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(OR130_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_n_expr1506);
            	    boolterm131=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm131.getTree());

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

        Token AND133=null;
        BbParser.boolfact_return boolfact132 =null;

        BbParser.boolfact_return boolfact134 =null;


        BbTree AND133_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:9: ( boolfact ( AND ^ boolfact )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:13: boolfact ( AND ^ boolfact )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1517);
            boolfact132=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact132.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:22: ( AND ^ boolfact )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==AND) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:165:23: AND ^ boolfact
            	    {
            	    AND133=(Token)match(input,AND,FOLLOW_AND_in_boolterm1520); 
            	    AND133_tree = 
            	    (BbTree)adaptor.create(AND133)
            	    ;
            	    root_0 = (BbTree)adaptor.becomeRoot(AND133_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1523);
            	    boolfact134=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact134.getTree());

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

        Token EQ136=null;
        Token NEQ137=null;
        Token LT138=null;
        Token LE139=null;
        Token GT140=null;
        Token GE141=null;
        BbParser.num_expr_return num_expr135 =null;

        BbParser.num_expr_return num_expr142 =null;


        BbTree EQ136_tree=null;
        BbTree NEQ137_tree=null;
        BbTree LT138_tree=null;
        BbTree LE139_tree=null;
        BbTree GT140_tree=null;
        BbTree GE141_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:9: ( num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:13: num_expr ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_num_expr_in_boolfact1543);
            num_expr135=num_expr();

            state._fsp--;

            adaptor.addChild(root_0, num_expr135.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:22: ( ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==EQ||(LA29_0 >= GE && LA29_0 <= GT)||LA29_0==LE||LA29_0==LT||LA29_0==NEQ) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^) num_expr
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:23: ( EQ ^| NEQ ^| LT ^| LE ^| GT ^| GE ^)
                    int alt28=6;
                    switch ( input.LA(1) ) {
                    case EQ:
                        {
                        alt28=1;
                        }
                        break;
                    case NEQ:
                        {
                        alt28=2;
                        }
                        break;
                    case LT:
                        {
                        alt28=3;
                        }
                        break;
                    case LE:
                        {
                        alt28=4;
                        }
                        break;
                    case GT:
                        {
                        alt28=5;
                        }
                        break;
                    case GE:
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
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:24: EQ ^
                            {
                            EQ136=(Token)match(input,EQ,FOLLOW_EQ_in_boolfact1547); 
                            EQ136_tree = 
                            (BbTree)adaptor.create(EQ136)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(EQ136_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:30: NEQ ^
                            {
                            NEQ137=(Token)match(input,NEQ,FOLLOW_NEQ_in_boolfact1552); 
                            NEQ137_tree = 
                            (BbTree)adaptor.create(NEQ137)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(NEQ137_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:37: LT ^
                            {
                            LT138=(Token)match(input,LT,FOLLOW_LT_in_boolfact1557); 
                            LT138_tree = 
                            (BbTree)adaptor.create(LT138)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LT138_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:43: LE ^
                            {
                            LE139=(Token)match(input,LE,FOLLOW_LE_in_boolfact1562); 
                            LE139_tree = 
                            (BbTree)adaptor.create(LE139)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(LE139_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:49: GT ^
                            {
                            GT140=(Token)match(input,GT,FOLLOW_GT_in_boolfact1567); 
                            GT140_tree = 
                            (BbTree)adaptor.create(GT140)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GT140_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:168:55: GE ^
                            {
                            GE141=(Token)match(input,GE,FOLLOW_GE_in_boolfact1572); 
                            GE141_tree = 
                            (BbTree)adaptor.create(GE141)
                            ;
                            root_0 = (BbTree)adaptor.becomeRoot(GE141_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_num_expr_in_boolfact1576);
                    num_expr142=num_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, num_expr142.getTree());

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

        Token PLUS144=null;
        Token MINUS145=null;
        BbParser.term_return term143 =null;

        BbParser.term_return term146 =null;


        BbTree PLUS144_tree=null;
        BbTree MINUS145_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:9: ( term ( ( PLUS ^| MINUS ^) term )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:13: term ( ( PLUS ^| MINUS ^) term )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_num_expr1596);
            term143=term();

            state._fsp--;

            adaptor.addChild(root_0, term143.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:18: ( ( PLUS ^| MINUS ^) term )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==MINUS||LA31_0==PLUS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:20: ( PLUS ^| MINUS ^) term
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:20: ( PLUS ^| MINUS ^)
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==PLUS) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==MINUS) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:21: PLUS ^
            	            {
            	            PLUS144=(Token)match(input,PLUS,FOLLOW_PLUS_in_num_expr1601); 
            	            PLUS144_tree = 
            	            (BbTree)adaptor.create(PLUS144)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(PLUS144_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:171:29: MINUS ^
            	            {
            	            MINUS145=(Token)match(input,MINUS,FOLLOW_MINUS_in_num_expr1606); 
            	            MINUS145_tree = 
            	            (BbTree)adaptor.create(MINUS145)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MINUS145_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_num_expr1610);
            	    term146=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term146.getTree());

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

        Token MUL148=null;
        Token DIV149=null;
        Token MOD150=null;
        BbParser.factor_return factor147 =null;

        BbParser.factor_return factor151 =null;


        BbTree MUL148_tree=null;
        BbTree DIV149_tree=null;
        BbTree MOD150_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:9: ( factor ( ( MUL ^| DIV ^| MOD ^) factor )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:13: factor ( ( MUL ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1634);
            factor147=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor147.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:20: ( ( MUL ^| DIV ^| MOD ^) factor )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==MUL) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==FALSE||LA33_2==ID||LA33_2==INT||LA33_2==LP||LA33_2==MINUS||LA33_2==NOT||LA33_2==PLUS||LA33_2==TRUE) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==DIV||LA33_0==MOD) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:22: ( MUL ^| DIV ^| MOD ^) factor
            	    {
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:22: ( MUL ^| DIV ^| MOD ^)
            	    int alt32=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt32=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt32=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt32=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt32) {
            	        case 1 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:23: MUL ^
            	            {
            	            MUL148=(Token)match(input,MUL,FOLLOW_MUL_in_term1639); 
            	            MUL148_tree = 
            	            (BbTree)adaptor.create(MUL148)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MUL148_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:30: DIV ^
            	            {
            	            DIV149=(Token)match(input,DIV,FOLLOW_DIV_in_term1644); 
            	            DIV149_tree = 
            	            (BbTree)adaptor.create(DIV149)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(DIV149_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:174:37: MOD ^
            	            {
            	            MOD150=(Token)match(input,MOD,FOLLOW_MOD_in_term1649); 
            	            MOD150_tree = 
            	            (BbTree)adaptor.create(MOD150)
            	            ;
            	            root_0 = (BbTree)adaptor.becomeRoot(MOD150_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1654);
            	    factor151=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor151.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
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

        Token NOT152=null;
        Token PLUS153=null;
        Token MINUS154=null;
        BbParser.atom_return atom155 =null;


        BbTree NOT152_tree=null;
        BbTree PLUS153_tree=null;
        BbTree MINUS154_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:9: ( ( NOT ^| PLUS ^| MINUS ^)? atom )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:13: ( NOT ^| PLUS ^| MINUS ^)? atom
            {
            root_0 = (BbTree)adaptor.nil();


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:13: ( NOT ^| PLUS ^| MINUS ^)?
            int alt34=4;
            switch ( input.LA(1) ) {
                case NOT:
                    {
                    alt34=1;
                    }
                    break;
                case PLUS:
                    {
                    alt34=2;
                    }
                    break;
                case MINUS:
                    {
                    alt34=3;
                    }
                    break;
            }

            switch (alt34) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:14: NOT ^
                    {
                    NOT152=(Token)match(input,NOT,FOLLOW_NOT_in_factor1677); 
                    NOT152_tree = 
                    (BbTree)adaptor.create(NOT152)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(NOT152_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:21: PLUS ^
                    {
                    PLUS153=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1682); 
                    PLUS153_tree = 
                    (BbTree)adaptor.create(PLUS153)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(PLUS153_tree, root_0);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:177:29: MINUS ^
                    {
                    MINUS154=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1687); 
                    MINUS154_tree = 
                    (BbTree)adaptor.create(MINUS154)
                    ;
                    root_0 = (BbTree)adaptor.becomeRoot(MINUS154_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1692);
            atom155=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom155.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (BbTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
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
        Token ID156=null;
        Token INT157=null;
        Token char_literal159=null;
        Token char_literal161=null;
        BbParser.funcall_return funcall158 =null;

        BbParser.n_expr_return n_expr160 =null;


        BbTree b_tree=null;
        BbTree ID156_tree=null;
        BbTree INT157_tree=null;
        BbTree char_literal159_tree=null;
        BbTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:9: ( ID | INT | (b= TRUE |b= FALSE ) -> ^( BOOLEAN[$b,$b.text] ) | funcall | '(' ! n_expr ')' !)
            int alt36=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==LP) ) {
                    alt36=4;
                }
                else if ( (LA36_1==AND||LA36_1==DIV||LA36_1==EQ||(LA36_1 >= GE && LA36_1 <= GT)||LA36_1==LE||LA36_1==LT||(LA36_1 >= MINUS && LA36_1 <= NEQ)||LA36_1==OR||LA36_1==PLUS||LA36_1==RB||LA36_1==RP||LA36_1==58||LA36_1==60) ) {
                    alt36=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt36=2;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt36=3;
                }
                break;
            case LP:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:183:13: ID
                    {
                    root_0 = (BbTree)adaptor.nil();


                    ID156=(Token)match(input,ID,FOLLOW_ID_in_atom1717); 
                    ID156_tree = 
                    (BbTree)adaptor.create(ID156)
                    ;
                    adaptor.addChild(root_0, ID156_tree);


                    }
                    break;
                case 2 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:184:13: INT
                    {
                    root_0 = (BbTree)adaptor.nil();


                    INT157=(Token)match(input,INT,FOLLOW_INT_in_atom1731); 
                    INT157_tree = 
                    (BbTree)adaptor.create(INT157)
                    ;
                    adaptor.addChild(root_0, INT157_tree);


                    }
                    break;
                case 3 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:13: (b= TRUE |b= FALSE )
                    {
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:13: (b= TRUE |b= FALSE )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==TRUE) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==FALSE) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;

                    }
                    switch (alt35) {
                        case 1 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:14: b= TRUE
                            {
                            b=(Token)match(input,TRUE,FOLLOW_TRUE_in_atom1748);  
                            stream_TRUE.add(b);


                            }
                            break;
                        case 2 :
                            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:185:23: b= FALSE
                            {
                            b=(Token)match(input,FALSE,FOLLOW_FALSE_in_atom1754);  
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


                    pushFollow(FOLLOW_funcall_in_atom1775);
                    funcall158=funcall();

                    state._fsp--;

                    adaptor.addChild(root_0, funcall158.getTree());

                    }
                    break;
                case 5 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:187:13: '(' ! n_expr ')' !
                    {
                    root_0 = (BbTree)adaptor.nil();


                    char_literal159=(Token)match(input,LP,FOLLOW_LP_in_atom1789); 

                    pushFollow(FOLLOW_n_expr_in_atom1792);
                    n_expr160=n_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, n_expr160.getTree());

                    char_literal161=(Token)match(input,RP,FOLLOW_RP_in_atom1794); 

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

        Token ID162=null;
        Token char_literal163=null;
        Token char_literal165=null;
        BbParser.expr_list_return expr_list164 =null;


        BbTree ID162_tree=null;
        BbTree char_literal163_tree=null;
        BbTree char_literal165_tree=null;
        RewriteRuleTokenStream stream_LP=new RewriteRuleTokenStream(adaptor,"token LP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_RP=new RewriteRuleTokenStream(adaptor,"token RP");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:9: ( ID '(' ( expr_list )? ')' -> ^( FUNCALL ID ^( ARGLIST ( expr_list )? ) ) )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:13: ID '(' ( expr_list )? ')'
            {
            ID162=(Token)match(input,ID,FOLLOW_ID_in_funcall1814);  
            stream_ID.add(ID162);


            char_literal163=(Token)match(input,LP,FOLLOW_LP_in_funcall1816);  
            stream_LP.add(char_literal163);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: ( expr_list )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==FALSE||LA37_0==ID||LA37_0==INT||LA37_0==LP||LA37_0==MINUS||LA37_0==NOT||LA37_0==NOTEID||LA37_0==PITCH||LA37_0==PLUS||LA37_0==TRUE||LA37_0==64||LA37_0==66) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:190:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_funcall1818);
                    expr_list164=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list164.getTree());

                    }
                    break;

            }


            char_literal165=(Token)match(input,RP,FOLLOW_RP_in_funcall1821);  
            stream_RP.add(char_literal165);


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

        Token char_literal167=null;
        BbParser.expr_return expr166 =null;

        BbParser.expr_return expr168 =null;


        BbTree char_literal167_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:10: ( expr ( ',' ! expr )* )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:13: expr ( ',' ! expr )*
            {
            root_0 = (BbTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_expr_list1854);
            expr166=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr166.getTree());

            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:18: ( ',' ! expr )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==58) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:194:19: ',' ! expr
            	    {
            	    char_literal167=(Token)match(input,58,FOLLOW_58_in_expr_list1857); 

            	    pushFollow(FOLLOW_expr_in_expr_list1860);
            	    expr168=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr168.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
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

        Token PITCH169=null;
        Token ALT170=null;
        Token INT171=null;

        BbTree PITCH169_tree=null;
        BbTree ALT170_tree=null;
        BbTree INT171_tree=null;

        try {
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:12: ( PITCH ( ALT )? ( INT )? )
            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:14: PITCH ( ALT )? ( INT )?
            {
            root_0 = (BbTree)adaptor.nil();


            PITCH169=(Token)match(input,PITCH,FOLLOW_PITCH_in_notabasica1879); 
            PITCH169_tree = 
            (BbTree)adaptor.create(PITCH169)
            ;
            adaptor.addChild(root_0, PITCH169_tree);


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:20: ( ALT )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ALT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:20: ALT
                    {
                    ALT170=(Token)match(input,ALT,FOLLOW_ALT_in_notabasica1881); 
                    ALT170_tree = 
                    (BbTree)adaptor.create(ALT170)
                    ;
                    adaptor.addChild(root_0, ALT170_tree);


                    }
                    break;

            }


            // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:25: ( INT )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/raluca/Documents/Uni/Q6/CL/Bb/src/parser/Bb.g:197:25: INT
                    {
                    INT171=(Token)match(input,INT,FOLLOW_INT_in_notabasica1884); 
                    INT171_tree = 
                    (BbTree)adaptor.create(INT171)
                    ;
                    adaptor.addChild(root_0, INT171_tree);


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
    public static final BitSet FOLLOW_ID_in_param352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_param366 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_param369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_block_instructions413 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_block_instructions416 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_instruction_in_block_instructions418 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_assign_in_instruction477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ite_stmt_in_instruction501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_stmt_in_instruction523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_stmt_in_instruction541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_instruction557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_instruction580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_instruction599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_speed_in_instruction619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_assign673 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ID_in_assign677 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign681 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_assign683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notetype_in_assign701 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_assign705 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EQ_in_assign707 = new BitSet(new long[]{0xE000004000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_musicnotation_in_assign709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_musicnotation840 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_notabasica_in_musicnotation842 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_musicnotation845 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_musicnotation847 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_MUL_in_musicnotation849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_musicnotation880 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation883 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_chord_in_musicnotation886 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_musicnotation897 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_musicnotation900 = new BitSet(new long[]{0x0000044010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_melodia_in_musicnotation903 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_musicnotation905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_musicnotation914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_musicnotation922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ite_stmt942 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_ite_stmt945 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_ite_stmt948 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_ite_stmt950 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt953 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt956 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt958 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ELSE_in_ite_stmt962 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_ite_stmt965 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_ite_stmt968 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_ite_stmt970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_while_stmt998 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_while_stmt1001 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_while_stmt1004 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_while_stmt1006 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_while_stmt1009 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_while_stmt1012 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_while_stmt1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_for_stmt1052 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_for_stmt1055 = new BitSet(new long[]{0xE000004000200000L,0x0000000000000031L});
    public static final BitSet FOLLOW_assign_in_for_stmt1058 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1060 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_for_stmt1063 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_for_stmt1065 = new BitSet(new long[]{0xE000004000200000L,0x0000000000000031L});
    public static final BitSet FOLLOW_assign_in_for_stmt1068 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_for_stmt1070 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_for_stmt1073 = new BitSet(new long[]{0xF104044010610000L,0x0000000000000037L});
    public static final BitSet FOLLOW_block_instructions_in_for_stmt1076 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RB_in_for_stmt1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_return_stmt1103 = new BitSet(new long[]{0xE040104890A08002L,0x0000000000000001L});
    public static final BitSet FOLLOW_n_expr_in_return_stmt1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_musicnotation_in_return_stmt1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_melodia_in_playable1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polifon_in_playable1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_playable1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notelist_in_melodia1170 = new BitSet(new long[]{0x0000044010000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_notas_in_notelist1196 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_notelist1198 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_duration_in_notelist1200 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_MUL_in_notelist1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_notas1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_notas1232 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_pack_in_notas1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_notas1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_notas1247 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_chord_in_notas1250 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_notas1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notabasica_in_nota1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEID_in_nota1285 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_LP_in_nota1289 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_PLUS_in_nota1292 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_nota1295 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_nota1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_chord1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nota_in_sub_chord1330 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_sub_chord1334 = new BitSet(new long[]{0x0000044000000000L});
    public static final BitSet FOLLOW_nota_in_sub_chord1338 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_sub_chord_in_pack1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_duration1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_duration1379 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_duration1382 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_duration1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_polifon1398 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LB_in_polifon1400 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_voices_in_polifon1402 = new BitSet(new long[]{0x0082000000000000L});
    public static final BitSet FOLLOW_RB_in_polifon1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOICE_in_voices1438 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_NOTEID_in_voices1441 = new BitSet(new long[]{0x0000044010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_melodia_in_voices1444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_voices1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_speed1455 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_speed1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_playable_in_expr1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_n_expr_in_expr1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1500 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_OR_in_n_expr1503 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_boolterm_in_n_expr1506 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1517 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1520 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1523 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1543 = new BitSet(new long[]{0x0000000422182002L});
    public static final BitSet FOLLOW_EQ_in_boolfact1547 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_NEQ_in_boolfact1552 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_LT_in_boolfact1557 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_LE_in_boolfact1562 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_GT_in_boolfact1567 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_GE_in_boolfact1572 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_num_expr_in_boolfact1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_num_expr1596 = new BitSet(new long[]{0x0000100080000002L});
    public static final BitSet FOLLOW_PLUS_in_num_expr1601 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_MINUS_in_num_expr1606 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_term_in_num_expr1610 = new BitSet(new long[]{0x0000100080000002L});
    public static final BitSet FOLLOW_factor_in_term1634 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_MUL_in_term1639 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_DIV_in_term1644 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_MOD_in_term1649 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_factor_in_term1654 = new BitSet(new long[]{0x0000000300000802L});
    public static final BitSet FOLLOW_NOT_in_factor1677 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_PLUS_in_factor1682 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_MINUS_in_factor1687 = new BitSet(new long[]{0x0040000010A08000L});
    public static final BitSet FOLLOW_atom_in_factor1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_atom1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_atom1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funcall_in_atom1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom1789 = new BitSet(new long[]{0x0040100890A08000L});
    public static final BitSet FOLLOW_n_expr_in_atom1792 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_atom1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funcall1814 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_LP_in_funcall1816 = new BitSet(new long[]{0x0048144890A08000L,0x0000000000000005L});
    public static final BitSet FOLLOW_expr_list_in_funcall1818 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_RP_in_funcall1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list1854 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_expr_list1857 = new BitSet(new long[]{0x0040144890A08000L,0x0000000000000005L});
    public static final BitSet FOLLOW_expr_in_expr_list1860 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_PITCH_in_notabasica1879 = new BitSet(new long[]{0x0000000000800012L});
    public static final BitSet FOLLOW_ALT_in_notabasica1881 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_INT_in_notabasica1884 = new BitSet(new long[]{0x0000000000000002L});

}