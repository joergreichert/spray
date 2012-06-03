package org.eclipselabs.spray.shapes.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.Point;
import org.eclipselabs.spray.shapes.shapes.Polygon;
import org.eclipselabs.spray.shapes.shapes.Polyline;
import org.eclipselabs.spray.shapes.shapes.Rectangle;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.shapes.Shape;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.shapes.Text;

import com.google.inject.Inject;

public class ShapeJavaValidator extends AbstractShapeJavaValidator {

	@Inject
	ShapeSizeCalculator sizeCalculator;

	private int maxWidth = 0;
	private int maxHeight = 0;
	private int sumWidth = 0;
	private int sumHeight = 0;

	private int maxXtotal = 0;
	private int minXtotal = 0;
	private int maxYtotal = 0;
	private int minYtotal = 0;

	@Check
	public void checkShapeDefinitionSize(ShapeDefinition shapeDefinition) {
		ShapeSizeWrapper shapeSizeWrapper = sizeCalculator
				.getContainerSize(shapeDefinition);

		maxWidth = shapeSizeWrapper.getWidth();
		maxHeight = shapeSizeWrapper.getHeigth();
		calculateSize(shapeDefinition.getShape());
	}

	private void findMaxMinPoint(int x, int y) {
		if (maxXtotal < x)
			maxXtotal = x;
		if (maxYtotal < y)
			maxYtotal = y;
		if (minXtotal > x)
			minXtotal = x;
		if (minYtotal > y)
			minYtotal = y;
	}

	private void calculateSize(EList<Shape> eList) {
		for (Shape s : eList) {
			if (s instanceof Line) {
				Line rr = (Line) s;
				EList<Point> p = rr.getLayout().getPoint();
				Point p2 = (Point) p.get(0);
				Point p3 = (Point) p.get(1);
				findMaxMinPoint(p2.getXcor(), p2.getYcor());
				findMaxMinPoint(p3.getXcor(), p3.getYcor());
			}
			if (s instanceof Polyline) {
				Polyline rr = (Polyline) s;
				int maxX = 0, minX = 0, maxY = 0, minY = 0;

				for (Point e : rr.getLayout().getPoint()) {
					if (minX > e.getXcor())
						minX = e.getXcor();
					if (minY > e.getYcor())
						minY = e.getYcor();
					if (maxX < e.getXcor())
						maxX = e.getXcor();
					if (maxY < e.getYcor())
						maxY = e.getYcor();
				}
				findMaxMinPoint(minX, minY);
				findMaxMinPoint(maxY, maxY);
			}
			if (s instanceof Text) {
				Text text = (Text) s;
				int minX = text.getLayout().getCommon().getXcor();
				int minY = text.getLayout().getCommon().getYcor();
				int maxX = text.getLayout().getCommon().getWidth()
						+ text.getLayout().getCommon().getXcor();
				int maxY = text.getLayout().getCommon().getHeigth()
						+ text.getLayout().getCommon().getYcor();
				findMaxMinPoint(minX, minY);
				findMaxMinPoint(maxX, maxY);
			}

			if (s instanceof Rectangle) {
				Rectangle rr = (Rectangle) s;
				calculateSize(rr.getShape());
			}
			if (s instanceof RoundedRectangle) {
				RoundedRectangle rr = (RoundedRectangle) s;
				calculateSize(rr.getShape());
			}
			if (s instanceof Polygon) {
				Polygon rr = (Polygon) s;
				calculateSize(rr.getShape());
			}
			if (s instanceof Ellipse) {
				Ellipse rr = (Ellipse) s;
				calculateSize(rr.getShape());
			}
		}

		sumWidth = maxXtotal - minXtotal;
		sumHeight = maxYtotal - minYtotal;
		
		if (maxWidth < sumWidth) {
			warning("The width of all subelements is bigger than max_width of the shape.",
					ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(sumWidth));
		}

		if (maxHeight < sumHeight) {
			warning("The height of all subelements is bigger than max_height of the shape.",
					ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(sumHeight));
		}

		sumWidth = 0;
		sumHeight = 0;
		maxXtotal = 0;
		minXtotal = 0;
		maxYtotal = 0;
		minYtotal = 0;
	}
}
