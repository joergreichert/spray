package org.eclipselabs.spray.styles.tests.util;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;

/**
 * Add any test related bindings / overwriting of bindings here.
 * 
 * @author Karsten Thoms (karsten.thoms@gmail.com)
 */
public class StyleTestsModule extends AbstractGenericModule {
    public Class<? extends IFileSystemAccess> bindIFileSystemAccess() {
        return JavaIoFileSystemAccess.class;
    }

}
