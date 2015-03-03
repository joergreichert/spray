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
import com.google.common.collect.Iterables;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.CompartmentBehavior;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class CreateShapeFeature extends FileGenerator<MetaClass> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private MetaClassExtensions _metaClassExtensions;
  
  @Override
  public CharSequence generateBaseFile(final MetaClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final MetaClass modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
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
  
  public CharSequence mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    final Diagram diagram = metaClass.getDiagram();
    _builder.newLineIfNotEmpty();
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
    _builder.append("import org.eclipse.graphiti.features.context.ICreateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAreaContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractCreateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected static String TITLE = \"Create ");
    String _uiLabel = this.getUiLabel(metaClass);
    _builder.append(_uiLabel, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected static String USER_QUESTION = \"Enter new ");
    String _uiLabel_1 = this.getUiLabel(metaClass);
    _builder.append(_uiLabel_1, "    ");
    _builder.append(" name\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected ");
    String _modelServiceClassName = this._namingExtensions.getModelServiceClassName(diagram);
    String _shortName = this._namingExtensions.shortName(_modelServiceClassName);
    _builder.append(_shortName, "    ");
    _builder.append(" modelService;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected ");
    String _itfName = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName, "    ");
    _builder.append(" newClass = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(metaClass);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append(" (final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// set name and description of the creation feature");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp, \"");
    String _createFeatureLabel = this._metaClassExtensions.getCreateFeatureLabel(metaClass);
    _builder.append(_createFeatureLabel, "        ");
    _builder.append("\", \"");
    String _createFeatureDescription = this._metaClassExtensions.getCreateFeatureDescription(metaClass);
    _builder.append(_createFeatureDescription, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
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
    CharSequence _generate_canCreate = this.generate_canCreate(metaClass);
    _builder.append(_generate_canCreate, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_create = this.generate_create(metaClass);
    _builder.append(_generate_create, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_createModelElement = this.generate_createModelElement(metaClass);
    _builder.append(_generate_createModelElement, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getCreateImageId = this.generate_getCreateImageId(metaClass);
    _builder.append(_generate_getCreateImageId, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_addGraphicalRepresentation = this.generate_addGraphicalRepresentation(metaClass);
    _builder.append(_generate_addGraphicalRepresentation, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(metaClass);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Determine the name that appears in the dialog when asking for the name
   */
  private String getUiLabel(final MetaClass mc) {
    String _xifexpression = null;
    boolean _and = false;
    boolean _hasCreateBehavior = this._metaClassExtensions.hasCreateBehavior(mc);
    if (!_hasCreateBehavior) {
      _and = false;
    } else {
      CreateBehavior _createBehavior = this._metaClassExtensions.getCreateBehavior(mc);
      String _label = _createBehavior.getLabel();
      boolean _notEquals = (!Objects.equal(_label, null));
      _and = _notEquals;
    }
    if (_and) {
      CreateBehavior _createBehavior_1 = this._metaClassExtensions.getCreateBehavior(mc);
      _xifexpression = _createBehavior_1.getLabel();
    } else {
      _xifexpression = this._namingExtensions.getVisibleName(mc);
    }
    return _xifexpression;
  }
  
  public CharSequence generate_canCreate(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canCreate(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());");
    _builder.newLine();
    {
      CreateBehavior _createBehavior = this._metaClassExtensions.getCreateBehavior(metaClass);
      boolean _notEquals = (!Objects.equal(_createBehavior, null));
      if (_notEquals) {
        _builder.append("    ");
        _builder.append("// TODO: Respect the cardinality of the containment reference");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (context.getTargetContainer() instanceof Diagram) {");
        _builder.newLine();
        {
          CreateBehavior _createBehavior_1 = this._metaClassExtensions.getCreateBehavior(metaClass);
          EReference _containmentReference = _createBehavior_1.getContainmentReference();
          boolean _notEquals_1 = (!Objects.equal(_containmentReference, null));
          if (_notEquals_1) {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return true;");
            _builder.newLine();
          } else {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return false;");
            _builder.newLine();
          }
        }
        _builder.append("    ");
        _builder.append("} else if (context.getTargetContainer() instanceof ContainerShape) {");
        _builder.newLine();
        {
          EList<Behavior> _behaviors = metaClass.getBehaviors();
          final Function1<Behavior, Boolean> _function = new Function1<Behavior, Boolean>() {
            @Override
            public Boolean apply(final Behavior m) {
              return Boolean.valueOf((m instanceof CompartmentBehavior));
            }
          };
          Iterable<Behavior> _filter = IterableExtensions.<Behavior>filter(_behaviors, _function);
          for(final Behavior behavior : _filter) {
            {
              EList<EReference> _compartmentReference = ((CompartmentBehavior) behavior).getCompartmentReference();
              final Function1<EReference, Boolean> _function_1 = new Function1<EReference, Boolean>() {
                @Override
                public Boolean apply(final EReference m) {
                  EObject _eContainer = m.eContainer();
                  return Boolean.valueOf((_eContainer instanceof EClass));
                }
              };
              Iterable<EReference> _filter_1 = IterableExtensions.<EReference>filter(_compartmentReference, _function_1);
              for(final EReference Refcompartment : _filter_1) {
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("if (target instanceof ");
                EObject _eContainer = Refcompartment.eContainer();
                String _itfName = this._namingExtensions.getItfName(((EClass) _eContainer));
                _builder.append(_itfName, "        ");
                _builder.append(") {");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return true;");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("// And now the new stuff");
    _builder.newLine();
    _builder.append("    ");
    Iterable<ShapeCompartmentAssignment> result = this._namingExtensions.getReferencesTo(metaClass);
    _builder.newLineIfNotEmpty();
    {
      for(final ShapeCompartmentAssignment cls : result) {
        _builder.append("    ");
        _builder.append("// cls ");
        ShapeFromDsl _shape = cls.getShape();
        MetaClass _represents = _shape.getRepresents();
        String _name = this._namingExtensions.getName(_represents);
        _builder.append(_name, "    ");
        _builder.append(" refers to this metaClass");
        _builder.newLineIfNotEmpty();
        {
          EReference _reference = cls.getReference();
          boolean _isContainment = _reference.isContainment();
          if (_isContainment) {
            _builder.append("    ");
            _builder.append("if( target instanceof ");
            ShapeFromDsl _shape_1 = cls.getShape();
            MetaClass _represents_1 = _shape_1.getRepresents();
            String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(_represents_1);
            _builder.append(_javaInterfaceName, "    ");
            _builder.append(" ){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("if (SprayLayoutService.isCompartment(context.getTargetContainer())) {");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("String id = GraphitiProperties.get(context.getTargetContainer(), TEXT_ID);");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("if ( (id != null) && (id.equals(\"");
            ShapeDslKey _shapeDslKey = cls.getShapeDslKey();
            String _simpleName = this._namingExtensions.simpleName(_shapeDslKey);
            _builder.append(_simpleName, "            ");
            _builder.append("\")) ) {");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("            ");
            _builder.append("return true;");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_create(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public Object[] create(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("newClass = create");
    String _visibleName = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName, "    ");
    _builder.append("(context);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (newClass == null ) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return EMPTY;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// do the add");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("addGraphicalRepresentation(context, newClass);");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// activate direct editing after object creation");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("getFeatureProvider().getDirectEditingInfo().setActive(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return newly created business object(s)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new Object[] { newClass };");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_createModelElement(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("        ");
    final Diagram diagram = metaClass.getDiagram();
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    EClass _modelType = diagram.getModelType();
    final String modelClassName = this._namingExtensions.getItfName(_modelType);
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    EList<Behavior> _behaviors = metaClass.getBehaviors();
    Iterable<CreateBehavior> _filter = Iterables.<CreateBehavior>filter(_behaviors, CreateBehavior.class);
    final CreateBehavior createBehavior = IterableExtensions.<CreateBehavior>head(_filter);
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    EReference containmentRef = null;
    _builder.newLineIfNotEmpty();
    _builder.append("//      ");
    {
      boolean _notEquals = (!Objects.equal(createBehavior, null));
      if (_notEquals) {
        _builder.append(" ");
        EReference _containmentReference = createBehavior.getContainmentReference();
        _builder.append(containmentRef = _containmentReference, "");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("         ");
    _builder.append("* Creates a new {@link ");
    String _itfName = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName, "         ");
    _builder.append("} instance and adds it to the containing type.");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("protected ");
    String _itfName_1 = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName_1, "        ");
    _builder.append(" create");
    String _visibleName = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName, "        ");
    _builder.append("(final ICreateContext context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    CharSequence _xifexpression = null;
    boolean _notEquals_1 = (!Objects.equal(createBehavior, null));
    if (_notEquals_1) {
      EAttribute _askFor = createBehavior.getAskFor();
      _xifexpression = this.handleAskFor(metaClass, _askFor);
    }
    _builder.append(_xifexpression, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("boolean isContainment = false;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());");
    _builder.newLine();
    {
      EList<Behavior> _behaviors_1 = metaClass.getBehaviors();
      final Function1<Behavior, Boolean> _function = new Function1<Behavior, Boolean>() {
        @Override
        public Boolean apply(final Behavior m) {
          return Boolean.valueOf((m instanceof CompartmentBehavior));
        }
      };
      Iterable<Behavior> _filter_1 = IterableExtensions.<Behavior>filter(_behaviors_1, _function);
      for(final Behavior behavior : _filter_1) {
        {
          EList<EReference> _compartmentReference = ((CompartmentBehavior) behavior).getCompartmentReference();
          final Function1<EReference, Boolean> _function_1 = new Function1<EReference, Boolean>() {
            @Override
            public Boolean apply(final EReference m) {
              EObject _eContainer = m.eContainer();
              return Boolean.valueOf((_eContainer instanceof EClass));
            }
          };
          Iterable<EReference> _filter_2 = IterableExtensions.<EReference>filter(_compartmentReference, _function_1);
          for(final EReference Refcompartment : _filter_2) {
            _builder.append("            ");
            _builder.append("if (target instanceof ");
            EObject _eContainer = Refcompartment.eContainer();
            String _itfName_2 = this._namingExtensions.getItfName(((EClass) _eContainer));
            _builder.append(_itfName_2, "            ");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("            ");
            _builder.append("    ");
            _builder.append("isContainment = true;");
            _builder.newLine();
            _builder.append("            ");
            _builder.append("    ");
            EObject _eContainer_1 = Refcompartment.eContainer();
            String _itfName_3 = this._namingExtensions.getItfName(((EClass) _eContainer_1));
            _builder.append(_itfName_3, "                ");
            _builder.append(" model = (");
            EObject _eContainer_2 = Refcompartment.eContainer();
            String _itfName_4 = this._namingExtensions.getItfName(((EClass) _eContainer_2));
            _builder.append(_itfName_4, "                ");
            _builder.append(") target;");
            _builder.newLineIfNotEmpty();
            {
              boolean _isMany = Refcompartment.isMany();
              if (_isMany) {
                _builder.append("            ");
                _builder.append("    ");
                _builder.append("model.get");
                String _name = Refcompartment.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name);
                _builder.append(_firstUpper, "                ");
                _builder.append("().add(newClass);");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("            ");
                _builder.append("    ");
                _builder.append("model.set");
                String _name_1 = Refcompartment.getName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
                _builder.append(_firstUpper_1, "                ");
                _builder.append("(newClass);");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("            ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("//              And now the NEW stuff");
    _builder.newLine();
    _builder.append("            ");
    Iterable<ShapeCompartmentAssignment> result = this._namingExtensions.getReferencesTo(metaClass);
    _builder.newLineIfNotEmpty();
    {
      for(final ShapeCompartmentAssignment cls : result) {
        _builder.append("            ");
        ShapeFromDsl _shape = cls.getShape();
        MetaClass _represents = _shape.getRepresents();
        String domainName = this._namingExtensions.getJavaInterfaceName(_represents);
        _builder.newLineIfNotEmpty();
        {
          EReference _reference = cls.getReference();
          boolean _isContainment = _reference.isContainment();
          if (_isContainment) {
            _builder.append("            ");
            _builder.append("   ");
            _builder.append("if( target instanceof ");
            _builder.append(domainName, "               ");
            _builder.append(" ){");
            _builder.newLineIfNotEmpty();
            _builder.append("            ");
            _builder.append("   ");
            _builder.append("    ");
            _builder.append(domainName, "                   ");
            _builder.append(" domainObject = (");
            _builder.append(domainName, "                   ");
            _builder.append(") target;");
            _builder.newLineIfNotEmpty();
            _builder.append("            ");
            _builder.append("   ");
            _builder.append("        ");
            _builder.append("// containment");
            _builder.newLine();
            {
              EReference _reference_1 = cls.getReference();
              boolean _isMany_1 = _reference_1.isMany();
              if (_isMany_1) {
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("domainObject.get");
                EReference _reference_2 = cls.getReference();
                String _name_2 = _reference_2.getName();
                String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
                _builder.append(_firstUpper_2, "                       ");
                _builder.append("().add(newClass);");
                _builder.newLineIfNotEmpty();
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("setDoneChanges(true);");
                _builder.newLine();
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("return newClass;");
                _builder.newLine();
              } else {
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("domainObject.set");
                EReference _reference_3 = cls.getReference();
                String _name_3 = _reference_3.getName();
                String _firstUpper_3 = StringExtensions.toFirstUpper(_name_3);
                _builder.append(_firstUpper_3, "                       ");
                _builder.append("(newClass);");
                _builder.newLineIfNotEmpty();
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("// clear the shapes for the previous ");
                EReference _reference_4 = cls.getReference();
                String _name_4 = _reference_4.getName();
                String _firstUpper_4 = StringExtensions.toFirstUpper(_name_4);
                _builder.append(_firstUpper_4, "                       ");
                _builder.newLineIfNotEmpty();
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("targetContainer.getChildren().clear();");
                _builder.newLine();
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("setDoneChanges(true);");
                _builder.newLine();
                _builder.append("            ");
                _builder.append("   ");
                _builder.append("        ");
                _builder.append("return newClass;");
                _builder.newLine();
              }
            }
            _builder.append("            ");
            _builder.append("   ");
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          } else {
            _builder.append("            ");
            _builder.append("   ");
            _builder.append("// NOT containment ");
            _builder.newLine();
          }
        }
      }
    }
    {
      boolean _notEquals_2 = (!Objects.equal(containmentRef, null));
      if (_notEquals_2) {
        _builder.append("            ");
        _builder.append("if (!isContainment) {");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("    ");
        _builder.append("// add the element to containment reference");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("    ");
        _builder.append(modelClassName, "                ");
        _builder.append(" model = modelService.getModel();");
        _builder.newLineIfNotEmpty();
        {
          boolean _isMany_2 = containmentRef.isMany();
          if (_isMany_2) {
            _builder.append("            ");
            _builder.append("    ");
            _builder.append("model.get");
            String _name_5 = containmentRef.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_5);
            _builder.append(_firstUpper_5, "                ");
            _builder.append("().add(newClass);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("            ");
            _builder.append("    ");
            _builder.append("// clear the shapes for the previous model");
            _builder.newLine();
            _builder.append("            ");
            _builder.append("    ");
            _builder.append("targetContainer.getChildren().clear();");
            _builder.newLine();
            _builder.append("            ");
            _builder.append("    ");
            _builder.append("model.set");
            String _name_6 = containmentRef.getName();
            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_6);
            _builder.append(_firstUpper_6, "                ");
            _builder.append("(newClass);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("            ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("            ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return newClass;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleAskFor(final MetaClass metaClass, final EAttribute attribute) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// create ");
    String _name = this._namingExtensions.getName(metaClass);
    _builder.append(_name, "");
    _builder.append(" instance");
    _builder.newLineIfNotEmpty();
    _builder.append("final ");
    String _itfName = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName, "");
    _builder.append(" newClass = ");
    String _eFactoryInterfaceName = this._namingExtensions.getEFactoryInterfaceName(metaClass);
    String _shortName = this._namingExtensions.shortName(_eFactoryInterfaceName);
    _builder.append(_shortName, "");
    _builder.append(".eINSTANCE.create");
    String _name_1 = this._namingExtensions.getName(metaClass);
    _builder.append(_name_1, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    {
      boolean _notEquals = (!Objects.equal(attribute, null));
      if (_notEquals) {
        _builder.append("// ask user for ");
        String _visibleName = this._namingExtensions.getVisibleName(metaClass);
        _builder.append(_visibleName, "");
        _builder.append(" ");
        String _name_2 = attribute.getName();
        _builder.append(_name_2, "");
        _builder.newLineIfNotEmpty();
        {
          EClassifier _eType = attribute.getEType();
          String _instanceClassName = ((EDataType) _eType).getInstanceClassName();
          boolean _matches = _instanceClassName.matches("java.lang.String");
          if (_matches) {
            _builder.append("String new");
            String _name_3 = attribute.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_3);
            _builder.append(_firstUpper, "");
            _builder.append(" = SampleUtil.askString(TITLE, USER_QUESTION, \"\", null);");
            _builder.newLineIfNotEmpty();
            _builder.append("if (new");
            String _name_4 = attribute.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
            _builder.append(_firstUpper_1, "");
            _builder.append(" == null || new");
            String _name_5 = attribute.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_5);
            _builder.append(_firstUpper_2, "");
            _builder.append(".trim().length() == 0) {");
            _builder.newLineIfNotEmpty();
            _builder.append("   ");
            _builder.append("return null;");
            _builder.newLine();
            _builder.append("} else {");
            _builder.newLine();
            _builder.append("   ");
            _builder.append("newClass.set");
            String _name_6 = attribute.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_6);
            _builder.append(_firstUpper_3, "   ");
            _builder.append("(new");
            String _name_7 = attribute.getName();
            String _firstUpper_4 = StringExtensions.toFirstUpper(_name_7);
            _builder.append(_firstUpper_4, "   ");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          } else {
            EClassifier _eType_1 = attribute.getEType();
            final String type = ((EDataType) _eType_1).getInstanceClassName();
            _builder.append(" ");
            _builder.newLineIfNotEmpty();
            String _xifexpression = null;
            boolean _matches_1 = "double".matches(type);
            if (_matches_1) {
              _xifexpression = "Double";
            } else {
              String _xifexpression_1 = null;
              boolean _matches_2 = "int".matches(type);
              if (_matches_2) {
                _xifexpression_1 = "Integer";
              } else {
                _xifexpression_1 = "Object";
              }
              _xifexpression = _xifexpression_1;
            }
            final String typeName = _xifexpression;
            _builder.newLineIfNotEmpty();
            _builder.append("final ");
            String _shortName_1 = this._namingExtensions.shortName("org.eclipse.jface.dialogs.IInputValidator");
            _builder.append(_shortName_1, "");
            _builder.append(" validator = new IInputValidator() {");
            _builder.newLineIfNotEmpty();
            _builder.append("   ");
            _builder.append("public String isValid(final String _newText) {");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("String message = null;");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("try {");
            _builder.newLine();
            _builder.append("         ");
            _builder.append(typeName, "         ");
            _builder.append(".valueOf(_newText);");
            _builder.newLineIfNotEmpty();
            _builder.append("      ");
            _builder.append("} catch(Exception nfe) {");
            _builder.newLine();
            _builder.append("         ");
            _builder.append("message = _newText + \" cannot be cast to ");
            _builder.append(typeName, "         ");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("      ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("      ");
            _builder.append("return message;");
            _builder.newLine();
            _builder.append("   ");
            _builder.append("}");
            _builder.newLine();
            _builder.append("};");
            _builder.newLine();
            _builder.append("final String new");
            String _name_8 = attribute.getName();
            String _firstUpper_5 = StringExtensions.toFirstUpper(_name_8);
            _builder.append(_firstUpper_5, "");
            _builder.append("String = SampleUtil.askString(TITLE, USER_QUESTION, \"\", validator);");
            _builder.newLineIfNotEmpty();
            _builder.append("final ");
            _builder.append(typeName, "");
            _builder.append(" new");
            String _name_9 = attribute.getName();
            String _firstUpper_6 = StringExtensions.toFirstUpper(_name_9);
            _builder.append(_firstUpper_6, "");
            _builder.append(" = ");
            _builder.append(typeName, "");
            _builder.append(".valueOf(new");
            String _name_10 = attribute.getName();
            String _firstUpper_7 = StringExtensions.toFirstUpper(_name_10);
            _builder.append(_firstUpper_7, "");
            _builder.append("String);    ");
            _builder.newLineIfNotEmpty();
            _builder.append("newClass.set");
            String _name_11 = attribute.getName();
            String _firstUpper_8 = StringExtensions.toFirstUpper(_name_11);
            _builder.append(_firstUpper_8, "");
            _builder.append("(new");
            String _name_12 = attribute.getName();
            String _firstUpper_9 = StringExtensions.toFirstUpper(_name_12);
            _builder.append(_firstUpper_9, "");
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * When a MetaClass is aliased we need to put a property with the alias name into the AddContext in order to
   * return the right AddFeature in the FeatureProvider
   */
  public CharSequence generate_addGraphicalRepresentation(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _alias = metaClass.getAlias();
      boolean _notEquals = (!Objects.equal(_alias, null));
      if (_notEquals) {
        CharSequence _overrideHeader = this.overrideHeader();
        _builder.append(_overrideHeader, "");
        _builder.newLineIfNotEmpty();
        _builder.append("protected PictogramElement addGraphicalRepresentation(final IAreaContext context, final Object newObject) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("final AddContext ctx = new AddContext(context, newObject);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("ctx.putProperty(PROPERTY_ALIAS, \"");
        String _alias_1 = metaClass.getAlias();
        _builder.append(_alias_1, "    ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("return getFeatureProvider().addIfPossible(ctx);");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generate_getCreateImageId(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    final Diagram diagram = metaClass.getDiagram();
    _builder.newLineIfNotEmpty();
    {
      String _icon = metaClass.getIcon();
      boolean _notEquals = (!Objects.equal(_icon, null));
      if (_notEquals) {
        CharSequence _overrideHeader = this.overrideHeader();
        _builder.append(_overrideHeader, "");
        _builder.newLineIfNotEmpty();
        _builder.append("public String getCreateImageId() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return ");
        String _imageProviderClassName = this._namingExtensions.getImageProviderClassName(diagram);
        String _shortName = this._namingExtensions.shortName(_imageProviderClassName);
        _builder.append(_shortName, "    ");
        _builder.append(".");
        String _icon_1 = metaClass.getIcon();
        String _imageIdentifier = this._namingExtensions.getImageIdentifier(diagram, _icon_1);
        _builder.append(_imageIdentifier, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
