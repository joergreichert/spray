package org.eclipselabs.spray.generator.graphiti.templates.features

import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.resource.ResourceSet
import static org.junit.Assert.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EClassifier

class DomainModelTestHelper {
    
    def EClass createEClass(String name) {
        val eClass = EcoreFactory::eINSTANCE.createEClass
        eClass.name = name
        eClass
    }

    def EDataType createEDataType(String name) {
        val eDataType = EcoreFactory::eINSTANCE.createEDataType
        eDataType.name = name
        eDataType
    }
    
    def EAttribute createEAttribute(EClass eClass, String name, EClassifier type) {
        val eAttribute = EcoreFactory::eINSTANCE.createEAttribute
        eAttribute.name = name
        eAttribute.EType = type
        eClass.getEStructuralFeatures().add(eAttribute)
        eAttribute
    }
    
    def EReference createEReference(EClass container, EClass containee, boolean contained) {
        val classReferences = EcoreFactory::eINSTANCE.createEReference
        classReferences.containment = contained
        classReferences.eType = containee
        container.getEStructuralFeatures().add(classReferences)
        classReferences
    }
    
    def EPackage createEPackage(ResourceSet resourceSet, String name, String nsURI) {
        Helper::registerXmiModel(resourceSet)
        val ePackage = EcoreFactory::eINSTANCE.createEPackage
        ePackage.name = name
        ePackage.nsURI = nsURI
        ePackage
    }
    
    def addEClassifiersToEPackage(EPackage ePackage, List<? extends EClassifier> eClassifiers) {
        eClassifiers.forEach(c|ePackage.getEClassifiers().add(c))
    }
    
    def Resource createResource(ResourceSet resourceSet, EPackage ePackage) {
        val Resource res = resourceSet.createResource(URI::createURI(ePackage.nsURI));
        assertNotNull("EMF resource expected to be not null", res)
        res.contents.add(ePackage)
        res.save(null)
        res
    }
}