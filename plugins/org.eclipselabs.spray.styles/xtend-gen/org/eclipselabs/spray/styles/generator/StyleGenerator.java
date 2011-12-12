package org.eclipselabs.spray.styles.generator;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipselabs.spray.styles.styles.Background;
import org.eclipselabs.spray.styles.styles.Color;
import org.eclipselabs.spray.styles.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.styles.Font;
import org.eclipselabs.spray.styles.styles.Line;
import org.eclipselabs.spray.styles.styles.RGBColor;
import org.eclipselabs.spray.styles.styles.Style;
import org.eclipselabs.spray.styles.styles.StyleLayout;
import org.eclipselabs.spray.styles.styles.Transparency;
import org.eclipselabs.spray.styles.styles.Transparent;

@SuppressWarnings("all")
public class StyleGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(resource);
    Iterable<Style> _filter = IterableExtensions.<Style>filter(_allContentsIterable, org.eclipselabs.spray.styles.styles.Style.class);
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
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Style for Spray");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package \uFFFDs.packageName\uFFFD;");
    _builder.newLine();
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
    _builder.append("\uFFFDs.body\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class \uFFFDs.className\uFFFD implements ISprayStyle {");
    _builder.newLine();
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
    _builder.append("Style style = gaService.createStyle(diagram, \"\uFFFDs.name\uFFFD\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("style.setDescription(\"\uFFFDs.description\uFFFD\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\uFFFDs.layout.createLayout\uFFFD");
    _builder.newLine();
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
    _builder.append("return gaService.manageColor(diagram, \uFFFDs.layout.createFontColor\uFFFD);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createLayout(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\uFFFDl.transparency.createTransparencyAttributes\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDl.background.createBackgroundAttributes\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDl.line.createLineAttributes\uFFFD");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\uFFFDl.font.createFontAttributes\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createTransparencyAttributes(final Transparency l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Setting the transparency value - default is 1.0");
    _builder.newLine();
    _builder.append("\uFFFDIF l == null || l.transparency == null\uFFFD");
    _builder.newLine();
    _builder.append("style.setTransparency(1.0);");
    _builder.newLine();
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("style.setTransparency(\uFFFDl.transparency\uFFFD);");
    _builder.newLine();
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createBackgroundAttributes(final Background l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Setting the background color");
    _builder.newLine();
    _builder.append("\uFFFDIF l == null || l.background == null\uFFFD");
    _builder.newLine();
    _builder.append("style.setFilled(true);");
    _builder.newLine();
    _builder.append("style.setBackground(gaService.manageColor(diagram, IColorConstant.WHITE));");
    _builder.newLine();
    _builder.append("\uFFFDELSEIF l.background instanceof Transparent\uFFFD");
    _builder.newLine();
    _builder.append("style.setFilled(false);");
    _builder.newLine();
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("style.setFilled(true);");
    _builder.newLine();
    _builder.append("style.setBackground(gaService.manageColor(diagram, \uFFFDl.background.createColorValue\uFFFD));");
    _builder.newLine();
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createLineAttributes(final Line l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Setting the line attributes (line color is called foreground color)");
    _builder.newLine();
    _builder.append("\uFFFDIF l == null || l.lineColor == null\uFFFD");
    _builder.newLine();
    _builder.append("style.setLineVisible(true);");
    _builder.newLine();
    _builder.append("style.setForeground(gaService.manageColor(diagram, IColorConstant.BLACK));");
    _builder.newLine();
    _builder.append("style.setLineWidth(\uFFFDMath::max(l.lineWidth,1)\uFFFD);");
    _builder.newLine();
    _builder.append("\uFFFDIF l.lineStyle == null\uFFFD ");
    _builder.newLine();
    _builder.append("style.setLineStyle(LineStyle.SOLID);");
    _builder.newLine();
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("style.setLineStyle(LineStyle.\uFFFDl.lineStyle.name\uFFFD);");
    _builder.newLine();
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDELSEIF l.lineColor instanceof Transparent\uFFFD");
    _builder.newLine();
    _builder.append("style.setLineVisible(false);");
    _builder.newLine();
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("style.setLineVisible(true);");
    _builder.newLine();
    _builder.append("style.setForeground(gaService.manageColor(diagram, \uFFFDl.lineColor.createColorValue\uFFFD));");
    _builder.newLine();
    _builder.append("style.setLineWidth(\uFFFDMath::max(l.lineWidth,1)\uFFFD);");
    _builder.newLine();
    _builder.append("\uFFFDIF l.lineStyle == null\uFFFD  ");
    _builder.newLine();
    _builder.append("style.setLineStyle(LineStyle.SOLID);");
    _builder.newLine();
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("style.setLineStyle(LineStyle.\uFFFDl.lineStyle.name\uFFFD);");
    _builder.newLine();
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createFontAttributes(final Font l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("        ");
    _builder.append("// Managing the font (default values are Arial, size 8, no italic, no bold)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\uFFFDIF l == null || l.fontName == null\uFFFD");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String fontName = \"Arial\";");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String fontName = \"\uFFFDl.fontName\uFFFD\";");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\uFFFDIF l == null || !(l.fontSize > 0)\uFFFD");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int fontSize = 8;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\uFFFDELSE\uFFFD");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int fontSize = \uFFFDl.fontSize\uFFFD;");
    _builder.newLine();
    _builder.append("\uFFFDENDIF\uFFFD");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("style.setFont(gaService.manageFont(diagram, fontName, fontSize, \uFFFDl.fontItalic\uFFFD, \uFFFDl.fontBold\uFFFD));");
    _builder.newLine();
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
        CharSequence _createColorValue = this.createColorValue(_lineColor_1);
        _xifexpression_1 = _createColorValue;
      }
      _xifexpression = _xifexpression_1;
    } else {
      Font _font_2 = l.getFont();
      Color _fontColor_1 = _font_2.getFontColor();
      CharSequence _createColorValue_1 = this.createColorValue(_fontColor_1);
      _xifexpression = _createColorValue_1;
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
    _builder.append("IColorConstant.\uFFFDc.value.name\uFFFD");
    return _builder;
  }
  
  protected CharSequence _createColorValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ColorConstant(\uFFFDc.red\uFFFD, \uFFFDc.green\uFFFD, \uFFFDc.blue\uFFFD)");
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
