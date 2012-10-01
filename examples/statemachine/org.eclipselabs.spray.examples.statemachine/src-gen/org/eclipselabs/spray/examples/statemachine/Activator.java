/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray PluginActivator.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
    private Injector             injector;

    // The plug-in ID
    public static final String   PLUGIN_ID = "spray"; //$NON-NLS-1$

    // The shared instance
    private static Activator plugin;

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        injector = createInjector();
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    protected Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new GraphitiRuntimeModule(), new StatemachineModule()));
    }

    public final Injector getInjector() {
        return injector;
    }

    public static final <T> T get(Class<T> type) {
        return getDefault().getInjector().getInstance(type);
    }
}
