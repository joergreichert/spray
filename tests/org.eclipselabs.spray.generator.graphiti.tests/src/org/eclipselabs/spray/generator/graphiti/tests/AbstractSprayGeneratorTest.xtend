package org.eclipselabs.spray.generator.graphiti.tests

import javax.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipselabs.spray.generator.graphiti.SprayGenerator
import org.eclipselabs.xtext.utils.unittesting.XtextTest
import org.junit.Ignore

@Ignore
abstract class AbstractSprayGeneratorTest extends XtextTest {
	@Inject private SprayGenerator sprayGenerator
	@Inject private InMemoryFilesystemAccessExt fsa
	
	private static var InMemoryFilesystemAccessExt filledFsa = null
	
	
	def triggerGenerator(String path) {
		
		if(filledFsa == null) {
			filledFsa = fsa
			val uri = URI::createURI("model/" + path);
			val model = loadModel(resourceSet, uri, getRootObjectType(uri));
			
			sprayGenerator.doGenerate(model.eResource, filledFsa)
		}
		
		filledFsa
	}
}