package org.eclipselabs.spray.styles.generator

import org.eclipselabs.spray.styles.Gradient
import org.eclipselabs.spray.styles.GradientLayout
import org.eclipselabs.spray.styles.GradientColorArea
import org.eclipselabs.spray.styles.ColorConstantRef
import org.eclipselabs.spray.styles.RGBColor
import org.eclipselabs.spray.runtime.graphiti.styles.GradientUtilClass
import org.eclipselabs.spray.generator.common.ProjectProperties
import org.eclipselabs.spray.xtext.generator.FileGenerator
import org.eclipselabs.spray.xtext.generator.filesystem.GenFile
import org.eclipselabs.spray.xtext.generator.filesystem.JavaGenFile

class GradientGenerator extends FileGenerator<Gradient> {
	def filepath(Gradient g) { g.packagePath + g.className + ".java" }
	def gapClassName(Gradient g) { g.name.toFirstUpper }
	def className(Gradient g) { g.name.toFirstUpper + "Base" }
    def packageName(Gradient s) { ProjectProperties::gradientsPackage }
    def packagePath(Gradient s) { ProjectProperties::toPath(ProjectProperties::gradientsPackage) }
	
	int elementIndex = 0
	
	override generate(Gradient gradient, GenFile genFile) {
		(genFile as JavaGenFile).setPackageAndClass(gradient.packageName, gradient.gapClassName)
		super.generate(gradient, genFile)
	}

    override CharSequence generateBaseFile(Gradient gradient) {
    	compile(gradient)
    }

    override CharSequence generateExtensionFile(Gradient gradient) {
        mainExtensionPointFile(gradient)
    }

    def mainExtensionPointFile(Gradient gradient) '''
        «extensionHeader(this)»
        package «gradient.packageName»;
         
        public class «gradient.gapClassName» extends «gradient.className» {
         
        }
    '''	
	
	def private compile(Gradient g) {
		'''
		«g.head»
		
		«g.body»
		'''
	}
	
	def head(Gradient g) {
		'''
		/**
		 * This is a generated Gradient class for Spray.
		 */
		package «g.packageName»;
		
		import org.eclipse.emf.common.util.EList;
		import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea;
		import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas;
		import org.eclipse.graphiti.mm.algorithms.styles.LocationType;
		import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
		import org.eclipse.graphiti.util.IGradientType;
		import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;
		import org.eclipse.graphiti.util.IPredefinedRenderingStyle;
		import org.eclipse.graphiti.util.PredefinedColoredAreas;
		'''
	}
	
	def body(Gradient g) {
		'''
		/**
		 * Description: «g.description»
		 */
		@SuppressWarnings("all")
		public class «g.className» extends PredefinedColoredAreas implements ISprayGradient {
		    
		    /**
		     * This method returns the gradient color area.
		     * Description: «g.description»
		     */
		     public GradientColoredAreas getGradientColoredAreas( ) {
		         final GradientColoredAreas gradientColoredAreas = org.eclipse.graphiti.mm.algorithms.styles.StylesFactory.eINSTANCE.createGradientColoredAreas();
		         final EList<org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea> gcas = gradientColoredAreas.getGradientColor();
		         «g.layout.createColorAreas»
		         return gradientColoredAreas;
		     }
		
		}
		'''
	}

	def createColorAreas(GradientLayout l) {
		l.area.sortBy(entity | entity.offset)
		elementIndex = -1
		'''
		«FOR element : l.area»
			«IF(increaseCounter < l.area.size - 1)»
			«createArea(element,l.area.get(elementIndex+1))»
			«ELSEIF(l.area.size == 1)»
			
			«ENDIF»
      	«ENDFOR»
      	'''	
	}
	
	def createArea(GradientColorArea first, GradientColorArea second){
		var offset_1 = (first.offset*100).intValue
		var offset_2 = (second.offset*100).intValue  
		'''addGradientColoredArea(gcas,"«first.color.createColorValue»",«offset_1»,org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE, "«second.color.createColorValue»",«offset_2»,org.eclipse.graphiti.mm.algorithms.styles.LocationType.LOCATION_TYPE_RELATIVE);'''
	}
	
	def dispatch createColorValue(ColorConstantRef c) {'''«GradientUtilClass::colorConstantToHexString(c.value.name)»''' }
	def dispatch createColorValue(RGBColor c) { '''«GradientUtilClass::RGBColorToHexString(c.red, c.green, c.blue)»''' }
	def increaseCounter(){ elementIndex = elementIndex + 1 }
}