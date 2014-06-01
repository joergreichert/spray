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
package org.eclipselabs.spray.generator.graphiti.templates.features

import javax.inject.Inject
import org.eclipse.xtext.xbase.XExpression
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

/*
 * Template for generating Graphiti Update feature for a ContainerInSpray representing a MetaClass
 */
class UpdateShapeFromDslFeature extends FileGenerator<ShapeFromDsl>  {
    @Inject extension NamingExtensions
    @Inject extension DiagramExtensions
    @Inject extension SprayCompiler
      
      String functionClassName = "com.google.common.base.Function"
      
    override CharSequence generateBaseFile(ShapeFromDsl modelElement) {
        mainFile(modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(ShapeFromDsl modelElement) {
        mainExtensionPointFile(modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(ShapeFromDsl container, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        
        }
    '''

    def mainFile(ShapeFromDsl container, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.AbstractText;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractUpdateFeature {
            «generate_additionalFields(container)»
            public «className»(final IFeatureProvider fp) {
                super(fp);
                gaService = «container.diagram.activatorClassName.shortName».get(IGaService.class);
            }
         
            «generate_canUpdate(container)»
            «generate_updateNeeded(container)»
            «generate_checkUpdateNeededRecursively(container)»
            «generate_update(container)»
            «generate_updateChildrenRecursively(container)»
            «generate_additionalMethods(container)»
        }
        '''
        
        def generate_canUpdate (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean canUpdate(final IUpdateContext context) {
                // return true, if linked business object is a «container.represents.itfName»
                final PictogramElement pictogramElement = context.getPictogramElement();
                final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                return (bo instanceof «container.represents.itfName») && (!(pictogramElement instanceof Diagram));
            }
        '''
        
        def generate_updateNeeded (ShapeFromDsl container) '''
            «overrideHeader»
            public IReason updateNeeded(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final Object bo = getBusinessObjectForPictogramElement(pictogramElement);
                if (!(bo instanceof «container.represents.itfName»)) {
                    return Reason.createFalseReason(); 
                }
                if(pictogramElement instanceof Shape) {
                    Shape shape = (Shape) pictogramElement;
                    «container.represents.itfName» eClass = («container.represents.itfName») bo;
                    if(checkUpdateNeededRecursively(shape, eClass)) {
                        return Reason.createTrueReason();
                    }
                    if( shape instanceof ContainerShape ){
                        for(Shape childShape : ((ContainerShape)shape).getChildren()) {
                            if(checkUpdateNeededRecursively(childShape, eClass)) {
                                return Reason.createTrueReason();
                            }
                        }
                    }
                }
                return Reason.createFalseReason();
             }
        '''
        
        def generate_checkUpdateNeededRecursively(ShapeFromDsl container) '''
            protected boolean checkUpdateNeededRecursively(Shape shape, final «container.represents.itfName» eClass) {
                GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
                if(graphicsAlgorithm instanceof AbstractText) {
                    «IF !container.properties.empty»
                    AbstractText text = (AbstractText) graphicsAlgorithm;
                    String id = peService.getPropertyValue(graphicsAlgorithm, TEXT_ID);
                    if(id != null) {
                        «FOR property : container.properties»
                        if(id.equals("«property.key.simpleName»")) {
                            «IF property.value != null»
                            «property.value.propertyAssignmentFunction("eClassValue", "String", container.represents.itfName, "eClass")»
                            «ELSE»
                            String eClassValue = eClass.get«property.attribute.name.toFirstUpper»();
                            «ENDIF»
                            String gAlgorithmValue = text.getValue();
                            if(eClassValue != null) {
                                if(!eClassValue.equals(gAlgorithmValue)) {
                                    return true;
                                }
                            }
                        }
                        «ENDFOR»
                    }
                    «ENDIF»
                }
                if( shape instanceof ContainerShape ){
                    for(Shape child : ((ContainerShape) shape).getChildren()) {
                        if(checkUpdateNeededRecursively(child, eClass)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        '''
    
        def generate_update (ShapeFromDsl container) '''
            «overrideHeader»
            public boolean update(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final «container.represents.itfName» eClass = («container.represents.itfName») getBusinessObjectForPictogramElement(pictogramElement);
                if(pictogramElement instanceof Shape) {
                    Shape shape = (Shape) pictogramElement;
                    updateChildrenRecursively(shape, eClass);
                    Shape top = findTopShape(shape);
                    SprayLayoutService.getLayoutManager(top).layout();
                }
                return true;
                
            }
        '''
            
        def generate_updateChildrenRecursively(ShapeFromDsl container) '''
            protected void updateChildrenRecursively(Shape shape, final «container.represents.itfName» eClass) {
                GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
                if(graphicsAlgorithm instanceof AbstractText) {
                    «IF !container.properties.empty»
                    AbstractText text = (AbstractText) graphicsAlgorithm;
                    String id = peService.getPropertyValue(graphicsAlgorithm, TEXT_ID);
                    if(id != null) {
                        «FOR property : container.properties»
                        if(id.equals("«property.key.simpleName»")) {
                            «IF property.value != null»
                            «property.value.propertyAssignmentFunction("value", "String", container.represents.itfName, "eClass")»
                            text.setValue(value);
                            «ELSE»
                            text.setValue(eClass.get«property.attribute.name.toFirstUpper»());
                            «ENDIF»
                            setDoneChanges(true);
                        }
                        «ENDFOR»
                    }
                    «ENDIF»
                }
                
                if (shape instanceof ContainerShape) {
                    for(Shape child : ((ContainerShape) shape).getChildren()) {
                        updateChildrenRecursively(child, eClass);
                    }
                }
            }
        '''
        
       def propertyAssignmentFunction(XExpression xexp, String valueName, String returnType, String metaClassName, String metaClassAttribute) '''
               «returnType» «valueName» = new «functionClassName.shortName»<«metaClassName», «returnType»>() {
                   public «returnType» apply(«metaClassName» modelElement) {
                   		«try {  xexp.compileForPropertyAssignement("returnedValue", "modelElement")  } catch(Exception e) { "// generation exception: " + e }»
                   }
               }.apply(«metaClassAttribute»); 
       '''
}
