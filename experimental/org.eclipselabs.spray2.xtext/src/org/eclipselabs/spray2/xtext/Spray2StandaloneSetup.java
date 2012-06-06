
package org.eclipselabs.spray2.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Spray2StandaloneSetup extends Spray2StandaloneSetupGenerated{

	public static void doSetup() {
		new Spray2StandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

