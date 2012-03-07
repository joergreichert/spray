package org.eclipselabs.spray.xtext;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipselabs.spray.generator.graphiti.util.SprayOutputConfigurationProvider;

/**
 * Redirects output to System Temp folder
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class SprayTestsOutputConfigurationProvider extends SprayOutputConfigurationProvider {
    @Override
    public Set<OutputConfiguration> getOutputConfigurations() {
        Set<OutputConfiguration> configs = super.getOutputConfigurations();

        return configs;
    }
}
