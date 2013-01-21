package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.impl.GaServiceImpl;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * A layout manager is responsible for setting the location and size of the
 * children of the layuout managers shape. The shape is usually a container
 * shape.
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public abstract class SprayAbstractLayoutManager implements ISprayLayoutManager {

    static final public IGaService gaService = Graphiti.getGaService();

    // debugging / logging helper variable
    static public int              level     = 0;
    static public boolean          DEBUG     = true;

    /**
     * Debugging / logger helper to indent according to level.
     * 
     * @return
     */
    static public String indent() {
        StringBuffer result = new StringBuffer("");
        for (int i = 0; i < level; i++) {
            result.append("   ");
        }
        return result.toString();
    }

    static public void debug(String message) {
        if (DEBUG) {
            System.out.println(indent() + message);
        }
    }

    // The shape for this layout mmanager
    protected ContainerShape shape   = null;

    static int               xOffset = 0;
    static int               yOffset = 0;

    static public ContainerShape findActiveParent(Shape shape) {
        ContainerShape result = null;
        result = shape.getContainer();
        while ((result != null) && (!result.isActive())) {
            GraphicsAlgorithm ga = result.getGraphicsAlgorithm();
            xOffset += ga.getX();
            yOffset += ga.getY();
            result = result.getContainer();
        }
        return result;
    }

    static public void fixOffset(ContainerShape containerShape) {
        //        System.out.println("BEGIN FixOffset: " + SprayLayoutService.getId(containerShape));

        fixOffsetForShape(containerShape);
        for (Shape child : containerShape.getChildren()) {
            if (child instanceof ContainerShape) {
                fixOffset((ContainerShape) child);
            }
        }
        //        System.out.println("END FixOffset: ");
    }

    static protected void fixOffsetForShape(ContainerShape containerShape) {
        boolean active = containerShape.isActive();
        //        System.out.println("BEGIN FixOffset for shape: " + SprayLayoutService.getId(containerShape) + " active " + active);
        if (active) {
            if (!containerShape.getContainer().isActive()) {

                xOffset = 0;
                yOffset = 0;
                ContainerShape parent = findActiveParent(containerShape);
                if (parent != null) {
                    GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
                    System.out.println("    fixing shape " + SprayLayoutService.getId(containerShape) + " old " + containerGa.getX() + ", " + containerGa.getY() + " offset " + xOffset + ", " + yOffset);
                    Graphiti.getGaService().setLocation(containerGa, containerGa.getX() + xOffset, containerGa.getY() + yOffset);
                    System.out.println("    new: " + containerGa.getX() + ", " + containerGa.getY());
                }
            }
        }
        //        System.out.println("END FixOffset for shape");
    }

    static public void OLDfixOffset(ContainerShape containerShape) {
        System.out.println("BEGIN FixOffset: " + SprayLayoutService.getId(containerShape));

        OLDfixOffsetForShape(containerShape);
        for (Shape child : containerShape.getChildren()) {
            if (child instanceof ContainerShape) {
                OLDfixOffset((ContainerShape) child);
            }
        }
        System.out.println("END FixOffset: ");
    }

    static protected void OLDfixOffsetForShape(ContainerShape containerShape) {
        System.out.println("BEGIN FixOffset for shape: " + SprayLayoutService.getId(containerShape));
        if (containerShape.isActive()) {
            return;
        }
        int xOffset = 0;
        int yOffset = 0;
        GraphicsAlgorithm ga = containerShape.getGraphicsAlgorithm();
        xOffset += ga.getX();
        yOffset += ga.getY();

        for (Shape child : containerShape.getChildren()) {
            GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
            if (childGa instanceof Polyline) {
                // noting ?
            } else if (childGa instanceof Text) {
                //                Graphiti.getGaService().setLocation(childGa, childGa.getX() + xOffset, childGa.getY() + yOffset);
            } else {
                System.out.println("    fixing child " + SprayLayoutService.getId(child) + " old " + childGa.getX() + ", " + childGa.getY() + " offset " + xOffset + ", " + yOffset);
                Graphiti.getGaService().setLocation(childGa, childGa.getX() + xOffset, childGa.getY() + yOffset);
                System.out.println("    new: " + childGa.getX() + ", " + childGa.getY());
            }
        }
        System.out.println("END FixOffset for shape");
    }

    /**
     * Create a new layout manager
     * 
     * @param shape
     *            The shape for which this layout manager is created.
     */
    public SprayAbstractLayoutManager(ContainerShape shape) {
        this.shape = shape;
    }

    public void stretchWidthTo(int newWidth) {
        level++;
        //        System.out.println("STRECHT VERTICAL of " + SprayLayoutService.getId(shape) + " to " + newWidth);
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        //        int oldWidth = shapeGa.getWidth();
        if (!isFlexible()) {
            //            debug("VerticalLayout stretch NOT FLEXIBLE shape " + SprayLayoutService.getId(shape) + " from " + oldWidth + "  to " + newWidth);
            level--;
            return;
        }
        layoutService.setWidth(shapeGa, newWidth);
        if (this.getAlignment() == SprayAlignment.MIDDLE) {
            // already dione
            //            debug("VerticalLayout stretch alignment MIUDDLE shape " + SprayLayoutService.getId(shape) + " from " + oldWidth + "  to " + newWidth);
        } else {
            shape.getGraphicsAlgorithm().setWidth(newWidth);
            for (Shape child : shape.getChildren()) {
                if (!SprayLayoutService.getLayoutData(child).isHorizontalStretchable()) {
                    //                    debug("VerticalLayout not STRETCHABLKE child shape " + SprayLayoutService.getId(child) + " from " + oldWidth + "  to " + newWidth);
                    continue;
                }
                GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
                //                debug("VerticalLayout stretch child shape " + SprayLayoutService.getId(child) + " from " + oldWidth + "  to " + newWidth);
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

    public void stretchHeightTo(int newHeight) {
        level++;
        GraphicsAlgorithm shapeGa = shape.getGraphicsAlgorithm();
        if (!isFlexible()) {
            level--;
            return;
        }
        layoutService.setHeight(shapeGa, newHeight);
        if (this.getAlignment() == SprayAlignment.MIDDLE) {
            // already dione
        } else {
            shape.getGraphicsAlgorithm().setHeight(newHeight);
            for (Shape child : shape.getChildren()) {
                if (!SprayLayoutService.getLayoutData(child).isVerticalStretchable()) {
                    continue;
                }
                GraphicsAlgorithm childGa = child.getGraphicsAlgorithm();
                SprayResizeLayoutManager mgr = new SprayResizeLayoutManager();
                ILayoutContext ctx = new LayoutContext(child);
                if (childGa instanceof Polyline || childGa instanceof Polygon) {
                    IDimension dim = gaService.calculateSize(childGa);
                    SprayLayoutService.setCurrentHeight(child, dim.getHeight());
                    SprayLayoutService.setCurrentWidth(child, dim.getWidth());
                    childGa.setWidth(dim.getWidth());
                } else {
                    SprayLayoutService.setCurrentHeight(child, childGa.getHeight());
                    SprayLayoutService.setCurrentWidth(child, childGa.getWidth());
                }
                childGa.setHeight(newHeight);
                mgr.layout(ctx);
            }
        }
        level--;
    }

    @Override
    public int getMargin() {
        return GraphitiProperties.getIntValue(shape, SprayLayoutService.LAYOUT_MARGIN);
    }

    @Override
    public void setMargin(int margin) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_MARGIN, margin);
    }

    /**
     * Gets the spacing for this layoyut managwer. The spacing is the amount of
     * space betwen the elemtns in this layout manager.
     */
    @Override
    public int getSpacing() {
        return GraphitiProperties.getIntValue(shape, SprayLayoutService.LAYOUT_SPACING);
    }

    /**
     * sets the spacing for this layoyut managwer. The spacing is the amount of
     * space betwen the elemtns in this layout manager.
     */
    @Override
    public void setSpacing(int spacing) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_SPACING, spacing);
    }

    @Override
    public SprayAlignment getAlignment() {
        return GraphitiProperties.getSprayAlignmentValue(shape, SprayLayoutService.LAYOUT_ALIGNMENT);
    }

    @Override
    public void setAlignment(SprayAlignment alignment) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_ALIGNMENT, alignment);
    }

    protected void movePolyLine(Polyline line, int x, int y) {
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

    static public void print(Shape shape, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
        System.out.println(SprayLayoutService.getId(shape) + " ==> " + ga.getClass().getSimpleName() + " X : " + ga.getX() + " Y : " + ga.getY() + " W : " + ga.getWidth() + " H : " + ga.getHeight());
        if (shape instanceof ContainerShape) {
            for (Shape child : ((ContainerShape) shape).getChildren()) {
                print(child, level + 1);
            }
        }
    }

    static public void printLayout(Shape expressionShape, int level) {
        // expressionShape.setActive(false);
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        GraphicsAlgorithm ga = expressionShape.getGraphicsAlgorithm();
        ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(expressionShape);
        SprayLayoutData data = SprayLayoutService.getLayoutData(expressionShape);
        System.out.println(SprayLayoutService.getId(expressionShape) + " ==> " + ga.getClass().getSimpleName() + " Layout : " + mgr.getClass().getSimpleName() + " margin : " + mgr.getMargin() + " spacing: " + mgr.getSpacing() + " MinW : " + data.getMinimumWidth() + " MinH : " + data.getMinimumHeight());
        if (expressionShape instanceof ContainerShape) {
            for (Shape child : ((ContainerShape) expressionShape).getChildren()) {
                printLayout(child, level + 1);
            }
        }
    }

    static public Font manageFont(Diagram diagram, String name, int size) {
        return Graphiti.getGaService().manageFont(diagram, name, size);
    }

    static public void setDefaultTextAttributes(Diagram diagram, AbstractText ret, String value) {
        //        setDefaultGraphicsAlgorithmValues(ret);
        ret.setValue(value);
        if (diagram != null) {
            Font font = manageFont(diagram, GaServiceImpl.DEFAULT_FONT, 12);
            ret.setFont(font);
        }
    }

    @Override
    public boolean isFlexible() {
        return SprayLayoutService.isFlexible(shape);
    }
}
