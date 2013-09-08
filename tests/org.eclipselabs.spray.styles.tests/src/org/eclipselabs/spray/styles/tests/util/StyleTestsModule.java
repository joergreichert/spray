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
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.xtext.generator.filesystem.IFileSystemAccessUtil;

/**
 * Add any test related bindings / overwriting of bindings here.
 * 
 * @author Karsten Thoms (karsten.thoms@gmail.com)
 */
public class StyleTestsModule extends AbstractGenericModule {
    public Class<? extends IFileSystemAccess> bindIFileSystemAccess() {
        return JavaIoFileSystemAccess.class;
    }
    public Class<? extends IFileSystemAccessUtil> bindIFileSystemAccessUtil() {
        return TestFileSystemAccessUtil.class;
    }
}
