package org.eclipselabs.spray.shapes.ui.quickfix;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.model.edit.IssueModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.SemanticModificationWrapper;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipselabs.spray.shapes.ui.quickfix.AbstractStyleDSLModificationJob.ModificationJobType;

import javax.inject.Inject;

public class ShapeQuickfixProvider extends DefaultQuickfixProvider {
	private IResourceDescriptions dscriptions = null;

	@Inject
	private IssueModificationContext.Factory modificationContextFactory;

	@Inject
	private IURIEditorOpener editorOpener;

	@Inject
	private XtextResourceSet xtextResourceSet;

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;
	
	@Fix(Diagnostic.LINKING_DIAGNOSTIC)
	public void handleMissingLink(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		if (issue.getMessage()
				.startsWith("Couldn't resolve reference to Style")) {
			handleMissingStyleElementLink("Create style definition",
					"Create style definition", issue, acceptor,
					AbstractStyleDSLModificationJob.ModificationJobType.STYLE);
		} else if (issue.getMessage().startsWith(
				"Couldn't resolve reference to Gradient")) {
			handleMissingStyleElementLink(
					"Create gradient definition",
					"Create gradient definition",
					issue,
					acceptor,
					AbstractStyleDSLModificationJob.ModificationJobType.GRADIENT);
		} else {
			createLinkingIssueResolutions(issue, acceptor);
		}
	}

	private void handleMissingStyleElementLink(String label,
			String description, final Issue issue,
			IssueResolutionAcceptor acceptor, ModificationJobType jobType) {
		URI shapeDSLURI = issue.getUriToProblem();
		if (shapeDSLURI != null) {
			URI styleDSLURI = getStyleDSLURI(issue.getUriToProblem(), jobType);
			if (styleDSLURI != null) {
				ISemanticModification modificationForDefinition = getModificationForDefinition(
						issue, shapeDSLURI, styleDSLURI, jobType);
				if (modificationForDefinition != null) {
					SemanticModificationWrapper modificationWrapper = new SemanticModificationWrapper(
							styleDSLURI, modificationForDefinition);
					Issue.IssueImpl newIssue = new Issue.IssueImpl();
					newIssue.setUriToProblem(styleDSLURI);
					acceptor.getIssueResolutions()
							.add(new IssueResolution(
									label,
									description,
									null,
									modificationContextFactory
											.createModificationContext(newIssue),
									modificationWrapper));
				}
			}
		}
	}

	private ISemanticModification getModificationForDefinition(
			final Issue issue, final URI shapeDSLURI, final URI styleDSLURI,
			final AbstractStyleDSLModificationJob.ModificationJobType jobType) {
		return new ISemanticModification() {
			@Override
			public void apply(EObject element, IModificationContext context)
					throws Exception {
				final IXtextDocument shapeXtextDocument = context
						.getXtextDocument(shapeDSLURI);
				final IXtextDocument styleXtextDocument = context
						.getXtextDocument(styleDSLURI);
				AbstractStyleDSLModificationJob job = jobType.create(
						shapeXtextDocument, issue);
				if (job != null) {
					styleXtextDocument.modify(job);
					XtextEditor xtextEditor = (XtextEditor) editorOpener.open(
							styleDSLURI, true);
					int index = xtextEditor.getDocument().get().length();
					if (index > 0) {
						xtextEditor.selectAndReveal(index, 0);
					}
				}
			}
		};
	}

	private URI getStyleDSLURI(final URI uriToProblem, LinkingQuickfixModificationJob linkingQuickfixModificationJob) {
		if (dscriptions == null) {
			dscriptions = resourceDescriptionsProvider.createResourceDescriptions();
		}
        return linkingQuickfixModificationJob.getDSLURI(dscriptions, uriToProblem);
	}
}
