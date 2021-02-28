/*
 * generated by Xtext 2.22.0
 */
package com.github.toerob.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.github.toerob.validation.Inform6Validator;

/**
 * Custom quickfixes.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
public class Inform6QuickfixProvider extends DefaultQuickfixProvider {

	@Fix(Inform6Validator.INVALID_PROPERTY_HEADER_CASING)
	public void decapitalizeName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Lowercase property header name",
				"Lowercase property header name of " + '"' + issue.getData() + '"', "field_private_obj.png", (context) -> {
					if (issue.getData().length > 0) {
						int length = issue.getData()[0].length();
						IXtextDocument xtextDocument = context.getXtextDocument();
						String string = xtextDocument.get(issue.getOffset(), length);
						xtextDocument.replace(issue.getOffset(), length, string.toLowerCase());
					}
				});

	}

}
