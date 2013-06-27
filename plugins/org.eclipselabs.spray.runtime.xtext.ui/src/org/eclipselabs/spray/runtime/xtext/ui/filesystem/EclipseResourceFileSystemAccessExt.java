package org.eclipselabs.spray.runtime.xtext.ui.filesystem;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipselabs.spray.xtext.generator.IPostProcessor;

import javax.inject.Inject;
import com.google.inject.name.Named;

public class EclipseResourceFileSystemAccessExt extends EclipseResourceFileSystemAccess2 implements IAdaptable {
    @Inject
    @Named("java")
    private IPostProcessor javaPostProcessor;
    private IProject       project;

    @Override
    public void generateFile(String fileName, String outputName, CharSequence contents) {
        if (javaPostProcessor.accepts(fileName)) {
            contents = javaPostProcessor.process(fileName, contents);
        }
        super.generateFile(fileName, outputName, contents);
    }

    @Override
    public void setProject(IProject project) {
        super.setProject(project);
        this.project = project;
    }

    @Override
    public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
        if (IProject.class == adapter) {
            return project;
        }
        return null;
    }
}
