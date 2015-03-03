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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class DeleteReferenceFeature extends FileGenerator<MetaReference> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
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
    _builder.append("import org.eclipse.emf.ecore.util.EcoreUtil;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IRemoveFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDeleteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IRemoveContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.RemoveContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.AnchorContainer;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends DefaultDeleteFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(reference);
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
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_delete = this.generate_delete(reference);
    _builder.append(_generate_delete, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_deleteReferences = this.generate_deleteReferences(reference);
    _builder.append(_generate_deleteReferences, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_deleteReference = this.generate_deleteReference(reference);
    _builder.append(_generate_deleteReference, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(reference);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_delete(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public void delete(final IDeleteContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pe = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String reference = peService.getPropertyValue(pe, PROPERTY_REFERENCE);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String element   = peService.getPropertyValue(pe, PROPERTY_TARGETOBJECT);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!getUserDecision()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("preDelete(context);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// TRY");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if( pe instanceof Connection) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final Connection line = (Connection)pe;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final AnchorContainer parent = line.getStart().getParent();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// EObject start = getBusinessObjectForPictogramElement(parent);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final AnchorContainer child = line.getEnd().getParent();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// EObject end = getBusinessObjectForPictogramElement(child);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//END TRY");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final IRemoveContext rc = new RemoveContext(pe);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final IRemoveFeature removeFeature = getFeatureProvider().getRemoveFeature(rc);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (removeFeature != null) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("removeFeature.remove(rc);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("deleteReferences(businessObjectsForPictogramElement, reference, element);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("postDelete(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_deleteReferences(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Delete business objects.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param businessObjects");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            the business objects");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected void deleteReferences(final Object[] businessObjects, final String reference, final String element) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (businessObjects != null) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (final Object bo : businessObjects) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("deleteReference((EObject)bo, reference, element);");
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
  
  public CharSequence generate_deleteReference(final MetaReference reference) {
    StringConcatenation _builder = new StringConcatenation();
    final EReference target = reference.getTarget();
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Delete business object.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* @param bo");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*            the bo");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected void deleteReference(final EObject bo, final String reference, final String element) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if( reference == null){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("EcoreUtil.delete(bo, true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if( bo instanceof ");
    MetaClass _metaClass = reference.getMetaClass();
    String _itfName = this._namingExtensions.getItfName(_metaClass);
    _builder.append(_itfName, "        ");
    _builder.append(" ){");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("final ");
    MetaClass _metaClass_1 = reference.getMetaClass();
    String _itfName_1 = this._namingExtensions.getItfName(_metaClass_1);
    _builder.append(_itfName_1, "            ");
    _builder.append(" object = (");
    MetaClass _metaClass_2 = reference.getMetaClass();
    String _itfName_2 = this._namingExtensions.getItfName(_metaClass_2);
    _builder.append(_itfName_2, "            ");
    _builder.append(" ) bo;");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.newLine();
    {
      int _upperBound = target.getUpperBound();
      boolean _notEquals = (_upperBound != 1);
      if (_notEquals) {
        _builder.append("    ");
        EClass _eReferenceType = target.getEReferenceType();
        String _itfName_3 = this._namingExtensions.getItfName(_eReferenceType);
        _builder.append(_itfName_3, "    ");
        _builder.append(" toBeRemoved = null;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("for (final Object rule : object.get");
        String _name = target.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "    ");
        _builder.append("()) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if( ((");
        EClass _eReferenceType_1 = target.getEReferenceType();
        String _itfName_4 = this._namingExtensions.getItfName(_eReferenceType_1);
        _builder.append(_itfName_4, "        ");
        _builder.append(") rule).get");
        String _stringAttribute = this.getStringAttribute(target);
        _builder.append(_stringAttribute, "        ");
        _builder.append("().equals(element)){");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("toBeRemoved = (");
        EClass _eReferenceType_2 = target.getEReferenceType();
        String _itfName_5 = this._namingExtensions.getItfName(_eReferenceType_2);
        _builder.append(_itfName_5, "            ");
        _builder.append(") rule;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if( toBeRemoved != null ){");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("object.get");
        String _name_1 = target.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper_1, "        ");
        _builder.append("().remove(toBeRemoved);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("// TODO Must remove toBeRemoved if it is a containment reference !");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("    ");
        _builder.append("object.set");
        String _name_2 = this._namingExtensions.getName(reference);
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper_2, "    ");
        _builder.append("(null);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("System.out.println(\"DELETE OBJECT \" + bo);");
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
  
  public String getStringAttribute(final EReference ref) {
    String _xblockexpression = null;
    {
      EClass _eReferenceType = ref.getEReferenceType();
      EList<EAttribute> _eAllAttributes = _eReferenceType.getEAllAttributes();
      final Function1<EAttribute, Boolean> _function = new Function1<EAttribute, Boolean>() {
        @Override
        public Boolean apply(final EAttribute it) {
          boolean _or = false;
          String _name = it.getName();
          boolean _equals = _name.equals("name");
          if (_equals) {
            _or = true;
          } else {
            String _name_1 = it.getName();
            boolean _equals_1 = _name_1.equals("id");
            _or = _equals_1;
          }
          return Boolean.valueOf(_or);
        }
      };
      final Iterable<EAttribute> nameOrIds = IterableExtensions.<EAttribute>filter(_eAllAttributes, _function);
      String _xifexpression = null;
      int _size = IterableExtensions.size(nameOrIds);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        EAttribute _head = IterableExtensions.<EAttribute>head(nameOrIds);
        String _name = _head.getName();
        _xifexpression = StringExtensions.toFirstUpper(_name);
      } else {
        String _xblockexpression_1 = null;
        {
          EClass _eReferenceType_1 = ref.getEReferenceType();
          EList<EAttribute> _eAllAttributes_1 = _eReferenceType_1.getEAllAttributes();
          final Function1<EAttribute, Boolean> _function_1 = new Function1<EAttribute, Boolean>() {
            @Override
            public Boolean apply(final EAttribute it) {
              EDataType _eAttributeType = it.getEAttributeType();
              String _name = _eAttributeType.getName();
              return Boolean.valueOf(_name.equals("EString"));
            }
          };
          final Iterable<EAttribute> stringAtts = IterableExtensions.<EAttribute>filter(_eAllAttributes_1, _function_1);
          EAttribute _head_1 = IterableExtensions.<EAttribute>head(stringAtts);
          String _name_1 = null;
          if (_head_1!=null) {
            _name_1=_head_1.getName();
          }
          _xblockexpression_1 = StringExtensions.toFirstUpper(_name_1);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
