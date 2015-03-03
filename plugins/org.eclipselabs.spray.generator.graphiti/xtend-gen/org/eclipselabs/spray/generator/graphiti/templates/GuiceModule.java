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

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class GuiceModule extends FileGenerator<Diagram> {
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
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("// Add custom bindings here");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// public Class<? extends MyInterface> bindMyInterface () {");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("//   return MyInterfaceImpl.class;");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// }");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("//");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// Get instances through the Activator:");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// MyInterface instance = Activator.get(MyInterface.class);");
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
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _packageName = _javaGenFile.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.core.resources.IWorkspace;");
    _builder.newLine();
    _builder.append("import org.eclipse.core.resources.ResourcesPlugin;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.IWorkbench;");
    _builder.newLine();
    _builder.append("import org.eclipse.ui.PlatformUI;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.service.AbstractGenericModule;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.editor.IURIEditorOpener;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.resource.IStorage2UriMapper;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.ui.resource.Storage2UriMapperImpl;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.inject.Binder;");
    _builder.newLine();
    _builder.append("import com.google.inject.name.Names;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractGenericModule {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public Class<? extends IURIEditorOpener> bindIURIEditorOpener() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return GlobalURIEditorOpener.class;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void configure(Binder binder) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("// not needed anymore and will produce Guice error in combination with Xtext 2.5.3");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("//binder.bind(IStorage2UriMapper.class).to(Storage2UriMapperImpl.class);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IWorkbench.class).toInstance(PlatformUI.getWorkbench());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(IWorkspace.class).toInstance(ResourcesPlugin.getWorkspace());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("binder.bind(String.class).annotatedWith(Names.named(\"diagramTypeId\")).toInstance(\"");
    String _name = diagram.getName();
    _builder.append(_name, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
