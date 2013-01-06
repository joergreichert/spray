package org.eclipselabs.spray.shapes.ui.quickfix;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
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
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.shapes.ui.quickfix.AbstractStyleDSLModificationJob.ModificationJobType;
import org.eclipselabs.spray.styles.StylesPackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

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
			URI styleDSLURI = getStyleDSLURI(issue.getUriToProblem());
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

	private URI getStyleDSLURI(final URI uriToProblem) {
		if (dscriptions == null) {
			dscriptions = resourceDescriptionsProvider.createResourceDescriptions();
		}
		final String spraySegment = uriToProblem.lastSegment();
		final String lastSegment = spraySegment.substring(0,
				spraySegment.length() - ".shape".length())
				+ ".style";
		List<IResourceDescription> filteredDescs = IteratorExtensions
				.toList(Iterables.filter(
						dscriptions.getAllResourceDescriptions(),
						new Predicate<IResourceDescription>() {
							public boolean apply(IResourceDescription desc) {
								return desc.getURI().lastSegment()
										.equals(lastSegment);
							}
						}).iterator());
		URI uri = null;
		if (filteredDescs.size() > 0) {
			uri = filteredDescs.get(0).getURI();
			List<IEObjectDescription> containers = IteratorExtensions
					.toList(filteredDescs
							.get(0)
							.getExportedObjectsByType(
									StylesPackage.Literals.STYLE_CONTAINER_ELEMENT)
							.iterator());
			if (containers.size() > 0) {
				uri = containers.get(0).getEObjectURI();
			} else {
				// no quick fix, when there is a [shape-filename].style but with
				// empty content
				uri = null;
			}
		} else {
			// no quick fix, when there is no [shape-filename].style resource
			uri = null;
		}
		return uri;
	}
}
