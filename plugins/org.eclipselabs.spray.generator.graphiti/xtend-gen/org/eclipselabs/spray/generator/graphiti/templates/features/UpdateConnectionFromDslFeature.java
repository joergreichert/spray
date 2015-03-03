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

import com.google.common.base.Objects;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class UpdateConnectionFromDslFeature extends FileGenerator<ConnectionInSpray> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private DiagramExtensions _diagramExtensions;
  
  @Inject
  @Extension
  private SprayCompiler _sprayCompiler;
  
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
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import com.google.common.base.Function;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IReason;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IUpdateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.Reason;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.AbstractText;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
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
    {
      EList<ShapePropertyAssignment> _properties = connection.getProperties();
      boolean _isEmpty = _properties.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("    ");
        CharSequence _generate_searchChilds = this.generate_searchChilds(connection);
        _builder.append(_generate_searchChilds, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
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
    {
      EList<ShapePropertyAssignment> _properties = connection.getProperties();
      boolean _isEmpty = _properties.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(metaClassName, "");
        _builder.append(" eClass = (");
        _builder.append(metaClassName, "");
        _builder.append(") bo;");
        _builder.newLineIfNotEmpty();
        _builder.append("if(pictogramElement instanceof Connection) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final Connection conShape = (Connection) pictogramElement;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("List<String> changedTypes = new ArrayList<String>();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("for(ConnectionDecorator dec : conShape.getConnectionDecorators()) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("final GraphicsAlgorithm gAlg = dec.getGraphicsAlgorithm();");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("searchChilds(gAlg, eClass, changedTypes, false);");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if(!changedTypes.isEmpty()) {");
        _builder.newLine();
        _builder.append("        \t");
        _builder.append("return Reason.createTrueReason(changedTypes.toString());");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return Reason.createFalseReason();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_update(final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean update(IUpdateContext context) {");
    _builder.newLine();
    {
      EList<ShapePropertyAssignment> _properties = connection.getProperties();
      boolean _isEmpty = _properties.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        MetaClass _represents = connection.getRepresents();
        final String metaClassName = this._namingExtensions.getItfName(_represents);
        _builder.newLineIfNotEmpty();
        _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
        _builder.newLine();
        _builder.append("final ");
        _builder.append(metaClassName, "");
        _builder.append(" eClass = (");
        _builder.append(metaClassName, "");
        _builder.append(") getBusinessObjectForPictogramElement(pictogramElement);");
        _builder.newLineIfNotEmpty();
        CharSequence _handleNotEmptyConnectionProperties = this.handleNotEmptyConnectionProperties();
        _builder.append(_handleNotEmptyConnectionProperties, "");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleNotEmptyConnectionProperties() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(pictogramElement instanceof Connection) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("final Connection conShape = (Connection) pictogramElement;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for(ConnectionDecorator dec : conShape.getConnectionDecorators()) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final GraphicsAlgorithm gAlg = dec.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("searchChilds(gAlg, eClass, new ArrayList<String>(), true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("return true;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_searchChilds(final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected void searchChilds(GraphicsAlgorithm gAlg, ");
    MetaClass _represents = connection.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "");
    _builder.append(" eClass, List<String> changedTypes, boolean performUpdate) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if(gAlg instanceof AbstractText) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("AbstractText text = (AbstractText) gAlg;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("String id = peService.getPropertyValue(gAlg, TEXT_ID);");
    _builder.newLine();
    _builder.append("\t\t");
    EList<ShapePropertyAssignment> _properties = connection.getProperties();
    final Function1<ShapePropertyAssignment, CharSequence> _function = new Function1<ShapePropertyAssignment, CharSequence>() {
      @Override
      public CharSequence apply(final ShapePropertyAssignment it) {
        return UpdateConnectionFromDslFeature.this.generate_setTextValue(it, connection);
      }
    };
    List<CharSequence> _map = ListExtensions.<ShapePropertyAssignment, CharSequence>map(_properties, _function);
    String _join = IterableExtensions.join(_map);
    _builder.append(_join, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for(GraphicsAlgorithm gAlgChild : gAlg.getGraphicsAlgorithmChildren()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("searchChilds(gAlgChild, eClass, changedTypes, performUpdate);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_setTextValue(final ShapePropertyAssignment property, final ConnectionInSpray connection) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(id.equals(\"");
    ShapeDslKey _key = property.getKey();
    String _simpleName = this._namingExtensions.simpleName(_key);
    _builder.append(_simpleName, "");
    _builder.append("\")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("if(performUpdate) {");
    _builder.newLine();
    {
      XExpression _value = property.getValue();
      boolean _notEquals = (!Objects.equal(_value, null));
      if (_notEquals) {
        _builder.append("\t\t");
        XExpression _value_1 = property.getValue();
        MetaClass _represents = connection.getRepresents();
        String _itfName = this._namingExtensions.getItfName(_represents);
        CharSequence _propertyAssignmentFunction = this.propertyAssignmentFunction(_value_1, "value", "String", _itfName, "eClass");
        _builder.append(_propertyAssignmentFunction, "\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("text.setValue(value);");
        _builder.newLine();
      } else {
        _builder.append("\t\t");
        _builder.append("text.setValue(eClass.get");
        EAttribute _attribute = property.getAttribute();
        String _name = _attribute.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t\t");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    {
      XExpression _value_2 = property.getValue();
      boolean _notEquals_1 = (!Objects.equal(_value_2, null));
      if (_notEquals_1) {
        _builder.append("\t\t");
        XExpression _value_3 = property.getValue();
        MetaClass _represents_1 = connection.getRepresents();
        String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
        CharSequence _propertyAssignmentFunction_1 = this.propertyAssignmentFunction(_value_3, "eClassValue", "String", _itfName_1, "eClass");
        _builder.append(_propertyAssignmentFunction_1, "\t\t");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("\t\t");
        _builder.append("String eClassValue = eClass.get");
        EAttribute _attribute_1 = property.getAttribute();
        String _name_1 = _attribute_1.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("String gAlgorithmValue = text.getValue();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(eClassValue != null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if(!eClassValue.equals(gAlgorithmValue)) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("changedTypes.add(\"");
    ShapeDslKey _key_1 = property.getKey();
    String _simpleName_1 = this._namingExtensions.simpleName(_key_1);
    _builder.append(_simpleName_1, "\t\t\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence propertyAssignmentFunction(final XExpression xexp, final String valueName, final String returnType, final String metaClassName, final String metaClassAttribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(returnType, "");
    _builder.append(" ");
    _builder.append(valueName, "");
    _builder.append(" = new Function<");
    _builder.append(metaClassName, "");
    _builder.append(", ");
    _builder.append(returnType, "");
    _builder.append(">() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(returnType, "\t");
    _builder.append(" apply(");
    _builder.append(metaClassName, "\t");
    _builder.append(" modelElement) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _compileForPropertyAssignement = this._sprayCompiler.compileForPropertyAssignement(xexp, "returnedValue", "modelElement");
    _builder.append(_compileForPropertyAssignement, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}.apply(");
    _builder.append(metaClassAttribute, "");
    _builder.append("); ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
