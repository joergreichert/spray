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
package org.eclipselabs.spray.runtime.xtext.ui.linking;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;
import org.eclipse.xtext.util.TextRegion;

public abstract class DSLLinkingHelper<T extends EObject> extends
		TypeAwareHyperlinkHelper {

	public void createHyperlinksByOffset(final XtextResource xtextResource,
			int offset, final IHyperlinkAcceptor acceptor) {
		final INode crossRefNode = getEObjectAtOffsetHelper().getCrossReferenceNode(
				xtextResource, new TextRegion(offset, 0));
		if (crossRefNode == null) {
			return;
		}
		EObject crossLinkedEObject = getEObjectAtOffsetHelper()
				.getCrossReferencedElement(crossRefNode);

		if (crossLinkedEObject instanceof JvmType) {
			final JvmType jvmType = (JvmType) crossLinkedEObject;
			Set<EObject> sourceElements = getSourceElements(jvmType);
			if (sourceElements.size() > 0) {
				createHyperlinkFromAssociatedEObjects(xtextResource, acceptor,
						crossRefNode, sourceElements);
			} else {
				createHyperlinksFromMatchingEObjectsInProject(xtextResource,
						acceptor, crossRefNode, jvmType);
			}
		}
		if (crossLinkedEObject != null && !crossLinkedEObject.eIsProxy()) {
			Region region = getHyperlinkRegion(crossRefNode);
			createHyperlinksTo(xtextResource, region, crossLinkedEObject,
					acceptor);
		}
	}

	protected abstract Set<EObject> getSourceElements(JvmType jvmType);

	protected abstract EObjectAtOffsetHelper getEObjectAtOffsetHelper();

	private Region getHyperlinkRegion(final INode crossRefNode) {
		return new Region(crossRefNode.getOffset(), crossRefNode.getLength());
	}

	public void createHyperlinksFromMatchingEObjectsInProject(
			final XtextResource xtextResource,
			final IHyperlinkAcceptor acceptor, final INode crossRefNode,
			final JvmType jvmType) {
		DSLResourceVisitor<T> visitor = getDSLResourceVisitor(xtextResource);
		final Map<IResource, List<T>> fileToEObjects = visitor
				.getFileToEObjectsMap();
		for (List<T> list : fileToEObjects.values()) {
			for (T ele : list) {
				if (hasEObjectAndJvmTypeSameQualifiedName(ele, jvmType)) {
					Region region = getHyperlinkRegion(crossRefNode);
					createHyperlinksTo(xtextResource, region, ele, acceptor);
				}
			}
		}
	}

	protected abstract DSLResourceVisitor<T> getDSLResourceVisitor(
			final XtextResource xtextResource);

	private boolean hasEObjectAndJvmTypeSameQualifiedName(T ele, JvmType jvmType) {
		return ele != null && !ele.eIsProxy()
				&& jvmType.getSimpleName().equals(getName(ele));
	}

	protected abstract String getName(T ele);

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
	
	@Override
	public void createHyperlinksTo(XtextResource from, Region region,
			final EObject to, IHyperlinkAcceptor acceptor) {
		if (isExpectedType(to)) {
			createHyperlinkToDSLElement(from, region, to, acceptor);
		} else {
			super.createHyperlinksTo(from, region, to, acceptor);
		}
	}

	private void createHyperlinkToDSLElement(XtextResource from, Region region,
			final EObject to, IHyperlinkAcceptor acceptor) {
		final URIConverter uriConverter = from.getResourceSet()
				.getURIConverter();
		uriConverter.getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));		
		final String hyperlinkText = getLabelProvider().getText(to) + " (Xtext)";
		final URI uri = EcoreUtil.getURI(to);
		final URI normalized = uriConverter.normalize(uri);

		XtextHyperlink result = new XtextHyperlink() {

			public void open() {
				if (isExpectedType(to)) {
					@SuppressWarnings("unchecked")
					DSLEditorOpener<T> opener = getDSLEditorOpener((T) to);
					boolean select = true;
					opener.open(uri, select);
				}
			}

		};
		result.setHyperlinkRegion(region);
		result.setURI(normalized);
		result.setHyperlinkText(hyperlinkText);
		acceptor.accept(result);
	}
	
	protected abstract boolean isExpectedType(final EObject to);
	
	protected abstract DSLEditorOpener<T> getDSLEditorOpener(T to);
}
