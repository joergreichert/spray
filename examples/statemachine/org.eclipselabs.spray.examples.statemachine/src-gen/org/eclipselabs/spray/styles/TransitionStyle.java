/**
 * This is a generated Style class for Spray.
 */
package org.eclipselabs.spray.styles;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;
import org.eclipselabs.spray.styles.DefaultSprayStyle;

/**
 * This is a generated Style class for Spray.
 * Description: styles a state transition line
 */
@SuppressWarnings("all")
public class TransitionStyle extends DefaultSprayStyle {
    
    /**
	 * This method creates a Style and returns the defined style.
	 * Description: styles a state transition line
	 */
    @Override
	public Style newStyle(Diagram diagram) {
		IGaService gaService = Graphiti.getGaService();
		
		// Creating Style with given id and description
		Style style = super.newStyle(diagram);
		style.setId("TransitionStyle");
		style.setDescription("styles a state transition line");
		
		// transparency value
		
		// background attributes
		
		// line attributes
		style.setLineVisible(true);
		style.setForeground(gaService.manageColor(diagram, IColorConstant.BLACK));
		style.setLineWidth(3);
		style.setLineStyle(LineStyle.SOLID);
		
		// font attributes
		String fontName = style.getFont().getName();
		int fontSize = style.getFont().getSize();
		boolean fontItalic = style.getFont().isItalic();
		boolean fontBold = style.getFont().isBold();
		style.setFont(gaService.manageFont(diagram, fontName, fontSize, fontItalic, fontBold));
		return style;
	}
	
    /**
	 * This method returns the font color for the style. 
	 * The font color will be returned separated, because Graphiti allows just the foreground color.
	 * The foreground color will be used for lines and fonts at the same time.
	 */
	@Override
	public Color getFontColor(Diagram diagram) {
		return super.getFontColor(diagram);
	}
	
}	
