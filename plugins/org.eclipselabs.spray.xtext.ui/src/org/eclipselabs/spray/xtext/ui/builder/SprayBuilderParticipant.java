package org.eclipselabs.spray.xtext.ui.builder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

public class SprayBuilderParticipant extends BuilderParticipant {

    @Override
    protected void handleChangedContents(Delta delta, IBuildContext context, EclipseResourceFileSystemAccess2 fileSystemAccess) throws CoreException {
        if ("spray".equals(delta.getUri().fileExtension()) && delta.haveEObjectDescriptionsChanged()) {
            super.handleChangedContents(delta, context, fileSystemAccess);
        }
    }
}
