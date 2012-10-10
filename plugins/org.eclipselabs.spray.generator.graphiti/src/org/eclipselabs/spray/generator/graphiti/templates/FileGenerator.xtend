package org.eclipselabs.spray.generator.graphiti.templates

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.xtext.generator.ImportUtil

class FileGenerator<T super EObject> extends TemplateUtil {
    @Inject ImportUtil importUtil
    extension GenFile genFile
    extension JavaGenFile javaGenFile

    def getJavaGenFile() {
        return javaGenFile
    }
    
    def CharSequence generateBaseFile(T modelElement) {
    }

    def CharSequence generateExtensionFile(T modelElement) {
    }
        
    def generate(T modelElement, GenFile genFile) {
        this.genFile = genFile
        
        if( genFile instanceof JavaGenFile){
            javaGenFile = (genFile as JavaGenFile)
        } else {
            javaGenFile = null
        }
        
        var String fileContent
//        if(javaGenFile!=null && javaGenFile.hasExtensionPoint){
//        }
        if (javaGenFile!=null) {
            val organizeImports = [String s1| s1.replace("// MARKER_IMPORT", importUtil.printImports) ]
            if (javaGenFile.hasExtensionPoint) {
                if( javaGenFile.extensionFileExists ){
                    println("Not regenerating extension point [" + javaGenFile.fileName + "]")
                } else {
                    println("generating " + javaGenFile.getPathName)
                    importUtil.initImports(javaGenFile.packageName)
                    fileContent = generateExtensionFile(modelElement).toString
                    fileContent = organizeImports.apply(fileContent) 
                    javaGenFile.generateBaseFile(javaGenFile.getPathName, fileContent)
                }
                println("generating 1 " + javaGenFile.getBasePathName + " from " + this.getClass().name)
                importUtil.initImports(javaGenFile.packageName)
                fileContent = generateBaseFile(modelElement).toString
                fileContent = organizeImports.apply(fileContent) 
                genFile.generateFile(javaGenFile.basePathName, fileContent)
            } else {
                println("generating 2 " + javaGenFile.pathName + " from " + this.getClass().name)
                importUtil.initImports(javaGenFile.packageName)
                fileContent = generateBaseFile(modelElement).toString
                fileContent = organizeImports.apply(fileContent) 
                // genFile.fsa.setOutputPath(javaGenFile.getGenOutputPath());
                genFile.generateFile(javaGenFile.pathName, fileContent)
            }
        } else {
            fileContent = generateBaseFile(modelElement).toString
        }
    }
    
    /**
     * Call this template as a hook in a (Java) class body were additional fields or constants can be generated.
     */
    def CharSequence generate_additionalFields (T context) {} 
    /**
     * Call this template as a hook in a (Java) class body were additional methods can be generated.
     */
    def CharSequence generate_additionalMethods (T context) {} 
    
    //---------------------------------------------------------------------------------------------
    // delegate methods from ImportUtil
    //---------------------------------------------------------------------------------------------
} 