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

import javax.inject.Inject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.GeneratorUtil;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.ShapeCompartmentAssignment;
import org.eclipselabs.spray.mm.spray.ShapeDslKey;
import org.eclipselabs.spray.mm.spray.ShapeFromDsl;
import org.eclipselabs.spray.mm.spray.ShapeReference;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.xtext.generator.FileGenerator;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile;

@SuppressWarnings("all")
public class MoveFeature extends FileGenerator<ShapeFromDsl> {
  @Inject
  @Extension
  private NamingExtensions _namingExtensions;
  
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
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IRemoveFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IMoveShapeContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.AddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.impl.RemoveContext;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Anchor;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.AnchorContainer;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Connection;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayFitLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayFixedLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayTopLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayDiagramLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.rendering.ConnectionRendering;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import ");
    String _shapesPackage = ProjectProperties.getShapesPackage();
    _builder.append(_shapesPackage, "");
    _builder.append(".");
    ShapeReference _shape = container.getShape();
    String _simpleName = this._namingExtensions.simpleName(_shape);
    _builder.append(_simpleName, "");
    _builder.append("Shape;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class ");
    _builder.append(className, "");
    _builder.append(" extends DefaultMoveShapeFeature {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SprayLayoutManager layoutManager; ");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _generate_additionalFields = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields, "\t");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    _builder.append(className, "\t");
    _builder.append("(final IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("layoutManager =  new ");
    ShapeReference _shape_1 = container.getShape();
    String _simpleName_1 = this._namingExtensions.simpleName(_shape_1);
    _builder.append(_simpleName_1, "\t\t");
    _builder.append("Shape(fp).getShapeLayout( );");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    MetaClass _represents = container.getRepresents();
    Iterable<ShapeCompartmentAssignment> references = this._namingExtensions.getReferencesTo(_represents);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateCanMoveShape = this.generateCanMoveShape(container, className, references);
    _builder.append(_generateCanMoveShape, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateMoveShape = this.generateMoveShape(container, className, references);
    _builder.append(_generateMoveShape, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generate_additionalMethods = this.generate_additionalMethods(container);
    _builder.append(_generate_additionalMethods, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateCanMoveShape(final ShapeFromDsl container, final String className, final Iterable<ShapeCompartmentAssignment> references) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canMoveShape(IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Shape sourceShape = (Shape) context.getPictogramElement();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object source = getBusinessObjectForPictogramElement(sourceShape );");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object target = getBusinessObjectForPictogramElement(targetContainer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// check whether it can move in the same container");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if( sourceShape.eContainer() == targetContainer ){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFixedLayoutManager)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayTopLayoutManager)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayDiagramLayoutManager)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if ((SprayLayoutService.getLayoutManager(sourceShape.getContainer()) instanceof SprayFitLayoutManager)) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("return true;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return false;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      final Function1<ShapeCompartmentAssignment, Boolean> _function = new Function1<ShapeCompartmentAssignment, Boolean>() {
        @Override
        public Boolean apply(final ShapeCompartmentAssignment ref) {
          EReference _reference = ref.getReference();
          boolean _isContainment = _reference.isContainment();
          return Boolean.valueOf((!_isContainment));
        }
      };
      Iterable<ShapeCompartmentAssignment> _filter = IterableExtensions.<ShapeCompartmentAssignment>filter(references, _function);
      for(final ShapeCompartmentAssignment ref : _filter) {
        _builder.append("\t");
        _builder.append("// Cannot drag from a location where the object is a non containment reference");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if ( getBusinessObjectForPictogramElement(sourceShape.getContainer())instanceof ");
        ShapeFromDsl _shape = ref.getShape();
        MetaClass _represents = _shape.getRepresents();
        String _itfName = this._namingExtensions.getItfName(_represents);
        _builder.append(_itfName, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      final Function1<ShapeCompartmentAssignment, Boolean> _function_1 = new Function1<ShapeCompartmentAssignment, Boolean>() {
        @Override
        public Boolean apply(final ShapeCompartmentAssignment ref) {
          EReference _reference = ref.getReference();
          boolean _isContainment = _reference.isContainment();
          return Boolean.valueOf((!_isContainment));
        }
      };
      Iterable<ShapeCompartmentAssignment> _filter_1 = IterableExtensions.<ShapeCompartmentAssignment>filter(references, _function_1);
      for(final ShapeCompartmentAssignment ref_1 : _filter_1) {
        _builder.append("\t");
        _builder.append("// target is non containment, and does not contain reference to moved object ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if (target instanceof ");
        ShapeFromDsl _shape_1 = ref_1.getShape();
        MetaClass _represents_1 = _shape_1.getRepresents();
        String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
        _builder.append(_itfName_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (SprayLayoutService.isCompartment(context.getTargetContainer())) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if ((id != null) && (id.equals(\"");
        ShapeDslKey _shapeDslKey = ref_1.getShapeDslKey();
        String _simpleName = this._namingExtensions.simpleName(_shapeDslKey);
        _builder.append(_simpleName, "\t\t\t");
        _builder.append("\"))) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("if( ! ((");
        ShapeFromDsl _shape_2 = ref_1.getShape();
        MetaClass _represents_2 = _shape_2.getRepresents();
        String _itfName_2 = this._namingExtensions.getItfName(_represents_2);
        _builder.append(_itfName_2, "\t\t\t\t");
        _builder.append(")target).get");
        EReference _reference = ref_1.getReference();
        String _name = _reference.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "\t\t\t\t");
        _builder.append("().contains(source) ){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      final Function1<ShapeCompartmentAssignment, Boolean> _function_2 = new Function1<ShapeCompartmentAssignment, Boolean>() {
        @Override
        public Boolean apply(final ShapeCompartmentAssignment ref) {
          EReference _reference = ref.getReference();
          return Boolean.valueOf(_reference.isContainment());
        }
      };
      Iterable<ShapeCompartmentAssignment> _filter_2 = IterableExtensions.<ShapeCompartmentAssignment>filter(references, _function_2);
      for(final ShapeCompartmentAssignment ref_2 : _filter_2) {
        _builder.append("\t");
        _builder.append("// Can move from containment to another containment compartment");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("if (target instanceof ");
        ShapeFromDsl _shape_3 = ref_2.getShape();
        MetaClass _represents_3 = _shape_3.getRepresents();
        String _itfName_3 = this._namingExtensions.getItfName(_represents_3);
        _builder.append(_itfName_3, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (SprayLayoutService.isCompartment(context.getTargetContainer())) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if ((id != null) && (id.equals(\"");
        ShapeDslKey _shapeDslKey_1 = ref_2.getShapeDslKey();
        String _simpleName_1 = this._namingExtensions.simpleName(_shapeDslKey_1);
        _builder.append(_simpleName_1, "\t\t\t");
        _builder.append("\"))) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("return super.canMoveShape(context);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMoveShape(final ShapeFromDsl container, final String className, final Iterable<ShapeCompartmentAssignment> references) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public void moveShape(IMoveShapeContext context) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("PictogramElement sourceShape = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ContainerShape targetContainer = context.getTargetContainer();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ContainerShape sourceContainer = context.getSourceContainer();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object sourceParent = getBusinessObjectForPictogramElement(sourceContainer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object source = getBusinessObjectForPictogramElement(sourceShape);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Object target = getBusinessObjectForPictogramElement(targetContainer);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if( sourceShape.eContainer() == targetContainer ){ ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("super.moveShape(context);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("final Diagram diagram = this.getDiagram();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(diagram);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// TODO: Fixme: Need to layout twice, probably because this is a fit within a fit layout");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("//  Only neccesary when contents is moved to xcoordinates < 0");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("mgr.layout();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("mgr.layout();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Render all connections of the moved element (if necessary)");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(sourceShape instanceof AnchorContainer) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("AnchorContainer anchorContainer = (AnchorContainer) sourceShape;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("for(Anchor a : anchorContainer.getAnchors()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for(Connection incoming : a.getIncomingConnections()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("ConnectionRendering.startRendering(incoming.getStart(), incoming.getEnd());");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("for(Connection outgoing : a.getOutgoingConnections()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("ConnectionRendering.startRendering(outgoing.getStart(), outgoing.getEnd());");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return;   ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      final Function1<ShapeCompartmentAssignment, Boolean> _function = new Function1<ShapeCompartmentAssignment, Boolean>() {
        @Override
        public Boolean apply(final ShapeCompartmentAssignment ref) {
          EReference _reference = ref.getReference();
          boolean _isContainment = _reference.isContainment();
          return Boolean.valueOf((!_isContainment));
        }
      };
      Iterable<ShapeCompartmentAssignment> _filter = IterableExtensions.<ShapeCompartmentAssignment>filter(references, _function);
      for(final ShapeCompartmentAssignment ref : _filter) {
        _builder.append("\t");
        _builder.append("if (target instanceof ");
        ShapeFromDsl _shape = ref.getShape();
        MetaClass _represents = _shape.getRepresents();
        String _itfName = this._namingExtensions.getItfName(_represents);
        _builder.append(_itfName, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (SprayLayoutService.isCompartment(context.getTargetContainer())) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("String id = GraphitiProperties.get(context.getTargetContainer(), ISprayConstants.TEXT_ID);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if ((id != null) && (id.equals(\"");
        ShapeDslKey _shapeDslKey = ref.getShapeDslKey();
        String _simpleName = this._namingExtensions.simpleName(_shapeDslKey);
        _builder.append(_simpleName, "\t\t\t");
        _builder.append("\"))) {");
        _builder.newLineIfNotEmpty();
        {
          EReference _reference = ref.getReference();
          boolean _isMany = _reference.isMany();
          if (_isMany) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("((");
            ShapeFromDsl _shape_1 = ref.getShape();
            MetaClass _represents_1 = _shape_1.getRepresents();
            String _itfName_1 = this._namingExtensions.getItfName(_represents_1);
            _builder.append(_itfName_1, "\t\t\t\t");
            _builder.append(") target).get");
            EReference _reference_1 = ref.getReference();
            String _name = _reference_1.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            _builder.append(_firstUpper, "\t\t\t\t");
            _builder.append("().add((");
            MetaClass _represents_2 = container.getRepresents();
            String _itfName_2 = this._namingExtensions.getItfName(_represents_2);
            _builder.append(_itfName_2, "\t\t\t\t");
            _builder.append(") source);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("((");
            ShapeFromDsl _shape_2 = ref.getShape();
            MetaClass _represents_3 = _shape_2.getRepresents();
            String _itfName_3 = this._namingExtensions.getItfName(_represents_3);
            _builder.append(_itfName_3, "\t\t\t\t");
            _builder.append(") target).set");
            EReference _reference_2 = ref.getReference();
            String _name_1 = _reference_2.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
            _builder.append(_firstUpper_1, "\t\t\t\t");
            _builder.append("((");
            MetaClass _represents_4 = container.getRepresents();
            String _itfName_4 = this._namingExtensions.getItfName(_represents_4);
            _builder.append(_itfName_4, "\t\t\t\t");
            _builder.append(") source);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("AddContext addContext = new AddContext();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("addContext.putProperty(ISprayConstants.PROPERTY_ALIAS, GraphitiProperties.get(sourceShape, ISprayConstants.PROPERTY_ALIAS));");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("addContext.setNewObject(source);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("addContext.setLocation(context.getX(), context.getX());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("addContext.setTargetContainer(targetContainer);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("getFeatureProvider().addIfPossible(addContext);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      final Function1<ShapeCompartmentAssignment, Boolean> _function_1 = new Function1<ShapeCompartmentAssignment, Boolean>() {
        @Override
        public Boolean apply(final ShapeCompartmentAssignment ref) {
          EReference _reference = ref.getReference();
          return Boolean.valueOf(_reference.isContainment());
        }
      };
      Iterable<ShapeCompartmentAssignment> _filter_1 = IterableExtensions.<ShapeCompartmentAssignment>filter(references, _function_1);
      for(final ShapeCompartmentAssignment ref_1 : _filter_1) {
        _builder.append("\t");
        _builder.append("if (target instanceof ");
        ShapeFromDsl _shape_3 = ref_1.getShape();
        MetaClass _represents_5 = _shape_3.getRepresents();
        String _itfName_5 = this._namingExtensions.getItfName(_represents_5);
        _builder.append(_itfName_5, "\t");
        _builder.append(") {  // For shape ");
        MetaClass _represents_6 = container.getRepresents();
        String _alias = _represents_6.getAlias();
        _builder.append(_alias, "\t");
        _builder.append(" + ");
        ShapeReference _shape_4 = container.getShape();
        ShapeDefinition _dslShape = _shape_4.getDslShape();
        String _name_2 = _dslShape.getName();
        _builder.append(_name_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (SprayLayoutService.isCompartment(targetContainer) ) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("String id = GraphitiProperties.get(targetContainer, ISprayConstants.TEXT_ID);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("if ((id != null) && (id.equals(\"");
        ShapeDslKey _shapeDslKey_1 = ref_1.getShapeDslKey();
        String _simpleName_1 = this._namingExtensions.simpleName(_shapeDslKey_1);
        _builder.append(_simpleName_1, "\t\t\t");
        _builder.append("\"))) {");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("sourceContainer.getChildren().remove(source);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("ContainerShape sourceTop = SprayLayoutService.findTopDslShape(sourceContainer);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("if( sourceTop != null ){");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("SprayLayoutService.getLayoutManager(sourceTop).layout();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("// remove from source container and add to target container");
        _builder.newLine();
        _builder.newLine();
        {
          EReference _reference_3 = ref_1.getReference();
          boolean _isMany_1 = _reference_3.isMany();
          if (_isMany_1) {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("((");
            ShapeFromDsl _shape_5 = ref_1.getShape();
            MetaClass _represents_7 = _shape_5.getRepresents();
            String _itfName_6 = this._namingExtensions.getItfName(_represents_7);
            _builder.append(_itfName_6, "\t\t\t\t");
            _builder.append(") target).get");
            EReference _reference_4 = ref_1.getReference();
            String _name_3 = _reference_4.getName();
            String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
            _builder.append(_firstUpper_2, "\t\t\t\t");
            _builder.append("().add((");
            MetaClass _represents_8 = container.getRepresents();
            String _itfName_7 = this._namingExtensions.getItfName(_represents_8);
            _builder.append(_itfName_7, "\t\t\t\t");
            _builder.append(") source);");
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t");
            _builder.append("\t\t\t");
            _builder.append("((");
            ShapeFromDsl _shape_6 = ref_1.getShape();
            MetaClass _represents_9 = _shape_6.getRepresents();
            String _itfName_8 = this._namingExtensions.getItfName(_represents_9);
            _builder.append(_itfName_8, "\t\t\t\t");
            _builder.append(") target).set");
            EReference _reference_5 = ref_1.getReference();
            String _name_4 = _reference_5.getName();
            String _firstUpper_3 = StringExtensions.toFirstUpper(_name_4);
            _builder.append(_firstUpper_3, "\t\t\t\t");
            _builder.append("((");
            MetaClass _represents_10 = container.getRepresents();
            String _itfName_9 = this._namingExtensions.getItfName(_represents_10);
            _builder.append(_itfName_9, "\t\t\t\t");
            _builder.append(") source);");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("sourceShape.getGraphicsAlgorithm().setX(context.getX());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("sourceShape.getGraphicsAlgorithm().setY(context.getY());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("targetContainer.getChildren().add((Shape)sourceShape);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("ContainerShape targetTop = SprayLayoutService.findTopDslShape(targetContainer);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("if (targetTop != null) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t\t");
        _builder.append("SprayLayoutService.getLayoutManager(targetTop).layout();");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t\t");
        _builder.append("return;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
