package org.eclipselabs.spray.runtime.graphiti.services;

import java.util.Collection;
import java.util.List;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.PlatformGraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.AbstractStyle;
import org.eclipse.graphiti.mm.algorithms.styles.AdaptedGradientColoredAreas;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Font;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.algorithms.styles.RenderingStyle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyle;
import org.eclipse.graphiti.mm.algorithms.styles.TextStyleRegion;
import org.eclipse.graphiti.mm.algorithms.styles.UnderlineStyle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.impl.GaServiceImpl;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * Spray specific implementation of {@link IGaService}. The default
 * implementation is not extensible, see
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=364126 By using this
 * implementation default styles can be overridden. Especially important for the
 * methods {@link #setDefaultGraphicsAlgorithmValues(GraphicsAlgorithm)} and
 * {@link #setDefaultTextAttributes(Diagram, AbstractText, String, boolean)},
 * which are private in {@link GaServiceImpl}.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class SprayGaService implements IGaService {
	protected IGaService delegate;

	public SprayGaService() {
		delegate = Graphiti.getGaService();
	}

	@Override
	public IDimension calculateSize(GraphicsAlgorithm ga) {
		return delegate.calculateSize(ga);
	}

	@Override
	public IDimension calculateSize(GraphicsAlgorithm ga,
			boolean considerLineWidth) {
		return delegate.calculateSize(ga, considerLineWidth);
	}

	@Override
	public MultiText createDefaultMultiText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer) {
		return delegate.createDefaultMultiText(diagram, gaContainer);
	}

	@Override
	public void setHeight(GraphicsAlgorithm ga, int height) {
		delegate.setHeight(ga, height);
	}

	@Override
	public void deleteFont(Font font) {
		delegate.deleteFont(font);
	}

	@Override
	public void setLocationAndSize(GraphicsAlgorithm ga, int x, int y,
			int width, int height) {
		delegate.setLocationAndSize(ga, x, y, width, height);
	}

	@Override
	public void deleteColor(Color color) {
		delegate.deleteColor(color);
	}

	@Override
	public void deleteRenderingStyle(AbstractStyle abstractStyle) {
		delegate.deleteRenderingStyle(abstractStyle);
	}

	@Override
	public void setLocationAndSize(GraphicsAlgorithm ga, int x, int y,
			int width, int height, boolean avoidNegativeCoordinates) {
		delegate.setLocationAndSize(ga, x, y, width, height,
				avoidNegativeCoordinates);
	}

	@Override
	public Style findStyle(StyleContainer styleContainer, String id) {
		return delegate.findStyle(styleContainer, id);
	}

	@Override
	public MultiText createDefaultMultiText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer, String value) {
		MultiText text = delegate.createDefaultMultiText(diagram, gaContainer,
				value);
		setDefaultTextAttributes(diagram, text, value, true);
		return text;
	}

	@Override
	public int getAngle(AbstractText at, boolean checkStyles) {
		return delegate.getAngle(at, checkStyles);
	}

	@Override
	public void setLocation(GraphicsAlgorithm ga, int x, int y) {
		delegate.setLocation(ga, x, y);
	}

	@Override
	public Color getBackgroundColor(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.getBackgroundColor(ga, checkStyles);
	}

	@Override
	public void setLocation(GraphicsAlgorithm ga, int x, int y,
			boolean avoidNegativeCoordinates) {
		delegate.setLocation(ga, x, y, avoidNegativeCoordinates);
	}

	@Override
	public Font getFont(AbstractText at, boolean checkStyles) {
		return delegate.getFont(at, checkStyles);
	}

	@Override
	public Text createDefaultText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer) {
		Text text = delegate.createDefaultText(diagram, gaContainer);
		setDefaultTextAttributes(diagram, text, null, true);
		return text;
	}

	@Override
	public Color getForegroundColor(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.getForegroundColor(ga, checkStyles);
	}

	@Override
	public void setSize(GraphicsAlgorithm ga, int width, int height) {
		delegate.setSize(ga, width, height);
	}

	@Override
	public Orientation getHorizontalAlignment(AbstractText at,
			boolean checkStyles) {
		return delegate.getHorizontalAlignment(at, checkStyles);
	}

	@Override
	public void setWidth(GraphicsAlgorithm ga, int width) {
		delegate.setWidth(ga, width);
	}

	@Override
	public LineStyle getLineStyle(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.getLineStyle(ga, checkStyles);
	}

	@Override
	public int getLineWidth(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.getLineWidth(ga, checkStyles);
	}

	@Override
	public Text createDefaultText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer, String value) {
		Text text = delegate.createDefaultText(diagram, gaContainer, value);
		setDefaultTextAttributes(diagram, text, value, true);
		return text;
	}

	@Override
	public RenderingStyle getRenderingStyle(GraphicsAlgorithm ga,
			boolean checkStyles) {
		return delegate.getRenderingStyle(ga, checkStyles);
	}

	@Override
	public double getTransparency(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.getTransparency(ga, checkStyles);
	}

	@Override
	public Orientation getVerticalAlignment(AbstractText at, boolean checkStyles) {
		return delegate.getVerticalAlignment(at, checkStyles);
	}

	@Override
	public MultiText createMultiText(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createMultiText(gaContainer);
	}

	@Override
	public boolean isFilled(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.isFilled(ga, checkStyles);
	}

	@Override
	public MultiText createMultiText(GraphicsAlgorithmContainer gaContainer,
			String value) {
		MultiText text = delegate.createMultiText(gaContainer, value);
		setDefaultTextAttributes(null, text, value, true);
		return text;
	}

	@Override
	public boolean isLineVisible(GraphicsAlgorithm ga, boolean checkStyles) {
		return delegate.isLineVisible(ga, checkStyles);
	}

	@Override
	public boolean isProportional(Image image, boolean checkStyles) {
		return delegate.isProportional(image, checkStyles);
	}

	@Override
	public boolean isStretchH(Image image, boolean checkStyles) {
		return delegate.isStretchH(image, checkStyles);
	}

	@Override
	public boolean isStretchV(Image image, boolean checkStyles) {
		return delegate.isStretchV(image, checkStyles);
	}

	@Override
	public Text createText(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createText(gaContainer);
	}

	@Override
	public Color manageColor(Diagram diagram, IColorConstant colorConstant) {
		return delegate.manageColor(diagram, colorConstant);
	}

	@Override
	public Color manageColor(Diagram diagram, int red, int green, int blue) {
		return delegate.manageColor(diagram, red, green, blue);
	}

	@Override
	public Text createText(GraphicsAlgorithmContainer gaContainer, String value) {
		Text text = delegate.createText(gaContainer, value);
		setDefaultTextAttributes(null, text, value, true);
		return text;
	}

	@Override
	public Font manageFont(Diagram diagram, String name, int size) {
		return delegate.manageFont(diagram, name, size);
	}

	@Override
	public Ellipse createEllipse(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createEllipse(gaContainer);
	}

	@Override
	public Font manageFont(Diagram diagram, String name, int size,
			boolean isItalic, boolean isBold) {
		return delegate.manageFont(diagram, name, size, isItalic, isBold);
	}

	@Override
	public Image createImage(GraphicsAlgorithmContainer gaContainer,
			String imageId) {
		return delegate.createImage(gaContainer, imageId);
	}

	@Override
	public void movePolylinePoint(Polyline polyline, int index, int deltaX,
			int deltaY) {
		delegate.movePolylinePoint(polyline, index, deltaX, deltaY);
	}

	@Override
	public void setRenderingStyle(AbstractStyle abstractStyle,
			AdaptedGradientColoredAreas adaptedGradientColoredAreas) {
		delegate.setRenderingStyle(abstractStyle, adaptedGradientColoredAreas);
	}

	@Override
	public Rectangle createInvisibleRectangle(PictogramElement pe) {
		return delegate.createInvisibleRectangle(pe);
	}

	@Override
	public PlatformGraphicsAlgorithm createPlatformGraphicsAlgorithm(
			GraphicsAlgorithmContainer gaContainer, String id) {
		return delegate.createPlatformGraphicsAlgorithm(gaContainer, id);
	}

	@Override
	public Point createPoint(int x, int y) {
		return delegate.createPoint(x, y);
	}

	@Override
	public Point createPoint(int x, int y, int before, int after) {
		return delegate.createPoint(x, y, before, after);
	}

	@Override
	public List<Point> createPointList(int[] xy) {
		return delegate.createPointList(xy);
	}

	@Override
	public List<Point> createPointList(int[] xy, int[] beforeAfter) {
		return delegate.createPointList(xy, beforeAfter);
	}

	@Override
	public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPolygon(gaContainer);
	}

	@Override
	public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer,
			Collection<Point> points) {
		return delegate.createPolygon(gaContainer, points);
	}

	@Override
	public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer,
			int[] xy) {
		return delegate.createPolygon(gaContainer, xy);
	}

	@Override
	public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer,
			int[] xy, int[] beforeAfter) {
		return delegate.createPolygon(gaContainer, xy, beforeAfter);
	}

	@Override
	public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPolyline(gaContainer);
	}

	@Override
	public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer,
			Collection<Point> points) {
		return delegate.createPolyline(gaContainer, points);
	}

	@Override
	public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer,
			int[] xy) {
		return delegate.createPolyline(gaContainer, xy);
	}

	@Override
	public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer,
			int[] xy, int[] beforeAfter) {
		return delegate.createPolyline(gaContainer, xy, beforeAfter);
	}

	@Override
	public Rectangle createRectangle(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createRectangle(gaContainer);
	}

	@Override
	public RoundedRectangle createRoundedRectangle(
			GraphicsAlgorithmContainer gaContainer, int cornerWidth,
			int cornerHeight) {
		return delegate.createRoundedRectangle(gaContainer, cornerWidth,
				cornerHeight);
	}

	@Override
	public Color createShiftedColor(Color color, int shift, Diagram diagram) {
		return delegate.createShiftedColor(color, shift, diagram);
	}

	@Override
	public IColorConstant createShiftedColor(IColorConstant colorConstant,
			int shift) {
		return delegate.createShiftedColor(colorConstant, shift);
	}

	@Override
	public Style createStyle(StyleContainer styleContainer, String id) {
		return delegate.createStyle(styleContainer, id);
	}

	protected void setDefaultGraphicsAlgorithmValues(
			GraphicsAlgorithm graphicsAlgorithm) {
		setLocationAndSize(graphicsAlgorithm, 0, 0, 0, 0);
		// graphicsAlgorithm.unsetLineVisible();
		graphicsAlgorithm.setLineStyle(LineStyle.SOLID);
		graphicsAlgorithm.setLineWidth(1);
		graphicsAlgorithm.setTransparency(0d);
	}

	protected void setDefaultTextAttributes(Diagram diagram, AbstractText ret,
			String value, boolean createFont) {
		setDefaultGraphicsAlgorithmValues(ret);
		ret.setValue(value);
		if (createFont && diagram != null) {
			Font font = manageFont(diagram, IGaService.DEFAULT_FONT, 12);
			ret.setFont(font);
		}
	}

	@Override
	public void resetAll(AbstractStyle abstractStyle) {
		delegate.resetAll(abstractStyle);
	}

	@Override
	public MultiText createPlainMultiText(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPlainMultiText(gaContainer);
	}

	@Override
	public MultiText createPlainMultiText(
			GraphicsAlgorithmContainer gaContainer, String value) {
		return delegate.createPlainMultiText(gaContainer, value);
	}

	@Override
	public MultiText createMultiText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer, String value,
			String fontName, int fontSize) {
		return delegate.createMultiText(diagram, gaContainer, value, fontName,
				fontSize);
	}

	@Override
	public Font manageDefaultFont(Diagram diagram) {
		return delegate.manageDefaultFont(diagram);
	}

	@Override
	public Font manageDefaultFont(Diagram diagram, boolean isItalic,
			boolean isBold) {
		return delegate.manageDefaultFont(diagram, isItalic, isBold);
	}

	@Override
	public MultiText createMultiText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer, String value,
			String fontName, int fontSize, boolean isFontItalic,
			boolean isFontBold) {
		return delegate.createMultiText(diagram, gaContainer, value, fontName,
				fontSize, isFontItalic, isFontBold);
	}

	@Override
	public Text createPlainText(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPlainText(gaContainer);
	}

	@Override
	public Text createPlainText(GraphicsAlgorithmContainer gaContainer,
			String value) {
		return delegate.createPlainText(gaContainer, value);
	}

	@Override
	public Text createText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer, String value,
			String fontName, int fontSize) {
		return delegate.createText(diagram, gaContainer, value, fontName,
				fontSize);
	}

	@Override
	public Text createText(Diagram diagram,
			GraphicsAlgorithmContainer gaContainer, String value,
			String fontName, int fontSize, boolean isFontItalic,
			boolean isFontBold) {
		return delegate.createText(diagram, gaContainer, value, fontName,
				fontSize, isFontItalic, isFontBold);
	}

	@Override
	public Ellipse createPlainEllipse(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPlainEllipse(gaContainer);
	}

	@Override
	public Image createPlainImage(GraphicsAlgorithmContainer gaContainer,
			String imageId) {
		return delegate.createPlainImage(gaContainer, imageId);
	}

	@Override
	public PlatformGraphicsAlgorithm createPlainPlatformGraphicsAlgorithm(
			GraphicsAlgorithmContainer gaContainer, String id) {
		return delegate.createPlainPlatformGraphicsAlgorithm(gaContainer, id);
	}

	@Override
	public Polygon createPlainPolygon(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPlainPolygon(gaContainer);
	}

	@Override
	public Polygon createPlainPolygon(GraphicsAlgorithmContainer gaContainer,
			Collection<Point> points) {
		return delegate.createPlainPolygon(gaContainer, points);
	}

	@Override
	public Polygon createPlainPolygon(GraphicsAlgorithmContainer gaContainer,
			int[] xy) {
		return delegate.createPlainPolygon(gaContainer, xy);
	}

	@Override
	public Polygon createPlainPolygon(GraphicsAlgorithmContainer gaContainer,
			int[] xy, int[] beforeAfter) {
		return delegate.createPlainPolygon(gaContainer, xy, beforeAfter);
	}

	@Override
	public Polyline createPlainPolyline(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPlainPolyline(gaContainer);
	}

	@Override
	public Polyline createPlainPolyline(GraphicsAlgorithmContainer gaContainer,
			Collection<Point> points) {
		return delegate.createPlainPolyline(gaContainer, points);
	}

	@Override
	public Polyline createPlainPolyline(GraphicsAlgorithmContainer gaContainer,
			int[] xy) {
		return delegate.createPlainPolyline(gaContainer, xy);
	}

	@Override
	public Polyline createPlainPolyline(GraphicsAlgorithmContainer gaContainer,
			int[] xy, int[] beforeAfter) {
		return delegate.createPlainPolyline(gaContainer, xy, beforeAfter);
	}

	@Override
	public Rectangle createPlainRectangle(GraphicsAlgorithmContainer gaContainer) {
		return delegate.createPlainRectangle(gaContainer);
	}

	@Override
	public RoundedRectangle createPlainRoundedRectangle(
			GraphicsAlgorithmContainer gaContainer, int cornerWidth,
			int cornerHeight) {
		return delegate.createPlainRoundedRectangle(gaContainer, cornerWidth,
				cornerHeight);
	}

	@Override
	public Style createPlainStyle(StyleContainer styleContainer, String id) {
		return delegate.createPlainStyle(styleContainer, id);
	}

	@Override
	public TextStyleRegion createTextStyleRegion(AbstractText abstractText) {
		return delegate.createTextStyleRegion(abstractText);
	}

	@Override
	public TextStyleRegion createTextStyleRegion(AbstractText abstractText,
			int start, int end) {
		return delegate.createTextStyleRegion(abstractText, start, end);
	}

	@Override
	public TextStyle createTextStyle(TextStyleRegion region) {
		return delegate.createTextStyle(region);
	}

	@Override
	public TextStyle createTextStyle(TextStyleRegion region, boolean underline,
			boolean strikeout, UnderlineStyle underlineStyle) {
		return delegate.createTextStyle(region, underline, strikeout, underlineStyle);
	}
}
