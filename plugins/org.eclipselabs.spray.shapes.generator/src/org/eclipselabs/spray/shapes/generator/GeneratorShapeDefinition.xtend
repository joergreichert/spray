/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.shapes.generator

import javax.inject.Inject
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.Rectangle
import org.eclipselabs.spray.shapes.Shape
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.generator.shapes.ShapeAnchorGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeEnumGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeLayoutGenerator
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeGenerator
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.shapes.ShapeStyleRef

class GeneratorShapeDefinition {

    @Inject extension ShapeTypeGenerator
    @Inject extension ShapeLayoutGenerator
    @Inject extension ShapeAnchorGenerator
    @Inject extension ShapeEnumGenerator

    def packageName() {
        ProjectProperties::shapesPackage
    }

    def packagePath() {
        ProjectProperties::toPath(ProjectProperties::shapesPackage)
    }

    def filepath(ShapeDefinition s) {
        packagePath + s.className + ".java"
    }

    def gapClassName(ShapeDefinition s) {
        s.name.toFirstUpper + "Shape"
    }

    def className(ShapeDefinition s) {
        s.gapClassName + "Base"
    }

    def dispatch compartment(Shape shape) {
        null
    }

    def dispatch compartment(Rectangle shape) {
        shape.compartmentInfo
    }

    def dispatch compartment(Ellipse shape) {
        shape.compartmentInfo
    }

    def compile(ShapeDefinition shapeDef) {
        '''
            «shapeDef.head»
            
            «shapeDef.body»
        '''
    }

    def head(ShapeDefinition shapeDef) {
        '''
            /**
             * This is a generated Shape for Spray
             */
            package «packageName»;
            
            import java.util.List;
            import java.util.ArrayList;
            import org.eclipse.graphiti.mm.algorithms.styles.Point;
            import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
            
            import org.eclipse.graphiti.datatypes.IDimension;
            import org.eclipse.graphiti.features.*;
            import org.eclipse.graphiti.features.context.IAddContext;
            import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
            import org.eclipse.graphiti.services.Graphiti;
            import org.eclipse.graphiti.services.IGaService;
            import org.eclipse.graphiti.services.IPeService;
            import org.eclipse.graphiti.services.IPeCreateService;
            import org.eclipse.graphiti.util.ColorConstant;
            import org.eclipse.graphiti.util.IColorConstant;
            
            import org.eclipse.graphiti.mm.pictograms.*;
            import org.eclipse.graphiti.mm.algorithms.*;
            import org.eclipse.graphiti.mm.algorithms.styles.*;
            
            import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
            import org.eclipselabs.spray.runtime.graphiti.layout.SprayAbstractLayoutManager;
            import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
            import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutType;
            
            import org.eclipselabs.spray.runtime.graphiti.GraphitiProperties;
            import org.eclipselabs.spray.runtime.graphiti.shape.DefaultSprayShape;
            import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager;
            import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        '''
    }

    def body(ShapeDefinition shapeDefs) {
        '''
            @SuppressWarnings("all")
            public class «shapeDefs.className» extends DefaultSprayShape {
                
                «shapeDefs.generateTextIdsEnum»
                
                public «shapeDefs.className»(IFeatureProvider fp) {
                    super(fp);
                }
                
                @Override
                public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle) {
                    // Create a ContainerShape for this Shape
                    Diagram diagram = peService.getDiagramForShape(targetContainer);
                    ContainerShape containerShape = peCreateService.createContainerShape(targetContainer, true);
                    SprayLayoutService.setId(containerShape, "«shapeDefs.name».containerShape");
                    
                    // define general layout for ContainerShape
                    «shapeDefs.style?.overwriteStyle("sprayStyle")»
                    «shapeDefs.generateLayout»
                    
                    // layout data
                    «IF shapeDefs.shape.get(0).compartment != null»
                        SprayLayoutType containerLayout = SprayLayoutType.FIT;
                    «ELSE»
                        SprayLayoutType containerLayout = SprayLayoutType.FIT;
                    «ENDIF»
                    SprayLayoutService.setLayoutManager(containerShape, containerLayout, 0, 0, true);
                    SprayLayoutService.getLayoutData(containerShape).setVisible(true);
                    
                    «cascadedElementsMethodName()»(diagram, containerShape, sprayStyle);
                    createAnchorPoints(diagram, containerShape);
                    
                    // Fix the broken coordinate syaten for not active container shapes
                    SprayAbstractLayoutManager.fixOffset(containerShape);
                    
                    return containerShape;
                }
                
                // START GENERATING CASCADED ELEMENTS
                «shapeDefs.generateCascadedElementMethods("containerShape")»
                // STOP GENERATING CASCADED ELEMENTS
                
                protected void createAnchorPoints(Diagram diagram, ContainerShape containerShape) {
                    «shapeDefs.createAnchorPoints»
                }
                
                «shapeDefs.generateGetLayoutMethod»
                
            }
        '''
    }
    
    def overwriteStyle(ShapeStyleRef s, String styleName) {
        if (s.javaStyle != null) {
            '''«styleName» = new «s.javaStyle.qualifiedName»();'''
        } else {
            '''«styleName» = new «ProjectProperties::stylesPackage».«s.dslStyle.name.toFirstUpper»();'''
        }
    }

}
