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
package org.eclipselabs.spray.shapes.generator.shapes;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.CompartmentLayout;
import org.eclipselabs.spray.shapes.Description;
import org.eclipselabs.spray.shapes.Ellipse;
import org.eclipselabs.spray.shapes.HAlign;
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
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.Text;
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.shapes.TextLayout;
import org.eclipselabs.spray.shapes.TextType;
import org.eclipselabs.spray.shapes.VAlign;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeStyleGenerator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;

@SuppressWarnings("all")
public class ShapeTypeGenerator {
  @Inject
  @Extension
  private ShapeTypeStyleGenerator _shapeTypeStyleGenerator;
  
  @Inject
  @Extension
  private ShapeSizeCalculator _shapeSizeCalculator;
  
  private int element_index;
  
  private ShapeDefinition sh;
  
  private List<CharSequence> methods;
  
  public CharSequence generateSetSizeAndlocation(final String shapeName, final String elementName, final int x, final int y, final int width, final int height) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("gaService.setLocationAndSize(");
    _builder.append(elementName, "");
    _builder.append(", ");
    _builder.append(x, "");
    _builder.append(", ");
    _builder.append(y, "");
    _builder.append(", ");
    _builder.append(width, "");
    _builder.append(", ");
    _builder.append(height, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("SprayLayoutService.setLayoutData(");
    _builder.append(shapeName, "");
    _builder.append(", ");
    _builder.append(width, "");
    _builder.append(", ");
    _builder.append(height, "");
    _builder.append(", true);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String cascadedElementsMethodName() {
    return "createCascadedElements";
  }
  
  public CharSequence generateCascadedElementMethods(final ShapeDefinition shapeDef, final String containername) {
    CharSequence _xblockexpression = null;
    {
      this.sh = shapeDef;
      this.element_index = 0;
      ShapeSizeWrapper sizeMap = this._shapeSizeCalculator.getContainerSize(shapeDef);
      String elementName1 = this.elementName();
      String elementName2 = "";
      EList<Shape> _shape = shapeDef.getShape();
      int _size = _shape.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        this.nextIndex();
        String _elementName = this.elementName();
        elementName2 = _elementName;
      }
      ArrayList<CharSequence> _arrayList = new ArrayList<CharSequence>();
      this.methods = _arrayList;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("protected void ");
      String _cascadedElementsMethodName = this.cascadedElementsMethodName();
      _builder.append(_cascadedElementsMethodName, "");
      _builder.append("(Diagram diagram, ContainerShape ");
      _builder.append(containername, "");
      _builder.append(", ISprayStyle sprayStyle) {");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("directEditingInfo.setMainPictogramElement(");
      _builder.append(containername, "    ");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("directEditingInfo.setPictogramElement(");
      _builder.append(containername, "    ");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("GraphicsAlgorithm ");
      _builder.append(elementName1, "    ");
      _builder.append(" = gaService.createInvisibleRectangle(");
      _builder.append(containername, "    ");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append(elementName1, "    ");
      _builder.append(".setStyle(sprayStyle.getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("SprayLayoutService.setShapeFromDsl(");
      _builder.append(containername, "    ");
      _builder.append(", true);");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("gaService.setLocationAndSize(");
      _builder.append(elementName1, "    ");
      _builder.append(", 0, 0, ");
      int _width = sizeMap.getWidth();
      _builder.append(_width, "    ");
      _builder.append(", ");
      int _heigth = sizeMap.getHeigth();
      _builder.append(_heigth, "    ");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      {
        EList<Shape> _shape_1 = shapeDef.getShape();
        int _size_1 = _shape_1.size();
        boolean _greaterThan_1 = (_size_1 > 1);
        if (_greaterThan_1) {
          _builder.append("    ");
          _builder.append("// Invisible rectangle around the elements (because more then one element is on first layer).");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("ContainerShape invisibleShape = peCreateService.createContainerShape(containerShape, false);");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("SprayLayoutService.setId(invisibleShape, \"");
          String _name = this.sh.getName();
          _builder.append(_name, "    ");
          _builder.append(".invisibleShape\");");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("SprayLayoutType ");
          String _layoutName = this.layoutName();
          _builder.append(_layoutName, "    ");
          _builder.append(" = SprayLayoutType.TOP;");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("SprayLayoutService.setLayoutManager(");
          _builder.append(containername, "    ");
          _builder.append(", ");
          String _layoutName_1 = this.layoutName();
          _builder.append(_layoutName_1, "    ");
          _builder.append(", 0, 0);");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("GraphicsAlgorithm ");
          _builder.append(elementName2, "    ");
          _builder.append(" = gaService.createPlainRectangle(invisibleShape);");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append(elementName2, "    ");
          _builder.append(".setStyle(sprayStyle.getStyle(diagram));");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append(elementName2, "    ");
          _builder.append(".setFilled(false);");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append(elementName2, "    ");
          _builder.append(".setLineVisible(false);");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("gaService.setLocationAndSize(");
          _builder.append(elementName2, "    ");
          _builder.append(", 0, 0, ");
          int _width_1 = sizeMap.getWidth();
          _builder.append(_width_1, "    ");
          _builder.append(", ");
          int _heigth_1 = sizeMap.getHeigth();
          _builder.append(_heigth_1, "    ");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.newLine();
      {
        EList<Shape> _shape_2 = shapeDef.getShape();
        for(final Shape element : _shape_2) {
          _builder.append("    ");
          String _createElementMethod = this.createElementMethod(element, containername, "sprayStyle", true);
          _builder.append(_createElementMethod, "    ");
          _builder.append("(diagram, ");
          _builder.append(containername, "    ");
          _builder.append(", sprayStyle);");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      Description _description = shapeDef.getDescription();
      CharSequence _generateDescription = null;
      if (_description!=null) {
        int _heigth_2 = sizeMap.getHeigth();
        int _width_2 = sizeMap.getWidth();
        _generateDescription=this.generateDescription(_description, containername, "sprayStyle", _heigth_2, _width_2);
      }
      _builder.append(_generateDescription, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("// Set start values for height and width as properties on the element for Layout Feature");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("SprayLayoutManager.setSizePictogramProperties(");
      _builder.append(containername, "    ");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
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
  
  public CharSequence recursiveCreation(final EList<Shape> shapeList, final String elementName, final String shapeStyle, final boolean flexible) {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Shape element : shapeList) {
        String _createElementMethod = this.createElementMethod(element, elementName, shapeStyle, flexible);
        _builder.append(_createElementMethod, "");
        _builder.append("(diagram, ");
        _builder.append(elementName, "");
        _builder.append(", ");
        _builder.append(shapeStyle, "");
        _builder.append(");");
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
  
  public String createElementMethod(final Shape shape, final String parentShape, final String shapeStyle, final boolean flexible) {
    String _xblockexpression = null;
    {
      this.nextIndex();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("create");
      String _elementName = this.elementName();
      String _firstUpper = StringExtensions.toFirstUpper(_elementName);
      _builder.append(_firstUpper, "");
      String methodName = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("protected Shape ");
      _builder_1.append(methodName, "");
      _builder_1.append("(Diagram diagram,  ContainerShape parentShape, ISprayStyle sprayStyle) {");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      CharSequence _createElement = this.createElement(shape, "parentShape", "sprayStyle", flexible);
      _builder_1.append(_createElement, "    ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("}");
      _builder_1.newLine();
      this.methods.add(_builder_1);
      _xblockexpression = methodName;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Line element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      LineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      String _pointListName = this.pointListName();
      CharSequence _createPointList = this.createPointList(_point, _pointListName);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("Shape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createShape(");
      _builder.append(parentName, "");
      _builder.append(", false);");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("Polyline ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainPolyline(");
      _builder.append(shapeName, "");
      _builder.append(", ");
      String _pointListName_1 = this.pointListName();
      _builder.append(_pointListName_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      LineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_2, _layout_2);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Rectangle element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      CompartmentInfo _compartmentInfo = element.getCompartmentInfo();
      final boolean isCompartment = (!Objects.equal(_compartmentInfo, null));
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ContainerShape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createContainerShape(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(isCompartment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setCompartment(");
      _builder.append(shapeName, "");
      _builder.append(", ");
      _builder.append(isCompartment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      {
        CompartmentInfo _compartmentInfo_1 = null;
        if (element!=null) {
          _compartmentInfo_1=element.getCompartmentInfo();
        }
        TextBody _id = null;
        if (_compartmentInfo_1!=null) {
          _id=_compartmentInfo_1.getId();
        }
        boolean _notEquals = (!Objects.equal(_id, null));
        if (_notEquals) {
          _builder.append("GraphitiProperties.set(");
          _builder.append(shapeName, "");
          _builder.append(", ISprayConstants.TEXT_ID, \"");
          CompartmentInfo _compartmentInfo_2 = element.getCompartmentInfo();
          TextBody _id_1 = _compartmentInfo_2.getId();
          String _value = _id_1.getValue();
          _builder.append(_value, "");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        CompartmentInfo _compartmentInfo_3 = null;
        if (element!=null) {
          _compartmentInfo_3=element.getCompartmentInfo();
        }
        CompartmentLayout _compartmentLayout = null;
        if (_compartmentInfo_3!=null) {
          _compartmentLayout=_compartmentInfo_3.getCompartmentLayout();
        }
        boolean _notEquals_1 = (!Objects.equal(_compartmentLayout, null));
        if (_notEquals_1) {
          _builder.append("SprayLayoutType ");
          String _layoutName = this.layoutName();
          _builder.append(_layoutName, "");
          _builder.append(" = SprayLayoutType.");
          CompartmentInfo _compartmentInfo_4 = element.getCompartmentInfo();
          CompartmentLayout _compartmentLayout_1 = _compartmentInfo_4.getCompartmentLayout();
          String _name_1 = _compartmentLayout_1.getName();
          _builder.append(_name_1, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("SprayLayoutService.setLayoutManager(");
          _builder.append(shapeName, "");
          _builder.append(", ");
          String _layoutName_1 = this.layoutName();
          _builder.append(_layoutName_1, "");
          _builder.append(", ");
          CompartmentInfo _compartmentInfo_5 = element.getCompartmentInfo();
          int _margin = _compartmentInfo_5.getMargin();
          _builder.append(_margin, "");
          _builder.append(", ");
          CompartmentInfo _compartmentInfo_6 = element.getCompartmentInfo();
          int _spacing = _compartmentInfo_6.getSpacing();
          _builder.append(_spacing, "");
          _builder.append(", ");
          _builder.append(flexible, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("SprayLayoutService.setLayoutData(");
          _builder.append(shapeName, "");
          _builder.append(", ");
          RectangleEllipseLayout _layout = element.getLayout();
          CommonLayout _common = _layout.getCommon();
          int _width = _common.getWidth();
          _builder.append(_width, "");
          _builder.append(", ");
          RectangleEllipseLayout _layout_1 = element.getLayout();
          CommonLayout _common_1 = _layout_1.getCommon();
          int _heigth = _common_1.getHeigth();
          _builder.append(_heigth, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        CompartmentInfo _compartmentInfo_7 = null;
        if (element!=null) {
          _compartmentInfo_7=element.getCompartmentInfo();
        }
        Boolean _stretchH = null;
        if (_compartmentInfo_7!=null) {
          _stretchH=_compartmentInfo_7.getStretchH();
        }
        boolean _notEquals_2 = (!Objects.equal(_stretchH, null));
        if (_notEquals_2) {
          _builder.append("SprayLayoutService.getLayoutData(");
          _builder.append(shapeName, "");
          _builder.append(").setHorizontalStrechable(");
          CompartmentInfo _compartmentInfo_8 = element.getCompartmentInfo();
          Boolean _stretchH_1 = _compartmentInfo_8.getStretchH();
          _builder.append(_stretchH_1, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("Rectangle ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainRectangle(");
      _builder.append(shapeName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _xcor = _common_2.getXcor();
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      RectangleEllipseLayout _layout_4 = element.getLayout();
      CommonLayout _common_4 = _layout_4.getCommon();
      int _width_1 = _common_4.getWidth();
      RectangleEllipseLayout _layout_5 = element.getLayout();
      CommonLayout _common_5 = _layout_5.getCommon();
      int _heigth_1 = _common_5.getHeigth();
      CharSequence _generateSetSizeAndlocation = this.generateSetSizeAndlocation(shapeName, _elementName_2, _xcor, _ycor, _width_1, _heigth_1);
      _builder.append(_generateSetSizeAndlocation, "");
      _builder.newLineIfNotEmpty();
      String _elementName_3 = this.elementName();
      RectangleEllipseLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_3, _layout_7);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      {
        boolean _and = false;
        if (!isCompartment) {
          _and = false;
        } else {
          CompartmentInfo _compartmentInfo_9 = element.getCompartmentInfo();
          boolean _isInvisible = _compartmentInfo_9.isInvisible();
          _and = _isInvisible;
        }
        if (_and) {
          String _elementName_4 = this.elementName();
          _builder.append(_elementName_4, "");
          _builder.append(".setFilled(false);");
          _builder.newLineIfNotEmpty();
          String _elementName_5 = this.elementName();
          _builder.append(_elementName_5, "");
          _builder.append(".setLineVisible(false);");
          _builder.newLineIfNotEmpty();
        }
      }
      boolean _and_1 = false;
      if (!isCompartment) {
        _and_1 = false;
      } else {
        CompartmentInfo _compartmentInfo_10 = null;
        if (element!=null) {
          _compartmentInfo_10=element.getCompartmentInfo();
        }
        CompartmentLayout _compartmentLayout_2 = null;
        if (_compartmentInfo_10!=null) {
          _compartmentLayout_2=_compartmentInfo_10.getCompartmentLayout();
        }
        String _name_2 = null;
        if (_compartmentLayout_2!=null) {
          _name_2=_compartmentLayout_2.getName();
        }
        boolean _equalsIgnoreCase = _name_2.equalsIgnoreCase("fixed");
        boolean _not = (!_equalsIgnoreCase);
        _and_1 = _not;
      }
      boolean childFlexible = _and_1;
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _styleName_2 = this.styleName();
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, shapeName, _styleName_2, childFlexible);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Ellipse element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      CompartmentInfo _compartmentInfo = element.getCompartmentInfo();
      final boolean isCompartment = (!Objects.equal(_compartmentInfo, null));
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ContainerShape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createContainerShape(");
      _builder.append(parentName, "");
      _builder.append(", ");
      _builder.append(isCompartment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setCompartment(");
      _builder.append(shapeName, "");
      _builder.append(", ");
      _builder.append(isCompartment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      {
        CompartmentInfo _compartmentInfo_1 = null;
        if (element!=null) {
          _compartmentInfo_1=element.getCompartmentInfo();
        }
        TextBody _id = null;
        if (_compartmentInfo_1!=null) {
          _id=_compartmentInfo_1.getId();
        }
        boolean _notEquals = (!Objects.equal(_id, null));
        if (_notEquals) {
          _builder.append("GraphitiProperties.set(");
          _builder.append(shapeName, "");
          _builder.append(", ISprayConstants.TEXT_ID, \"");
          CompartmentInfo _compartmentInfo_2 = element.getCompartmentInfo();
          TextBody _id_1 = _compartmentInfo_2.getId();
          String _value = _id_1.getValue();
          _builder.append(_value, "");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        CompartmentInfo _compartmentInfo_3 = null;
        if (element!=null) {
          _compartmentInfo_3=element.getCompartmentInfo();
        }
        CompartmentLayout _compartmentLayout = null;
        if (_compartmentInfo_3!=null) {
          _compartmentLayout=_compartmentInfo_3.getCompartmentLayout();
        }
        boolean _notEquals_1 = (!Objects.equal(_compartmentLayout, null));
        if (_notEquals_1) {
          _builder.append("SprayLayoutType ");
          String _layoutName = this.layoutName();
          _builder.append(_layoutName, "");
          _builder.append(" = SprayLayoutType.");
          CompartmentInfo _compartmentInfo_4 = element.getCompartmentInfo();
          CompartmentLayout _compartmentLayout_1 = _compartmentInfo_4.getCompartmentLayout();
          String _name_1 = _compartmentLayout_1.getName();
          _builder.append(_name_1, "");
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          _builder.append("SprayLayoutService.setLayoutManager(");
          _builder.append(shapeName, "");
          _builder.append(", ");
          String _layoutName_1 = this.layoutName();
          _builder.append(_layoutName_1, "");
          _builder.append(", ");
          CompartmentInfo _compartmentInfo_5 = element.getCompartmentInfo();
          int _margin = _compartmentInfo_5.getMargin();
          _builder.append(_margin, "");
          _builder.append(", ");
          CompartmentInfo _compartmentInfo_6 = element.getCompartmentInfo();
          int _spacing = _compartmentInfo_6.getSpacing();
          _builder.append(_spacing, "");
          _builder.append(", ");
          _builder.append(flexible, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("SprayLayoutService.setLayoutData(");
          _builder.append(shapeName, "");
          _builder.append(", ");
          RectangleEllipseLayout _layout = element.getLayout();
          CommonLayout _common = _layout.getCommon();
          int _width = _common.getWidth();
          _builder.append(_width, "");
          _builder.append(", ");
          RectangleEllipseLayout _layout_1 = element.getLayout();
          CommonLayout _common_1 = _layout_1.getCommon();
          int _heigth = _common_1.getHeigth();
          _builder.append(_heigth, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        CompartmentInfo _compartmentInfo_7 = null;
        if (element!=null) {
          _compartmentInfo_7=element.getCompartmentInfo();
        }
        Boolean _stretchH = null;
        if (_compartmentInfo_7!=null) {
          _stretchH=_compartmentInfo_7.getStretchH();
        }
        boolean _notEquals_2 = (!Objects.equal(_stretchH, null));
        if (_notEquals_2) {
          _builder.append("SprayLayoutService.getLayoutData(");
          _builder.append(shapeName, "");
          _builder.append(").setHorizontalStrechable(");
          CompartmentInfo _compartmentInfo_8 = element.getCompartmentInfo();
          Boolean _stretchH_1 = _compartmentInfo_8.getStretchH();
          _builder.append(_stretchH_1, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("Ellipse ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainEllipse(");
      _builder.append(shapeName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      RectangleEllipseLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _xcor = _common_2.getXcor();
      RectangleEllipseLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _ycor = _common_3.getYcor();
      RectangleEllipseLayout _layout_4 = element.getLayout();
      CommonLayout _common_4 = _layout_4.getCommon();
      int _width_1 = _common_4.getWidth();
      RectangleEllipseLayout _layout_5 = element.getLayout();
      CommonLayout _common_5 = _layout_5.getCommon();
      int _heigth_1 = _common_5.getHeigth();
      CharSequence _generateSetSizeAndlocation = this.generateSetSizeAndlocation(shapeName, _elementName_2, _xcor, _ycor, _width_1, _heigth_1);
      _builder.append(_generateSetSizeAndlocation, "");
      _builder.newLineIfNotEmpty();
      String _elementName_3 = this.elementName();
      RectangleEllipseLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_3, _layout_7);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      {
        boolean _and = false;
        if (!isCompartment) {
          _and = false;
        } else {
          CompartmentInfo _compartmentInfo_9 = element.getCompartmentInfo();
          boolean _isInvisible = _compartmentInfo_9.isInvisible();
          _and = _isInvisible;
        }
        if (_and) {
          String _elementName_4 = this.elementName();
          _builder.append(_elementName_4, "");
          _builder.append(".setFilled(false);");
          _builder.newLineIfNotEmpty();
          String _elementName_5 = this.elementName();
          _builder.append(_elementName_5, "");
          _builder.append(".setLineVisible(false);");
          _builder.newLineIfNotEmpty();
        }
      }
      boolean _and_1 = false;
      if (!isCompartment) {
        _and_1 = false;
      } else {
        CompartmentInfo _compartmentInfo_10 = null;
        if (element!=null) {
          _compartmentInfo_10=element.getCompartmentInfo();
        }
        CompartmentLayout _compartmentLayout_2 = null;
        if (_compartmentInfo_10!=null) {
          _compartmentLayout_2=_compartmentInfo_10.getCompartmentLayout();
        }
        String _name_2 = null;
        if (_compartmentLayout_2!=null) {
          _name_2=_compartmentLayout_2.getName();
        }
        boolean _equalsIgnoreCase = _name_2.equalsIgnoreCase("fixed");
        boolean _not = (!_equalsIgnoreCase);
        _and_1 = _not;
      }
      boolean childFlexible = _and_1;
      _builder.append(" ");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _styleName_2 = this.styleName();
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, shapeName, _styleName_2, childFlexible);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Polygon element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      String _pointListName = this.pointListName();
      CharSequence _createPointList = this.createPointList(_point, _pointListName);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("ContainerShape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createContainerShape(");
      _builder.append(parentName, "");
      _builder.append(", false);");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("Polygon ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainPolygon(");
      _builder.append(shapeName, "");
      _builder.append(", ");
      String _pointListName_1 = this.pointListName();
      _builder.append(_pointListName_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      PolyLineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_2, _layout_2);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _builder.append("IDimension ");
      String _sizeName = this.sizeName();
      _builder.append(_sizeName, "");
      _builder.append(" = gaService.calculateSize(");
      String _elementName_3 = this.elementName();
      _builder.append(_elementName_3, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutManager.resizePolygon(");
      String _elementName_4 = this.elementName();
      _builder.append(_elementName_4, "");
      _builder.append(", ");
      String _sizeName_1 = this.sizeName();
      _builder.append(_sizeName_1, "");
      _builder.append(", 1, 1);");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      String _elementName_5 = this.elementName();
      _builder.append(_elementName_5, "");
      _builder.append(", ");
      String _elementName_6 = this.elementName();
      _builder.append(_elementName_6, "");
      _builder.append(".getX(), ");
      String _elementName_7 = this.elementName();
      _builder.append(_elementName_7, "");
      _builder.append(".getY(), ");
      String _sizeName_2 = this.sizeName();
      _builder.append(_sizeName_2, "");
      _builder.append(".getWidth(), ");
      String _sizeName_3 = this.sizeName();
      _builder.append(_sizeName_3, "");
      _builder.append(".getHeight());");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setLayoutData(");
      _builder.append(shapeName, "");
      _builder.append(", ");
      String _sizeName_4 = this.sizeName();
      _builder.append(_sizeName_4, "");
      _builder.append(".getWidth(), ");
      String _sizeName_5 = this.sizeName();
      _builder.append(_sizeName_5, "");
      _builder.append(".getHeight(), true);");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _styleName_2 = this.styleName();
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, shapeName, _styleName_2, false);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Polyline element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      PolyLineLayout _layout = element.getLayout();
      EList<Point> _point = _layout.getPoint();
      String _pointListName = this.pointListName();
      CharSequence _createPointList = this.createPointList(_point, _pointListName);
      _builder.append(_createPointList, "");
      _builder.newLineIfNotEmpty();
      _builder.append("ContainerShape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createContainerShape(");
      _builder.append(parentName, "");
      _builder.append(", false);");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("Polyline ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainPolyline(");
      _builder.append(shapeName, "");
      _builder.append(", ");
      String _pointListName_1 = this.pointListName();
      _builder.append(_pointListName_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      PolyLineLayout _layout_1 = element.getLayout();
      ShapestyleLayout _layout_2 = _layout_1.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_2, _layout_2);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final RoundedRectangle element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("ContainerShape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createContainerShape(");
      _builder.append(parentName, "");
      _builder.append(", false);");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      _builder.append("RoundedRectangle ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainRoundedRectangle(");
      _builder.append(shapeName, "");
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
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      RoundedRectangleLayout _layout_2 = element.getLayout();
      CommonLayout _common = _layout_2.getCommon();
      int _xcor = _common.getXcor();
      RoundedRectangleLayout _layout_3 = element.getLayout();
      CommonLayout _common_1 = _layout_3.getCommon();
      int _ycor = _common_1.getYcor();
      RoundedRectangleLayout _layout_4 = element.getLayout();
      CommonLayout _common_2 = _layout_4.getCommon();
      int _width = _common_2.getWidth();
      RoundedRectangleLayout _layout_5 = element.getLayout();
      CommonLayout _common_3 = _layout_5.getCommon();
      int _heigth = _common_3.getHeigth();
      CharSequence _generateSetSizeAndlocation = this.generateSetSizeAndlocation(shapeName, _elementName_2, _xcor, _ycor, _width, _heigth);
      _builder.append(_generateSetSizeAndlocation, "");
      _builder.newLineIfNotEmpty();
      String _elementName_3 = this.elementName();
      RoundedRectangleLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_3, _layout_7);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      EList<Shape> _shape = element.getShape();
      String _styleName_2 = this.styleName();
      CharSequence _recursiveCreation = this.recursiveCreation(_shape, shapeName, _styleName_2, false);
      _builder.append(_recursiveCreation, "");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createElement(final Text element, final String parentName, final String shapeStyle, final boolean flexible) {
    CharSequence _xblockexpression = null;
    {
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Shape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createShape(");
      _builder.append(parentName, "");
      _builder.append(", false);");
      _builder.newLineIfNotEmpty();
      _builder.append("SprayLayoutService.setId(");
      _builder.append(shapeName, "");
      _builder.append(", \"");
      String _name = this.sh.getName();
      _builder.append(_name, "");
      _builder.append(".");
      _builder.append(shapeName, "");
      _builder.append("\");");
      _builder.newLineIfNotEmpty();
      {
        TextType _texttype = element.getTexttype();
        boolean _equals = Objects.equal(_texttype, TextType.DEFAULT);
        if (_equals) {
          _builder.append("Text ");
          String _elementName = this.elementName();
          _builder.append(_elementName, "");
          _builder.append(" = gaService.createPlainText(");
          _builder.append(shapeName, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("MultiText ");
          String _elementName_1 = this.elementName();
          _builder.append(_elementName_1, "");
          _builder.append(" = gaService.createPlainMultiText(");
          _builder.append(shapeName, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = element.getStyle();
      String _styleForElement = this.styleForElement(_style, shapeStyle);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      _builder.append(_elementName_2, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_3 = this.elementName();
      TextLayout _layout = element.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      TextLayout _layout_1 = element.getLayout();
      CommonLayout _common_1 = _layout_1.getCommon();
      int _ycor = _common_1.getYcor();
      TextLayout _layout_2 = element.getLayout();
      CommonLayout _common_2 = _layout_2.getCommon();
      int _width = _common_2.getWidth();
      TextLayout _layout_3 = element.getLayout();
      CommonLayout _common_3 = _layout_3.getCommon();
      int _heigth = _common_3.getHeigth();
      CharSequence _generateSetSizeAndlocation = this.generateSetSizeAndlocation(shapeName, _elementName_3, _xcor, _ycor, _width, _heigth);
      _builder.append(_generateSetSizeAndlocation, "");
      _builder.newLineIfNotEmpty();
      String _elementName_4 = this.elementName();
      _builder.append(_elementName_4, "");
      _builder.append(".setHorizontalAlignment(Orientation.");
      TextLayout _layout_4 = element.getLayout();
      HAlign _hAlign = _layout_4.getHAlign();
      String _mapAlignment = this.mapAlignment(_hAlign);
      _builder.append(_mapAlignment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      String _elementName_5 = this.elementName();
      _builder.append(_elementName_5, "");
      _builder.append(".setVerticalAlignment(Orientation.");
      TextLayout _layout_5 = element.getLayout();
      VAlign _vAlign = _layout_5.getVAlign();
      String _mapAlignment_1 = this.mapAlignment(_vAlign);
      _builder.append(_mapAlignment_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("peService.setPropertyValue(");
      String _elementName_6 = this.elementName();
      _builder.append(_elementName_6, "");
      _builder.append(", ISprayConstants.TEXT_ID, TextIds.");
      TextBody _body = element.getBody();
      String _value = _body.getValue();
      _builder.append(_value, "");
      _builder.append(".name());");
      _builder.newLineIfNotEmpty();
      _builder.append("peService.setPropertyValue(");
      _builder.append(shapeName, "");
      _builder.append(", ISprayConstants.TEXT_ID, TextIds.");
      TextBody _body_1 = element.getBody();
      String _value_1 = _body_1.getValue();
      _builder.append(_value_1, "");
      _builder.append(".name());");
      _builder.newLineIfNotEmpty();
      String _elementName_7 = this.elementName();
      _builder.append(_elementName_7, "");
      _builder.append(".setValue(\"\");");
      _builder.newLineIfNotEmpty();
      String _elementName_8 = this.elementName();
      TextLayout _layout_6 = element.getLayout();
      ShapestyleLayout _layout_7 = _layout_6.getLayout();
      CharSequence _generateStyleForElement = this._shapeTypeStyleGenerator.generateStyleForElement(_elementName_8, _layout_7);
      _builder.append(_generateStyleForElement, "");
      _builder.newLineIfNotEmpty();
      _builder.append("getFeatureProvider().getDirectEditingInfo().setGraphicsAlgorithm(");
      String _elementName_9 = this.elementName();
      _builder.append(_elementName_9, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("return ");
      _builder.append(shapeName, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence generateDescription(final Description d, final String containerName, final String parentStyleName, final int y, final int width) {
    CharSequence _xblockexpression = null;
    {
      final String shapeName = this.shapeName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Shape ");
      _builder.append(shapeName, "");
      _builder.append(" = peCreateService.createShape(");
      _builder.append(containerName, "");
      _builder.append(", false);");
      _builder.newLineIfNotEmpty();
      _builder.append("Text ");
      String _elementName = this.elementName();
      _builder.append(_elementName, "");
      _builder.append(" = gaService.createPlainText(");
      _builder.append(shapeName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("ISprayStyle ");
      String _styleName = this.styleName();
      _builder.append(_styleName, "");
      _builder.append(" = ");
      ShapeStyleRef _style = d.getStyle();
      String _styleForElement = this.styleForElement(_style, parentStyleName);
      _builder.append(_styleForElement, "");
      _builder.append(";");
      _builder.newLineIfNotEmpty();
      String _elementName_1 = this.elementName();
      _builder.append(_elementName_1, "");
      _builder.append(".setStyle(");
      String _styleName_1 = this.styleName();
      _builder.append(_styleName_1, "");
      _builder.append(".getStyle(diagram));");
      _builder.newLineIfNotEmpty();
      String _elementName_2 = this.elementName();
      _builder.append(_elementName_2, "");
      _builder.append(".setForeground(");
      String _styleName_2 = this.styleName();
      _builder.append(_styleName_2, "");
      _builder.append(".getFontColor(diagram));");
      _builder.newLineIfNotEmpty();
      _builder.append("gaService.setLocationAndSize(");
      String _elementName_3 = this.elementName();
      _builder.append(_elementName_3, "");
      _builder.append(", 0, ");
      _builder.append(y, "");
      _builder.append(", ");
      _builder.append(width, "");
      _builder.append(", 20);");
      _builder.newLineIfNotEmpty();
      String _elementName_4 = this.elementName();
      _builder.append(_elementName_4, "");
      _builder.append(".setHorizontalAlignment(Orientation.");
      HAlign _hAlign = d.getHAlign();
      String _mapAlignment = this.mapAlignment(_hAlign);
      _builder.append(_mapAlignment, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      String _elementName_5 = this.elementName();
      _builder.append(_elementName_5, "");
      _builder.append(".setVerticalAlignment(Orientation.");
      VAlign _vAlign = d.getVAlign();
      String _mapAlignment_1 = this.mapAlignment(_vAlign);
      _builder.append(_mapAlignment_1, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("peService.setPropertyValue(");
      String _elementName_6 = this.elementName();
      _builder.append(_elementName_6, "");
      _builder.append(", ISprayConstants.TEXT_ID, TextIds.");
      TextBody _body = d.getBody();
      String _value = _body.getValue();
      _builder.append(_value, "");
      _builder.append(".name());");
      _builder.newLineIfNotEmpty();
      String _elementName_7 = this.elementName();
      _builder.append(_elementName_7, "");
      _builder.append(".setValue(\"\");");
      _builder.newLineIfNotEmpty();
      _builder.append("directEditingInfo.setPictogramElement(");
      _builder.append(shapeName, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append("directEditingInfo.setGraphicsAlgorithm(");
      String _elementName_8 = this.elementName();
      _builder.append(_elementName_8, "");
      _builder.append(");");
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
  
  public String styleForElement(final ShapeStyleRef s, final String styleName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name is undefined for the type ShapeTypeGenerator"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  public String shapeName() {
    return ("shape_" + Integer.valueOf(this.element_index));
  }
  
  public String sizeName() {
    return ("size_" + Integer.valueOf(this.element_index));
  }
  
  public String elementName() {
    return ("element_" + Integer.valueOf(this.element_index));
  }
  
  public String styleName() {
    return ("style_" + Integer.valueOf(this.element_index));
  }
  
  public String layoutName() {
    return ("layout_" + Integer.valueOf(this.element_index));
  }
  
  public String pointListName() {
    return ("pointList_" + Integer.valueOf(this.element_index));
  }
  
  public int nextIndex() {
    return this.element_index = (this.element_index + 1);
  }
  
  public CharSequence createElement(final Shape element, final String parentName, final String shapeStyle, final boolean flexible) {
    if (element instanceof Ellipse) {
      return _createElement((Ellipse)element, parentName, shapeStyle, flexible);
    } else if (element instanceof Line) {
      return _createElement((Line)element, parentName, shapeStyle, flexible);
    } else if (element instanceof Polygon) {
      return _createElement((Polygon)element, parentName, shapeStyle, flexible);
    } else if (element instanceof Polyline) {
      return _createElement((Polyline)element, parentName, shapeStyle, flexible);
    } else if (element instanceof Rectangle) {
      return _createElement((Rectangle)element, parentName, shapeStyle, flexible);
    } else if (element instanceof RoundedRectangle) {
      return _createElement((RoundedRectangle)element, parentName, shapeStyle, flexible);
    } else if (element instanceof Text) {
      return _createElement((Text)element, parentName, shapeStyle, flexible);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(element, parentName, shapeStyle, flexible).toString());
    }
  }
}
