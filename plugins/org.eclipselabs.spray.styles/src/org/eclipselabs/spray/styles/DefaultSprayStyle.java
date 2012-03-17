package org.eclipselabs.spray.styles;

import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * This is the default Style definition for Spray
 */
public class DefaultSprayStyle implements ISprayStyle {

	/**
	 * Singleton attribute for Style
	 */
	private Style style;

	/**
	 * Creates a new instance of the Style and resets the style to the old
	 * singleton again.
	 */
	@Override
	public Style getStyle(Diagram diagram) {
		if(style == null) {
			style = newStyle(diagram);
		}
		return style;
	}

	/**
	 * This is the default Style definition for Spray
	 */
	@Override
	public Style newStyle(Diagram diagram) {
		IGaService gaService = Graphiti.getGaService();

		// Creating Style with given id and description
		Style style = gaService.createStyle(diagram, "DefaultSprayStyle");
		style.setDescription("This is the default Style definition for Spray");

		// Setting the transparency value - default is 1.0
		style.setTransparency(1.0);

		// Setting the background color
		style.setFilled(true);
		style.setBackground(gaService.manageColor(diagram,
				IColorConstant.WHITE));

		// Setting the line attributes (line color is called foreground
		// color)
		style.setLineVisible(true);
		style.setForeground(gaService.manageColor(diagram,
				IColorConstant.BLACK));
		style.setLineWidth(1);
		style.setLineStyle(LineStyle.SOLID);

		// Managing the font (default values are Arial, size 8, no italic,
		// no
		// bold)
		String fontName = "Arial";
		int fontSize = 8;
		style.setFont(gaService.manageFont(diagram, fontName, fontSize,
				false, false));
		return style;
	}

	/**
	 * This is the default Style definition for Spray
	 */
	@Override
	public Color getFontColor(Diagram diagram) {
		IGaService gaService = Graphiti.getGaService();
		return gaService.manageColor(diagram, IColorConstant.BLACK);
	}

}
