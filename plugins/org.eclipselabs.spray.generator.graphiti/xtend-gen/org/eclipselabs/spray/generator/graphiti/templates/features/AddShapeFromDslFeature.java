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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.CompartmentBehavior;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.mm.spray.SprayStyleRef;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class AddShapeFromDslFeature extends FileGenerator<ShapeFromDsl> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
  @Inject
  @Extension
  private MetaClassExtensions _metaClassExtensions;
  
  private MetaClass metaClass = null;
  
  private EObject style = null;
  
  public EObject setAttributes(final MetaClass cls, final Style style) {
    EObject _xblockexpression = null;
    {
      this.metaClass = cls;
      _xblockexpression = this.style = style;
    }
    return _xblockexpression;
  }
  
  public EObject setAttributes(final MetaClass cls, final SprayStyleRef style) {
    EObject _xblockexpression = null;
    {
      this.metaClass = cls;
      _xblockexpression = this.style = style;
    }
    return _xblockexpression;
  }
  
  public EObject setAttributes(final MetaClass cls, final ShapeStyleRef style) {
    EObject _xblockexpression = null;
    {
      this.metaClass = cls;
      _xblockexpression = this.style = style;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence generateBaseFile(final ShapeFromDsl modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    return this.mainFile(modelElement, _baseClassName);
  }
  
  @Override
  public CharSequence generateExtensionFile(final ShapeFromDsl modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    return this.mainExtensionPointFile(modelElement, _className);
  }
  
  public CharSequence mainExtensionPointFile(final ShapeFromDsl container, final String className) {
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
  
  public CharSequence mainFile(final ShapeFromDsl container, final String className) {
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
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.ISprayShape;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import ");
    ShapeReference _shape = container.getShape();
    String _qualifiedName = this._namingExtensions.qualifiedName(_shape);
    _builder.append(_qualifiedName, "");
    _builder.append("Shape;");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;");
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@SuppressWarnings(\"unused\")");
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractAddFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected final static String typeOrAliasName = \"");
    String _visibleName = this._namingExtensions.getVisibleName(this.metaClass);
    _builder.append(_visibleName, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected Diagram targetDiagram = null;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public boolean canAdd(final IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final EObject newObject = (EObject) context.getNewObject();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if (newObject instanceof ");
    String _itfName = this._namingExtensions.getItfName(this.metaClass);
    _builder.append(_itfName, "        ");
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    _builder.append("// check if user wants to add to a diagram");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (context.getTargetContainer() instanceof Diagram) {");
    _builder.newLine();
    {
      boolean _and = false;
      CreateBehavior _createBehavior = this._metaClassExtensions.getCreateBehavior(this.metaClass);
      boolean _notEquals = (!Objects.equal(_createBehavior, null));
      if (!_notEquals) {
        _and = false;
      } else {
        CreateBehavior _createBehavior_1 = this._metaClassExtensions.getCreateBehavior(this.metaClass);
        EReference _containmentReference = _createBehavior_1.getContainmentReference();
        boolean _notEquals_1 = (!Objects.equal(_containmentReference, null));
        _and = _notEquals_1;
      }
      if (_and) {
        _builder.append("                ");
        _builder.append("return true;");
        _builder.newLine();
      } else {
        _builder.append("                ");
        _builder.append("return false;");
        _builder.newLine();
      }
    }
    _builder.append("            ");
    _builder.append("} else if (context.getTargetContainer() instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("// OLD STUFF");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());");
    _builder.newLine();
    {
      EList<Behavior> _behaviors = this.metaClass.getBehaviors();
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
            _builder.append("                ");
            _builder.append("if (target instanceof ");
            EObject _eContainer = Refcompartment.eContainer();
            String _itfName_1 = this._namingExtensions.getItfName(((EClass) _eContainer));
            _builder.append(_itfName_1, "                ");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            _builder.append("                ");
            _builder.append("    ");
            _builder.append("return true;");
            _builder.newLine();
            _builder.append("                ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("                ");
    _builder.append("// NEW stuff");
    _builder.newLine();
    _builder.append("                ");
    Iterable<ShapeCompartmentAssignment> result = this._namingExtensions.getReferencesTo(this.metaClass);
    _builder.newLineIfNotEmpty();
    {
      for(final ShapeCompartmentAssignment cls : result) {
        _builder.append("                ");
        _builder.append("// cls ");
        ShapeFromDsl _shape_1 = cls.getShape();
        MetaClass _represents = _shape_1.getRepresents();
        String _itfName_2 = this._namingExtensions.getItfName(_represents);
        _builder.append(_itfName_2, "                ");
        _builder.append(" refers to this metaClass»");
        _builder.newLineIfNotEmpty();
        _builder.append("                ");
        _builder.append("if( target instanceof ");
        ShapeFromDsl _shape_2 = cls.getShape();
        MetaClass _represents_1 = _shape_2.getRepresents();
        String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(_represents_1);
        _builder.append(_javaInterfaceName, "                ");
        _builder.append(" ){");
        _builder.newLineIfNotEmpty();
        _builder.append("                ");
        _builder.append("    ");
        _builder.append("if (SprayLayoutService.isCompartment(context.getTargetContainer())) {");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("        ");
        _builder.append("String id = GraphitiProperties.get(context.getTargetContainer(), TEXT_ID);");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("        ");
        _builder.append("if ( (id != null) && (id.equals(\"");
        ShapeDslKey _shapeDslKey = cls.getShapeDslKey();
        String _simpleName = this._namingExtensions.simpleName(_shapeDslKey);
        _builder.append(_simpleName, "                        ");
        _builder.append("\")) ) {");
        _builder.newLineIfNotEmpty();
        _builder.append("                ");
        _builder.append("            ");
        _builder.append("return true;    ");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("           ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    CharSequence _overrideHeader_1 = this.overrideHeader();
    _builder.append(_overrideHeader_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public PictogramElement add(final IAddContext context) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final ");
    String _itfName_3 = this._namingExtensions.getItfName(this.metaClass);
    _builder.append(_itfName_3, "        ");
    _builder.append(" addedModelElement = (");
    String _itfName_4 = this._namingExtensions.getItfName(this.metaClass);
    _builder.append(_itfName_4, "        ");
    _builder.append(") context.getNewObject();");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.append("// NEW stuff");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    {
      SprayStyleRef _style = this.metaClass.getStyle();
      boolean _notEquals_2 = (!Objects.equal(_style, null));
      if (_notEquals_2) {
        _builder.append("        ");
        _builder.append("final ISprayStyle style = new ");
        SprayStyleRef _style_1 = this.metaClass.getStyle();
        String _qualifiedName_1 = this._namingExtensions.qualifiedName(_style_1);
        _builder.append(_qualifiedName_1, "        ");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      } else {
        boolean _notEquals_3 = (!Objects.equal(this.style, null));
        if (_notEquals_3) {
          _builder.append("        ");
          _builder.append("final ISprayStyle style = new ");
          String _qualifiedName_2 = this._namingExtensions.qualifiedName(this.style);
          _builder.append(_qualifiedName_2, "        ");
          _builder.append("();");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("        ");
          _builder.append("final ISprayStyle style = new org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle();");
          _builder.newLine();
        }
      }
    }
    _builder.append("        ");
    _builder.append("final ISprayShape shape = new ");
    ShapeReference _shape_3 = container.getShape();
    String _simpleName_1 = this._namingExtensions.simpleName(_shape_3);
    _builder.append(_simpleName_1, "        ");
    _builder.append("Shape(getFeatureProvider());");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("final ContainerShape conShape = shape.getShape(targetContainer, style);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("final IGaService gaService = Graphiti.getGaService();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("link(conShape, addedModelElement);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("linkShapes(conShape, addedModelElement);");
    _builder.newLine();
    {
      String _alias = this.metaClass.getAlias();
      boolean _notEquals_4 = (!Objects.equal(_alias, null));
      if (_notEquals_4) {
        _builder.append("        ");
        _builder.append("peService.setPropertyValue(conShape , PROPERTY_ALIAS, \"");
        String _alias_1 = this.metaClass.getAlias();
        _builder.append(_alias_1, "        ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("updatePictogramElement(conShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("layout(conShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return conShape;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void linkShapes(ContainerShape conShape, ");
    String _itfName_5 = this._namingExtensions.getItfName(this.metaClass);
    _builder.append(_itfName_5, "    ");
    _builder.append(" addedModelElement) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("link(conShape, addedModelElement);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (Shape childShape : conShape.getChildren()) {");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("if( childShape instanceof ContainerShape ) {");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("linkShapes((ContainerShape)childShape, addedModelElement);");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("link(childShape, addedModelElement);");
    _builder.newLine();
    _builder.append("           ");
    _builder.append("}");
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
}
