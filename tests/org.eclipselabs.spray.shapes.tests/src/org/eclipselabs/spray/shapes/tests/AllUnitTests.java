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
package org.eclipselabs.spray.shapes.tests;

import org.eclipselabs.spray.shapes.tests.svg.BpmnSVGGeneratorTest;
import org.eclipselabs.spray.shapes.tests.svg.BusmodSVGGeneratorTest;
import org.eclipselabs.spray.shapes.tests.svg.Lwc2012SVGGeneratorTest;
import org.eclipselabs.spray.shapes.tests.svg.PetrinetSVGGeneratorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Test suite with all tests that are executable as plain unit tests (no plugin
 * test).
 */
@RunWith(Suite.class)
@SuiteClasses({ ConnectionModelTest.class,
		ConnectionPlacingGeneratorTest.class, ShapeAnchorCalculatorTest.class,
		ShapeFormatterTest.class, ShapeModelTest.class, ShapeScopingTest.class,
		ShapeValidationTest.class, ShapeGeneratorTest.class,
		LayoutExtensionsTest.class, BpmnSVGGeneratorTest.class,
		BusmodSVGGeneratorTest.class, Lwc2012SVGGeneratorTest.class,
		PetrinetSVGGeneratorTest.class })
public class AllUnitTests {

}
