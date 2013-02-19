package org.eclipselabs.spray.xtext.generator;

import javax.inject.Inject;

import org.eclipse.core.runtime.Assert;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipselabs.spray.xtext.generator.IFileSystemAccessUtil;

/**
 * Class to support generation of base and extension files.
 * 
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public class GenFile {
    protected IFileSystemAccess           fsa;

    protected final IFileSystemAccessUtil fsaUtil;

    @Inject
    public GenFile(IFileSystemAccessUtil fsaUtil) {
        this.fsaUtil = fsaUtil;
    }

    protected String fileName;

    protected String pathName;

    public boolean   hasExtensionPoint;

    public boolean extensionFileExists() {
        return fsaUtil.fileExists(fsa, IFileSystemAccess.DEFAULT_OUTPUT, pathName);
    }

    public void generateFile(String fileName, CharSequence contents) {
        Assert.isNotNull(fsa, "Need to set IFileSystemAccess first");
        fsa.generateFile(fileName, IFileSystemAccess.DEFAULT_OUTPUT, contents);
    }

    public void setAccess(IFileSystemAccess fsa) {
        this.fsa = fsa;
    }
}
