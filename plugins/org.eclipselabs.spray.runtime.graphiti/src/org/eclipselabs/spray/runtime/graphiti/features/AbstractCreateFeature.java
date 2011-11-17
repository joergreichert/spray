package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractCreateFeature extends org.eclipse.graphiti.features.impl.AbstractCreateFeature {
    private boolean doneChanges;

    public AbstractCreateFeature(IFeatureProvider fp, String name, String description) {
        super(fp, name, description);
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
