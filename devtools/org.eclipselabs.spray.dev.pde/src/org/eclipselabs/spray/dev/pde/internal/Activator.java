package org.eclipselabs.spray.dev.pde.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Activator implements BundleActivator {
    private static Activator INSTANCE;
    private Injector injector;
        
    @Override
    public void start(BundleContext context) throws Exception {
        INSTANCE = new Activator();
        INSTANCE.injector = Guice.createInjector(new PDEModule());
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        INSTANCE = null;
    }

    public static Activator getINSTANCE() {
        return INSTANCE;
    }
    
    public Injector getInjector() {
        return injector;
    }
}
