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
package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * A special layout manager for single non container shapes
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class SprayShapeLayoutManager implements ISprayLayoutManager {

    static final private int MARGIN = 5;
    private Shape            shape;

    public SprayShapeLayoutManager(Shape shape) {
        this.shape = shape;
    }

    @Override
    public boolean isFlexible() {
        return false;
    }

    @Override
    public void layout() {
        SprayAbstractLayoutManager.level++;
        SprayAbstractLayoutManager.debug("ShapeLayoutManager.layout() " + SprayLayoutService.getId(shape) + "  " + shape.getGraphicsAlgorithm().toString());

        SprayLayoutData data = SprayLayoutService.getLayoutData(shape);
        GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
        if (data.isVisible()) {
            if (ga instanceof MultiText) {
            	// http://www.eclipse.org/forums/index.php/mv/msg/203421/658899/#msg_658899
                int width = 10;
                int height = 10;
                MultiText text = (MultiText) ga;
                IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(text.getValue(), getFont(text));
                if (dim == null) {
                    width = data.getMinimumWidth();
                    height = data.getMinimumHeight();
                } else {
                	String value = text.getValue();
                	int textHeight = dim.getHeight();
                	int currentWidth = data.getMinimumWidth();
                	int currentHeight = data.getMinimumHeight();
                	int maxCharsPerLine = Math.round((currentHeight / 15) * ((12 * currentWidth) / 90 ));
                	int valueLength = value.length();
                	int rowCount = Math.round(valueLength / maxCharsPerLine);
                    width = data.getMinimumWidth();
                    height = rowCount * textHeight;
                }
                width = data.getMinimumWidth();
                height = data.getMinimumHeight();
                int newWidth = width + (2 * MARGIN);
                int newHeight = height + (2 * MARGIN);
                layoutService.setSize(ga, newWidth, newHeight);
            } else if (ga instanceof Text) {
                int width = 10;
                int height = 10;
                Text text = (Text) ga;
                IDimension dim = GraphitiUi.getUiLayoutService().calculateTextSize(text.getValue(), getFont(text));
                if (dim == null) {
                    width = data.getMinimumWidth();
                    height = data.getMinimumHeight();
                } else {
                    width = Math.max(dim.getWidth(), data.getMinimumWidth());
                    height = dim.getHeight();
                }
                int newWidth = width + (2 * MARGIN);
                layoutService.setSize(ga, newWidth, height + 2 * MARGIN);
            } else if (ga instanceof Polyline) {
                Polyline pl = (Polyline) ga;
                IDimension dim = layoutService.calculateSize(pl);
                SprayAbstractLayoutManager.debug("ShapeLayout PolyLine");
                layoutService.setSize(ga, dim.getWidth(), (dim.getHeight() < 1 ? 4 : dim.getHeight()));
            } else if (ga instanceof Polygon) {
                Polygon pl = (Polygon) ga;
                IDimension dim = layoutService.calculateSize(pl);
                SprayAbstractLayoutManager.debug("ShapeLayout Polygon");
                layoutService.setSize(ga, dim.getWidth(), (dim.getHeight() < 1 ? 4 : dim.getHeight()));
            } else if (ga instanceof Rectangle || ga instanceof RoundedRectangle || ga instanceof Ellipse) {
                layoutService.calculateSize(ga);
                layoutService.setSize(ga, data.getMinimumWidth(), data.getMinimumHeight());
            }
        } else {
            layoutService.setSize(shape.getGraphicsAlgorithm(), 0, 0);
        }
        SprayAbstractLayoutManager.level--;
    }

    protected Font getFont(AbstractText text) {
        if (text.getFont() != null) {
            return text.getFont();
        } else if (text.getStyle() != null) {
            return text.getStyle().getFont();
        } else {
            return null;
        }
    }

    @Override
    public int getMargin() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setMargin(int margin) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getSpacing() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setSpacing(int spacing) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAlignment(SprayAlignment alignment) {
        // TODO Auto-generated method stub

    }

    @Override
    public SprayAlignment getAlignment() {
        // TODO Auto-generated method stub
        return null;
    }
}
