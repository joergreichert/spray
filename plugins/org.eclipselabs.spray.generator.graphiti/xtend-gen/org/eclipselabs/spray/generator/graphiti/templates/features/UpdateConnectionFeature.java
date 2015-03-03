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
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class UpdateConnectionFeature extends FileGenerator<ConnectionInSpray> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private DiagramExtensions _diagramExtensions;
  
  @Override
  public CharSequence generateBaseFile(final ConnectionInSpray modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final ConnectionInSpray modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final ConnectionInSpray connection, final String className) {
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
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final ConnectionInSpray connection, final String className) {
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
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IReason;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IUpdateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.Reason;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.AbstractText;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.xbase.lib.ObjectExtensions;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractUpdateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(connection);
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
    _builder.append("gaService = ");
    Diagram _diagram = this._diagramExtensions.getDiagram(connection);
    String _activatorClassName = this._namingExtensions.getActivatorClassName(_diagram);
    String _shortName = this._namingExtensions.shortName(_activatorClassName);
    _builder.append(_shortName, "        ");
    _builder.append(".get(IGaService.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canUpdate = this.generate_canUpdate(connection);
    _builder.append(_generate_canUpdate, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_updateNeeded = this.generate_updateNeeded(connection);
    _builder.append(_generate_updateNeeded, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_update = this.generate_update(connection);
    _builder.append(_generate_update, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getValue = this.generate_getValue(connection);
    _builder.append(_generate_getValue, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(connection);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canUpdate(final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    MetaClass _represents = connection.getRepresents();
    final String metaClassName = this._namingExtensions.getItfName(_represents);
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canUpdate(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true, if linked business object is a EClass");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (bo instanceof ");
    _builder.append(metaClassName, "    ");
    _builder.append(") && (!(pictogramElement instanceof Diagram));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_updateNeeded(final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    MetaClass _represents = connection.getRepresents();
    final String metaClassName = this._namingExtensions.getItfName(_represents);
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IReason updateNeeded(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if ( ! (bo instanceof ");
    _builder.append(metaClassName, "    ");
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return Reason.createFalseReason();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(metaClassName, "    ");
    _builder.append(" eClass = (");
    _builder.append(metaClassName, "    ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (pictogramElement instanceof FreeFormConnection) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final FreeFormConnection free = (FreeFormConnection) pictogramElement;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (final ConnectionDecorator decorator : free.getConnectionDecorators()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final String type = peService.getPropertyValue(decorator, PROPERTY_MODEL_TYPE);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final String value = getValue(type, eClass);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final AbstractText text = (AbstractText) decorator.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final String current = text.getValue();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (ObjectExtensions.operator_notEquals(current, value)) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return Reason.createTrueReason(type + \" is changed\");");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return Reason.createFalseReason();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_update(final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    MetaClass _represents = connection.getRepresents();
    final String metaClassName = this._namingExtensions.getItfName(_represents);
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean update(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final ");
    _builder.append(metaClassName, "    ");
    _builder.append(" eClass = (");
    _builder.append(metaClassName, "    ");
    _builder.append(") getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final FreeFormConnection free = (FreeFormConnection) pictogramElement;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (final ConnectionDecorator decorator : free.getConnectionDecorators()) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final String type = peService.getPropertyValue(decorator, PROPERTY_MODEL_TYPE);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final String value = getValue(type, eClass);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final AbstractText text = (AbstractText) decorator.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("text.setValue(value);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setDoneChanges(true);");
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
  
  public CharSequence generate_getValue(final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected String getValue(final String type, final ");
    MetaClass _represents = connection.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "");
    _builder.append(" eClass) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("String result = \"\";");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
