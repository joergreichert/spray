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
package org.eclipselabs.spray.xtext.ui.internal;

import javax.inject.Inject;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Module;

public class SprayActivatorExt extends SprayActivator {
    public static final String               LANGUAGE_ID = "org.eclipselabs.spray.xtext.Spray";

    @Inject
    private RegisterPlatformGenmodelListener registerPlatformGenmodelListener;
    private SprayResourceChangeBuildInvoker  sprayResourceChangeBuildInvoker;

    @Override
    protected Module getRuntimeModule(String grammar) {
        return Modules2.mixin(super.getRuntimeModule(grammar), new SprayRuntimeModule(), new GraphitiRuntimeModule());
    }

    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        getInjector(LANGUAGE_ID).injectMembers(this);
        sprayResourceChangeBuildInvoker = new SprayResourceChangeBuildInvoker(this);
        ResourcesPlugin.getWorkspace().addResourceChangeListener(sprayResourceChangeBuildInvoker);
        ResourcesPlugin.getWorkspace().addResourceChangeListener(registerPlatformGenmodelListener);
        // register workspace genmodels
        registerPlatformGenmodelListener.initWorkspace();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(sprayResourceChangeBuildInvoker);
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(registerPlatformGenmodelListener);
        super.stop(context);
    }
}
