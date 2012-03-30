/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray UpdateConnectionFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipselabs.spray.examples.statemachine.Activator;

        
public class StatemachineUpdateUebergangFeatureBase extends AbstractUpdateFeature {

    public StatemachineUpdateUebergangFeatureBase(IFeatureProvider fp) {
        super(fp);
        gaService = Activator.get(IGaService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a EClass
        EObject bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
        PictogramElement pictogramElement = context.getPictogramElement();
        return (bo instanceof Transition) && (!(pictogramElement instanceof Diagram));
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public IReason updateNeeded(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
        if ( ! (bo instanceof Transition)) {
            return Reason.createFalseReason();
        }
        Transition eClass = (Transition) bo;
    
        if (pictogramElement instanceof FreeFormConnection) {
            FreeFormConnection free = (FreeFormConnection) pictogramElement;
        }
        return Reason.createFalseReason();
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean update(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Transition eClass = (Transition) getBusinessObjectForPictogramElement(pictogramElement);
    
        return true;
    }
    protected String getValue(String type, Transition eClass) {
        String result = "";
        if(ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL.equals(type) ){
        }
        if(ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL.equals(type) ){
        }
        if(ISprayConstants.PROPERTY_MODEL_TYPE_CONNECTION_LABEL.equals(type) ){
        }
        return result;
    }
}
