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
package org.eclipselabs.spray.shapes.generator.svg;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipselabs.spray.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.CDEllipse;
import org.eclipselabs.spray.shapes.CDLine;
import org.eclipselabs.spray.shapes.CDPolygon;
import org.eclipselabs.spray.shapes.CDPolyline;
import org.eclipselabs.spray.shapes.CDRectangle;
import org.eclipselabs.spray.shapes.CDRoundedRectangle;
import org.eclipselabs.spray.shapes.CDText;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.Ellipse;
import org.eclipselabs.spray.shapes.Line;
import org.eclipselabs.spray.shapes.LineLayout;
import org.eclipselabs.spray.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.Point;
import org.eclipselabs.spray.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.Polygon;
import org.eclipselabs.spray.shapes.Polyline;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapeConnection;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.Text;
import org.eclipselabs.spray.shapes.TextLayout;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.ColorConstants;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.StyleLayout;

@SuppressWarnings("all")
public class LayoutExtensions {
  public int defaultConnectionX1() {
    return 10;
  }
  
  public int defaultConnectionY1() {
    return 50;
  }
  
  public int defaultConnectionX2() {
    return 110;
  }
  
  public int defaultConnectionY2() {
    return 50;
  }
  
  public int defaultConnectionWidth() {
    int _defaultConnectionX2 = this.defaultConnectionX2();
    int _defaultConnectionX1 = this.defaultConnectionX1();
    return (_defaultConnectionX2 - _defaultConnectionX1);
  }
  
  public int defaultConnectionHeight() {
    int _defaultConnectionY2 = this.defaultConnectionY2();
    int _defaultConnectionY1 = this.defaultConnectionY1();
    return (_defaultConnectionY2 - _defaultConnectionY1);
  }
  
  protected int _width(final ShapeDefinition shapeDef) {
    int _xblockexpression = (int) 0;
    {
      int w = 0;
      EList<EObject> _eContents = shapeDef.eContents();
      Iterable<Shape> _filter = Iterables.<Shape>filter(_eContents, Shape.class);
      for (final Shape shape : _filter) {
        {
          int _x = this.x(shape, false);
          int _width = this.width(shape);
          int _plus = (_x + _width);
          int _max = Math.max(w, _plus);
          w = _max;
          TreeIterator<EObject> _eAllContents = shape.eAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
          Iterable<Shape> _filter_1 = Iterables.<Shape>filter(_iterable, Shape.class);
          for (final Shape childShape : _filter_1) {
            int _x_1 = this.x(childShape, true);
            int _width_1 = this.width(shape);
            int _plus_1 = (_x_1 + _width_1);
            int _max_1 = Math.max(w, _plus_1);
            w = _max_1;
          }
        }
      }
      _xblockexpression = w;
    }
    return _xblockexpression;
  }
  
  public Iterable<Integer> placingDefs(final ConnectionDefinition shapeDef) {
    EList<EObject> _eContents = shapeDef.eContents();
    Iterable<PlacingDefinition> _filter = Iterables.<PlacingDefinition>filter(_eContents, PlacingDefinition.class);
    final Function1<PlacingDefinition, Integer> _function = new Function1<PlacingDefinition, Integer>() {
      @Override
      public Integer apply(final PlacingDefinition pd) {
        return Integer.valueOf(LayoutExtensions.this.width(pd));
      }
    };
    return IterableExtensions.<PlacingDefinition, Integer>map(_filter, _function);
  }
  
  protected int _width(final ConnectionDefinition shapeDef) {
    int _defaultConnectionWidth = this.defaultConnectionWidth();
    int _placingSpaceXShift = this.placingSpaceXShift(shapeDef);
    int _plus = (_defaultConnectionWidth + _placingSpaceXShift);
    Integer _placingSpaceAdditionalWidth = this.placingSpaceAdditionalWidth(shapeDef);
    return (_plus + (_placingSpaceAdditionalWidth).intValue());
  }
  
  protected int _width(final PlacingDefinition shape) {
    int _xifexpression = (int) 0;
    ShapeConnection _shapeCon = shape.getShapeCon();
    boolean _notEquals = (!Objects.equal(_shapeCon, null));
    if (_notEquals) {
      ShapeConnection _shapeCon_1 = shape.getShapeCon();
      _xifexpression = this.width(_shapeCon_1);
    } else {
      _xifexpression = this.defaultConnectionWidth();
    }
    return _xifexpression;
  }
  
  protected int _height(final ShapeDefinition shapeDef) {
    int _xblockexpression = (int) 0;
    {
      int h = 0;
      EList<EObject> _eContents = shapeDef.eContents();
      Iterable<Shape> _filter = Iterables.<Shape>filter(_eContents, Shape.class);
      for (final Shape shape : _filter) {
        {
          int _y = this.y(shape, false);
          int _height = this.height(shape);
          int _plus = (_y + _height);
          int _max = Math.max(h, _plus);
          h = _max;
          TreeIterator<EObject> _eAllContents = shape.eAllContents();
          Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_eAllContents);
          Iterable<Shape> _filter_1 = Iterables.<Shape>filter(_iterable, Shape.class);
          for (final Shape childShape : _filter_1) {
            int _y_1 = this.y(childShape, true);
            int _height_1 = this.height(shape);
            int _plus_1 = (_y_1 + _height_1);
            int _max_1 = Math.max(h, _plus_1);
            h = _max_1;
          }
        }
      }
      _xblockexpression = h;
    }
    return _xblockexpression;
  }
  
  protected int _height(final ConnectionDefinition shapeDef) {
    int _defaultConnectionHeight = this.defaultConnectionHeight();
    int _placingSpaceYShift = this.placingSpaceYShift(shapeDef);
    int _plus = (_defaultConnectionHeight + _placingSpaceYShift);
    Integer _placingSpaceAdditionalHeight = this.placingSpaceAdditionalHeight(shapeDef);
    return (_plus + (_placingSpaceAdditionalHeight).intValue());
  }
  
  protected int _height(final PlacingDefinition shape) {
    int _xifexpression = (int) 0;
    ShapeConnection _shapeCon = shape.getShapeCon();
    boolean _notEquals = (!Objects.equal(_shapeCon, null));
    if (_notEquals) {
      ShapeConnection _shapeCon_1 = shape.getShapeCon();
      _xifexpression = this.height(_shapeCon_1);
    } else {
      _xifexpression = this.defaultConnectionHeight();
    }
    return _xifexpression;
  }
  
  protected int _xoffset(final EObject other) {
    return 0;
  }
  
  protected int _xoffset(final ConnectionDefinition shape) {
    return 10;
  }
  
  protected int _xoffset(final PlacingDefinition shape) {
    EObject _eContainer = shape.eContainer();
    int _xoffset = this.xoffset(_eContainer);
    double _offset = shape.getOffset();
    int _width = this.width(shape);
    double _multiply = (_offset * _width);
    double _plus = (_xoffset + _multiply);
    return this.nullSafeIntValue(Double.valueOf(_plus));
  }
  
  protected int _xoffset(final ShapeConnection shape) {
    EObject _eContainer = shape.eContainer();
    return this.xoffset(_eContainer);
  }
  
  protected int _yoffset(final EObject other) {
    return 0;
  }
  
  protected int _yoffset(final ConnectionDefinition shape) {
    return 10;
  }
  
  protected int _yoffset(final PlacingDefinition shape) {
    EObject _eContainer = shape.eContainer();
    int _yoffset = this.yoffset(_eContainer);
    double _offset = shape.getOffset();
    int _width = this.width(shape);
    double _multiply = (_offset * _width);
    double _plus = (_yoffset + _multiply);
    return this.nullSafeIntValue(Double.valueOf(_plus));
  }
  
  protected int _yoffset(final ShapeConnection shape) {
    EObject _eContainer = shape.eContainer();
    return this.yoffset(_eContainer);
  }
  
  protected int _x(final EObject other, final boolean child) {
    return 0;
  }
  
  protected int _y(final EObject other, final boolean child) {
    return 0;
  }
  
  protected int _width(final EObject other) {
    return 0;
  }
  
  protected int _height(final EObject other) {
    return 0;
  }
  
  protected int _x(final Rectangle shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return (_xoffset + _xifexpression);
  }
  
  protected int _y(final Rectangle shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    return (_yoffset + _xifexpression);
  }
  
  protected int _width(final Rectangle shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final Rectangle shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  protected int _x(final CDRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _placingSpaceXShift = this.placingSpaceXShift(shape);
      _xifexpression = (_xcor + _placingSpaceXShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _y(final CDRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _ycor = _common.getYcor();
      int _placingSpaceYShift = this.placingSpaceYShift(shape);
      _xifexpression = (_ycor + _placingSpaceYShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _xWithoutShift(final CDRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _yWithoutShift(final CDRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _width(final CDRectangle shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final CDRectangle shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  protected int _x(final RoundedRectangle shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RoundedRectangleLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return (_xoffset + _xifexpression);
  }
  
  protected int _y(final RoundedRectangle shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RoundedRectangleLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    return (_yoffset + _xifexpression);
  }
  
  protected int _width(final RoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final RoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  public int rx(final RoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    return _layout.getCurveWidth();
  }
  
  public int ry(final RoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    return _layout.getCurveHeight();
  }
  
  protected int _x(final CDRoundedRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RoundedRectangleLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _placingSpaceXShift = this.placingSpaceXShift(shape);
      _xifexpression = (_xcor + _placingSpaceXShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _y(final CDRoundedRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RoundedRectangleLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _ycor = _common.getYcor();
      int _placingSpaceYShift = this.placingSpaceYShift(shape);
      _xifexpression = (_ycor + _placingSpaceYShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _xWithoutShift(final CDRoundedRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RoundedRectangleLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _yWithoutShift(final CDRoundedRectangle shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RoundedRectangleLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _width(final CDRoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final CDRoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  public int rx(final CDRoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    return _layout.getCurveWidth();
  }
  
  public int ry(final CDRoundedRectangle shape) {
    RoundedRectangleLayout _layout = shape.getLayout();
    return _layout.getCurveHeight();
  }
  
  public int x1(final Ellipse shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return (_xoffset + _xifexpression);
  }
  
  public int x2(final Ellipse shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _xcor = _common.getXcor();
    int _plus = (_xoffset + _xcor);
    int _width = this.width(shape);
    return (_plus + _width);
  }
  
  public int y1(final Ellipse shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    return (_yoffset + _xifexpression);
  }
  
  public int y2(final Ellipse shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _ycor = _common.getYcor();
    int _plus = (_yoffset + _ycor);
    int _height = this.height(shape);
    return (_plus + _height);
  }
  
  protected int _x(final Ellipse shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    int _plus = (_xoffset + _xifexpression);
    int _rx = this.rx(shape);
    return (_plus + _rx);
  }
  
  protected int _y(final Ellipse shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    int _plus = (_yoffset + _xifexpression);
    int _ry = this.ry(shape);
    return (_plus + _ry);
  }
  
  public int rx(final Ellipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _width = _common.getWidth();
    return (_width / 2);
  }
  
  public int ry(final Ellipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _heigth = _common.getHeigth();
    return (_heigth / 2);
  }
  
  public boolean isCircle(final Ellipse shape) {
    int _rx = this.rx(shape);
    int _ry = this.ry(shape);
    return (_rx == _ry);
  }
  
  protected int _width(final Ellipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final Ellipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  protected int _x(final CDEllipse shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _placingSpaceXShift = this.placingSpaceXShift(shape);
      _xifexpression = (_xcor + _placingSpaceXShift);
    } else {
      _xifexpression = 0;
    }
    int _rx = this.rx(shape);
    return (_xifexpression + _rx);
  }
  
  protected int _y(final CDEllipse shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _ycor = _common.getYcor();
      int _placingSpaceYShift = this.placingSpaceYShift(shape);
      _xifexpression = (_ycor + _placingSpaceYShift);
    } else {
      _xifexpression = 0;
    }
    int _ry = this.ry(shape);
    return (_xifexpression + _ry);
  }
  
  protected int _xWithoutShift(final CDEllipse shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    int _rx = this.rx(shape);
    return (_xifexpression + _rx);
  }
  
  protected int _yWithoutShift(final CDEllipse shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      RectangleEllipseLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    int _ry = this.ry(shape);
    return (_xifexpression + _ry);
  }
  
  public int rx(final CDEllipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _width = _common.getWidth();
    return (_width / 2);
  }
  
  public int ry(final CDEllipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    int _heigth = _common.getHeigth();
    return (_heigth / 2);
  }
  
  public boolean isCircle(final CDEllipse shape) {
    int _rx = this.rx(shape);
    int _ry = this.ry(shape);
    return (_rx == _ry);
  }
  
  protected int _width(final CDEllipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final CDEllipse shape) {
    RectangleEllipseLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  protected int _x(final Text shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      TextLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _y(final Text shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      TextLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    TextLayout _layout_1 = shape.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _heigth = _common_1.getHeigth();
    return (_xifexpression + _heigth);
  }
  
  protected int _width(final Text shape) {
    TextLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final Text shape) {
    TextLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  protected int _x(final CDText shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      TextLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _xcor = _common.getXcor();
      int _placingSpaceXShift = this.placingSpaceXShift(shape);
      _xifexpression = (_xcor + _placingSpaceXShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _y(final CDText shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      TextLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      int _ycor = _common.getYcor();
      int _placingSpaceYShift = this.placingSpaceYShift(shape);
      _xifexpression = (_ycor + _placingSpaceYShift);
    } else {
      _xifexpression = 0;
    }
    TextLayout _layout_1 = shape.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _heigth = _common_1.getHeigth();
    return (_xifexpression + _heigth);
  }
  
  protected int _xWithoutShift(final CDText shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      TextLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getXcor();
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _yWithoutShift(final CDText shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      TextLayout _layout = shape.getLayout();
      CommonLayout _common = _layout.getCommon();
      _xifexpression = _common.getYcor();
    } else {
      _xifexpression = 0;
    }
    TextLayout _layout_1 = shape.getLayout();
    CommonLayout _common_1 = _layout_1.getCommon();
    int _heigth = _common_1.getHeigth();
    return (_xifexpression + _heigth);
  }
  
  protected int _width(final CDText shape) {
    TextLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getWidth();
  }
  
  protected int _height(final CDText shape) {
    TextLayout _layout = shape.getLayout();
    CommonLayout _common = _layout.getCommon();
    return _common.getHeigth();
  }
  
  protected int _x(final Line shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      int _xifexpression_1 = (int) 0;
      int _x1 = this.x1(shape);
      int _x2 = this.x2(shape);
      boolean _lessThan = (_x1 < _x2);
      if (_lessThan) {
        _xifexpression_1 = this.x1(shape);
      } else {
        _xifexpression_1 = this.x2(shape);
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = 0;
    }
    return (_xoffset + _xifexpression);
  }
  
  protected int _y(final Line shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      int _xifexpression_1 = (int) 0;
      int _y1 = this.y1(shape);
      int _y2 = this.y2(shape);
      boolean _lessThan = (_y1 < _y2);
      if (_lessThan) {
        _xifexpression_1 = this.y1(shape);
      } else {
        _xifexpression_1 = this.y2(shape);
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = 0;
    }
    return (_xoffset + _xifexpression);
  }
  
  public int x1(final Line shape) {
    int _xoffset = this.xoffset(shape);
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(0);
    int _xcor = _get.getXcor();
    return (_xoffset + _xcor);
  }
  
  public int y1(final Line shape) {
    int _yoffset = this.yoffset(shape);
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(0);
    int _ycor = _get.getYcor();
    return (_yoffset + _ycor);
  }
  
  public int x2(final Line shape) {
    int _xoffset = this.xoffset(shape);
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    int _xcor = _get.getXcor();
    return (_xoffset + _xcor);
  }
  
  public int y2(final Line shape) {
    int _yoffset = this.yoffset(shape);
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    int _ycor = _get.getYcor();
    return (_yoffset + _ycor);
  }
  
  protected int _width(final Line shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    int _xcor = _get.getXcor();
    LineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Point _get_1 = _point_1.get(0);
    int _xcor_1 = _get_1.getXcor();
    int _minus = (_xcor - _xcor_1);
    return Math.abs(_minus);
  }
  
  protected int _height(final Line shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    int _ycor = _get.getYcor();
    LineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Point _get_1 = _point_1.get(0);
    int _ycor_1 = _get_1.getYcor();
    int _minus = (_ycor - _ycor_1);
    return Math.abs(_minus);
  }
  
  protected int _x(final CDLine shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      int _xifexpression_1 = (int) 0;
      int _x1 = this.x1(shape);
      int _x2 = this.x2(shape);
      boolean _lessThan = (_x1 < _x2);
      if (_lessThan) {
        _xifexpression_1 = this.x1(shape);
      } else {
        _xifexpression_1 = this.x2(shape);
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = 0;
    }
    int _placingSpaceXShift = this.placingSpaceXShift(shape);
    return (_xifexpression + _placingSpaceXShift);
  }
  
  protected int _y(final CDLine shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      int _xifexpression_1 = (int) 0;
      int _y1 = this.y1(shape);
      int _y2 = this.y2(shape);
      boolean _lessThan = (_y1 < _y2);
      if (_lessThan) {
        _xifexpression_1 = this.y1(shape);
      } else {
        _xifexpression_1 = this.y2(shape);
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = 0;
    }
    int _placingSpaceYShift = this.placingSpaceYShift(shape);
    return (_xifexpression + _placingSpaceYShift);
  }
  
  protected int _xWithoutShift(final CDLine shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      int _xifexpression_1 = (int) 0;
      int _x1 = this.x1(shape);
      int _x2 = this.x2(shape);
      boolean _lessThan = (_x1 < _x2);
      if (_lessThan) {
        _xifexpression_1 = this.x1(shape);
      } else {
        _xifexpression_1 = this.x2(shape);
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _yWithoutShift(final CDLine shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      int _xifexpression_1 = (int) 0;
      int _y1 = this.y1(shape);
      int _y2 = this.y2(shape);
      boolean _lessThan = (_y1 < _y2);
      if (_lessThan) {
        _xifexpression_1 = this.y1(shape);
      } else {
        _xifexpression_1 = this.y2(shape);
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  public int x1(final CDLine shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(0);
    return _get.getXcor();
  }
  
  public int y1(final CDLine shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(0);
    return _get.getYcor();
  }
  
  public int x2(final CDLine shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    return _get.getXcor();
  }
  
  public int y2(final CDLine shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    return _get.getYcor();
  }
  
  protected int _width(final CDLine shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    int _xcor = _get.getXcor();
    LineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Point _get_1 = _point_1.get(0);
    int _xcor_1 = _get_1.getXcor();
    int _minus = (_xcor - _xcor_1);
    return Math.abs(_minus);
  }
  
  protected int _height(final CDLine shape) {
    LineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Point _get = _point.get(1);
    int _ycor = _get.getYcor();
    LineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Point _get_1 = _point_1.get(0);
    int _ycor_1 = _get_1.getYcor();
    int _minus = (_ycor - _ycor_1);
    return Math.abs(_minus);
  }
  
  protected int _x(final Polyline shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minXPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_xoffset + (_xifexpression).intValue());
  }
  
  protected int _y(final Polyline shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minYPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_yoffset + (_xifexpression).intValue());
  }
  
  protected int _width(final Polyline shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxXPoint = this.maxXPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minXPoint = this.minXPoint(_point_1);
    return ((_maxXPoint).intValue() - (_minXPoint).intValue());
  }
  
  protected int _height(final Polyline shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxYPoint = this.maxYPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minYPoint = this.minYPoint(_point_1);
    return ((_maxYPoint).intValue() - (_minYPoint).intValue());
  }
  
  protected int _x(final CDPolyline shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      Integer _minXPoint = this.minXPoint(_point);
      int _placingSpaceXShift = this.placingSpaceXShift(shape);
      _xifexpression = ((_minXPoint).intValue() + _placingSpaceXShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _y(final CDPolyline shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      Integer _minYPoint = this.minYPoint(_point);
      int _placingSpaceYShift = this.placingSpaceYShift(shape);
      _xifexpression = ((_minYPoint).intValue() + _placingSpaceYShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _xWithoutShift(final CDPolyline shape, final boolean child) {
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minXPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_xifexpression).intValue();
  }
  
  protected int _yWithoutShift(final CDPolyline shape, final boolean child) {
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minYPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_xifexpression).intValue();
  }
  
  protected int _width(final CDPolyline shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxXPoint = this.maxXPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minXPoint = this.minXPoint(_point_1);
    return ((_maxXPoint).intValue() - (_minXPoint).intValue());
  }
  
  protected int _height(final CDPolyline shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxYPoint = this.maxYPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minYPoint = this.minYPoint(_point_1);
    return ((_maxYPoint).intValue() - (_minYPoint).intValue());
  }
  
  protected int _x(final Polygon shape, final boolean child) {
    int _xoffset = this.xoffset(shape);
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minXPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_xoffset + (_xifexpression).intValue());
  }
  
  protected int _y(final Polygon shape, final boolean child) {
    int _yoffset = this.yoffset(shape);
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minYPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_yoffset + (_xifexpression).intValue());
  }
  
  protected int _width(final Polygon shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxXPoint = this.maxXPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minXPoint = this.minXPoint(_point_1);
    return ((_maxXPoint).intValue() - (_minXPoint).intValue());
  }
  
  protected int _height(final Polygon shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxYPoint = this.maxYPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minYPoint = this.minYPoint(_point_1);
    return ((_maxYPoint).intValue() - (_minYPoint).intValue());
  }
  
  protected int _x(final CDPolygon shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      Integer _minXPoint = this.minXPoint(_point);
      int _placingSpaceXShift = this.placingSpaceXShift(shape);
      _xifexpression = ((_minXPoint).intValue() + _placingSpaceXShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _y(final CDPolygon shape, final boolean child) {
    int _xifexpression = (int) 0;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      Integer _minYPoint = this.minYPoint(_point);
      int _placingSpaceYShift = this.placingSpaceYShift(shape);
      _xifexpression = ((_minYPoint).intValue() + _placingSpaceYShift);
    } else {
      _xifexpression = 0;
    }
    return _xifexpression;
  }
  
  protected int _xWithoutShift(final CDPolygon shape, final boolean child) {
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minXPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_xifexpression).intValue();
  }
  
  protected int _yWithoutShift(final CDPolygon shape, final boolean child) {
    Integer _xifexpression = null;
    boolean _or = false;
    if (child) {
      _or = true;
    } else {
      EObject _eContainer = shape.eContainer();
      _or = (_eContainer instanceof ShapeContainerElement);
    }
    if (_or) {
      PolyLineLayout _layout = shape.getLayout();
      EList<Point> _point = _layout.getPoint();
      _xifexpression = this.minYPoint(_point);
    } else {
      _xifexpression = Integer.valueOf(0);
    }
    return (_xifexpression).intValue();
  }
  
  protected int _width(final CDPolygon shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxXPoint = this.maxXPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minXPoint = this.minXPoint(_point_1);
    return ((_maxXPoint).intValue() - (_minXPoint).intValue());
  }
  
  protected int _height(final CDPolygon shape) {
    PolyLineLayout _layout = shape.getLayout();
    EList<Point> _point = _layout.getPoint();
    Integer _maxYPoint = this.maxYPoint(_point);
    PolyLineLayout _layout_1 = shape.getLayout();
    EList<Point> _point_1 = _layout_1.getPoint();
    Integer _minYPoint = this.minYPoint(_point_1);
    return ((_maxYPoint).intValue() - (_minYPoint).intValue());
  }
  
  protected int _x(final Point point, final boolean child) {
    int _xoffset = this.xoffset(point);
    int _xcor = point.getXcor();
    return (_xoffset + _xcor);
  }
  
  protected int _y(final Point point, final boolean child) {
    int _xoffset = this.xoffset(point);
    int _ycor = point.getYcor();
    return (_xoffset + _ycor);
  }
  
  private int _grandParentX(final Ellipse shape) {
    int _parentX = this.parentX(shape);
    EObject _eContainer = shape.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    int _x1 = this.x1(shape, _notEquals);
    return (_parentX + _x1);
  }
  
  private int _grandParentY(final Ellipse shape) {
    int _parentY = this.parentY(shape);
    EObject _eContainer = shape.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    int _y1 = this.y1(shape, _notEquals);
    return (_parentY + _y1);
  }
  
  private int _grandParentX(final EObject shape) {
    int _parentX = this.parentX(shape);
    EObject _eContainer = shape.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    int _x = this.x(shape, _notEquals);
    return (_parentX + _x);
  }
  
  private int _grandParentY(final EObject shape) {
    int _parentY = this.parentY(shape);
    EObject _eContainer = shape.eContainer();
    boolean _notEquals = (!Objects.equal(_eContainer, null));
    int _y = this.y(shape, _notEquals);
    return (_parentY + _y);
  }
  
  private int _grandParentX(final Object shape) {
    return 0;
  }
  
  private int _grandParentY(final Object shape) {
    return 0;
  }
  
  protected int _parentX(final Ellipse shape) {
    int _xifexpression = (int) 0;
    EObject _eContainer = shape.eContainer();
    if ((_eContainer instanceof ShapeContainerElement)) {
      _xifexpression = 0;
    } else {
      EObject _eContainer_1 = shape.eContainer();
      _xifexpression = this.grandParentX(_eContainer_1);
    }
    return _xifexpression;
  }
  
  protected int _parentY(final Ellipse shape) {
    int _xifexpression = (int) 0;
    EObject _eContainer = shape.eContainer();
    if ((_eContainer instanceof ShapeContainerElement)) {
      _xifexpression = 0;
    } else {
      EObject _eContainer_1 = shape.eContainer();
      _xifexpression = this.grandParentY(_eContainer_1);
    }
    return _xifexpression;
  }
  
  protected int _parentX(final EObject shape) {
    int _xifexpression = (int) 0;
    EObject _eContainer = shape.eContainer();
    if ((_eContainer instanceof ShapeContainerElement)) {
      _xifexpression = 0;
    } else {
      EObject _eContainer_1 = shape.eContainer();
      _xifexpression = this.grandParentX(_eContainer_1);
    }
    return _xifexpression;
  }
  
  protected int _parentY(final EObject shape) {
    int _xifexpression = (int) 0;
    EObject _eContainer = shape.eContainer();
    if ((_eContainer instanceof ShapeContainerElement)) {
      _xifexpression = 0;
    } else {
      EObject _eContainer_1 = shape.eContainer();
      _xifexpression = this.grandParentY(_eContainer_1);
    }
    return _xifexpression;
  }
  
  protected int _parentX(final Object shape) {
    return 0;
  }
  
  protected int _parentY(final Object shape) {
    return 0;
  }
  
  public Integer minXPoint(final List<Point> points) {
    final Function1<Point, Integer> _function = new Function1<Point, Integer>() {
      @Override
      public Integer apply(final Point p) {
        return Integer.valueOf(p.getXcor());
      }
    };
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer c1, final Integer c2) {
        return Integer.valueOf(((c1).intValue() - (c2).intValue()));
      }
    };
    ArrayList<Integer> _findPoint = this.findPoint(points, _function, _function_1);
    return IterableExtensions.<Integer>head(_findPoint);
  }
  
  public Integer maxXPoint(final List<Point> points) {
    final Function1<Point, Integer> _function = new Function1<Point, Integer>() {
      @Override
      public Integer apply(final Point p) {
        return Integer.valueOf(p.getXcor());
      }
    };
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer c1, final Integer c2) {
        return Integer.valueOf(((c2).intValue() - (c1).intValue()));
      }
    };
    ArrayList<Integer> _findPoint = this.findPoint(points, _function, _function_1);
    return IterableExtensions.<Integer>head(_findPoint);
  }
  
  public Integer minYPoint(final List<Point> points) {
    final Function1<Point, Integer> _function = new Function1<Point, Integer>() {
      @Override
      public Integer apply(final Point p) {
        return Integer.valueOf(p.getYcor());
      }
    };
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer c1, final Integer c2) {
        return Integer.valueOf(((c1).intValue() - (c2).intValue()));
      }
    };
    ArrayList<Integer> _findPoint = this.findPoint(points, _function, _function_1);
    return IterableExtensions.<Integer>head(_findPoint);
  }
  
  public Integer maxYPoint(final List<Point> points) {
    final Function1<Point, Integer> _function = new Function1<Point, Integer>() {
      @Override
      public Integer apply(final Point p) {
        return Integer.valueOf(p.getYcor());
      }
    };
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      @Override
      public Integer apply(final Integer c1, final Integer c2) {
        return Integer.valueOf(((c2).intValue() - (c1).intValue()));
      }
    };
    ArrayList<Integer> _findPoint = this.findPoint(points, _function, _function_1);
    return IterableExtensions.<Integer>head(_findPoint);
  }
  
  public ArrayList<Integer> findPoint(final List<Point> points, final Function1<? super Point, ? extends Integer> coord, final Function2<? super Integer, ? super Integer, ? extends Integer> compare) {
    ArrayList<Integer> _xblockexpression = null;
    {
      final ArrayList<Integer> mappedPoints = CollectionLiterals.<Integer>newArrayList();
      final Function1<Point, Integer> _function = new Function1<Point, Integer>() {
        @Override
        public Integer apply(final Point p) {
          return coord.apply(p);
        }
      };
      List<Integer> _map = ListExtensions.<Point, Integer>map(points, _function);
      List<Integer> _list = IterableExtensions.<Integer>toList(_map);
      Iterables.<Integer>addAll(mappedPoints, _list);
      final Comparator<Integer> _function_1 = new Comparator<Integer>() {
        @Override
        public int compare(final Integer coord1, final Integer coord2) {
          return (compare.apply(coord1, coord2)).intValue();
        }
      };
      mappedPoints.sort(_function_1);
      _xblockexpression = mappedPoints;
    }
    return _xblockexpression;
  }
  
  protected String _lineStyle(final ConnectionDefinition shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final Line shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final CDLine shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final Polyline shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final CDPolyline shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final Polygon shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final CDPolygon shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final Ellipse shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final CDEllipse shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final Rectangle shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final CDRectangle shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final RoundedRectangle shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final CDRoundedRectangle shape) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  protected String _lineStyle(final StyleLayout layout) {
    return this.internalLineStyle(layout);
  }
  
  protected String _lineStyle(final ShapestyleLayout layout) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to StyleLayout");
  }
  
  private String internalLineStyle(final StyleLayout layout) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(layout, null);
      if (_equals) {
        return "";
      }
      String _switchResult = null;
      LineStyle _lineStyle = layout.getLineStyle();
      if (_lineStyle != null) {
        switch (_lineStyle) {
          case DOT:
            String _dotDashArray = this.dotDashArray(layout);
            _switchResult = ("stroke-dasharray: " + _dotDashArray);
            break;
          case DASH:
            String _dotDashDashArray = this.dotDashDashArray(layout);
            _switchResult = ("stroke-dasharray: " + _dotDashDashArray);
            break;
          case DASHDOT:
            String _dashDotDashArray = this.dashDotDashArray(layout);
            _switchResult = ("stroke-dasharray: " + _dashDotDashArray);
            break;
          case DASHDOTDOT:
            String _dashDotDotDashArray = this.dashDotDotDashArray(layout);
            _switchResult = ("stroke-dasharray: " + _dashDotDotDashArray);
            break;
          default:
            _switchResult = "";
            break;
        }
      } else {
        _switchResult = "";
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
  
  private String dotDashArray(final StyleLayout layout) {
    String _xblockexpression = null;
    {
      final Ellipse ellipse = EcoreUtil2.<Ellipse>getContainerOfType(layout, Ellipse.class);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(ellipse, null));
      if (_notEquals) {
        String _xblockexpression_1 = null;
        {
          final double b = this.bowLength(ellipse);
          int _integerValue = this.integerValue(Double.valueOf((2 * b)));
          String _plus = (Integer.valueOf(_integerValue) + ",");
          int _integerValue_1 = this.integerValue(Double.valueOf((2 * b)));
          _xblockexpression_1 = (_plus + Integer.valueOf(_integerValue_1));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = "2,2";
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String dotDashDashArray(final StyleLayout layout) {
    String _xblockexpression = null;
    {
      final Ellipse ellipse = EcoreUtil2.<Ellipse>getContainerOfType(layout, Ellipse.class);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(ellipse, null));
      if (_notEquals) {
        String _xblockexpression_1 = null;
        {
          final double b = this.bowLength(ellipse);
          int _integerValue = this.integerValue(Double.valueOf((8 * b)));
          String _plus = (Integer.valueOf(_integerValue) + ",");
          int _integerValue_1 = this.integerValue(Double.valueOf((6 * b)));
          _xblockexpression_1 = (_plus + Integer.valueOf(_integerValue_1));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = "8,6";
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String dashDotDashArray(final StyleLayout layout) {
    String _xblockexpression = null;
    {
      final Ellipse ellipse = EcoreUtil2.<Ellipse>getContainerOfType(layout, Ellipse.class);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(ellipse, null));
      if (_notEquals) {
        String _xblockexpression_1 = null;
        {
          final double b = this.bowLength(ellipse);
          int _integerValue = this.integerValue(Double.valueOf((8 * b)));
          String _plus = (Integer.valueOf(_integerValue) + ",");
          int _integerValue_1 = this.integerValue(Double.valueOf((4 * b)));
          String _plus_1 = (_plus + Integer.valueOf(_integerValue_1));
          String _plus_2 = (_plus_1 + ",");
          int _integerValue_2 = this.integerValue(Double.valueOf((2 * b)));
          String _plus_3 = (_plus_2 + Integer.valueOf(_integerValue_2));
          String _plus_4 = (_plus_3 + ",");
          int _integerValue_3 = this.integerValue(Double.valueOf((4 * b)));
          _xblockexpression_1 = (_plus_4 + Integer.valueOf(_integerValue_3));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = "8,4,2,4";
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private String dashDotDotDashArray(final StyleLayout layout) {
    String _xblockexpression = null;
    {
      final Ellipse ellipse = EcoreUtil2.<Ellipse>getContainerOfType(layout, Ellipse.class);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(ellipse, null));
      if (_notEquals) {
        String _xblockexpression_1 = null;
        {
          final double b = this.bowLength(ellipse);
          int _integerValue = this.integerValue(Double.valueOf((8 * b)));
          String _plus = (Integer.valueOf(_integerValue) + ",");
          int _integerValue_1 = this.integerValue(Double.valueOf((4 * b)));
          String _plus_1 = (_plus + Integer.valueOf(_integerValue_1));
          String _plus_2 = (_plus_1 + ",");
          int _integerValue_2 = this.integerValue(Double.valueOf((2 * b)));
          String _plus_3 = (_plus_2 + Integer.valueOf(_integerValue_2));
          String _plus_4 = (_plus_3 + ",");
          int _integerValue_3 = this.integerValue(Double.valueOf((4 * b)));
          String _plus_5 = (_plus_4 + Integer.valueOf(_integerValue_3));
          String _plus_6 = (_plus_5 + ",");
          int _integerValue_4 = this.integerValue(Double.valueOf((2 * b)));
          String _plus_7 = (_plus_6 + Integer.valueOf(_integerValue_4));
          String _plus_8 = (_plus_7 + ",");
          int _integerValue_5 = this.integerValue(Double.valueOf((4 * b)));
          _xblockexpression_1 = (_plus_8 + Integer.valueOf(_integerValue_5));
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = "8,4,2,4,2,4";
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public double bowLength(final Ellipse ellipse) {
    int _rx = this.rx(ellipse);
    double _multiply = (Math.PI * _rx);
    double _multiply_1 = (_multiply * 2);
    return (_multiply_1 / 180);
  }
  
  public int integerValue(final Double doubleValue) {
    Double _valueOf = Double.valueOf((doubleValue).doubleValue());
    return this.nullSafeIntValue(_valueOf);
  }
  
  public int placingSpaceXShift(final EObject shape) {
    int _xblockexpression = (int) 0;
    {
      final ConnectionDefinition connectionDefinition = EcoreUtil2.<ConnectionDefinition>getContainerOfType(shape, ConnectionDefinition.class);
      int _xifexpression = (int) 0;
      boolean _notEquals = (!Objects.equal(connectionDefinition, null));
      if (_notEquals) {
        _xifexpression = this.placingSpaceXShift(connectionDefinition);
      } else {
        _xifexpression = 0;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public int placingSpaceXShift(final ConnectionDefinition shape) {
    int _xblockexpression = (int) 0;
    {
      EList<PlacingDefinition> _placing = shape.getPlacing();
      final Function1<PlacingDefinition, Integer> _function = new Function1<PlacingDefinition, Integer>() {
        @Override
        public Integer apply(final PlacingDefinition pd) {
          int _defaultConnectionX1 = LayoutExtensions.this.defaultConnectionX1();
          int _defaultConnectionWidth = LayoutExtensions.this.defaultConnectionWidth();
          double _offset = pd.getOffset();
          double _multiply = (_defaultConnectionWidth * _offset);
          double _plus = (_defaultConnectionX1 + _multiply);
          ShapeConnection _shapeCon = pd.getShapeCon();
          int _xWithoutShift = LayoutExtensions.this.xWithoutShift(_shapeCon, true);
          double _plus_1 = (_plus + _xWithoutShift);
          Double _valueOf = Double.valueOf(_plus_1);
          return Integer.valueOf(LayoutExtensions.this.nullSafeIntValue(_valueOf));
        }
      };
      List<Integer> _map = ListExtensions.<PlacingDefinition, Integer>map(_placing, _function);
      List<Integer> _sort = IterableExtensions.<Integer>sort(_map);
      final Integer x = IterableExtensions.<Integer>head(_sort);
      int _xifexpression = (int) 0;
      boolean _or = false;
      boolean _equals = Objects.equal(x, null);
      if (_equals) {
        _or = true;
      } else {
        _or = ((x).intValue() > 0);
      }
      if (_or) {
        _xifexpression = 0;
      } else {
        _xifexpression = Math.abs((x).intValue());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Integer placingSpaceAdditionalWidth(final ConnectionDefinition shape) {
    EList<PlacingDefinition> _placing = shape.getPlacing();
    final Function1<PlacingDefinition, Integer> _function = new Function1<PlacingDefinition, Integer>() {
      @Override
      public Integer apply(final PlacingDefinition pd) {
        int _defaultConnectionX1 = LayoutExtensions.this.defaultConnectionX1();
        int _defaultConnectionWidth = LayoutExtensions.this.defaultConnectionWidth();
        double _offset = pd.getOffset();
        double _multiply = (_defaultConnectionWidth * _offset);
        ShapeConnection _shapeCon = pd.getShapeCon();
        int _xWithoutShift = LayoutExtensions.this.xWithoutShift(_shapeCon, true);
        ShapeConnection _shapeCon_1 = pd.getShapeCon();
        int _width = LayoutExtensions.this.width(_shapeCon_1);
        int _plus = (_xWithoutShift + _width);
        double _plus_1 = (_multiply + _plus);
        double _plus_2 = (_defaultConnectionX1 + _plus_1);
        int _defaultConnectionWidth_1 = LayoutExtensions.this.defaultConnectionWidth();
        double _minus = (_plus_2 - _defaultConnectionWidth_1);
        Double _valueOf = Double.valueOf(_minus);
        return Integer.valueOf(LayoutExtensions.this.nullSafeIntValue(_valueOf));
      }
    };
    List<Integer> _map = ListExtensions.<PlacingDefinition, Integer>map(_placing, _function);
    List<Integer> _sort = IterableExtensions.<Integer>sort(_map);
    return IterableExtensions.<Integer>last(_sort);
  }
  
  public int nullSafeIntValue(final Double doubleValue) {
    int _xifexpression = (int) 0;
    boolean _equals = Objects.equal(doubleValue, null);
    if (_equals) {
      _xifexpression = 0;
    } else {
      _xifexpression = doubleValue.intValue();
    }
    return _xifexpression;
  }
  
  public int placingSpaceYShift(final EObject shape) {
    int _xblockexpression = (int) 0;
    {
      final ConnectionDefinition connectionDefinition = EcoreUtil2.<ConnectionDefinition>getContainerOfType(shape, ConnectionDefinition.class);
      int _xifexpression = (int) 0;
      boolean _notEquals = (!Objects.equal(connectionDefinition, null));
      if (_notEquals) {
        _xifexpression = this.placingSpaceYShift(connectionDefinition);
      } else {
        _xifexpression = 0;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public int placingSpaceYShift(final ConnectionDefinition shape) {
    int _xblockexpression = (int) 0;
    {
      EList<PlacingDefinition> _placing = shape.getPlacing();
      final Function1<PlacingDefinition, Integer> _function = new Function1<PlacingDefinition, Integer>() {
        @Override
        public Integer apply(final PlacingDefinition pd) {
          int _defaultConnectionY1 = LayoutExtensions.this.defaultConnectionY1();
          ShapeConnection _shapeCon = pd.getShapeCon();
          int _yWithoutShift = LayoutExtensions.this.yWithoutShift(_shapeCon, true);
          int _plus = (_defaultConnectionY1 + _yWithoutShift);
          return Integer.valueOf(Math.abs(_plus));
        }
      };
      List<Integer> _map = ListExtensions.<PlacingDefinition, Integer>map(_placing, _function);
      List<Integer> _sort = IterableExtensions.<Integer>sort(_map);
      final Integer y = IterableExtensions.<Integer>head(_sort);
      int _xifexpression = (int) 0;
      boolean _or = false;
      boolean _equals = Objects.equal(y, null);
      if (_equals) {
        _or = true;
      } else {
        _or = ((y).intValue() > 0);
      }
      if (_or) {
        _xifexpression = 0;
      } else {
        _xifexpression = Math.abs((y).intValue());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Integer placingSpaceAdditionalHeight(final ConnectionDefinition shape) {
    EList<PlacingDefinition> _placing = shape.getPlacing();
    final Function1<PlacingDefinition, Integer> _function = new Function1<PlacingDefinition, Integer>() {
      @Override
      public Integer apply(final PlacingDefinition pd) {
        int _defaultConnectionY2 = LayoutExtensions.this.defaultConnectionY2();
        int _defaultConnectionHeight = LayoutExtensions.this.defaultConnectionHeight();
        double _offset = pd.getOffset();
        double _multiply = (_defaultConnectionHeight * _offset);
        ShapeConnection _shapeCon = pd.getShapeCon();
        int _yWithoutShift = LayoutExtensions.this.yWithoutShift(_shapeCon, true);
        ShapeConnection _shapeCon_1 = pd.getShapeCon();
        int _height = LayoutExtensions.this.height(_shapeCon_1);
        int _plus = (_yWithoutShift + _height);
        double _plus_1 = (_multiply + _plus);
        double _plus_2 = (_defaultConnectionY2 + _plus_1);
        int _defaultConnectionHeight_1 = LayoutExtensions.this.defaultConnectionHeight();
        double _minus = (_plus_2 - _defaultConnectionHeight_1);
        Double _valueOf = Double.valueOf(_minus);
        return Integer.valueOf(LayoutExtensions.this.nullSafeIntValue(_valueOf));
      }
    };
    List<Integer> _map = ListExtensions.<PlacingDefinition, Integer>map(_placing, _function);
    List<Integer> _sort = IterableExtensions.<Integer>sort(_map);
    return IterableExtensions.<Integer>last(_sort);
  }
  
  protected int _x(final AnchorFixPointPosition pos, final boolean child) {
    return pos.getXcor();
  }
  
  protected int _y(final AnchorFixPointPosition pos, final boolean child) {
    return pos.getYcor();
  }
  
  protected int _x(final AnchorRelativePosition pos, final boolean child) {
    int _xblockexpression = (int) 0;
    {
      final ShapeDefinition shapeDef = EcoreUtil2.<ShapeDefinition>getContainerOfType(pos, ShapeDefinition.class);
      _xblockexpression = 0;
    }
    return _xblockexpression;
  }
  
  protected int _y(final AnchorRelativePosition pos, final boolean child) {
    int _xblockexpression = (int) 0;
    {
      final ShapeDefinition shapeDef = EcoreUtil2.<ShapeDefinition>getContainerOfType(pos, ShapeDefinition.class);
      _xblockexpression = 0;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _color(final RGBColor color) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    int _red = color.getRed();
    String _hexString = Integer.toHexString(_red);
    _builder.append(_hexString, "");
    int _green = color.getGreen();
    String _hexString_1 = Integer.toHexString(_green);
    _builder.append(_hexString_1, "");
    int _blue = color.getBlue();
    String _hexString_2 = Integer.toHexString(_blue);
    _builder.append(_hexString_2, "");
    return _builder;
  }
  
  protected CharSequence _color(final ColorConstantRef color) {
    ColorConstants _value = color.getValue();
    return _value.getName();
  }
  
  protected CharSequence _color(final ColorWithTransparency color) {
    return "white";
  }
  
  public boolean hasTransparency(final ShapestyleLayout ssl) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to ShapestyleLayout");
  }
  
  public Object transparency(final ShapestyleLayout ssl) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to ShapestyleLayout");
  }
  
  public int width(final EObject shape) {
    if (shape instanceof CDEllipse) {
      return _width((CDEllipse)shape);
    } else if (shape instanceof CDLine) {
      return _width((CDLine)shape);
    } else if (shape instanceof CDPolygon) {
      return _width((CDPolygon)shape);
    } else if (shape instanceof CDPolyline) {
      return _width((CDPolyline)shape);
    } else if (shape instanceof CDRectangle) {
      return _width((CDRectangle)shape);
    } else if (shape instanceof CDRoundedRectangle) {
      return _width((CDRoundedRectangle)shape);
    } else if (shape instanceof CDText) {
      return _width((CDText)shape);
    } else if (shape instanceof ConnectionDefinition) {
      return _width((ConnectionDefinition)shape);
    } else if (shape instanceof Ellipse) {
      return _width((Ellipse)shape);
    } else if (shape instanceof Line) {
      return _width((Line)shape);
    } else if (shape instanceof Polygon) {
      return _width((Polygon)shape);
    } else if (shape instanceof Polyline) {
      return _width((Polyline)shape);
    } else if (shape instanceof Rectangle) {
      return _width((Rectangle)shape);
    } else if (shape instanceof RoundedRectangle) {
      return _width((RoundedRectangle)shape);
    } else if (shape instanceof ShapeDefinition) {
      return _width((ShapeDefinition)shape);
    } else if (shape instanceof Text) {
      return _width((Text)shape);
    } else if (shape instanceof PlacingDefinition) {
      return _width((PlacingDefinition)shape);
    } else if (shape != null) {
      return _width(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public int height(final EObject shape) {
    if (shape instanceof CDEllipse) {
      return _height((CDEllipse)shape);
    } else if (shape instanceof CDLine) {
      return _height((CDLine)shape);
    } else if (shape instanceof CDPolygon) {
      return _height((CDPolygon)shape);
    } else if (shape instanceof CDPolyline) {
      return _height((CDPolyline)shape);
    } else if (shape instanceof CDRectangle) {
      return _height((CDRectangle)shape);
    } else if (shape instanceof CDRoundedRectangle) {
      return _height((CDRoundedRectangle)shape);
    } else if (shape instanceof CDText) {
      return _height((CDText)shape);
    } else if (shape instanceof ConnectionDefinition) {
      return _height((ConnectionDefinition)shape);
    } else if (shape instanceof Ellipse) {
      return _height((Ellipse)shape);
    } else if (shape instanceof Line) {
      return _height((Line)shape);
    } else if (shape instanceof Polygon) {
      return _height((Polygon)shape);
    } else if (shape instanceof Polyline) {
      return _height((Polyline)shape);
    } else if (shape instanceof Rectangle) {
      return _height((Rectangle)shape);
    } else if (shape instanceof RoundedRectangle) {
      return _height((RoundedRectangle)shape);
    } else if (shape instanceof ShapeDefinition) {
      return _height((ShapeDefinition)shape);
    } else if (shape instanceof Text) {
      return _height((Text)shape);
    } else if (shape instanceof PlacingDefinition) {
      return _height((PlacingDefinition)shape);
    } else if (shape != null) {
      return _height(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public int xoffset(final EObject shape) {
    if (shape instanceof ConnectionDefinition) {
      return _xoffset((ConnectionDefinition)shape);
    } else if (shape instanceof PlacingDefinition) {
      return _xoffset((PlacingDefinition)shape);
    } else if (shape instanceof ShapeConnection) {
      return _xoffset((ShapeConnection)shape);
    } else if (shape != null) {
      return _xoffset(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public int yoffset(final EObject shape) {
    if (shape instanceof ConnectionDefinition) {
      return _yoffset((ConnectionDefinition)shape);
    } else if (shape instanceof PlacingDefinition) {
      return _yoffset((PlacingDefinition)shape);
    } else if (shape instanceof ShapeConnection) {
      return _yoffset((ShapeConnection)shape);
    } else if (shape != null) {
      return _yoffset(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public int x(final EObject pos, final boolean child) {
    if (pos instanceof AnchorFixPointPosition) {
      return _x((AnchorFixPointPosition)pos, child);
    } else if (pos instanceof AnchorRelativePosition) {
      return _x((AnchorRelativePosition)pos, child);
    } else if (pos instanceof CDEllipse) {
      return _x((CDEllipse)pos, child);
    } else if (pos instanceof CDLine) {
      return _x((CDLine)pos, child);
    } else if (pos instanceof CDPolygon) {
      return _x((CDPolygon)pos, child);
    } else if (pos instanceof CDPolyline) {
      return _x((CDPolyline)pos, child);
    } else if (pos instanceof CDRectangle) {
      return _x((CDRectangle)pos, child);
    } else if (pos instanceof CDRoundedRectangle) {
      return _x((CDRoundedRectangle)pos, child);
    } else if (pos instanceof CDText) {
      return _x((CDText)pos, child);
    } else if (pos instanceof Ellipse) {
      return _x((Ellipse)pos, child);
    } else if (pos instanceof Line) {
      return _x((Line)pos, child);
    } else if (pos instanceof Polygon) {
      return _x((Polygon)pos, child);
    } else if (pos instanceof Polyline) {
      return _x((Polyline)pos, child);
    } else if (pos instanceof Rectangle) {
      return _x((Rectangle)pos, child);
    } else if (pos instanceof RoundedRectangle) {
      return _x((RoundedRectangle)pos, child);
    } else if (pos instanceof Text) {
      return _x((Text)pos, child);
    } else if (pos instanceof Point) {
      return _x((Point)pos, child);
    } else if (pos != null) {
      return _x(pos, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pos, child).toString());
    }
  }
  
  public int y(final EObject pos, final boolean child) {
    if (pos instanceof AnchorFixPointPosition) {
      return _y((AnchorFixPointPosition)pos, child);
    } else if (pos instanceof AnchorRelativePosition) {
      return _y((AnchorRelativePosition)pos, child);
    } else if (pos instanceof CDEllipse) {
      return _y((CDEllipse)pos, child);
    } else if (pos instanceof CDLine) {
      return _y((CDLine)pos, child);
    } else if (pos instanceof CDPolygon) {
      return _y((CDPolygon)pos, child);
    } else if (pos instanceof CDPolyline) {
      return _y((CDPolyline)pos, child);
    } else if (pos instanceof CDRectangle) {
      return _y((CDRectangle)pos, child);
    } else if (pos instanceof CDRoundedRectangle) {
      return _y((CDRoundedRectangle)pos, child);
    } else if (pos instanceof CDText) {
      return _y((CDText)pos, child);
    } else if (pos instanceof Ellipse) {
      return _y((Ellipse)pos, child);
    } else if (pos instanceof Line) {
      return _y((Line)pos, child);
    } else if (pos instanceof Polygon) {
      return _y((Polygon)pos, child);
    } else if (pos instanceof Polyline) {
      return _y((Polyline)pos, child);
    } else if (pos instanceof Rectangle) {
      return _y((Rectangle)pos, child);
    } else if (pos instanceof RoundedRectangle) {
      return _y((RoundedRectangle)pos, child);
    } else if (pos instanceof Text) {
      return _y((Text)pos, child);
    } else if (pos instanceof Point) {
      return _y((Point)pos, child);
    } else if (pos != null) {
      return _y(pos, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(pos, child).toString());
    }
  }
  
  public int xWithoutShift(final ShapeConnection shape, final boolean child) {
    if (shape instanceof CDEllipse) {
      return _xWithoutShift((CDEllipse)shape, child);
    } else if (shape instanceof CDLine) {
      return _xWithoutShift((CDLine)shape, child);
    } else if (shape instanceof CDPolygon) {
      return _xWithoutShift((CDPolygon)shape, child);
    } else if (shape instanceof CDPolyline) {
      return _xWithoutShift((CDPolyline)shape, child);
    } else if (shape instanceof CDRectangle) {
      return _xWithoutShift((CDRectangle)shape, child);
    } else if (shape instanceof CDRoundedRectangle) {
      return _xWithoutShift((CDRoundedRectangle)shape, child);
    } else if (shape instanceof CDText) {
      return _xWithoutShift((CDText)shape, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape, child).toString());
    }
  }
  
  public int yWithoutShift(final ShapeConnection shape, final boolean child) {
    if (shape instanceof CDEllipse) {
      return _yWithoutShift((CDEllipse)shape, child);
    } else if (shape instanceof CDLine) {
      return _yWithoutShift((CDLine)shape, child);
    } else if (shape instanceof CDPolygon) {
      return _yWithoutShift((CDPolygon)shape, child);
    } else if (shape instanceof CDPolyline) {
      return _yWithoutShift((CDPolyline)shape, child);
    } else if (shape instanceof CDRectangle) {
      return _yWithoutShift((CDRectangle)shape, child);
    } else if (shape instanceof CDRoundedRectangle) {
      return _yWithoutShift((CDRoundedRectangle)shape, child);
    } else if (shape instanceof CDText) {
      return _yWithoutShift((CDText)shape, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape, child).toString());
    }
  }
  
  private int grandParentX(final Object shape) {
    if (shape instanceof Ellipse) {
      return _grandParentX((Ellipse)shape);
    } else if (shape instanceof EObject) {
      return _grandParentX((EObject)shape);
    } else if (shape != null) {
      return _grandParentX(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  private int grandParentY(final Object shape) {
    if (shape instanceof Ellipse) {
      return _grandParentY((Ellipse)shape);
    } else if (shape instanceof EObject) {
      return _grandParentY((EObject)shape);
    } else if (shape != null) {
      return _grandParentY(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public int parentX(final Object shape) {
    if (shape instanceof Ellipse) {
      return _parentX((Ellipse)shape);
    } else if (shape instanceof EObject) {
      return _parentX((EObject)shape);
    } else if (shape != null) {
      return _parentX(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public int parentY(final Object shape) {
    if (shape instanceof Ellipse) {
      return _parentY((Ellipse)shape);
    } else if (shape instanceof EObject) {
      return _parentY((EObject)shape);
    } else if (shape != null) {
      return _parentY(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public String lineStyle(final EObject shape) {
    if (shape instanceof CDEllipse) {
      return _lineStyle((CDEllipse)shape);
    } else if (shape instanceof CDLine) {
      return _lineStyle((CDLine)shape);
    } else if (shape instanceof CDPolygon) {
      return _lineStyle((CDPolygon)shape);
    } else if (shape instanceof CDPolyline) {
      return _lineStyle((CDPolyline)shape);
    } else if (shape instanceof CDRectangle) {
      return _lineStyle((CDRectangle)shape);
    } else if (shape instanceof CDRoundedRectangle) {
      return _lineStyle((CDRoundedRectangle)shape);
    } else if (shape instanceof ConnectionDefinition) {
      return _lineStyle((ConnectionDefinition)shape);
    } else if (shape instanceof Ellipse) {
      return _lineStyle((Ellipse)shape);
    } else if (shape instanceof Line) {
      return _lineStyle((Line)shape);
    } else if (shape instanceof Polygon) {
      return _lineStyle((Polygon)shape);
    } else if (shape instanceof Polyline) {
      return _lineStyle((Polyline)shape);
    } else if (shape instanceof Rectangle) {
      return _lineStyle((Rectangle)shape);
    } else if (shape instanceof RoundedRectangle) {
      return _lineStyle((RoundedRectangle)shape);
    } else if (shape instanceof ShapestyleLayout) {
      return _lineStyle((ShapestyleLayout)shape);
    } else if (shape instanceof StyleLayout) {
      return _lineStyle((StyleLayout)shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  public CharSequence color(final ColorWithTransparency color) {
    if (color instanceof ColorConstantRef) {
      return _color((ColorConstantRef)color);
    } else if (color instanceof RGBColor) {
      return _color((RGBColor)color);
    } else if (color != null) {
      return _color(color);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(color).toString());
    }
  }
}
