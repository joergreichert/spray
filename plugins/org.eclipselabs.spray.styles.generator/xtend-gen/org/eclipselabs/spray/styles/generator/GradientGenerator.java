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

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientColorArea;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.generator.util.GradientUtilClass;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class GradientGenerator extends FileGenerator<Gradient> {
  public String filepath(final Gradient g) {
    String _packagePath = this.packagePath(g);
    String _className = this.className(g);
    String _plus = (_packagePath + _className);
    return (_plus + ".java");
  }
  
  public String gapClassName(final Gradient g) {
    String _name = g.getName();
    return StringExtensions.toFirstUpper(_name);
  }
  
  public String className(final Gradient g) {
    String _name = g.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Base");
  }
  
  public String packageName(final Gradient s) {
    return ProjectProperties.getGradientsPackage();
  }
  
  public String packagePath(final Gradient s) {
    String _gradientsPackage = ProjectProperties.getGradientsPackage();
    return ProjectProperties.toPath(_gradientsPackage);
  }
  
  private int elementIndex = 0;
  
  @Override
  public String generate(final Gradient gradient, final GenFile genFile) {
    String _xblockexpression = null;
    {
      String _packageName = this.packageName(gradient);
      String _gapClassName = this.gapClassName(gradient);
      ((JavaGenFile) genFile).setPackageAndClass(_packageName, _gapClassName);
      _xblockexpression = super.generate(gradient, genFile);
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generateBaseFile(final Gradient gradient) {
    return this.compile(gradient);
  }
  
  @Override
  public CharSequence generateExtensionFile(final Gradient gradient) {
    return this.mainExtensionPointFile(gradient);
  }
  
  public CharSequence mainExtensionPointFile(final Gradient gradient) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.packageName(gradient);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class ");
    String _gapClassName = this.gapClassName(gradient);
    _builder.append(_gapClassName, "");
    _builder.append(" extends ");
    String _className = this.className(gradient);
    _builder.append(_className, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence compile(final Gradient g) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _head = this.head(g);
    _builder.append(_head, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _body = this.body(g);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence head(final Gradient g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Gradient class for Spray.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = this.packageName(g);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.LocationType;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IGradientType;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IPredefinedRenderingStyle;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.PredefinedColoredAreas;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final Gradient g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Description: ");
    String _description = g.getDescription();
    _builder.append(_description, " ");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.className(g);
    _builder.append(_className, "");
    _builder.append(" extends PredefinedColoredAreas implements ISprayGradient {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* This method returns the gradient color area.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Description: ");
    String _description_1 = g.getDescription();
    _builder.append(_description_1, "     ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("public GradientColoredAreas getGradientColoredAreas( ) {");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("final GradientColoredAreas gradientColoredAreas = org.eclipse.graphiti.mm.algorithms.styles.StylesFactory.eINSTANCE.createGradientColoredAreas();");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("final EList<org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();");
    _builder.newLine();
    _builder.append("         ");
    GradientLayout _layout = g.getLayout();
    CharSequence _createColorAreas = this.createColorAreas(_layout);
    _builder.append(_createColorAreas, "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("return gradientColoredAreas;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence createColorAreas(final GradientLayout l) {
    CharSequence _xblockexpression = null;
    {
      EList<GradientColorArea> _area = l.getArea();
      final Function1<GradientColorArea, Double> _function = new Function1<GradientColorArea, Double>() {
        @Override
        public Double apply(final GradientColorArea entity) {
          return Double.valueOf(entity.getOffset());
        }
      };
      IterableExtensions.<GradientColorArea, Double>sortBy(_area, _function);
      this.elementIndex = (-1);
      StringConcatenation _builder = new StringConcatenation();
      {
        EList<GradientColorArea> _area_1 = l.getArea();
        for(final GradientColorArea element : _area_1) {
          {
            int _increaseCounter = this.increaseCounter();
            EList<GradientColorArea> _area_2 = l.getArea();
            int _size = _area_2.size();
            int _minus = (_size - 1);
            boolean _lessThan = (_increaseCounter < _minus);
            if (_lessThan) {
              EList<GradientColorArea> _area_3 = l.getArea();
              GradientColorArea _get = _area_3.get((this.elementIndex + 1));
              CharSequence _createArea = this.createArea(element, _get);
              _builder.append(_createArea, "");
              _builder.newLineIfNotEmpty();
            } else {
              EList<GradientColorArea> _area_4 = l.getArea();
              int _size_1 = _area_4.size();
              boolean _equals = (_size_1 == 1);
              if (_equals) {
                _builder.newLine();
              }
            }
          }
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence createArea(final GradientColorArea first, final GradientColorArea second) {
    CharSequence _xblockexpression = null;
    {
      double _offset = first.getOffset();
      double _multiply = (_offset * 100);
      int offset_1 = Double.valueOf(_multiply).intValue();
      double _offset_1 = second.getOffset();
      double _multiply_1 = (_offset_1 * 100);
      int offset_2 = Double.valueOf(_multiply_1).intValue();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("addGradientColoredArea(gcas,\"");
      Color _color = first.getColor();
      CharSequence _createColorValue = this.createColorValue(_color);
      _builder.append(_createColorValue, "");
      _builder.append("\",");
      _builder.append(offset_1, "");
      _builder.append(",org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE, \"");
      Color _color_1 = second.getColor();
      CharSequence _createColorValue_1 = this.createColorValue(_color_1);
      _builder.append(_createColorValue_1, "");
      _builder.append("\",");
      _builder.append(offset_2, "");
      _builder.append(",org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE);");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  protected CharSequence _createColorValue(final ColorConstantRef c) {
    StringConcatenation _builder = new StringConcatenation();
    String _colorConstantToHexString = GradientUtilClass.colorConstantToHexString(c);
    _builder.append(_colorConstantToHexString, "");
    return _builder;
  }
  
  protected CharSequence _createColorValue(final RGBColor c) {
    StringConcatenation _builder = new StringConcatenation();
    String _RGBColorToHexString = GradientUtilClass.RGBColorToHexString(c);
    _builder.append(_RGBColorToHexString, "");
    return _builder;
  }
  
  public int increaseCounter() {
    return this.elementIndex = (this.elementIndex + 1);
  }
  
  public CharSequence createColorValue(final Color c) {
    if (c instanceof ColorConstantRef) {
      return _createColorValue((ColorConstantRef)c);
    } else if (c instanceof RGBColor) {
      return _createColorValue((RGBColor)c);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(c).toString());
    }
  }
}
