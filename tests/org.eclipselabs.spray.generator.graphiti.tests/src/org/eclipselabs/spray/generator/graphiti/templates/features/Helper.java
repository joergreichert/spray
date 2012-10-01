package org.eclipselabs.spray.generator.graphiti.templates.features;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Helper {

	public static void registerXmiModel(ResourceSet resourceSet) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI,
				EcorePackage.eINSTANCE);
	}
	
	public static void registerGenModel(ResourceSet resourceSet) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"genmodel", new EcoreResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(GenModelPackage.eNS_URI,
				GenModelPackage.eINSTANCE);
	}
}
