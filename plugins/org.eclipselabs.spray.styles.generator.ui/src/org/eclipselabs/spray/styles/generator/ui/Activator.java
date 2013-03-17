package org.eclipselabs.spray.styles.generator.ui;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipselabs.spray.styles.StyleRuntimeModule;
import org.eclipselabs.spray.styles.generator.StylesGeneratorModule;
import org.eclipselabs.spray.xtext.util.Modules3;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Activator extends AbstractUIPlugin {
    public static final String PLUGIN_ID = "org.eclipselabs.spray.styles.generator.ui"; //$NON-NLS-1$
    private Injector           injector;
    private static Activator   INSTANCE;

    public Injector getInjector() {
        return injector;
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        INSTANCE = this;
        try {
            initializeInjector();
        } catch (Exception e) {
            Logger.getLogger(getClass()).error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        injector = null;
        super.stop(context);
    }

    public static Activator getInstance() {
        return INSTANCE;
    }

    protected void initializeInjector() {
        Module module = Modules3.mixin(new StyleRuntimeModule(), new StylesGeneratorModule(), new StylesGeneratorUIModule(this), new SharedStateModule()/* , new SprayUiModule(this) */);
        injector = Guice.createInjector(module);
        injector.injectMembers(this);
    }
}
