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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class PasteFeature extends FileGenerator<Diagram> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private MetaClassExtensions _metaClassExtensions;
  
  @Override
  public CharSequence generateExtensionFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  @Override
  public CharSequence generateBaseFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  public CharSequence mainExtensionPointFile(final Diagram metaClass, final String className) {
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
  
  public CharSequence mainFile(final Diagram diagram, final String className) {
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
    _builder.append("import org.eclipse.emf.ecore.util.EcoreUtil;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IPasteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.Property;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractPasteFeature;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractPasteFeature  {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(diagram);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected ");
    String _modelServiceClassName = this._namingExtensions.getModelServiceClassName(diagram);
    String _shortName = this._namingExtensions.shortName(_modelServiceClassName);
    _builder.append(_shortName, "    ");
    _builder.append(" modelService;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("modelService = ");
    String _modelServiceClassName_1 = this._namingExtensions.getModelServiceClassName(diagram);
    String _shortName_1 = this._namingExtensions.shortName(_modelServiceClassName_1);
    _builder.append(_shortName_1, "        ");
    _builder.append(".getModelService(fp.getDiagramTypeProvider());");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_canPaste = this.generate_canPaste(diagram);
    _builder.append(_generate_canPaste, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_paste = this.generate_paste(diagram);
    _builder.append(_generate_paste, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_addBusinessObjectToContainer = this.generate_addBusinessObjectToContainer(diagram);
    _builder.append(_generate_addBusinessObjectToContainer, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canPaste(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canPaste(IPasteContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// TODO: only support pasting directly in the diagram");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement[] pes = context.getPictogramElements();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (pes.length != 1 || !(pes[0] instanceof Diagram)) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// can paste, if all objects on the clipboard are PictogramElements with link on subclasses of ");
    EClass _modelType = diagram.getModelType();
    String _itfName = this._namingExtensions.getItfName(_modelType);
    _builder.append(_itfName, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("Object[] fromClipboard = getFromClipboard();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (fromClipboard == null || fromClipboard.length == 0) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (Object object : fromClipboard) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!(object instanceof PictogramElement)) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} else if(!(getBusinessObjectForPictogramElement((PictogramElement) object) instanceof ");
    EClass _modelType_1 = diagram.getModelType();
    String _itfName_1 = this._namingExtensions.getItfName(_modelType_1);
    _builder.append(_itfName_1, "        ");
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
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
  
  public CharSequence generate_paste(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public void paste(IPasteContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// already verified, that pasting is allowed just directly in the diagram");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement[] pes = context.getPictogramElements();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Diagram diagram = (Diagram) pes[0];");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// get the PictogramElements from the clipboard and the linked business object.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Object[] objects = getFromClipboard();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for (Object object : objects) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("PictogramElement pictogramElement = (PictogramElement) object;");
    _builder.newLine();
    _builder.append("        ");
    EClass _modelType = diagram.getModelType();
    String _itfName = this._namingExtensions.getItfName(_modelType);
    _builder.append(_itfName, "        ");
    _builder.append(" boRef = (");
    EClass _modelType_1 = diagram.getModelType();
    String _itfName_1 = this._namingExtensions.getItfName(_modelType_1);
    _builder.append(_itfName_1, "        ");
    _builder.append(") getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    EClass _modelType_2 = diagram.getModelType();
    String _itfName_2 = this._namingExtensions.getItfName(_modelType_2);
    _builder.append(_itfName_2, "        ");
    _builder.append(" bo = EcoreUtil.copy(boRef);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("addBusinessObjectToContainer(bo, pictogramElement);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// create a new AddContext for the creation of a new shape.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AddContext ac = new AddContext(new AddContext(), bo);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ac.setLocation(0, 0); // for simplicity paste at (0, 0)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ac.setTargetContainer(diagram); // paste on diagram");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// copy all properties from the shape (e.g. ALIAS etc.)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for(Property prop : pictogramElement.getProperties()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("ac.putProperty(prop.getKey(), prop.getValue());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("getFeatureProvider().addIfPossible(ac);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_addBusinessObjectToContainer(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected void addBusinessObjectToContainer(");
    EClass _modelType = diagram.getModelType();
    String _itfName = this._namingExtensions.getItfName(_modelType);
    _builder.append(_itfName, "");
    _builder.append(" bo, PictogramElement pe) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("final ");
    EClass _modelType_1 = diagram.getModelType();
    String _itfName_1 = this._namingExtensions.getItfName(_modelType_1);
    _builder.append(_itfName_1, "    ");
    _builder.append(" model = modelService.getModel();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("final String alias = Graphiti.getPeService().getPropertyValue(pe, PROPERTY_ALIAS);");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = diagram.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("    ");
        _builder.append("if(");
        CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(cls);
        _builder.append(_generate_metaClassSwitchCondition, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          boolean _and = false;
          boolean _and_1 = false;
          boolean _hasCreateBehavior = this._metaClassExtensions.hasCreateBehavior(cls);
          if (!_hasCreateBehavior) {
            _and_1 = false;
          } else {
            CreateBehavior _createBehavior = this._metaClassExtensions.getCreateBehavior(cls);
            boolean _notEquals = (!Objects.equal(_createBehavior, null));
            _and_1 = _notEquals;
          }
          if (!_and_1) {
            _and = false;
          } else {
            CreateBehavior _createBehavior_1 = this._metaClassExtensions.getCreateBehavior(cls);
            EReference _containmentReference = _createBehavior_1.getContainmentReference();
            boolean _notEquals_1 = (!Objects.equal(_containmentReference, null));
            _and = _notEquals_1;
          }
          if (_and) {
            _builder.append("    ");
            _builder.append("    ");
            CreateBehavior _createBehavior_2 = this._metaClassExtensions.getCreateBehavior(cls);
            final EReference containmentRef = _createBehavior_2.getContainmentReference();
            _builder.newLineIfNotEmpty();
            {
              boolean _isMany = containmentRef.isMany();
              if (_isMany) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("model.get");
                String _name = containmentRef.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                _builder.append(_firstUpper, "        ");
                _builder.append("().add((");
                CharSequence _cast = this.getCast(cls);
                _builder.append(_cast, "        ");
                _builder.append(") bo);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("model.set");
                String _name_1 = containmentRef.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
                _builder.append(_firstUpper_1, "        ");
                _builder.append("((");
                CharSequence _cast_1 = this.getCast(cls);
                _builder.append(_cast_1, "        ");
                _builder.append(") bo);");
                _builder.newLineIfNotEmpty();
              }
            }
          } else {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("throw new UnsupportedOperationException(\"No create behavior defined\");");
            _builder.newLine();
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getCast(final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    EClass _type = cls.getType();
    String _itfName = this._namingExtensions.getItfName(_type);
    _builder.append(_itfName, "");
    return _builder;
  }
  
  public CharSequence generate_metaClassSwitchCondition(final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bo.eClass() == ");
    EClass _type = cls.getType();
    String _literalConstant = this._namingExtensions.getLiteralConstant(_type);
    _builder.append(_literalConstant, "");
    _builder.append(" && ");
    {
      String _alias = cls.getAlias();
      boolean _equals = Objects.equal(_alias, null);
      if (_equals) {
        _builder.append("alias == null");
      } else {
        _builder.append("\"");
        String _alias_1 = cls.getAlias();
        _builder.append(_alias_1, "");
        _builder.append("\".equals(alias)");
      }
    }
    return _builder;
  }
}
