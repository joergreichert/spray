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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.shapes.Compartment;
import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.CompartmentShape;
import org.eclipselabs.spray.shapes.Description;
import org.eclipselabs.spray.shapes.Ellipse;
import org.eclipselabs.spray.shapes.Line;
import org.eclipselabs.spray.shapes.Polygon;
import org.eclipselabs.spray.shapes.Polyline;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.Text;
import org.eclipselabs.spray.shapes.TextBody;

@SuppressWarnings("all")
public class ShapeEnumGenerator {
  public CharSequence generateTextIdsEnum(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      final List<String> ids = this.searchTextIds(s);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public static enum TextIds {");
      _builder.newLine();
      {
        for(final String id : ids) {
          {
            String _last = IterableExtensions.<String>last(ids);
            boolean _equals = Objects.equal(_last, id);
            boolean _not = (!_equals);
            if (_not) {
              _builder.append("    ");
              _builder.append(id, "    ");
              _builder.append(",");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("    ");
              _builder.append(id, "    ");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final ShapeDefinition s) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      EList<Shape> _shape = s.getShape();
      for (final Shape shape : _shape) {
        if ((shape instanceof Text)) {
          TextBody _body = ((Text)shape).getBody();
          String _value = _body.getValue();
          ids.add(_value);
        } else {
          if ((shape instanceof Compartment)) {
            CompartmentShape _shape_1 = ((Compartment) shape).getShape();
            TextBody _id = _shape_1.getId();
            String _value_1 = _id.getValue();
            ids.add(_value_1);
          } else {
            List<String> _searchTextIds = this.searchTextIds(shape);
            ids.addAll(_searchTextIds);
          }
        }
      }
      Description _description = s.getDescription();
      boolean _notEquals = (!Objects.equal(_description, null));
      if (_notEquals) {
        Description _description_1 = s.getDescription();
        TextBody _body_1 = _description_1.getBody();
        String _value_2 = _body_1.getValue();
        ids.add(_value_2);
      }
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final Line shape) {
    return new ArrayList<String>();
  }
  
  protected List<String> _searchTextIds(final Polyline shape) {
    return new ArrayList<String>();
  }
  
  protected List<String> _searchTextIds(final RoundedRectangle shape) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      EList<Shape> _shape = shape.getShape();
      for (final Shape child : _shape) {
        List<String> _searchTextIds = this.searchTextIds(child);
        ids.addAll(_searchTextIds);
      }
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final Rectangle shape) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      CompartmentInfo _compartmentInfo = null;
      if (shape!=null) {
        _compartmentInfo=shape.getCompartmentInfo();
      }
      TextBody _id = null;
      if (_compartmentInfo!=null) {
        _id=_compartmentInfo.getId();
      }
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        CompartmentInfo _compartmentInfo_1 = shape.getCompartmentInfo();
        TextBody _id_1 = _compartmentInfo_1.getId();
        String _value = _id_1.getValue();
        ids.add(_value);
      }
      EList<Shape> _shape = shape.getShape();
      for (final Shape child : _shape) {
        List<String> _searchTextIds = this.searchTextIds(child);
        ids.addAll(_searchTextIds);
      }
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final Ellipse shape) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      CompartmentInfo _compartmentInfo = null;
      if (shape!=null) {
        _compartmentInfo=shape.getCompartmentInfo();
      }
      TextBody _id = null;
      if (_compartmentInfo!=null) {
        _id=_compartmentInfo.getId();
      }
      boolean _notEquals = (!Objects.equal(_id, null));
      if (_notEquals) {
        CompartmentInfo _compartmentInfo_1 = shape.getCompartmentInfo();
        TextBody _id_1 = _compartmentInfo_1.getId();
        String _value = _id_1.getValue();
        ids.add(_value);
      }
      EList<Shape> _shape = shape.getShape();
      for (final Shape child : _shape) {
        List<String> _searchTextIds = this.searchTextIds(child);
        ids.addAll(_searchTextIds);
      }
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final Polygon shape) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      EList<Shape> _shape = shape.getShape();
      for (final Shape child : _shape) {
        List<String> _searchTextIds = this.searchTextIds(child);
        ids.addAll(_searchTextIds);
      }
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final Text shape) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      TextBody _body = shape.getBody();
      String _value = _body.getValue();
      ids.add(_value);
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  protected List<String> _searchTextIds(final Compartment shape) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      CompartmentShape _shape = shape.getShape();
      TextBody _id = _shape.getId();
      String _value = _id.getValue();
      ids.add(_value);
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
  
  public List<String> searchTextIds(final EObject shape) {
    if (shape instanceof Ellipse) {
      return _searchTextIds((Ellipse)shape);
    } else if (shape instanceof Line) {
      return _searchTextIds((Line)shape);
    } else if (shape instanceof Polygon) {
      return _searchTextIds((Polygon)shape);
    } else if (shape instanceof Polyline) {
      return _searchTextIds((Polyline)shape);
    } else if (shape instanceof Rectangle) {
      return _searchTextIds((Rectangle)shape);
    } else if (shape instanceof RoundedRectangle) {
      return _searchTextIds((RoundedRectangle)shape);
    } else if (shape instanceof ShapeDefinition) {
      return _searchTextIds((ShapeDefinition)shape);
    } else if (shape instanceof Text) {
      return _searchTextIds((Text)shape);
    } else if (shape instanceof Compartment) {
      return _searchTextIds((Compartment)shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
}
