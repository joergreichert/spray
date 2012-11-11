package org.eclipselabs.spray.styles.ui.builder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

public class StyleBuilderParticipant extends BuilderParticipant {

	@Override
	protected void handleChangedContents(Delta delta, IBuildContext context,
			EclipseResourceFileSystemAccess2 fileSystemAccess)
			throws CoreException {
		if ("style".equals(delta.getUri().fileExtension())) {
			super.handleChangedContents(delta, context, fileSystemAccess);
		}
	}
}