package org.eclipselabs.spray.generator.graphiti.templates.features

import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator
import org.eclipselabs.spray.mm.spray.MetaClass

import static org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil.*
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import com.google.inject.Inject
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment

class DirectEditEClassFeature extends FileGenerator<MetaClass> {
	
	@Inject extension NamingExtensions
	
	override generateExtensionFile(MetaClass modelElement) {
		modelElement.mainExtensionPointFile(javaGenFile.className);
	}
	
	override generateBaseFile(MetaClass modelElement) {
		modelElement.mainFile(javaGenFile.baseClassName)
	}
	
	 def mainExtensionPointFile(MetaClass metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.emf.ecore.EObject;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.ICustomContext;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(MetaClass metaclass, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IDirectEditingContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipselabs.spray.shapes.ISprayShapeConstants;
        import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
        import «metaclass.javaInterfaceName»;
        // MARKER_IMPORT
        
        public abstract class «className» extends AbstractDirectEditingFeature {
            «generate_additionalFields(metaclass)»
            
            protected IPeService peService = Graphiti.getPeService();
            
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        
            «generate_canDirectEdit(metaclass)»
            «generate_getInitalValue(metaclass)»
            «generate_getEditingType(metaclass)»
            «generate_setValue(metaclass)»
        }
    '''
	
	def generate_canDirectEdit (MetaClass metaclass) '''
        «overrideHeader»
        public boolean canDirectEdit(IDirectEditingContext context) {
        	PictogramElement pe = context.getPictogramElement();
        	Object bo = getBusinessObjectForPictogramElement(pe);
        	GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
        	// support direct editing, if it is a EClass, and the user clicked
        	// directly on the text and not somewhere else in the rectangle
        	if (bo instanceof «metaclass.javaInterfaceName.shortName» && ga instanceof Text) {
        		return true;
        	}
        	// direct editing not supported in all other cases
        	return false;  
        } 
    '''

	def generate_getInitalValue(MetaClass metaclass)'''
		«overrideHeader»
		public String getInitialValue(IDirectEditingContext context) {
			// return the current name of the EClass
			PictogramElement pe = context.getPictogramElement();
			«metaclass.javaInterfaceName.shortName» eClass = («metaclass.javaInterfaceName.shortName») getBusinessObjectForPictogramElement(pe);
			«IF metaclass.representedBy instanceof ShapeFromDsl»
			«(metaclass.representedBy as ShapeFromDsl).properties.generate_initialValue»
			«ELSEIF (metaclass.representedBy instanceof ConnectionInSpray) && ((metaclass.representedBy as ConnectionInSpray).connection != null)»
			«(metaclass.representedBy as ConnectionInSpray).properties.generate_initialValue»
			«ELSE»
			return "";
			«ENDIF»
		}
    '''
	
	def generate_getEditingType(MetaClass metaclass)'''
		«overrideHeader»
		public int getEditingType() {
			// there are several possible editor-types supported:
			// text-field, checkbox, color-chooser, combobox, ...
			return TYPE_TEXT;
		}
    '''
    
    def generate_setValue(MetaClass metaclass)'''
		«overrideHeader»
		public void setValue(final String value, final IDirectEditingContext context) {
			// set the new name for the MOF class
			final PictogramElement pe = context.getPictogramElement();
			«metaclass.javaInterfaceName.shortName» eClass = («metaclass.javaInterfaceName.shortName») getBusinessObjectForPictogramElement(pe);
			«IF metaclass.representedBy instanceof ShapeFromDsl»
			«(metaclass.representedBy as ShapeFromDsl).properties.generate_setValue»
			«ELSEIF (metaclass.representedBy instanceof ConnectionInSpray) && ((metaclass.representedBy as ConnectionInSpray).connection != null)»
			«(metaclass.representedBy as ConnectionInSpray).properties.generate_setValue»
			«ENDIF»
			// Explicitly update the shape to display the new value in the diagram
			// Note, that this might not be necessary in future versions of Graphiti
			// (currently in discussion)
			// we know, that pe is the Shape of the Text, so its container is the
			// main shape of the EClass
			updatePictogramElement(pe);
		}
	'''   
	
	def generate_initialValue(ShapePropertyAssignment[] properties) '''
		Text gAlg = (Text) context.getGraphicsAlgorithm();
		String id = peService.getPropertyValue(gAlg, ISprayShapeConstants.TEXT_ID);
		«FOR property : properties»
		if(id.equals("«property.key.simpleName»")) {
			return eClass.get«property.attribute.name.toFirstUpper»();
		}
		«ENDFOR»
		return "";
	'''
	
	def generate_setValue(ShapePropertyAssignment[] properties) '''
		Text gAlg = (Text) context.getGraphicsAlgorithm();
		String id = peService.getPropertyValue(gAlg, ISprayShapeConstants.TEXT_ID);
		«FOR property : properties»
		if(id.equals("«property.key.simpleName»")) {
			eClass.set«property.attribute.name.toFirstUpper»(value);
		}
		«ENDFOR»
	'''
	
	
	
}
