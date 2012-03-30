package org.eclipselabs.spray.shapes.generator.connections;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout;
import org.eclipselabs.spray.styles.generator.StyleGenerator;
import org.eclipselabs.spray.styles.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.styles.LineStyle;
import org.eclipselabs.spray.styles.styles.StyleLayout;
import org.eclipselabs.spray.styles.styles.YesNoBool;

@SuppressWarnings("all")
public class ConnectionStyleGenerator {
  @Inject
  private StyleGenerator _styleGenerator;
  
  public CharSequence generateStyleForConnection(final String attName, final ShapestyleLayout csl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_and = false;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(csl, null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        StyleLayout _layout = csl.getLayout();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_layout, null);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        {
          StyleLayout _layout_1 = csl.getLayout();
          ColorWithTransparency _background = _layout_1.getBackground();
          boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_background, null);
          if (_operator_notEquals_2) {
            _builder.append(attName, "");
            _builder.append(".setBackground(gaService.manageColor(diagram,");
            StyleLayout _layout_2 = csl.getLayout();
            ColorWithTransparency _background_1 = _layout_2.getBackground();
            CharSequence _createColorValue = this._styleGenerator.createColorValue(_background_1);
            _builder.append(_createColorValue, "");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_3 = csl.getLayout();
          double _transparency = _layout_3.getTransparency();
          boolean _operator_notEquals_3 = DoubleExtensions.operator_notEquals(_transparency, Double.MIN_VALUE);
          if (_operator_notEquals_3) {
            _builder.append(attName, "");
            _builder.append(".setTransparency(");
            StyleLayout _layout_4 = csl.getLayout();
            double _transparency_1 = _layout_4.getTransparency();
            _builder.append(_transparency_1, "");
            _builder.append(");\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        CharSequence _createLineAttributes = this.createLineAttributes(attName, csl);
        _builder.append(_createLineAttributes, "");
        _builder.newLineIfNotEmpty();
        CharSequence _createFontAttributes = this.createFontAttributes(attName, csl);
        _builder.append(_createFontAttributes, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createFontAttributes(final String attName, final ShapestyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _operator_and = false;
      boolean _operator_and_1 = false;
      boolean _operator_and_2 = false;
      StyleLayout _layout = l.getLayout();
      String _fontName = _layout.getFontName();
      boolean _operator_equals = ObjectExtensions.operator_equals(_fontName, null);
      if (!_operator_equals) {
        _operator_and_2 = false;
      } else {
        StyleLayout _layout_1 = l.getLayout();
        int _fontSize = _layout_1.getFontSize();
        boolean _operator_equals_1 = IntegerExtensions.operator_equals(_fontSize, Integer.MIN_VALUE);
        _operator_and_2 = BooleanExtensions.operator_and(_operator_equals, _operator_equals_1);
      }
      if (!_operator_and_2) {
        _operator_and_1 = false;
      } else {
        StyleLayout _layout_2 = l.getLayout();
        YesNoBool _fontItalic = _layout_2.getFontItalic();
        boolean _operator_equals_2 = ObjectExtensions.operator_equals(_fontItalic, YesNoBool.NULL);
        _operator_and_1 = BooleanExtensions.operator_and(_operator_and_2, _operator_equals_2);
      }
      if (!_operator_and_1) {
        _operator_and = false;
      } else {
        StyleLayout _layout_3 = l.getLayout();
        YesNoBool _fontItalic_1 = _layout_3.getFontItalic();
        boolean _operator_equals_3 = ObjectExtensions.operator_equals(_fontItalic_1, YesNoBool.NULL);
        _operator_and = BooleanExtensions.operator_and(_operator_and_1, _operator_equals_3);
      }
      boolean _operator_not = BooleanExtensions.operator_not(_operator_and);
      if (_operator_not) {
        _builder.append("{");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("Style style = ");
        _builder.append(attName, "	");
        _builder.append(".getStyle();");
        _builder.newLineIfNotEmpty();
        {
          StyleLayout _layout_4 = l.getLayout();
          String _fontName_1 = _layout_4.getFontName();
          boolean _operator_equals_4 = ObjectExtensions.operator_equals(_fontName_1, null);
          if (_operator_equals_4) {
            _builder.append("\t");
            _builder.append("String fontName = style.getFont().getName();");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("String fontName = \"");
            StyleLayout _layout_5 = l.getLayout();
            String _fontName_2 = _layout_5.getFontName();
            _builder.append(_fontName_2, "	");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_6 = l.getLayout();
          int _fontSize_1 = _layout_6.getFontSize();
          boolean _operator_equals_5 = IntegerExtensions.operator_equals(_fontSize_1, Integer.MIN_VALUE);
          if (_operator_equals_5) {
            _builder.append("\t");
            _builder.append("int fontSize = style.getFont().getSize();");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("int fontSize = ");
            StyleLayout _layout_7 = l.getLayout();
            int _fontSize_2 = _layout_7.getFontSize();
            _builder.append(_fontSize_2, "	");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_8 = l.getLayout();
          YesNoBool _fontItalic_2 = _layout_8.getFontItalic();
          boolean _operator_equals_6 = ObjectExtensions.operator_equals(_fontItalic_2, YesNoBool.NULL);
          if (_operator_equals_6) {
            _builder.append("\t");
            _builder.append("boolean fontItalic = style.getFont().isItalic();");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("boolean fontItalic = ");
            StyleLayout _layout_9 = l.getLayout();
            YesNoBool _fontItalic_3 = _layout_9.getFontItalic();
            String _transformYesNoToBoolean = this._styleGenerator.transformYesNoToBoolean(_fontItalic_3);
            _builder.append(_transformYesNoToBoolean, "	");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          StyleLayout _layout_10 = l.getLayout();
          YesNoBool _fontBold = _layout_10.getFontBold();
          boolean _operator_equals_7 = ObjectExtensions.operator_equals(_fontBold, YesNoBool.NULL);
          if (_operator_equals_7) {
            _builder.append("\t");
            _builder.append("boolean fontBold = style.getFont().isBold();");
            _builder.newLine();
          } else {
            _builder.append("\t");
            _builder.append("boolean fontBold = ");
            StyleLayout _layout_11 = l.getLayout();
            YesNoBool _fontBold_1 = _layout_11.getFontBold();
            String _transformYesNoToBoolean_1 = this._styleGenerator.transformYesNoToBoolean(_fontBold_1);
            _builder.append(_transformYesNoToBoolean_1, "	");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence createLineAttributes(final String attName, final ShapestyleLayout csl) {
    StringConcatenation _builder = new StringConcatenation();
    {
      StyleLayout _layout = csl.getLayout();
      ColorWithTransparency _lineColor = _layout.getLineColor();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_lineColor, null);
      if (_operator_notEquals) {
        _builder.append(attName, "");
        _builder.append(".setForeground(gaService.manageColor(diagram,");
        StyleLayout _layout_1 = csl.getLayout();
        ColorWithTransparency _lineColor_1 = _layout_1.getLineColor();
        CharSequence _createColorValue = this._styleGenerator.createColorValue(_lineColor_1);
        _builder.append(_createColorValue, "");
        _builder.append("));    \t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _operator_and = false;
      StyleLayout _layout_2 = csl.getLayout();
      LineStyle _lineStyle = _layout_2.getLineStyle();
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_lineStyle, null);
      if (!_operator_notEquals_1) {
        _operator_and = false;
      } else {
        StyleLayout _layout_3 = csl.getLayout();
        LineStyle _lineStyle_1 = _layout_3.getLineStyle();
        boolean _operator_notEquals_2 = ObjectExtensions.operator_notEquals(_lineStyle_1, LineStyle.NULL);
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals_1, _operator_notEquals_2);
      }
      if (_operator_and) {
        _builder.append(attName, "");
        _builder.append(".setLineStyle(LineStyle.");
        StyleLayout _layout_4 = csl.getLayout();
        LineStyle _lineStyle_2 = _layout_4.getLineStyle();
        String _name = _lineStyle_2.name();
        _builder.append(_name, "");
        _builder.append(");\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      StyleLayout _layout_5 = csl.getLayout();
      int _lineWidth = _layout_5.getLineWidth();
      boolean _operator_notEquals_3 = IntegerExtensions.operator_notEquals(_lineWidth, Integer.MIN_VALUE);
      if (_operator_notEquals_3) {
        _builder.append(attName, "");
        _builder.append(".setLineWidth(");
        StyleLayout _layout_6 = csl.getLayout();
        int _lineWidth_1 = _layout_6.getLineWidth();
        _builder.append(_lineWidth_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
