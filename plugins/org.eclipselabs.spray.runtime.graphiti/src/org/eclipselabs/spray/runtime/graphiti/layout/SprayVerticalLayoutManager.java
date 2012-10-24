package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.impl.ResizeShapeContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * This is a layout manager that will put all subshapes under each other
 * vertically. If possible the subshapes will all be stretched to the width of
 * the widest subshape.
 * 
 * @author jos
 */
public class SprayVerticalLayoutManager extends SprayAbstractLayoutManager {

    /**
     * Creates the layout manager for shape
     * 
     * @param shape
     */
    public SprayVerticalLayoutManager(ContainerShape shape) {
        super(shape);
    }

    public void layout() {
        level++;
        System.out.println(indent() + "VerticalLayoutManager.layout() " + SprayLayoutService.getId(shape));
        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
        if (data.isVisible()) {
            int spacing = getSpacing();
            int margin = getMargin();
            int x = margin;
            int y = margin;
            int width = 0;
            for (Shape child : shape.getChildren()) {
                ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                mgr.layout();
                GraphicsAlgorithm childAlgorithm = child.getGraphicsAlgorithm();
                if (childAlgorithm instanceof Polyline) {
                    changePolyLine((Polyline) childAlgorithm, x, y);
                } else {
                    gaService.setLocation(childAlgorithm, x, y);
                }
                y += childAlgorithm.getHeight() + spacing;
                width = Math.max(width, childAlgorithm.getWidth());
            }
            width = Math.max(width, data.getMinimumWidth());
            if (this.getAlignment() == SprayAlignment.MIDDLE) {
                alignCenter(width);
            } else {
                stretchWidthTo(width);
            }
            // set the final size of the shape
            int newWidth = width + (2 * margin);
            int newHeight = Math.max(y + margin, data.getMinimumHeight());
            //            System.out.println(indent() + "VerticalLayoutManager.layout() " + SprayLayoutService.getId(shape) + " width set to " + newWidth);
            if (isFlexible()) {
                gaService.setSize(shape.getGraphicsAlgorithm(), newWidth, newHeight);
            }
        } else {
            gaService.setSize(shape.getGraphicsAlgorithm(), 0, 0);
        }
        level--;
    }

    private void changePolyLine(Polyline line, int x, int y) {
        Point first = line.getPoints().get(0);
        int xDiff = x - first.getX();
        int yDiff = y - first.getY();

        for (Point point : line.getPoints()) {
            int newXCord = point.getX() + xDiff;
            int newYCord = point.getY() + yDiff;
            point.setX(newXCord);
            point.setY(newYCord);
        }
    }

    /**
     * Align all children on their center
     */
    private void alignCenter(int newWidth) {
        for (Shape child : shape.getChildren()) {
            GraphicsAlgorithm ga = child.getGraphicsAlgorithm();
            int diff = (newWidth - ga.getWidth()) / 2;
            gaService.setLocation(ga, ga.getX() + diff, ga.getY());
        }
    }

    @Override
    public void stretchWidthTo(int newWidth) {
        level++;
        System.out.println("STRECHT VERTICAL of " + SprayLayoutService.getId(shape) + " to " + newWidth);
        if (!isFlexible()) {
            return;
        }
        int margin = getMargin();
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        layoutService.setWidth(shapeGa, newWidth);
        if (this.getAlignment() == SprayAlignment.MIDDLE) {
            // already dione
        } else {
            for (Shape child : shape.getChildren()) {
                if (SprayLayoutService.isShapeFromDsl(child)) {
                    System.out.println("STRETCH TO WIDTH resize " + SprayLayoutService.getId(child));
                    GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
                    Diagram diagram = Graphiti.getPeService().getDiagramForShape(shape);
                    IFeatureProvider featureProvider = GraphitiUi.getExtensionManager().createFeatureProvider(diagram);
                    ResizeShapeContext context = new ResizeShapeContext(child);
                    context.setLocation(childGa.getX(), childGa.getY());
                    context.setSize(newWidth, childGa.getHeight());
                    IResizeShapeFeature feature = featureProvider.getResizeShapeFeature(context);
                    feature.resizeShape(context);
                } else {
                    System.out.println("STRETCH TO WIDTH old fashion  " + SprayLayoutService.getId(child));
                    if (SprayLayoutService.getLayoutData(child).isHorizontalStretchable()) {
                        System.out.println("SETTING CHILD WIDTH of " + SprayLayoutService.getId(child) + " to " + (newWidth - (2 * margin)));
                        ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                        mgr.stretchWidthTo(newWidth - (2 * margin));
                    }
                }
            }
        }
        level--;
    }

    @Override
    public void stretchHeightTo(int newHeight) {
        level++;
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        int diff = newHeight - shapeGa.getHeight();
        layoutService.setHeight(shape.getGraphicsAlgorithm(), newHeight);
        boolean stretched = false;
        for (Shape child : shape.getChildren()) {
            SprayLayoutData data = SprayLayoutService.getLayoutData(child);
            GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
            if (!stretched) {
                if (data.isVerticalStretchable()) {
                    ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(child);
                    mgr.stretchHeightTo(childGa.getHeight() + diff);
                    stretched = true;
                }
            } else {
                layoutService.setLocation(childGa, childGa.getX(), childGa.getY() + diff);
            }
        }
        level--;
    }
}
