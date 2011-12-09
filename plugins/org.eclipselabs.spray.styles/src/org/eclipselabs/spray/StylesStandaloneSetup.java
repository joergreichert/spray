
package org.eclipselabs.spray;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StylesStandaloneSetup extends StylesStandaloneSetupGenerated{

	public static void doSetup() {
		new StylesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

