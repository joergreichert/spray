package org.eclipselabs.spray.shapes.generator.svg

import com.google.inject.Inject
import org.eclipse.xtext.EcoreUtil2
import org.eclipselabs.spray.shapes.shapes.AnchorManual
import org.eclipselabs.spray.shapes.shapes.AnchorPredefinied
import org.eclipselabs.spray.shapes.shapes.Ellipse
import org.eclipselabs.spray.shapes.shapes.Line
import org.eclipselabs.spray.shapes.shapes.PolyLineLayout
import org.eclipselabs.spray.shapes.shapes.Polygon
import org.eclipselabs.spray.shapes.shapes.Polyline
import org.eclipselabs.spray.shapes.shapes.Rectangle
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle
import org.eclipselabs.spray.shapes.shapes.Shape
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.shapes.shapes.Text
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition
import org.eclipselabs.spray.shapes.shapes.CDLine
import org.eclipselabs.spray.shapes.shapes.CDPolyline
import org.eclipselabs.spray.shapes.shapes.CDPolygon
import org.eclipselabs.spray.shapes.shapes.CDRectangle
import org.eclipselabs.spray.shapes.shapes.CDRoundedRectangle
import org.eclipselabs.spray.shapes.shapes.CDEllipse
import org.eclipselabs.spray.shapes.shapes.CDText
import org.eclipselabs.spray.shapes.shapes.ShapeConnection
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipselabs.spray.shapes.generator.GeneratorSVGDefinition

/**
 * Generator for SVG representations of ShapeDefinitions.
 */
class SVGShapeGenerator implements IGenerator {
    @Inject extension LayoutExtensions
    @Inject GeneratorSVGDefinition svgDefinition 
    
    override void doGenerate(Resource resource, IFileSystemAccess fsa) {
   		for(connection : resource.allContents.toIterable.filter(typeof(ConnectionDefinition))) {
            fsa.generateFile(svgDefinition.filepath(connection), svgDefinition.compile(connection))
   		}
    }

    // ENTRY METHODS
    def dispatch generate (ShapeDefinition shape) '''
        «shape.defs»
        «FOR s: shape.shape»
            «s.generateShape»
        «ENDFOR»
        «IF shape.anchor!=null»
            «shape.anchor.type.generateAnchor»
        «ENDIF»
    '''
    
    def dispatch generate (ConnectionDefinition shape) '''
        «shape.defs»
        <line x1="10" y1="50" x2="110" y2="50" «IF shape.layout!=null»«shape.lineStyle»«ENDIF»/>
        «FOR p: shape.placing»
            «p.generateShape»
        «ENDFOR»
    '''
    
    // LINE
    
    def protected dispatch generateShape (Line shape) '''
        <line x1="«shape.x1»" y1="«shape.y1»" x2="«shape.x2»" y2="«shape.y2»" «shape.lineStyle»/>
    '''
    def protected dispatch generateShape (CDLine shape) '''
        <line x1="«shape.x1»" y1="«shape.y1»" x2="«shape.x2»" y2="«shape.y2»" «shape.lineStyle»/>
    '''

    // POLYLINE
    
    def protected dispatch generateShape (Polyline shape) '''
        <polyline points="«shape.points»" «shape.layout.styleAttribute» «shape.lineStyle»/>
    '''
    def protected dispatch generateShape (CDPolyline shape) '''
        <polyline points="«shape.points»" «shape.layout.styleAttribute» «shape.lineStyle»/>
    '''
    
    def protected points (Polyline pl) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor» «p.ycor»«ENDFOR»
    '''
    def protected points (CDPolyline pl) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor» «p.ycor»«ENDFOR»
    '''

    // POLYGON
    
    def protected dispatch generateShape (Polygon shape) '''
        <polygon points="«shape.points»" «shape.lineStyle»/>
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''
    def protected dispatch generateShape (CDPolygon shape) '''
        <polygon points="«shape.points»" «shape.lineStyle»/>
    '''

    def protected points (Polygon pl) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor» «p.ycor»«ENDFOR»
    '''
    def protected points (CDPolygon pl) '''
        «FOR p: pl.layout.point SEPARATOR ","»«p.xcor» «p.ycor»«ENDFOR»
    '''

    // RECTANGLE

    def protected dispatch generateShape (Rectangle shape) '''
        <rect «shape.positionAndSize»/>
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''
    def protected dispatch generateShape (CDRectangle shape) '''
        <rect «shape.positionAndSize»/>
    '''

    // ROUNDEDRECTANGLE
    
    def protected dispatch generateShape (RoundedRectangle shape) '''
        <rect «shape.positionAndSize» rx="«shape.rx»" ry="«shape.ry»"/>
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''
    def protected dispatch generateShape (CDRoundedRectangle shape) '''
        <rect «shape.positionAndSize» rx="«shape.rx»" ry="«shape.ry»"/>
    '''

    // ELLIPSE
    
    def protected dispatch generateShape (Ellipse shape) '''
        «IF shape.isCircle»
            <circle cx="«shape.x»" cy="«shape.y»" r="«shape.rx»"/>
        «ELSE»
            <ellipse cx="«shape.x»" cy="«shape.y»" rx="«shape.rx»" ry="«shape.ry»"/>
        «ENDIF» 
        «FOR subshape: shape.shape»«subshape.generateShape»«ENDFOR»
    '''
    def protected dispatch generateShape (CDEllipse shape) '''
        «IF shape.isCircle»
            <circle cx="«shape.x»" cy="«shape.y»" r="«shape.rx»"/>
        «ELSE»
            <ellipse cx="«shape.x»" cy="«shape.y»" rx="«shape.rx»" ry="«shape.ry»"/>
        «ENDIF» 
    '''

    // TEXT
    
    def protected dispatch generateShape (Text shape) '''
        <text x="«shape.x»" y="«shape.y»">«IF shape.body.value != null»#«shape.body.value»«ELSE»&lt;TEXT&gt;«ENDIF»</text>
    '''
    def protected dispatch generateShape (CDText shape) '''
        <text x="«shape.x»" y="«shape.y»">«IF shape.body.value != null»#«shape.body.value»«ELSE»&lt;TEXT&gt;«ENDIF»</text>
    '''
    
    def protected positionAndSize (Shape shape) '''x="«shape.x»" y="«shape.y»" width="«shape.width»" height="«shape.height»"'''
    def protected positionAndSize (ShapeConnection shape) '''x="«shape.x»" y="«shape.y»" width="«shape.width»" height="«shape.height»"'''
    
    // ANCHOR
    def protected dispatch generateAnchor (AnchorManual anchor) '''
        «FOR ap: anchor.position»
        <use x="«ap.pos.x»" y="«ap.pos.y»" xlink:href="#anchor"/>
        «ENDFOR»
    '''
    def protected dispatch generateAnchor (AnchorPredefinied anchor) '''
«««        TODO 
    '''
    
    // PLACING
    
    def protected dispatch generateShape (PlacingDefinition shape) '''
        <svg x="«shape.x»" y="«shape.y»" width="«shape.width»" height="«shape.height»">
        «shape.shapeCon.generateShape»
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