package org.eclipselabs.spray.shapes.generator.svg

import com.google.inject.Inject
import org.eclipse.xtext.EcoreUtil2
import org.eclipselabs.spray.shapes.shapes.AnchorManual
import org.eclipselabs.spray.shapes.shapes.AnchorPredefinied
import org.eclipselabs.spray.shapes.shapes.CDEllipse
import org.eclipselabs.spray.shapes.shapes.CDLine
import org.eclipselabs.spray.shapes.shapes.CDPolygon
import org.eclipselabs.spray.shapes.shapes.CDPolyline
import org.eclipselabs.spray.shapes.shapes.CDRectangle
import org.eclipselabs.spray.shapes.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.shapes.CDText
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.Ellipse
import org.eclipselabs.spray.shapes.shapes.Line
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition
import org.eclipselabs.spray.shapes.shapes.PolyLineLayout
import org.eclipselabs.spray.shapes.shapes.Polygon
import org.eclipselabs.spray.shapes.shapes.Polyline
import org.eclipselabs.spray.shapes.shapes.Rectangle
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.shapes.Shape
import org.eclipselabs.spray.shapes.shapes.ShapeConnection
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.shapes.Text

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
        <line x1="10" y1="50" x2="110" y2="50" «IF shape.layout!=null»«shape.lineStyle»«ENDIF»/>
        «FOR p: shape.placing»
            «p.generateShape(true)»
        «ENDFOR»
    '''
    
    // LINE
    
    def protected dispatch generateShape (Line shape, boolean child) '''
        <line x1="«shape.x1 + shape.parentX»" y1="«shape.y1 + shape.parentY»" x2="«shape.x2 + shape.parentX»" y2="«shape.y2 + shape.parentY»" «shape.lineStyle»/>
    '''
    def protected dispatch generateShape (CDLine shape, boolean child) '''
        <line x1="«shape.x1 + shape.parentX»" y1="«shape.y1 + shape.parentY»" x2="«shape.x2 + shape.parentX»" y2="«shape.y2 + shape.parentY»" «shape.lineStyle»/>
    '''

    // POLYLINE
    
    def protected dispatch generateShape (Polyline shape, boolean child) '''
        <polyline points="«shape.points(child)»" «shape.layout.styleAttribute» «shape.lineStyle»/>
    '''
    def protected dispatch generateShape (CDPolyline shape, boolean child) '''
        <polyline points="«shape.points(child)»" «shape.layout.styleAttribute» «shape.lineStyle»/>
    '''
    
    def protected points (Polyline pl, boolean child) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor + pl.parentX» «p.ycor + pl.parentY»«ENDFOR»
    '''
    def protected points (CDPolyline pl, boolean child) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor + pl.parentX» «p.ycor + pl.parentY»«ENDFOR»
    '''

    // POLYGON
    
    def protected dispatch generateShape (Polygon shape, boolean child) '''
        <polygon points="«shape.points(child)»" «shape.lineStyle»/>
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDPolygon shape, boolean child) '''
        <polygon points="«shape.points(child)»" «shape.lineStyle»/>
    '''

    def protected points (Polygon pl, boolean child) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor + pl.parentX» «p.ycor + pl.parentY»«ENDFOR»
    '''
    def protected points (CDPolygon pl, boolean child) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor + pl.parentX» «p.ycor + pl.parentY»«ENDFOR»
    '''

    // RECTANGLE

//    def protected dispatch generateShape (Compartment shape) '''
//        <rect «shape.positionAndSize»/>
//    '''
    def protected dispatch generateShape (Rectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child)»/>
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDRectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child)»/>
    '''

    // ROUNDEDRECTANGLE
    
    def protected dispatch generateShape (RoundedRectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child)» rx="«shape.rx»" ry="«shape.ry»"/>
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDRoundedRectangle shape, boolean child) '''
        <rect «shape.positionAndSize(child)» rx="«shape.rx»" ry="«shape.ry»"/>
    '''

    // ELLIPSE
    
    def protected dispatch generateShape (Ellipse shape, boolean child) '''
        «IF shape.isCircle»
            <circle cx="«shape.x(child) + shape.parentX»" cy="«shape.y(child) + shape.parentY»" r="«shape.rx»"/>
        «ELSE»
            <ellipse cx="«shape.x(child) + shape.parentX»" cy="«shape.y(child) + shape.parentY»" rx="«shape.rx»" ry="«shape.ry»"/>
        «ENDIF» 
        «FOR subshape: shape.shape»«subshape.generateShape(true)»«ENDFOR»
    '''
    def protected dispatch generateShape (CDEllipse shape, boolean child) '''
        «IF shape.isCircle»
            <circle cx="«shape.x(child) + shape.parentX»" cy="«shape.y(child) + shape.parentY»" r="«shape.rx»"/>
        «ELSE»
            <ellipse cx="«shape.x(child) + shape.parentX»" cy="«shape.y(child) + shape.parentY»" rx="«shape.rx»" ry="«shape.ry»"/>
        «ENDIF» 
    '''

    // TEXT
    
    def protected dispatch generateShape (Text shape, boolean child) '''
        <text x="«shape.x(child)»" y="«shape.y(child)»">«IF shape.body.value != null»#«shape.body.value»«ELSE»&lt;TEXT&gt;«ENDIF»</text>
    '''
    def protected dispatch generateShape (CDText shape, boolean child) '''
        <text x="«shape.x(child)»" y="«shape.y(child)»">«IF shape.body.value != null»#«shape.body.value»«ELSE»&lt;TEXT&gt;«ENDIF»</text>
    '''
    
    def protected positionAndSize (Shape shape, boolean child) '''x="«shape.x(child)»" y="«shape.y(child)»" width="«shape.width»" height="«shape.height»"'''
    def protected positionAndSize (ShapeConnection shape, boolean child) '''x="«shape.x(child)»" y="«shape.y(child)»" width="«shape.width»" height="«shape.height»"'''
    
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
        <svg x="«shape.x(child)»" y="«shape.y(child)»" width="«shape.width»" height="«shape.height»">
        «shape.shapeCon.generateShape(child)»
        </svg>
    '''
    
    
    def protected styleAttribute (PolyLineLayout l) { l.layout.styleAttribute }
    
    // STYLE
    def protected styleAttribute (ShapestyleLayout ssl) '''
        «IF(ssl != null && ssl.layout != null)»
            style="
            «IF(ssl.layout.background != null)»
«««                fill:«ssl.layout.background.color»;
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
 
    def protected dispatch String styleClass (ShapeDefinition shape) {
        if (shape.style != null) shape.style.style.type.identifier else "default"
    }

    def protected dispatch String styleClass (Shape shape) {
        val sd = EcoreUtil2::getContainerOfType(shape,typeof(ShapeDefinition))
        sd.styleClass
    }

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
        «IF shape.style!=null»
            .«shape.style.style.type.identifier» { } ««« TODO
        «ENDIF» 
        ]]>
        </style>
    '''
    
    def protected anchorDef (ShapeDefinition shape) '''
        <rect id="anchor" style="fill:#a0c0e8" width="5" height="5"/>
    '''
    
}