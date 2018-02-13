package org.xtext.geotweet.gtdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.geotweet.gtdsl.services.GTDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGTDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NEWLINE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "':'", "'red'", "'blue'", "'green'", "'tags'", "'['", "']'", "'country'", "'countries'", "','"
    };
    public static final int RULE_NEWLINE=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGTDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGTDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGTDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGTDsl.g"; }



     	private GTDslGrammarAccess grammarAccess;

        public InternalGTDslParser(TokenStream input, GTDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected GTDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalGTDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalGTDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalGTDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGTDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalGTDsl.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalGTDsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalGTDsl.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGTDsl.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalGTDsl.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalGTDsl.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.geotweet.gtdsl.GTDsl.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalGTDsl.g:100:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalGTDsl.g:100:45: (iv_ruleType= ruleType EOF )
            // InternalGTDsl.g:101:2: iv_ruleType= ruleType EOF
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
    // InternalGTDsl.g:107:1: ruleType returns [EObject current=null] : (this_HashtagList_0= ruleHashtagList | this_CountryList_1= ruleCountryList ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_HashtagList_0 = null;

        EObject this_CountryList_1 = null;



        	enterRule();

        try {
            // InternalGTDsl.g:113:2: ( (this_HashtagList_0= ruleHashtagList | this_CountryList_1= ruleCountryList ) )
            // InternalGTDsl.g:114:2: (this_HashtagList_0= ruleHashtagList | this_CountryList_1= ruleCountryList )
            {
            // InternalGTDsl.g:114:2: (this_HashtagList_0= ruleHashtagList | this_CountryList_1= ruleCountryList )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGTDsl.g:115:3: this_HashtagList_0= ruleHashtagList
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getHashtagListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_HashtagList_0=ruleHashtagList();

                    state._fsp--;


                    			current = this_HashtagList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGTDsl.g:124:3: this_CountryList_1= ruleCountryList
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getCountryListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CountryList_1=ruleCountryList();

                    state._fsp--;


                    			current = this_CountryList_1;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleHashtag"
    // InternalGTDsl.g:136:1: entryRuleHashtag returns [EObject current=null] : iv_ruleHashtag= ruleHashtag EOF ;
    public final EObject entryRuleHashtag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashtag = null;


        try {
            // InternalGTDsl.g:136:48: (iv_ruleHashtag= ruleHashtag EOF )
            // InternalGTDsl.g:137:2: iv_ruleHashtag= ruleHashtag EOF
            {
             newCompositeNode(grammarAccess.getHashtagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHashtag=ruleHashtag();

            state._fsp--;

             current =iv_ruleHashtag; 
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
    // $ANTLR end "entryRuleHashtag"


    // $ANTLR start "ruleHashtag"
    // InternalGTDsl.g:143:1: ruleHashtag returns [EObject current=null] : ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) ) ) (this_NEWLINE_4= RULE_NEWLINE )+ ) ;
    public final EObject ruleHashtag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_color_3_1=null;
        Token lv_color_3_2=null;
        Token lv_color_3_3=null;
        Token this_NEWLINE_4=null;


        	enterRule();

        try {
            // InternalGTDsl.g:149:2: ( ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) ) ) (this_NEWLINE_4= RULE_NEWLINE )+ ) )
            // InternalGTDsl.g:150:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) ) ) (this_NEWLINE_4= RULE_NEWLINE )+ )
            {
            // InternalGTDsl.g:150:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) ) ) (this_NEWLINE_4= RULE_NEWLINE )+ )
            // InternalGTDsl.g:151:3: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) ) ) (this_NEWLINE_4= RULE_NEWLINE )+
            {
            // InternalGTDsl.g:151:3: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) ) )
            // InternalGTDsl.g:152:4: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            				newLeafNode(otherlv_0, grammarAccess.getHashtagAccess().getNumberSignKeyword_0_0());
            			
            // InternalGTDsl.g:156:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalGTDsl.g:157:5: (lv_name_1_0= RULE_ID )
            {
            // InternalGTDsl.g:157:5: (lv_name_1_0= RULE_ID )
            // InternalGTDsl.g:158:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            						newLeafNode(lv_name_1_0, grammarAccess.getHashtagAccess().getNameIDTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getHashtagRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getHashtagAccess().getColonKeyword_0_2());
            			
            // InternalGTDsl.g:178:4: ( ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) ) )
            // InternalGTDsl.g:179:5: ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) )
            {
            // InternalGTDsl.g:179:5: ( (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' ) )
            // InternalGTDsl.g:180:6: (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' )
            {
            // InternalGTDsl.g:180:6: (lv_color_3_1= 'red' | lv_color_3_2= 'blue' | lv_color_3_3= 'green' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGTDsl.g:181:7: lv_color_3_1= 'red'
                    {
                    lv_color_3_1=(Token)match(input,14,FOLLOW_7); 

                    							newLeafNode(lv_color_3_1, grammarAccess.getHashtagAccess().getColorRedKeyword_0_3_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHashtagRule());
                    							}
                    							setWithLastConsumed(current, "color", lv_color_3_1, null);
                    						

                    }
                    break;
                case 2 :
                    // InternalGTDsl.g:192:7: lv_color_3_2= 'blue'
                    {
                    lv_color_3_2=(Token)match(input,15,FOLLOW_7); 

                    							newLeafNode(lv_color_3_2, grammarAccess.getHashtagAccess().getColorBlueKeyword_0_3_0_1());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHashtagRule());
                    							}
                    							setWithLastConsumed(current, "color", lv_color_3_2, null);
                    						

                    }
                    break;
                case 3 :
                    // InternalGTDsl.g:203:7: lv_color_3_3= 'green'
                    {
                    lv_color_3_3=(Token)match(input,16,FOLLOW_7); 

                    							newLeafNode(lv_color_3_3, grammarAccess.getHashtagAccess().getColorGreenKeyword_0_3_0_2());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getHashtagRule());
                    							}
                    							setWithLastConsumed(current, "color", lv_color_3_3, null);
                    						

                    }
                    break;

            }


            }


            }


            }

            // InternalGTDsl.g:217:3: (this_NEWLINE_4= RULE_NEWLINE )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGTDsl.g:218:4: this_NEWLINE_4= RULE_NEWLINE
            	    {
            	    this_NEWLINE_4=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

            	    				newLeafNode(this_NEWLINE_4, grammarAccess.getHashtagAccess().getNEWLINETerminalRuleCall_1());
            	    			

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
    // $ANTLR end "ruleHashtag"


    // $ANTLR start "entryRuleHashtagList"
    // InternalGTDsl.g:227:1: entryRuleHashtagList returns [EObject current=null] : iv_ruleHashtagList= ruleHashtagList EOF ;
    public final EObject entryRuleHashtagList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHashtagList = null;


        try {
            // InternalGTDsl.g:227:52: (iv_ruleHashtagList= ruleHashtagList EOF )
            // InternalGTDsl.g:228:2: iv_ruleHashtagList= ruleHashtagList EOF
            {
             newCompositeNode(grammarAccess.getHashtagListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHashtagList=ruleHashtagList();

            state._fsp--;

             current =iv_ruleHashtagList; 
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
    // $ANTLR end "entryRuleHashtagList"


    // $ANTLR start "ruleHashtagList"
    // InternalGTDsl.g:234:1: ruleHashtagList returns [EObject current=null] : (otherlv_0= 'tags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+ ) otherlv_5= ']' ) ;
    public final EObject ruleHashtagList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_hashtag_3_0 = null;

        EObject lv_hashtag_4_0 = null;



        	enterRule();

        try {
            // InternalGTDsl.g:240:2: ( (otherlv_0= 'tags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+ ) otherlv_5= ']' ) )
            // InternalGTDsl.g:241:2: (otherlv_0= 'tags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+ ) otherlv_5= ']' )
            {
            // InternalGTDsl.g:241:2: (otherlv_0= 'tags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+ ) otherlv_5= ']' )
            // InternalGTDsl.g:242:3: otherlv_0= 'tags' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+ ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHashtagListAccess().getTagsKeyword_0());
            		
            // InternalGTDsl.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGTDsl.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGTDsl.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalGTDsl.g:248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHashtagListAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHashtagListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getHashtagListAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalGTDsl.g:268:3: ( ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+ )
            // InternalGTDsl.g:269:4: ( (lv_hashtag_3_0= ruleHashtag ) ) ( (lv_hashtag_4_0= ruleHashtag ) )+
            {
            // InternalGTDsl.g:269:4: ( (lv_hashtag_3_0= ruleHashtag ) )
            // InternalGTDsl.g:270:5: (lv_hashtag_3_0= ruleHashtag )
            {
            // InternalGTDsl.g:270:5: (lv_hashtag_3_0= ruleHashtag )
            // InternalGTDsl.g:271:6: lv_hashtag_3_0= ruleHashtag
            {

            						newCompositeNode(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_10);
            lv_hashtag_3_0=ruleHashtag();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getHashtagListRule());
            						}
            						add(
            							current,
            							"hashtag",
            							lv_hashtag_3_0,
            							"org.xtext.geotweet.gtdsl.GTDsl.Hashtag");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGTDsl.g:288:4: ( (lv_hashtag_4_0= ruleHashtag ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGTDsl.g:289:5: (lv_hashtag_4_0= ruleHashtag )
            	    {
            	    // InternalGTDsl.g:289:5: (lv_hashtag_4_0= ruleHashtag )
            	    // InternalGTDsl.g:290:6: lv_hashtag_4_0= ruleHashtag
            	    {

            	    						newCompositeNode(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_hashtag_4_0=ruleHashtag();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHashtagListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hashtag",
            	    							lv_hashtag_4_0,
            	    							"org.xtext.geotweet.gtdsl.GTDsl.Hashtag");
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


            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getHashtagListAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleHashtagList"


    // $ANTLR start "entryRuleCountry"
    // InternalGTDsl.g:316:1: entryRuleCountry returns [EObject current=null] : iv_ruleCountry= ruleCountry EOF ;
    public final EObject entryRuleCountry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountry = null;


        try {
            // InternalGTDsl.g:316:48: (iv_ruleCountry= ruleCountry EOF )
            // InternalGTDsl.g:317:2: iv_ruleCountry= ruleCountry EOF
            {
             newCompositeNode(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountry=ruleCountry();

            state._fsp--;

             current =iv_ruleCountry; 
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
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalGTDsl.g:323:1: ruleCountry returns [EObject current=null] : (otherlv_0= 'country' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCountry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalGTDsl.g:329:2: ( (otherlv_0= 'country' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalGTDsl.g:330:2: (otherlv_0= 'country' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalGTDsl.g:330:2: (otherlv_0= 'country' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalGTDsl.g:331:3: otherlv_0= 'country' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCountryAccess().getCountryKeyword_0());
            		
            // InternalGTDsl.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGTDsl.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGTDsl.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalGTDsl.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleCountryList"
    // InternalGTDsl.g:357:1: entryRuleCountryList returns [EObject current=null] : iv_ruleCountryList= ruleCountryList EOF ;
    public final EObject entryRuleCountryList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCountryList = null;


        try {
            // InternalGTDsl.g:357:52: (iv_ruleCountryList= ruleCountryList EOF )
            // InternalGTDsl.g:358:2: iv_ruleCountryList= ruleCountryList EOF
            {
             newCompositeNode(grammarAccess.getCountryListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCountryList=ruleCountryList();

            state._fsp--;

             current =iv_ruleCountryList; 
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
    // $ANTLR end "entryRuleCountryList"


    // $ANTLR start "ruleCountryList"
    // InternalGTDsl.g:364:1: ruleCountryList returns [EObject current=null] : (otherlv_0= 'countries' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )* ) otherlv_6= ']' ) ;
    public final EObject ruleCountryList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_country_3_0 = null;

        EObject lv_country_5_0 = null;



        	enterRule();

        try {
            // InternalGTDsl.g:370:2: ( (otherlv_0= 'countries' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )* ) otherlv_6= ']' ) )
            // InternalGTDsl.g:371:2: (otherlv_0= 'countries' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )* ) otherlv_6= ']' )
            {
            // InternalGTDsl.g:371:2: (otherlv_0= 'countries' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )* ) otherlv_6= ']' )
            // InternalGTDsl.g:372:3: otherlv_0= 'countries' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )* ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCountryListAccess().getCountriesKeyword_0());
            		
            // InternalGTDsl.g:376:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGTDsl.g:377:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGTDsl.g:377:4: (lv_name_1_0= RULE_ID )
            // InternalGTDsl.g:378:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCountryListAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCountryListRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCountryListAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalGTDsl.g:398:3: ( ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )* )
            // InternalGTDsl.g:399:4: ( (lv_country_3_0= ruleCountry ) ) (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )*
            {
            // InternalGTDsl.g:399:4: ( (lv_country_3_0= ruleCountry ) )
            // InternalGTDsl.g:400:5: (lv_country_3_0= ruleCountry )
            {
            // InternalGTDsl.g:400:5: (lv_country_3_0= ruleCountry )
            // InternalGTDsl.g:401:6: lv_country_3_0= ruleCountry
            {

            						newCompositeNode(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_13);
            lv_country_3_0=ruleCountry();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getCountryListRule());
            						}
            						add(
            							current,
            							"country",
            							lv_country_3_0,
            							"org.xtext.geotweet.gtdsl.GTDsl.Country");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalGTDsl.g:418:4: (otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGTDsl.g:419:5: otherlv_4= ',' ( (lv_country_5_0= ruleCountry ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_12); 

            	    					newLeafNode(otherlv_4, grammarAccess.getCountryListAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalGTDsl.g:423:5: ( (lv_country_5_0= ruleCountry ) )
            	    // InternalGTDsl.g:424:6: (lv_country_5_0= ruleCountry )
            	    {
            	    // InternalGTDsl.g:424:6: (lv_country_5_0= ruleCountry )
            	    // InternalGTDsl.g:425:7: lv_country_5_0= ruleCountry
            	    {

            	    							newCompositeNode(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_13);
            	    lv_country_5_0=ruleCountry();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getCountryListRule());
            	    							}
            	    							add(
            	    								current,
            	    								"country",
            	    								lv_country_5_0,
            	    								"org.xtext.geotweet.gtdsl.GTDsl.Country");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCountryListAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCountryList"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000480000L});

}