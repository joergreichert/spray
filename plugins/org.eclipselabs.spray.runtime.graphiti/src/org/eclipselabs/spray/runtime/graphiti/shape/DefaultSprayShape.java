package org.eclipselabs.spray.runtime.graphiti.shape;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;

public abstract class DefaultSprayShape implements ISprayShape {

    protected final IGaService       gaService       = Graphiti.getGaService();
    protected final IPeService       peService       = Graphiti.getPeService();
    protected final IPeCreateService peCreateService = Graphiti.getPeCreateService();

    private IFeatureProvider featureProvider;
    
    public DefaultSprayShape(IFeatureProvider featureProvider) {
        this.featureProvider = featureProvider;
    }

    public IFeatureProvider getFeatureProvider() {
        return featureProvider;
    }

}
