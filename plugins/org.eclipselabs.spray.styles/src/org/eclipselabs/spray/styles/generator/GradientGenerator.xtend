package org.eclipselabs.spray.styles.generator

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipselabs.spray.styles.generator.util.GradientUtilClass
import org.eclipselabs.spray.styles.styles.ColorConstantRef
import org.eclipselabs.spray.styles.styles.Gradient
import org.eclipselabs.spray.styles.styles.GradientColorArea
import org.eclipselabs.spray.styles.styles.GradientLayout
import org.eclipselabs.spray.styles.styles.RGBColor
import org.eclipselabs.spray.xtext.generator.DefaultCompilationUnitImportManager
import org.eclipse.graphiti.util.PredefinedColoredAreas
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas
import org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.util.TypeReferences

class GradientGenerator {
	@Inject extension DefaultCompilationUnitImportManager importManager
    @Inject extension TypeReferences typeReferences
	
	private Gradient current = null 
	
	def filepath(Gradient g) { g.packagePath + g.className + ".java" }
	def className(Gradient g) { g.name.toFirstUpper }
	def packageName(Gradient g) { "org.eclipselabs.spray.styles.gradients" }
	def packagePath(Gradient g) { "org/eclipselabs/spray/styles/gradients/" }
	
    def superType() {  findDeclaredType(typeof(PredefinedColoredAreas), current)  }
    def interfaceType() {  findDeclaredType(typeof(ISprayGradient), current)  }
    def gradientColoredAreasType() {  findDeclaredType(typeof(GradientColoredAreas), current)  }
    def gradientColoredAreaType() {  findDeclaredType(typeof(GradientColoredArea), current)  }
    def stylesFactoryType() {  findDeclaredType(typeof(StylesFactory), current)  }
    def eListType() {  findDeclaredType(typeof(EList), current)  }
	
	int elementIndex = 0
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(gradient : resource.allContents.toIterable.filter(typeof(Gradient))) {
			current = gradient
			importManager.enter(gradient.packageName)
			importManager.registerGradientImports(gradient)
      		fsa.generateFile(gradient.filepath, gradient.compile)
			importManager.exit
   		}
	}
	
	def compile(Gradient g) {
		'''
		«g.head»
		
		«g.body»
		'''
	}
	
	def setCurrent(Gradient aGradient) {
		this.current = aGradient
	}	
	
	def head(Gradient g) {
		'''
		/**
		 * This is a generated Gradient class for Spray.
		 */
		package «g.packageName»;
		
		'''
	}
	
	def registerGradientImports(DefaultCompilationUnitImportManager importManager, Gradient gradient) {
		this.importManager = importManager
		importManager.addImports(
			"org.eclipse.emf.common.util.EList",
			"org.eclipse.graphiti.mm.algorithms.styles.GradientColoredArea",
			"org.eclipse.graphiti.mm.algorithms.styles.GradientColoredAreas",
			"org.eclipse.graphiti.mm.algorithms.styles.LocationType",
			"org.eclipse.graphiti.mm.algorithms.styles.StylesFactory",
			"org.eclipse.graphiti.util.IGradientType",
			"org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient",
			"org.eclipse.graphiti.util.IPredefinedRenderingStyle",
			"org.eclipse.graphiti.util.PredefinedColoredAreas"
		)
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
	
	def dispatch createColorValue(ColorConstantRef c) {'''«GradientUtilClass::colorConstantToHexString(c)»''' }
	def dispatch createColorValue(RGBColor c) { '''«GradientUtilClass::RGBColorToHexString(c)»''' }
	def increaseCounter(){ elementIndex = elementIndex + 1 }
}