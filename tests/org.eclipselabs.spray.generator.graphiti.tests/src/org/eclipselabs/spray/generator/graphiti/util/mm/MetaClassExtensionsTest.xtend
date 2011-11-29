package org.eclipselabs.spray.generator.graphiti.util.mm

import com.google.inject.Inject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class MetaClassExtensionsTest {
    @Inject
    MetaClassExtensions ext

    @Before
    def void setUp() {
        // ext = new MetaClassExtensions()
    }

	@Test
	def testGetCreateFeatureLabel_WhenMetaClassHasNoName__ExpectEClassName () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		metaClass.type = EcorePackage::eINSTANCE.EClass
		val label = ext.getCreateFeatureLabel(metaClass)
		assertEquals("EClass",label)
	}

	@Test
	def testGetCreateFeatureLabel_WhenMetaClassHasName__ExpectLabel () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
		metaClass.alias = "testName"
		val label = ext.getCreateFeatureLabel(metaClass)
		assertEquals("testName", label)
	}
	
	@Test
	def getCreateFeatureDescription () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
		val description = ext.getCreateFeatureDescription(metaClass)
		assertEquals("Create new EClass", description)
	}
	
	@Test
	def getCreateBehavior () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
		val behavior = ext.getCreateBehavior(metaClass)
		assertNull(behavior)
	}
}