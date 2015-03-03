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
package org.eclipselabs.spray.generator.graphiti.util;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.generator.graphiti.util.FeatureType;
import org.eclipselabs.spray.mm.spray.AliasableElement;
import org.eclipselabs.spray.mm.spray.ConnectionReference;
import org.eclipselabs.spray.mm.spray.CustomBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.xtext.generator.importmanager.ImportUtil;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

/**
 * Computation of class names, file names etc.
 * @author Karsten Thoms
 */
@SuppressWarnings("all")
public class NamingExtensions {
  @Inject
  private GenModelHelper genModelHelper;
  
  @Inject
  private ImportUtil importUtil;
  
  protected String _simpleName(final ShapeDslKey shapeRef) {
    String _dslKey = shapeRef.getDslKey();
    boolean _notEquals = (!Objects.equal(_dslKey, null));
    if (_notEquals) {
      return shapeRef.getDslKey();
    } else {
      JvmEnumerationLiteral _jvmKey = shapeRef.getJvmKey();
      return _jvmKey.getSimpleName();
    }
  }
  
  protected String _qualifiedName(final ShapeReference shapeRef) {
    ShapeDefinition _dslShape = shapeRef.getDslShape();
    boolean _notEquals = (!Objects.equal(_dslShape, null));
    if (_notEquals) {
      String _shapesPackage = ProjectProperties.getShapesPackage();
      String _plus = (_shapesPackage + ".");
      ShapeDefinition _dslShape_1 = shapeRef.getDslShape();
      String _name = _dslShape_1.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      return (_plus + _firstUpper);
    } else {
      JvmTypeReference _jvmShape = shapeRef.getJvmShape();
      return _jvmShape.getQualifiedName();
    }
  }
  
  protected String _simpleName(final ShapeReference shapeRef) {
    ShapeDefinition _dslShape = shapeRef.getDslShape();
    boolean _notEquals = (!Objects.equal(_dslShape, null));
    if (_notEquals) {
      ShapeDefinition _dslShape_1 = shapeRef.getDslShape();
      String _name = _dslShape_1.getName();
      return StringExtensions.toFirstUpper(_name);
    } else {
      JvmTypeReference _jvmShape = shapeRef.getJvmShape();
      return _jvmShape.getSimpleName();
    }
  }
  
  protected String _qualifiedName(final ConnectionReference shapeRef) {
    ConnectionDefinition _dslConnection = shapeRef.getDslConnection();
    boolean _notEquals = (!Objects.equal(_dslConnection, null));
    if (_notEquals) {
      String _shapesPackage = ProjectProperties.getShapesPackage();
      String _plus = (_shapesPackage + ".");
      ConnectionDefinition _dslConnection_1 = shapeRef.getDslConnection();
      String _name = _dslConnection_1.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      return (_plus + _firstUpper);
    } else {
      JvmTypeReference _jvmConnection = shapeRef.getJvmConnection();
      return _jvmConnection.getQualifiedName();
    }
  }
  
  protected String _simpleName(final ConnectionReference shapeRef) {
    ConnectionDefinition _dslConnection = shapeRef.getDslConnection();
    boolean _notEquals = (!Objects.equal(_dslConnection, null));
    if (_notEquals) {
      ConnectionDefinition _dslConnection_1 = shapeRef.getDslConnection();
      String _name = _dslConnection_1.getName();
      return StringExtensions.toFirstUpper(_name);
    } else {
      JvmTypeReference _jvmConnection = shapeRef.getJvmConnection();
      return _jvmConnection.getSimpleName();
    }
  }
  
  protected String _qualifiedName(final SprayStyleRef styleRef) {
    JvmTypeReference _javaStyle = styleRef.getJavaStyle();
    boolean _notEquals = (!Objects.equal(_javaStyle, null));
    if (_notEquals) {
      JvmTypeReference _javaStyle_1 = styleRef.getJavaStyle();
      return _javaStyle_1.getQualifiedName();
    } else {
      Style _dslStyle = styleRef.getDslStyle();
      return this.qualifiedName(_dslStyle);
    }
  }
  
  protected String _qualifiedName(final ShapeStyleRef styleRef) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Object to EObject");
  }
  
  protected String _qualifiedName(final Style style) {
    String _stylesPackage = ProjectProperties.getStylesPackage();
    String _plus = (_stylesPackage + ".");
    String _name = style.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_plus + _firstUpper);
  }
  
  protected String _simpleName(final SprayStyleRef styleRef) {
    JvmTypeReference _javaStyle = styleRef.getJavaStyle();
    boolean _notEquals = (!Objects.equal(_javaStyle, null));
    if (_notEquals) {
      JvmTypeReference _javaStyle_1 = styleRef.getJavaStyle();
      return _javaStyle_1.getSimpleName();
    } else {
      Style _dslStyle = styleRef.getDslStyle();
      String _name = _dslStyle.getName();
      return StringExtensions.toFirstUpper(_name);
    }
  }
  
  protected String _getName(final EObject obj) {
    return SimpleAttributeResolver.NAME_RESOLVER.apply(obj);
  }
  
  protected String _getName(final MetaClass metaClass) {
    String _xifexpression = null;
    EClass _type = metaClass.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      EClass _type_1 = metaClass.getType();
      _xifexpression = _type_1.getName();
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  protected String _getName(final MetaReference ref) {
    EReference _target = ref.getTarget();
    return _target.getName();
  }
  
  /**
   * The visible name is the element's alias if set, otherwise the element's name
   */
  public String getVisibleName(final AliasableElement elem) {
    boolean _and = false;
    String _alias = elem.getAlias();
    boolean _notEquals = (!Objects.equal(_alias, null));
    if (!_notEquals) {
      _and = false;
    } else {
      String _alias_1 = elem.getAlias();
      int _length = _alias_1.length();
      boolean _greaterThan = (_length > 0);
      _and = _greaterThan;
    }
    if (_and) {
      return elem.getAlias();
    } else {
      return this.getName(elem);
    }
  }
  
  public String getLabelPropertyName(final MetaReference ref) {
    return "name";
  }
  
  public String getDiagramTypeProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _plus = (_diagram_package + ".");
    String _diagramTypeProviderSimpleClassName = this.getDiagramTypeProviderSimpleClassName(diagram);
    return (_plus + _diagramTypeProviderSimpleClassName);
  }
  
  public String getDiagramTypeProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "DiagramTypeProvider");
  }
  
  public String getFeatureProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _plus = (_diagram_package + ".");
    String _featureProviderSimpleClassName = this.getFeatureProviderSimpleClassName(diagram);
    return (_plus + _featureProviderSimpleClassName);
  }
  
  public String getFeatureProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "FeatureProvider");
  }
  
  public String getImageProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _plus = (_diagram_package + ".");
    String _imageProviderSimpleClassName = this.getImageProviderSimpleClassName(diagram);
    return (_plus + _imageProviderSimpleClassName);
  }
  
  public String getImageProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "ImageProvider");
  }
  
  public String getToolBehaviorProviderClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _plus = (_diagram_package + ".");
    String _toolBehaviorProviderSimpleClassName = this.getToolBehaviorProviderSimpleClassName(diagram);
    return (_plus + _toolBehaviorProviderSimpleClassName);
  }
  
  public String getToolBehaviorProviderSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "ToolBehaviorProvider");
  }
  
  public String getDiagramEditorClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _plus = (_diagram_package + ".");
    String _diagramEditorSimpleClassName = this.getDiagramEditorSimpleClassName(diagram);
    return (_plus + _diagramEditorSimpleClassName);
  }
  
  public String getDiagramEditorSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "DiagramEditor");
  }
  
  public String getGuiceModuleClassName(final Diagram diagram) {
    String _main_package = GeneratorUtil.main_package();
    String _plus = (_main_package + ".");
    String _guiceModuleSimpleClassName = this.getGuiceModuleSimpleClassName(diagram);
    return (_plus + _guiceModuleSimpleClassName);
  }
  
  public String getGuiceModuleSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Module");
  }
  
  public String getModelServiceClassName(final Diagram diagram) {
    String _diagram_package = GeneratorUtil.diagram_package();
    String _plus = (_diagram_package + ".");
    String _modelServiceSimpleClassName = this.getModelServiceSimpleClassName(diagram);
    return (_plus + _modelServiceSimpleClassName);
  }
  
  public String getModelServiceSimpleClassName(final Diagram diagram) {
    String _name = diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "ModelService");
  }
  
  public String getCreateFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.Create);
  }
  
  public String getCreateFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.Create);
  }
  
  public String getAddFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.Add);
  }
  
  public String getAddFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.Add);
  }
  
  public String getUpdateFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.Update);
  }
  
  public String getUpdateFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.Update);
  }
  
  public String getLayoutFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.Layout);
  }
  
  public String getLayoutFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.Layout);
  }
  
  public String getDirectEditFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.DirectEdit);
  }
  
  public String getDirectEditFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.DirectEdit);
  }
  
  public String getCopyFeatureClassName(final Diagram clazz) {
    return this.getDiagramClassName(clazz, FeatureType.Copy);
  }
  
  public String getCopyFeatureSimpleClassName(final Diagram clazz) {
    return this.getDiagramSimpleClassName(clazz, FeatureType.Copy);
  }
  
  public String getPasteFeatureClassName(final Diagram clazz) {
    return this.getDiagramClassName(clazz, FeatureType.Paste);
  }
  
  public String getPasteFeatureSimpleClassName(final Diagram clazz) {
    return this.getDiagramSimpleClassName(clazz, FeatureType.Paste);
  }
  
  public String getResizeFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.Resize);
  }
  
  public String getResizeFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.Resize);
  }
  
  public String getMoveFeatureClassName(final MetaClass clazz) {
    return this.getFeatureClassName(clazz, FeatureType.Move);
  }
  
  public String getMoveFeatureSimpleClassName(final MetaClass clazz) {
    return this.getFeatureSimpleClassName(clazz, FeatureType.Move);
  }
  
  /**
   * Result example:
   * Diagram = "mod4j", MetaClass = "BusinessClass", featureType="Add"
   * Result = "Mod4jAddBusinessClassFeature"
   */
  public String getFeatureClassName(final MetaClass clazz, final FeatureType featureType) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _featureSimpleClassName = this.getFeatureSimpleClassName(clazz, featureType);
    return (_plus + _featureSimpleClassName);
  }
  
  public String getFeatureSimpleClassName(final MetaClass clazz, final FeatureType featureType) {
    Diagram _diagram = clazz.getDiagram();
    String _name = _diagram.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + featureType);
    String _visibleName = this.getVisibleName(clazz);
    String _plus_1 = (_plus + _visibleName);
    return (_plus_1 + "Feature");
  }
  
  public String getDiagramClassName(final Diagram clazz, final FeatureType featureType) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _diagramSimpleClassName = this.getDiagramSimpleClassName(clazz, featureType);
    return (_plus + _diagramSimpleClassName);
  }
  
  public String getDiagramSimpleClassName(final Diagram clazz, final FeatureType featureType) {
    String _name = clazz.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    String _plus = (_firstUpper + featureType);
    return (_plus + "Feature");
  }
  
  protected String _getFilterClassName(final MetaClass clazz) {
    String _property_package = GeneratorUtil.property_package();
    String _plus = (_property_package + ".");
    String _filterSimpleClassName = this.getFilterSimpleClassName(clazz);
    return (_plus + _filterSimpleClassName);
  }
  
  protected String _getFilterSimpleClassName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    String _name = _type.getName();
    return (_name + "Filter");
  }
  
  public String getCreateFeatureClassName(final MetaReference reference) {
    return this.getFeatureClassName(reference, FeatureType.Create);
  }
  
  public String getAddFeatureClassName(final MetaReference reference) {
    return this.getFeatureClassName(reference, FeatureType.Add);
  }
  
  public String getUpdateFeatureClassName(final MetaReference reference) {
    return this.getFeatureClassName(reference, FeatureType.Update);
  }
  
  public String getFeatureClassName(final MetaReference reference, final FeatureType featureType) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      String _feature_package = GeneratorUtil.feature_package();
      String _plus = (_feature_package + ".");
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus_1 = (_plus + _firstUpper);
      String _plus_2 = (_plus_1 + featureType);
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_3 = (_plus_2 + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_4 = (_plus_3 + _firstUpper_1);
      EReference _target_1 = reference.getTarget();
      EClass _eReferenceType = _target_1.getEReferenceType();
      String _name_3 = _eReferenceType.getName();
      String _plus_5 = (_plus_4 + _name_3);
      _xblockexpression = (_plus_5 + "Feature");
    }
    return _xblockexpression;
  }
  
  public String getAddReferenceAsConnectionFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _addReferenceAsConnectionFeatureSimpleClassName = this.getAddReferenceAsConnectionFeatureSimpleClassName(reference);
    return (_plus + _addReferenceAsConnectionFeatureSimpleClassName);
  }
  
  public String getAddReferenceAsConnectionFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "AddReference");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      _xblockexpression = (_plus_2 + "Feature");
    }
    return _xblockexpression;
  }
  
  public String getCreateReferenceAsListFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _createReferenceAsListFeatureSimpleClassName = this.getCreateReferenceAsListFeatureSimpleClassName(reference);
    return (_plus + _createReferenceAsListFeatureSimpleClassName);
  }
  
  public String getCreateReferenceAsListFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "Create");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      String _name_2 = this.getName(reference);
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      EReference _target = reference.getTarget();
      EClass _eReferenceType = _target.getEReferenceType();
      String _name_3 = _eReferenceType.getName();
      String _plus_3 = (_plus_2 + _name_3);
      _xblockexpression = (_plus_3 + "Feature");
    }
    return _xblockexpression;
  }
  
  public String getUpdateReferenceAsListFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _updateReferenceAsListFeatureSimpleClassName = this.getUpdateReferenceAsListFeatureSimpleClassName(reference);
    return (_plus + _updateReferenceAsListFeatureSimpleClassName);
  }
  
  public String getUpdateReferenceAsListFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "Update");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      _xblockexpression = (_plus_2 + "Feature");
    }
    return _xblockexpression;
  }
  
  public String getCreateReferenceAsListFeatureClassName(final MetaReference reference, final EClass subClass) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _createReferenceAsListFeatureSimpleClassName = this.getCreateReferenceAsListFeatureSimpleClassName(reference, subClass);
    return (_plus + _createReferenceAsListFeatureSimpleClassName);
  }
  
  public String getCreateReferenceAsListFeatureSimpleClassName(final MetaReference reference, final EClass subClass) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "Create");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      String _name_3 = subClass.getName();
      String _plus_3 = (_plus_2 + _name_3);
      _xblockexpression = (_plus_3 + "Feature");
    }
    return _xblockexpression;
  }
  
  public String getAddReferenceAsListFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _addReferenceAsListFeatureSimpleClassName = this.getAddReferenceAsListFeatureSimpleClassName(reference);
    return (_plus + _addReferenceAsListFeatureSimpleClassName);
  }
  
  public String getAddReferenceAsListFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "Add");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      _xblockexpression = (_plus_2 + "ListFeature");
    }
    return _xblockexpression;
  }
  
  public String getCreateReferenceAsConnectionFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _createReferenceAsConnectionFeatureSimpleClassName = this.getCreateReferenceAsConnectionFeatureSimpleClassName(reference);
    return (_plus + _createReferenceAsConnectionFeatureSimpleClassName);
  }
  
  public String getCreateReferenceAsConnectionFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "Create");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      _xblockexpression = (_plus_2 + "Feature");
    }
    return _xblockexpression;
  }
  
  public String getDeleteReferenceFeatureClassName(final MetaReference reference) {
    String _feature_package = GeneratorUtil.feature_package();
    String _plus = (_feature_package + ".");
    String _deleteReferenceFeatureSimpleClassName = this.getDeleteReferenceFeatureSimpleClassName(reference);
    return (_plus + _deleteReferenceFeatureSimpleClassName);
  }
  
  public String getDeleteReferenceFeatureSimpleClassName(final MetaReference reference) {
    String _xblockexpression = null;
    {
      final MetaClass cls = EcoreUtil2.<MetaClass>getContainerOfType(reference, MetaClass.class);
      Diagram _diagram = cls.getDiagram();
      String _name = _diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "DeleteReference");
      EClass _type = cls.getType();
      String _name_1 = _type.getName();
      String _plus_1 = (_plus + _name_1);
      EReference _target = reference.getTarget();
      String _name_2 = _target.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_2);
      String _plus_2 = (_plus_1 + _firstUpper_1);
      _xblockexpression = (_plus_2 + "Feature");
    }
    return _xblockexpression;
  }
  
  /**
   * Returns the qualified class name of the ICustomFeature represented by a CustomBehavior.
   */
  public String getCustomFeatureClassName(final CustomBehavior behavior) {
    String _xifexpression = null;
    JvmTypeReference _realizedBy = behavior.getRealizedBy();
    boolean _equals = Objects.equal(_realizedBy, null);
    if (_equals) {
      String _feature_package = GeneratorUtil.feature_package();
      String _plus = (_feature_package + ".");
      String _customFeatureSimpleClassName = this.getCustomFeatureSimpleClassName(behavior);
      _xifexpression = (_plus + _customFeatureSimpleClassName);
    } else {
      JvmTypeReference _realizedBy_1 = behavior.getRealizedBy();
      JvmType _type = _realizedBy_1.getType();
      _xifexpression = _type.getQualifiedName();
    }
    return _xifexpression;
  }
  
  public String getCustomFeatureSimpleClassName(final CustomBehavior behavior) {
    String _xblockexpression = null;
    {
      final Diagram diagram = EcoreUtil2.<Diagram>getContainerOfType(behavior, Diagram.class);
      String _name = diagram.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = (_firstUpper + "Custom");
      String _name_1 = behavior.getName();
      String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
      String _plus_1 = (_plus + _firstUpper_1);
      _xblockexpression = (_plus_1 + "Feature");
    }
    return _xblockexpression;
  }
  
  protected String _getFilterClassName(final EClass clazz) {
    String _property_package = GeneratorUtil.property_package();
    String _plus = (_property_package + ".");
    String _filterSimpleClassName = this.getFilterSimpleClassName(clazz);
    return (_plus + _filterSimpleClassName);
  }
  
  protected String _getFilterSimpleClassName(final EClass clazz) {
    String _name = clazz.getName();
    return (_name + "Filter");
  }
  
  public String getPropertySectionClassName(final EAttribute attribute) {
    String _property_package = GeneratorUtil.property_package();
    String _plus = (_property_package + ".");
    String _propertySectionSimpleClassName = this.getPropertySectionSimpleClassName(attribute);
    return (_plus + _propertySectionSimpleClassName);
  }
  
  public String getPropertySectionSimpleClassName(final EAttribute attribute) {
    EClass _eContainingClass = attribute.getEContainingClass();
    String _name = _eContainingClass.getName();
    String _name_1 = attribute.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    String _plus = (_name + _firstUpper);
    return (_plus + "Section");
  }
  
  public String getPropertySectionClassName(final EClass clazz, final EAttribute attribute) {
    String _property_package = GeneratorUtil.property_package();
    String _plus = (_property_package + ".");
    String _propertySectionSimpleClassName = this.getPropertySectionSimpleClassName(clazz, attribute);
    return (_plus + _propertySectionSimpleClassName);
  }
  
  public String getPropertySectionSimpleClassName(final EClass clazz, final EAttribute attribute) {
    String _name = clazz.getName();
    String _name_1 = attribute.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name_1);
    String _plus = (_name + _firstUpper);
    return (_plus + "Section");
  }
  
  /**
   * Computes the qualified Interface name of the EClass and shortens it using the shortName() function.
   */
  public String getItfName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    return this.getJavaInterfaceName(_type);
  }
  
  /**
   * Computes the qualified Interface name of the EClass and shortens it using the shortName() function.
   */
  public String getItfName(final EClass clazz) {
    return this.getJavaInterfaceName(clazz);
  }
  
  public String getJavaInterfaceName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    return this.getJavaInterfaceName(_type);
  }
  
  public String getJavaInterfaceName(final EClass eClass) {
    return this.genModelHelper.getJavaInterfaceName(eClass);
  }
  
  public String getJavaInterfaceName(final EClassifier eClassifier) {
    return this.genModelHelper.getJavaInterfaceName(eClassifier);
  }
  
  public String getEPackageClassName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    return this.getEPackageClassName(_type);
  }
  
  public String getEPackageClassName(final EClassifier eClassifier) {
    String _xifexpression = null;
    EPackage _ePackage = eClassifier.getEPackage();
    boolean _equals = Objects.equal(_ePackage, EcorePackage.eINSTANCE);
    if (_equals) {
      _xifexpression = "org.eclipse.emf.ecore.EcorePackage";
    } else {
      _xifexpression = this.genModelHelper.getEPackageClassifierName(eClassifier);
    }
    return _xifexpression;
  }
  
  public String getEFactoryInterfaceName(final EClass eClass) {
    String _xifexpression = null;
    EPackage _ePackage = eClass.getEPackage();
    boolean _equals = Objects.equal(_ePackage, EcorePackage.eINSTANCE);
    if (_equals) {
      _xifexpression = "org.eclipse.emf.ecore.EcoreFactory";
    } else {
      _xifexpression = this.genModelHelper.getEFactoryInterfaceName(eClass);
    }
    return _xifexpression;
  }
  
  public String getEFactoryInterfaceName(final MetaClass clazz) {
    EClass _type = clazz.getType();
    return this.getEFactoryInterfaceName(_type);
  }
  
  public String getEFactoryInterfaceName(final EDataType dataType) {
    String _xifexpression = null;
    EPackage _ePackage = dataType.getEPackage();
    boolean _equals = Objects.equal(_ePackage, EcorePackage.eINSTANCE);
    if (_equals) {
      _xifexpression = "org.eclipse.emf.ecore.EcoreFactory";
    } else {
      _xifexpression = this.genModelHelper.getEFactoryInterfaceName(dataType);
    }
    return _xifexpression;
  }
  
  public String getLiteralConstant(final EClass eClass) {
    String _ePackageClassName = this.genModelHelper.getEPackageClassName(eClass);
    String _shortName = this.shortName(_ePackageClassName);
    String _plus = (_shortName + ".Literals.");
    String _literalConstant = this.genModelHelper.getLiteralConstant(eClass);
    return (_plus + _literalConstant);
  }
  
  public String getLiteralConstant(final MetaReference reference) {
    EReference _target = reference.getTarget();
    return this.getLiteralConstant(_target);
  }
  
  public String getLiteralConstant(final EReference eReference) {
    EClass _eContainingClass = eReference.getEContainingClass();
    String _ePackageClassName = this.genModelHelper.getEPackageClassName(_eContainingClass);
    String _shortName = this.shortName(_ePackageClassName);
    String _plus = (_shortName + ".Literals.");
    String _literalConstant = this.genModelHelper.getLiteralConstant(eReference);
    return (_plus + _literalConstant);
  }
  
  public String getLiteralConstant(final MetaClass clazz) {
    EClass _type = clazz.getType();
    return this.getLiteralConstant(_type);
  }
  
  public String getDiagramName(final MetaClass clazz) {
    Diagram _diagram = clazz.getDiagram();
    return _diagram.getName();
  }
  
  public String getActivatorClassName(final Diagram diagram) {
    String _main_package = GeneratorUtil.main_package();
    String _plus = (_main_package + ".");
    String _activatorSimpleClassName = this.getActivatorSimpleClassName(diagram);
    return (_plus + _activatorSimpleClassName);
  }
  
  public String getActivatorSimpleClassName(final Diagram diagram) {
    return "Activator";
  }
  
  public String getExtensionFactoryClassName(final Diagram diagram) {
    String _main_package = GeneratorUtil.main_package();
    String _plus = (_main_package + ".internal.");
    String _extensionFactorySimpleClassName = this.getExtensionFactorySimpleClassName(diagram);
    return (_plus + _extensionFactorySimpleClassName);
  }
  
  public String getExtensionFactorySimpleClassName(final Diagram diagram) {
    return "ExecutableExtensionFactory";
  }
  
  public String getImageIdentifier(final Diagram diagram, final String imagePath) {
    boolean _equals = Objects.equal(imagePath, null);
    if (_equals) {
      return null;
    }
    String _name = diagram.getName();
    String _upperCase = _name.toUpperCase();
    String _plus = (_upperCase + "__");
    int _lastIndexOf = imagePath.lastIndexOf(".");
    String _substring = imagePath.substring(0, _lastIndexOf);
    String _replaceAll = _substring.replaceAll("\\W", "_");
    String _upperCase_1 = _replaceAll.toUpperCase();
    return (_plus + _upperCase_1);
  }
  
  public String getImageBaseName(final String imagePath) {
    boolean _equals = Objects.equal(imagePath, null);
    if (_equals) {
      return null;
    }
    int _lastIndexOf = imagePath.lastIndexOf(".");
    String _substring = imagePath.substring(0, _lastIndexOf);
    String _replaceAll = _substring.replaceAll("\\W", "_");
    return _replaceAll.toLowerCase();
  }
  
  public String getModelFileExtension(final EObject ctx) {
    return ProjectProperties.getModelFileExtension();
  }
  
  public String shortName(final JvmTypeReference typeRef) {
    return this.importUtil.shortName(typeRef);
  }
  
  public String shortName(final String qualifiedName) {
    return this.importUtil.shortName(qualifiedName);
  }
  
  public String shortName(final Class<?> clazz) {
    return this.importUtil.shortName(clazz);
  }
  
  public Iterable<ShapeCompartmentAssignment> getReferencesTo(final MetaClass metaClass) {
    Iterable<ShapeCompartmentAssignment> _xblockexpression = null;
    {
      Diagram _diagram = metaClass.getDiagram();
      EList<MetaClass> _metaClasses = _diagram.getMetaClasses();
      final Function1<MetaClass, ShapeInSpray> _function = new Function1<MetaClass, ShapeInSpray>() {
        @Override
        public ShapeInSpray apply(final MetaClass cls) {
          return cls.getRepresentedBy();
        }
      };
      List<ShapeInSpray> _map = ListExtensions.<MetaClass, ShapeInSpray>map(_metaClasses, _function);
      Iterable<ShapeFromDsl> referringShapes = Iterables.<ShapeFromDsl>filter(_map, ShapeFromDsl.class);
      final Function1<ShapeFromDsl, EList<ShapeCompartmentAssignment>> _function_1 = new Function1<ShapeFromDsl, EList<ShapeCompartmentAssignment>>() {
        @Override
        public EList<ShapeCompartmentAssignment> apply(final ShapeFromDsl s) {
          return s.getReferences();
        }
      };
      Iterable<EList<ShapeCompartmentAssignment>> _map_1 = IterableExtensions.<ShapeFromDsl, EList<ShapeCompartmentAssignment>>map(referringShapes, _function_1);
      Iterable<ShapeCompartmentAssignment> references = Iterables.<ShapeCompartmentAssignment>concat(_map_1);
      final Function1<ShapeCompartmentAssignment, Boolean> _function_2 = new Function1<ShapeCompartmentAssignment, Boolean>() {
        @Override
        public Boolean apply(final ShapeCompartmentAssignment r) {
          boolean _or = false;
          EClass _type = metaClass.getType();
          EReference _reference = r.getReference();
          EClass _eReferenceType = _reference.getEReferenceType();
          boolean _equals = Objects.equal(_type, _eReferenceType);
          if (_equals) {
            _or = true;
          } else {
            EClass _type_1 = metaClass.getType();
            EList<EClass> _eAllSuperTypes = _type_1.getEAllSuperTypes();
            EReference _reference_1 = r.getReference();
            EClass _eReferenceType_1 = _reference_1.getEReferenceType();
            boolean _contains = _eAllSuperTypes.contains(_eReferenceType_1);
            _or = _contains;
          }
          return Boolean.valueOf(_or);
        }
      };
      Iterable<ShapeCompartmentAssignment> result = IterableExtensions.<ShapeCompartmentAssignment>filter(references, _function_2);
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
  
  public Iterable<ShapeFromDsl> xgetReferringShapes(final MetaClass metaClass) {
    Diagram _diagram = metaClass.getDiagram();
    EList<MetaClass> _metaClasses = _diagram.getMetaClasses();
    final Function1<MetaClass, ShapeInSpray> _function = new Function1<MetaClass, ShapeInSpray>() {
      @Override
      public ShapeInSpray apply(final MetaClass cls) {
        return cls.getRepresentedBy();
      }
    };
    List<ShapeInSpray> _map = ListExtensions.<MetaClass, ShapeInSpray>map(_metaClasses, _function);
    return Iterables.<ShapeFromDsl>filter(_map, ShapeFromDsl.class);
  }
  
  public String simpleName(final EObject shapeRef) {
    if (shapeRef instanceof ConnectionReference) {
      return _simpleName((ConnectionReference)shapeRef);
    } else if (shapeRef instanceof ShapeDslKey) {
      return _simpleName((ShapeDslKey)shapeRef);
    } else if (shapeRef instanceof ShapeReference) {
      return _simpleName((ShapeReference)shapeRef);
    } else if (shapeRef instanceof SprayStyleRef) {
      return _simpleName((SprayStyleRef)shapeRef);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shapeRef).toString());
    }
  }
  
  public String qualifiedName(final EObject style) {
    if (style instanceof Style) {
      return _qualifiedName((Style)style);
    } else if (style instanceof ConnectionReference) {
      return _qualifiedName((ConnectionReference)style);
    } else if (style instanceof ShapeReference) {
      return _qualifiedName((ShapeReference)style);
    } else if (style instanceof SprayStyleRef) {
      return _qualifiedName((SprayStyleRef)style);
    } else if (style instanceof ShapeStyleRef) {
      return _qualifiedName((ShapeStyleRef)style);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(style).toString());
    }
  }
  
  public String getName(final EObject metaClass) {
    if (metaClass instanceof MetaClass) {
      return _getName((MetaClass)metaClass);
    } else if (metaClass instanceof MetaReference) {
      return _getName((MetaReference)metaClass);
    } else if (metaClass != null) {
      return _getName(metaClass);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(metaClass).toString());
    }
  }
  
  public String getFilterClassName(final EObject clazz) {
    if (clazz instanceof EClass) {
      return _getFilterClassName((EClass)clazz);
    } else if (clazz instanceof MetaClass) {
      return _getFilterClassName((MetaClass)clazz);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(clazz).toString());
    }
  }
  
  public String getFilterSimpleClassName(final EObject clazz) {
    if (clazz instanceof EClass) {
      return _getFilterSimpleClassName((EClass)clazz);
    } else if (clazz instanceof MetaClass) {
      return _getFilterSimpleClassName((MetaClass)clazz);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(clazz).toString());
    }
  }
}
