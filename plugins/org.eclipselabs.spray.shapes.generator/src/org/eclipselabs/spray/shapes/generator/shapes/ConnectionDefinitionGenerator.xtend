package org.eclipselabs.spray.shapes.generator.shapes

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition
import org.eclipselabs.spray.xtext.generator.FileGenerator
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile

class ConnectionDefinitionGenerator extends FileGenerator<ConnectionDefinition> {
	@Inject extension GeneratorConnectionDefinition

	override generate(ConnectionDefinition connectionDefinition, GenFile genFile) {
		(genFile as JavaGenFile).setPackageAndClass(packageName, connectionDefinition.gapClassName)
		super.generate(connectionDefinition, genFile)
	}

    override CharSequence generateBaseFile(ConnectionDefinition connectionDefinition) {
    	compile(connectionDefinition)
    }

    override CharSequence generateExtensionFile(ConnectionDefinition connectionDefinition) {
        mainExtensionPointFile(connectionDefinition)
    }

    def mainExtensionPointFile(ConnectionDefinition connectionDefinition) '''
        «extensionHeader(this)»
        package «packageName»;
         
        import org.eclipse.graphiti.features.IFeatureProvider;
         
        public class «connectionDefinition.gapClassName» extends «connectionDefinition.className» {
         
            public «connectionDefinition.gapClassName»(IFeatureProvider fp) {
        		super(fp);
        	}
        }
    '''
}