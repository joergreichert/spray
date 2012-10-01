/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray CreateConnectionFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateConnectionFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.State;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipselabs.spray.examples.statemachine.Activator;
import org.eclipselabs.spray.examples.statemachine.diagram.StatemachineImageProvider;
import org.eclipselabs.spray.examples.statemachine.diagram.StatemachineModelService;


public class StatemachineCreateUebergangFeatureBase extends AbstractCreateConnectionFeature {

    public StatemachineCreateUebergangFeatureBase(IFeatureProvider fp) {
        // provide name and description for the UI, e.g. the palette
        super(fp, "Uebergang", "Create Uebergang");
        gaService = Activator.get(IGaService.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canCreate(ICreateConnectionContext context) {
        // return true if both anchors belong to an EClass
        // and those EClasses are not identical
        State source = getState(context.getSourceAnchor());
        State target = getState(context.getTargetAnchor());
        if ( (source != null) && (target != null) && (source != target) ) {
            return true;
        }
        return false;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor belongs to a EClass
        if (getState(context.getSourceAnchor()) != null) {
            return true;
        }
        return false;
    }
        /**
         * {@inheritDoc}
         */
        @Override
        public Connection create(ICreateConnectionContext context) {
            Connection newConnection = null;
    
            // get EClasses which should be connected
            State source = getState(context.getSourceAnchor());
            State target = getState(context.getTargetAnchor());
    
            if (source != null && target != null) {
                // create new business object
                Transition eReference = createTransition(source, target);
                StatemachineModelService modelService = new StatemachineModelService(getFeatureProvider().getDiagramTypeProvider());
                // add the element to containment reference
                Statemachine model = modelService.getModel();
                model.getTransitions().add(eReference);
                // add connection for business object
                AddConnectionContext addContext = new AddConnectionContext(
                        context.getSourceAnchor(), context.getTargetAnchor());
                addContext.setNewObject(eReference);
                newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
            }
    
            return newConnection;
        }
    /**
     * Returns the State belonging to the anchor, or null if not available.
     */
    private State getState(Anchor anchor) {
        if (anchor != null) {
            Object object = getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof State) {
                return (State) object;
            }
        }
        return null;
    }
    /**
     * Creates a EReference between two EClasses.
     */
    protected Transition createTransition(State source, State target) {
        // TODO: Domain Object
        Transition domainObject = StatemachineFactory.eINSTANCE.createTransition();
        domainObject.setName("new Uebergang");
        domainObject.setFromState(source);
        domainObject.setToState(target);
    
        setDoneChanges(true);
        return domainObject;
    }
    @Override
    public String getCreateImageId() {
        return StatemachineImageProvider.STATEMACHINE__CONNECTION; 
    }
}
