package org.eclipselabs.spray.shapes.generator.shapes

import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.styles.styles.LineStyle
import org.eclipselabs.spray.styles.styles.YesNoBool

class ShapeTypeStyleGenerator {
	
	@Inject extension StyleGenerator 
	@Inject extension TypeReferences typeReferences
	
	private ShapestyleLayout current = null
	
	def setCurrent(ShapestyleLayout aLayout) {
		this.current = aLayout
	}	
	
	def private styleType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.styles.Style), current)  }
	
	def generateStyleForElement(ITreeAppendable givenAppendable, String attName, ShapestyleLayout ssl) {
		var appendable = givenAppendable
		if(ssl != null && ssl.layout != null) {
			if(ssl.layout.background != null) {
				appendable = appendable.append('''«attName».setBackground(gaService.manageColor(diagram,''').newLine 
				appendable = appendable.createColorValue(ssl.layout.background) appendable = appendable.append('''));''').newLine
			}
			if(ssl.layout.transparency != Double::MIN_VALUE) {
				appendable = appendable.append('''«attName».setTransparency(«ssl.layout.transparency»);''').newLine
			}
			appendable = appendable.createLineAttributes(attName, ssl).newLine
			appendable = appendable.createFontAttributes(attName, ssl).newLine
		}
		appendable
	}
	
	def private ITreeAppendable createFontAttributes(ITreeAppendable givenAppendable, String attName, ShapestyleLayout l) {
        var appendable = givenAppendable
		if (l.layout.fontName != null || l.layout.fontSize != Integer::MIN_VALUE || l.layout.fontItalic != YesNoBool::NULL || 
			l.layout.fontBold != YesNoBool::NULL) {
			appendable = appendable.append(styleType).append(''' style = «attName».getStyle();''').newLine
			if (l.layout.fontName == null) {
				appendable = appendable.append('''String fontName = style.getFont().getName();''').newLine
			} else {
				appendable = appendable.append('''String fontName = "«l.layout.fontName»";''').newLine
			}
			if (l.layout.fontSize == Integer::MIN_VALUE) {
				appendable = appendable.append('''int fontSize = style.getFont().getSize();''').newLine
			} else {
				appendable = appendable.append('''int fontSize = «l.layout.fontSize»;''').newLine
			}
			if (l.layout.fontItalic == YesNoBool::NULL) {
				appendable = appendable.append('''boolean fontItalic = style.getFont().isItalic();''').newLine
			} else {
				appendable = appendable.append('''boolean fontItalic = «l.layout.fontItalic.transformYesNoToBoolean»;''').newLine
			}
			if (l.layout.fontBold == YesNoBool::NULL) {
				appendable = appendable.append('''boolean fontBold = style.getFont().isBold();''').newLine
			} else {
				appendable = appendable.append('''boolean fontBold = «l.layout.fontBold.transformYesNoToBoolean»;''').newLine
			}
			appendable = appendable.append('''style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));''').newLine
		}
		appendable
    }
    
    def private ITreeAppendable createLineAttributes(ITreeAppendable givenAppendable, String attName, ShapestyleLayout ssl){
    	var appendable = givenAppendable
    	if(ssl.layout.lineColor != null) {
			appendable = appendable.append('''«attName».setForeground(gaService.manageColor(diagram,''') 
			appendable = appendable.createColorValue(ssl.layout.lineColor) appendable.append('''));''').newLine
    	}
    	if(ssl.layout.lineStyle != null && ssl.layout.lineStyle != LineStyle::NULL) {
  			appendable = appendable.append('''«attName».setLineStyle(LineStyle.«ssl.layout.lineStyle.name»);''').newLine	
    	}
    	if(ssl.layout.lineWidth != Integer::MIN_VALUE) {
    		appendable = appendable.append('''«attName».setLineWidth(«ssl.layout.lineWidth»);''').newLine
    	}
    	appendable    	
    }
}