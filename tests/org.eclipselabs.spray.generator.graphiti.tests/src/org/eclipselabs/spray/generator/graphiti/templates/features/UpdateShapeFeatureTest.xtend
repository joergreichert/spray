package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.After
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class UpdateShapeFeatureTest {
    @Inject
    UpdateShapeFeature sut
    @Inject
    SprayFactory factory
    @Inject
    EcoreFactory ecoreFactory
    @Inject
    XbaseFactory xbaseFactory 
    @Inject
    GenModelFactory genmodelFactory
    @Inject
    private ResourceSet resourceSet
    
    @Test
    def testMainExtensionPointFile__WhenClassNameIsNotNull() {
        val ContainerInSpray container = null
        val String className = "SampleClassName"
        val expectedOutput = expectedOutputMainExtensionPointFile()
        val output = sut.mainExtensionPointFile(container, className)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    def expectedOutputMainExtensionPointFile() '''
            /*************************************************************************************
             *
             * Generated on «new java.util.Date()» by Spray UpdateShapeFeature.xtend
             * 
             * This file is an extension point: copy to "src" folder to manually add code to this
             * extension point.
             *
             *************************************************************************************/
            package features;

            import org.eclipse.graphiti.features.IFeatureProvider;

            public class SampleClassName extends SampleClassNameBase {
                public SampleClassName(final IFeatureProvider fp) {
                    super(fp);
                }
            
            }
    '''
    
    @Test
    def testGenerate_canUpdate__WhenMetaClassHasName() {
        val ContainerInSpray container = factory.createContainerInSpray
        val metaClass = factory.createMetaClass
        val eClass = ecoreFactory.createEClass
        eClass.name = "SampleEClass"
        metaClass.type = eClass 
        container.represents = metaClass
        val output = sut.generate_canUpdate(container)
        val expectedOutput = '''
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean canUpdate(final IUpdateContext context) {
                // return true, if linked business object is a EClass
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                return (bo instanceof SampleEClass)&& (!(pictogramElement instanceof Diagram));
            }
        '''
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }       
    
    @Test
    def testGenerate_updateNeeded__WhenMetaClassHasName() {
        val ContainerInSpray container = factory.createContainerInSpray
        val metaClass = factory.createMetaClass
        val eClass = ecoreFactory.createEClass
        eClass.name = "SampleEClass"
        metaClass.type = eClass 
        container.represents = metaClass
        val output = sut.generate_updateNeeded(container)
        val expectedOutput = '''
            /**
             * {@inheritDoc}
             */
            @Override
            public IReason updateNeeded(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof SampleEClass)) {
                    return Reason.createFalseReason(); 
                }
                final SampleEClass eClass = (SampleEClass) bo;

                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    final ContainerShape cs = (ContainerShape) pictogramElement;
                    final ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (final Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            final Text text = (Text) shape.getGraphicsAlgorithm();
                            final String type = peService.getPropertyValue(shape, PROPERTY_MODEL_TYPE);
                            final String value = getValues(eClass).get(type);
                            if(value != null){
                                final String pictogramName = text.getValue();

                                // update needed, if names are different
                                boolean updateNameNeeded =((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));
                                if (updateNameNeeded) {
                                    return Reason.createTrueReason("Name [" + pictogramName + "] is out of date");
                                }
                            }
                        }
                    }
                }
                return Reason.createFalseReason();
             }
        '''
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }        
    
    @Test
    def testGenerate_update__WhenMetaClassHasName() {
        val ContainerInSpray container = factory.createContainerInSpray
        val metaClass = factory.createMetaClass
        val eClass = ecoreFactory.createEClass
        eClass.name = "SampleEClass"
        metaClass.type = eClass 
        container.represents = metaClass
        val output = sut.generate_update(container)
        val expectedOutput = '''
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean update(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                final SampleEClass eClass = (SampleEClass) bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
        '''
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    @Test
    def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameAndRepresentsWithNameSetAndDiagramHasNoName() {
        val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
        val Diagram diagram = factory.createDiagram
        // without the diagram name set, the qualified name of text cannot be calculated and the type in the generated code will be empty
        val metaClass = factory.createMetaClass
        val eClass = ecoreFactory.createEClass
        eClass.name = "SampleEClass"
        metaClass.type = eClass 
        val ContainerInSpray container = factory.createContainerInSpray
        metaClass.representedBy = container // have to be contained
        val text = factory.createTextInSpray
        val literal = xbaseFactory.createXStringLiteral
        literal.value = "test"
        text.value = literal
        val rectangle = factory.createRectangleInSpray
        container.partsList.add(rectangle)
        container.partsList.add(text)
        diagram.metaClassesList.add(metaClass)
        res.contents.add(diagram)
        sut.generate_valueMapping(container)
        val expectedOutput = expectedOutputGenerate_valueMappingWhenDiagramNameIsNull()
        val output = sut.generate_valueMapping(container)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    def expectedOutputGenerate_valueMappingWhenDiagramNameIsNull() '''
        Map<String, String> values = null; 
        protected Map<String, String> getValues(final SampleEClass eClass) {
            if (values == null) {
                values = new HashMap<String, String>();
                fillValues(eClass);
            }
            return values;
        }

        protected void fillValues(final SampleEClass eClass) {
            String type, value;
        type = "";
        value = getValue(type, eClass);
        values.put(type, value);
        }

        protected String getValue (final String type, final SampleEClass eClass) {
        if ("".equals(type)) {
            
            return "test";
        }
            throw new IllegalArgumentException(type);
        }
    '''        
    
    @Test
    def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameAndRepresentsWithNameSetAndDiagramHasName() {
        val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
        val Diagram diagram = factory.createDiagram
        diagram.name = "SampleDiagram"
        val metaClass = factory.createMetaClass
        val eClass = ecoreFactory.createEClass
        eClass.name = "SampleEClass"
        metaClass.type = eClass 
        val ContainerInSpray container = factory.createContainerInSpray
        metaClass.representedBy = container // have to be contained
        val text = factory.createTextInSpray
        val literal = xbaseFactory.createXStringLiteral
        literal.value = "test"
        text.value = literal
        val rectangle = factory.createRectangleInSpray
        container.partsList.add(rectangle)
        container.partsList.add(text)
        diagram.metaClassesList.add(metaClass)
        res.contents.add(diagram)
        sut.generate_valueMapping(container)
        val expectedOutput = '''
            Map<String, String> values = null; 
            protected Map<String, String> getValues(final SampleEClass eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }

            protected void fillValues(final SampleEClass eClass) {
                String type, value;
            type = "SampleDiagram.ContainerInSpray0.TextInSpray1";
            value = getValue(type, eClass);
            values.put(type, value);
            }
            
            protected String getValue (final String type, final SampleEClass eClass) {
            if ("SampleDiagram.ContainerInSpray0.TextInSpray1".equals(type)) {
                
                return "test";
            }
                throw new IllegalArgumentException(type);
            }
        ''' 
        val output = sut.generate_valueMapping(container)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    @Test
    def testMainFile__WhenContainerHasMetaClassName() {
        val Diagram diagram = factory.createDiagram
        diagram.name = "SampleDiagram"
        val metaClass = factory.createMetaClass
        val eClass = ecoreFactory.createEClass
        eClass.name = "SampleEClass"
        val ePackage = ecoreFactory.createEPackage
        ePackage.name = "samplepackage"
        ePackage.nsURI = "test.xmi"
        val URI genModelUri = URI::createURI("gentest.genmodel")
        EcorePlugin::getEPackageNsURIToGenModelLocationMap().put(ePackage.nsURI, genModelUri)
        val GenModel genModel = genmodelFactory.createGenModel()
        ePackage.getEClassifiers().add(eClass)
        metaClass.type = eClass 
        val GenClass genClass = genmodelFactory.createGenClass()
        genClass.ecoreClass = eClass
        val GenPackage genPackage = genmodelFactory.createGenPackage()
        genPackage.genClasses.add(genClass)
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
        val ContainerInSpray container = factory.createContainerInSpray()
        metaClass.representedBy = container // have to be contained
        diagram.metaClassesList.add(metaClass)
        val String className = "MyUpdateFeature"
        val expectedOutput = expectedOutputMainFileWhenContainerHasMetaClassName()
        //sut.importUtil.initImports("features")
        val output = sut.mainFile(container, className)
        assertEquals("expected output", expectedOutput.toString, output.toString);
    }
    
    @After
    def void tearDown() {
        val file = new java.io.File("test.xmi");
        if(file.exists) file.delete()
        val genFile = new java.io.File("gentest.genmodel");
        if(genFile.exists) genFile.delete()
    }
    
    def expectedOutputMainFileWhenContainerHasMetaClassName() '''
        /*************************************************************************************
         *
         * Generated on «new java.util.Date()» by Spray UpdateShapeFeature.xtend
         *
         * This file contains generated and should not be changed.
         * Use the extension point class (the direct subclass of this class) to add manual code
         *
         *************************************************************************************/
        package features;

        import java.util.HashMap;
        import java.util.Map;

        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.IReason;
        import org.eclipse.graphiti.features.context.IUpdateContext;
        import org.eclipse.graphiti.features.impl.Reason;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.mm.pictograms.ContainerShape;
        import org.eclipse.graphiti.mm.pictograms.Diagram;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.pictograms.Shape;
        import org.eclipse.graphiti.services.IGaService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
        import org.eclipselabs.spray.runtime.containers.SprayContainerService;
        import samplepackage.SampleEClass;
        // MARKER_IMPORT

        public abstract class MyUpdateFeature extends AbstractUpdateFeature {
            public MyUpdateFeature(final IFeatureProvider fp) {
                super(fp);
                gaService = Activator.get(IGaService.class);
            }
         
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean canUpdate(final IUpdateContext context) {
                // return true, if linked business object is a EClass
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                return (bo instanceof SampleEClass)&& (!(pictogramElement instanceof Diagram));
            }
            /**
             * {@inheritDoc}
             */
            @Override
            public IReason updateNeeded(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof SampleEClass)) {
                    return Reason.createFalseReason(); 
                }
                final SampleEClass eClass = (SampleEClass) bo;
            
                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    final ContainerShape cs = (ContainerShape) pictogramElement;
                    final ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (final Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            final Text text = (Text) shape.getGraphicsAlgorithm();
                            final String type = peService.getPropertyValue(shape, PROPERTY_MODEL_TYPE);
                            final String value = getValues(eClass).get(type);
                            if(value != null){
                                final String pictogramName = text.getValue();
            
                                // update needed, if names are different
                                boolean updateNameNeeded =((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));
                                if (updateNameNeeded) {
                                    return Reason.createTrueReason("Name [" + pictogramName + "] is out of date");
                                }
                            }
                        }
                    }
                }
                return Reason.createFalseReason();
             }
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean update(final IUpdateContext context) {
                final PictogramElement pictogramElement = context.getPictogramElement();
                final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                final SampleEClass eClass = (SampleEClass) bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
            Map<String, String> values = null; 
            protected Map<String, String> getValues(final SampleEClass eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }
            
            protected void fillValues(final SampleEClass eClass) {
                String type, value;
            }
            
            protected String getValue (final String type, final SampleEClass eClass) {
                throw new IllegalArgumentException(type);
            }
        }
    '''
}