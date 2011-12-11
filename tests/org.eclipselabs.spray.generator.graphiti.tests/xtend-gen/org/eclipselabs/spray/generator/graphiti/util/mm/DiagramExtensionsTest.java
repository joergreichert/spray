package org.eclipselabs.spray.generator.graphiti.util.mm;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.mm.spray.Text;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class DiagramExtensionsTest {
  @Inject
  private DiagramExtensions diagramExtensions;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  @Test
  public void testGetDiagram_WhenDiagramIsInput__FoundExpected() {
      Diagram _createDiagram = SprayFactory.eINSTANCE.createDiagram();
      final Diagram diagram = _createDiagram;
      this.executeGetDiagramTest(diagram, diagram, "Diagram should be returned for diagram");
  }
  
  @Test
  public void testGetDiagram_WhenDiagramIsDirectSuperClass__FoundExpected() {
      Diagram _createDiagram = SprayFactory.eINSTANCE.createDiagram();
      final Diagram diagram = _createDiagram;
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      EList<MetaClass> _metaClassesList = diagram.getMetaClassesList();
      _metaClassesList.add(metaClass);
      this.executeGetDiagramTest(metaClass, diagram, "Diagram should be returned for metaClass");
  }
  
  @Test
  public void testGetDiagram_WhenDiagramIsIndirectSuperClass__FoundExpected() {
      Diagram _createDiagram = SprayFactory.eINSTANCE.createDiagram();
      final Diagram diagram = _createDiagram;
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      EList<MetaClass> _metaClassesList = diagram.getMetaClassesList();
      _metaClassesList.add(metaClass);
      Container _createContainer = SprayFactory.eINSTANCE.createContainer();
      final Container container = _createContainer;
      metaClass.setRepresentedBy(container);
      Text _createText = SprayFactory.eINSTANCE.createText();
      final Text text = _createText;
      EList<SprayElement> _partsList = container.getPartsList();
      _partsList.add(text);
      this.executeGetDiagramTest(text, diagram, "Diagram should be returned for text");
  }
  
  @Test
  public void testGetDiagram_WhenDiagramIsNotSuperClass__NullExpected() {
      MetaClass _createMetaClass = SprayFactory.eINSTANCE.createMetaClass();
      final MetaClass metaClass = _createMetaClass;
      Diagram _diagram = this.diagramExtensions.getDiagram(metaClass);
      final Diagram foundDiagram = _diagram;
      Assert.assertNull(foundDiagram);
  }
  
  private void executeGetDiagramTest(final EObject element, final Diagram expectedDiagram, final String message) {
      Diagram _diagram = this.diagramExtensions.getDiagram(element);
      final Diagram foundDiagram = _diagram;
      Assert.assertEquals(foundDiagram, expectedDiagram);
  }
  
  @Test
  public void test_getElementsForTemplate_CreateShapeFeature__FoundExpected() {
      XtextResourceSet _get = this.resourceSetProvider.get();
      final XtextResourceSet rs = _get;
      StandaloneSetup _standaloneSetup = new StandaloneSetup();
      final StandaloneSetup setup = _standaloneSetup;
  }
}
