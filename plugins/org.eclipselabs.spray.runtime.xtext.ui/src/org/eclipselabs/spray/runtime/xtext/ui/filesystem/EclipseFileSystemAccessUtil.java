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
package org.eclipselabs.spray.runtime.xtext.ui.filesystem;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipselabs.spray.xtext.generator.EclipseHelpers;
import org.eclipselabs.spray.xtext.generator.filesystem.JavaIoFileSystemAccessUtil;

import javax.inject.Inject;

public class EclipseFileSystemAccessUtil extends JavaIoFileSystemAccessUtil {

    @Inject
    public EclipseFileSystemAccessUtil(IOutputConfigurationProvider outputConfigurationProvider) {
        super(outputConfigurationProvider);
    }

    @Override
    public boolean fileExists(IFileSystemAccess fsa, String outputConfigurationName, String path) {
        IPath p = new Path(getOutputConfiguration(outputConfigurationName).getOutputDirectory() + "/" + path);
        if (fsa instanceof IAdaptable) {
            IProject project = (IProject) ((IAdaptable) fsa).getAdapter(IProject.class);
            p = project.getFullPath().append(p);
        }
        return EclipseHelpers.getIFile(p).exists();
    }

}
