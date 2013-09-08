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
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*

class PasteFeature extends FileGenerator<Diagram>{

    @Inject extension NamingExtensions
    @Inject extension MetaClassExtensions

    override generateExtensionFile(Diagram modelElement) {
        modelElement.mainExtensionPointFile(javaGenFile.className);
    }

    override generateBaseFile(Diagram modelElement) {
        modelElement.mainFile(javaGenFile.baseClassName)
    }

    def mainExtensionPointFile(Diagram metaClass, String className) '''
        «extensionHeader(this)»
        package «feature_package()»;

        import org.eclipse.graphiti.features.IFeatureProvider;

        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «feature_package()»;

        import org.eclipse.emf.ecore.util.EcoreUtil;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IPasteContext;
        import org.eclipse.graphiti.features.context.impl.AddContext;
        import org.eclipse.graphiti.mm.Property;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractPasteFeature;
        // MARKER_IMPORT

        public abstract class «className» extends AbstractPasteFeature  {
            «generate_additionalFields(diagram)»

            protected «diagram.modelServiceClassName.shortName» modelService;

            public «className»(IFeatureProvider fp) {
                super(fp);
                modelService = «diagram.modelServiceClassName.shortName».getModelService(fp.getDiagramTypeProvider());
            }

            «generate_canPaste(diagram)»
            «generate_paste(diagram)»
            «generate_addBusinessObjectToContainer(diagram)»
        }
    '''

    def generate_canPaste(Diagram diagram)'''
        «overrideHeader»
        public boolean canPaste(IPasteContext context) {
            // TODO: only support pasting directly in the diagram
            PictogramElement[] pes = context.getPictogramElements();
            if (pes.length != 1 || !(pes[0] instanceof Diagram)) {
                return false;
            }
            // can paste, if all objects on the clipboard are PictogramElements with link on subclasses of «diagram.modelType.itfName»
            Object[] fromClipboard = getFromClipboard();
            if (fromClipboard == null || fromClipboard.length == 0) {
                return false;
            }
            for (Object object : fromClipboard) {
                if (!(object instanceof PictogramElement)) {
                    return false;
                } else if(!(getBusinessObjectForPictogramElement((PictogramElement) object) instanceof «diagram.modelType.itfName»)) {
                    return false;
                }
            }
            return true;
        }
    '''

    def generate_paste(Diagram diagram)'''
        «overrideHeader»
        public void paste(IPasteContext context) {
            // already verified, that pasting is allowed just directly in the diagram
            PictogramElement[] pes = context.getPictogramElements();
            Diagram diagram = (Diagram) pes[0];

            // get the PictogramElements from the clipboard and the linked business object.
            Object[] objects = getFromClipboard();
            for (Object object : objects) {
                PictogramElement pictogramElement = (PictogramElement) object;
                «diagram.modelType.itfName» boRef = («diagram.modelType.itfName») getBusinessObjectForPictogramElement(pictogramElement);
                «diagram.modelType.itfName» bo = EcoreUtil.copy(boRef);
                addBusinessObjectToContainer(bo, pictogramElement);

                // create a new AddContext for the creation of a new shape.
                AddContext ac = new AddContext(new AddContext(), bo);
                ac.setLocation(0, 0); // for simplicity paste at (0, 0)
                ac.setTargetContainer(diagram); // paste on diagram
                // copy all properties from the shape (e.g. ALIAS etc.)
                for(Property prop : pictogramElement.getProperties()) {
                    ac.putProperty(prop.getKey(), prop.getValue());
                }
                getFeatureProvider().addIfPossible(ac);
            }
        }
    '''

    def generate_addBusinessObjectToContainer(Diagram diagram) {
    '''
        protected void addBusinessObjectToContainer(«diagram.modelType.itfName» bo, PictogramElement pe) {
            final «diagram.modelType.itfName» model = modelService.getModel();
            final String alias = Graphiti.getPeService().getPropertyValue(pe, PROPERTY_ALIAS);
            «FOR cls : diagram.metaClasses»
            if(«generate_metaClassSwitchCondition(cls)») {
                «IF cls.hasCreateBehavior && (cls.createBehavior != null) && (cls.createBehavior.containmentReference != null) »
                    «val containmentRef = cls.createBehavior.containmentReference»
                    «IF containmentRef.many»
                        model.get«containmentRef.name.toFirstUpper»().add((«cls.getCast()») bo);
                    «ELSE»
                        model.set«containmentRef.name.toFirstUpper»((«cls.getCast()») bo);
                    «ENDIF»
                «ELSE»
                    throw new UnsupportedOperationException("No create behavior defined");
                «ENDIF»
            }
            «ENDFOR»
        }
    '''
    }

    def getCast(MetaClass cls) '''«cls.type.itfName»'''


    def generate_metaClassSwitchCondition(MetaClass cls)
        '''bo.eClass() == «cls.type.literalConstant» && «IF cls.alias==null»alias == null«ELSE»"«cls.alias»".equals(alias)«ENDIF»'''

}
