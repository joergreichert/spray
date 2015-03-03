/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.shapes.generator.util;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.Ellipse;
import org.eclipselabs.spray.shapes.Line;
import org.eclipselabs.spray.shapes.LineLayout;
import org.eclipselabs.spray.shapes.Point;
import org.eclipselabs.spray.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.Polygon;
import org.eclipselabs.spray.shapes.Polyline;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.Text;
import org.eclipselabs.spray.shapes.TextLayout;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;

@SuppressWarnings("all")
public class ShapeSizeCalculator {
  public ShapeSizeWrapper getContainerSize(final ShapeDefinition s) {
    int width = 0;
    int height = 0;
    EList<Shape> _shape = s.getShape();
    for (final Shape element : _shape) {
      {
        ShapeSizeWrapper elementSize = this.getSize(element);
        int _width = elementSize.getWidth();
        int _max = Math.max(width, _width);
        width = _max;
        int _heigth = elementSize.getHeigth();
        int _max_1 = Math.max(height, _heigth);
        height = _max_1;
      }
    }
    ShapeSizeWrapper size = new ShapeSizeWrapper(width, height);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final Line element) {
    int maxX = 0;
    int maxY = 0;
    LineLayout _layout = element.getLayout();
    EList<Point> _point = _layout.getPoint();
    for (final Point point : _point) {
      {
        int _xcor = point.getXcor();
        int _max = Math.max(maxX, _xcor);
        maxX = _max;
        int _ycor = point.getYcor();
        int _max_1 = Math.max(maxY, _ycor);
        maxY = _max_1;
      }
    }
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final Rectangle element) {
    int maxX = 0;
    int maxY = 0;
    RectangleEllipseLayout _layout = element.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _width = _common.getWidth();
    RectangleEllipseLayout _layout_1 = element.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _xcor = _common_1.getXcor();
    int _plus = (_width + _xcor);
    maxX = _plus;
    RectangleEllipseLayout _layout_2 = element.getLayout();
    CommonLayout _common_2 = _layout_2.getCommon();
    int _heigth = _common_2.getHeigth();
    RectangleEllipseLayout _layout_3 = element.getLayout();
    CommonLayout _common_3 = _layout_3.getCommon();
    int _ycor = _common_3.getYcor();
    int _plus_1 = (_heigth + _ycor);
    maxY = _plus_1;
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final Polygon element) {
    int maxX = 0;
    int maxY = 0;
    PolyLineLayout _layout = element.getLayout();
    EList<Point> _point = _layout.getPoint();
    for (final Point point : _point) {
      {
        int _xcor = point.getXcor();
        int _max = Math.max(maxX, _xcor);
        maxX = _max;
        int _ycor = point.getYcor();
        int _max_1 = Math.max(maxY, _ycor);
        maxY = _max_1;
      }
    }
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final Polyline element) {
    int maxX = 0;
    int maxY = 0;
    PolyLineLayout _layout = element.getLayout();
    EList<Point> _point = _layout.getPoint();
    for (final Point point : _point) {
      {
        int _xcor = point.getXcor();
        int _max = Math.max(maxX, _xcor);
        maxX = _max;
        int _ycor = point.getYcor();
        int _max_1 = Math.max(maxY, _ycor);
        maxY = _max_1;
      }
    }
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final RoundedRectangle element) {
    int maxX = 0;
    int maxY = 0;
    RoundedRectangleLayout _layout = element.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _width = _common.getWidth();
    RoundedRectangleLayout _layout_1 = element.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _xcor = _common_1.getXcor();
    int _plus = (_width + _xcor);
    maxX = _plus;
    RoundedRectangleLayout _layout_2 = element.getLayout();
    CommonLayout _common_2 = _layout_2.getCommon();
    int _heigth = _common_2.getHeigth();
    RoundedRectangleLayout _layout_3 = element.getLayout();
    CommonLayout _common_3 = _layout_3.getCommon();
    int _ycor = _common_3.getYcor();
    int _plus_1 = (_heigth + _ycor);
    maxY = _plus_1;
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final Ellipse element) {
    int maxX = 0;
    int maxY = 0;
    RectangleEllipseLayout _layout = element.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _width = _common.getWidth();
    RectangleEllipseLayout _layout_1 = element.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _xcor = _common_1.getXcor();
    int _plus = (_width + _xcor);
    maxX = _plus;
    RectangleEllipseLayout _layout_2 = element.getLayout();
    CommonLayout _common_2 = _layout_2.getCommon();
    int _heigth = _common_2.getHeigth();
    RectangleEllipseLayout _layout_3 = element.getLayout();
    CommonLayout _common_3 = _layout_3.getCommon();
    int _ycor = _common_3.getYcor();
    int _plus_1 = (_heigth + _ycor);
    maxY = _plus_1;
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  protected ShapeSizeWrapper _getSize(final Text element) {
    int maxX = 0;
    int maxY = 0;
    TextLayout _layout = element.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _width = _common.getWidth();
    TextLayout _layout_1 = element.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _xcor = _common_1.getXcor();
    int _plus = (_width + _xcor);
    maxX = _plus;
    TextLayout _layout_2 = element.getLayout();
    CommonLayout _common_2 = _layout_2.getCommon();
    int _heigth = _common_2.getHeigth();
    TextLayout _layout_3 = element.getLayout();
    CommonLayout _common_3 = _layout_3.getCommon();
    int _ycor = _common_3.getYcor();
    int _plus_1 = (_heigth + _ycor);
    maxY = _plus_1;
    ShapeSizeWrapper size = new ShapeSizeWrapper(maxX, maxY);
    return size;
  }
  
  public ShapeSizeWrapper getSize(final Shape element) {
    if (element instanceof Ellipse) {
      return _getSize((Ellipse)element);
    } else if (element instanceof Line) {
      return _getSize((Line)element);
    } else if (element instanceof Polygon) {
      return _getSize((Polygon)element);
    } else if (element instanceof Polyline) {
      return _getSize((Polyline)element);
    } else if (element instanceof Rectangle) {
      return _getSize((Rectangle)element);
    } else if (element instanceof RoundedRectangle) {
      return _getSize((RoundedRectangle)element);
    } else if (element instanceof Text) {
      return _getSize((Text)element);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element).toString());
    }
  }
}
