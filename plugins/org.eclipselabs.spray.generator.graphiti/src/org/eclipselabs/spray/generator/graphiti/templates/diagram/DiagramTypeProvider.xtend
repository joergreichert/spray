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
package org.eclipselabs.spray.generator.graphiti.templates.diagram

import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*


class DiagramTypeProvider extends FileGenerator<Diagram> {
    
    override CharSequence generateBaseFile(Diagram modelElement) {
        mainFile( modelElement, javaGenFile.baseClassName)
    }

    override CharSequence generateExtensionFile(Diagram modelElement) {
        mainExtensionPointFile( modelElement, javaGenFile.className)
    }

    def mainExtensionPointFile(Diagram diagram, String className) '''
        «extensionHeader(this)»
        package «diagram_package()»;
         
        public class «className» extends «className»Base {
         
        }
    '''

    def mainFile(Diagram diagram, String className) '''
        «header(this)»
        package «diagram_package()»;
        
        import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
        import org.eclipse.graphiti.tb.IToolBehaviorProvider;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractDiagramTypeProvider {
            protected IToolBehaviorProvider[] toolBehaviorProviders;
            «generate_additionalFields(diagram)»
        
            public «className»() {
                super();
                setFeatureProvider(new «diagram.name.toFirstUpper»FeatureProvider(this));
            }
        
            «overrideHeader»
            public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
                if (toolBehaviorProviders == null) {
                    toolBehaviorProviders =
                        new IToolBehaviorProvider[] { new «diagram.name.toFirstUpper»ToolBehaviorProvider(
                            this) };
                }
                return toolBehaviorProviders;
            }
            
            «generate_additionalMethods(diagram)»
        }
    '''

}