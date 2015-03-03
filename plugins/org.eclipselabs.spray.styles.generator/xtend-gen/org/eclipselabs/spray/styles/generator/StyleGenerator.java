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
package org.eclipselabs.spray.styles.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.ColorConstants;
import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientAllignment;
import org.eclipselabs.spray.styles.GradientRef;
import org.eclipselabs.spray.styles.HighlightingValues;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.Transparent;
import org.eclipselabs.spray.styles.YesNoBool;
import org.eclipselabs.spray.styles.generator.GradientGenerator;
import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class StyleGenerator extends FileGenerator<Style> {
  @Inject
  @Extension
  private GradientGenerator gradientGenerator;
  
  public String filepath(final Style s) {
    String _packagePath = this.packagePath(s);
    String _className = this.className(s);
    String _plus = (_packagePath + _className);
    return (_plus + ".java");
  }
  
  public String gapClassName(final Style s) {
    String _name = s.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String className(final Style s) {
    String _gapClassName = this.gapClassName(s);
    return (_gapClassName + "Base");
  }
  
  public String packageName(final Style s) {
    return ProjectProperties.getStylesPackage();
  }
  
  public String packagePath(final Style s) {
    String _stylesPackage = ProjectProperties.getStylesPackage();
    return ProjectProperties.toPath(_stylesPackage);
  }
  
  @Override
  public String generate(final Style style, final GenFile genFile) {
    String _xblockexpression = null;
    {
      String _packageName = this.packageName(style);
      String _gapClassName = this.gapClassName(style);
      ((JavaGenFile) genFile).setPackageAndClass(_packageName, _gapClassName);
      _xblockexpression = super.generate(style, genFile);
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generateBaseFile(final Style style) {
    return this.compile(style);
  }
  
  @Override
  public CharSequence generateExtensionFile(final Style style) {
    return this.mainExtensionPointFile(style);
  }
  
  public CharSequence mainExtensionPointFile(final Style style) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.packageName(style);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class ");
    String _gapClassName = this.gapClassName(style);
    _builder.append(_gapClassName, "");
    _builder.append(" extends ");
    String _className = this.className(style);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
      boolean _equals = Objects.equal(_superStyle, null);
      if (_equals) {
      } else {
        _builder.append("import ");
        JvmTypeReference _superStyle_1 = s.getSuperStyle();
        String _qualifiedName = _superStyle_1.getQualifiedName();
        _builder.append(_qualifiedName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Style _superStyleFromDsl = s.getSuperStyleFromDsl();
      boolean _notEquals = (!Objects.equal(_superStyleFromDsl, null));
      if (_notEquals) {
        _builder.append("import ");
        String _packageName_1 = this.packageName(s);
        _builder.append(_packageName_1, "");
        _builder.append(".");
        Style _superStyleFromDsl_1 = s.getSuperStyleFromDsl();
        String _name = _superStyleFromDsl_1.getName();
        _builder.append(_name, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IGradientType;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IPredefinedRenderingStyle;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;");
    _builder.newLine();
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
    _builder.append("     ");
    _builder.append("* The IGaService instance for the whole class.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method creates and defines a Style and returns it. ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Description: ");
    String _description_1 = s.getDescription();
    _builder.append(_description_1, "     ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return The defined Style");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Style newStyle(Diagram diagram) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Style style = super.newStyle(diagram);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("style.setId(\"");
    String _name = s.getName();
    _builder.append(_name, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("style.setDescription(\"");
    String _description_2 = s.getDescription();
    _builder.append(_description_2, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineStyleTransparency(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineBackground(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineLineAttributes(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("defineFontAttributes(diagram, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return style;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style transparency.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the transparency will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineStyleTransparency(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    StyleLayout _layout = s.getLayout();
    CharSequence _createTransparencyAttributes = this.createTransparencyAttributes(_layout);
    _builder.append(_createTransparencyAttributes, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style background.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* If a gradient is been used, then a color schema will be set for the background.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the background will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineBackground(Diagram diagram, Style style) {");
    _builder.newLine();
    {
      StyleLayout _layout_1 = s.getLayout();
      boolean _checkColorSchemaNecessary = this.checkColorSchemaNecessary(_layout_1);
      if (_checkColorSchemaNecessary) {
        _builder.append("        ");
        CharSequence _setColorSchema = this.setColorSchema();
        _builder.append(_setColorSchema, "        ");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("        ");
        StyleLayout _layout_2 = s.getLayout();
        CharSequence _createBackgroundAttributes = this.createBackgroundAttributes(_layout_2);
        _builder.append(_createBackgroundAttributes, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style line attributes.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the line attributes will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineLineAttributes(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    StyleLayout _layout_3 = s.getLayout();
    CharSequence _createLineAttributes = this.createLineAttributes(_layout_3);
    _builder.append(_createLineAttributes, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method will be called from the newStyle-method for defining the Style font attributes.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param diagram the diagram attribute");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @param style the Style attribute, where the font attributes will be set.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void defineFontAttributes(Diagram diagram, Style style) {");
    _builder.newLine();
    _builder.append("        ");
    StyleLayout _layout_4 = s.getLayout();
    CharSequence _createFontAttributes = this.createFontAttributes(_layout_4);
    _builder.append(_createFontAttributes, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method returns the font color for the style. ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The font color will be returned separatly, because Graphiti allows just the foreground color.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The foreground color will be used for lines and fonts at the same time.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Color getFontColor(Diagram diagram) {");
    _builder.newLine();
    _builder.append("        ");
    StyleLayout _layout_5 = s.getLayout();
    CharSequence _createFontColor = this.createFontColor(_layout_5);
    _builder.append(_createFontColor, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method returns Color Schema of the Style");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public AdaptedGradientColoredAreas getColorSchema() {");
    _builder.newLine();
    _builder.append("        ");
    StyleLayout _layout_6 = s.getLayout();
    CharSequence _createStyleColorSchema = this.createStyleColorSchema(_layout_6, s);
    _builder.append(_createStyleColorSchema, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String createSuperStyle(final Style s) {
    String _xifexpression = null;
    JvmTypeReference _superStyle = s.getSuperStyle();
    boolean _equals = Objects.equal(_superStyle, null);
    if (_equals) {
      String _xifexpression_1 = null;
      Style _superStyleFromDsl = s.getSuperStyleFromDsl();
      boolean _equals_1 = Objects.equal(_superStyleFromDsl, null);
      if (_equals_1) {
        _xifexpression_1 = "org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle";
      } else {
        Style _superStyleFromDsl_1 = s.getSuperStyleFromDsl();
        _xifexpression_1 = _superStyleFromDsl_1.getName();
      }
      _xifexpression = _xifexpression_1;
    } else {
      JvmTypeReference _superStyle_1 = s.getSuperStyle();
      _xifexpression = _superStyle_1.getSimpleName();
    }
    return _xifexpression;
  }
  
  public CharSequence getStyle(final Style s) {
    CharSequence _xifexpression = null;
    JvmTypeReference _superStyle = s.getSuperStyle();
    boolean _equals = Objects.equal(_superStyle, null);
    if (_equals) {
      CharSequence _xifexpression_1 = null;
      Style _superStyleFromDsl = s.getSuperStyleFromDsl();
      boolean _equals_1 = Objects.equal(_superStyleFromDsl, null);
      if (_equals_1) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("gaService.createStyle(diagram, \"");
        String _name = s.getName();
        _builder.append(_name, "");
        _builder.append("\");");
        _xifexpression_1 = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("super.getStyle(diagram);");
        _xifexpression_1 = _builder_1;
      }
      _xifexpression = _xifexpression_1;
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("super.getStyle(diagram);");
      _xifexpression = _builder_2;
    }
    return _xifexpression;
  }
  
  public CharSequence createTransparencyAttributes(final StyleLayout l) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _or = false;
      boolean _equals = Objects.equal(l, null);
      if (_equals) {
        _or = true;
      } else {
        double _transparency = l.getTransparency();
        boolean _equals_1 = (_transparency == Double.MIN_VALUE);
        _or = _equals_1;
      }
      boolean _not = (!_or);
      if (_not) {
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
    {
      boolean _or = false;
      boolean _equals = Objects.equal(l, null);
      if (_equals) {
        _or = true;
      } else {
        ColorOrGradient _background = l.getBackground();
        boolean _equals_1 = Objects.equal(_background, null);
        _or = _equals_1;
      }
      if (_or) {
      } else {
        ColorOrGradient _background_1 = l.getBackground();
        if ((_background_1 instanceof Transparent)) {
          _builder.append("style.setFilled(false);");
          _builder.newLine();
          _builder.append("style.setBackground(null);");
          _builder.newLine();
        } else {
          _builder.append("style.setFilled(true);");
          _builder.newLine();
          _builder.append("style.setBackground(gaService.manageColor(diagram, ");
          ColorOrGradient _background_2 = l.getBackground();
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
    {
      boolean _or = false;
      boolean _equals = Objects.equal(l, null);
      if (_equals) {
        _or = true;
      } else {
        ColorWithTransparency _lineColor = l.getLineColor();
        boolean _equals_1 = Objects.equal(_lineColor, null);
        _or = _equals_1;
      }
      if (_or) {
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
            boolean _greaterThan = (_lineWidth > 0);
            if (_greaterThan) {
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
            boolean _notEquals = (!Objects.equal(_lineStyle, LineStyle.NULL));
            if (_notEquals) {
              _builder.append("style.setLineStyle(LineStyle.");
              LineStyle _lineStyle_1 = l.getLineStyle();
              String _name = _lineStyle_1.getName();
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
    {
      boolean _or = false;
      boolean _equals = Objects.equal(l, null);
      if (_equals) {
        _or = true;
      } else {
        String _fontName = l.getFontName();
        boolean _equals_1 = Objects.equal(_fontName, null);
        _or = _equals_1;
      }
      if (_or) {
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
      boolean _or_1 = false;
      boolean _equals_2 = Objects.equal(l, null);
      if (_equals_2) {
        _or_1 = true;
      } else {
        int _fontSize = l.getFontSize();
        boolean _equals_3 = (_fontSize == Integer.MIN_VALUE);
        _or_1 = _equals_3;
      }
      if (_or_1) {
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
      boolean _or_2 = false;
      boolean _equals_4 = Objects.equal(l, null);
      if (_equals_4) {
        _or_2 = true;
      } else {
        YesNoBool _fontItalic = l.getFontItalic();
        boolean _equals_5 = Objects.equal(_fontItalic, YesNoBool.NULL);
        _or_2 = _equals_5;
      }
      if (_or_2) {
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
      boolean _or_3 = false;
      boolean _equals_6 = Objects.equal(l, null);
      if (_equals_6) {
        _or_3 = true;
      } else {
        YesNoBool _fontBold = l.getFontBold();
        boolean _equals_7 = Objects.equal(_fontBold, YesNoBool.NULL);
        _or_3 = _equals_7;
      }
      if (_or_3) {
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
    boolean _or = false;
    boolean _equals = Objects.equal(l, null);
    if (_equals) {
      _or = true;
    } else {
      Color _fontColor = l.getFontColor();
      boolean _equals_1 = Objects.equal(_fontColor, null);
      _or = _equals_1;
    }
    if (_or) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("return super.getFontColor(diagram);");
      _xifexpression = _builder;
    } else {
      Color _fontColor_1 = l.getFontColor();
      _xifexpression = this.createFontColor(_fontColor_1);
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
    boolean _equals = Objects.equal(yesNo, YesNoBool.YES);
    if (_equals) {
      _xifexpression = "true";
    } else {
      _xifexpression = "false";
    }
    return _xifexpression;
  }
  
  protected CharSequence _createColorValue(final Transparent c) {
    return "null";
  }
  
  protected CharSequence _createColorValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("IColorConstant.");
    ColorConstants _value = c.getValue();
    String _name = _value.getName();
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
  
  public CharSequence createStyleColorSchema(final StyleLayout l, final Style s) {
    CharSequence _xblockexpression = null;
    {
      GradientAllignment _gradient_orientation = l.getGradient_orientation();
      CharSequence gradientOrientation = this.mapGradientOrientation(_gradient_orientation);
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _checkColorSchemaNecessary = this.checkColorSchemaNecessary(l);
        boolean _equals = (_checkColorSchemaNecessary == false);
        if (_equals) {
          _builder.append("return null;");
          _builder.newLine();
        } else {
          _builder.append("final AdaptedGradientColoredAreas agca =");
          _builder.newLine();
          _builder.append("StylesFactory.eINSTANCE.createAdaptedGradientColoredAreas();");
          _builder.newLine();
          _builder.append("agca.setDefinedStyleId(\"");
          CharSequence _createStyleGradientID = this.createStyleGradientID(s);
          _builder.append(_createStyleGradientID, "");
          _builder.append("\");");
          _builder.newLineIfNotEmpty();
          _builder.append("agca.setGradientType(");
          _builder.append(gradientOrientation, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          {
            ColorOrGradient _background = l.getBackground();
            boolean _notEquals = (!Objects.equal(_background, null));
            if (_notEquals) {
              _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_DEFAULT, ");
              ColorOrGradient _background_1 = l.getBackground();
              CharSequence _gradientColoredAreas = this.gradientColoredAreas(_background_1);
              _builder.append(_gradientColoredAreas, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          }
          {
            HighlightingValues _highlighting = l.getHighlighting();
            boolean _notEquals_1 = (!Objects.equal(_highlighting, null));
            if (_notEquals_1) {
              {
                HighlightingValues _highlighting_1 = l.getHighlighting();
                ColorOrGradient _selected = _highlighting_1.getSelected();
                boolean _notEquals_2 = (!Objects.equal(_selected, null));
                if (_notEquals_2) {
                  _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_PRIMARY_SELECTED, ");
                  HighlightingValues _highlighting_2 = l.getHighlighting();
                  ColorOrGradient _selected_1 = _highlighting_2.getSelected();
                  CharSequence _gradientColoredAreas_1 = this.gradientColoredAreas(_selected_1);
                  _builder.append(_gradientColoredAreas_1, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                HighlightingValues _highlighting_3 = l.getHighlighting();
                ColorOrGradient _multiselected = _highlighting_3.getMultiselected();
                boolean _notEquals_3 = (!Objects.equal(_multiselected, null));
                if (_notEquals_3) {
                  _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_SECONDARY_SELECTED, ");
                  HighlightingValues _highlighting_4 = l.getHighlighting();
                  ColorOrGradient _multiselected_1 = _highlighting_4.getMultiselected();
                  CharSequence _gradientColoredAreas_2 = this.gradientColoredAreas(_multiselected_1);
                  _builder.append(_gradientColoredAreas_2, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                HighlightingValues _highlighting_5 = l.getHighlighting();
                ColorOrGradient _allowed = _highlighting_5.getAllowed();
                boolean _notEquals_4 = (!Objects.equal(_allowed, null));
                if (_notEquals_4) {
                  _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_ALLOWED, ");
                  HighlightingValues _highlighting_6 = l.getHighlighting();
                  ColorOrGradient _allowed_1 = _highlighting_6.getAllowed();
                  CharSequence _gradientColoredAreas_3 = this.gradientColoredAreas(_allowed_1);
                  _builder.append(_gradientColoredAreas_3, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
              {
                HighlightingValues _highlighting_7 = l.getHighlighting();
                ColorOrGradient _unallowed = _highlighting_7.getUnallowed();
                boolean _notEquals_5 = (!Objects.equal(_unallowed, null));
                if (_notEquals_5) {
                  _builder.append("agca.getAdaptedGradientColoredAreas().add(IPredefinedRenderingStyle.STYLE_ADAPTATION_ACTION_FORBIDDEN, ");
                  HighlightingValues _highlighting_8 = l.getHighlighting();
                  ColorOrGradient _unallowed_1 = _highlighting_8.getUnallowed();
                  CharSequence _gradientColoredAreas_4 = this.gradientColoredAreas(_unallowed_1);
                  _builder.append(_gradientColoredAreas_4, "");
                  _builder.append(");");
                  _builder.newLineIfNotEmpty();
                }
              }
            }
          }
          _builder.append("return agca;");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence mapGradientOrientation(final GradientAllignment ga) {
    CharSequence _xifexpression = null;
    boolean _equals = Objects.equal(ga, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("IGradientType.");
      String _name = GradientAllignment.VERTICAL.getName();
      _builder.append(_name, "");
      _xifexpression = _builder;
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _equals_1 = Objects.equal(ga, GradientAllignment.HORIZONTAL);
      if (_equals_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("IGradientType.");
        String _name_1 = GradientAllignment.HORIZONTAL.getName();
        _builder_1.append(_name_1, "");
        _xifexpression_1 = _builder_1;
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("IGradientType.");
        String _name_2 = GradientAllignment.VERTICAL.getName();
        _builder_2.append(_name_2, "");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public boolean checkColorSchemaNecessary(final StyleLayout l) {
    boolean _and = false;
    HighlightingValues _highlighting = l.getHighlighting();
    boolean _equals = Objects.equal(_highlighting, null);
    if (!_equals) {
      _and = false;
    } else {
      _and = (!(l.getBackground() instanceof GradientRef));
    }
    if (_and) {
      return false;
    } else {
      return true;
    }
  }
  
  public CharSequence createStyleGradientID(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    String _className = this.className(s);
    _builder.append(_className, "");
    _builder.append("_Color_Schema_ID");
    return _builder;
  }
  
  public CharSequence setColorSchema() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("gaService.setRenderingStyle(style, getColorSchema());");
    return _builder;
  }
  
  protected CharSequence _gradientColoredAreas(final GradientRef cg) {
    CharSequence _xifexpression = null;
    JvmTypeReference _gradientRef = cg.getGradientRef();
    boolean _notEquals = (!Objects.equal(_gradientRef, null));
    if (_notEquals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("new ");
      JvmTypeReference _gradientRef_1 = cg.getGradientRef();
      String _qualifiedName = _gradientRef_1.getQualifiedName();
      _builder.append(_qualifiedName, "");
      _builder.append("().getGradientColoredAreas( )");
      _xifexpression = _builder;
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("new ");
      String _packageName = this.gradientGenerator.packageName(null);
      _builder_1.append(_packageName, "");
      _builder_1.append(".");
      Gradient _gradientRefFromDsl = cg.getGradientRefFromDsl();
      String _name = _gradientRefFromDsl.getName();
      _builder_1.append(_name, "");
      _builder_1.append("().getGradientColoredAreas( )");
      _xifexpression = _builder_1;
    }
    return _xifexpression;
  }
  
  protected CharSequence _gradientColoredAreas(final Color cg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GradientUtilClass.getOneColorGradient(\"");
    CharSequence _createColorHexValue = this.createColorHexValue(cg);
    _builder.append(_createColorHexValue, "");
    _builder.append("\")");
    return _builder;
  }
  
  protected CharSequence _gradientColoredAreas(final Transparent cg) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("GradientUtilClass.getOneColorGradient(");
    _builder.append(cg, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _createColorHexValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    String _colorConstantToHexString = GradientUtilClass.colorConstantToHexString(c);
    _builder.append(_colorConstantToHexString, "");
    return _builder;
  }
  
  protected CharSequence _createColorHexValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    String _RGBColorToHexString = GradientUtilClass.RGBColorToHexString(c);
    _builder.append(_RGBColorToHexString, "");
    return _builder;
  }
  
  public CharSequence createColorValue(final EObject c) {
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
  
  public CharSequence gradientColoredAreas(final ColorOrGradient cg) {
    if (cg instanceof Color) {
      return _gradientColoredAreas((Color)cg);
    } else if (cg instanceof GradientRef) {
      return _gradientColoredAreas((GradientRef)cg);
    } else if (cg instanceof Transparent) {
      return _gradientColoredAreas((Transparent)cg);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(cg).toString());
    }
  }
  
  public CharSequence createColorHexValue(final Color c) {
    if (c instanceof ColorConstantRef) {
      return _createColorHexValue((ColorConstantRef)c);
    } else if (c instanceof RGBColor) {
      return _createColorHexValue((RGBColor)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
