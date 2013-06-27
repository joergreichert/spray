package org.eclipselabs.spray.shapes.generator.svg

import javax.inject.Inject
import org.eclipse.xtext.EcoreUtil2
import org.eclipselabs.spray.shapes.AnchorManual
import org.eclipselabs.spray.shapes.AnchorPredefinied
import org.eclipselabs.spray.shapes.CDEllipse
import org.eclipselabs.spray.shapes.CDLine
import org.eclipselabs.spray.shapes.CDPolygon
import org.eclipselabs.spray.shapes.CDPolyline
import org.eclipselabs.spray.shapes.CDRectangle
import org.eclipselabs.spray.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.CDText
import org.eclipselabs.spray.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.Ellipse
import org.eclipselabs.spray.shapes.Line
import org.eclipselabs.spray.shapes.PlacingDefinition
import org.eclipselabs.spray.shapes.PolyLineLayout
import org.eclipselabs.spray.shapes.Polygon
import org.eclipselabs.spray.shapes.Polyline
import org.eclipselabs.spray.shapes.Rectangle
import org.eclipselabs.spray.shapes.RectangleEllipseLayout
import org.eclipselabs.spray.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.Shape
import org.eclipselabs.spray.shapes.ShapeConnection
import org.eclipselabs.spray.shapes.ShapeContainerElement
import org.eclipselabs.spray.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.Text
import org.eclipselabs.spray.styles.Color
import org.eclipselabs.spray.styles.ColorConstantRef
import org.eclipselabs.spray.styles.StyleLayout
import org.eclipse.emf.ecore.EObject
import org.eclipselabs.spray.shapes.RoundedRectangleLayout
import org.eclipselabs.spray.shapes.LineLayout

/**
 * Generator for SVG representations of ShapeDefinitions.
 */
class SVGShapeGenerator {
    @Inject extension LayoutExtensions

    // ENTRY METHODS
    def dispatch generate (ShapeDefinition shape) '''
        «shape.defs»
        «FOR s: shape.shape»
            «s.generateShape(false)»
        «ENDFOR»
        «IF shape.anchor!=null»
            «shape.anchor.type.generateAnchor(false)»
        «ENDIF»
    '''
    
    def dispatch generate (ConnectionDefinition shape) '''
        «shape.defs»
        <line x1="«defaultConnectionX1 + shape.placingSpaceXShift»" y1="«defaultConnectionY1 + shape.placingSpaceYShift»" x2="«defaultConnectionX2 + shape.placingSpaceXShift»" y2="«defaultConnectionY2 + shape.placingSpaceYShift»"«layouting(shape)»/>
        «FOR p: shape.placing»
            «p.generateShape(true)»
        «ENDFOR»
    '''
    
    def layouting(ConnectionDefinition shape) {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(Polyline shape)             {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(CDPolyline shape)           {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(Polygon shape)              {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(CDPolygon shape)            {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(Ellipse shape)              {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(CDEllipse shape)            {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(Rectangle shape)            {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(CDRectangle shape)          {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(RoundedRectangle shape)     {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(CDRoundedRectangle shape)   {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(Line shape)                 {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
    def layouting(CDLine shape)               {  if(shape.layout!=null) layouting(shape.layout.styleAttribute, shape.lineStyle) else ""  }
   	
   	def layouting(CharSequence shapeStyle, CharSequence lineStyle) {
   		val shapeStyleDef = shapeStyle?.toString.trim
   		val lineStyleDef = lineStyle?.toString.trim
		if(!shapeStyleDef.nullOrEmpty) " style=\"" + shapeStyleDef + lineStyleDef.layoutingLineStyle(true) + "\"" else lineStyleDef.layoutingLineStyle(false)
   	}
   	
   	def layoutingLineStyle(String lineStyleDef, boolean shapeStyleDefined) {
   		if(!lineStyleDef.nullOrEmpty) (if(!shapeStyleDefined) " style=\"" else " ") + lineStyleDef + (if(!shapeStyleDefined) "\"" else "") else ""
   	}
    
    // LINE
    
    def protected dispatch generateShape (Line shape, boolean child) '''
        <line x1="«shape.x1 + shape.parentX»" y1="«shape.y1 + shape.parentY»" x2="«shape.x2 + shape.parentX»" y2="«shape.y2 + shape.parentY»"«layouting(shape)»/>
    '''
    def protected dispatch generateShape (CDLine shape, boolean child) {
    	val pdOffsetX = shape.placingOffsetX 
    	val pdOffsetY = shape.placingOffsetY
    	'''
        <line x1="«shape.x1 + shape.parentX + pdOffsetX»" y1="«shape.y1 + shape.parentY + pdOffsetY»" x2="«shape.x2 + shape.parentX + pdOffsetX»" y2="«shape.y2 + shape.parentY + pdOffsetY»"«layouting(shape)»/>
    	'''
    }	

    // POLYLINE
    
    def protected dispatch generateShape (Polyline shape, boolean child) '''
        <polyline points="«shape.points(child)»"«layouting(shape)»/>
    '''
    def protected dispatch generateShape (CDPolyline shape, boolean child) '''
        <polyline points="«shape.points(child, shape.placingOffsetX, shape.placingOffsetY)»"«layouting(shape)»/>
    '''
    
    def protected points (Polyline pl, boolean child, int xOffset, int yOffset) {
    	val parentX = pl.parentX
    	val parentY = pl.parentY
    	'''«FOR p: pl.layout.point SEPARATOR ","»«p.xcor + parentX + xOffset» «p.ycor + parentY + yOffset»«ENDFOR»'''
    }
    
    def protected points (Polyline pl, boolean child) {  points(pl, child, 0, 0)  }
    def protected points (CDPolyline pl, boolean child, int xOffset, int yOffset) {
    	val parentX = pl.parentX
    	val parentY = pl.parentY
    	'''«FOR p: pl.layout.point SEPARATOR ","»«p.xcor + parentX + xOffset» «p.ycor + parentY + yOffset»«ENDFOR»'''
   	}
    def protected points (CDPolyline pl, boolean child) {  points(pl, child, 0, 0)  }

    // POLYGON
    
    def protected dispatch generateShape (Polygon shape, boolean child) '''
        <polygon points="«shape.points(child)»"«layouting(shape)»/>
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDPolygon shape, boolean child) '''
        <polygon points="«shape.points(child, shape.placingOffsetX, shape.placingOffsetY)»"«layouting(shape)»/>
    '''

    def protected points (Polygon pl, boolean child, int xOffset, int yOffset) '''«FOR p: pl.layout.point SEPARATOR ","»«p.x(child) + (if(child) pl.parentX else 0) + xOffset» «p.y(child) + (if(child) pl.parentY else 0) + yOffset»«ENDFOR»'''
    def protected points (Polygon pl, boolean child) {  points(pl, child, 0, 0)  }
    def protected points (CDPolygon pl, boolean child, int xOffset, int yOffset) '''«FOR p: pl.layout.point SEPARATOR ","»«p.x(child) + (if(child) pl.parentX else 0) + xOffset» «p.y(child) + (if(child) pl.parentY else 0) + yOffset»«ENDFOR»'''
    def protected points (CDPolygon pl, boolean child) {  points(pl, child, 0, 0)  }

    // RECTANGLE

//    def protected dispatch generateShape (Compartment shape) '''
//        <rect «shape.positionAndSize»/>
//    '''
    def protected dispatch generateShape (Rectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child)»«layouting(shape)»/>
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDRectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child, shape.placingOffsetX, shape.placingOffsetY)»«layouting(shape)»/>
    '''

    // ROUNDEDRECTANGLE
    
    def protected dispatch generateShape (RoundedRectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child)» rx="«shape.rx»" ry="«shape.ry»"«layouting(shape)»/>
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDRoundedRectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child, shape.placingOffsetX, shape.placingOffsetY)» rx="«shape.rx»" ry="«shape.ry»"«layouting(shape)»/>
    '''

    // ELLIPSE
    
    def protected dispatch generateShape (Ellipse shape, boolean child) '''
        «IF shape.isCircle»
            <circle cx="«shape.x(child) + shape.parentX»" cy="«shape.y(child) + shape.parentY»" r="«shape.rx»"«layouting(shape)»/>
        «ELSE»
            <ellipse cx="«shape.x(child) + shape.parentX»" cy="«shape.y(child) + shape.parentY»" rx="«shape.rx»" ry="«shape.ry»"«layouting(shape)»/>
        «ENDIF» 
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDEllipse shape, boolean child) '''
        «IF shape.isCircle»
            <circle cx="«shape.x(child) + shape.parentX + shape.placingOffsetX»" cy="«shape.y(child) + shape.parentY + shape.placingOffsetY»" r="«shape.rx»"«layouting(shape)»/>
        «ELSE»
            <ellipse cx="«shape.x(child) + shape.parentX + shape.placingOffsetX»" cy="«shape.y(child) + shape.parentY + shape.placingOffsetY»" rx="«shape.rx»" ry="«shape.ry»"«layouting(shape)»/>
        «ENDIF» 
   	'''

    // TEXT
    
    def protected dispatch generateShape (Text shape, boolean child) '''
        <text x="«shape.x(child)»" y="«shape.y(child)»">«IF shape.body.value != null»#«shape.body.value»«ELSE»&lt;TEXT&gt;«ENDIF»</text>
    '''
    def protected dispatch generateShape (CDText shape, boolean child) '''
        <text x="«shape.x(child) + shape.placingOffsetX»" y="«shape.y(child) + shape.placingOffsetY»">«IF shape.body.value != null»#«shape.body.value»«ELSE»&lt;TEXT&gt;«ENDIF»</text>
   	'''
    
    def protected positionAndSize (Shape shape, boolean child) {  positionAndSize(shape, child, 0, 0)  }
    def protected positionAndSize (Shape shape, boolean child, int xOffset, int yOffset) '''x="«shape.x(child) + shape.parentX + xOffset»" y="«shape.y(child) + shape.parentY + yOffset»" width="«shape.width»" height="«shape.height»"'''
    def protected positionAndSize (ShapeConnection shape, boolean child) {  positionAndSize(shape, child, 0, 0)  }
    def protected positionAndSize (ShapeConnection shape, boolean child, int xOffset, int yOffset) '''x="«shape.x(child) + xOffset»" y="«shape.y(child) + yOffset»" width="«shape.width»" height="«shape.height»"'''
    
    // ANCHOR
    def protected dispatch generateAnchor (AnchorManual anchor, boolean child) '''
        «FOR ap: anchor.position»
        <use x="«ap.pos.x(child)»" y="«ap.pos.y(child)»" xlink:href="#anchor"/>
        «ENDFOR»
    '''
    def protected dispatch generateAnchor (AnchorPredefinied anchor, boolean child) '''
«««        TODO 
    '''
    
    // PLACING
    
    def protected dispatch generateShape (PlacingDefinition shape, boolean child) '''
        «shape.shapeCon.generateShape(child)»
   	'''
    
    def placingOffsetX(EObject cdShape) {
    	val pd = EcoreUtil2::getContainerOfType(cdShape, typeof(PlacingDefinition))
    	if(pd != null) defaultConnectionX1 + Double::valueOf(defaultConnectionWidth * pd.offset).intValue + cdShape.placingSpaceXShift else 0
    }

    def placingOffsetY(EObject cdShape) {
    	val pd = EcoreUtil2::getContainerOfType(cdShape, typeof(PlacingDefinition))
    	if(pd != null) defaultConnectionY1 + cdShape.placingSpaceYShift else 0
    }
    
    def protected styleAttribute (RectangleEllipseLayout l) { l.layout.styleAttribute }
    def protected styleAttribute (RoundedRectangleLayout l) { l.layout.styleAttribute }
    def protected styleAttribute (PolyLineLayout l)         { l.layout.styleAttribute }
    def protected styleAttribute (LineLayout l)             { l.layout.styleAttribute }
    
    // STYLE
    def protected styleAttribute (ShapestyleLayout ssl) '''«IF(ssl != null && ssl.layout != null)»«ssl.handleNonNullstyleAttribute»«ENDIF»'''
    def protected handleNonNullstyleAttribute (ShapestyleLayout ssl) '''«ssl.handleStrokeColor»«ssl.handleBackground»«ssl.handleOpacity»«ssl.handleStrokeWidth»'''
    def protected handleBackground (ShapestyleLayout ssl) '''«IF(ssl.layout.background != null)»fill:«ssl.layout.backgroundColor»;«ENDIF»'''
    def protected handleOpacity (ShapestyleLayout ssl) '''«IF(ssl.hasTransparency)»opacity:«ssl.transparency»;«ENDIF»'''
    def protected handleStrokeWidth (ShapestyleLayout ssl) '''«IF ssl.layout.lineWidth>1»stroke-width:«ssl.layout.lineWidth»px;«ENDIF»'''
    def protected handleStrokeColor (ShapestyleLayout ssl) '''«IF ssl.layout.lineColor!=null»stroke:«ssl.layout.color»;«ENDIF»'''
    
    def backgroundColor(StyleLayout styleLayout) {
    	if(styleLayout.background instanceof ColorConstantRef) {
    		(styleLayout.background as ColorConstantRef).color
    	} else if(styleLayout.background instanceof Color) {
    		(styleLayout.background as Color).color()
    	} else {
	    	""
    	}
    }
    
    def color(StyleLayout styleLayout) {
    	if(styleLayout.lineColor instanceof ColorConstantRef) {
    		(styleLayout.lineColor as ColorConstantRef).color
    	} else if(styleLayout.lineColor instanceof Color) {
    		(styleLayout.lineColor as Color).color()
    	} else {
	    	""
    	}
    }
    
 
//    def protected dispatch String styleClass (ShapeDefinition shape) {
//        if (shape.style != null) shape.style.style.type.identifier else "default"
//    }
//
//    def protected dispatch String styleClass (Shape shape) {
//        val sd = EcoreUtil2::getContainerOfType(shape,typeof(ShapeDefinition))
//        sd.styleClass
//    }

    // HEADER DEFINITIONS: CSS, SHAPE DEFS
    def protected dispatch defs (ShapeDefinition shape) '''
        <defs>
            «shape.css»
            «shape.anchorDef»
        </defs>
    '''
    def protected dispatch defs (ConnectionDefinition shape) '''
        <defs>
            «shape.css»
        </defs>
    '''
    
    /**
     * Creates CSS for the base graphical types and style classes for used Styles
     */
    def protected css (ShapeContainerElement shape) '''
        <style type="text/css"> <![CDATA[
        rect {fill: none; stroke:black; stroke-width:1px}
        line {fill: none; stroke:black; stroke-width:1px}
        polyline {fill: none; stroke:black; stroke-width:1px}
        polygon {fill: none; stroke:black; stroke-width:1px}
        circle {fill: none; stroke:black; stroke-width:1px}
        ellipse {fill: none; stroke:black; stroke-width:1px}
        text {fill: black; font-family: verdana,sans-serif; font-size:12px;}
        .default {fill: none; stroke:black; stroke-width:1px}
«««        «IF shape.style!=null»
«««            .«shape.style.style.type.identifier» { } ««« TODO
«««        «ENDIF» 
        ]]>
        </style>
    '''
    
    def protected anchorDef (ShapeDefinition shape) '''
        <rect id="anchor" style="fill:#a0c0e8" width="5" height="5"/>
    '''
    
}