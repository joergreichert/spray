package org.eclipselabs.spray.shapes.generator.shapes;

import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.LineLayout;
import org.eclipselabs.spray.shapes.shapes.Point;
import org.eclipselabs.spray.shapes.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.shapes.Polygon;
import org.eclipselabs.spray.shapes.shapes.Polyline;
import org.eclipselabs.spray.shapes.shapes.Rectangle;
import org.eclipselabs.spray.shapes.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.shapes.Shape;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.Text;

@SuppressWarnings("all")
public class ShapeSizeCalculator {
  public HashMap<String,Integer> getContainerSize(final ShapeDefinition s) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
      int width = 0;
      int height = 0;
      EList<Shape> _shape = s.getShape();
      for (final Shape element : _shape) {
        {
          HashMap<String,Integer> _size = this.getSize(element);
          HashMap<String,Integer> elementSize = _size;
          Integer _get = elementSize.get("width");
          int _max = Math.max(width, (_get).intValue());
          width = _max;
          Integer _get_1 = elementSize.get("height");
          int _max_1 = Math.max(height, (_get_1).intValue());
          height = _max_1;
        }
      }
      sizeMap.put("width", Integer.valueOf(width));
      sizeMap.put("height", Integer.valueOf(height));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final Line element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
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
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final Rectangle element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
      int maxX = 0;
      int maxY = 0;
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _width = _common.getWidth();
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _xcor = _common_1.getXcor();
      int _operator_plus = IntegerExtensions.operator_plus(_width, _xcor);
      maxX = _operator_plus;
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _heigth = _common_2.getHeigth();
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      int _operator_plus_1 = IntegerExtensions.operator_plus(_heigth, _ycor);
      maxY = _operator_plus_1;
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final Polygon element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
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
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final Polyline element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
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
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final RoundedRectangle element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
      int maxX = 0;
      int maxY = 0;
      RoundedRectangleLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _width = _common.getWidth();
      RoundedRectangleLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _xcor = _common_1.getXcor();
      int _operator_plus = IntegerExtensions.operator_plus(_width, _xcor);
      maxX = _operator_plus;
      RoundedRectangleLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _heigth = _common_2.getHeigth();
      RoundedRectangleLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      int _operator_plus_1 = IntegerExtensions.operator_plus(_heigth, _ycor);
      maxY = _operator_plus_1;
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final Ellipse element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
      int maxX = 0;
      int maxY = 0;
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _width = _common.getWidth();
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _xcor = _common_1.getXcor();
      int _operator_plus = IntegerExtensions.operator_plus(_width, _xcor);
      maxX = _operator_plus;
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _heigth = _common_2.getHeigth();
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      int _operator_plus_1 = IntegerExtensions.operator_plus(_heigth, _ycor);
      maxY = _operator_plus_1;
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  protected HashMap<String,Integer> _getSize(final Text element) {
      HashMap<String,Integer> _hashMap = new HashMap<String,Integer>();
      HashMap<String,Integer> sizeMap = _hashMap;
      int maxX = 0;
      int maxY = 0;
      sizeMap.put("width", Integer.valueOf(maxX));
      sizeMap.put("height", Integer.valueOf(maxY));
      return sizeMap;
  }
  
  public HashMap<String,Integer> getSize(final Shape element) {
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
