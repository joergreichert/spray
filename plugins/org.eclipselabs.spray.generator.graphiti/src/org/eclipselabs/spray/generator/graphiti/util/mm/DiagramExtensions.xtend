package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipse.emf.ecore.EObject
import static org.eclipse.xtext.EcoreUtil2.*
import org.eclipselabs.spray.mm.spray.Diagram

class DiagramExtensions {
    def Diagram getDiagram (EObject ctx) {
        getContainerOfType(ctx, typeof(Diagram))
    }
}