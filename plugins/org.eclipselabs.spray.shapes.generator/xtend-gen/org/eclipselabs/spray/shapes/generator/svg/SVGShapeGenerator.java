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
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.shapes.Anchor;
import org.eclipselabs.spray.shapes.AnchorManual;
import org.eclipselabs.spray.shapes.AnchorPosition;
import org.eclipselabs.spray.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.AnchorPredefinied;
import org.eclipselabs.spray.shapes.AnchorType;
import org.eclipselabs.spray.shapes.CDEllipse;
import org.eclipselabs.spray.shapes.CDLine;
import org.eclipselabs.spray.shapes.CDPolygon;
import org.eclipselabs.spray.shapes.CDPolyline;
import org.eclipselabs.spray.shapes.CDRectangle;
import org.eclipselabs.spray.shapes.CDRoundedRectangle;
import org.eclipselabs.spray.shapes.CDText;
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
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.shapes.generator.svg.LayoutExtensions;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.StyleLayout;

/**
 * Generator for SVG representations of ShapeDefinitions.
 */
@SuppressWarnings("all")
public class SVGShapeGenerator {
  @Inject
  @Extension
  private LayoutExtensions _layoutExtensions;
  
  protected CharSequence _generate(final ShapeDefinition shape) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _defs = this.defs(shape);
    _builder.append(_defs, "");
    _builder.newLineIfNotEmpty();
    {
      EList<Shape> _shape = shape.getShape();
      for(final Shape s : _shape) {
        CharSequence _generateShape = this.generateShape(s, false);
        _builder.append(_generateShape, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Anchor _anchor = shape.getAnchor();
      boolean _notEquals = (!Objects.equal(_anchor, null));
      if (_notEquals) {
        Anchor _anchor_1 = shape.getAnchor();
        AnchorType _type = _anchor_1.getType();
        CharSequence _generateAnchor = this.generateAnchor(_type, false);
        _builder.append(_generateAnchor, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final ConnectionDefinition shape) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _defs = this.defs(shape);
    _builder.append(_defs, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<line x1=\"");
    int _defaultConnectionX1 = this._layoutExtensions.defaultConnectionX1();
    int _placingSpaceXShift = this._layoutExtensions.placingSpaceXShift(shape);
    int _plus = (_defaultConnectionX1 + _placingSpaceXShift);
    _builder.append(_plus, "");
    _builder.append("\" y1=\"");
    int _defaultConnectionY1 = this._layoutExtensions.defaultConnectionY1();
    int _placingSpaceYShift = this._layoutExtensions.placingSpaceYShift(shape);
    int _plus_1 = (_defaultConnectionY1 + _placingSpaceYShift);
    _builder.append(_plus_1, "");
    _builder.append("\" x2=\"");
    int _defaultConnectionX2 = this._layoutExtensions.defaultConnectionX2();
    int _placingSpaceXShift_1 = this._layoutExtensions.placingSpaceXShift(shape);
    int _plus_2 = (_defaultConnectionX2 + _placingSpaceXShift_1);
    _builder.append(_plus_2, "");
    _builder.append("\" y2=\"");
    int _defaultConnectionY2 = this._layoutExtensions.defaultConnectionY2();
    int _placingSpaceYShift_1 = this._layoutExtensions.placingSpaceYShift(shape);
    int _plus_3 = (_defaultConnectionY2 + _placingSpaceYShift_1);
    _builder.append(_plus_3, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    {
      EList<PlacingDefinition> _placing = shape.getPlacing();
      for(final PlacingDefinition p : _placing) {
        CharSequence _generateShape = this.generateShape(p, true);
        _builder.append(_generateShape, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public String layouting(final ConnectionDefinition shape) {
    String _xifexpression = null;
    ShapestyleLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      ShapestyleLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final Polyline shape) {
    String _xifexpression = null;
    PolyLineLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      PolyLineLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CDPolyline shape) {
    String _xifexpression = null;
    PolyLineLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      PolyLineLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final Polygon shape) {
    String _xifexpression = null;
    PolyLineLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      PolyLineLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CDPolygon shape) {
    String _xifexpression = null;
    PolyLineLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      PolyLineLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final Ellipse shape) {
    String _xifexpression = null;
    RectangleEllipseLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      RectangleEllipseLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CDEllipse shape) {
    String _xifexpression = null;
    RectangleEllipseLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      RectangleEllipseLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final Rectangle shape) {
    String _xifexpression = null;
    RectangleEllipseLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      RectangleEllipseLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CDRectangle shape) {
    String _xifexpression = null;
    RectangleEllipseLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      RectangleEllipseLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final RoundedRectangle shape) {
    String _xifexpression = null;
    RoundedRectangleLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      RoundedRectangleLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CDRoundedRectangle shape) {
    String _xifexpression = null;
    RoundedRectangleLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      RoundedRectangleLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final Line shape) {
    String _xifexpression = null;
    LineLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      LineLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CDLine shape) {
    String _xifexpression = null;
    LineLayout _layout = shape.getLayout();
    boolean _notEquals = (!Objects.equal(_layout, null));
    if (_notEquals) {
      LineLayout _layout_1 = shape.getLayout();
      CharSequence _styleAttribute = this.styleAttribute(_layout_1);
      String _lineStyle = this._layoutExtensions.lineStyle(shape);
      _xifexpression = this.layouting(_styleAttribute, _lineStyle);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  public String layouting(final CharSequence shapeStyle, final CharSequence lineStyle) {
    String _xblockexpression = null;
    {
      String _string = null;
      if (shapeStyle!=null) {
        _string=shapeStyle.toString();
      }
      final String shapeStyleDef = _string.trim();
      String _string_1 = null;
      if (lineStyle!=null) {
        _string_1=lineStyle.toString();
      }
      final String lineStyleDef = _string_1.trim();
      String _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(shapeStyleDef);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _layoutingLineStyle = this.layoutingLineStyle(lineStyleDef, true);
        String _plus = ((" style=\"" + shapeStyleDef) + _layoutingLineStyle);
        _xifexpression = (_plus + "\"");
      } else {
        _xifexpression = this.layoutingLineStyle(lineStyleDef, false);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String layoutingLineStyle(final String lineStyleDef, final boolean shapeStyleDefined) {
    String _xifexpression = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(lineStyleDef);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      String _xifexpression_1 = null;
      if ((!shapeStyleDefined)) {
        _xifexpression_1 = " style=\"";
      } else {
        _xifexpression_1 = " ";
      }
      String _plus = (_xifexpression_1 + lineStyleDef);
      String _xifexpression_2 = null;
      if ((!shapeStyleDefined)) {
        _xifexpression_2 = "\"";
      } else {
        _xifexpression_2 = "";
      }
      _xifexpression = (_plus + _xifexpression_2);
    } else {
      _xifexpression = "";
    }
    return _xifexpression;
  }
  
  protected CharSequence _generateShape(final Line shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<line x1=\"");
    int _x1 = this._layoutExtensions.x1(shape);
    int _parentX = this._layoutExtensions.parentX(shape);
    int _plus = (_x1 + _parentX);
    _builder.append(_plus, "");
    _builder.append("\" y1=\"");
    int _y1 = this._layoutExtensions.y1(shape);
    int _parentY = this._layoutExtensions.parentY(shape);
    int _plus_1 = (_y1 + _parentY);
    _builder.append(_plus_1, "");
    _builder.append("\" x2=\"");
    int _x2 = this._layoutExtensions.x2(shape);
    int _parentX_1 = this._layoutExtensions.parentX(shape);
    int _plus_2 = (_x2 + _parentX_1);
    _builder.append(_plus_2, "");
    _builder.append("\" y2=\"");
    int _y2 = this._layoutExtensions.y2(shape);
    int _parentY_1 = this._layoutExtensions.parentY(shape);
    int _plus_3 = (_y2 + _parentY_1);
    _builder.append(_plus_3, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDLine shape, final boolean child) {
    CharSequence _xblockexpression = null;
    {
      final int pdOffsetX = this.placingOffsetX(shape);
      final int pdOffsetY = this.placingOffsetY(shape);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<line x1=\"");
      int _x1 = this._layoutExtensions.x1(shape);
      int _parentX = this._layoutExtensions.parentX(shape);
      int _plus = (_x1 + _parentX);
      int _plus_1 = (_plus + pdOffsetX);
      _builder.append(_plus_1, "");
      _builder.append("\" y1=\"");
      int _y1 = this._layoutExtensions.y1(shape);
      int _parentY = this._layoutExtensions.parentY(shape);
      int _plus_2 = (_y1 + _parentY);
      int _plus_3 = (_plus_2 + pdOffsetY);
      _builder.append(_plus_3, "");
      _builder.append("\" x2=\"");
      int _x2 = this._layoutExtensions.x2(shape);
      int _parentX_1 = this._layoutExtensions.parentX(shape);
      int _plus_4 = (_x2 + _parentX_1);
      int _plus_5 = (_plus_4 + pdOffsetX);
      _builder.append(_plus_5, "");
      _builder.append("\" y2=\"");
      int _y2 = this._layoutExtensions.y2(shape);
      int _parentY_1 = this._layoutExtensions.parentY(shape);
      int _plus_6 = (_y2 + _parentY_1);
      int _plus_7 = (_plus_6 + pdOffsetY);
      _builder.append(_plus_7, "");
      _builder.append("\"");
      String _layouting = this.layouting(shape);
      _builder.append(_layouting, "");
      _builder.append("/>");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _generateShape(final Polyline shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<polyline points=\"");
    CharSequence _points = this.points(shape, child);
    _builder.append(_points, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDPolyline shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<polyline points=\"");
    int _placingOffsetX = this.placingOffsetX(shape);
    int _placingOffsetY = this.placingOffsetY(shape);
    CharSequence _points = this.points(shape, child, _placingOffsetX, _placingOffsetY);
    _builder.append(_points, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence points(final Polyline pl, final boolean child, final int xOffset, final int yOffset) {
    CharSequence _xblockexpression = null;
    {
      final int parentX = this._layoutExtensions.parentX(pl);
      final int parentY = this._layoutExtensions.parentY(pl);
      StringConcatenation _builder = new StringConcatenation();
      {
        PolyLineLayout _layout = pl.getLayout();
        EList<Point> _point = _layout.getPoint();
        boolean _hasElements = false;
        for(final Point p : _point) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "");
          }
          int _xcor = p.getXcor();
          int _plus = (_xcor + parentX);
          int _plus_1 = (_plus + xOffset);
          _builder.append(_plus_1, "");
          _builder.append(" ");
          int _ycor = p.getYcor();
          int _plus_2 = (_ycor + parentY);
          int _plus_3 = (_plus_2 + yOffset);
          _builder.append(_plus_3, "");
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence points(final Polyline pl, final boolean child) {
    return this.points(pl, child, 0, 0);
  }
  
  protected CharSequence points(final CDPolyline pl, final boolean child, final int xOffset, final int yOffset) {
    CharSequence _xblockexpression = null;
    {
      final int parentX = this._layoutExtensions.parentX(pl);
      final int parentY = this._layoutExtensions.parentY(pl);
      StringConcatenation _builder = new StringConcatenation();
      {
        PolyLineLayout _layout = pl.getLayout();
        EList<Point> _point = _layout.getPoint();
        boolean _hasElements = false;
        for(final Point p : _point) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(",", "");
          }
          int _xcor = p.getXcor();
          int _plus = (_xcor + parentX);
          int _plus_1 = (_plus + xOffset);
          _builder.append(_plus_1, "");
          _builder.append(" ");
          int _ycor = p.getYcor();
          int _plus_2 = (_ycor + parentY);
          int _plus_3 = (_plus_2 + yOffset);
          _builder.append(_plus_3, "");
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence points(final CDPolyline pl, final boolean child) {
    return this.points(pl, child, 0, 0);
  }
  
  protected CharSequence _generateShape(final Polygon shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<polygon points=\"");
    CharSequence _points = this.points(shape, child);
    _builder.append(_points, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    {
      EList<Shape> _shape = shape.getShape();
      for(final Shape subshape : _shape) {
        CharSequence _generateShape = this.generateShape(subshape, true);
        _builder.append(_generateShape, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDPolygon shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<polygon points=\"");
    int _placingOffsetX = this.placingOffsetX(shape);
    int _placingOffsetY = this.placingOffsetY(shape);
    CharSequence _points = this.points(shape, child, _placingOffsetX, _placingOffsetY);
    _builder.append(_points, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence points(final Polygon pl, final boolean child, final int xOffset, final int yOffset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PolyLineLayout _layout = pl.getLayout();
      EList<Point> _point = _layout.getPoint();
      boolean _hasElements = false;
      for(final Point p : _point) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        int _x = this._layoutExtensions.x(p, child);
        int _xifexpression = (int) 0;
        if (child) {
          _xifexpression = this._layoutExtensions.parentX(pl);
        } else {
          _xifexpression = 0;
        }
        int _plus = (_x + _xifexpression);
        int _plus_1 = (_plus + xOffset);
        _builder.append(_plus_1, "");
        _builder.append(" ");
        int _y = this._layoutExtensions.y(p, child);
        int _xifexpression_1 = (int) 0;
        if (child) {
          _xifexpression_1 = this._layoutExtensions.parentY(pl);
        } else {
          _xifexpression_1 = 0;
        }
        int _plus_2 = (_y + _xifexpression_1);
        int _plus_3 = (_plus_2 + yOffset);
        _builder.append(_plus_3, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence points(final Polygon pl, final boolean child) {
    return this.points(pl, child, 0, 0);
  }
  
  protected CharSequence points(final CDPolygon pl, final boolean child, final int xOffset, final int yOffset) {
    StringConcatenation _builder = new StringConcatenation();
    {
      PolyLineLayout _layout = pl.getLayout();
      EList<Point> _point = _layout.getPoint();
      boolean _hasElements = false;
      for(final Point p : _point) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        int _x = this._layoutExtensions.x(p, child);
        int _xifexpression = (int) 0;
        if (child) {
          _xifexpression = this._layoutExtensions.parentX(pl);
        } else {
          _xifexpression = 0;
        }
        int _plus = (_x + _xifexpression);
        int _plus_1 = (_plus + xOffset);
        _builder.append(_plus_1, "");
        _builder.append(" ");
        int _y = this._layoutExtensions.y(p, child);
        int _xifexpression_1 = (int) 0;
        if (child) {
          _xifexpression_1 = this._layoutExtensions.parentY(pl);
        } else {
          _xifexpression_1 = 0;
        }
        int _plus_2 = (_y + _xifexpression_1);
        int _plus_3 = (_plus_2 + yOffset);
        _builder.append(_plus_3, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence points(final CDPolygon pl, final boolean child) {
    return this.points(pl, child, 0, 0);
  }
  
  protected CharSequence _generateShape(final Rectangle shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<rect ");
    CharSequence _positionAndSize = this.positionAndSize(shape, child);
    _builder.append(_positionAndSize, "");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    {
      EList<Shape> _shape = shape.getShape();
      for(final Shape subshape : _shape) {
        CharSequence _generateShape = this.generateShape(subshape, true);
        _builder.append(_generateShape, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDRectangle shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<rect ");
    int _placingOffsetX = this.placingOffsetX(shape);
    int _placingOffsetY = this.placingOffsetY(shape);
    CharSequence _positionAndSize = this.positionAndSize(shape, child, _placingOffsetX, _placingOffsetY);
    _builder.append(_positionAndSize, "");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final RoundedRectangle shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<rect ");
    CharSequence _positionAndSize = this.positionAndSize(shape, child);
    _builder.append(_positionAndSize, "");
    _builder.append(" rx=\"");
    int _rx = this._layoutExtensions.rx(shape);
    _builder.append(_rx, "");
    _builder.append("\" ry=\"");
    int _ry = this._layoutExtensions.ry(shape);
    _builder.append(_ry, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    {
      EList<Shape> _shape = shape.getShape();
      for(final Shape subshape : _shape) {
        CharSequence _generateShape = this.generateShape(subshape, true);
        _builder.append(_generateShape, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDRoundedRectangle shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<rect ");
    int _placingOffsetX = this.placingOffsetX(shape);
    int _placingOffsetY = this.placingOffsetY(shape);
    CharSequence _positionAndSize = this.positionAndSize(shape, child, _placingOffsetX, _placingOffsetY);
    _builder.append(_positionAndSize, "");
    _builder.append(" rx=\"");
    int _rx = this._layoutExtensions.rx(shape);
    _builder.append(_rx, "");
    _builder.append("\" ry=\"");
    int _ry = this._layoutExtensions.ry(shape);
    _builder.append(_ry, "");
    _builder.append("\"");
    String _layouting = this.layouting(shape);
    _builder.append(_layouting, "");
    _builder.append("/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final Ellipse shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isCircle = this._layoutExtensions.isCircle(shape);
      if (_isCircle) {
        _builder.append("<circle cx=\"");
        int _x = this._layoutExtensions.x(shape, child);
        int _parentX = this._layoutExtensions.parentX(shape);
        int _plus = (_x + _parentX);
        _builder.append(_plus, "");
        _builder.append("\" cy=\"");
        int _y = this._layoutExtensions.y(shape, child);
        int _parentY = this._layoutExtensions.parentY(shape);
        int _plus_1 = (_y + _parentY);
        _builder.append(_plus_1, "");
        _builder.append("\" r=\"");
        int _rx = this._layoutExtensions.rx(shape);
        _builder.append(_rx, "");
        _builder.append("\"");
        String _layouting = this.layouting(shape);
        _builder.append(_layouting, "");
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<ellipse cx=\"");
        int _x_1 = this._layoutExtensions.x(shape, child);
        int _parentX_1 = this._layoutExtensions.parentX(shape);
        int _plus_2 = (_x_1 + _parentX_1);
        _builder.append(_plus_2, "");
        _builder.append("\" cy=\"");
        int _y_1 = this._layoutExtensions.y(shape, child);
        int _parentY_1 = this._layoutExtensions.parentY(shape);
        int _plus_3 = (_y_1 + _parentY_1);
        _builder.append(_plus_3, "");
        _builder.append("\" rx=\"");
        int _rx_1 = this._layoutExtensions.rx(shape);
        _builder.append(_rx_1, "");
        _builder.append("\" ry=\"");
        int _ry = this._layoutExtensions.ry(shape);
        _builder.append(_ry, "");
        _builder.append("\"");
        String _layouting_1 = this.layouting(shape);
        _builder.append(_layouting_1, "");
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Shape> _shape = shape.getShape();
      for(final Shape subshape : _shape) {
        CharSequence _generateShape = this.generateShape(subshape, true);
        _builder.append(_generateShape, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDEllipse shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isCircle = this._layoutExtensions.isCircle(shape);
      if (_isCircle) {
        _builder.append("<circle cx=\"");
        int _x = this._layoutExtensions.x(shape, child);
        int _parentX = this._layoutExtensions.parentX(shape);
        int _plus = (_x + _parentX);
        int _placingOffsetX = this.placingOffsetX(shape);
        int _plus_1 = (_plus + _placingOffsetX);
        _builder.append(_plus_1, "");
        _builder.append("\" cy=\"");
        int _y = this._layoutExtensions.y(shape, child);
        int _parentY = this._layoutExtensions.parentY(shape);
        int _plus_2 = (_y + _parentY);
        int _placingOffsetY = this.placingOffsetY(shape);
        int _plus_3 = (_plus_2 + _placingOffsetY);
        _builder.append(_plus_3, "");
        _builder.append("\" r=\"");
        int _rx = this._layoutExtensions.rx(shape);
        _builder.append(_rx, "");
        _builder.append("\"");
        String _layouting = this.layouting(shape);
        _builder.append(_layouting, "");
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("<ellipse cx=\"");
        int _x_1 = this._layoutExtensions.x(shape, child);
        int _parentX_1 = this._layoutExtensions.parentX(shape);
        int _plus_4 = (_x_1 + _parentX_1);
        int _placingOffsetX_1 = this.placingOffsetX(shape);
        int _plus_5 = (_plus_4 + _placingOffsetX_1);
        _builder.append(_plus_5, "");
        _builder.append("\" cy=\"");
        int _y_1 = this._layoutExtensions.y(shape, child);
        int _parentY_1 = this._layoutExtensions.parentY(shape);
        int _plus_6 = (_y_1 + _parentY_1);
        int _placingOffsetY_1 = this.placingOffsetY(shape);
        int _plus_7 = (_plus_6 + _placingOffsetY_1);
        _builder.append(_plus_7, "");
        _builder.append("\" rx=\"");
        int _rx_1 = this._layoutExtensions.rx(shape);
        _builder.append(_rx_1, "");
        _builder.append("\" ry=\"");
        int _ry = this._layoutExtensions.ry(shape);
        _builder.append(_ry, "");
        _builder.append("\"");
        String _layouting_1 = this.layouting(shape);
        _builder.append(_layouting_1, "");
        _builder.append("/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateShape(final Text shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<text x=\"");
    int _x = this._layoutExtensions.x(shape, child);
    _builder.append(_x, "");
    _builder.append("\" y=\"");
    int _y = this._layoutExtensions.y(shape, child);
    _builder.append(_y, "");
    _builder.append("\">");
    {
      TextBody _body = shape.getBody();
      String _value = _body.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("#");
        TextBody _body_1 = shape.getBody();
        String _value_1 = _body_1.getValue();
        _builder.append(_value_1, "");
      } else {
        _builder.append("&lt;TEXT&gt;");
      }
    }
    _builder.append("</text>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateShape(final CDText shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<text x=\"");
    int _x = this._layoutExtensions.x(shape, child);
    int _placingOffsetX = this.placingOffsetX(shape);
    int _plus = (_x + _placingOffsetX);
    _builder.append(_plus, "");
    _builder.append("\" y=\"");
    int _y = this._layoutExtensions.y(shape, child);
    int _placingOffsetY = this.placingOffsetY(shape);
    int _plus_1 = (_y + _placingOffsetY);
    _builder.append(_plus_1, "");
    _builder.append("\">");
    {
      TextBody _body = shape.getBody();
      String _value = _body.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("#");
        TextBody _body_1 = shape.getBody();
        String _value_1 = _body_1.getValue();
        _builder.append(_value_1, "");
      } else {
        _builder.append("&lt;TEXT&gt;");
      }
    }
    _builder.append("</text>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence positionAndSize(final Shape shape, final boolean child) {
    return this.positionAndSize(shape, child, 0, 0);
  }
  
  protected CharSequence positionAndSize(final Shape shape, final boolean child, final int xOffset, final int yOffset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("x=\"");
    int _x = this._layoutExtensions.x(shape, child);
    int _parentX = this._layoutExtensions.parentX(shape);
    int _plus = (_x + _parentX);
    int _plus_1 = (_plus + xOffset);
    _builder.append(_plus_1, "");
    _builder.append("\" y=\"");
    int _y = this._layoutExtensions.y(shape, child);
    int _parentY = this._layoutExtensions.parentY(shape);
    int _plus_2 = (_y + _parentY);
    int _plus_3 = (_plus_2 + yOffset);
    _builder.append(_plus_3, "");
    _builder.append("\" width=\"");
    int _width = this._layoutExtensions.width(shape);
    _builder.append(_width, "");
    _builder.append("\" height=\"");
    int _height = this._layoutExtensions.height(shape);
    _builder.append(_height, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence positionAndSize(final ShapeConnection shape, final boolean child) {
    return this.positionAndSize(shape, child, 0, 0);
  }
  
  protected CharSequence positionAndSize(final ShapeConnection shape, final boolean child, final int xOffset, final int yOffset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("x=\"");
    int _x = this._layoutExtensions.x(shape, child);
    int _plus = (_x + xOffset);
    _builder.append(_plus, "");
    _builder.append("\" y=\"");
    int _y = this._layoutExtensions.y(shape, child);
    int _plus_1 = (_y + yOffset);
    _builder.append(_plus_1, "");
    _builder.append("\" width=\"");
    int _width = this._layoutExtensions.width(shape);
    _builder.append(_width, "");
    _builder.append("\" height=\"");
    int _height = this._layoutExtensions.height(shape);
    _builder.append(_height, "");
    _builder.append("\"");
    return _builder;
  }
  
  protected CharSequence _generateAnchor(final AnchorManual anchor, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<AnchorPosition> _position = anchor.getPosition();
      for(final AnchorPosition ap : _position) {
        _builder.append("<use x=\"");
        AnchorPositionPos _pos = ap.getPos();
        int _x = this._layoutExtensions.x(_pos, child);
        _builder.append(_x, "");
        _builder.append("\" y=\"");
        AnchorPositionPos _pos_1 = ap.getPos();
        int _y = this._layoutExtensions.y(_pos_1, child);
        _builder.append(_y, "");
        _builder.append("\" xlink:href=\"#anchor\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generateAnchor(final AnchorPredefinied anchor, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateShape(final PlacingDefinition shape, final boolean child) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeConnection _shapeCon = shape.getShapeCon();
    CharSequence _generateShape = this.generateShape(_shapeCon, child);
    _builder.append(_generateShape, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public int placingOffsetX(final EObject cdShape) {
    int _xblockexpression = (int) 0;
    {
      final PlacingDefinition pd = EcoreUtil2.<PlacingDefinition>getContainerOfType(cdShape, PlacingDefinition.class);
      int _xifexpression = (int) 0;
      boolean _notEquals = (!Objects.equal(pd, null));
      if (_notEquals) {
        int _defaultConnectionX1 = this._layoutExtensions.defaultConnectionX1();
        int _defaultConnectionWidth = this._layoutExtensions.defaultConnectionWidth();
        double _offset = pd.getOffset();
        double _multiply = (_defaultConnectionWidth * _offset);
        Double _valueOf = Double.valueOf(_multiply);
        int _intValue = _valueOf.intValue();
        int _plus = (_defaultConnectionX1 + _intValue);
        int _placingSpaceXShift = this._layoutExtensions.placingSpaceXShift(cdShape);
        _xifexpression = (_plus + _placingSpaceXShift);
      } else {
        _xifexpression = 0;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public int placingOffsetY(final EObject cdShape) {
    int _xblockexpression = (int) 0;
    {
      final PlacingDefinition pd = EcoreUtil2.<PlacingDefinition>getContainerOfType(cdShape, PlacingDefinition.class);
      int _xifexpression = (int) 0;
      boolean _notEquals = (!Objects.equal(pd, null));
      if (_notEquals) {
        int _defaultConnectionY1 = this._layoutExtensions.defaultConnectionY1();
        int _placingSpaceYShift = this._layoutExtensions.placingSpaceYShift(cdShape);
        _xifexpression = (_defaultConnectionY1 + _placingSpaceYShift);
      } else {
        _xifexpression = 0;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected CharSequence styleAttribute(final RectangleEllipseLayout l) {
    ShapestyleLayout _layout = l.getLayout();
    return this.styleAttribute(_layout);
  }
  
  protected CharSequence styleAttribute(final RoundedRectangleLayout l) {
    ShapestyleLayout _layout = l.getLayout();
    return this.styleAttribute(_layout);
  }
  
  protected CharSequence styleAttribute(final PolyLineLayout l) {
    ShapestyleLayout _layout = l.getLayout();
    return this.styleAttribute(_layout);
  }
  
  protected CharSequence styleAttribute(final LineLayout l) {
    ShapestyleLayout _layout = l.getLayout();
    return this.styleAttribute(_layout);
  }
  
  protected CharSequence styleAttribute(final ShapestyleLayout ssl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      boolean _notEquals = (!Objects.equal(ssl, null));
      if (!_notEquals) {
        _and = false;
      } else {
        Object _layout = ssl.getLayout();
        boolean _notEquals_1 = (!Objects.equal(_layout, null));
        _and = _notEquals_1;
      }
      if (_and) {
        CharSequence _handleNonNullstyleAttribute = this.handleNonNullstyleAttribute(ssl);
        _builder.append(_handleNonNullstyleAttribute, "");
      }
    }
    return _builder;
  }
  
  protected CharSequence handleNonNullstyleAttribute(final ShapestyleLayout ssl) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _handleStrokeColor = this.handleStrokeColor(ssl);
    _builder.append(_handleStrokeColor, "");
    CharSequence _handleBackground = this.handleBackground(ssl);
    _builder.append(_handleBackground, "");
    CharSequence _handleOpacity = this.handleOpacity(ssl);
    _builder.append(_handleOpacity, "");
    CharSequence _handleStrokeWidth = this.handleStrokeWidth(ssl);
    _builder.append(_handleStrokeWidth, "");
    return _builder;
  }
  
  protected CharSequence handleBackground(final ShapestyleLayout ssl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method background is undefined for the type SVGShapeGenerator"
      + "\nType mismatch: cannot convert from Object to StyleLayout"
      + "\n!= cannot be resolved");
  }
  
  protected CharSequence handleOpacity(final ShapestyleLayout ssl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasTransparency = this._layoutExtensions.hasTransparency(ssl);
      if (_hasTransparency) {
        _builder.append("opacity:");
        Object _transparency = this._layoutExtensions.transparency(ssl);
        _builder.append(_transparency, "");
        _builder.append(";");
      }
    }
    return _builder;
  }
  
  protected CharSequence handleStrokeWidth(final ShapestyleLayout ssl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method lineWidth is undefined for the type SVGShapeGenerator"
      + "\nThe method lineWidth is undefined for the type SVGShapeGenerator"
      + "\n> cannot be resolved");
  }
  
  protected CharSequence handleStrokeColor(final ShapestyleLayout ssl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method lineColor is undefined for the type SVGShapeGenerator"
      + "\nType mismatch: cannot convert from Object to StyleLayout"
      + "\n!= cannot be resolved");
  }
  
  public CharSequence backgroundColor(final StyleLayout styleLayout) {
    CharSequence _xifexpression = null;
    ColorOrGradient _background = styleLayout.getBackground();
    if ((_background instanceof ColorConstantRef)) {
      ColorOrGradient _background_1 = styleLayout.getBackground();
      _xifexpression = this._layoutExtensions.color(((ColorConstantRef) _background_1));
    } else {
      CharSequence _xifexpression_1 = null;
      ColorOrGradient _background_2 = styleLayout.getBackground();
      if ((_background_2 instanceof Color)) {
        ColorOrGradient _background_3 = styleLayout.getBackground();
        _xifexpression_1 = this._layoutExtensions.color(((Color) _background_3));
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence color(final StyleLayout styleLayout) {
    CharSequence _xifexpression = null;
    ColorWithTransparency _lineColor = styleLayout.getLineColor();
    if ((_lineColor instanceof ColorConstantRef)) {
      ColorWithTransparency _lineColor_1 = styleLayout.getLineColor();
      _xifexpression = this._layoutExtensions.color(((ColorConstantRef) _lineColor_1));
    } else {
      CharSequence _xifexpression_1 = null;
      ColorWithTransparency _lineColor_2 = styleLayout.getLineColor();
      if ((_lineColor_2 instanceof Color)) {
        ColorWithTransparency _lineColor_3 = styleLayout.getLineColor();
        _xifexpression_1 = this._layoutExtensions.color(((Color) _lineColor_3));
      } else {
        _xifexpression_1 = "";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _defs(final ShapeDefinition shape) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<defs>");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _css = this.css(shape);
    _builder.append(_css, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _anchorDef = this.anchorDef(shape);
    _builder.append(_anchorDef, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("</defs>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _defs(final ConnectionDefinition shape) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<defs>");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _css = this.css(shape);
    _builder.append(_css, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("</defs>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Creates CSS for the base graphical types and style classes for used Styles
   */
  protected CharSequence css(final ShapeContainerElement shape) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<style type=\"text/css\"> <![CDATA[");
    _builder.newLine();
    _builder.append("rect {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("line {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("polyline {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("polygon {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("circle {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("ellipse {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("text {fill: black; font-family: verdana,sans-serif; font-size:12px;}");
    _builder.newLine();
    _builder.append(".default {fill: none; stroke:black; stroke-width:1px}");
    _builder.newLine();
    _builder.append("]]>");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence anchorDef(final ShapeDefinition shape) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<rect id=\"anchor\" style=\"fill:#a0c0e8\" width=\"5\" height=\"5\"/>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate(final ShapeContainerElement shape) {
    if (shape instanceof ConnectionDefinition) {
      return _generate((ConnectionDefinition)shape);
    } else if (shape instanceof ShapeDefinition) {
      return _generate((ShapeDefinition)shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
  
  protected CharSequence generateShape(final EObject shape, final boolean child) {
    if (shape instanceof CDEllipse) {
      return _generateShape((CDEllipse)shape, child);
    } else if (shape instanceof CDLine) {
      return _generateShape((CDLine)shape, child);
    } else if (shape instanceof CDPolygon) {
      return _generateShape((CDPolygon)shape, child);
    } else if (shape instanceof CDPolyline) {
      return _generateShape((CDPolyline)shape, child);
    } else if (shape instanceof CDRectangle) {
      return _generateShape((CDRectangle)shape, child);
    } else if (shape instanceof CDRoundedRectangle) {
      return _generateShape((CDRoundedRectangle)shape, child);
    } else if (shape instanceof CDText) {
      return _generateShape((CDText)shape, child);
    } else if (shape instanceof Ellipse) {
      return _generateShape((Ellipse)shape, child);
    } else if (shape instanceof Line) {
      return _generateShape((Line)shape, child);
    } else if (shape instanceof Polygon) {
      return _generateShape((Polygon)shape, child);
    } else if (shape instanceof Polyline) {
      return _generateShape((Polyline)shape, child);
    } else if (shape instanceof Rectangle) {
      return _generateShape((Rectangle)shape, child);
    } else if (shape instanceof RoundedRectangle) {
      return _generateShape((RoundedRectangle)shape, child);
    } else if (shape instanceof Text) {
      return _generateShape((Text)shape, child);
    } else if (shape instanceof PlacingDefinition) {
      return _generateShape((PlacingDefinition)shape, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape, child).toString());
    }
  }
  
  protected CharSequence generateAnchor(final AnchorType anchor, final boolean child) {
    if (anchor instanceof AnchorManual) {
      return _generateAnchor((AnchorManual)anchor, child);
    } else if (anchor instanceof AnchorPredefinied) {
      return _generateAnchor((AnchorPredefinied)anchor, child);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(anchor, child).toString());
    }
  }
  
  protected CharSequence defs(final ShapeContainerElement shape) {
    if (shape instanceof ConnectionDefinition) {
      return _defs((ConnectionDefinition)shape);
    } else if (shape instanceof ShapeDefinition) {
      return _defs((ShapeDefinition)shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
}
