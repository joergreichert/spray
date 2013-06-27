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
