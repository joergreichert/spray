package org.eclipselabs.spray.shapes.generator.shapes

import java.util.ArrayList
import org.eclipselabs.spray.shapes.Shape
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.Text
import org.eclipselabs.spray.shapes.Line
import org.eclipselabs.spray.shapes.Polyline
import org.eclipselabs.spray.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.Polygon
import org.eclipselabs.spray.shapes.Rectangle
import org.eclipselabs.spray.shapes.Compartment
import com.ibm.icu.util.CompactByteArray
import org.eclipselabs.spray.shapes.Rectangle

class ShapeEnumGenerator {
	
	def generateTextIdsEnum(ShapeDefinition s) {
		val ids = s.searchTextIds
		'''
		public static enum TextIds {
			«FOR id : ids»
			«IF !(ids.last == id)»
			«id»,
			«ELSE»
			«id»
			«ENDIF»
			«ENDFOR»
		}
		'''
	}
	
	def dispatch searchTextIds(ShapeDefinition s) {
		val ids = new ArrayList<String>();
		for(Shape shape : s.shape) {
			if(shape instanceof Text) {
				ids.add((shape as Text).body.value);
			} else if(shape instanceof Compartment) {
				ids.add((shape as Compartment).shape.id.value)
			} else {
				ids.addAll(shape.searchTextIds);
			}
		}
		if (s.description != null) {
			ids.add(s.description.body.value)
		}
		ids
	}
	
	def dispatch searchTextIds(Line shape) {
		new ArrayList<String>()
	}
	def dispatch searchTextIds(Polyline shape) {
		new ArrayList<String>()
	}
	def dispatch searchTextIds(RoundedRectangle shape) {
		val ids = new ArrayList<String>()
		for(child : shape.shape) {
			ids.addAll(child.searchTextIds)
		}
		ids
	}
	def dispatch searchTextIds(Rectangle shape) {
		val ids = new ArrayList<String>()
		if( shape?.compartmentInfo?.id != null ){
			ids.add(shape.compartmentInfo.id.value)
		}
		for(child : shape.shape) {
			ids.addAll(child.searchTextIds)
		}
		ids
	}
	def dispatch searchTextIds(Ellipse shape) {
		val ids = new ArrayList<String>()
		if( shape?.compartmentInfo?.id != null ){
			ids.add(shape.compartmentInfo.id.value)
		}
		for(child : shape.shape) {
			ids.addAll(child.searchTextIds)
		}
		ids
	}
	def dispatch searchTextIds(Polygon shape) {
		val ids = new ArrayList<String>()
		for(child : shape.shape) {
			ids.addAll(child.searchTextIds)
		}
		ids
	}
	def dispatch searchTextIds(Text shape) {
		val ids = new ArrayList<String>()
		ids.add(shape.body.value)
		ids
	}
	def dispatch searchTextIds(Compartment shape) {
		val ids = new ArrayList<String>()
		ids.add(shape.shape.id.value)
		ids
	}
}