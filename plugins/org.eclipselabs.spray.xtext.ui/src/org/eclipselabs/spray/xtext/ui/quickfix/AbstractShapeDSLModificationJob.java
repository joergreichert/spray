package org.eclipselabs.spray.xtext.ui.quickfix;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.Issue;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeLayout;
import org.eclipselabs.spray.shapes.ShapesFactory;

public abstract class AbstractShapeDSLModificationJob extends IUnitOfWork.Void<XtextResource> {
    public enum ModificationJobType {
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
