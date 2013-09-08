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
package org.eclipselabs.spray.styles.ui.linking.gradient;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLEditorOpener;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLLinkingHelper;
import org.eclipselabs.spray.runtime.xtext.ui.linking.DSLResourceVisitor;
import org.eclipselabs.spray.styles.Gradient;

import javax.inject.Inject;

public class GradientLinkingHelper extends DSLLinkingHelper<Gradient> {
		
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	@Inject
	private IJvmModelAssociations modelAssocs;
	
	@Inject
	private GradientEditorOpener gradientEditorOpener;
	
	@Inject 
	private GradientResourceVisitor gradientResourceVisitor;

	@Override
	protected DSLResourceVisitor<Gradient> getDSLResourceVisitor(
			final XtextResource xtextResource) {
		gradientResourceVisitor.setResourceSet(xtextResource.getResourceSet());
		return gradientResourceVisitor;
	}

	@Override
	protected boolean isExpectedType(final EObject to) {
		return to instanceof Gradient;
	}
	
	@Override
	protected DSLEditorOpener<Gradient> getDSLEditorOpener(Gradient to) {
		gradientEditorOpener.setEObject(to);
		return gradientEditorOpener;
	}

	@Override
	protected String getName(Gradient style) {
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
