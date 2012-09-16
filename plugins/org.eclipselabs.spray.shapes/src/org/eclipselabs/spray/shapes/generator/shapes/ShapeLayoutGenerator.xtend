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
	
	def ITreeAppendable generateGetLayoutMethod(ITreeAppendable appendable, ShapeDefinition s) {
		appendable.append('''
		public ''').append(sprayLayoutManagerType).append(''' getShapeLayout() {
			''').append(sprayLayoutManagerType).append(''' layoutManager = new ''').append(sprayLayoutManagerType).append('''();
			«IF s.shapeLayout.minwidth != 0»
				layoutManager.setMinSizeWidth(«s.shapeLayout.minwidth»);	   
			«ELSE»
				layoutManager.setMinSizeWidth(-1);	
			«ENDIF»	
			«IF s.shapeLayout.maxwidth != 0»
				layoutManager.setMaxSizeWidth(«s.shapeLayout.maxwidth»);	   
			«ELSE»
				layoutManager.setMaxSizeWidth(-1);	
			«ENDIF»	
			«IF s.shapeLayout.minheight != 0»
				layoutManager.setMinSizeHeight(«s.shapeLayout.minheight»);	   
			«ELSE»
				layoutManager.setMinSizeHeight(-1);	
			«ENDIF»	
			«IF s.shapeLayout.maxheight != 0»
				layoutManager.setMaxSizeHeight(«s.shapeLayout.maxheight»);	   
			«ELSE»
				layoutManager.setMaxSizeHeight(-1);	
			«ENDIF»	
			«IF s.shapeLayout.stretchH != null»
				layoutManager.setStretchHorizontal(«s.shapeLayout.stretchH»); 
			«ELSE»
				layoutManager.setStretchHorizontal(true);		   
			«ENDIF»		
			«IF s.shapeLayout.stretchV != null»
				layoutManager.setStretchVertical(«s.shapeLayout.stretchV»);	   
			«ELSE»
				layoutManager.setStretchHorizontal(true);	   
			«ENDIF»		
			return layoutManager;
		}
		''')
	}
}