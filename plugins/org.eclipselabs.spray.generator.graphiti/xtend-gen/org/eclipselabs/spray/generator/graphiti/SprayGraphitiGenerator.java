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
package org.eclipselabs.spray.generator.graphiti;

import com.google.common.base.Objects;
import com.google.inject.Provider;
import javax.inject.Inject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.generator.graphiti.templates.ExecutableExtensionFactory;
import org.eclipselabs.spray.generator.graphiti.templates.Filter;
import org.eclipselabs.spray.generator.graphiti.templates.GuiceModule;
import org.eclipselabs.spray.generator.graphiti.templates.Plugin;
import org.eclipselabs.spray.generator.graphiti.templates.PluginActivator;
import org.eclipselabs.spray.generator.graphiti.templates.PropertySection;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.DiagramTypeProvider;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.FeatureProvider;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ImageProvider;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ModelService;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.ToolBehaviorProvider;
import org.eclipselabs.spray.generator.graphiti.templates.features.AddConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.AddConnectionFromDslFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.AddReferenceAsConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.AddShapeFromDslFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CopyFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateReferenceAsConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.CustomFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.DeleteReferenceFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.DirectEditFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.LayoutFromDslFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.MoveFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.PasteFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.ResizeFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateConnectionFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateConnectionFromDslFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateReferenceAsListFeature;
import org.eclipselabs.spray.generator.graphiti.templates.features.UpdateShapeFromDslFeature;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class SprayGraphitiGenerator implements IGenerator {
  @Inject
  private Provider<JavaGenFile> genFileProvider;
  
  @Inject
  @Extension
  private NamingExtensions naming;
  
  @Inject
  @Extension
  private DiagramExtensions diagramExtensions;
  
  @Inject
  private PluginActivator pluginActivator;
  
  @Inject
  private ExecutableExtensionFactory executableExtensionFactory;
  
  @Inject
  private GuiceModule guiceModule;
  
  @Inject
  private Plugin plugin;
  
  @Inject
  private DiagramTypeProvider dtp;
  
  @Inject
  private FeatureProvider fp;
  
  @Inject
  private AddShapeFromDslFeature addShapeFromDslFeature;
  
  @Inject
  private AddConnectionFeature addConnectionFeature;
  
  @Inject
  private AddConnectionFromDslFeature addConnectionFromDslFeature;
  
  @Inject
  private AddReferenceAsConnectionFeature addReferenceAsConnectionFeature;
  
  @Inject
  private CreateConnectionFeature createConnectionFeature;
  
  @Inject
  private CreateShapeFeature createShapeFeature;
  
  @Inject
  private CreateReferenceAsConnectionFeature createReferenceAsConnectionFeature;
  
  @Inject
  private UpdateConnectionFeature updateConnectionFeature;
  
  @Inject
  private UpdateConnectionFromDslFeature updateConnectionFromDslFeature;
  
  @Inject
  private MoveFeature moveFeature;
  
  @Inject
  private LayoutFromDslFeature layoutFromDslFeature;
  
  @Inject
  private UpdateShapeFromDslFeature updateShapeFromDslFeature;
  
  @Inject
  private UpdateReferenceAsListFeature updateReferenceAsListFeature;
  
  @Inject
  private DeleteReferenceFeature deleteReferenceFeature;
  
  @Inject
  private ImageProvider imageProvider;
  
  @Inject
  private ToolBehaviorProvider toolBehaviourProvider;
  
  @Inject
  private PropertySection propertySection;
  
  @Inject
  private Filter filter;
  
  @Inject
  private Filter filter2;
  
  @Inject
  private CustomFeature customFeature;
  
  @Inject
  private ModelService modelService;
  
  @Inject
  private DirectEditFeature directEditFeature;
  
  @Inject
  private CopyFeature copyFeature;
  
  @Inject
  private PasteFeature pasteFeature;
  
  @Inject
  private ResizeFeature resizeFeature;
  
  private static Log LOGGER = LogFactory.getLog("SprayGraphitiGenerator");
  
  /**
   * This method is a long sequence of calling all templates for the code generation
   */
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    URI _uRI = resource.getURI();
    String _lastSegment = _uRI.lastSegment();
    boolean _endsWith = _lastSegment.endsWith(ProjectProperties.SPRAY_FILE_EXTENSION);
    boolean _not = (!_endsWith);
    if (_not) {
      URI _uRI_1 = resource.getURI();
      String _plus = ("Spray generator is NOT producing Graphiti code for model " + _uRI_1);
      SprayGraphitiGenerator.LOGGER.info(_plus);
      return;
    }
    URI _uRI_2 = resource.getURI();
    String _plus_1 = ("Spray generator is producing Graphiti code for model " + _uRI_2);
    SprayGraphitiGenerator.LOGGER.info(_plus_1);
    URI _uRI_3 = resource.getURI();
    ProjectProperties.setModelUri(_uRI_3);
    final JavaGenFile java = this.genFileProvider.get();
    java.setAccess(fsa);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    Diagram diagram = ((Diagram) _head);
    this.generatePluginXml(diagram, fsa);
    this.generatePluginActivator(diagram, java, this.pluginActivator);
    this.generateExectuableExtensionFactory(diagram, java);
    this.generateModelService(diagram, java);
    this.generateGuiceModule(diagram, java);
    this.generateDiagramTypeProvider(diagram, java, this.dtp);
    this.generateFeatureProvider(diagram, java, this.fp);
    this.generateAddShapeFromDslFeatures(diagram, java, this.addShapeFromDslFeature);
    this.generateAddConnectionFeatures(diagram, java, this.addConnectionFeature);
    this.generateAddReferenceAsConnectionFeature(diagram, java, this.addReferenceAsConnectionFeature);
    this.generateCreateConnectionFeature(diagram, java, this.createConnectionFeature);
    this.generateCreateShapeFeature(diagram, java, this.createShapeFeature);
    this.generateCreateReferenceAsConnectionFeature(diagram, java, this.createReferenceAsConnectionFeature);
    this.generateUpdateAndLayoutFeatures(diagram, java, this.updateConnectionFeature, this.updateReferenceAsListFeature);
    this.generateUpdateAndLayoutFromDslFeatures(diagram, java, this.updateShapeFromDslFeature, this.layoutFromDslFeature);
    this.generateDeleteReferenceFeature(diagram, java, this.deleteReferenceFeature);
    this.generateImageProvider(diagram, java, this.imageProvider);
    this.generateToolBehaviourProvider(diagram, java, this.toolBehaviourProvider);
    this.generatePropertySection(diagram, java, this.propertySection);
    this.generateFilter(diagram, java, this.filter, this.filter2);
    this.generateCustomFeature(diagram, java, this.customFeature);
    this.generateDirectEditFeature(diagram, java, this.directEditFeature);
    this.generateCopyFeature(diagram, java, this.copyFeature);
    this.generatePasteFeature(diagram, java, this.pasteFeature);
    this.generateResizeFeature(diagram, java, this.resizeFeature);
    this.generateMoveFeature(diagram, java, this.moveFeature);
  }
  
  public void generatePluginXml(final Diagram diagram, final IFileSystemAccess fsa) {
    CharSequence _generate = this.plugin.generate(diagram);
    fsa.generateFile("plugin.xml", _generate);
    String _name = diagram.getName();
    CharSequence _generate_diagramType = this.plugin.generate_diagramType(_name);
    fsa.generateFile("plugin_diagramtype.xml", _generate_diagramType);
    String _name_1 = diagram.getName();
    CharSequence _generate_diagramTypeProvider = this.plugin.generate_diagramTypeProvider(diagram, _name_1);
    fsa.generateFile("plugin_diagramtypeprovider.xml", _generate_diagramTypeProvider);
    CharSequence _generate_graphitiEditorExtension = this.plugin.generate_graphitiEditorExtension(diagram);
    fsa.generateFile("plugin_graphitieditor.xml", _generate_graphitiEditorExtension);
    CharSequence _generate_imageProvider = this.plugin.generate_imageProvider(diagram);
    fsa.generateFile("plugin_imageprovider.xml", _generate_imageProvider);
    CharSequence _generate_newDiagramWizard = this.plugin.generate_newDiagramWizard(diagram);
    fsa.generateFile("plugin_newdiagramwizard.xml", _generate_newDiagramWizard);
    String _name_2 = diagram.getName();
    CharSequence _generate_propertySections = this.plugin.generate_propertySections(diagram, _name_2);
    fsa.generateFile("plugin_propertysections.xml", _generate_propertySections);
    String _name_3 = diagram.getName();
    CharSequence _generate_propertyTab = this.plugin.generate_propertyTab(_name_3);
    fsa.generateFile("plugin_propertytabs.xml", _generate_propertyTab);
  }
  
  public String generatePluginActivator(final Diagram diagram, final JavaGenFile java, final PluginActivator activator) {
    String _xblockexpression = null;
    {
      java.hasExtensionPoint = false;
      String _activatorClassName = this.naming.getActivatorClassName(diagram);
      java.setPackageAndClass(_activatorClassName);
      _xblockexpression = activator.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generateExectuableExtensionFactory(final Diagram diagram, final JavaGenFile java) {
    String _xblockexpression = null;
    {
      String _extensionFactoryClassName = this.naming.getExtensionFactoryClassName(diagram);
      java.setPackageAndClass(_extensionFactoryClassName);
      _xblockexpression = this.executableExtensionFactory.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generateModelService(final Diagram diagram, final JavaGenFile java) {
    String _xblockexpression = null;
    {
      String _modelServiceClassName = this.naming.getModelServiceClassName(diagram);
      java.setPackageAndClass(_modelServiceClassName);
      _xblockexpression = this.modelService.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generateGuiceModule(final Diagram diagram, final JavaGenFile java) {
    String _xblockexpression = null;
    {
      java.hasExtensionPoint = true;
      String _guiceModuleClassName = this.naming.getGuiceModuleClassName(diagram);
      java.setPackageAndClass(_guiceModuleClassName);
      _xblockexpression = this.guiceModule.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generateDiagramTypeProvider(final Diagram diagram, final JavaGenFile java, final DiagramTypeProvider diagramTypeProvider) {
    String _xblockexpression = null;
    {
      String _diagramTypeProviderClassName = this.naming.getDiagramTypeProviderClassName(diagram);
      java.setPackageAndClass(_diagramTypeProviderClassName);
      _xblockexpression = diagramTypeProvider.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generateFeatureProvider(final Diagram diagram, final JavaGenFile java, final FeatureProvider featureProvider) {
    String _xblockexpression = null;
    {
      String _featureProviderClassName = this.naming.getFeatureProviderClassName(diagram);
      java.setPackageAndClass(_featureProviderClassName);
      _xblockexpression = featureProvider.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public void generateAddShapeFromDslFeatures(final Diagram diagram, final JavaGenFile java, final AddShapeFromDslFeature asf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass m) {
        ShapeInSpray _representedBy = m.getRepresentedBy();
        return Boolean.valueOf((_representedBy instanceof ShapeFromDsl));
      }
    };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
    for (final MetaClass metaClass : _filter) {
      {
        ShapeInSpray _representedBy = metaClass.getRepresentedBy();
        ShapeFromDsl container = ((ShapeFromDsl) _representedBy);
        String _addFeatureClassName = this.naming.getAddFeatureClassName(metaClass);
        java.setPackageAndClass(_addFeatureClassName);
        ShapeReference _shape = container.getShape();
        ShapeDefinition _dslShape = null;
        if (_shape!=null) {
          _dslShape=_shape.getDslShape();
        }
        ShapeStyleRef _style = null;
        if (_dslShape!=null) {
          _style=_dslShape.getStyle();
        }
        ShapeStyleRef style = _style;
        boolean _notEquals = (!Objects.equal(style, null));
        if (_notEquals) {
          asf.setAttributes(metaClass, style);
        } else {
          SprayStyleRef _style_1 = diagram.getStyle();
          Style _dslStyle = null;
          if (_style_1!=null) {
            _dslStyle=_style_1.getDslStyle();
          }
          asf.setAttributes(metaClass, _dslStyle);
        }
        asf.generate(container, java);
      }
    }
  }
  
  public void generateAddConnectionFeatures(final Diagram diagram, final JavaGenFile java, final AddConnectionFeature acf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass m) {
        boolean _and = false;
        ShapeInSpray _representedBy = m.getRepresentedBy();
        if (!(_representedBy instanceof ConnectionInSpray)) {
          _and = false;
        } else {
          ShapeInSpray _representedBy_1 = m.getRepresentedBy();
          ConnectionReference _connection = ((ConnectionInSpray) _representedBy_1).getConnection();
          boolean _equals = Objects.equal(_connection, null);
          _and = _equals;
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
    for (final MetaClass metaClass : _filter) {
      {
        String _addFeatureClassName = this.naming.getAddFeatureClassName(metaClass);
        java.setPackageAndClass(_addFeatureClassName);
        acf.generate(metaClass, java);
      }
    }
    EList<MetaClass> _metaClasses_1 = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function_1 = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass m) {
        boolean _and = false;
        ShapeInSpray _representedBy = m.getRepresentedBy();
        if (!(_representedBy instanceof ConnectionInSpray)) {
          _and = false;
        } else {
          ShapeInSpray _representedBy_1 = m.getRepresentedBy();
          ConnectionReference _connection = ((ConnectionInSpray) _representedBy_1).getConnection();
          boolean _notEquals = (!Objects.equal(_connection, null));
          _and = _notEquals;
        }
        return Boolean.valueOf(_and);
      }
    };
    Iterable<MetaClass> _filter_1 = IterableExtensions.<MetaClass>filter(_metaClasses_1, _function_1);
    for (final MetaClass metaClass_1 : _filter_1) {
      {
        String _addFeatureClassName = this.naming.getAddFeatureClassName(metaClass_1);
        java.setPackageAndClass(_addFeatureClassName);
        SprayStyleRef _style = diagram.getStyle();
        this.addConnectionFromDslFeature.setAttributes(metaClass_1, _style);
        this.addConnectionFromDslFeature.generate(metaClass_1, java);
      }
    }
  }
  
  public void generateAddReferenceAsConnectionFeature(final Diagram diagram, final JavaGenFile java, final AddReferenceAsConnectionFeature aracf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      EList<MetaReference> _references = metaClass.getReferences();
      final Function1<MetaReference, Boolean> _function = new Function1<MetaReference, Boolean>() {
        @Override
        public Boolean apply(final MetaReference ref) {
          ConnectionInSpray _representedBy = ref.getRepresentedBy();
          return Boolean.valueOf((!Objects.equal(_representedBy, null)));
        }
      };
      Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(_references, _function);
      for (final MetaReference reference : _filter) {
        {
          String _addReferenceAsConnectionFeatureClassName = this.naming.getAddReferenceAsConnectionFeatureClassName(reference);
          java.setPackageAndClass(_addReferenceAsConnectionFeatureClassName);
          SprayStyleRef _style = diagram.getStyle();
          aracf.setAttributes(_style);
          aracf.generate(reference, java);
        }
      }
    }
  }
  
  public void generateCreateConnectionFeature(final Diagram diagram, final JavaGenFile java, final CreateConnectionFeature ccf) {
    Iterable<MetaClass> _elementsForTemplate = this.diagramExtensions.getElementsForTemplate(diagram, this.createConnectionFeature);
    for (final MetaClass metaClass : _elementsForTemplate) {
      {
        String _createFeatureClassName = this.naming.getCreateFeatureClassName(metaClass);
        java.setPackageAndClass(_createFeatureClassName);
        ccf.generate(metaClass, java);
      }
    }
  }
  
  public void generateCreateShapeFeature(final Diagram diagram, final JavaGenFile java, final CreateShapeFeature csf) {
    Iterable<MetaClass> _elementsForTemplate = this.diagramExtensions.getElementsForTemplate(diagram, this.createShapeFeature);
    for (final MetaClass metaClass : _elementsForTemplate) {
      {
        String _createFeatureClassName = this.naming.getCreateFeatureClassName(metaClass);
        java.setPackageAndClass(_createFeatureClassName);
        csf.generate(metaClass, java);
      }
    }
  }
  
  public void generateCreateReferenceAsConnectionFeature(final Diagram diagram, final JavaGenFile java, final CreateReferenceAsConnectionFeature cracf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      EList<MetaReference> _references = metaClass.getReferences();
      final Function1<MetaReference, Boolean> _function = new Function1<MetaReference, Boolean>() {
        @Override
        public Boolean apply(final MetaReference ref) {
          ConnectionInSpray _representedBy = ref.getRepresentedBy();
          return Boolean.valueOf((!Objects.equal(_representedBy, null)));
        }
      };
      Iterable<MetaReference> _filter = IterableExtensions.<MetaReference>filter(_references, _function);
      for (final MetaReference reference : _filter) {
        {
          String _createReferenceAsConnectionFeatureClassName = this.naming.getCreateReferenceAsConnectionFeatureClassName(reference);
          java.setPackageAndClass(_createReferenceAsConnectionFeatureClassName);
          cracf.generate(reference, java);
        }
      }
    }
  }
  
  public void generateUpdateAndLayoutFeatures(final Diagram diagram, final JavaGenFile java, final UpdateConnectionFeature ucf, final UpdateReferenceAsListFeature uralf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      boolean _and = false;
      ShapeInSpray _representedBy = metaClass.getRepresentedBy();
      if (!(_representedBy instanceof ConnectionInSpray)) {
        _and = false;
      } else {
        ShapeInSpray _representedBy_1 = metaClass.getRepresentedBy();
        ConnectionReference _connection = ((ConnectionInSpray) _representedBy_1).getConnection();
        boolean _equals = Objects.equal(_connection, null);
        _and = _equals;
      }
      if (_and) {
        ShapeInSpray _representedBy_2 = metaClass.getRepresentedBy();
        final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy_2);
        this.generateUpdateConnectionFeature(metaClass, connection, java, ucf);
      }
    }
  }
  
  public void generateUpdateAndLayoutFromDslFeatures(final Diagram diagram, final JavaGenFile java, final UpdateShapeFromDslFeature usf, final LayoutFromDslFeature lf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      boolean _and = false;
      ShapeInSpray _representedBy = metaClass.getRepresentedBy();
      if (!(_representedBy instanceof ConnectionInSpray)) {
        _and = false;
      } else {
        ShapeInSpray _representedBy_1 = metaClass.getRepresentedBy();
        ConnectionReference _connection = ((ConnectionInSpray) _representedBy_1).getConnection();
        boolean _notEquals = (!Objects.equal(_connection, null));
        _and = _notEquals;
      }
      if (_and) {
        ShapeInSpray _representedBy_2 = metaClass.getRepresentedBy();
        final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy_2);
        this.generateUpdateConnectionFromDslFeature(metaClass, connection, java, this.updateConnectionFromDslFeature);
      } else {
        ShapeInSpray _representedBy_3 = metaClass.getRepresentedBy();
        if ((_representedBy_3 instanceof ShapeFromDsl)) {
          ShapeInSpray _representedBy_4 = metaClass.getRepresentedBy();
          final ShapeFromDsl container = ((ShapeFromDsl) _representedBy_4);
          this.generateLayoutFromDslFeature(metaClass, container, java, lf);
          this.generateUpdateShapeFromDslFeature(metaClass, container, java, usf);
        }
      }
    }
  }
  
  public String generateUpdateShapeFromDslFeature(final MetaClass metaClass, final ShapeFromDsl container, final JavaGenFile java, final UpdateShapeFromDslFeature usf) {
    String _xblockexpression = null;
    {
      String _updateFeatureClassName = this.naming.getUpdateFeatureClassName(metaClass);
      java.setPackageAndClass(_updateFeatureClassName);
      _xblockexpression = usf.generate(container, java);
    }
    return _xblockexpression;
  }
  
  public String generateUpdateConnectionFeature(final MetaClass metaClass, final ConnectionInSpray connection, final JavaGenFile java, final UpdateConnectionFeature ucf) {
    String _xblockexpression = null;
    {
      String _updateFeatureClassName = this.naming.getUpdateFeatureClassName(metaClass);
      java.setPackageAndClass(_updateFeatureClassName);
      _xblockexpression = ucf.generate(connection, java);
    }
    return _xblockexpression;
  }
  
  public String generateUpdateConnectionFromDslFeature(final MetaClass metaClass, final ConnectionInSpray connection, final JavaGenFile java, final UpdateConnectionFromDslFeature ucf) {
    String _xblockexpression = null;
    {
      String _updateFeatureClassName = this.naming.getUpdateFeatureClassName(metaClass);
      java.setPackageAndClass(_updateFeatureClassName);
      _xblockexpression = ucf.generate(connection, java);
    }
    return _xblockexpression;
  }
  
  public String generateLayoutFromDslFeature(final MetaClass metaClass, final ShapeFromDsl container, final JavaGenFile java, final LayoutFromDslFeature lf) {
    String _xblockexpression = null;
    {
      String _layoutFeatureClassName = this.naming.getLayoutFeatureClassName(metaClass);
      java.setPackageAndClass(_layoutFeatureClassName);
      _xblockexpression = lf.generate(container, java);
    }
    return _xblockexpression;
  }
  
  public void generateDeleteReferenceFeature(final Diagram diagram, final JavaGenFile java, final DeleteReferenceFeature drf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      EList<MetaReference> _references = metaClass.getReferences();
      for (final MetaReference reference : _references) {
        {
          String _deleteReferenceFeatureClassName = this.naming.getDeleteReferenceFeatureClassName(reference);
          java.setPackageAndClass(_deleteReferenceFeatureClassName);
          drf.generate(reference, java);
        }
      }
    }
  }
  
  public String generateImageProvider(final Diagram diagram, final JavaGenFile java, final ImageProvider ip) {
    String _xblockexpression = null;
    {
      String _imageProviderClassName = this.naming.getImageProviderClassName(diagram);
      java.setPackageAndClass(_imageProviderClassName);
      _xblockexpression = ip.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generateToolBehaviourProvider(final Diagram diagram, final JavaGenFile java, final ToolBehaviorProvider tbp) {
    String _xblockexpression = null;
    {
      String _toolBehaviorProviderClassName = this.naming.getToolBehaviorProviderClassName(diagram);
      java.setPackageAndClass(_toolBehaviorProviderClassName);
      _xblockexpression = tbp.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public void generatePropertySection(final Diagram diagram, final JavaGenFile java, final PropertySection ps) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      EClass _type = metaClass.getType();
      this.generatePropertySectionForEClassAttributes(diagram, java, _type, ps);
    }
  }
  
  public void generatePropertySectionForEClassAttributes(final Diagram diagram, final JavaGenFile java, final EClass eClass, final PropertySection ps) {
    EList<EAttribute> _eAllAttributes = eClass.getEAllAttributes();
    for (final EAttribute attribute : _eAllAttributes) {
      this.generatePropertySectionForAttribute(diagram, java, eClass, attribute, ps);
    }
  }
  
  public String generatePropertySectionForAttribute(final Diagram diagram, final JavaGenFile java, final EClass eClass, final EAttribute attribute, final PropertySection ps) {
    String _xblockexpression = null;
    {
      String _propertySectionClassName = this.naming.getPropertySectionClassName(eClass, attribute);
      java.setPackageAndClass(_propertySectionClassName);
      ps.setDiagram(diagram);
      _xblockexpression = ps.generate(attribute, java);
    }
    return _xblockexpression;
  }
  
  public void generateFilter(final Diagram diagram, final JavaGenFile java, final Filter f, final Filter f2) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      this.generateFilter(diagram, java, metaClass, f);
    }
  }
  
  public String generateFilter(final Diagram diagram, final JavaGenFile java, final MetaClass metaClass, final Filter f) {
    String _xblockexpression = null;
    {
      f.setDiagram(diagram);
      String _filterClassName = this.naming.getFilterClassName(metaClass);
      java.setPackageAndClass(_filterClassName);
      EClass _type = metaClass.getType();
      _xblockexpression = f.generate(_type, java);
    }
    return _xblockexpression;
  }
  
  public String generateFilter(final Diagram diagram, final JavaGenFile java, final EClass eClass, final Filter f) {
    String _xblockexpression = null;
    {
      f.setDiagram(diagram);
      String _filterClassName = this.naming.getFilterClassName(eClass);
      java.setPackageAndClass(_filterClassName);
      _xblockexpression = f.generate(eClass, java);
    }
    return _xblockexpression;
  }
  
  public void generateCustomFeature(final Diagram diagram, final JavaGenFile java, final CustomFeature cf) {
    Iterable<CustomBehavior> _behaviorsForTemplate = this.diagramExtensions.getBehaviorsForTemplate(diagram, cf);
    for (final CustomBehavior behavior : _behaviorsForTemplate) {
      {
        String _customFeatureClassName = this.naming.getCustomFeatureClassName(behavior);
        java.setPackageAndClass(_customFeatureClassName);
        cf.generate(behavior, java);
      }
    }
  }
  
  public void generateDirectEditFeature(final Diagram diagram, final JavaGenFile java, final DirectEditFeature df) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    for (final MetaClass metaClass : _metaClasses) {
      {
        String _directEditFeatureClassName = this.naming.getDirectEditFeatureClassName(metaClass);
        java.setPackageAndClass(_directEditFeatureClassName);
        df.generate(metaClass, java);
      }
    }
  }
  
  public String generateCopyFeature(final Diagram diagram, final JavaGenFile java, final CopyFeature cf) {
    String _xblockexpression = null;
    {
      String _copyFeatureClassName = this.naming.getCopyFeatureClassName(diagram);
      java.setPackageAndClass(_copyFeatureClassName);
      _xblockexpression = cf.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public String generatePasteFeature(final Diagram diagram, final JavaGenFile java, final PasteFeature pf) {
    String _xblockexpression = null;
    {
      String _pasteFeatureClassName = this.naming.getPasteFeatureClassName(diagram);
      java.setPackageAndClass(_pasteFeatureClassName);
      _xblockexpression = pf.generate(diagram, java);
    }
    return _xblockexpression;
  }
  
  public void generateResizeFeature(final Diagram diagram, final JavaGenFile java, final ResizeFeature lf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass m) {
        ShapeInSpray _representedBy = m.getRepresentedBy();
        return Boolean.valueOf((_representedBy instanceof ShapeFromDsl));
      }
    };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
    for (final MetaClass metaClass : _filter) {
      {
        ShapeInSpray _representedBy = metaClass.getRepresentedBy();
        final ShapeFromDsl container = ((ShapeFromDsl) _representedBy);
        String _resizeFeatureClassName = this.naming.getResizeFeatureClassName(metaClass);
        java.setPackageAndClass(_resizeFeatureClassName);
        lf.generate(container, java);
      }
    }
  }
  
  public void generateMoveFeature(final Diagram diagram, final JavaGenFile java, final MoveFeature lf) {
    EList<MetaClass> _metaClasses = diagram.getMetaClasses();
    final Function1<MetaClass, Boolean> _function = new Function1<MetaClass, Boolean>() {
      @Override
      public Boolean apply(final MetaClass m) {
        ShapeInSpray _representedBy = m.getRepresentedBy();
        return Boolean.valueOf((_representedBy instanceof ShapeFromDsl));
      }
    };
    Iterable<MetaClass> _filter = IterableExtensions.<MetaClass>filter(_metaClasses, _function);
    for (final MetaClass metaClass : _filter) {
      {
        ShapeInSpray _representedBy = metaClass.getRepresentedBy();
        final ShapeFromDsl container = ((ShapeFromDsl) _representedBy);
        String _moveFeatureClassName = this.naming.getMoveFeatureClassName(metaClass);
        java.setPackageAndClass(_moveFeatureClassName);
        lf.generate(container, java);
      }
    }
  }
}
