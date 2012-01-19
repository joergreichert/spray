package org.eclipselabs.spray.shapes;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ShapeStandaloneSetup extends ShapeStandaloneSetupGenerated {

	public static void doSetup() {
		new ShapeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
