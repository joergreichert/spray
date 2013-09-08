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
package org.eclipselabs.spray.generator.graphiti.tests;

import com.google.inject.Injector;

/**
 * Sets up also bindings for Graphiti Generator and Runtime.
 * 
 * @author Karsten Thoms
 */
public class SprayTestsInjectorProvider extends SprayInjectorProvider {
    private Injector injector;

    @Override
    public Injector internalCreateInjector() {
        if (injector == null) {
            this.injector = new SprayTestsStandaloneSetup().createInjectorAndDoEMFRegistration();
        }
        return injector;
    }
}
