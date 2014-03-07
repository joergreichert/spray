/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.xtext.ui.quickfix;

import javax.inject.Inject;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
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
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipselabs.spray.mm.spray.BehaviorGroup;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.shapes.ui.quickfix.AbstractStyleDSLModificationJob;
import org.eclipselabs.spray.shapes.ui.quickfix.LinkingQuickfixModificationJob;
import org.eclipselabs.spray.xtext.scoping.AppInjectedAccess;

public class SprayQuickfixProvider extends DefaultQuickfixProvider {
    private IResourceDescriptions            dscriptions = null;

    @Inject
    private IssueModificationContext.Factory modificationContextFactory;

    @Inject
    private IURIEditorOpener                 editorOpener;

    @Fix(Diagnostic.LINKING_DIAGNOSTIC)
    public void handleMissingLink(final Issue issue, IssueResolutionAcceptor acceptor) {
        if (issue.getMessage().startsWith("Couldn't resolve reference to ShapeDefinition")) {
            handleMissingDefinitionLink("Create shape definition", "Create shape definition", issue, acceptor, AbstractShapeDSLModificationJob.ModificationJobType.SHAPE);
        } else if (issue.getMessage().startsWith("Couldn't resolve reference to ConnectionDefinition")) {
            handleMissingDefinitionLink("Create connection definition", "Create connection definition", issue, acceptor, AbstractShapeDSLModificationJob.ModificationJobType.CONNECTION);
        } else if (issue.getMessage().startsWith("Couldn't resolve reference to Style")) {
            handleMissingDefinitionLink("Create style definition", "Create style definition", issue, acceptor, AbstractStyleDSLModificationJob.ModificationJobType.STYLE);
        } else if (issue.getMessage().startsWith("Couldn't resolve reference to BehaviorGroup")) {
            acceptor.accept(issue, "Create behavior group", "Create behavior group", null, getModificationForBehaviorGroup(issue));
        } else {
            createLinkingIssueResolutions(issue, acceptor);
        }
    }

    private void handleMissingDefinitionLink(String label, String description, final Issue issue, IssueResolutionAcceptor acceptor, LinkingQuickfixModificationJob linkingQuickfixModificationJob) {
        URI sprayDSLURI = issue.getUriToProblem();
        if (sprayDSLURI != null) {
            URI shapeDSLURI = getOtherDSLURI(issue.getUriToProblem(), linkingQuickfixModificationJob);
            if (shapeDSLURI != null) {
                ISemanticModification modificationForDefinition = getModificationForDefinition(sprayDSLURI, shapeDSLURI, issue, linkingQuickfixModificationJob);
                if (modificationForDefinition != null) {
                    SemanticModificationWrapper modificationWrapper = new SemanticModificationWrapper(shapeDSLURI, modificationForDefinition);
                    Issue.IssueImpl newIssue = new Issue.IssueImpl();
                    newIssue.setUriToProblem(shapeDSLURI);
                    acceptor.getIssueResolutions().add(new IssueResolution(label, description, null, modificationContextFactory.createModificationContext(newIssue), modificationWrapper));
                }
            } else {
                URI styleDSLURI = getOtherDSLURI(issue.getUriToProblem(), linkingQuickfixModificationJob);
                if (styleDSLURI != null) {
                    createMissingLinkedElement(sprayDSLURI, styleDSLURI, label, description, issue, acceptor, linkingQuickfixModificationJob);
                }
            }
        }
    }

    private void createMissingLinkedElement(URI sprayDSLURI, URI otherDSLURI, String label, String description, final Issue issue, IssueResolutionAcceptor acceptor, LinkingQuickfixModificationJob linkingQuickfixModificationJob) {
        ISemanticModification modificationForDefinition = getModificationForDefinition(sprayDSLURI, otherDSLURI, issue, linkingQuickfixModificationJob);
        if (modificationForDefinition != null) {
            SemanticModificationWrapper modificationWrapper = new SemanticModificationWrapper(otherDSLURI, modificationForDefinition);
            Issue.IssueImpl newIssue = new Issue.IssueImpl();
            newIssue.setUriToProblem(otherDSLURI);
            acceptor.getIssueResolutions().add(new IssueResolution(label, description, null, modificationContextFactory.createModificationContext(newIssue), modificationWrapper));
        }
    }

    private ISemanticModification getModificationForDefinition(final URI sprayDSLURI, final URI otherDSLURI, final Issue issue, final LinkingQuickfixModificationJob linkingQuickfixModificationJob) {
        return new ISemanticModification() {
            @Override
            public void apply(EObject element, IModificationContext context) throws Exception {
                final IXtextDocument sprayXtextDocument = context.getXtextDocument(sprayDSLURI);
                final IXtextDocument shapeXtextDocument = context.getXtextDocument(otherDSLURI);
                IUnitOfWork<?, XtextResource> job = linkingQuickfixModificationJob.create(sprayXtextDocument, issue);
                if (job != null) {
                    shapeXtextDocument.modify(job);
                    XtextEditor xtextEditor = (XtextEditor) editorOpener.open(otherDSLURI, true);
                    int index = xtextEditor.getDocument().get().length();
                    if (index > 0) {
                        xtextEditor.selectAndReveal(index, 0);
                    }
                }
            }
        };
    }

    private URI getOtherDSLURI(final URI uriToProblem, LinkingQuickfixModificationJob linkingQuickfixModificationJob) {
        if (dscriptions == null) {
            ResourceDescriptionsProvider serviceProvider = AppInjectedAccess.getit();
            dscriptions = serviceProvider.createResourceDescriptions();
        }
        return linkingQuickfixModificationJob.getDSLURI(dscriptions, uriToProblem);
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
                    behaviorGroup.getBehaviors().add(customBehavior);
                    diagram.getBehaviourGroups().add(behaviorGroup);
                }
            }
        };
    }
}
