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
import com.google.inject.Provider
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.mwe.utils.StandaloneSetup
import org.eclipse.emf.ecore.EPackage

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(SprayTestsInjectorProvider))
class DiagramExtensionsTest {
    @Inject
    DiagramExtensions diagramExtensions
    @Inject
    Provider<XtextResourceSet> resourceSetProvider

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
		val container = SprayFactory::eINSTANCE.createContainer
		metaClass.representedBy = container
		val text = SprayFactory::eINSTANCE.createText
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


    // ============================================================================================
    // TESTS FOR METHOD getElementsForTemplate(Diagram, CreateShapeFeature)
    // ============================================================================================
    @Test
    def test_getElementsForTemplate_CreateShapeFeature__FoundExpected () {
        val rs = resourceSetProvider.get
        val setup = new StandaloneSetup()
        
    }
}