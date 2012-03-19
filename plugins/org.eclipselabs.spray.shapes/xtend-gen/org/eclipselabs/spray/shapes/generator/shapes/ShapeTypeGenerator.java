package org.eclipselabs.spray.shapes.generator.shapes;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeStyleGenerator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.HAlign;
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
import org.eclipselabs.spray.shapes.shapes.TextBody;
import org.eclipselabs.spray.shapes.shapes.TextBodyParameter;
import org.eclipselabs.spray.shapes.shapes.TextBodyString;
import org.eclipselabs.spray.shapes.shapes.TextBodyValue;
import org.eclipselabs.spray.shapes.shapes.TextLayout;
import org.eclipselabs.spray.shapes.shapes.TextType;
import org.eclipselabs.spray.shapes.shapes.VAlign;

@SuppressWarnings("all")
public class ShapeTypeGenerator {
  @Inject
  private ShapeTypeStyleGenerator styleGenerator;
  
  @Inject
  private ShapeSizeCalculator sizeCalculator;
  
  private int element_index;
  
  private int plcount;
  
  public CharSequence generateCascadedElements(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      this.element_index = 0;
      this.plcount = 0;
      ShapeSizeWrapper _containerSize = this.sizeCalculator.getContainerSize(s);
      ShapeSizeWrapper sizeMap = _containerSize;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("// Create a Invisible Rectangle Around the Elements");
      _builder.newLine();
      _builder.append("GraphicsAlgorithm invisibleRectangle = gaService.createInvisibleRectangle(pictogramElement);");
      _builder.newLine();
      _builder.append("invisibleRectangle.setStyle(sprayStyle.getStyle(diagram));");
      _builder.newLine();
      _builder.append("invisibleRectangle.setWidth(");
      int _width = sizeMap.getWidth();
      _builder.append(_width, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("invisibleRectangle.setHeight(");
      int _heigth = sizeMap.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("ISprayStyle style_");
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
        CharSequence _createElement = this.createElement(element, attname, shapeStyle);
        _builder.append(_createElement, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createPointList(final EList<Point> pointlist, final String plname) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("List<Point> ");
    _builder.append(plname, "");
    _builder.append(" = new ArrayList<Point>();");
    _builder.newLineIfNotEmpty();
    {
      for(final Point point : pointlist) {
        _builder.append(plname, "");
        _builder.append(".add(gaService.createPoint(");
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
        _builder.append("));");
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
      final String pointListName = _nextPointListName;
      StringConcatenation _builder = new StringConcatenation();
      LineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, pointListName);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(pointListName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
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
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
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
      final String pointListName = _nextPointListName;
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, pointListName);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Polygon ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolygon(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(pointListName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
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
      final String pointListName = _nextPointListName;
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, pointListName);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(pointListName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
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
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
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
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
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
  
  protected CharSequence _createElement(final Text element, final String parentName, final String shapeStyle) {
    CharSequence _xblockexpression = null;
    {
      String _nextAttributeName = this.nextAttributeName();
      final String attname = _nextAttributeName;
      StringConcatenation _builder = new StringConcatenation();
      {
        TextType _texttype = element.getTexttype();
        boolean _operator_equals = ObjectExtensions.operator_equals(_texttype, TextType.DEFAULT);
        if (_operator_equals) {
          _builder.append("Text ");
          _builder.append(attname, "");
          _builder.append(" = gaService.createText(");
          _builder.append(parentName, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("MultiText ");
          _builder.append(attname, "");
          _builder.append(" = gaService.createMultiText(");
          _builder.append(parentName, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("ISprayStyle style_");
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
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setForeground(style_");
      _builder.append(this.element_index, "");
      _builder.append(".getFontColor(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      TextLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      _builder.append(_xcor, "");
      _builder.append(", ");
      TextLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      _builder.append(_ycor, "");
      _builder.append(", ");
      TextLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _width = _common_2.getWidth();
      _builder.append(_width, "");
      _builder.append(", ");
      TextLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _heigth = _common_3.getHeigth();
      _builder.append(_heigth, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setHorizontalAlignment(Orientation.");
      TextLayout _layout_4 = element.getLayout();
      HAlign _hAlign = _layout_4.getHAlign();
      String _mapAlignment = this.mapAlignment(_hAlign);
      _builder.append(_mapAlignment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setVerticalAlignment(Orientation.");
      TextLayout _layout_5 = element.getLayout();
      VAlign _vAlign = _layout_5.getVAlign();
      String _mapAlignment_1 = this.mapAlignment(_vAlign);
      _builder.append(_mapAlignment_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setValue(");
      TextBody _body = element.getBody();
      TextBodyValue _value = _body.getValue();
      CharSequence _bodyForText = this.bodyForText(_value);
      _builder.append(_bodyForText, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      TextLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForElement = this.styleGenerator.generateStyleForElement(attname, _layout_7);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public String mapAlignment(final VAlign align) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(align,VAlign.MIDDLE)) {
        matched=true;
        _switchResult = "ALIGNMENT_MIDDLE";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(align,VAlign.BOTTOM)) {
        matched=true;
        _switchResult = "ALIGNMENT_BOTTOM";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(align,VAlign.TOP)) {
        matched=true;
        _switchResult = "ALIGNMENT_TOP";
      }
    }
    return _switchResult;
  }
  
  public String mapAlignment(final HAlign align) {
    String _switchResult = null;
    boolean matched = false;
    if (!matched) {
      if (ObjectExtensions.operator_equals(align,HAlign.CENTER)) {
        matched=true;
        _switchResult = "ALIGNMENT_CENTER";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(align,HAlign.LEFT)) {
        matched=true;
        _switchResult = "ALIGNMENT_LEFT";
      }
    }
    if (!matched) {
      if (ObjectExtensions.operator_equals(align,HAlign.RIGHT)) {
        matched=true;
        _switchResult = "ALIGNMENT_RIGHT";
      }
    }
    return _switchResult;
  }
  
  protected CharSequence _bodyForText(final TextBodyString body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _param = body.getParam();
    _builder.append(_param, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _bodyForText(final TextBodyParameter body) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(get");
    JvmIdentifiableElement _param = body.getParam();
    String _simpleName = _param.getSimpleName();
    String _firstUpper = StringExtensions.toFirstUpper(_simpleName);
    _builder.append(_firstUpper, "");
    _builder.append("() == null)? \"\" : get");
    JvmIdentifiableElement _param_1 = body.getParam();
    String _simpleName_1 = _param_1.getSimpleName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_simpleName_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("().toString()");
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
      _builder.append("()");
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
  
  public CharSequence bodyForText(final TextBodyValue body) {
    if (body instanceof TextBodyParameter) {
      return _bodyForText((TextBodyParameter)body);
    } else if (body instanceof TextBodyString) {
      return _bodyForText((TextBodyString)body);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(body).toString());
    }
  }
}
