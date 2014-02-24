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
public class ModelTests extends AbstractSprayXtextTest {

	/**
	 * Those models without create behavior rise a warning that is asserted by
	 * calling this method from tests.
	 */
	private void withoutCreateBehaviorWarnings() {
		assertConstraints(issues.allOfThemContain("no create behavior"));
	}

	@Test
	public void test_01_minimal() {
		testFile(TESTCASES_FOLDER + "01-minimal.spray", MOD4J_XCORE);
	}

	@Test
	public void test_10_scoping() {
		testFile(TESTCASES_FOLDER + "scoping/10-scoping.spray", MOD4J_XCORE);
	}

	@Test
	public void test_11_scoping() {
		testFile(TESTCASES_FOLDER + "scoping/11-scoping.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_12_scoping() {
		testFile(TESTCASES_FOLDER + "scoping/12-scoping.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
	}

	@Test
	public void test_13_scoping() {
		testFile(TESTCASES_FOLDER + "scoping/13-scoping.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_30_expression_text() {
		testFile(TESTCASES_FOLDER + "30-expression_text.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_31_expression_text() {
		testFile(TESTCASES_FOLDER + "31-expression_text.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_40_alias() {
		testFile(TESTCASES_FOLDER + "40-alias.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_43_alias() {
		testFile(TESTCASES_FOLDER + "43-alias.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_50_alias() {
		testFile(TESTCASES_FOLDER + "50-connection.spray", MOD4J_XCORE,
				REFERENCED_TEST_SHAPE);
		withoutCreateBehaviorWarnings();
	}
}
