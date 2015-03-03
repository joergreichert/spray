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
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaReferenceExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class UpdateReferenceAsListFeature extends FileGenerator<MetaReference> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private MetaReferenceExtensions _metaReferenceExtensions;
  
  private EClass target;
  
  public EClass setTarget(final EClass m) {
    return this.target = m;
  }
  
  @Override
  public CharSequence generateBaseFile(final MetaReference modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final MetaReference modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final MetaReference metaReference, final String className) {
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
  
  public CharSequence mainFile(final MetaReference reference, final String className) {
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
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractUpdateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(reference);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
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
    Diagram _diagram = this._metaReferenceExtensions.getDiagram(reference);
    String _activatorClassName = this._namingExtensions.getActivatorClassName(_diagram);
    String _shortName = this._namingExtensions.shortName(_activatorClassName);
    _builder.append(_shortName, "        ");
    _builder.append(".get(IGaService.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canUpdate = this.generate_canUpdate(reference);
    _builder.append(_generate_canUpdate, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_updateNeeded = this.generate_updateNeeded(reference);
    _builder.append(_generate_updateNeeded, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_update = this.generate_update(reference);
    _builder.append(_generate_update, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getText = this.generate_getText(reference);
    _builder.append(_generate_getText, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(reference);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canUpdate(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canUpdate(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true, if linked business object is a EClass");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (bo instanceof ");
    String _itfName = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName, "    ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_updateNeeded(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "   ");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.append("public IReason updateNeeded(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("// retrieve name from pictogram model");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("String pictogramName = null;");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("if (pictogramElement instanceof Shape) {");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("final Shape cs = (Shape) pictogramElement;");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("if (cs.getGraphicsAlgorithm() instanceof AbstractText) {");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("final AbstractText text = (AbstractText) cs.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("// peService.getPropertyValue(shape, \"REFERENCE\");");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("if( pictogramName == null ){");
    _builder.newLine();
    _builder.append("                   ");
    _builder.append("pictogramName = text.getValue();");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("       ");
    _builder.append("// retrieve name from business model");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("String businessName = null;");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("if (bo instanceof ");
    String _itfName = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName, "       ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("           ");
    _builder.append("final ");
    String _itfName_1 = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName_1, "           ");
    _builder.append(" ");
    String _name = this.target.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "           ");
    _builder.append(" = (");
    String _itfName_2 = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName_2, "           ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.append("           ");
    _builder.append("businessName = getText(context, ");
    String _name_1 = this.target.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower_1, "           ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("       ");
    _builder.append("// update needed, if names are different");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("boolean updateNameNeeded =");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("((pictogramName == null && businessName != null) ||");
    _builder.newLine();
    _builder.append("               ");
    _builder.append("(pictogramName != null && !pictogramName.equals(businessName)));");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("if (updateNameNeeded) {");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("return Reason.createTrueReason(\"Property Name is out of date\");");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("return Reason.createFalseReason();");
    _builder.newLine();
    _builder.append("       ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_update(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean update(IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("// retrieve name from business model");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String businessName = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo instanceof ");
    String _itfName = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName, "    ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("final ");
    String _itfName_1 = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName_1, "        ");
    _builder.append(" ");
    String _name = this.target.getName();
    String _firstLower = StringExtensions.toFirstLower(_name);
    _builder.append(_firstLower, "        ");
    _builder.append(" = (");
    String _itfName_2 = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName_2, "        ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("businessName = getText(context, ");
    String _name_1 = this.target.getName();
    String _firstLower_1 = StringExtensions.toFirstLower(_name_1);
    _builder.append(_firstLower_1, "        ");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Set name in pictogram model");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (pictogramElement instanceof Shape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Shape cs = (Shape) pictogramElement;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (cs.getGraphicsAlgorithm() instanceof AbstractText) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final AbstractText text = (AbstractText) cs.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("text.setValue(businessName);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("layoutPictogramElement(cs.getContainer().getContainer());");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getText(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Computes the displayed text. Clients may override this method.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected String getText (final IUpdateContext context, final ");
    String _itfName = this._namingExtensions.getItfName(this.target);
    _builder.append(_itfName, "");
    _builder.append(" bo) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return bo.getName();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
