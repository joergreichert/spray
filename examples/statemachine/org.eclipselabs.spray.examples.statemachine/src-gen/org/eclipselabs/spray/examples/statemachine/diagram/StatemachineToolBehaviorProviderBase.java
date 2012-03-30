/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray ToolBehaviorProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipselabs.spray.runtime.graphiti.tb.AbstractSprayToolBehaviorProvider;

import com.google.common.collect.Lists;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateEndZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateStartZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateUebergangFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateZustandFeature;

public abstract class StatemachineToolBehaviorProviderBase extends AbstractSprayToolBehaviorProvider {
    protected static final String COMPARTMENT_TRANSITIONS = "Transitions";
    protected static final String COMPARTMENT_NODES = "Nodes";
    public StatemachineToolBehaviorProviderBase(IDiagramTypeProvider dtp) {
        super(dtp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void buildCreationTools() {
        buildCreationTool(new StatemachineCreateStartZustandFeature(this.getFeatureProvider()));
        buildCreationTool(new StatemachineCreateEndZustandFeature(this.getFeatureProvider()));
        buildCreationTool(new StatemachineCreateZustandFeature(this.getFeatureProvider()));
        buildCreationTool(new StatemachineCreateUebergangFeature(this.getFeatureProvider()));
        // Compartments
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected Iterable<IPaletteCompartmentEntry> buildPaletteCompartments() {
        return Lists.newArrayList(
            getPaletteCompartment(COMPARTMENT_TRANSITIONS), 
            getPaletteCompartment(COMPARTMENT_NODES)
            ,
            getPaletteCompartment(COMPARTMENT_DEFAULT)
        );
    }
    /**
     * {@inheritDoc}
     */
    @Override
    protected IPaletteCompartmentEntry getPaletteCompartmentForFeature(IFeature feature) {
        if (feature instanceof StatemachineCreateStartZustandFeature) {
            return getPaletteCompartment(COMPARTMENT_NODES);
        }else
        if (feature instanceof StatemachineCreateEndZustandFeature) {
            return getPaletteCompartment(COMPARTMENT_NODES);
        }else
        if (feature instanceof StatemachineCreateZustandFeature) {
            return getPaletteCompartment(COMPARTMENT_NODES);
        }else
        if (feature instanceof StatemachineCreateUebergangFeature) {
            return getPaletteCompartment(COMPARTMENT_TRANSITIONS);
        }
        return super.getPaletteCompartmentForFeature(feature);
    }
}
