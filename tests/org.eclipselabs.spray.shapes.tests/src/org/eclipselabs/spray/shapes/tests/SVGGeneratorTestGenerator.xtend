package org.eclipselabs.spray.shapes.tests

import java.io.FileWriter
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.shapes.ShapeContainer
import org.eclipselabs.spray.shapes.ShapeContainerElement
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.junit.runner.RunWith
import org.junit.Test
import org.junit.Ignore

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ShapeTestsInjectorProvider))
class SVGGeneratorTestGenerator extends XtextTest {

	@Ignore
	@Test
	def void generate() {
		generate("bpmn", "bpmn")
		generate("busmod", "mydiagram")
		generate("lwc2012", "lwc2012")
		generate("petrinet", "petrinet")
	}
	
	def private generate(String segment, String shapeFileName) {
		val path = "src/org/eclipselabs/spray/shapes/tests/svg/" + 
			segment.toFirstUpper + "SVGGeneratorTest.xtend"
		val fw = new FileWriter(path)
		fw.write(generateTest(segment, shapeFileName).toString)
		fw.close
	}
	
	def private generateTest(String segment, String shapeFileName) '''
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
		import javax.inject.Inject
		import java.util.Scanner
		import java.io.File
		
		import static org.junit.Assert.*
		import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition
		
		@RunWith(typeof(XtextRunner2))
		@InjectWith(typeof(ShapeInjectorProvider))
		class «segment.toFirstUpper»SVGGeneratorTest extends XtextTest {
			private var ShapeContainer shapeContainer
			
			@Inject
			private GeneratorSVGDefinition generatorSVGDefinition
			
			@Before
			def void setUp() {
				val uri = URI::createURI(resourceRoot + "/testcases/svgs/«segment»/«shapeFileName».shape");
		        shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;
			}
			
			«FOR method : generateTests(segment, shapeFileName)»
				«method»
			«ENDFOR»
			
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
	'''
	
	def private generateTests(String pathSegment, String shapeFileName) {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/" + 
			pathSegment + "/" + shapeFileName + ".shape");
        val shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) 
        	as ShapeContainer;
		generateTestMethods(pathSegment, shapeFileName, shapeContainer.shapeContainerElement)        	
	}

	def private generateTestMethods(String pathSegment, String shapeFileName, Iterable<? extends ShapeContainerElement> elements) {
		val list = <CharSequence>newArrayList
        for(element : elements) {
        	list.add('''
				@Test
				def void test«element.name.toFirstUpper»() {
					val element = shapeContainer.shapeContainerElement.filter(sd|"«element.name»".matches(sd.name)).head
					assertEquals("SVG generated for «element.name»", getExpectedSVGContent("«pathSegment»", "«element.name»"), generatorSVGDefinition.compile(element).toString)
				}	
        	''')
        }
        list
	}
}