package org.eclipselabs.spray.shapes.generator.connections

import org.eclipselabs.spray.styles.styles.YesNoBool
import org.eclipselabs.spray.styles.styles.LineStyle
import com.google.inject.Inject
import org.eclipselabs.spray.styles.generator.StyleGenerator
import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout

class ConnectionStyleGenerator {
	
	@Inject StyleGenerator stylegen 
	
	def generateStyleForConnection(String attName, ShapestyleLayout csl) {
	
	'''
	«IF(csl != null && csl.layout != null)»
		«IF(csl.layout.background != null)»
			«attName».setBackground(gaService.manageColor(diagram,«stylegen.createColorValue(csl.layout.background)»));
		«ENDIF»
		
		«IF(csl.layout.transparency == Double::MIN_VALUE)»
			«attName».setTransparency(«csl.layout.transparency»);		
		«ENDIF»
				
		«createLineAttributes(attName, csl)»
«««		«createFontAttributes(attName, csl)»
	«ENDIF»
	'''
	}
	
	def createFontAttributes(String attName, ShapestyleLayout l) {
		
		/*
		if(style.fontColor != null) {
			sb.append('''
«««		
			''')
		}

		*/
		
        '''
		// font attributes
		{
		Style style = «attName».getStyle();
        «IF l == null || l.layout.fontName == null»
		String fontName = style.getFont().getName();
        «ELSE»
		String fontName = "«l.layout.fontName»";
        «ENDIF»
        
        «IF l == null || l.layout.fontSize == Integer::MIN_VALUE»
		int fontSize = style.getFont().getSize();
        «ELSE»
		int fontSize = «l.layout.fontSize»;
 	    «ENDIF»
 	    
 	    «IF l == null || l.layout.fontItalic == YesNoBool::NULL»
		boolean fontItalic = style.getFont().isItalic();
 	    «ELSE»
		boolean fontItalic = «stylegen.transformYesNoToBoolean(l.layout.fontItalic)»;
 	    «ENDIF»
 	    
		«IF l == null || l.layout.fontBold == YesNoBool::NULL»
		boolean fontBold = style.getFont().isBold();
		«ELSE»
		boolean fontBold = «stylegen.transformYesNoToBoolean(l.layout.fontBold)»;
		«ENDIF»
		style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
		}
        '''    
    }
    
    def createLineAttributes(String attName, ShapestyleLayout csl){
    	'''
    	«IF(csl.layout.lineColor != null)»
			«attName».setForeground(gaService.manageColor(diagram,«stylegen.createColorValue(csl.layout.lineColor)»));    	
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