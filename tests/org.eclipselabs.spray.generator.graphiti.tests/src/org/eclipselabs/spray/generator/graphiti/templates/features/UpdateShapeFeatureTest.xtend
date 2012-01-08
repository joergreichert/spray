package org.eclipselabs.spray.generator.graphiti.templates.features

import org.junit.Test
import static org.junit.Assert.*
import com.google.inject.Inject
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider
import org.eclipselabs.spray.mm.spray.Container
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipse.xtext.xbase.XbaseFactory
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipselabs.spray.mm.spray.Diagram

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class UpdateShapeFeatureTest {
	@Inject
	UpdateShapeFeature sut
	
	@Test
	def testGenerate_valueMapping__WhenContainerIsNull() {
		val Container container = null
		val expectedOutput = '''
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
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output length", expectedOutput.length, output.length);
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
	@Test
	def testGenerate_valueMapping__WhenContainerIsEmpty() {
		val Container container = SprayFactory::eINSTANCE.createContainer
		val expectedOutput = '''
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
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output length", expectedOutput.length, output.length);
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
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
		val expectedOutput = '''
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
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output length", expectedOutput.length, output.length);
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}		
	
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
		val expectedOutput = '''
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
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output length", expectedOutput.length, output.length);
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
		val expectedOutput = '''
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
		val output = sut.generate_valueMapping(container)
		System::out.println(output)		
		assertEquals("expected output length", expectedOutput.length, output.length);
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
		val output = sut.generate_valueMapping(container)
		assertEquals("expected output length", expectedOutput.length, output.length);
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}
	
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
		assertEquals("expected output length", expectedOutput.length, output.length);
		assertEquals("expected output", expectedOutput.toString, output.toString);
	}	
}