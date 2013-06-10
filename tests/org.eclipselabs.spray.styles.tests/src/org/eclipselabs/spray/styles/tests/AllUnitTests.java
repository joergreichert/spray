package org.eclipselabs.spray.styles.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite with all tests that are executable as plain unit tests (no plugin
 * test).
 */
@RunWith(Suite.class)
@SuiteClasses({ StyleFormatterTest.class, StyleModelTest.class,
		StyleScopingTest.class, StyleValidationTest.class, StyleGeneratorTest.class })
public class AllUnitTests {

}
