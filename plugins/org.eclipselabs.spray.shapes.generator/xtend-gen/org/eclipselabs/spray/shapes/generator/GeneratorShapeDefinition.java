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
package org.eclipselabs.spray.shapes.generator;

import com.google.common.base.Objects;
import java.util.Arrays;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.generator.common.ProjectProperties;
import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.Ellipse;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorGenerator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeEnumGenerator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeLayoutGenerator;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeGenerator;

@SuppressWarnings("all")
public class GeneratorShapeDefinition {
  @Inject
  @Extension
  private ShapeTypeGenerator _shapeTypeGenerator;
  
  @Inject
  @Extension
  private ShapeLayoutGenerator _shapeLayoutGenerator;
  
  @Inject
  @Extension
  private ShapeAnchorGenerator _shapeAnchorGenerator;
  
  @Inject
  @Extension
  private ShapeEnumGenerator _shapeEnumGenerator;
  
  public String packageName() {
    return ProjectProperties.getShapesPackage();
  }
  
  public String packagePath() {
    String _shapesPackage = ProjectProperties.getShapesPackage();
    return ProjectProperties.toPath(_shapesPackage);
  }
  
  public String filepath(final ShapeDefinition s) {
    String _packagePath = this.packagePath();
    String _className = this.className(s);
    String _plus = (_packagePath + _className);
    return (_plus + ".java");
  }
  
  public String gapClassName(final ShapeDefinition s) {
    String _name = s.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return (_firstUpper + "Shape");
  }
  
  public String className(final ShapeDefinition s) {
    String _gapClassName = this.gapClassName(s);
    return (_gapClassName + "Base");
  }
  
  protected CompartmentInfo _compartment(final Shape shape) {
    return null;
  }
  
  protected CompartmentInfo _compartment(final Rectangle shape) {
    return shape.getCompartmentInfo();
  }
  
  protected CompartmentInfo _compartment(final Ellipse shape) {
    return shape.getCompartmentInfo();
  }
  
  public CharSequence compile(final ShapeDefinition shapeDef) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _head = this.head(shapeDef);
    _builder.append(_head, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    CharSequence _body = this.body(shapeDef);
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence head(final ShapeDefinition shapeDef) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* This is a generated Shape for Spray");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("package ");
    String _packageName = this.packageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.Point;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.datatypes.IDimension;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IAddContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.Graphiti;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IPeCreateService;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.ColorConstant;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.util.IColorConstant;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.styles.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body(final ShapeDefinition shapeDefs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"all\")");
    _builder.newLine();
    _builder.append("public class ");
    String _className = this.className(shapeDefs);
    _builder.append(_className, "");
    _builder.append(" extends DefaultSprayShape {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateTextIdsEnum = this._shapeEnumGenerator.generateTextIdsEnum(shapeDefs);
    _builder.append(_generateTextIdsEnum, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    String _className_1 = this.className(shapeDefs);
    _builder.append(_className_1, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Create a ContainerShape for this Shape");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Diagram diagram = peService.getDiagramForShape(targetContainer);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SprayLayoutService.setId(containerShape, \"");
    String _name = shapeDefs.getName();
    _builder.append(_name, "        ");
    _builder.append(".containerShape\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// define general layout for ContainerShape");
    _builder.newLine();
    _builder.append("        ");
    ShapeStyleRef _style = shapeDefs.getStyle();
    CharSequence _overwriteStyle = null;
    if (_style!=null) {
      _overwriteStyle=this.overwriteStyle(_style, "sprayStyle");
    }
    _builder.append(_overwriteStyle, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    CharSequence _generateLayout = this._shapeLayoutGenerator.generateLayout(shapeDefs);
    _builder.append(_generateLayout, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// layout data");
    _builder.newLine();
    {
      EList<Shape> _shape = shapeDefs.getShape();
      Shape _get = _shape.get(0);
      CompartmentInfo _compartment = this.compartment(_get);
      boolean _notEquals = (!Objects.equal(_compartment, null));
      if (_notEquals) {
        _builder.append("        ");
        _builder.append("SprayLayoutType containerLayout = SprayLayoutType.FIT;");
        _builder.newLine();
      } else {
        _builder.append("        ");
        _builder.append("SprayLayoutType containerLayout = SprayLayoutType.FIT;");
        _builder.newLine();
      }
    }
    _builder.append("        ");
    _builder.append("SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SprayLayoutService.getLayoutData(containerShape).setVisible(true);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    String _cascadedElementsMethodName = this._shapeTypeGenerator.cascadedElementsMethodName();
    _builder.append(_cascadedElementsMethodName, "        ");
    _builder.append("(diagram, containerShape, sprayStyle);");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("createAnchorPoints(diagram, containerShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Fix the broken coordinate syaten for not active container shapes");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SprayAbstractLayoutManager.fixOffset(containerShape);");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return containerShape;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// START GENERATING CASCADED ELEMENTS");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateCascadedElementMethods = this._shapeTypeGenerator.generateCascadedElementMethods(shapeDefs, "containerShape");
    _builder.append(_generateCascadedElementMethods, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// STOP GENERATING CASCADED ELEMENTS");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {");
    _builder.newLine();
    _builder.append("        ");
    CharSequence _createAnchorPoints = this._shapeAnchorGenerator.createAnchorPoints(shapeDefs);
    _builder.append(_createAnchorPoints, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _generateGetLayoutMethod = this._shapeLayoutGenerator.generateGetLayoutMethod(shapeDefs);
    _builder.append(_generateGetLayoutMethod, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence overwriteStyle(final ShapeStyleRef s, final String styleName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method name is undefined for the type GeneratorShapeDefinition"
      + "\ntoFirstUpper cannot be resolved");
  }
  
  public CompartmentInfo compartment(final Shape shape) {
    if (shape instanceof Ellipse) {
      return _compartment((Ellipse)shape);
    } else if (shape instanceof Rectangle) {
      return _compartment((Rectangle)shape);
    } else if (shape != null) {
      return _compartment(shape);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(shape).toString());
    }
  }
}
