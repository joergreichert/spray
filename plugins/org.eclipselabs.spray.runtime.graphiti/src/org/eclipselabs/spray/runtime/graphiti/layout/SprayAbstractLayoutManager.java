package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * A layout manager is responsible for setting the location and size of the
 * children of the layuout managers shape. The shape is usually a container
 * shape.
 * 
 * @author jos
 */
public abstract class SprayAbstractLayoutManager implements ISprayLayoutManager {

    static final public IGaService gaService = Graphiti.getGaService();

    // debugging / logging helper variable
    static public int              level     = 0;

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
        System.out.println("BEGIN FixOffset: " + SprayLayoutService.getId(containerShape));

        fixOffsetForShape(containerShape);
        for (Shape child : containerShape.getChildren()) {
            if (child instanceof ContainerShape) {
                fixOffset((ContainerShape) child);
            }
        }
        System.out.println("END FixOffset: ");
    }

    static protected void fixOffsetForShape(ContainerShape containerShape) {
        boolean active = containerShape.isActive();
        System.out.println("BEGIN FixOffset for shape: " + SprayLayoutService.getId(containerShape) + " active " + active);
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
        System.out.println("END FixOffset for shape");
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
            // System.out.println("NO OFFSET "
            // + EplLayoutService.getId(containerShape));
            return;
        }
        int xOffset = 0;
        int yOffset = 0;
        GraphicsAlgorithm ga = containerShape.getGraphicsAlgorithm();
        xOffset += ga.getX();
        yOffset += ga.getY();
        // System.out.println("OFFSET " + EplLayoutService.getId(containerShape)
        // + " is " + xOffset + ", " + yOffset);

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

}
