package org.eclipselabs.spray.generator;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.ComparableExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.styles.Background;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.ColorConstants;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.Font;
import org.eclipselabs.spray.styles.Line;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.Transparency;
import org.eclipselabs.spray.styles.Transparent;

@SuppressWarnings("all")
public class StylesGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Style> _filter = IterableExtensions.<Style>filter(_allContentsIterable, org.eclipselabs.spray.styles.Style.class);
    for (final Style style : _filter) {
      String _filepath = this.filepath(style);
      StringConcatenation _compile = this.compile(style);
      fsa.generateFile(_filepath, _compile);
    }
  }
  
  public String filepath(final Style s) {
    String _packagePath = this.packagePath(s);
    String _className = this.className(s);
    String _operator_plus = StringExtensions.operator_plus(_packagePath, _className);
    String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, ".java");
    return _operator_plus_1;
  }
  
  public String className(final Style s) {
    String _name = s.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return _firstUpper;
  }
  
  public String packageName(final Style s) {
    return "org.eclipselabs.spray.styles";
  }
  
  public String packagePath(final Style s) {
    return "org/eclipselabs/spray/styles/";
  }
  
  public StringConcatenation compile(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Style for Spray");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = this.packageName(s);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Style;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Color;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.ColorConstant;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IColorConstant;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.ISprayStyle;");
    _builder.newLine();
    _builder.newLine();
    StringConcatenation _body = this.body(s);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation body(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.className(s);
    _builder.append(_className, "");
    _builder.append(" implements ISprayStyle {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Style getStyle(Diagram diagram) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Creating Style with given id and description");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Style style = gaService.createStyle(diagram, \"");
    String _name = s.getName();
    _builder.append(_name, "		");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("style.setDescription(\"");
    String _description = s.getDescription();
    _builder.append(_description, "		");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    StyleLayout _layout = s.getLayout();
    StringConcatenation _createLayout = this.createLayout(_layout);
    _builder.append(_createLayout, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t    ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return style;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Color getFontColor(Diagram diagram) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return gaService.manageColor(diagram, ");
    StyleLayout _layout_1 = s.getLayout();
    CharSequence _createFontColor = this.createFontColor(_layout_1);
    _builder.append(_createFontColor, "		");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation createLayout(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    Transparency _transparency = l.getTransparency();
    StringConcatenation _createTransparencyAttributes = this.createTransparencyAttributes(_transparency);
    _builder.append(_createTransparencyAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    Background _background = l.getBackground();
    StringConcatenation _createBackgroundAttributes = this.createBackgroundAttributes(_background);
    _builder.append(_createBackgroundAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    Line _line = l.getLine();
    StringConcatenation _createLineAttributes = this.createLineAttributes(_line);
    _builder.append(_createLineAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    Font _font = l.getFont();
    StringConcatenation _createFontAttributes = this.createFontAttributes(_font);
    _builder.append(_createFontAttributes, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation createTransparencyAttributes(final Transparency l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Setting the transparency value - default is 1.0");
    _builder.newLine();
    {
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        double _transparency = l.getTransparency();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(((Double)_transparency), null);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      if (_operator_or) {
        _builder.append("style.setTransparency(1.0);");
        _builder.newLine();
      } else {
        _builder.append("style.setTransparency(");
        double _transparency_1 = l.getTransparency();
        _builder.append(_transparency_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation createBackgroundAttributes(final Background l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Setting the background color");
    _builder.newLine();
    {
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        ColorWithTransparency _background = l.getBackground();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_background, null);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      if (_operator_or) {
        _builder.append("style.setFilled(true);");
        _builder.newLine();
        _builder.append("style.setBackground(gaService.manageColor(diagram, IColorConstant.WHITE));");
        _builder.newLine();
      } else {
        ColorWithTransparency _background_1 = l.getBackground();
        if ((_background_1 instanceof Transparent)) {
          _builder.append("style.setFilled(false);");
          _builder.newLine();
        } else {
          _builder.append("style.setFilled(true);");
          _builder.newLine();
          _builder.append("style.setBackground(gaService.manageColor(diagram, ");
          ColorWithTransparency _background_2 = l.getBackground();
          StringConcatenation _createColorValue = this.createColorValue(_background_2);
          _builder.append(_createColorValue, "");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation createLineAttributes(final Line l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Setting the line attributes (line color is called foreground color)");
    _builder.newLine();
    {
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        ColorWithTransparency _lineColor = l.getLineColor();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_lineColor, null);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      if (_operator_or) {
        _builder.append("style.setLineVisible(true);");
        _builder.newLine();
        _builder.append("style.setForeground(gaService.manageColor(diagram, IColorConstant.BLACK));");
        _builder.newLine();
        _builder.append("style.setLineWidth(");
        int _lineWidth = l.getLineWidth();
        int _max = Math.max(_lineWidth, 1);
        _builder.append(_max, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        {
          LineStyle _lineStyle = l.getLineStyle();
          boolean _operator_equals_2 = ObjectExtensions.operator_equals(_lineStyle, null);
          if (_operator_equals_2) {
            _builder.append("style.setLineStyle(LineStyle.SOLID);");
            _builder.newLine();
          } else {
            _builder.append("style.setLineStyle(LineStyle.");
            LineStyle _lineStyle_1 = l.getLineStyle();
            String _name = _lineStyle_1.name();
            _builder.append(_name, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      } else {
        ColorWithTransparency _lineColor_1 = l.getLineColor();
        if ((_lineColor_1 instanceof Transparent)) {
          _builder.append("style.setLineVisible(false);");
          _builder.newLine();
        } else {
          _builder.append("style.setLineVisible(true);");
          _builder.newLine();
          _builder.append("style.setForeground(gaService.manageColor(diagram, ");
          ColorWithTransparency _lineColor_2 = l.getLineColor();
          StringConcatenation _createColorValue = this.createColorValue(_lineColor_2);
          _builder.append(_createColorValue, "");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
          _builder.append("style.setLineWidth(");
          int _lineWidth_1 = l.getLineWidth();
          int _max_1 = Math.max(_lineWidth_1, 1);
          _builder.append(_max_1, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          {
            LineStyle _lineStyle_2 = l.getLineStyle();
            boolean _operator_equals_3 = ObjectExtensions.operator_equals(_lineStyle_2, null);
            if (_operator_equals_3) {
              _builder.append("style.setLineStyle(LineStyle.SOLID);");
              _builder.newLine();
            } else {
              _builder.append("style.setLineStyle(LineStyle.");
              LineStyle _lineStyle_3 = l.getLineStyle();
              String _name_1 = _lineStyle_3.name();
              _builder.append(_name_1, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation createFontAttributes(final Font l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Managing the font (default values are Arial, size 8, no italic, no bold)");
    _builder.newLine();
    {
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        String _fontName = l.getFontName();
        boolean _operator_equals_1 = ObjectExtensions.operator_equals(_fontName, null);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      if (_operator_or) {
        _builder.append("String fontName = \"Arial\";");
        _builder.newLine();
      } else {
        _builder.append("String fontName = \"");
        String _fontName_1 = l.getFontName();
        _builder.append(_fontName_1, "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _operator_or_1 = false;
      boolean _operator_equals_2 = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals_2) {
        _operator_or_1 = true;
      } else {
        int _fontSize = l.getFontSize();
        boolean _operator_greaterThan = ComparableExtensions.<Integer>operator_greaterThan(((Integer)_fontSize), ((Integer)0));
        boolean _operator_not = BooleanExtensions.operator_not(_operator_greaterThan);
        _operator_or_1 = BooleanExtensions.operator_or(_operator_equals_2, _operator_not);
      }
      if (_operator_or_1) {
        _builder.append("int fontSize = 8;");
        _builder.newLine();
      } else {
        _builder.append("int fontSize = ");
        int _fontSize_1 = l.getFontSize();
        _builder.append(_fontSize_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("style.setFont(gaService.manageFont(diagram, fontName, fontSize, ");
    boolean _isFontItalic = l.isFontItalic();
    _builder.append(_isFontItalic, "");
    _builder.append(", ");
    boolean _isFontBold = l.isFontBold();
    _builder.append(_isFontBold, "");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createFontColor(final StyleLayout l) {
    CharSequence _xifexpression = null;
    boolean _operator_or = false;
    Font _font = l.getFont();
    boolean _operator_equals = ObjectExtensions.operator_equals(_font, null);
    if (_operator_equals) {
      _operator_or = true;
    } else {
      Font _font_1 = l.getFont();
      Color _fontColor = _font_1.getFontColor();
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_fontColor, null);
      _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
    }
    if (_operator_or) {
      CharSequence _xifexpression_1 = null;
      boolean _operator_or_1 = false;
      Line _line = l.getLine();
      boolean _operator_equals_2 = ObjectExtensions.operator_equals(_line, null);
      if (_operator_equals_2) {
        _operator_or_1 = true;
      } else {
        Line _line_1 = l.getLine();
        ColorWithTransparency _lineColor = _line_1.getLineColor();
        boolean _operator_equals_3 = ObjectExtensions.operator_equals(_lineColor, null);
        _operator_or_1 = BooleanExtensions.operator_or(_operator_equals_2, _operator_equals_3);
      }
      if (_operator_or_1) {
        _xifexpression_1 = "IColorConstant.BLACK";
      } else {
        Line _line_2 = l.getLine();
        ColorWithTransparency _lineColor_1 = _line_2.getLineColor();
        StringConcatenation _createColorValue = this.createColorValue(_lineColor_1);
        _xifexpression_1 = _createColorValue;
      }
      _xifexpression = _xifexpression_1;
    } else {
      Font _font_2 = l.getFont();
      Color _fontColor_1 = _font_2.getFontColor();
      StringConcatenation _createColorValue_1 = this.createColorValue(_fontColor_1);
      _xifexpression = _createColorValue_1;
    }
    return _xifexpression;
  }
  
  protected StringConcatenation _createColorValue(final Transparent c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("null");
    return _builder;
  }
  
  protected StringConcatenation _createColorValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IColorConstant.");
    ColorConstants _value = c.getValue();
    String _name = _value.name();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected StringConcatenation _createColorValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ColorConstant(");
    int _red = c.getRed();
    _builder.append(_red, "");
    _builder.append(", ");
    int _green = c.getGreen();
    _builder.append(_green, "");
    _builder.append(", ");
    int _blue = c.getBlue();
    _builder.append(_blue, "");
    _builder.append(")");
    return _builder;
  }
  
  public StringConcatenation createColorValue(final ColorWithTransparency c) {
    if (c instanceof ColorConstantRef) {
      return _createColorValue((ColorConstantRef)c);
    } else if (c instanceof RGBColor) {
      return _createColorValue((RGBColor)c);
    } else if (c instanceof Transparent) {
      return _createColorValue((Transparent)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
