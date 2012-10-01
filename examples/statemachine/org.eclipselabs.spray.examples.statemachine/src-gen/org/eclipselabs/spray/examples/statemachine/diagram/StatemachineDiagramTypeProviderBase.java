/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray DiagramTypeProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;


public class StatemachineDiagramTypeProviderBase extends AbstractDiagramTypeProvider {
    private IToolBehaviorProvider[] toolBehaviorProviders;

    public StatemachineDiagramTypeProviderBase() {
        super();
        setFeatureProvider(new StatemachineFeatureProvider(this));
    }

    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new StatemachineToolBehaviorProvider(
                    this) };
        }
        return toolBehaviorProviders;
    }
    
}
