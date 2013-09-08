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
package org.eclipselabs.spray.shapes.ui.builder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

public class ShapeBuilderParticipant extends BuilderParticipant {

	@Override
	protected void handleChangedContents(Delta delta, IBuildContext context,
			EclipseResourceFileSystemAccess2 fileSystemAccess)
			throws CoreException {
		if ("shape".equals(delta.getUri().fileExtension())) {
			super.handleChangedContents(delta, context, fileSystemAccess);
		}
	}
}
