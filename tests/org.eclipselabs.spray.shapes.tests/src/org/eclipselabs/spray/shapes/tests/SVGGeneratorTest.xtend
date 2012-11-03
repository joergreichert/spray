package org.eclipselabs.spray.shapes.tests

import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.shapes.ShapeInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.eclipse.emf.common.util.URI
import org.junit.Test
import org.eclipselabs.spray.shapes.shapes.ShapeContainer
import com.google.inject.Inject
import java.util.Scanner
import java.io.File

import static org.junit.Assert.*
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeInjectorProvider))
class SVGGeneratorTest extends XtextTest {
	
	@Inject
	private GeneratorSVGDefinition generatorSVGDefinition
	
	@Test
	def void testBPMN() {
		executeTest("bpmn", "bpmn")
	}
	
	@Test
	def void testBusinessModel() {
		executeTest("busmod", "mydiagram")
	}	
	
	@Test
	def void testLWC2012() {
		executeTest("lwc2012", "lwc2012")
	}	
	
	@Test
	def void testPetrinet() {
		executeTest("bpmn", "bpmn")
	}	
	
	def private void executeTest(String pathSegment, String shapeFileName) {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/" + 
			pathSegment + "/" + shapeFileName + ".shape");
        val shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) 
        	as ShapeContainer;
        for(element : shapeContainer.shapeContainerElement) {
        	assertEquals("SVG generated for " + element.name,
        		getExpectedSVGContent(pathSegment, element.name),
        		generatorSVGDefinition.compile(element).toString
        	)
        }
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