package org.eclipselabs.spray.generator.graphiti.templates.diagram;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.Connection;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.Shape;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

@SuppressWarnings("all")
public class FeatureProvider extends FileGenerator {
  @Inject
  private NamingExtensions _namingExtensions;
  
  @Inject
  private GenModelHelper _genModelHelper;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((Diagram) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
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
    _builder.append("(IDiagramTypeProvider dtp) {");
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
  
  public StringConcatenation mainFile(final Diagram diagram, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
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
    _builder.append("import org.eclipse.graphiti.features.ILayoutFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IMoveShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IUpdateFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IDeleteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IRemoveFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICustomContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IDeleteContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ILayoutContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IMoveShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IUpdateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IRemoveContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.custom.ICustomFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.DefaultRemoveFeature;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".OwnerPropertyDeleteFeature;");
    _builder.newLineIfNotEmpty();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      boolean _isEmpty = ((List<MetaClass>)Conversions.doWrapArray(_metaClasses)).isEmpty();
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
      }
    }
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends DefaultFeatureProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_additionalFields = this.generate_additionalFields(diagram);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    StringConcatenation _generate_getAddFeature = this.generate_getAddFeature(diagram);
    _builder.append(_generate_getAddFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getCreateFeatures = this.generate_getCreateFeatures(diagram);
    _builder.append(_generate_getCreateFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getCreateConnectionFeatures = this.generate_getCreateConnectionFeatures(diagram);
    _builder.append(_generate_getCreateConnectionFeatures, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getUpdateFeature = this.generate_getUpdateFeature(diagram);
    _builder.append(_generate_getUpdateFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getLayoutFeature = this.generate_getLayoutFeature(diagram);
    _builder.append(_generate_getLayoutFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getRemoveFeature = this.generate_getRemoveFeature(diagram);
    _builder.append(_generate_getRemoveFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getDeleteFeature = this.generate_getDeleteFeature(diagram);
    _builder.append(_generate_getDeleteFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getMoveShapeFeature = this.generate_getMoveShapeFeature(diagram);
    _builder.append(_generate_getMoveShapeFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_additionalFields_1 = this.generate_additionalFields(diagram);
    _builder.append(_generate_additionalFields_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getAddFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IAddFeature getAddFeature(IAddContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// is object for add request a EClass or EReference?");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject object = (EObject) context.getNewObject() ;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String reference = (String)context.getProperty(\"REFERENCE\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("    ");
        _builder.append("if ( object.eClass() == ");
        EClass _type = cls.getType();
        String _ePackageClassName = this._genModelHelper.getEPackageClassName(_type);
        String _shortName = this._namingExtensions.shortName(_ePackageClassName);
        _builder.append(_shortName, "    ");
        _builder.append(".Literals.");
        EClass _type_1 = cls.getType();
        String _literalConstant = this._genModelHelper.getLiteralConstant(_type_1);
        _builder.append(_literalConstant, "    ");
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if ( reference == null ){");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("return new ");
        String _addFeatureClassName = this._namingExtensions.getAddFeatureClassName(cls);
        String _shortName_1 = this._namingExtensions.shortName(_addFeatureClassName);
        _builder.append(_shortName_1, "            ");
        _builder.append("(this);");
        _builder.newLineIfNotEmpty();
        {
          MetaReference[] _references = cls.getReferences();
          final Function1<MetaReference,Boolean> _function = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref) {
                Connection _representedBy = ref.getRepresentedBy();
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_representedBy, null);
                return ((Boolean)_operator_notEquals);
              }
            };
          Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references)), _function);
          for(final MetaReference reference : _filter) {
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("} else if( reference.equals(\"");
            String _name = this._namingExtensions.getName(reference);
            _builder.append(_name, "            ");
            _builder.append("\")){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("return new ");
            String _addReferenceAsConnectionFeatureClassName = this._namingExtensions.getAddReferenceAsConnectionFeatureClassName(reference);
            String _shortName_2 = this._namingExtensions.shortName(_addReferenceAsConnectionFeatureClassName);
            _builder.append(_shortName_2, "                ");
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
        {
          Shape _representedBy = cls.getRepresentedBy();
          if ((_representedBy instanceof Container)) {
            _builder.append("    ");
            Shape _representedBy_1 = cls.getRepresentedBy();
            final Container container = ((Container) _representedBy_1);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter_1 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference_1 : _filter_1) {
                _builder.append("    ");
                _builder.append("if( object instanceof ");
                EReference _target = reference_1.getTarget();
                EClass _eReferenceType = _target.getEReferenceType();
                String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(_eReferenceType);
                String _shortName_3 = this._namingExtensions.shortName(_javaInterfaceName);
                _builder.append(_shortName_3, "    ");
                _builder.append(" ){");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return new ");
                String _addReferenceAsListFeatureClassName = this._namingExtensions.getAddReferenceAsListFeatureClassName(reference_1);
                String _shortName_4 = this._namingExtensions.shortName(_addReferenceAsListFeatureClassName);
                _builder.append(_shortName_4, "        ");
                _builder.append("(this);");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("return super.getAddFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getCreateFeatures(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ICreateFeature[] getCreateFeatures() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new ICreateFeature[] { ");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e) {
            Shape _representedBy = e.getRepresentedBy();
            boolean _operator_not = BooleanExtensions.operator_not((_representedBy instanceof Connection));
            return ((Boolean)_operator_not);
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      boolean hasAnyElements = false;
      for(final MetaClass cls : _filter) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        _builder.append("new ");
        String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(cls);
        String _shortName = this._namingExtensions.shortName(_createFeatureClassName);
        _builder.append(_shortName, "    ");
        _builder.append("(this) ");
        _builder.newLineIfNotEmpty();
        {
          Shape _representedBy = cls.getRepresentedBy();
          if ((_representedBy instanceof Container)) {
            _builder.append("    ");
            Shape _representedBy_1 = cls.getRepresentedBy();
            final Container container = ((Container) _representedBy_1);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter_1 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference : _filter_1) {
                _builder.append("    ");
                EReference _target = reference.getTarget();
                final EReference target = _target;
                _builder.append("  ");
                _builder.newLineIfNotEmpty();
                {
                  EClass _eReferenceType = target.getEReferenceType();
                  boolean _isAbstract = _eReferenceType.isAbstract();
                  boolean _operator_not = BooleanExtensions.operator_not(_isAbstract);
                  if (_operator_not) {
                    _builder.append("    ");
                    _builder.append(", new ");
                    String _createFeatureClassName_1 = this._namingExtensions.getCreateFeatureClassName(reference);
                    String _shortName_1 = this._namingExtensions.shortName(_createFeatureClassName_1);
                    _builder.append(_shortName_1, "    ");
                    _builder.append("(this)");
                    _builder.newLineIfNotEmpty();
                  }
                }
                {
                  EClass _eReferenceType_1 = target.getEReferenceType();
                  List<EClass> _subclasses = MetaModel.getSubclasses(_eReferenceType_1);
                  for(final EClass subclass : _subclasses) {
                    {
                      boolean _isAbstract_1 = subclass.isAbstract();
                      boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract_1);
                      if (_operator_not_1) {
                        _builder.append("    ");
                        _builder.append(", new ");
                        String _createReferenceAsListFeatureClassName = this._namingExtensions.getCreateReferenceAsListFeatureClassName(reference, subclass);
                        String _shortName_2 = this._namingExtensions.shortName(_createReferenceAsListFeatureClassName);
                        _builder.append(_shortName_2, "    ");
                        _builder.append("(this)");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}    ");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getUpdateFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public IUpdateFeature getUpdateFeature(IUpdateContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("//    if (pictogramElement instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (bo == null) return null;");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        {
          Shape _representedBy = cls.getRepresentedBy();
          boolean _operator_not = BooleanExtensions.operator_not((_representedBy instanceof Connection));
          if (_operator_not) {
            _builder.append("        ");
            _builder.append("if ( bo.eClass() == ");
            EClass _type = cls.getType();
            String _ePackageClassName = this._genModelHelper.getEPackageClassName(_type);
            String _shortName = this._namingExtensions.shortName(_ePackageClassName);
            _builder.append(_shortName, "        ");
            _builder.append(".Literals.");
            EClass _type_1 = cls.getType();
            String _literalConstant = this._genModelHelper.getLiteralConstant(_type_1);
            _builder.append(_literalConstant, "        ");
            _builder.append(" ) { // 11");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("return new ");
            String _updateFeatureClassName = this._namingExtensions.getUpdateFeatureClassName(cls);
            String _shortName_1 = this._namingExtensions.shortName(_updateFeatureClassName);
            _builder.append(_shortName_1, "            ");
            _builder.append("(this); ");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("}");
            _builder.newLine();
          }
        }
        {
          Shape _representedBy_1 = cls.getRepresentedBy();
          if ((_representedBy_1 instanceof Container)) {
            _builder.append("        ");
            Shape _representedBy_2 = cls.getRepresentedBy();
            final Container container = ((Container) _representedBy_2);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference : _filter) {
                _builder.append("        ");
                EReference _target = reference.getTarget();
                EClass _eReferenceType = _target.getEReferenceType();
                EClass eClass = _eReferenceType;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                {
                  boolean _isAbstract = eClass.isAbstract();
                  if (_isAbstract) {
                    _builder.append("        ");
                    _builder.append("if (bo instanceof ");
                    String _javaInterfaceName = this._genModelHelper.getJavaInterfaceName(eClass);
                    String _shortName_2 = this._namingExtensions.shortName(_javaInterfaceName);
                    _builder.append(_shortName_2, "        ");
                    _builder.append(") { // 22");
                    _builder.newLineIfNotEmpty();
                    _builder.append("        ");
                    _builder.append("    ");
                    _builder.append("return new ");
                    String _updateReferenceAsListFeatureClassName = this._namingExtensions.getUpdateReferenceAsListFeatureClassName(reference);
                    String _shortName_3 = this._namingExtensions.shortName(_updateReferenceAsListFeatureClassName);
                    _builder.append(_shortName_3, "            ");
                    _builder.append("(this); ");
                    _builder.newLineIfNotEmpty();
                    _builder.append("        ");
                    _builder.append("}");
                    _builder.newLine();
                  }
                }
              }
            }
          } else {
            Shape _representedBy_3 = cls.getRepresentedBy();
            if ((_representedBy_3 instanceof Connection)) {
              _builder.append("        ");
              Shape _representedBy_4 = cls.getRepresentedBy();
              Connection connection = ((Connection) _representedBy_4);
              _builder.newLineIfNotEmpty();
              {
                EClass _type_2 = cls.getType();
                boolean _isAbstract_1 = _type_2.isAbstract();
                boolean _operator_not_1 = BooleanExtensions.operator_not(_isAbstract_1);
                if (_operator_not_1) {
                  _builder.append("        ");
                  _builder.append("    ");
                  _builder.append("if (bo instanceof ");
                  String _javaInterfaceName_1 = this._namingExtensions.getJavaInterfaceName(cls);
                  String _shortName_4 = this._namingExtensions.shortName(_javaInterfaceName_1);
                  _builder.append(_shortName_4, "            ");
                  _builder.append(") { // 33");
                  _builder.newLineIfNotEmpty();
                  _builder.append("        ");
                  _builder.append("    ");
                  _builder.append("    ");
                  _builder.append("return new ");
                  String _updateFeatureClassName_1 = this._namingExtensions.getUpdateFeatureClassName(cls);
                  String _shortName_5 = this._namingExtensions.shortName(_updateFeatureClassName_1);
                  _builder.append(_shortName_5, "                ");
                  _builder.append("(this); ");
                  _builder.newLineIfNotEmpty();
                  _builder.append("        ");
                  _builder.append("    ");
                  _builder.append("}");
                  _builder.newLine();
                }
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
  
  public StringConcatenation generate_getLayoutFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ILayoutFeature getLayoutFeature(ILayoutContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo == null) return null;");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass m) {
            Shape _representedBy = m.getRepresentedBy();
            boolean _operator_not = BooleanExtensions.operator_not((_representedBy instanceof Connection));
            return ((Boolean)_operator_not);
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      for(final MetaClass cls : _filter) {
        _builder.append("    ");
        _builder.append("if ( bo.eClass()==");
        EClass _type = cls.getType();
        String _ePackageClassName = this._genModelHelper.getEPackageClassName(_type);
        String _shortName = this._namingExtensions.shortName(_ePackageClassName);
        _builder.append(_shortName, "    ");
        _builder.append(".Literals.");
        EClass _type_1 = cls.getType();
        String _literalConstant = this._genModelHelper.getLiteralConstant(_type_1);
        _builder.append(_literalConstant, "    ");
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return new ");
        String _layoutFeatureClassName = this._namingExtensions.getLayoutFeatureClassName(cls);
        String _shortName_1 = this._namingExtensions.shortName(_layoutFeatureClassName);
        _builder.append(_shortName_1, "        ");
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
  
  public StringConcatenation generate_getCreateConnectionFeatures(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public ICreateConnectionFeature[] getCreateConnectionFeatures() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new ICreateConnectionFeature[] { ");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e) {
            Shape _representedBy = e.getRepresentedBy();
            return ((Boolean)(_representedBy instanceof Connection));
          }
        };
      Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses)), _function);
      boolean hasAnyElements = false;
      for(final MetaClass cls : _filter) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "    ");
        }
        _builder.append("    ");
        _builder.append("new ");
        String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(cls);
        String _shortName = this._namingExtensions.shortName(_createFeatureClassName);
        _builder.append(_shortName, "    ");
        _builder.append("(this) ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      MetaClass[] _metaClasses_1 = diagram.getMetaClasses();
      final Function1<MetaClass,Boolean> _function_1 = new Function1<MetaClass,Boolean>() {
          public Boolean apply(final MetaClass e) {
            Shape _representedBy = e.getRepresentedBy();
            return ((Boolean)(_representedBy instanceof Connection));
          }
        };
      Iterable<MetaClass> _filter_1 = IterableExtensions.<MetaClass>filter(((Iterable<MetaClass>)Conversions.doWrapArray(_metaClasses_1)), _function_1);
      boolean _isEmpty = IterableExtensions.isEmpty(_filter_1);
      boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
      if (_operator_not) {
        _builder.append("    ");
        _builder.append(",");
        _builder.newLine();
      }
    }
    {
      MetaClass[] _metaClasses_2 = diagram.getMetaClasses();
      for(final MetaClass metaClass : _metaClasses_2) {
        {
          MetaReference[] _references = metaClass.getReferences();
          final Function1<MetaReference,Boolean> _function_2 = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref) {
                Connection _representedBy = ref.getRepresentedBy();
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_representedBy, null);
                return ((Boolean)_operator_notEquals);
              }
            };
          Iterable<MetaReference> _filter_2 = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references)), _function_2);
          boolean hasAnyElements_1 = false;
          for(final MetaReference reference : _filter_2) {
            if (!hasAnyElements_1) {
              hasAnyElements_1 = true;
            } else {
              _builder.appendImmediate(",", "    ");
            }
            _builder.append("    ");
            _builder.append("new ");
            String _createReferenceAsConnectionFeatureClassName = this._namingExtensions.getCreateReferenceAsConnectionFeatureClassName(reference);
            String _shortName_1 = this._namingExtensions.shortName(_createReferenceAsConnectionFeatureClassName);
            _builder.append(_shortName_1, "    ");
            _builder.append("(this) ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("};");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getRemoveFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IRemoveFeature getRemoveFeature(IRemoveContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Spray specific DefaultRemoveFeature");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new DefaultRemoveFeature(this);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getDeleteFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("public IDeleteFeature getDeleteFeature(IDeleteContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (bo == null) return null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("String reference = peService.getPropertyValue(pictogramElement, \"REFERENCE\");");
    _builder.newLine();
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for(final MetaClass cls : _metaClasses) {
        _builder.append("        ");
        _builder.append("if ( bo.eClass()==");
        EClass _type = cls.getType();
        String _ePackageClassName = this._genModelHelper.getEPackageClassName(_type);
        String _shortName = this._namingExtensions.shortName(_ePackageClassName);
        _builder.append(_shortName, "        ");
        _builder.append(".Literals.");
        EClass _type_1 = cls.getType();
        String _literalConstant = this._genModelHelper.getLiteralConstant(_type_1);
        _builder.append(_literalConstant, "        ");
        _builder.append(" ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("if( reference == null ){");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("        ");
        _builder.append("return new DefaultDeleteFeature(this); ");
        _builder.newLine();
        {
          MetaReference[] _references = cls.getReferences();
          final Function1<MetaReference,Boolean> _function = new Function1<MetaReference,Boolean>() {
              public Boolean apply(final MetaReference ref) {
                Connection _representedBy = ref.getRepresentedBy();
                boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_representedBy, null);
                return ((Boolean)_operator_notEquals);
              }
            };
          Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(((Iterable<MetaReference>)Conversions.doWrapArray(_references)), _function);
          for(final MetaReference reference : _filter) {
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("} else if( reference.equals(\"");
            String _name = this._namingExtensions.getName(reference);
            _builder.append(_name, "            ");
            _builder.append("\")){");
            _builder.newLineIfNotEmpty();
            _builder.append("        ");
            _builder.append("    ");
            _builder.append("    ");
            _builder.append("return new ");
            String _deleteReferenceFeatureClassName = this._namingExtensions.getDeleteReferenceFeatureClassName(reference);
            String _shortName_1 = this._namingExtensions.shortName(_deleteReferenceFeatureClassName);
            _builder.append(_shortName_1, "                ");
            _builder.append("(this);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("} ");
        _builder.newLine();
        {
          Shape _representedBy = cls.getRepresentedBy();
          if ((_representedBy instanceof Container)) {
            _builder.append("        ");
            _builder.append("    ");
            Shape _representedBy_1 = cls.getRepresentedBy();
            final Container container = ((Container) _representedBy_1);
            _builder.newLineIfNotEmpty();
            {
              SprayElement[] _parts = container.getParts();
              Iterable<MetaReference> _filter_1 = IterableExtensions.<MetaReference>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_parts)), org.eclipselabs.spray.mm.spray.MetaReference.class);
              for(final MetaReference reference_1 : _filter_1) {
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                EReference _target = reference_1.getTarget();
                final EReference target = _target;
                _builder.append(" ");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("if( bo instanceof ");
                EClass _eReferenceType = target.getEReferenceType();
                String _name_1 = _eReferenceType.getName();
                _builder.append(_name_1, "            ");
                _builder.append(" ){");
                _builder.newLineIfNotEmpty();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("    ");
                _builder.append("return new OwnerPropertyDeleteFeature(this);");
                _builder.newLine();
                _builder.append("        ");
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return new DefaultDeleteFeature(this); ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getMoveShapeFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/** ");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Ensure that any shape with property {@link ISprayConstants#CAN_MOVE} set to false will not have a move feature.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Shape s = context.getShape();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("String stat  = peService.getPropertyValue(s, ISprayConstants.PROPERTY_CAN_MOVE);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if( (stat != null) && (stat.equals(\"false\") )){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return super.getMoveShapeFeature(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getCustomFeatures(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public ICustomFeature[] getCustomFeatures(ICustomContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (bo == null) return new ICustomFeature[0];");
    _builder.newLine();
    {
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for(final MetaClass metaClass : _metaClasses) {
        {
          Behavior[] _behaviors = metaClass.getBehaviors();
          boolean _isEmpty = ((List<Behavior>)Conversions.doWrapArray(_behaviors)).isEmpty();
          boolean _operator_not = BooleanExtensions.operator_not(_isEmpty);
          if (_operator_not) {
            _builder.append("    ");
            _builder.append("if( bo.eClass()==");
            EClass _type = metaClass.getType();
            String _ePackageClassName = this._genModelHelper.getEPackageClassName(_type);
            String _shortName = this._namingExtensions.shortName(_ePackageClassName);
            _builder.append(_shortName, "    ");
            _builder.append(".Literals.");
            EClass _type_1 = metaClass.getType();
            String _literalConstant = this._genModelHelper.getLiteralConstant(_type_1);
            _builder.append(_literalConstant, "    ");
            _builder.append(" ){");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("return new ICustomFeature[]{ ");
            _builder.newLine();
            _builder.append("    ");
            ArrayList<String> _arrayList = new ArrayList<String>();
            final List<String> allnames2 = _arrayList;
            _builder.newLineIfNotEmpty();
            {
              Behavior[] _behaviors_1 = metaClass.getBehaviors();
              Iterable<CustomBehavior> _filter = IterableExtensions.<CustomBehavior>filter(((Iterable<? extends Object>)Conversions.doWrapArray(_behaviors_1)), org.eclipselabs.spray.mm.spray.CustomBehavior.class);
              boolean hasAnyElements = false;
              for(final CustomBehavior behavior : _filter) {
                if (!hasAnyElements) {
                  hasAnyElements = true;
                } else {
                  _builder.appendImmediate(",", "    ");
                }
                {
                  String _name = behavior.getName();
                  boolean _contains = allnames2.contains(_name);
                  boolean _operator_not_1 = BooleanExtensions.operator_not(_contains);
                  if (_operator_not_1) {
                    _builder.append("    ");
                    _builder.append("new ");
                    String _customFeatureClassName = this._namingExtensions.getCustomFeatureClassName(behavior);
                    String _shortName_1 = this._namingExtensions.shortName(_customFeatureClassName);
                    _builder.append(_shortName_1, "    ");
                    _builder.append("(this) /*");
                    String _name_1 = behavior.getName();
                    boolean _add = allnames2.add(_name_1);
                    _builder.append(_add, "    ");
                    _builder.append("*/");
                    _builder.newLineIfNotEmpty();
                  }
                }
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
}
