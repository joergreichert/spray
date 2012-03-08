package org.eclipselabs.spray.generator.graphiti.templates.features

import org.eclipse.emf.ecore.EClass
import org.eclipselabs.spray.mm.spray.SprayFactory

class SprayModelTestHelper {

    def createDiagram(String name, EClass modelType) {
        val diagram = SprayFactory::eINSTANCE.createDiagram
        diagram.name = name
        diagram.modelType = modelType
        diagram 
    }

    def createMetaClass(EClass type) {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = type
        metaClass
    }
}