package org.eclipselabs.spray.generator.graphiti.util.mm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipselabs.spray.mm.spray.Diagram;

@SuppressWarnings("all")
public class DiagramExtensions {
  public Diagram getDiagram(final EObject ctx) {
    Diagram _containerOfType = EcoreUtil2.<Diagram>getContainerOfType(ctx, org.eclipselabs.spray.mm.spray.Diagram.class);
    return _containerOfType;
  }
}
