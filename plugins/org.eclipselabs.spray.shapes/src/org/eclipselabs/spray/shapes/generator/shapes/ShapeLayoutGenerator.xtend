package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipselabs.spray.runtime.graphiti.shape.SprayLayoutManager
import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences

class ShapeLayoutGenerator {
	@Inject extension TypeReferences typeReferences
	
	private ShapeDefinition current = null
	
	def setCurrent(ShapeDefinition aShape) {
		this.current = aShape
	}
	
	def generateLayout(ShapeDefinition s) {
		'''
		«IF s.shapeLayout.proportional != null»
			sprayStyle.getStyle(diagram).setProportional(«s.shapeLayout.proportional»);
		«ELSE»
			sprayStyle.getStyle(diagram).setProportional(false);
		«ENDIF»		
		«IF s.shapeLayout.stretchH != null»
			sprayStyle.getStyle(diagram).setStretchH(«s.shapeLayout.stretchH»);
		«ELSE»
			sprayStyle.getStyle(diagram).setStretchH(false);
		«ENDIF»		
		«IF s.shapeLayout.stretchV != null»
			sprayStyle.getStyle(diagram).setStretchV(«s.shapeLayout.stretchV»);
		«ELSE»
			sprayStyle.getStyle(diagram).setStretchV(false);
		«ENDIF»		
		'''
	}
	
	def sprayLayoutManagerType() {  findDeclaredType(typeof(SprayLayoutManager), current)  }
	
	def ITreeAppendable generateGetLayoutMethod(ITreeAppendable givenAppendable, ShapeDefinition s) {
		var appendable = givenAppendable.append('''public ''').append(sprayLayoutManagerType).append(''' getShapeLayout() {''').newLine
		appendable = appendable.increaseIndentation
			appendable = appendable.append(sprayLayoutManagerType).append(''' layoutManager = new ''').append(sprayLayoutManagerType).append('''();''')
			if (s.shapeLayout.minwidth != 0) {
				appendable = appendable.append('''layoutManager.setMinSizeWidth(«s.shapeLayout.minwidth»);''').newLine
			} else {
				appendable = appendable.append('''layoutManager.setMinSizeWidth(-1);''').newLine	
			}	
			if (s.shapeLayout.maxwidth != 0) {
				appendable = appendable.append('''layoutManager.setMaxSizeWidth(«s.shapeLayout.maxwidth»);''').newLine
			} else {
				appendable = appendable.append('''layoutManager.setMaxSizeWidth(-1);''').newLine
			}	
			if (s.shapeLayout.minheight != 0) {
				appendable = appendable.append('''layoutManager.setMinSizeHeight(«s.shapeLayout.minheight»);''').newLine
			} else {
				appendable = appendable.append('''layoutManager.setMinSizeHeight(-1);''').newLine
			}	
			if (s.shapeLayout.maxheight != 0) {
				appendable = appendable.append('''layoutManager.setMaxSizeHeight(«s.shapeLayout.maxheight»);''').newLine
			} else {
				appendable = appendable.append('''layoutManager.setMaxSizeHeight(-1);''').newLine
			}	
			if (s.shapeLayout.stretchH != null) {
				appendable = appendable.append('''layoutManager.setStretchHorizontal(«s.shapeLayout.stretchH»);''').newLine
			} else {
				appendable = appendable.append('''layoutManager.setStretchHorizontal(true);''').newLine
			}		
			if (s.shapeLayout.stretchV != null) {
				appendable = appendable.append('''layoutManager.setStretchVertical(«s.shapeLayout.stretchV»);''').newLine
			} else {
				appendable = appendable.append('''layoutManager.setStretchHorizontal(true);''').newLine
			}		
			appendable = appendable.append('''return layoutManager;''').newLine
		appendable = appendable.append('''}''')
		appendable
	}
}