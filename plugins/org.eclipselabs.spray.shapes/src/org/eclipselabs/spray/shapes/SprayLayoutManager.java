package org.eclipselabs.spray.shapes;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

public class SprayLayoutManager {

	private int minSizeWidth;
	private int minSizeHeight;

	private int maxSizeWidth;
	private int maxSizeHeight;

	private static final String WIDTH_KEY = "current-width-shape";
	private static final String HEIGHT_KEY = "current-height-shape";

	private IGaService gaService;

	public boolean layout(ILayoutContext context) {

		boolean anythingChanged = false;

		ContainerShape containerShape = (ContainerShape) context
				.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();

		// Check MinHeight
		if (minSizeHeight > 0 && containerGa.getHeight() < minSizeHeight) {
			containerGa.setHeight(minSizeHeight);
			anythingChanged = true;
		}

		// Check MinWidth
		if (minSizeWidth > 0 && containerGa.getWidth() < minSizeWidth) {
			containerGa.setWidth(minSizeWidth);
			anythingChanged = true;
		}

		// Check MaxHeight
		if (maxSizeHeight > 0 && containerGa.getHeight() > maxSizeHeight) {
			containerGa.setHeight(maxSizeHeight);
			anythingChanged = true;
		}

		// Check MaxHeight
		if (maxSizeWidth > 0 && containerGa.getWidth() > maxSizeWidth) {
			containerGa.setWidth(maxSizeWidth);
			anythingChanged = true;
		}

		gaService = Graphiti.getGaService();

		// Get old size values from element properties
		float oldMaxWidth = getMaxWidthPictorgramProperty(containerShape);
		float oldMaxHeight = getMaxHeightPictorgramProperty(containerShape);

		// Get new size of container
		float newContainerWidth = containerGa.getWidth();
		float newContainerHeight = containerGa.getHeight();

		// Determine size factors for resizing of elements
		float widthFactor = newContainerWidth / oldMaxWidth;
		float heightFactor = newContainerHeight / oldMaxHeight;

		// Check if something has changed
		if ((widthFactor != 1.0) || (heightFactor != 1.0)) {

			// calculate new element sizes
			resizeElements(containerGa, widthFactor, heightFactor);

			// calculate new anchor positions
			recalculateAnchors(containerShape, widthFactor, heightFactor);

			// set new size to properties of element
			setMaxHeightPictorgramProperty(containerShape, (int) Math.round(newContainerHeight));
			setMaxWidthPictorgramProperty(containerShape, (int) Math.round(newContainerWidth));

			anythingChanged = true;
		}

		return anythingChanged;
	}
	
	public void resizeElements(GraphicsAlgorithm a,
			double widthFactor, double heightFactor) {

		// Special layout handling for shapes which only consists of a polyline or polygon
		if(a.getGraphicsAlgorithmChildren().size() == 0 && ((a instanceof Polyline)||(a instanceof Polygon))){
			
			IDimension size = gaService.calculateSize(a);
			if (a instanceof Polyline) {
				resizePolyline((Polyline) a, size, widthFactor,
						heightFactor);
			} else if (a instanceof Polygon) {
				resizePolygon((Polygon) a, size, widthFactor,
						heightFactor);
			}
		} else{
			
			// calculate new element size recursively
			resizeElementsRecursive(a, widthFactor, heightFactor);
			
		}
		
	}

	public void resizeElementsRecursive(GraphicsAlgorithm a,
			double widthFactor, double heightFactor) {

		if (a.getGraphicsAlgorithmChildren().size() == 0) {
			
			return;
			
		} else {

			for (GraphicsAlgorithm shapeElement : a
					.getGraphicsAlgorithmChildren()) {
				IDimension size = gaService.calculateSize(shapeElement);

				if (shapeElement instanceof Polyline) {
					resizePolyline((Polyline) shapeElement, size, widthFactor,
							heightFactor);
				} else if (shapeElement instanceof Polygon) {
					resizePolygon((Polygon) shapeElement, size, widthFactor,
							heightFactor);
				} else {
					resizeShape(shapeElement, size, widthFactor, heightFactor);
				}

				resizeElementsRecursive(shapeElement, widthFactor, heightFactor);

			}
		}

	}

	public void resizePolyline(Polyline p, IDimension size, double widthFactor,
			double heightFactor) {
		recalulatePointList(p.getPoints(), widthFactor, heightFactor);
	}

	public void resizePolygon(Polygon p, IDimension size, double widthFactor,
			double heightFactor) {
		recalulatePointList(p.getPoints(), widthFactor, heightFactor);
	}

	public void resizeShape(GraphicsAlgorithm gAlgorithm, IDimension size,
			double widthFactor, double heightFactor) {

		// Set new width and height
		int newWidth = (int) Math.round(size.getWidth() * widthFactor);
		int newHeight = (int) Math.round(size.getHeight() * heightFactor);

		// Set new x and y coordinates
		int newXCord = (int) Math.round(gAlgorithm.getX() * widthFactor);
		int newYCord = (int) Math.round(gAlgorithm.getY() * heightFactor);

		gaService.setLocationAndSize(gAlgorithm, newXCord, newYCord, newWidth,
				newHeight);
	}

	public void recalulatePointList(EList<Point> points, double widthFactor,
			double heightFactor) {

		for (Point point : points) {

			int newXCord = (int) Math.round(point.getX() * widthFactor);
			int newYCord = (int) Math.round(point.getY() * heightFactor);

			point.setX(newXCord);
			point.setY(newYCord);

		}

	}

	public void recalculateAnchors(ContainerShape containerShape,
			double widthFactor, double heightFactor) {

		for (Anchor anchor : containerShape.getAnchors()) {

			if (anchor instanceof FixPointAnchor) {

				GraphicsAlgorithm ga = anchor.getGraphicsAlgorithm();
				FixPointAnchor fpa = (FixPointAnchor) anchor;

				// set new x and y coordinates for position of anchor
				Point p = fpa.getLocation();
				p.setX((int) Math.round(p.getX() * widthFactor));
				p.setY((int) Math.round(p.getY() * heightFactor));

				// Set new width and height
				ga.setWidth((int) Math.round(ga.getWidth() * widthFactor));
				ga.setHeight((int) Math.round(ga.getHeight() * heightFactor));

				// Set new x and y coordinates
				ga.setX((int) Math.round(ga.getX() * widthFactor));
				ga.setY((int) Math.round(ga.getY() * heightFactor));

			}

		}

	}

	public int getMinSizeWidth() {
		return minSizeWidth;
	}

	public void setMinSizeWidth(int minSizeWidth) {
		this.minSizeWidth = minSizeWidth;
	}

	public int getMinSizeHeight() {
		return minSizeHeight;
	}

	public void setMinSizeHeight(int minSizeHeight) {
		this.minSizeHeight = minSizeHeight;
	}

	public int getMaxSizeWidth() {
		return maxSizeWidth;
	}

	public void setMaxSizeWidth(int maxSizeWidth) {
		this.maxSizeWidth = maxSizeWidth;
	}

	public int getMaxSizeHeight() {
		return maxSizeHeight;
	}

	public void setMaxSizeHeight(int maxSizeHeight) {
		this.maxSizeHeight = maxSizeHeight;
	}

	public int getMaxWidthPictorgramProperty(PictogramElement pe) {

		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe,
				WIDTH_KEY));
	}

	public static void setMaxWidthPictorgramProperty(PictogramElement pe,
			int maxWidth) {

		Graphiti.getPeService().setPropertyValue(pe, WIDTH_KEY,
				Integer.toString(maxWidth));

	}

	public int getMaxHeightPictorgramProperty(PictogramElement pe) {

		return Integer.parseInt(Graphiti.getPeService().getPropertyValue(pe,
				HEIGHT_KEY));
	}

	public static void setMaxHeightPictorgramProperty(PictogramElement pe,
			int maxHeight) {

		Graphiti.getPeService().setPropertyValue(pe, HEIGHT_KEY,
				Integer.toString(maxHeight));

	}

	public static void setSizePictogramProperties(PictogramElement pe) {

		GraphicsAlgorithm ga = pe.getGraphicsAlgorithm();
		int maxWidth = 0;
		int maxHeight = 0;

		if ((ga instanceof Polyline) || (ga instanceof Polygon)) {
			Polyline element = (Polyline) ga;
			EList<Point> points = element.getPoints();

			for (Point point : points) {

				if (point.getX() > maxWidth) {
					maxWidth = point.getX();
				}

				if (point.getY() > maxHeight) {
					maxHeight = point.getY();
				}

			}
		}

		else {
			maxHeight = ga.getHeight();
			maxWidth = ga.getWidth();
		}
		
		setMaxHeightPictorgramProperty(pe, maxHeight);
		setMaxWidthPictorgramProperty(pe, maxWidth);
		
	}

}
