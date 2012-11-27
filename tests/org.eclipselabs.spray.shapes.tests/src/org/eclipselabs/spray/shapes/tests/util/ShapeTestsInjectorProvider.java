package org.eclipselabs.spray.shapes.tests.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipselabs.spray.shapes.ShapeInjectorProvider;

import com.google.inject.Injector;

public class ShapeTestsInjectorProvider  extends ShapeInjectorProvider {
	private Injector injector;

	public Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			this.injector = new ShapeTestsStandaloneSetup().createInjectorAndDoEMFRegistration();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}

}
