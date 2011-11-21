package org.eclipselabs.spray.runtime.graphiti.containers;

public class PmwPropertySpecContainer extends SprayRectangleContainer {

    public PmwPropertySpecContainer() {
        super();
        setCornerHeight(30);
        setCornerWidth(30);
        layout = new SprayLayout(ISprayColorConstants.BLACK, ISprayColorConstants.PROPERTYSPEC, 1);
        setLayout(layout);

    }
}
