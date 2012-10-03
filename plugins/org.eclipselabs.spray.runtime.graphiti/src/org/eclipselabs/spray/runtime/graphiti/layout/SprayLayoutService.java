package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutData.Alignment;

public class SprayLayoutService {
    public enum SprayAlignment {
        NONE,
        START,
        MIDDLE,
        END,
        FILL;
    };

    private SprayLayoutService() {
    }

    static final public String LAYOUT_TYPE                   = "L_TYPE";
    static final public String LAYOUT_SPACING                = "L_SPACING";
    static final public String LAYOUT_MARGIN                 = "L_MARGIN";
    static final public String LAYOUT_MIN_WIDTH              = "L_MINW";
    static final public String LAYOUT_MIN_HEIGHT             = "L_MINH";
    static final public String LAYOUT_VISIBLE                = "L_VIS";
    static final public String ID                            = "ID";
    public static final String LAYOUT_HORIZONTAL_STRETCHABLE = "L_H_STR";
    public static final String LAYOUT_VERTICAL_STRETCHABLE   = "L_V_STR";
    public static final String LAYOUT_ALIGNMENT              = "L_ALIGN";

    static private IPeService  peService                     = Graphiti.getPeService();

    static public String getId(Shape shape) {
        return (shape.isActive() ? "[A]" : "") + peService.getPropertyValue(shape, ID);
    }

    static public void setId(Shape shape, String id) {
        peService.setPropertyValue(shape, ID, id);
    }

    static public void setLayoutManager(Shape shape, SprayLayoutType type, int margin, int spacing, SprayAlignment alignment) {
        GraphitiProperties.set(shape, LAYOUT_TYPE, type.name());
        GraphitiProperties.set(shape, LAYOUT_SPACING, spacing);
        GraphitiProperties.set(shape, LAYOUT_MARGIN, margin);
        GraphitiProperties.set(shape, LAYOUT_ALIGNMENT, alignment);
    }

    static public void setLayoutManager(Shape shape, SprayLayoutType type, int margin, int spacing) {
        GraphitiProperties.set(shape, LAYOUT_TYPE, type.name());
        GraphitiProperties.set(shape, LAYOUT_SPACING, spacing);
        GraphitiProperties.set(shape, LAYOUT_MARGIN, margin);
    }

    static public void setLayoutManager(Shape shape, SprayLayoutType type) {
        GraphitiProperties.set(shape, LAYOUT_TYPE, type.name());
    }

    static public void setLayoutData(Shape shape, int minWidth, int minHeight, Alignment horizontalAlignment, Alignment verticalAlignment, boolean strechable) {
        GraphitiProperties.set(shape, LAYOUT_MIN_WIDTH, minWidth);
        GraphitiProperties.set(shape, LAYOUT_MIN_HEIGHT, minHeight);
        GraphitiProperties.set(shape, LAYOUT_HORIZONTAL_STRETCHABLE, strechable);
        GraphitiProperties.set(shape, LAYOUT_VISIBLE, true);
    }

    // static public void setLayoutData(Shape shape, int minWidth, int
    // minHeight,
    // Alignment horizontalAlignment, Alignment verticalAlignment) {
    // GraphitiProperties.set(shape, LAYOUT_MIN_WIDTH, minWidth);
    // GraphitiProperties.set(shape, LAYOUT_MIN_HEIGHT, minHeight);
    // GraphitiProperties.set(shape, LAYOUT_VISIBLE, true);
    // }

    static public void setLayoutData(Shape shape, int minWidth, int minHeight) {
        GraphitiProperties.set(shape, LAYOUT_MIN_WIDTH, minWidth);
        GraphitiProperties.set(shape, LAYOUT_MIN_HEIGHT, minHeight);
        GraphitiProperties.set(shape, LAYOUT_VISIBLE, true);
    }

    static public void setLayoutData(Shape shape, int minWidth, int minHeight, boolean strechable) {
        GraphitiProperties.set(shape, LAYOUT_MIN_WIDTH, minWidth);
        GraphitiProperties.set(shape, LAYOUT_MIN_HEIGHT, minHeight);
        GraphitiProperties.set(shape, LAYOUT_HORIZONTAL_STRETCHABLE, strechable);
        GraphitiProperties.set(shape, LAYOUT_VISIBLE, true);
    }

    static public SprayLayoutData getLayoutData(Shape shape) {
        return new SprayLayoutData(shape);
    }

    static private SprayLayoutType getLayoutType(Shape shape) {
        String type = peService.getPropertyValue(shape, LAYOUT_TYPE);
        if (type == null) {
            return SprayLayoutType.NONE;
        } else {
            try {
                return SprayLayoutType.valueOf(SprayLayoutType.class, type);
            } catch (IllegalArgumentException exception) {
                System.err.println("EplLayoutType property exception for name [" + type + "]");
                return SprayLayoutType.NONE;
            }
        }
    }

    /**
     * returns the layout manager for 'shape'
     * 
     * @param shape
     *            The shape for which the layout manager needs to be found, may
     *            not be null
     * @return
     */
    static public ISprayLayoutManager getLayoutManager(Shape shape) {
        if (shape instanceof Diagram) {
            return new SprayDiagramLayoutManager((Diagram) shape);
        } else if (shape instanceof ContainerShape) {
            return getContainerLayoutManager((ContainerShape) shape);
        } else {
            return new SprayShapeLayoutManager(shape);
        }
    }

    /**
     * returns the layout manager for 'shape'
     * 
     * @param shape
     *            The shape for which the layout manager needs to be found, may
     *            not be null
     * @return
     */
    static private SprayAbstractLayoutManager getContainerLayoutManager(ContainerShape shape) {
        SprayLayoutType type = getLayoutType(shape);
        switch (type) {
        case NONE:
            return new SprayFixedLayoutManager(shape);
        case HORIZONTAL:
            return new SprayHorizontalLayoutManager(shape);
        case VERTICAL:
            return new SprayVerticalLayoutManager(shape);
        case FIXED:
            return new SprayFixedLayoutManager(shape);
        default:
            return new SprayFixedLayoutManager(shape);
        }
    }

}
