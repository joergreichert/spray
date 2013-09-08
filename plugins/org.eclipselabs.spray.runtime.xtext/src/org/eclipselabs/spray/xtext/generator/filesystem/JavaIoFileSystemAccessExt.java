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

import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipselabs.spray.xtext.generator.IPostProcessor;

import javax.inject.Inject;
import com.google.inject.name.Named;

public class JavaIoFileSystemAccessExt extends JavaIoFileSystemAccess {
    @Inject
    @Named("java")
    private IPostProcessor               javaPostProcessor;
    @Inject
    private IOutputConfigurationProvider configurationProvider;
    private boolean                      init;

    @Override
    public void generateFile(String fileName, String outputConfigName, CharSequence contents) {
        if (!init) {
            initOutputConfigurations();
            init = true;
        }
        if (javaPostProcessor.accepts(fileName)) {
            contents = javaPostProcessor.process(fileName, contents);
        }
        super.generateFile(fileName, outputConfigName, contents);
    }

    private void initOutputConfigurations() {
        for (OutputConfiguration out : configurationProvider.getOutputConfigurations()) {
            getOutputConfigurations().put(out.getName(), out);
        }
    }

}
