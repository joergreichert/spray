package org.eclipselabs.spray.examples.lwc2012

import com.google.inject.Injector
import org.eclipse.xtext.junit4.IInjectorProvider
import org.eclipse.xtext.junit4.IRegistryConfigurator
import org.eclipse.xtext.junit4.GlobalRegistries
import org.eclipse.xtext.junit4.GlobalRegistries$GlobalStateMemento
import org.eclipselabs.spray.examples.lwc2012.Lwc2012TestsStandaloneSetup

class Lwc2012TestsInjectorProvider implements IInjectorProvider, IRegistryConfigurator {
	
    protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	override Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries::makeCopyOfGlobalState();
			this.injector = internalCreateInjector();
			stateAfterInjectorCreation = GlobalRegistries::makeCopyOfGlobalState();
		}
		return injector;
	}
	
	def Injector internalCreateInjector() {
           this.injector = new Lwc2012TestsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	override restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

	override setupRegistry() {
		getInjector();
		stateAfterInjectorCreation.restoreGlobalState();
	}
}