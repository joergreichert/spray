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
package org.eclipselabs.spray.generator.graphiti.templates.features;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ResizeFeature extends FileGenerator<ShapeFromDsl> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Override
  public CharSequence generateBaseFile(final ShapeFromDsl modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final ShapeFromDsl modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final ShapeFromDsl container, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final ShapeFromDsl container, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("     ");
    CharSequence _header = this.header(this);
    _builder.append(_header, "     ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, " \t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("import org.eclipse.graphiti.features.IResizeConfiguration;");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("import org.eclipse.graphiti.features.context.IResizeShapeContext;");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("import org.eclipse.graphiti.features.DefaultResizeConfiguration;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultResizeShapeFeature;");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("import ");
    String _shapesPackage = ProjectProperties.getShapesPackage();
    _builder.append(_shapesPackage, " \t");
    _builder.append(".");
    ShapeReference _shape = container.getShape();
    String _simpleName = this._namingExtensions.simpleName(_shape);
    _builder.append(_simpleName, " \t");
    _builder.append("Shape;");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t");
    _builder.append("public abstract class ");
    _builder.append(className, " \t");
    _builder.append(" extends DefaultResizeShapeFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("SprayLayoutManager layoutManager; ");
    _builder.newLine();
    _builder.append("         ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields, "         ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append(" \t\t");
    _builder.append("public ");
    _builder.append(className, " \t\t");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t\t");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append(" \t\t\t");
    _builder.append("layoutManager =  new ");
    ShapeReference _shape_1 = container.getShape();
    String _simpleName_1 = this._namingExtensions.simpleName(_shape_1);
    _builder.append(_simpleName_1, " \t\t\t");
    _builder.append("Shape(fp).getShapeLayout( );");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" \t");
    _builder.newLine();
    _builder.append("         ");
    CharSequence _generate_ResizeConfigurationClass = this.generate_ResizeConfigurationClass(container);
    _builder.append(_generate_ResizeConfigurationClass, "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    CharSequence _generate_getResizeConfiguration = this.generate_getResizeConfiguration(container);
    _builder.append(_generate_getResizeConfiguration, "         ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(container);
    _builder.append(_generate_additionalMethods, "         ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_ResizeConfigurationClass(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    ShapeReference _shape = container.getShape();
    String _simpleName = this._namingExtensions.simpleName(_shape);
    String _plus = ("ResizeConfiguration_" + _simpleName);
    _builder.append(_plus, "");
    _builder.append(" extends DefaultResizeConfiguration  {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public boolean isHorizontalResizeAllowed() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return layoutManager.isStretchHorizontal( );");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public boolean isVerticalResizeAllowed() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return layoutManager.isStretchVertical( );");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getResizeConfiguration(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("            ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("public IResizeConfiguration getResizeConfiguration(IResizeShapeContext context) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return new ");
    ShapeReference _shape = container.getShape();
    String _simpleName = this._namingExtensions.simpleName(_shape);
    String _plus = ("ResizeConfiguration_" + _simpleName);
    _builder.append(_plus, "\t");
    _builder.append("( );");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
