package org.eclipselabs.spray.xtext.formatting;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.IBusinessDomainDslPackage;

@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class SprayFormatterTest extends XtextTest {
    
	@BeforeClass
    public static void init() {
    	EPackage.Registry.INSTANCE.put(IBusinessDomainDslPackage.eNS_URI, IBusinessDomainDslPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(IBusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
    }

    @Test
    public void test_toString() {
    	
    }

}
