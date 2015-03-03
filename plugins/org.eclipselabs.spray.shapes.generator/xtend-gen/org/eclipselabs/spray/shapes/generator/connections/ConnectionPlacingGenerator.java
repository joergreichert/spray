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
package org.eclipselabs.spray.shapes.generator.connections;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.shapes.CDEllipse;
import org.eclipselabs.spray.shapes.CDLine;
import org.eclipselabs.spray.shapes.CDPolygon;
import org.eclipselabs.spray.shapes.CDPolyline;
import org.eclipselabs.spray.shapes.CDRectangle;
import org.eclipselabs.spray.shapes.CDRoundedRectangle;
import org.eclipselabs.spray.shapes.CDText;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.HAlign;
import org.eclipselabs.spray.shapes.LineLayout;
import org.eclipselabs.spray.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.Point;
import org.eclipselabs.spray.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.ShapeConnection;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.shapes.TextLayout;
import org.eclipselabs.spray.shapes.TextType;
import org.eclipselabs.spray.shapes.VAlign;
import org.eclipselabs.spray.shapes.generator.connections.ConnectionStyleGenerator;

@SuppressWarnings("all")
public class ConnectionPlacingGenerator {
  @Inject
  @Extension
  private ConnectionStyleGenerator _connectionStyleGenerator;
  
  private List<CharSequence> methods;
  
  private int decorator_index;
  
  public String packageName() {
    return ProjectProperties.getStylesPackage();
  }
  
  public CharSequence connectionDecoratorMethodName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("createConnectionDecorators");
    return _builder;
  }
  
  public CharSequence generateConnectionDecoratorMethods(final ConnectionDefinition cd) {
    CharSequence _xblockexpression = null;
    {
      this.decorator_index = 0;
      ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
      this.methods = _arrayList;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("protected void ");
      CharSequence _connectionDecoratorMethodName = this.connectionDecoratorMethodName();
      _builder.append(_connectionDecoratorMethodName, "");
      _builder.append("(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {");
      _builder.newLineIfNotEmpty();
      {
        EList<PlacingDefinition> _placing = cd.getPlacing();
        for(final PlacingDefinition place : _placing) {
          _builder.append("    ");
          CharSequence _generatePlacing = this.generatePlacing(place);
          _builder.append(_generatePlacing, "    ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      {
        for(final CharSequence method : this.methods) {
          _builder.append(method, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generatePlacing(final PlacingDefinition pd) {
    CharSequence _xblockexpression = null;
    {
      this.nextIndex();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("create");
      String _decoratorName = this.decoratorName();
      String _firstUpper = StringExtensions.toFirstUpper(_decoratorName);
      _builder.append(_firstUpper, "");
      String methodName = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("protected ConnectionDecorator ");
      _builder_1.append(methodName, "");
      _builder_1.append("(Diagram diagram, Connection connection, ISprayStyle sprayStyle) {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("ConnectionDecorator ");
      String _decoratorName_1 = this.decoratorName();
      _builder_1.append(_decoratorName_1, "\t");
      _builder_1.append(" = peCreateService.createConnectionDecorator(connection, false, ");
      double _offset = pd.getOffset();
      _builder_1.append(_offset, "\t");
      _builder_1.append(", true);");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      ShapeConnection _shapeCon = pd.getShapeCon();
      String _decoratorName_2 = this.decoratorName();
      int _angle = pd.getAngle();
      int _distance = pd.getDistance();
      CharSequence _createElement = this.createElement(_shapeCon, _decoratorName_2, "sprayStyle", Integer.valueOf(_angle), Integer.valueOf(_distance));
      _builder_1.append(_createElement, "\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("return ");
      String _decoratorName_3 = this.decoratorName();
      _builder_1.append(_decoratorName_3, "\t");
      _builder_1.append(";");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _builder_1.newLine();
      this.methods.add(_builder_1);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(methodName, "");
      _builder_2.append("(diagram, connection, sprayStyle);");
      _xblockexpression = _builder_2;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDLine element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      final String plname = "pointList";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      LineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname, x, y);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      LineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_2);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDRectangle element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      final String plname = "pointList";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("// As Graphiti doesn´t allow rectangles, creating rectangle as polygon");
      _builder.newLine();
      _builder.append("List<Point> ");
      _builder.append(plname, "");
      _builder.append(" = new ArrayList<Point>();");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _plus = ((x).intValue() + _xcor);
      _builder.append(_plus, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      int _plus_1 = ((y).intValue() + _ycor);
      _builder.append(_plus_1, "");
      _builder.append(", 0, 0));");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _xcor_1 = _common_2.getXcor();
      int _plus_2 = ((x).intValue() + _xcor_1);
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _width = _common_3.getWidth();
      int _plus_3 = (_plus_2 + _width);
      _builder.append(_plus_3, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_4 = element.getLayout();
      CommonLayout _common_4 = _layout_4.getCommon();
      int _ycor_1 = _common_4.getYcor();
      int _plus_4 = ((y).intValue() + _ycor_1);
      _builder.append(_plus_4, "");
      _builder.append(", 0, 0));");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RectangleEllipseLayout _layout_5 = element.getLayout();
      CommonLayout _common_5 = _layout_5.getCommon();
      int _xcor_2 = _common_5.getXcor();
      int _plus_5 = ((x).intValue() + _xcor_2);
      RectangleEllipseLayout _layout_6 = element.getLayout();
      CommonLayout _common_6 = _layout_6.getCommon();
      int _width_1 = _common_6.getWidth();
      int _plus_6 = (_plus_5 + _width_1);
      _builder.append(_plus_6, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_7 = element.getLayout();
      CommonLayout _common_7 = _layout_7.getCommon();
      int _ycor_2 = _common_7.getYcor();
      int _plus_7 = ((y).intValue() + _ycor_2);
      RectangleEllipseLayout _layout_8 = element.getLayout();
      CommonLayout _common_8 = _layout_8.getCommon();
      int _heigth = _common_8.getHeigth();
      int _plus_8 = (_plus_7 + _heigth);
      _builder.append(_plus_8, "");
      _builder.append(", 0, 0));");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RectangleEllipseLayout _layout_9 = element.getLayout();
      CommonLayout _common_9 = _layout_9.getCommon();
      int _xcor_3 = _common_9.getXcor();
      int _plus_9 = ((x).intValue() + _xcor_3);
      _builder.append(_plus_9, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_10 = element.getLayout();
      CommonLayout _common_10 = _layout_10.getCommon();
      int _ycor_3 = _common_10.getYcor();
      int _plus_10 = ((y).intValue() + _ycor_3);
      RectangleEllipseLayout _layout_11 = element.getLayout();
      CommonLayout _common_11 = _layout_11.getCommon();
      int _heigth_1 = _common_11.getHeigth();
      int _plus_11 = (_plus_10 + _heigth_1);
      _builder.append(_plus_11, "");
      _builder.append(", 0, 0));");
      _builder.newLineIfNotEmpty();
      _builder.append("Polygon ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolygon(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      RectangleEllipseLayout _layout_12 = element.getLayout();
      ShapestyleLayout _layout_13 = _layout_12.getLayout();
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_13);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDPolygon element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      final String plname = "pointList";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname, x, y);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Polygon ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolygon(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      PolyLineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_2);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDPolyline element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      final String plname = "pointList";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      CharSequence _createPointList = this.createPointList(_point, plname, x, y);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Polyline ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolyline(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      PolyLineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_2);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDRoundedRectangle element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      final String plname = "pointList";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("{");
      _builder.newLine();
      _builder.append("// As Graphiti doesn´t allow rectangles, creating rounded rectangle as curved polygon");
      _builder.newLine();
      _builder.append("List<Point> ");
      _builder.append(plname, "");
      _builder.append(" = new ArrayList<Point>();");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RoundedRectangleLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _plus = ((x).intValue() + _xcor);
      _builder.append(_plus, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      int _plus_1 = ((y).intValue() + _ycor);
      _builder.append(_plus_1, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_2 = element.getLayout();
      int _curveHeight = _layout_2.getCurveHeight();
      _builder.append(_curveHeight, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_3 = element.getLayout();
      int _curveWidth = _layout_3.getCurveWidth();
      _builder.append(_curveWidth, "");
      _builder.append("));");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RoundedRectangleLayout _layout_4 = element.getLayout();
      CommonLayout _common_2 = _layout_4.getCommon();
      int _xcor_1 = _common_2.getXcor();
      int _plus_2 = ((x).intValue() + _xcor_1);
      RoundedRectangleLayout _layout_5 = element.getLayout();
      CommonLayout _common_3 = _layout_5.getCommon();
      int _width = _common_3.getWidth();
      int _plus_3 = (_plus_2 + _width);
      _builder.append(_plus_3, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_6 = element.getLayout();
      CommonLayout _common_4 = _layout_6.getCommon();
      int _ycor_1 = _common_4.getYcor();
      int _plus_4 = ((y).intValue() + _ycor_1);
      _builder.append(_plus_4, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_7 = element.getLayout();
      int _curveWidth_1 = _layout_7.getCurveWidth();
      _builder.append(_curveWidth_1, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_8 = element.getLayout();
      int _curveHeight_1 = _layout_8.getCurveHeight();
      _builder.append(_curveHeight_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RoundedRectangleLayout _layout_9 = element.getLayout();
      CommonLayout _common_5 = _layout_9.getCommon();
      int _xcor_2 = _common_5.getXcor();
      int _plus_5 = ((x).intValue() + _xcor_2);
      RoundedRectangleLayout _layout_10 = element.getLayout();
      CommonLayout _common_6 = _layout_10.getCommon();
      int _width_1 = _common_6.getWidth();
      int _plus_6 = (_plus_5 + _width_1);
      _builder.append(_plus_6, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_11 = element.getLayout();
      CommonLayout _common_7 = _layout_11.getCommon();
      int _ycor_2 = _common_7.getYcor();
      int _plus_7 = ((y).intValue() + _ycor_2);
      RoundedRectangleLayout _layout_12 = element.getLayout();
      CommonLayout _common_8 = _layout_12.getCommon();
      int _heigth = _common_8.getHeigth();
      int _plus_8 = (_plus_7 + _heigth);
      _builder.append(_plus_8, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_13 = element.getLayout();
      int _curveHeight_2 = _layout_13.getCurveHeight();
      _builder.append(_curveHeight_2, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_14 = element.getLayout();
      int _curveWidth_2 = _layout_14.getCurveWidth();
      _builder.append(_curveWidth_2, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(plname, "");
      _builder.append(".add(gaService.createPoint(");
      RoundedRectangleLayout _layout_15 = element.getLayout();
      CommonLayout _common_9 = _layout_15.getCommon();
      int _xcor_3 = _common_9.getXcor();
      int _plus_9 = ((x).intValue() + _xcor_3);
      _builder.append(_plus_9, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_16 = element.getLayout();
      CommonLayout _common_10 = _layout_16.getCommon();
      int _ycor_3 = _common_10.getYcor();
      int _plus_10 = ((y).intValue() + _ycor_3);
      RoundedRectangleLayout _layout_17 = element.getLayout();
      CommonLayout _common_11 = _layout_17.getCommon();
      int _heigth_1 = _common_11.getHeigth();
      int _plus_11 = (_plus_10 + _heigth_1);
      _builder.append(_plus_11, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_18 = element.getLayout();
      int _curveWidth_3 = _layout_18.getCurveWidth();
      _builder.append(_curveWidth_3, "");
      _builder.append(", ");
      RoundedRectangleLayout _layout_19 = element.getLayout();
      int _curveHeight_3 = _layout_19.getCurveHeight();
      _builder.append(_curveHeight_3, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("Polygon ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createPolygon(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(plname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      RoundedRectangleLayout _layout_20 = element.getLayout();
      ShapestyleLayout _layout_21 = _layout_20.getLayout();
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_21);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDEllipse element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Ellipse ");
      _builder.append(attname, "");
      _builder.append(" = gaService.createEllipse(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _plus = (_xcor + (x).intValue());
      _builder.append(_plus, "");
      _builder.append(", ");
      RectangleEllipseLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      int _plus_1 = (_ycor + (y).intValue());
      _builder.append(_plus_1, "");
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
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_5);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final CDText element, final String parentName, final String shapeStyle, final Integer angle, final Integer distance) {
    CharSequence _xblockexpression = null;
    {
      final String attname = "element";
      final String editingname = "deinfo";
      Integer x = this.getXPositionforAngle(distance, angle);
      Integer y = this.getYPositionforAngle(distance, angle);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(parentName, "");
      _builder.append(".setActive(true);");
      _builder.newLineIfNotEmpty();
      {
        TextType _texttype = element.getTexttype();
        boolean _equals = Objects.equal(_texttype, TextType.DEFAULT);
        if (_equals) {
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
      _builder.append("ISprayStyle style = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setStyle(style.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append(attname, "");
      _builder.append(".setForeground(style.getFontColor(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(attname, "");
      _builder.append(", ");
      TextLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _plus = ((x).intValue() + _xcor);
      _builder.append(_plus, "");
      _builder.append(", ");
      TextLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      int _plus_1 = ((y).intValue() + _ycor);
      _builder.append(_plus_1, "");
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
      _builder.append(".setValue(\"\");");
      _builder.newLineIfNotEmpty();
      _builder.append("peService.setPropertyValue(");
      _builder.append(attname, "");
      _builder.append(", ISprayConstants.TEXT_ID, TextIds.");
      TextBody _body = element.getBody();
      String _value = _body.getValue();
      _builder.append(_value, "");
      _builder.append(".name());");
      _builder.newLineIfNotEmpty();
      _builder.append("IDirectEditingInfo ");
      _builder.append(editingname, "");
      _builder.append(" = getFeatureProvider().getDirectEditingInfo();");
      _builder.newLineIfNotEmpty();
      _builder.append(editingname, "");
      _builder.append(".setMainPictogramElement(connection);");
      _builder.newLineIfNotEmpty();
      _builder.append(editingname, "");
      _builder.append(".setPictogramElement(");
      _builder.append(parentName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(editingname, "");
      _builder.append(".setGraphicsAlgorithm(");
      _builder.append(attname, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      TextLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForConnection = this._connectionStyleGenerator.generateStyleForConnection(attname, _layout_7);
      _builder.append(_generateStyleForConnection, "");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String mapAlignment(final VAlign align) {
    String _switchResult = null;
    if (align != null) {
      switch (align) {
        case MIDDLE:
          _switchResult = "ALIGNMENT_MIDDLE";
          break;
        case BOTTOM:
          _switchResult = "ALIGNMENT_BOTTOM";
          break;
        case TOP:
          _switchResult = "ALIGNMENT_TOP";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public String mapAlignment(final HAlign align) {
    String _switchResult = null;
    if (align != null) {
      switch (align) {
        case CENTER:
          _switchResult = "ALIGNMENT_CENTER";
          break;
        case LEFT:
          _switchResult = "ALIGNMENT_LEFT";
          break;
        case RIGHT:
          _switchResult = "ALIGNMENT_RIGHT";
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public CharSequence createPointList(final EList<Point> pointlist, final String plname, final Integer x, final Integer y) {
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
        int _plus = (_xcor + (x).intValue());
        _builder.append(_plus, "");
        _builder.append(", ");
        int _ycor = point.getYcor();
        int _plus_1 = (_ycor + (y).intValue());
        _builder.append(_plus_1, "");
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
  
  public String styleForElement(final ShapeStyleRef s, final String styleName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name is undefined for the type ConnectionPlacingGenerator"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  public Integer getXPositionforAngle(final Integer distance, final Integer angle) {
    Integer _xifexpression = null;
    if ((((angle).intValue() == 90) || ((angle).intValue() == 270))) {
      _xifexpression = Integer.valueOf(0);
    } else {
      Integer _xifexpression_1 = null;
      if (((angle).intValue() == 180)) {
        _xifexpression_1 = Integer.valueOf((-(distance).intValue()));
      } else {
        Integer _xifexpression_2 = null;
        if ((((angle).intValue() == 0) || ((angle).intValue() >= 360))) {
          _xifexpression_2 = distance;
        } else {
          int _xifexpression_3 = (int) 0;
          if (((angle).intValue() < 90)) {
            int _xblockexpression = (int) 0;
            {
              double _radians = Math.toRadians((angle).intValue());
              double _cos = Math.cos(_radians);
              double _multiply = (_cos * (distance).intValue());
              int posx = Double.valueOf(_multiply).intValue();
              _xblockexpression = posx;
            }
            _xifexpression_3 = _xblockexpression;
          } else {
            int _xifexpression_4 = (int) 0;
            if (((angle).intValue() < 180)) {
              int _xblockexpression_1 = (int) 0;
              {
                int newangle = (180 - (angle).intValue());
                double _radians = Math.toRadians(newangle);
                double _cos = Math.cos(_radians);
                double _multiply = (_cos * (distance).intValue());
                int posx = Double.valueOf(_multiply).intValue();
                _xblockexpression_1 = (posx * (-1));
              }
              _xifexpression_4 = _xblockexpression_1;
            } else {
              int _xifexpression_5 = (int) 0;
              if (((angle).intValue() < 270)) {
                int _xblockexpression_2 = (int) 0;
                {
                  int newangle1 = ((angle).intValue() - 180);
                  double _radians = Math.toRadians(newangle1);
                  double _cos = Math.cos(_radians);
                  double _multiply = (_cos * (distance).intValue());
                  int posx = Double.valueOf(_multiply).intValue();
                  _xblockexpression_2 = (posx * (-1));
                }
                _xifexpression_5 = _xblockexpression_2;
              } else {
                int _xifexpression_6 = (int) 0;
                if (((angle).intValue() < 360)) {
                  int _xblockexpression_3 = (int) 0;
                  {
                    int newangle = (360 - (angle).intValue());
                    double _radians = Math.toRadians(newangle);
                    double _cos = Math.cos(_radians);
                    double _multiply = (_cos * (distance).intValue());
                    int posx = Double.valueOf(_multiply).intValue();
                    _xblockexpression_3 = posx;
                  }
                  _xifexpression_6 = _xblockexpression_3;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = Integer.valueOf(_xifexpression_3);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public Integer getYPositionforAngle(final Integer distance, final Integer angle) {
    Integer _xifexpression = null;
    if (((angle).intValue() == 90)) {
      _xifexpression = Integer.valueOf((-(distance).intValue()));
    } else {
      Integer _xifexpression_1 = null;
      if (((((angle).intValue() == 0) || ((angle).intValue() == 180)) || ((angle).intValue() >= 360))) {
        _xifexpression_1 = Integer.valueOf(0);
      } else {
        Integer _xifexpression_2 = null;
        if (((angle).intValue() == 270)) {
          _xifexpression_2 = distance;
        } else {
          int _xifexpression_3 = (int) 0;
          if (((angle).intValue() < 90)) {
            int _xblockexpression = (int) 0;
            {
              double _radians = Math.toRadians((angle).intValue());
              double _sin = Math.sin(_radians);
              double _multiply = (_sin * (distance).intValue());
              int posy = Double.valueOf(_multiply).intValue();
              _xblockexpression = (posy * (-1));
            }
            _xifexpression_3 = _xblockexpression;
          } else {
            int _xifexpression_4 = (int) 0;
            if (((angle).intValue() < 180)) {
              int _xblockexpression_1 = (int) 0;
              {
                int newangle = (180 - (angle).intValue());
                double _radians = Math.toRadians(newangle);
                double _sin = Math.sin(_radians);
                double _multiply = (_sin * (distance).intValue());
                int posy = Double.valueOf(_multiply).intValue();
                _xblockexpression_1 = (posy * (-1));
              }
              _xifexpression_4 = _xblockexpression_1;
            } else {
              int _xifexpression_5 = (int) 0;
              if (((angle).intValue() < 270)) {
                int _xblockexpression_2 = (int) 0;
                {
                  int newangle1 = ((angle).intValue() - 180);
                  double _radians = Math.toRadians(newangle1);
                  double _sin = Math.sin(_radians);
                  double _multiply = (_sin * (distance).intValue());
                  int posy = Double.valueOf(_multiply).intValue();
                  _xblockexpression_2 = posy;
                }
                _xifexpression_5 = _xblockexpression_2;
              } else {
                int _xifexpression_6 = (int) 0;
                if (((angle).intValue() < 360)) {
                  int _xblockexpression_3 = (int) 0;
                  {
                    int newangle = (360 - (angle).intValue());
                    double _radians = Math.toRadians(newangle);
                    double _sin = Math.sin(_radians);
                    double _multiply = (_sin * (distance).intValue());
                    int posy = Double.valueOf(_multiply).intValue();
                    _xblockexpression_3 = posy;
                  }
                  _xifexpression_6 = _xblockexpression_3;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = Integer.valueOf(_xifexpression_3);
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public int nextIndex() {
    return this.decorator_index = (this.decorator_index + 1);
  }
  
  public String decoratorName() {
    return ("decorator_" + Integer.valueOf(this.decorator_index));
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
