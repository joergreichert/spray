package org.eclipselabs.spray.generator.graphiti.templates.diagram

import com.google.inject.Inject
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.runner.RunWith
import static org.junit.Assert.*
import org.junit.Test

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class FeatureProviderTest {
	@Inject
	FeatureProvider sut
	
	@Test
	def testGenerate_getCreateConnectionFeatures__WhenOneConnection () {
		val Diagram diagram = createDiagram("SampleDiagram")
		createMetaclassRepresentedByConnection(diagram, "SampleEClass1")
		
		val expectedOutput = '''
			/**
			 * {@inheritDoc}
			 */
			@Override
			public ICreateConnectionFeature[] getCreateConnectionFeatures() {
			    return new ICreateConnectionFeature[] {
			        new SampleDiagramCreateSampleEClass1Feature(this)
			    };
			}
		'''
	    val output = sut.generate_getCreateConnectionFeatures(diagram)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	} 
	
	def createDiagram(String name) {
		val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		diagram.name = name
		diagram
	}
	
	def createMetaclassRepresentedByConnection(Diagram diagram, String name) {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = name
		metaClass.type = eClass
		val connection = SprayFactory::eINSTANCE.createConnectionInSpray
		metaClass.representedBy = connection
		diagram.metaClassesList.add(metaClass)
	}

	@Test
	def testGenerate_getCreateConnectionFeatures__WhenOneConnectionReference () {
		val Diagram diagram = createDiagram("SampleDiagram")
		createMetaReferenceRepresentedByConnection(diagram, "SampleEClass1", "SampleEClass2", "sampleEClass2Reference")
		
		val expectedOutput = '''
			/**
			 * {@inheritDoc}
			 */
			@Override
			public ICreateConnectionFeature[] getCreateConnectionFeatures() {
			    return new ICreateConnectionFeature[] {
			        new SampleDiagramCreateSampleEClass1SampleEClass2ReferenceFeature(this)
			    };
			}
		'''
	    val output = sut.generate_getCreateConnectionFeatures(diagram)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	def createMetaReferenceRepresentedByConnection(Diagram diagram, String className, String referencedClassName, String referenceName) {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = className
		metaClass.type = eClass
		val container = SprayFactory::eINSTANCE.createContainerInSpray
		metaClass.representedBy = container
		val referenceConnection = SprayFactory::eINSTANCE.createConnectionInSpray
		val reference = SprayFactory::eINSTANCE.createMetaReference
		reference.representedBy = referenceConnection
		val eReference = EcoreFactory::eINSTANCE.createEReference
		eReference.containment = false
		val eClass2 = EcoreFactory::eINSTANCE.createEClass
		eClass2.name = referencedClassName
		eReference.name = referenceName
		eReference.eType = eClass2
		reference.target = eReference
		metaClass.referencesList.add(reference)		
		diagram.metaClassesList.add(metaClass)
	} 
	
	@Test
	def testGenerate_getCreateConnectionFeatures__WhenOneConnectionAndOneConnectionReference () {
		val Diagram diagram = createDiagram("SampleDiagram")
		createMetaclassRepresentedByConnection(diagram, "SampleEClass1")
		createMetaReferenceRepresentedByConnection(diagram, "SampleEClass2", "SampleEClass3", "sampleEClass3Reference")
		
		val expectedOutput = '''
			/**
			 * {@inheritDoc}
			 */
			@Override
			public ICreateConnectionFeature[] getCreateConnectionFeatures() {
			    return new ICreateConnectionFeature[] {
			        new SampleDiagramCreateSampleEClass1Feature(this)
			        , 
			        new SampleDiagramCreateSampleEClass2SampleEClass3ReferenceFeature(this)
			    };
			}
		'''
	    val output = sut.generate_getCreateConnectionFeatures(diagram)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	} 
	
	@Test
	def testGenerate_getCreateConnectionFeatures__WhenTwoConnectionAndTwoConnectionReference () {
		val Diagram diagram = createDiagram("SampleDiagram")
		createMetaclassRepresentedByConnection(diagram, "SampleEClass1")
		createMetaclassRepresentedByConnection(diagram, "SampleEClass2")
		createMetaReferenceRepresentedByConnection(diagram, "SampleEClass3", "SampleEClass4", "sampleEClass4Reference")
		createMetaReferenceRepresentedByConnection(diagram, "SampleEClass5", "SampleEClass6", "sampleEClass6Reference")
		
		val expectedOutput = '''
			/**
			 * {@inheritDoc}
			 */
			@Override
			public ICreateConnectionFeature[] getCreateConnectionFeatures() {
			    return new ICreateConnectionFeature[] {
			        new SampleDiagramCreateSampleEClass1Feature(this)
			        , new SampleDiagramCreateSampleEClass2Feature(this)
			        , 
			        new SampleDiagramCreateSampleEClass3SampleEClass4ReferenceFeature(this)
			        , new SampleDiagramCreateSampleEClass5SampleEClass6ReferenceFeature(this)
			    };
			}
		'''
	    val output = sut.generate_getCreateConnectionFeatures(diagram)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	} 	
}