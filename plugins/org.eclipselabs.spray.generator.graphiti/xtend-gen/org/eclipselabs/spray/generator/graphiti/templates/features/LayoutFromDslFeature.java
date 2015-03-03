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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class LayoutFromDslFeature extends FileGenerator<ShapeFromDsl> {
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
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ILayoutContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractLayoutFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;");
    _builder.newLine();
    _builder.append("import ");
    String _shapesPackage = ProjectProperties.getShapesPackage();
    _builder.append(_shapesPackage, "");
    _builder.append(".");
    ShapeReference _shape = container.getShape();
    String _simpleName = this._namingExtensions.simpleName(_shape);
    _builder.append(_simpleName, "");
    _builder.append("Shape;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractLayoutFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SprayLayoutManager layoutManager; ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("layoutManager =  new ");
    ShapeReference _shape_1 = container.getShape();
    String _simpleName_1 = this._namingExtensions.simpleName(_shape_1);
    _builder.append(_simpleName_1, "        ");
    _builder.append("Shape(fp).getShapeLayout( );");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canLayout = this.generate_canLayout(container);
    _builder.append(_generate_canLayout, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_layout = this.generate_layout(container);
    _builder.append(_generate_layout, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(container);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canLayout(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canLayout(final ILayoutContext context) {");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("final PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("if (!(pe instanceof ContainerShape)) {");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("final EList<EObject> businessObjects = pe.getLink().getBusinessObjects();");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof ");
    MetaClass _represents = container.getRepresents();
    EClass _type = _represents.getType();
    String _itfName = this._namingExtensions.getItfName(_type);
    _builder.append(_itfName, "   ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_layout(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean layout(final ILayoutContext context) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return layoutManager.layout(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
