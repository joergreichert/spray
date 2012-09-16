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
	
	def ITreeAppendable generateStyleForConnection(ITreeAppendable appendable, String attName, ShapestyleLayout csl) {
		var appendable1 = appendable
		if(csl != null && csl.layout != null) {
			if(csl.layout.background != null) {
				appendable1 = appendable1.append('''«attName».setBackground(gaService.manageColor(diagram,''') styleGenerator.current = csl.layout.background  appendable1 = appendable1.createColorValue(csl.layout.background)  appendable1 = appendable1.append('''));''')
			}
			if(csl.layout.transparency != Double::MIN_VALUE) {
				appendable1 = appendable1.append('''«attName».setTransparency(«csl.layout.transparency»);''')		
			}
			appendable1 = appendable1.createLineAttributes(attName, csl)
			appendable1 = appendable1.createFontAttributes(attName, csl)
		}
		appendable1
	}
	
	def ITreeAppendable createFontAttributes(ITreeAppendable appendable, String attName, ShapestyleLayout l) {
	var appendable1 = appendable
		if (!(l.layout.fontName == null && l.layout.fontSize == Integer::MIN_VALUE && l.layout.fontItalic == YesNoBool::NULL && l.layout.fontItalic == YesNoBool::NULL)) {
		appendable1 = appendable1.append('''
		{
			''').append(styleType).append(''' style = «attName».getStyle();
			«IF l.layout.fontName == null»
			String fontName = style.getFont().getName();
			«ELSE»
			String fontName = "«l.layout.fontName»";
			«ENDIF»
			«IF l.layout.fontSize == Integer::MIN_VALUE»
			int fontSize = style.getFont().getSize();
			«ELSE»
			int fontSize = «l.layout.fontSize»;
			«ENDIF»
			«IF l.layout.fontItalic == YesNoBool::NULL»
			boolean fontItalic = style.getFont().isItalic();
			«ELSE»
			boolean fontItalic = «l.layout.fontItalic.transformYesNoToBoolean»;
			«ENDIF»
			«IF l.layout.fontBold == YesNoBool::NULL»
			boolean fontBold = style.getFont().isBold();
			«ELSE»
			boolean fontBold = «l.layout.fontBold.transformYesNoToBoolean»;
			«ENDIF»
			style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
		}''')
		}
        appendable1
    }
    
    def ITreeAppendable createLineAttributes(ITreeAppendable appendable, String attName, ShapestyleLayout csl){
		var appendable1 = appendable
    	if(csl.layout.lineColor != null) {
		appendable1 = appendable1.append('''«attName».setForeground(gaService.manageColor(diagram,''') styleGenerator.current = csl.layout.lineColor  appendable1 = appendable1.createColorValue(csl.layout.lineColor) appendable1 = appendable1.append('''));''')    	
    	}
    	if(csl.layout.lineStyle != null && csl.layout.lineStyle != LineStyle::NULL) {
  		appendable1 = appendable1.append('''«attName».setLineStyle(LineStyle.«csl.layout.lineStyle.name»);''')	
    	}
    	if(csl.layout.lineWidth != Integer::MIN_VALUE) {
    	appendable1 = appendable1.append('''«attName».setLineWidth(«csl.layout.lineWidth»);''')
    	}    	
		appendable1
    }
}