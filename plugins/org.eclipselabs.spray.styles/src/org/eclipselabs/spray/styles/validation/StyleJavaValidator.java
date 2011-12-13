package org.eclipselabs.spray.styles.validation;

import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.styles.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.styles.LineStyle;
import org.eclipselabs.spray.styles.styles.RGBColor;
import org.eclipselabs.spray.styles.styles.Style;
import org.eclipselabs.spray.styles.styles.StyleLayout;
import org.eclipselabs.spray.styles.styles.StylesPackage;

public class StyleJavaValidator extends AbstractStyleJavaValidator {

	/**
	 * Checks the Transparency, Font and the Line attributes for the Style
	 * Layout
	 * 
	 * @param layout
	 *            the Style Layout
	 */
	@Check
	public void checkStyleLayout(StyleLayout layout) {
		checkTransparency((layout.getTransparency() != Double.MIN_VALUE) ? layout.getTransparency() : 1.0);
		checkFontName(layout.getFontName());
		checkLineAttributes(layout.getLineColor(), layout.getLineWidth(), layout.getLineStyle());
	}

	/**
	 * Checks the Color integer values in the RGB Color (should be between 0 and
	 * 255)
	 * 
	 * @param color
	 *            the RGB Color
	 */
	@Check
	public void checkRGBColorRange(RGBColor color) {
		if (!checkBetween0and255(color.getBlue())) {
			error("The blue color should be defined between 0 and 255.", StylesPackage.Literals.RGB_COLOR__BLUE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(color.getBlue()));
		}
		if (!checkBetween0and255(color.getGreen())) {
			error("The green color should be defined between 0 and 255.", StylesPackage.Literals.RGB_COLOR__GREEN, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(color.getGreen()));
		}
		if (!checkBetween0and255(color.getRed())) {
			error("The red color should be defined between 0 and 255.", StylesPackage.Literals.RGB_COLOR__RED, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(color.getRed()));
		}
	}

	/**
	 * Checks that the length of the short description is more then 20
	 * characters.
	 * 
	 * @param style
	 *            the correspondent style
	 */
	@Check
	public void checkShortDescription(Style style) {
		String description = style.getDescription();
		if (description.length() < 20) {
			warning("The description should have more than 20 characters.", StylesPackage.Literals.STYLE__DESCRIPTION, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					style.getDescription());
		}
	}

	/**
	 * Checks the Transparency Double value (between 0.0 and 1.0)
	 * 
	 * @param transparency
	 */
	private void checkTransparency(Double transparency) {
		if (!checkBetween0and1(transparency)) {
			error("The tranparency should be between 0.0 and 1.0.", StylesPackage.Literals.STYLE_LAYOUT__TRANSPARENCY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(transparency));
		}
	}

	/**
	 * Checks the Font Name if it is installed on the system
	 * 
	 * @param fontName
	 *            the font name
	 */
	public void checkFontName(String fontName) {
		GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		List<String> fonts = Arrays.asList(gEnv.getAvailableFontFamilyNames());
		if (fontName != null) {
			if (!fonts.contains(fontName) && !fontName.equals("")) {
				warning("The selected font is not installed on the system (default 'Arial' will be taken).", StylesPackage.Literals.STYLE_LAYOUT__FONT_NAME,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(fontName));
			}
		}
	}

	/**
	 * Checks a integer that is between 0 and 255
	 * 
	 * @param value
	 *            the integer
	 * @return true if the value is between 0 and 255, false otherwise
	 */
	private boolean checkBetween0and255(int value) {
		if (0 <= value && value < 256) {
			return true;
		}
		return false;
	}

	/**
	 * Checks a double between 0.0 and 1.0
	 * 
	 * @param value
	 *            the double value
	 * @return true if it is between 0.0 and 1.0, else otherwise
	 */
	private boolean checkBetween0and1(double value) {
		if (0.0 <= value && value < 1.01) {
			return true;
		}
		return false;
	}

	/**
	 * Checks the line attributes for deprecated values.
	 * 
	 * @param lineColor
	 *            the line color
	 * @param lineWidth
	 *            the line width
	 * @param lineStyle
	 *            the line style
	 */
	public void checkLineAttributes(ColorWithTransparency lineColor, Integer lineWidth, LineStyle lineStyle) {
		if (lineColor.toString() == "transparent") {
			if (lineWidth != 0) {
				warning("If the line-color is transparent, the line-width is deprecated.", StylesPackage.Literals.STYLE_LAYOUT__LINE_WIDTH,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(lineWidth));
			}
			if (lineStyle != null) {
				warning("If the line-color is transparent, the line-style is deprecated.", StylesPackage.Literals.STYLE_LAYOUT__LINE_STYLE,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, lineStyle.toString());
			}
		} else {
			if (lineWidth == 0 && lineStyle != null) {
				warning("If the line-width is 0, the line is invisible (line-style is deprecated).", StylesPackage.Literals.STYLE_LAYOUT__LINE_STYLE,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX, lineStyle.toString());
			}
		}
	}

}
