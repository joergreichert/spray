package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject

import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.After
import org.junit.runner.RunWith
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import static org.junit.Assert.*
import org.junit.Test


@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class CreateShapeFeatureTest {
	@Inject	CreateShapeFeature sut
	
	@Inject private ResourceSet resourceSet

    @Inject private extension DomainModelTestHelper
    @Inject private extension GenModelTestHelper
    @Inject private extension SprayModelTestHelper
    
    private String domainModelResource = "test.xmi"
    private String genModelResource = "gentest.genmodel"
	
	@Test
	def testGenerate_createModelElement__WhenNoContainmentRef () {
		val ePackage = createEPackage(resourceSet, "samplepackage", domainModelResource)
		val sampleModelRoot = createEClass("SampleModelRoot")
		val sampleClass = createEClass("SampleClass")

		val contained = true
		createEReference(sampleModelRoot, sampleClass, contained) 
		addEClassesToEPackage(ePackage, newArrayList(sampleModelRoot, sampleClass))

		val URI genModelURI = URI::createURI(genModelResource)
		val GenModel genModel = createGenModel(ePackage, genModelURI)
		val GenClass genSampleModelRoot = createGenClass(sampleModelRoot)
		val GenClass genSampleClass = createGenClass(sampleClass)
		
		val prefix = "SamplePack"
		val GenPackage genPackage = createGenPackage(resourceSet, ePackage, prefix)		

		genModel.genPackages.add(genPackage)		
		addGenClassesToGenPackage(genPackage, newArrayList(genSampleClass, genSampleModelRoot))
		
		createResource(resourceSet, ePackage)
		createGenResource(resourceSet, genModel, genModelURI)

		val metaClass = createMetaClass(sampleClass)
		val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
		metaClass.behaviorsList.add(createBehavior)
		
		val diagram = createDiagram("SampleDiagram", sampleModelRoot) 
		diagram.metaClassesList.add(metaClass)

		val expectedOutput = '''
			/**
			 * Creates a new {@link SampleClass} instance and adds it to the containing type.
			 */
			protected SampleClass createSampleClass(ICreateContext context) {
			    // ask user for SampleClass name
			    String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
			    if (newName == null || newName.trim().length() == 0) {
			        return null;
			    }
			     // create SampleClass instance
			    SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();    
			    newClass.setName(newName);
			    
			    setDoneChanges(true);
			    return newClass;
			}
    	'''	
    	sut.importUtil.initImports("features")
		val output = sut.generate_createModelElement(metaClass)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@Test
	def testGenerate_createModelElement_WhenOneToOneContainment () {
		val ePackage = createEPackage(resourceSet, "samplepackage", domainModelResource)
		val sampleModelRoot = createEClass("SampleModelRoot")
		val sampleClass = createEClass("SampleClass")

		val contained = true
		val sampleClassesReference = createEReference(sampleModelRoot, sampleClass, contained)
		sampleClassesReference.name = "sampleClass"
		sampleClassesReference.lowerBound = 0
		sampleClassesReference.upperBound = 1 
		 
		addEClassesToEPackage(ePackage, newArrayList(sampleModelRoot, sampleClass))

		val URI genModelURI = URI::createURI(genModelResource)
		val GenModel genModel = createGenModel(ePackage, genModelURI)
		val GenClass genSampleModelRoot = createGenClass(sampleModelRoot)
		val GenClass genSampleClass = createGenClass(sampleClass)
		
		val prefix = "SamplePack"
		val GenPackage genPackage = createGenPackage(resourceSet, ePackage, prefix)		

		genModel.genPackages.add(genPackage)		
		addGenClassesToGenPackage(genPackage, newArrayList(genSampleClass, genSampleModelRoot))
		
		createResource(resourceSet, ePackage)
		createGenResource(resourceSet, genModel, genModelURI)

		val metaClass = createMetaClass(sampleClass)
		val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
		createBehavior.containmentReference = sampleClassesReference
		metaClass.behaviorsList.add(createBehavior)
		
		val diagram = createDiagram("SampleDiagram", sampleModelRoot) 
		diagram.metaClassesList.add(metaClass)

		val expectedOutput = '''
			/**
			 * Creates a new {@link SampleClass} instance and adds it to the containing type.
			 */
			protected SampleClass createSampleClass(ICreateContext context) {
			    // ask user for SampleClass name
			    String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
			    if (newName == null || newName.trim().length() == 0) {
			        return null;
			    }
			     // create SampleClass instance
			    SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();    
			    newClass.setName(newName);
			    
			    // add the element to containment reference
			    SampleModelRoot model = modelService.getModel();
			    model.setSampleClass(newClass);
			    
			    setDoneChanges(true);
			    return newClass;
			}
    	'''	
    	sut.importUtil.initImports("features")
		val output = sut.generate_createModelElement(metaClass)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@Test
	def testGenerate_createModelElement_WhenOneToManyContainment () {
		val ePackage = createEPackage(resourceSet, "samplepackage", domainModelResource)
		val sampleModelRoot = createEClass("SampleModelRoot")
		val sampleClass = createEClass("SampleClass")

		val contained = true
		val sampleClassesReference = createEReference(sampleModelRoot, sampleClass, contained)
		sampleClassesReference.name = "sampleClasses"
		sampleClassesReference.lowerBound = 0
		sampleClassesReference.upperBound = -1 
		
		addEClassesToEPackage(ePackage, newArrayList(sampleModelRoot, sampleClass))

		val URI genModelURI = URI::createURI(genModelResource)
		val GenModel genModel = createGenModel(ePackage, genModelURI)
		val GenClass genSampleModelRoot = createGenClass(sampleModelRoot)
		val GenClass genSampleClass = createGenClass(sampleClass)
		
		val prefix = "SamplePack"
		val GenPackage genPackage = createGenPackage(resourceSet, ePackage, prefix)		

		genModel.genPackages.add(genPackage)		
		addGenClassesToGenPackage(genPackage, newArrayList(genSampleClass, genSampleModelRoot))
		
		createResource(resourceSet, ePackage)
		createGenResource(resourceSet, genModel, genModelURI)

		val metaClass = createMetaClass(sampleClass)
		val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
		createBehavior.containmentReference = sampleClassesReference
		metaClass.behaviorsList.add(createBehavior)
		
		val diagram = createDiagram("SampleDiagram", sampleModelRoot) 
		diagram.metaClassesList.add(metaClass)

		val expectedOutput = '''
			/**
			 * Creates a new {@link SampleClass} instance and adds it to the containing type.
			 */
			protected SampleClass createSampleClass(ICreateContext context) {
			    // ask user for SampleClass name
			    String newName = SampleUtil.askString(TITLE, USER_QUESTION, "");
			    if (newName == null || newName.trim().length() == 0) {
			        return null;
			    }
			     // create SampleClass instance
			    SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();    
			    newClass.setName(newName);
			    
			    // add the element to containment reference
			    SampleModelRoot model = modelService.getModel();
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
		val file = new java.io.File(domainModelResource);
		if(file.exists) file.delete()
		val genFile = new java.io.File(genModelResource);
		if(genFile.exists) genFile.delete()
	}
}
