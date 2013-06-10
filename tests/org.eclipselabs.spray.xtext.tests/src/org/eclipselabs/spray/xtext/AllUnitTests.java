package org.eclipselabs.spray.xtext;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    org.eclipselabs.spray.xtext.customizing.QualifiedNameValueConverterTest.class, 
    org.eclipselabs.spray.xtext.formatting.SprayFormatterTest.class, 
    org.eclipselabs.spray.xtext.scoping.ModelResourceVisitorTest.class, 
    org.eclipselabs.spray.xtext.scoping.PackageSelectorTest.class, 
    org.eclipselabs.spray.xtext.tests.Mod4jTest.class, 
    org.eclipselabs.spray.xtext.tests.ModelTests.class, 
    org.eclipselabs.spray.xtext.tests.SprayFormatterTest.class,
    org.eclipselabs.spray.xtext.tests.SprayScopingTest.class,
    org.eclipselabs.spray.xtext.tests.SprayValidationTest.class,
    org.eclipselabs.spray.xtext.tests.ValidationRulesTest.class, 
    org.eclipselabs.spray.xtext.util.GenModelHelperTest.class})
public class AllUnitTests {

}
