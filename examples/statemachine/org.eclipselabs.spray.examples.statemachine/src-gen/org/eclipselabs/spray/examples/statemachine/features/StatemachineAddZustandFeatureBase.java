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
import org.eclipse.xtext.example.fowlerdsl.statemachine.NormalState;
import com.google.common.base.Function;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipselabs.spray.shapes.Node;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddFeature;
import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;


public class StatemachineAddZustandFeatureBase extends AbstractAddFeature {
    protected final static String typeOrAliasName = "Zustand";
    protected Diagram targetDiagram = null;

    public StatemachineAddZustandFeatureBase(IFeatureProvider fp) {
        super(fp);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canAdd(IAddContext context) {
        final EObject newObject = (EObject) context.getNewObject();
        if (newObject instanceof NormalState) {
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
        NormalState addedModelElement = (NormalState) context.getNewObject();
        targetDiagram = peService.getDiagramForShape(context.getTargetContainer());
        
        // Diagram targetDiagram = (Diagram) context.getTargetContainer();
        ISprayStyle style = new DefaultSprayStyle();
        Node shape = new Node(getFeatureProvider());
        {
        	java.lang.String value = new Function<NormalState, java.lang.String>() {
        		public java.lang.String apply(NormalState modelElement) {
        			
        			String _xifexpression = null;
        			boolean _isCheck = modelElement.isCheck();
        			if (_isCheck) {
        			  String _name = modelElement.getName();
        			  String _operator_plus = org.eclipse.xtext.xbase.lib.StringExtensions.operator_plus("Check: ", _name);
        			  _xifexpression = _operator_plus;
        			} else {
        			  String _name_1 = modelElement.getName();
        			  String _operator_plus_1 = org.eclipse.xtext.xbase.lib.StringExtensions.operator_plus("Activity: ", _name_1);
        			  _xifexpression = _operator_plus_1;
        			}
        			return _xifexpression;
        		}
        	}.apply(addedModelElement); 
        	shape.setName(value);
        }
        {
        	java.lang.String value = new Function<NormalState, java.lang.String>() {
        		public java.lang.String apply(NormalState modelElement) {
        			
        			String _description = modelElement.getDescription();
        			return _description;
        		}
        	}.apply(addedModelElement); 
        	shape.setDesc(value);
        }
        ContainerShape conShape = shape.getShape(targetDiagram, style);
        IGaService gaService = Graphiti.getGaService();
        gaService.setLocation(conShape.getGraphicsAlgorithm(), context.getX(), context.getY());
        link(conShape, addedModelElement);
        peService.setPropertyValue(conShape , PROPERTY_ALIAS, "Zustand");

        setDoneChanges(true);
        
        return conShape;
    }
    
}
