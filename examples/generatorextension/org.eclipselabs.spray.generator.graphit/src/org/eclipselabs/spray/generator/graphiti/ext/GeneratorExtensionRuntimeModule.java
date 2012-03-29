package org.eclipselabs.spray.generator.graphiti.ext;

import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.FeatureProvider;

public class GeneratorExtensionRuntimeModule extends AbstractGenericModule {
    public Class<? extends FeatureProvider> bindFeatureProviderTemplate() {
        return FeatureProviderExt.class;
    }
}
