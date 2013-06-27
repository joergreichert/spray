package org.eclipselabs.spray.generator.graphiti.templates.features

import javax.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.mm.spray.ShapeFromDsl
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment
import org.eclipselabs.spray.xtext.generator.FileGenerator

import static org.eclipselabs.spray.generator.common.GeneratorUtil.*
import org.eclipselabs.spray.generator.graphiti.util.SprayCompiler
import org.eclipse.xtext.xbase.XExpression

class DirectEditFeature extends FileGenerator<MetaClass> {
	
	@Inject extension NamingExtensions
	@Inject extension SprayCompiler
	
	override generateExtensionFile(MetaClass modelElement) {
		modelElement.mainExtensionPointFile(javaGenFile.className);
	}
	
	override generateBaseFile(MetaClass modelElement) {
		modelElement.mainFile(javaGenFile.baseClassName)
	}
	
	 def mainExtensionPointFile(MetaClass metaClass, String className) '''    
        «extensionHeader(this)»
        package «feature_package()»;
        
        import org.eclipse.graphiti.features.IFeatureProvider;
        
        public class «className» extends «className»Base {
            public «className»(IFeatureProvider fp) {
                super(fp);
            }
        }
    '''

    def mainFile(MetaClass metaclass, String className) '''
        «header(this)»
        package «feature_package()»;
        
        import com.google.common.base.Function;
        import org.eclipse.graphiti.features.IFeatureProvider;
        import org.eclipse.graphiti.features.context.IDirectEditingContext;
        import org.eclipse.graphiti.mm.pictograms.PictogramElement;
        import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
        import org.eclipse.graphiti.mm.algorithms.Text;
        import org.eclipse.graphiti.services.Graphiti;
        import org.eclipse.graphiti.services.IPeService;
        import org.eclipselabs.spray.runtime.graphiti.features.AbstractDirectEditingFeature;
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
            // support direct editing, if it is a «metaclass.itfName», and the user clicked
            // directly on the text and not somewhere else in the rectangle
            if (bo instanceof «metaclass.itfName» && ga instanceof Text) {
                return true;
            }
            // direct editing not supported in all other cases
            return false;
        }
    '''

	def generate_getInitalValue(MetaClass metaclass)'''
		«overrideHeader»
		public String getInitialValue(IDirectEditingContext context) {
		    // return the initial value of the clicked text on the «metaclass.itfName»
		    PictogramElement pe = context.getPictogramElement();
		    «metaclass.itfName» eClass = («metaclass.itfName») getBusinessObjectForPictogramElement(pe);
		    «IF metaclass.representedBy instanceof ShapeFromDsl»
		    «(metaclass.representedBy as ShapeFromDsl).properties.generate_initialValue(metaclass)»
		    «ELSEIF (metaclass.representedBy instanceof ConnectionInSpray) && ((metaclass.representedBy as ConnectionInSpray).connection != null)»
		    «(metaclass.representedBy as ConnectionInSpray).properties.generate_initialValue(metaclass)»
		    «ELSE»
		    return "";
		    «ENDIF»
		}
    '''
	
	def generate_getEditingType(MetaClass metaclass)'''
		«overrideHeader»
		public int getEditingType() {
		    return TYPE_TEXT;
		}
    '''
    
    def generate_setValue(MetaClass metaclass)'''
		«overrideHeader»
		public void setValue(final String value, final IDirectEditingContext context) {
		    // set the new value on the «metaclass.itfName»
		    final PictogramElement pe = context.getPictogramElement();
		    «metaclass.itfName» eClass = («metaclass.itfName») getBusinessObjectForPictogramElement(pe);
		    «IF metaclass.representedBy instanceof ShapeFromDsl»
		    «(metaclass.representedBy as ShapeFromDsl).properties.generate_setValue(metaclass)»
		    «ELSEIF (metaclass.representedBy instanceof ConnectionInSpray) && ((metaclass.representedBy as ConnectionInSpray).connection != null)»
		    «(metaclass.representedBy as ConnectionInSpray).properties.generate_setValue(metaclass)»
		    «ENDIF»
		    updatePictogramElement(pe);
		}
	'''   
	
	def generate_initialValue(ShapePropertyAssignment[] properties, MetaClass metaclass) '''
		Text gAlg = (Text) context.getGraphicsAlgorithm();
		String id = peService.getPropertyValue(gAlg, TEXT_ID);
		«FOR property : properties»
			{
				«IF property.value != null»
					«property.value.propertyAssignmentFunction("gAlgValue", "String", metaclass.itfName, "eClass")»
					if(id.equals("«property.key.simpleName»")) {
						«IF property?.attribute?.name != null»
						    return eClass.get«property.attribute.name.toFirstUpper»();
						«ELSE»
							return gAlgValue;
						«ENDIF»	
					}
				«ELSE»
					«IF property?.attribute?.name != null»
						if(id.equals("«property.key.simpleName»")) {
						    return eClass.get«property.attribute.name.toFirstUpper»();
						}
					«ENDIF»
				«ENDIF»
			}
		«ENDFOR»	
		return "";
	'''
	
	def generate_setValue(ShapePropertyAssignment[] properties, MetaClass metaclass) '''
		Text gAlg = (Text) context.getGraphicsAlgorithm();
		String id = peService.getPropertyValue(gAlg, TEXT_ID);
		«FOR property : properties»
			{
				«IF property.value != null»
					«property.value.propertyAssignmentFunction("gAlgValue", "String", metaclass.itfName, "eClass")»
					if(id.equals("«property.key.simpleName»")) {
						«IF property?.attribute?.name != null»
						    eClass.set«property.attribute.name.toFirstUpper»(value);
						«ELSE»
							gAlg.setValue(gAlgValue);
						«ENDIF»	
					}
				«ELSE»	
					«IF property?.attribute?.name != null»
						if(id.equals("«property.key.simpleName»")) {
						    eClass.set«property.attribute.name.toFirstUpper»(value);
						}
					«ENDIF»
				«ENDIF»
			}
		«ENDFOR»
	'''
	
	def propertyAssignmentFunction(XExpression xexp, String valueName, String returnType, String metaClassName, String metaClassAttribute) '''
   		«returnType» «valueName» = new Function<«metaClassName», «returnType»>() {
   			public «returnType» apply(«metaClassName» modelElement) {
   				«xexp.compileForPropertyAssignement("returnedValue", "modelElement")»
   			}
   		}.apply(«metaClassAttribute»); 
	'''
	
}