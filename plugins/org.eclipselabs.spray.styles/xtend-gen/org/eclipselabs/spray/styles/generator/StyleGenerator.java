package org.eclipselabs.spray.styles.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.styles.styles.Color;
import org.eclipselabs.spray.styles.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.styles.ColorConstants;
import org.eclipselabs.spray.styles.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.styles.LineStyle;
import org.eclipselabs.spray.styles.styles.RGBColor;
import org.eclipselabs.spray.styles.styles.Style;
import org.eclipselabs.spray.styles.styles.StyleLayout;
import org.eclipselabs.spray.styles.styles.Transparent;
import org.eclipselabs.spray.styles.styles.YesNoBool;

@SuppressWarnings("all")
public class StyleGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Style> _filter = IterableExtensions.<Style>filter(_iterable, org.eclipselabs.spray.styles.styles.Style.class);
    for (final Style style : _filter) {
      String _filepath = this.filepath(style);
      CharSequence _compile = this.compile(style);
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
  
  public CharSequence compile(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _head = this.head(s);
    _builder.append(_head, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _body = this.body(s);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence head(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Style class for Spray.");
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
    {
      JvmTypeReference _superStyle = s.getSuperStyle();
      boolean _operator_equals = ObjectExtensions.operator_equals(_superStyle, null);
      if (_operator_equals) {
      } else {
        _builder.append("import ");
        JvmTypeReference _superStyle_1 = s.getSuperStyle();
        String _qualifiedName = _superStyle_1.getQualifiedName();
        _builder.append(_qualifiedName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence body(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Style class for Spray.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Description: ");
    String _description = s.getDescription();
    _builder.append(_description, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.className(s);
    _builder.append(_className, "");
    _builder.append(" extends ");
    String _createSuperStyle = this.createSuperStyle(s);
    _builder.append(_createSuperStyle, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* This method creates a Style and returns the defined style.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* Description: ");
    String _description_1 = s.getDescription();
    _builder.append(_description_1, "	 ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Style newStyle(Diagram diagram) {");
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
    _builder.append("Style style = super.newStyle(diagram);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("style.setId(\"");
    String _name = s.getName();
    _builder.append(_name, "		");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("style.setDescription(\"");
    String _description_2 = s.getDescription();
    _builder.append(_description_2, "		");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    StyleLayout _layout = s.getLayout();
    CharSequence _createLayout = this.createLayout(_layout);
    _builder.append(_createLayout, "		");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return style;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* This method returns the font color for the style. ");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* The font color will be returned separated, because Graphiti allows just the foreground color.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("* The foreground color will be used for lines and fonts at the same time.");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Color getFontColor(Diagram diagram) {");
    _builder.newLine();
    _builder.append("\t\t");
    StyleLayout _layout_1 = s.getLayout();
    CharSequence _createFontColor = this.createFontColor(_layout_1);
    _builder.append(_createFontColor, "		");
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
  
  public String createSuperStyle(final Style s) {
    String _xifexpression = null;
    JvmTypeReference _superStyle = s.getSuperStyle();
    boolean _operator_equals = ObjectExtensions.operator_equals(_superStyle, null);
    if (_operator_equals) {
      _xifexpression = "DefaultSprayStyle";
    } else {
      JvmTypeReference _superStyle_1 = s.getSuperStyle();
      String _simpleName = _superStyle_1.getSimpleName();
      _xifexpression = _simpleName;
    }
    return _xifexpression;
  }
  
  public CharSequence getStyle(final Style s) {
    CharSequence _xifexpression = null;
    JvmTypeReference _superStyle = s.getSuperStyle();
    boolean _operator_equals = ObjectExtensions.operator_equals(_superStyle, null);
    if (_operator_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("gaService.createStyle(diagram, \"");
      String _name = s.getName();
      _builder.append(_name, "");
      _builder.append("\");");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("super.getStyle(diagram);");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  public CharSequence createLayout(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _createTransparencyAttributes = this.createTransparencyAttributes(l);
    _builder.append(_createTransparencyAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createBackgroundAttributes = this.createBackgroundAttributes(l);
    _builder.append(_createBackgroundAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createLineAttributes = this.createLineAttributes(l);
    _builder.append(_createLineAttributes, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _createFontAttributes = this.createFontAttributes(l);
    _builder.append(_createFontAttributes, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence createTransparencyAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// transparency value");
    _builder.newLine();
    {
      boolean _operator_or = false;
      boolean _operator_equals = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals) {
        _operator_or = true;
      } else {
        double _transparency = l.getTransparency();
        boolean _operator_equals_1 = DoubleExtensions.operator_equals(_transparency, Double.MIN_VALUE);
        _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
      }
      boolean _operator_not = BooleanExtensions.operator_not(_operator_or);
      if (_operator_not) {
        _builder.append("style.setTransparency(");
        double _transparency_1 = l.getTransparency();
        _builder.append(_transparency_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence createBackgroundAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// background attributes");
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
      } else {
        ColorWithTransparency _background_1 = l.getBackground();
        if ((_background_1 instanceof Transparent)) {
          _builder.append("style.setFilled(false);");
          _builder.newLine();
          _builder.append("style.setBackground(null);");
          _builder.newLine();
        } else {
          _builder.append("style.setFilled(true);");
          _builder.newLine();
          _builder.append("style.setBackground(gaService.manageColor(diagram, ");
          ColorWithTransparency _background_2 = l.getBackground();
          CharSequence _createColorValue = this.createColorValue(_background_2);
          _builder.append(_createColorValue, "");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence createLineAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// line attributes");
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
      } else {
        ColorWithTransparency _lineColor_1 = l.getLineColor();
        if ((_lineColor_1 instanceof Transparent)) {
          _builder.append("style.setLineVisible(false);");
          _builder.newLine();
          _builder.append("style.setForeground(null);");
          _builder.newLine();
        } else {
          _builder.append("style.setLineVisible(true);");
          _builder.newLine();
          _builder.append("style.setForeground(gaService.manageColor(diagram, ");
          ColorWithTransparency _lineColor_2 = l.getLineColor();
          CharSequence _createColorValue = this.createColorValue(_lineColor_2);
          _builder.append(_createColorValue, "");
          _builder.append("));");
          _builder.newLineIfNotEmpty();
          {
            int _lineWidth = l.getLineWidth();
            boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_lineWidth, 0);
            if (_operator_greaterThan) {
              _builder.append("style.setLineWidth(");
              int _lineWidth_1 = l.getLineWidth();
              int _max = Math.max(_lineWidth_1, 1);
              _builder.append(_max, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            LineStyle _lineStyle = l.getLineStyle();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_lineStyle, LineStyle.NULL);
            if (_operator_notEquals) {
              _builder.append("style.setLineStyle(LineStyle.");
              LineStyle _lineStyle_1 = l.getLineStyle();
              String _name = _lineStyle_1.name();
              _builder.append(_name, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence createFontAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// font attributes");
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
        _builder.append("String fontName = style.getFont().getName();");
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
        boolean _operator_equals_3 = IntegerExtensions.operator_equals(_fontSize, Integer.MIN_VALUE);
        _operator_or_1 = BooleanExtensions.operator_or(_operator_equals_2, _operator_equals_3);
      }
      if (_operator_or_1) {
        _builder.append("int fontSize = style.getFont().getSize();");
        _builder.newLine();
      } else {
        _builder.append("int fontSize = ");
        int _fontSize_1 = l.getFontSize();
        _builder.append(_fontSize_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _operator_or_2 = false;
      boolean _operator_equals_4 = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals_4) {
        _operator_or_2 = true;
      } else {
        YesNoBool _fontItalic = l.getFontItalic();
        boolean _operator_equals_5 = ObjectExtensions.operator_equals(_fontItalic, YesNoBool.NULL);
        _operator_or_2 = BooleanExtensions.operator_or(_operator_equals_4, _operator_equals_5);
      }
      if (_operator_or_2) {
        _builder.append("boolean fontItalic = style.getFont().isItalic();");
        _builder.newLine();
      } else {
        _builder.append("boolean fontItalic = ");
        YesNoBool _fontItalic_1 = l.getFontItalic();
        String _transformYesNoToBoolean = this.transformYesNoToBoolean(_fontItalic_1);
        _builder.append(_transformYesNoToBoolean, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      boolean _operator_or_3 = false;
      boolean _operator_equals_6 = ObjectExtensions.operator_equals(l, null);
      if (_operator_equals_6) {
        _operator_or_3 = true;
      } else {
        YesNoBool _fontBold = l.getFontBold();
        boolean _operator_equals_7 = ObjectExtensions.operator_equals(_fontBold, YesNoBool.NULL);
        _operator_or_3 = BooleanExtensions.operator_or(_operator_equals_6, _operator_equals_7);
      }
      if (_operator_or_3) {
        _builder.append("boolean fontBold = style.getFont().isBold();");
        _builder.newLine();
      } else {
        _builder.append("boolean fontBold = ");
        YesNoBool _fontBold_1 = l.getFontBold();
        String _transformYesNoToBoolean_1 = this.transformYesNoToBoolean(_fontBold_1);
        _builder.append(_transformYesNoToBoolean_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createFontColor(final StyleLayout l) {
    CharSequence _xifexpression = null;
    boolean _operator_or = false;
    boolean _operator_equals = ObjectExtensions.operator_equals(l, null);
    if (_operator_equals) {
      _operator_or = true;
    } else {
      Color _fontColor = l.getFontColor();
      boolean _operator_equals_1 = ObjectExtensions.operator_equals(_fontColor, null);
      _operator_or = BooleanExtensions.operator_or(_operator_equals, _operator_equals_1);
    }
    if (_operator_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return super.getFontColor(diagram);");
      _xifexpression = _builder;
    } else {
      Color _fontColor_1 = l.getFontColor();
      CharSequence _createFontColor = this.createFontColor(_fontColor_1);
      _xifexpression = _createFontColor;
    }
    return _xifexpression;
  }
  
  public CharSequence createFontColor(final ColorWithTransparency c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("return gaService.manageColor(diagram, ");
    CharSequence _createColorValue = this.createColorValue(c);
    _builder.append(_createColorValue, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String transformYesNoToBoolean(final YesNoBool yesNo) {
    String _xifexpression = null;
    boolean _operator_equals = ObjectExtensions.operator_equals(yesNo, YesNoBool.YES);
    if (_operator_equals) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    return _xifexpression;
  }
  
  protected CharSequence _createColorValue(final Transparent c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("null");
    return _builder;
  }
  
  protected CharSequence _createColorValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IColorConstant.");
    ColorConstants _value = c.getValue();
    String _name = _value.name();
    _builder.append(_name, "");
    return _builder;
  }
  
  protected CharSequence _createColorValue(final RGBColor c) {
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
  
  public CharSequence createColorValue(final ColorWithTransparency c) {
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
