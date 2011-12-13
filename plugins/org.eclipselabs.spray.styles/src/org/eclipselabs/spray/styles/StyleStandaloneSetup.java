package org.eclipselabs.spray.styles;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class StyleStandaloneSetup extends StyleStandaloneSetupGenerated {

	public static void doSetup() {
		new StyleStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
