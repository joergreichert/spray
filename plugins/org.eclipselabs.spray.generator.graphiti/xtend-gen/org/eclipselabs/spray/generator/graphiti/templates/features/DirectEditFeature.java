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
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class DirectEditFeature extends FileGenerator<MetaClass> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private SprayCompiler _sprayCompiler;
  
  @Override
  public CharSequence generateExtensionFile(final MetaClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  @Override
  public CharSequence generateBaseFile(final MetaClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  public CharSequence mainExtensionPointFile(final MetaClass metaClass, final String className) {
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
  
  public CharSequence mainFile(final MetaClass metaclass, final String className) {
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
    _builder.append("import com.google.common.base.Function;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDirectEditingContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.AbstractText;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractDirectEditingFeature;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractDirectEditingFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(metaclass);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected IPeService peService = Graphiti.getPeService();");
    _builder.newLine();
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
    CharSequence _generate_canDirectEdit = this.generate_canDirectEdit(metaclass);
    _builder.append(_generate_canDirectEdit, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getInitalValue = this.generate_getInitalValue(metaclass);
    _builder.append(_generate_getInitalValue, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getEditingType = this.generate_getEditingType(metaclass);
    _builder.append(_generate_getEditingType, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_setValue = this.generate_setValue(metaclass);
    _builder.append(_generate_setValue, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canDirectEdit(final MetaClass metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canDirectEdit(IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Object bo = getBusinessObjectForPictogramElement(pe);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("GraphicsAlgorithm ga = context.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// support direct editing, if it is a ");
    String _itfName = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName, "    ");
    _builder.append(", and the user clicked");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// directly on the text and not somewhere else in the rectangle");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo instanceof ");
    String _itfName_1 = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName_1, "    ");
    _builder.append(" && ga instanceof AbstractText) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// direct editing not supported in all other cases");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getInitalValue(final MetaClass metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public String getInitialValue(IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return the initial value of the clicked text on the ");
    String _itfName = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    String _itfName_1 = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName_1, "    ");
    _builder.append(" eClass = (");
    String _itfName_2 = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName_2, "    ");
    _builder.append(") getBusinessObjectForPictogramElement(pe);");
    _builder.newLineIfNotEmpty();
    {
      ShapeInSpray _representedBy = metaclass.getRepresentedBy();
      if ((_representedBy instanceof ShapeFromDsl)) {
        _builder.append("    ");
        ShapeInSpray _representedBy_1 = metaclass.getRepresentedBy();
        EList<ShapePropertyAssignment> _properties = ((ShapeFromDsl) _representedBy_1).getProperties();
        CharSequence _generate_initialValue = this.generate_initialValue(((ShapePropertyAssignment[])Conversions.unwrapArray(_properties, ShapePropertyAssignment.class)), metaclass);
        _builder.append(_generate_initialValue, "    ");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _and = false;
        ShapeInSpray _representedBy_2 = metaclass.getRepresentedBy();
        if (!(_representedBy_2 instanceof ConnectionInSpray)) {
          _and = false;
        } else {
          ShapeInSpray _representedBy_3 = metaclass.getRepresentedBy();
          ConnectionReference _connection = ((ConnectionInSpray) _representedBy_3).getConnection();
          boolean _notEquals = (!Objects.equal(_connection, null));
          _and = _notEquals;
        }
        if (_and) {
          _builder.append("    ");
          ShapeInSpray _representedBy_4 = metaclass.getRepresentedBy();
          EList<ShapePropertyAssignment> _properties_1 = ((ConnectionInSpray) _representedBy_4).getProperties();
          CharSequence _generate_initialValue_1 = this.generate_initialValue(((ShapePropertyAssignment[])Conversions.unwrapArray(_properties_1, ShapePropertyAssignment.class)), metaclass);
          _builder.append(_generate_initialValue_1, "    ");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("    ");
          _builder.append("return \"\";");
          _builder.newLine();
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getEditingType(final MetaClass metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public int getEditingType() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return TYPE_TEXT;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_setValue(final MetaClass metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public void setValue(final String value, final IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// set the new value on the ");
    String _itfName = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("final PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    String _itfName_1 = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName_1, "    ");
    _builder.append(" eClass = (");
    String _itfName_2 = this._namingExtensions.getItfName(metaclass);
    _builder.append(_itfName_2, "    ");
    _builder.append(") getBusinessObjectForPictogramElement(pe);");
    _builder.newLineIfNotEmpty();
    {
      ShapeInSpray _representedBy = metaclass.getRepresentedBy();
      if ((_representedBy instanceof ShapeFromDsl)) {
        _builder.append("    ");
        ShapeInSpray _representedBy_1 = metaclass.getRepresentedBy();
        EList<ShapePropertyAssignment> _properties = ((ShapeFromDsl) _representedBy_1).getProperties();
        CharSequence _generate_setValue = this.generate_setValue(((ShapePropertyAssignment[])Conversions.unwrapArray(_properties, ShapePropertyAssignment.class)), metaclass);
        _builder.append(_generate_setValue, "    ");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _and = false;
        ShapeInSpray _representedBy_2 = metaclass.getRepresentedBy();
        if (!(_representedBy_2 instanceof ConnectionInSpray)) {
          _and = false;
        } else {
          ShapeInSpray _representedBy_3 = metaclass.getRepresentedBy();
          ConnectionReference _connection = ((ConnectionInSpray) _representedBy_3).getConnection();
          boolean _notEquals = (!Objects.equal(_connection, null));
          _and = _notEquals;
        }
        if (_and) {
          _builder.append("    ");
          ShapeInSpray _representedBy_4 = metaclass.getRepresentedBy();
          EList<ShapePropertyAssignment> _properties_1 = ((ConnectionInSpray) _representedBy_4).getProperties();
          CharSequence _generate_setValue_1 = this.generate_setValue(((ShapePropertyAssignment[])Conversions.unwrapArray(_properties_1, ShapePropertyAssignment.class)), metaclass);
          _builder.append(_generate_setValue_1, "    ");
          _builder.newLineIfNotEmpty();
        }
      }
    }
    _builder.append("    ");
    _builder.append("updatePictogramElement(pe);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_initialValue(final ShapePropertyAssignment[] properties, final MetaClass metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AbstractText gAlg = (AbstractText) context.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("String id = peService.getPropertyValue(gAlg, TEXT_ID);");
    _builder.newLine();
    {
      for(final ShapePropertyAssignment property : properties) {
        _builder.append("{");
        _builder.newLine();
        {
          XExpression _value = property.getValue();
          boolean _notEquals = (!Objects.equal(_value, null));
          if (_notEquals) {
            _builder.append("\t");
            XExpression _value_1 = property.getValue();
            String _itfName = this._namingExtensions.getItfName(metaclass);
            CharSequence _propertyAssignmentFunction = this.propertyAssignmentFunction(_value_1, "gAlgValue", "String", _itfName, "eClass");
            _builder.append(_propertyAssignmentFunction, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if(id.equals(\"");
            ShapeDslKey _key = property.getKey();
            String _simpleName = this._namingExtensions.simpleName(_key);
            _builder.append(_simpleName, "\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            {
              EAttribute _attribute = null;
              if (property!=null) {
                _attribute=property.getAttribute();
              }
              String _name = null;
              if (_attribute!=null) {
                _name=_attribute.getName();
              }
              boolean _notEquals_1 = (!Objects.equal(_name, null));
              if (_notEquals_1) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return eClass.get");
                EAttribute _attribute_1 = property.getAttribute();
                String _name_1 = _attribute_1.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                _builder.append(_firstUpper, "\t\t");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return gAlgValue;");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            {
              EAttribute _attribute_2 = null;
              if (property!=null) {
                _attribute_2=property.getAttribute();
              }
              String _name_2 = null;
              if (_attribute_2!=null) {
                _name_2=_attribute_2.getName();
              }
              boolean _notEquals_2 = (!Objects.equal(_name_2, null));
              if (_notEquals_2) {
                _builder.append("\t");
                _builder.append("if(id.equals(\"");
                ShapeDslKey _key_1 = property.getKey();
                String _simpleName_1 = this._namingExtensions.simpleName(_key_1);
                _builder.append(_simpleName_1, "\t");
                _builder.append("\")) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("    ");
                _builder.append("return eClass.get");
                EAttribute _attribute_3 = property.getAttribute();
                String _name_3 = _attribute_3.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
                _builder.append(_firstUpper_1, "\t    ");
                _builder.append("();");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("return \"\";");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_setValue(final ShapePropertyAssignment[] properties, final MetaClass metaclass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("AbstractText gAlg = (AbstractText) context.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("String id = peService.getPropertyValue(gAlg, TEXT_ID);");
    _builder.newLine();
    {
      for(final ShapePropertyAssignment property : properties) {
        _builder.append("{");
        _builder.newLine();
        {
          XExpression _value = property.getValue();
          boolean _notEquals = (!Objects.equal(_value, null));
          if (_notEquals) {
            _builder.append("\t");
            XExpression _value_1 = property.getValue();
            String _itfName = this._namingExtensions.getItfName(metaclass);
            CharSequence _propertyAssignmentFunction = this.propertyAssignmentFunction(_value_1, "gAlgValue", "String", _itfName, "eClass");
            _builder.append(_propertyAssignmentFunction, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("if(id.equals(\"");
            ShapeDslKey _key = property.getKey();
            String _simpleName = this._namingExtensions.simpleName(_key);
            _builder.append(_simpleName, "\t");
            _builder.append("\")) {");
            _builder.newLineIfNotEmpty();
            {
              EAttribute _attribute = null;
              if (property!=null) {
                _attribute=property.getAttribute();
              }
              String _name = null;
              if (_attribute!=null) {
                _name=_attribute.getName();
              }
              boolean _notEquals_1 = (!Objects.equal(_name, null));
              if (_notEquals_1) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("eClass.set");
                EAttribute _attribute_1 = property.getAttribute();
                String _name_1 = _attribute_1.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                _builder.append(_firstUpper, "\t\t");
                _builder.append("(value);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("gAlg.setValue(gAlgValue);");
                _builder.newLine();
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          } else {
            {
              EAttribute _attribute_2 = null;
              if (property!=null) {
                _attribute_2=property.getAttribute();
              }
              String _name_2 = null;
              if (_attribute_2!=null) {
                _name_2=_attribute_2.getName();
              }
              boolean _notEquals_2 = (!Objects.equal(_name_2, null));
              if (_notEquals_2) {
                _builder.append("\t");
                _builder.append("if(id.equals(\"");
                ShapeDslKey _key_1 = property.getKey();
                String _simpleName_1 = this._namingExtensions.simpleName(_key_1);
                _builder.append(_simpleName_1, "\t");
                _builder.append("\")) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("    ");
                _builder.append("eClass.set");
                EAttribute _attribute_3 = property.getAttribute();
                String _name_3 = _attribute_3.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
                _builder.append(_firstUpper_1, "\t    ");
                _builder.append("(value);");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("}");
        _builder.newLine();
      }
    }
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
