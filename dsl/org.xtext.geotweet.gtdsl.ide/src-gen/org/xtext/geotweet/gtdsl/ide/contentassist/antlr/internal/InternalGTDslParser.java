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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'red'", "'blue'", "'green'", "'yellow'", "'#'", "':'", "'tags'", "'['", "']'", "','", "'countries'", "'map'", "'displays'", "'in'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
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
    // InternalGTDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalGTDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalGTDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalGTDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalGTDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalGTDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // InternalGTDsl.g:162:1: ruleCountry : ( ( rule__Country__NameAssignment ) ) ;
    public final void ruleCountry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:166:2: ( ( ( rule__Country__NameAssignment ) ) )
            // InternalGTDsl.g:167:2: ( ( rule__Country__NameAssignment ) )
            {
            // InternalGTDsl.g:167:2: ( ( rule__Country__NameAssignment ) )
            // InternalGTDsl.g:168:3: ( rule__Country__NameAssignment )
            {
             before(grammarAccess.getCountryAccess().getNameAssignment()); 
            // InternalGTDsl.g:169:3: ( rule__Country__NameAssignment )
            // InternalGTDsl.g:169:4: rule__Country__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Country__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCountryAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleQuery"
    // InternalGTDsl.g:203:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalGTDsl.g:204:1: ( ruleQuery EOF )
            // InternalGTDsl.g:205:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalGTDsl.g:212:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:216:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalGTDsl.g:217:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalGTDsl.g:217:2: ( ( rule__Query__Group__0 ) )
            // InternalGTDsl.g:218:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalGTDsl.g:219:3: ( rule__Query__Group__0 )
            // InternalGTDsl.g:219:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalGTDsl.g:227:1: rule__Type__Alternatives : ( ( ruleHashtagList ) | ( ruleCountryList ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:231:1: ( ( ruleHashtagList ) | ( ruleCountryList ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==21) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGTDsl.g:232:2: ( ruleHashtagList )
                    {
                    // InternalGTDsl.g:232:2: ( ruleHashtagList )
                    // InternalGTDsl.g:233:3: ruleHashtagList
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
                    // InternalGTDsl.g:238:2: ( ruleCountryList )
                    {
                    // InternalGTDsl.g:238:2: ( ruleCountryList )
                    // InternalGTDsl.g:239:3: ruleCountryList
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
    // InternalGTDsl.g:248:1: rule__Hashtag__ColorAlternatives_3_0 : ( ( 'red' ) | ( 'blue' ) | ( 'green' ) | ( 'yellow' ) );
    public final void rule__Hashtag__ColorAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:252:1: ( ( 'red' ) | ( 'blue' ) | ( 'green' ) | ( 'yellow' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalGTDsl.g:253:2: ( 'red' )
                    {
                    // InternalGTDsl.g:253:2: ( 'red' )
                    // InternalGTDsl.g:254:3: 'red'
                    {
                     before(grammarAccess.getHashtagAccess().getColorRedKeyword_3_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorRedKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGTDsl.g:259:2: ( 'blue' )
                    {
                    // InternalGTDsl.g:259:2: ( 'blue' )
                    // InternalGTDsl.g:260:3: 'blue'
                    {
                     before(grammarAccess.getHashtagAccess().getColorBlueKeyword_3_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorBlueKeyword_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGTDsl.g:265:2: ( 'green' )
                    {
                    // InternalGTDsl.g:265:2: ( 'green' )
                    // InternalGTDsl.g:266:3: 'green'
                    {
                     before(grammarAccess.getHashtagAccess().getColorGreenKeyword_3_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorGreenKeyword_3_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGTDsl.g:271:2: ( 'yellow' )
                    {
                    // InternalGTDsl.g:271:2: ( 'yellow' )
                    // InternalGTDsl.g:272:3: 'yellow'
                    {
                     before(grammarAccess.getHashtagAccess().getColorYellowKeyword_3_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getHashtagAccess().getColorYellowKeyword_3_0_3()); 

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


    // $ANTLR start "rule__Model__Group__0"
    // InternalGTDsl.g:281:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:285:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalGTDsl.g:286:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalGTDsl.g:293:1: rule__Model__Group__0__Impl : ( ( rule__Model__ElementsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:297:1: ( ( ( rule__Model__ElementsAssignment_0 )* ) )
            // InternalGTDsl.g:298:1: ( ( rule__Model__ElementsAssignment_0 )* )
            {
            // InternalGTDsl.g:298:1: ( ( rule__Model__ElementsAssignment_0 )* )
            // InternalGTDsl.g:299:2: ( rule__Model__ElementsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_0()); 
            // InternalGTDsl.g:300:2: ( rule__Model__ElementsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGTDsl.g:300:3: rule__Model__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalGTDsl.g:308:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:312:1: ( rule__Model__Group__1__Impl )
            // InternalGTDsl.g:313:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalGTDsl.g:319:1: rule__Model__Group__1__Impl : ( ( rule__Model__QueryAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:323:1: ( ( ( rule__Model__QueryAssignment_1 ) ) )
            // InternalGTDsl.g:324:1: ( ( rule__Model__QueryAssignment_1 ) )
            {
            // InternalGTDsl.g:324:1: ( ( rule__Model__QueryAssignment_1 ) )
            // InternalGTDsl.g:325:2: ( rule__Model__QueryAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getQueryAssignment_1()); 
            // InternalGTDsl.g:326:2: ( rule__Model__QueryAssignment_1 )
            // InternalGTDsl.g:326:3: rule__Model__QueryAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__QueryAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getQueryAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Hashtag__Group__0"
    // InternalGTDsl.g:335:1: rule__Hashtag__Group__0 : rule__Hashtag__Group__0__Impl rule__Hashtag__Group__1 ;
    public final void rule__Hashtag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:339:1: ( rule__Hashtag__Group__0__Impl rule__Hashtag__Group__1 )
            // InternalGTDsl.g:340:2: rule__Hashtag__Group__0__Impl rule__Hashtag__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGTDsl.g:347:1: rule__Hashtag__Group__0__Impl : ( '#' ) ;
    public final void rule__Hashtag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:351:1: ( ( '#' ) )
            // InternalGTDsl.g:352:1: ( '#' )
            {
            // InternalGTDsl.g:352:1: ( '#' )
            // InternalGTDsl.g:353:2: '#'
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
    // InternalGTDsl.g:362:1: rule__Hashtag__Group__1 : rule__Hashtag__Group__1__Impl rule__Hashtag__Group__2 ;
    public final void rule__Hashtag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:366:1: ( rule__Hashtag__Group__1__Impl rule__Hashtag__Group__2 )
            // InternalGTDsl.g:367:2: rule__Hashtag__Group__1__Impl rule__Hashtag__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalGTDsl.g:374:1: rule__Hashtag__Group__1__Impl : ( ( rule__Hashtag__NameAssignment_1 ) ) ;
    public final void rule__Hashtag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:378:1: ( ( ( rule__Hashtag__NameAssignment_1 ) ) )
            // InternalGTDsl.g:379:1: ( ( rule__Hashtag__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:379:1: ( ( rule__Hashtag__NameAssignment_1 ) )
            // InternalGTDsl.g:380:2: ( rule__Hashtag__NameAssignment_1 )
            {
             before(grammarAccess.getHashtagAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:381:2: ( rule__Hashtag__NameAssignment_1 )
            // InternalGTDsl.g:381:3: rule__Hashtag__NameAssignment_1
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
    // InternalGTDsl.g:389:1: rule__Hashtag__Group__2 : rule__Hashtag__Group__2__Impl rule__Hashtag__Group__3 ;
    public final void rule__Hashtag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:393:1: ( rule__Hashtag__Group__2__Impl rule__Hashtag__Group__3 )
            // InternalGTDsl.g:394:2: rule__Hashtag__Group__2__Impl rule__Hashtag__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalGTDsl.g:401:1: rule__Hashtag__Group__2__Impl : ( ':' ) ;
    public final void rule__Hashtag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:405:1: ( ( ':' ) )
            // InternalGTDsl.g:406:1: ( ':' )
            {
            // InternalGTDsl.g:406:1: ( ':' )
            // InternalGTDsl.g:407:2: ':'
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
    // InternalGTDsl.g:416:1: rule__Hashtag__Group__3 : rule__Hashtag__Group__3__Impl ;
    public final void rule__Hashtag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:420:1: ( rule__Hashtag__Group__3__Impl )
            // InternalGTDsl.g:421:2: rule__Hashtag__Group__3__Impl
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
    // InternalGTDsl.g:427:1: rule__Hashtag__Group__3__Impl : ( ( rule__Hashtag__ColorAssignment_3 ) ) ;
    public final void rule__Hashtag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:431:1: ( ( ( rule__Hashtag__ColorAssignment_3 ) ) )
            // InternalGTDsl.g:432:1: ( ( rule__Hashtag__ColorAssignment_3 ) )
            {
            // InternalGTDsl.g:432:1: ( ( rule__Hashtag__ColorAssignment_3 ) )
            // InternalGTDsl.g:433:2: ( rule__Hashtag__ColorAssignment_3 )
            {
             before(grammarAccess.getHashtagAccess().getColorAssignment_3()); 
            // InternalGTDsl.g:434:2: ( rule__Hashtag__ColorAssignment_3 )
            // InternalGTDsl.g:434:3: rule__Hashtag__ColorAssignment_3
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
    // InternalGTDsl.g:443:1: rule__HashtagList__Group__0 : rule__HashtagList__Group__0__Impl rule__HashtagList__Group__1 ;
    public final void rule__HashtagList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:447:1: ( rule__HashtagList__Group__0__Impl rule__HashtagList__Group__1 )
            // InternalGTDsl.g:448:2: rule__HashtagList__Group__0__Impl rule__HashtagList__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGTDsl.g:455:1: rule__HashtagList__Group__0__Impl : ( 'tags' ) ;
    public final void rule__HashtagList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:459:1: ( ( 'tags' ) )
            // InternalGTDsl.g:460:1: ( 'tags' )
            {
            // InternalGTDsl.g:460:1: ( 'tags' )
            // InternalGTDsl.g:461:2: 'tags'
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
    // InternalGTDsl.g:470:1: rule__HashtagList__Group__1 : rule__HashtagList__Group__1__Impl rule__HashtagList__Group__2 ;
    public final void rule__HashtagList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:474:1: ( rule__HashtagList__Group__1__Impl rule__HashtagList__Group__2 )
            // InternalGTDsl.g:475:2: rule__HashtagList__Group__1__Impl rule__HashtagList__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGTDsl.g:482:1: rule__HashtagList__Group__1__Impl : ( ( rule__HashtagList__NameAssignment_1 ) ) ;
    public final void rule__HashtagList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:486:1: ( ( ( rule__HashtagList__NameAssignment_1 ) ) )
            // InternalGTDsl.g:487:1: ( ( rule__HashtagList__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:487:1: ( ( rule__HashtagList__NameAssignment_1 ) )
            // InternalGTDsl.g:488:2: ( rule__HashtagList__NameAssignment_1 )
            {
             before(grammarAccess.getHashtagListAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:489:2: ( rule__HashtagList__NameAssignment_1 )
            // InternalGTDsl.g:489:3: rule__HashtagList__NameAssignment_1
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
    // InternalGTDsl.g:497:1: rule__HashtagList__Group__2 : rule__HashtagList__Group__2__Impl rule__HashtagList__Group__3 ;
    public final void rule__HashtagList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:501:1: ( rule__HashtagList__Group__2__Impl rule__HashtagList__Group__3 )
            // InternalGTDsl.g:502:2: rule__HashtagList__Group__2__Impl rule__HashtagList__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalGTDsl.g:509:1: rule__HashtagList__Group__2__Impl : ( '[' ) ;
    public final void rule__HashtagList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:513:1: ( ( '[' ) )
            // InternalGTDsl.g:514:1: ( '[' )
            {
            // InternalGTDsl.g:514:1: ( '[' )
            // InternalGTDsl.g:515:2: '['
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
    // InternalGTDsl.g:524:1: rule__HashtagList__Group__3 : rule__HashtagList__Group__3__Impl rule__HashtagList__Group__4 ;
    public final void rule__HashtagList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:528:1: ( rule__HashtagList__Group__3__Impl rule__HashtagList__Group__4 )
            // InternalGTDsl.g:529:2: rule__HashtagList__Group__3__Impl rule__HashtagList__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalGTDsl.g:536:1: rule__HashtagList__Group__3__Impl : ( ( rule__HashtagList__Group_3__0 ) ) ;
    public final void rule__HashtagList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:540:1: ( ( ( rule__HashtagList__Group_3__0 ) ) )
            // InternalGTDsl.g:541:1: ( ( rule__HashtagList__Group_3__0 ) )
            {
            // InternalGTDsl.g:541:1: ( ( rule__HashtagList__Group_3__0 ) )
            // InternalGTDsl.g:542:2: ( rule__HashtagList__Group_3__0 )
            {
             before(grammarAccess.getHashtagListAccess().getGroup_3()); 
            // InternalGTDsl.g:543:2: ( rule__HashtagList__Group_3__0 )
            // InternalGTDsl.g:543:3: rule__HashtagList__Group_3__0
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
    // InternalGTDsl.g:551:1: rule__HashtagList__Group__4 : rule__HashtagList__Group__4__Impl ;
    public final void rule__HashtagList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:555:1: ( rule__HashtagList__Group__4__Impl )
            // InternalGTDsl.g:556:2: rule__HashtagList__Group__4__Impl
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
    // InternalGTDsl.g:562:1: rule__HashtagList__Group__4__Impl : ( ']' ) ;
    public final void rule__HashtagList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:566:1: ( ( ']' ) )
            // InternalGTDsl.g:567:1: ( ']' )
            {
            // InternalGTDsl.g:567:1: ( ']' )
            // InternalGTDsl.g:568:2: ']'
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
    // InternalGTDsl.g:578:1: rule__HashtagList__Group_3__0 : rule__HashtagList__Group_3__0__Impl rule__HashtagList__Group_3__1 ;
    public final void rule__HashtagList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:582:1: ( rule__HashtagList__Group_3__0__Impl rule__HashtagList__Group_3__1 )
            // InternalGTDsl.g:583:2: rule__HashtagList__Group_3__0__Impl rule__HashtagList__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGTDsl.g:590:1: rule__HashtagList__Group_3__0__Impl : ( ( rule__HashtagList__HashtagAssignment_3_0 ) ) ;
    public final void rule__HashtagList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:594:1: ( ( ( rule__HashtagList__HashtagAssignment_3_0 ) ) )
            // InternalGTDsl.g:595:1: ( ( rule__HashtagList__HashtagAssignment_3_0 ) )
            {
            // InternalGTDsl.g:595:1: ( ( rule__HashtagList__HashtagAssignment_3_0 ) )
            // InternalGTDsl.g:596:2: ( rule__HashtagList__HashtagAssignment_3_0 )
            {
             before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_0()); 
            // InternalGTDsl.g:597:2: ( rule__HashtagList__HashtagAssignment_3_0 )
            // InternalGTDsl.g:597:3: rule__HashtagList__HashtagAssignment_3_0
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
    // InternalGTDsl.g:605:1: rule__HashtagList__Group_3__1 : rule__HashtagList__Group_3__1__Impl ;
    public final void rule__HashtagList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:609:1: ( rule__HashtagList__Group_3__1__Impl )
            // InternalGTDsl.g:610:2: rule__HashtagList__Group_3__1__Impl
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
    // InternalGTDsl.g:616:1: rule__HashtagList__Group_3__1__Impl : ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) ) ;
    public final void rule__HashtagList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:620:1: ( ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) ) )
            // InternalGTDsl.g:621:1: ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) )
            {
            // InternalGTDsl.g:621:1: ( ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* ) )
            // InternalGTDsl.g:622:2: ( ( rule__HashtagList__Group_3_1__0 ) ) ( ( rule__HashtagList__Group_3_1__0 )* )
            {
            // InternalGTDsl.g:622:2: ( ( rule__HashtagList__Group_3_1__0 ) )
            // InternalGTDsl.g:623:3: ( rule__HashtagList__Group_3_1__0 )
            {
             before(grammarAccess.getHashtagListAccess().getGroup_3_1()); 
            // InternalGTDsl.g:624:3: ( rule__HashtagList__Group_3_1__0 )
            // InternalGTDsl.g:624:4: rule__HashtagList__Group_3_1__0
            {
            pushFollow(FOLLOW_12);
            rule__HashtagList__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getHashtagListAccess().getGroup_3_1()); 

            }

            // InternalGTDsl.g:627:2: ( ( rule__HashtagList__Group_3_1__0 )* )
            // InternalGTDsl.g:628:3: ( rule__HashtagList__Group_3_1__0 )*
            {
             before(grammarAccess.getHashtagListAccess().getGroup_3_1()); 
            // InternalGTDsl.g:629:3: ( rule__HashtagList__Group_3_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGTDsl.g:629:4: rule__HashtagList__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalGTDsl.g:639:1: rule__HashtagList__Group_3_1__0 : rule__HashtagList__Group_3_1__0__Impl rule__HashtagList__Group_3_1__1 ;
    public final void rule__HashtagList__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:643:1: ( rule__HashtagList__Group_3_1__0__Impl rule__HashtagList__Group_3_1__1 )
            // InternalGTDsl.g:644:2: rule__HashtagList__Group_3_1__0__Impl rule__HashtagList__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalGTDsl.g:651:1: rule__HashtagList__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__HashtagList__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:655:1: ( ( ',' ) )
            // InternalGTDsl.g:656:1: ( ',' )
            {
            // InternalGTDsl.g:656:1: ( ',' )
            // InternalGTDsl.g:657:2: ','
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
    // InternalGTDsl.g:666:1: rule__HashtagList__Group_3_1__1 : rule__HashtagList__Group_3_1__1__Impl ;
    public final void rule__HashtagList__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:670:1: ( rule__HashtagList__Group_3_1__1__Impl )
            // InternalGTDsl.g:671:2: rule__HashtagList__Group_3_1__1__Impl
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
    // InternalGTDsl.g:677:1: rule__HashtagList__Group_3_1__1__Impl : ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) ) ;
    public final void rule__HashtagList__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:681:1: ( ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) ) )
            // InternalGTDsl.g:682:1: ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) )
            {
            // InternalGTDsl.g:682:1: ( ( rule__HashtagList__HashtagAssignment_3_1_1 ) )
            // InternalGTDsl.g:683:2: ( rule__HashtagList__HashtagAssignment_3_1_1 )
            {
             before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1_1()); 
            // InternalGTDsl.g:684:2: ( rule__HashtagList__HashtagAssignment_3_1_1 )
            // InternalGTDsl.g:684:3: rule__HashtagList__HashtagAssignment_3_1_1
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


    // $ANTLR start "rule__CountryList__Group__0"
    // InternalGTDsl.g:693:1: rule__CountryList__Group__0 : rule__CountryList__Group__0__Impl rule__CountryList__Group__1 ;
    public final void rule__CountryList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:697:1: ( rule__CountryList__Group__0__Impl rule__CountryList__Group__1 )
            // InternalGTDsl.g:698:2: rule__CountryList__Group__0__Impl rule__CountryList__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGTDsl.g:705:1: rule__CountryList__Group__0__Impl : ( 'countries' ) ;
    public final void rule__CountryList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:709:1: ( ( 'countries' ) )
            // InternalGTDsl.g:710:1: ( 'countries' )
            {
            // InternalGTDsl.g:710:1: ( 'countries' )
            // InternalGTDsl.g:711:2: 'countries'
            {
             before(grammarAccess.getCountryListAccess().getCountriesKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalGTDsl.g:720:1: rule__CountryList__Group__1 : rule__CountryList__Group__1__Impl rule__CountryList__Group__2 ;
    public final void rule__CountryList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:724:1: ( rule__CountryList__Group__1__Impl rule__CountryList__Group__2 )
            // InternalGTDsl.g:725:2: rule__CountryList__Group__1__Impl rule__CountryList__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalGTDsl.g:732:1: rule__CountryList__Group__1__Impl : ( ( rule__CountryList__NameAssignment_1 ) ) ;
    public final void rule__CountryList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:736:1: ( ( ( rule__CountryList__NameAssignment_1 ) ) )
            // InternalGTDsl.g:737:1: ( ( rule__CountryList__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:737:1: ( ( rule__CountryList__NameAssignment_1 ) )
            // InternalGTDsl.g:738:2: ( rule__CountryList__NameAssignment_1 )
            {
             before(grammarAccess.getCountryListAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:739:2: ( rule__CountryList__NameAssignment_1 )
            // InternalGTDsl.g:739:3: rule__CountryList__NameAssignment_1
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
    // InternalGTDsl.g:747:1: rule__CountryList__Group__2 : rule__CountryList__Group__2__Impl rule__CountryList__Group__3 ;
    public final void rule__CountryList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:751:1: ( rule__CountryList__Group__2__Impl rule__CountryList__Group__3 )
            // InternalGTDsl.g:752:2: rule__CountryList__Group__2__Impl rule__CountryList__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalGTDsl.g:759:1: rule__CountryList__Group__2__Impl : ( '[' ) ;
    public final void rule__CountryList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:763:1: ( ( '[' ) )
            // InternalGTDsl.g:764:1: ( '[' )
            {
            // InternalGTDsl.g:764:1: ( '[' )
            // InternalGTDsl.g:765:2: '['
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
    // InternalGTDsl.g:774:1: rule__CountryList__Group__3 : rule__CountryList__Group__3__Impl rule__CountryList__Group__4 ;
    public final void rule__CountryList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:778:1: ( rule__CountryList__Group__3__Impl rule__CountryList__Group__4 )
            // InternalGTDsl.g:779:2: rule__CountryList__Group__3__Impl rule__CountryList__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalGTDsl.g:786:1: rule__CountryList__Group__3__Impl : ( ( rule__CountryList__Group_3__0 ) ) ;
    public final void rule__CountryList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:790:1: ( ( ( rule__CountryList__Group_3__0 ) ) )
            // InternalGTDsl.g:791:1: ( ( rule__CountryList__Group_3__0 ) )
            {
            // InternalGTDsl.g:791:1: ( ( rule__CountryList__Group_3__0 ) )
            // InternalGTDsl.g:792:2: ( rule__CountryList__Group_3__0 )
            {
             before(grammarAccess.getCountryListAccess().getGroup_3()); 
            // InternalGTDsl.g:793:2: ( rule__CountryList__Group_3__0 )
            // InternalGTDsl.g:793:3: rule__CountryList__Group_3__0
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
    // InternalGTDsl.g:801:1: rule__CountryList__Group__4 : rule__CountryList__Group__4__Impl ;
    public final void rule__CountryList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:805:1: ( rule__CountryList__Group__4__Impl )
            // InternalGTDsl.g:806:2: rule__CountryList__Group__4__Impl
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
    // InternalGTDsl.g:812:1: rule__CountryList__Group__4__Impl : ( ']' ) ;
    public final void rule__CountryList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:816:1: ( ( ']' ) )
            // InternalGTDsl.g:817:1: ( ']' )
            {
            // InternalGTDsl.g:817:1: ( ']' )
            // InternalGTDsl.g:818:2: ']'
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
    // InternalGTDsl.g:828:1: rule__CountryList__Group_3__0 : rule__CountryList__Group_3__0__Impl rule__CountryList__Group_3__1 ;
    public final void rule__CountryList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:832:1: ( rule__CountryList__Group_3__0__Impl rule__CountryList__Group_3__1 )
            // InternalGTDsl.g:833:2: rule__CountryList__Group_3__0__Impl rule__CountryList__Group_3__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalGTDsl.g:840:1: rule__CountryList__Group_3__0__Impl : ( ( rule__CountryList__CountryAssignment_3_0 ) ) ;
    public final void rule__CountryList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:844:1: ( ( ( rule__CountryList__CountryAssignment_3_0 ) ) )
            // InternalGTDsl.g:845:1: ( ( rule__CountryList__CountryAssignment_3_0 ) )
            {
            // InternalGTDsl.g:845:1: ( ( rule__CountryList__CountryAssignment_3_0 ) )
            // InternalGTDsl.g:846:2: ( rule__CountryList__CountryAssignment_3_0 )
            {
             before(grammarAccess.getCountryListAccess().getCountryAssignment_3_0()); 
            // InternalGTDsl.g:847:2: ( rule__CountryList__CountryAssignment_3_0 )
            // InternalGTDsl.g:847:3: rule__CountryList__CountryAssignment_3_0
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
    // InternalGTDsl.g:855:1: rule__CountryList__Group_3__1 : rule__CountryList__Group_3__1__Impl ;
    public final void rule__CountryList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:859:1: ( rule__CountryList__Group_3__1__Impl )
            // InternalGTDsl.g:860:2: rule__CountryList__Group_3__1__Impl
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
    // InternalGTDsl.g:866:1: rule__CountryList__Group_3__1__Impl : ( ( rule__CountryList__Group_3_1__0 )* ) ;
    public final void rule__CountryList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:870:1: ( ( ( rule__CountryList__Group_3_1__0 )* ) )
            // InternalGTDsl.g:871:1: ( ( rule__CountryList__Group_3_1__0 )* )
            {
            // InternalGTDsl.g:871:1: ( ( rule__CountryList__Group_3_1__0 )* )
            // InternalGTDsl.g:872:2: ( rule__CountryList__Group_3_1__0 )*
            {
             before(grammarAccess.getCountryListAccess().getGroup_3_1()); 
            // InternalGTDsl.g:873:2: ( rule__CountryList__Group_3_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGTDsl.g:873:3: rule__CountryList__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalGTDsl.g:882:1: rule__CountryList__Group_3_1__0 : rule__CountryList__Group_3_1__0__Impl rule__CountryList__Group_3_1__1 ;
    public final void rule__CountryList__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:886:1: ( rule__CountryList__Group_3_1__0__Impl rule__CountryList__Group_3_1__1 )
            // InternalGTDsl.g:887:2: rule__CountryList__Group_3_1__0__Impl rule__CountryList__Group_3_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGTDsl.g:894:1: rule__CountryList__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CountryList__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:898:1: ( ( ',' ) )
            // InternalGTDsl.g:899:1: ( ',' )
            {
            // InternalGTDsl.g:899:1: ( ',' )
            // InternalGTDsl.g:900:2: ','
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
    // InternalGTDsl.g:909:1: rule__CountryList__Group_3_1__1 : rule__CountryList__Group_3_1__1__Impl ;
    public final void rule__CountryList__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:913:1: ( rule__CountryList__Group_3_1__1__Impl )
            // InternalGTDsl.g:914:2: rule__CountryList__Group_3_1__1__Impl
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
    // InternalGTDsl.g:920:1: rule__CountryList__Group_3_1__1__Impl : ( ( rule__CountryList__CountryAssignment_3_1_1 ) ) ;
    public final void rule__CountryList__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:924:1: ( ( ( rule__CountryList__CountryAssignment_3_1_1 ) ) )
            // InternalGTDsl.g:925:1: ( ( rule__CountryList__CountryAssignment_3_1_1 ) )
            {
            // InternalGTDsl.g:925:1: ( ( rule__CountryList__CountryAssignment_3_1_1 ) )
            // InternalGTDsl.g:926:2: ( rule__CountryList__CountryAssignment_3_1_1 )
            {
             before(grammarAccess.getCountryListAccess().getCountryAssignment_3_1_1()); 
            // InternalGTDsl.g:927:2: ( rule__CountryList__CountryAssignment_3_1_1 )
            // InternalGTDsl.g:927:3: rule__CountryList__CountryAssignment_3_1_1
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


    // $ANTLR start "rule__Query__Group__0"
    // InternalGTDsl.g:936:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:940:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalGTDsl.g:941:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

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
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalGTDsl.g:948:1: rule__Query__Group__0__Impl : ( 'map' ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:952:1: ( ( 'map' ) )
            // InternalGTDsl.g:953:1: ( 'map' )
            {
            // InternalGTDsl.g:953:1: ( 'map' )
            // InternalGTDsl.g:954:2: 'map'
            {
             before(grammarAccess.getQueryAccess().getMapKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getMapKeyword_0()); 

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
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalGTDsl.g:963:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:967:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalGTDsl.g:968:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

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
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalGTDsl.g:975:1: rule__Query__Group__1__Impl : ( ( rule__Query__NameAssignment_1 ) ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:979:1: ( ( ( rule__Query__NameAssignment_1 ) ) )
            // InternalGTDsl.g:980:1: ( ( rule__Query__NameAssignment_1 ) )
            {
            // InternalGTDsl.g:980:1: ( ( rule__Query__NameAssignment_1 ) )
            // InternalGTDsl.g:981:2: ( rule__Query__NameAssignment_1 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_1()); 
            // InternalGTDsl.g:982:2: ( rule__Query__NameAssignment_1 )
            // InternalGTDsl.g:982:3: rule__Query__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalGTDsl.g:990:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:994:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalGTDsl.g:995:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

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
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalGTDsl.g:1002:1: rule__Query__Group__2__Impl : ( 'displays' ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1006:1: ( ( 'displays' ) )
            // InternalGTDsl.g:1007:1: ( 'displays' )
            {
            // InternalGTDsl.g:1007:1: ( 'displays' )
            // InternalGTDsl.g:1008:2: 'displays'
            {
             before(grammarAccess.getQueryAccess().getDisplaysKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getDisplaysKeyword_2()); 

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
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalGTDsl.g:1017:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1021:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalGTDsl.g:1022:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

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
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalGTDsl.g:1029:1: rule__Query__Group__3__Impl : ( ( rule__Query__HashtagsAssignment_3 ) ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1033:1: ( ( ( rule__Query__HashtagsAssignment_3 ) ) )
            // InternalGTDsl.g:1034:1: ( ( rule__Query__HashtagsAssignment_3 ) )
            {
            // InternalGTDsl.g:1034:1: ( ( rule__Query__HashtagsAssignment_3 ) )
            // InternalGTDsl.g:1035:2: ( rule__Query__HashtagsAssignment_3 )
            {
             before(grammarAccess.getQueryAccess().getHashtagsAssignment_3()); 
            // InternalGTDsl.g:1036:2: ( rule__Query__HashtagsAssignment_3 )
            // InternalGTDsl.g:1036:3: rule__Query__HashtagsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Query__HashtagsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getHashtagsAssignment_3()); 

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
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalGTDsl.g:1044:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1048:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalGTDsl.g:1049:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

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
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalGTDsl.g:1056:1: rule__Query__Group__4__Impl : ( 'in' ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1060:1: ( ( 'in' ) )
            // InternalGTDsl.g:1061:1: ( 'in' )
            {
            // InternalGTDsl.g:1061:1: ( 'in' )
            // InternalGTDsl.g:1062:2: 'in'
            {
             before(grammarAccess.getQueryAccess().getInKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalGTDsl.g:1071:1: rule__Query__Group__5 : rule__Query__Group__5__Impl ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1075:1: ( rule__Query__Group__5__Impl )
            // InternalGTDsl.g:1076:2: rule__Query__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__5__Impl();

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
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalGTDsl.g:1082:1: rule__Query__Group__5__Impl : ( ( rule__Query__CountriesAssignment_5 ) ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1086:1: ( ( ( rule__Query__CountriesAssignment_5 ) ) )
            // InternalGTDsl.g:1087:1: ( ( rule__Query__CountriesAssignment_5 ) )
            {
            // InternalGTDsl.g:1087:1: ( ( rule__Query__CountriesAssignment_5 ) )
            // InternalGTDsl.g:1088:2: ( rule__Query__CountriesAssignment_5 )
            {
             before(grammarAccess.getQueryAccess().getCountriesAssignment_5()); 
            // InternalGTDsl.g:1089:2: ( rule__Query__CountriesAssignment_5 )
            // InternalGTDsl.g:1089:3: rule__Query__CountriesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Query__CountriesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getCountriesAssignment_5()); 

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
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_0"
    // InternalGTDsl.g:1098:1: rule__Model__ElementsAssignment_0 : ( ruleType ) ;
    public final void rule__Model__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1102:1: ( ( ruleType ) )
            // InternalGTDsl.g:1103:2: ( ruleType )
            {
            // InternalGTDsl.g:1103:2: ( ruleType )
            // InternalGTDsl.g:1104:3: ruleType
            {
             before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_0"


    // $ANTLR start "rule__Model__QueryAssignment_1"
    // InternalGTDsl.g:1113:1: rule__Model__QueryAssignment_1 : ( ruleQuery ) ;
    public final void rule__Model__QueryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1117:1: ( ( ruleQuery ) )
            // InternalGTDsl.g:1118:2: ( ruleQuery )
            {
            // InternalGTDsl.g:1118:2: ( ruleQuery )
            // InternalGTDsl.g:1119:3: ruleQuery
            {
             before(grammarAccess.getModelAccess().getQueryQueryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQueryQueryParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__QueryAssignment_1"


    // $ANTLR start "rule__Hashtag__NameAssignment_1"
    // InternalGTDsl.g:1128:1: rule__Hashtag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Hashtag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1132:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1133:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1133:2: ( RULE_ID )
            // InternalGTDsl.g:1134:3: RULE_ID
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
    // InternalGTDsl.g:1143:1: rule__Hashtag__ColorAssignment_3 : ( ( rule__Hashtag__ColorAlternatives_3_0 ) ) ;
    public final void rule__Hashtag__ColorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1147:1: ( ( ( rule__Hashtag__ColorAlternatives_3_0 ) ) )
            // InternalGTDsl.g:1148:2: ( ( rule__Hashtag__ColorAlternatives_3_0 ) )
            {
            // InternalGTDsl.g:1148:2: ( ( rule__Hashtag__ColorAlternatives_3_0 ) )
            // InternalGTDsl.g:1149:3: ( rule__Hashtag__ColorAlternatives_3_0 )
            {
             before(grammarAccess.getHashtagAccess().getColorAlternatives_3_0()); 
            // InternalGTDsl.g:1150:3: ( rule__Hashtag__ColorAlternatives_3_0 )
            // InternalGTDsl.g:1150:4: rule__Hashtag__ColorAlternatives_3_0
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
    // InternalGTDsl.g:1158:1: rule__HashtagList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__HashtagList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1162:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1163:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1163:2: ( RULE_ID )
            // InternalGTDsl.g:1164:3: RULE_ID
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
    // InternalGTDsl.g:1173:1: rule__HashtagList__HashtagAssignment_3_0 : ( ruleHashtag ) ;
    public final void rule__HashtagList__HashtagAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1177:1: ( ( ruleHashtag ) )
            // InternalGTDsl.g:1178:2: ( ruleHashtag )
            {
            // InternalGTDsl.g:1178:2: ( ruleHashtag )
            // InternalGTDsl.g:1179:3: ruleHashtag
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
    // InternalGTDsl.g:1188:1: rule__HashtagList__HashtagAssignment_3_1_1 : ( ruleHashtag ) ;
    public final void rule__HashtagList__HashtagAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1192:1: ( ( ruleHashtag ) )
            // InternalGTDsl.g:1193:2: ( ruleHashtag )
            {
            // InternalGTDsl.g:1193:2: ( ruleHashtag )
            // InternalGTDsl.g:1194:3: ruleHashtag
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


    // $ANTLR start "rule__Country__NameAssignment"
    // InternalGTDsl.g:1203:1: rule__Country__NameAssignment : ( RULE_ID ) ;
    public final void rule__Country__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1207:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1208:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1208:2: ( RULE_ID )
            // InternalGTDsl.g:1209:3: RULE_ID
            {
             before(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Country__NameAssignment"


    // $ANTLR start "rule__CountryList__NameAssignment_1"
    // InternalGTDsl.g:1218:1: rule__CountryList__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CountryList__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1222:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1223:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1223:2: ( RULE_ID )
            // InternalGTDsl.g:1224:3: RULE_ID
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
    // InternalGTDsl.g:1233:1: rule__CountryList__CountryAssignment_3_0 : ( ruleCountry ) ;
    public final void rule__CountryList__CountryAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1237:1: ( ( ruleCountry ) )
            // InternalGTDsl.g:1238:2: ( ruleCountry )
            {
            // InternalGTDsl.g:1238:2: ( ruleCountry )
            // InternalGTDsl.g:1239:3: ruleCountry
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
    // InternalGTDsl.g:1248:1: rule__CountryList__CountryAssignment_3_1_1 : ( ruleCountry ) ;
    public final void rule__CountryList__CountryAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1252:1: ( ( ruleCountry ) )
            // InternalGTDsl.g:1253:2: ( ruleCountry )
            {
            // InternalGTDsl.g:1253:2: ( ruleCountry )
            // InternalGTDsl.g:1254:3: ruleCountry
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


    // $ANTLR start "rule__Query__NameAssignment_1"
    // InternalGTDsl.g:1263:1: rule__Query__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1267:1: ( ( RULE_ID ) )
            // InternalGTDsl.g:1268:2: ( RULE_ID )
            {
            // InternalGTDsl.g:1268:2: ( RULE_ID )
            // InternalGTDsl.g:1269:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Query__NameAssignment_1"


    // $ANTLR start "rule__Query__HashtagsAssignment_3"
    // InternalGTDsl.g:1278:1: rule__Query__HashtagsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Query__HashtagsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1282:1: ( ( ( RULE_ID ) ) )
            // InternalGTDsl.g:1283:2: ( ( RULE_ID ) )
            {
            // InternalGTDsl.g:1283:2: ( ( RULE_ID ) )
            // InternalGTDsl.g:1284:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryAccess().getHashtagsHashtagListCrossReference_3_0()); 
            // InternalGTDsl.g:1285:3: ( RULE_ID )
            // InternalGTDsl.g:1286:4: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getHashtagsHashtagListIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getHashtagsHashtagListIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getQueryAccess().getHashtagsHashtagListCrossReference_3_0()); 

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
    // $ANTLR end "rule__Query__HashtagsAssignment_3"


    // $ANTLR start "rule__Query__CountriesAssignment_5"
    // InternalGTDsl.g:1297:1: rule__Query__CountriesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Query__CountriesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGTDsl.g:1301:1: ( ( ( RULE_ID ) ) )
            // InternalGTDsl.g:1302:2: ( ( RULE_ID ) )
            {
            // InternalGTDsl.g:1302:2: ( ( RULE_ID ) )
            // InternalGTDsl.g:1303:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryAccess().getCountriesCountryListCrossReference_5_0()); 
            // InternalGTDsl.g:1304:3: ( RULE_ID )
            // InternalGTDsl.g:1305:4: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getCountriesCountryListIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getCountriesCountryListIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getQueryAccess().getCountriesCountryListCrossReference_5_0()); 

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
    // $ANTLR end "rule__Query__CountriesAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000220002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});

}