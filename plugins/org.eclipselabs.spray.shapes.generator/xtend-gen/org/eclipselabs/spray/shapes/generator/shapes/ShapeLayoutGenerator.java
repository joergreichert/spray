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
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeLayout;

@SuppressWarnings("all")
public class ShapeLayoutGenerator {
  public CharSequence generateLayout(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ShapeLayout _shapeLayout = s.getShapeLayout();
      Boolean _proportional = _shapeLayout.getProportional();
      boolean _notEquals = (!Objects.equal(_proportional, null));
      if (_notEquals) {
        _builder.append("sprayStyle.getStyle(diagram).setProportional(");
        ShapeLayout _shapeLayout_1 = s.getShapeLayout();
        Boolean _proportional_1 = _shapeLayout_1.getProportional();
        _builder.append(_proportional_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sprayStyle.getStyle(diagram).setProportional(false);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_2 = s.getShapeLayout();
      Boolean _stretchH = _shapeLayout_2.getStretchH();
      boolean _notEquals_1 = (!Objects.equal(_stretchH, null));
      if (_notEquals_1) {
        _builder.append("sprayStyle.getStyle(diagram).setStretchH(");
        ShapeLayout _shapeLayout_3 = s.getShapeLayout();
        Boolean _stretchH_1 = _shapeLayout_3.getStretchH();
        _builder.append(_stretchH_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("SprayLayoutService.getLayoutData(containerShape).setHorizontalStrechable(");
        ShapeLayout _shapeLayout_4 = s.getShapeLayout();
        Boolean _stretchH_2 = _shapeLayout_4.getStretchH();
        _builder.append(_stretchH_2, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sprayStyle.getStyle(diagram).setStretchH(false);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_5 = s.getShapeLayout();
      Boolean _stretchV = _shapeLayout_5.getStretchV();
      boolean _notEquals_2 = (!Objects.equal(_stretchV, null));
      if (_notEquals_2) {
        _builder.append("sprayStyle.getStyle(diagram).setStretchV(");
        ShapeLayout _shapeLayout_6 = s.getShapeLayout();
        Boolean _stretchV_1 = _shapeLayout_6.getStretchV();
        _builder.append(_stretchV_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("SprayLayoutService.getLayoutData(containerShape).setVerticalStrechable(");
        ShapeLayout _shapeLayout_7 = s.getShapeLayout();
        Boolean _stretchV_2 = _shapeLayout_7.getStretchV();
        _builder.append(_stretchV_2, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sprayStyle.getStyle(diagram).setStretchV(false);");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateGetLayoutMethod(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public SprayLayoutManager getShapeLayout() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("SprayLayoutManager layoutManager = new SprayLayoutManager();");
    _builder.newLine();
    {
      ShapeLayout _shapeLayout = s.getShapeLayout();
      int _minwidth = _shapeLayout.getMinwidth();
      boolean _notEquals = (_minwidth != 0);
      if (_notEquals) {
        _builder.append("    ");
        _builder.append("layoutManager.setMinSizeWidth(");
        ShapeLayout _shapeLayout_1 = s.getShapeLayout();
        int _minwidth_1 = _shapeLayout_1.getMinwidth();
        _builder.append(_minwidth_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("layoutManager.setMinSizeWidth(-1);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_2 = s.getShapeLayout();
      int _maxwidth = _shapeLayout_2.getMaxwidth();
      boolean _notEquals_1 = (_maxwidth != 0);
      if (_notEquals_1) {
        _builder.append("    ");
        _builder.append("layoutManager.setMaxSizeWidth(");
        ShapeLayout _shapeLayout_3 = s.getShapeLayout();
        int _maxwidth_1 = _shapeLayout_3.getMaxwidth();
        _builder.append(_maxwidth_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("layoutManager.setMaxSizeWidth(-1);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_4 = s.getShapeLayout();
      int _minheight = _shapeLayout_4.getMinheight();
      boolean _notEquals_2 = (_minheight != 0);
      if (_notEquals_2) {
        _builder.append("    ");
        _builder.append("layoutManager.setMinSizeHeight(");
        ShapeLayout _shapeLayout_5 = s.getShapeLayout();
        int _minheight_1 = _shapeLayout_5.getMinheight();
        _builder.append(_minheight_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("layoutManager.setMinSizeHeight(-1);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_6 = s.getShapeLayout();
      int _maxheight = _shapeLayout_6.getMaxheight();
      boolean _notEquals_3 = (_maxheight != 0);
      if (_notEquals_3) {
        _builder.append("    ");
        _builder.append("layoutManager.setMaxSizeHeight(");
        ShapeLayout _shapeLayout_7 = s.getShapeLayout();
        int _maxheight_1 = _shapeLayout_7.getMaxheight();
        _builder.append(_maxheight_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("layoutManager.setMaxSizeHeight(-1);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_8 = s.getShapeLayout();
      Boolean _stretchH = _shapeLayout_8.getStretchH();
      boolean _notEquals_4 = (!Objects.equal(_stretchH, null));
      if (_notEquals_4) {
        _builder.append("    ");
        _builder.append("layoutManager.setStretchHorizontal(");
        ShapeLayout _shapeLayout_9 = s.getShapeLayout();
        Boolean _stretchH_1 = _shapeLayout_9.getStretchH();
        _builder.append(_stretchH_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("layoutManager.setStretchHorizontal(true);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_10 = s.getShapeLayout();
      Boolean _stretchV = _shapeLayout_10.getStretchV();
      boolean _notEquals_5 = (!Objects.equal(_stretchV, null));
      if (_notEquals_5) {
        _builder.append("    ");
        _builder.append("layoutManager.setStretchVertical(");
        ShapeLayout _shapeLayout_11 = s.getShapeLayout();
        Boolean _stretchV_1 = _shapeLayout_11.getStretchV();
        _builder.append(_stretchV_1, "    ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("layoutManager.setStretchVertical(true);");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return layoutManager;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
