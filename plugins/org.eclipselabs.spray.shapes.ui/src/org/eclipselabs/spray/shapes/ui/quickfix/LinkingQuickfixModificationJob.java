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
