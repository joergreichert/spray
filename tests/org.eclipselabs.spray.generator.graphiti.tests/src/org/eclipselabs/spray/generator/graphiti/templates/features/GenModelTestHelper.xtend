package org.eclipselabs.spray.generator.graphiti.templates.features

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import static org.junit.Assert.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EcorePackage

class GenModelTestHelper {
	
	def addGenClassesToGenPackage(GenPackage genPackage, List<GenClass> genClasses) {
		genClasses.forEach(c|genPackage.genClasses.add(c))
	}
	
	def GenModel createGenModel(EPackage ePackage, URI genModelURI) {
		EcorePlugin::getEPackageNsURIToGenModelLocationMap().put(ePackage.nsURI, genModelURI)
		EcorePlugin::getEPackageNsURIToGenModelLocationMap().put("http://www.eclipse.org/emf/2002/Ecore", URI::createURI("platform:/plugin/org.eclipse.emf.ecore/model/Ecore.genmodel"))
		EcorePlugin::getEPackageNsURIToGenModelLocationMap().put("http://www.eclipse.org/emf/2002/GenModel", URI::createURI("platform:/plugin/org.eclipse.emf.codegen.ecore/model/GenModel.genmodel")) 
		GenModelFactory::eINSTANCE.createGenModel()
	}
	
	def GenClass createGenClass(EClass eClass) {
		val genClass = GenModelFactory::eINSTANCE.createGenClass()
		genClass.ecoreClass = eClass
		genClass
	}
	
	def GenPackage createGenPackage(ResourceSet resourceSet, EPackage ePackage, String prefix) {
		Helper::registerGenModel(resourceSet)
		resourceSet.packageRegistry.put(EcorePackage::eINSTANCE.nsURI, EcorePackage::eINSTANCE)
		val GenPackage genPackage = GenModelFactory::eINSTANCE.createGenPackage()
		genPackage.ecorePackage = ePackage
		genPackage.prefix = prefix;
		createDataTypes(genPackage)
		genPackage
	}
	
	def createDataTypes(GenPackage genPackage) {
		val genString = GenModelFactory::eINSTANCE.createGenDataType
		genString.ecoreDataType = EcorePackage::eINSTANCE.getEString()
		genPackage.genDataTypes.add(genString)
		val genDouble = GenModelFactory::eINSTANCE.createGenDataType
		genDouble.ecoreDataType = EcorePackage::eINSTANCE.getEDouble()
		genPackage.genDataTypes.add(genDouble)
	}
	
	def Resource createGenResource(ResourceSet resourceSet, GenModel genModel, URI genModelURI) {
		val Resource genRes = resourceSet.createResource(genModelURI);
		assertNotNull("Gen model resource expected to be not null", genRes)
		genRes.contents.add(genModel)
		genRes.save(null)
		genRes
	}
}