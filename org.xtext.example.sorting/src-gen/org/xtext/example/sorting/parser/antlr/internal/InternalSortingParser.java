package org.xtext.example.sorting.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.sorting.services.SortingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSortingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_WS", "RULE_CODE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "'config'", "'{'", "'params'", "'}'", "'imports'", "'components'", "'instances'", "'transitions'", "'param'", "'('", "')'", "','", "'.'", "'!'", "'?'", "'['", "']'", "'+'", "'-'", "'/'", "'*'", "'<'", "'>'", "':'", "'='", "'%'", "'import'", "'port'", "'source'", "'in:'", "'out:'", "'method:'", "'filter'", "'sink'", "'call:'", "'->'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_CODE=8;
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


        public InternalSortingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSortingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSortingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSorting.g"; }



     	private SortingGrammarAccess grammarAccess;

        public InternalSortingParser(TokenStream input, SortingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Config";
       	}

       	@Override
       	protected SortingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleConfig"
    // InternalSorting.g:64:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalSorting.g:64:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalSorting.g:65:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalSorting.g:71:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParam ) )+ otherlv_7= '}' otherlv_8= 'imports' otherlv_9= '{' ( (lv_imports_10_0= ruleImport ) )+ otherlv_11= '}' otherlv_12= 'components' otherlv_13= '{' ( (lv_components_14_0= ruleComponent ) )+ otherlv_15= '}' otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleInstance ) )+ otherlv_19= '}' otherlv_20= 'transitions' otherlv_21= '{' ( (lv_transitions_22_0= ruleTransition ) )+ otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_params_6_0 = null;

        EObject lv_imports_10_0 = null;

        EObject lv_components_14_0 = null;

        EObject lv_instances_18_0 = null;

        EObject lv_transitions_22_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:77:2: ( ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParam ) )+ otherlv_7= '}' otherlv_8= 'imports' otherlv_9= '{' ( (lv_imports_10_0= ruleImport ) )+ otherlv_11= '}' otherlv_12= 'components' otherlv_13= '{' ( (lv_components_14_0= ruleComponent ) )+ otherlv_15= '}' otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleInstance ) )+ otherlv_19= '}' otherlv_20= 'transitions' otherlv_21= '{' ( (lv_transitions_22_0= ruleTransition ) )+ otherlv_23= '}' otherlv_24= '}' ) )
            // InternalSorting.g:78:2: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParam ) )+ otherlv_7= '}' otherlv_8= 'imports' otherlv_9= '{' ( (lv_imports_10_0= ruleImport ) )+ otherlv_11= '}' otherlv_12= 'components' otherlv_13= '{' ( (lv_components_14_0= ruleComponent ) )+ otherlv_15= '}' otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleInstance ) )+ otherlv_19= '}' otherlv_20= 'transitions' otherlv_21= '{' ( (lv_transitions_22_0= ruleTransition ) )+ otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalSorting.g:78:2: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParam ) )+ otherlv_7= '}' otherlv_8= 'imports' otherlv_9= '{' ( (lv_imports_10_0= ruleImport ) )+ otherlv_11= '}' otherlv_12= 'components' otherlv_13= '{' ( (lv_components_14_0= ruleComponent ) )+ otherlv_15= '}' otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleInstance ) )+ otherlv_19= '}' otherlv_20= 'transitions' otherlv_21= '{' ( (lv_transitions_22_0= ruleTransition ) )+ otherlv_23= '}' otherlv_24= '}' )
            // InternalSorting.g:79:3: () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'params' otherlv_5= '{' ( (lv_params_6_0= ruleParam ) )+ otherlv_7= '}' otherlv_8= 'imports' otherlv_9= '{' ( (lv_imports_10_0= ruleImport ) )+ otherlv_11= '}' otherlv_12= 'components' otherlv_13= '{' ( (lv_components_14_0= ruleComponent ) )+ otherlv_15= '}' otherlv_16= 'instances' otherlv_17= '{' ( (lv_instances_18_0= ruleInstance ) )+ otherlv_19= '}' otherlv_20= 'transitions' otherlv_21= '{' ( (lv_transitions_22_0= ruleTransition ) )+ otherlv_23= '}' otherlv_24= '}'
            {
            // InternalSorting.g:79:3: ()
            // InternalSorting.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSorting.g:94:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalSorting.g:95:4: (lv_name_3_0= RULE_ID )
            {
            // InternalSorting.g:95:4: (lv_name_3_0= RULE_ID )
            // InternalSorting.g:96:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_3_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getParamsKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSorting.g:120:3: ( (lv_params_6_0= ruleParam ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSorting.g:121:4: (lv_params_6_0= ruleParam )
            	    {
            	    // InternalSorting.g:121:4: (lv_params_6_0= ruleParam )
            	    // InternalSorting.g:122:5: lv_params_6_0= ruleParam
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getParamsParamParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_params_6_0=ruleParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_6_0,
            	    						"org.xtext.example.sorting.Sorting.Param");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getConfigAccess().getImportsKeyword_8());
            		
            otherlv_9=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSorting.g:151:3: ( (lv_imports_10_0= ruleImport ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSorting.g:152:4: (lv_imports_10_0= ruleImport )
            	    {
            	    // InternalSorting.g:152:4: (lv_imports_10_0= ruleImport )
            	    // InternalSorting.g:153:5: lv_imports_10_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getImportsImportParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_imports_10_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_10_0,
            	    						"org.xtext.example.sorting.Sorting.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_11=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getConfigAccess().getComponentsKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_13, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalSorting.g:182:3: ( (lv_components_14_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==40||(LA3_0>=44 && LA3_0<=45)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSorting.g:183:4: (lv_components_14_0= ruleComponent )
            	    {
            	    // InternalSorting.g:183:4: (lv_components_14_0= ruleComponent )
            	    // InternalSorting.g:184:5: lv_components_14_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_components_14_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_14_0,
            	    						"org.xtext.example.sorting.Sorting.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getConfigAccess().getInstancesKeyword_16());
            		
            otherlv_17=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_17, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_17());
            		
            // InternalSorting.g:213:3: ( (lv_instances_18_0= ruleInstance ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSorting.g:214:4: (lv_instances_18_0= ruleInstance )
            	    {
            	    // InternalSorting.g:214:4: (lv_instances_18_0= ruleInstance )
            	    // InternalSorting.g:215:5: lv_instances_18_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getInstancesInstanceParserRuleCall_18_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_instances_18_0=ruleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instances",
            	    						lv_instances_18_0,
            	    						"org.xtext.example.sorting.Sorting.Instance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_19=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_19, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_20=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_20, grammarAccess.getConfigAccess().getTransitionsKeyword_20());
            		
            otherlv_21=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_21, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_21());
            		
            // InternalSorting.g:244:3: ( (lv_transitions_22_0= ruleTransition ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSorting.g:245:4: (lv_transitions_22_0= ruleTransition )
            	    {
            	    // InternalSorting.g:245:4: (lv_transitions_22_0= ruleTransition )
            	    // InternalSorting.g:246:5: lv_transitions_22_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_22_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_transitions_22_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_22_0,
            	    						"org.xtext.example.sorting.Sorting.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_23=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_23, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_23());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_24());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleParam"
    // InternalSorting.g:275:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSorting.g:275:46: (iv_ruleParam= ruleParam EOF )
            // InternalSorting.g:276:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalSorting.g:282:1: ruleParam returns [EObject current=null] : (otherlv_0= 'param' otherlv_1= '{' ( (lv_value_2_0= ruleAnything ) ) otherlv_3= '}' ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:288:2: ( (otherlv_0= 'param' otherlv_1= '{' ( (lv_value_2_0= ruleAnything ) ) otherlv_3= '}' ) )
            // InternalSorting.g:289:2: (otherlv_0= 'param' otherlv_1= '{' ( (lv_value_2_0= ruleAnything ) ) otherlv_3= '}' )
            {
            // InternalSorting.g:289:2: (otherlv_0= 'param' otherlv_1= '{' ( (lv_value_2_0= ruleAnything ) ) otherlv_3= '}' )
            // InternalSorting.g:290:3: otherlv_0= 'param' otherlv_1= '{' ( (lv_value_2_0= ruleAnything ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSorting.g:298:3: ( (lv_value_2_0= ruleAnything ) )
            // InternalSorting.g:299:4: (lv_value_2_0= ruleAnything )
            {
            // InternalSorting.g:299:4: (lv_value_2_0= ruleAnything )
            // InternalSorting.g:300:5: lv_value_2_0= ruleAnything
            {

            					newCompositeNode(grammarAccess.getParamAccess().getValueAnythingParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_value_2_0=ruleAnything();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.sorting.Sorting.Anything");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParamAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleAnything"
    // InternalSorting.g:325:1: entryRuleAnything returns [String current=null] : iv_ruleAnything= ruleAnything EOF ;
    public final String entryRuleAnything() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnything = null;


        try {
            // InternalSorting.g:325:48: (iv_ruleAnything= ruleAnything EOF )
            // InternalSorting.g:326:2: iv_ruleAnything= ruleAnything EOF
            {
             newCompositeNode(grammarAccess.getAnythingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnything=ruleAnything();

            state._fsp--;

             current =iv_ruleAnything.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnything"


    // $ANTLR start "ruleAnything"
    // InternalSorting.g:332:1: ruleAnything returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '(' | kw= ')' | kw= ',' | kw= '.' | kw= '!' | kw= '?' | kw= '[' | kw= ']' | kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= ':' | kw= '=' | kw= '%' )+ ;
    public final AntlrDatatypeRuleToken ruleAnything() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;
        Token this_WS_3=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSorting.g:338:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '(' | kw= ')' | kw= ',' | kw= '.' | kw= '!' | kw= '?' | kw= '[' | kw= ']' | kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= ':' | kw= '=' | kw= '%' )+ )
            // InternalSorting.g:339:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '(' | kw= ')' | kw= ',' | kw= '.' | kw= '!' | kw= '?' | kw= '[' | kw= ']' | kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= ':' | kw= '=' | kw= '%' )+
            {
            // InternalSorting.g:339:2: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_STRING_2= RULE_STRING | this_WS_3= RULE_WS | kw= '(' | kw= ')' | kw= ',' | kw= '.' | kw= '!' | kw= '?' | kw= '[' | kw= ']' | kw= '+' | kw= '-' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= ':' | kw= '=' | kw= '%' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=22;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt6=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt6=2;
                    }
                    break;
                case RULE_STRING:
                    {
                    alt6=3;
                    }
                    break;
                case RULE_WS:
                    {
                    alt6=4;
                    }
                    break;
                case 21:
                    {
                    alt6=5;
                    }
                    break;
                case 22:
                    {
                    alt6=6;
                    }
                    break;
                case 23:
                    {
                    alt6=7;
                    }
                    break;
                case 24:
                    {
                    alt6=8;
                    }
                    break;
                case 25:
                    {
                    alt6=9;
                    }
                    break;
                case 26:
                    {
                    alt6=10;
                    }
                    break;
                case 27:
                    {
                    alt6=11;
                    }
                    break;
                case 28:
                    {
                    alt6=12;
                    }
                    break;
                case 29:
                    {
                    alt6=13;
                    }
                    break;
                case 30:
                    {
                    alt6=14;
                    }
                    break;
                case 31:
                    {
                    alt6=15;
                    }
                    break;
                case 32:
                    {
                    alt6=16;
                    }
                    break;
                case 33:
                    {
                    alt6=17;
                    }
                    break;
                case 34:
                    {
                    alt6=18;
                    }
                    break;
                case 35:
                    {
                    alt6=19;
                    }
                    break;
                case 36:
                    {
                    alt6=20;
                    }
                    break;
                case 37:
                    {
                    alt6=21;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalSorting.g:340:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getAnythingAccess().getIDTerminalRuleCall_0());
            	    		

            	    }
            	    break;
            	case 2 :
            	    // InternalSorting.g:348:3: this_INT_1= RULE_INT
            	    {
            	    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    			current.merge(this_INT_1);
            	    		

            	    			newLeafNode(this_INT_1, grammarAccess.getAnythingAccess().getINTTerminalRuleCall_1());
            	    		

            	    }
            	    break;
            	case 3 :
            	    // InternalSorting.g:356:3: this_STRING_2= RULE_STRING
            	    {
            	    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    			current.merge(this_STRING_2);
            	    		

            	    			newLeafNode(this_STRING_2, grammarAccess.getAnythingAccess().getSTRINGTerminalRuleCall_2());
            	    		

            	    }
            	    break;
            	case 4 :
            	    // InternalSorting.g:364:3: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FOLLOW_21); 

            	    			current.merge(this_WS_3);
            	    		

            	    			newLeafNode(this_WS_3, grammarAccess.getAnythingAccess().getWSTerminalRuleCall_3());
            	    		

            	    }
            	    break;
            	case 5 :
            	    // InternalSorting.g:372:3: kw= '('
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getLeftParenthesisKeyword_4());
            	    		

            	    }
            	    break;
            	case 6 :
            	    // InternalSorting.g:378:3: kw= ')'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getRightParenthesisKeyword_5());
            	    		

            	    }
            	    break;
            	case 7 :
            	    // InternalSorting.g:384:3: kw= ','
            	    {
            	    kw=(Token)match(input,23,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getCommaKeyword_6());
            	    		

            	    }
            	    break;
            	case 8 :
            	    // InternalSorting.g:390:3: kw= '.'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getFullStopKeyword_7());
            	    		

            	    }
            	    break;
            	case 9 :
            	    // InternalSorting.g:396:3: kw= '!'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getExclamationMarkKeyword_8());
            	    		

            	    }
            	    break;
            	case 10 :
            	    // InternalSorting.g:402:3: kw= '?'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getQuestionMarkKeyword_9());
            	    		

            	    }
            	    break;
            	case 11 :
            	    // InternalSorting.g:408:3: kw= '['
            	    {
            	    kw=(Token)match(input,27,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getLeftSquareBracketKeyword_10());
            	    		

            	    }
            	    break;
            	case 12 :
            	    // InternalSorting.g:414:3: kw= ']'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getRightSquareBracketKeyword_11());
            	    		

            	    }
            	    break;
            	case 13 :
            	    // InternalSorting.g:420:3: kw= '+'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getPlusSignKeyword_12());
            	    		

            	    }
            	    break;
            	case 14 :
            	    // InternalSorting.g:426:3: kw= '-'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getHyphenMinusKeyword_13());
            	    		

            	    }
            	    break;
            	case 15 :
            	    // InternalSorting.g:432:3: kw= '/'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getSolidusKeyword_14());
            	    		

            	    }
            	    break;
            	case 16 :
            	    // InternalSorting.g:438:3: kw= '*'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getAsteriskKeyword_15());
            	    		

            	    }
            	    break;
            	case 17 :
            	    // InternalSorting.g:444:3: kw= '<'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getLessThanSignKeyword_16());
            	    		

            	    }
            	    break;
            	case 18 :
            	    // InternalSorting.g:450:3: kw= '>'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getGreaterThanSignKeyword_17());
            	    		

            	    }
            	    break;
            	case 19 :
            	    // InternalSorting.g:456:3: kw= ':'
            	    {
            	    kw=(Token)match(input,35,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getColonKeyword_18());
            	    		

            	    }
            	    break;
            	case 20 :
            	    // InternalSorting.g:462:3: kw= '='
            	    {
            	    kw=(Token)match(input,36,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getEqualsSignKeyword_19());
            	    		

            	    }
            	    break;
            	case 21 :
            	    // InternalSorting.g:468:3: kw= '%'
            	    {
            	    kw=(Token)match(input,37,FOLLOW_21); 

            	    			current.merge(kw);
            	    			newLeafNode(kw, grammarAccess.getAnythingAccess().getPercentSignKeyword_20());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnything"


    // $ANTLR start "entryRuleImport"
    // InternalSorting.g:477:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSorting.g:477:47: (iv_ruleImport= ruleImport EOF )
            // InternalSorting.g:478:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalSorting.g:484:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleAnything ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:490:2: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleAnything ) ) ) )
            // InternalSorting.g:491:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleAnything ) ) )
            {
            // InternalSorting.g:491:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleAnything ) ) )
            // InternalSorting.g:492:3: otherlv_0= 'import' ( (lv_name_1_0= ruleAnything ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSorting.g:496:3: ( (lv_name_1_0= ruleAnything ) )
            // InternalSorting.g:497:4: (lv_name_1_0= ruleAnything )
            {
            // InternalSorting.g:497:4: (lv_name_1_0= ruleAnything )
            // InternalSorting.g:498:5: lv_name_1_0= ruleAnything
            {

            					newCompositeNode(grammarAccess.getImportAccess().getNameAnythingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleAnything();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.sorting.Sorting.Anything");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePort"
    // InternalSorting.g:519:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalSorting.g:519:45: (iv_rulePort= rulePort EOF )
            // InternalSorting.g:520:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalSorting.g:526:1: rulePort returns [EObject current=null] : (otherlv_0= 'port' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleAnything ) ) otherlv_4= '}' ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:532:2: ( (otherlv_0= 'port' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleAnything ) ) otherlv_4= '}' ) )
            // InternalSorting.g:533:2: (otherlv_0= 'port' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleAnything ) ) otherlv_4= '}' )
            {
            // InternalSorting.g:533:2: (otherlv_0= 'port' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleAnything ) ) otherlv_4= '}' )
            // InternalSorting.g:534:3: otherlv_0= 'port' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) ( (lv_type_3_0= ruleAnything ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPortAccess().getPortKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPortAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalSorting.g:542:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSorting.g:543:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSorting.g:543:4: (lv_name_2_0= RULE_ID )
            // InternalSorting.g:544:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSorting.g:560:3: ( (lv_type_3_0= ruleAnything ) )
            // InternalSorting.g:561:4: (lv_type_3_0= ruleAnything )
            {
            // InternalSorting.g:561:4: (lv_type_3_0= ruleAnything )
            // InternalSorting.g:562:5: lv_type_3_0= ruleAnything
            {

            					newCompositeNode(grammarAccess.getPortAccess().getTypeAnythingParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleAnything();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.sorting.Sorting.Anything");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPortAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleComponent"
    // InternalSorting.g:587:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSorting.g:587:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSorting.g:588:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSorting.g:594:1: ruleComponent returns [EObject current=null] : (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Source_0 = null;

        EObject this_Sink_1 = null;

        EObject this_Filter_2 = null;



        	enterRule();

        try {
            // InternalSorting.g:600:2: ( (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter ) )
            // InternalSorting.g:601:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter )
            {
            // InternalSorting.g:601:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 45:
                {
                alt7=2;
                }
                break;
            case 44:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSorting.g:602:3: this_Source_0= ruleSource
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Source_0=ruleSource();

                    state._fsp--;


                    			current = this_Source_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSorting.g:611:3: this_Sink_1= ruleSink
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sink_1=ruleSink();

                    state._fsp--;


                    			current = this_Sink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSorting.g:620:3: this_Filter_2= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_2=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSource"
    // InternalSorting.g:632:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalSorting.g:632:47: (iv_ruleSource= ruleSource EOF )
            // InternalSorting.g:633:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalSorting.g:639:1: ruleSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_code_8_0=null;
        Token otherlv_9=null;
        EObject lv_inPorts_4_0 = null;

        EObject lv_outPorts_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:645:2: ( (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' ) )
            // InternalSorting.g:646:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' )
            {
            // InternalSorting.g:646:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' )
            // InternalSorting.g:647:3: otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getSourceKeyword_0());
            		
            // InternalSorting.g:651:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:652:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:652:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:653:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSorting.g:673:3: (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSorting.g:674:4: otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_23); 

                    				newLeafNode(otherlv_3, grammarAccess.getSourceAccess().getInKeyword_3_0());
                    			
                    // InternalSorting.g:678:4: ( (lv_inPorts_4_0= rulePort ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==39) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSorting.g:679:5: (lv_inPorts_4_0= rulePort )
                    	    {
                    	    // InternalSorting.g:679:5: (lv_inPorts_4_0= rulePort )
                    	    // InternalSorting.g:680:6: lv_inPorts_4_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getSourceAccess().getInPortsPortParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_inPorts_4_0=rulePort();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"inPorts",
                    	    							lv_inPorts_4_0,
                    	    							"org.xtext.example.sorting.Sorting.Port");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getSourceAccess().getOutKeyword_4());
            		
            // InternalSorting.g:702:3: ( (lv_outPorts_6_0= rulePort ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSorting.g:703:4: (lv_outPorts_6_0= rulePort )
            	    {
            	    // InternalSorting.g:703:4: (lv_outPorts_6_0= rulePort )
            	    // InternalSorting.g:704:5: lv_outPorts_6_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getSourceAccess().getOutPortsPortParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_outPorts_6_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSourceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outPorts",
            	    						lv_outPorts_6_0,
            	    						"org.xtext.example.sorting.Sorting.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // InternalSorting.g:721:3: (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSorting.g:722:4: otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getMethodKeyword_6_0());
                    			
                    // InternalSorting.g:726:4: ( (lv_code_8_0= RULE_CODE ) )
                    // InternalSorting.g:727:5: (lv_code_8_0= RULE_CODE )
                    {
                    // InternalSorting.g:727:5: (lv_code_8_0= RULE_CODE )
                    // InternalSorting.g:728:6: lv_code_8_0= RULE_CODE
                    {
                    lv_code_8_0=(Token)match(input,RULE_CODE,FOLLOW_19); 

                    						newLeafNode(lv_code_8_0, grammarAccess.getSourceAccess().getCodeCODETerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code",
                    							lv_code_8_0,
                    							"org.xtext.example.sorting.Sorting.CODE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleFilter"
    // InternalSorting.g:753:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalSorting.g:753:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalSorting.g:754:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSorting.g:760:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_code_8_0=null;
        Token otherlv_9=null;
        EObject lv_inPorts_4_0 = null;

        EObject lv_outPorts_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:766:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' ) )
            // InternalSorting.g:767:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' )
            {
            // InternalSorting.g:767:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' )
            // InternalSorting.g:768:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalSorting.g:772:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:773:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:773:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:774:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFilterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getInKeyword_3());
            		
            // InternalSorting.g:798:3: ( (lv_inPorts_4_0= rulePort ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSorting.g:799:4: (lv_inPorts_4_0= rulePort )
            	    {
            	    // InternalSorting.g:799:4: (lv_inPorts_4_0= rulePort )
            	    // InternalSorting.g:800:5: lv_inPorts_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getFilterAccess().getInPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_inPorts_4_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFilterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inPorts",
            	    						lv_inPorts_4_0,
            	    						"org.xtext.example.sorting.Sorting.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

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

            otherlv_5=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getOutKeyword_5());
            		
            // InternalSorting.g:821:3: ( (lv_outPorts_6_0= rulePort ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSorting.g:822:4: (lv_outPorts_6_0= rulePort )
            	    {
            	    // InternalSorting.g:822:4: (lv_outPorts_6_0= rulePort )
            	    // InternalSorting.g:823:5: lv_outPorts_6_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getFilterAccess().getOutPortsPortParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_outPorts_6_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFilterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outPorts",
            	    						lv_outPorts_6_0,
            	    						"org.xtext.example.sorting.Sorting.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalSorting.g:840:3: (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSorting.g:841:4: otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getMethodKeyword_7_0());
                    			
                    // InternalSorting.g:845:4: ( (lv_code_8_0= RULE_CODE ) )
                    // InternalSorting.g:846:5: (lv_code_8_0= RULE_CODE )
                    {
                    // InternalSorting.g:846:5: (lv_code_8_0= RULE_CODE )
                    // InternalSorting.g:847:6: lv_code_8_0= RULE_CODE
                    {
                    lv_code_8_0=(Token)match(input,RULE_CODE,FOLLOW_19); 

                    						newLeafNode(lv_code_8_0, grammarAccess.getFilterAccess().getCodeCODETerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code",
                    							lv_code_8_0,
                    							"org.xtext.example.sorting.Sorting.CODE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleSink"
    // InternalSorting.g:872:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalSorting.g:872:45: (iv_ruleSink= ruleSink EOF )
            // InternalSorting.g:873:2: iv_ruleSink= ruleSink EOF
            {
             newCompositeNode(grammarAccess.getSinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSink=ruleSink();

            state._fsp--;

             current =iv_ruleSink; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSink"


    // $ANTLR start "ruleSink"
    // InternalSorting.g:879:1: ruleSink returns [EObject current=null] : (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleSink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_code_8_0=null;
        Token otherlv_9=null;
        EObject lv_inPorts_4_0 = null;

        EObject lv_outPorts_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:885:2: ( (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' ) )
            // InternalSorting.g:886:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' )
            {
            // InternalSorting.g:886:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}' )
            // InternalSorting.g:887:3: otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalSorting.g:891:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:892:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:892:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:893:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getInKeyword_3());
            		
            // InternalSorting.g:917:3: ( (lv_inPorts_4_0= rulePort ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSorting.g:918:4: (lv_inPorts_4_0= rulePort )
            	    {
            	    // InternalSorting.g:918:4: (lv_inPorts_4_0= rulePort )
            	    // InternalSorting.g:919:5: lv_inPorts_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getSinkAccess().getInPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_inPorts_4_0=rulePort();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSinkRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inPorts",
            	    						lv_inPorts_4_0,
            	    						"org.xtext.example.sorting.Sorting.Port");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            // InternalSorting.g:936:3: (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSorting.g:937:4: otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getSinkAccess().getOutKeyword_5_0());
                    			
                    // InternalSorting.g:941:4: ( (lv_outPorts_6_0= rulePort ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==39) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSorting.g:942:5: (lv_outPorts_6_0= rulePort )
                    	    {
                    	    // InternalSorting.g:942:5: (lv_outPorts_6_0= rulePort )
                    	    // InternalSorting.g:943:6: lv_outPorts_6_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getSinkAccess().getOutPortsPortParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_outPorts_6_0=rulePort();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"outPorts",
                    	    							lv_outPorts_6_0,
                    	    							"org.xtext.example.sorting.Sorting.Port");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            // InternalSorting.g:961:3: (otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSorting.g:962:4: otherlv_7= 'method:' ( (lv_code_8_0= RULE_CODE ) )
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getMethodKeyword_6_0());
                    			
                    // InternalSorting.g:966:4: ( (lv_code_8_0= RULE_CODE ) )
                    // InternalSorting.g:967:5: (lv_code_8_0= RULE_CODE )
                    {
                    // InternalSorting.g:967:5: (lv_code_8_0= RULE_CODE )
                    // InternalSorting.g:968:6: lv_code_8_0= RULE_CODE
                    {
                    lv_code_8_0=(Token)match(input,RULE_CODE,FOLLOW_19); 

                    						newLeafNode(lv_code_8_0, grammarAccess.getSinkAccess().getCodeCODETerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"code",
                    							lv_code_8_0,
                    							"org.xtext.example.sorting.Sorting.CODE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSink"


    // $ANTLR start "entryRuleInstance"
    // InternalSorting.g:993:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalSorting.g:993:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalSorting.g:994:2: iv_ruleInstance= ruleInstance EOF
            {
             newCompositeNode(grammarAccess.getInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstance=ruleInstance();

            state._fsp--;

             current =iv_ruleInstance; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // InternalSorting.g:1000:1: ruleInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'call:' ( (lv_code_3_0= RULE_CODE ) ) ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_code_3_0=null;


        	enterRule();

        try {
            // InternalSorting.g:1006:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'call:' ( (lv_code_3_0= RULE_CODE ) ) ) )
            // InternalSorting.g:1007:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'call:' ( (lv_code_3_0= RULE_CODE ) ) )
            {
            // InternalSorting.g:1007:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'call:' ( (lv_code_3_0= RULE_CODE ) ) )
            // InternalSorting.g:1008:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'call:' ( (lv_code_3_0= RULE_CODE ) )
            {
            // InternalSorting.g:1008:3: ( (otherlv_0= RULE_ID ) )
            // InternalSorting.g:1009:4: (otherlv_0= RULE_ID )
            {
            // InternalSorting.g:1009:4: (otherlv_0= RULE_ID )
            // InternalSorting.g:1010:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_0_0());
            				

            }


            }

            // InternalSorting.g:1021:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:1022:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:1022:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:1023:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getCallKeyword_2());
            		
            // InternalSorting.g:1043:3: ( (lv_code_3_0= RULE_CODE ) )
            // InternalSorting.g:1044:4: (lv_code_3_0= RULE_CODE )
            {
            // InternalSorting.g:1044:4: (lv_code_3_0= RULE_CODE )
            // InternalSorting.g:1045:5: lv_code_3_0= RULE_CODE
            {
            lv_code_3_0=(Token)match(input,RULE_CODE,FOLLOW_2); 

            					newLeafNode(lv_code_3_0, grammarAccess.getInstanceAccess().getCodeCODETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"code",
            						lv_code_3_0,
            						"org.xtext.example.sorting.Sorting.CODE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleTransition"
    // InternalSorting.g:1065:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSorting.g:1065:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalSorting.g:1066:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalSorting.g:1072:1: ruleTransition returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalSorting.g:1078:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' ) )
            // InternalSorting.g:1079:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' )
            {
            // InternalSorting.g:1079:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' )
            // InternalSorting.g:1080:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSorting.g:1084:3: ( (otherlv_1= RULE_ID ) )
            // InternalSorting.g:1085:4: (otherlv_1= RULE_ID )
            {
            // InternalSorting.g:1085:4: (otherlv_1= RULE_ID )
            // InternalSorting.g:1086:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getSourceInstanceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getCommaKeyword_2());
            		
            // InternalSorting.g:1101:3: ( (otherlv_3= RULE_ID ) )
            // InternalSorting.g:1102:4: (otherlv_3= RULE_ID )
            {
            // InternalSorting.g:1102:4: (otherlv_3= RULE_ID )
            // InternalSorting.g:1103:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetPortPortCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,47,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalSorting.g:1126:3: ( (otherlv_7= RULE_ID ) )
            // InternalSorting.g:1127:4: (otherlv_7= RULE_ID )
            {
            // InternalSorting.g:1127:4: (otherlv_7= RULE_ID )
            // InternalSorting.g:1128:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetInstanceCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getCommaKeyword_8());
            		
            // InternalSorting.g:1143:3: ( (otherlv_9= RULE_ID ) )
            // InternalSorting.g:1144:4: (otherlv_9= RULE_ID )
            {
            // InternalSorting.g:1144:4: (otherlv_9= RULE_ID )
            // InternalSorting.g:1145:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getSourcePortPortCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000310000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000310000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000003FFFE000F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003FFFE000F2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000088000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000C8000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});

}