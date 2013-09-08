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
package org.eclipselabs.spray.generator.graphiti.templates

import javax.inject.Inject
import org.eclipse.emf.ecore.EClass
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.Diagram

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*
import org.eclipselabs.spray.xtext.generator.FileGenerator


class Filter extends FileGenerator<EClass> {
    @Inject extension NamingExtensions
    
    Diagram diagram
    
    def setDiagram(Diagram d){
        diagram = d
    }
    
    override CharSequence generateBaseFile(EClass modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(EClass modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }
    
    def mainExtensionPointFile(EClass eClass, String className) '''    
        «extensionHeader(this)»
        package «property_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
        
        }
    '''

    def mainFile(EClass eClass, String className) '''
        «header(this)»
        package «property_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.ui.platform.AbstractPropertySectionFilter;
        
        import «eClass.javaInterfaceName»;
        
        public class «className» extends AbstractPropertySectionFilter {
                 
            «overrideHeader»
            protected boolean accept(final PictogramElement pe) {
                final EObject eObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
                if (eObject instanceof «eClass.itfName») {
                    return true;
                }
                return false;
            }
        }
    '''
}