package org.eclipselabs.spray.styles.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleContainer;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesFactory;

public class StyleQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(Diagnostic.LINKING_DIAGNOSTIC)
	public void handleMissingLink(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		if (issue.getMessage()
				.startsWith("Couldn't resolve reference to Style")) {
			acceptor.accept(issue, "Create style", "Create style", null,
					getModificationForStyle(issue));
		} else if (issue.getMessage().startsWith(
				"Couldn't resolve reference to Gradient")) {
			acceptor.accept(issue, "Create gradient", "Create gradient", null,
					getModificationForGradient(issue));
		} else {
			createLinkingIssueResolutions(issue, acceptor);
		}
	}

    private ISemanticModification getModificationForStyle(final Issue issue) {
        return new ISemanticModification() {
            @Override
            public void apply(EObject element, IModificationContext context) throws Exception {
                final IXtextDocument xtextDocument = context.getXtextDocument();
                String styleName = xtextDocument.get(issue.getOffset(), issue.getLength()).replace("\"", "");
                StyleContainer styleContainer = EcoreUtil2.getContainerOfType(element, StyleContainer.class);
                if (styleContainer != null) {
                    Style style = StylesFactory.eINSTANCE.createStyle();
                    style.setName(styleName);
                    StyleLayout styleLayout = StylesFactory.eINSTANCE.createStyleLayout();
                    style.setLayout(styleLayout);
                    styleContainer.getStyleContainerElement().add(style);
                }
            }
        };
    }
    
    private ISemanticModification getModificationForGradient(final Issue issue) {
        return new ISemanticModification() {
            @Override
            public void apply(EObject element, IModificationContext context) throws Exception {
                final IXtextDocument xtextDocument = context.getXtextDocument();
                String gradientName = xtextDocument.get(issue.getOffset(), issue.getLength()).replace("\"", "");
                StyleContainer styleContainer = EcoreUtil2.getContainerOfType(element, StyleContainer.class);
                if (styleContainer != null) {
                    Gradient gradient = StylesFactory.eINSTANCE.createGradient();
               		gradient.setName(gradientName);
                    GradientLayout gradientLayout = StylesFactory.eINSTANCE.createGradientLayout();
                    gradient.setLayout(gradientLayout);
                    styleContainer.getStyleContainerElement().add(gradient);
                }
            }
        };
    }    
}
