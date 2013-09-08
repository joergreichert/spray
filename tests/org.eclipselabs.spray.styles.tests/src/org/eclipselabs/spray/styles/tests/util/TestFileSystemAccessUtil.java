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
package org.eclipselabs.spray.styles.tests.util;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipselabs.spray.xtext.generator.filesystem.IFileSystemAccessUtil;

public class TestFileSystemAccessUtil implements IFileSystemAccessUtil {

	@Override
	public boolean fileExists(IFileSystemAccess fsa,
			String outputConfigurationName, String path) {
		return true;
	}
}
