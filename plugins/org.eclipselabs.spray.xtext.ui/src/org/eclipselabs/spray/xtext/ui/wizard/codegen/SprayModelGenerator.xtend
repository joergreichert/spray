package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipselabs.spray.xtext.ui.wizard.SprayProjectInfo
import org.eclipse.xtext.generator.IFileSystemAccess
import com.google.inject.Inject

class SprayModelGenerator {
	@Inject extension PackageHelper
	
    def doGenerate (SprayProjectInfo info, IFileSystemAccess fsa) {
        val project = info.projectName
        fsa.generateFile(info.sprayModelDir+"/"+info.getDiagramTypeName + ".spray", info.projectName, generateModel(info))
        fsa.generateFile(info.sprayModelDir+"/"+info.getDiagramTypeName + ".properties", info.projectName, generateProperties(info))
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
        // Add import statements here, e.g.
        // import «info.modelTypeName.substring(0, info.modelTypeName.lastIndexOf('.'))».*
        import «getPackage(info.epackageURI, info.modelTypeName)».*
        
        diagram «info.getDiagramTypeName» for «info.modelTypeName.substring(info.modelTypeName.lastIndexOf('.')+1)»
        
        
        // Add class mappings here. Refer to EClasses here. Don't forget to configure a
        // dependency to the plugin defining the EMF metamodel in META-INF/MANIFEST.MF.
        // It is required to have a genmodel for the metamodel. If the Ecore model lies in
        // a workspace project, this project must have the Xtext nature.
        //
        // Example class mapping:
        //   class BusinessClass:
        //     container  ( fill=dark_green ) 
        //     {
        //       text ( )  { "<<"+eClass.name+">> " + name};
        //     }
        //     behavior {
        //       // Enable create feature for this class and add it to the palette "Shapes"
        //       create into types palette "Shapes";
        //     }
        
    '''
    
    def generateProperties (SprayProjectInfo info) '''
        modelFileExtension = «info.modelFileExtension»
        pluginId        = «info.projectName»
        mainPackage     = «info.getBasePackage»
        diagramPackage  = «info.getBasePackage».«info.diagramPackage»
        featurePackage  = «info.getBasePackage».«info.featurePackage»
        propertyPackage = «info.getBasePackage».«info.propertyPackage»
        stylesPackage   = «info.getBasePackage».«info.stylesPackage»
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