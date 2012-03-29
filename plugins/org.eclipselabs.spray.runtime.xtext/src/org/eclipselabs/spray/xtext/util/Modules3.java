package org.eclipselabs.spray.xtext.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.util.Modules2;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.inject.Module;

public class Modules3 {
    private static final String EXTPOINT_OVERRIDING_MODULE = "org.eclipselabs.spray.runtime.xtext.overridingGuiceModule";
    private static final Log    LOG                        = LogFactory.getLog(Modules3.class);

    public static Module mixin(Module... m) {
        List<Module> modules = new ArrayList<Module>(m.length);
        ListMultimap<String, Module> modulesMap = getOverrideModuleMap();

        for (Module module : m) {
            modules.add(module);
            for (Module overrideModule : modulesMap.get(module.getClass().getName())) {
                LOG.debug("Overriding Module " + module.getClass().getName() + " with " + overrideModule.getClass().getName());
                modules.add(overrideModule);
            }
        }
        return Modules2.mixin(modules.toArray(m));
    }

    private static ListMultimap<String, Module> getOverrideModuleMap() {
        ListMultimap<String, Module> modulesMap = ArrayListMultimap.create();
        IExtensionPoint point = Platform.getExtensionRegistry().getExtensionPoint(EXTPOINT_OVERRIDING_MODULE);
        IExtension[] extensions = point.getExtensions();
        if (extensions.length != 0) {
            for (IExtension iExtension : extensions) {
                IConfigurationElement[] elements = iExtension.getConfigurationElements();
                for (IConfigurationElement e : elements) {
                    try {
                        Module m = (Module) e.createExecutableExtension("class");
                        String overriddenModuleClass = e.getAttribute("overrides");
                        modulesMap.put(overriddenModuleClass, m);
                    } catch (CoreException e1) {
                        LOG.error(e1.getMessage());
                    }
                }
            }
        }
        return modulesMap;
    }
}
