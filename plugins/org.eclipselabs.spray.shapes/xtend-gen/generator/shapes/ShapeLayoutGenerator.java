package org.eclipselabs.spray.shapes.generator.shapes;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeLayout;

@SuppressWarnings("all")
public class ShapeLayoutGenerator {
  public String generateLayout(final ShapeDefinition s) {
    String _xblockexpression = null;
    {
      StringBuilder _stringBuilder = new StringBuilder();
      final StringBuilder sb = _stringBuilder;
      boolean _operator_and = false;
      ShapeLayout _shapeLayout = s.getShapeLayout();
      int _minheight = _shapeLayout.getMinheight();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(Integer.valueOf(_minheight), null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        ShapeLayout _shapeLayout_1 = s.getShapeLayout();
        int _minwidth = _shapeLayout_1.getMinwidth();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(Integer.valueOf(_minwidth), null);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("// sprayStyle.");
        _builder.newLine();
        sb.append(_builder);
      }
      boolean _operator_and_1 = false;
      ShapeLayout _shapeLayout_2 = s.getShapeLayout();
      int _maxheight = _shapeLayout_2.getMaxheight();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(Integer.valueOf(_maxheight), null);
      if (!_operator_notEquals_2) {
        _operator_and_1 = false;
      } else {
        ShapeLayout _shapeLayout_3 = s.getShapeLayout();
        int _maxwidth = _shapeLayout_3.getMaxwidth();
        boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(Integer.valueOf(_maxwidth), null);
        _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_notEquals_3);
      }
      if (_operator_and_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        sb.append(_builder_1);
      }
      ShapeLayout _shapeLayout_4 = s.getShapeLayout();
      boolean _isProportional = _shapeLayout_4.isProportional();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isProportional), null);
      if (_operator_notEquals_4) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("sprayStyle.setProportional(");
        ShapeLayout _shapeLayout_5 = s.getShapeLayout();
        boolean _isProportional_1 = _shapeLayout_5.isProportional();
        _builder_2.append(_isProportional_1, "");
        _builder_2.append(");\t   ");
        _builder_2.newLineIfNotEmpty();
        sb.append(_builder_2);
      } else {
        StringConcatenation _builder_3 = new StringConcatenation();
        _builder_3.append("sprayStyle.setProportional(false);");
        _builder_3.newLine();
        sb.append(_builder_3);
      }
      ShapeLayout _shapeLayout_6 = s.getShapeLayout();
      boolean _isStretchH = _shapeLayout_6.isStretchH();
      boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isStretchH), null);
      if (_operator_notEquals_5) {
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("sprayStyle.setStretchH(");
        ShapeLayout _shapeLayout_7 = s.getShapeLayout();
        boolean _isStretchH_1 = _shapeLayout_7.isStretchH();
        _builder_4.append(_isStretchH_1, "");
        _builder_4.append(");\t   ");
        _builder_4.newLineIfNotEmpty();
        sb.append(_builder_4);
      } else {
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("sprayStyle.setStretchH(true);");
        _builder_5.newLine();
        sb.append(_builder_5);
      }
      ShapeLayout _shapeLayout_8 = s.getShapeLayout();
      boolean _isStretchV = _shapeLayout_8.isStretchV();
      boolean _operator_notEquals_6 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isStretchV), null);
      if (_operator_notEquals_6) {
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("sprayStyle.setStretchV(");
        ShapeLayout _shapeLayout_9 = s.getShapeLayout();
        boolean _isStretchV_1 = _shapeLayout_9.isStretchV();
        _builder_6.append(_isStretchV_1, "");
        _builder_6.append(");\t   ");
        _builder_6.newLineIfNotEmpty();
        sb.append(_builder_6);
      } else {
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("sprayStyle.setStretchV(true);");
        _builder_7.newLine();
        sb.append(_builder_7);
      }
      String _string = sb.toString();
      _xblockexpression = (_string);
    }
    return _xblockexpression;
  }
}
