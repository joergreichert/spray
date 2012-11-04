package org.eclipselabs.spray.shapes.tests.svg

import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.shapes.ShapeInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.eclipse.emf.common.util.URI
import org.junit.Before
import org.junit.Test
import org.eclipselabs.spray.shapes.shapes.ShapeContainer
import com.google.inject.Inject
import java.util.Scanner
import java.io.File

import static org.junit.Assert.*
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeInjectorProvider))
class BusmodSVGGeneratorTest extends XtextTest {
	private var ShapeContainer shapeContainer
	
	@Inject
	private GeneratorSVGDefinition generatorSVGDefinition
	
	@Before
	def void setUp() {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/busmod/mydiagram.shape");
        shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;
	}
	
	@Test
	def void testRectangleShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"RectangleShape".matches(sd.name)).head
		assertEquals("SVG generated for RectangleShape", getExpectedSVGContent("busmod", "RectangleShape"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testClassShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"ClassShape".matches(sd.name)).head
		assertEquals("SVG generated for ClassShape", getExpectedSVGContent("busmod", "ClassShape"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testTextShape() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"TextShape".matches(sd.name)).head
		assertEquals("SVG generated for TextShape", getExpectedSVGContent("busmod", "TextShape"), generatorSVGDefinition.compile(element).toString)
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
