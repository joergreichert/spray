package org.eclipselabs.spray.generator.graphiti.templates.diagram;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;

@SuppressWarnings("all")
public class ToolBehaviorProvider extends FileGenerator {
  @Inject
  private NamingExtensions _namingExtensions;
  
  public CharSequence generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    CharSequence _mainFile = this.mainFile(((Diagram) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public CharSequence generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    CharSequence _mainExtensionPointFile = this.mainExtensionPointFile(((Diagram) modelElement), _className);
    return _mainExtensionPointFile;
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
    _builder.append(" ");
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
    _builder.append("(IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
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
    String _diagram_package = GeneratorUtil.diagram_package();
    _builder.append(_diagram_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.dt.IDiagramTypeProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.tb.AbstractSprayToolBehaviorProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.google.common.collect.Lists;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractSprayToolBehaviorProvider {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_compartmentConstants = this.generate_compartmentConstants(diagram);
    _builder.append(_generate_compartmentConstants, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalFields = this.generate_additionalFields(diagram);
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
    CharSequence _generate_buildCreationTools = this.generate_buildCreationTools(diagram);
    _builder.append(_generate_buildCreationTools, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_buildPaletteCompartments = this.generate_buildPaletteCompartments(diagram);
    _builder.append(_generate_buildPaletteCompartments, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getPaletteCompartmentForFeature = this.generate_getPaletteCompartmentForFeature(diagram);
    _builder.append(_generate_getPaletteCompartmentForFeature, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(diagram);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public List<CreateBehavior> getAllCreateBehaviors(final Diagram diagram) {
    List<CreateBehavior> _eAllOfType = EcoreUtil2.<CreateBehavior>eAllOfType(diagram, org.eclipselabs.spray.mm.spray.CreateBehavior.class);
    return _eAllOfType;
  }
  
  public HashSet<String> getPaletteCompartmentNames(final Diagram diagram) {
    HashSet<String> _xblockexpression = null;
    {
      HashSet<String> _hashSet = new HashSet<String>();
      final HashSet<String> result = _hashSet;
      List<CreateBehavior> _allCreateBehaviors = this.getAllCreateBehaviors(diagram);
      final Function1<CreateBehavior,Boolean> _function = new Function1<CreateBehavior,Boolean>() {
          public Boolean apply(final CreateBehavior b) {
            String _paletteCompartment = b.getPaletteCompartment();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_paletteCompartment, null);
            return Boolean.valueOf(_operator_notEquals);
          }
        };
      Iterable<CreateBehavior> _filter = IterableExtensions.<CreateBehavior>filter(_allCreateBehaviors, _function);
      for (final CreateBehavior behavior : _filter) {
        String _paletteCompartment = behavior.getPaletteCompartment();
        CollectionExtensions.<String>operator_add(result, _paletteCompartment);
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public CharSequence generate_compartmentConstants(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    {
      HashSet<String> _paletteCompartmentNames = this.getPaletteCompartmentNames(diagram);
      for(final String compartmentName : _paletteCompartmentNames) {
        _builder.append("protected static final String COMPARTMENT_");
        String _upperCase = compartmentName.toUpperCase();
        _builder.append(_upperCase, "");
        _builder.append(" = \"");
        _builder.append(compartmentName, "");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generate_buildCreationTools(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("protected void buildCreationTools() {");
    _builder.newLine();
    {
      Iterable<String> _allCreateFeatureNames = this.getAllCreateFeatureNames(diagram);
      for(final String featureName : _allCreateFeatureNames) {
        _builder.append("    ");
        _builder.append("buildCreationTool(new ");
        _builder.append(featureName, "    ");
        _builder.append("(this.getFeatureProvider()));");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("// Compartments");
    _builder.newLine();
    {
      ArrayList<MetaReference> _listReferences = this.getListReferences(diagram);
      Set<MetaReference> _set = IterableExtensions.<MetaReference>toSet(_listReferences);
      for(final MetaReference reference : _set) {
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
            _builder.append("buildCreationTool(new ");
            String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(reference);
            String _shortName = this._namingExtensions.shortName(_createFeatureClassName);
            _builder.append(_shortName, "    ");
            _builder.append("(this.getFeatureProvider()));");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          EClass _eReferenceType_1 = target.getEReferenceType();
          List<EClass> _subclasses = MetaModel.getSubclasses(_eReferenceType_1);
          final Function1<EClass,Boolean> _function = new Function1<EClass,Boolean>() {
              public Boolean apply(final EClass c) {
                boolean _isAbstract = c.isAbstract();
                boolean _operator_not = BooleanExtensions.operator_not(_isAbstract);
                return Boolean.valueOf(_operator_not);
              }
            };
          Iterable<EClass> _filter = IterableExtensions.<EClass>filter(_subclasses, _function);
          for(final EClass subclass : _filter) {
            _builder.append("    ");
            _builder.append("buildCreationTool(new ");
            String _createReferenceAsListFeatureClassName = this._namingExtensions.getCreateReferenceAsListFeatureClassName(reference, subclass);
            String _shortName_1 = this._namingExtensions.shortName(_createReferenceAsListFeatureClassName);
            _builder.append(_shortName_1, "    ");
            _builder.append("(this.getFeatureProvider()));");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public Iterable<String> getAllCreateFeatureNames(final Diagram diagram) {
    ArrayList<String> _xblockexpression = null;
    {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final ArrayList<String> result = _arrayList;
      List<CreateBehavior> _allCreateBehaviors = this.getAllCreateBehaviors(diagram);
      final Function1<CreateBehavior,String> _function = new Function1<CreateBehavior,String>() {
          public String apply(final CreateBehavior b) {
            String _createFeatureClassName = ToolBehaviorProvider.this.getCreateFeatureClassName(b);
            return _createFeatureClassName;
          }
        };
      List<String> _map = ListExtensions.<CreateBehavior, String>map(_allCreateBehaviors, _function);
      CollectionExtensions.<String>operator_add(result, _map);
      ArrayList<MetaReference> _connectionReferences = this.getConnectionReferences(diagram);
      for (final MetaReference ref : _connectionReferences) {
        String _createReferenceAsConnectionFeatureClassName = this._namingExtensions.getCreateReferenceAsConnectionFeatureClassName(ref);
        String _shortName = this._namingExtensions.shortName(_createReferenceAsConnectionFeatureClassName);
        CollectionExtensions.<String>operator_add(result, _shortName);
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public CharSequence generate_buildPaletteCompartments(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("protected Iterable<IPaletteCompartmentEntry> buildPaletteCompartments() {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return Lists.newArrayList(");
    _builder.newLine();
    {
      HashSet<String> _paletteCompartmentNames = this.getPaletteCompartmentNames(diagram);
      boolean _hasElements = false;
      for(final String compartmentName : _paletteCompartmentNames) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "        ");
        }
        _builder.append("        ");
        _builder.append("getPaletteCompartment(COMPARTMENT_");
        String _upperCase = compartmentName.toUpperCase();
        _builder.append(_upperCase, "        ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    {
      HashSet<String> _paletteCompartmentNames_1 = this.getPaletteCompartmentNames(diagram);
      int _size = _paletteCompartmentNames_1.size();
      boolean _operator_greaterThan = IntegerExtensions.operator_greaterThan(_size, 0);
      if (_operator_greaterThan) {
        _builder.append(",");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("getPaletteCompartment(COMPARTMENT_DEFAULT)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getPaletteCompartmentForFeature(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("protected IPaletteCompartmentEntry getPaletteCompartmentForFeature(IFeature feature) {");
    _builder.newLine();
    {
      List<CreateBehavior> _allCreateBehaviors = this.getAllCreateBehaviors(diagram);
      final Function1<CreateBehavior,Boolean> _function = new Function1<CreateBehavior,Boolean>() {
          public Boolean apply(final CreateBehavior b) {
            String _paletteCompartment = b.getPaletteCompartment();
            boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_paletteCompartment, null);
            return Boolean.valueOf(_operator_notEquals);
          }
        };
      Iterable<CreateBehavior> _filter = IterableExtensions.<CreateBehavior>filter(_allCreateBehaviors, _function);
      boolean _hasElements = false;
      for(final CreateBehavior behavior : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("else", "    ");
        }
        _builder.append("    ");
        _builder.append("if (feature instanceof ");
        String _createFeatureClassName = this.getCreateFeatureClassName(behavior);
        _builder.append(_createFeatureClassName, "    ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("return getPaletteCompartment(COMPARTMENT_");
        String _paletteCompartment = behavior.getPaletteCompartment();
        String _upperCase = _paletteCompartment.toUpperCase();
        _builder.append(_upperCase, "        ");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("return super.getPaletteCompartmentForFeature(feature);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String getCreateFeatureClassName(final CreateBehavior behavior) {
    String _xblockexpression = null;
    {
      MetaClass _containerOfType = EcoreUtil2.<MetaClass>getContainerOfType(behavior, org.eclipselabs.spray.mm.spray.MetaClass.class);
      final MetaClass mc = _containerOfType;
      String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(mc);
      String _shortName = this._namingExtensions.shortName(_createFeatureClassName);
      _xblockexpression = (_shortName);
    }
    return _xblockexpression;
  }
  
  public ArrayList<MetaReference> getConnectionReferences(final Diagram diagram) {
    ArrayList<MetaReference> _xblockexpression = null;
    {
      ArrayList<MetaReference> _arrayList = new ArrayList<MetaReference>();
      final ArrayList<MetaReference> result = _arrayList;
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for (final MetaClass mc : _metaClasses) {
        MetaReference[] _references = mc.getReferences();
        CollectionExtensions.<MetaReference>operator_add(result, ((Iterable<? extends MetaReference>)Conversions.doWrapArray(_references)));
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public ArrayList<MetaReference> getListReferences(final Diagram diagram) {
    ArrayList<MetaReference> _xblockexpression = null;
    {
      ArrayList<MetaReference> _arrayList = new ArrayList<MetaReference>();
      final ArrayList<MetaReference> result = _arrayList;
      MetaClass[] _metaClasses = diagram.getMetaClasses();
      for (final MetaClass mc : _metaClasses) {
        List<MetaReference> _eAllOfType = EcoreUtil2.<MetaReference>eAllOfType(mc, org.eclipselabs.spray.mm.spray.MetaReference.class);
        final Function1<MetaReference,Boolean> _function = new Function1<MetaReference,Boolean>() {
            public Boolean apply(final MetaReference mr) {
              boolean _isListReference = ToolBehaviorProvider.this.isListReference(mr);
              return Boolean.valueOf(_isListReference);
            }
          };
        Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(_eAllOfType, _function);
        CollectionExtensions.<MetaReference>operator_add(result, _filter);
      }
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public boolean isListReference(final MetaReference ref) {
    EObject _eContainer = ref.eContainer();
    EClass _eClass = _eContainer.eClass();
    EClass _metaClass = SprayPackage.eINSTANCE.getMetaClass();
    boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_eClass, _metaClass);
    return _operator_notEquals;
  }
}
