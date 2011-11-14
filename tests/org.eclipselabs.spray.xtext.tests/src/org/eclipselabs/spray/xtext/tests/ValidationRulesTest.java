package org.eclipselabs.spray.xtext.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
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
        assertConstraints(issues.theOneAndOnlyContains("Duplicate alias name line1"));
    }

    @Test
    public void test_alias_02() {
        testFile("validation/alias-02.spray", "mod4j/BusinessDomainDsl.ecore");
        assertConstraints(issues.oneOfThemContains("Duplicate alias name BC1"));
    }
}
