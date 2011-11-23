package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.mm.spray.Diagram
import org.junit.Assert
import org.junit.Test

class DiagramExtensionsTest {
    
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
		val container = SprayFactory::eINSTANCE.createContainer
		metaClass.representedBy = container
		val text = SprayFactory::eINSTANCE.createText
		container.partsList.add(text)
    	executeGetDiagramTest(text, diagram, "Diagram should be returned for text")
    }


	@Test    
    def testGetDiagram_WhenDiagramIsNotSuperClass__NullExpected() {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
    	val diagramExtensions = new DiagramExtensions()
    	val foundDiagram = diagramExtensions.getDiagram(metaClass)
    	Assert::assertNull(foundDiagram)
    }


    def private executeGetDiagramTest(EObject element, Diagram expectedDiagram, String message) {
    	val diagramExtensions = new DiagramExtensions()
    	val foundDiagram = diagramExtensions.getDiagram(element)
    	Assert::assertEquals(foundDiagram, expectedDiagram)
    }
}