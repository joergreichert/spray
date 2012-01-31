package org.eclipselabs.spray.shapes.generator.connections;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator;
import org.eclipselabs.spray.shapes.shapes.CDEllipse;
import org.eclipselabs.spray.shapes.shapes.CDLine;
import org.eclipselabs.spray.shapes.shapes.CDPolygon;
import org.eclipselabs.spray.shapes.shapes.CDPolyline;
import org.eclipselabs.spray.shapes.shapes.CDRectangle;
import org.eclipselabs.spray.shapes.shapes.CDRoundedRectangle;
import org.eclipselabs.spray.shapes.shapes.CDText;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.LineLayout;
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.shapes.Point;
import org.eclipselabs.spray.shapes.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.shapes.ShapeConnection;
import org.eclipselabs.spray.shapes.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout;

@SuppressWarnings("all")
public class ConnectionPlacingGenerator {
  private int element_index;
  
  private int plcount;
  
  private int pcount;
  
  @Inject
  private ConnectionStyleGenerator styleGenerator;
  
  public CharSequence generatePlacing(final PlacingDefinition pd) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ConnectionDecorator decorator = peCreateService.createConnectionDecorator(newConnection, ");
    boolean _isActive = pd.isActive();
    _builder.append(_isActive, "	");
    _builder.append(", ");
    double _offset = pd.getOffset();
    _builder.append(_offset, "	");
    _builder.append(", true);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    ShapeConnection _shapeCon = pd.getShapeCon();
    int _angle = pd.getAngle();
    int _distance = pd.getDistance();
    CharSequence _createElement = this.createElement(_shapeCon, "decorator", "sprayStyle", Integer.valueOf(_angle), Integer.valueOf(_distance));
    _builder.append(_createElement, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _createElement(final CDLine element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      String _nextPointListName = this.nextPointListName();
      final String plname = _nextPointListName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
      StringConcatenation _builder = new StringConcatenation();
      LineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname, Integer.valueOf(x), Integer.valueOf(y));
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
      CharSequence _generateStyleForConnection = this.styleGenerator.generateStyleForConnection(attname, _layout_2);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDRectangle element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
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
      _builder.newLine();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _operator_plus = IntegerExtensions.operator_plus(_xcor, x);
      _builder.append(_operator_plus, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      int _operator_plus_1 = IntegerExtensions.operator_plus(_ycor, y);
      _builder.append(_operator_plus_1, "");
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
      CharSequence _generateStyleForConnection = this.styleGenerator.generateStyleForConnection(attname, _layout_5);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDPolygon element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      String _nextPointListName = this.nextPointListName();
      final String plname = _nextPointListName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname, Integer.valueOf(x), Integer.valueOf(y));
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
      CharSequence _generateStyleForConnection = this.styleGenerator.generateStyleForConnection(attname, _layout_2);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDPolyline element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      String _nextPointListName = this.nextPointListName();
      final String plname = _nextPointListName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname, Integer.valueOf(x), Integer.valueOf(y));
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
      CharSequence _generateStyleForConnection = this.styleGenerator.generateStyleForConnection(attname, _layout_2);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDRoundedRectangle element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
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
      int _operator_plus = IntegerExtensions.operator_plus(_xcor, x);
      _builder.append(_operator_plus, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_3 = element.getLayout();
      CommonLayout _common_1 = _layout_3.getCommon();
      int _ycor = _common_1.getYcor();
      int _operator_plus_1 = IntegerExtensions.operator_plus(_ycor, y);
      _builder.append(_operator_plus_1, "");
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
      CharSequence _generateStyleForConnection = this.styleGenerator.generateStyleForConnection(attname, _layout_7);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDEllipse element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
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
      int _operator_plus = IntegerExtensions.operator_plus(_xcor, x);
      _builder.append(_operator_plus, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      int _operator_plus_1 = IntegerExtensions.operator_plus(_ycor, y);
      _builder.append(_operator_plus_1, "");
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
      CharSequence _generateStyleForConnection = this.styleGenerator.generateStyleForConnection(attname, _layout_5);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDText element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      int _xPositionforAngle = this.getXPositionforAngle(distance, angle);
      int x = _xPositionforAngle;
      int _yPositionforAngle = this.getYPositionforAngle(distance, angle);
      int y = _yPositionforAngle;
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
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence createPointList(final EList<Point> pointlist, final String plname, final Integer x, final Integer y) {
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
        int _operator_plus = IntegerExtensions.operator_plus(_xcor, (x).intValue());
        _builder.append(_operator_plus, "");
        _builder.append(", ");
        int _ycor = point.getYcor();
        int _operator_plus_1 = IntegerExtensions.operator_plus(_ycor, (y).intValue());
        _builder.append(_operator_plus_1, "");
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
  
  public int getXPositionforAngle(final Integer distance, final Integer angle) {
    int _xifexpression = (int) 0;
    boolean _operator_or = false;
    boolean _operator_equals = IntegerExtensions.operator_equals((angle).intValue(), 90);
    if (_operator_equals) {
      _operator_or = true;
    } else {
      boolean _operator_equals_1 = IntegerExtensions.operator_equals((angle).intValue(), 270);
      _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
    }
    if (_operator_or) {
      _xifexpression = 0;
    } else {
      int _xifexpression_1 = (int) 0;
      boolean _operator_equals_2 = IntegerExtensions.operator_equals((angle).intValue(), 180);
      if (_operator_equals_2) {
        int _operator_minus = IntegerExtensions.operator_minus(distance);
        _xifexpression_1 = _operator_minus;
      } else {
        Integer _xifexpression_2 = null;
        boolean _operator_or_1 = false;
        boolean _operator_equals_3 = IntegerExtensions.operator_equals((angle).intValue(), 0);
        if (_operator_equals_3) {
          _operator_or_1 = true;
        } else {
          boolean _operator_greaterEqualsThan = IntegerExtensions.operator_greaterEqualsThan((angle).intValue(), 360);
          _operator_or_1 = BooleanExtensions.operator_or(_operator_equals_3, _operator_greaterEqualsThan);
        }
        if (_operator_or_1) {
          _xifexpression_2 = distance;
        } else {
          int _xifexpression_3 = (int) 0;
          boolean _operator_lessThan = IntegerExtensions.operator_lessThan((angle).intValue(), 90);
          if (_operator_lessThan) {
            int _xblockexpression = (int) 0;
            {
              double _radians = Math.toRadians((angle).intValue());
              double _cos = Math.cos(_radians);
              double _operator_multiply = DoubleExtensions.operator_multiply(_cos, (distance).intValue());
              int _intValue = Double.valueOf(_operator_multiply).intValue();
              int posx = _intValue;
              _xblockexpression = (posx);
            }
            _xifexpression_3 = _xblockexpression;
          } else {
            int _xifexpression_4 = (int) 0;
            boolean _operator_lessThan_1 = IntegerExtensions.operator_lessThan((angle).intValue(), 180);
            if (_operator_lessThan_1) {
              int _xblockexpression_1 = (int) 0;
              {
                int _operator_minus_1 = IntegerExtensions.operator_minus(180, (angle).intValue());
                int newangle = _operator_minus_1;
                double _radians_1 = Math.toRadians(newangle);
                double _cos_1 = Math.cos(_radians_1);
                double _operator_multiply_1 = DoubleExtensions.operator_multiply(_cos_1, (distance).intValue());
                int _intValue_1 = Double.valueOf(_operator_multiply_1).intValue();
                int posx_1 = _intValue_1;
                int _operator_minus_2 = IntegerExtensions.operator_minus(1);
                int _operator_multiply_2 = IntegerExtensions.operator_multiply(posx_1, _operator_minus_2);
                _xblockexpression_1 = (_operator_multiply_2);
              }
              _xifexpression_4 = _xblockexpression_1;
            } else {
              int _xifexpression_5 = (int) 0;
              boolean _operator_lessThan_2 = IntegerExtensions.operator_lessThan((angle).intValue(), 270);
              if (_operator_lessThan_2) {
                int _xblockexpression_2 = (int) 0;
                {
                  int _operator_minus_3 = IntegerExtensions.operator_minus((angle).intValue(), 180);
                  int newangle1 = _operator_minus_3;
                  double _radians_2 = Math.toRadians(newangle1);
                  double _cos_2 = Math.cos(_radians_2);
                  double _operator_multiply_3 = DoubleExtensions.operator_multiply(_cos_2, (distance).intValue());
                  int _intValue_2 = Double.valueOf(_operator_multiply_3).intValue();
                  int posx_2 = _intValue_2;
                  int _operator_minus_4 = IntegerExtensions.operator_minus(1);
                  int _operator_multiply_4 = IntegerExtensions.operator_multiply(posx_2, _operator_minus_4);
                  _xblockexpression_2 = (_operator_multiply_4);
                }
                _xifexpression_5 = _xblockexpression_2;
              } else {
                Integer _xifexpression_6 = null;
                boolean _operator_lessThan_3 = IntegerExtensions.operator_lessThan((angle).intValue(), 360);
                if (_operator_lessThan_3) {
                  int _xblockexpression_3 = (int) 0;
                  {
                    int _operator_minus_5 = IntegerExtensions.operator_minus(360, (angle).intValue());
                    int newangle_1 = _operator_minus_5;
                    double _radians_3 = Math.toRadians(newangle_1);
                    double _cos_3 = Math.cos(_radians_3);
                    double _operator_multiply_5 = DoubleExtensions.operator_multiply(_cos_3, (distance).intValue());
                    int _intValue_3 = Double.valueOf(_operator_multiply_5).intValue();
                    int posx_3 = _intValue_3;
                    _xblockexpression_3 = (posx_3);
                  }
                  _xifexpression_6 = _xblockexpression_3;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public int getYPositionforAngle(final Integer distance, final Integer angle) {
    int _xifexpression = (int) 0;
    boolean _operator_equals = IntegerExtensions.operator_equals((angle).intValue(), 90);
    if (_operator_equals) {
      int _operator_minus = IntegerExtensions.operator_minus(distance);
      _xifexpression = _operator_minus;
    } else {
      int _xifexpression_1 = (int) 0;
      boolean _operator_or = false;
      boolean _operator_or_1 = false;
      boolean _operator_equals_1 = IntegerExtensions.operator_equals((angle).intValue(), 0);
      if (_operator_equals_1) {
        _operator_or_1 = true;
      } else {
        boolean _operator_equals_2 = IntegerExtensions.operator_equals((angle).intValue(), 180);
        _operator_or_1 = BooleanExtensions.operator_or(_operator_equals_1, _operator_equals_2);
      }
      if (_operator_or_1) {
        _operator_or = true;
      } else {
        boolean _operator_greaterEqualsThan = IntegerExtensions.operator_greaterEqualsThan((angle).intValue(), 360);
        _operator_or = BooleanExtensions.operator_or(_operator_or_1, _operator_greaterEqualsThan);
      }
      if (_operator_or) {
        _xifexpression_1 = 0;
      } else {
        Integer _xifexpression_2 = null;
        boolean _operator_equals_3 = IntegerExtensions.operator_equals((angle).intValue(), 270);
        if (_operator_equals_3) {
          _xifexpression_2 = distance;
        } else {
          int _xifexpression_3 = (int) 0;
          boolean _operator_lessThan = IntegerExtensions.operator_lessThan((angle).intValue(), 90);
          if (_operator_lessThan) {
            int _xblockexpression = (int) 0;
            {
              double _radians = Math.toRadians((angle).intValue());
              double _sin = Math.sin(_radians);
              double _operator_multiply = DoubleExtensions.operator_multiply(_sin, (distance).intValue());
              int _intValue = Double.valueOf(_operator_multiply).intValue();
              int posy = _intValue;
              int _operator_minus_1 = IntegerExtensions.operator_minus(1);
              int _operator_multiply_1 = IntegerExtensions.operator_multiply(posy, _operator_minus_1);
              _xblockexpression = (_operator_multiply_1);
            }
            _xifexpression_3 = _xblockexpression;
          } else {
            int _xifexpression_4 = (int) 0;
            boolean _operator_lessThan_1 = IntegerExtensions.operator_lessThan((angle).intValue(), 180);
            if (_operator_lessThan_1) {
              int _xblockexpression_1 = (int) 0;
              {
                int _operator_minus_2 = IntegerExtensions.operator_minus(180, (angle).intValue());
                int newangle = _operator_minus_2;
                double _radians_1 = Math.toRadians(newangle);
                double _sin_1 = Math.sin(_radians_1);
                double _operator_multiply_2 = DoubleExtensions.operator_multiply(_sin_1, (distance).intValue());
                int _intValue_1 = Double.valueOf(_operator_multiply_2).intValue();
                int posy_1 = _intValue_1;
                int _operator_minus_3 = IntegerExtensions.operator_minus(1);
                int _operator_multiply_3 = IntegerExtensions.operator_multiply(posy_1, _operator_minus_3);
                _xblockexpression_1 = (_operator_multiply_3);
              }
              _xifexpression_4 = _xblockexpression_1;
            } else {
              int _xifexpression_5 = (int) 0;
              boolean _operator_lessThan_2 = IntegerExtensions.operator_lessThan((angle).intValue(), 270);
              if (_operator_lessThan_2) {
                int _xblockexpression_2 = (int) 0;
                {
                  int _operator_minus_4 = IntegerExtensions.operator_minus((angle).intValue(), 180);
                  int newangle1 = _operator_minus_4;
                  double _radians_2 = Math.toRadians(newangle1);
                  double _sin_2 = Math.sin(_radians_2);
                  double _operator_multiply_4 = DoubleExtensions.operator_multiply(_sin_2, (distance).intValue());
                  int _intValue_2 = Double.valueOf(_operator_multiply_4).intValue();
                  int posy_2 = _intValue_2;
                  _xblockexpression_2 = (posy_2);
                }
                _xifexpression_5 = _xblockexpression_2;
              } else {
                Integer _xifexpression_6 = null;
                boolean _operator_lessThan_3 = IntegerExtensions.operator_lessThan((angle).intValue(), 360);
                if (_operator_lessThan_3) {
                  int _xblockexpression_3 = (int) 0;
                  {
                    int _operator_minus_5 = IntegerExtensions.operator_minus(360, (angle).intValue());
                    int newangle_1 = _operator_minus_5;
                    double _radians_3 = Math.toRadians(newangle_1);
                    double _sin_3 = Math.sin(_radians_3);
                    double _operator_multiply_5 = DoubleExtensions.operator_multiply(_sin_3, (distance).intValue());
                    int _intValue_3 = Double.valueOf(_operator_multiply_5).intValue();
                    int posy_3 = _intValue_3;
                    _xblockexpression_3 = (posy_3);
                  }
                  _xifexpression_6 = _xblockexpression_3;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence createElement(final ShapeConnection element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    if (element instanceof CDEllipse) {
      return _createElement((CDEllipse)element, parentName, shapeStyle, angle, distance);
    } else if (element instanceof CDLine) {
      return _createElement((CDLine)element, parentName, shapeStyle, angle, distance);
    } else if (element instanceof CDPolygon) {
      return _createElement((CDPolygon)element, parentName, shapeStyle, angle, distance);
    } else if (element instanceof CDPolyline) {
      return _createElement((CDPolyline)element, parentName, shapeStyle, angle, distance);
    } else if (element instanceof CDRectangle) {
      return _createElement((CDRectangle)element, parentName, shapeStyle, angle, distance);
    } else if (element instanceof CDRoundedRectangle) {
      return _createElement((CDRoundedRectangle)element, parentName, shapeStyle, angle, distance);
    } else if (element instanceof CDText) {
      return _createElement((CDText)element, parentName, shapeStyle, angle, distance);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, parentName, shapeStyle, angle, distance).toString());
    }
  }
}
