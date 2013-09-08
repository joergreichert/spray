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
