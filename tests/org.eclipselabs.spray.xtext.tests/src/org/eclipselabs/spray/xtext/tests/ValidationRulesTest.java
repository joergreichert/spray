package org.eclipselabs.spray.xtext.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ValidationRulesTest extends XtextTest {
    @Before
    public void before() {
        super.before();
        suppressSerialization();
    }

    @Test
    public void test_alias_01() {
        testFile("validation/alias-01.spray", "mod4j/BusinessDomainDsl.ecore");
        assertConstraints(issues.oneOfThemContains("Duplicate alias name line1"));
    }

    @Test
    public void test_alias_02() {
        testFile("validation/alias-02.spray", "mod4j/BusinessDomainDsl.ecore");
        assertConstraints(issues.oneOfThemContains("Duplicate alias name BC1"));
    }

    @Ignore
    @Test
    public void test_connection_01() {
        testFile("validation/connection-01.spray", "mod4j/BusinessDomainDsl.ecore");
        assertConstraints(issues.oneOfThemContains("Duplicate connection reference: associationsTo : connection ()"));
    }

    @Test
    public void test_connection_02() {
        testFile("validation/connection-02.spray", "mod4j/BusinessDomainDsl.ecore");
        // there are warnings due to missing create behavior, ignore them
        assertConstraints(issues.errorsOnly().theOneAndOnlyContains("Couldn't resolve reference to EReference 'businessRules'"));
        assertConstraints(issues.warningsOnly().sizeIs(2));
    }

    @Test
    public void test_import_notexists() {
        testFile("validation/import_notexists.spray", "mod4j/BusinessDomainDsl.ecore");
        assertConstraints(issues.errorsOnly().sizeIs(1));
        assertConstraints(issues.theOneAndOnlyContains("The import foo.bar cannot be resolved"));
    }
}
