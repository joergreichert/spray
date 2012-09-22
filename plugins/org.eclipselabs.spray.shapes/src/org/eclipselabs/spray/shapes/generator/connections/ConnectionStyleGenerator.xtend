package org.eclipselabs.spray.shapes.generator.connections

import com.google.inject.Inject
import org.eclipse.graphiti.mm.algorithms.styles.Style
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.styles.styles.LineStyle
import org.eclipselabs.spray.styles.styles.YesNoBool

class ConnectionStyleGenerator {
	@Inject extension TypeReferences typeReferences
	@Inject extension StyleGenerator styleGenerator
	
	private ShapestyleLayout current = null 
	
	def setCurrent(ShapestyleLayout aLayout) {
		this.current = aLayout
	}
	
	def styleType() {  findDeclaredType(typeof(Style), current)  }
	
	def ITreeAppendable generateStyleForConnection(ITreeAppendable givenAppendable, String attName, ShapestyleLayout csl) {
		var appendable = givenAppendable
		if(csl != null && csl.layout != null) {
			if(csl.layout.background != null) {
				appendable = appendable.append('''«attName».setBackground(gaService.manageColor(diagram,''') 
				if(csl.layout?.background != null) {
					styleGenerator.current = csl.layout.background  
					appendable = appendable.createColorValue(csl.layout.background)
				}
				appendable = appendable.append('''));''').newLine
			}
			if(csl.layout.transparency != Double::MIN_VALUE) {
				appendable = appendable.append('''«attName».setTransparency(«csl.layout.transparency»);''').newLine		
			}
			appendable = appendable.createLineAttributes(attName, csl).newLine
			appendable = appendable.createFontAttributes(attName, csl).newLine
		}
		appendable
	}
	
	def ITreeAppendable createFontAttributes(ITreeAppendable givenAppendable, String attName, ShapestyleLayout l) {
	var appendable = givenAppendable
		if (!(l.layout.fontName == null && l.layout.fontSize == Integer::MIN_VALUE && l.layout.fontItalic == YesNoBool::NULL && l.layout.fontItalic == YesNoBool::NULL)) {
			appendable = appendable.append('''{''').newLine
			appendable = appendable.increaseIndentation.newLine
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
				appendable = appendable.decreaseIndentation
			appendable = appendable.append('''}''')
		}
        appendable
    }
    
    def ITreeAppendable createLineAttributes(ITreeAppendable givenAppendable, String attName, ShapestyleLayout csl){
		var appendable = givenAppendable
    	if(csl.layout.lineColor != null) {
			appendable = appendable.append('''«attName».setForeground(gaService.manageColor(diagram,''') 
			styleGenerator.current = csl.layout.lineColor  
			appendable = appendable.createColorValue(csl.layout.lineColor) appendable = appendable.append('''));''')    	
    	}
    	if(csl.layout.lineStyle != null && csl.layout.lineStyle != LineStyle::NULL) {
  			appendable = appendable.append('''«attName».setLineStyle(LineStyle.«csl.layout.lineStyle.name»);''')	
    	}
    	if(csl.layout.lineWidth != Integer::MIN_VALUE) {
    		appendable = appendable.append('''«attName».setLineWidth(«csl.layout.lineWidth»);''')
    	}    	
		appendable
    }
}