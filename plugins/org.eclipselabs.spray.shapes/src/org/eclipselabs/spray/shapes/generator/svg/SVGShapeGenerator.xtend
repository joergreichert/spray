package org.eclipselabs.spray.shapes.generator.svg

import com.google.inject.Inject
import org.eclipse.xtext.EcoreUtil2
import org.eclipselabs.spray.shapes.shapes.Ellipse
import org.eclipselabs.spray.shapes.shapes.Line
import org.eclipselabs.spray.shapes.shapes.Polygon
import org.eclipselabs.spray.shapes.shapes.Polyline
import org.eclipselabs.spray.shapes.shapes.Rectangle
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.shapes.Shape
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.shapes.Text
import org.eclipselabs.spray.shapes.shapes.AnchorManual
import org.eclipselabs.spray.shapes.shapes.AnchorPredefinied
import org.eclipselabs.spray.shapes.shapes.ShapeStyleRef
import org.eclipselabs.spray.shapes.shapes.PolyLineLayout

class SVGShapeGenerator {
    @Inject extension LayoutExtensions

    def generate (ShapeDefinition shape) '''
        «shape.defs»
        «FOR s: shape.shape»
            «s.generateShape»
        «ENDFOR»
        «IF shape.anchor!=null»
            «shape.anchor.type.generateAnchor»
        «ENDIF»
    '''
    
    def dispatch generateShape (Line shape) '''
        <line x1="«shape.x1»" y1="«shape.y1»" x2="«shape.x2»" y2="«shape.y2»"/>
    '''

    def dispatch generateShape (Polyline shape) '''
        <polyline points="«shape.points»" «shape.layout.styleAttribute»/>
    '''
    
    def points (Polyline pl) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor» «p.ycor»«ENDFOR»
    '''

    def dispatch generateShape (Polygon shape) '''
        <polygon points="«shape.points»"/>
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''

    def points (Polygon pl) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor» «p.ycor»«ENDFOR»
    '''


    def dispatch generateShape (Rectangle shape) '''
        <rect «shape.positionAndSize»/>
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''

    def dispatch generateShape (RoundedRectangle shape) '''
        <rect «shape.positionAndSize» rx="«shape.rx»" ry="«shape.ry»"/>
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''

    def dispatch generateShape (Ellipse shape) '''
        «IF shape.isCircle»
            <circle cx="«shape.x»" cy="«shape.y»" r="«shape.rx»"/>
        «ELSE»
            <ellipse cx="«shape.x»" cy="«shape.y»" rx="«shape.rx»" ry="«shape.ry»"/>
        «ENDIF» 
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''

    def dispatch generateShape (Text shape) '''
        <text x="«shape.x»" y="«shape.y»">«IF shape.body.value != null»&lt;«shape.body.value»&gt;«ELSE»&lt;TEXT&gt;«ENDIF»</text>
    '''
    
    def positionAndSize (Shape shape) '''x="«shape.x»" y="«shape.y»" width="«shape.width»" height="«shape.height»"'''
    
    // ANCHOR
    def dispatch generateAnchor (AnchorManual anchor) '''
        «FOR ap: anchor.position»
        <use x="«ap.pos.x»" y="«ap.pos.y»" xlink:href="#anchor" />
        «ENDFOR»
    '''
    def dispatch generateAnchor (AnchorPredefinied anchor) '''
        
    '''
    
    def styleAttribute (PolyLineLayout l) { l.layout.styleAttribute }
    
    // STYLE
    def styleAttribute (ShapestyleLayout ssl) '''
        «IF(ssl != null && ssl.layout != null)»
            style="
            «IF(ssl.layout.background != null)»
                fill:«ssl.layout.background.color»;
            «ENDIF»
            «IF(ssl.hasTransparency)»
                opacity:«ssl.transparency»;
            «ENDIF»
            «IF ssl.layout.lineWidth>1»
                stroke-width:«ssl.layout.lineWidth»px;
            «ENDIF»
            "
        «ENDIF»
    '''
 
    def dispatch String styleClass (ShapeDefinition shape) {
        if (shape.style != null) shape.style.style.type.identifier else "default"
    }

    def dispatch String styleClass (Shape shape) {
        val sd = EcoreUtil2::getContainerOfType(shape,typeof(ShapeDefinition))
        sd.styleClass
    }

    // HEADER DEFINITIONS: CSS, SHAPE DEFS
    def defs (ShapeDefinition shape) '''
        <defs>
            «shape.css»
            «shape.anchorDef»
        </defs>
    '''
    
    def css (ShapeDefinition shape) '''
        <style type="text/css"> <![CDATA[
        rect {fill: none; stroke:black; stroke-width:1px}
        line {fill: none; stroke:black; stroke-width:1px}
        polyline {fill: none; stroke:black; stroke-width:1px}
        polygon {fill: none; stroke:black; stroke-width:1px}
        circle {fill: none; stroke:black; stroke-width:1px}
        ellipse {fill: none; stroke:black; stroke-width:1px}
        text {fill: black; font-family: verdana,sans-serif; font-size:12px;}
        .default {fill: none; stroke:black; stroke-width:1px}
        «IF shape.style!=null»
            .«shape.style.style.type.identifier» {}
        «ENDIF» 
        ]]>
        </style>
    '''
    
    def anchorDef (ShapeDefinition shape) '''
        <rect id="anchor" style="fill:#a0c0e8" width="5" height="5"/>
    '''
}