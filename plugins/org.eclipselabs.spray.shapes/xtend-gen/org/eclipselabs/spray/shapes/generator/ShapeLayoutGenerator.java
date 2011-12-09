package org.eclipselabs.spray.shapes.generator;

import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeLayout;

@SuppressWarnings("all")
public class ShapeLayoutGenerator {
  public StringConcatenation generateLayout(final ShapeDefinition s) {
    StringConcatenation _xblockexpression = null;
    {
      boolean _operator_and = false;
      ShapeLayout _shapeLayout = s.getShapeLayout();
      int _defheight = _shapeLayout.getDefheight();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Integer)_defheight), null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        ShapeLayout _shapeLayout_1 = s.getShapeLayout();
        int _defwidth = _shapeLayout_1.getDefwidth();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Integer)_defwidth), null);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("invisibleRectangle.setWidth(");
        ShapeLayout _shapeLayout_2 = s.getShapeLayout();
        int _defwidth_1 = _shapeLayout_2.getDefwidth();
        _builder.append(_defwidth_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("invisibleRectangle.setHeight(");
        ShapeLayout _shapeLayout_3 = s.getShapeLayout();
        int _defheight_1 = _shapeLayout_3.getDefheight();
        _builder.append(_defheight_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
      boolean _operator_and_1 = false;
      ShapeLayout _shapeLayout_4 = s.getShapeLayout();
      int _minheight = _shapeLayout_4.getMinheight();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(((Integer)_minheight), null);
      if (!_operator_notEquals_2) {
        _operator_and_1 = false;
      } else {
        ShapeLayout _shapeLayout_5 = s.getShapeLayout();
        int _minwidth = _shapeLayout_5.getMinwidth();
        boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(((Integer)_minwidth), null);
        _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_notEquals_3);
      }
      if (_operator_and_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("//\t\t\tstyleInvisibleRectangle.");
        _builder_1.newLine();
      }
      boolean _operator_and_2 = false;
      ShapeLayout _shapeLayout_6 = s.getShapeLayout();
      int _maxheight = _shapeLayout_6.getMaxheight();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(((Integer)_maxheight), null);
      if (!_operator_notEquals_4) {
        _operator_and_2 = false;
      } else {
        ShapeLayout _shapeLayout_7 = s.getShapeLayout();
        int _maxwidth = _shapeLayout_7.getMaxwidth();
        boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(((Integer)_maxwidth), null);
        _operator_and_2 = BooleanExtensions.operator_and(_operator_notEquals_4, _operator_notEquals_5);
      }
      if (_operator_and_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("styleInvisibleRectangle.setProportional(");
      ShapeLayout _shapeLayout_8 = s.getShapeLayout();
      boolean _isProportional = _shapeLayout_8.isProportional();
      _builder_3.append(_isProportional, "");
      _builder_3.append(");\t   ");
      _builder_3.newLineIfNotEmpty();
      ShapeLayout _shapeLayout_9 = s.getShapeLayout();
      boolean _isStretchH = _shapeLayout_9.isStretchH();
      boolean _operator_notEquals_6 = ObjectExtensions.operator_notEquals(((Boolean)_isStretchH), null);
      if (_operator_notEquals_6) {
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("styleInvisibleRectangle.setStretchH(");
        ShapeLayout _shapeLayout_10 = s.getShapeLayout();
        boolean _isStretchH_1 = _shapeLayout_10.isStretchH();
        _builder_4.append(_isStretchH_1, "");
        _builder_4.append(");\t   ");
        _builder_4.newLineIfNotEmpty();
      } else {
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("styleInvisibleRectangle.setStretchH(true);");
        _builder_5.newLine();
      }
      ShapeLayout _shapeLayout_11 = s.getShapeLayout();
      boolean _isStretchV = _shapeLayout_11.isStretchV();
      boolean _operator_notEquals_7 = ObjectExtensions.operator_notEquals(((Boolean)_isStretchV), null);
      if (_operator_notEquals_7) {
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("styleInvisibleRectangle.setStretchV(");
        ShapeLayout _shapeLayout_12 = s.getShapeLayout();
        boolean _isStretchV_1 = _shapeLayout_12.isStretchV();
        _builder_6.append(_isStretchV_1, "");
        _builder_6.append(");\t   ");
        _builder_6.newLineIfNotEmpty();
      } else {
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("styleInvisibleRectangle.setStretchV(true);");
        _builder_7.newLine();
      }
      StringConcatenation _xifexpression = null;
      ShapeLayout _shapeLayout_13 = s.getShapeLayout();
      double _angle = _shapeLayout_13.getAngle();
      boolean _operator_notEquals_8 = ObjectExtensions.operator_notEquals(((Double)_angle), null);
      if (_operator_notEquals_8) {
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("int angle = ");
        ShapeLayout _shapeLayout_14 = s.getShapeLayout();
        double _angle_1 = _shapeLayout_14.getAngle();
        _builder_8.append(_angle_1, "");
        _builder_8.append(";");
        _builder_8.newLineIfNotEmpty();
        _builder_8.append("styleInvisibleRectangle.setAngle(angle);");
        _builder_8.newLine();
        _xifexpression = _builder_8;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
