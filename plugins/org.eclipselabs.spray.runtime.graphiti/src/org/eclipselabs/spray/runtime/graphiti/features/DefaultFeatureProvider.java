package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaCreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

public class DefaultFeatureProvider extends org.eclipse.graphiti.ui.features.DefaultFeatureProvider implements ISprayConstants {
    protected IGaCreateService gaCreateService;
    protected IGaLayoutService gaLayoutService;
    protected IGaService       gaService;
    protected IPeCreateService peCreateService;
    protected IPeService       peService;

    public DefaultFeatureProvider(IDiagramTypeProvider dtp) {
        super(dtp);
        gaCreateService = Graphiti.getGaCreateService();
        gaLayoutService = Graphiti.getGaLayoutService();
        gaService = Graphiti.getGaService();
        peCreateService = Graphiti.getPeCreateService();
        peService = Graphiti.getPeService();
    }

    @Override
    public EObject getBusinessObjectForPictogramElement(PictogramElement pictogramElement) {
        return (EObject) super.getBusinessObjectForPictogramElement(pictogramElement);
    }

}
