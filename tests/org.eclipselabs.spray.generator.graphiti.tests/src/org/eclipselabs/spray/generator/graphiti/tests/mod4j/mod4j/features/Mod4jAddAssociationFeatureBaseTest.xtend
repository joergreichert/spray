package org.eclipselabs.spray.generator.graphiti.tests.mod4j.mod4j.features

import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class Mod4jAddAssociationFeatureBaseTest extends AbstractSprayGeneratorTest {

    @Test
    def void test() {
       val fsa = triggerGenerator("mod4j/mod4j-busmod.spray")
       val keyClass = "DEFAULT_OUTPUTorg/eclipselabs/spray/examples/mod4j/features/Mod4jAddAssociationFeatureBase.java"
       assertTrue(keyClass + " should have been generated", fsa.files.containsKey(keyClass))
       assertEquals(keyClass + " should have the expected content", fsa.files.get(keyClass).toString, expectedContent.toString)
    }

    def private expectedContent() '''
        /*************************************************************************************
         *
         * Generated by Spray AddConnectionFromDslFeature.xtend
         *
         * This file contains generated and should not be changed.
         * Use the extension point class (the direct subclass of this class) to add manual code
         *
         *************************************************************************************/
        package org.eclipselabs.spray.examples.mod4j.features;
        
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
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractAddConnectionFeature;
        import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
        import org.eclipselabs.spray.runtime.graphiti.styles.DefaultSprayStyle;
        import org.eclipselabs.spray.runtime.graphiti.shape.ISprayConnection;
        import org.eclipselabs.spray.examples.mod4j.shapes.null;
        import com.google.common.base.Function;
        
        import samplepackage.Association;
        import null.BusinessDomainDslPackage;
        import org.eclipselabs.spray.examples.mod4j.Activator;
        
        
        @SuppressWarnings("unused")
        public abstract class Mod4jAddAssociationFeatureBase extends AbstractAddConnectionFeature {
        
            public Mod4jAddAssociationFeatureBase(final IFeatureProvider fp) {
                super(fp);
                gaService = Activator.get(IGaService.class);
            }
        
               /**
            * {@inheritDoc}
            * 
            * @return <code>true</code> if given business object is an {@link Association} and context is of type {@link IAddConnectionContext}
            */
            @Override
            public boolean canAdd(IAddContext context) {
               if (context instanceof IAddConnectionContext
                   && context.getNewObject() instanceof Association) {
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
                Association addedDomainObject = (Association) context.getNewObject();
                ISprayStyle style = new DefaultSprayStyle();
                ISprayConnection connection = new (getFeatureProvider());
                Connection result = (Connection) connection.getConnection(getDiagram(), style, addConContext.getSourceAnchor(), addConContext.getTargetAnchor());
            
                // create link and wire it
                peService.setPropertyValue(result , PROPERTY_MODEL_TYPE, BusinessDomainDslPackage.Literals.ASSOCIATION.getName());
                link(result , addedDomainObject);
                for(ConnectionDecorator conDecorator : result.getConnectionDecorators()) {
                    link(conDecorator, addedDomainObject);
                }
                
                setDoneChanges(true);
               	updatePictogramElement(result);
                
                return result;
            }
            
        }
    '''
}