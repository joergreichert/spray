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
