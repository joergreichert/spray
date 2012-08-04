package org.eclipselabs.spray.generator.graphiti.tests;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.namespace.impl.XMLNamespacePackageImpl;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.xtext.util.GenModelHelper;

/**
 * Add any test related bindings / overwriting of bindings here.
 * 
 * @author Karsten Thoms (karsten.thoms@gmail.com)
 */
public class SprayTestsModule extends AbstractGenericModule {
    static class TestGenModelHelper extends GenModelHelper {
        @Override
        public String getJavaInterfaceName(EClass eClass) {
            return "samplepackage." + eClass.getName();
        }
    }

    public Class<? extends IFileSystemAccess> bindIFileSystemAccess() {
        return JavaIoFileSystemAccess.class;
    }

    public Class<? extends GenModelHelper> bindGenModelHelper() {
        return TestGenModelHelper.class;
    }
    
    public Class<? extends XMLNamespacePackage> bindXMLNamespacePackage() {
        return XMLNamespacePackageImpl.class;
    }
}
