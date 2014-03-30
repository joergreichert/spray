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

import org.eclipselabs.spray.mm.spray.CustomBehavior
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*


class CustomFeature extends FileGenerator<CustomBehavior>  {
    
    override CharSequence generateBaseFile(CustomBehavior modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(CustomBehavior modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(CustomBehavior metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        
        public class «className» extends «className»Base {
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        
            «overrideHeader»
            public void execute(final ICustomContext context, final EObject object) {
                // TODO add code here.
            }
        
        }
    '''

    def mainFile(CustomBehavior behavior, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractCustomFeature;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractCustomFeature {
            «generate_additionalFields(behavior)»
        
            public «className»(final IFeatureProvider fp) {
                super(fp);
            }
        
            «overrideHeader»
            public String getName() {
                return "«behavior.label»"; //$NON-NLS-1$
            }
        
            «overrideHeader»
            public String getDescription() {
                return "«behavior.label» description"; //$NON-NLS-1$
            }
        
            «generate_canExecute(behavior)»
            «generate_execute(behavior)»
            «generate_additionalMethods(behavior)»
        }
    '''
    
    def generate_canExecute (CustomBehavior behavior) '''
        «overrideHeader»
        public boolean canExecute(final ICustomContext context) {
            // allow rename if exactly one pictogram element
            // representing an EClass is selected
            boolean ret = true;
            final PictogramElement[] pes = context.getPictogramElements();
            if (pes != null && pes.length == 1) {
                final EObject bo = (EObject) getBusinessObjectForPictogramElement(pes[0]);
                ret = canExecute (context, bo);
            }
            return ret;
        } 

        protected boolean canExecute(final ICustomContext context, final EObject bo) {
            return true;
        }
    '''
    
    def generate_execute (CustomBehavior behavior) '''
        «overrideHeader»
        public void execute(final ICustomContext context) {
            final PictogramElement[] pes = context.getPictogramElements();
            if (pes != null && pes.length == 1) {
                final EObject bo = (EObject) getBusinessObjectForPictogramElement(pes[0]);
                execute(context, bo);
            }
        }
        
        public abstract void execute(ICustomContext context, EObject object);
    '''
}