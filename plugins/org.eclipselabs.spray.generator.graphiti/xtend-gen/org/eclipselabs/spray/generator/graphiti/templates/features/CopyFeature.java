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
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class CopyFeature extends FileGenerator<Diagram> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Override
  public CharSequence generateExtensionFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  @Override
  public CharSequence generateBaseFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  public CharSequence mainExtensionPointFile(final Diagram metaClass, final String className) {
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
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final Diagram metaclass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICopyContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.features.AbstractCopyFeature;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractCopyFeature  {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(metaclass);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canCopy = this.generate_canCopy(metaclass);
    _builder.append(_generate_canCopy, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_copy = this.generate_copy(metaclass);
    _builder.append(_generate_copy, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canCopy(final Diagram metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canCopy(ICopyContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement[] pes = context.getPictogramElements();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// nothing selected");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (pes == null || pes.length == 0) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true, if all selected elements are a subtypes of ");
    EClass _modelType = metaclass.getModelType();
    String _itfName = this._namingExtensions.getItfName(_modelType);
    _builder.append(_itfName, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("for (PictogramElement pe : pes) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Object bo = getBusinessObjectForPictogramElement(pe);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!(bo instanceof ");
    EClass _modelType_1 = metaclass.getModelType();
    String _itfName_1 = this._namingExtensions.getItfName(_modelType_1);
    _builder.append(_itfName_1, "        ");
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_copy(final Diagram metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public void copy(ICopyContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Copy PictogramElements instead of Objects because of the properties on Shapes.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement[] pes = context.getPictogramElements();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("putToClipboard(pes);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
