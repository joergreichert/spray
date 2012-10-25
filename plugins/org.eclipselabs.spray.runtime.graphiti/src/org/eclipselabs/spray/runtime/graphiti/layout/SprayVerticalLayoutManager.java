package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
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

    public boolean layout(ILayoutContext context) {
        return true;
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
                    movePolyLine((Polyline) childAlgorithm, x, y);
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

    private void movePolyLine(Polyline line, int x, int y) {
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
        //        System.out.println("STRECHT VERTICAL of " + SprayLayoutService.getId(shape) + " to " + newWidth);
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        int oldWidth = shapeGa.getWidth();
        if (!isFlexible()) {
            System.out.println(indent() + "VerticalLayout stretch NOT FLEXIBLE shape " + SprayLayoutService.getId(shape) + " from " + oldWidth + "  to " + newWidth);
            level--;
            return;
        }
        layoutService.setWidth(shapeGa, newWidth);
        if (this.getAlignment() == SprayAlignment.MIDDLE) {
            // already dione
            System.out.println(indent() + "VerticalLayout stretch alignment MIUDDLE shape " + SprayLayoutService.getId(shape) + " from " + oldWidth + "  to " + newWidth);
        } else {
            shape.getGraphicsAlgorithm().setWidth(newWidth);
            for (Shape child : shape.getChildren()) {
                GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
                System.out.println(indent() + "VerticalLayout stretch child shape " + SprayLayoutService.getId(child) + " from " + oldWidth + "  to " + newWidth);
                SprayResizeLayoutManager mgr = new SprayResizeLayoutManager();
                ILayoutContext ctx = new LayoutContext(child);
                if (childGa instanceof Polyline || childGa instanceof Polygon) {
                    IDimension dim = gaService.calculateSize(childGa);
                    SprayLayoutService.setCurrentHeight(child, dim.getHeight());
                    SprayLayoutService.setCurrentWidth(child, dim.getWidth());
                    childGa.setHeight(dim.getHeight());
                } else {
                    SprayLayoutService.setCurrentHeight(child, childGa.getHeight());
                    SprayLayoutService.setCurrentWidth(child, childGa.getWidth());
                }
                childGa.setWidth(newWidth);
                mgr.layout(ctx);
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

    // TODO copied from SprayLayouytManager
    public void resizePolyline(Polyline p, double widthFactor, double heightFactor) {
        System.out.println("resizePolyline of " + SprayLayoutService.getId(p.getPictogramElement()) + " factor " + widthFactor);
        recalulatePointList(p.getPoints(), widthFactor, heightFactor);
    }

    public void resizePolygon(Polygon p, double widthFactor, double heightFactor) {
        recalulatePointList(p.getPoints(), widthFactor, heightFactor);
    }

    public void recalulatePointList(EList<Point> points, double widthFactor, double heightFactor) {
        for (Point point : points) {
            int newXCord = (int) Math.round(point.getX() * widthFactor);
            int newYCord = (int) Math.round(point.getY() * heightFactor);
            point.setX(newXCord);
            point.setY(newYCord);
        }
    }

}
