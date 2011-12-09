package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.generator.graphiti.util.ImportUtil

class FileGenerator extends TemplateUtil {
    @Inject ImportUtil importUtil
    extension GenFile genFile
    extension JavaGenFile javaGenFile

    def getJavaGenFile() {
        return javaGenFile
    }
    
    def CharSequence generateBaseFile(EObject modelElement) {
    }

    def CharSequence generateExtensionFile(EObject modelElement) {
    }
        
    def generate(EObject modelElement, GenFile genFile) {
        this.genFile = genFile
        
        if( genFile instanceof JavaGenFile){
            javaGenFile = (genFile as JavaGenFile)
        } else {
        	javaGenFile = null
        }
        
        val organizeImports = [String s1| s1.replace("// MARKER_IMPORT", importUtil.printImports) ]
        var String fileContent
        if(javaGenFile!=null && javaGenFile.hasExtensionPoint){
            importUtil.initImports(javaGenFile.packageName)
            if( javaGenFile.extensionFileExists ){
                println("Not regenerating extension point [" + javaGenFile.fileName + "]")
            } else {
                println("generating " + javaGenFile.getPathName)
                fileContent = generateExtensionFile(modelElement).toString
                fileContent = organizeImports.apply(fileContent) 
                javaGenFile.fsa.generateFile(javaGenFile.getPathName, fileContent)
            }
        }
        if (javaGenFile!=null) {
            if (javaGenFile.hasExtensionPoint) {
                importUtil.initImports(javaGenFile.packageName)
                println("generating 1 " + javaGenFile.getBasePathName + " from " + this.getClass().name)
                fileContent = generateBaseFile(modelElement).toString
                fileContent = organizeImports.apply(fileContent) 
                genFile.fsa.generateFile(javaGenFile.basePathName, fileContent)
            } else {
                importUtil.initImports(javaGenFile.packageName)
                println("generating 2 " + javaGenFile.pathName + " from " + this.getClass().name)
                fileContent = generateBaseFile(modelElement).toString
                fileContent = organizeImports.apply(fileContent) 
                genFile.fsa.setOutputPath(javaGenFile.getGenOutputPath());
                genFile.fsa.generateFile(javaGenFile.pathName, fileContent)
            }
        } else {
            fileContent = generateBaseFile(modelElement).toString
        }
    }
    
    /**
     * Call this template as a hook in a (Java) class body were additional fields or constants can be generated.
     */
    def CharSequence generate_additionalFields (EObject context) {} 
    /**
     * Call this template as a hook in a (Java) class body were additional methods can be generated.
     */
    def CharSequence generate_additionalMethods (EObject context) {} 
    
    //---------------------------------------------------------------------------------------------
    // delegate methods from ImportUtil
    //---------------------------------------------------------------------------------------------
} 