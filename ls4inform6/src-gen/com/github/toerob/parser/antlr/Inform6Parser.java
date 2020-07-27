/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob.parser.antlr;

import com.github.toerob.parser.antlr.internal.InternalInform6Parser;
import com.github.toerob.services.Inform6GrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class Inform6Parser extends AbstractAntlrParser {

	@Inject
	private Inform6GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalInform6Parser createParser(XtextTokenStream stream) {
		return new InternalInform6Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public Inform6GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Inform6GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
