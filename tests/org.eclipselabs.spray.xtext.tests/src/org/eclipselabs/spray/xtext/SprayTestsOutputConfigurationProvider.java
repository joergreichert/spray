package org.eclipselabs.spray.xtext;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipselabs.spray.xtext.generator.outputconfig.SprayOutputConfigurationProvider;

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
