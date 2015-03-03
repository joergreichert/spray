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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class Filter extends FileGenerator<EClass> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  private Diagram diagram;
  
  public Diagram setDiagram(final Diagram d) {
    return this.diagram = d;
  }
  
  @Override
  public CharSequence generateBaseFile(final EClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final EClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final EClass eClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _property_package = GeneratorUtil.property_package();
    _builder.append(_property_package, "");
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
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final EClass eClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _property_package = GeneratorUtil.property_package();
    _builder.append(_property_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(eClass);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractPropertySectionFilter {");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected boolean accept(final PictogramElement pe) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (eObject instanceof ");
    String _itfName = this._namingExtensions.getItfName(eClass);
    _builder.append(_itfName, "        ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
