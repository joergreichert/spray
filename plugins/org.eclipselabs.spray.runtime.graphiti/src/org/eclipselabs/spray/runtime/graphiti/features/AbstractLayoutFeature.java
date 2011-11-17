package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractLayoutFeature extends org.eclipse.graphiti.features.impl.AbstractLayoutFeature {
    private boolean doneChanges;

    public AbstractLayoutFeature(IFeatureProvider fp) {
        super(fp);
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

}
