/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.xtext.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ValidationRulesTest extends AbstractSprayXtextTest {

    @Test
    public void test_alias_01() {
        testFile("/testcases/validation/alias-01.spray", MOD4J_XCORE, REFERENCED_TEST_SHAPE);
        assertConstraints(issues.oneOfThemContains("Duplicate alias name Class1"));
    }

    @Test
    public void test_alias_02() {
        testFile("/testcases/validation/alias-02.spray", MOD4J_XCORE, REFERENCED_TEST_SHAPE);
        assertConstraints(issues.oneOfThemContains("Duplicate alias name BC1"));
    }

    @Test
    public void test_connection_01() {
        testFile("/testcases/validation/connection-01.spray", MOD4J_XCORE, REFERENCED_TEST_SHAPE);
        assertConstraints(issues.oneOfThemContains("Duplicate connection reference: associationsTo"));
    }

    @Test
    public void test_connection_02() {
        testFile("/testcases/validation/connection-02.spray", MOD4J_XCORE, REFERENCED_TEST_SHAPE);
        assertConstraints(issues.errorsOnly().theOneAndOnlyContains("Couldn't resolve reference to EReference 'businessRules'"));
    }

    @Test
    public void test_import_notexists() {
        testFile("/testcases/validation/import_notexists.spray", MOD4J_XCORE);
        assertConstraints(issues.errorsOnly().sizeIs(1));
        assertConstraints(issues.theOneAndOnlyContains("The import foo.bar cannot be resolved"));
    }
}
