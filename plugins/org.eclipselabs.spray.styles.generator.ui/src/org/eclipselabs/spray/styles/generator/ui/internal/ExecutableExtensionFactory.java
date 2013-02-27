package org.eclipselabs.spray.styles.generator.ui.internal;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.eclipselabs.spray.styles.generator.ui.Activator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 */
public class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Activator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return Activator.getInstance().getInjector();
	}
	
}
