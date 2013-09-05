/** ****************************************************************************
 * Copyright (c) 1, 2012The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.generator.graphiti;

import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;
import org.eclipselabs.spray.xtext.SprayStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class GraphitiGeneratorStandaloneSetup extends SprayStandaloneSetup {
    public static void doSetup() {
        new GraphitiGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjector() {
        Injector injector = Guice.createInjector(Modules2.mixin(new SprayRuntimeModule(), new GraphitiRuntimeModule(), new GraphitiGeneratorModule()));
        return injector;
    }
}
