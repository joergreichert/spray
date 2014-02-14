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
package org.eclipselabs.spray.shapes;

import org.eclipse.xtext.ISetup;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class ShapeStandaloneSetup extends ShapeStandaloneSetupGenerated implements ISetup {

	public static void doSetup() {
		new ShapeStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
