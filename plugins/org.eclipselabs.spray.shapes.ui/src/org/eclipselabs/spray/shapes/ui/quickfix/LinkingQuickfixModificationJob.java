package org.eclipselabs.spray.shapes.ui.quickfix;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;

public interface LinkingQuickfixModificationJob {

    public abstract IUnitOfWork<?, XtextResource> create(final IXtextDocument sprayXtextDocument, final Issue issue);
    public abstract URI getDSLURI(IResourceDescriptions dscriptions, URI uriToProblem);
}
