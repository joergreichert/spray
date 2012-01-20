package org.eclipselabs.spray.shapes.generator.shapes;

import com.google.inject.Inject;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeStyleGenerator;
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
import org.eclipselabs.spray.shapes.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.shapes.Text;
import org.eclipselabs.spray.shapes.shapes.TextLayout;

@SuppressWarnings("all")
public class ShapeTypeGenerator {
  @Inject
  private ShapeTypeStyleGenerator styleGenerator;
  
  @Inject
  private ShapeSizeCalculator sizeCalculator;
  
  private int element_index;
  
  private int plcount;
  
  private int pcount;
  
  public CharSequence generateCascadedElements(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      this.element_index = 0;
      this.plcount = 0;
      this.pcount = 0;
      HashMap<String,Integer> _containerSize = this.sizeCalculator.getContainerSize(s);
      HashMap<String,Integer> sizeMap = _containerSize;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// Create a Invisible Rectangle Around the Elements");
      _builder.newLine();
      _builder.append("GraphicsAlgorithm invisibleRectangle = gaService.createInvisibleRectangle(pictogramElement);");
      _builder.newLine();
      _builder.append("invisibleRectangle.setWidth(");
      Integer _get = sizeMap.get("width");
      _builder.append(_get, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("invisibleRectangle.setHeight(");
      Integer _get_1 = sizeMap.get("height");
      _builder.append(_get_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = s.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, "sprayStyle");
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      {
        EList<Shape> _shape = s.getShape();
        for(final Shape element : _shape) {
          String _operator_plus = StringExtensions.operator_plus("style_", Integer.valueOf(this.element_index));
          CharSequence _createElement = this.createElement(element, "invisibleRectangle", _operator_plus);
          _builder.append(_createElement, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence recursiveCreation(final EList<Shape> shapeList, final String attname, final String shapeStyle) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Shape element : shapeList) {
        _builder.newLineIfNotEmpty();
        CharSequence _createElement = this.createElement(element, attname, shapeStyle);
        _builder.append(_createElement, "");
        _builder.newLineIfNotEmpty();
        _builder.append("      \t");
      }
    }
    return _builder;
  }
  
  public CharSequence createPointList(final EList<Point> pointlist, final String plname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Create a List of Points");
    _builder.newLine();
    _builder.append("List<Point> ");
    _builder.append(plname, "");
    _builder.append(" = new ArrayList<Point>();");
    _builder.newLineIfNotEmpty();
    {
      for(final Point point : pointlist) {
        String _nextPointName = this.nextPointName();
        String pname = _nextPointName;
        _builder.newLineIfNotEmpty();
        _builder.append("Point ");
        _builder.append(pname, "");
        _builder.append(" = gaService.createPoint(");
        int _xcor = point.getXcor();
        _builder.append(_xcor, "");
        _builder.append(", ");
        int _ycor = point.getYcor();
        _builder.append(_ycor, "");
        _builder.append(", ");
        int _curveBefore = point.getCurveBefore();
        _builder.append(_curveBefore, "");
        _builder.append(", ");
        int _curveAfter = point.getCurveAfter();
        _builder.append(_curveAfter, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append(plname, "");
        _builder.append(".add(");
        _builder.append(pname, "");
        _builder.append(");\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _createElement(final Line element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      String _nextPointListName = this.nextPointListName();
      final String plname = _nextPointListName;
      StringConcatenation _builder = new StringConcatenation();
      LineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      LineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_2);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Rectangle element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Rectangle ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createRectangle(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _width = _common_2.getWidth();
      _builder.append(_width, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _heigth = _common_3.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      RectangleEllipseLayout _layout_4 = element.getLayout();
      ShapestyleLayout _layout_5 = _layout_4.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_5);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _operator_plus = StringExtensions.operator_plus("style_", Integer.valueOf(this.element_index));
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, attname, _operator_plus);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Polygon element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      String _nextPointListName = this.nextPointListName();
      final String plname = _nextPointListName;
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Create Polygon with Points and curve");
      _builder.newLine();
      _builder.append("Polygon ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolygon(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      PolyLineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_2);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _operator_plus = StringExtensions.operator_plus("style_", Integer.valueOf(this.element_index));
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, attname, _operator_plus);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Polyline element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      String _nextPointListName = this.nextPointListName();
      final String plname = _nextPointListName;
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Create Polyline with Points and curve");
      _builder.newLine();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      PolyLineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_2);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final RoundedRectangle element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("RoundedRectangle ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createRoundedRectangle(");
      _builder.append(parentName, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout = element.getLayout();
      int _curveWidth = _layout.getCurveWidth();
      _builder.append(_curveWidth, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_1 = element.getLayout();
      int _curveHeight = _layout_1.getCurveHeight();
      _builder.append(_curveHeight, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_2 = element.getLayout();
      CommonLayout _common = _layout_2.getCommon();
      int _xcor = _common.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_3 = element.getLayout();
      CommonLayout _common_1 = _layout_3.getCommon();
      int _ycor = _common_1.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_4 = element.getLayout();
      CommonLayout _common_2 = _layout_4.getCommon();
      int _width = _common_2.getWidth();
      _builder.append(_width, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_5 = element.getLayout();
      CommonLayout _common_3 = _layout_5.getCommon();
      int _heigth = _common_3.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      RoundedRectangleLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_7);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _operator_plus = StringExtensions.operator_plus("style_", Integer.valueOf(this.element_index));
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, attname, _operator_plus);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Ellipse element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Ellipse ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createEllipse(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _width = _common_2.getWidth();
      _builder.append(_width, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _heigth = _common_3.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      RectangleEllipseLayout _layout_4 = element.getLayout();
      ShapestyleLayout _layout_5 = _layout_4.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_5);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      EList<Shape> _shape = element.getShape();
      String _operator_plus = StringExtensions.operator_plus("style_", Integer.valueOf(this.element_index));
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, attname, _operator_plus);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Text element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Text ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createText(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Style style_");
      _builder.append(this.element_index, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      CharSequence _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style_");
      _builder.append(this.element_index, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("// TODO: define position");
      _builder.newLine();
      _builder.newLine();
      _builder.append("//Set special Style information");
      _builder.newLine();
      TextLayout _layout = element.getLayout();
      ShapestyleLayout _layout_1 = _layout.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_1);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence styleForElement(final ShapeStyleRef s, final String styleName) {
    CharSequence _xifexpression = null;
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(s, null);
    if (_operator_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new ");
      JvmTypeReference _style = s.getStyle();
      String _qualifiedName = _style.getQualifiedName();
      _builder.append(_qualifiedName, "");
      _builder.append("().getStyle(diagram)");
      _xifexpression = _builder;
    } else {
      _xifexpression = styleName;
    }
    return _xifexpression;
  }
  
  public String nextAttributeName() {
    String _xblockexpression = null;
    {
      int _operator_plus = IntegerExtensions.operator_plus(this.element_index, 1);
      this.element_index = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("element_", Integer.valueOf(this.element_index));
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  public String nextPointListName() {
    String _xblockexpression = null;
    {
      int _operator_plus = IntegerExtensions.operator_plus(this.plcount, 1);
      this.plcount = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("pointList_", Integer.valueOf(this.plcount));
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  public String nextPointName() {
    String _xblockexpression = null;
    {
      int _operator_plus = IntegerExtensions.operator_plus(this.pcount, 1);
      this.pcount = _operator_plus;
      String _operator_plus_1 = StringExtensions.operator_plus("point_", Integer.valueOf(this.pcount));
      _xblockexpression = (_operator_plus_1);
    }
    return _xblockexpression;
  }
  
  public CharSequence createElement(final Shape element, final String parentName, final String shapeStyle) {
    if (element instanceof Ellipse) {
      return _createElement((Ellipse)element, parentName, shapeStyle);
    } else if (element instanceof Line) {
      return _createElement((Line)element, parentName, shapeStyle);
    } else if (element instanceof Polygon) {
      return _createElement((Polygon)element, parentName, shapeStyle);
    } else if (element instanceof Polyline) {
      return _createElement((Polyline)element, parentName, shapeStyle);
    } else if (element instanceof Rectangle) {
      return _createElement((Rectangle)element, parentName, shapeStyle);
    } else if (element instanceof RoundedRectangle) {
      return _createElement((RoundedRectangle)element, parentName, shapeStyle);
    } else if (element instanceof Text) {
      return _createElement((Text)element, parentName, shapeStyle);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, parentName, shapeStyle).toString());
    }
  }
}
