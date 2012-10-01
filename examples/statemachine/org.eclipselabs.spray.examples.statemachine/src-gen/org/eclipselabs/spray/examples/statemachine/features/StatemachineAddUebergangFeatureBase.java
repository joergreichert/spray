/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray AddConnectionFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;

import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;
import org.eclipselabs.spray.styles.ISprayStyle;
import org.eclipselabs.spray.styles.TransitionStyle;
import com.google.common.base.Function;

import static org.eclipselabs.spray.runtime.graphiti.ISprayConstants.PROPERTY_MODEL_TYPE;
import org.eclipselabs.spray.shapes.StateConnection;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipselabs.spray.examples.statemachine.Activator;


public class StatemachineAddUebergangFeatureBase extends AbstractAddConnectionFeature {

    public StatemachineAddUebergangFeatureBase(IFeatureProvider fp) {
        super(fp);
        gaService = Activator.get(IGaService.class);
    }

       /**
    * {@inheritDoc}
    * 
    * @return <code>true</code> if given business object is an {@link Transition} and context is of type {@link IAddConnectionContext}
    */
    @Override
    public boolean canAdd(IAddContext context) {
       if (context instanceof IAddConnectionContext
           && context.getNewObject() instanceof Transition) {
           return true;
       }
       return false;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public PictogramElement add(IAddContext context) {
        IAddConnectionContext addConContext = (IAddConnectionContext) context;
        // TODO: Domain object
        Transition addedDomainObject = (Transition) context.getNewObject();
        ISprayStyle style = new TransitionStyle();
        StateConnection connection = new StateConnection(getFeatureProvider());
        PictogramElement result = connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());
    
        // create link and wire it
        peService.setPropertyValue(result , PROPERTY_MODEL_TYPE, StatemachinePackage.Literals.TRANSITION.getName());
        peService.setPropertyValue(result , PROPERTY_ALIAS, "Uebergang");
        link(result , addedDomainObject);
    
        setDoneChanges(true);
        return result;
    }
    
}
