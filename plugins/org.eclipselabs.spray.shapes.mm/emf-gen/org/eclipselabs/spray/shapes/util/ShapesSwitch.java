/**
 */
package org.eclipselabs.spray.shapes.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.spray.shapes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.ShapesPackage
 * @generated
 */
public class ShapesSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ShapesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ShapesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ShapesPackage.SHAPE_CONTAINER:
			{
				ShapeContainer shapeContainer = (ShapeContainer)theEObject;
				T result = caseShapeContainer(shapeContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.IMPORT:
			{
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPE_CONTAINER_ELEMENT:
			{
				ShapeContainerElement shapeContainerElement = (ShapeContainerElement)theEObject;
				T result = caseShapeContainerElement(shapeContainerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CONNECTION_DEFINITION:
			{
				ConnectionDefinition connectionDefinition = (ConnectionDefinition)theEObject;
				T result = caseConnectionDefinition(connectionDefinition);
				if (result == null) result = caseShapeContainerElement(connectionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPE_DEFINITION:
			{
				ShapeDefinition shapeDefinition = (ShapeDefinition)theEObject;
				T result = caseShapeDefinition(shapeDefinition);
				if (result == null) result = caseShapeContainerElement(shapeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.PLACING_DEFINITION:
			{
				PlacingDefinition placingDefinition = (PlacingDefinition)theEObject;
				T result = casePlacingDefinition(placingDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR:
			{
				Anchor anchor = (Anchor)theEObject;
				T result = caseAnchor(anchor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_TYPE:
			{
				AnchorType anchorType = (AnchorType)theEObject;
				T result = caseAnchorType(anchorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_PREDEFINIED:
			{
				AnchorPredefinied anchorPredefinied = (AnchorPredefinied)theEObject;
				T result = caseAnchorPredefinied(anchorPredefinied);
				if (result == null) result = caseAnchorType(anchorPredefinied);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_MANUAL:
			{
				AnchorManual anchorManual = (AnchorManual)theEObject;
				T result = caseAnchorManual(anchorManual);
				if (result == null) result = caseAnchorType(anchorManual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_POSITION:
			{
				AnchorPosition anchorPosition = (AnchorPosition)theEObject;
				T result = caseAnchorPosition(anchorPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_POSITION_POS:
			{
				AnchorPositionPos anchorPositionPos = (AnchorPositionPos)theEObject;
				T result = caseAnchorPositionPos(anchorPositionPos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_RELATIVE_POSITION:
			{
				AnchorRelativePosition anchorRelativePosition = (AnchorRelativePosition)theEObject;
				T result = caseAnchorRelativePosition(anchorRelativePosition);
				if (result == null) result = caseAnchorPositionPos(anchorRelativePosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ANCHOR_FIX_POINT_POSITION:
			{
				AnchorFixPointPosition anchorFixPointPosition = (AnchorFixPointPosition)theEObject;
				T result = caseAnchorFixPointPosition(anchorFixPointPosition);
				if (result == null) result = caseAnchorPositionPos(anchorFixPointPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPE:
			{
				Shape shape = (Shape)theEObject;
				T result = caseShape(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPE_CONNECTION:
			{
				ShapeConnection shapeConnection = (ShapeConnection)theEObject;
				T result = caseShapeConnection(shapeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_LINE:
			{
				CDLine cdLine = (CDLine)theEObject;
				T result = caseCDLine(cdLine);
				if (result == null) result = caseShapeConnection(cdLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_POLYLINE:
			{
				CDPolyline cdPolyline = (CDPolyline)theEObject;
				T result = caseCDPolyline(cdPolyline);
				if (result == null) result = caseShapeConnection(cdPolyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_RECTANGLE:
			{
				CDRectangle cdRectangle = (CDRectangle)theEObject;
				T result = caseCDRectangle(cdRectangle);
				if (result == null) result = caseShapeConnection(cdRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_ROUNDED_RECTANGLE:
			{
				CDRoundedRectangle cdRoundedRectangle = (CDRoundedRectangle)theEObject;
				T result = caseCDRoundedRectangle(cdRoundedRectangle);
				if (result == null) result = caseShapeConnection(cdRoundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_POLYGON:
			{
				CDPolygon cdPolygon = (CDPolygon)theEObject;
				T result = caseCDPolygon(cdPolygon);
				if (result == null) result = caseShapeConnection(cdPolygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_ELLIPSE:
			{
				CDEllipse cdEllipse = (CDEllipse)theEObject;
				T result = caseCDEllipse(cdEllipse);
				if (result == null) result = caseShapeConnection(cdEllipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.CD_TEXT:
			{
				CDText cdText = (CDText)theEObject;
				T result = caseCDText(cdText);
				if (result == null) result = caseShapeConnection(cdText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.LINE:
			{
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = caseShape(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.POLYLINE:
			{
				Polyline polyline = (Polyline)theEObject;
				T result = casePolyline(polyline);
				if (result == null) result = caseShape(polyline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.RECTANGLE:
			{
				Rectangle rectangle = (Rectangle)theEObject;
				T result = caseRectangle(rectangle);
				if (result == null) result = caseShape(rectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ROUNDED_RECTANGLE:
			{
				RoundedRectangle roundedRectangle = (RoundedRectangle)theEObject;
				T result = caseRoundedRectangle(roundedRectangle);
				if (result == null) result = caseShape(roundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.POLYGON:
			{
				Polygon polygon = (Polygon)theEObject;
				T result = casePolygon(polygon);
				if (result == null) result = caseShape(polygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ELLIPSE:
			{
				Ellipse ellipse = (Ellipse)theEObject;
				T result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.TEXT:
			{
				Text text = (Text)theEObject;
				T result = caseText(text);
				if (result == null) result = caseShape(text);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT_INFO:
			{
				CompartmentInfo compartmentInfo = (CompartmentInfo)theEObject;
				T result = caseCompartmentInfo(compartmentInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT:
			{
				Compartment compartment = (Compartment)theEObject;
				T result = caseCompartment(compartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT_SHAPE:
			{
				CompartmentShape compartmentShape = (CompartmentShape)theEObject;
				T result = caseCompartmentShape(compartmentShape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT_RECTANGLE:
			{
				CompartmentRectangle compartmentRectangle = (CompartmentRectangle)theEObject;
				T result = caseCompartmentRectangle(compartmentRectangle);
				if (result == null) result = caseCompartmentShape(compartmentRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE:
			{
				CompartmentRoundedRectangle compartmentRoundedRectangle = (CompartmentRoundedRectangle)theEObject;
				T result = caseCompartmentRoundedRectangle(compartmentRoundedRectangle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT_POLYGON:
			{
				CompartmentPolygon compartmentPolygon = (CompartmentPolygon)theEObject;
				T result = caseCompartmentPolygon(compartmentPolygon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMPARTMENT_ELLIPSE:
			{
				CompartmentEllipse compartmentEllipse = (CompartmentEllipse)theEObject;
				T result = caseCompartmentEllipse(compartmentEllipse);
				if (result == null) result = caseCompartmentShape(compartmentEllipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.DESCRIPTION:
			{
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPE_LAYOUT:
			{
				ShapeLayout shapeLayout = (ShapeLayout)theEObject;
				T result = caseShapeLayout(shapeLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT:
			{
				RectangleEllipseLayout rectangleEllipseLayout = (RectangleEllipseLayout)theEObject;
				T result = caseRectangleEllipseLayout(rectangleEllipseLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.LINE_LAYOUT:
			{
				LineLayout lineLayout = (LineLayout)theEObject;
				T result = caseLineLayout(lineLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.POLY_LINE_LAYOUT:
			{
				PolyLineLayout polyLineLayout = (PolyLineLayout)theEObject;
				T result = casePolyLineLayout(polyLineLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.ROUNDED_RECTANGLE_LAYOUT:
			{
				RoundedRectangleLayout roundedRectangleLayout = (RoundedRectangleLayout)theEObject;
				T result = caseRoundedRectangleLayout(roundedRectangleLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.TEXT_LAYOUT:
			{
				TextLayout textLayout = (TextLayout)theEObject;
				T result = caseTextLayout(textLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPESTYLE_LAYOUT:
			{
				ShapestyleLayout shapestyleLayout = (ShapestyleLayout)theEObject;
				T result = caseShapestyleLayout(shapestyleLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.SHAPE_STYLE_REF:
			{
				ShapeStyleRef shapeStyleRef = (ShapeStyleRef)theEObject;
				T result = caseShapeStyleRef(shapeStyleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.COMMON_LAYOUT:
			{
				CommonLayout commonLayout = (CommonLayout)theEObject;
				T result = caseCommonLayout(commonLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.TEXT_BODY:
			{
				TextBody textBody = (TextBody)theEObject;
				T result = caseTextBody(textBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ShapesPackage.POINT:
			{
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeContainer(ShapeContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Container Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Container Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeContainerElement(ShapeContainerElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionDefinition(ConnectionDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeDefinition(ShapeDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placing Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placing Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacingDefinition(PlacingDefinition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchor(Anchor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorType(AnchorType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Predefinied</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Predefinied</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorPredefinied(AnchorPredefinied object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorManual(AnchorManual object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorPosition(AnchorPosition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Position Pos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Position Pos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorPositionPos(AnchorPositionPos object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Relative Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Relative Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorRelativePosition(AnchorRelativePosition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anchor Fix Point Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anchor Fix Point Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnchorFixPointPosition(AnchorFixPointPosition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeConnection(ShapeConnection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDLine(CDLine object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPolyline(CDPolyline object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDRectangle(CDRectangle object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDRoundedRectangle(CDRoundedRectangle object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDPolygon(CDPolygon object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDEllipse(CDEllipse object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CD Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CD Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDText(CDText object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyline(Polyline object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangle(Rectangle object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedRectangle(RoundedRectangle object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygon(Polygon object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipse(Ellipse object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentInfo(CompartmentInfo object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartment(Compartment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentShape(CompartmentShape object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentRectangle(CompartmentRectangle object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Rounded Rectangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Rounded Rectangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentRoundedRectangle(CompartmentRoundedRectangle object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Polygon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentPolygon(CompartmentPolygon object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compartment Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compartment Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompartmentEllipse(CompartmentEllipse object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeLayout(ShapeLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle Ellipse Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle Ellipse Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangleEllipseLayout(RectangleEllipseLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineLayout(LineLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Line Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Line Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyLineLayout(PolyLineLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded Rectangle Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded Rectangle Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoundedRectangleLayout(RoundedRectangleLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextLayout(TextLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shapestyle Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shapestyle Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapestyleLayout(ShapestyleLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Style Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Style Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeStyleRef(ShapeStyleRef object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonLayout(CommonLayout object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBody(TextBody object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ShapesSwitch
