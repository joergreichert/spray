package org.eclipselabs.spray.xtext.builder;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.DerivedResourceMarkers;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.xtext.generator.outputconfig.SprayOutputConfiguration;

import javax.inject.Inject;

public class SprayBuilderParticipant extends BuilderParticipant {
    @Inject
    private DerivedResourceMarkers derivedResourceMarkers;

    @Override
    protected void refreshOutputFolders(IBuildContext ctx, Map<String, OutputConfiguration> outputConfigurations, IProgressMonitor monitor) throws CoreException {
        SubMonitor subMonitor = SubMonitor.convert(monitor, outputConfigurations.size());
        for (OutputConfiguration config : outputConfigurations.values()) {
            SubMonitor child = subMonitor.newChild(1);
            final IProject project = ctx.getBuiltProject();
            if (!isOutputToProjectRoot(config)) {
                IFolder folder = project.getFolder(config.getOutputDirectory());
                folder.refreshLocal(getRefreshDepth(config), child);
            } else {
                project.refreshLocal(getRefreshDepth(config), child);
            }
        }
    }

    @Override
    protected void cleanOutput(IBuildContext ctx, OutputConfiguration config, IProgressMonitor monitor) throws CoreException {
        final IProject project = ctx.getBuiltProject();
        IContainer container = project;
        if (!isOutputToProjectRoot(config)) {
            container = project.getFolder(config.getOutputDirectory());
            if (!container.exists())
                return;
        }
        if (config.isCanClearOutputDirectory()) {
            for (IResource resource : container.members())
                resource.delete(IResource.KEEP_HISTORY, monitor);
        } else {
            if (config.isCleanUpDerivedResources()) {
                List<IFile> resources = derivedResourceMarkers.findDerivedResources(container, null);
                for (IFile iFile : resources) {
                    iFile.delete(IResource.KEEP_HISTORY, monitor);
                }
            }
        }
        super.cleanOutput(ctx, config, monitor);
    }

    /**
     * @return <code>true</code> when the output goes to the project root.
     */
    private boolean isOutputToProjectRoot(OutputConfiguration config) {
        if (StringExtensions.isNullOrEmpty(config.getOutputDirectory()))
            return true;
        if (".".equals(config.getOutputDirectory()) || "./".equals(config.getOutputDirectory()))
            return true;
        return false;
    }

    private int getRefreshDepth(OutputConfiguration config) {
        if (config instanceof SprayOutputConfiguration) {
            return ((SprayOutputConfiguration) config).getRefreshDepth();
        } else {
            return IResource.DEPTH_INFINITE;
        }
    }
}
