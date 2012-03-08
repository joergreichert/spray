package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.Diagram
import static org.eclipse.xtext.EcoreUtil2.*

class MetaReferenceExtensions {
    def Diagram getDiagram (MetaReference reference) {
        getContainerOfType(reference, typeof(Diagram))
    }
}