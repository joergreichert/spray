package org.eclipselabs.spray.xtext.ui.quickfix;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
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
import org.eclipselabs.spray.mm.spray.BehaviorGroup;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.xtext.scoping.AppInjectedAccess;
import org.eclipselabs.spray.xtext.ui.quickfix.AbstractShapeDSLModificationJob.ModificationJobType;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;

public class SprayQuickfixProvider extends DefaultQuickfixProvider {
    private IResourceDescriptions            dscriptions = null;

    @Inject
    private IssueModificationContext.Factory modificationContextFactory;

    @Inject
    private IURIEditorOpener                 editorOpener;

    @Inject
    private XtextResourceSet                 xtextResourceSet;

    @Fix(Diagnostic.LINKING_DIAGNOSTIC)
    public void handleMissingLink(final Issue issue, IssueResolutionAcceptor acceptor) {
        if (issue.getMessage().startsWith("Couldn't resolve reference to ShapeDefinition")) {
            handleMissingDefinitionLink("Create shape definition", "Create shape definition", issue, acceptor, AbstractShapeDSLModificationJob.ModificationJobType.SHAPE);
        } else if (issue.getMessage().startsWith("Couldn't resolve reference to ConnectionDefinition")) {
            handleMissingDefinitionLink("Create connection definition", "Create connection definition", issue, acceptor, AbstractShapeDSLModificationJob.ModificationJobType.CONNECTION);
        } else if (issue.getMessage().startsWith("Couldn't resolve reference to BehaviorGroup")) {
            acceptor.accept(issue, "Create behavior group", "Create behavior group", null, getModificationForBehaviorGroup(issue));
        } else {
            createLinkingIssueResolutions(issue, acceptor);
        }
    }

    private void handleMissingDefinitionLink(String label, String description, final Issue issue, IssueResolutionAcceptor acceptor, ModificationJobType jobType) {
        URI sprayDSLURI = issue.getUriToProblem();
        if (sprayDSLURI != null) {
            URI shapeDSLURI = getShapeDSLURI(issue.getUriToProblem());
            if (shapeDSLURI != null) {
                ISemanticModification modificationForDefinition = getModificationForDefinition(issue, sprayDSLURI, shapeDSLURI, jobType);
                if (modificationForDefinition != null) {
                    SemanticModificationWrapper modificationWrapper = new SemanticModificationWrapper(shapeDSLURI, modificationForDefinition);
                    Issue.IssueImpl newIssue = new Issue.IssueImpl();
                    newIssue.setUriToProblem(shapeDSLURI);
                    acceptor.getIssueResolutions().add(new IssueResolution(label, description, null, modificationContextFactory.createModificationContext(newIssue), modificationWrapper));
                }
            }
        }
    }

    private ISemanticModification getModificationForDefinition(final Issue issue, final URI sprayDSLURI, final URI shapeDSLURI, final AbstractShapeDSLModificationJob.ModificationJobType jobType) {
        return new ISemanticModification() {
            @Override
            public void apply(EObject element, IModificationContext context) throws Exception {
                final IXtextDocument sprayXtextDocument = context.getXtextDocument(sprayDSLURI);
                final IXtextDocument shapeXtextDocument = context.getXtextDocument(shapeDSLURI);
                AbstractShapeDSLModificationJob job = jobType.create(sprayXtextDocument, issue);
                if (job != null) {
                    shapeXtextDocument.modify(job);
                    XtextEditor xtextEditor = (XtextEditor) editorOpener.open(shapeDSLURI, true);
                    int index = xtextEditor.getDocument().get().length();
                    if (index > 0) {
                        xtextEditor.selectAndReveal(index, 0);
                    }
                }
            }
        };
    }

    private URI getShapeDSLURI(final URI uriToProblem) {
        if (dscriptions == null) {
            ResourceDescriptionsProvider serviceProvider = AppInjectedAccess.getit();
            dscriptions = serviceProvider.createResourceDescriptions();
        }
        final String spraySegment = uriToProblem.lastSegment();
        final String lastSegment = spraySegment.substring(0, spraySegment.length() - ".spray".length()) + ".shape";
        List<IResourceDescription> filteredDescs = IteratorExtensions.toList(Iterables.filter(dscriptions.getAllResourceDescriptions(), new Predicate<IResourceDescription>() {
            public boolean apply(IResourceDescription desc) {
                return desc.getURI().lastSegment().equals(lastSegment);
            }
        }).iterator());
        URI uri = null;
        if (filteredDescs.size() > 0) {
            uri = filteredDescs.get(0).getURI();
            List<IEObjectDescription> containers = IteratorExtensions.toList(filteredDescs.get(0).getExportedObjectsByType(ShapesPackage.Literals.SHAPE_CONTAINER_ELEMENT).iterator());
            if (containers.size() > 0) {
                uri = containers.get(0).getEObjectURI();
            } else {
                // no quick fix, when there is a [spray-filename].shape but with empty content
                uri = null;
            }
        } else {
            // no quick fix, when there is no [spray-filename].shape resource
            uri = null;
        }
        return uri;
    }

    private ISemanticModification getModificationForBehaviorGroup(final Issue issue) {
        return new ISemanticModification() {
            @Override
            public void apply(EObject element, IModificationContext context) throws Exception {
                final IXtextDocument xtextDocument = context.getXtextDocument();
                String groupName = xtextDocument.get(issue.getOffset(), issue.getLength()).replace("\"", "");
                Diagram diagram = EcoreUtil2.getContainerOfType(element, Diagram.class);
                if (diagram != null) {
                    BehaviorGroup behaviorGroup = SprayFactory.eINSTANCE.createBehaviorGroup();
                    behaviorGroup.setName(groupName);
                    CustomBehavior customBehavior = SprayFactory.eINSTANCE.createCustomBehavior();
                    customBehavior.setName(groupName);
                    customBehavior.setLabel(groupName);
                    behaviorGroup.getBehaviorsList().add(customBehavior);
                    diagram.getBehaviourGroupsList().add(behaviorGroup);
                }
            }
        };
    }
}
