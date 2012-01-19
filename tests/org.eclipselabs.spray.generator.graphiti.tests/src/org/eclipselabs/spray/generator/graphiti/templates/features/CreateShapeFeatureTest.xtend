package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.After
import org.junit.runner.RunWith
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import static org.junit.Assert.*
import org.junit.Test
import org.junit.Ignore

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class CreateShapeFeatureTest {
	@Inject
	CreateShapeFeature sut
	
	@Inject
    private ResourceSet resourceSet
	
	@Ignore
	@Test
	def testGenerate_createModelElement () {
		val sampleClass = EcoreFactory::eINSTANCE.createEClass
		sampleClass.name = "SampleClass"

		val sampleModelRoot = EcoreFactory::eINSTANCE.createEClass
		sampleModelRoot.name = "SampleModelRoot"

		val sampleClassReferences = EcoreFactory::eINSTANCE.createEReference
		sampleClassReferences.containment = true
		sampleClassReferences.eType = sampleClass
		sampleModelRoot.getEStructuralFeatures().add(sampleClassReferences)
		
		val ePackage = EcoreFactory::eINSTANCE.createEPackage
		ePackage.name = "samplepackage"
		ePackage.nsURI = "test.xmi"
		ePackage.getEClassifiers().add(sampleModelRoot)
		ePackage.getEClassifiers().add(sampleClass)

		val URI genModelUri = URI::createURI("gentest.genmodel")
		EcorePlugin::getEPackageNsURIToGenModelLocationMap().put(ePackage.nsURI, genModelUri)
		val GenModel genModel = GenModelFactory::eINSTANCE.createGenModel()
		
		val GenClass genSampleModelRoot = GenModelFactory::eINSTANCE.createGenClass()
		genSampleModelRoot.ecoreClass = sampleModelRoot

		val GenClass genSampleClass = GenModelFactory::eINSTANCE.createGenClass()
		genSampleClass.ecoreClass = sampleClass
		
		val GenPackage genPackage = GenModelFactory::eINSTANCE.createGenPackage()
		genPackage.genClasses.add(genSampleClass)
		genPackage.genClasses.add(genSampleModelRoot)
		genPackage.ecorePackage = ePackage
		genModel.genPackages.add(genPackage)		
		Helper::registerXmiModel(resourceSet)
		
		val Resource res = resourceSet.createResource(URI::createURI(ePackage.nsURI));
		assertNotNull("EMF resource expected to be not null", res)
		res.contents.add(ePackage)
		res.save(null)
		Helper::registerGenModel(resourceSet)
		
		val Resource genRes = resourceSet.createResource(genModelUri);
		assertNotNull("Gen model resource expected to be not null", genRes)
		genRes.contents.add(genModel)
		genRes.save(null)		

		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		metaClass.type = sampleClass
		val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
		metaClass.behaviorsList.add(createBehavior)
		
		val diagram = SprayFactory::eINSTANCE.createDiagram
		diagram.name = "SampleDiagram"
		diagram.modelType = sampleModelRoot 
		diagram.metaClassesList.add(metaClass)

		val expectedOutput = '''
			/**
			 * Creates a new {@link SampleClass} instance and adds it to the containing type.
			 */
			protected SampleEClass createSampleClass(ICreateContext context) {
				// ask user for SampleClass name
				String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
				if (newName == null || newName.trim().length() == 0) {
			    	return null;
				}
				 // create SampleEClass instance
				SampleClass newClass = SampleFactory.eINSTANCE.createSampleClass();    
				newClass.setName(newName);
			    
				// add the element to containment reference
				SampleModel model = modelService.getModel();
				model.getSampleClasses().add(newClass);
				setDoneChanges(true);
				return newClass;
			}
    	'''	
    	sut.importUtil.initImports("features")
		val output = sut.generate_createModelElement(metaClass)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@After
	def void tearDown() {
		val file = new java.io.File("test.xmi");
		if(file.exists) file.delete()
		val genFile = new java.io.File("gentest.genmodel");
		if(genFile.exists) genFile.delete()
	}
}
