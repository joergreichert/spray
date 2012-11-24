package org.eclipselabs.spray.shapes.tests.svg

import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.shapes.ShapeInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.eclipse.emf.common.util.URI
import org.junit.Before
import org.junit.Test
import org.eclipselabs.spray.shapes.ShapeContainer
import com.google.inject.Inject
import java.util.Scanner
import java.io.File

import static org.junit.Assert.*
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeInjectorProvider))
class PetrinetSVGGeneratorTest extends XtextTest {
	private var ShapeContainer shapeContainer
	
	@Inject
	private GeneratorSVGDefinition generatorSVGDefinition
	
	@Before
	def void setUp() {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/petrinet/petrinet.shape");
        shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;
	}
	
	@Test
	def void testPlaceShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"PlaceShape".matches(sd.name)).head
		assertEquals("SVG generated for PlaceShape", getExpectedSVGContent("petrinet", "PlaceShape"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testTransitionShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"TransitionShape".matches(sd.name)).head
		assertEquals("SVG generated for TransitionShape", getExpectedSVGContent("petrinet", "TransitionShape"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testEmptyTransitionShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"EmptyTransitionShape".matches(sd.name)).head
		assertEquals("SVG generated for EmptyTransitionShape", getExpectedSVGContent("petrinet", "EmptyTransitionShape"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testTokenShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"TokenShape".matches(sd.name)).head
		assertEquals("SVG generated for TokenShape", getExpectedSVGContent("petrinet", "TokenShape"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testArcConnection() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"ArcConnection".matches(sd.name)).head
		assertEquals("SVG generated for ArcConnection", getExpectedSVGContent("petrinet", "ArcConnection"), generatorSVGDefinition.compile(element).toString)
	}	
	
	def private getExpectedSVGContent(String pathSegment, 
		String shapeContainerElementName) {
		val scanner = new Scanner(new File(	"model//testcases/svgs/" + 
			pathSegment + "/expected/" + shapeContainerElementName + ".svg"
		));
		val expectedSVG = scanner.useDelimiter("\\A").next();
		scanner.close();
		expectedSVG
	}	
}
