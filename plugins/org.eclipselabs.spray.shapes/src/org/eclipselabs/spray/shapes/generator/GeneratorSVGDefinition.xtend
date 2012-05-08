package org.eclipselabs.spray.shapes.generator

import com.google.inject.Inject
import org.eclipselabs.spray.shapes.generator.svg.SVGShapeGenerator
import org.eclipselabs.spray.shapes.shapes.ShapeContainerElement

class GeneratorSVGDefinition {
    @Inject SVGShapeGenerator shapeGenerator
    
    def packagePath() { "org/eclipselabs/spray/shapes/" }
	def filepath(ShapeContainerElement s) { packagePath + s.name.toFirstUpper + ".svg" }
	def compile(ShapeContainerElement s) '''
     «s.head»
     «s.body»
     «s.tail»
     '''
    
    def head (ShapeContainerElement s) '''
    <?xml version="1.0" standalone="no" ?>
    <!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 20010904//EN"
        "http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd">
    <svg width="200" height="200" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
        <title>Shape: «s.name»</title>
        «s.metadata»
    '''

    def tail (ShapeContainerElement s) '''
    </svg>
    '''

    def body (ShapeContainerElement s) '''
        «shapeGenerator.generate(s)»
    '''
    
    def metadata (ShapeContainerElement s) '''
        <metadata>
            <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
                xmlns:dc="http://purl.org/dc/elements/1.1/">
                <rdf:Description rdf:about="http://code.google.com/a/eclipselabs.org/p/spray/">
                    <dc:creator>«getClass().name»</dc:creator>
                    <dc:subject>Spray SVG Shape</dc:subject>
                    <dc:source>http://code.google.com/a/eclipselabs.org/p/spray/</dc:source>
                    <dc:format>image/svg+xml</dc:format>
                    <dc:type>Image</dc:type>
                </rdf:Description>
            </rdf:RDF>
        </metadata>
    '''
}