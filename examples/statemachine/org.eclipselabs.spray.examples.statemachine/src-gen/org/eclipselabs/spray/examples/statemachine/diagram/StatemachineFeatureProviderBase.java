/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray FeatureProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.diagram;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;
import org.eclipselabs.spray.runtime.graphiti.features.DefaultDeleteFeature;
import org.eclipselabs.spray.runtime.graphiti.features.DefaultFeatureProvider;
import org.eclipselabs.spray.runtime.graphiti.features.DefaultRemoveFeature;
import org.eclipselabs.spray.runtime.graphiti.containers.OwnerPropertyDeleteFeature;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachinePackage;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Transition;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineAddEndZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineAddStartZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineAddUebergangFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineAddZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateEndZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateStartZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateUebergangFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineCreateZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineLayoutEndZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineLayoutStartZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineLayoutZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineUpdateEndZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineUpdateStartZustandFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineUpdateUebergangFeature;
import org.eclipselabs.spray.examples.statemachine.features.StatemachineUpdateZustandFeature;


public class StatemachineFeatureProviderBase extends DefaultFeatureProvider {
    public StatemachineFeatureProviderBase(IDiagramTypeProvider dtp) {
        super(dtp);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IAddFeature getAddFeature(IAddContext context) {
        // is object for add request a EClass or EReference?
        final EObject bo = (EObject) context.getNewObject() ;
        final String reference = (String)context.getProperty(PROPERTY_REFERENCE);
        final String alias = (String)context.getProperty(PROPERTY_ALIAS);
        if ( bo.eClass()==StatemachinePackage.Literals.START_STATE && "StartZustand".equals(alias)
        ) {
            if ( reference == null ){
                return new StatemachineAddStartZustandFeature(this);
            }
        } 
        if ( bo.eClass()==StatemachinePackage.Literals.FINISH_STATE && "EndZustand".equals(alias)
        ) {
            if ( reference == null ){
                return new StatemachineAddEndZustandFeature(this);
            }
        } 
        if ( bo.eClass()==StatemachinePackage.Literals.NORMAL_STATE && "Zustand".equals(alias)
        ) {
            if ( reference == null ){
                return new StatemachineAddZustandFeature(this);
            }
        } 
        if ( bo.eClass()==StatemachinePackage.Literals.TRANSITION && "Uebergang".equals(alias)
        ) {
            if ( reference == null ){
                return new StatemachineAddUebergangFeature(this);
            }
        } 
        return super.getAddFeature(context);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public ICreateFeature[] getCreateFeatures() {
        return new ICreateFeature[] { 
        new StatemachineCreateStartZustandFeature(this) ,
        new StatemachineCreateEndZustandFeature(this) ,
        new StatemachineCreateZustandFeature(this) 
        };
    }    
    /**
     * {@inheritDoc}
     */
    @Override
    public ICreateConnectionFeature[] getCreateConnectionFeatures() {
        return new ICreateConnectionFeature[] {
            new StatemachineCreateUebergangFeature(this)
        };
    }
        /**
         * {@inheritDoc}
         */
        @Override
        public IUpdateFeature getUpdateFeature(IUpdateContext context) {
            final PictogramElement pictogramElement = context.getPictogramElement();
            final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);
        //    if (pictogramElement instanceof ContainerShape) {
                EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
                if (bo == null) return null;
            if ( bo.eClass()==StatemachinePackage.Literals.START_STATE && "StartZustand".equals(alias)
            ) { // 11
                return new StatemachineUpdateStartZustandFeature(this); 
            }
            if ( bo.eClass()==StatemachinePackage.Literals.FINISH_STATE && "EndZustand".equals(alias)
            ) { // 11
                return new StatemachineUpdateEndZustandFeature(this); 
            }
            if ( bo.eClass()==StatemachinePackage.Literals.NORMAL_STATE && "Zustand".equals(alias)
            ) { // 11
                return new StatemachineUpdateZustandFeature(this); 
            }
            if (bo instanceof Transition && "Uebergang".equals(alias)) { // 33
                return new StatemachineUpdateUebergangFeature(this); 
            }
    //        }
            return super.getUpdateFeature(context);
        }
    /**
     * {@inheritDoc}
     */
    @Override
    public ILayoutFeature getLayoutFeature(ILayoutContext context) {
        final PictogramElement pictogramElement = context.getPictogramElement();
        final EObject bo = (EObject) getBusinessObjectForPictogramElement(pictogramElement);
        if (bo == null) return null;
        final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);
        if ( bo.eClass()==StatemachinePackage.Literals.START_STATE && "StartZustand".equals(alias)
         ) {
            return new StatemachineLayoutStartZustandFeature(this);
        }
        if ( bo.eClass()==StatemachinePackage.Literals.FINISH_STATE && "EndZustand".equals(alias)
         ) {
            return new StatemachineLayoutEndZustandFeature(this);
        }
        if ( bo.eClass()==StatemachinePackage.Literals.NORMAL_STATE && "Zustand".equals(alias)
         ) {
            return new StatemachineLayoutZustandFeature(this);
        }
        return super.getLayoutFeature(context);
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public IRemoveFeature getRemoveFeature(IRemoveContext context) {
        // Spray specific DefaultRemoveFeature
        return new DefaultRemoveFeature(this);
    }
    public IDeleteFeature getDeleteFeature(IDeleteContext context) {
        final PictogramElement pictogramElement = context.getPictogramElement();
        final EObject bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo == null) return null;
        final String reference = peService.getPropertyValue(pictogramElement, ISprayConstants.PROPERTY_REFERENCE);
        final String alias = peService.getPropertyValue(pictogramElement,PROPERTY_ALIAS);
    
        if ( bo.eClass()==StatemachinePackage.Literals.START_STATE && "StartZustand".equals(alias)
         ) {
            if( reference == null ){
                return new DefaultDeleteFeature(this); 
            }
        } 
        if ( bo.eClass()==StatemachinePackage.Literals.FINISH_STATE && "EndZustand".equals(alias)
         ) {
            if( reference == null ){
                return new DefaultDeleteFeature(this); 
            }
        } 
        if ( bo.eClass()==StatemachinePackage.Literals.NORMAL_STATE && "Zustand".equals(alias)
         ) {
            if( reference == null ){
                return new DefaultDeleteFeature(this); 
            }
        } 
        if ( bo.eClass()==StatemachinePackage.Literals.TRANSITION && "Uebergang".equals(alias)
         ) {
            if( reference == null ){
                return new DefaultDeleteFeature(this); 
            }
        } 
        
        return new DefaultDeleteFeature(this); 
    }
    /** 
     * Ensure that any shape with property {@link ISprayConstants#CAN_MOVE} set to false will not have a move feature.
     */
    @Override
    public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
        Shape s = context.getShape();
        String stat  = peService.getPropertyValue(s, ISprayConstants.PROPERTY_CAN_MOVE);
        if( stat != null && Boolean.valueOf(stat) == Boolean.FALSE){
            return null;
        }
        return super.getMoveShapeFeature(context);
    }
    @Override
    public ICustomFeature[] getCustomFeatures(ICustomContext context) {
        final EObject bo = (EObject) getBusinessObjectForPictogramElement(context.getPictogramElements()[0]);
        if (bo == null) return new ICustomFeature[0];
        final String alias = (String)context.getProperty(PROPERTY_ALIAS);
        return new ICustomFeature[0];
    }
}
