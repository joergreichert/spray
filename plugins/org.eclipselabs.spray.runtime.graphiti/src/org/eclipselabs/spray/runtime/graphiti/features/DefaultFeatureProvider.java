package org.eclipselabs.spray.runtime.graphiti.features;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaCreateService;
import org.eclipse.graphiti.services.IGaLayoutService;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

public class DefaultFeatureProvider extends org.eclipse.graphiti.ui.features.DefaultFeatureProvider {
    protected final IGaCreateService gaCreateService;
    protected final IGaLayoutService gaLayoutService;
    protected final IGaService       gaService;
    protected final IPeCreateService peCreateService;
    protected final IPeService       peService;

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

    /**
     * {@inheritDoc} For the linked {@link PictogramElement} the property {@link ISprayConstants#PROPERTY_URI} is set with a comma separated
     */
    @Override
    public void link(PictogramElement pictogramElement, Object[] businessObjects) {
        super.link(pictogramElement, businessObjects);
        // Extract the URI from an EObject
        Function<Object, String> toUri = new Function<Object, String>() {
            @Override
            public String apply(Object from) {
                return EcoreUtil.getURI(((EObject) from)).toString();
            }
        };
        // transform businessObjects to comma separated URI string
        String uris = Iterables.toString(Iterables.transform(Arrays.asList(businessObjects), toUri));
        // set URIs as property
        peService.setPropertyValue(pictogramElement, ISprayConstants.PROPERTY_URI, uris);
    }
}
