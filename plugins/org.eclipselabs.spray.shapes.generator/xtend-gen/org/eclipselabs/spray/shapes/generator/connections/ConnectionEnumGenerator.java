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
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.shapes.CDText;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.ShapeConnection;
import org.eclipselabs.spray.shapes.TextBody;

@SuppressWarnings("all")
public class ConnectionEnumGenerator {
  public CharSequence generateTextIdsEnum(final ConnectionDefinition c) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<String> ids = this.searchTextIds(c);
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
              _builder.append("\t");
              _builder.append(id, "\t");
              _builder.append(",");
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t");
              _builder.append(id, "\t");
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
  
  public ArrayList<String> searchTextIds(final ConnectionDefinition c) {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> ids = new ArrayList<String>();
      EList<PlacingDefinition> _placing = c.getPlacing();
      for (final PlacingDefinition placing : _placing) {
        ShapeConnection _shapeCon = placing.getShapeCon();
        if ((_shapeCon instanceof CDText)) {
          ShapeConnection _shapeCon_1 = placing.getShapeCon();
          TextBody _body = ((CDText) _shapeCon_1).getBody();
          String _value = _body.getValue();
          ids.add(_value);
        }
      }
      _xblockexpression = ids;
    }
    return _xblockexpression;
  }
}
