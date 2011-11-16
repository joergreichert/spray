package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaCreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractAddFeature extends org.eclipse.graphiti.features.impl.AbstractAddShapeFeature {
    protected final IGaCreateService gaCreateService;
    protected final IGaLayoutService gaLayoutService;
    protected final IGaService       gaService;
    protected final IPeCreateService peCreateService;
    protected final IPeService       peService;
    protected boolean                changesDone;

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
    protected EObject[] getAllBusinessObjectsForPictogramElement(PictogramElement pe) {
        return (EObject[]) super.getAllBusinessObjectsForPictogramElement(pe);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasDoneChanges() {
        return changesDone;
    }

    @Override
    public boolean canUndo(IContext context) {
        return false;
    }
}
