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

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeLayout;
import org.eclipselabs.spray.shapes.ShapesFactory;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.ui.quickfix.LinkingQuickfixModificationJob;
import org.eclipselabs.spray.xtext.scoping.AppInjectedAccess;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

public abstract class AbstractShapeDSLModificationJob extends IUnitOfWork.Void<XtextResource> {
    public enum ModificationJobType implements LinkingQuickfixModificationJob {
        SHAPE,
        CONNECTION;

        public AbstractShapeDSLModificationJob create(final IXtextDocument sprayXtextDocument, final Issue issue) {
            AbstractShapeDSLModificationJob job = null;
            if (this == ModificationJobType.SHAPE) {
                job = new ShapeDefinitionModificationJob(sprayXtextDocument, issue);
            } else if (this == ModificationJobType.CONNECTION) {
                job = new ConnectionDefinitionModificationJob(sprayXtextDocument, issue);
            }
            return job;
        }

        /*
         * (non-Javadoc)
         * @see org.eclipselabs.spray.xtext.ui.quickfix.QuickfixTargetDSLURIProvider#getDSLURI(org.eclipse.xtext.resource.IResourceDescriptions, org.eclipse.emf.common.util.URI)
         */
        @Override
        public URI getDSLURI(IResourceDescriptions dscriptions, final URI uriToProblem) {
            if (dscriptions == null) {
                ResourceDescriptionsProvider serviceProvider = AppInjectedAccess.getit();
                dscriptions = serviceProvider.createResourceDescriptions();
            }
            final String spraySegment = uriToProblem.trimFragment().lastSegment();
            final String lastSegment = spraySegment.substring(0, spraySegment.length() - ".spray".length()) + ".shape";
            final String uriToSprayFile = uriToProblem.trimFragment().trimSegments(1).appendSegment(lastSegment).toString();
            List<IResourceDescription> filteredDescs = IteratorExtensions.toList(Iterables.filter(dscriptions.getAllResourceDescriptions(), new Predicate<IResourceDescription>() {
                public boolean apply(IResourceDescription desc) {
                    return desc.getURI().trimFragment().toString().equals(uriToSprayFile);
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
    }

    private IXtextDocument sprayXtextDocument;
    private Issue          issue;
    protected EObject      newElement;

    protected AbstractShapeDSLModificationJob(final IXtextDocument sprayXtextDocument, final Issue issue) {
        AbstractShapeDSLModificationJob.this.sprayXtextDocument = sprayXtextDocument;
        AbstractShapeDSLModificationJob.this.issue = issue;
    }

    @Override
    public void process(XtextResource shapeResource) throws Exception {
        ShapeContainer shapeContainer = null;
        for (EObject eo : shapeResource.getContents()) {
            if (eo instanceof ShapeContainer) {
                shapeContainer = (ShapeContainer) eo;
                break;
            }
        }
        if (shapeContainer != null) {
            String elementName = sprayXtextDocument.get(issue.getOffset(), issue.getLength());
            newElement = createNewElement(shapeContainer, elementName);
        }
    }

    protected abstract EObject createNewElement(ShapeContainer shapeContainer, String elementName);

    private static class ShapeDefinitionModificationJob extends AbstractShapeDSLModificationJob {

        ShapeDefinitionModificationJob(IXtextDocument sprayXtextDocument, Issue issue) {
            super(sprayXtextDocument, issue);
        }

        @Override
        protected EObject createNewElement(ShapeContainer shapeContainer, String shapeName) {
            ShapeDefinition shapeDefinition = ShapesFactory.eINSTANCE.createShapeDefinition();
            shapeDefinition.setName(shapeName);
            Rectangle rectangle = ShapesFactory.eINSTANCE.createRectangle();
            RectangleEllipseLayout rectangleEllipseLayout = ShapesFactory.eINSTANCE.createRectangleEllipseLayout();
            CommonLayout commonLayout = ShapesFactory.eINSTANCE.createCommonLayout();
            commonLayout.setXcor(0);
            commonLayout.setYcor(0);
            commonLayout.setWidth(100);
            commonLayout.setHeigth(100);
            rectangleEllipseLayout.setCommon(commonLayout);
            rectangle.setLayout(rectangleEllipseLayout);
            shapeDefinition.getShape().add(rectangle);
            ShapeLayout shapeLayout = ShapesFactory.eINSTANCE.createShapeLayout();
            shapeDefinition.setShapeLayout(shapeLayout);
            shapeContainer.getShapeContainerElement().add(shapeDefinition);
            return shapeDefinition;
        }
    }

    private static class ConnectionDefinitionModificationJob extends AbstractShapeDSLModificationJob {

        ConnectionDefinitionModificationJob(IXtextDocument sprayXtextDocument, Issue issue) {
            super(sprayXtextDocument, issue);
        }

        @Override
        protected EObject createNewElement(ShapeContainer shapeContainer, String shapeName) {
            ConnectionDefinition connectionDefinition = ShapesFactory.eINSTANCE.createConnectionDefinition();
            connectionDefinition.setName(shapeName);
            shapeContainer.getShapeContainerElement().add(connectionDefinition);
            return connectionDefinition;
        }
    }

    public EObject getNewElement() {
        return newElement;
    }
}
