package org.eclipselabs.spray.validation;

import java.awt.GraphicsEnvironment;
import java.util.Arrays;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.styles.Font;
import org.eclipselabs.spray.styles.Line;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesPackage;

import java.util.List;

public class StylesJavaValidator extends AbstractStylesJavaValidator {

	/*
	 * checks the value of a colorrange
	 */
	@Check
	public void checkRGBColorRange(RGBColor color) {
		if (!checkBetween0and255(color.getBlue())) {
			error("The blue color should be defined between 0 and 255.",
					StylesPackage.Literals.RGB_COLOR__BLUE,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(color.getBlue()));
		}
		if (!checkBetween0and255(color.getGreen())) {
			error("The green color should be defined between 0 and 255.",
					StylesPackage.Literals.RGB_COLOR__GREEN,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(color.getGreen()));
		}
		if (!checkBetween0and255(color.getRed())) {
			error("The red color should be defined between 0 and 255.",
					StylesPackage.Literals.RGB_COLOR__RED,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(color.getRed()));
		}
	}

	/*
	 * checks if an font i available or not
	 */
	@Check
	public void checkFont(Font font) {
		GraphicsEnvironment gEnv = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		List<String> fonts = Arrays.asList(gEnv.getAvailableFontFamilyNames());
		if (font != null) {
			String fontName = font.getFontName();
			if (!fonts.contains(fontName) && !fontName.equals("")) {
				warning("The selected font is not installed on the system -> default is taken",
						StylesPackage.Literals.FONT__FONT_NAME,
						ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
						String.valueOf(fontName));
			}
		}
	}

	/*
	 * checks the transparency of a layout
	 */
	@Check
	public void checkTransparency(StyleLayout layout) {
		Double transparency = (layout.getTransparency() != null) ? layout
				.getTransparency().getTransparency() : 1.0;
		transparency = (transparency != Double.NaN) ? transparency : 1.0;
		if (!checkBetween0and1(transparency)) {
			error("tranparency must be between 0.0 and 1.0",
					StylesPackage.Literals.STYLE_LAYOUT__TRANSPARENCY,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(transparency));
		}
	}

	/*
	 * checks a range of an integer value 
	 */
	private boolean checkBetween0and255(int value) {
		if (0 <= value && value < 256) {
			return true;
		}
		return false;
	}
	
	/*
	 * checks a range of an double value 
	 */
	private boolean checkBetween0and1(double value) {
		if (0.0 <= value && value < 1.01) {
			return true;
		}
		return false;
	}

	/*
	 * checks the length of a description
	 */
	@Check
	public void checkDescriptonShort(Style style) {
		String description = style.getDescription();
		if (description.length() < 20) {
			warning("The description should have more than 20 characters.",
					StylesPackage.Literals.STYLE__DESCRIPTION,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					style.getDescription());
		}
	}

	/*
	 * checks the depricated attributes of a lineelement 
	 */
	@Check
	public void checkDepricatedLineAttributes(Line line) {
		if (line != null) {
			if (line.getLineColor().toString() == "transparent") {
				if (line.getLineWidth() != 0) {
					warning("when the color is transparent, the linewidth is deprecated.",
							StylesPackage.Literals.LINE__LINE_WIDTH,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
							String.valueOf(line.getLineWidth()));
				}
				if (line.getLineStyle() != null) {
					warning("when the color is transparent, the linestyle is deprecated.",
							StylesPackage.Literals.LINE__LINE_STYLE,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX, line
									.getLineStyle().toString());
				}
			} else {
				if (line.getLineWidth() == 0 && line.getLineStyle() != null) {
					warning("when the linewidth is 0, the linestyle is deprecated.",
							StylesPackage.Literals.LINE__LINE_STYLE,
							ValidationMessageAcceptor.INSIGNIFICANT_INDEX, line
									.getLineStyle().toString());
				}

			}
		}
	}
}
