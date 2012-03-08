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
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ModelTests extends XtextTest {
    @BeforeClass
    public static void init() {
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap().put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/mod4j/BusinessDomainDsl.genmodel"));
    }

    @Before
    public void before() {
        super.before();
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
        testFile("testcases/01-minimal.spray", "mod4j/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_10_scoping() {
        testFile("testcases/10-scoping.spray", "mod4j/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_11_scoping() {
        testFile("testcases/11-scoping.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_12_scoping() {
        testFile("testcases/12-scoping.spray", "mod4j/BusinessDomainDsl.ecore");
    }

    @Test
    public void test_13_scoping() {
        testFile("testcases/13-scoping.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_20_color() {
        testFile("testcases/20-color.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_21_color() {
        testFile("testcases/21-color.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_22_color() {
        testFile("testcases/22-color.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_23_color() {
        testFile("testcases/23-color.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_30_expression_text() {
        testFile("testcases/30-expression_text.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_31_expression_text() {
        testFile("testcases/31-expression_text.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_40_alias() {
        testFile("testcases/40-alias.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_41_alias() {
        testFile("testcases/41-alias.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_42_alias() {
        testFile("testcases/42-alias.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_43_alias() {
        testFile("testcases/43-alias.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_44_alias() {
        testFile("testcases/44-alias.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_45_alias() {
        testFile("testcases/45-alias.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }

    @Test
    public void test_50_alias() {
        testFile("testcases/50-connection.spray", "mod4j/BusinessDomainDsl.ecore");
        withoutCreateBehaviorWarnings();
    }
}
