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

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleContainer;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesFactory;
import org.eclipselabs.spray.styles.StylesPackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public abstract class AbstractStyleDSLModificationJob extends IUnitOfWork.Void<XtextResource> {
    public enum ModificationJobType implements LinkingQuickfixModificationJob {
        STYLE,
        GRADIENT;

        public AbstractStyleDSLModificationJob create(final IXtextDocument shapeXtextDocument, final Issue issue) {
            AbstractStyleDSLModificationJob job = null;
            if (this == ModificationJobType.STYLE) {
                job = new StyleModificationJob(shapeXtextDocument, issue);
            } else if (this == ModificationJobType.GRADIENT) {
                job = new GradientModificationJob(shapeXtextDocument, issue);
            }
            return job;
        }

		@Override
		public URI getDSLURI(IResourceDescriptions dscriptions, URI uriToProblem) {
			final String spraySegment = uriToProblem.trimFragment().lastSegment();
			final String lastSegment = spraySegment.substring(0,
					spraySegment.length() - ".shape".length())
					+ ".style";
			final String uriToShapeFile = uriToProblem.trimFragment()
					.trimSegments(1)
					.appendSegment(lastSegment).toString();
			List<IResourceDescription> filteredDescs = IteratorExtensions
					.toList(Iterables.filter(
							dscriptions.getAllResourceDescriptions(),
							new Predicate<IResourceDescription>() {
								public boolean apply(IResourceDescription desc) {
									return desc.getURI().trimFragment().toString()
											.equals(uriToShapeFile);
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
					// no quick fix, when there is a [shape-filename].shape but with
					// empty content
					uri = null;
				}
			} else {
				// no quick fix, when there is no [shape-filename].shape resource
				uri = null;
			}
			return uri;
		}
    }

    private IXtextDocument shapeXtextDocument;
    private Issue          issue;
    protected EObject      newElement;

    protected AbstractStyleDSLModificationJob(final IXtextDocument shapeXtextDocument, final Issue issue) {
        AbstractStyleDSLModificationJob.this.shapeXtextDocument = shapeXtextDocument;
        AbstractStyleDSLModificationJob.this.issue = issue;
    }

    @Override
    public void process(XtextResource styleResource) throws Exception {
    	StyleContainer styleContainer = null;
        for (EObject eo : styleResource.getContents()) {
            if (eo instanceof StyleContainer) {
            	styleContainer = (StyleContainer) eo;
                break;
            }
        }
        if (styleContainer != null) {
            String elementName = shapeXtextDocument.get(issue.getOffset(), issue.getLength());
            newElement = createNewElement(styleContainer, elementName);
        }
    }

    protected abstract EObject createNewElement(StyleContainer styleContainer, String elementName);

    private static class StyleModificationJob extends AbstractStyleDSLModificationJob {

        StyleModificationJob(IXtextDocument sprayXtextDocument, Issue issue) {
            super(sprayXtextDocument, issue);
        }

        @Override
        protected EObject createNewElement(StyleContainer styleContainer, String styleName) {
            Style style = StylesFactory.eINSTANCE.createStyle();
            style.setName(styleName);
            StyleLayout styleLayout = StylesFactory.eINSTANCE.createStyleLayout();
            style.setLayout(styleLayout);
            styleContainer.getStyleContainerElement().add(style);
            return style;
        }
    }

    private static class GradientModificationJob extends AbstractStyleDSLModificationJob {

        GradientModificationJob(IXtextDocument sprayXtextDocument, Issue issue) {
            super(sprayXtextDocument, issue);
        }

        @Override
        protected EObject createNewElement(StyleContainer styleContainer, String gradientName) {
            Gradient gradient = StylesFactory.eINSTANCE.createGradient();
       		gradient.setName(gradientName);
            GradientLayout gradientLayout = StylesFactory.eINSTANCE.createGradientLayout();
            gradient.setLayout(gradientLayout);
            styleContainer.getStyleContainerElement().add(gradient);
            return gradient;
        }
    }

    public EObject getNewElement() {
        return newElement;
    }
}
