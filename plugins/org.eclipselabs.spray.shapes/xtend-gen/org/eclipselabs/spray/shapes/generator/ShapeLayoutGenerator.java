package org.eclipselabs.spray.shapes.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeLayout;

@SuppressWarnings("all")
public class ShapeLayoutGenerator {
  public CharSequence generateLayout(final ShapeDefinition s) {
    CharSequence _xblockexpression = null;
    {
      boolean _operator_and = false;
      ShapeLayout _shapeLayout = s.getShapeLayout();
      int _defheight = _shapeLayout.getDefheight();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(Integer.valueOf(_defheight), null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        ShapeLayout _shapeLayout_1 = s.getShapeLayout();
        int _defwidth = _shapeLayout_1.getDefwidth();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(Integer.valueOf(_defwidth), null);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("invisibleRectangle.setWidth(\uFFFDs.shapeLayout.defwidth\uFFFD);");
        _builder.newLine();
        _builder.append("invisibleRectangle.setHeight(\uFFFDs.shapeLayout.defheight\uFFFD);");
        _builder.newLine();
      }
      boolean _operator_and_1 = false;
      ShapeLayout _shapeLayout_2 = s.getShapeLayout();
      int _minheight = _shapeLayout_2.getMinheight();
      boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(Integer.valueOf(_minheight), null);
      if (!_operator_notEquals_2) {
        _operator_and_1 = false;
      } else {
        ShapeLayout _shapeLayout_3 = s.getShapeLayout();
        int _minwidth = _shapeLayout_3.getMinwidth();
        boolean _operator_notEquals_3 = ObjectExtensions.operator_notEquals(Integer.valueOf(_minwidth), null);
        _operator_and_1 = BooleanExtensions.operator_and(_operator_notEquals_2, _operator_notEquals_3);
      }
      if (_operator_and_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("//\t\t\tstyleInvisibleRectangle.");
        _builder_1.newLine();
      }
      boolean _operator_and_2 = false;
      ShapeLayout _shapeLayout_4 = s.getShapeLayout();
      int _maxheight = _shapeLayout_4.getMaxheight();
      boolean _operator_notEquals_4 = ObjectExtensions.operator_notEquals(Integer.valueOf(_maxheight), null);
      if (!_operator_notEquals_4) {
        _operator_and_2 = false;
      } else {
        ShapeLayout _shapeLayout_5 = s.getShapeLayout();
        int _maxwidth = _shapeLayout_5.getMaxwidth();
        boolean _operator_notEquals_5 = ObjectExtensions.operator_notEquals(Integer.valueOf(_maxwidth), null);
        _operator_and_2 = BooleanExtensions.operator_and(_operator_notEquals_4, _operator_notEquals_5);
      }
      if (_operator_and_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
      }
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("styleInvisibleRectangle.setProportional(\uFFFDs.shapeLayout.proportional\uFFFD);\t   ");
      _builder_3.newLine();
      ShapeLayout _shapeLayout_6 = s.getShapeLayout();
      boolean _isStretchH = _shapeLayout_6.isStretchH();
      boolean _operator_notEquals_6 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isStretchH), null);
      if (_operator_notEquals_6) {
        StringConcatenation _builder_4 = new StringConcatenation();
        _builder_4.append("styleInvisibleRectangle.setStretchH(\uFFFDs.shapeLayout.stretchH\uFFFD);\t   ");
        _builder_4.newLine();
      } else {
        StringConcatenation _builder_5 = new StringConcatenation();
        _builder_5.append("styleInvisibleRectangle.setStretchH(true);");
        _builder_5.newLine();
      }
      ShapeLayout _shapeLayout_7 = s.getShapeLayout();
      boolean _isStretchV = _shapeLayout_7.isStretchV();
      boolean _operator_notEquals_7 = ObjectExtensions.operator_notEquals(Boolean.valueOf(_isStretchV), null);
      if (_operator_notEquals_7) {
        StringConcatenation _builder_6 = new StringConcatenation();
        _builder_6.append("styleInvisibleRectangle.setStretchV(\uFFFDs.shapeLayout.stretchV\uFFFD);\t   ");
        _builder_6.newLine();
      } else {
        StringConcatenation _builder_7 = new StringConcatenation();
        _builder_7.append("styleInvisibleRectangle.setStretchV(true);");
        _builder_7.newLine();
      }
      CharSequence _xifexpression = null;
      ShapeLayout _shapeLayout_8 = s.getShapeLayout();
      double _angle = _shapeLayout_8.getAngle();
      boolean _operator_notEquals_8 = ObjectExtensions.operator_notEquals(Double.valueOf(_angle), null);
      if (_operator_notEquals_8) {
        StringConcatenation _builder_8 = new StringConcatenation();
        _builder_8.append("int angle = \uFFFDs.shapeLayout.angle\uFFFD;");
        _builder_8.newLine();
        _builder_8.append("styleInvisibleRectangle.setAngle(angle);");
        _builder_8.newLine();
        _xifexpression = _builder_8;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
