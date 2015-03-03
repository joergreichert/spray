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
package org.eclipselabs.spray.shapes.generator;

import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.shapes.ShapeRuntimeModule;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ShapesGeneratorStandaloneSetup extends ShapeStandaloneSetup implements ISetup {
    public static void doSetup() {
        new ShapesGeneratorStandaloneSetup().createInjectorAndDoEMFRegistration();
    }

    @Override
    public Injector createInjector() {
        Injector injector = Guice.createInjector(Modules2.mixin(new ShapeRuntimeModule(), new ShapesGeneratorModule()));
        return injector;
    }
}
