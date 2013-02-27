package org.eclipselabs.spray.xtext.generator.outputconfig;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

import com.google.common.collect.Sets;

/**
 * Configuration of output locations and settings for code generation.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class SprayOutputConfigurationProvider implements IOutputConfigurationProvider {
    public static String                          OUTPUTCONFIG_SRCGEN = IFileSystemAccess.DEFAULT_OUTPUT;
    public static String                          OUTPUTCONFIG_SRCMAN = "SRCMAN";
    public static String                          OUTPUTCONFIG_PLUGIN = "PLUGIN";

    private final static Set<OutputConfiguration> CONFIGURATIONS      = Sets.newHashSet();
    static {
        OutputConfiguration srcGenOutput = new OutputConfiguration(OUTPUTCONFIG_SRCGEN);
        srcGenOutput.setDescription("Folder for generated Java sources");
        srcGenOutput.setOutputDirectory("./src-gen");
        srcGenOutput.setOverrideExistingResources(true);
        srcGenOutput.setCreateOutputDirectory(true);
        srcGenOutput.setCleanUpDerivedResources(true);
        srcGenOutput.setSetDerivedProperty(true);
        CONFIGURATIONS.add(srcGenOutput);

        OutputConfiguration srcManOutput = new OutputConfiguration(OUTPUTCONFIG_SRCMAN);
        srcManOutput.setDescription("Folder for manual Java sources");
        srcManOutput.setOutputDirectory("./src");
        srcManOutput.setOverrideExistingResources(false);
        srcManOutput.setCreateOutputDirectory(false);
        srcManOutput.setCleanUpDerivedResources(false);
        srcManOutput.setSetDerivedProperty(false);
        CONFIGURATIONS.add(srcManOutput);
        /*
         * SprayOutputConfiguration srcPluginOutput = new SprayOutputConfiguration(OUTPUTCONFIG_PLUGIN);
         * srcPluginOutput.setDescription("Folder for plugin root sources (e.g. plugin.xml)");
         * srcPluginOutput.setOutputDirectory("./");
         * srcPluginOutput.setOverrideExistingResources(true);
         * srcPluginOutput.setCreateOutputDirectory(false);
         * srcPluginOutput.setCleanUpDerivedResources(false);
         * srcPluginOutput.setSetDerivedProperty(false);
         * srcPluginOutput.setDepth(1);
         */
    }

    @Override
    public Set<OutputConfiguration> getOutputConfigurations() {
        return CONFIGURATIONS;
    }

}
