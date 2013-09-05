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
package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess
import javax.inject.Inject
import org.eclipselabs.spray.generator.common.ProjectProperties

class SprayModelGenerator {
    @Inject extension PackageHelper
    
    def doGenerate (SprayProjectInfo info, IFileSystemAccess fsa) {
        fsa.generateFile(info.sprayModelDir+"/"+info.getDiagramTypeName + ProjectProperties::SPRAY_FILE_EXTENSION, info.projectName, generateModel(info))
        fsa.generateFile(info.sprayModelDir+"/"+info.getDiagramTypeName + ProjectProperties::SHAPES_FILE_EXTENSION, info.projectName, generateShapes(info))
        fsa.generateFile(info.sprayModelDir+"/"+info.getDiagramTypeName + ProjectProperties::STYLES_FILE_EXTENSION, info.projectName, generateStyles(info))
        fsa.generateFile(info.sprayModelDir+"/"+ ProjectProperties::SPRAY_PROPERTY_FILENAME, info.projectName, generateProperties(info))
    }
    
    def generateModel (SprayProjectInfo info) '''
        /*************************************************************************************
         *
         * Spray diagram definition
         * 
         * This file contains the definition of a graphical editor using the Spray Language.
         * Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.
         *
         * See also «info.getDiagramTypeName».properties to configure generator properties.
         *************************************************************************************/
        // Add import statements here
        import «getPackage(info.epackageURI, info.modelTypeName)».*
        
        diagram My«info.getDiagramTypeName» for «info.modelTypeName.substring(info.modelTypeName.lastIndexOf('.')+1)» style «info.getDiagramTypeName.toFirstUpper»DefaultStyle
        
        
        // Add class mappings here. Refer to EClasses here. Don't forget to configure a
        // dependency to the plugin defining the EMF metamodel in META-INF/MANIFEST.MF.
        // It is required to have a genmodel for the metamodel.
        //
        // Example class mapping:
        //   class BusinessClass icon "ecore/EClass.gif" {
        //     shape RectangleShape
        //     behavior {
        //       // Enable create feature for this class and add it to the palette "Shapes"
        //       create into types palette "Shapes";
        //     }
        //   }
        //
        // Example association mapping:
        //   class Association icon "connection16.gif" {
        //     connection ArrowConnection {
        //       from source;
        //       to target;
        //     }
        //   }
        
        
    '''
    
        def generateShapes (SprayProjectInfo info) '''
        /*************************************************************************************
         *
         * Spray shapes definition
         * 
         * This file contains the definition of graphical figures using the Shapes Language.
         * Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.
         *************************************************************************************/

        // Add definition of shapes here.
        // shape RectangleShape {
        //     rectangle {
        //         position(x=0,y=0)
        //         size(width=100,height=100)
        //     }
        // }
        
        // connection ArrowConnection {
        //     placing {
        //         position (offset=1.0)
        //         polygon {
        //             point (x=-10, y=-5)
        //             point (x=0, y=0)
        //             point (x=-10, y=5)
        //             style (background-color=black)
        //         }
        //     }
        // }
    '''
    
        def generateStyles (SprayProjectInfo info) '''
        /*************************************************************************************
         *
         * Spray styles definition
         * 
         * This file contains the definition of style classes using the Styles Language.
         * Refer to http://code.google.com/a/eclipselabs.org/p/spray/ for documentation.
         *************************************************************************************/
        
        // Add definition of styles here.
        style «info.getDiagramTypeName.toFirstUpper»DefaultStyle {
            description = "The default style of the «info.getDiagramTypeName» diagram type."
            // transparency = 0.95
            // background-color = black
            // line-color = black
            // line-style = solid
            // line-width = 1
            // font-color = black
            // font-name = "Tahoma"
            font-size = 12
            // font-bold = yes
        }
    '''
    
    def generateProperties (SprayProjectInfo info) '''
        modelFileExtension = «info.modelFileExtension»
        pluginId        = «info.projectName»
        mainPackage     = «info.getBasePackage»
        diagramPackage  = «info.getBasePackage».«info.diagramPackage»
        featurePackage  = «info.getBasePackage».«info.featurePackage»
        propertyPackage = «info.getBasePackage».«info.propertyPackage»
        stylesPackage   = «info.getBasePackage».«info.stylesPackage»
        gradientsPackage= «info.getBasePackage».«info.gradientsPackage»
        shapesPackage   = «info.getBasePackage».«info.shapesPackage»
        utilPackage     = org.eclipselabs.spray.runtime.graphiti.containers
        
        srcManPath      = «info.javaMainSrcDir»
        srcGenPath      = «info.javaGenSrcDir»
        resourceManPath = «info.resourceManDir»
        resourceGenPath = «info.resourceGenDir»
        projectPath     = ./«info.projectName»
        headerTimestamp = «info.createTimestamp»
    '''
    
}