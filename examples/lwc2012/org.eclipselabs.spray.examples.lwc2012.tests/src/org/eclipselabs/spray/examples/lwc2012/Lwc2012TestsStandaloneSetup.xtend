package org.eclipselabs.spray.examples.lwc2012

import org.eclipse.xtext.ISetup
import com.google.inject.Injector
import com.google.inject.Guice
import org.eclipse.xtext.resource.IResourceFactory
import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.xtext.resource.IResourceServiceProvider$Registry
import org.eclipse.xtext.xbase.XbaseStandaloneSetup
import org.eclipselabs.spray.xtext.SprayRuntimeModule
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.util.Modules2
import org.eclipselabs.spray.styles.StyleRuntimeModule
import org.eclipselabs.spray.shapes.ShapeRuntimeModule

class Lwc2012TestsStandaloneSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		XbaseStandaloneSetup::doSetup()

		val injector = createInjector()
		register(injector)
		injector
	}
	
	def createInjector() {
		Guice::createInjector(Modules2::mixin(new StyleRuntimeModule(), new ShapeRuntimeModule(), new SprayRuntimeModule()))
	}
	
	def register(Injector injector) {
		val resourceFactory = injector.getInstance(typeof(IResourceFactory));
		val serviceProvider = injector.getInstance(typeof(IResourceServiceProvider));
		val extensions = newArrayList("spray", "shape", "style")
		for(ext : extensions) {
			Resource$Factory$Registry::INSTANCE.getExtensionToFactoryMap().put(ext, resourceFactory);
			Registry::INSTANCE.getExtensionToFactoryMap().put(ext, serviceProvider);
		}
	}
}