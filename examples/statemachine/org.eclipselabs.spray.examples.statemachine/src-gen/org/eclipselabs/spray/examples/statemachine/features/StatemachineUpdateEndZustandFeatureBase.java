/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray UpdateShapeFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;
import org.eclipselabs.spray.runtime.graphiti.containers.SprayContainerService;
import org.eclipse.xtext.example.fowlerdsl.statemachine.FinishState;
import org.eclipselabs.spray.examples.statemachine.Activator;


public class StatemachineUpdateEndZustandFeatureBase extends AbstractUpdateFeature {
    public StatemachineUpdateEndZustandFeatureBase(IFeatureProvider fp) {
        super(fp);
        gaService = Activator.get(IGaService.class);
    }
 
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a EClass
        EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());
        PictogramElement pictogramElement = context.getPictogramElement();
        return (bo instanceof FinishState)&& (!(pictogramElement instanceof Diagram));
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public IReason updateNeeded(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
        if ( ! (bo instanceof FinishState)) {
            return Reason.createFalseReason(); 
        }
        return Reason.createFalseReason();
     }
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean update(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
          FinishState eClass = (FinishState) bo;
        return true; // SprayContainerService.update(pictogramElement, getValues(eClass));
        
    }
    Map<String, String> values = null; 
    protected Map<String, String> getValues(FinishState eClass) {
        if (values == null) {
            values = new HashMap<String, String>();
            fillValues(eClass);
        }
        return values;
    }
    
    protected void fillValues(FinishState eClass) {
        String type, value;
    }
    
    protected String getValue (String type, FinishState eClass) {
        return "UNKNOWN";
    }
}
