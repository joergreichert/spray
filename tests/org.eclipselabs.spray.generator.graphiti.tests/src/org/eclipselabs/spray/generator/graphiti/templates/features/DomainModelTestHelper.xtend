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

class DomainModelTestHelper {
	
	def EClass createEClass(String name) {
		val eClass = EcoreFactory::eINSTANCE.createEClass
		eClass.name = name
		eClass
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
	
	def addEClassesToEPackage(EPackage ePackage, List<EClass> eClasses) {
		eClasses.forEach(c|ePackage.getEClassifiers().add(c))
	}
	
	def Resource createResource(ResourceSet resourceSet, EPackage ePackage) {
		val Resource res = resourceSet.createResource(URI::createURI(ePackage.nsURI));
		assertNotNull("EMF resource expected to be not null", res)
		res.contents.add(ePackage)
		res.save(null)
		res
	}
}