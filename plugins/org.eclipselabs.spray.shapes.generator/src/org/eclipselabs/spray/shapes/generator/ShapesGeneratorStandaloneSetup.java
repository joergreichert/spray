package org.eclipselabs.spray.shapes.generator;

import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.shapes.ShapeRuntimeModule;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ShapesGeneratorStandaloneSetup extends ShapeStandaloneSetup {
    public static void doSetup() {
        new ShapesGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjector() {
        Injector injector = Guice.createInjector(Modules2.mixin(new ShapeRuntimeModule(), new ShapesGeneratorModule()));
        return injector;
    }
}
