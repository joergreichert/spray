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
package org.eclipselabs.spray.xtext.generator.filesystem;

import java.io.File;
import java.util.Map;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

import com.google.common.collect.Maps;
import javax.inject.Inject;

public class JavaIoFileSystemAccessUtil implements IFileSystemAccessUtil {
    @Inject
    IOutputConfigurationProvider             outputConfigurationProvider;
    private Map<String, OutputConfiguration> outputConfigurations;

    @Inject
    public JavaIoFileSystemAccessUtil(IOutputConfigurationProvider outputConfigurationProvider) {
        this.outputConfigurationProvider = outputConfigurationProvider;
    }

    @Override
    public boolean fileExists(IFileSystemAccess fsa, String outputConfigurationName, String path) {
        final String fullPath = getOutputConfiguration(outputConfigurationName).getOutputDirectory() + "/" + path;
        final File f = new File(fullPath);
        return f.exists() && f.isFile();
    }

    protected OutputConfiguration getOutputConfiguration(String key) {
        if (outputConfigurations == null) {
            outputConfigurations = Maps.newHashMap();
            for (OutputConfiguration out : outputConfigurationProvider.getOutputConfigurations()) {
                outputConfigurations.put(out.getName(), out);
            }
        }
        return outputConfigurations.get(key);
    }
}
