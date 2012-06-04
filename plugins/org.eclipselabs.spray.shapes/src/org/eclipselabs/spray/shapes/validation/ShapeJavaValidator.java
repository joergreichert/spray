package org.eclipselabs.spray.shapes.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.LineLayout;
import org.eclipselabs.spray.shapes.shapes.Point;
import org.eclipselabs.spray.shapes.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.shapes.Polygon;
import org.eclipselabs.spray.shapes.shapes.Polyline;
import org.eclipselabs.spray.shapes.shapes.Rectangle;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.shapes.RoundedRectangleLayout;
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

	private List<String> ids = new ArrayList<String>();

	@Check
	void checkShapeRoundedRectangleCurve(RoundedRectangleLayout roundrec) {
		int curveh = roundrec.getCurveHeight();
		if (curveh == 0) {
			warning("if the curveheight parameter 0 the rounding have no effect",
					ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(curveh));
		}

		int curvew = roundrec.getCurveWidth();
		if (curvew == 0) {
			warning("if a curvewidth parameter 0 the rounding have no effect",
					ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(curvew));
		}
	}

	@Check
	void checkShapeCommonNullSize(CommonLayout layout) {
		int height = layout.getHeigth();
		if (height == 0) {
			warning("the height should not be 0 ",
					ShapesPackage.Literals.COMMON_LAYOUT__HEIGTH,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(height));
		}

		int width = layout.getWidth();
		if (width == 0) {
			warning("the width should not be 0 ",
					ShapesPackage.Literals.COMMON_LAYOUT__WIDTH,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(width));
		}
	}

	@Check
	void checkShapeLineNullSize(LineLayout line) {
		Point start = line.getPoint().get(0);
		Point end = line.getPoint().get(1);
		int diffx = Math.abs(start.getXcor() - end.getXcor());
		int diffy = Math.abs(start.getYcor() - end.getYcor());

		if (diffx == 0 && diffy == 0) {
			warning("the start and end point should have different x/y coordinates",
					ShapesPackage.Literals.LINE_LAYOUT__LAYOUT,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf("(" + start.getXcor() + " " + end.getXcor()
							+ ") (" + start.getXcor() + " " + end.getXcor()
							+ ")"));
		}
	}

	@Check
	void checkShapePolylineNullSize(PolyLineLayout polyline) {
		int maxX = 0, minX = 0, maxY = 0, minY = 0;
		for (Point e : polyline.getPoint()) {
			if (minX > e.getXcor())
				minX = e.getXcor();
			if (minY > e.getYcor())
				minY = e.getYcor();
			if (maxX < e.getXcor())
				maxX = e.getXcor();
			if (maxY < e.getYcor())
				maxY = e.getYcor();
		}
		int diffx = Math.abs(minX - maxX);
		int diffy = Math.abs(minY - maxY);

		if (diffx == 0 && diffy == 0) {
			warning("all points should have different x/y coordinates",
					ShapesPackage.Literals.POLY_LINE_LAYOUT__LAYOUT,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf("(" + minX + " " + maxX + ") (" + minY + " "
							+ maxY + ")"));
		}
	}

	@Check
	public void checkShapeTextSameId(Text body) {
		String id = body.getBody().getValue();
		if (!ids.contains(id)) {
			ids.add(id);
		} else {
			warning("same id is used by an other text element.",
					ShapesPackage.Literals.TEXT__BODY,
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX,
					String.valueOf(id));
		}
	}

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
					ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE,
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
