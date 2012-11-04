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
class BpmnSVGGeneratorTest extends XtextTest {
	private var ShapeContainer shapeContainer
	
	@Inject
	private GeneratorSVGDefinition generatorSVGDefinition
	
	@Before
	def void setUp() {
		val uri = URI::createURI(resourceRoot + "/testcases/svgs/bpmn/bpmn.shape");
        shapeContainer = loadModel(resourceSet, uri, getRootObjectType(uri)) as ShapeContainer;
	}
	
	@Test
	def void testBPMN_EventStart_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventStart_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventStart_default", getExpectedSVGContent("bpmn", "BPMN_EventStart_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEnd_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEnd_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEnd_default", getExpectedSVGContent("bpmn", "BPMN_EventEnd_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEnd_used() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEnd_used".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEnd_used", getExpectedSVGContent("bpmn", "BPMN_EventEnd_used"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMail() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMail".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMail", getExpectedSVGContent("bpmn", "BPMN_EventMail"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMail_Dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMail_Dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMail_Dash", getExpectedSVGContent("bpmn", "BPMN_EventMail_Dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMail_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMail_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMail_Double", getExpectedSVGContent("bpmn", "BPMN_EventMail_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMail_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMail_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMail_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventMail_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMailInvert_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMailInvert_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMailInvert_Double", getExpectedSVGContent("bpmn", "BPMN_EventMailInvert_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMailInvert_Bold() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMailInvert_Bold".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMailInvert_Bold", getExpectedSVGContent("bpmn", "BPMN_EventMailInvert_Bold"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventTimer_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventTimer_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventTimer_default", getExpectedSVGContent("bpmn", "BPMN_EventTimer_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventTimer_Dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventTimer_Dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventTimer_Dash", getExpectedSVGContent("bpmn", "BPMN_EventTimer_Dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventTimer_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventTimer_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventTimer_Double", getExpectedSVGContent("bpmn", "BPMN_EventTimer_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventTimer_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventTimer_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventTimer_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventTimer_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEskalation_Start() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEskalation_Start".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEskalation_Start", getExpectedSVGContent("bpmn", "BPMN_EventEskalation_Start"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEskalation_Dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEskalation_Dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEskalation_Dash", getExpectedSVGContent("bpmn", "BPMN_EventEskalation_Dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEskalation_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEskalation_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEskalation_Double", getExpectedSVGContent("bpmn", "BPMN_EventEskalation_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEskalation_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEskalation_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEskalation_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventEskalation_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEskalation_DoubleInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEskalation_DoubleInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEskalation_DoubleInvert", getExpectedSVGContent("bpmn", "BPMN_EventEskalation_DoubleInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventEskalation_BoldInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventEskalation_BoldInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventEskalation_BoldInvert", getExpectedSVGContent("bpmn", "BPMN_EventEskalation_BoldInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventIf_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventIf_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventIf_default", getExpectedSVGContent("bpmn", "BPMN_EventIf_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventIf_Dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventIf_Dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventIf_Dash", getExpectedSVGContent("bpmn", "BPMN_EventIf_Dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventIf_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventIf_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventIf_Double", getExpectedSVGContent("bpmn", "BPMN_EventIf_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventIf_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventIf_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventIf_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventIf_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventLink_entered() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventLink_entered".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventLink_entered", getExpectedSVGContent("bpmn", "BPMN_EventLink_entered"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventLink_triggered() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventLink_triggered".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventLink_triggered", getExpectedSVGContent("bpmn", "BPMN_EventLink_triggered"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventError_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventError_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventError_default", getExpectedSVGContent("bpmn", "BPMN_EventError_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventError_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventError_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventError_Double", getExpectedSVGContent("bpmn", "BPMN_EventError_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventError_BoldInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventError_BoldInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventError_BoldInvert", getExpectedSVGContent("bpmn", "BPMN_EventError_BoldInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventCancel_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventCancel_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventCancel_Double", getExpectedSVGContent("bpmn", "BPMN_EventCancel_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventCancel_BoldInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventCancel_BoldInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventCancel_BoldInvert", getExpectedSVGContent("bpmn", "BPMN_EventCancel_BoldInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventCompensation_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventCompensation_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventCompensation_default", getExpectedSVGContent("bpmn", "BPMN_EventCompensation_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventCompensation_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventCompensation_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventCompensation_Double", getExpectedSVGContent("bpmn", "BPMN_EventCompensation_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventCompensation_DoubleInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventCompensation_DoubleInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventCompensation_DoubleInvert", getExpectedSVGContent("bpmn", "BPMN_EventCompensation_DoubleInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventCompensation_BoldInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventCompensation_BoldInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventCompensation_BoldInvert", getExpectedSVGContent("bpmn", "BPMN_EventCompensation_BoldInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventSignal_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventSignal_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventSignal_default", getExpectedSVGContent("bpmn", "BPMN_EventSignal_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventSignal_dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventSignal_dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventSignal_dash", getExpectedSVGContent("bpmn", "BPMN_EventSignal_dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventSignal_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventSignal_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventSignal_Double", getExpectedSVGContent("bpmn", "BPMN_EventSignal_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventSignal_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventSignal_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventSignal_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventSignal_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventSignal_DoubleInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventSignal_DoubleInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventSignal_DoubleInvert", getExpectedSVGContent("bpmn", "BPMN_EventSignal_DoubleInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventSignal_BoldInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventSignal_BoldInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventSignal_BoldInvert", getExpectedSVGContent("bpmn", "BPMN_EventSignal_BoldInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMulti_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMulti_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMulti_default", getExpectedSVGContent("bpmn", "BPMN_EventMulti_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMulti_dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMulti_dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMulti_dash", getExpectedSVGContent("bpmn", "BPMN_EventMulti_dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMulti_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMulti_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMulti_Double", getExpectedSVGContent("bpmn", "BPMN_EventMulti_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMulti_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMulti_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMulti_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventMulti_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMulti_DoubleInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMulti_DoubleInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMulti_DoubleInvert", getExpectedSVGContent("bpmn", "BPMN_EventMulti_DoubleInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventMulti_BoldInvert() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventMulti_BoldInvert".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventMulti_BoldInvert", getExpectedSVGContent("bpmn", "BPMN_EventMulti_BoldInvert"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventParallel_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventParallel_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventParallel_default", getExpectedSVGContent("bpmn", "BPMN_EventParallel_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventParallel_dash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventParallel_dash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventParallel_dash", getExpectedSVGContent("bpmn", "BPMN_EventParallel_dash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventParallel_Double() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventParallel_Double".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventParallel_Double", getExpectedSVGContent("bpmn", "BPMN_EventParallel_Double"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventParallel_DoubleDash() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventParallel_DoubleDash".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventParallel_DoubleDash", getExpectedSVGContent("bpmn", "BPMN_EventParallel_DoubleDash"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_EventTermination() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_EventTermination".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_EventTermination", getExpectedSVGContent("bpmn", "BPMN_EventTermination"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Activity_Task() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Activity_Task".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Activity_Task", getExpectedSVGContent("bpmn", "BPMN_Activity_Task"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Activity_Transaction() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Activity_Transaction".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Activity_Transaction", getExpectedSVGContent("bpmn", "BPMN_Activity_Transaction"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Activity_EventSubProcess() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Activity_EventSubProcess".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Activity_EventSubProcess", getExpectedSVGContent("bpmn", "BPMN_Activity_EventSubProcess"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Activity_CallActivity() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Activity_CallActivity".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Activity_CallActivity", getExpectedSVGContent("bpmn", "BPMN_Activity_CallActivity"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_XOR_1() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_XOR_1".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_XOR_1", getExpectedSVGContent("bpmn", "BPMN_Gateway_XOR_1"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_XOR_2() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_XOR_2".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_XOR_2", getExpectedSVGContent("bpmn", "BPMN_Gateway_XOR_2"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_Event() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_Event".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_Event", getExpectedSVGContent("bpmn", "BPMN_Gateway_Event"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_AND() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_AND".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_AND", getExpectedSVGContent("bpmn", "BPMN_Gateway_AND"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_OR() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_OR".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_OR", getExpectedSVGContent("bpmn", "BPMN_Gateway_OR"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_complex() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_complex".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_complex", getExpectedSVGContent("bpmn", "BPMN_Gateway_complex"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_XEvent() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_XEvent".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_XEvent", getExpectedSVGContent("bpmn", "BPMN_Gateway_XEvent"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Gateway_AND_Event() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Gateway_AND_Event".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Gateway_AND_Event", getExpectedSVGContent("bpmn", "BPMN_Gateway_AND_Event"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Conversation_default() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Conversation_default".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Conversation_default", getExpectedSVGContent("bpmn", "BPMN_Conversation_default"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_Conversation_Bold() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_Conversation_Bold".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_Conversation_Bold", getExpectedSVGContent("bpmn", "BPMN_Conversation_Bold"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_OneData() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_OneData".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_OneData", getExpectedSVGContent("bpmn", "BPMN_OneData"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_ListData() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_ListData".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_ListData", getExpectedSVGContent("bpmn", "BPMN_ListData"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_DataStorage() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_DataStorage".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_DataStorage", getExpectedSVGContent("bpmn", "BPMN_DataStorage"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_SequenceFlow() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_SequenceFlow".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_SequenceFlow", getExpectedSVGContent("bpmn", "BPMN_SequenceFlow"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_DefaultFlow() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_DefaultFlow".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_DefaultFlow", getExpectedSVGContent("bpmn", "BPMN_DefaultFlow"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_ConditionalFlow() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_ConditionalFlow".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_ConditionalFlow", getExpectedSVGContent("bpmn", "BPMN_ConditionalFlow"), generatorSVGDefinition.compile(element).toString)
	}	
	@Test
	def void testBPMN_DataAssoziation() {
		val element = shapeContainer.shapeContainerElement.filter(sd|"BPMN_DataAssoziation".matches(sd.name)).head
		assertEquals("SVG generated for BPMN_DataAssoziation", getExpectedSVGContent("bpmn", "BPMN_DataAssoziation"), generatorSVGDefinition.compile(element).toString)
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
