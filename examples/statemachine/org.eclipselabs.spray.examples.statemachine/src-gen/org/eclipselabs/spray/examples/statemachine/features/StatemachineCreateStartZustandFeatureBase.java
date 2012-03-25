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
import org.eclipse.xtext.example.fowlerdsl.statemachine.StartState;
import org.eclipse.graphiti.features.context.IAreaContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipselabs.spray.examples.statemachine.diagram.StatemachineImageProvider;
import org.eclipselabs.spray.examples.statemachine.diagram.StatemachineModelService;


public class StatemachineCreateStartZustandFeatureBase extends AbstractCreateFeature {
    protected static String TITLE = "Create StartZustand";
    protected static String USER_QUESTION = "Enter new StartZustand name";
    protected StatemachineModelService modelService;
    protected StartState newClass = null;


    public StatemachineCreateStartZustandFeatureBase (IFeatureProvider fp) {
        // set name and description of the creation feature
        super(fp, "StartZustand", "Create new StartZustand");
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
        newClass = createStartZustand(context);
    
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
     * Creates a new {@link StartState} instance and adds it to the containing type.
     */
    protected StartState createStartZustand(ICreateContext context) {
        // create StartState instance
        StartState newClass = StatemachineFactory.eINSTANCE.createStartState();
        // ask user for StartZustand name
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
        return StatemachineImageProvider.STATEMACHINE__START;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected PictogramElement addGraphicalRepresentation(IAreaContext context, Object newObject) {
        final AddContext ctx = new AddContext(context, newObject);
        ctx.putProperty(ISprayConstants.PROPERTY_ALIAS, "StartZustand");
        return getFeatureProvider().addIfPossible(ctx);
    }
}
