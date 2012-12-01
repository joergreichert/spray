package org.eclipselabs.spray.generator.graphiti.tests

import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import javax.inject.Inject
import javax.inject.Named
import org.eclipselabs.spray.xtext.generator.IPostProcessor
import org.eclipse.xtext.generator.IOutputConfigurationProvider

class InMemoryFilesystemAccessExt extends InMemoryFileSystemAccess {
    @Inject
    @Named("java")
    private IPostProcessor               javaPostProcessor;
    @Inject
    private IOutputConfigurationProvider configurationProvider;
    private boolean                      init;

    override generateFile(String fileName, String outputConfigName, CharSequence contents) {
        if (!init) {
            initOutputConfigurations();
            init = true;
        }
        var localContents = contents
        if (javaPostProcessor.accepts(fileName)) {
            localContents = javaPostProcessor.process(fileName, contents);
        }
        super.generateFile(fileName, outputConfigName, localContents);
    }

    def private initOutputConfigurations() {
        for (out : configurationProvider.getOutputConfigurations()) {
            getOutputConfigurations().put(out.getName(), out);
        }
    }	
}