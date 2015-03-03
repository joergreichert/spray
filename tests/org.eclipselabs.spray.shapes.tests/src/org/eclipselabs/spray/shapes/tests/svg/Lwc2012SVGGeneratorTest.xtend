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

import java.io.File
import java.util.Scanner
import javax.inject.Inject
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

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeTestsInjectorProvider))
class Lwc2012SVGGeneratorTest extends XtextTest {
	private var ShapeContainer shapeContainer
	
	@Inject
	private GeneratorSVGDefinition generatorSVGDefinition

	@Inject
	private extension CustomAssert
	
	@Before
	def void setUp() {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/lwc2012/lwc2012.shape");
        shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;
		ignoreOsSpecificNewline();
	}
	
	@Test
	def void testLWC_Vessel_Vertical() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Vessel_Vertical".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Vessel_Vertical", getExpectedSVGContent("lwc2012", "LWC_Vessel_Vertical"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Vessel_Horizontal() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Vessel_Horizontal".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Vessel_Horizontal", getExpectedSVGContent("lwc2012", "LWC_Vessel_Horizontal"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_HeatExchanger() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_HeatExchanger".matches(sd.name)).head
		assertEquals("SVG generated for LWC_HeatExchanger", getExpectedSVGContent("lwc2012", "LWC_HeatExchanger"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Valve() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Valve".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Valve", getExpectedSVGContent("lwc2012", "LWC_Valve"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Valve_Manual() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Valve_Manual".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Valve_Manual", getExpectedSVGContent("lwc2012", "LWC_Valve_Manual"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Valve_Control() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Valve_Control".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Valve_Control", getExpectedSVGContent("lwc2012", "LWC_Valve_Control"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Pump() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Pump".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Pump", getExpectedSVGContent("lwc2012", "LWC_Pump"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Pump_Vacuum() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Pump_Vacuum".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Pump_Vacuum", getExpectedSVGContent("lwc2012", "LWC_Pump_Vacuum"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_SystemEnd() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_SystemEnd".matches(sd.name)).head
		assertEquals("SVG generated for LWC_SystemEnd", getExpectedSVGContent("lwc2012", "LWC_SystemEnd"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Joint() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Joint".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Joint", getExpectedSVGContent("lwc2012", "LWC_Joint"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Location_NoLine() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Location_NoLine".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Location_NoLine", getExpectedSVGContent("lwc2012", "LWC_Location_NoLine"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Location_SolidLine() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Location_SolidLine".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Location_SolidLine", getExpectedSVGContent("lwc2012", "LWC_Location_SolidLine"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Location_DashedLine() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Location_DashedLine".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Location_DashedLine", getExpectedSVGContent("lwc2012", "LWC_Location_DashedLine"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Pipe() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Pipe".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Pipe", getExpectedSVGContent("lwc2012", "LWC_Pipe"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testLWC_Source_Exhaust() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"LWC_Source_Exhaust".matches(sd.name)).head
		assertEquals("SVG generated for LWC_Source_Exhaust", getExpectedSVGContent("lwc2012", "LWC_Source_Exhaust"), generatorSVGDefinition.compile(element).toString)
	}	
	
	def private getExpectedSVGContent(String pathSegment, 
		String shapeContainerElementName) {
		val scanner = new Scanner(new File(	"model//testcases/svgs/" + 
			pathSegment + "/expected/" + shapeContainerElementName + ".svg"
		));
		val expectedSVG = scanner.useDelimiter("\\A").next();
		scanner.close();
		expectedSVG.toString
	}	
}
