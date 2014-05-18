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
package org.eclipselabs.spray.shapes.tests.svg

import javax.inject.Inject
import java.io.File
import java.util.Scanner
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.shapes.ShapeContainer
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipselabs.spray.shapes.tests.util.LineEndingNormalizer

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeTestsInjectorProvider))
class PetrinetSVGGeneratorTest extends XtextTest {
	private var ShapeContainer shapeContainer
	
	@Inject
	private GeneratorSVGDefinition generatorSVGDefinition

	@Inject
	private extension LineEndingNormalizer lineEndingNormalizer
	
	@Before
	def void setUp() {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/petrinet/petrinet.shape");
        shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;
		ignoreOsSpecificNewline();
	}
	
	@Test
	def void testPlaceShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"PlaceShape".matches(sd.name)).head
		assertEquals("SVG generated for PlaceShape", getExpectedSVGContent("petrinet", "PlaceShape"), generatorSVGDefinition.compile(element).normalizeLineEndings)
	}	
	@Test
	def void testTransitionShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"TransitionShape".matches(sd.name)).head
		assertEquals("SVG generated for TransitionShape", getExpectedSVGContent("petrinet", "TransitionShape"), generatorSVGDefinition.compile(element).normalizeLineEndings)
	}	
	@Test
	def void testEmptyTransitionShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"EmptyTransitionShape".matches(sd.name)).head
		assertEquals("SVG generated for EmptyTransitionShape", getExpectedSVGContent("petrinet", "EmptyTransitionShape"), generatorSVGDefinition.compile(element).normalizeLineEndings)
	}	
	@Test
	def void testTokenShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"TokenShape".matches(sd.name)).head
		assertEquals("SVG generated for TokenShape", getExpectedSVGContent("petrinet", "TokenShape"), generatorSVGDefinition.compile(element).normalizeLineEndings)
	}	
	@Test
	def void testArcConnection() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"ArcConnection".matches(sd.name)).head
		assertEquals("SVG generated for ArcConnection", getExpectedSVGContent("petrinet", "ArcConnection"), generatorSVGDefinition.compile(element).normalizeLineEndings)
	}	
	
	def private getExpectedSVGContent(String pathSegment, 
		String shapeContainerElementName) {
		val scanner = new Scanner(new File(	"model//testcases/svgs/" + 
			pathSegment + "/expected/" + shapeContainerElementName + ".svg"
		));
		val expectedSVG = scanner.useDelimiter("\\A").next();
		scanner.close();
		expectedSVG.normalizeLineEndings
	}	
}
