package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.AiocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAiocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LCURLY", "RULE_RCURLY", "RULE_COLON", "RULE_AT", "RULE_ID", "RULE_STRING", "RULE_COMMA", "RULE_LRND", "RULE_RRND", "RULE_AND", "RULE_OR", "RULE_PIPE", "RULE_SEMICOLON", "RULE_ARROW", "RULE_ASSIGN", "RULE_PLUS", "RULE_MINUS", "RULE_TIMES", "RULE_SLASH", "RULE_NOT", "RULE_TRUE", "RULE_FALSE", "RULE_LT", "RULE_LEQ", "RULE_EQUAL", "RULE_GT", "RULE_GEQ", "RULE_NOT_EQUAL", "RULE_INT", "RULE_DOT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'preamble'", "'aioc'", "'rule'", "'newRoles'", "'on'", "'do'", "'location'", "'N.'", "'E.'", "'starter:'", "'include'", "'from'", "'with'", "'skip'", "'getInput'", "'show'", "'if'", "'else'", "'while'", "'scope'", "'prop'", "'roles'"
    };
    public static final int T__50=50;
    public static final int RULE_GT=29;
    public static final int RULE_LEQ=27;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_LCURLY=4;
    public static final int T__58=58;
    public static final int RULE_ARROW=17;
    public static final int RULE_NOT_EQUAL=31;
    public static final int T__51=51;
    public static final int RULE_OR=14;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=8;
    public static final int RULE_EQUAL=28;
    public static final int RULE_COMMA=10;
    public static final int RULE_TIMES=21;
    public static final int RULE_COLON=6;
    public static final int RULE_ASSIGN=18;
    public static final int RULE_SLASH=22;
    public static final int RULE_LT=26;
    public static final int RULE_PIPE=15;
    public static final int RULE_INT=32;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_LRND=11;
    public static final int RULE_SEMICOLON=16;
    public static final int RULE_FALSE=25;
    public static final int RULE_STRING=9;
    public static final int RULE_GEQ=30;
    public static final int RULE_NOT=23;
    public static final int RULE_AT=7;
    public static final int RULE_AND=13;
    public static final int RULE_SL_COMMENT=35;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TRUE=24;
    public static final int RULE_PLUS=19;
    public static final int RULE_DOT=33;
    public static final int EOF=-1;
    public static final int RULE_RCURLY=5;
    public static final int RULE_WS=36;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_MINUS=20;
    public static final int RULE_RRND=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAiocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAiocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAiocParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAioc.g"; }



     	private AiocGrammarAccess grammarAccess;
     	
        public InternalAiocParser(TokenStream input, AiocGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AiocJ";	
       	}
       	
       	@Override
       	protected AiocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAiocJ"
    // InternalAioc.g:67:1: entryRuleAiocJ returns [EObject current=null] : iv_ruleAiocJ= ruleAiocJ EOF ;
    public final EObject entryRuleAiocJ() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAiocJ = null;


        try {
            // InternalAioc.g:68:2: (iv_ruleAiocJ= ruleAiocJ EOF )
            // InternalAioc.g:69:2: iv_ruleAiocJ= ruleAiocJ EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAiocJRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAiocJ=ruleAiocJ();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAiocJ; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAiocJ"


    // $ANTLR start "ruleAiocJ"
    // InternalAioc.g:76:1: ruleAiocJ returns [EObject current=null] : ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* ) ;
    public final EObject ruleAiocJ() throws RecognitionException {
        EObject current = null;

        EObject lv_aioc_0_0 = null;

        EObject lv_ruleSet_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:79:28: ( ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* ) )
            // InternalAioc.g:80:1: ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* )
            {
            // InternalAioc.g:80:1: ( ( (lv_aioc_0_0= ruleAioc ) ) | ( (lv_ruleSet_1_0= ruleRule ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38||LA2_0==48) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==40) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAioc.g:80:2: ( (lv_aioc_0_0= ruleAioc ) )
                    {
                    // InternalAioc.g:80:2: ( (lv_aioc_0_0= ruleAioc ) )
                    // InternalAioc.g:81:1: (lv_aioc_0_0= ruleAioc )
                    {
                    // InternalAioc.g:81:1: (lv_aioc_0_0= ruleAioc )
                    // InternalAioc.g:82:3: lv_aioc_0_0= ruleAioc
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAiocJAccess().getAiocAiocParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_aioc_0_0=ruleAioc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAiocJRule());
                      	        }
                             		set(
                             			current, 
                             			"aioc",
                              		lv_aioc_0_0, 
                              		"org.Aioc.Aioc");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:99:6: ( (lv_ruleSet_1_0= ruleRule ) )*
                    {
                    // InternalAioc.g:99:6: ( (lv_ruleSet_1_0= ruleRule ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==40) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAioc.g:100:1: (lv_ruleSet_1_0= ruleRule )
                    	    {
                    	    // InternalAioc.g:100:1: (lv_ruleSet_1_0= ruleRule )
                    	    // InternalAioc.g:101:3: lv_ruleSet_1_0= ruleRule
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAiocJAccess().getRuleSetRuleParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_ruleSet_1_0=ruleRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAiocJRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"ruleSet",
                    	              		lv_ruleSet_1_0, 
                    	              		"org.Aioc.Rule");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAiocJ"


    // $ANTLR start "entryRuleAioc"
    // InternalAioc.g:125:1: entryRuleAioc returns [EObject current=null] : iv_ruleAioc= ruleAioc EOF ;
    public final EObject entryRuleAioc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAioc = null;


        try {
            // InternalAioc.g:126:2: (iv_ruleAioc= ruleAioc EOF )
            // InternalAioc.g:127:2: iv_ruleAioc= ruleAioc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAiocRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAioc=ruleAioc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAioc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAioc"


    // $ANTLR start "ruleAioc"
    // InternalAioc.g:134:1: ruleAioc returns [EObject current=null] : ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY ) ;
    public final EObject ruleAioc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LCURLY_2=null;
        Token this_RCURLY_4=null;
        Token otherlv_5=null;
        Token this_LCURLY_6=null;
        Token this_RCURLY_8=null;
        EObject lv_functionLocation_0_0 = null;

        EObject lv_preamble_3_0 = null;

        EObject lv_choreography_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:137:28: ( ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY ) )
            // InternalAioc.g:138:1: ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY )
            {
            // InternalAioc.g:138:1: ( ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY )
            // InternalAioc.g:138:2: ( (lv_functionLocation_0_0= ruleFunctionLocation ) )* otherlv_1= 'preamble' this_LCURLY_2= RULE_LCURLY ( (lv_preamble_3_0= rulePreamble ) ) this_RCURLY_4= RULE_RCURLY otherlv_5= 'aioc' this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY
            {
            // InternalAioc.g:138:2: ( (lv_functionLocation_0_0= ruleFunctionLocation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==48) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAioc.g:139:1: (lv_functionLocation_0_0= ruleFunctionLocation )
            	    {
            	    // InternalAioc.g:139:1: (lv_functionLocation_0_0= ruleFunctionLocation )
            	    // InternalAioc.g:140:3: lv_functionLocation_0_0= ruleFunctionLocation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAiocAccess().getFunctionLocationFunctionLocationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_functionLocation_0_0=ruleFunctionLocation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAiocRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionLocation",
            	              		lv_functionLocation_0_0, 
            	              		"org.Aioc.FunctionLocation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_1=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAiocAccess().getPreambleKeyword_1());
                  
            }
            this_LCURLY_2=(Token)match(input,RULE_LCURLY,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_2, grammarAccess.getAiocAccess().getLCURLYTerminalRuleCall_2()); 
                  
            }
            // InternalAioc.g:164:1: ( (lv_preamble_3_0= rulePreamble ) )
            // InternalAioc.g:165:1: (lv_preamble_3_0= rulePreamble )
            {
            // InternalAioc.g:165:1: (lv_preamble_3_0= rulePreamble )
            // InternalAioc.g:166:3: lv_preamble_3_0= rulePreamble
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAiocAccess().getPreamblePreambleParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_preamble_3_0=rulePreamble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAiocRule());
              	        }
                     		set(
                     			current, 
                     			"preamble",
                      		lv_preamble_3_0, 
                      		"org.Aioc.Preamble");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_4=(Token)match(input,RULE_RCURLY,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_4, grammarAccess.getAiocAccess().getRCURLYTerminalRuleCall_4()); 
                  
            }
            otherlv_5=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAiocAccess().getAiocKeyword_5());
                  
            }
            this_LCURLY_6=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_6, grammarAccess.getAiocAccess().getLCURLYTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:194:1: ( (lv_choreography_7_0= ruleChoreography ) )
            // InternalAioc.g:195:1: (lv_choreography_7_0= ruleChoreography )
            {
            // InternalAioc.g:195:1: (lv_choreography_7_0= ruleChoreography )
            // InternalAioc.g:196:3: lv_choreography_7_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAiocAccess().getChoreographyChoreographyParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_7_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAiocRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_7_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_8, grammarAccess.getAiocAccess().getRCURLYTerminalRuleCall_8()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAioc"


    // $ANTLR start "entryRuleRule"
    // InternalAioc.g:224:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalAioc.g:225:2: (iv_ruleRule= ruleRule EOF )
            // InternalAioc.g:226:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalAioc.g:233:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ( (lv_functionLocation_3_0= ruleFunctionLocation ) )* (otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) ) )? otherlv_7= 'on' this_LCURLY_8= RULE_LCURLY ( (lv_where_9_0= ruleWhere ) ) this_RCURLY_10= RULE_RCURLY otherlv_11= 'do' this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY this_RCURLY_15= RULE_RCURLY ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LCURLY_1=null;
        Token otherlv_4=null;
        Token this_COLON_5=null;
        Token otherlv_7=null;
        Token this_LCURLY_8=null;
        Token this_RCURLY_10=null;
        Token otherlv_11=null;
        Token this_LCURLY_12=null;
        Token this_RCURLY_14=null;
        Token this_RCURLY_15=null;
        EObject lv_locDefinition_2_0 = null;

        EObject lv_functionLocation_3_0 = null;

        EObject lv_newRoles_6_0 = null;

        EObject lv_where_9_0 = null;

        EObject lv_choreography_13_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:236:28: ( (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ( (lv_functionLocation_3_0= ruleFunctionLocation ) )* (otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) ) )? otherlv_7= 'on' this_LCURLY_8= RULE_LCURLY ( (lv_where_9_0= ruleWhere ) ) this_RCURLY_10= RULE_RCURLY otherlv_11= 'do' this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY this_RCURLY_15= RULE_RCURLY ) )
            // InternalAioc.g:237:1: (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ( (lv_functionLocation_3_0= ruleFunctionLocation ) )* (otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) ) )? otherlv_7= 'on' this_LCURLY_8= RULE_LCURLY ( (lv_where_9_0= ruleWhere ) ) this_RCURLY_10= RULE_RCURLY otherlv_11= 'do' this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY this_RCURLY_15= RULE_RCURLY )
            {
            // InternalAioc.g:237:1: (otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ( (lv_functionLocation_3_0= ruleFunctionLocation ) )* (otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) ) )? otherlv_7= 'on' this_LCURLY_8= RULE_LCURLY ( (lv_where_9_0= ruleWhere ) ) this_RCURLY_10= RULE_RCURLY otherlv_11= 'do' this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY this_RCURLY_15= RULE_RCURLY )
            // InternalAioc.g:237:3: otherlv_0= 'rule' this_LCURLY_1= RULE_LCURLY ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ( (lv_functionLocation_3_0= ruleFunctionLocation ) )* (otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) ) )? otherlv_7= 'on' this_LCURLY_8= RULE_LCURLY ( (lv_where_9_0= ruleWhere ) ) this_RCURLY_10= RULE_RCURLY otherlv_11= 'do' this_LCURLY_12= RULE_LCURLY ( (lv_choreography_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY this_RCURLY_15= RULE_RCURLY
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                  
            }
            this_LCURLY_1=(Token)match(input,RULE_LCURLY,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_1, grammarAccess.getRuleAccess().getLCURLYTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:245:1: ( (lv_locDefinition_2_0= ruleLocationDefinition ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAioc.g:246:1: (lv_locDefinition_2_0= ruleLocationDefinition )
                    {
                    // InternalAioc.g:246:1: (lv_locDefinition_2_0= ruleLocationDefinition )
                    // InternalAioc.g:247:3: lv_locDefinition_2_0= ruleLocationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getLocDefinitionLocationDefinitionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_locDefinition_2_0=ruleLocationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"locDefinition",
                              		lv_locDefinition_2_0, 
                              		"org.Aioc.LocationDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalAioc.g:263:3: ( (lv_functionLocation_3_0= ruleFunctionLocation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==48) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAioc.g:264:1: (lv_functionLocation_3_0= ruleFunctionLocation )
            	    {
            	    // InternalAioc.g:264:1: (lv_functionLocation_3_0= ruleFunctionLocation )
            	    // InternalAioc.g:265:3: lv_functionLocation_3_0= ruleFunctionLocation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleAccess().getFunctionLocationFunctionLocationParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_functionLocation_3_0=ruleFunctionLocation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionLocation",
            	              		lv_functionLocation_3_0, 
            	              		"org.Aioc.FunctionLocation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalAioc.g:281:3: (otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAioc.g:281:5: otherlv_4= 'newRoles' this_COLON_5= RULE_COLON ( (lv_newRoles_6_0= ruleNewRole ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getNewRolesKeyword_4_0());
                          
                    }
                    this_COLON_5=(Token)match(input,RULE_COLON,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_5, grammarAccess.getRuleAccess().getCOLONTerminalRuleCall_4_1()); 
                          
                    }
                    // InternalAioc.g:289:1: ( (lv_newRoles_6_0= ruleNewRole ) )
                    // InternalAioc.g:290:1: (lv_newRoles_6_0= ruleNewRole )
                    {
                    // InternalAioc.g:290:1: (lv_newRoles_6_0= ruleNewRole )
                    // InternalAioc.g:291:3: lv_newRoles_6_0= ruleNewRole
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleAccess().getNewRolesNewRoleParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_newRoles_6_0=ruleNewRole();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleRule());
                      	        }
                             		set(
                             			current, 
                             			"newRoles",
                              		lv_newRoles_6_0, 
                              		"org.Aioc.NewRole");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,42,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getOnKeyword_5());
                  
            }
            this_LCURLY_8=(Token)match(input,RULE_LCURLY,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_8, grammarAccess.getRuleAccess().getLCURLYTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:315:1: ( (lv_where_9_0= ruleWhere ) )
            // InternalAioc.g:316:1: (lv_where_9_0= ruleWhere )
            {
            // InternalAioc.g:316:1: (lv_where_9_0= ruleWhere )
            // InternalAioc.g:317:3: lv_where_9_0= ruleWhere
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getWhereWhereParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_where_9_0=ruleWhere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"where",
                      		lv_where_9_0, 
                      		"org.Aioc.Where");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_10=(Token)match(input,RULE_RCURLY,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_10, grammarAccess.getRuleAccess().getRCURLYTerminalRuleCall_8()); 
                  
            }
            otherlv_11=(Token)match(input,43,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getDoKeyword_9());
                  
            }
            this_LCURLY_12=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_12, grammarAccess.getRuleAccess().getLCURLYTerminalRuleCall_10()); 
                  
            }
            // InternalAioc.g:345:1: ( (lv_choreography_13_0= ruleChoreography ) )
            // InternalAioc.g:346:1: (lv_choreography_13_0= ruleChoreography )
            {
            // InternalAioc.g:346:1: (lv_choreography_13_0= ruleChoreography )
            // InternalAioc.g:347:3: lv_choreography_13_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleAccess().getChoreographyChoreographyParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_13_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_13_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_14=(Token)match(input,RULE_RCURLY,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_14, grammarAccess.getRuleAccess().getRCURLYTerminalRuleCall_12()); 
                  
            }
            this_RCURLY_15=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_15, grammarAccess.getRuleAccess().getRCURLYTerminalRuleCall_13()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleNewRole"
    // InternalAioc.g:379:1: entryRuleNewRole returns [EObject current=null] : iv_ruleNewRole= ruleNewRole EOF ;
    public final EObject entryRuleNewRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewRole = null;


        try {
            // InternalAioc.g:380:2: (iv_ruleNewRole= ruleNewRole EOF )
            // InternalAioc.g:381:2: iv_ruleNewRole= ruleNewRole EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNewRoleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNewRole=ruleNewRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNewRole; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewRole"


    // $ANTLR start "ruleNewRole"
    // InternalAioc.g:388:1: ruleNewRole returns [EObject current=null] : ( ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ) | ( (lv_role_5_0= RULE_ID ) ) ) (this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) ) )? ) ;
    public final EObject ruleNewRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_AT_1=null;
        Token lv_role_2_0=null;
        Token this_COLON_3=null;
        Token lv_location_4_0=null;
        Token lv_role_5_0=null;
        Token this_COMMA_6=null;
        EObject lv_nextRole_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:391:28: ( ( ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ) | ( (lv_role_5_0= RULE_ID ) ) ) (this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) ) )? ) )
            // InternalAioc.g:392:1: ( ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ) | ( (lv_role_5_0= RULE_ID ) ) ) (this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) ) )? )
            {
            // InternalAioc.g:392:1: ( ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ) | ( (lv_role_5_0= RULE_ID ) ) ) (this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) ) )? )
            // InternalAioc.g:392:2: ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ) | ( (lv_role_5_0= RULE_ID ) ) ) (this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) ) )?
            {
            // InternalAioc.g:392:2: ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ) | ( (lv_role_5_0= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAioc.g:392:3: (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) )
                    {
                    // InternalAioc.g:392:3: (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) )
                    // InternalAioc.g:392:5: otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getNewRoleAccess().getLocationKeyword_0_0_0());
                          
                    }
                    this_AT_1=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_1, grammarAccess.getNewRoleAccess().getATTerminalRuleCall_0_0_1()); 
                          
                    }
                    // InternalAioc.g:400:1: ( (lv_role_2_0= RULE_ID ) )
                    // InternalAioc.g:401:1: (lv_role_2_0= RULE_ID )
                    {
                    // InternalAioc.g:401:1: (lv_role_2_0= RULE_ID )
                    // InternalAioc.g:402:3: lv_role_2_0= RULE_ID
                    {
                    lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_role_2_0, grammarAccess.getNewRoleAccess().getRoleIDTerminalRuleCall_0_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewRoleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"role",
                              		lv_role_2_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_3, grammarAccess.getNewRoleAccess().getCOLONTerminalRuleCall_0_0_3()); 
                          
                    }
                    // InternalAioc.g:422:1: ( (lv_location_4_0= RULE_STRING ) )
                    // InternalAioc.g:423:1: (lv_location_4_0= RULE_STRING )
                    {
                    // InternalAioc.g:423:1: (lv_location_4_0= RULE_STRING )
                    // InternalAioc.g:424:3: lv_location_4_0= RULE_STRING
                    {
                    lv_location_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_location_4_0, grammarAccess.getNewRoleAccess().getLocationSTRINGTerminalRuleCall_0_0_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewRoleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"location",
                              		lv_location_4_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:441:6: ( (lv_role_5_0= RULE_ID ) )
                    {
                    // InternalAioc.g:441:6: ( (lv_role_5_0= RULE_ID ) )
                    // InternalAioc.g:442:1: (lv_role_5_0= RULE_ID )
                    {
                    // InternalAioc.g:442:1: (lv_role_5_0= RULE_ID )
                    // InternalAioc.g:443:3: lv_role_5_0= RULE_ID
                    {
                    lv_role_5_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_role_5_0, grammarAccess.getNewRoleAccess().getRoleIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNewRoleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"role",
                              		lv_role_5_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAioc.g:459:3: (this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_COMMA) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalAioc.g:459:4: this_COMMA_6= RULE_COMMA ( (lv_nextRole_7_0= ruleNewRole ) )
                    {
                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_6, grammarAccess.getNewRoleAccess().getCOMMATerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:463:1: ( (lv_nextRole_7_0= ruleNewRole ) )
                    // InternalAioc.g:464:1: (lv_nextRole_7_0= ruleNewRole )
                    {
                    // InternalAioc.g:464:1: (lv_nextRole_7_0= ruleNewRole )
                    // InternalAioc.g:465:3: lv_nextRole_7_0= ruleNewRole
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNewRoleAccess().getNextRoleNewRoleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_nextRole_7_0=ruleNewRole();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNewRoleRule());
                      	        }
                             		set(
                             			current, 
                             			"nextRole",
                              		lv_nextRole_7_0, 
                              		"org.Aioc.NewRole");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewRole"


    // $ANTLR start "entryRuleWhere"
    // InternalAioc.g:489:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalAioc.g:490:2: (iv_ruleWhere= ruleWhere EOF )
            // InternalAioc.g:491:2: iv_ruleWhere= ruleWhere EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhere; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalAioc.g:498:1: ruleWhere returns [EObject current=null] : ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token lv_paren_1_0=null;
        Token this_RRND_3=null;
        EObject lv_whereCondition_0_0 = null;

        EObject lv_whereCondition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:501:28: ( ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) ) )
            // InternalAioc.g:502:1: ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) )
            {
            // InternalAioc.g:502:1: ( ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) ) | ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=RULE_TRUE && LA9_0<=RULE_FALSE)||LA9_0==RULE_INT||(LA9_0>=45 && LA9_0<=46)) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_LRND) && (synpred1_InternalAioc())) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAioc.g:502:2: ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) )
                    {
                    // InternalAioc.g:502:2: ( (lv_whereCondition_0_0= ruleWhereCompareCondition ) )
                    // InternalAioc.g:503:1: (lv_whereCondition_0_0= ruleWhereCompareCondition )
                    {
                    // InternalAioc.g:503:1: (lv_whereCondition_0_0= ruleWhereCompareCondition )
                    // InternalAioc.g:504:3: lv_whereCondition_0_0= ruleWhereCompareCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereAccess().getWhereConditionWhereCompareConditionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_whereCondition_0_0=ruleWhereCompareCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereRule());
                      	        }
                             		set(
                             			current, 
                             			"whereCondition",
                              		lv_whereCondition_0_0, 
                              		"org.Aioc.WhereCompareCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:521:6: ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND )
                    {
                    // InternalAioc.g:521:6: ( ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND )
                    // InternalAioc.g:521:7: ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) ) ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) ) this_RRND_3= RULE_RRND
                    {
                    // InternalAioc.g:521:7: ( ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND ) )
                    // InternalAioc.g:521:8: ( ( RULE_LRND ) )=> (lv_paren_1_0= RULE_LRND )
                    {
                    // InternalAioc.g:527:1: (lv_paren_1_0= RULE_LRND )
                    // InternalAioc.g:528:3: lv_paren_1_0= RULE_LRND
                    {
                    lv_paren_1_0=(Token)match(input,RULE_LRND,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_paren_1_0, grammarAccess.getWhereAccess().getParenLRNDTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"paren",
                              		true, 
                              		"org.Aioc.LRND");
                      	    
                    }

                    }


                    }

                    // InternalAioc.g:544:2: ( (lv_whereCondition_2_0= ruleWhereCompareCondition ) )
                    // InternalAioc.g:545:1: (lv_whereCondition_2_0= ruleWhereCompareCondition )
                    {
                    // InternalAioc.g:545:1: (lv_whereCondition_2_0= ruleWhereCompareCondition )
                    // InternalAioc.g:546:3: lv_whereCondition_2_0= ruleWhereCompareCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereAccess().getWhereConditionWhereCompareConditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_whereCondition_2_0=ruleWhereCompareCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereRule());
                      	        }
                             		set(
                             			current, 
                             			"whereCondition",
                              		lv_whereCondition_2_0, 
                              		"org.Aioc.WhereCompareCondition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_3=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_3, grammarAccess.getWhereAccess().getRRNDTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleWhereCompareCondition"
    // InternalAioc.g:574:1: entryRuleWhereCompareCondition returns [EObject current=null] : iv_ruleWhereCompareCondition= ruleWhereCompareCondition EOF ;
    public final EObject entryRuleWhereCompareCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereCompareCondition = null;


        try {
            // InternalAioc.g:575:2: (iv_ruleWhereCompareCondition= ruleWhereCompareCondition EOF )
            // InternalAioc.g:576:2: iv_ruleWhereCompareCondition= ruleWhereCompareCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereCompareConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhereCompareCondition=ruleWhereCompareCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereCompareCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereCompareCondition"


    // $ANTLR start "ruleWhereCompareCondition"
    // InternalAioc.g:583:1: ruleWhereCompareCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleWhereExpressionBasicTerm ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? ) ;
    public final EObject ruleWhereCompareCondition() throws RecognitionException {
        EObject current = null;

        Token lv_and_3_0=null;
        Token lv_or_4_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_next_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:586:28: ( ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleWhereExpressionBasicTerm ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? ) )
            // InternalAioc.g:587:1: ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleWhereExpressionBasicTerm ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? )
            {
            // InternalAioc.g:587:1: ( ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleWhereExpressionBasicTerm ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )? )
            // InternalAioc.g:587:2: ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) ) ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleWhereExpressionBasicTerm ) ) ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )?
            {
            // InternalAioc.g:587:2: ( (lv_left_0_0= ruleWhereExpressionBasicTerm ) )
            // InternalAioc.g:588:1: (lv_left_0_0= ruleWhereExpressionBasicTerm )
            {
            // InternalAioc.g:588:1: (lv_left_0_0= ruleWhereExpressionBasicTerm )
            // InternalAioc.g:589:3: lv_left_0_0= ruleWhereExpressionBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getLeftWhereExpressionBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
            lv_left_0_0=ruleWhereExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"org.Aioc.WhereExpressionBasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:605:2: ( (lv_operator_1_0= ruleConditionOperator ) )
            // InternalAioc.g:606:1: (lv_operator_1_0= ruleConditionOperator )
            {
            // InternalAioc.g:606:1: (lv_operator_1_0= ruleConditionOperator )
            // InternalAioc.g:607:3: lv_operator_1_0= ruleConditionOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_21);
            lv_operator_1_0=ruleConditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_1_0, 
                      		"org.Aioc.ConditionOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:623:2: ( (lv_right_2_0= ruleWhereExpressionBasicTerm ) )
            // InternalAioc.g:624:1: (lv_right_2_0= ruleWhereExpressionBasicTerm )
            {
            // InternalAioc.g:624:1: (lv_right_2_0= ruleWhereExpressionBasicTerm )
            // InternalAioc.g:625:3: lv_right_2_0= ruleWhereExpressionBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getRightWhereExpressionBasicTermParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_right_2_0=ruleWhereExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"org.Aioc.WhereExpressionBasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:641:2: ( ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_AND && LA11_0<=RULE_OR)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAioc.g:641:3: ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) ) ( (lv_next_5_0= ruleWhere ) )
                    {
                    // InternalAioc.g:641:3: ( ( (lv_and_3_0= RULE_AND ) ) | ( (lv_or_4_0= RULE_OR ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_AND) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_OR) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalAioc.g:641:4: ( (lv_and_3_0= RULE_AND ) )
                            {
                            // InternalAioc.g:641:4: ( (lv_and_3_0= RULE_AND ) )
                            // InternalAioc.g:642:1: (lv_and_3_0= RULE_AND )
                            {
                            // InternalAioc.g:642:1: (lv_and_3_0= RULE_AND )
                            // InternalAioc.g:643:3: lv_and_3_0= RULE_AND
                            {
                            lv_and_3_0=(Token)match(input,RULE_AND,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_and_3_0, grammarAccess.getWhereCompareConditionAccess().getAndANDTerminalRuleCall_3_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getWhereCompareConditionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"and",
                                      		true, 
                                      		"org.Aioc.AND");
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAioc.g:660:6: ( (lv_or_4_0= RULE_OR ) )
                            {
                            // InternalAioc.g:660:6: ( (lv_or_4_0= RULE_OR ) )
                            // InternalAioc.g:661:1: (lv_or_4_0= RULE_OR )
                            {
                            // InternalAioc.g:661:1: (lv_or_4_0= RULE_OR )
                            // InternalAioc.g:662:3: lv_or_4_0= RULE_OR
                            {
                            lv_or_4_0=(Token)match(input,RULE_OR,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_or_4_0, grammarAccess.getWhereCompareConditionAccess().getOrORTerminalRuleCall_3_0_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getWhereCompareConditionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"or",
                                      		true, 
                                      		"org.Aioc.OR");
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalAioc.g:678:3: ( (lv_next_5_0= ruleWhere ) )
                    // InternalAioc.g:679:1: (lv_next_5_0= ruleWhere )
                    {
                    // InternalAioc.g:679:1: (lv_next_5_0= ruleWhere )
                    // InternalAioc.g:680:3: lv_next_5_0= ruleWhere
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereCompareConditionAccess().getNextWhereParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_5_0=ruleWhere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereCompareConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"next",
                              		lv_next_5_0, 
                              		"org.Aioc.Where");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereCompareCondition"


    // $ANTLR start "entryRuleWhereExpressionBasicTerm"
    // InternalAioc.g:704:1: entryRuleWhereExpressionBasicTerm returns [EObject current=null] : iv_ruleWhereExpressionBasicTerm= ruleWhereExpressionBasicTerm EOF ;
    public final EObject entryRuleWhereExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereExpressionBasicTerm = null;


        try {
            // InternalAioc.g:705:2: (iv_ruleWhereExpressionBasicTerm= ruleWhereExpressionBasicTerm EOF )
            // InternalAioc.g:706:2: iv_ruleWhereExpressionBasicTerm= ruleWhereExpressionBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhereExpressionBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhereExpressionBasicTerm=ruleWhereExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhereExpressionBasicTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereExpressionBasicTerm"


    // $ANTLR start "ruleWhereExpressionBasicTerm"
    // InternalAioc.g:713:1: ruleWhereExpressionBasicTerm returns [EObject current=null] : ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_constant_5_0= ruleConstant ) ) ) ;
    public final EObject ruleWhereExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nVariable_1_0=null;
        Token otherlv_2=null;
        Token lv_eVariable_3_0=null;
        Token lv_sVariable_4_0=null;
        EObject lv_constant_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:716:28: ( ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_constant_5_0= ruleConstant ) ) ) )
            // InternalAioc.g:717:1: ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_constant_5_0= ruleConstant ) ) )
            {
            // InternalAioc.g:717:1: ( (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) ) | (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) ) | ( (lv_sVariable_4_0= RULE_ID ) ) | ( (lv_constant_5_0= ruleConstant ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt12=1;
                }
                break;
            case 46:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
                {
                alt12=3;
                }
                break;
            case RULE_STRING:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_INT:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAioc.g:717:2: (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) )
                    {
                    // InternalAioc.g:717:2: (otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) ) )
                    // InternalAioc.g:717:4: otherlv_0= 'N.' ( (lv_nVariable_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getWhereExpressionBasicTermAccess().getNKeyword_0_0());
                          
                    }
                    // InternalAioc.g:721:1: ( (lv_nVariable_1_0= RULE_ID ) )
                    // InternalAioc.g:722:1: (lv_nVariable_1_0= RULE_ID )
                    {
                    // InternalAioc.g:722:1: (lv_nVariable_1_0= RULE_ID )
                    // InternalAioc.g:723:3: lv_nVariable_1_0= RULE_ID
                    {
                    lv_nVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_nVariable_1_0, grammarAccess.getWhereExpressionBasicTermAccess().getNVariableIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"nVariable",
                              		lv_nVariable_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:740:6: (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) )
                    {
                    // InternalAioc.g:740:6: (otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) ) )
                    // InternalAioc.g:740:8: otherlv_2= 'E.' ( (lv_eVariable_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getWhereExpressionBasicTermAccess().getEKeyword_1_0());
                          
                    }
                    // InternalAioc.g:744:1: ( (lv_eVariable_3_0= RULE_ID ) )
                    // InternalAioc.g:745:1: (lv_eVariable_3_0= RULE_ID )
                    {
                    // InternalAioc.g:745:1: (lv_eVariable_3_0= RULE_ID )
                    // InternalAioc.g:746:3: lv_eVariable_3_0= RULE_ID
                    {
                    lv_eVariable_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_eVariable_3_0, grammarAccess.getWhereExpressionBasicTermAccess().getEVariableIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"eVariable",
                              		lv_eVariable_3_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:763:6: ( (lv_sVariable_4_0= RULE_ID ) )
                    {
                    // InternalAioc.g:763:6: ( (lv_sVariable_4_0= RULE_ID ) )
                    // InternalAioc.g:764:1: (lv_sVariable_4_0= RULE_ID )
                    {
                    // InternalAioc.g:764:1: (lv_sVariable_4_0= RULE_ID )
                    // InternalAioc.g:765:3: lv_sVariable_4_0= RULE_ID
                    {
                    lv_sVariable_4_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sVariable_4_0, grammarAccess.getWhereExpressionBasicTermAccess().getSVariableIDTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sVariable",
                              		lv_sVariable_4_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:782:6: ( (lv_constant_5_0= ruleConstant ) )
                    {
                    // InternalAioc.g:782:6: ( (lv_constant_5_0= ruleConstant ) )
                    // InternalAioc.g:783:1: (lv_constant_5_0= ruleConstant )
                    {
                    // InternalAioc.g:783:1: (lv_constant_5_0= ruleConstant )
                    // InternalAioc.g:784:3: lv_constant_5_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getWhereExpressionBasicTermAccess().getConstantConstantParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_constant_5_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getWhereExpressionBasicTermRule());
                      	        }
                             		set(
                             			current, 
                             			"constant",
                              		lv_constant_5_0, 
                              		"org.Aioc.Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereExpressionBasicTerm"


    // $ANTLR start "entryRulePreamble"
    // InternalAioc.g:808:1: entryRulePreamble returns [EObject current=null] : iv_rulePreamble= rulePreamble EOF ;
    public final EObject entryRulePreamble() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreamble = null;


        try {
            // InternalAioc.g:809:2: (iv_rulePreamble= rulePreamble EOF )
            // InternalAioc.g:810:2: iv_rulePreamble= rulePreamble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreambleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePreamble=rulePreamble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreamble; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreamble"


    // $ANTLR start "rulePreamble"
    // InternalAioc.g:817:1: rulePreamble returns [EObject current=null] : (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ) ;
    public final EObject rulePreamble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_starter_1_0=null;
        EObject lv_locDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:820:28: ( (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? ) )
            // InternalAioc.g:821:1: (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? )
            {
            // InternalAioc.g:821:1: (otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )? )
            // InternalAioc.g:821:3: otherlv_0= 'starter:' ( (lv_starter_1_0= RULE_ID ) ) ( (lv_locDefinition_2_0= ruleLocationDefinition ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPreambleAccess().getStarterKeyword_0());
                  
            }
            // InternalAioc.g:825:1: ( (lv_starter_1_0= RULE_ID ) )
            // InternalAioc.g:826:1: (lv_starter_1_0= RULE_ID )
            {
            // InternalAioc.g:826:1: (lv_starter_1_0= RULE_ID )
            // InternalAioc.g:827:3: lv_starter_1_0= RULE_ID
            {
            lv_starter_1_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_starter_1_0, grammarAccess.getPreambleAccess().getStarterIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPreambleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"starter",
                      		lv_starter_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAioc.g:843:2: ( (lv_locDefinition_2_0= ruleLocationDefinition ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAioc.g:844:1: (lv_locDefinition_2_0= ruleLocationDefinition )
                    {
                    // InternalAioc.g:844:1: (lv_locDefinition_2_0= ruleLocationDefinition )
                    // InternalAioc.g:845:3: lv_locDefinition_2_0= ruleLocationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPreambleAccess().getLocDefinitionLocationDefinitionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_locDefinition_2_0=ruleLocationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPreambleRule());
                      	        }
                             		set(
                             			current, 
                             			"locDefinition",
                              		lv_locDefinition_2_0, 
                              		"org.Aioc.LocationDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreamble"


    // $ANTLR start "entryRuleFunctionLocation"
    // InternalAioc.g:869:1: entryRuleFunctionLocation returns [EObject current=null] : iv_ruleFunctionLocation= ruleFunctionLocation EOF ;
    public final EObject entryRuleFunctionLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLocation = null;


        try {
            // InternalAioc.g:870:2: (iv_ruleFunctionLocation= ruleFunctionLocation EOF )
            // InternalAioc.g:871:2: iv_ruleFunctionLocation= ruleFunctionLocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLocationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionLocation=ruleFunctionLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLocation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionLocation"


    // $ANTLR start "ruleFunctionLocation"
    // InternalAioc.g:878:1: ruleFunctionLocation returns [EObject current=null] : (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleFunctionLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_location_3_0=null;
        Token otherlv_4=null;
        Token lv_protocol_5_0=null;
        EObject lv_functions_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:881:28: ( (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? ) )
            // InternalAioc.g:882:1: (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? )
            {
            // InternalAioc.g:882:1: (otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )? )
            // InternalAioc.g:882:3: otherlv_0= 'include' ( (lv_functions_1_0= ruleFunctionList ) ) otherlv_2= 'from' ( (lv_location_3_0= RULE_STRING ) ) (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionLocationAccess().getIncludeKeyword_0());
                  
            }
            // InternalAioc.g:886:1: ( (lv_functions_1_0= ruleFunctionList ) )
            // InternalAioc.g:887:1: (lv_functions_1_0= ruleFunctionList )
            {
            // InternalAioc.g:887:1: (lv_functions_1_0= ruleFunctionList )
            // InternalAioc.g:888:3: lv_functions_1_0= ruleFunctionList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLocationAccess().getFunctionsFunctionListParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
            lv_functions_1_0=ruleFunctionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionLocationRule());
              	        }
                     		set(
                     			current, 
                     			"functions",
                      		lv_functions_1_0, 
                      		"org.Aioc.FunctionList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionLocationAccess().getFromKeyword_2());
                  
            }
            // InternalAioc.g:908:1: ( (lv_location_3_0= RULE_STRING ) )
            // InternalAioc.g:909:1: (lv_location_3_0= RULE_STRING )
            {
            // InternalAioc.g:909:1: (lv_location_3_0= RULE_STRING )
            // InternalAioc.g:910:3: lv_location_3_0= RULE_STRING
            {
            lv_location_3_0=(Token)match(input,RULE_STRING,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_location_3_0, grammarAccess.getFunctionLocationAccess().getLocationSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionLocationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"location",
                      		lv_location_3_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalAioc.g:926:2: (otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==50) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAioc.g:926:4: otherlv_4= 'with' ( (lv_protocol_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getFunctionLocationAccess().getWithKeyword_4_0());
                          
                    }
                    // InternalAioc.g:930:1: ( (lv_protocol_5_0= RULE_STRING ) )
                    // InternalAioc.g:931:1: (lv_protocol_5_0= RULE_STRING )
                    {
                    // InternalAioc.g:931:1: (lv_protocol_5_0= RULE_STRING )
                    // InternalAioc.g:932:3: lv_protocol_5_0= RULE_STRING
                    {
                    lv_protocol_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_protocol_5_0, grammarAccess.getFunctionLocationAccess().getProtocolSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionLocationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"protocol",
                              		lv_protocol_5_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionLocation"


    // $ANTLR start "entryRuleFunctionList"
    // InternalAioc.g:956:1: entryRuleFunctionList returns [EObject current=null] : iv_ruleFunctionList= ruleFunctionList EOF ;
    public final EObject entryRuleFunctionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionList = null;


        try {
            // InternalAioc.g:957:2: (iv_ruleFunctionList= ruleFunctionList EOF )
            // InternalAioc.g:958:2: iv_ruleFunctionList= ruleFunctionList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionList=ruleFunctionList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionList"


    // $ANTLR start "ruleFunctionList"
    // InternalAioc.g:965:1: ruleFunctionList returns [EObject current=null] : ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleFunctionList() throws RecognitionException {
        EObject current = null;

        Token lv_functionName_0_0=null;
        Token this_COMMA_1=null;
        Token lv_functionName_2_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:968:28: ( ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* ) )
            // InternalAioc.g:969:1: ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* )
            {
            // InternalAioc.g:969:1: ( ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )* )
            // InternalAioc.g:969:2: ( (lv_functionName_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )*
            {
            // InternalAioc.g:969:2: ( (lv_functionName_0_0= RULE_ID ) )
            // InternalAioc.g:970:1: (lv_functionName_0_0= RULE_ID )
            {
            // InternalAioc.g:970:1: (lv_functionName_0_0= RULE_ID )
            // InternalAioc.g:971:3: lv_functionName_0_0= RULE_ID
            {
            lv_functionName_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_0_0, grammarAccess.getFunctionListAccess().getFunctionNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionListRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAioc.g:987:2: (this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAioc.g:987:3: this_COMMA_1= RULE_COMMA ( (lv_functionName_2_0= RULE_ID ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getFunctionListAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // InternalAioc.g:991:1: ( (lv_functionName_2_0= RULE_ID ) )
            	    // InternalAioc.g:992:1: (lv_functionName_2_0= RULE_ID )
            	    {
            	    // InternalAioc.g:992:1: (lv_functionName_2_0= RULE_ID )
            	    // InternalAioc.g:993:3: lv_functionName_2_0= RULE_ID
            	    {
            	    lv_functionName_2_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_functionName_2_0, grammarAccess.getFunctionListAccess().getFunctionNameIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getFunctionListRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"functionName",
            	              		lv_functionName_2_0, 
            	              		"org.eclipse.xtext.common.Terminals.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionList"


    // $ANTLR start "entryRuleLocationDefinition"
    // InternalAioc.g:1017:1: entryRuleLocationDefinition returns [EObject current=null] : iv_ruleLocationDefinition= ruleLocationDefinition EOF ;
    public final EObject entryRuleLocationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationDefinition = null;


        try {
            // InternalAioc.g:1018:2: (iv_ruleLocationDefinition= ruleLocationDefinition EOF )
            // InternalAioc.g:1019:2: iv_ruleLocationDefinition= ruleLocationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocationDefinition=ruleLocationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocationDefinition"


    // $ANTLR start "ruleLocationDefinition"
    // InternalAioc.g:1026:1: ruleLocationDefinition returns [EObject current=null] : (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? ) ;
    public final EObject ruleLocationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_AT_1=null;
        Token lv_role_2_0=null;
        Token this_COLON_3=null;
        Token lv_location_4_0=null;
        EObject lv_continuation_5_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1029:28: ( (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? ) )
            // InternalAioc.g:1030:1: (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? )
            {
            // InternalAioc.g:1030:1: (otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )? )
            // InternalAioc.g:1030:3: otherlv_0= 'location' this_AT_1= RULE_AT ( (lv_role_2_0= RULE_ID ) ) this_COLON_3= RULE_COLON ( (lv_location_4_0= RULE_STRING ) ) ( (lv_continuation_5_0= ruleLocationDefinition ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationDefinitionAccess().getLocationKeyword_0());
                  
            }
            this_AT_1=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_1, grammarAccess.getLocationDefinitionAccess().getATTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:1038:1: ( (lv_role_2_0= RULE_ID ) )
            // InternalAioc.g:1039:1: (lv_role_2_0= RULE_ID )
            {
            // InternalAioc.g:1039:1: (lv_role_2_0= RULE_ID )
            // InternalAioc.g:1040:3: lv_role_2_0= RULE_ID
            {
            lv_role_2_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_role_2_0, grammarAccess.getLocationDefinitionAccess().getRoleIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocationDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"role",
                      		lv_role_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_COLON_3=(Token)match(input,RULE_COLON,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_3, grammarAccess.getLocationDefinitionAccess().getCOLONTerminalRuleCall_3()); 
                  
            }
            // InternalAioc.g:1060:1: ( (lv_location_4_0= RULE_STRING ) )
            // InternalAioc.g:1061:1: (lv_location_4_0= RULE_STRING )
            {
            // InternalAioc.g:1061:1: (lv_location_4_0= RULE_STRING )
            // InternalAioc.g:1062:3: lv_location_4_0= RULE_STRING
            {
            lv_location_4_0=(Token)match(input,RULE_STRING,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_location_4_0, grammarAccess.getLocationDefinitionAccess().getLocationSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocationDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"location",
                      		lv_location_4_0, 
                      		"org.eclipse.xtext.common.Terminals.STRING");
              	    
            }

            }


            }

            // InternalAioc.g:1078:2: ( (lv_continuation_5_0= ruleLocationDefinition ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==44) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAioc.g:1079:1: (lv_continuation_5_0= ruleLocationDefinition )
                    {
                    // InternalAioc.g:1079:1: (lv_continuation_5_0= ruleLocationDefinition )
                    // InternalAioc.g:1080:3: lv_continuation_5_0= ruleLocationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocationDefinitionAccess().getContinuationLocationDefinitionParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_continuation_5_0=ruleLocationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"continuation",
                              		lv_continuation_5_0, 
                              		"org.Aioc.LocationDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocationDefinition"


    // $ANTLR start "entryRuleChoreography"
    // InternalAioc.g:1104:1: entryRuleChoreography returns [EObject current=null] : iv_ruleChoreography= ruleChoreography EOF ;
    public final EObject entryRuleChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChoreography = null;


        try {
            // InternalAioc.g:1105:2: (iv_ruleChoreography= ruleChoreography EOF )
            // InternalAioc.g:1106:2: iv_ruleChoreography= ruleChoreography EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChoreographyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChoreography=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChoreography; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChoreography"


    // $ANTLR start "ruleChoreography"
    // InternalAioc.g:1113:1: ruleChoreography returns [EObject current=null] : ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleChoreography() throws RecognitionException {
        EObject current = null;

        Token this_PIPE_1=null;
        EObject lv_seqBlock_0_0 = null;

        EObject lv_par_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1116:28: ( ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) ) )? ) )
            // InternalAioc.g:1117:1: ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) ) )? )
            {
            // InternalAioc.g:1117:1: ( ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) ) )? )
            // InternalAioc.g:1117:2: ( (lv_seqBlock_0_0= ruleSeqBlock ) ) (this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) ) )?
            {
            // InternalAioc.g:1117:2: ( (lv_seqBlock_0_0= ruleSeqBlock ) )
            // InternalAioc.g:1118:1: (lv_seqBlock_0_0= ruleSeqBlock )
            {
            // InternalAioc.g:1118:1: (lv_seqBlock_0_0= ruleSeqBlock )
            // InternalAioc.g:1119:3: lv_seqBlock_0_0= ruleSeqBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getChoreographyAccess().getSeqBlockSeqBlockParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_28);
            lv_seqBlock_0_0=ruleSeqBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getChoreographyRule());
              	        }
                     		set(
                     			current, 
                     			"seqBlock",
                      		lv_seqBlock_0_0, 
                      		"org.Aioc.SeqBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:1135:2: (this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_PIPE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalAioc.g:1135:3: this_PIPE_1= RULE_PIPE ( (lv_par_2_0= ruleChoreography ) )
                    {
                    this_PIPE_1=(Token)match(input,RULE_PIPE,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PIPE_1, grammarAccess.getChoreographyAccess().getPIPETerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:1139:1: ( (lv_par_2_0= ruleChoreography ) )
                    // InternalAioc.g:1140:1: (lv_par_2_0= ruleChoreography )
                    {
                    // InternalAioc.g:1140:1: (lv_par_2_0= ruleChoreography )
                    // InternalAioc.g:1141:3: lv_par_2_0= ruleChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getChoreographyAccess().getParChoreographyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_par_2_0=ruleChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getChoreographyRule());
                      	        }
                             		set(
                             			current, 
                             			"par",
                              		lv_par_2_0, 
                              		"org.Aioc.Choreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChoreography"


    // $ANTLR start "entryRuleSeqBlock"
    // InternalAioc.g:1165:1: entryRuleSeqBlock returns [EObject current=null] : iv_ruleSeqBlock= ruleSeqBlock EOF ;
    public final EObject entryRuleSeqBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqBlock = null;


        try {
            // InternalAioc.g:1166:2: (iv_ruleSeqBlock= ruleSeqBlock EOF )
            // InternalAioc.g:1167:2: iv_ruleSeqBlock= ruleSeqBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSeqBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSeqBlock=ruleSeqBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSeqBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSeqBlock"


    // $ANTLR start "ruleSeqBlock"
    // InternalAioc.g:1174:1: ruleSeqBlock returns [EObject current=null] : ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) ) )? ) ;
    public final EObject ruleSeqBlock() throws RecognitionException {
        EObject current = null;

        Token this_SEMICOLON_1=null;
        EObject lv_event_0_1 = null;

        EObject lv_event_0_2 = null;

        EObject lv_event_0_3 = null;

        EObject lv_event_0_4 = null;

        EObject lv_event_0_5 = null;

        EObject lv_event_0_6 = null;

        EObject lv_event_0_7 = null;

        EObject lv_next_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1177:28: ( ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) ) )? ) )
            // InternalAioc.g:1178:1: ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) ) )? )
            {
            // InternalAioc.g:1178:1: ( ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) ) )? )
            // InternalAioc.g:1178:2: ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) ) (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) ) )?
            {
            // InternalAioc.g:1178:2: ( ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) ) )
            // InternalAioc.g:1179:1: ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) )
            {
            // InternalAioc.g:1179:1: ( (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography ) )
            // InternalAioc.g:1180:1: (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography )
            {
            // InternalAioc.g:1180:1: (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalAioc.g:1181:3: lv_event_0_1= ruleSkip
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventSkipParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_1=ruleSkip();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_1, 
                              		"org.Aioc.Skip");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalAioc.g:1196:8: lv_event_0_2= ruleInteraction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventInteractionParserRuleCall_0_0_1()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_2=ruleInteraction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_2, 
                              		"org.Aioc.Interaction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 3 :
                    // InternalAioc.g:1211:8: lv_event_0_3= ruleLocalCode
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventLocalCodeParserRuleCall_0_0_2()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_3=ruleLocalCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_3, 
                              		"org.Aioc.LocalCode");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 4 :
                    // InternalAioc.g:1226:8: lv_event_0_4= ruleIfThenElse
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventIfThenElseParserRuleCall_0_0_3()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_4=ruleIfThenElse();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_4, 
                              		"org.Aioc.IfThenElse");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 5 :
                    // InternalAioc.g:1241:8: lv_event_0_5= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventWhileParserRuleCall_0_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_5=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_5, 
                              		"org.Aioc.While");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 6 :
                    // InternalAioc.g:1256:8: lv_event_0_6= ruleScope
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventScopeParserRuleCall_0_0_5()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_6=ruleScope();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_6, 
                              		"org.Aioc.Scope");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;
                case 7 :
                    // InternalAioc.g:1271:8: lv_event_0_7= ruleNestedChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getEventNestedChoreographyParserRuleCall_0_0_6()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_event_0_7=ruleNestedChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_0_7, 
                              		"org.Aioc.NestedChoreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalAioc.g:1289:2: (this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_SEMICOLON) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAioc.g:1289:3: this_SEMICOLON_1= RULE_SEMICOLON ( (lv_next_2_0= ruleChoreography ) )
                    {
                    this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SEMICOLON_1, grammarAccess.getSeqBlockAccess().getSEMICOLONTerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:1293:1: ( (lv_next_2_0= ruleChoreography ) )
                    // InternalAioc.g:1294:1: (lv_next_2_0= ruleChoreography )
                    {
                    // InternalAioc.g:1294:1: (lv_next_2_0= ruleChoreography )
                    // InternalAioc.g:1295:3: lv_next_2_0= ruleChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSeqBlockAccess().getNextChoreographyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_next_2_0=ruleChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSeqBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"next",
                              		lv_next_2_0, 
                              		"org.Aioc.Choreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSeqBlock"


    // $ANTLR start "entryRuleSkip"
    // InternalAioc.g:1319:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // InternalAioc.g:1320:2: (iv_ruleSkip= ruleSkip EOF )
            // InternalAioc.g:1321:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // InternalAioc.g:1328:1: ruleSkip returns [EObject current=null] : ( (lv_skip_0_0= 'skip' ) ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token lv_skip_0_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:1331:28: ( ( (lv_skip_0_0= 'skip' ) ) )
            // InternalAioc.g:1332:1: ( (lv_skip_0_0= 'skip' ) )
            {
            // InternalAioc.g:1332:1: ( (lv_skip_0_0= 'skip' ) )
            // InternalAioc.g:1333:1: (lv_skip_0_0= 'skip' )
            {
            // InternalAioc.g:1333:1: (lv_skip_0_0= 'skip' )
            // InternalAioc.g:1334:3: lv_skip_0_0= 'skip'
            {
            lv_skip_0_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_skip_0_0, grammarAccess.getSkipAccess().getSkipSkipKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSkipRule());
              	        }
                     		setWithLastConsumed(current, "skip", true, "skip");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleInteraction"
    // InternalAioc.g:1355:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalAioc.g:1356:2: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalAioc.g:1357:2: iv_ruleInteraction= ruleInteraction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteraction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalAioc.g:1364:1: ruleInteraction returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleSumExpression ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token this_COLON_1=null;
        Token lv_sender_2_0=null;
        Token this_LRND_3=null;
        Token this_RRND_5=null;
        Token this_ARROW_6=null;
        Token lv_receiver_7_0=null;
        Token this_LRND_8=null;
        Token lv_receiverVariable_9_0=null;
        Token this_RRND_10=null;
        EObject lv_senderExpression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1367:28: ( ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleSumExpression ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND ) )
            // InternalAioc.g:1368:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleSumExpression ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND )
            {
            // InternalAioc.g:1368:1: ( ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleSumExpression ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND )
            // InternalAioc.g:1368:2: ( (lv_operation_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON ( (lv_sender_2_0= RULE_ID ) ) this_LRND_3= RULE_LRND ( (lv_senderExpression_4_0= ruleSumExpression ) )? this_RRND_5= RULE_RRND this_ARROW_6= RULE_ARROW ( (lv_receiver_7_0= RULE_ID ) ) this_LRND_8= RULE_LRND ( (lv_receiverVariable_9_0= RULE_ID ) )? this_RRND_10= RULE_RRND
            {
            // InternalAioc.g:1368:2: ( (lv_operation_0_0= RULE_ID ) )
            // InternalAioc.g:1369:1: (lv_operation_0_0= RULE_ID )
            {
            // InternalAioc.g:1369:1: (lv_operation_0_0= RULE_ID )
            // InternalAioc.g:1370:3: lv_operation_0_0= RULE_ID
            {
            lv_operation_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_operation_0_0, grammarAccess.getInteractionAccess().getOperationIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"operation",
                      		lv_operation_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COLON_1, grammarAccess.getInteractionAccess().getCOLONTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:1390:1: ( (lv_sender_2_0= RULE_ID ) )
            // InternalAioc.g:1391:1: (lv_sender_2_0= RULE_ID )
            {
            // InternalAioc.g:1391:1: (lv_sender_2_0= RULE_ID )
            // InternalAioc.g:1392:3: lv_sender_2_0= RULE_ID
            {
            lv_sender_2_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_sender_2_0, grammarAccess.getInteractionAccess().getSenderIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"sender",
                      		lv_sender_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LRND_3=(Token)match(input,RULE_LRND,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_3, grammarAccess.getInteractionAccess().getLRNDTerminalRuleCall_3()); 
                  
            }
            // InternalAioc.g:1412:1: ( (lv_senderExpression_4_0= ruleSumExpression ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||LA20_0==RULE_LRND||(LA20_0>=RULE_NOT && LA20_0<=RULE_FALSE)||LA20_0==RULE_INT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAioc.g:1413:1: (lv_senderExpression_4_0= ruleSumExpression )
                    {
                    // InternalAioc.g:1413:1: (lv_senderExpression_4_0= ruleSumExpression )
                    // InternalAioc.g:1414:3: lv_senderExpression_4_0= ruleSumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInteractionAccess().getSenderExpressionSumExpressionParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_senderExpression_4_0=ruleSumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                      	        }
                             		set(
                             			current, 
                             			"senderExpression",
                              		lv_senderExpression_4_0, 
                              		"org.Aioc.SumExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_5, grammarAccess.getInteractionAccess().getRRNDTerminalRuleCall_5()); 
                  
            }
            this_ARROW_6=(Token)match(input,RULE_ARROW,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ARROW_6, grammarAccess.getInteractionAccess().getARROWTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:1438:1: ( (lv_receiver_7_0= RULE_ID ) )
            // InternalAioc.g:1439:1: (lv_receiver_7_0= RULE_ID )
            {
            // InternalAioc.g:1439:1: (lv_receiver_7_0= RULE_ID )
            // InternalAioc.g:1440:3: lv_receiver_7_0= RULE_ID
            {
            lv_receiver_7_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_receiver_7_0, grammarAccess.getInteractionAccess().getReceiverIDTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInteractionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"receiver",
                      		lv_receiver_7_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LRND_8=(Token)match(input,RULE_LRND,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_8, grammarAccess.getInteractionAccess().getLRNDTerminalRuleCall_8()); 
                  
            }
            // InternalAioc.g:1460:1: ( (lv_receiverVariable_9_0= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAioc.g:1461:1: (lv_receiverVariable_9_0= RULE_ID )
                    {
                    // InternalAioc.g:1461:1: (lv_receiverVariable_9_0= RULE_ID )
                    // InternalAioc.g:1462:3: lv_receiverVariable_9_0= RULE_ID
                    {
                    lv_receiverVariable_9_0=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_receiverVariable_9_0, grammarAccess.getInteractionAccess().getReceiverVariableIDTerminalRuleCall_9_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInteractionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"receiverVariable",
                              		lv_receiverVariable_9_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            this_RRND_10=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_10, grammarAccess.getInteractionAccess().getRRNDTerminalRuleCall_10()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLocalCode"
    // InternalAioc.g:1490:1: entryRuleLocalCode returns [EObject current=null] : iv_ruleLocalCode= ruleLocalCode EOF ;
    public final EObject entryRuleLocalCode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalCode = null;


        try {
            // InternalAioc.g:1491:2: (iv_ruleLocalCode= ruleLocalCode EOF )
            // InternalAioc.g:1492:2: iv_ruleLocalCode= ruleLocalCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalCodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalCode=ruleLocalCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalCode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalCode"


    // $ANTLR start "ruleLocalCode"
    // InternalAioc.g:1499:1: ruleLocalCode returns [EObject current=null] : ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) ) ;
    public final EObject ruleLocalCode() throws RecognitionException {
        EObject current = null;

        Token lv_resultVariable_1_0=null;
        Token this_AT_2=null;
        Token lv_thread_3_0=null;
        Token this_ASSIGN_4=null;
        Token otherlv_5=null;
        Token this_LRND_6=null;
        Token this_RRND_8=null;
        Token lv_variable_10_0=null;
        Token this_AT_11=null;
        Token lv_thread_12_0=null;
        Token this_ASSIGN_13=null;
        Token otherlv_14=null;
        Token this_LRND_15=null;
        Token this_RRND_17=null;
        Token lv_variable_19_0=null;
        Token this_AT_20=null;
        Token lv_thread_21_0=null;
        Token this_ASSIGN_22=null;
        EObject lv_question_7_0 = null;

        EObject lv_expression_16_0 = null;

        EObject lv_expression_23_0 = null;

        EObject lv_function_24_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1502:28: ( ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) ) )
            // InternalAioc.g:1503:1: ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) )
            {
            // InternalAioc.g:1503:1: ( ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND ) | ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND ) | ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) ) )
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==RULE_AT) ) {
                    int LA23_2 = input.LA(3);

                    if ( (LA23_2==RULE_ID) ) {
                        int LA23_3 = input.LA(4);

                        if ( (LA23_3==RULE_ASSIGN) ) {
                            switch ( input.LA(5) ) {
                            case 52:
                                {
                                alt23=1;
                                }
                                break;
                            case 53:
                                {
                                alt23=2;
                                }
                                break;
                            case RULE_ID:
                            case RULE_STRING:
                            case RULE_LRND:
                            case RULE_NOT:
                            case RULE_TRUE:
                            case RULE_FALSE:
                            case RULE_INT:
                                {
                                alt23=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 23, 4, input);

                                throw nvae;
                            }

                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAioc.g:1503:2: ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND )
                    {
                    // InternalAioc.g:1503:2: ( () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND )
                    // InternalAioc.g:1503:3: () ( (lv_resultVariable_1_0= RULE_ID ) ) this_AT_2= RULE_AT ( (lv_thread_3_0= RULE_ID ) ) this_ASSIGN_4= RULE_ASSIGN otherlv_5= 'getInput' this_LRND_6= RULE_LRND ( (lv_question_7_0= ruleExpression ) ) this_RRND_8= RULE_RRND
                    {
                    // InternalAioc.g:1503:3: ()
                    // InternalAioc.g:1504:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLocalCodeAccess().getLocalAskCommandAction_0_0(),
                                  current);
                          
                    }

                    }

                    // InternalAioc.g:1509:2: ( (lv_resultVariable_1_0= RULE_ID ) )
                    // InternalAioc.g:1510:1: (lv_resultVariable_1_0= RULE_ID )
                    {
                    // InternalAioc.g:1510:1: (lv_resultVariable_1_0= RULE_ID )
                    // InternalAioc.g:1511:3: lv_resultVariable_1_0= RULE_ID
                    {
                    lv_resultVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_resultVariable_1_0, grammarAccess.getLocalCodeAccess().getResultVariableIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"resultVariable",
                              		lv_resultVariable_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_AT_2=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_2, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_0_2()); 
                          
                    }
                    // InternalAioc.g:1531:1: ( (lv_thread_3_0= RULE_ID ) )
                    // InternalAioc.g:1532:1: (lv_thread_3_0= RULE_ID )
                    {
                    // InternalAioc.g:1532:1: (lv_thread_3_0= RULE_ID )
                    // InternalAioc.g:1533:3: lv_thread_3_0= RULE_ID
                    {
                    lv_thread_3_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_thread_3_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"thread",
                              		lv_thread_3_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_ASSIGN_4=(Token)match(input,RULE_ASSIGN,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_4, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_0_4()); 
                          
                    }
                    otherlv_5=(Token)match(input,52,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getLocalCodeAccess().getGetInputKeyword_0_5());
                          
                    }
                    this_LRND_6=(Token)match(input,RULE_LRND,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LRND_6, grammarAccess.getLocalCodeAccess().getLRNDTerminalRuleCall_0_6()); 
                          
                    }
                    // InternalAioc.g:1561:1: ( (lv_question_7_0= ruleExpression ) )
                    // InternalAioc.g:1562:1: (lv_question_7_0= ruleExpression )
                    {
                    // InternalAioc.g:1562:1: (lv_question_7_0= ruleExpression )
                    // InternalAioc.g:1563:3: lv_question_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalCodeAccess().getQuestionExpressionParserRuleCall_0_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_question_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                      	        }
                             		set(
                             			current, 
                             			"question",
                              		lv_question_7_0, 
                              		"org.Aioc.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_8=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_8, grammarAccess.getLocalCodeAccess().getRRNDTerminalRuleCall_0_8()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:1584:6: ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND )
                    {
                    // InternalAioc.g:1584:6: ( () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND )
                    // InternalAioc.g:1584:7: () ( (lv_variable_10_0= RULE_ID ) ) this_AT_11= RULE_AT ( (lv_thread_12_0= RULE_ID ) ) this_ASSIGN_13= RULE_ASSIGN otherlv_14= 'show' this_LRND_15= RULE_LRND ( (lv_expression_16_0= ruleExpression ) ) this_RRND_17= RULE_RRND
                    {
                    // InternalAioc.g:1584:7: ()
                    // InternalAioc.g:1585:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLocalCodeAccess().getLocalShowCommandAction_1_0(),
                                  current);
                          
                    }

                    }

                    // InternalAioc.g:1590:2: ( (lv_variable_10_0= RULE_ID ) )
                    // InternalAioc.g:1591:1: (lv_variable_10_0= RULE_ID )
                    {
                    // InternalAioc.g:1591:1: (lv_variable_10_0= RULE_ID )
                    // InternalAioc.g:1592:3: lv_variable_10_0= RULE_ID
                    {
                    lv_variable_10_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_10_0, grammarAccess.getLocalCodeAccess().getVariableIDTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_10_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_AT_11=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_11, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_1_2()); 
                          
                    }
                    // InternalAioc.g:1612:1: ( (lv_thread_12_0= RULE_ID ) )
                    // InternalAioc.g:1613:1: (lv_thread_12_0= RULE_ID )
                    {
                    // InternalAioc.g:1613:1: (lv_thread_12_0= RULE_ID )
                    // InternalAioc.g:1614:3: lv_thread_12_0= RULE_ID
                    {
                    lv_thread_12_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_thread_12_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_1_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"thread",
                              		lv_thread_12_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_ASSIGN_13=(Token)match(input,RULE_ASSIGN,FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_13, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_1_4()); 
                          
                    }
                    otherlv_14=(Token)match(input,53,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getLocalCodeAccess().getShowKeyword_1_5());
                          
                    }
                    this_LRND_15=(Token)match(input,RULE_LRND,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LRND_15, grammarAccess.getLocalCodeAccess().getLRNDTerminalRuleCall_1_6()); 
                          
                    }
                    // InternalAioc.g:1642:1: ( (lv_expression_16_0= ruleExpression ) )
                    // InternalAioc.g:1643:1: (lv_expression_16_0= ruleExpression )
                    {
                    // InternalAioc.g:1643:1: (lv_expression_16_0= ruleExpression )
                    // InternalAioc.g:1644:3: lv_expression_16_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLocalCodeAccess().getExpressionExpressionParserRuleCall_1_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_expression_16_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_16_0, 
                              		"org.Aioc.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_17=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_17, grammarAccess.getLocalCodeAccess().getRRNDTerminalRuleCall_1_8()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:1665:6: ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) )
                    {
                    // InternalAioc.g:1665:6: ( () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) ) )
                    // InternalAioc.g:1665:7: () ( (lv_variable_19_0= RULE_ID ) ) this_AT_20= RULE_AT ( (lv_thread_21_0= RULE_ID ) ) this_ASSIGN_22= RULE_ASSIGN ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) )
                    {
                    // InternalAioc.g:1665:7: ()
                    // InternalAioc.g:1666:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLocalCodeAccess().getLocalAssignmentCommandAction_2_0(),
                                  current);
                          
                    }

                    }

                    // InternalAioc.g:1671:2: ( (lv_variable_19_0= RULE_ID ) )
                    // InternalAioc.g:1672:1: (lv_variable_19_0= RULE_ID )
                    {
                    // InternalAioc.g:1672:1: (lv_variable_19_0= RULE_ID )
                    // InternalAioc.g:1673:3: lv_variable_19_0= RULE_ID
                    {
                    lv_variable_19_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_19_0, grammarAccess.getLocalCodeAccess().getVariableIDTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_19_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_AT_20=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_AT_20, grammarAccess.getLocalCodeAccess().getATTerminalRuleCall_2_2()); 
                          
                    }
                    // InternalAioc.g:1693:1: ( (lv_thread_21_0= RULE_ID ) )
                    // InternalAioc.g:1694:1: (lv_thread_21_0= RULE_ID )
                    {
                    // InternalAioc.g:1694:1: (lv_thread_21_0= RULE_ID )
                    // InternalAioc.g:1695:3: lv_thread_21_0= RULE_ID
                    {
                    lv_thread_21_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_thread_21_0, grammarAccess.getLocalCodeAccess().getThreadIDTerminalRuleCall_2_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getLocalCodeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"thread",
                              		lv_thread_21_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_ASSIGN_22=(Token)match(input,RULE_ASSIGN,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ASSIGN_22, grammarAccess.getLocalCodeAccess().getASSIGNTerminalRuleCall_2_4()); 
                          
                    }
                    // InternalAioc.g:1715:1: ( ( (lv_expression_23_0= ruleExpression ) ) | ( (lv_function_24_0= ruleFunction ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_STRING||LA22_0==RULE_LRND||(LA22_0>=RULE_NOT && LA22_0<=RULE_FALSE)||LA22_0==RULE_INT) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        int LA22_2 = input.LA(2);

                        if ( (LA22_2==EOF||LA22_2==RULE_RCURLY||(LA22_2>=RULE_PIPE && LA22_2<=RULE_SEMICOLON)||(LA22_2>=RULE_PLUS && LA22_2<=RULE_SLASH)) ) {
                            alt22=1;
                        }
                        else if ( (LA22_2==RULE_LRND) ) {
                            alt22=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalAioc.g:1715:2: ( (lv_expression_23_0= ruleExpression ) )
                            {
                            // InternalAioc.g:1715:2: ( (lv_expression_23_0= ruleExpression ) )
                            // InternalAioc.g:1716:1: (lv_expression_23_0= ruleExpression )
                            {
                            // InternalAioc.g:1716:1: (lv_expression_23_0= ruleExpression )
                            // InternalAioc.g:1717:3: lv_expression_23_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalCodeAccess().getExpressionExpressionParserRuleCall_2_5_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_expression_23_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"expression",
                                      		lv_expression_23_0, 
                                      		"org.Aioc.Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAioc.g:1734:6: ( (lv_function_24_0= ruleFunction ) )
                            {
                            // InternalAioc.g:1734:6: ( (lv_function_24_0= ruleFunction ) )
                            // InternalAioc.g:1735:1: (lv_function_24_0= ruleFunction )
                            {
                            // InternalAioc.g:1735:1: (lv_function_24_0= ruleFunction )
                            // InternalAioc.g:1736:3: lv_function_24_0= ruleFunction
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLocalCodeAccess().getFunctionFunctionParserRuleCall_2_5_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_2);
                            lv_function_24_0=ruleFunction();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLocalCodeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"function",
                                      		lv_function_24_0, 
                                      		"org.Aioc.Function");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalCode"


    // $ANTLR start "entryRuleIfThenElse"
    // InternalAioc.g:1760:1: entryRuleIfThenElse returns [EObject current=null] : iv_ruleIfThenElse= ruleIfThenElse EOF ;
    public final EObject entryRuleIfThenElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElse = null;


        try {
            // InternalAioc.g:1761:2: (iv_ruleIfThenElse= ruleIfThenElse EOF )
            // InternalAioc.g:1762:2: iv_ruleIfThenElse= ruleIfThenElse EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfThenElse=ruleIfThenElse();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElse; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElse"


    // $ANTLR start "ruleIfThenElse"
    // InternalAioc.g:1769:1: ruleIfThenElse returns [EObject current=null] : ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? ) ;
    public final EObject ruleIfThenElse() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token this_COLON_1=null;
        Token otherlv_2=null;
        Token this_LRND_3=null;
        Token this_RRND_5=null;
        Token this_AT_6=null;
        Token lv_thread_7_0=null;
        Token this_LCURLY_8=null;
        Token this_RCURLY_10=null;
        Token otherlv_11=null;
        Token this_LCURLY_12=null;
        Token this_RCURLY_14=null;
        EObject lv_condition_4_0 = null;

        EObject lv_then_9_0 = null;

        EObject lv_else_13_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1772:28: ( ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? ) )
            // InternalAioc.g:1773:1: ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? )
            {
            // InternalAioc.g:1773:1: ( ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )? )
            // InternalAioc.g:1773:2: ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? otherlv_2= 'if' this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND this_AT_6= RULE_AT ( (lv_thread_7_0= RULE_ID ) ) this_LCURLY_8= RULE_LCURLY ( (lv_then_9_0= ruleChoreography ) ) this_RCURLY_10= RULE_RCURLY (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )?
            {
            // InternalAioc.g:1773:2: ( ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAioc.g:1773:3: ( (lv_key_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON
                    {
                    // InternalAioc.g:1773:3: ( (lv_key_0_0= RULE_ID ) )
                    // InternalAioc.g:1774:1: (lv_key_0_0= RULE_ID )
                    {
                    // InternalAioc.g:1774:1: (lv_key_0_0= RULE_ID )
                    // InternalAioc.g:1775:3: lv_key_0_0= RULE_ID
                    {
                    lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_0_0, grammarAccess.getIfThenElseAccess().getKeyIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIfThenElseRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_0_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_1, grammarAccess.getIfThenElseAccess().getCOLONTerminalRuleCall_0_1()); 
                          
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getIfThenElseAccess().getIfKeyword_1());
                  
            }
            this_LRND_3=(Token)match(input,RULE_LRND,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_3, grammarAccess.getIfThenElseAccess().getLRNDTerminalRuleCall_2()); 
                  
            }
            // InternalAioc.g:1803:1: ( (lv_condition_4_0= ruleCondition ) )
            // InternalAioc.g:1804:1: (lv_condition_4_0= ruleCondition )
            {
            // InternalAioc.g:1804:1: (lv_condition_4_0= ruleCondition )
            // InternalAioc.g:1805:3: lv_condition_4_0= ruleCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getConditionConditionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_22);
            lv_condition_4_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_4_0, 
                      		"org.Aioc.Condition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_5, grammarAccess.getIfThenElseAccess().getRRNDTerminalRuleCall_4()); 
                  
            }
            this_AT_6=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_6, grammarAccess.getIfThenElseAccess().getATTerminalRuleCall_5()); 
                  
            }
            // InternalAioc.g:1829:1: ( (lv_thread_7_0= RULE_ID ) )
            // InternalAioc.g:1830:1: (lv_thread_7_0= RULE_ID )
            {
            // InternalAioc.g:1830:1: (lv_thread_7_0= RULE_ID )
            // InternalAioc.g:1831:3: lv_thread_7_0= RULE_ID
            {
            lv_thread_7_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_thread_7_0, grammarAccess.getIfThenElseAccess().getThreadIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIfThenElseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"thread",
                      		lv_thread_7_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LCURLY_8=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_8, grammarAccess.getIfThenElseAccess().getLCURLYTerminalRuleCall_7()); 
                  
            }
            // InternalAioc.g:1851:1: ( (lv_then_9_0= ruleChoreography ) )
            // InternalAioc.g:1852:1: (lv_then_9_0= ruleChoreography )
            {
            // InternalAioc.g:1852:1: (lv_then_9_0= ruleChoreography )
            // InternalAioc.g:1853:3: lv_then_9_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfThenElseAccess().getThenChoreographyParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_then_9_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_9_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_10=(Token)match(input,RULE_RCURLY,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_10, grammarAccess.getIfThenElseAccess().getRCURLYTerminalRuleCall_9()); 
                  
            }
            // InternalAioc.g:1873:1: (otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==55) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAioc.g:1873:3: otherlv_11= 'else' this_LCURLY_12= RULE_LCURLY ( (lv_else_13_0= ruleChoreography ) ) this_RCURLY_14= RULE_RCURLY
                    {
                    otherlv_11=(Token)match(input,55,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getIfThenElseAccess().getElseKeyword_10_0());
                          
                    }
                    this_LCURLY_12=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_12, grammarAccess.getIfThenElseAccess().getLCURLYTerminalRuleCall_10_1()); 
                          
                    }
                    // InternalAioc.g:1881:1: ( (lv_else_13_0= ruleChoreography ) )
                    // InternalAioc.g:1882:1: (lv_else_13_0= ruleChoreography )
                    {
                    // InternalAioc.g:1882:1: (lv_else_13_0= ruleChoreography )
                    // InternalAioc.g:1883:3: lv_else_13_0= ruleChoreography
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseAccess().getElseChoreographyParserRuleCall_10_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_else_13_0=ruleChoreography();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_13_0, 
                              		"org.Aioc.Choreography");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RCURLY_14=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_14, grammarAccess.getIfThenElseAccess().getRCURLYTerminalRuleCall_10_3()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElse"


    // $ANTLR start "entryRuleWhile"
    // InternalAioc.g:1911:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalAioc.g:1912:2: (iv_ruleWhile= ruleWhile EOF )
            // InternalAioc.g:1913:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalAioc.g:1920:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LRND_1=null;
        Token this_RRND_3=null;
        Token this_AT_4=null;
        Token lv_thread_5_0=null;
        Token this_LCURLY_6=null;
        Token this_RCURLY_8=null;
        Token this_LCURLY_9=null;
        Token lv_key_10_0=null;
        Token this_RCURLY_11=null;
        EObject lv_condition_2_0 = null;

        EObject lv_choreography_7_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:1923:28: ( (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? ) )
            // InternalAioc.g:1924:1: (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? )
            {
            // InternalAioc.g:1924:1: (otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )? )
            // InternalAioc.g:1924:3: otherlv_0= 'while' this_LRND_1= RULE_LRND ( (lv_condition_2_0= ruleCondition ) ) this_RRND_3= RULE_RRND this_AT_4= RULE_AT ( (lv_thread_5_0= RULE_ID ) ) this_LCURLY_6= RULE_LCURLY ( (lv_choreography_7_0= ruleChoreography ) ) this_RCURLY_8= RULE_RCURLY (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            this_LRND_1=(Token)match(input,RULE_LRND,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_1, grammarAccess.getWhileAccess().getLRNDTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:1932:1: ( (lv_condition_2_0= ruleCondition ) )
            // InternalAioc.g:1933:1: (lv_condition_2_0= ruleCondition )
            {
            // InternalAioc.g:1933:1: (lv_condition_2_0= ruleCondition )
            // InternalAioc.g:1934:3: lv_condition_2_0= ruleCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getConditionConditionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_22);
            lv_condition_2_0=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_2_0, 
                      		"org.Aioc.Condition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RRND_3=(Token)match(input,RULE_RRND,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_3, grammarAccess.getWhileAccess().getRRNDTerminalRuleCall_3()); 
                  
            }
            this_AT_4=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_4, grammarAccess.getWhileAccess().getATTerminalRuleCall_4()); 
                  
            }
            // InternalAioc.g:1958:1: ( (lv_thread_5_0= RULE_ID ) )
            // InternalAioc.g:1959:1: (lv_thread_5_0= RULE_ID )
            {
            // InternalAioc.g:1959:1: (lv_thread_5_0= RULE_ID )
            // InternalAioc.g:1960:3: lv_thread_5_0= RULE_ID
            {
            lv_thread_5_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_thread_5_0, grammarAccess.getWhileAccess().getThreadIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWhileRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"thread",
                      		lv_thread_5_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LCURLY_6=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_6, grammarAccess.getWhileAccess().getLCURLYTerminalRuleCall_6()); 
                  
            }
            // InternalAioc.g:1980:1: ( (lv_choreography_7_0= ruleChoreography ) )
            // InternalAioc.g:1981:1: (lv_choreography_7_0= ruleChoreography )
            {
            // InternalAioc.g:1981:1: (lv_choreography_7_0= ruleChoreography )
            // InternalAioc.g:1982:3: lv_choreography_7_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getChoreographyChoreographyParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_7_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_7_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_8=(Token)match(input,RULE_RCURLY,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_8, grammarAccess.getWhileAccess().getRCURLYTerminalRuleCall_8()); 
                  
            }
            // InternalAioc.g:2002:1: (this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_LCURLY) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAioc.g:2002:2: this_LCURLY_9= RULE_LCURLY ( (lv_key_10_0= RULE_ID ) ) this_RCURLY_11= RULE_RCURLY
                    {
                    this_LCURLY_9=(Token)match(input,RULE_LCURLY,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_9, grammarAccess.getWhileAccess().getLCURLYTerminalRuleCall_9_0()); 
                          
                    }
                    // InternalAioc.g:2006:1: ( (lv_key_10_0= RULE_ID ) )
                    // InternalAioc.g:2007:1: (lv_key_10_0= RULE_ID )
                    {
                    // InternalAioc.g:2007:1: (lv_key_10_0= RULE_ID )
                    // InternalAioc.g:2008:3: lv_key_10_0= RULE_ID
                    {
                    lv_key_10_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_10_0, grammarAccess.getWhileAccess().getKeyIDTerminalRuleCall_9_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getWhileRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_10_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_RCURLY_11=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_11, grammarAccess.getWhileAccess().getRCURLYTerminalRuleCall_9_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleScope"
    // InternalAioc.g:2036:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalAioc.g:2037:2: (iv_ruleScope= ruleScope EOF )
            // InternalAioc.g:2038:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalAioc.g:2045:1: ruleScope returns [EObject current=null] : (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_AT_1=null;
        Token lv_thread_2_0=null;
        Token this_LCURLY_3=null;
        Token this_RCURLY_5=null;
        Token otherlv_6=null;
        Token this_LCURLY_7=null;
        Token this_RCURLY_9=null;
        Token otherlv_10=null;
        Token this_LCURLY_11=null;
        Token this_RCURLY_13=null;
        Token this_LCURLY_14=null;
        Token lv_key_15_0=null;
        Token this_RCURLY_16=null;
        EObject lv_choreography_4_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_roles_12_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2048:28: ( (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? ) )
            // InternalAioc.g:2049:1: (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? )
            {
            // InternalAioc.g:2049:1: (otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )? )
            // InternalAioc.g:2049:3: otherlv_0= 'scope' this_AT_1= RULE_AT ( (lv_thread_2_0= RULE_ID ) ) this_LCURLY_3= RULE_LCURLY ( (lv_choreography_4_0= ruleChoreography ) ) this_RCURLY_5= RULE_RCURLY (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )? (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )? (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScopeAccess().getScopeKeyword_0());
                  
            }
            this_AT_1=(Token)match(input,RULE_AT,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_1, grammarAccess.getScopeAccess().getATTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:2057:1: ( (lv_thread_2_0= RULE_ID ) )
            // InternalAioc.g:2058:1: (lv_thread_2_0= RULE_ID )
            {
            // InternalAioc.g:2058:1: (lv_thread_2_0= RULE_ID )
            // InternalAioc.g:2059:3: lv_thread_2_0= RULE_ID
            {
            lv_thread_2_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_thread_2_0, grammarAccess.getScopeAccess().getThreadIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getScopeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"thread",
                      		lv_thread_2_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LCURLY_3=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_3, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_3()); 
                  
            }
            // InternalAioc.g:2079:1: ( (lv_choreography_4_0= ruleChoreography ) )
            // InternalAioc.g:2080:1: (lv_choreography_4_0= ruleChoreography )
            {
            // InternalAioc.g:2080:1: (lv_choreography_4_0= ruleChoreography )
            // InternalAioc.g:2081:3: lv_choreography_4_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScopeAccess().getChoreographyChoreographyParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_4_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScopeRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_4_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_5=(Token)match(input,RULE_RCURLY,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_5, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_5()); 
                  
            }
            // InternalAioc.g:2101:1: (otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAioc.g:2101:3: otherlv_6= 'prop' this_LCURLY_7= RULE_LCURLY ( (lv_properties_8_0= ruleAssignmentSet ) ) this_RCURLY_9= RULE_RCURLY
                    {
                    otherlv_6=(Token)match(input,58,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getPropKeyword_6_0());
                          
                    }
                    this_LCURLY_7=(Token)match(input,RULE_LCURLY,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_7, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_6_1()); 
                          
                    }
                    // InternalAioc.g:2109:1: ( (lv_properties_8_0= ruleAssignmentSet ) )
                    // InternalAioc.g:2110:1: (lv_properties_8_0= ruleAssignmentSet )
                    {
                    // InternalAioc.g:2110:1: (lv_properties_8_0= ruleAssignmentSet )
                    // InternalAioc.g:2111:3: lv_properties_8_0= ruleAssignmentSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScopeAccess().getPropertiesAssignmentSetParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_properties_8_0=ruleAssignmentSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"properties",
                              		lv_properties_8_0, 
                              		"org.Aioc.AssignmentSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RCURLY_9=(Token)match(input,RULE_RCURLY,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_9, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_6_3()); 
                          
                    }

                    }
                    break;

            }

            // InternalAioc.g:2131:3: (otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAioc.g:2131:5: otherlv_10= 'roles' this_LCURLY_11= RULE_LCURLY ( (lv_roles_12_0= ruleRoles ) ) this_RCURLY_13= RULE_RCURLY
                    {
                    otherlv_10=(Token)match(input,59,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getScopeAccess().getRolesKeyword_7_0());
                          
                    }
                    this_LCURLY_11=(Token)match(input,RULE_LCURLY,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_11, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_7_1()); 
                          
                    }
                    // InternalAioc.g:2139:1: ( (lv_roles_12_0= ruleRoles ) )
                    // InternalAioc.g:2140:1: (lv_roles_12_0= ruleRoles )
                    {
                    // InternalAioc.g:2140:1: (lv_roles_12_0= ruleRoles )
                    // InternalAioc.g:2141:3: lv_roles_12_0= ruleRoles
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getScopeAccess().getRolesRolesParserRuleCall_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_roles_12_0=ruleRoles();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getScopeRule());
                      	        }
                             		set(
                             			current, 
                             			"roles",
                              		lv_roles_12_0, 
                              		"org.Aioc.Roles");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RCURLY_13=(Token)match(input,RULE_RCURLY,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_13, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_7_3()); 
                          
                    }

                    }
                    break;

            }

            // InternalAioc.g:2161:3: (this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LCURLY) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAioc.g:2161:4: this_LCURLY_14= RULE_LCURLY ( (lv_key_15_0= RULE_ID ) ) this_RCURLY_16= RULE_RCURLY
                    {
                    this_LCURLY_14=(Token)match(input,RULE_LCURLY,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LCURLY_14, grammarAccess.getScopeAccess().getLCURLYTerminalRuleCall_8_0()); 
                          
                    }
                    // InternalAioc.g:2165:1: ( (lv_key_15_0= RULE_ID ) )
                    // InternalAioc.g:2166:1: (lv_key_15_0= RULE_ID )
                    {
                    // InternalAioc.g:2166:1: (lv_key_15_0= RULE_ID )
                    // InternalAioc.g:2167:3: lv_key_15_0= RULE_ID
                    {
                    lv_key_15_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_key_15_0, grammarAccess.getScopeAccess().getKeyIDTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getScopeRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"key",
                              		lv_key_15_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }

                    this_RCURLY_16=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RCURLY_16, grammarAccess.getScopeAccess().getRCURLYTerminalRuleCall_8_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleRoles"
    // InternalAioc.g:2195:1: entryRuleRoles returns [EObject current=null] : iv_ruleRoles= ruleRoles EOF ;
    public final EObject entryRuleRoles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoles = null;


        try {
            // InternalAioc.g:2196:2: (iv_ruleRoles= ruleRoles EOF )
            // InternalAioc.g:2197:2: iv_ruleRoles= ruleRoles EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRolesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRoles=ruleRoles();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoles; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoles"


    // $ANTLR start "ruleRoles"
    // InternalAioc.g:2204:1: ruleRoles returns [EObject current=null] : ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* ) ;
    public final EObject ruleRoles() throws RecognitionException {
        EObject current = null;

        Token lv_roles_0_0=null;
        Token this_COMMA_1=null;
        Token lv_roles_2_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:2207:28: ( ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* ) )
            // InternalAioc.g:2208:1: ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* )
            {
            // InternalAioc.g:2208:1: ( ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )* )
            // InternalAioc.g:2208:2: ( (lv_roles_0_0= RULE_ID ) ) (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )*
            {
            // InternalAioc.g:2208:2: ( (lv_roles_0_0= RULE_ID ) )
            // InternalAioc.g:2209:1: (lv_roles_0_0= RULE_ID )
            {
            // InternalAioc.g:2209:1: (lv_roles_0_0= RULE_ID )
            // InternalAioc.g:2210:3: lv_roles_0_0= RULE_ID
            {
            lv_roles_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_roles_0_0, grammarAccess.getRolesAccess().getRolesIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRolesRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"roles",
                      		lv_roles_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            // InternalAioc.g:2226:2: (this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAioc.g:2226:3: this_COMMA_1= RULE_COMMA ( (lv_roles_2_0= RULE_ID ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getRolesAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // InternalAioc.g:2230:1: ( (lv_roles_2_0= RULE_ID ) )
            	    // InternalAioc.g:2231:1: (lv_roles_2_0= RULE_ID )
            	    {
            	    // InternalAioc.g:2231:1: (lv_roles_2_0= RULE_ID )
            	    // InternalAioc.g:2232:3: lv_roles_2_0= RULE_ID
            	    {
            	    lv_roles_2_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_roles_2_0, grammarAccess.getRolesAccess().getRolesIDTerminalRuleCall_1_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRolesRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"roles",
            	              		lv_roles_2_0, 
            	              		"org.eclipse.xtext.common.Terminals.ID");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoles"


    // $ANTLR start "entryRuleNestedChoreography"
    // InternalAioc.g:2256:1: entryRuleNestedChoreography returns [EObject current=null] : iv_ruleNestedChoreography= ruleNestedChoreography EOF ;
    public final EObject entryRuleNestedChoreography() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedChoreography = null;


        try {
            // InternalAioc.g:2257:2: (iv_ruleNestedChoreography= ruleNestedChoreography EOF )
            // InternalAioc.g:2258:2: iv_ruleNestedChoreography= ruleNestedChoreography EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedChoreographyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNestedChoreography=ruleNestedChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedChoreography; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedChoreography"


    // $ANTLR start "ruleNestedChoreography"
    // InternalAioc.g:2265:1: ruleNestedChoreography returns [EObject current=null] : (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY ) ;
    public final EObject ruleNestedChoreography() throws RecognitionException {
        EObject current = null;

        Token this_LCURLY_0=null;
        Token this_RCURLY_2=null;
        EObject lv_choreography_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2268:28: ( (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY ) )
            // InternalAioc.g:2269:1: (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY )
            {
            // InternalAioc.g:2269:1: (this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY )
            // InternalAioc.g:2269:2: this_LCURLY_0= RULE_LCURLY ( (lv_choreography_1_0= ruleChoreography ) ) this_RCURLY_2= RULE_RCURLY
            {
            this_LCURLY_0=(Token)match(input,RULE_LCURLY,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_0, grammarAccess.getNestedChoreographyAccess().getLCURLYTerminalRuleCall_0()); 
                  
            }
            // InternalAioc.g:2273:1: ( (lv_choreography_1_0= ruleChoreography ) )
            // InternalAioc.g:2274:1: (lv_choreography_1_0= ruleChoreography )
            {
            // InternalAioc.g:2274:1: (lv_choreography_1_0= ruleChoreography )
            // InternalAioc.g:2275:3: lv_choreography_1_0= ruleChoreography
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNestedChoreographyAccess().getChoreographyChoreographyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_7);
            lv_choreography_1_0=ruleChoreography();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNestedChoreographyRule());
              	        }
                     		set(
                     			current, 
                     			"choreography",
                      		lv_choreography_1_0, 
                      		"org.Aioc.Choreography");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RCURLY_2=(Token)match(input,RULE_RCURLY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_2, grammarAccess.getNestedChoreographyAccess().getRCURLYTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedChoreography"


    // $ANTLR start "entryRuleAssignmentSet"
    // InternalAioc.g:2303:1: entryRuleAssignmentSet returns [EObject current=null] : iv_ruleAssignmentSet= ruleAssignmentSet EOF ;
    public final EObject entryRuleAssignmentSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentSet = null;


        try {
            // InternalAioc.g:2304:2: (iv_ruleAssignmentSet= ruleAssignmentSet EOF )
            // InternalAioc.g:2305:2: iv_ruleAssignmentSet= ruleAssignmentSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentSet=ruleAssignmentSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentSet"


    // $ANTLR start "ruleAssignmentSet"
    // InternalAioc.g:2312:1: ruleAssignmentSet returns [EObject current=null] : ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? ) ;
    public final EObject ruleAssignmentSet() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_assignment_0_0 = null;

        EObject lv_continuation_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2315:28: ( ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? ) )
            // InternalAioc.g:2316:1: ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? )
            {
            // InternalAioc.g:2316:1: ( ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )? )
            // InternalAioc.g:2316:2: ( (lv_assignment_0_0= ruleAssignment ) ) (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )?
            {
            // InternalAioc.g:2316:2: ( (lv_assignment_0_0= ruleAssignment ) )
            // InternalAioc.g:2317:1: (lv_assignment_0_0= ruleAssignment )
            {
            // InternalAioc.g:2317:1: (lv_assignment_0_0= ruleAssignment )
            // InternalAioc.g:2318:3: lv_assignment_0_0= ruleAssignment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentSetAccess().getAssignmentAssignmentParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_20);
            lv_assignment_0_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentSetRule());
              	        }
                     		set(
                     			current, 
                     			"assignment",
                      		lv_assignment_0_0, 
                      		"org.Aioc.Assignment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:2334:2: (this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_COMMA) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAioc.g:2334:3: this_COMMA_1= RULE_COMMA ( (lv_continuation_2_0= ruleAssignmentSet ) )
                    {
                    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_1, grammarAccess.getAssignmentSetAccess().getCOMMATerminalRuleCall_1_0()); 
                          
                    }
                    // InternalAioc.g:2338:1: ( (lv_continuation_2_0= ruleAssignmentSet ) )
                    // InternalAioc.g:2339:1: (lv_continuation_2_0= ruleAssignmentSet )
                    {
                    // InternalAioc.g:2339:1: (lv_continuation_2_0= ruleAssignmentSet )
                    // InternalAioc.g:2340:3: lv_continuation_2_0= ruleAssignmentSet
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentSetAccess().getContinuationAssignmentSetParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_continuation_2_0=ruleAssignmentSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentSetRule());
                      	        }
                             		set(
                             			current, 
                             			"continuation",
                              		lv_continuation_2_0, 
                              		"org.Aioc.AssignmentSet");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentSet"


    // $ANTLR start "entryRuleAssignment"
    // InternalAioc.g:2364:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalAioc.g:2365:2: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalAioc.g:2366:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalAioc.g:2373:1: ruleAssignment returns [EObject current=null] : (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variable_1_0=null;
        Token this_ASSIGN_2=null;
        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2376:28: ( (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) ) )
            // InternalAioc.g:2377:1: (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // InternalAioc.g:2377:1: (otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) ) )
            // InternalAioc.g:2377:3: otherlv_0= 'N.' ( (lv_variable_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getNKeyword_0());
                  
            }
            // InternalAioc.g:2381:1: ( (lv_variable_1_0= RULE_ID ) )
            // InternalAioc.g:2382:1: (lv_variable_1_0= RULE_ID )
            {
            // InternalAioc.g:2382:1: (lv_variable_1_0= RULE_ID )
            // InternalAioc.g:2383:3: lv_variable_1_0= RULE_ID
            {
            lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_variable_1_0, grammarAccess.getAssignmentAccess().getVariableIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssignmentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"variable",
                      		lv_variable_1_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_ASSIGN_2=(Token)match(input,RULE_ASSIGN,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ASSIGN_2, grammarAccess.getAssignmentAccess().getASSIGNTerminalRuleCall_2()); 
                  
            }
            // InternalAioc.g:2403:1: ( (lv_expression_3_0= ruleExpression ) )
            // InternalAioc.g:2404:1: (lv_expression_3_0= ruleExpression )
            {
            // InternalAioc.g:2404:1: (lv_expression_3_0= ruleExpression )
            // InternalAioc.g:2405:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"org.Aioc.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalAioc.g:2429:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalAioc.g:2430:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalAioc.g:2431:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAioc.g:2438:1: ruleExpression returns [EObject current=null] : ( (lv_sumExpression_0_0= ruleSumExpression ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_sumExpression_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2441:28: ( ( (lv_sumExpression_0_0= ruleSumExpression ) ) )
            // InternalAioc.g:2442:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            {
            // InternalAioc.g:2442:1: ( (lv_sumExpression_0_0= ruleSumExpression ) )
            // InternalAioc.g:2443:1: (lv_sumExpression_0_0= ruleSumExpression )
            {
            // InternalAioc.g:2443:1: (lv_sumExpression_0_0= ruleSumExpression )
            // InternalAioc.g:2444:3: lv_sumExpression_0_0= ruleSumExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionAccess().getSumExpressionSumExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_sumExpression_0_0=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"sumExpression",
                      		lv_sumExpression_0_0, 
                      		"org.Aioc.SumExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSumExpression"
    // InternalAioc.g:2468:1: entryRuleSumExpression returns [EObject current=null] : iv_ruleSumExpression= ruleSumExpression EOF ;
    public final EObject entryRuleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpression = null;


        try {
            // InternalAioc.g:2469:2: (iv_ruleSumExpression= ruleSumExpression EOF )
            // InternalAioc.g:2470:2: iv_ruleSumExpression= ruleSumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSumExpression=ruleSumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumExpression"


    // $ANTLR start "ruleSumExpression"
    // InternalAioc.g:2477:1: ruleSumExpression returns [EObject current=null] : ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) ;
    public final EObject ruleSumExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_children_0_0 = null;

        EObject lv_children_1_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2480:28: ( ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* ) )
            // InternalAioc.g:2481:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            {
            // InternalAioc.g:2481:1: ( ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )* )
            // InternalAioc.g:2481:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) ) ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            {
            // InternalAioc.g:2481:2: ( (lv_children_0_0= ruleExpressionBasicTerm ) )
            // InternalAioc.g:2482:1: (lv_children_0_0= ruleExpressionBasicTerm )
            {
            // InternalAioc.g:2482:1: (lv_children_0_0= ruleExpressionBasicTerm )
            // InternalAioc.g:2483:3: lv_children_0_0= ruleExpressionBasicTerm
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenExpressionBasicTermParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
            lv_children_0_0=ruleExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSumExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"children",
                      		lv_children_0_0, 
                      		"org.Aioc.ExpressionBasicTerm");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:2499:2: ( (lv_children_1_0= ruleSumExpressionTerm ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_PLUS && LA32_0<=RULE_SLASH)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAioc.g:2500:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    {
            	    // InternalAioc.g:2500:1: (lv_children_1_0= ruleSumExpressionTerm )
            	    // InternalAioc.g:2501:3: lv_children_1_0= ruleSumExpressionTerm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumExpressionAccess().getChildrenSumExpressionTermParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_children_1_0=ruleSumExpressionTerm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSumExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_1_0, 
            	              		"org.Aioc.SumExpressionTerm");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumExpression"


    // $ANTLR start "entryRuleSumExpressionTerm"
    // InternalAioc.g:2525:1: entryRuleSumExpressionTerm returns [EObject current=null] : iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF ;
    public final EObject entryRuleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumExpressionTerm = null;


        try {
            // InternalAioc.g:2526:2: (iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF )
            // InternalAioc.g:2527:2: iv_ruleSumExpressionTerm= ruleSumExpressionTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumExpressionTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSumExpressionTerm=ruleSumExpressionTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumExpressionTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSumExpressionTerm"


    // $ANTLR start "ruleSumExpressionTerm"
    // InternalAioc.g:2534:1: ruleSumExpressionTerm returns [EObject current=null] : ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) | ( () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) ) ) | ( () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) ) ) ) ;
    public final EObject ruleSumExpressionTerm() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_MINUS_4=null;
        Token this_TIMES_7=null;
        Token this_SLASH_10=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_5_0 = null;

        EObject lv_expression_8_0 = null;

        EObject lv_expression_11_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2537:28: ( ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) | ( () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) ) ) | ( () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) ) ) ) )
            // InternalAioc.g:2538:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) | ( () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) ) ) | ( () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) ) ) )
            {
            // InternalAioc.g:2538:1: ( ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) ) | ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) ) | ( () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) ) ) | ( () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
                {
                alt33=1;
                }
                break;
            case RULE_MINUS:
                {
                alt33=2;
                }
                break;
            case RULE_TIMES:
                {
                alt33=3;
                }
                break;
            case RULE_SLASH:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalAioc.g:2538:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    {
                    // InternalAioc.g:2538:2: ( () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) ) )
                    // InternalAioc.g:2538:3: () this_PLUS_1= RULE_PLUS ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    {
                    // InternalAioc.g:2538:3: ()
                    // InternalAioc.g:2539:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSumExpressionTermAccess().getSumExpressionAddTermAction_0_0(),
                                  current);
                          
                    }

                    }

                    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PLUS_1, grammarAccess.getSumExpressionTermAccess().getPLUSTerminalRuleCall_0_1()); 
                          
                    }
                    // InternalAioc.g:2548:1: ( (lv_expression_2_0= ruleExpressionBasicTerm ) )
                    // InternalAioc.g:2549:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:2549:1: (lv_expression_2_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:2550:3: lv_expression_2_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2567:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    {
                    // InternalAioc.g:2567:6: ( () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) ) )
                    // InternalAioc.g:2567:7: () this_MINUS_4= RULE_MINUS ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    {
                    // InternalAioc.g:2567:7: ()
                    // InternalAioc.g:2568:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSumExpressionTermAccess().getSumExpressionSubtractTermAction_1_0(),
                                  current);
                          
                    }

                    }

                    this_MINUS_4=(Token)match(input,RULE_MINUS,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_MINUS_4, grammarAccess.getSumExpressionTermAccess().getMINUSTerminalRuleCall_1_1()); 
                          
                    }
                    // InternalAioc.g:2577:1: ( (lv_expression_5_0= ruleExpressionBasicTerm ) )
                    // InternalAioc.g:2578:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:2578:1: (lv_expression_5_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:2579:3: lv_expression_5_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2596:6: ( () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) ) )
                    {
                    // InternalAioc.g:2596:6: ( () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) ) )
                    // InternalAioc.g:2596:7: () this_TIMES_7= RULE_TIMES ( (lv_expression_8_0= ruleExpressionBasicTerm ) )
                    {
                    // InternalAioc.g:2596:7: ()
                    // InternalAioc.g:2597:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSumExpressionTermAccess().getSumExpressionTimesTermAction_2_0(),
                                  current);
                          
                    }

                    }

                    this_TIMES_7=(Token)match(input,RULE_TIMES,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TIMES_7, grammarAccess.getSumExpressionTermAccess().getTIMESTerminalRuleCall_2_1()); 
                          
                    }
                    // InternalAioc.g:2606:1: ( (lv_expression_8_0= ruleExpressionBasicTerm ) )
                    // InternalAioc.g:2607:1: (lv_expression_8_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:2607:1: (lv_expression_8_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:2608:3: lv_expression_8_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_8_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:2625:6: ( () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) ) )
                    {
                    // InternalAioc.g:2625:6: ( () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) ) )
                    // InternalAioc.g:2625:7: () this_SLASH_10= RULE_SLASH ( (lv_expression_11_0= ruleExpressionBasicTerm ) )
                    {
                    // InternalAioc.g:2625:7: ()
                    // InternalAioc.g:2626:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSumExpressionTermAccess().getSumExpressionDivideTermAction_3_0(),
                                  current);
                          
                    }

                    }

                    this_SLASH_10=(Token)match(input,RULE_SLASH,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SLASH_10, grammarAccess.getSumExpressionTermAccess().getSLASHTerminalRuleCall_3_1()); 
                          
                    }
                    // InternalAioc.g:2635:1: ( (lv_expression_11_0= ruleExpressionBasicTerm ) )
                    // InternalAioc.g:2636:1: (lv_expression_11_0= ruleExpressionBasicTerm )
                    {
                    // InternalAioc.g:2636:1: (lv_expression_11_0= ruleExpressionBasicTerm )
                    // InternalAioc.g:2637:3: lv_expression_11_0= ruleExpressionBasicTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSumExpressionTermAccess().getExpressionExpressionBasicTermParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_11_0=ruleExpressionBasicTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSumExpressionTermRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_11_0, 
                              		"org.Aioc.ExpressionBasicTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSumExpressionTerm"


    // $ANTLR start "entryRuleExpressionBasicTerm"
    // InternalAioc.g:2661:1: entryRuleExpressionBasicTerm returns [EObject current=null] : iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF ;
    public final EObject entryRuleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBasicTerm = null;


        try {
            // InternalAioc.g:2662:2: (iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF )
            // InternalAioc.g:2663:2: iv_ruleExpressionBasicTerm= ruleExpressionBasicTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBasicTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBasicTerm=ruleExpressionBasicTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBasicTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionBasicTerm"


    // $ANTLR start "ruleExpressionBasicTerm"
    // InternalAioc.g:2670:1: ruleExpressionBasicTerm returns [EObject current=null] : ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) ) ;
    public final EObject ruleExpressionBasicTerm() throws RecognitionException {
        EObject current = null;

        Token lv_not_0_0=null;
        Token lv_variable_1_0=null;
        Token this_LRND_3=null;
        Token this_RRND_5=null;
        EObject lv_constant_2_0 = null;

        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2673:28: ( ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) ) )
            // InternalAioc.g:2674:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) )
            {
            // InternalAioc.g:2674:1: ( ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) ) | ( (lv_constant_2_0= ruleConstant ) ) | (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_NOT:
                {
                alt35=1;
                }
                break;
            case RULE_STRING:
            case RULE_TRUE:
            case RULE_FALSE:
            case RULE_INT:
                {
                alt35=2;
                }
                break;
            case RULE_LRND:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalAioc.g:2674:2: ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) )
                    {
                    // InternalAioc.g:2674:2: ( ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) ) )
                    // InternalAioc.g:2674:3: ( (lv_not_0_0= RULE_NOT ) )? ( (lv_variable_1_0= RULE_ID ) )
                    {
                    // InternalAioc.g:2674:3: ( (lv_not_0_0= RULE_NOT ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_NOT) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalAioc.g:2675:1: (lv_not_0_0= RULE_NOT )
                            {
                            // InternalAioc.g:2675:1: (lv_not_0_0= RULE_NOT )
                            // InternalAioc.g:2676:3: lv_not_0_0= RULE_NOT
                            {
                            lv_not_0_0=(Token)match(input,RULE_NOT,FOLLOW_18); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_not_0_0, grammarAccess.getExpressionBasicTermAccess().getNotNOTTerminalRuleCall_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExpressionBasicTermRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"not",
                                      		true, 
                                      		"org.Aioc.NOT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalAioc.g:2692:3: ( (lv_variable_1_0= RULE_ID ) )
                    // InternalAioc.g:2693:1: (lv_variable_1_0= RULE_ID )
                    {
                    // InternalAioc.g:2693:1: (lv_variable_1_0= RULE_ID )
                    // InternalAioc.g:2694:3: lv_variable_1_0= RULE_ID
                    {
                    lv_variable_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_1_0, grammarAccess.getExpressionBasicTermAccess().getVariableIDTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpressionBasicTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_1_0, 
                              		"org.eclipse.xtext.common.Terminals.ID");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2711:6: ( (lv_constant_2_0= ruleConstant ) )
                    {
                    // InternalAioc.g:2711:6: ( (lv_constant_2_0= ruleConstant ) )
                    // InternalAioc.g:2712:1: (lv_constant_2_0= ruleConstant )
                    {
                    // InternalAioc.g:2712:1: (lv_constant_2_0= ruleConstant )
                    // InternalAioc.g:2713:3: lv_constant_2_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getConstantConstantParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_constant_2_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionBasicTermRule());
                      	        }
                             		set(
                             			current, 
                             			"constant",
                              		lv_constant_2_0, 
                              		"org.Aioc.Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2730:6: (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND )
                    {
                    // InternalAioc.g:2730:6: (this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND )
                    // InternalAioc.g:2730:7: this_LRND_3= RULE_LRND ( (lv_condition_4_0= ruleCondition ) ) this_RRND_5= RULE_RRND
                    {
                    this_LRND_3=(Token)match(input,RULE_LRND,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LRND_3, grammarAccess.getExpressionBasicTermAccess().getLRNDTerminalRuleCall_2_0()); 
                          
                    }
                    // InternalAioc.g:2734:1: ( (lv_condition_4_0= ruleCondition ) )
                    // InternalAioc.g:2735:1: (lv_condition_4_0= ruleCondition )
                    {
                    // InternalAioc.g:2735:1: (lv_condition_4_0= ruleCondition )
                    // InternalAioc.g:2736:3: lv_condition_4_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionBasicTermAccess().getConditionConditionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_condition_4_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionBasicTermRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_4_0, 
                              		"org.Aioc.Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RRND_5, grammarAccess.getExpressionBasicTermAccess().getRRNDTerminalRuleCall_2_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionBasicTerm"


    // $ANTLR start "entryRuleConstant"
    // InternalAioc.g:2764:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalAioc.g:2765:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalAioc.g:2766:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalAioc.g:2773:1: ruleConstant returns [EObject current=null] : ( ( (lv_intValue_0_0= ruleInteger ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_strValue_1_0=null;
        Token lv_true_2_0=null;
        Token lv_false_3_0=null;
        EObject lv_intValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2776:28: ( ( ( (lv_intValue_0_0= ruleInteger ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) ) )
            // InternalAioc.g:2777:1: ( ( (lv_intValue_0_0= ruleInteger ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            {
            // InternalAioc.g:2777:1: ( ( (lv_intValue_0_0= ruleInteger ) ) | ( (lv_strValue_1_0= RULE_STRING ) ) | ( (lv_true_2_0= RULE_TRUE ) ) | ( (lv_false_3_0= RULE_FALSE ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt36=1;
                }
                break;
            case RULE_STRING:
                {
                alt36=2;
                }
                break;
            case RULE_TRUE:
                {
                alt36=3;
                }
                break;
            case RULE_FALSE:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalAioc.g:2777:2: ( (lv_intValue_0_0= ruleInteger ) )
                    {
                    // InternalAioc.g:2777:2: ( (lv_intValue_0_0= ruleInteger ) )
                    // InternalAioc.g:2778:1: (lv_intValue_0_0= ruleInteger )
                    {
                    // InternalAioc.g:2778:1: (lv_intValue_0_0= ruleInteger )
                    // InternalAioc.g:2779:3: lv_intValue_0_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getIntValueIntegerParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_intValue_0_0=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"intValue",
                              		lv_intValue_0_0, 
                              		"org.Aioc.Integer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2796:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    {
                    // InternalAioc.g:2796:6: ( (lv_strValue_1_0= RULE_STRING ) )
                    // InternalAioc.g:2797:1: (lv_strValue_1_0= RULE_STRING )
                    {
                    // InternalAioc.g:2797:1: (lv_strValue_1_0= RULE_STRING )
                    // InternalAioc.g:2798:3: lv_strValue_1_0= RULE_STRING
                    {
                    lv_strValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_strValue_1_0, grammarAccess.getConstantAccess().getStrValueSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"strValue",
                              		lv_strValue_1_0, 
                              		"org.eclipse.xtext.common.Terminals.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2815:6: ( (lv_true_2_0= RULE_TRUE ) )
                    {
                    // InternalAioc.g:2815:6: ( (lv_true_2_0= RULE_TRUE ) )
                    // InternalAioc.g:2816:1: (lv_true_2_0= RULE_TRUE )
                    {
                    // InternalAioc.g:2816:1: (lv_true_2_0= RULE_TRUE )
                    // InternalAioc.g:2817:3: lv_true_2_0= RULE_TRUE
                    {
                    lv_true_2_0=(Token)match(input,RULE_TRUE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_true_2_0, grammarAccess.getConstantAccess().getTrueTRUETerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"true",
                              		lv_true_2_0, 
                              		"org.Aioc.TRUE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:2834:6: ( (lv_false_3_0= RULE_FALSE ) )
                    {
                    // InternalAioc.g:2834:6: ( (lv_false_3_0= RULE_FALSE ) )
                    // InternalAioc.g:2835:1: (lv_false_3_0= RULE_FALSE )
                    {
                    // InternalAioc.g:2835:1: (lv_false_3_0= RULE_FALSE )
                    // InternalAioc.g:2836:3: lv_false_3_0= RULE_FALSE
                    {
                    lv_false_3_0=(Token)match(input,RULE_FALSE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_false_3_0, grammarAccess.getConstantAccess().getFalseFALSETerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"false",
                              		lv_false_3_0, 
                              		"org.Aioc.FALSE");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleCondition"
    // InternalAioc.g:2860:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalAioc.g:2861:2: (iv_ruleCondition= ruleCondition EOF )
            // InternalAioc.g:2862:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalAioc.g:2869:1: ruleCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_operator_1_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:2872:28: ( ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? ) )
            // InternalAioc.g:2873:1: ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? )
            {
            // InternalAioc.g:2873:1: ( ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )? )
            // InternalAioc.g:2873:2: ( (lv_left_0_0= ruleExpression ) ) ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )?
            {
            // InternalAioc.g:2873:2: ( (lv_left_0_0= ruleExpression ) )
            // InternalAioc.g:2874:1: (lv_left_0_0= ruleExpression )
            {
            // InternalAioc.g:2874:1: (lv_left_0_0= ruleExpression )
            // InternalAioc.g:2875:3: lv_left_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConditionAccess().getLeftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_45);
            lv_left_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConditionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"org.Aioc.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalAioc.g:2891:2: ( ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_AND && LA37_0<=RULE_OR)||(LA37_0>=RULE_LT && LA37_0<=RULE_NOT_EQUAL)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAioc.g:2891:3: ( (lv_operator_1_0= ruleConditionOperator ) ) ( (lv_right_2_0= ruleCondition ) )
                    {
                    // InternalAioc.g:2891:3: ( (lv_operator_1_0= ruleConditionOperator ) )
                    // InternalAioc.g:2892:1: (lv_operator_1_0= ruleConditionOperator )
                    {
                    // InternalAioc.g:2892:1: (lv_operator_1_0= ruleConditionOperator )
                    // InternalAioc.g:2893:3: lv_operator_1_0= ruleConditionOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionAccess().getOperatorConditionOperatorParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_36);
                    lv_operator_1_0=ruleConditionOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"operator",
                              		lv_operator_1_0, 
                              		"org.Aioc.ConditionOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAioc.g:2909:2: ( (lv_right_2_0= ruleCondition ) )
                    // InternalAioc.g:2910:1: (lv_right_2_0= ruleCondition )
                    {
                    // InternalAioc.g:2910:1: (lv_right_2_0= ruleCondition )
                    // InternalAioc.g:2911:3: lv_right_2_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConditionAccess().getRightConditionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConditionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"org.Aioc.Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleConditionOperator"
    // InternalAioc.g:2935:1: entryRuleConditionOperator returns [EObject current=null] : iv_ruleConditionOperator= ruleConditionOperator EOF ;
    public final EObject entryRuleConditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionOperator = null;


        try {
            // InternalAioc.g:2936:2: (iv_ruleConditionOperator= ruleConditionOperator EOF )
            // InternalAioc.g:2937:2: iv_ruleConditionOperator= ruleConditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConditionOperator=ruleConditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConditionOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionOperator"


    // $ANTLR start "ruleConditionOperator"
    // InternalAioc.g:2944:1: ruleConditionOperator returns [EObject current=null] : ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) ) ;
    public final EObject ruleConditionOperator() throws RecognitionException {
        EObject current = null;

        Token lv_lt_0_0=null;
        Token lv_leq_1_0=null;
        Token lv_equal_2_0=null;
        Token lv_gt_3_0=null;
        Token lv_geq_4_0=null;
        Token lv_not_equal_5_0=null;
        Token lv_and_6_0=null;
        Token lv_or_7_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:2947:28: ( ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) ) )
            // InternalAioc.g:2948:1: ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) )
            {
            // InternalAioc.g:2948:1: ( ( (lv_lt_0_0= RULE_LT ) ) | ( (lv_leq_1_0= RULE_LEQ ) ) | ( (lv_equal_2_0= RULE_EQUAL ) ) | ( (lv_gt_3_0= RULE_GT ) ) | ( (lv_geq_4_0= RULE_GEQ ) ) | ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) ) | ( (lv_and_6_0= RULE_AND ) ) | ( (lv_or_7_0= RULE_OR ) ) )
            int alt38=8;
            switch ( input.LA(1) ) {
            case RULE_LT:
                {
                alt38=1;
                }
                break;
            case RULE_LEQ:
                {
                alt38=2;
                }
                break;
            case RULE_EQUAL:
                {
                alt38=3;
                }
                break;
            case RULE_GT:
                {
                alt38=4;
                }
                break;
            case RULE_GEQ:
                {
                alt38=5;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt38=6;
                }
                break;
            case RULE_AND:
                {
                alt38=7;
                }
                break;
            case RULE_OR:
                {
                alt38=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalAioc.g:2948:2: ( (lv_lt_0_0= RULE_LT ) )
                    {
                    // InternalAioc.g:2948:2: ( (lv_lt_0_0= RULE_LT ) )
                    // InternalAioc.g:2949:1: (lv_lt_0_0= RULE_LT )
                    {
                    // InternalAioc.g:2949:1: (lv_lt_0_0= RULE_LT )
                    // InternalAioc.g:2950:3: lv_lt_0_0= RULE_LT
                    {
                    lv_lt_0_0=(Token)match(input,RULE_LT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_lt_0_0, grammarAccess.getConditionOperatorAccess().getLtLTTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"lt",
                              		true, 
                              		"org.Aioc.LT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAioc.g:2967:6: ( (lv_leq_1_0= RULE_LEQ ) )
                    {
                    // InternalAioc.g:2967:6: ( (lv_leq_1_0= RULE_LEQ ) )
                    // InternalAioc.g:2968:1: (lv_leq_1_0= RULE_LEQ )
                    {
                    // InternalAioc.g:2968:1: (lv_leq_1_0= RULE_LEQ )
                    // InternalAioc.g:2969:3: lv_leq_1_0= RULE_LEQ
                    {
                    lv_leq_1_0=(Token)match(input,RULE_LEQ,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_leq_1_0, grammarAccess.getConditionOperatorAccess().getLeqLEQTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"leq",
                              		true, 
                              		"org.Aioc.LEQ");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAioc.g:2986:6: ( (lv_equal_2_0= RULE_EQUAL ) )
                    {
                    // InternalAioc.g:2986:6: ( (lv_equal_2_0= RULE_EQUAL ) )
                    // InternalAioc.g:2987:1: (lv_equal_2_0= RULE_EQUAL )
                    {
                    // InternalAioc.g:2987:1: (lv_equal_2_0= RULE_EQUAL )
                    // InternalAioc.g:2988:3: lv_equal_2_0= RULE_EQUAL
                    {
                    lv_equal_2_0=(Token)match(input,RULE_EQUAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_equal_2_0, grammarAccess.getConditionOperatorAccess().getEqualEQUALTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"equal",
                              		true, 
                              		"org.Aioc.EQUAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAioc.g:3005:6: ( (lv_gt_3_0= RULE_GT ) )
                    {
                    // InternalAioc.g:3005:6: ( (lv_gt_3_0= RULE_GT ) )
                    // InternalAioc.g:3006:1: (lv_gt_3_0= RULE_GT )
                    {
                    // InternalAioc.g:3006:1: (lv_gt_3_0= RULE_GT )
                    // InternalAioc.g:3007:3: lv_gt_3_0= RULE_GT
                    {
                    lv_gt_3_0=(Token)match(input,RULE_GT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_gt_3_0, grammarAccess.getConditionOperatorAccess().getGtGTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"gt",
                              		true, 
                              		"org.Aioc.GT");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAioc.g:3024:6: ( (lv_geq_4_0= RULE_GEQ ) )
                    {
                    // InternalAioc.g:3024:6: ( (lv_geq_4_0= RULE_GEQ ) )
                    // InternalAioc.g:3025:1: (lv_geq_4_0= RULE_GEQ )
                    {
                    // InternalAioc.g:3025:1: (lv_geq_4_0= RULE_GEQ )
                    // InternalAioc.g:3026:3: lv_geq_4_0= RULE_GEQ
                    {
                    lv_geq_4_0=(Token)match(input,RULE_GEQ,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_geq_4_0, grammarAccess.getConditionOperatorAccess().getGeqGEQTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"geq",
                              		true, 
                              		"org.Aioc.GEQ");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAioc.g:3043:6: ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) )
                    {
                    // InternalAioc.g:3043:6: ( (lv_not_equal_5_0= RULE_NOT_EQUAL ) )
                    // InternalAioc.g:3044:1: (lv_not_equal_5_0= RULE_NOT_EQUAL )
                    {
                    // InternalAioc.g:3044:1: (lv_not_equal_5_0= RULE_NOT_EQUAL )
                    // InternalAioc.g:3045:3: lv_not_equal_5_0= RULE_NOT_EQUAL
                    {
                    lv_not_equal_5_0=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_not_equal_5_0, grammarAccess.getConditionOperatorAccess().getNot_equalNOT_EQUALTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"not_equal",
                              		true, 
                              		"org.Aioc.NOT_EQUAL");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalAioc.g:3062:6: ( (lv_and_6_0= RULE_AND ) )
                    {
                    // InternalAioc.g:3062:6: ( (lv_and_6_0= RULE_AND ) )
                    // InternalAioc.g:3063:1: (lv_and_6_0= RULE_AND )
                    {
                    // InternalAioc.g:3063:1: (lv_and_6_0= RULE_AND )
                    // InternalAioc.g:3064:3: lv_and_6_0= RULE_AND
                    {
                    lv_and_6_0=(Token)match(input,RULE_AND,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_and_6_0, grammarAccess.getConditionOperatorAccess().getAndANDTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"and",
                              		true, 
                              		"org.Aioc.AND");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalAioc.g:3081:6: ( (lv_or_7_0= RULE_OR ) )
                    {
                    // InternalAioc.g:3081:6: ( (lv_or_7_0= RULE_OR ) )
                    // InternalAioc.g:3082:1: (lv_or_7_0= RULE_OR )
                    {
                    // InternalAioc.g:3082:1: (lv_or_7_0= RULE_OR )
                    // InternalAioc.g:3083:3: lv_or_7_0= RULE_OR
                    {
                    lv_or_7_0=(Token)match(input,RULE_OR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_or_7_0, grammarAccess.getConditionOperatorAccess().getOrORTerminalRuleCall_7_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConditionOperatorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"or",
                              		true, 
                              		"org.Aioc.OR");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditionOperator"


    // $ANTLR start "entryRuleFunction"
    // InternalAioc.g:3107:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalAioc.g:3108:2: (iv_ruleFunction= ruleFunction EOF )
            // InternalAioc.g:3109:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalAioc.g:3116:1: ruleFunction returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_LRND_1=null;
        Token this_COMMA_3=null;
        Token this_RRND_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // InternalAioc.g:3119:28: ( ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND ) )
            // InternalAioc.g:3120:1: ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND )
            {
            // InternalAioc.g:3120:1: ( ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND )
            // InternalAioc.g:3120:2: ( (lv_name_0_0= RULE_ID ) ) this_LRND_1= RULE_LRND ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )? this_RRND_5= RULE_RRND
            {
            // InternalAioc.g:3120:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAioc.g:3121:1: (lv_name_0_0= RULE_ID )
            {
            // InternalAioc.g:3121:1: (lv_name_0_0= RULE_ID )
            // InternalAioc.g:3122:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"org.eclipse.xtext.common.Terminals.ID");
              	    
            }

            }


            }

            this_LRND_1=(Token)match(input,RULE_LRND,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LRND_1, grammarAccess.getFunctionAccess().getLRNDTerminalRuleCall_1()); 
                  
            }
            // InternalAioc.g:3142:1: ( ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_ID && LA40_0<=RULE_STRING)||LA40_0==RULE_LRND||(LA40_0>=RULE_NOT && LA40_0<=RULE_FALSE)||LA40_0==RULE_INT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAioc.g:3142:2: ( (lv_params_2_0= ruleExpression ) ) (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )*
                    {
                    // InternalAioc.g:3142:2: ( (lv_params_2_0= ruleExpression ) )
                    // InternalAioc.g:3143:1: (lv_params_2_0= ruleExpression )
                    {
                    // InternalAioc.g:3143:1: (lv_params_2_0= ruleExpression )
                    // InternalAioc.g:3144:3: lv_params_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_46);
                    lv_params_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                      	        }
                             		add(
                             			current, 
                             			"params",
                              		lv_params_2_0, 
                              		"org.Aioc.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalAioc.g:3160:2: (this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_COMMA) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalAioc.g:3160:3: this_COMMA_3= RULE_COMMA ( (lv_params_4_0= ruleExpression ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_36); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_COMMA_3, grammarAccess.getFunctionAccess().getCOMMATerminalRuleCall_2_1_0()); 
                    	          
                    	    }
                    	    // InternalAioc.g:3164:1: ( (lv_params_4_0= ruleExpression ) )
                    	    // InternalAioc.g:3165:1: (lv_params_4_0= ruleExpression )
                    	    {
                    	    // InternalAioc.g:3165:1: (lv_params_4_0= ruleExpression )
                    	    // InternalAioc.g:3166:3: lv_params_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionAccess().getParamsExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_46);
                    	    lv_params_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"params",
                    	              		lv_params_4_0, 
                    	              		"org.Aioc.Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }

            this_RRND_5=(Token)match(input,RULE_RRND,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RRND_5, grammarAccess.getFunctionAccess().getRRNDTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleInteger"
    // InternalAioc.g:3194:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalAioc.g:3195:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalAioc.g:3196:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalAioc.g:3203:1: ruleInteger returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // InternalAioc.g:3206:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalAioc.g:3207:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalAioc.g:3207:1: ( (lv_value_0_0= RULE_INT ) )
            // InternalAioc.g:3208:1: (lv_value_0_0= RULE_INT )
            {
            // InternalAioc.g:3208:1: (lv_value_0_0= RULE_INT )
            // InternalAioc.g:3209:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntegerAccess().getValueINTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"org.eclipse.xtext.common.Terminals.INT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"

    // $ANTLR start synpred1_InternalAioc
    public final void synpred1_InternalAioc_fragment() throws RecognitionException {   
        // InternalAioc.g:521:8: ( ( RULE_LRND ) )
        // InternalAioc.g:522:1: ( RULE_LRND )
        {
        // InternalAioc.g:522:1: ( RULE_LRND )
        // InternalAioc.g:523:1: RULE_LRND
        {
        match(input,RULE_LRND,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalAioc

    // Delegated rules

    public final boolean synpred1_InternalAioc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAioc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\6\5\uffff\1\10\1\uffff";
    static final String dfa_3s = "\1\71\1\uffff\1\7\5\uffff\1\66\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\3\1\uffff\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\6\3\uffff\1\2\52\uffff\1\1\2\uffff\1\3\1\uffff\1\4\1\5",
            "",
            "\1\10\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\11\55\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1180:1: (lv_event_0_1= ruleSkip | lv_event_0_2= ruleInteraction | lv_event_0_3= ruleLocalCode | lv_event_0_4= ruleIfThenElse | lv_event_0_5= ruleWhile | lv_event_0_6= ruleScope | lv_event_0_7= ruleNestedChoreography )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001004000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0348000000000110L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001164000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001064000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000600103000B00L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000600103000300L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000FC006000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000600103801B00L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000600103800B00L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0C00000000000012L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000000FC006002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000001400L});

}