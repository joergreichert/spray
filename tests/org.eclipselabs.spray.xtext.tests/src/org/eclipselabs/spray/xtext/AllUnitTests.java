package org.eclipselabs.spray.xtext;

import org.eclipselabs.spray.xtext.customizing.QualifiedNameValueConverterTest;
import org.eclipselabs.spray.xtext.formatting.SprayFormatterTest;
import org.eclipselabs.spray.xtext.scoping.ModelResourceVisitorTest;
import org.eclipselabs.spray.xtext.scoping.PackageSelectorTest;
import org.eclipselabs.spray.xtext.tests.Mod4jTest;
import org.eclipselabs.spray.xtext.tests.ModelTests;
import org.eclipselabs.spray.xtext.tests.ValidationRulesTest;
import org.eclipselabs.spray.xtext.util.GenModelHelperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({QualifiedNameValueConverterTest.class, SprayFormatterTest.class, ModelResourceVisitorTest.class, PackageSelectorTest.class, Mod4jTest.class, ModelTests.class, ValidationRulesTest.class, GenModelHelperTest.class})
public class AllUnitTests {

}
