package org.eclipselabs.spray.styles.generator;

import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.styles.StyleRuntimeModule;
import org.eclipselabs.spray.styles.StyleStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class StylesGeneratorStandaloneSetup extends StyleStandaloneSetup {
    public static void doSetup() {
        new StylesGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjector() {
        Injector injector = Guice.createInjector(Modules2.mixin(new StyleRuntimeModule(), new StylesGeneratorModule()));
        return injector;
    }
}
