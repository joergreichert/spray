package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;

public class SprayLayoutData {
    public enum Alignment {
        BEGINNING,
        CENTER,
        END,
        FILL;
    };

    private Shape shape;

    public SprayLayoutData(Shape shape) {
        this.shape = shape;
    }

    public boolean isVisible() {
        return GraphitiProperties.getBooleanValue(shape, SprayLayoutService.LAYOUT_VISIBLE);
    }

    public void setVisible(boolean value) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_VISIBLE, value);
    }

    public int getMinimumWidth() {
        return GraphitiProperties.getIntValue(shape, SprayLayoutService.LAYOUT_MIN_WIDTH);
    }

    public void setMinimumWidth(int value) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_MIN_WIDTH, value);
    }

    public int getMinimumHeight() {
        return GraphitiProperties.getIntValue(shape, SprayLayoutService.LAYOUT_MIN_HEIGHT);
    }

    public void setMinimumHeight(int value) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_MIN_HEIGHT, value);
    }

    public boolean isHorizontalStretchable() {
        return !GraphitiProperties.getBooleanValue(shape, SprayLayoutService.LAYOUT_NOT_HORIZONTAL_STRETCHABLE);
    }

    public void setHorizontalStrechable(boolean value) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_NOT_HORIZONTAL_STRETCHABLE, !value);
    }

    public boolean isVerticalStretchable() {
        return !GraphitiProperties.getBooleanValue(shape, SprayLayoutService.LAYOUT_NOT_VERTICAL_STRETCHABLE);
    }

    public void setVerticalStrechable(boolean value) {
        GraphitiProperties.set(shape, SprayLayoutService.LAYOUT_NOT_VERTICAL_STRETCHABLE, !value);
    }
}
