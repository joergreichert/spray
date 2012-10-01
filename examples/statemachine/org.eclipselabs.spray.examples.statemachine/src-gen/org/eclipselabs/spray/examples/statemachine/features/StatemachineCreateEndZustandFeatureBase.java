/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray CreateShapeFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.FinishState;
import org.eclipse.graphiti.features.context.IAreaContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipselabs.spray.examples.statemachine.diagram.StatemachineImageProvider;
import org.eclipselabs.spray.examples.statemachine.diagram.StatemachineModelService;


public class StatemachineCreateEndZustandFeatureBase extends AbstractCreateFeature {
    protected static String TITLE = "Create EndZustand";
    protected static String USER_QUESTION = "Enter new EndZustand name";
    protected StatemachineModelService modelService;
    protected FinishState newClass = null;


    public StatemachineCreateEndZustandFeatureBase (IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "EndZustand", "Create new EndZustand");
        modelService = new StatemachineModelService(fp.getDiagramTypeProvider());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canCreate(ICreateContext context) {
        // TODO: Respect the cardinality of the containment reference
        return context.getTargetContainer() instanceof Diagram;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] create(final ICreateContext context) {
        newClass = createEndZustand(context);
    
        if (newClass == null ) {
            return EMPTY;
        }
    
        // do the add
        addGraphicalRepresentation(context, newClass);
        
        // activate direct editing after object creation
        getFeatureProvider().getDirectEditingInfo().setActive(true);
        
        // return newly created business object(s)
        return new Object[] { newClass };
    }
    /**
     * Creates a new {@link FinishState} instance and adds it to the containing type.
     */
    protected FinishState createEndZustand(ICreateContext context) {
        // create FinishState instance
        FinishState newClass = StatemachineFactory.eINSTANCE.createFinishState();
        // ask user for EndZustand name
        String newName = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
        if (newName == null || newName.trim().length() == 0) {
           return null;
        } else {
           newClass.setName(newName);
        }
        
        // add the element to containment reference
        Statemachine model = modelService.getModel();
        model.getStates().add(newClass);
        
        setDoneChanges(true);
        return newClass;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String getCreateImageId() {
        return StatemachineImageProvider.STATEMACHINE__END;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected PictogramElement addGraphicalRepresentation(IAreaContext context, Object newObject) {
        final AddContext ctx = new AddContext(context, newObject);
        ctx.putProperty(ISprayConstants.PROPERTY_ALIAS, "EndZustand");
        return getFeatureProvider().addIfPossible(ctx);
    }
}
