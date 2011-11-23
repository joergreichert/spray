package org.eclipselabs.spray.runtime.graphiti.containers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;

public class OwnerPropertyDeleteFeature extends DefaultDeleteFeature {
    protected IPeService peService;

    public OwnerPropertyDeleteFeature(IFeatureProvider fp) {
        super(fp);
        peService = Graphiti.getPeService();
    }

    @Override
    public void delete(IDeleteContext context) {
        PictogramElement pe = context.getPictogramElement();

        Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
        if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {
            if (!getUserDecision()) {
                return;
            }
        }

        Object o = getBusinessObjectForPictogramElement(pe);
        EObject prop = (EObject) o;
        EObject owner = prop.eContainer();
        //		BusinessClass cls = (BusinessClass)prop.getOwningType();
        List<PictogramElement> picts = Graphiti.getLinkService().getPictogramElements(getDiagram(), owner);

        preDelete(context);

        IRemoveContext rc = new RemoveContext(pe);
        IFeatureProvider featureProvider = getFeatureProvider();
        IRemoveFeature removeFeature = featureProvider.getRemoveFeature(rc);
        if (removeFeature != null) {
            removeFeature.remove(rc);
            setDoneChanges(true);
        }

        deleteBusinessObjects(businessObjectsForPictogramElement);

        for (PictogramElement pictogramElement : picts) {
            LayoutContext layoutCcontext = new LayoutContext(pictogramElement);
            getFeatureProvider().layoutIfPossible(layoutCcontext);
        }
        postDelete(context);
    }

    @Override
    public boolean canDelete(IDeleteContext context) {
        if (super.canDelete(context)) {
            return true;
        }
        // the default delete feature delegates to the remove feature
        // but it might be possible that elements can be deleted, but not removed.
        // this is the case when the "STATIC" property is set
        if (Boolean.valueOf(peService.getPropertyValue(context.getPictogramElement(), ISprayConstants.PROPERTY_STATIC)) == true) {
            return true;
        }
        return false;
    }
}
