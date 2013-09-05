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
package org.eclipselabs.spray.shapes.ui.linking;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLLinkingHelper;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.styles.Style;

import javax.inject.Inject;

public class ShapeLinkingHelper extends DSLLinkingHelper<Style> {
		
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private IJvmModelAssociations modelAssocs;
	
	@Inject
	private StyleEditorOpener styleEditorOpener;
	
	@Inject 
	private StyleResourceVisitor styleResourceVisitor;

	@Override
	protected DSLResourceVisitor<Style> getDSLResourceVisitor(
			final XtextResource xtextResource) {
		styleResourceVisitor.setResourceSet(xtextResource.getResourceSet());
		return styleResourceVisitor;
	}

	@Override
	protected boolean isExpectedType(final EObject to) {
		return to instanceof Style;
	}
	
	@Override
	protected DSLEditorOpener<Style> getDSLEditorOpener(Style to) {
		styleEditorOpener.setEObject(to);
		return styleEditorOpener;
	}

	@Override
	protected String getName(Style style) {
		return style.getName();
	}

	@Override
	protected Set<EObject> getSourceElements(JvmType jvmType) {
		return modelAssocs.getSourceElements(jvmType);
	}

	@Override
	protected EObjectAtOffsetHelper getEObjectAtOffsetHelper() {
		return eObjectAtOffsetHelper;
	}
}
