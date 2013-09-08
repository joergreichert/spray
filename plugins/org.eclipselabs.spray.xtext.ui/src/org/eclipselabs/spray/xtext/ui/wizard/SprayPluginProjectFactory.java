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
package org.eclipselabs.spray.xtext.ui.wizard;

import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.ui.util.PluginProjectFactory;

public class SprayPluginProjectFactory extends PluginProjectFactory {

    @Override
    protected void addMoreClasspathEntriesTo(List<IClasspathEntry> classpathEntries) {
        super.addMoreClasspathEntriesTo(classpathEntries);
        int index = -1;
        for (IClasspathEntry entry : classpathEntries) {
            if (entry.getEntryKind() == IClasspathEntry.CPE_CONTAINER && entry.getPath() != null && entry.getPath().toString().contains("JRE_CONTAINER")) {
                index = classpathEntries.indexOf(entry);
            }
        }
        if (index >= 0) {
            classpathEntries.remove(index);
            classpathEntries.add(index, JavaCore.newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.6"))); //$NON-NLS-1$
        }
    }

    /**
     * Changes:
     * - add .qualifier to version
     */
    @Override
    protected void createManifest(IProject project, IProgressMonitor progressMonitor) throws CoreException {
        final StringBuilder content = new StringBuilder("Manifest-Version: 1.0\n");
        content.append("Bundle-ManifestVersion: 2\n");
        content.append("Bundle-Name: " + projectName + "\n");
        content.append("Bundle-Vendor: My Company\n");
        content.append("Bundle-Version: 1.0.0.qualifier\n");
        content.append("Bundle-SymbolicName: " + projectName + "; singleton:=true\n");
        if (null != activatorClassName) {
            content.append("Bundle-Activator: " + activatorClassName + "\n");
        }
        content.append("Bundle-ActivationPolicy: lazy\n");

        addToContent(content, requiredBundles, "Require-Bundle");
        addToContent(content, exportedPackages, "Export-Package");
        addToContent(content, importedPackages, "Import-Package");

        content.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.6\n");

        final IFolder metaInf = project.getFolder("META-INF");
        SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 2);
        try {
            if (metaInf.exists())
                metaInf.delete(false, progressMonitor);
            metaInf.create(false, true, subMonitor.newChild(1));
            createFile("MANIFEST.MF", metaInf, content.toString(), subMonitor.newChild(1));
        } finally {
            subMonitor.done();
        }
    }

}
