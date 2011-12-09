
package org.eclipselabs.spray;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ShapesStandaloneSetup extends ShapesStandaloneSetupGenerated{

	public static void doSetup() {
		new ShapesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

