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
package org.eclipselabs.spray.generator.graphiti.templates.diagram;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class DiagramTypeProvider extends FileGenerator<Diagram> {
  @Override
  public CharSequence generateBaseFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.tb.IToolBehaviorProvider;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractDiagramTypeProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected IToolBehaviorProvider[] toolBehaviorProviders;");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(diagram);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setFeatureProvider(new ");
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "        ");
    _builder.append("FeatureProvider(this));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (toolBehaviorProviders == null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("toolBehaviorProviders =");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("new IToolBehaviorProvider[] { new ");
    String _name_1 = diagram.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "                ");
    _builder.append("ToolBehaviorProvider(");
    _builder.newLineIfNotEmpty();
    _builder.append("                    ");
    _builder.append("this) };");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return toolBehaviorProviders;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(diagram);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
