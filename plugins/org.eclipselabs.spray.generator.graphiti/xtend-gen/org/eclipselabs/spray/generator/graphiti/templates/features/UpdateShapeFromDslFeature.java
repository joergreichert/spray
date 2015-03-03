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
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

/**
 * Template for generating Graphiti Update feature for a ContainerInSpray representing a MetaClass
 */
@SuppressWarnings("all")
public class UpdateShapeFromDslFeature extends FileGenerator<ShapeFromDsl> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private DiagramExtensions _diagramExtensions;
  
  @Inject
  @Extension
  private SprayCompiler _sprayCompiler;
  
  private String functionClassName = "com.google.common.base.Function";
  
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
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractUpdateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(container);
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
    Diagram _diagram = this._diagramExtensions.getDiagram(container);
    String _activatorClassName = this._namingExtensions.getActivatorClassName(_diagram);
    String _shortName = this._namingExtensions.shortName(_activatorClassName);
    _builder.append(_shortName, "        ");
    _builder.append(".get(IGaService.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canUpdate = this.generate_canUpdate(container);
    _builder.append(_generate_canUpdate, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_updateNeeded = this.generate_updateNeeded(container);
    _builder.append(_generate_updateNeeded, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_checkUpdateNeededRecursively = this.generate_checkUpdateNeededRecursively(container);
    _builder.append(_generate_checkUpdateNeededRecursively, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_update = this.generate_update(container);
    _builder.append(_generate_update, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_updateChildrenRecursively = this.generate_updateChildrenRecursively(container);
    _builder.append(_generate_updateChildrenRecursively, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(container);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canUpdate(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canUpdate(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true, if linked business object is a ");
    MetaClass _represents = container.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Object bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (bo instanceof ");
    MetaClass _represents_1 = container.getRepresents();
    String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
    _builder.append(_itfName_1, "    ");
    _builder.append(") && (!(pictogramElement instanceof Diagram));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_updateNeeded(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IReason updateNeeded(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Object bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (!(bo instanceof ");
    MetaClass _represents = container.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "    ");
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return Reason.createFalseReason(); ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if(pictogramElement instanceof Shape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Shape shape = (Shape) pictogramElement;");
    _builder.newLine();
    _builder.append("        ");
    MetaClass _represents_1 = container.getRepresents();
    String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
    _builder.append(_itfName_1, "        ");
    _builder.append(" eClass = (");
    MetaClass _represents_2 = container.getRepresents();
    String _itfName_2 = this._namingExtensions.getItfName(_represents_2);
    _builder.append(_itfName_2, "        ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("if(checkUpdateNeededRecursively(shape, eClass)) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return Reason.createTrueReason();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if( shape instanceof ContainerShape ){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("for(Shape childShape : ((ContainerShape)shape).getChildren()) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if(checkUpdateNeededRecursively(childShape, eClass)) {");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("return Reason.createTrueReason();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
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
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_checkUpdateNeededRecursively(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected boolean checkUpdateNeededRecursively(Shape shape, final ");
    MetaClass _represents = container.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "");
    _builder.append(" eClass) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if(graphicsAlgorithm instanceof AbstractText) {");
    _builder.newLine();
    {
      EList<ShapePropertyAssignment> _properties = container.getProperties();
      boolean _isEmpty = _properties.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("        ");
        _builder.append("AbstractText text = (AbstractText) graphicsAlgorithm;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("String id = peService.getPropertyValue(graphicsAlgorithm, TEXT_ID);");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if(id != null) {");
        _builder.newLine();
        {
          EList<ShapePropertyAssignment> _properties_1 = container.getProperties();
          for(final ShapePropertyAssignment property : _properties_1) {
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("if(id.equals(\"");
            ShapeDslKey _key = property.getKey();
            String _simpleName = this._namingExtensions.simpleName(_key);
            _builder.append(_simpleName, "            ");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            {
              XExpression _value = property.getValue();
              boolean _notEquals = (!Objects.equal(_value, null));
              if (_notEquals) {
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                XExpression _value_1 = property.getValue();
                MetaClass _represents_1 = container.getRepresents();
                String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
                CharSequence _propertyAssignmentFunction = this.propertyAssignmentFunction(_value_1, "eClassValue", "String", _itfName_1, "eClass");
                _builder.append(_propertyAssignmentFunction, "                ");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("String eClassValue = eClass.get");
                EAttribute _attribute = property.getAttribute();
                String _name = _attribute.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                _builder.append(_firstUpper, "                ");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("String gAlgorithmValue = text.getValue();");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("if(eClassValue != null) {");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("if(!eClassValue.equals(gAlgorithmValue)) {");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("            ");
            _builder.append("return true;");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if( shape instanceof ContainerShape ){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for(Shape child : ((ContainerShape) shape).getChildren()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if(checkUpdateNeededRecursively(child, eClass)) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("return true;");
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
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_update(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
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
    MetaClass _represents = container.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "    ");
    _builder.append(" eClass = (");
    MetaClass _represents_1 = container.getRepresents();
    String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
    _builder.append(_itfName_1, "    ");
    _builder.append(") getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("if(pictogramElement instanceof Shape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Shape shape = (Shape) pictogramElement;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("updateChildrenRecursively(shape, eClass);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Shape top = findTopShape(shape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SprayLayoutService.getLayoutManager(top).layout();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_updateChildrenRecursively(final ShapeFromDsl container) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected void updateChildrenRecursively(Shape shape, final ");
    MetaClass _represents = container.getRepresents();
    String _itfName = this._namingExtensions.getItfName(_represents);
    _builder.append(_itfName, "");
    _builder.append(" eClass) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if(graphicsAlgorithm instanceof AbstractText) {");
    _builder.newLine();
    {
      EList<ShapePropertyAssignment> _properties = container.getProperties();
      boolean _isEmpty = _properties.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("        ");
        _builder.append("AbstractText text = (AbstractText) graphicsAlgorithm;");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("String id = peService.getPropertyValue(graphicsAlgorithm, TEXT_ID);");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if(id != null) {");
        _builder.newLine();
        {
          EList<ShapePropertyAssignment> _properties_1 = container.getProperties();
          for(final ShapePropertyAssignment property : _properties_1) {
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("if(id.equals(\"");
            ShapeDslKey _key = property.getKey();
            String _simpleName = this._namingExtensions.simpleName(_key);
            _builder.append(_simpleName, "            ");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            {
              XExpression _value = property.getValue();
              boolean _notEquals = (!Objects.equal(_value, null));
              if (_notEquals) {
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                XExpression _value_1 = property.getValue();
                MetaClass _represents_1 = container.getRepresents();
                String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
                CharSequence _propertyAssignmentFunction = this.propertyAssignmentFunction(_value_1, "value", "String", _itfName_1, "eClass");
                _builder.append(_propertyAssignmentFunction, "                ");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("text.setValue(value);");
                _builder.newLine();
              } else {
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("text.setValue(eClass.get");
                EAttribute _attribute = property.getAttribute();
                String _name = _attribute.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                _builder.append(_firstUpper, "                ");
                _builder.append("());");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("setDoneChanges(true);");
            _builder.newLine();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          }
        }
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (shape instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for(Shape child : ((ContainerShape) shape).getChildren()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("updateChildrenRecursively(child, eClass);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
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
    _builder.append(" = new ");
    String _shortName = this._namingExtensions.shortName(this.functionClassName);
    _builder.append(_shortName, "");
    _builder.append("<");
    _builder.append(metaClassName, "");
    _builder.append(", ");
    _builder.append(returnType, "");
    _builder.append(">() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(returnType, "    ");
    _builder.append(" apply(");
    _builder.append(metaClassName, "    ");
    _builder.append(" modelElement) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    \t\t");
    String _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this._sprayCompiler.compileForPropertyAssignement(xexp, "returnedValue", "modelElement");
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        _xtrycatchfinallyexpression = ("// generation exception: " + e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    _builder.append(_xtrycatchfinallyexpression, "    \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}.apply(");
    _builder.append(metaClassAttribute, "");
    _builder.append("); ");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
