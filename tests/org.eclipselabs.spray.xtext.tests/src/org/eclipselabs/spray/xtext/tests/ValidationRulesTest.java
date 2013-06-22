package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.validation.Issue;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ValidationRulesTest extends XtextTest {

	@Before
    public void before() {
        suppressSerialization();
		EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eNS_URI, BusinessDomainDslPackage.eINSTANCE);
        EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE);

        EcorePlugin.getEPackageNsURIToGenModelLocationMap(true).put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath:/testcases/referenced/BusinessDomainDsl.genmodel"));
    }

    @Test
    public void test_alias_01() {
        testFile("testcases/validation/alias-01.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        assertConstraints(issues.oneOfThemContains("Duplicate alias name Class1"));
    }

    @Test
    public void test_alias_02() {
        testFile("testcases/validation/alias-02.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        assertConstraints(issues.oneOfThemContains("Duplicate alias name BC1"));
    }

    @Test
    public void test_connection_01() {
        testFile("testcases/validation/connection-01.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        assertConstraints(issues.oneOfThemContains("Duplicate connection reference: associationsTo"));
    }

    @Test
    public void test_connection_02() {
        testFile("testcases/validation/connection-02.spray", "testcases/referenced/BusinessDomainDsl.ecore", "testcases/referenced/test.shape");
        assertConstraints(issues.errorsOnly().theOneAndOnlyContains("Couldn't resolve reference to EReference 'businessRules'"));
    }

    @Test
    public void test_import_notexists() {
        testFile("testcases/validation/import_notexists.spray", "testcases/referenced/BusinessDomainDsl.ecore");
        assertConstraints(issues.errorsOnly().sizeIs(1));
        assertConstraints(issues.theOneAndOnlyContains("The import foo.bar cannot be resolved"));
    }
}
