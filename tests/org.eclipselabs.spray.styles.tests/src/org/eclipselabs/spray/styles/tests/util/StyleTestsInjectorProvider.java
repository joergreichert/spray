package org.eclipselabs.spray.styles.tests.util;

import org.eclipse.xtext.junit4.GlobalRegistries;
import org.eclipselabs.spray.styles.StyleInjectorProvider;

import com.google.inject.Injector;

public class StyleTestsInjectorProvider  extends StyleInjectorProvider {
	private Injector injector;

	public Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			this.injector = new StyleTestsStandaloneSetup().createInjectorAndDoEMFRegistration();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}

}
