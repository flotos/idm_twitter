/*
 * generated by Xtext 2.10.0
 */
grammar InternalGTDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.geotweet.gtdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
		(rule__Model__ElementsAssignment)*
		{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHashtag
entryRuleHashtag
:
{ before(grammarAccess.getHashtagRule()); }
	 ruleHashtag
{ after(grammarAccess.getHashtagRule()); } 
	 EOF 
;

// Rule Hashtag
ruleHashtag 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHashtagAccess().getGroup()); }
		(rule__Hashtag__Group__0)
		{ after(grammarAccess.getHashtagAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHashtagList
entryRuleHashtagList
:
{ before(grammarAccess.getHashtagListRule()); }
	 ruleHashtagList
{ after(grammarAccess.getHashtagListRule()); } 
	 EOF 
;

// Rule HashtagList
ruleHashtagList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHashtagListAccess().getGroup()); }
		(rule__HashtagList__Group__0)
		{ after(grammarAccess.getHashtagListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCountry
entryRuleCountry
:
{ before(grammarAccess.getCountryRule()); }
	 ruleCountry
{ after(grammarAccess.getCountryRule()); } 
	 EOF 
;

// Rule Country
ruleCountry 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCountryAccess().getGroup()); }
		(rule__Country__Group__0)
		{ after(grammarAccess.getCountryAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCountryList
entryRuleCountryList
:
{ before(grammarAccess.getCountryListRule()); }
	 ruleCountryList
{ after(grammarAccess.getCountryListRule()); } 
	 EOF 
;

// Rule CountryList
ruleCountryList 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCountryListAccess().getGroup()); }
		(rule__CountryList__Group__0)
		{ after(grammarAccess.getCountryListAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getHashtagListParserRuleCall_0()); }
		ruleHashtagList
		{ after(grammarAccess.getTypeAccess().getHashtagListParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getCountryListParserRuleCall_1()); }
		ruleCountryList
		{ after(grammarAccess.getTypeAccess().getCountryListParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__ColorAlternatives_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHashtagAccess().getColorRedKeyword_0_3_0_0()); }
		'red'
		{ after(grammarAccess.getHashtagAccess().getColorRedKeyword_0_3_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getHashtagAccess().getColorBlueKeyword_0_3_0_1()); }
		'blue'
		{ after(grammarAccess.getHashtagAccess().getColorBlueKeyword_0_3_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getHashtagAccess().getColorGreenKeyword_0_3_0_2()); }
		'green'
		{ after(grammarAccess.getHashtagAccess().getColorGreenKeyword_0_3_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hashtag__Group__0__Impl
	rule__Hashtag__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagAccess().getGroup_0()); }
	(rule__Hashtag__Group_0__0)
	{ after(grammarAccess.getHashtagAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hashtag__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getHashtagAccess().getNEWLINETerminalRuleCall_1()); }
		(RULE_NEWLINE)
		{ after(grammarAccess.getHashtagAccess().getNEWLINETerminalRuleCall_1()); }
	)
	(
		{ before(grammarAccess.getHashtagAccess().getNEWLINETerminalRuleCall_1()); }
		(RULE_NEWLINE)*
		{ after(grammarAccess.getHashtagAccess().getNEWLINETerminalRuleCall_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Hashtag__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hashtag__Group_0__0__Impl
	rule__Hashtag__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagAccess().getNumberSignKeyword_0_0()); }
	'#'
	{ after(grammarAccess.getHashtagAccess().getNumberSignKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hashtag__Group_0__1__Impl
	rule__Hashtag__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagAccess().getNameAssignment_0_1()); }
	(rule__Hashtag__NameAssignment_0_1)
	{ after(grammarAccess.getHashtagAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hashtag__Group_0__2__Impl
	rule__Hashtag__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagAccess().getColonKeyword_0_2()); }
	':'
	{ after(grammarAccess.getHashtagAccess().getColonKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Hashtag__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagAccess().getColorAssignment_0_3()); }
	(rule__Hashtag__ColorAssignment_0_3)
	{ after(grammarAccess.getHashtagAccess().getColorAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HashtagList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group__0__Impl
	rule__HashtagList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagListAccess().getTagsKeyword_0()); }
	'tags'
	{ after(grammarAccess.getHashtagListAccess().getTagsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group__1__Impl
	rule__HashtagList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagListAccess().getNameAssignment_1()); }
	(rule__HashtagList__NameAssignment_1)
	{ after(grammarAccess.getHashtagListAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group__2__Impl
	rule__HashtagList__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagListAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getHashtagListAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group__3__Impl
	rule__HashtagList__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagListAccess().getGroup_3()); }
	(rule__HashtagList__Group_3__0)
	{ after(grammarAccess.getHashtagListAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagListAccess().getRightSquareBracketKeyword_4()); }
	']'
	{ after(grammarAccess.getHashtagListAccess().getRightSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HashtagList__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group_3__0__Impl
	rule__HashtagList__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_0()); }
	(rule__HashtagList__HashtagAssignment_3_0)
	{ after(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HashtagList__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1()); }
		(rule__HashtagList__HashtagAssignment_3_1)
		{ after(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1()); }
	)
	(
		{ before(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1()); }
		(rule__HashtagList__HashtagAssignment_3_1)*
		{ after(grammarAccess.getHashtagListAccess().getHashtagAssignment_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Country__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Country__Group__0__Impl
	rule__Country__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Country__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryAccess().getCountryKeyword_0()); }
	'country'
	{ after(grammarAccess.getCountryAccess().getCountryKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Country__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Country__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Country__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryAccess().getNameAssignment_1()); }
	(rule__Country__NameAssignment_1)
	{ after(grammarAccess.getCountryAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CountryList__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group__0__Impl
	rule__CountryList__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getCountriesKeyword_0()); }
	'countries'
	{ after(grammarAccess.getCountryListAccess().getCountriesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group__1__Impl
	rule__CountryList__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getNameAssignment_1()); }
	(rule__CountryList__NameAssignment_1)
	{ after(grammarAccess.getCountryListAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group__2__Impl
	rule__CountryList__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getCountryListAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group__3__Impl
	rule__CountryList__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getGroup_3()); }
	(rule__CountryList__Group_3__0)
	{ after(grammarAccess.getCountryListAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getRightSquareBracketKeyword_4()); }
	']'
	{ after(grammarAccess.getCountryListAccess().getRightSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CountryList__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group_3__0__Impl
	rule__CountryList__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getCountryAssignment_3_0()); }
	(rule__CountryList__CountryAssignment_3_0)
	{ after(grammarAccess.getCountryListAccess().getCountryAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getGroup_3_1()); }
	(rule__CountryList__Group_3_1__0)*
	{ after(grammarAccess.getCountryListAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CountryList__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group_3_1__0__Impl
	rule__CountryList__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getCountryListAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CountryList__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCountryListAccess().getCountryAssignment_3_1_1()); }
	(rule__CountryList__CountryAssignment_3_1_1)
	{ after(grammarAccess.getCountryListAccess().getCountryAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); }
		ruleType
		{ after(grammarAccess.getModelAccess().getElementsTypeParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHashtagAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getHashtagAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Hashtag__ColorAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHashtagAccess().getColorAlternatives_0_3_0()); }
		(rule__Hashtag__ColorAlternatives_0_3_0)
		{ after(grammarAccess.getHashtagAccess().getColorAlternatives_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHashtagListAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getHashtagListAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__HashtagAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_0_0()); }
		ruleHashtag
		{ after(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HashtagList__HashtagAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_1_0()); }
		ruleHashtag
		{ after(grammarAccess.getHashtagListAccess().getHashtagHashtagParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Country__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCountryAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCountryListAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCountryListAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__CountryAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_0_0()); }
		ruleCountry
		{ after(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CountryList__CountryAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_1_1_0()); }
		ruleCountry
		{ after(grammarAccess.getCountryListAccess().getCountryCountryParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_NEWLINE : '\r'? '\n';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
