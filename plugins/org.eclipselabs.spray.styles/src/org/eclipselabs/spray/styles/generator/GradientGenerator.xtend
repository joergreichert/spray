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
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable
import org.eclipse.graphiti.mm.algorithms.styles.LocationType

class GradientGenerator {
	@Inject extension DefaultCompilationUnitImportManager importManager
    @Inject extension TypeReferences typeReferences
	
	private Gradient current = null 
	
	def private filepath(Gradient g) { g.packagePath + g.className + ".java" }
	def className(Gradient g) { g.name.toFirstUpper }
	def packageName(Gradient g) { "org.eclipselabs.spray.styles.gradients" }
	def private packagePath(Gradient g) { "org/eclipselabs/spray/styles/gradients/" }
	
    def superType() {  findDeclaredType(typeof(PredefinedColoredAreas), current)  }
    def interfaceType() {  findDeclaredType(typeof(ISprayGradient), current)  }
    def gradientColoredAreasType() {  findDeclaredType(typeof(GradientColoredAreas), current)  }
    def gradientColoredAreaType() {  findDeclaredType(typeof(GradientColoredArea), current)  }
    def stylesFactoryType() {  findDeclaredType(typeof(StylesFactory), current)  }
    def eListType() {  findDeclaredType(typeof(EList), current)  }
    def private locationTypeType() {  findDeclaredType(typeof(LocationType), current)  }
    def private predefinedColoredAreasType() {  findDeclaredType(typeof(PredefinedColoredAreas), current)  }
    def private iSprayGradientType() {  findDeclaredType(typeof(ISprayGradient), current)  }
	
	private int elementIndex = 0
	
	def doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(gradient : resource.allContents.toIterable.filter(typeof(Gradient))) {
			current = gradient
			importManager.enter(gradient.packageName)
			importManager.registerGradientImports(gradient)
      		fsa.generateFile(gradient.filepath, new FakeTreeAppendable().compile(gradient).content)
			importManager.exit
   		}
	}
	
	def private compile(ITreeAppendable appendable, Gradient g) {
		appendable.append(g.head).newLine.newLine.body(g)
	}
	
	def setCurrent(Gradient aGradient) {
		this.current = aGradient
	}	
	
	def private head(Gradient g) {
		'''
		/**
		 * This is a generated Gradient class for Spray.
		 */
		package «g.packageName»;
		
		«importManager.insertImports»
		
		'''
	}
	
	def private registerGradientImports(DefaultCompilationUnitImportManager importManager, Gradient gradient) {
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
	
	def private body(ITreeAppendable givenAppendable, Gradient g) {
		var appendable = givenAppendable.append('''/**''').newLine
		appendable = appendable.append(''' * Description: «g.description»''').newLine
		appendable = appendable.append(''' */''').newLine;
		appendable = appendable.append('''@SuppressWarnings("all")''').newLine
		appendable = appendable.append('''public class «g.className» extends ''').append(predefinedColoredAreasType)
			.append(''' implements ''').append(iSprayGradientType).append(''' {''').newLine
		appendable = appendable.increaseIndentation.newLine    
			appendable = appendable.append('''/**''').newLine
		    appendable = appendable.append(''' * This method returns the gradient color area.''').newLine
		    appendable = appendable.append(''' * Description: «g.description»''').newLine
		    appendable = appendable.append(''' */''').newLine
		    appendable = appendable.append('''public ''').append(gradientColoredAreasType)
		    	.append(''' getGradientColoredAreas( ) {''').newLine
		    appendable = appendable.increaseIndentation.newLine
		    	appendable = appendable.append('''final ''').append(gradientColoredAreasType)
		    		.append(''' gradientColoredAreas = ''').append(stylesFactoryType)
		    		.append('''.eINSTANCE.createGradientColoredAreas();''').newLine
				appendable = appendable.append('''final ''').append(eListType).append('''<''')
					.append(gradientColoredAreaType)
					.append('''> gcas = gradientColoredAreas.getGradientColor();''').newLine
				if(g.layout != null) appendable = appendable.createColorAreas(g.layout)
				appendable = appendable.append('''return gradientColoredAreas;''').newLine
				appendable = appendable.decreaseIndentation
			appendable = appendable.append('''}''').newLine
			appendable = appendable.decreaseIndentation
		appendable = appendable.append('''}''')
	}

	def createColorAreas(ITreeAppendable givenAppendable, GradientLayout l) {
		l.area.sortBy(entity | entity.offset)
		elementIndex = -1
		var appendable = givenAppendable
		if(l.area != null) {
			for (area1 : l.area) {
				if(increaseCounter < l.area.size - 1) {
					val area2 = l.area.get(elementIndex + 1)
					if(area1 != null && area2 != null) {
						appendable = appendable.createArea(area1, l.area.get(elementIndex + 1))
					}
				} else if (l.area.size == 1) {
					appendable.newLine
				}
	      	}
      	}
      	appendable
	}
	
	def private createArea(ITreeAppendable appendable, GradientColorArea first, GradientColorArea second) {
		var offset_1 = (first.offset*100).intValue
		var offset_2 = (second.offset*100).intValue  
		if(first.color != null && second.color != null) {
			appendable.append('''addGradientColoredArea(gcas, "«first.color.createColorValue»", «offset_1», ''')
				.append(locationTypeType).append('''.LOCATION_TYPE_RELATIVE, "«second.color.createColorValue»", «offset_2», ''')
				.append(locationTypeType).append('''.LOCATION_TYPE_RELATIVE);''').newLine
		}
	}
	
	def private dispatch createColorValue(ColorConstantRef c) {
		'''«GradientUtilClass::colorConstantToHexString(c)»''' 
	}
	
	def private dispatch createColorValue(RGBColor c) { 
		'''«GradientUtilClass::RGBColorToHexString(c)»''' 
	}
	
	def private increaseCounter() {  elementIndex = elementIndex + 1  }
}