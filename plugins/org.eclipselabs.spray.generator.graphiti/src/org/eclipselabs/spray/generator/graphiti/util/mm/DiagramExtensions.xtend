package org.eclipselabs.spray.generator.graphiti.util.mm

import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateConnectionFeature
import org.eclipselabs.spray.generator.graphiti.templates.features.CreateShapeFeature
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.Diagram
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipse.xtext.EcoreUtil2.*

class DiagramExtensions {
    def Diagram getDiagram (EObject ctx) {
        getContainerOfType(ctx, typeof(Diagram))
    }
    
    /**
     * Spray MetaClass can either be represented by a Connection or any other kind of Shape.
     * This method will return those MetaClasses of a Diagram that <i>are <b>not</b></i> represented by a Connection.
     */
    def Iterable<MetaClass> getMetaClassesForShapes (Diagram diagram) {
        diagram.metaClasses.filter(mc|!(mc.representedBy instanceof ConnectionInSpray))
    }
    
    /**
     * Spray MetaClass can either be represented by a Connection or any other kind of Shape.
     * This method will return those MetaClasses of a Diagram that <i>are</i> represented by a Connection.
     */
    def Iterable<MetaClass> getMetaClassesForConnections (Diagram diagram) {
        diagram.metaClasses.filter(mc|mc.representedBy instanceof ConnectionInSpray)
    }
    
    def dispatch Iterable<MetaClass> getElementsForTemplate (Diagram diagram, CreateShapeFeature template) {
        diagram.metaClasses.filter(mc|!(mc.representedBy instanceof ConnectionInSpray) && mc.behaviors.exists(b|b instanceof CreateBehavior))
    }
    
    def dispatch Iterable<MetaClass> getElementsForTemplate (Diagram diagram, CreateConnectionFeature template) {
        diagram.metaClasses.filter(mc|mc.representedBy instanceof ConnectionInSpray && mc.behaviors.exists(b|b instanceof CreateBehavior))
    }
    
    
}