package org.eclipselabs.spray.xtext;

import org.eclipse.xtext.junit4.GlobalRegistries;

import com.google.inject.Injector;

/**
 * Sets up also bindings for Graphiti Generator and Runtime.
 * @author Karsten Thoms
 */
public class SprayTestsInjectorProvider extends SprayInjectorProvider {
	private Injector injector;

	public Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			this.injector = new SprayTestsStandaloneSetup().createInjectorAndDoEMFRegistration();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}
}
