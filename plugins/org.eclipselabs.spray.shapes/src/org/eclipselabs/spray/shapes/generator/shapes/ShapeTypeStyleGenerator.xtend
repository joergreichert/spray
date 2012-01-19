package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.shapes.ShapestyleLayout
import org.eclipselabs.spray.styles.styles.YesNoBool
import org.eclipselabs.spray.styles.styles.LineStyle
import com.google.inject.Inject
import org.eclipselabs.spray.styles.generator.StyleGenerator

class ShapeTypeStyleGenerator {
	
	@Inject StyleGenerator stylegen 
	
	def generateStyleForElement(String attName, ShapestyleLayout ssl) {
	
	'''
	«IF(ssl != null && ssl.layout != null)»
		«IF(ssl.layout.background != null)»
		«attName».setBackground(gaService.manageColor(diagram,«stylegen.createColorValue(ssl.layout.background)»));
		«ENDIF»
		
		«IF(ssl.layout.transparency == Double::MIN_VALUE)»
		«attName».setTransparency(«ssl.layout.transparency»);		
		«ENDIF»
				
		«createLineAttributes(attName, ssl)»
		«createFontAttributes(attName, ssl)»
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
    
    def createLineAttributes(String attName, ShapestyleLayout ssl){
    	'''
    	
    	«IF(ssl.layout.lineColor != null)»
			«attName».setForeground(gaService.manageColor(diagram,«stylegen.createColorValue(ssl.layout.lineColor)»));    	
    	«ENDIF»
    	
    	«IF(ssl.layout.lineStyle != null && ssl.layout.lineStyle != LineStyle::NULL)»
  			«attName».setLineStyle(LineStyle.«ssl.layout.lineStyle.name»);	
    	«ENDIF»
    	
    	«IF(ssl.layout.lineWidth != Integer::MIN_VALUE)»
    		«attName».setLineWidth(«ssl.layout.lineWidth»);
    	«ENDIF»    	
    	
    	'''
    }
}