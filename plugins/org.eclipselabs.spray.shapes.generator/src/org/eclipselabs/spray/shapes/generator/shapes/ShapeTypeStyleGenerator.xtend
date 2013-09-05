/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.shapes.generator.shapes

import org.eclipselabs.spray.shapes.ShapestyleLayout
import org.eclipselabs.spray.styles.YesNoBool
import org.eclipselabs.spray.styles.LineStyle
import javax.inject.Inject
import org.eclipselabs.spray.styles.generator.StyleGenerator

class ShapeTypeStyleGenerator {
	
	@Inject extension StyleGenerator 
	
	def generateStyleForElement(String attName, ShapestyleLayout ssl) '''
	   «IF(ssl != null && ssl.layout != null)»
	   «IF(ssl.layout.background != null)»
	       «attName».setBackground(gaService.manageColor(diagram,«ssl.layout.background.createColorValue»));
	   «ENDIF»
	   «IF(ssl.layout.transparency != Double::MIN_VALUE)»
	       «attName».setTransparency(«ssl.layout.transparency»);
	   «ENDIF»
	   «createLineAttributes(attName, ssl)»
	   «createFontAttributes(attName, ssl)»
	   «ENDIF»
	'''
	
	def createFontAttributes(String attName, ShapestyleLayout l) '''
	   «IF (l.layout.fontName != null || l.layout.fontSize != Integer::MIN_VALUE || l.layout.fontItalic != YesNoBool::NULL || l.layout.fontBold != YesNoBool::NULL || l.layout.fontColor != null)»
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
	       «IF(l.layout.fontColor == null)»
	           «attName».setForeground(style.getForeground());
	       «ELSE»
	           «attName».setForeground(gaService.manageColor(diagram,«l.layout.fontColor.createColorValue»));
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
    
    def createLineAttributes(String attName, ShapestyleLayout ssl) '''
        «IF(ssl.layout.lineColor != null)»
            «attName».setForeground(gaService.manageColor(diagram,«ssl.layout.lineColor.createColorValue»));
        «ENDIF»
        «IF(ssl.layout.lineStyle != null && ssl.layout.lineStyle != LineStyle::NULL)»
            «attName».setLineStyle(LineStyle.«ssl.layout.lineStyle.name»);
        «ENDIF»
        «IF(ssl.layout.lineWidth != Integer::MIN_VALUE)»
            «attName».setLineWidth(«ssl.layout.lineWidth»);
        «ENDIF»    	
   	'''
}