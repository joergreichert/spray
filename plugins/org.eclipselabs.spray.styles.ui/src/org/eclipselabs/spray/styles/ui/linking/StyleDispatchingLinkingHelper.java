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
package org.eclipselabs.spray.styles.ui.linking;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.ui.linking.gradient.GradientLinkingHelper;
import org.eclipselabs.spray.styles.ui.linking.style.StyleLinkingHelper;

import javax.inject.Inject;

public class StyleDispatchingLinkingHelper extends TypeAwareHyperlinkHelper {
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Inject
	private IJvmModelAssociations modelAssocs;
	
	@Inject
	private StyleLinkingHelper styleLinkingHelper;

	@Inject
	private GradientLinkingHelper gradientLinkingHelper;  

	public void createHyperlinksByOffset(final XtextResource xtextResource,
			int offset, final IHyperlinkAcceptor acceptor) {
		final INode crossRefNode = eObjectAtOffsetHelper.getCrossReferenceNode(
				xtextResource, new TextRegion(offset, 0));
		if (crossRefNode == null)
			return;
		EObject crossLinkedEObject = eObjectAtOffsetHelper
				.getCrossReferencedElement(crossRefNode);

		if (crossLinkedEObject instanceof JvmType) {
			final JvmType jvmType = (JvmType) crossLinkedEObject;
			Set<EObject> sourceElements = modelAssocs.getSourceElements(jvmType);
			if (sourceElements.size() > 0) {
				createHyperlinkFromAssociatedEObjects(xtextResource, acceptor,
						crossRefNode, sourceElements);
			} else {
				styleLinkingHelper.createHyperlinksFromMatchingEObjectsInProject(xtextResource,
						acceptor, crossRefNode, jvmType);
				gradientLinkingHelper.createHyperlinksFromMatchingEObjectsInProject(xtextResource,
						acceptor, crossRefNode, jvmType);
			}
		}
		if (crossLinkedEObject != null && !crossLinkedEObject.eIsProxy()) {
			Region region = getHyperlinkRegion(crossRefNode);
			createHyperlinksTo(xtextResource, region, crossLinkedEObject,
					acceptor);
		}		
	}
	
	private void createHyperlinkFromAssociatedEObjects(
			final XtextResource xtextResource,
			final IHyperlinkAcceptor acceptor, final INode crossRefNode,
			Set<EObject> sourceElements) {
		EObject emfCrossLinkedEObject = sourceElements.iterator().next();
		if (emfCrossLinkedEObject != null && !emfCrossLinkedEObject.eIsProxy()) {
			Region region = getHyperlinkRegion(crossRefNode);
			createHyperlinksTo(xtextResource, region, emfCrossLinkedEObject,
					acceptor);
		}
	}

	private Region getHyperlinkRegion(final INode crossRefNode) {
		return new Region(crossRefNode.getOffset(), crossRefNode.getLength());
	}
	
	@Override
	public void createHyperlinksTo(XtextResource from, Region region,
			final EObject to, IHyperlinkAcceptor acceptor) {
		if(to instanceof Style) {
			styleLinkingHelper.createHyperlinksTo(from, region,
					to, acceptor);
		} else if(to instanceof Gradient) {
			gradientLinkingHelper.createHyperlinksTo(from, region,
					to, acceptor);
		} else {
			super.createHyperlinksTo(from, region, to, acceptor);
		}
	}
}
