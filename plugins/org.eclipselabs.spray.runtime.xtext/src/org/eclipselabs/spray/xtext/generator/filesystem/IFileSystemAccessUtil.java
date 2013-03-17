package org.eclipselabs.spray.xtext.generator.filesystem;

import org.eclipse.xtext.generator.IFileSystemAccess;

import com.google.inject.ImplementedBy;

@ImplementedBy(JavaIoFileSystemAccessUtil.class)
public interface IFileSystemAccessUtil {
    boolean fileExists(IFileSystemAccess fsa, String outputConfigurationName, String path);
}
