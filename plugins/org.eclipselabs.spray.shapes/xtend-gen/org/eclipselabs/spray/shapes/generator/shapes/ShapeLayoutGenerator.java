package org.eclipselabs.spray.shapes.generator.shapes;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeLayout;

@SuppressWarnings("all")
public class ShapeLayoutGenerator {
  public CharSequence generateLayout(final ShapeDefinition s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      ShapeLayout _shapeLayout = s.getShapeLayout();
      boolean _isProportional = _shapeLayout.isProportional();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isProportional), null);
      if (_operator_notEquals) {
        _builder.append("sprayStyle.setProportional(");
        ShapeLayout _shapeLayout_1 = s.getShapeLayout();
        boolean _isProportional_1 = _shapeLayout_1.isProportional();
        _builder.append(_isProportional_1, "");
        _builder.append(");\t   ");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sprayStyle.setProportional(false);");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_2 = s.getShapeLayout();
      boolean _isStretchH = _shapeLayout_2.isStretchH();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isStretchH), null);
      if (_operator_notEquals_1) {
        _builder.append("sprayStyle.setStretchH(");
        ShapeLayout _shapeLayout_3 = s.getShapeLayout();
        boolean _isStretchH_1 = _shapeLayout_3.isStretchH();
        _builder.append(_isStretchH_1, "");
        _builder.append(");\t   ");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sprayStyle.setStretchH(false);\t   ");
        _builder.newLine();
      }
    }
    {
      ShapeLayout _shapeLayout_4 = s.getShapeLayout();
      boolean _isStretchV = _shapeLayout_4.isStretchV();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isStretchV), null);
      if (_operator_notEquals_2) {
        _builder.append("sprayStyle.setStretchV(");
        ShapeLayout _shapeLayout_5 = s.getShapeLayout();
        boolean _isStretchH_2 = _shapeLayout_5.isStretchH();
        _builder.append(_isStretchH_2, "");
        _builder.append(");\t   ");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("sprayStyle.setStretchV(false);\t   ");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
