package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipselabs.spray.mm.spray.SprayFactory
import org.junit.Test
import org.junit.Assert
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.junit.runner.RunWith
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Before
import org.junit.Ignore

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class MetaClassExtensionsTest {
    @Inject NamingExtensions ne 
    // @Inject extension NamingExtensions 
    private MetaClassExtensions ext

    @Before
    def void setUp() {
        ext = new MetaClassExtensions()
    }

	@Ignore
	@Test
	def testGetCreateFeatureLabel_WhenMetaClassHasNoName__ExpectNull () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val label = ext.getCreateFeatureLabel(metaClass)
		Assert::assertNull(label)
	}

	@Ignore
	@Test
	def testGetCreateFeatureLabel_WhenMetaClassHasName__ExpectLabel () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		metaClass.alias = "testName"
		val label = ext.getCreateFeatureLabel(metaClass)
		Assert::assertEquals("testName", label)
	}
	
	@Ignore
	@Test
	def getCreateFeatureDescription () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val description = ext.getCreateFeatureDescription(metaClass)
		Assert::assertEquals("", description)
	}
	
	@Ignore
	@Test
	def getCreateBehavior () {
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val behavior = ext.getCreateBehavior(metaClass)
		Assert::assertNull(behavior)
	}
}