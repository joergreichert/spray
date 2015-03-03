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
package org.eclipselabs.spray.runtime.xtext.ui;

import org.eclipse.xtext.builder.impl.ToBeBuiltComputer;
import org.eclipselabs.spray.runtime.xtext.ui.builder.JdtToBeBuiltComputerExt;

import com.google.inject.AbstractModule;

@SuppressWarnings("restriction")
public class SharedModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ToBeBuiltComputer.class).to(JdtToBeBuiltComputerExt.class);
    }
}
