/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.generator.graphiti.ui;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.eclipselabs.spray.xtext.util.Modules3;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 */
public class Activator extends AbstractUIPlugin {
    public static final String PLUGIN_ID = "org.eclipselabs.spray.generator.graphiti.ui"; //$NON-NLS-1$
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
        Module module = Modules3.mixin(new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule(), new GraphitiGeneratorUIModule(this), new SharedStateModule()/* , new SprayUiModule(this) */);
        injector = Guice.createInjector(module);
        injector.injectMembers(this);
    }
}
