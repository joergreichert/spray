package org.eclipselabs.spray.generator.graphiti.util.mm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.SprayFactory;
import org.eclipselabs.spray.mm.spray.Text;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class DiagramExtensionsTest {
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
      DiagramExtensions _diagramExtensions = new DiagramExtensions();
      final DiagramExtensions diagramExtensions = _diagramExtensions;
      Diagram _diagram = diagramExtensions.getDiagram(metaClass);
      final Diagram foundDiagram = _diagram;
      Assert.assertNull(foundDiagram);
  }
  
  private void executeGetDiagramTest(final EObject element, final Diagram expectedDiagram, final String message) {
      DiagramExtensions _diagramExtensions = new DiagramExtensions();
      final DiagramExtensions diagramExtensions = _diagramExtensions;
      Diagram _diagram = diagramExtensions.getDiagram(element);
      final Diagram foundDiagram = _diagram;
      Assert.assertEquals(foundDiagram, expectedDiagram);
  }
}
