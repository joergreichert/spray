/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray AddShapeFromDslFeature.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.example.fowlerdsl.statemachine.FinishState;
import com.google.common.base.Function;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.shapes.EndNode;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;


public class StatemachineAddEndZustandFeatureBase extends AbstractAddFeature {
    protected final static String typeOrAliasName = "EndZustand";
    protected Diagram targetDiagram = null;

    public StatemachineAddEndZustandFeatureBase(IFeatureProvider fp) {
        super(fp);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canAdd(IAddContext context) {
        final EObject newObject = (EObject) context.getNewObject();
        if (newObject instanceof FinishState) {
            // check if user wants to add to a diagram
            if (context.getTargetContainer() instanceof Diagram) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PictogramElement add(IAddContext context) {
        FinishState addedModelElement = (FinishState) context.getNewObject();
        targetDiagram = peService.getDiagramForShape(context.getTargetContainer());
        
        // Diagram targetDiagram = (Diagram) context.getTargetContainer();
        ISprayStyle style = new DefaultSprayStyle();
        EndNode shape = new EndNode(getFeatureProvider());
        {
        	java.lang.String value = new Function<FinishState, java.lang.String>() {
        		public java.lang.String apply(FinishState modelElement) {
        			
        			String _postcondition = modelElement.getPostcondition();
        			return _postcondition;
        		}
        	}.apply(addedModelElement); 
        	shape.setPostcondition(value);
        }
        ContainerShape conShape = shape.getShape(targetDiagram, style);
        IGaService gaService = Graphiti.getGaService();
        gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());
        link(conShape, addedModelElement);
        peService.setPropertyValue(conShape , PROPERTY_ALIAS, "EndZustand");

        setDoneChanges(true);
        
        return conShape;
    }
    
}
