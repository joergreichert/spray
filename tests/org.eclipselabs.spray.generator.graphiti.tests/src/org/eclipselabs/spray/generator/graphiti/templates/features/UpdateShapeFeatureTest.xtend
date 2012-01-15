package org.eclipselabs.spray.generator.graphiti.templates.features

import com.google.inject.Inject
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Test
import org.junit.After
import org.junit.runner.RunWith
import java.io.File
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import static org.junit.Assert.*

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class UpdateShapeFeatureTest {
	@Inject
	UpdateShapeFeature sut
	
	@Test	
	def testMainExtensionPointFile__WheClassNameIsNull() {
		val Container container = null
		val String className = null
		val expectedOutput = expectedEmptyOutputMainExtensionPointFile()
		val output = sut.mainExtensionPointFile(container, className)
    	assertEquals("expected output", expectedOutput.toString, output.toString);
	} 
	
	def expectedEmptyOutputMainExtensionPointFile() '''
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

			public class  extends Base {
			    public (IFeatureProvider fp) {
			        super(fp);
			    }
			
			}
	'''	
	
	@Test	
	def testMainExtensionPointFile__WhenClassNameIsNotNull() {
		val Container container = null
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
			    public SampleClassName(IFeatureProvider fp) {
			        super(fp);
			    }
			
			}
	'''
	
	@Test
	def testGenerate_canUpdate__WhenContainerIsNull() {
		val Container container = null
		val output = sut.generate_canUpdate(container)
		val expectedOutput = expectedEmptyOutputGenerate_canUpdate()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_canUpdate__WhenContainerHasNoMetaClass() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val output = sut.generate_canUpdate(container)
		val expectedOutput = expectedEmptyOutputGenerate_canUpdate()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_canUpdate__WhenMetaClassNoName() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		container.represents = metaClass
		val output = sut.generate_canUpdate(container)
		val expectedOutput = expectedEmptyOutputGenerate_canUpdate()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
    def expectedEmptyOutputGenerate_canUpdate() '''
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean canUpdate(IUpdateContext context) {
                // return true, if linked business object is a EClass
                EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
                PictogramElement pictogramElement = context.getPictogramElement();
                return (bo instanceof )&& (!(pictogramElement instanceof Diagram));
            }
        '''	
	
	@Test
	def testGenerate_canUpdate__WhenMetaClassHasName() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = "SampleEClass"
		metaClass.type = eClass 
		container.represents = metaClass
		val output = sut.generate_canUpdate(container)
		val expectedOutput = '''
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean canUpdate(IUpdateContext context) {
                // return true, if linked business object is a EClass
                EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
                PictogramElement pictogramElement = context.getPictogramElement();
                return (bo instanceof SampleEClass)&& (!(pictogramElement instanceof Diagram));
            }
		'''
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}   	
	
	@Test
	def testGenerate_updateNeeded__WhenContainerIsNull() {
		val Container container = null
		val output = sut.generate_updateNeeded(container)
		val expectedOutput = expectedEmptyOutputGenerate_updateNeeded()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_updateNeededWhenContainerHasNoMetaClass() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val output = sut.generate_updateNeeded(container)
		val expectedOutput = expectedEmptyOutputGenerate_updateNeeded()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_updateNeeded__WhenMetaClassNoName() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		container.represents = metaClass
		val output = sut.generate_updateNeeded(container)
		val expectedOutput = expectedEmptyOutputGenerate_updateNeeded()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
    def expectedEmptyOutputGenerate_updateNeeded() '''
            /**
             * {@inheritDoc}
             */
            @Override
            public IReason updateNeeded(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof )) {
                    return Reason.createFalseReason(); 
                }
                    eClass = () bo;

                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    ContainerShape cs = (ContainerShape) pictogramElement;
                    ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            Text text = (Text) shape.getGraphicsAlgorithm();
                            String type = peService.getPropertyValue(shape, ISprayConstants.PROPERTY_MODEL_TYPE);
                            String value = getValues(eClass).get(type);
                            if( value != null){
                                   String pictogramName = text.getValue();

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
        
	@Test
	def testGenerate_updateNeeded__WhenMetaClassHasName() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = "SampleEClass"
		metaClass.type = eClass 
		container.represents = metaClass
		val output = sut.generate_updateNeeded(container)
		val expectedOutput = '''
            /**
             * {@inheritDoc}
             */
            @Override
            public IReason updateNeeded(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                if ( ! (bo instanceof SampleEClass)) {
                    return Reason.createFalseReason(); 
                }
                   SampleEClass eClass = (SampleEClass) bo;

                // retrieve name from pictogram model
                if (pictogramElement instanceof ContainerShape) {
                    ContainerShape cs = (ContainerShape) pictogramElement;
                    ContainerShape textBox = SprayContainerService.findTextShape(cs);
                    for (Shape shape : textBox.getChildren()) {
                        if (shape.getGraphicsAlgorithm() instanceof Text) {
                            Text text = (Text) shape.getGraphicsAlgorithm();
                            String type = peService.getPropertyValue(shape, ISprayConstants.PROPERTY_MODEL_TYPE);
                            String value = getValues(eClass).get(type);
                            if( value != null){
                                   String pictogramName = text.getValue();

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
	def testGenerate_update__WhenContainerIsNull() {
		val Container container = null
		val output = sut.generate_update(container)
		val expectedOutput = expectedEmptyOutputGenerate_update()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_update__WhenContainerHasNoMetaClass() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val output = sut.generate_update(container)
		val expectedOutput = expectedEmptyOutputGenerate_update()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_update__WhenMetaClassNoName() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		container.represents = metaClass
		val output = sut.generate_update(container)
		val expectedOutput = expectedEmptyOutputGenerate_update()
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	def expectedEmptyOutputGenerate_update() '''
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean update(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                   eClass = () bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
	'''

	@Test
	def testGenerate_update__WhenMetaClassHasName() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = "SampleEClass"
		metaClass.type = eClass 
		container.represents = metaClass
		val output = sut.generate_update(container)
		val expectedOutput = '''
            /**
             * {@inheritDoc}
             */
            @Override
            public boolean update(IUpdateContext context) {
                PictogramElement pictogramElement = context.getPictogramElement();
                EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
                  SampleEClass eClass = (SampleEClass) bo;
                return SprayContainerService.update(pictogramElement, getValues(eClass));
                
            }
		'''
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@Test
	def testGenerate_valueMapping__WhenContainerIsNull() {
		val Container container = null
		val expectedOutput = expectedOutputGenerate_valueMappingWhenTypeIsNull()
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@Test
	def testGenerate_valueMapping__WhenContainerIsEmpty() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val expectedOutput = expectedOutputGenerate_valueMappingWhenTypeIsNull()
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	def expectedOutputGenerate_valueMappingWhenTypeIsNull() '''
		Map<String, String> values = null; 
		protected Map<String, String> getValues( eClass) {
		    if (values == null) {
		        values = new HashMap<String, String>();
		        fillValues(eClass);
		    }
		    return values;
		}

		protected void fillValues( eClass) {
		    String type, value;
		}

		protected String getValue (String type,  eClass) {
		    throw new IllegalArgumentException(type);
		}
	'''		
	
	
	@Test(expected=typeof(NullPointerException))
	def void testGenerate_valueMapping__WhenTextHasNoFullyQualifiedName__NPEExpected() {
		val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
		val Container container = SprayFactory::eINSTANCE.createContainer
		val text = SprayFactory::eINSTANCE.createText
		val rectangle = SprayFactory::eINSTANCE.createRectangle
		container.partsList.add(rectangle)
		container.partsList.add(text)
		res.contents.add(container)
		sut.generate_valueMapping(container)
	}	
	
	@Test
	def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameWithoutRepresents() {
		val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
		val Container container = SprayFactory::eINSTANCE.createContainer
		val text = SprayFactory::eINSTANCE.createText
		val literal = XbaseFactory::eINSTANCE.createXStringLiteral
		literal.value = "test"
		text.value = literal
		val rectangle = SprayFactory::eINSTANCE.createRectangle
		container.partsList.add(rectangle)
		container.partsList.add(text)
		res.contents.add(container)
		sut.generate_valueMapping(container)
		val expectedOutput = expectedOutputGenerate_valueMappingWhenTypeIsEmpty()
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	def expectedOutputGenerate_valueMappingWhenTypeIsEmpty() '''
        Map<String, String> values = null; 
        protected Map<String, String> getValues( eClass) {
            if (values == null) {
                values = new HashMap<String, String>();
                fillValues(eClass);
            }
            return values;
        }

        protected void fillValues( eClass) {
            String type, value;
        type = "";
        value = getValue(type, eClass);
        values.put(type, value);
        }

        protected String getValue (String type,  eClass) {
        if ("".equals(type)) {
            
            return "test";
        }
            throw new IllegalArgumentException(type);
        }
	'''	
	
	@Test
	def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameAndRepresentsWithNullName() {
		val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		container.represents = metaClass 
		val text = SprayFactory::eINSTANCE.createText
		val literal = XbaseFactory::eINSTANCE.createXStringLiteral
		literal.value = "test"
		text.value = literal
		val rectangle = SprayFactory::eINSTANCE.createRectangle
		container.partsList.add(rectangle)
		container.partsList.add(text)
		res.contents.add(container)
		sut.generate_valueMapping(container)
		val expectedOutput = expectedOutputGenerate_valueMappingWhenTypeIsEmpty()
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameAndRepresentsWithAliasSet() {
		val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
		val Container container = SprayFactory::eINSTANCE.createContainer
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		metaClass.alias = "Alias"
		container.represents = metaClass 
		val text = SprayFactory::eINSTANCE.createText
		val literal = XbaseFactory::eINSTANCE.createXStringLiteral
		literal.value = "test"
		text.value = literal
		val rectangle = SprayFactory::eINSTANCE.createRectangle
		container.partsList.add(rectangle)
		container.partsList.add(text)
		res.contents.add(container)
		sut.generate_valueMapping(container)
		val expectedOutput = expectedOutputGenerate_valueMappingWhenTypeIsEmpty()
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
	
	@Test
	def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameAndRepresentsWithNameSetAndDiagramHasNoName() {
		val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
		val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		// without the diagram name set, the qualified name of text cannot be calculated and the type in the generated code will be empty
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = "SampleEClass"
		metaClass.type = eClass 
		val Container container = SprayFactory::eINSTANCE.createContainer
		metaClass.representedBy = container // have to be contained
		val text = SprayFactory::eINSTANCE.createText
		val literal = XbaseFactory::eINSTANCE.createXStringLiteral
		literal.value = "test"
		text.value = literal
		val rectangle = SprayFactory::eINSTANCE.createRectangle
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
        protected Map<String, String> getValues(SampleEClass eClass) {
            if (values == null) {
                values = new HashMap<String, String>();
                fillValues(eClass);
            }
            return values;
        }

        protected void fillValues(SampleEClass eClass) {
            String type, value;
        type = "";
        value = getValue(type, eClass);
        values.put(type, value);
        }

        protected String getValue (String type, SampleEClass eClass) {
        if ("".equals(type)) {
            
            return "test";
        }
            throw new IllegalArgumentException(type);
        }
	'''		
	
	@Test
	def testGenerate_valueMapping__WhenTextWithFullyQualifiedNameAndRepresentsWithNameSetAndDiagramHasName() {
		val Resource res = new ResourceImpl() // expression compiler needs Eobject in resource
		val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		diagram.name = "SampleDiagram"
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = "SampleEClass"
		metaClass.type = eClass 
		val Container container = SprayFactory::eINSTANCE.createContainer
		metaClass.representedBy = container // have to be contained
		val text = SprayFactory::eINSTANCE.createText
		val literal = XbaseFactory::eINSTANCE.createXStringLiteral
		literal.value = "test"
		text.value = literal
		val rectangle = SprayFactory::eINSTANCE.createRectangle
		container.partsList.add(rectangle)
		container.partsList.add(text)
		diagram.metaClassesList.add(metaClass)
		res.contents.add(diagram)
		sut.generate_valueMapping(container)
		val expectedOutput = '''
            Map<String, String> values = null; 
            protected Map<String, String> getValues(SampleEClass eClass) {
                if (values == null) {
                    values = new HashMap<String, String>();
                    fillValues(eClass);
                }
                return values;
            }

            protected void fillValues(SampleEClass eClass) {
                String type, value;
            type = "SampleDiagram.Container0.Text1";
            value = getValue(type, eClass);
            values.put(type, value);
            }
            
            protected String getValue (String type, SampleEClass eClass) {
            if ("SampleDiagram.Container0.Text1".equals(type)) {
                
                return "test";
            }
                throw new IllegalArgumentException(type);
            }
        ''' 
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@Test	
	def testMainFile__WheContainerAndClassNameAreNull() {
		val Container container = null
		val String className = null
		val expectedOutput = expectedEmptyOutputMainFile() 
		val output = sut.mainFile(container, className)
    	assertEquals("expected output", expectedOutput.toString, output.toString);
	} 	

	def expectedEmptyOutputMainFile() '''
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
		import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
		import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
		import org.eclipselabs.spray.runtime.containers.SprayContainerService;
		import ;
		// MARKER_IMPORT

		public class  extends AbstractUpdateFeature {
		    public (IFeatureProvider fp) {
		        super(fp);
		        gaService = .get(IGaService.class);
		    }
		 
		«expectedEmptyOutputMainFileEnd()»
	'''
	
	def expectedEmptyOutputMainFileEnd() '''
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a EClass
        EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
        PictogramElement pictogramElement = context.getPictogramElement();
        return (bo instanceof )&& (!(pictogramElement instanceof Diagram));
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public IReason updateNeeded(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
        if ( ! (bo instanceof )) {
            return Reason.createFalseReason(); 
        }
            eClass = () bo;
    
        // retrieve name from pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            ContainerShape textBox = SprayContainerService.findTextShape(cs);
            for (Shape shape : textBox.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    String type = peService.getPropertyValue(shape, ISprayConstants.PROPERTY_MODEL_TYPE);
                    String value = getValues(eClass).get(type);
                    if( value != null){
                           String pictogramName = text.getValue();
    
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
    public boolean update(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
           eClass = () bo;
        return SprayContainerService.update(pictogramElement, getValues(eClass));
        
    }
    Map<String, String> values = null; 
    protected Map<String, String> getValues( eClass) {
        if (values == null) {
            values = new HashMap<String, String>();
            fillValues(eClass);
        }
        return values;
    }
    
    protected void fillValues( eClass) {
        String type, value;
    }
    
    protected String getValue (String type,  eClass) {
        throw new IllegalArgumentException(type);
    }
}
	'''
	 
	@Test	
	def testMainFile__WhenContainerHasDiagram() {
		val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		diagram.name = "SampleDiagram"
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
//		val eClass = EcoreFactory::eINSTANCE.createEClass
//		eClass.name = "SampleEClass"
//		metaClass.type = eClass 
		val Container container = SprayFactory::eINSTANCE.createContainer
		metaClass.representedBy = container // have to be contained
//		val text = SprayFactory::eINSTANCE.createText
//		val literal = XbaseFactory::eINSTANCE.createXStringLiteral
//		literal.value = "test"
//		text.value = literal
//		val rectangle = SprayFactory::eINSTANCE.createRectangle
//		container.partsList.add(rectangle)
//		container.partsList.add(text)
		diagram.metaClassesList.add(metaClass)
		val String className = null
		val expectedOutput = expectedOutputMainFileWhenContainerHasDiagram()
		sut.importUtil.initImports("features")
		val output = sut.mainFile(container, className)
    	assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	def expectedOutputMainFileWhenContainerHasDiagram() '''
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
		import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
		import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
		import org.eclipselabs.spray.runtime.containers.SprayContainerService;
		import ;
		// MARKER_IMPORT

		public class  extends AbstractUpdateFeature {
		    public (IFeatureProvider fp) {
		        super(fp);
		        gaService = Activator.get(IGaService.class);
		    }
		 
		«expectedEmptyOutputMainFileEnd()»
	'''
	
	@Inject
    private ResourceSet resourceSet
	
	@Test
	def testMainFile__WhenContainerHasMetaClassName() {
		val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
		diagram.name = "SampleDiagram"
		val metaClass = SprayFactory::eINSTANCE.createMetaClass
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = "SampleEClass"
		val ePackage = EcoreFactory::eINSTANCE.createEPackage
		ePackage.name = "samplepackage"
		ePackage.nsURI = "test.xmi"
		val URI genModelUri = URI::createURI("gentest.genmodel")
		EcorePlugin::getEPackageNsURIToGenModelLocationMap().put(ePackage.nsURI, genModelUri)
		val GenModel genModel = GenModelFactory::eINSTANCE.createGenModel()
		ePackage.getEClassifiers().add(eClass)
		metaClass.type = eClass 
		val GenClass genClass = GenModelFactory::eINSTANCE.createGenClass()
		genClass.ecoreClass = eClass
		val GenPackage genPackage = GenModelFactory::eINSTANCE.createGenPackage()
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
		val Container container = SprayFactory::eINSTANCE.createContainer()
		metaClass.representedBy = container // have to be contained
		diagram.metaClassesList.add(metaClass)
		val String className = null
		val expectedOutput = expectedOutputMainFileWheContainerHasMetaClassName()
		sut.importUtil.initImports("features")
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
	
	def expectedOutputMainFileWheContainerHasMetaClassName() '''
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
		import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
		import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
		import org.eclipselabs.spray.runtime.containers.SprayContainerService;
		import samplepackage.SampleEClass;
		// MARKER_IMPORT

		public class  extends AbstractUpdateFeature {
		    public (IFeatureProvider fp) {
		        super(fp);
		        gaService = Activator.get(IGaService.class);
		    }
		 
		    /**
		     * {@inheritDoc}
		     */
		    @Override
		    public boolean canUpdate(IUpdateContext context) {
		        // return true, if linked business object is a EClass
		        EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
		        PictogramElement pictogramElement = context.getPictogramElement();
		        return (bo instanceof SampleEClass)&& (!(pictogramElement instanceof Diagram));
		    }
		    /**
		     * {@inheritDoc}
		     */
		    @Override
		    public IReason updateNeeded(IUpdateContext context) {
		        PictogramElement pictogramElement = context.getPictogramElement();
		        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
		        if ( ! (bo instanceof SampleEClass)) {
		            return Reason.createFalseReason(); 
		        }
		           SampleEClass eClass = (SampleEClass) bo;
		    
		        // retrieve name from pictogram model
		        if (pictogramElement instanceof ContainerShape) {
		            ContainerShape cs = (ContainerShape) pictogramElement;
		            ContainerShape textBox = SprayContainerService.findTextShape(cs);
		            for (Shape shape : textBox.getChildren()) {
		                if (shape.getGraphicsAlgorithm() instanceof Text) {
		                    Text text = (Text) shape.getGraphicsAlgorithm();
		                    String type = peService.getPropertyValue(shape, ISprayConstants.PROPERTY_MODEL_TYPE);
		                    String value = getValues(eClass).get(type);
		                    if( value != null){
		                           String pictogramName = text.getValue();
		    
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
		    public boolean update(IUpdateContext context) {
		        PictogramElement pictogramElement = context.getPictogramElement();
		        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
		          SampleEClass eClass = (SampleEClass) bo;
		        return SprayContainerService.update(pictogramElement, getValues(eClass));
		        
		    }
		    Map<String, String> values = null; 
		    protected Map<String, String> getValues(SampleEClass eClass) {
		        if (values == null) {
		            values = new HashMap<String, String>();
		            fillValues(eClass);
		        }
		        return values;
		    }
		    
		    protected void fillValues(SampleEClass eClass) {
		        String type, value;
		    }
		    
		    protected String getValue (String type, SampleEClass eClass) {
		        throw new IllegalArgumentException(type);
		    }
		}
	'''
}