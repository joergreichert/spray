package org.eclipselabs.spray.styles.validation;

import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.generator.common.ReservedKeyWords;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientColorArea;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.spray.styles.Transparent;

public class StyleJavaValidator extends AbstractStyleJavaValidator {

    /**
     * Checks if the gradient definition has a start, a end and redundant gradient areas
     * 
     * @param gradientColorArea
     */
    @Check
    public void checkGradientDefintion(GradientColorArea gradientColorArea) {
        EObject eObject = gradientColorArea.eContainer();
        while (!(eObject instanceof Gradient)) {
            eObject = eObject.eContainer();
        }
        Gradient gradient = (Gradient) eObject;

        // Transform GradientColorArea List in a sorted double list
        EList<GradientColorArea> colorAreas = gradient.getLayout().getArea();
        List<Double> gradientAreaOffset = new ArrayList<Double>();
        for (GradientColorArea colorArea : colorAreas) {
            gradientAreaOffset.add(colorArea.getOffset());
        }

        // Check Start-Offset is 0.0
        double startOffset = gradientAreaOffset.get(0);
        if (startOffset != 0.0 && EcoreUtil.equals(gradientColorArea, colorAreas.get(0))) {
            warning("A gradient should always start with an offset of 0.0.", StylesPackage.Literals.GRADIENT_COLOR_AREA__OFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(startOffset));
        }

        // Check End-Offset is 1.0
        double endOffset = gradientAreaOffset.get(gradientAreaOffset.size() - 1);
        if (endOffset != 1.0 && EcoreUtil.equals(gradientColorArea, colorAreas.get(colorAreas.size() - 1))) {
            warning("A gradient should always end with an offset of 1.0.", StylesPackage.Literals.GRADIENT_COLOR_AREA__OFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(startOffset));
        }
    }

    /**
     * Checks the range of every gradient definition for the Styles Layout
     * 
     * @param gradientColorArea
     */
    @Check
    public void checkGradientRange(GradientColorArea gradientColorArea) {
        if (gradientColorArea.getOffset() < 0.0 || gradientColorArea.getOffset() > 1.0) {
            error("The range for the offset should be defined between 0.0 and 1.0.", StylesPackage.Literals.GRADIENT_COLOR_AREA__OFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(gradientColorArea.getOffset()));
        }
    }

    /**
     * Checks the area definitions are defined in the right sortage.
     * 
     * @param gradientColorArea
     */
    @Check
    public void checkGradientSortage(GradientColorArea gradientColorArea) {
        EObject eObject = gradientColorArea.eContainer();
        while (!(eObject instanceof Gradient)) {
            eObject = eObject.eContainer();
        }
        Gradient gradient = (Gradient) eObject;

        double lastOffset = 0.0;
        EList<GradientColorArea> colorAreas = gradient.getLayout().getArea();
        for (GradientColorArea colorArea : colorAreas) {
            double currentOffset = colorArea.getOffset();
            if (!(currentOffset > lastOffset || ((currentOffset == lastOffset) && (lastOffset == 0.0))) && EcoreUtil.equals(gradientColorArea, colorArea)) {
                error("This offset should be bigger than " + lastOffset + ". Please take care about the sortage of the gradient areas.", StylesPackage.Literals.GRADIENT_COLOR_AREA__OFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(gradientColorArea.getOffset()));
            }
            lastOffset = currentOffset;
        }
    }

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
            error("The blue color should be defined between 0 and 255.", StylesPackage.Literals.RGB_COLOR__BLUE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(color.getBlue()));
        }
        if (!checkBetween0and255(color.getGreen())) {
            error("The green color should be defined between 0 and 255.", StylesPackage.Literals.RGB_COLOR__GREEN, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(color.getGreen()));
        }
        if (!checkBetween0and255(color.getRed())) {
            error("The red color should be defined between 0 and 255.", StylesPackage.Literals.RGB_COLOR__RED, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(color.getRed()));
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
        if (description != null && description.length() < 20) {
            warning("The description should have more than 20 characters.", StylesPackage.Literals.STYLE_CONTAINER_ELEMENT__DESCRIPTION, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, style.getDescription());
        }
    }

    /**
     * Checks the Transparency Double value (between 0.0 and 1.0)
     * 
     * @param transparency
     */
    private void checkTransparency(Double transparency) {
        if (!checkBetween0and1(transparency)) {
            error("The tranparency should be between 0.0 and 1.0.", StylesPackage.Literals.STYLE_LAYOUT__TRANSPARENCY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(transparency));
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
                warning("The selected font is not installed on the system (default 'Arial' will be taken).", StylesPackage.Literals.STYLE_LAYOUT__FONT_NAME, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(fontName));
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
        if (lineColor instanceof Transparent) {
            if (lineWidth != 0) {
                warning("If the line-color is transparent, the line-width is deprecated.", StylesPackage.Literals.STYLE_LAYOUT__LINE_WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(lineWidth));
            }
            if (lineStyle != null && lineStyle != LineStyle.NULL) {
                warning("If the line-color is transparent, the line-style is deprecated.", StylesPackage.Literals.STYLE_LAYOUT__LINE_STYLE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, lineStyle.toString());
            }
        } else {
            if (lineWidth == 0 && lineStyle != null) {
                warning("If the line-width is 0, the line is invisible (line-style is deprecated).", StylesPackage.Literals.STYLE_LAYOUT__LINE_STYLE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, lineStyle.toString());
            }
        }
    }
    
    @Check
    void checkUsingReservedKeyWords(Style style) {
        if (getReservedKeyWords().contains(style.getName())) {
            error("The keyword used as style name is reserved. Please add a pre- or suffix.", StylesPackage.Literals.STYLE_CONTAINER_ELEMENT__NAME);
        }
    }

    @Check
    void checkUsingReservedKeyWords(Gradient gradient) {
        if (getReservedKeyWords().contains(gradient.getName())) {
            error("The keyword used as gradient name is reserved. Please add a pre- or suffix.", StylesPackage.Literals.STYLE_CONTAINER_ELEMENT__NAME);
        }
    }

    private List<String> getReservedKeyWords() {
        return Arrays.asList(ReservedKeyWords.RESERVED_KEY_WORDS);
    }

}
