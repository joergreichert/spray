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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.common.StringHelpers;
import org.eclipselabs.spray.generator.graphiti.util.MetaModel;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class ToolBehaviorProvider extends FileGenerator<Diagram> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
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
    _builder.append("(final IDiagramTypeProvider dtp) {");
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
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.tb.AbstractSprayToolBehaviorProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
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
    _builder.append("(final IDiagramTypeProvider dtp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(dtp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generate_getSelectionBorder = this.generate_getSelectionBorder(diagram);
    _builder.append(_generate_getSelectionBorder, "\t");
    _builder.newLineIfNotEmpty();
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
  
  public CharSequence generate_getSelectionBorder(final Diagram diagram) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    \t");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    \t");
    _builder.newLineIfNotEmpty();
    _builder.append("public GraphicsAlgorithm getSelectionBorder(PictogramElement pe) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("boolean isFromDsl = SprayLayoutService.isShapeFromDsl(pe);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if (isFromDsl) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape container = (ContainerShape)pe;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!container.getChildren().isEmpty()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return container.getChildren().get(0).getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return super.getSelectionBorder(pe);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public List<CreateBehavior> getAllCreateBehaviors(final Diagram diagram) {
    return EcoreUtil2.<CreateBehavior>eAllOfType(diagram, CreateBehavior.class);
  }
  
  public HashSet<String> getPaletteCompartmentNames(final Diagram diagram) {
    HashSet<String> _xblockexpression = null;
    {
      final HashSet<String> result = new HashSet<String>();
      List<CreateBehavior> _allCreateBehaviors = this.getAllCreateBehaviors(diagram);
      final Function1<CreateBehavior, Boolean> _function = new Function1<CreateBehavior, Boolean>() {
        @Override
        public Boolean apply(final CreateBehavior b) {
          String _paletteCompartment = b.getPaletteCompartment();
          return Boolean.valueOf((!Objects.equal(_paletteCompartment, null)));
        }
      };
      Iterable<CreateBehavior> _filter = IterableExtensions.<CreateBehavior>filter(_allCreateBehaviors, _function);
      for (final CreateBehavior behavior : _filter) {
        String _paletteCompartment = behavior.getPaletteCompartment();
        result.add(_paletteCompartment);
      }
      _xblockexpression = result;
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
        String _javaIdentifier = StringHelpers.toJavaIdentifier(_upperCase);
        _builder.append(_javaIdentifier, "");
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
        final EReference target = reference.getTarget();
        _builder.append("  ");
        _builder.newLineIfNotEmpty();
        {
          EClass _eReferenceType = target.getEReferenceType();
          boolean _isAbstract = _eReferenceType.isAbstract();
          boolean _not = (!_isAbstract);
          if (_not) {
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
          final Function1<EClass, Boolean> _function = new Function1<EClass, Boolean>() {
            @Override
            public Boolean apply(final EClass c) {
              boolean _isAbstract = c.isAbstract();
              return Boolean.valueOf((!_isAbstract));
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
      final ArrayList<String> result = new ArrayList<String>();
      List<CreateBehavior> _allCreateBehaviors = this.getAllCreateBehaviors(diagram);
      final Function1<CreateBehavior, String> _function = new Function1<CreateBehavior, String>() {
        @Override
        public String apply(final CreateBehavior b) {
          return ToolBehaviorProvider.this.getCreateFeatureClassName(b);
        }
      };
      List<String> _map = ListExtensions.<CreateBehavior, String>map(_allCreateBehaviors, _function);
      Iterables.<String>addAll(result, _map);
      ArrayList<MetaReference> _connectionReferences = this.getConnectionReferences(diagram);
      for (final MetaReference ref : _connectionReferences) {
        String _createReferenceAsConnectionFeatureClassName = this._namingExtensions.getCreateReferenceAsConnectionFeatureClassName(ref);
        String _shortName = this._namingExtensions.shortName(_createReferenceAsConnectionFeatureClassName);
        result.add(_shortName);
      }
      _xblockexpression = result;
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
        String _javaIdentifier = StringHelpers.toJavaIdentifier(_upperCase);
        _builder.append(_javaIdentifier, "        ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    {
      HashSet<String> _paletteCompartmentNames_1 = this.getPaletteCompartmentNames(diagram);
      int _size = _paletteCompartmentNames_1.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
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
    _builder.append("protected IPaletteCompartmentEntry getPaletteCompartmentForFeature(final IFeature feature) {");
    _builder.newLine();
    {
      List<CreateBehavior> _allCreateBehaviors = this.getAllCreateBehaviors(diagram);
      final Function1<CreateBehavior, Boolean> _function = new Function1<CreateBehavior, Boolean>() {
        @Override
        public Boolean apply(final CreateBehavior b) {
          String _paletteCompartment = b.getPaletteCompartment();
          return Boolean.valueOf((!Objects.equal(_paletteCompartment, null)));
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
        String _javaIdentifier = StringHelpers.toJavaIdentifier(_upperCase);
        _builder.append(_javaIdentifier, "        ");
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
      final MetaClass mc = EcoreUtil2.<MetaClass>getContainerOfType(behavior, MetaClass.class);
      String _createFeatureClassName = this._namingExtensions.getCreateFeatureClassName(mc);
      _xblockexpression = this._namingExtensions.shortName(_createFeatureClassName);
    }
    return _xblockexpression;
  }
  
  public ArrayList<MetaReference> getConnectionReferences(final Diagram diagram) {
    ArrayList<MetaReference> _xblockexpression = null;
    {
      final ArrayList<MetaReference> result = new ArrayList<MetaReference>();
      EList<MetaClass> _metaClasses = diagram.getMetaClasses();
      for (final MetaClass mc : _metaClasses) {
        EList<MetaReference> _references = mc.getReferences();
        Iterables.<MetaReference>addAll(result, _references);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public ArrayList<MetaReference> getListReferences(final Diagram diagram) {
    ArrayList<MetaReference> _xblockexpression = null;
    {
      final ArrayList<MetaReference> result = new ArrayList<MetaReference>();
      EList<MetaClass> _metaClasses = diagram.getMetaClasses();
      for (final MetaClass mc : _metaClasses) {
        List<MetaReference> _eAllOfType = EcoreUtil2.<MetaReference>eAllOfType(mc, MetaReference.class);
        final Function1<MetaReference, Boolean> _function = new Function1<MetaReference, Boolean>() {
          @Override
          public Boolean apply(final MetaReference mr) {
            return Boolean.valueOf(ToolBehaviorProvider.this.isListReference(mr));
          }
        };
        Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(_eAllOfType, _function);
        Iterables.<MetaReference>addAll(result, _filter);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public boolean isListReference(final MetaReference ref) {
    EObject _eContainer = ref.eContainer();
    EClass _eClass = _eContainer.eClass();
    EClass _metaClass = SprayPackage.eINSTANCE.getMetaClass();
    return (!Objects.equal(_eClass, _metaClass));
  }
}
