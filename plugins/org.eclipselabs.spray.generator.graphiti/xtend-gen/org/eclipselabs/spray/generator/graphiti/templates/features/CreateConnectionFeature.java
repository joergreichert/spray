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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.AskForHandler;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.ConnectionInSpray;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class CreateConnectionFeature extends FileGenerator<MetaClass> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private MetaClassExtensions _metaClassExtensions;
  
  @Inject
  @Extension
  private AskForHandler _askForHandler;
  
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
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipse.emf.common.util.EList;");
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICreateConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddConnectionContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Anchor;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateConnectionFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractCreateConnectionFeature {");
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
    CharSequence _generate_additionalFields = this.generate_additionalFields(metaClass);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// provide name and description for the UI, e.g. the palette");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp, \"");
    String _uiLabel_2 = this.getUiLabel(metaClass);
    _builder.append(_uiLabel_2, "        ");
    _builder.append("\", \"Create ");
    String _uiLabel_3 = this.getUiLabel(metaClass);
    _builder.append(_uiLabel_3, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("gaService = ");
    Diagram _diagram = metaClass.getDiagram();
    String _activatorClassName = this._namingExtensions.getActivatorClassName(_diagram);
    String _shortName = this._namingExtensions.shortName(_activatorClassName);
    _builder.append(_shortName, "        ");
    _builder.append(".get(IGaService.class);");
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
    CharSequence _generate_canStartConnection = this.generate_canStartConnection(metaClass);
    _builder.append(_generate_canStartConnection, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_create = this.generate_create(metaClass);
    _builder.append(_generate_create, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getFromTypeForAnchor = this.generate_getFromTypeForAnchor(metaClass);
    _builder.append(_generate_getFromTypeForAnchor, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getToTypeForAnchor = this.generate_getToTypeForAnchor(metaClass);
    _builder.append(_generate_getToTypeForAnchor, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_createEReference = this.generate_createEReference(metaClass);
    _builder.append(_generate_createEReference, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_getCreateImageId = this.generate_getCreateImageId(metaClass);
    _builder.append(_generate_getCreateImageId, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(metaClass);
    _builder.append(_generate_additionalMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _generateGetDslShapeAchor = this.generateGetDslShapeAchor();
    _builder.append(_generateGetDslShapeAchor, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Determine the name that appears in the dialog when asking for the name
   */
  protected String getUiLabel(final MetaClass mc) {
    String _xifexpression = null;
    boolean _and = false;
    boolean _hasCreateBehavior = this._metaClassExtensions.hasCreateBehavior(mc);
    if (!_hasCreateBehavior) {
      _and = false;
    } else {
      CreateBehavior _createBehavior = this._metaClassExtensions.getCreateBehavior(mc);
      String _label = _createBehavior.getLabel();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_label);
      boolean _not = (!_isNullOrEmpty);
      _and = _not;
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
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    EReference _to = connection.getTo();
    EClassifier _eType_1 = _to.getEType();
    final EClass to = ((EClass) _eType_1);
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canCreate(final ICreateConnectionContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Anchor targetAnchor = getDslShapeAnchor(context.getTargetPictogramElement());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (targetAnchor == null){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true if both anchors belong to an EClass of the right type and those EClasses are not identical");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Anchor sourceAnchor = getDslShapeAnchor(context.getSourcePictogramElement());");
    _builder.newLine();
    _builder.append("    ");
    String _itfName = this._namingExtensions.getItfName(from);
    _builder.append(_itfName, "    ");
    _builder.append(" source = get");
    String _name = from.getName();
    _builder.append(_name, "    ");
    _builder.append("(sourceAnchor);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _itfName_1 = this._namingExtensions.getItfName(to);
    _builder.append(_itfName_1, "    ");
    _builder.append(" target = get");
    String _name_1 = to.getName();
    _builder.append(_name_1, "    ");
    _builder.append("(targetAnchor);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("if ( (source != null) && (target != null) && (source != target) ) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_canStartConnection(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canStartConnection(final ICreateConnectionContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true if start anchor belongs to a EClass of the right type");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Anchor sourceAnchor = getDslShapeAnchor(context.getSourcePictogramElement());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (get");
    String _name = from.getName();
    _builder.append(_name, "    ");
    _builder.append("(sourceAnchor) != null) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_create(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    EReference _to = connection.getTo();
    EClassifier _eType_1 = _to.getEType();
    final EClass to = ((EClass) _eType_1);
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public Connection create(final ICreateConnectionContext context) {");
    _builder.newLine();
    _builder.append("        ");
    CreateBehavior _createBehavior = this._metaClassExtensions.getCreateBehavior(metaClass);
    final EReference containmentRef = _createBehavior.getContainmentReference();
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("Connection newConnection = null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Anchor sourceAnchor = getDslShapeAnchor(context.getSourcePictogramElement());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Anchor targetAnchor = getDslShapeAnchor(context.getTargetPictogramElement());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// get EClasses which should be connected");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final ");
    String _itfName = this._namingExtensions.getItfName(from);
    _builder.append(_itfName, "        ");
    _builder.append(" source = get");
    String _name = from.getName();
    _builder.append(_name, "        ");
    _builder.append("(sourceAnchor);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("final ");
    String _itfName_1 = this._namingExtensions.getItfName(to);
    _builder.append(_itfName_1, "        ");
    _builder.append(" target = get");
    String _name_1 = to.getName();
    _builder.append(_name_1, "        ");
    _builder.append("(targetAnchor);");
    _builder.newLineIfNotEmpty();
    {
      EClassifier _eType_2 = containmentRef.getEType();
      boolean _equals = Objects.equal(_eType_2, from);
      if (_equals) {
        _builder.append("        ");
        _builder.append("final ");
        String _itfName_2 = this._namingExtensions.getItfName(from);
        _builder.append(_itfName_2, "        ");
        _builder.append(" container = source;");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("        ");
        _builder.append("// containment reference is not a feature of source");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("final ");
        EClass _eContainingClass = containmentRef.getEContainingClass();
        String _itfName_3 = this._namingExtensions.getItfName(_eContainingClass);
        _builder.append(_itfName_3, "        ");
        _builder.append(" container = org.eclipse.xtext.EcoreUtil2.getContainerOfType(source, ");
        EClass _eContainingClass_1 = containmentRef.getEContainingClass();
        String _itfName_4 = this._namingExtensions.getItfName(_eContainingClass_1);
        _builder.append(_itfName_4, "        ");
        _builder.append(".class);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("if (source != null && target != null) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// create new business object");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final ");
    String _itfName_5 = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName_5, "            ");
    _builder.append(" eReference = create");
    EClass _type = metaClass.getType();
    String _name_2 = _type.getName();
    _builder.append(_name_2, "            ");
    _builder.append("(source, target);");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("// add the element to containment reference");
    _builder.newLine();
    {
      boolean _isMany = containmentRef.isMany();
      if (_isMany) {
        _builder.append("            ");
        _builder.append("container.get");
        String _name_3 = containmentRef.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper, "            ");
        _builder.append("().add(eReference);");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("            ");
        _builder.append("container.set");
        String _name_4 = containmentRef.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
        _builder.append(_firstUpper_1, "            ");
        _builder.append("(eReference);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("// add connection for business object");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("final AddConnectionContext addContext = new AddConnectionContext(sourceAnchor, targetAnchor);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("addContext.setNewObject(eReference);");
    _builder.newLine();
    {
      String _alias = metaClass.getAlias();
      boolean _notEquals = (!Objects.equal(_alias, null));
      if (_notEquals) {
        _builder.append("            ");
        _builder.append("// store alias name");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("addContext.putProperty(PROPERTY_ALIAS, \"");
        String _alias_1 = metaClass.getAlias();
        _builder.append(_alias_1, "            ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("            ");
    _builder.append("newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("// activate direct editing after object creation");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("getFeatureProvider().getDirectEditingInfo().setActive(true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return newConnection;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getFromTypeForAnchor(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Returns the ");
    String _name = from.getName();
    _builder.append(_name, " ");
    _builder.append(" belonging to the anchor, or <code>null</code> if not available.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected ");
    String _itfName = this._namingExtensions.getItfName(from);
    _builder.append(_itfName, "");
    _builder.append(" get");
    String _name_1 = from.getName();
    _builder.append(_name_1, "");
    _builder.append("(final Anchor anchor) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("if (anchor != null) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(anchor.getParent()); ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (bo instanceof ");
    String _itfName_1 = this._namingExtensions.getItfName(from);
    _builder.append(_itfName_1, "        ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("return (");
    String _itfName_2 = this._namingExtensions.getItfName(from);
    _builder.append(_itfName_2, "            ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getToTypeForAnchor(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    EReference _to = connection.getTo();
    EClassifier _eType_1 = _to.getEType();
    final EClass to = ((EClass) _eType_1);
    _builder.newLineIfNotEmpty();
    {
      String _name = from.getName();
      String _name_1 = to.getName();
      boolean _notEquals = (!Objects.equal(_name, _name_1));
      if (_notEquals) {
        _builder.append(" ");
        _builder.append("        /**");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("* Returns the ");
        String _name_2 = to.getName();
        _builder.append(_name_2, " ");
        _builder.append(" belonging to the anchor, or <code>null</code> if not available.");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("*/");
        _builder.newLine();
        _builder.append("protected ");
        String _itfName = this._namingExtensions.getItfName(to);
        _builder.append(_itfName, "");
        _builder.append(" get");
        String _name_3 = to.getName();
        _builder.append(_name_3, "");
        _builder.append("(final Anchor anchor) {");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if (anchor != null) {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("final EObject bo = (EObject) getBusinessObjectForPictogramElement(anchor.getParent()); ");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if (bo instanceof ");
        String _itfName_1 = this._namingExtensions.getItfName(to);
        _builder.append(_itfName_1, "        ");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.append("return (");
        String _itfName_2 = this._namingExtensions.getItfName(to);
        _builder.append(_itfName_2, "            ");
        _builder.append(") bo;");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return null;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generate_createEReference(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    ShapeInSpray _representedBy = metaClass.getRepresentedBy();
    final ConnectionInSpray connection = ((ConnectionInSpray) _representedBy);
    _builder.newLineIfNotEmpty();
    EReference _from = connection.getFrom();
    EClassifier _eType = _from.getEType();
    final EClass from = ((EClass) _eType);
    _builder.newLineIfNotEmpty();
    EReference _to = connection.getTo();
    EClassifier _eType_1 = _to.getEType();
    final EClass to = ((EClass) _eType_1);
    _builder.newLineIfNotEmpty();
    EList<Behavior> _behaviors = metaClass.getBehaviors();
    Iterable<CreateBehavior> _filter = Iterables.<CreateBehavior>filter(_behaviors, CreateBehavior.class);
    final CreateBehavior createBehavior = IterableExtensions.<CreateBehavior>head(_filter);
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Creates a EReference between two EClasses.");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected ");
    String _itfName = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName, "");
    _builder.append(" create");
    EClass _type = metaClass.getType();
    String _name = _type.getName();
    _builder.append(_name, "");
    _builder.append("(final ");
    String _itfName_1 = this._namingExtensions.getItfName(from);
    _builder.append(_itfName_1, "");
    _builder.append(" source, final ");
    String _itfName_2 = this._namingExtensions.getItfName(to);
    _builder.append(_itfName_2, "");
    _builder.append(" target) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// TODO: Domain Object");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("final ");
    String _itfName_3 = this._namingExtensions.getItfName(metaClass);
    _builder.append(_itfName_3, "    ");
    _builder.append(" domainObject = ");
    String _eFactoryInterfaceName = this._namingExtensions.getEFactoryInterfaceName(metaClass);
    String _shortName = this._namingExtensions.shortName(_eFactoryInterfaceName);
    _builder.append(_shortName, "    ");
    _builder.append(".eINSTANCE.create");
    String _name_1 = this._namingExtensions.getName(metaClass);
    _builder.append(_name_1, "    ");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    EAttribute _askFor = createBehavior.getAskFor();
    CharSequence _handleAskFor = this._askForHandler.handleAskFor(metaClass, "domainObject", _askFor);
    _builder.append(_handleAskFor, "    ");
    _builder.newLineIfNotEmpty();
    {
      EReference _from_1 = connection.getFrom();
      boolean _isChangeable = _from_1.isChangeable();
      if (_isChangeable) {
        _builder.append("    ");
        _builder.append("domainObject.set");
        EReference _from_2 = connection.getFrom();
        String _name_2 = _from_2.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper, "    ");
        _builder.append("(source);");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("// reference \'");
        EReference _from_3 = connection.getFrom();
        String _name_3 = _from_3.getName();
        _builder.append(_name_3, "    ");
        _builder.append("\' is not settable");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.append("domainObject.set");
    EReference _to_1 = connection.getTo();
    String _name_4 = _to_1.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
    _builder.append(_firstUpper_1, "    ");
    _builder.append("(target);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return domainObject;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generate_getCreateImageId(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _and = false;
      String _icon = metaClass.getIcon();
      boolean _notEquals = (!Objects.equal(_icon, null));
      if (!_notEquals) {
        _and = false;
      } else {
        String _icon_1 = metaClass.getIcon();
        boolean _equalsIgnoreCase = _icon_1.equalsIgnoreCase("");
        boolean _not = (!_equalsIgnoreCase);
        _and = _not;
      }
      if (_and) {
        CharSequence _overrideHeader = this.overrideHeader();
        _builder.append(_overrideHeader, "");
        _builder.newLineIfNotEmpty();
        _builder.append("public String getCreateImageId() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return ");
        Diagram _diagram = metaClass.getDiagram();
        String _imageProviderClassName = this._namingExtensions.getImageProviderClassName(_diagram);
        String _shortName = this._namingExtensions.shortName(_imageProviderClassName);
        _builder.append(_shortName, "    ");
        _builder.append(".");
        Diagram _diagram_1 = metaClass.getDiagram();
        String _icon_2 = metaClass.getIcon();
        String _imageIdentifier = this._namingExtensions.getImageIdentifier(_diagram_1, _icon_2);
        _builder.append(_imageIdentifier, "    ");
        _builder.append("; ");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence generateGetDslShapeAchor() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("protected Anchor getDslShapeAnchor(PictogramElement pe) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if( pe == null ){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Shape dslShape = SprayLayoutService.findDslShape(pe);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (dslShape != null) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("EList<Anchor> anchors = dslShape.getAnchors();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (!anchors.isEmpty()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return anchors.get(0);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
