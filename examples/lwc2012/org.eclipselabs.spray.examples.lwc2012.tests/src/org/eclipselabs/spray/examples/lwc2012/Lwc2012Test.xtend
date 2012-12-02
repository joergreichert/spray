package org.eclipselabs.spray.examples.lwc2012

import com.google.inject.Inject
import com.google.inject.Injector
import java.util.List
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.mwe.NameBasedFilter
import org.eclipse.xtext.mwe.Reader
import org.eclipse.xtext.mwe.SlotEntry
import org.eclipse.xtext.xbase.lib.Pair
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup
import org.eclipselabs.spray.styles.StyleStandaloneSetup
import org.eclipselabs.spray.xtext.SprayStandaloneSetup
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipselabs.spray.generator.graphiti.SprayGenerator
import org.eclipselabs.spray.shapes.generator.ShapeGenerator
import org.eclipselabs.spray.styles.generator.StyleGenerator

import static org.junit.Assert.*
import org.eclipselabs.spray.styles.Style
import org.eclipselabs.spray.styles.Gradient
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.ConnectionDefinition

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(Lwc2012TestsInjectorProvider))
class Lwc2012Test {
	@Inject Injector injector
	@Inject StyleGenerator styleGenerator
	@Inject ShapeGenerator shapeGenerator
	@Inject SprayGenerator sprayGenerator
	
	private Reader reader
	private IWorkflowContext context
	
	def createReader(String filterExpression) {
		reader = injector.getInstance(typeof(Reader))
		reader.addRegister(new SprayStandaloneSetup())
		reader.addRegister(new StyleStandaloneSetup())
		reader.addRegister(new ShapeStandaloneSetup())
		reader.addPath("model");
		
		createAndAddSlots(reader);
		
		reader
	}
	
	def createFilter(Reader reader, String filterExpression) {
		val filter = new NameBasedFilter();
		filter.setRegularExpression(
			if (filterExpression.nullOrEmpty) 
				"\\.spray|\\.style|\\.shape" 
			else filterExpression
		);
		reader.setUriFilter(filter);
	}
	
	def createAndAddSlots(Reader reader) {
		val configurations = newArrayList(
			new Pair("model_diagram", typeof(Diagram)),
			new Pair("model_style", typeof(Style)),
			new Pair("model_gradient", typeof(Gradient)),
			new Pair("model_shape", typeof(ShapeDefinition)),
			new Pair("model_connection", typeof(ConnectionDefinition))
		)
		configurations.forEach[createAndAddSlot(reader, key, value)]
	}
	
	def createAndAddSlot(Reader reader, String name, Class<?> type) {
		val slot = new SlotEntry()
		slot.setSlot(name)
		slot.setType(type.simpleName)
		reader.addLoad(slot)
	}	
	
	@Before
	def void setUp() {
		context = injector.getInstance(typeof(IWorkflowContext))
		reader = createReader(null)
	}

	@Test
	def testJvmTypeScoping() {
		createFilter(reader, "lwc2012gradients.style|lwc2012.style")
		reader.invoke(context)
		val gradientList = context.get("model_gradient") as List
		val stylesList = context.get("model_style") as List
	}

	@Test
	def testGradientsGeneration() {
		createFilter(reader, "lwc2012gradients.style")
		reader.invoke(context)
		val list = context.get("model_gradient") as List
		val gradient = list.filter(typeof(Gradient)).head
		assertNotNull(gradient)
		val fsa = new InMemoryFileSystemAccess
		
		styleGenerator.doGenerate(gradient.eResource, fsa)
		
		val sep = "/" 
		val path = '''DEFAULT_OUTPUTorg«sep»eclipselabs«sep»spray«sep»styles«sep»gradients«sep»'''.toString
		val (String) => void assertGradientGenerated = 
			[ s | assertTrue(s + ".java generiert", fsa.files.containsKey(path + s + ".java")) ] 
		newArrayList("GreenToWhite", "GreenToOrange", "GreenToYellow", "GreenToRed")
			.forEach[assertGradientGenerated.apply(it)]
	}	
}