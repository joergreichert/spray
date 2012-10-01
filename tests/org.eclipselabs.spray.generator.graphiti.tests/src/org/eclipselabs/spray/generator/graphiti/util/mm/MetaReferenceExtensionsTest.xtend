package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.runner.RunWith
import com.google.inject.Inject
import org.junit.Test
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.Diagram
import static org.junit.Assert.*
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.mm.spray.MetaClass

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class MetaReferenceExtensionsTest {
    
    @Inject
    MetaReferenceExtensions sut
    
    @Test
    def testGetDiagram() {
        val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
        val MetaClass metaClass = SprayFactory::eINSTANCE.createMetaClass
        val MetaReference reference = SprayFactory::eINSTANCE.createMetaReference
        metaClass.referencesList.add(reference)
        diagram.metaClassesList.add(metaClass)
        val Diagram foundDiagram = sut.getDiagram(reference)
        assertNotNull("found diagram", foundDiagram)
        assertEquals("found expected diagram", foundDiagram, diagram)        
    }
    
    @Test
    def testGetDiagram_WhenReferenceHasNoDiagramInHierarchy__ExpectNoDiagram() {
        val MetaReference reference = SprayFactory::eINSTANCE.createMetaReference
        val Diagram foundDiagram = sut.getDiagram(reference)
        assertNull("found no diagram", foundDiagram)
    }
}
