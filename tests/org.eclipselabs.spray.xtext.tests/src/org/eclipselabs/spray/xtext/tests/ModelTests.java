package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ModelTests extends XtextTest {

	@Before
    public void before() {
    	EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eNS_URI, BusinessDomainDslPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap(true).put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/testcases/referenced/BusinessDomainDsl.genmodel"));
        suppressSerialization();
    }

    /**
     * Those models without create behavior rise a warning that is asserted by calling this method from tests.
     */
    private void withoutCreateBehaviorWarnings() {
        assertConstraints(issues.allOfThemContain("no create behavior"));
    }

    @Test
    public void test_01_minimal() {
        testFile("testcases/01-minimal.spray", "testcases/referenced/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_10_scoping() {
        testFile("testcases/scoping/10-scoping.spray", "testcases/referenced/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_11_scoping() {
        testFile("testcases/scoping/11-scoping.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_12_scoping() {
        testFile("testcases/scoping/12-scoping.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
    }

    @Test
    public void test_13_scoping() {
        testFile("testcases/scoping/13-scoping.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }


    @Test
    public void test_30_expression_text() {
        testFile("testcases/30-expression_text.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_31_expression_text() {
        testFile("testcases/31-expression_text.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_40_alias() {
        testFile("testcases/40-alias.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_43_alias() {
        testFile("testcases/43-alias.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_50_alias() {
        testFile("testcases/50-connection.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        withoutCreateBehaviorWarnings();
    }
}
