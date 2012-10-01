/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray LayoutFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractLayoutFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.NormalState;


public class StatemachineLayoutZustandFeatureBase extends AbstractLayoutFeature {
    protected static final int MIN_HEIGHT = 30;
    protected static final int MIN_WIDTH = 50;

    public StatemachineLayoutZustandFeatureBase(IFeatureProvider fp) {
        super(fp);
    }
 
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canLayout(ILayoutContext context) {
       PictogramElement pe = context.getPictogramElement();
       if (!(pe instanceof ContainerShape)) {
           return false;
       }
       EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
       return (businessObjects.size() == 1) && (businessObjects.get(0) instanceof NormalState);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean layout(ILayoutContext context) {
        return true; // container.layoutContainer(context);
    }
}
