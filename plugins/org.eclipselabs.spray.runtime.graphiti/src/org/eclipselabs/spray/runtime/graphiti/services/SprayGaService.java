package org.eclipselabs.spray.runtime.graphiti.services;

import java.util.Collection;
import java.util.List;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.internal.services.impl.GaServiceImpl;
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
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.IColorConstant;

/**
 * Spray specific implementation of {@link IGaService}. The default implementation is not extensible, see
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=364126
 * By using this implementation default styles can be overridden. Especially important for the methods {@link #setDefaultGraphicsAlgorithmValues(GraphicsAlgorithm)} and {@link #setDefaultTextAttributes(Diagram, AbstractText, String, boolean)},
 * which are private in {@link GaServiceImpl}.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
@SuppressWarnings("restriction")
public class SprayGaService implements IGaService {
    protected IGaService delegate;

    public SprayGaService() {
        delegate = Graphiti.getGaService();
    }

    public IDimension calculateSize(GraphicsAlgorithm ga) {
        return delegate.calculateSize(ga);
    }

    public IDimension calculateSize(GraphicsAlgorithm ga, boolean considerLineWidth) {
        return delegate.calculateSize(ga, considerLineWidth);
    }

    @Deprecated
    public void deleteFont(AbstractText abstractText) {
        delegate.deleteFont(abstractText);
    }

    public MultiText createDefaultMultiText(Diagram diagram, GraphicsAlgorithmContainer gaContainer) {
        return delegate.createDefaultMultiText(diagram, gaContainer);
    }

    public void setHeight(GraphicsAlgorithm ga, int height) {
        delegate.setHeight(ga, height);
    }

    public void deleteFont(Font font) {
        delegate.deleteFont(font);
    }

    public void setLocationAndSize(GraphicsAlgorithm ga, int x, int y, int width, int height) {
        delegate.setLocationAndSize(ga, x, y, width, height);
    }

    public void deleteColor(Color color) {
        delegate.deleteColor(color);
    }

    public void deleteRenderingStyle(AbstractStyle abstractStyle) {
        delegate.deleteRenderingStyle(abstractStyle);
    }

    public void setLocationAndSize(GraphicsAlgorithm ga, int x, int y, int width, int height, boolean avoidNegativeCoordinates) {
        delegate.setLocationAndSize(ga, x, y, width, height, avoidNegativeCoordinates);
    }

    public Style findStyle(StyleContainer styleContainer, String id) {
        return delegate.findStyle(styleContainer, id);
    }

    public MultiText createDefaultMultiText(Diagram diagram, GraphicsAlgorithmContainer gaContainer, String value) {
        MultiText text = delegate.createDefaultMultiText(diagram, gaContainer, value);
        setDefaultTextAttributes(diagram, text, value, true);
        return text;
    }

    public int getAngle(AbstractText at, boolean checkStyles) {
        return delegate.getAngle(at, checkStyles);
    }

    public void setLocation(GraphicsAlgorithm ga, int x, int y) {
        delegate.setLocation(ga, x, y);
    }

    public Color getBackgroundColor(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.getBackgroundColor(ga, checkStyles);
    }

    public void setLocation(GraphicsAlgorithm ga, int x, int y, boolean avoidNegativeCoordinates) {
        delegate.setLocation(ga, x, y, avoidNegativeCoordinates);
    }

    public Font getFont(AbstractText at, boolean checkStyles) {
        return delegate.getFont(at, checkStyles);
    }

    public Text createDefaultText(Diagram diagram, GraphicsAlgorithmContainer gaContainer) {
        Text text = delegate.createDefaultText(diagram, gaContainer);
        setDefaultTextAttributes(diagram, text, null, true);
        return text;
    }

    public Color getForegroundColor(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.getForegroundColor(ga, checkStyles);
    }

    public void setSize(GraphicsAlgorithm ga, int width, int height) {
        delegate.setSize(ga, width, height);
    }

    public Orientation getHorizontalAlignment(AbstractText at, boolean checkStyles) {
        return delegate.getHorizontalAlignment(at, checkStyles);
    }

    public void setWidth(GraphicsAlgorithm ga, int width) {
        delegate.setWidth(ga, width);
    }

    public LineStyle getLineStyle(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.getLineStyle(ga, checkStyles);
    }

    public int getLineWidth(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.getLineWidth(ga, checkStyles);
    }

    public Text createDefaultText(Diagram diagram, GraphicsAlgorithmContainer gaContainer, String value) {
        Text text = delegate.createDefaultText(diagram, gaContainer, value);
        setDefaultTextAttributes(diagram, text, value, true);
        return text;
    }

    public RenderingStyle getRenderingStyle(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.getRenderingStyle(ga, checkStyles);
    }

    public double getTransparency(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.getTransparency(ga, checkStyles);
    }

    public Orientation getVerticalAlignment(AbstractText at, boolean checkStyles) {
        return delegate.getVerticalAlignment(at, checkStyles);
    }

    public MultiText createMultiText(GraphicsAlgorithmContainer gaContainer) {
        return delegate.createMultiText(gaContainer);
    }

    public void ignoreAll(AbstractStyle abstractStyle) {
        delegate.ignoreAll(abstractStyle);
    }

    public boolean isFilled(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.isFilled(ga, checkStyles);
    }

    public MultiText createMultiText(GraphicsAlgorithmContainer gaContainer, String value) {
        MultiText text = delegate.createMultiText(gaContainer, value);
        setDefaultTextAttributes(null, text, value, true);
        return text;
    }

    public boolean isLineVisible(GraphicsAlgorithm ga, boolean checkStyles) {
        return delegate.isLineVisible(ga, checkStyles);
    }

    public boolean isProportional(Image image, boolean checkStyles) {
        return delegate.isProportional(image, checkStyles);
    }

    public boolean isStretchH(Image image, boolean checkStyles) {
        return delegate.isStretchH(image, checkStyles);
    }

    public boolean isStretchV(Image image, boolean checkStyles) {
        return delegate.isStretchV(image, checkStyles);
    }

    public Text createText(GraphicsAlgorithmContainer gaContainer) {
        return delegate.createText(gaContainer);
    }

    public Color manageColor(Diagram diagram, IColorConstant colorConstant) {
        return delegate.manageColor(diagram, colorConstant);
    }

    public Color manageColor(Diagram diagram, int red, int green, int blue) {
        return delegate.manageColor(diagram, red, green, blue);
    }

    public Text createText(GraphicsAlgorithmContainer gaContainer, String value) {
        Text text = delegate.createText(gaContainer, value);
        setDefaultTextAttributes(null, text, value, true);
        return text;
    }

    public Font manageFont(Diagram diagram, String name, int size) {
        return delegate.manageFont(diagram, name, size);
    }

    public Ellipse createEllipse(GraphicsAlgorithmContainer gaContainer) {
        return delegate.createEllipse(gaContainer);
    }

    public Font manageFont(Diagram diagram, String name, int size, boolean isItalic, boolean isBold) {
        return delegate.manageFont(diagram, name, size, isItalic, isBold);
    }

    public Image createImage(GraphicsAlgorithmContainer gaContainer, String imageId) {
        return delegate.createImage(gaContainer, imageId);
    }

    public void movePolylinePoint(Polyline polyline, int index, int deltaX, int deltaY) {
        delegate.movePolylinePoint(polyline, index, deltaX, deltaY);
    }

    public void setRenderingStyle(AbstractStyle abstractStyle, AdaptedGradientColoredAreas adaptedGradientColoredAreas) {
        delegate.setRenderingStyle(abstractStyle, adaptedGradientColoredAreas);
    }

    public Rectangle createInvisibleRectangle(PictogramElement pe) {
        return delegate.createInvisibleRectangle(pe);
    }

    public PlatformGraphicsAlgorithm createPlatformGraphicsAlgorithm(GraphicsAlgorithmContainer gaContainer, String id) {
        return delegate.createPlatformGraphicsAlgorithm(gaContainer, id);
    }

    public Point createPoint(int x, int y) {
        return delegate.createPoint(x, y);
    }

    public Point createPoint(int x, int y, int before, int after) {
        return delegate.createPoint(x, y, before, after);
    }

    public List<Point> createPointList(int[] xy) {
        return delegate.createPointList(xy);
    }

    public List<Point> createPointList(int[] xy, int[] beforeAfter) {
        return delegate.createPointList(xy, beforeAfter);
    }

    public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer) {
        return delegate.createPolygon(gaContainer);
    }

    public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer, Collection<Point> points) {
        return delegate.createPolygon(gaContainer, points);
    }

    public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer, int[] xy) {
        return delegate.createPolygon(gaContainer, xy);
    }

    public Polygon createPolygon(GraphicsAlgorithmContainer gaContainer, int[] xy, int[] beforeAfter) {
        return delegate.createPolygon(gaContainer, xy, beforeAfter);
    }

    public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer) {
        return delegate.createPolyline(gaContainer);
    }

    public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer, Collection<Point> points) {
        return delegate.createPolyline(gaContainer, points);
    }

    public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer, int[] xy) {
        return delegate.createPolyline(gaContainer, xy);
    }

    public Polyline createPolyline(GraphicsAlgorithmContainer gaContainer, int[] xy, int[] beforeAfter) {
        return delegate.createPolyline(gaContainer, xy, beforeAfter);
    }

    public Rectangle createRectangle(GraphicsAlgorithmContainer gaContainer) {
        return delegate.createRectangle(gaContainer);
    }

    public RoundedRectangle createRoundedRectangle(GraphicsAlgorithmContainer gaContainer, int cornerWidth, int cornerHeight) {
        return delegate.createRoundedRectangle(gaContainer, cornerWidth, cornerHeight);
    }

    public Color createShiftedColor(Color color, int shift, Diagram diagram) {
        return delegate.createShiftedColor(color, shift, diagram);
    }

    public IColorConstant createShiftedColor(IColorConstant colorConstant, int shift) {
        return delegate.createShiftedColor(colorConstant, shift);
    }

    public Style createStyle(StyleContainer styleContainer, String id) {
        return delegate.createStyle(styleContainer, id);
    }

    protected void setDefaultGraphicsAlgorithmValues(GraphicsAlgorithm graphicsAlgorithm) {
        setLocationAndSize(graphicsAlgorithm, 0, 0, 0, 0);
        // graphicsAlgorithm.unsetLineVisible();
        graphicsAlgorithm.setLineStyle(LineStyle.SOLID);
        graphicsAlgorithm.setLineWidth(1);
        graphicsAlgorithm.setTransparency(0d);
    }

    protected void setDefaultTextAttributes(Diagram diagram, AbstractText ret, String value, boolean createFont) {
        setDefaultGraphicsAlgorithmValues(ret);
        ret.setValue(value);
        if (createFont && diagram != null) {
            Font font = manageFont(diagram, GaServiceImpl.DEFAULT_FONT, 12);
            ret.setFont(font);
        }
    }

}
