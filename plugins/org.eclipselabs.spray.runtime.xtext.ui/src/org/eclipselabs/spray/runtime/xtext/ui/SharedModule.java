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

import org.eclipse.xtext.common.types.access.jdt.TypeURIHelper;

import com.google.inject.AbstractModule;

public class SharedModule extends AbstractModule {
	@Override
	protected void configure() {
		// would cause problems with Xtext 2.5.3 and the problem with the
		// storage mapper should be fixed in Xtext 2.5.3
		// bind(ToBeBuiltComputer.class).to(JdtToBeBuiltComputerExt.class);
		bind(TypeURIHelper.class);
	}
}
