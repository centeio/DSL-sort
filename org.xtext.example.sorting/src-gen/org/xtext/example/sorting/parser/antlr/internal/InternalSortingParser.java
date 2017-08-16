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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'config'", "'{'", "'}'", "'@'", "'='", "'.*'", "'.'", "'import'", "'int'", "'String'", "'double'", "'long'", "'['", "']'", "'source'", "'in:'", "'out:'", "'method:'", "'filter'", "'sink'", "'call:'", "'('", "')'", "'args:'", "','", "'->'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalSorting.g:71:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParam ) )+ ( (lv_imports_5_0= ruleImport ) )+ ( (lv_components_6_0= ruleComponent ) )+ ( (lv_instances_7_0= ruleInstance ) )+ ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_9=null;
        EObject lv_params_4_0 = null;

        EObject lv_imports_5_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_instances_7_0 = null;

        EObject lv_transitions_8_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:77:2: ( ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParam ) )+ ( (lv_imports_5_0= ruleImport ) )+ ( (lv_components_6_0= ruleComponent ) )+ ( (lv_instances_7_0= ruleInstance ) )+ ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' ) )
            // InternalSorting.g:78:2: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParam ) )+ ( (lv_imports_5_0= ruleImport ) )+ ( (lv_components_6_0= ruleComponent ) )+ ( (lv_instances_7_0= ruleInstance ) )+ ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' )
            {
            // InternalSorting.g:78:2: ( () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParam ) )+ ( (lv_imports_5_0= ruleImport ) )+ ( (lv_components_6_0= ruleComponent ) )+ ( (lv_instances_7_0= ruleInstance ) )+ ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}' )
            // InternalSorting.g:79:3: () otherlv_1= 'config' otherlv_2= '{' ( (lv_name_3_0= RULE_ID ) ) ( (lv_params_4_0= ruleParam ) )+ ( (lv_imports_5_0= ruleImport ) )+ ( (lv_components_6_0= ruleComponent ) )+ ( (lv_instances_7_0= ruleInstance ) )+ ( (lv_transitions_8_0= ruleTransition ) )+ otherlv_9= '}'
            {
            // InternalSorting.g:79:3: ()
            // InternalSorting.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

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

            // InternalSorting.g:112:3: ( (lv_params_4_0= ruleParam ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=19 && LA1_0<=22)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSorting.g:113:4: (lv_params_4_0= ruleParam )
            	    {
            	    // InternalSorting.g:113:4: (lv_params_4_0= ruleParam )
            	    // InternalSorting.g:114:5: lv_params_4_0= ruleParam
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getParamsParamParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_params_4_0=ruleParam();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_4_0,
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

            // InternalSorting.g:131:3: ( (lv_imports_5_0= ruleImport ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSorting.g:132:4: (lv_imports_5_0= ruleImport )
            	    {
            	    // InternalSorting.g:132:4: (lv_imports_5_0= ruleImport )
            	    // InternalSorting.g:133:5: lv_imports_5_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getImportsImportParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_imports_5_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_5_0,
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

            // InternalSorting.g:150:3: ( (lv_components_6_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==25||(LA3_0>=29 && LA3_0<=30)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSorting.g:151:4: (lv_components_6_0= ruleComponent )
            	    {
            	    // InternalSorting.g:151:4: (lv_components_6_0= ruleComponent )
            	    // InternalSorting.g:152:5: lv_components_6_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getComponentsComponentParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_components_6_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_6_0,
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

            // InternalSorting.g:169:3: ( (lv_instances_7_0= ruleInstance ) )+
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
            	    // InternalSorting.g:170:4: (lv_instances_7_0= ruleInstance )
            	    {
            	    // InternalSorting.g:170:4: (lv_instances_7_0= ruleInstance )
            	    // InternalSorting.g:171:5: lv_instances_7_0= ruleInstance
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getInstancesInstanceParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_instances_7_0=ruleInstance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instances",
            	    						lv_instances_7_0,
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

            // InternalSorting.g:188:3: ( (lv_transitions_8_0= ruleTransition ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSorting.g:189:4: (lv_transitions_8_0= ruleTransition )
            	    {
            	    // InternalSorting.g:189:4: (lv_transitions_8_0= ruleTransition )
            	    // InternalSorting.g:190:5: lv_transitions_8_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getTransitionsTransitionParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_transitions_8_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_8_0,
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

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalSorting.g:215:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalSorting.g:215:46: (iv_ruleParam= ruleParam EOF )
            // InternalSorting.g:216:2: iv_ruleParam= ruleParam EOF
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
    // InternalSorting.g:222:1: ruleParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= '@' ) ) this_ID_2= RULE_ID otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:228:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= '@' ) ) this_ID_2= RULE_ID otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalSorting.g:229:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= '@' ) ) this_ID_2= RULE_ID otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalSorting.g:229:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= '@' ) ) this_ID_2= RULE_ID otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalSorting.g:230:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= '@' ) ) this_ID_2= RULE_ID otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
            {
            // InternalSorting.g:230:3: ( (lv_type_0_0= ruleType ) )
            // InternalSorting.g:231:4: (lv_type_0_0= ruleType )
            {
            // InternalSorting.g:231:4: (lv_type_0_0= ruleType )
            // InternalSorting.g:232:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParamAccess().getTypeTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.sorting.Sorting.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSorting.g:249:3: ( (lv_name_1_0= '@' ) )
            // InternalSorting.g:250:4: (lv_name_1_0= '@' )
            {
            // InternalSorting.g:250:4: (lv_name_1_0= '@' )
            // InternalSorting.g:251:5: lv_name_1_0= '@'
            {
            lv_name_1_0=(Token)match(input,14,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameCommercialAtKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(current, "name", lv_name_1_0, "@");
            				

            }


            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            			newLeafNode(this_ID_2, grammarAccess.getParamAccess().getIDTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getParamAccess().getEqualsSignKeyword_3());
            		
            // InternalSorting.g:271:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalSorting.g:272:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalSorting.g:272:4: (lv_value_4_0= RULE_STRING )
            // InternalSorting.g:273:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getParamAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalSorting.g:293:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalSorting.g:293:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalSorting.g:294:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalSorting.g:300:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:306:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalSorting.g:307:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalSorting.g:307:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalSorting.g:308:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalSorting.g:318:3: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSorting.g:319:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalSorting.g:329:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalSorting.g:329:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalSorting.g:330:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalSorting.g:336:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSorting.g:342:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalSorting.g:343:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalSorting.g:343:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalSorting.g:344:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalSorting.g:351:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSorting.g:352:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalSorting.g:369:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalSorting.g:369:47: (iv_ruleImport= ruleImport EOF )
            // InternalSorting.g:370:2: iv_ruleImport= ruleImport EOF
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
    // InternalSorting.g:376:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:382:2: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalSorting.g:383:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalSorting.g:383:2: (otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalSorting.g:384:3: otherlv_0= 'import' ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalSorting.g:388:3: ( (lv_name_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalSorting.g:389:4: (lv_name_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalSorting.g:389:4: (lv_name_1_0= ruleQualifiedNameWithWildcard )
            // InternalSorting.g:390:5: lv_name_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getNameQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.sorting.Sorting.QualifiedNameWithWildcard");
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
    // InternalSorting.g:411:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalSorting.g:411:45: (iv_rulePort= rulePort EOF )
            // InternalSorting.g:412:2: iv_rulePort= rulePort EOF
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
    // InternalSorting.g:418:1: rulePort returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:424:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) ) )
            // InternalSorting.g:425:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            {
            // InternalSorting.g:425:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) ) )
            // InternalSorting.g:426:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= ruleType ) )
            {
            // InternalSorting.g:426:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSorting.g:427:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSorting.g:427:4: (lv_name_0_0= RULE_ID )
            // InternalSorting.g:428:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSorting.g:444:3: ( (lv_type_1_0= ruleType ) )
            // InternalSorting.g:445:4: (lv_type_1_0= ruleType )
            {
            // InternalSorting.g:445:4: (lv_type_1_0= ruleType )
            // InternalSorting.g:446:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getPortAccess().getTypeTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.sorting.Sorting.Type");
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
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleType"
    // InternalSorting.g:467:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSorting.g:467:45: (iv_ruleType= ruleType EOF )
            // InternalSorting.g:468:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSorting.g:474:1: ruleType returns [EObject current=null] : ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSorting.g:480:2: ( ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? ) )
            // InternalSorting.g:481:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? )
            {
            // InternalSorting.g:481:2: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )? )
            // InternalSorting.g:482:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) ) (otherlv_1= '[' otherlv_2= ']' )?
            {
            // InternalSorting.g:482:3: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) ) )
            // InternalSorting.g:483:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) )
            {
            // InternalSorting.g:483:4: ( (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' ) )
            // InternalSorting.g:484:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' )
            {
            // InternalSorting.g:484:5: (lv_type_0_1= 'int' | lv_type_0_2= 'String' | lv_type_0_3= 'double' | lv_type_0_4= 'long' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSorting.g:485:6: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,19,FOLLOW_16); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getTypeAccess().getTypeIntKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSorting.g:496:6: lv_type_0_2= 'String'
                    {
                    lv_type_0_2=(Token)match(input,20,FOLLOW_16); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getTypeAccess().getTypeStringKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalSorting.g:507:6: lv_type_0_3= 'double'
                    {
                    lv_type_0_3=(Token)match(input,21,FOLLOW_16); 

                    						newLeafNode(lv_type_0_3, grammarAccess.getTypeAccess().getTypeDoubleKeyword_0_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalSorting.g:518:6: lv_type_0_4= 'long'
                    {
                    lv_type_0_4=(Token)match(input,22,FOLLOW_16); 

                    						newLeafNode(lv_type_0_4, grammarAccess.getTypeAccess().getTypeLongKeyword_0_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTypeRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalSorting.g:531:3: (otherlv_1= '[' otherlv_2= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSorting.g:532:4: otherlv_1= '[' otherlv_2= ']'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getRightSquareBracketKeyword_1_1());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleComponent"
    // InternalSorting.g:545:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSorting.g:545:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSorting.g:546:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalSorting.g:552:1: ruleComponent returns [EObject current=null] : (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Source_0 = null;

        EObject this_Sink_1 = null;

        EObject this_Filter_2 = null;



        	enterRule();

        try {
            // InternalSorting.g:558:2: ( (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter ) )
            // InternalSorting.g:559:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter )
            {
            // InternalSorting.g:559:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink | this_Filter_2= ruleFilter )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 30:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSorting.g:560:3: this_Source_0= ruleSource
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
                    // InternalSorting.g:569:3: this_Sink_1= ruleSink
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
                    // InternalSorting.g:578:3: this_Filter_2= ruleFilter
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
    // InternalSorting.g:590:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalSorting.g:590:47: (iv_ruleSource= ruleSource EOF )
            // InternalSorting.g:591:2: iv_ruleSource= ruleSource EOF
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
    // InternalSorting.g:597:1: ruleSource returns [EObject current=null] : (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_method_8_0=null;
        Token otherlv_9=null;
        Token this_STRING_10=null;
        Token otherlv_11=null;
        EObject lv_inPorts_4_0 = null;

        EObject lv_outPorts_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:603:2: ( (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) )
            // InternalSorting.g:604:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            {
            // InternalSorting.g:604:2: (otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            // InternalSorting.g:605:3: otherlv_0= 'source' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )? otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSourceAccess().getSourceKeyword_0());
            		
            // InternalSorting.g:609:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:610:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:610:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:611:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSourceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSorting.g:631:3: (otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSorting.g:632:4: otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSourceAccess().getInKeyword_3_0());
                    			
                    // InternalSorting.g:636:4: ( (lv_inPorts_4_0= rulePort ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSorting.g:637:5: (lv_inPorts_4_0= rulePort )
                    	    {
                    	    // InternalSorting.g:637:5: (lv_inPorts_4_0= rulePort )
                    	    // InternalSorting.g:638:6: lv_inPorts_4_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getSourceAccess().getInPortsPortParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
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
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSourceAccess().getOutKeyword_4());
            		
            // InternalSorting.g:660:3: ( (lv_outPorts_6_0= rulePort ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSorting.g:661:4: (lv_outPorts_6_0= rulePort )
            	    {
            	    // InternalSorting.g:661:4: (lv_outPorts_6_0= rulePort )
            	    // InternalSorting.g:662:5: lv_outPorts_6_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getSourceAccess().getOutPortsPortParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // InternalSorting.g:679:3: (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSorting.g:680:4: otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getMethodKeyword_6_0());
                    			
                    // InternalSorting.g:684:4: ( (lv_method_8_0= RULE_STRING ) )
                    // InternalSorting.g:685:5: (lv_method_8_0= RULE_STRING )
                    {
                    // InternalSorting.g:685:5: (lv_method_8_0= RULE_STRING )
                    // InternalSorting.g:686:6: lv_method_8_0= RULE_STRING
                    {
                    lv_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_method_8_0, grammarAccess.getSourceAccess().getMethodSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSorting.g:702:4: (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSorting.g:703:5: otherlv_9= '.' this_STRING_10= RULE_STRING
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSourceAccess().getFullStopKeyword_6_2_0());
                    	    				
                    	    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    	    					newLeafNode(this_STRING_10, grammarAccess.getSourceAccess().getSTRINGTerminalRuleCall_6_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSourceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSorting.g:721:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalSorting.g:721:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalSorting.g:722:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalSorting.g:728:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_method_8_0=null;
        Token otherlv_9=null;
        Token this_STRING_10=null;
        Token otherlv_11=null;
        EObject lv_inPorts_4_0 = null;

        EObject lv_outPorts_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:734:2: ( (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) )
            // InternalSorting.g:735:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            {
            // InternalSorting.g:735:2: (otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            // InternalSorting.g:736:3: otherlv_0= 'filter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalSorting.g:740:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:741:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:741:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:742:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getInKeyword_3());
            		
            // InternalSorting.g:766:3: ( (lv_inPorts_4_0= rulePort ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSorting.g:767:4: (lv_inPorts_4_0= rulePort )
            	    {
            	    // InternalSorting.g:767:4: (lv_inPorts_4_0= rulePort )
            	    // InternalSorting.g:768:5: lv_inPorts_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getFilterAccess().getInPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFilterAccess().getOutKeyword_5());
            		
            // InternalSorting.g:789:3: ( (lv_outPorts_6_0= rulePort ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSorting.g:790:4: (lv_outPorts_6_0= rulePort )
            	    {
            	    // InternalSorting.g:790:4: (lv_outPorts_6_0= rulePort )
            	    // InternalSorting.g:791:5: lv_outPorts_6_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getFilterAccess().getOutPortsPortParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_20);
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            // InternalSorting.g:808:3: (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSorting.g:809:4: otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getFilterAccess().getMethodKeyword_7_0());
                    			
                    // InternalSorting.g:813:4: ( (lv_method_8_0= RULE_STRING ) )
                    // InternalSorting.g:814:5: (lv_method_8_0= RULE_STRING )
                    {
                    // InternalSorting.g:814:5: (lv_method_8_0= RULE_STRING )
                    // InternalSorting.g:815:6: lv_method_8_0= RULE_STRING
                    {
                    lv_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_method_8_0, grammarAccess.getFilterAccess().getMethodSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSorting.g:831:4: (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSorting.g:832:5: otherlv_9= '.' this_STRING_10= RULE_STRING
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getFilterAccess().getFullStopKeyword_7_2_0());
                    	    				
                    	    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    	    					newLeafNode(this_STRING_10, grammarAccess.getFilterAccess().getSTRINGTerminalRuleCall_7_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalSorting.g:850:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalSorting.g:850:45: (iv_ruleSink= ruleSink EOF )
            // InternalSorting.g:851:2: iv_ruleSink= ruleSink EOF
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
    // InternalSorting.g:857:1: ruleSink returns [EObject current=null] : (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) ;
    public final EObject ruleSink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_method_8_0=null;
        Token otherlv_9=null;
        Token this_STRING_10=null;
        Token otherlv_11=null;
        EObject lv_inPorts_4_0 = null;

        EObject lv_outPorts_6_0 = null;



        	enterRule();

        try {
            // InternalSorting.g:863:2: ( (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' ) )
            // InternalSorting.g:864:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            {
            // InternalSorting.g:864:2: (otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}' )
            // InternalSorting.g:865:3: otherlv_0= 'sink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'in:' ( (lv_inPorts_4_0= rulePort ) )+ (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )? (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalSorting.g:869:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:870:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:870:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:871:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getInKeyword_3());
            		
            // InternalSorting.g:895:3: ( (lv_inPorts_4_0= rulePort ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSorting.g:896:4: (lv_inPorts_4_0= rulePort )
            	    {
            	    // InternalSorting.g:896:4: (lv_inPorts_4_0= rulePort )
            	    // InternalSorting.g:897:5: lv_inPorts_4_0= rulePort
            	    {

            	    					newCompositeNode(grammarAccess.getSinkAccess().getInPortsPortParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_23);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            // InternalSorting.g:914:3: (otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+ )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSorting.g:915:4: otherlv_5= 'out:' ( (lv_outPorts_6_0= rulePort ) )+
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getSinkAccess().getOutKeyword_5_0());
                    			
                    // InternalSorting.g:919:4: ( (lv_outPorts_6_0= rulePort ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSorting.g:920:5: (lv_outPorts_6_0= rulePort )
                    	    {
                    	    // InternalSorting.g:920:5: (lv_outPorts_6_0= rulePort )
                    	    // InternalSorting.g:921:6: lv_outPorts_6_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getSinkAccess().getOutPortsPortParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_20);
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
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            // InternalSorting.g:939:3: (otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSorting.g:940:4: otherlv_7= 'method:' ( (lv_method_8_0= RULE_STRING ) ) (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getSinkAccess().getMethodKeyword_6_0());
                    			
                    // InternalSorting.g:944:4: ( (lv_method_8_0= RULE_STRING ) )
                    // InternalSorting.g:945:5: (lv_method_8_0= RULE_STRING )
                    {
                    // InternalSorting.g:945:5: (lv_method_8_0= RULE_STRING )
                    // InternalSorting.g:946:6: lv_method_8_0= RULE_STRING
                    {
                    lv_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_method_8_0, grammarAccess.getSinkAccess().getMethodSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSinkRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"method",
                    							lv_method_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    // InternalSorting.g:962:4: (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSorting.g:963:5: otherlv_9= '.' this_STRING_10= RULE_STRING
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getFullStopKeyword_6_2_0());
                    	    				
                    	    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    	    					newLeafNode(this_STRING_10, grammarAccess.getSinkAccess().getSTRINGTerminalRuleCall_6_2_1());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSorting.g:981:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // InternalSorting.g:981:49: (iv_ruleInstance= ruleInstance EOF )
            // InternalSorting.g:982:2: iv_ruleInstance= ruleInstance EOF
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
    // InternalSorting.g:988:1: ruleInstance returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}' )? ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_method_4_0=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token otherlv_9=null;
        Token this_STRING_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_args_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalSorting.g:994:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}' )? ) )
            // InternalSorting.g:995:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}' )? )
            {
            // InternalSorting.g:995:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}' )? )
            // InternalSorting.g:996:3: ( (otherlv_0= RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}' )?
            {
            // InternalSorting.g:996:3: ( (otherlv_0= RULE_ID ) )
            // InternalSorting.g:997:4: (otherlv_0= RULE_ID )
            {
            // InternalSorting.g:997:4: (otherlv_0= RULE_ID )
            // InternalSorting.g:998:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstanceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getComponentComponentCrossReference_0_0());
            				

            }


            }

            // InternalSorting.g:1009:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSorting.g:1010:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSorting.g:1010:4: (lv_name_1_0= RULE_ID )
            // InternalSorting.g:1011:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

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

            // InternalSorting.g:1027:3: (otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==12) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSorting.g:1028:4: otherlv_2= '{' ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) ) otherlv_14= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalSorting.g:1032:4: ( (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' ) | (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==31) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==34) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalSorting.g:1033:5: (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' )
                            {
                            // InternalSorting.g:1033:5: (otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')' )
                            // InternalSorting.g:1034:6: otherlv_3= 'call:' ( (lv_method_4_0= RULE_STRING ) ) (otherlv_5= '.' this_STRING_6= RULE_STRING )* otherlv_7= '(' this_STRING_8= RULE_STRING (otherlv_9= '.' this_STRING_10= RULE_STRING )* otherlv_11= ')'
                            {
                            otherlv_3=(Token)match(input,31,FOLLOW_13); 

                            						newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getCallKeyword_2_1_0_0());
                            					
                            // InternalSorting.g:1038:6: ( (lv_method_4_0= RULE_STRING ) )
                            // InternalSorting.g:1039:7: (lv_method_4_0= RULE_STRING )
                            {
                            // InternalSorting.g:1039:7: (lv_method_4_0= RULE_STRING )
                            // InternalSorting.g:1040:8: lv_method_4_0= RULE_STRING
                            {
                            lv_method_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                            								newLeafNode(lv_method_4_0, grammarAccess.getInstanceAccess().getMethodSTRINGTerminalRuleCall_2_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getInstanceRule());
                            								}
                            								setWithLastConsumed(
                            									current,
                            									"method",
                            									lv_method_4_0,
                            									"org.eclipse.xtext.common.Terminals.STRING");
                            							

                            }


                            }

                            // InternalSorting.g:1056:6: (otherlv_5= '.' this_STRING_6= RULE_STRING )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==17) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalSorting.g:1057:7: otherlv_5= '.' this_STRING_6= RULE_STRING
                            	    {
                            	    otherlv_5=(Token)match(input,17,FOLLOW_13); 

                            	    							newLeafNode(otherlv_5, grammarAccess.getInstanceAccess().getFullStopKeyword_2_1_0_2_0());
                            	    						
                            	    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_26); 

                            	    							newLeafNode(this_STRING_6, grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_2_1_0_2_1());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            otherlv_7=(Token)match(input,32,FOLLOW_13); 

                            						newLeafNode(otherlv_7, grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_2_1_0_3());
                            					
                            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_27); 

                            						newLeafNode(this_STRING_8, grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_2_1_0_4());
                            					
                            // InternalSorting.g:1074:6: (otherlv_9= '.' this_STRING_10= RULE_STRING )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==17) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalSorting.g:1075:7: otherlv_9= '.' this_STRING_10= RULE_STRING
                            	    {
                            	    otherlv_9=(Token)match(input,17,FOLLOW_13); 

                            	    							newLeafNode(otherlv_9, grammarAccess.getInstanceAccess().getFullStopKeyword_2_1_0_5_0());
                            	    						
                            	    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_27); 

                            	    							newLeafNode(this_STRING_10, grammarAccess.getInstanceAccess().getSTRINGTerminalRuleCall_2_1_0_5_1());
                            	    						

                            	    }
                            	    break;

                            	default :
                            	    break loop26;
                                }
                            } while (true);

                            otherlv_11=(Token)match(input,33,FOLLOW_28); 

                            						newLeafNode(otherlv_11, grammarAccess.getInstanceAccess().getRightParenthesisKeyword_2_1_0_6());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalSorting.g:1090:5: (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* )
                            {
                            // InternalSorting.g:1090:5: (otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )* )
                            // InternalSorting.g:1091:6: otherlv_12= 'args:' ( (lv_args_13_0= RULE_STRING ) )*
                            {
                            otherlv_12=(Token)match(input,34,FOLLOW_29); 

                            						newLeafNode(otherlv_12, grammarAccess.getInstanceAccess().getArgsKeyword_2_1_1_0());
                            					
                            // InternalSorting.g:1095:6: ( (lv_args_13_0= RULE_STRING ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==RULE_STRING) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalSorting.g:1096:7: (lv_args_13_0= RULE_STRING )
                            	    {
                            	    // InternalSorting.g:1096:7: (lv_args_13_0= RULE_STRING )
                            	    // InternalSorting.g:1097:8: lv_args_13_0= RULE_STRING
                            	    {
                            	    lv_args_13_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                            	    								newLeafNode(lv_args_13_0, grammarAccess.getInstanceAccess().getArgsSTRINGTerminalRuleCall_2_1_1_1_0());
                            	    							

                            	    								if (current==null) {
                            	    									current = createModelElement(grammarAccess.getInstanceRule());
                            	    								}
                            	    								addWithLastConsumed(
                            	    									current,
                            	    									"args",
                            	    									lv_args_13_0,
                            	    									"org.eclipse.xtext.common.Terminals.STRING");
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop27;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getInstanceAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

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
    // InternalSorting.g:1124:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalSorting.g:1124:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalSorting.g:1125:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalSorting.g:1131:1: ruleTransition returns [EObject current=null] : (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' ) ;
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
            // InternalSorting.g:1137:2: ( (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' ) )
            // InternalSorting.g:1138:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' )
            {
            // InternalSorting.g:1138:2: (otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']' )
            // InternalSorting.g:1139:3: otherlv_0= '[' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= ']' otherlv_5= '->' otherlv_6= '[' ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' ( (otherlv_9= RULE_ID ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSorting.g:1143:3: ( (otherlv_1= RULE_ID ) )
            // InternalSorting.g:1144:4: (otherlv_1= RULE_ID )
            {
            // InternalSorting.g:1144:4: (otherlv_1= RULE_ID )
            // InternalSorting.g:1145:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getSourceInstanceCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getCommaKeyword_2());
            		
            // InternalSorting.g:1160:3: ( (otherlv_3= RULE_ID ) )
            // InternalSorting.g:1161:4: (otherlv_3= RULE_ID )
            {
            // InternalSorting.g:1161:4: (otherlv_3= RULE_ID )
            // InternalSorting.g:1162:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetPortPortCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,24,FOLLOW_31); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_5());
            		
            otherlv_6=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalSorting.g:1185:3: ( (otherlv_7= RULE_ID ) )
            // InternalSorting.g:1186:4: (otherlv_7= RULE_ID )
            {
            // InternalSorting.g:1186:4: (otherlv_7= RULE_ID )
            // InternalSorting.g:1187:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetInstanceCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getCommaKeyword_8());
            		
            // InternalSorting.g:1202:3: ( (otherlv_9= RULE_ID ) )
            // InternalSorting.g:1203:4: (otherlv_9= RULE_ID )
            {
            // InternalSorting.g:1203:4: (otherlv_9= RULE_ID )
            // InternalSorting.g:1204:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getSourcePortPortCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000062040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000062000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000018002010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800000L});

}