package org.xtext.geotweet.gtdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.geotweet.gtdsl.services.GTDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGTDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NEWLINE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'red'", "'blue'", "'green'", "'#'", "':'", "'tags'", "'['", "']'", "','", "'country'", "'countries'"
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

    	public void setGrammarAccess(GTDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalGTDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalGTDsl.g:54:1: ( ruleModel EOF )
            // InternalGTDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalGTDsl.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalGTDsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalGTDsl.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalGTDsl.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalGTDsl.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGTDsl.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleType"
    // InternalGTDsl.g:78:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalGTDsl.g:79:1: ( ruleType EOF )
            // InternalGTDsl.g:80:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalGTDsl.g:87:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:91:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalGTDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalGTDsl.g:92:2: ( ( rule__Type__Alternatives ) )
            // InternalGTDsl.g:93:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalGTDsl.g:94:3: ( rule__Type__Alternatives )
            // InternalGTDsl.g:94:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleHashtag"
    // InternalGTDsl.g:103:1: entryRuleHashtag : ruleHashtag EOF ;
    public final void entryRuleHashtag() throws RecognitionException {
        try {
            // InternalGTDsl.g:104:1: ( ruleHashtag EOF )
            // InternalGTDsl.g:105:1: ruleHashtag EOF
            {
             before(grammarAccess.getHashtagRule()); 
            pushFollow(FOLLOW_1);
            ruleHashtag();

            state._fsp--;

             after(grammarAccess.getHashtagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHashtag"


    // $ANTLR start "ruleHashtag"
    // InternalGTDsl.g:112:1: ruleHashtag : ( ( rule__Hashtag__Group__0 ) ) ;
    public final void ruleHashtag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:116:2: ( ( ( rule__Hashtag__Group__0 ) ) )
            // InternalGTDsl.g:117:2: ( ( rule__Hashtag__Group__0 ) )
            {
            // InternalGTDsl.g:117:2: ( ( rule__Hashtag__Group__0 ) )
            // InternalGTDsl.g:118:3: ( rule__Hashtag__Group__0 )
            {
             before(grammarAccess.getHashtagAccess().getGroup()); 
            // InternalGTDsl.g:119:3: ( rule__Hashtag__Group__0 )
            // InternalGTDsl.g:119:4: rule__Hashtag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hashtag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHashtag"


    // $ANTLR start "entryRuleHashtagList"
    // InternalGTDsl.g:128:1: entryRuleHashtagList : ruleHashtagList EOF ;
    public final void entryRuleHashtagList() throws RecognitionException {
        try {
            // InternalGTDsl.g:129:1: ( ruleHashtagList EOF )
            // InternalGTDsl.g:130:1: ruleHashtagList EOF
            {
             before(grammarAccess.getHashtagListRule()); 
            pushFollow(FOLLOW_1);
            ruleHashtagList();

            state._fsp--;

             after(grammarAccess.getHashtagListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHashtagList"


    // $ANTLR start "ruleHashtagList"
    // InternalGTDsl.g:137:1: ruleHashtagList : ( ( rule__HashtagList__Group__0 ) ) ;
    public final void ruleHashtagList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:141:2: ( ( ( rule__HashtagList__Group__0 ) ) )
            // InternalGTDsl.g:142:2: ( ( rule__HashtagList__Group__0 ) )
            {
            // InternalGTDsl.g:142:2: ( ( rule__HashtagList__Group__0 ) )
            // InternalGTDsl.g:143:3: ( rule__HashtagList__Group__0 )
            {
             before(grammarAccess.getHashtagListAccess().getGroup()); 
            // InternalGTDsl.g:144:3: ( rule__HashtagList__Group__0 )
            // InternalGTDsl.g:144:4: rule__HashtagList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHashtagList"


    // $ANTLR start "entryRuleCountry"
    // InternalGTDsl.g:153:1: entryRuleCountry : ruleCountry EOF ;
    public final void entryRuleCountry() throws RecognitionException {
        try {
            // InternalGTDsl.g:154:1: ( ruleCountry EOF )
            // InternalGTDsl.g:155:1: ruleCountry EOF
            {
             before(grammarAccess.getCountryRule()); 
            pushFollow(FOLLOW_1);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getCountryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountry"


    // $ANTLR start "ruleCountry"
    // InternalGTDsl.g:162:1: ruleCountry : ( ( rule__Country__Group__0 ) ) ;
    public final void ruleCountry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:166:2: ( ( ( rule__Country__Group__0 ) ) )
            // InternalGTDsl.g:167:2: ( ( rule__Country__Group__0 ) )
            {
            // InternalGTDsl.g:167:2: ( ( rule__Country__Group__0 ) )
            // InternalGTDsl.g:168:3: ( rule__Country__Group__0 )
            {
             before(grammarAccess.getCountryAccess().getGroup()); 
            // InternalGTDsl.g:169:3: ( rule__Country__Group__0 )
            // InternalGTDsl.g:169:4: rule__Country__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountry"


    // $ANTLR start "entryRuleCountryList"
    // InternalGTDsl.g:178:1: entryRuleCountryList : ruleCountryList EOF ;
    public final void entryRuleCountryList() throws RecognitionException {
        try {
            // InternalGTDsl.g:179:1: ( ruleCountryList EOF )
            // InternalGTDsl.g:180:1: ruleCountryList EOF
            {
             before(grammarAccess.getCountryListRule()); 
            pushFollow(FOLLOW_1);
            ruleCountryList();

            state._fsp--;

             after(grammarAccess.getCountryListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCountryList"


    // $ANTLR start "ruleCountryList"
    // InternalGTDsl.g:187:1: ruleCountryList : ( ( rule__CountryList__Group__0 ) ) ;
    public final void ruleCountryList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:191:2: ( ( ( rule__CountryList__Group__0 ) ) )
            // InternalGTDsl.g:192:2: ( ( rule__CountryList__Group__0 ) )
            {
            // InternalGTDsl.g:192:2: ( ( rule__CountryList__Group__0 ) )
            // InternalGTDsl.g:193:3: ( rule__CountryList__Group__0 )
            {
             before(grammarAccess.getCountryListAccess().getGroup()); 
            // InternalGTDsl.g:194:3: ( rule__CountryList__Group__0 )
            // InternalGTDsl.g:194:4: rule__CountryList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCountryListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCountryList"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGTDsl.g:202:1: rule__Type__Alternatives : ( ( ruleHashtagList ) | ( ruleCountryList ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:206:1: ( ( ruleHashtagList ) | ( ruleCountryList ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGTDsl.g:207:2: ( ruleHashtagList )
                    {
                    // InternalGTDsl.g:207:2: ( ruleHashtagList )
                    // InternalGTDsl.g:208:3: ruleHashtagList
                    {
                     before(grammarAccess.getTypeAccess().getHashtagListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleHashtagList();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getHashtagListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGTDsl.g:213:2: ( ruleCountryList )
                    {
                    // InternalGTDsl.g:213:2: ( ruleCountryList )
                    // InternalGTDsl.g:214:3: ruleCountryList
                    {
                     before(grammarAccess.getTypeAccess().getCountryListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCountryList();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCountryListParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Hashtag__ColorAlternatives_3_0"
    // InternalGTDsl.g:223:1: rule__Hashtag__ColorAlternatives_3_0 : ( ( 'red' ) | ( 'blue' ) | ( 'green' ) );
    public final void rule__Hashtag__ColorAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:227:1: ( ( 'red' ) | ( 'blue' ) | ( 'green' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
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
                    // InternalGTDsl.g:228:2: ( 'red' )
                    {
                    // InternalGTDsl.g:228:2: ( 'red' )
                    // InternalGTDsl.g:229:3: 'red'
                    {
                     before(grammarAccess.getHashtagAccess().getColorRedKeyword_3_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorRedKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGTDsl.g:234:2: ( 'blue' )
                    {
                    // InternalGTDsl.g:234:2: ( 'blue' )
                    // InternalGTDsl.g:235:3: 'blue'
                    {
                     before(grammarAccess.getHashtagAccess().getColorBlueKeyword_3_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorBlueKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGTDsl.g:240:2: ( 'green' )
                    {
                    // InternalGTDsl.g:240:2: ( 'green' )
                    // InternalGTDsl.g:241:3: 'green'
                    {
                     before(grammarAccess.getHashtagAccess().getColorGreenKeyword_3_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorGreenKeyword_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__ColorAlternatives_3_0"


    // $ANTLR start "rule__Hashtag__Group__0"
    // InternalGTDsl.g:250:1: rule__Hashtag__Group__0 : rule__Hashtag__Group__0__Impl rule__Hashtag__Group__1 ;
    public final void rule__Hashtag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:254:1: ( rule__Hashtag__Group__0__Impl rule__Hashtag__Group__1 )
            // InternalGTDsl.g:255:2: rule__Hashtag__Group__0__Impl rule__Hashtag__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Hashtag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hashtag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__0"


    // $ANTLR start "rule__Hashtag__Group__0__Impl"
    // InternalGTDsl.g:262:1: rule__Hashtag__Group__0__Impl : ( '#' ) ;
    public final void rule__Hashtag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:266:1: ( ( '#' ) )
            // InternalGTDsl.g:267:1: ( '#' )
            {
            // InternalGTDsl.g:267:1: ( '#' )
            // InternalGTDsl.g:268:2: '#'
            {
             before(grammarAccess.getHashtagAccess().getNumberSignKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getHashtagAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__0__Impl"


    // $ANTLR start "rule__Hashtag__Group__1"
    // InternalGTDsl.g:277:1: rule__Hashtag__Group__1 : rule__Hashtag__Group__1__Impl rule__Hashtag__Group__2 ;
    public final void rule__Hashtag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:281:1: ( rule__Hashtag__Group__1__Impl rule__Hashtag__Group__2 )
            // InternalGTDsl.g:282:2: rule__Hashtag__Group__1__Impl rule__Hashtag__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Hashtag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hashtag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__1"


    // $ANTLR start "rule__Hashtag__Group__1__Impl"
    // InternalGTDsl.g:289:1: rule__Hashtag__Group__1__Impl : ( ( rule__Hashtag__NameAssignment_1 ) ) ;
    public final void rule__Hashtag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:293:1: ( ( ( rule__Hashtag__NameAssignment_1 ) ) )
            // InternalGTDsl.g:294:1: ( ( rule__Hashtag__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:294:1: ( ( rule__Hashtag__NameAssignment_1 ) )
            // InternalGTDsl.g:295:2: ( rule__Hashtag__NameAssignment_1 )
            {
             before(grammarAccess.getHashtagAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:296:2: ( rule__Hashtag__NameAssignment_1 )
            // InternalGTDsl.g:296:3: rule__Hashtag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Hashtag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHashtagAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__1__Impl"


    // $ANTLR start "rule__Hashtag__Group__2"
    // InternalGTDsl.g:304:1: rule__Hashtag__Group__2 : rule__Hashtag__Group__2__Impl rule__Hashtag__Group__3 ;
    public final void rule__Hashtag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:308:1: ( rule__Hashtag__Group__2__Impl rule__Hashtag__Group__3 )
            // InternalGTDsl.g:309:2: rule__Hashtag__Group__2__Impl rule__Hashtag__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Hashtag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hashtag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__2"


    // $ANTLR start "rule__Hashtag__Group__2__Impl"
    // InternalGTDsl.g:316:1: rule__Hashtag__Group__2__Impl : ( ':' ) ;
    public final void rule__Hashtag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:320:1: ( ( ':' ) )
            // InternalGTDsl.g:321:1: ( ':' )
            {
            // InternalGTDsl.g:321:1: ( ':' )
            // InternalGTDsl.g:322:2: ':'
            {
             before(grammarAccess.getHashtagAccess().getColonKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHashtagAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__2__Impl"


    // $ANTLR start "rule__Hashtag__Group__3"
    // InternalGTDsl.g:331:1: rule__Hashtag__Group__3 : rule__Hashtag__Group__3__Impl ;
    public final void rule__Hashtag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:335:1: ( rule__Hashtag__Group__3__Impl )
            // InternalGTDsl.g:336:2: rule__Hashtag__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hashtag__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__3"


    // $ANTLR start "rule__Hashtag__Group__3__Impl"
    // InternalGTDsl.g:342:1: rule__Hashtag__Group__3__Impl : ( ( rule__Hashtag__ColorAssignment_3 ) ) ;
    public final void rule__Hashtag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:346:1: ( ( ( rule__Hashtag__ColorAssignment_3 ) ) )
            // InternalGTDsl.g:347:1: ( ( rule__Hashtag__ColorAssignment_3 ) )
            {
            // InternalGTDsl.g:347:1: ( ( rule__Hashtag__ColorAssignment_3 ) )
            // InternalGTDsl.g:348:2: ( rule__Hashtag__ColorAssignment_3 )
            {
             before(grammarAccess.getHashtagAccess().getColorAssignment_3()); 
            // InternalGTDsl.g:349:2: ( rule__Hashtag__ColorAssignment_3 )
            // InternalGTDsl.g:349:3: rule__Hashtag__ColorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Hashtag__ColorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHashtagAccess().getColorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__Group__3__Impl"


    // $ANTLR start "rule__HashtagList__Group__0"
    // InternalGTDsl.g:358:1: rule__HashtagList__Group__0 : rule__HashtagList__Group__0__Impl rule__HashtagList__Group__1 ;
    public final void rule__HashtagList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:362:1: ( rule__HashtagList__Group__0__Impl rule__HashtagList__Group__1 )
            // InternalGTDsl.g:363:2: rule__HashtagList__Group__0__Impl rule__HashtagList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__HashtagList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashtagList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__0"


    // $ANTLR start "rule__HashtagList__Group__0__Impl"
    // InternalGTDsl.g:370:1: rule__HashtagList__Group__0__Impl : ( 'tags' ) ;
    public final void rule__HashtagList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:374:1: ( ( 'tags' ) )
            // InternalGTDsl.g:375:1: ( 'tags' )
            {
            // InternalGTDsl.g:375:1: ( 'tags' )
            // InternalGTDsl.g:376:2: 'tags'
            {
             before(grammarAccess.getHashtagListAccess().getTagsKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHashtagListAccess().getTagsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__0__Impl"


    // $ANTLR start "rule__HashtagList__Group__1"
    // InternalGTDsl.g:385:1: rule__HashtagList__Group__1 : rule__HashtagList__Group__1__Impl rule__HashtagList__Group__2 ;
    public final void rule__HashtagList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:389:1: ( rule__HashtagList__Group__1__Impl rule__HashtagList__Group__2 )
            // InternalGTDsl.g:390:2: rule__HashtagList__Group__1__Impl rule__HashtagList__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__HashtagList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashtagList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__1"


    // $ANTLR start "rule__HashtagList__Group__1__Impl"
    // InternalGTDsl.g:397:1: rule__HashtagList__Group__1__Impl : ( ( rule__HashtagList__NameAssignment_1 ) ) ;
    public final void rule__HashtagList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:401:1: ( ( ( rule__HashtagList__NameAssignment_1 ) ) )
            // InternalGTDsl.g:402:1: ( ( rule__HashtagList__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:402:1: ( ( rule__HashtagList__NameAssignment_1 ) )
            // InternalGTDsl.g:403:2: ( rule__HashtagList__NameAssignment_1 )
            {
             before(grammarAccess.getHashtagListAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:404:2: ( rule__HashtagList__NameAssignment_1 )
            // InternalGTDsl.g:404:3: rule__HashtagList__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__1__Impl"


    // $ANTLR start "rule__HashtagList__Group__2"
    // InternalGTDsl.g:412:1: rule__HashtagList__Group__2 : rule__HashtagList__Group__2__Impl rule__HashtagList__Group__3 ;
    public final void rule__HashtagList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:416:1: ( rule__HashtagList__Group__2__Impl rule__HashtagList__Group__3 )
            // InternalGTDsl.g:417:2: rule__HashtagList__Group__2__Impl rule__HashtagList__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__HashtagList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashtagList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__2"


    // $ANTLR start "rule__HashtagList__Group__2__Impl"
    // InternalGTDsl.g:424:1: rule__HashtagList__Group__2__Impl : ( '[' ) ;
    public final void rule__HashtagList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:428:1: ( ( '[' ) )
            // InternalGTDsl.g:429:1: ( '[' )
            {
            // InternalGTDsl.g:429:1: ( '[' )
            // InternalGTDsl.g:430:2: '['
            {
             before(grammarAccess.getHashtagListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getHashtagListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__2__Impl"


    // $ANTLR start "rule__HashtagList__Group__3"
    // InternalGTDsl.g:439:1: rule__HashtagList__Group__3 : rule__HashtagList__Group__3__Impl rule__HashtagList__Group__4 ;
    public final void rule__HashtagList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:443:1: ( rule__HashtagList__Group__3__Impl rule__HashtagList__Group__4 )
            // InternalGTDsl.g:444:2: rule__HashtagList__Group__3__Impl rule__HashtagList__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__HashtagList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashtagList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__3"


    // $ANTLR start "rule__HashtagList__Group__3__Impl"
    // InternalGTDsl.g:451:1: rule__HashtagList__Group__3__Impl : ( ( rule__HashtagList__Group_3__0 ) ) ;
    public final void rule__HashtagList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:455:1: ( ( ( rule__HashtagList__Group_3__0 ) ) )
            // InternalGTDsl.g:456:1: ( ( rule__HashtagList__Group_3__0 ) )
            {
            // InternalGTDsl.g:456:1: ( ( rule__HashtagList__Group_3__0 ) )
            // InternalGTDsl.g:457:2: ( rule__HashtagList__Group_3__0 )
            {
             before(grammarAccess.getHashtagListAccess().getGroup_3()); 
            // InternalGTDsl.g:458:2: ( rule__HashtagList__Group_3__0 )
            // InternalGTDsl.g:458:3: rule__HashtagList__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__3__Impl"


    // $ANTLR start "rule__HashtagList__Group__4"
    // InternalGTDsl.g:466:1: rule__HashtagList__Group__4 : rule__HashtagList__Group__4__Impl ;
    public final void rule__HashtagList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:470:1: ( rule__HashtagList__Group__4__Impl )
            // InternalGTDsl.g:471:2: rule__HashtagList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__4"


    // $ANTLR start "rule__HashtagList__Group__4__Impl"
    // InternalGTDsl.g:477:1: rule__HashtagList__Group__4__Impl : ( ']' ) ;
    public final void rule__HashtagList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:481:1: ( ( ']' ) )
            // InternalGTDsl.g:482:1: ( ']' )
            {
            // InternalGTDsl.g:482:1: ( ']' )
            // InternalGTDsl.g:483:2: ']'
            {
             before(grammarAccess.getHashtagListAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHashtagListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group__4__Impl"


    // $ANTLR start "rule__HashtagList__Group_3__0"
    // InternalGTDsl.g:493:1: rule__HashtagList__Group_3__0 : rule__HashtagList__Group_3__0__Impl rule__HashtagList__Group_3__1 ;
    public final void rule__HashtagList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:497:1: ( rule__HashtagList__Group_3__0__Impl rule__HashtagList__Group_3__1 )
            // InternalGTDsl.g:498:2: rule__HashtagList__Group_3__0__Impl rule__HashtagList__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__HashtagList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashtagList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3__0"


    // $ANTLR start "rule__HashtagList__Group_3__0__Impl"
    // InternalGTDsl.g:505:1: rule__HashtagList__Group_3__0__Impl : ( ( rule__HashtagList__HashtagAssignment_3_0 ) ) ;
    public final void rule__HashtagList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:509:1: ( ( ( rule__HashtagList__HashtagAssignment_3_0 ) ) )
            // InternalGTDsl.g:510:1: ( ( rule__HashtagList__HashtagAssignment_3_0 ) )
            {
            // InternalGTDsl.g:510:1: ( ( rule__HashtagList__HashtagAssignment_3_0 ) )
            // InternalGTDsl.g:511:2: ( rule__HashtagList__HashtagAssignment_3_0 )
            {
             before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_0()); 
            // InternalGTDsl.g:512:2: ( rule__HashtagList__HashtagAssignment_3_0 )
            // InternalGTDsl.g:512:3: rule__HashtagList__HashtagAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__HashtagAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3__0__Impl"


    // $ANTLR start "rule__HashtagList__Group_3__1"
    // InternalGTDsl.g:520:1: rule__HashtagList__Group_3__1 : rule__HashtagList__Group_3__1__Impl ;
    public final void rule__HashtagList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:524:1: ( rule__HashtagList__Group_3__1__Impl )
            // InternalGTDsl.g:525:2: rule__HashtagList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3__1"


    // $ANTLR start "rule__HashtagList__Group_3__1__Impl"
    // InternalGTDsl.g:531:1: rule__HashtagList__Group_3__1__Impl : ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) ) ;
    public final void rule__HashtagList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:535:1: ( ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) ) )
            // InternalGTDsl.g:536:1: ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) )
            {
            // InternalGTDsl.g:536:1: ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) )
            // InternalGTDsl.g:537:2: ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* )
            {
            // InternalGTDsl.g:537:2: ( ( rule__HashtagList__Group_3_1__0 ) )
            // InternalGTDsl.g:538:3: ( rule__HashtagList__Group_3_1__0 )
            {
             before(grammarAccess.getHashtagListAccess().getGroup_3_1()); 
            // InternalGTDsl.g:539:3: ( rule__HashtagList__Group_3_1__0 )
            // InternalGTDsl.g:539:4: rule__HashtagList__Group_3_1__0
            {
            pushFollow(FOLLOW_11);
            rule__HashtagList__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getGroup_3_1()); 

            }

            // InternalGTDsl.g:542:2: ( ( rule__HashtagList__Group_3_1__0 )* )
            // InternalGTDsl.g:543:3: ( rule__HashtagList__Group_3_1__0 )*
            {
             before(grammarAccess.getHashtagListAccess().getGroup_3_1()); 
            // InternalGTDsl.g:544:3: ( rule__HashtagList__Group_3_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGTDsl.g:544:4: rule__HashtagList__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__HashtagList__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getHashtagListAccess().getGroup_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3__1__Impl"


    // $ANTLR start "rule__HashtagList__Group_3_1__0"
    // InternalGTDsl.g:554:1: rule__HashtagList__Group_3_1__0 : rule__HashtagList__Group_3_1__0__Impl rule__HashtagList__Group_3_1__1 ;
    public final void rule__HashtagList__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:558:1: ( rule__HashtagList__Group_3_1__0__Impl rule__HashtagList__Group_3_1__1 )
            // InternalGTDsl.g:559:2: rule__HashtagList__Group_3_1__0__Impl rule__HashtagList__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
            rule__HashtagList__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HashtagList__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3_1__0"


    // $ANTLR start "rule__HashtagList__Group_3_1__0__Impl"
    // InternalGTDsl.g:566:1: rule__HashtagList__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__HashtagList__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:570:1: ( ( ',' ) )
            // InternalGTDsl.g:571:1: ( ',' )
            {
            // InternalGTDsl.g:571:1: ( ',' )
            // InternalGTDsl.g:572:2: ','
            {
             before(grammarAccess.getHashtagListAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHashtagListAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3_1__0__Impl"


    // $ANTLR start "rule__HashtagList__Group_3_1__1"
    // InternalGTDsl.g:581:1: rule__HashtagList__Group_3_1__1 : rule__HashtagList__Group_3_1__1__Impl ;
    public final void rule__HashtagList__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:585:1: ( rule__HashtagList__Group_3_1__1__Impl )
            // InternalGTDsl.g:586:2: rule__HashtagList__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3_1__1"


    // $ANTLR start "rule__HashtagList__Group_3_1__1__Impl"
    // InternalGTDsl.g:592:1: rule__HashtagList__Group_3_1__1__Impl : ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) ) ;
    public final void rule__HashtagList__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:596:1: ( ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) ) )
            // InternalGTDsl.g:597:1: ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) )
            {
            // InternalGTDsl.g:597:1: ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) )
            // InternalGTDsl.g:598:2: ( rule__HashtagList__HashtagAssignment_3_1_1 )
            {
             before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1_1()); 
            // InternalGTDsl.g:599:2: ( rule__HashtagList__HashtagAssignment_3_1_1 )
            // InternalGTDsl.g:599:3: rule__HashtagList__HashtagAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__HashtagList__HashtagAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__Group_3_1__1__Impl"


    // $ANTLR start "rule__Country__Group__0"
    // InternalGTDsl.g:608:1: rule__Country__Group__0 : rule__Country__Group__0__Impl rule__Country__Group__1 ;
    public final void rule__Country__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:612:1: ( rule__Country__Group__0__Impl rule__Country__Group__1 )
            // InternalGTDsl.g:613:2: rule__Country__Group__0__Impl rule__Country__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Country__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Country__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0"


    // $ANTLR start "rule__Country__Group__0__Impl"
    // InternalGTDsl.g:620:1: rule__Country__Group__0__Impl : ( 'country' ) ;
    public final void rule__Country__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:624:1: ( ( 'country' ) )
            // InternalGTDsl.g:625:1: ( 'country' )
            {
            // InternalGTDsl.g:625:1: ( 'country' )
            // InternalGTDsl.g:626:2: 'country'
            {
             before(grammarAccess.getCountryAccess().getCountryKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getCountryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__0__Impl"


    // $ANTLR start "rule__Country__Group__1"
    // InternalGTDsl.g:635:1: rule__Country__Group__1 : rule__Country__Group__1__Impl ;
    public final void rule__Country__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:639:1: ( rule__Country__Group__1__Impl )
            // InternalGTDsl.g:640:2: rule__Country__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Country__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__1"


    // $ANTLR start "rule__Country__Group__1__Impl"
    // InternalGTDsl.g:646:1: rule__Country__Group__1__Impl : ( ( rule__Country__NameAssignment_1 ) ) ;
    public final void rule__Country__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:650:1: ( ( ( rule__Country__NameAssignment_1 ) ) )
            // InternalGTDsl.g:651:1: ( ( rule__Country__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:651:1: ( ( rule__Country__NameAssignment_1 ) )
            // InternalGTDsl.g:652:2: ( rule__Country__NameAssignment_1 )
            {
             before(grammarAccess.getCountryAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:653:2: ( rule__Country__NameAssignment_1 )
            // InternalGTDsl.g:653:3: rule__Country__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Country__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__Group__1__Impl"


    // $ANTLR start "rule__CountryList__Group__0"
    // InternalGTDsl.g:662:1: rule__CountryList__Group__0 : rule__CountryList__Group__0__Impl rule__CountryList__Group__1 ;
    public final void rule__CountryList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:666:1: ( rule__CountryList__Group__0__Impl rule__CountryList__Group__1 )
            // InternalGTDsl.g:667:2: rule__CountryList__Group__0__Impl rule__CountryList__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CountryList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountryList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__0"


    // $ANTLR start "rule__CountryList__Group__0__Impl"
    // InternalGTDsl.g:674:1: rule__CountryList__Group__0__Impl : ( 'countries' ) ;
    public final void rule__CountryList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:678:1: ( ( 'countries' ) )
            // InternalGTDsl.g:679:1: ( 'countries' )
            {
            // InternalGTDsl.g:679:1: ( 'countries' )
            // InternalGTDsl.g:680:2: 'countries'
            {
             before(grammarAccess.getCountryListAccess().getCountriesKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCountryListAccess().getCountriesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__0__Impl"


    // $ANTLR start "rule__CountryList__Group__1"
    // InternalGTDsl.g:689:1: rule__CountryList__Group__1 : rule__CountryList__Group__1__Impl rule__CountryList__Group__2 ;
    public final void rule__CountryList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:693:1: ( rule__CountryList__Group__1__Impl rule__CountryList__Group__2 )
            // InternalGTDsl.g:694:2: rule__CountryList__Group__1__Impl rule__CountryList__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CountryList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountryList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__1"


    // $ANTLR start "rule__CountryList__Group__1__Impl"
    // InternalGTDsl.g:701:1: rule__CountryList__Group__1__Impl : ( ( rule__CountryList__NameAssignment_1 ) ) ;
    public final void rule__CountryList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:705:1: ( ( ( rule__CountryList__NameAssignment_1 ) ) )
            // InternalGTDsl.g:706:1: ( ( rule__CountryList__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:706:1: ( ( rule__CountryList__NameAssignment_1 ) )
            // InternalGTDsl.g:707:2: ( rule__CountryList__NameAssignment_1 )
            {
             before(grammarAccess.getCountryListAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:708:2: ( rule__CountryList__NameAssignment_1 )
            // InternalGTDsl.g:708:3: rule__CountryList__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCountryListAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__1__Impl"


    // $ANTLR start "rule__CountryList__Group__2"
    // InternalGTDsl.g:716:1: rule__CountryList__Group__2 : rule__CountryList__Group__2__Impl rule__CountryList__Group__3 ;
    public final void rule__CountryList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:720:1: ( rule__CountryList__Group__2__Impl rule__CountryList__Group__3 )
            // InternalGTDsl.g:721:2: rule__CountryList__Group__2__Impl rule__CountryList__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__CountryList__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountryList__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__2"


    // $ANTLR start "rule__CountryList__Group__2__Impl"
    // InternalGTDsl.g:728:1: rule__CountryList__Group__2__Impl : ( '[' ) ;
    public final void rule__CountryList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:732:1: ( ( '[' ) )
            // InternalGTDsl.g:733:1: ( '[' )
            {
            // InternalGTDsl.g:733:1: ( '[' )
            // InternalGTDsl.g:734:2: '['
            {
             before(grammarAccess.getCountryListAccess().getLeftSquareBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCountryListAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__2__Impl"


    // $ANTLR start "rule__CountryList__Group__3"
    // InternalGTDsl.g:743:1: rule__CountryList__Group__3 : rule__CountryList__Group__3__Impl rule__CountryList__Group__4 ;
    public final void rule__CountryList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:747:1: ( rule__CountryList__Group__3__Impl rule__CountryList__Group__4 )
            // InternalGTDsl.g:748:2: rule__CountryList__Group__3__Impl rule__CountryList__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__CountryList__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountryList__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__3"


    // $ANTLR start "rule__CountryList__Group__3__Impl"
    // InternalGTDsl.g:755:1: rule__CountryList__Group__3__Impl : ( ( rule__CountryList__Group_3__0 ) ) ;
    public final void rule__CountryList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:759:1: ( ( ( rule__CountryList__Group_3__0 ) ) )
            // InternalGTDsl.g:760:1: ( ( rule__CountryList__Group_3__0 ) )
            {
            // InternalGTDsl.g:760:1: ( ( rule__CountryList__Group_3__0 ) )
            // InternalGTDsl.g:761:2: ( rule__CountryList__Group_3__0 )
            {
             before(grammarAccess.getCountryListAccess().getGroup_3()); 
            // InternalGTDsl.g:762:2: ( rule__CountryList__Group_3__0 )
            // InternalGTDsl.g:762:3: rule__CountryList__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getCountryListAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__3__Impl"


    // $ANTLR start "rule__CountryList__Group__4"
    // InternalGTDsl.g:770:1: rule__CountryList__Group__4 : rule__CountryList__Group__4__Impl ;
    public final void rule__CountryList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:774:1: ( rule__CountryList__Group__4__Impl )
            // InternalGTDsl.g:775:2: rule__CountryList__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__4"


    // $ANTLR start "rule__CountryList__Group__4__Impl"
    // InternalGTDsl.g:781:1: rule__CountryList__Group__4__Impl : ( ']' ) ;
    public final void rule__CountryList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:785:1: ( ( ']' ) )
            // InternalGTDsl.g:786:1: ( ']' )
            {
            // InternalGTDsl.g:786:1: ( ']' )
            // InternalGTDsl.g:787:2: ']'
            {
             before(grammarAccess.getCountryListAccess().getRightSquareBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCountryListAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group__4__Impl"


    // $ANTLR start "rule__CountryList__Group_3__0"
    // InternalGTDsl.g:797:1: rule__CountryList__Group_3__0 : rule__CountryList__Group_3__0__Impl rule__CountryList__Group_3__1 ;
    public final void rule__CountryList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:801:1: ( rule__CountryList__Group_3__0__Impl rule__CountryList__Group_3__1 )
            // InternalGTDsl.g:802:2: rule__CountryList__Group_3__0__Impl rule__CountryList__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__CountryList__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountryList__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3__0"


    // $ANTLR start "rule__CountryList__Group_3__0__Impl"
    // InternalGTDsl.g:809:1: rule__CountryList__Group_3__0__Impl : ( ( rule__CountryList__CountryAssignment_3_0 ) ) ;
    public final void rule__CountryList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:813:1: ( ( ( rule__CountryList__CountryAssignment_3_0 ) ) )
            // InternalGTDsl.g:814:1: ( ( rule__CountryList__CountryAssignment_3_0 ) )
            {
            // InternalGTDsl.g:814:1: ( ( rule__CountryList__CountryAssignment_3_0 ) )
            // InternalGTDsl.g:815:2: ( rule__CountryList__CountryAssignment_3_0 )
            {
             before(grammarAccess.getCountryListAccess().getCountryAssignment_3_0()); 
            // InternalGTDsl.g:816:2: ( rule__CountryList__CountryAssignment_3_0 )
            // InternalGTDsl.g:816:3: rule__CountryList__CountryAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__CountryAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getCountryListAccess().getCountryAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3__0__Impl"


    // $ANTLR start "rule__CountryList__Group_3__1"
    // InternalGTDsl.g:824:1: rule__CountryList__Group_3__1 : rule__CountryList__Group_3__1__Impl ;
    public final void rule__CountryList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:828:1: ( rule__CountryList__Group_3__1__Impl )
            // InternalGTDsl.g:829:2: rule__CountryList__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3__1"


    // $ANTLR start "rule__CountryList__Group_3__1__Impl"
    // InternalGTDsl.g:835:1: rule__CountryList__Group_3__1__Impl : ( ( rule__CountryList__Group_3_1__0 )* ) ;
    public final void rule__CountryList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:839:1: ( ( ( rule__CountryList__Group_3_1__0 )* ) )
            // InternalGTDsl.g:840:1: ( ( rule__CountryList__Group_3_1__0 )* )
            {
            // InternalGTDsl.g:840:1: ( ( rule__CountryList__Group_3_1__0 )* )
            // InternalGTDsl.g:841:2: ( rule__CountryList__Group_3_1__0 )*
            {
             before(grammarAccess.getCountryListAccess().getGroup_3_1()); 
            // InternalGTDsl.g:842:2: ( rule__CountryList__Group_3_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGTDsl.g:842:3: rule__CountryList__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CountryList__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCountryListAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3__1__Impl"


    // $ANTLR start "rule__CountryList__Group_3_1__0"
    // InternalGTDsl.g:851:1: rule__CountryList__Group_3_1__0 : rule__CountryList__Group_3_1__0__Impl rule__CountryList__Group_3_1__1 ;
    public final void rule__CountryList__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:855:1: ( rule__CountryList__Group_3_1__0__Impl rule__CountryList__Group_3_1__1 )
            // InternalGTDsl.g:856:2: rule__CountryList__Group_3_1__0__Impl rule__CountryList__Group_3_1__1
            {
            pushFollow(FOLLOW_12);
            rule__CountryList__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CountryList__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3_1__0"


    // $ANTLR start "rule__CountryList__Group_3_1__0__Impl"
    // InternalGTDsl.g:863:1: rule__CountryList__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CountryList__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:867:1: ( ( ',' ) )
            // InternalGTDsl.g:868:1: ( ',' )
            {
            // InternalGTDsl.g:868:1: ( ',' )
            // InternalGTDsl.g:869:2: ','
            {
             before(grammarAccess.getCountryListAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCountryListAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3_1__0__Impl"


    // $ANTLR start "rule__CountryList__Group_3_1__1"
    // InternalGTDsl.g:878:1: rule__CountryList__Group_3_1__1 : rule__CountryList__Group_3_1__1__Impl ;
    public final void rule__CountryList__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:882:1: ( rule__CountryList__Group_3_1__1__Impl )
            // InternalGTDsl.g:883:2: rule__CountryList__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3_1__1"


    // $ANTLR start "rule__CountryList__Group_3_1__1__Impl"
    // InternalGTDsl.g:889:1: rule__CountryList__Group_3_1__1__Impl : ( ( rule__CountryList__CountryAssignment_3_1_1 ) ) ;
    public final void rule__CountryList__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:893:1: ( ( ( rule__CountryList__CountryAssignment_3_1_1 ) ) )
            // InternalGTDsl.g:894:1: ( ( rule__CountryList__CountryAssignment_3_1_1 ) )
            {
            // InternalGTDsl.g:894:1: ( ( rule__CountryList__CountryAssignment_3_1_1 ) )
            // InternalGTDsl.g:895:2: ( rule__CountryList__CountryAssignment_3_1_1 )
            {
             before(grammarAccess.getCountryListAccess().getCountryAssignment_3_1_1()); 
            // InternalGTDsl.g:896:2: ( rule__CountryList__CountryAssignment_3_1_1 )
            // InternalGTDsl.g:896:3: rule__CountryList__CountryAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CountryList__CountryAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCountryListAccess().getCountryAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__Group_3_1__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalGTDsl.g:905:1: rule__Model__ElementsAssignment : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:909:1: ( ( ruleType ) )
            // InternalGTDsl.g:910:2: ( ruleType )
            {
            // InternalGTDsl.g:910:2: ( ruleType )
            // InternalGTDsl.g:911:3: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Hashtag__NameAssignment_1"
    // InternalGTDsl.g:920:1: rule__Hashtag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Hashtag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:924:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:925:2: ( RULE_ID )
            {
            // InternalGTDsl.g:925:2: ( RULE_ID )
            // InternalGTDsl.g:926:3: RULE_ID
            {
             before(grammarAccess.getHashtagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHashtagAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__NameAssignment_1"


    // $ANTLR start "rule__Hashtag__ColorAssignment_3"
    // InternalGTDsl.g:935:1: rule__Hashtag__ColorAssignment_3 : ( ( rule__Hashtag__ColorAlternatives_3_0 ) ) ;
    public final void rule__Hashtag__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:939:1: ( ( ( rule__Hashtag__ColorAlternatives_3_0 ) ) )
            // InternalGTDsl.g:940:2: ( ( rule__Hashtag__ColorAlternatives_3_0 ) )
            {
            // InternalGTDsl.g:940:2: ( ( rule__Hashtag__ColorAlternatives_3_0 ) )
            // InternalGTDsl.g:941:3: ( rule__Hashtag__ColorAlternatives_3_0 )
            {
             before(grammarAccess.getHashtagAccess().getColorAlternatives_3_0()); 
            // InternalGTDsl.g:942:3: ( rule__Hashtag__ColorAlternatives_3_0 )
            // InternalGTDsl.g:942:4: rule__Hashtag__ColorAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Hashtag__ColorAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagAccess().getColorAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hashtag__ColorAssignment_3"


    // $ANTLR start "rule__HashtagList__NameAssignment_1"
    // InternalGTDsl.g:950:1: rule__HashtagList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HashtagList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:954:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:955:2: ( RULE_ID )
            {
            // InternalGTDsl.g:955:2: ( RULE_ID )
            // InternalGTDsl.g:956:3: RULE_ID
            {
             before(grammarAccess.getHashtagListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHashtagListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__NameAssignment_1"


    // $ANTLR start "rule__HashtagList__HashtagAssignment_3_0"
    // InternalGTDsl.g:965:1: rule__HashtagList__HashtagAssignment_3_0 : ( ruleHashtag ) ;
    public final void rule__HashtagList__HashtagAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:969:1: ( ( ruleHashtag ) )
            // InternalGTDsl.g:970:2: ( ruleHashtag )
            {
            // InternalGTDsl.g:970:2: ( ruleHashtag )
            // InternalGTDsl.g:971:3: ruleHashtag
            {
             before(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleHashtag();

            state._fsp--;

             after(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__HashtagAssignment_3_0"


    // $ANTLR start "rule__HashtagList__HashtagAssignment_3_1_1"
    // InternalGTDsl.g:980:1: rule__HashtagList__HashtagAssignment_3_1_1 : ( ruleHashtag ) ;
    public final void rule__HashtagList__HashtagAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:984:1: ( ( ruleHashtag ) )
            // InternalGTDsl.g:985:2: ( ruleHashtag )
            {
            // InternalGTDsl.g:985:2: ( ruleHashtag )
            // InternalGTDsl.g:986:3: ruleHashtag
            {
             before(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHashtag();

            state._fsp--;

             after(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HashtagList__HashtagAssignment_3_1_1"


    // $ANTLR start "rule__Country__NameAssignment_1"
    // InternalGTDsl.g:995:1: rule__Country__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Country__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:999:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1000:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1000:2: ( RULE_ID )
            // InternalGTDsl.g:1001:3: RULE_ID
            {
             before(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Country__NameAssignment_1"


    // $ANTLR start "rule__CountryList__NameAssignment_1"
    // InternalGTDsl.g:1010:1: rule__CountryList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CountryList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1014:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1015:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1015:2: ( RULE_ID )
            // InternalGTDsl.g:1016:3: RULE_ID
            {
             before(grammarAccess.getCountryListAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountryListAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__NameAssignment_1"


    // $ANTLR start "rule__CountryList__CountryAssignment_3_0"
    // InternalGTDsl.g:1025:1: rule__CountryList__CountryAssignment_3_0 : ( ruleCountry ) ;
    public final void rule__CountryList__CountryAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1029:1: ( ( ruleCountry ) )
            // InternalGTDsl.g:1030:2: ( ruleCountry )
            {
            // InternalGTDsl.g:1030:2: ( ruleCountry )
            // InternalGTDsl.g:1031:3: ruleCountry
            {
             before(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__CountryAssignment_3_0"


    // $ANTLR start "rule__CountryList__CountryAssignment_3_1_1"
    // InternalGTDsl.g:1040:1: rule__CountryList__CountryAssignment_3_1_1 : ( ruleCountry ) ;
    public final void rule__CountryList__CountryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1044:1: ( ( ruleCountry ) )
            // InternalGTDsl.g:1045:2: ( ruleCountry )
            {
            // InternalGTDsl.g:1045:2: ( ruleCountry )
            // InternalGTDsl.g:1046:3: ruleCountry
            {
             before(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCountry();

            state._fsp--;

             after(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CountryList__CountryAssignment_3_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}