package org.eclipselabs.spray.generator.graphiti.util.mm;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaReference;

@SuppressWarnings("all")
public class MetaReferenceExtensions {
  public Diagram getDiagram(final MetaReference reference) {
    Diagram _containerOfType = EcoreUtil2.<Diagram>getContainerOfType(reference, org.eclipselabs.spray.mm.spray.Diagram.class);
    return _containerOfType;
  }
}
