package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class CreateShapeFeatureTest {
    @Inject    CreateShapeFeature sut
    
    @Inject private ResourceSet resourceSet

    @Inject private extension DomainModelTestHelper
    @Inject private extension GenModelTestHelper
    @Inject private extension SprayModelTestHelper
    
    private String domainModelResource = "test.xmi"
    private String genModelResource = "gentest.genmodel"
    
    def MetaClass createModelsAroundMetaclass() {
        val ePackage = createEPackage(resourceSet, "samplepackage", domainModelResource)
        val sampleModelRoot = createEClass("SampleModelRoot")
        val sampleClass = createEClass("SampleClass")

        val contained = true
        createEReference(sampleModelRoot, sampleClass, contained) 
        addEClassifiersToEPackage(ePackage, newArrayList(sampleModelRoot, sampleClass))

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
        
        metaClass
    }
    
    def metaClassWithAskFor(MetaClass metaClass, String attributeName, EDataType attributeDataType) {
        addEClassifiersToEPackage(metaClass.type.EPackage, newArrayList(attributeDataType))
        val nameAttribute = createEAttribute(metaClass.type, attributeName, attributeDataType)
        (metaClass.behaviorsList.head as CreateBehavior).askFor = nameAttribute
    }

    def EReference metaClassWithContainmentReference(MetaClass metaClass, EClass container, EClass containee, 
        Boolean contained, String referenceName, Integer lowerBound, Integer upperBound) {
        val sampleClassesReference = createEReference(container, containee, contained)
        sampleClassesReference.name = referenceName
        sampleClassesReference.lowerBound = lowerBound
        sampleClassesReference.upperBound = upperBound
        val behavior = (metaClass.behaviorsList.head as CreateBehavior)
        behavior.containmentReference = sampleClassesReference 
        sampleClassesReference 
    }
    
    @Test
    def testGenerate_createModelElement__WhenNoContainmentRef () {
        val metaClass = createModelsAroundMetaclass()
        metaClassWithAskFor(metaClass, "name", EcorePackage::eINSTANCE.getEString())
        
        val expectedOutput = '''
            /**
             * Creates a new {@link SampleClass} instance and adds it to the containing type.
             */
            protected SampleClass createSampleClass(final ICreateContext context) {
                // create SampleClass instance
                final SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();
                // ask user for SampleClass name
                String newName = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
                if (newName == null || newName.trim().length() == 0) {
                   return null;
                } else {
                   newClass.setName(newName);
                }
                boolean isContainment = false;
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                setDoneChanges(true);
                return newClass;
            }
        '''    
        val output = sut.generate_createModelElement(metaClass)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    @Test
    def testGenerate_createModelElement__WhenNoAskFor () {
        val metaClass = createModelsAroundMetaclass()

        val expectedOutput = '''
            /**
             * Creates a new {@link SampleClass} instance and adds it to the containing type.
             */
            protected SampleClass createSampleClass(final ICreateContext context) {
                // create SampleClass instance
                final SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();
                boolean isContainment = false;
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                setDoneChanges(true);
                return newClass;
            }
        '''    
        val output = sut.generate_createModelElement(metaClass)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    @Test
    def testGenerate_createModelElement__WhenAskForOfTypeDouble () {
        val metaClass = createModelsAroundMetaclass()
        metaClassWithAskFor(metaClass, "id", EcorePackage::eINSTANCE.getEDouble())

        val expectedOutput = '''
            /**
             * Creates a new {@link SampleClass} instance and adds it to the containing type.
             */
            protected SampleClass createSampleClass(final ICreateContext context) {
                // create SampleClass instance
                final SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();
                // ask user for SampleClass id
                final IInputValidator validator = new IInputValidator() {
                   public String isValid(final String _newText) {
                      String message = null;
                      try {
                         Double.valueOf(_newText);
                      } catch(Exception nfe) {
                         message = _newText + " cannot be cast to Double";
                      }
                      return message;
                   }
                };
                final String newIdString = SampleUtil.askString(TITLE, USER_QUESTION, "", validator);
                final Double newId = Double.valueOf(newIdString);    
                newClass.setId(newId);
                boolean isContainment = false;
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                setDoneChanges(true);
                return newClass;
            }
        '''    
        val output = sut.generate_createModelElement(metaClass)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }

    @Test
    def testGenerate_createModelElement__WhenAskForOfTypeInteger () {
        val metaClass = createModelsAroundMetaclass()
        metaClassWithAskFor(metaClass, "id", EcorePackage::eINSTANCE.getEInt())

        val expectedOutput = '''
            /**
             * Creates a new {@link SampleClass} instance and adds it to the containing type.
             */
            protected SampleClass createSampleClass(final ICreateContext context) {
                // create SampleClass instance
                final SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();
                // ask user for SampleClass id
                final IInputValidator validator = new IInputValidator() {
                   public String isValid(final String _newText) {
                      String message = null;
                      try {
                         Integer.valueOf(_newText);
                      } catch(Exception nfe) {
                         message = _newText + " cannot be cast to Integer";
                      }
                      return message;
                   }
                };
                final String newIdString = SampleUtil.askString(TITLE, USER_QUESTION, "", validator);
                final Integer newId = Integer.valueOf(newIdString);    
                newClass.setId(newId);
                boolean isContainment = false;
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                setDoneChanges(true);
                return newClass;
            }
        '''    
        val output = sut.generate_createModelElement(metaClass)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }

    
    @Test
    def testGenerate_createModelElement_WhenOneToOneContainment () {
        val metaClass = createModelsAroundMetaclass()
        metaClassWithAskFor(metaClass, "name", EcorePackage::eINSTANCE.getEString())

        val contained = true
        metaClassWithContainmentReference(metaClass, 
            metaClass.type.EPackage.EClassifiers.filter(c|c.name.matches("SampleModelRoot")).head as EClass, 
            metaClass.type, contained, "sampleClass", 0, 1)

        val expectedOutput = '''
            /**
             * Creates a new {@link SampleClass} instance and adds it to the containing type.
             */
            protected SampleClass createSampleClass(final ICreateContext context) {
                // create SampleClass instance
                final SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();
                // ask user for SampleClass name
                String newName = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
                if (newName == null || newName.trim().length() == 0) {
                   return null;
                } else {
                   newClass.setName(newName);
                }
                boolean isContainment = false;
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                if (!isContainment) {
                    // add the element to containment reference
                    SampleModelRoot model = modelService.getModel();
                    model.setSampleClass(newClass);
                }
                setDoneChanges(true);
                return newClass;
            }
        '''    
        val output = sut.generate_createModelElement(metaClass)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    @Test
    def testGenerate_createModelElement_WhenOneToManyContainment () {
        val metaClass = createModelsAroundMetaclass()
        metaClassWithAskFor(metaClass, "name", EcorePackage::eINSTANCE.getEString())

        val contained = true
        metaClassWithContainmentReference(metaClass, 
            metaClass.type.EPackage.EClassifiers.filter(c|c.name.matches("SampleModelRoot")).head as EClass, 
            metaClass.type, contained, "sampleClasses", 0, -1)

        val expectedOutput = '''
            /**
             * Creates a new {@link SampleClass} instance and adds it to the containing type.
             */
            protected SampleClass createSampleClass(final ICreateContext context) {
                // create SampleClass instance
                final SampleClass newClass = SamplePackFactory.eINSTANCE.createSampleClass();
                // ask user for SampleClass name
                String newName = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
                if (newName == null || newName.trim().length() == 0) {
                   return null;
                } else {
                   newClass.setName(newName);
                }
                boolean isContainment = false;
                final Object target = getBusinessObjectForPictogramElement(context.getTargetContainer());
                if (!isContainment) {
                    // add the element to containment reference
                    SampleModelRoot model = modelService.getModel();
                    model.getSampleClasses().add(newClass);
                }
                setDoneChanges(true);
                return newClass;
            }
        '''    
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
