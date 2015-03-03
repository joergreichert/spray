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
public class PluginActivator extends FileGenerator<Diagram> {
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
    String _main_package = GeneratorUtil.main_package();
    _builder.append(_main_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.ui.plugin.AbstractUIPlugin;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.util.Modules2;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleContext;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.inject.Guice;");
    _builder.newLine();
    _builder.append("import com.google.inject.Injector;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* The activator class controls the plug-in life cycle");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractUIPlugin {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("private Injector             injector;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// The plug-in ID");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String   PLUGIN_ID = \"");
    String _pluginId = GeneratorUtil.pluginId();
    _builder.append(_pluginId, "    ");
    _builder.append("\"; //$NON-NLS-1$");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// The shared instance");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static ");
    _builder.append(className, "    ");
    _builder.append(" plugin;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(diagram);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* (non-Javadoc)");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void start(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.start(context);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("plugin = this;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("injector = createInjector();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* (non-Javadoc)");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void stop(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("plugin = null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.stop(context);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Returns the shared instance");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* @return the shared instance");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static ");
    _builder.append(className, "    ");
    _builder.append(" getDefault() {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return plugin;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected Injector createInjector() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return Guice.createInjector(Modules2.mixin(new GraphitiRuntimeModule(), new ");
    String _guiceModuleClassName = this._namingExtensions.getGuiceModuleClassName(diagram);
    String _shortName = this._namingExtensions.shortName(_guiceModuleClassName);
    _builder.append(_shortName, "        ");
    _builder.append("()));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public final Injector getInjector() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return injector;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final <T> T get(Class<T> type) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return getDefault().getInjector().getInstance(type);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
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
