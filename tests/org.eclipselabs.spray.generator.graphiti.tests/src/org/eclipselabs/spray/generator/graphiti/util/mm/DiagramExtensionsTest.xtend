package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.mm.spray.Diagram
import static org.junit.Assert.*
import org.junit.Test
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SprayTestsInjectorProvider))
class DiagramExtensionsTest {
    @Inject
    DiagramExtensions diagramExtensions
    @Inject
   	CreateConnectionFeature createConnectionFeatureTemplate
    @Inject
   	CreateShapeFeature createShapeFeatureTemplate
    

    // ============================================================================================
    // TESTS FOR METHOD getDiagram()
    // ============================================================================================
	@Test
    def testGetDiagram_WhenDiagramIsInput__FoundExpected() {
		val diagram = SprayFactory::eINSTANCE.createDiagram
    	executeGetDiagramTest(diagram, diagram, "Diagram should be returned for diagram")
    }

	@Test    
    def testGetDiagram_WhenDiagramIsDirectSuperClass__FoundExpected() {
		val diagram = SprayFactory::eINSTANCE.createDiagram
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		diagram.metaClassesList.add(metaClass)
    	executeGetDiagramTest(metaClass, diagram, "Diagram should be returned for metaClass")
    }


	@Test    
    def testGetDiagram_WhenDiagramIsIndirectSuperClass__FoundExpected() {
		val diagram = SprayFactory::eINSTANCE.createDiagram
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		diagram.metaClassesList.add(metaClass)
		val container = SprayFactory::eINSTANCE.createContainerInSpray
		metaClass.representedBy = container
		val text = SprayFactory::eINSTANCE.createTextInSpray
		container.partsList.add(text)
    	executeGetDiagramTest(text, diagram, "Diagram should be returned for text")
    }


	@Test    
    def testGetDiagram_WhenDiagramIsNotSuperClass__NullExpected() {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
    	val foundDiagram = diagramExtensions.getDiagram(metaClass)
    	assertNull(foundDiagram)
    }


    def private executeGetDiagramTest(EObject element, Diagram expectedDiagram, String message) {
    	val foundDiagram = diagramExtensions.getDiagram(element)
    	assertEquals(foundDiagram, expectedDiagram)
    }
    
    @Test
    def testGetMetaClassesForShapes() {
    	val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		val metaClass1 = SprayFactory::eINSTANCE.createMetaClass
		val connection = SprayFactory::eINSTANCE.createConnectionInSpray
		metaClass1.representedBy = connection 
		val metaClass2 = SprayFactory::eINSTANCE.createMetaClass
		val container = SprayFactory::eINSTANCE.createContainerInSpray
		metaClass2.representedBy = container 
		diagram.metaClassesList.add(metaClass1)
		diagram.metaClassesList.add(metaClass2)
    	val Iterable<MetaClass> foundClasses = diagramExtensions.getMetaClassesForShapes(diagram)
    	assertEquals("expected metaClass count", 1, foundClasses.size)
    	assertEquals("expected metaClass", metaClass2, foundClasses.head)
    }
    
    @Test
    def testGetMetaClassesForConnections() {
    	val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		val metaClass1 = SprayFactory::eINSTANCE.createMetaClass
		val connection = SprayFactory::eINSTANCE.createConnectionInSpray
		metaClass1.representedBy = connection 
		val metaClass2 = SprayFactory::eINSTANCE.createMetaClass
		val container = SprayFactory::eINSTANCE.createContainerInSpray
		metaClass2.representedBy = container 
		diagram.metaClassesList.add(metaClass1)
		diagram.metaClassesList.add(metaClass2)
    	val Iterable<MetaClass> foundClasses = diagramExtensions.getMetaClassesForConnections(diagram)
    	assertEquals("expected metaClass count", 1, foundClasses.size)
    	assertEquals("expected metaClass", metaClass1, foundClasses.head)
    }
    
    @Test
    def testGetElementsForTemplateCreateShapeFeature() {
    	val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		val metaClass1 = SprayFactory::eINSTANCE.createMetaClass
		val connection = SprayFactory::eINSTANCE.createConnectionInSpray
		metaClass1.representedBy = connection 
		val metaClass2 = SprayFactory::eINSTANCE.createMetaClass
		val container = SprayFactory::eINSTANCE.createContainerInSpray
		metaClass2.representedBy = container 
		val metaClass3 = SprayFactory::eINSTANCE.createMetaClass
		val container2 = SprayFactory::eINSTANCE.createContainerInSpray
		val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
		metaClass3.representedBy = container2
		metaClass3.behaviorsList.add(createBehavior)
		val metaClass4 = SprayFactory::eINSTANCE.createMetaClass
		val container3 = SprayFactory::eINSTANCE.createConnectionInSpray
		val customBehavior = SprayFactory::eINSTANCE.createCustomBehavior
		metaClass4.representedBy = container3
		metaClass4.behaviorsList.add(customBehavior)
		diagram.metaClassesList.add(metaClass1)
		diagram.metaClassesList.add(metaClass2)
		diagram.metaClassesList.add(metaClass3)
		diagram.metaClassesList.add(metaClass4)
    	val Iterable<MetaClass> foundClasses = diagramExtensions.getElementsForTemplate(diagram, createShapeFeatureTemplate)
    	assertEquals("expected metaClass count", 1, foundClasses.size)
    	assertEquals("expected metaClass", metaClass3, foundClasses.head)
    }
    
    @Test
    def testGetElementsForTemplateCreateConnectionFeature() {
    	val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		val metaClass1 = SprayFactory::eINSTANCE.createMetaClass
		val connection = SprayFactory::eINSTANCE.createConnectionInSpray
		metaClass1.representedBy = connection 
		val metaClass2 = SprayFactory::eINSTANCE.createMetaClass
		val container = SprayFactory::eINSTANCE.createContainerInSpray
		metaClass2.representedBy = container 
		val metaClass3 = SprayFactory::eINSTANCE.createMetaClass
		val connection2 = SprayFactory::eINSTANCE.createConnectionInSpray
		val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
		metaClass3.representedBy = connection2
		metaClass3.behaviorsList.add(createBehavior)
		val metaClass4 = SprayFactory::eINSTANCE.createMetaClass
		val connection3 = SprayFactory::eINSTANCE.createConnectionInSpray
		val customBehavior = SprayFactory::eINSTANCE.createCustomBehavior
		metaClass4.representedBy = connection3
		metaClass4.behaviorsList.add(customBehavior)
		diagram.metaClassesList.add(metaClass1)
		diagram.metaClassesList.add(metaClass2)
		diagram.metaClassesList.add(metaClass3)
		diagram.metaClassesList.add(metaClass4)
    	val Iterable<MetaClass> foundClasses = diagramExtensions.getElementsForTemplate(diagram, createConnectionFeatureTemplate)
    	assertEquals("expected metaClass count", 1, foundClasses.size)
    	assertEquals("expected metaClass", metaClass3, foundClasses.head)
    }
}