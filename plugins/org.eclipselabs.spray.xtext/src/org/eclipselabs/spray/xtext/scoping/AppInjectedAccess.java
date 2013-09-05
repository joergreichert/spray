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
package org.eclipselabs.spray.xtext.scoping;

import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

import javax.inject.Inject;

/**
 * All injected instances can only be injected in a class that is injected itself.
 * This class makes these instances available for classes that are not injected themselves.
 * This class needs to be configured in a binder inside a class that is injected.
 * 
 * @author jos
 */
public class AppInjectedAccess {

    @Inject
    static public ResourceDescriptionsProvider resourceDescriptionsProvider;

    public static ResourceDescriptionsProvider getit() {
        return resourceDescriptionsProvider;
    }
}
