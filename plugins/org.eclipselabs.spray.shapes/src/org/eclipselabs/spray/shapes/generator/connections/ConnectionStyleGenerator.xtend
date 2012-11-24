package org.eclipselabs.spray.shapes.generator.connections

import org.eclipselabs.spray.styles.YesNoBool
import org.eclipselabs.spray.styles.LineStyle
import com.google.inject.Inject
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.shapes.ShapestyleLayout

class ConnectionStyleGenerator {
	
	@Inject extension StyleGenerator 
	
	def generateStyleForConnection(String attName, ShapestyleLayout csl) {
		'''
		«IF(csl != null && csl.layout != null)»
			«IF(csl.layout.background != null)»
			«attName».setBackground(gaService.manageColor(diagram,«csl.layout.background.createColorValue»));
			«ENDIF»
			«IF(csl.layout.transparency != Double::MIN_VALUE)»
			«attName».setTransparency(«csl.layout.transparency»);		
			«ENDIF»
			«createLineAttributes(attName, csl)»
			«createFontAttributes(attName, csl)»
		«ENDIF»
		'''
	}
	
	def createFontAttributes(String attName, ShapestyleLayout l) {
		'''
		«IF !(l.layout.fontName == null && l.layout.fontSize == Integer::MIN_VALUE && l.layout.fontItalic == YesNoBool::NULL && l.layout.fontItalic == YesNoBool::NULL)»
		{
			Style style = «attName».getStyle();
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
		}
		«ENDIF»
        '''
    }
    
    def createLineAttributes(String attName, ShapestyleLayout csl){
     	'''
    	«IF(csl.layout.lineColor != null)»
		«attName».setForeground(gaService.manageColor(diagram,«csl.layout.lineColor.createColorValue»));    	
    	«ENDIF»
    	«IF(csl.layout.lineStyle != null && csl.layout.lineStyle != LineStyle::NULL)»
  		«attName».setLineStyle(LineStyle.«csl.layout.lineStyle.name»);	
    	«ENDIF»
    	«IF(csl.layout.lineWidth != Integer::MIN_VALUE)»
    	«attName».setLineWidth(«csl.layout.lineWidth»);
    	«ENDIF»    	
    	'''
    }
}