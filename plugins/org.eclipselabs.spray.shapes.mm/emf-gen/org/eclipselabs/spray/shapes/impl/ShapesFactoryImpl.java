/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.spray.shapes.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapesFactoryImpl extends EFactoryImpl implements ShapesFactory
{
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ShapesFactory init()
	{
        try {
            ShapesFactory theShapesFactory = (ShapesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/spray/shapes/Shape"); 
            if (theShapesFactory != null) {
                return theShapesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ShapesFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapesFactoryImpl()
	{
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass)
	{
        switch (eClass.getClassifierID()) {
            case ShapesPackage.SHAPE_CONTAINER: return createShapeContainer();
            case ShapesPackage.IMPORT: return createImport();
            case ShapesPackage.SHAPE_CONTAINER_ELEMENT: return createShapeContainerElement();
            case ShapesPackage.CONNECTION_DEFINITION: return createConnectionDefinition();
            case ShapesPackage.SHAPE_DEFINITION: return createShapeDefinition();
            case ShapesPackage.PLACING_DEFINITION: return createPlacingDefinition();
            case ShapesPackage.ANCHOR: return createAnchor();
            case ShapesPackage.ANCHOR_TYPE: return createAnchorType();
            case ShapesPackage.ANCHOR_PREDEFINIED: return createAnchorPredefinied();
            case ShapesPackage.ANCHOR_MANUAL: return createAnchorManual();
            case ShapesPackage.ANCHOR_POSITION: return createAnchorPosition();
            case ShapesPackage.ANCHOR_POSITION_POS: return createAnchorPositionPos();
            case ShapesPackage.ANCHOR_RELATIVE_POSITION: return createAnchorRelativePosition();
            case ShapesPackage.ANCHOR_FIX_POINT_POSITION: return createAnchorFixPointPosition();
            case ShapesPackage.SHAPE: return createShape();
            case ShapesPackage.SHAPE_CONNECTION: return createShapeConnection();
            case ShapesPackage.CD_LINE: return createCDLine();
            case ShapesPackage.CD_POLYLINE: return createCDPolyline();
            case ShapesPackage.CD_RECTANGLE: return createCDRectangle();
            case ShapesPackage.CD_ROUNDED_RECTANGLE: return createCDRoundedRectangle();
            case ShapesPackage.CD_POLYGON: return createCDPolygon();
            case ShapesPackage.CD_ELLIPSE: return createCDEllipse();
            case ShapesPackage.CD_TEXT: return createCDText();
            case ShapesPackage.LINE: return createLine();
            case ShapesPackage.POLYLINE: return createPolyline();
            case ShapesPackage.RECTANGLE: return createRectangle();
            case ShapesPackage.ROUNDED_RECTANGLE: return createRoundedRectangle();
            case ShapesPackage.POLYGON: return createPolygon();
            case ShapesPackage.ELLIPSE: return createEllipse();
            case ShapesPackage.TEXT: return createText();
            case ShapesPackage.COMPARTMENT_INFO: return createCompartmentInfo();
            case ShapesPackage.COMPARTMENT: return createCompartment();
            case ShapesPackage.COMPARTMENT_SHAPE: return createCompartmentShape();
            case ShapesPackage.COMPARTMENT_RECTANGLE: return createCompartmentRectangle();
            case ShapesPackage.COMPARTMENT_ROUNDED_RECTANGLE: return createCompartmentRoundedRectangle();
            case ShapesPackage.COMPARTMENT_POLYGON: return createCompartmentPolygon();
            case ShapesPackage.COMPARTMENT_ELLIPSE: return createCompartmentEllipse();
            case ShapesPackage.DESCRIPTION: return createDescription();
            case ShapesPackage.SHAPE_LAYOUT: return createShapeLayout();
            case ShapesPackage.RECTANGLE_ELLIPSE_LAYOUT: return createRectangleEllipseLayout();
            case ShapesPackage.LINE_LAYOUT: return createLineLayout();
            case ShapesPackage.POLY_LINE_LAYOUT: return createPolyLineLayout();
            case ShapesPackage.ROUNDED_RECTANGLE_LAYOUT: return createRoundedRectangleLayout();
            case ShapesPackage.TEXT_LAYOUT: return createTextLayout();
            case ShapesPackage.SHAPESTYLE_LAYOUT: return createShapestyleLayout();
            case ShapesPackage.SHAPE_STYLE_REF: return createShapeStyleRef();
            case ShapesPackage.COMMON_LAYOUT: return createCommonLayout();
            case ShapesPackage.TEXT_BODY: return createTextBody();
            case ShapesPackage.POINT: return createPoint();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
        switch (eDataType.getClassifierID()) {
            case ShapesPackage.COMPARTMENT_LAYOUT:
                return createCompartmentLayoutFromString(eDataType, initialValue);
            case ShapesPackage.HALIGN:
                return createHAlignFromString(eDataType, initialValue);
            case ShapesPackage.VALIGN:
                return createVAlignFromString(eDataType, initialValue);
            case ShapesPackage.CONNECTION_STYLE:
                return createConnectionStyleFromString(eDataType, initialValue);
            case ShapesPackage.ANCHOR_PREDEFINIED_ENUM:
                return createAnchorPredefiniedEnumFromString(eDataType, initialValue);
            case ShapesPackage.TEXT_TYPE:
                return createTextTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
        switch (eDataType.getClassifierID()) {
            case ShapesPackage.COMPARTMENT_LAYOUT:
                return convertCompartmentLayoutToString(eDataType, instanceValue);
            case ShapesPackage.HALIGN:
                return convertHAlignToString(eDataType, instanceValue);
            case ShapesPackage.VALIGN:
                return convertVAlignToString(eDataType, instanceValue);
            case ShapesPackage.CONNECTION_STYLE:
                return convertConnectionStyleToString(eDataType, instanceValue);
            case ShapesPackage.ANCHOR_PREDEFINIED_ENUM:
                return convertAnchorPredefiniedEnumToString(eDataType, instanceValue);
            case ShapesPackage.TEXT_TYPE:
                return convertTextTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeContainer createShapeContainer()
	{
        ShapeContainerImpl shapeContainer = new ShapeContainerImpl();
        return shapeContainer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Import createImport()
	{
        ImportImpl import_ = new ImportImpl();
        return import_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeContainerElement createShapeContainerElement()
	{
        ShapeContainerElementImpl shapeContainerElement = new ShapeContainerElementImpl();
        return shapeContainerElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectionDefinition createConnectionDefinition()
	{
        ConnectionDefinitionImpl connectionDefinition = new ConnectionDefinitionImpl();
        return connectionDefinition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeDefinition createShapeDefinition()
	{
        ShapeDefinitionImpl shapeDefinition = new ShapeDefinitionImpl();
        return shapeDefinition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PlacingDefinition createPlacingDefinition()
	{
        PlacingDefinitionImpl placingDefinition = new PlacingDefinitionImpl();
        return placingDefinition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Anchor createAnchor()
	{
        AnchorImpl anchor = new AnchorImpl();
        return anchor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorType createAnchorType()
	{
        AnchorTypeImpl anchorType = new AnchorTypeImpl();
        return anchorType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorPredefinied createAnchorPredefinied()
	{
        AnchorPredefiniedImpl anchorPredefinied = new AnchorPredefiniedImpl();
        return anchorPredefinied;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorManual createAnchorManual()
	{
        AnchorManualImpl anchorManual = new AnchorManualImpl();
        return anchorManual;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorPosition createAnchorPosition()
	{
        AnchorPositionImpl anchorPosition = new AnchorPositionImpl();
        return anchorPosition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorPositionPos createAnchorPositionPos()
	{
        AnchorPositionPosImpl anchorPositionPos = new AnchorPositionPosImpl();
        return anchorPositionPos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorRelativePosition createAnchorRelativePosition()
	{
        AnchorRelativePositionImpl anchorRelativePosition = new AnchorRelativePositionImpl();
        return anchorRelativePosition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorFixPointPosition createAnchorFixPointPosition()
	{
        AnchorFixPointPositionImpl anchorFixPointPosition = new AnchorFixPointPositionImpl();
        return anchorFixPointPosition;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shape createShape()
	{
        ShapeImpl shape = new ShapeImpl();
        return shape;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeConnection createShapeConnection()
	{
        ShapeConnectionImpl shapeConnection = new ShapeConnectionImpl();
        return shapeConnection;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDLine createCDLine()
	{
        CDLineImpl cdLine = new CDLineImpl();
        return cdLine;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDPolyline createCDPolyline()
	{
        CDPolylineImpl cdPolyline = new CDPolylineImpl();
        return cdPolyline;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDRectangle createCDRectangle()
	{
        CDRectangleImpl cdRectangle = new CDRectangleImpl();
        return cdRectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDRoundedRectangle createCDRoundedRectangle()
	{
        CDRoundedRectangleImpl cdRoundedRectangle = new CDRoundedRectangleImpl();
        return cdRoundedRectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDPolygon createCDPolygon()
	{
        CDPolygonImpl cdPolygon = new CDPolygonImpl();
        return cdPolygon;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDEllipse createCDEllipse()
	{
        CDEllipseImpl cdEllipse = new CDEllipseImpl();
        return cdEllipse;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CDText createCDText()
	{
        CDTextImpl cdText = new CDTextImpl();
        return cdText;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Line createLine()
	{
        LineImpl line = new LineImpl();
        return line;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Polyline createPolyline()
	{
        PolylineImpl polyline = new PolylineImpl();
        return polyline;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Rectangle createRectangle()
	{
        RectangleImpl rectangle = new RectangleImpl();
        return rectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RoundedRectangle createRoundedRectangle()
	{
        RoundedRectangleImpl roundedRectangle = new RoundedRectangleImpl();
        return roundedRectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Polygon createPolygon()
	{
        PolygonImpl polygon = new PolygonImpl();
        return polygon;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Ellipse createEllipse()
	{
        EllipseImpl ellipse = new EllipseImpl();
        return ellipse;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Text createText()
	{
        TextImpl text = new TextImpl();
        return text;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentInfo createCompartmentInfo()
	{
        CompartmentInfoImpl compartmentInfo = new CompartmentInfoImpl();
        return compartmentInfo;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Compartment createCompartment()
	{
        CompartmentImpl compartment = new CompartmentImpl();
        return compartment;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentShape createCompartmentShape()
	{
        CompartmentShapeImpl compartmentShape = new CompartmentShapeImpl();
        return compartmentShape;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentRectangle createCompartmentRectangle()
	{
        CompartmentRectangleImpl compartmentRectangle = new CompartmentRectangleImpl();
        return compartmentRectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentRoundedRectangle createCompartmentRoundedRectangle()
	{
        CompartmentRoundedRectangleImpl compartmentRoundedRectangle = new CompartmentRoundedRectangleImpl();
        return compartmentRoundedRectangle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentPolygon createCompartmentPolygon()
	{
        CompartmentPolygonImpl compartmentPolygon = new CompartmentPolygonImpl();
        return compartmentPolygon;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentEllipse createCompartmentEllipse()
	{
        CompartmentEllipseImpl compartmentEllipse = new CompartmentEllipseImpl();
        return compartmentEllipse;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Description createDescription()
	{
        DescriptionImpl description = new DescriptionImpl();
        return description;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeLayout createShapeLayout()
	{
        ShapeLayoutImpl shapeLayout = new ShapeLayoutImpl();
        return shapeLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RectangleEllipseLayout createRectangleEllipseLayout()
	{
        RectangleEllipseLayoutImpl rectangleEllipseLayout = new RectangleEllipseLayoutImpl();
        return rectangleEllipseLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LineLayout createLineLayout()
	{
        LineLayoutImpl lineLayout = new LineLayoutImpl();
        return lineLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PolyLineLayout createPolyLineLayout()
	{
        PolyLineLayoutImpl polyLineLayout = new PolyLineLayoutImpl();
        return polyLineLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RoundedRectangleLayout createRoundedRectangleLayout()
	{
        RoundedRectangleLayoutImpl roundedRectangleLayout = new RoundedRectangleLayoutImpl();
        return roundedRectangleLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextLayout createTextLayout()
	{
        TextLayoutImpl textLayout = new TextLayoutImpl();
        return textLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapestyleLayout createShapestyleLayout()
	{
        ShapestyleLayoutImpl shapestyleLayout = new ShapestyleLayoutImpl();
        return shapestyleLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeStyleRef createShapeStyleRef()
	{
        ShapeStyleRefImpl shapeStyleRef = new ShapeStyleRefImpl();
        return shapeStyleRef;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CommonLayout createCommonLayout()
	{
        CommonLayoutImpl commonLayout = new CommonLayoutImpl();
        return commonLayout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextBody createTextBody()
	{
        TextBodyImpl textBody = new TextBodyImpl();
        return textBody;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Point createPoint()
	{
        PointImpl point = new PointImpl();
        return point;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CompartmentLayout createCompartmentLayoutFromString(EDataType eDataType, String initialValue)
	{
        CompartmentLayout result = CompartmentLayout.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertCompartmentLayoutToString(EDataType eDataType, Object instanceValue)
	{
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HAlign createHAlignFromString(EDataType eDataType, String initialValue)
	{
        HAlign result = HAlign.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertHAlignToString(EDataType eDataType, Object instanceValue)
	{
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public VAlign createVAlignFromString(EDataType eDataType, String initialValue)
	{
        VAlign result = VAlign.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertVAlignToString(EDataType eDataType, Object instanceValue)
	{
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectionStyle createConnectionStyleFromString(EDataType eDataType, String initialValue)
	{
        ConnectionStyle result = ConnectionStyle.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertConnectionStyleToString(EDataType eDataType, Object instanceValue)
	{
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AnchorPredefiniedEnum createAnchorPredefiniedEnumFromString(EDataType eDataType, String initialValue)
	{
        AnchorPredefiniedEnum result = AnchorPredefiniedEnum.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertAnchorPredefiniedEnumToString(EDataType eDataType, Object instanceValue)
	{
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TextType createTextTypeFromString(EDataType eDataType, String initialValue)
	{
        TextType result = TextType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertTextTypeToString(EDataType eDataType, Object instanceValue)
	{
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapesPackage getShapesPackage()
	{
        return (ShapesPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static ShapesPackage getPackage()
	{
        return ShapesPackage.eINSTANCE;
    }

} //ShapesFactoryImpl
