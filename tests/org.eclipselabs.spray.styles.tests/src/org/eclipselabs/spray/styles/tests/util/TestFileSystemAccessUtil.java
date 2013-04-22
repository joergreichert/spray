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
