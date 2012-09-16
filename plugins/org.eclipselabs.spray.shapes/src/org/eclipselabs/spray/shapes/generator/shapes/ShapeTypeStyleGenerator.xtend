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
	
	def styleType() {  findDeclaredType(typeof(org.eclipse.graphiti.mm.algorithms.styles.Style), current)  }
	
	def generateStyleForElement(ITreeAppendable appendable, String attName, ShapestyleLayout ssl) {
	var appendable1 = appendable.append('''
	''')
	if(ssl != null && ssl.layout != null) {
		if(ssl.layout.background != null) {
		appendable1 = appendable1.append('''«attName».setBackground(gaService.manageColor(diagram,''') appendable1 = appendable1.createColorValue(ssl.layout.background) appendable1 = appendable.append('''));''')
		}
		if(ssl.layout.transparency != Double::MIN_VALUE) {
		appendable1 = appendable1.append('''«attName».setTransparency(«ssl.layout.transparency»);''')		
		}
		appendable1 = appendable1.createLineAttributes(attName, ssl)
		appendable1 = appendable1.createFontAttributes(attName, ssl)
	}
	appendable1
	}
	
	def ITreeAppendable createFontAttributes(ITreeAppendable appendable, String attName, ShapestyleLayout l) {
        var appendable1 = appendable.append('''
		''')
		if (l.layout.fontName != null || l.layout.fontSize != Integer::MIN_VALUE || l.layout.fontItalic != YesNoBool::NULL || l.layout.fontBold != YesNoBool::NULL) {
		appendable1 = appendable1.append('''{
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
    
    def ITreeAppendable createLineAttributes(ITreeAppendable appendable, String attName, ShapestyleLayout ssl){
    	var appendable1 = appendable.append('''
    	''')
    	if(ssl.layout.lineColor != null) {
			appendable1 = appendable1.append('''«attName».setForeground(gaService.manageColor(diagram,''') appendable1 = appendable1.createColorValue(ssl.layout.lineColor) appendable1.append('''));''')    	
    	}
    	if(ssl.layout.lineStyle != null && ssl.layout.lineStyle != LineStyle::NULL) {
  			appendable1 = appendable1.append('''«attName».setLineStyle(LineStyle.«ssl.layout.lineStyle.name»);''')	
    	}
    	if(ssl.layout.lineWidth != Integer::MIN_VALUE) {
    		appendable1 = appendable1.append('''«attName».setLineWidth(«ssl.layout.lineWidth»);''')
    	}
    	appendable1    	
    }
}