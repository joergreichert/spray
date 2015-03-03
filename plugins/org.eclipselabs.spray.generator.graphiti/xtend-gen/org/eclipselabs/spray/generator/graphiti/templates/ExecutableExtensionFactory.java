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
package org.eclipselabs.spray.generator.graphiti.templates;

import javax.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ExecutableExtensionFactory extends FileGenerator<Diagram> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Override
  public CharSequence generateBaseFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainFile(modelElement, _className);
  }
  
  public CharSequence mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import com.google.inject.Injector;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.Bundle;");
    _builder.newLine();
    _builder.append("import ");
    String _main_package = GeneratorUtil.main_package();
    _builder.append(_main_package, "");
    _builder.append(".Activator;");
    _builder.newLineIfNotEmpty();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractGuiceAwareExecutableExtensionFactory {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected Bundle getBundle() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _activatorSimpleClassName = this._namingExtensions.getActivatorSimpleClassName(diagram);
    _builder.append(_activatorSimpleClassName, "        ");
    _builder.append(".getDefault().getBundle();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader_1 = this.overrideHeader();
    _builder.append(_overrideHeader_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected Injector getInjector() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return ");
    String _activatorSimpleClassName_1 = this._namingExtensions.getActivatorSimpleClassName(diagram);
    _builder.append(_activatorSimpleClassName_1, "        ");
    _builder.append(".getDefault().getInjector();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
