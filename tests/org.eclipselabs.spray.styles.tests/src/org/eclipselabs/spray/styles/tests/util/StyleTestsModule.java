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
