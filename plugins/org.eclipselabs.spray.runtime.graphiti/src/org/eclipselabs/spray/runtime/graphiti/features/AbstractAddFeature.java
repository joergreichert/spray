package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaCreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractAddFeature extends org.eclipse.graphiti.features.impl.AbstractAddShapeFeature implements ISprayConstants {
    protected IGaCreateService gaCreateService;
    protected IGaLayoutService gaLayoutService;
    protected IGaService       gaService;
    protected IPeCreateService peCreateService;
    protected IPeService       peService;
    private boolean            doneChanges;

    public AbstractAddFeature(IFeatureProvider fp) {
        super(fp);
        gaCreateService = Graphiti.getGaCreateService();
        gaLayoutService = Graphiti.getGaLayoutService();
        gaService = Graphiti.getGaService();
        peCreateService = Graphiti.getPeCreateService();
        peService = Graphiti.getPeService();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected EObject getBusinessObjectForPictogramElement(PictogramElement pe) {
        return (EObject) super.getBusinessObjectForPictogramElement(pe);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDoneChanges() {
        return doneChanges;
    }

    protected final void setDoneChanges(boolean doneChanges) {
        this.doneChanges = doneChanges;
    }

    protected void layout(ContainerShape targetContainer) {
        //        if (!(targetContainer instanceof Diagram)) {
        while (!SprayLayoutService.isShapeFromDsl(targetContainer) && !(targetContainer.getContainer() instanceof Diagram)) {
            targetContainer = targetContainer.getContainer();
        }
        //        }
        ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(targetContainer);
        mgr.layout();
    }

}
