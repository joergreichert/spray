package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

/**
 * EMF specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractEMFAddShapeFeature extends AbstractAddShapeFeature {
    public AbstractEMFAddShapeFeature(IFeatureProvider fp) {
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
    protected EObject[] getAllBusinessObjectsForPictogramElement(PictogramElement pe) {
        return (EObject[]) super.getAllBusinessObjectsForPictogramElement(pe);
    }
}
