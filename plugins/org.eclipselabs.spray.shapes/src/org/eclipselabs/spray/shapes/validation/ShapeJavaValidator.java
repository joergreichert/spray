<<<<<<< HEAD
package org.eclipselabs.spray.shapes.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;
import org.eclipselabs.spray.shapes.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.shapes.CDText;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.shapes.Description;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.LineLayout;
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition;
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

    boolean             recursion   = false;
    private int         g_maxWidth  = 0;
    private int         g_maxHeight = 0;
    private int         maxWidth    = 0;
    private int         maxHeight   = 0;
    private int         sumWidth    = 0;
    private int         sumHeight   = 0;

    private int         maxXtotal   = 0;
    private int         minXtotal   = 0;
    private int         maxYtotal   = 0;
    private int         minYtotal   = 0;

    private void calculateBasicCase(CommonLayout commonLayout) {
        findMaxMinPoint(commonLayout.getXcor(), commonLayout.getYcor());
        findMaxMinPoint(commonLayout.getXcor() + commonLayout.getWidth(), commonLayout.getYcor() + commonLayout.getHeigth());
    }

    private void calculatePoly(int maxX, int minX, int maxY, int minY, EList<Point> points) {
        for (Point e : points) {
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
        findMaxMinPoint(maxX, maxY);
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
                Polyline polyline = (Polyline) s;
                int maxX = 0, minX = 0, maxY = 0, minY = 0;
                EList<Point> points = polyline.getLayout().getPoint();
                calculatePoly(maxX, minX, maxY, minY, points);
            }

            if (s instanceof Polygon) {
                Polygon polygon = (Polygon) s;
                int maxX = 0, minX = 0, maxY = 0, minY = 0;
                EList<Point> points = polygon.getLayout().getPoint();
                calculatePoly(maxX, minX, maxY, minY, points);
            }

            if (s instanceof Text) {
                Text text = (Text) s;
                CommonLayout commonLayout = text.getLayout().getCommon();

                int minX = commonLayout.getXcor();
                int minY = commonLayout.getYcor();
                int maxX = commonLayout.getWidth() + commonLayout.getXcor();
                int maxY = commonLayout.getHeigth() + commonLayout.getYcor();
                findMaxMinPoint(minX, minY);
                findMaxMinPoint(maxX, maxY);
            }

            if (s instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) s;
                CommonLayout commonLayout = rectangle.getLayout().getCommon();
                if (rectangle.getShape().size() > 0) {
                    recursion = true;
                    maxWidth = commonLayout.getXcor() + commonLayout.getWidth();
                    maxHeight = commonLayout.getYcor() + commonLayout.getHeigth();
                    calculateSize(rectangle.getShape());
                } else {
                    calculateBasicCase(commonLayout);
                }

            }
            if (s instanceof RoundedRectangle) {
                RoundedRectangle roundedrectangle = (RoundedRectangle) s;
                CommonLayout commonLayout = roundedrectangle.getLayout().getCommon();
                if (roundedrectangle.getShape().size() > 0) {
                    recursion = true;
                    maxWidth = commonLayout.getXcor() + commonLayout.getWidth();
                    maxHeight = commonLayout.getYcor() + commonLayout.getHeigth();
                    calculateSize(roundedrectangle.getShape());
                } else {
                    calculateBasicCase(commonLayout);
                }
            }

            if (s instanceof Ellipse) {
                Ellipse ellipse = (Ellipse) s;
                CommonLayout commonLayout = ellipse.getLayout().getCommon();
                if (ellipse.getShape().size() > 0) {
                    recursion = true;
                    maxWidth = commonLayout.getXcor() + commonLayout.getWidth();
                    maxHeight = commonLayout.getYcor() + commonLayout.getHeigth();
                    calculateSize(ellipse.getShape());
                } else {
                    calculateBasicCase(commonLayout);
                }
            }
            sumWidth = maxXtotal - minXtotal;
            sumHeight = maxYtotal - minYtotal;
        }

        if (maxWidth < sumWidth) {
            warning("The width of all subelements is bigger than max_width of the shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumWidth));
        }

        if (maxHeight < sumHeight) {
            warning("The height of all subelements is bigger than max_height of the shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumHeight));
        }

        if (g_maxWidth < maxWidth && recursion) {
            warning("The width of all subelements is bigger than global width of the complete shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumWidth));
        }

        if (g_maxHeight < maxHeight && recursion) {
            warning("The height of all subelements is bigger than global width of the complete shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumHeight));
        }

        recursion = false;
        sumWidth = 0;
        sumHeight = 0;
        maxXtotal = 0;
        minXtotal = 0;
        maxYtotal = 0;
        minYtotal = 0;
    }

    private void checkAreaFix(ShapeDefinition s, AnchorFixPointPosition pos) {
        ShapeSizeWrapper shapeSizeWrapper = sizeCalculator.getContainerSize(s);
        maxWidth = shapeSizeWrapper.getWidth();
        maxHeight = shapeSizeWrapper.getHeigth();
        if (pos.getXcor() > maxWidth) {
            error("This anchor coordinate (x) is specified out of the shape area.", ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION__XCOR, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getXcor()));
        }
        if (pos.getYcor() > maxHeight) {
            error("This anchor coordinate (y) is specified out of the shape area.", ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION__YCOR, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getYcor()));
        }
    }

    private void checkAreaRelative(ShapeDefinition s, AnchorRelativePosition pos) {
        if (pos.getXoffset() < 0.0 || pos.getXoffset() > 1.0) {
            error("The anchor offset (xoffset) should be defined in the range 0.0 and 1.0.", ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getXoffset()));
        }
        if (pos.getYoffset() < 0.0 || pos.getYoffset() > 1.0) {
            error("The anchor offset (yoffset) should be defined in the range 0.0 and 1.0.", ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getYoffset()));
        }
    }

    /**
     * check if an anchor is in the defined shape area
     * 
     * @param pos
     */
    @Check
    void checkShapeAnchorPosition(AnchorPositionPos pos) {
        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(pos);
        if (pos instanceof AnchorFixPointPosition) {
            AnchorFixPointPosition positionFix = (AnchorFixPointPosition) pos;
            checkAreaFix(shapeDefinition, positionFix);
        }
        if (pos instanceof AnchorRelativePosition) {
            AnchorRelativePosition positionRel = (AnchorRelativePosition) pos;
            checkAreaRelative(shapeDefinition, positionRel);
        }
    }

    /**
     * check the height and width of the common layout consists of size/position
     * 
     * @param layout
     */
    @Check
    void checkShapeCommonNullSize(CommonLayout layout) {
        int width = layout.getWidth();
        int height = layout.getHeigth();
        if (width == 0) {
            warning("The width should not be 0.", ShapesPackage.Literals.COMMON_LAYOUT__WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(width));
        }
        if (height == 0) {
            warning("The height should not be 0.", ShapesPackage.Literals.COMMON_LAYOUT__HEIGTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(height));
        }
    }

    /**
     * checks if the inner elements fit to the outer element size
     * 
     * @param shapeDefinition
     */
    @Check
    void checkShapeDefinitionSize(ShapeDefinition shapeDefinition) {
        //        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(shape);
        ShapeSizeWrapper shapeSizeWrapper = sizeCalculator.getContainerSize(shapeDefinition);
        g_maxWidth = shapeSizeWrapper.getWidth();
        g_maxHeight = shapeSizeWrapper.getHeigth();
        maxWidth = g_maxWidth;
        maxHeight = g_maxWidth;
        calculateSize(shapeDefinition.getShape());
    }

    /**
     * checks if the x and y distance is above 0
     * 
     * @param line
     */
    @Check
    void checkShapeLineNullSize(LineLayout line) {
        Point start = line.getPoint().get(0);
        Point end = line.getPoint().get(1);
        int diffx = Math.abs(start.getXcor() - end.getXcor());
        int diffy = Math.abs(start.getYcor() - end.getYcor());
        if (diffx == 0 && diffy == 0) {
            warning("The start and end point should have different x/y coordinates.", ShapesPackage.Literals.LINE_LAYOUT__LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf("(" + start.getXcor() + " " + end.getXcor() + ") (" + start.getXcor() + " " + end.getXcor() + ")"));
        }
    }

    // checks if the x and y distance of all points is above 0 
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
            warning("The points should have different x/y coordinates.", ShapesPackage.Literals.POLY_LINE_LAYOUT__LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf("(" + minX + " " + maxX + ") (" + minY + " " + maxY + ")"));
        }
    }

    /**
     * check the curve parameter of a rounded rectangle
     * 
     * @param roundrec
     */
    @Check
    void checkShapeRoundedRectangleCurve(RoundedRectangleLayout roundrec) {
        int curveh = roundrec.getCurveHeight();
        int curvew = roundrec.getCurveWidth();
        if (curveh == 0) {
            warning("A curve parameter of 0 doesn't have any effect on the rounding of a shape.", ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(curveh));
        }
        if (curvew == 0) {
            warning("A curve parameter of 0 doesn't have any effect on the rounding of a shape.", ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(curvew));
        }
    }

    /**
     * checks if the text fields have the same id
     * 
     * @param body
     */
    @Check
    public void checkShapeTextSameId(CDText body) {
        ConnectionDefinition connectionDefinition = fetchConnectionDefinitionForEObject(body);
        String currentId = body.getBody().getValue();
        List<String> textElements = new ArrayList<String>();
        for (PlacingDefinition placingDefinition : connectionDefinition.getPlacing()) {
            if (placingDefinition.getShapeCon() instanceof CDText) {
                textElements.add(((CDText) placingDefinition.getShapeCon()).getBody().getValue());
            }
        }
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.CD_TEXT__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    /**
     * checks if the id of the description field has been already used
     * 
     * @param body
     */
    @Check
    void checkShapeTextSameId(Description body) {
        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(body);
        String currentId = body.getBody().getValue();
        List<String> textElements = getTextIdsForShapeDefinition(shapeDefinition);
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.DESCRIPTION__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    /**
     * checks if the id of the text field has been already used
     * 
     * @param body
     */
    @Check
    void checkShapeTextSameId(Text body) {
        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(body);
        String currentId = body.getBody().getValue();
        List<String> textElements = getTextIdsForShapeDefinition(shapeDefinition);
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.TEXT__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    private ConnectionDefinition fetchConnectionDefinitionForEObject(EObject startObject) {
        EObject eObject = startObject.eContainer();
        while (!(eObject instanceof ConnectionDefinition)) {
            eObject = eObject.eContainer();
        }
        ConnectionDefinition connectionDefinition = (ConnectionDefinition) eObject;
        return connectionDefinition;
    }

    private ShapeDefinition fetchShapeDefinitionForEObject(EObject startObject) {
        EObject eObject = startObject.eContainer();
        while (!(eObject instanceof ShapeDefinition)) {
            eObject = eObject.eContainer();
        }
        ShapeDefinition shapeDefinition = (ShapeDefinition) eObject;
        return shapeDefinition;
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

    private List<String> getTextIdsForShapeDefinition(ShapeDefinition shapeDefinition) {
        List<String> textElements = new ArrayList<String>();
        for (Shape shape : shapeDefinition.getShape()) {
            textElements.addAll(getTextIdsForShapeDefinitionShape(shape));
        }
        if (shapeDefinition.getDescription() != null) {
            textElements.add(shapeDefinition.getDescription().getBody().getValue());
        }
        return textElements;
    }

    private List<String> getTextIdsForShapeDefinitionShape(Shape shape) {
        List<String> textElements = new ArrayList<String>();
        if (shape instanceof Text) {
            textElements.add(((Text) shape).getBody().getValue());
        } else if (shape instanceof Rectangle) {
            for (Shape innerShape : ((Rectangle) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        } else if (shape instanceof RoundedRectangle) {
            for (Shape innerShape : ((RoundedRectangle) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        } else if (shape instanceof Ellipse) {
            for (Shape innerShape : ((Ellipse) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        } else if (shape instanceof Polygon) {
            for (Shape innerShape : ((Polygon) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        }
        return textElements;
    }
}
=======
package org.eclipselabs.spray.shapes.validation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeCalculator;
import org.eclipselabs.spray.shapes.generator.util.ShapeSizeWrapper;
import org.eclipselabs.spray.shapes.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.shapes.CDText;
import org.eclipselabs.spray.shapes.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.shapes.Description;
import org.eclipselabs.spray.shapes.shapes.Ellipse;
import org.eclipselabs.spray.shapes.shapes.Line;
import org.eclipselabs.spray.shapes.shapes.LineLayout;
import org.eclipselabs.spray.shapes.shapes.PlacingDefinition;
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

    boolean             recursion   = false;
    private int         g_maxWidth  = 0;
    private int         g_maxHeight = 0;
    private int         maxWidth    = 0;
    private int         maxHeight   = 0;
    private int         sumWidth    = 0;
    private int         sumHeight   = 0;

    private int         maxXtotal   = 0;
    private int         minXtotal   = 0;
    private int         maxYtotal   = 0;
    private int         minYtotal   = 0;

    private void calculateBasicCase(CommonLayout commonLayout) {
        findMaxMinPoint(commonLayout.getXcor(), commonLayout.getYcor());
        findMaxMinPoint(commonLayout.getXcor() + commonLayout.getWidth(), commonLayout.getYcor() + commonLayout.getHeigth());
    }

    private void calculatePoly(int maxX, int minX, int maxY, int minY, EList<Point> points) {
        for (Point e : points) {
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
        findMaxMinPoint(maxX, maxY);
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
                Polyline polyline = (Polyline) s;
                int maxX = 0, minX = 0, maxY = 0, minY = 0;
                EList<Point> points = polyline.getLayout().getPoint();
                calculatePoly(maxX, minX, maxY, minY, points);
            }

            if (s instanceof Polygon) {
                Polygon polygon = (Polygon) s;
                int maxX = 0, minX = 0, maxY = 0, minY = 0;
                EList<Point> points = polygon.getLayout().getPoint();
                calculatePoly(maxX, minX, maxY, minY, points);
            }

            if (s instanceof Text) {
                Text text = (Text) s;
                CommonLayout commonLayout = text.getLayout().getCommon();

                int minX = commonLayout.getXcor();
                int minY = commonLayout.getYcor();
                int maxX = commonLayout.getWidth() + commonLayout.getXcor();
                int maxY = commonLayout.getHeigth() + commonLayout.getYcor();
                findMaxMinPoint(minX, minY);
                findMaxMinPoint(maxX, maxY);
            }

            if (s instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) s;
                CommonLayout commonLayout = rectangle.getLayout().getCommon();
                if (rectangle.getShape().size() > 0) {
                    recursion = true;
                    maxWidth = commonLayout.getXcor() + commonLayout.getWidth();
                    maxHeight = commonLayout.getYcor() + commonLayout.getHeigth();
                    calculateSize(rectangle.getShape());
                } else {
                    calculateBasicCase(commonLayout);
                }

            }
            if (s instanceof RoundedRectangle) {
                RoundedRectangle roundedrectangle = (RoundedRectangle) s;
                CommonLayout commonLayout = roundedrectangle.getLayout().getCommon();
                if (roundedrectangle.getShape().size() > 0) {
                    recursion = true;
                    maxWidth = commonLayout.getXcor() + commonLayout.getWidth();
                    maxHeight = commonLayout.getYcor() + commonLayout.getHeigth();
                    calculateSize(roundedrectangle.getShape());
                } else {
                    calculateBasicCase(commonLayout);
                }
            }

            if (s instanceof Ellipse) {
                Ellipse ellipse = (Ellipse) s;
                CommonLayout commonLayout = ellipse.getLayout().getCommon();
                if (ellipse.getShape().size() > 0) {
                    recursion = true;
                    maxWidth = commonLayout.getXcor() + commonLayout.getWidth();
                    maxHeight = commonLayout.getYcor() + commonLayout.getHeigth();
                    calculateSize(ellipse.getShape());
                } else {
                    calculateBasicCase(commonLayout);
                }
            }
            sumWidth = maxXtotal - minXtotal;
            sumHeight = maxYtotal - minYtotal;
        }

        if (maxWidth < sumWidth) {
            warning("The width of all subelements is bigger than max_width of the shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumWidth));
        }

        if (maxHeight < sumHeight) {
            warning("The height of all subelements is bigger than max_height of the shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumHeight));
        }

        if (g_maxWidth < maxWidth && recursion) {
            warning("The width of all subelements is bigger than global width of the complete shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumWidth));
        }

        if (g_maxHeight < maxHeight && recursion) {
            warning("The height of all subelements is bigger than global width of the complete shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumHeight));
        }

        recursion = false;
        sumWidth = 0;
        sumHeight = 0;
        maxXtotal = 0;
        minXtotal = 0;
        maxYtotal = 0;
        minYtotal = 0;
    }

    private void checkAreaFix(ShapeDefinition s, AnchorFixPointPosition pos) {
        ShapeSizeWrapper shapeSizeWrapper = sizeCalculator.getContainerSize(s);
        maxWidth = shapeSizeWrapper.getWidth();
        maxHeight = shapeSizeWrapper.getHeigth();
        if (pos.getXcor() > maxWidth) {
            error("This anchor coordinate (x) is specified out of the shape area.", ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION__XCOR, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getXcor()));
        }
        if (pos.getYcor() > maxHeight) {
            error("This anchor coordinate (y) is specified out of the shape area.", ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION__YCOR, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getYcor()));
        }
    }

    private void checkAreaRelative(ShapeDefinition s, AnchorRelativePosition pos) {
        if (pos.getXoffset() < 0.0 || pos.getXoffset() > 1.0) {
            error("The anchor offset (xoffset) should be defined in the range 0.0 and 1.0.", ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getXoffset()));
        }
        if (pos.getYoffset() < 0.0 || pos.getYoffset() > 1.0) {
            error("The anchor offset (yoffset) should be defined in the range 0.0 and 1.0.", ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getYoffset()));
        }
    }

    /**
     * check if an anchor is in the defined shape area
     * 
     * @param pos
     */
    @Check
    void checkShapeAnchorPosition(AnchorPositionPos pos) {
        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(pos);
        if (pos instanceof AnchorFixPointPosition) {
            AnchorFixPointPosition positionFix = (AnchorFixPointPosition) pos;
            checkAreaFix(shapeDefinition, positionFix);
        }
        if (pos instanceof AnchorRelativePosition) {
            AnchorRelativePosition positionRel = (AnchorRelativePosition) pos;
            checkAreaRelative(shapeDefinition, positionRel);
        }
    }

    /**
     * check the height and width of the common layout consists of size/position
     * 
     * @param layout
     */
    @Check
    void checkShapeCommonNullSize(CommonLayout layout) {
        int width = layout.getWidth();
        int height = layout.getHeigth();
        if (width == 0) {
            warning("The width should not be 0.", ShapesPackage.Literals.COMMON_LAYOUT__WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(width));
        }
        if (height == 0) {
            warning("The height should not be 0.", ShapesPackage.Literals.COMMON_LAYOUT__HEIGTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(height));
        }
    }

    /**
     * checks if the inner elements fit to the outer element size
     * 
     * @param shapeDefinition
     */
    @Check
    void checkShapeDefinitionSize(ShapeDefinition shapeDefinition) {
        //        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(shape);
        ShapeSizeWrapper shapeSizeWrapper = sizeCalculator.getContainerSize(shapeDefinition);
        g_maxWidth = shapeSizeWrapper.getWidth();
        g_maxHeight = shapeSizeWrapper.getHeigth();
        maxWidth = g_maxWidth;
        maxHeight = g_maxWidth;
        calculateSize(shapeDefinition.getShape());
    }

    /**
     * checks if the x and y distance is above 0
     * 
     * @param line
     */
    @Check
    void checkShapeLineNullSize(LineLayout line) {
        Point start = line.getPoint().get(0);
        Point end = line.getPoint().get(1);
        int diffx = Math.abs(start.getXcor() - end.getXcor());
        int diffy = Math.abs(start.getYcor() - end.getYcor());
        if (diffx == 0 && diffy == 0) {
            warning("The start and end point should have different x/y coordinates.", ShapesPackage.Literals.LINE_LAYOUT__LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf("(" + start.getXcor() + " " + end.getXcor() + ") (" + start.getXcor() + " " + end.getXcor() + ")"));
        }
    }

    // checks if the x and y distance of all points is above 0 
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
            warning("The points should have different x/y coordinates.", ShapesPackage.Literals.POLY_LINE_LAYOUT__LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf("(" + minX + " " + maxX + ") (" + minY + " " + maxY + ")"));
        }
    }

    /**
     * check the curve parameter of a rounded rectangle
     * 
     * @param roundrec
     */
    @Check
    void checkShapeRoundedRectangleCurve(RoundedRectangleLayout roundrec) {
        int curveh = roundrec.getCurveHeight();
        int curvew = roundrec.getCurveWidth();
        if (curveh == 0) {
            warning("A curve parameter of 0 doesn't have any effect on the rounding of a shape.", ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(curveh));
        }
        if (curvew == 0) {
            warning("A curve parameter of 0 doesn't have any effect on the rounding of a shape.", ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(curvew));
        }
    }

    /**
     * checks if the text fields have the same id
     * 
     * @param body
     */
    @Check
    public void checkShapeTextSameId(CDText body) {
        ConnectionDefinition connectionDefinition = fetchConnectionDefinitionForEObject(body);
        String currentId = body.getBody().getValue();
        List<String> textElements = new ArrayList<String>();
        for (PlacingDefinition placingDefinition : connectionDefinition.getPlacing()) {
            if (placingDefinition.getShapeCon() instanceof CDText) {
                textElements.add(((CDText) placingDefinition.getShapeCon()).getBody().getValue());
            }
        }
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.CD_TEXT__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    /**
     * checks if the id of the description field has been already used
     * 
     * @param body
     */
    @Check
    void checkShapeTextSameId(Description body) {
        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(body);
        String currentId = body.getBody().getValue();
        List<String> textElements = getTextIdsForShapeDefinition(shapeDefinition);
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.DESCRIPTION__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    /**
     * checks if the id of the text field has been already used
     * 
     * @param body
     */
    @Check
    void checkShapeTextSameId(Text body) {
        ShapeDefinition shapeDefinition = fetchShapeDefinitionForEObject(body);
        String currentId = body.getBody().getValue();
        List<String> textElements = getTextIdsForShapeDefinition(shapeDefinition);
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.TEXT__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    private ConnectionDefinition fetchConnectionDefinitionForEObject(EObject startObject) {
        EObject eObject = startObject.eContainer();
        while (!(eObject instanceof ConnectionDefinition)) {
            eObject = eObject.eContainer();
        }
        ConnectionDefinition connectionDefinition = (ConnectionDefinition) eObject;
        return connectionDefinition;
    }

    private ShapeDefinition fetchShapeDefinitionForEObject(EObject startObject) {
        EObject eObject = startObject.eContainer();
        while (!(eObject instanceof ShapeDefinition)) {
            eObject = eObject.eContainer();
        }
        ShapeDefinition shapeDefinition = (ShapeDefinition) eObject;
        return shapeDefinition;
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

    private List<String> getTextIdsForShapeDefinition(ShapeDefinition shapeDefinition) {
        List<String> textElements = new ArrayList<String>();
        for (Shape shape : shapeDefinition.getShape()) {
            textElements.addAll(getTextIdsForShapeDefinitionShape(shape));
        }
        if (shapeDefinition.getDescription() != null) {
            textElements.add(shapeDefinition.getDescription().getBody().getValue());
        }
        return textElements;
    }

    private List<String> getTextIdsForShapeDefinitionShape(Shape shape) {
        List<String> textElements = new ArrayList<String>();
        if (shape instanceof Text) {
            textElements.add(((Text) shape).getBody().getValue());
        } else if (shape instanceof Rectangle) {
            for (Shape innerShape : ((Rectangle) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        } else if (shape instanceof RoundedRectangle) {
            for (Shape innerShape : ((RoundedRectangle) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        } else if (shape instanceof Ellipse) {
            for (Shape innerShape : ((Ellipse) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        } else if (shape instanceof Polygon) {
            for (Shape innerShape : ((Polygon) shape).getShape()) {
                textElements.addAll(getTextIdsForShapeDefinitionShape(innerShape));
            }
        }
        return textElements;
    }
}
>>>>>>> eclipse_juno
