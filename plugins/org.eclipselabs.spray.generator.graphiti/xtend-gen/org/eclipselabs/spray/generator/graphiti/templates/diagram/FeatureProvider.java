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
package org.eclipselabs.spray.generator.graphiti.templates.diagram;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class FeatureProvider extends FileGenerator<Diagram> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private DiagramExtensions _diagramExtensions;
  
  @Inject
  @Extension
  private MetaClassExtensions _metaClassExtensions;
  
  @Override
  public CharSequence generateBaseFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final Diagram modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final Diagram it, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IAddFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICreateConnectionFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICreateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ICopyFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.ILayoutFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IMoveShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IPasteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IUpdateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IDeleteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IDirectEditingFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IRemoveFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IResizeShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICustomContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICopyContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDeleteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDirectEditingContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ILayoutContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IMoveShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IUpdateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IPasteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IRemoveContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IResizeShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.custom.ICustomFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultRemoveFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".OwnerPropertyDeleteFeature;");
    _builder.newLineIfNotEmpty();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      boolean _isEmpty = _metaClasses.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
      }
    }
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"unused\")");
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends DefaultFeatureProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(it);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generate_getAddFeature = this.generate_getAddFeature(it);
    _builder.append(_generate_getAddFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getCopyFeature = this.generate_getCopyFeature(it);
    _builder.append(_generate_getCopyFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getCreateFeatures = this.generate_getCreateFeatures(it);
    _builder.append(_generate_getCreateFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getCreateConnectionFeatures = this.generate_getCreateConnectionFeatures(it);
    _builder.append(_generate_getCreateConnectionFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getUpdateFeature = this.generate_getUpdateFeature(it);
    _builder.append(_generate_getUpdateFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getLayoutFeature = this.generate_getLayoutFeature(it);
    _builder.append(_generate_getLayoutFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getRemoveFeature = this.generate_getRemoveFeature(it);
    _builder.append(_generate_getRemoveFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getDeleteFeature = this.generate_getDeleteFeature(it);
    _builder.append(_generate_getDeleteFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getMoveShapeFeature = this.generate_getMoveShapeFeature(it);
    _builder.append(_generate_getMoveShapeFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getPasteFeature = this.generate_getPasteFeature(it);
    _builder.append(_generate_getPasteFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getDirectEditingFeatures = this.generate_getDirectEditingFeatures(it);
    _builder.append(_generate_getDirectEditingFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getCustomFeatures = this.generate_getCustomFeatures(it);
    _builder.append(_generate_getCustomFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getResizeFeatures = this.generate_getResizeFeatures(it);
    _builder.append(_generate_getResizeFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(it);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getAddFeature(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IAddFeature getAddFeature(final IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// is object for add request a EClass or EReference?");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = (EObject) context.getNewObject() ;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String reference = (String)context.getProperty(PROPERTY_REFERENCE);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String alias = (String)context.getProperty(PROPERTY_ALIAS);");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("    ");
        _builder.append("if ( ");
        CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(cls);
        _builder.append(_generate_metaClassSwitchCondition, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if ( reference == null ){");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("return new ");
        String _addFeatureClassName = this._namingExtensions.getAddFeatureClassName(cls);
        String _shortName = this._namingExtensions.shortName(_addFeatureClassName);
        _builder.append(_shortName, "            ");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        {
          EList<MetaReference> _references = cls.getReferences();
          final Function1<MetaReference, Boolean> _function = new Function1<MetaReference, Boolean>() {
            @Override
            public Boolean apply(final MetaReference ref) {
              ConnectionInSpray _representedBy = ref.getRepresentedBy();
              return Boolean.valueOf((!Objects.equal(_representedBy, null)));
            }
          };
          Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(_references, _function);
          for(final MetaReference reference : _filter) {
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("} else if( reference.equals(");
            String _literalConstant = this._namingExtensions.getLiteralConstant(reference);
            _builder.append(_literalConstant, "            ");
            _builder.append(".getName())){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("return new ");
            String _addReferenceAsConnectionFeatureClassName = this._namingExtensions.getAddReferenceAsConnectionFeatureClassName(reference);
            String _shortName_1 = this._namingExtensions.shortName(_addReferenceAsConnectionFeatureClassName);
            _builder.append(_shortName_1, "                ");
            _builder.append("(this);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("} ");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return super.getAddFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getCreateFeatures(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ICreateFeature[] getCreateFeatures() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new ICreateFeature[] { ");
    _builder.newLine();
    {
      List<String> _createFeatureClassNames = this.getCreateFeatureClassNames(it);
      boolean _hasElements = false;
      for(final String featureClassName : _createFeatureClassNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        _builder.append("new ");
        _builder.append(featureClassName, "    ");
        _builder.append("(this) ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}    ");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Computes the class names of all Create Features of the diagram.
   */
  private List<String> getCreateFeatureClassNames(final Diagram it) {
    final ArrayList<String> result = new ArrayList<String>();
    Iterable<MetaClass> _metaClassesForShapes = this._diagramExtensions.getMetaClassesForShapes(it);
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass mc) {
        return Boolean.valueOf(FeatureProvider.this._metaClassExtensions.hasCreateBehavior(mc));
      }
    };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClassesForShapes, _function);
    for (final MetaClass mc : _filter) {
      String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(mc);
      String _shortName = this._namingExtensions.shortName(_createFeatureClassName);
      result.add(_shortName);
    }
    return result;
  }
  
  public CharSequence generate_getUpdateFeature(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public IUpdateFeature getUpdateFeature(final IUpdateContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String alias ;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if( pictogramElement  instanceof Shape ){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("Shape dslShape = SprayLayoutService.findDslShape(pictogramElement );");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("alias = peService.getPropertyValue(dslShape,PROPERTY_ALIAS);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//    if (pictogramElement instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (bo == null) {");
    _builder.newLine();
    _builder.append("            \t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        {
          ShapeInSpray _representedBy = cls.getRepresentedBy();
          if ((!(_representedBy instanceof ConnectionInSpray))) {
            _builder.append("        ");
            _builder.append("if ( ");
            CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(cls);
            _builder.append(_generate_metaClassSwitchCondition, "        ");
            _builder.append(") { // 11");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("return new ");
            String _updateFeatureClassName = this._namingExtensions.getUpdateFeatureClassName(cls);
            String _shortName = this._namingExtensions.shortName(_updateFeatureClassName);
            _builder.append(_shortName, "            ");
            _builder.append("(this); ");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("}");
            _builder.newLine();
          }
        }
        {
          ShapeInSpray _representedBy_1 = cls.getRepresentedBy();
          if ((_representedBy_1 instanceof ConnectionInSpray)) {
            {
              EClass _type = cls.getType();
              boolean _isAbstract = _type.isAbstract();
              boolean _not = (!_isAbstract);
              if (_not) {
                _builder.append("        ");
                _builder.append("if (bo instanceof ");
                String _itfName = this._namingExtensions.getItfName(cls);
                _builder.append(_itfName, "        ");
                _builder.append(" && ");
                {
                  String _alias = cls.getAlias();
                  boolean _equals = Objects.equal(_alias, null);
                  if (_equals) {
                    _builder.append("alias==null");
                  } else {
                    _builder.append("\"");
                    String _alias_1 = cls.getAlias();
                    _builder.append(_alias_1, "        ");
                    _builder.append("\".equals(alias)");
                  }
                }
                _builder.append(") { // 33");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("return new ");
                String _updateFeatureClassName_1 = this._namingExtensions.getUpdateFeatureClassName(cls);
                String _shortName_1 = this._namingExtensions.shortName(_updateFeatureClassName_1);
                _builder.append(_shortName_1, "            ");
                _builder.append("(this); ");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("//        }");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return super.getUpdateFeature(context);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getLayoutFeature(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ILayoutFeature getLayoutFeature(final ILayoutContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo == null) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
        @Override
        public Boolean apply(final MetaClass m) {
          ShapeInSpray _representedBy = m.getRepresentedBy();
          return Boolean.valueOf((!(_representedBy instanceof ConnectionInSpray)));
        }
      };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
      for(final MetaClass cls : _filter) {
        _builder.append("    ");
        _builder.append("if ( ");
        CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(cls);
        _builder.append(_generate_metaClassSwitchCondition, "    ");
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return new ");
        String _layoutFeatureClassName = this._namingExtensions.getLayoutFeatureClassName(cls);
        String _shortName = this._namingExtensions.shortName(_layoutFeatureClassName);
        _builder.append(_shortName, "        ");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return super.getLayoutFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getCreateConnectionFeatures(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ICreateConnectionFeature[] getCreateConnectionFeatures() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new ICreateConnectionFeature[] {");
    _builder.newLine();
    _builder.append("        ");
    Iterable<MetaClass> _metaclassesRepresentedByConnections = this.getMetaclassesRepresentedByConnections(it);
    Iterable<MetaReference> _metaReferencesRepresentedByConnections = this.getMetaReferencesRepresentedByConnections(it);
    CharSequence _handleConnections = this.handleConnections(_metaclassesRepresentedByConnections, _metaReferencesRepresentedByConnections);
    _builder.append(_handleConnections, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence handleConnections(final Iterable<MetaClass> metaclassesRepresentedByConnections, final Iterable<MetaReference> metaReferencesRepresentedByConnections) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _size = IterableExtensions.size(metaclassesRepresentedByConnections);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        MetaClass _head = IterableExtensions.<MetaClass>head(metaclassesRepresentedByConnections);
        CharSequence _newCreateConnection = this.newCreateConnection(_head);
        _builder.append(_newCreateConnection, "");
        _builder.newLineIfNotEmpty();
        {
          Iterable<MetaClass> _tail = IterableExtensions.<MetaClass>tail(metaclassesRepresentedByConnections);
          boolean _hasElements = false;
          for(final MetaClass cls : _tail) {
            if (!_hasElements) {
              _hasElements = true;
              _builder.append(", ", "");
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _newCreateConnection_1 = this.newCreateConnection(cls);
            _builder.append(_newCreateConnection_1, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _and = false;
      boolean _isEmpty = IterableExtensions.isEmpty(metaclassesRepresentedByConnections);
      boolean _not = (!_isEmpty);
      if (!_not) {
        _and = false;
      } else {
        boolean _isEmpty_1 = IterableExtensions.isEmpty(metaReferencesRepresentedByConnections);
        boolean _not_1 = (!_isEmpty_1);
        _and = _not_1;
      }
      if (_and) {
        _builder.append(", ");
        _builder.newLine();
      }
    }
    {
      int _size_1 = IterableExtensions.size(metaReferencesRepresentedByConnections);
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        MetaReference _head_1 = IterableExtensions.<MetaReference>head(metaReferencesRepresentedByConnections);
        CharSequence _newCreateConnection_2 = this.newCreateConnection(_head_1);
        _builder.append(_newCreateConnection_2, "");
        _builder.newLineIfNotEmpty();
        {
          Iterable<MetaReference> _tail_1 = IterableExtensions.<MetaReference>tail(metaReferencesRepresentedByConnections);
          boolean _hasElements_1 = false;
          for(final MetaReference reference : _tail_1) {
            if (!_hasElements_1) {
              _hasElements_1 = true;
              _builder.append(", ", "");
            } else {
              _builder.appendImmediate(",", "");
            }
            CharSequence _newCreateConnection_3 = this.newCreateConnection(reference);
            _builder.append(_newCreateConnection_3, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence newCreateConnection(final MetaClass it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(it);
    String _shortName = this._namingExtensions.shortName(_createFeatureClassName);
    _builder.append(_shortName, "");
    _builder.append("(this)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence newCreateConnection(final MetaReference it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("new ");
    String _createReferenceAsConnectionFeatureClassName = this._namingExtensions.getCreateReferenceAsConnectionFeatureClassName(it);
    String _shortName = this._namingExtensions.shortName(_createReferenceAsConnectionFeatureClassName);
    _builder.append(_shortName, "");
    _builder.append("(this)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  /**
   * @return The metaclasses in the diagram that are represented as connection and which have a create behavior
   */
  public Iterable<MetaClass> getMetaclassesRepresentedByConnections(final Diagram diagram) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass it) {
        boolean _and = false;
        ShapeInSpray _representedBy = it.getRepresentedBy();
        if (!(_representedBy instanceof ConnectionInSpray)) {
          _and = false;
        } else {
          boolean _hasCreateBehavior = FeatureProvider.this._metaClassExtensions.hasCreateBehavior(it);
          _and = _hasCreateBehavior;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<MetaClass>filter(_metaClasses, _function);
  }
  
  public Iterable<MetaReference> getMetaReferencesRepresentedByConnections(final Diagram diagram) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Iterable<MetaReference>> _function = new Function1<MetaClass, Iterable<MetaReference>>() {
      @Override
      public Iterable<MetaReference> apply(final MetaClass it) {
        EList<MetaReference> _references = it.getReferences();
        final Function1<MetaReference, Boolean> _function = new Function1<MetaReference, Boolean>() {
          @Override
          public Boolean apply(final MetaReference it) {
            ConnectionInSpray _representedBy = it.getRepresentedBy();
            return Boolean.valueOf((!Objects.equal(_representedBy, null)));
          }
        };
        return IterableExtensions.<MetaReference>filter(_references, _function);
      }
    };
    List<Iterable<MetaReference>> _map = ListExtensions.<MetaClass, Iterable<MetaReference>>map(_metaClasses, _function);
    return Iterables.<MetaReference>concat(_map);
  }
  
  public CharSequence generate_getRemoveFeature(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IRemoveFeature getRemoveFeature(final IRemoveContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Spray specific DefaultRemoveFeature");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new DefaultRemoveFeature(this);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getDeleteFeature(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public IDeleteFeature getDeleteFeature(final IDeleteContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo == null) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String reference = peService.getPropertyValue(pictogramElement, PROPERTY_REFERENCE);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);");
    _builder.newLine();
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("    ");
        _builder.append("if ( ");
        CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(cls);
        _builder.append(_generate_metaClassSwitchCondition, "    ");
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if( reference == null ){");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("return new DefaultDeleteFeature(this); ");
        _builder.newLine();
        {
          EList<MetaReference> _references = cls.getReferences();
          final Function1<MetaReference, Boolean> _function = new Function1<MetaReference, Boolean>() {
            @Override
            public Boolean apply(final MetaReference it) {
              ConnectionInSpray _representedBy = it.getRepresentedBy();
              return Boolean.valueOf((!Objects.equal(_representedBy, null)));
            }
          };
          Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(_references, _function);
          for(final MetaReference reference : _filter) {
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("} else if( reference.equals(");
            String _literalConstant = this._namingExtensions.getLiteralConstant(reference);
            _builder.append(_literalConstant, "        ");
            _builder.append(".getName())){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return new ");
            String _deleteReferenceFeatureClassName = this._namingExtensions.getDeleteReferenceFeatureClassName(reference);
            String _shortName = this._namingExtensions.shortName(_deleteReferenceFeatureClassName);
            _builder.append(_shortName, "            ");
            _builder.append("(this);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("} ");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new DefaultDeleteFeature(this); ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getMoveShapeFeature(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/** ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Ensure that any shape with property {@link ISprayConstants#CAN_MOVE} set to false will not have a move feature.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IMoveShapeFeature getMoveShapeFeature(final IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final Shape shape = context.getShape();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final ContainerShape parent = shape.getContainer();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject eObject = getBusinessObjectForPictogramElement(shape);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject target = getBusinessObjectForPictogramElement(targetContainer);");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
        @Override
        public Boolean apply(final MetaClass it) {
          ShapeInSpray _representedBy = it.getRepresentedBy();
          return Boolean.valueOf((_representedBy instanceof ShapeFromDsl));
        }
      };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
      for(final MetaClass cls : _filter) {
        _builder.append("    ");
        _builder.append("if( eObject instanceof ");
        String _itfName = this._namingExtensions.getItfName(cls);
        _builder.append(_itfName, "    ");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return new  ");
        String _moveFeatureClassName = this._namingExtensions.getMoveFeatureClassName(cls);
        _builder.append(_moveFeatureClassName, "        ");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return super.getMoveShapeFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getCustomFeatures(final Diagram it) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ICustomFeature[] getCustomFeatures(final ICustomContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo == null) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("return new ICustomFeature[0];");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final String alias = GraphitiProperties.get(context.getPictogramElements()[0], PROPERTY_ALIAS);");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = it.getMetaClasses();
      for(final MetaClass metaClass : _metaClasses) {
        _builder.append("    ");
        final Set<String> featureClasses = this._metaClassExtensions.getCustomFeatureClassNames(metaClass);
        _builder.newLineIfNotEmpty();
        {
          boolean _isEmpty = featureClasses.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("    ");
            _builder.append("if(");
            CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(metaClass);
            _builder.append(_generate_metaClassSwitchCondition, "    ");
            _builder.append("){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("return new ICustomFeature[]{ ");
            _builder.newLine();
            {
              boolean _hasElements = false;
              for(final String featureClass : featureClasses) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(",", "    ");
                }
                _builder.append("    ");
                _builder.append("new ");
                String _shortName = this._namingExtensions.shortName(featureClass);
                _builder.append(_shortName, "    ");
                _builder.append("(this)");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("    ");
            _builder.append("};");
            _builder.newLine();
            _builder.append("    ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("return new ICustomFeature[0];");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getDirectEditingFeatures(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo == null) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (SprayLayoutService.isCompartment(pictogramElement)) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null; ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String alias = null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (pictogramElement instanceof Shape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Shape dslShape = SprayLayoutService.findDslShape(pictogramElement );");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("alias = peService.getPropertyValue(dslShape,PROPERTY_ALIAS);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = diagram.getMetaClasses();
      for(final MetaClass metaClass : _metaClasses) {
        _builder.append("\t");
        _builder.append("if ( ");
        CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(metaClass);
        _builder.append(_generate_metaClassSwitchCondition, "\t");
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return new ");
        String _directEditFeatureClassName = this._namingExtensions.getDirectEditFeatureClassName(metaClass);
        String _shortName = this._namingExtensions.shortName(_directEditFeatureClassName);
        _builder.append(_shortName, "\t\t");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return super.getDirectEditingFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getCopyFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ICopyFeature getCopyFeature(ICopyContext context) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return new ");
    String _copyFeatureClassName = this._namingExtensions.getCopyFeatureClassName(diagram);
    String _shortName = this._namingExtensions.shortName(_copyFeatureClassName);
    _builder.append(_shortName, "\t");
    _builder.append("(this);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getPasteFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IPasteFeature getPasteFeature(IPasteContext context) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return new ");
    String _pasteFeatureClassName = this._namingExtensions.getPasteFeatureClassName(diagram);
    String _shortName = this._namingExtensions.shortName(_pasteFeatureClassName);
    _builder.append(_shortName, "\t");
    _builder.append("(this);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getResizeFeatures(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public IResizeShapeFeature getResizeShapeFeature (IResizeShapeContext context) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (bo == null) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final String alias = peService.getPropertyValue(pictogramElement, PROPERTY_ALIAS);");
    _builder.newLine();
    {
      EList<MetaClass> _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
        @Override
        public Boolean apply(final MetaClass m) {
          ShapeInSpray _representedBy = m.getRepresentedBy();
          return Boolean.valueOf((_representedBy instanceof ShapeFromDsl));
        }
      };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
      for(final MetaClass crs : _filter) {
        _builder.append("\t\t");
        _builder.append("if(");
        CharSequence _generate_metaClassSwitchCondition = this.generate_metaClassSwitchCondition(crs);
        _builder.append(_generate_metaClassSwitchCondition, "\t\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("return new ");
        String _resizeFeatureClassName = this._namingExtensions.getResizeFeatureClassName(crs);
        String _shortName = this._namingExtensions.shortName(_resizeFeatureClassName);
        _builder.append(_shortName, "\t\t\t");
        _builder.append("(this);    ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return super.getResizeShapeFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Produces the condition used in the if-cascaded to switch for the specific features for an EObject
   * bo.eClass()==BusinessDomainDslPackage.Literals.ASSOCIATION && "Assoc1".equals(alias)
   */
  public CharSequence generate_metaClassSwitchCondition(final MetaClass cls) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("bo.eClass()==");
    EClass _type = cls.getType();
    String _literalConstant = this._namingExtensions.getLiteralConstant(_type);
    _builder.append(_literalConstant, "");
    _builder.append(" && ");
    {
      String _alias = cls.getAlias();
      boolean _equals = Objects.equal(_alias, null);
      if (_equals) {
        _builder.append("alias==null");
      } else {
        _builder.append("\"");
        String _alias_1 = cls.getAlias();
        _builder.append(_alias_1, "");
        _builder.append("\".equals(alias)");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
