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

    private int         maxWidth  = 0;
    private int         maxHeight = 0;
    private int         sumWidth  = 0;
    private int         sumHeight = 0;

    private int         maxXtotal = 0;
    private int         minXtotal = 0;
    private int         maxYtotal = 0;
    private int         minYtotal = 0;

    
    // check if an anchor is in the defined shape area
    @Check
    void checkShapeAnchorPosition(AnchorPositionPos pos) {
    	EObject eObject = pos.eContainer();
        while (!(eObject instanceof ShapeDefinition)) {
            eObject = eObject.eContainer();
        }
        ShapeDefinition shapeDefinition = (ShapeDefinition) eObject;

        if(pos instanceof AnchorFixPointPosition) {
        	AnchorFixPointPosition positionFix = (AnchorFixPointPosition) pos;
        	checkAreaFix(shapeDefinition,positionFix);
        }
        
        if(pos instanceof AnchorRelativePosition) {
        	AnchorRelativePosition positionRel = (AnchorRelativePosition) pos;
        	checkAreaRelative(shapeDefinition,positionRel);
        }
    }
    
    private void checkAreaFix(ShapeDefinition s, AnchorFixPointPosition pos) {
    	ShapeSizeWrapper shapeSizeWrapper = sizeCalculator.getContainerSize(s);
        maxWidth = shapeSizeWrapper.getWidth();
        maxHeight = shapeSizeWrapper.getHeigth();
    	
        if( pos.getXcor() > maxWidth) {
        	warning("the x coordinate from anchor is specified out of the shape area", ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION__XCOR, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getXcor()));
        }
        
        if( pos.getYcor() > maxHeight) {
        	warning("the y coordinate from anchor is specified out of the shape area", ShapesPackage.Literals.ANCHOR_FIX_POINT_POSITION__YCOR, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getYcor()));
        }
	}
    
    private void checkAreaRelative(ShapeDefinition s, AnchorRelativePosition pos) {
        if( pos.getXoffset() > 1.0) {
        	warning("the x offset from anchor is specified out of the shape area", ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION__XOFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getXoffset()));
        }
        
        if( pos.getYoffset() > 1.0) {
        	warning("the y offset from anchor is specified out of the shape area", ShapesPackage.Literals.ANCHOR_RELATIVE_POSITION__YOFFSET, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(pos.getYoffset()));
        }
	}
    
    // check the curve parameter of a rounded rectangle
    @Check
    void checkShapeRoundedRectangleCurve(RoundedRectangleLayout roundrec) {
        int curveh = roundrec.getCurveHeight();
        if (curveh == 0) {
            warning("if the curveheight parameter 0 the rounding have no effect", ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(curveh));
        }

        int curvew = roundrec.getCurveWidth();
        if (curvew == 0) {
            warning("if a curvewidth parameter 0 the rounding have no effect", ShapesPackage.Literals.ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(curvew));
        }
    }

    // check the height and width of the common layout consists of size/position
    @Check
    void checkShapeCommonNullSize(CommonLayout layout) {
        int height = layout.getHeigth();
        if (height == 0) {
            warning("the height should not be 0 ", ShapesPackage.Literals.COMMON_LAYOUT__HEIGTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(height));
        }

        int width = layout.getWidth();
        if (width == 0) {
            warning("the width should not be 0 ", ShapesPackage.Literals.COMMON_LAYOUT__WIDTH, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(width));
        }
    }

    // checks if the x and y distance is above 0 
    @Check
    void checkShapeLineNullSize(LineLayout line) {
        Point start = line.getPoint().get(0);
        Point end = line.getPoint().get(1);
        int diffx = Math.abs(start.getXcor() - end.getXcor());
        int diffy = Math.abs(start.getYcor() - end.getYcor());

        if (diffx == 0 && diffy == 0) {
            warning("the start and end point should have different x/y coordinates", ShapesPackage.Literals.LINE_LAYOUT__LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf("(" + start.getXcor() + " " + end.getXcor() + ") (" + start.getXcor() + " " + end.getXcor() + ")"));
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
            warning("all points should have different x/y coordinates", ShapesPackage.Literals.POLY_LINE_LAYOUT__LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf("(" + minX + " " + maxX + ") (" + minY + " " + maxY + ")"));
        }
    }

    // checks if the id of the description field has been already used
    @Check
    public void checkShapeTextSameId(Description body) {
        EObject eObject = body.eContainer();
        while (!(eObject instanceof ShapeDefinition)) {
            eObject = eObject.eContainer();
        }
        ShapeDefinition shapeDefinition = (ShapeDefinition) eObject;
        String currentId = body.getBody().getValue();
        List<String> textElements = getTextIdsForShapeDefinition(shapeDefinition);
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.DESCRIPTION__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    // checks if the id of the text field has been already used
    @Check
    public void checkShapeTextSameId(Text body) {
        EObject eObject = body.eContainer();
        while (!(eObject instanceof ShapeDefinition)) {
            eObject = eObject.eContainer();
        }
        ShapeDefinition shapeDefinition = (ShapeDefinition) eObject;
        String currentId = body.getBody().getValue();
        List<String> textElements = getTextIdsForShapeDefinition(shapeDefinition);
        int count = Collections.frequency(textElements, currentId);
        if (count > 1) {
            error("The same id is already been used by an other element.", ShapesPackage.Literals.TEXT__BODY, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(currentId));
        }
    }

    // checks if the textfields has the same id`s
    @Check
    public void checkShapeTextSameId(CDText body) {
        EObject eObject = body.eContainer();
        while (!(eObject instanceof ConnectionDefinition)) {
            eObject = eObject.eContainer();
        }
        ConnectionDefinition connectionDefinition = (ConnectionDefinition) eObject;
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

    // checks if the inner elements fit to the outer elementsize
    @Check
    public void checkShapeDefinitionSize(ShapeDefinition shapeDefinition) {
        ShapeSizeWrapper shapeSizeWrapper = sizeCalculator.getContainerSize(shapeDefinition);

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
                int maxX = text.getLayout().getCommon().getWidth() + text.getLayout().getCommon().getXcor();
                int maxY = text.getLayout().getCommon().getHeigth() + text.getLayout().getCommon().getYcor();
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
            warning("The width of all subelements is bigger than max_width of the shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE_LAYOUT, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumWidth));
        }

        if (maxHeight < sumHeight) {
            warning("The height of all subelements is bigger than max_height of the shape.", ShapesPackage.Literals.SHAPE_DEFINITION__SHAPE, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, String.valueOf(sumHeight));
        }

        sumWidth = 0;
        sumHeight = 0;
        maxXtotal = 0;
        minXtotal = 0;
        maxYtotal = 0;
        minYtotal = 0;
    }
}
