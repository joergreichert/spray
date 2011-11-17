package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractCustomFeature extends org.eclipse.graphiti.features.custom.AbstractCustomFeature {
    protected boolean doneChanges;

    public AbstractCustomFeature(IFeatureProvider fp) {
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

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canUndo(IContext context) {
        return false;
    }
}
