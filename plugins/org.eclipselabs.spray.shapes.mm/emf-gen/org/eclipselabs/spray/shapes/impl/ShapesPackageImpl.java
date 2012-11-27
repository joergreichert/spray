/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipselabs.spray.shapes.Anchor;
import org.eclipselabs.spray.shapes.AnchorFixPointPosition;
import org.eclipselabs.spray.shapes.AnchorManual;
import org.eclipselabs.spray.shapes.AnchorPosition;
import org.eclipselabs.spray.shapes.AnchorPositionPos;
import org.eclipselabs.spray.shapes.AnchorPredefinied;
import org.eclipselabs.spray.shapes.AnchorPredefiniedEnum;
import org.eclipselabs.spray.shapes.AnchorRelativePosition;
import org.eclipselabs.spray.shapes.AnchorType;
import org.eclipselabs.spray.shapes.CDEllipse;
import org.eclipselabs.spray.shapes.CDLine;
import org.eclipselabs.spray.shapes.CDPolygon;
import org.eclipselabs.spray.shapes.CDPolyline;
import org.eclipselabs.spray.shapes.CDRectangle;
import org.eclipselabs.spray.shapes.CDRoundedRectangle;
import org.eclipselabs.spray.shapes.CDText;
import org.eclipselabs.spray.shapes.CommonLayout;
import org.eclipselabs.spray.shapes.Compartment;
import org.eclipselabs.spray.shapes.CompartmentEllipse;
import org.eclipselabs.spray.shapes.CompartmentInfo;
import org.eclipselabs.spray.shapes.CompartmentLayout;
import org.eclipselabs.spray.shapes.CompartmentPolygon;
import org.eclipselabs.spray.shapes.CompartmentRectangle;
import org.eclipselabs.spray.shapes.CompartmentRoundedRectangle;
import org.eclipselabs.spray.shapes.CompartmentShape;
import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ConnectionStyle;
import org.eclipselabs.spray.shapes.Description;
import org.eclipselabs.spray.shapes.Ellipse;
import org.eclipselabs.spray.shapes.HAlign;
import org.eclipselabs.spray.shapes.Import;
import org.eclipselabs.spray.shapes.Line;
import org.eclipselabs.spray.shapes.LineLayout;
import org.eclipselabs.spray.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.Point;
import org.eclipselabs.spray.shapes.PolyLineLayout;
import org.eclipselabs.spray.shapes.Polygon;
import org.eclipselabs.spray.shapes.Polyline;
import org.eclipselabs.spray.shapes.Rectangle;
import org.eclipselabs.spray.shapes.RectangleEllipseLayout;
import org.eclipselabs.spray.shapes.RoundedRectangle;
import org.eclipselabs.spray.shapes.RoundedRectangleLayout;
import org.eclipselabs.spray.shapes.Shape;
import org.eclipselabs.spray.shapes.ShapeConnection;
import org.eclipselabs.spray.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.ShapeDefinition;
import org.eclipselabs.spray.shapes.ShapeLayout;
import org.eclipselabs.spray.shapes.ShapeStyleRef;
import org.eclipselabs.spray.shapes.ShapesFactory;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.Text;
import org.eclipselabs.spray.shapes.TextBody;
import org.eclipselabs.spray.shapes.TextLayout;
import org.eclipselabs.spray.shapes.TextType;
import org.eclipselabs.spray.shapes.VAlign;

import org.eclipselabs.spray.styles.StylesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapesPackageImpl extends EPackageImpl implements ShapesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeContainerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placingDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorPredefiniedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorManualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorPositionPosEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorRelativePositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anchorFixPointPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdPolylineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdRoundedRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdPolygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdEllipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polylineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundedRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentRoundedRectangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentPolygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compartmentEllipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleEllipseLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polyLineLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roundedRectangleLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapestyleLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeStyleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compartmentLayoutEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum anchorPredefiniedEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.spray.shapes.ShapesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShapesPackageImpl()
	{
		super(eNS_URI, ShapesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ShapesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShapesPackage init()
	{
		if (isInited) return (ShapesPackage)EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI);

		// Obtain or create and register package
		ShapesPackageImpl theShapesPackage = (ShapesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShapesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShapesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StylesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theShapesPackage.createPackageContents();

		// Initialize created meta-data
		theShapesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShapesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, theShapesPackage);
		return theShapesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeContainer()
	{
		return shapeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeContainer_Imports()
	{
		return (EReference)shapeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeContainer_ShapeContainerElement()
	{
		return (EReference)shapeContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport()
	{
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportedNamespace()
	{
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeContainerElement()
	{
		return shapeContainerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeContainerElement_Name()
	{
		return (EAttribute)shapeContainerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeContainerElement_Style()
	{
		return (EReference)shapeContainerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionDefinition()
	{
		return connectionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionDefinition_ConnectionStyle()
	{
		return (EAttribute)connectionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionDefinition_Layout()
	{
		return (EReference)connectionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionDefinition_Placing()
	{
		return (EReference)connectionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeDefinition()
	{
		return shapeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeDefinition_ShapeLayout()
	{
		return (EReference)shapeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeDefinition_Shape()
	{
		return (EReference)shapeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeDefinition_Description()
	{
		return (EReference)shapeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeDefinition_Anchor()
	{
		return (EReference)shapeDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacingDefinition()
	{
		return placingDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacingDefinition_Offset()
	{
		return (EAttribute)placingDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacingDefinition_Distance()
	{
		return (EAttribute)placingDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacingDefinition_Angle()
	{
		return (EAttribute)placingDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlacingDefinition_ShapeCon()
	{
		return (EReference)placingDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchor()
	{
		return anchorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnchor_Type()
	{
		return (EReference)anchorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorType()
	{
		return anchorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorPredefinied()
	{
		return anchorPredefiniedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchorPredefinied_Value()
	{
		return (EAttribute)anchorPredefiniedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorManual()
	{
		return anchorManualEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnchorManual_Position()
	{
		return (EReference)anchorManualEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorPosition()
	{
		return anchorPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnchorPosition_Pos()
	{
		return (EReference)anchorPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorPositionPos()
	{
		return anchorPositionPosEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorRelativePosition()
	{
		return anchorRelativePositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchorRelativePosition_Xoffset()
	{
		return (EAttribute)anchorRelativePositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchorRelativePosition_Yoffset()
	{
		return (EAttribute)anchorRelativePositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnchorFixPointPosition()
	{
		return anchorFixPointPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchorFixPointPosition_Xcor()
	{
		return (EAttribute)anchorFixPointPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnchorFixPointPosition_Ycor()
	{
		return (EAttribute)anchorFixPointPositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape()
	{
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Style()
	{
		return (EReference)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeConnection()
	{
		return shapeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeConnection_Style()
	{
		return (EReference)shapeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDLine()
	{
		return cdLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDLine_Layout()
	{
		return (EReference)cdLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDPolyline()
	{
		return cdPolylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDPolyline_Layout()
	{
		return (EReference)cdPolylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDRectangle()
	{
		return cdRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDRectangle_Layout()
	{
		return (EReference)cdRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDRoundedRectangle()
	{
		return cdRoundedRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDRoundedRectangle_Layout()
	{
		return (EReference)cdRoundedRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDPolygon()
	{
		return cdPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDPolygon_Layout()
	{
		return (EReference)cdPolygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDEllipse()
	{
		return cdEllipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDEllipse_Layout()
	{
		return (EReference)cdEllipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCDText()
	{
		return cdTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCDText_Texttype()
	{
		return (EAttribute)cdTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDText_Layout()
	{
		return (EReference)cdTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCDText_Body()
	{
		return (EReference)cdTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine()
	{
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Layout()
	{
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyline()
	{
		return polylineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyline_Layout()
	{
		return (EReference)polylineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangle()
	{
		return rectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangle_CompartmentInfo()
	{
		return (EReference)rectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangle_Layout()
	{
		return (EReference)rectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangle_Shape()
	{
		return (EReference)rectangleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundedRectangle()
	{
		return roundedRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoundedRectangle_Layout()
	{
		return (EReference)roundedRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoundedRectangle_Shape()
	{
		return (EReference)roundedRectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygon()
	{
		return polygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_Layout()
	{
		return (EReference)polygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygon_Shape()
	{
		return (EReference)polygonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipse()
	{
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_CompartmentInfo()
	{
		return (EReference)ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Layout()
	{
		return (EReference)ellipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Shape()
	{
		return (EReference)ellipseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText()
	{
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Texttype()
	{
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Layout()
	{
		return (EReference)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getText_Body()
	{
		return (EReference)textEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentInfo()
	{
		return compartmentInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentInfo_CompartmentLayout()
	{
		return (EAttribute)compartmentInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentInfo_StretchH()
	{
		return (EAttribute)compartmentInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentInfo_StretchV()
	{
		return (EAttribute)compartmentInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentInfo_Spacing()
	{
		return (EAttribute)compartmentInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentInfo_Margin()
	{
		return (EAttribute)compartmentInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartmentInfo_Invisible()
	{
		return (EAttribute)compartmentInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentInfo_Id()
	{
		return (EReference)compartmentInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartment()
	{
		return compartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompartment_CompartmentLayout()
	{
		return (EAttribute)compartmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartment_Shape()
	{
		return (EReference)compartmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentShape()
	{
		return compartmentShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentShape_Layout()
	{
		return (EReference)compartmentShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentShape_Id()
	{
		return (EReference)compartmentShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentRectangle()
	{
		return compartmentRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentRoundedRectangle()
	{
		return compartmentRoundedRectangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentRoundedRectangle_Layout()
	{
		return (EReference)compartmentRoundedRectangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentRoundedRectangle_Id()
	{
		return (EReference)compartmentRoundedRectangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentPolygon()
	{
		return compartmentPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentPolygon_Layout()
	{
		return (EReference)compartmentPolygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompartmentPolygon_Id()
	{
		return (EReference)compartmentPolygonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompartmentEllipse()
	{
		return compartmentEllipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription()
	{
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescription_Style()
	{
		return (EReference)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_HAlign()
	{
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_VAlign()
	{
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescription_Body()
	{
		return (EReference)descriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeLayout()
	{
		return shapeLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_Minwidth()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_Minheight()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_Maxwidth()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_Maxheight()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_StretchH()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_StretchV()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeLayout_Proportional()
	{
		return (EAttribute)shapeLayoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangleEllipseLayout()
	{
		return rectangleEllipseLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangleEllipseLayout_Common()
	{
		return (EReference)rectangleEllipseLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangleEllipseLayout_Layout()
	{
		return (EReference)rectangleEllipseLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineLayout()
	{
		return lineLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineLayout_Point()
	{
		return (EReference)lineLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineLayout_Layout()
	{
		return (EReference)lineLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyLineLayout()
	{
		return polyLineLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyLineLayout_Point()
	{
		return (EReference)polyLineLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolyLineLayout_Layout()
	{
		return (EReference)polyLineLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoundedRectangleLayout()
	{
		return roundedRectangleLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoundedRectangleLayout_Common()
	{
		return (EReference)roundedRectangleLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundedRectangleLayout_CurveWidth()
	{
		return (EAttribute)roundedRectangleLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoundedRectangleLayout_CurveHeight()
	{
		return (EAttribute)roundedRectangleLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoundedRectangleLayout_Layout()
	{
		return (EReference)roundedRectangleLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextLayout()
	{
		return textLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextLayout_Common()
	{
		return (EReference)textLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextLayout_HAlign()
	{
		return (EAttribute)textLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextLayout_VAlign()
	{
		return (EAttribute)textLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextLayout_Layout()
	{
		return (EReference)textLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapestyleLayout()
	{
		return shapestyleLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapestyleLayout_Layout()
	{
		return (EReference)shapestyleLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeStyleRef()
	{
		return shapeStyleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeStyleRef_JavaStyle()
	{
		return (EReference)shapeStyleRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapeStyleRef_DslStyle()
	{
		return (EReference)shapeStyleRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonLayout()
	{
		return commonLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonLayout_Xcor()
	{
		return (EAttribute)commonLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonLayout_Ycor()
	{
		return (EAttribute)commonLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonLayout_Width()
	{
		return (EAttribute)commonLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommonLayout_Heigth()
	{
		return (EAttribute)commonLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextBody()
	{
		return textBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextBody_Value()
	{
		return (EAttribute)textBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint()
	{
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Xcor()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Ycor()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_CurveBefore()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_CurveAfter()
	{
		return (EAttribute)pointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompartmentLayout()
	{
		return compartmentLayoutEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHAlign()
	{
		return hAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVAlign()
	{
		return vAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectionStyle()
	{
		return connectionStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnchorPredefiniedEnum()
	{
		return anchorPredefiniedEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextType()
	{
		return textTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesFactory getShapesFactory()
	{
		return (ShapesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		shapeContainerEClass = createEClass(SHAPE_CONTAINER);
		createEReference(shapeContainerEClass, SHAPE_CONTAINER__IMPORTS);
		createEReference(shapeContainerEClass, SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

		shapeContainerElementEClass = createEClass(SHAPE_CONTAINER_ELEMENT);
		createEAttribute(shapeContainerElementEClass, SHAPE_CONTAINER_ELEMENT__NAME);
		createEReference(shapeContainerElementEClass, SHAPE_CONTAINER_ELEMENT__STYLE);

		connectionDefinitionEClass = createEClass(CONNECTION_DEFINITION);
		createEAttribute(connectionDefinitionEClass, CONNECTION_DEFINITION__CONNECTION_STYLE);
		createEReference(connectionDefinitionEClass, CONNECTION_DEFINITION__LAYOUT);
		createEReference(connectionDefinitionEClass, CONNECTION_DEFINITION__PLACING);

		shapeDefinitionEClass = createEClass(SHAPE_DEFINITION);
		createEReference(shapeDefinitionEClass, SHAPE_DEFINITION__SHAPE_LAYOUT);
		createEReference(shapeDefinitionEClass, SHAPE_DEFINITION__SHAPE);
		createEReference(shapeDefinitionEClass, SHAPE_DEFINITION__DESCRIPTION);
		createEReference(shapeDefinitionEClass, SHAPE_DEFINITION__ANCHOR);

		placingDefinitionEClass = createEClass(PLACING_DEFINITION);
		createEAttribute(placingDefinitionEClass, PLACING_DEFINITION__OFFSET);
		createEAttribute(placingDefinitionEClass, PLACING_DEFINITION__DISTANCE);
		createEAttribute(placingDefinitionEClass, PLACING_DEFINITION__ANGLE);
		createEReference(placingDefinitionEClass, PLACING_DEFINITION__SHAPE_CON);

		anchorEClass = createEClass(ANCHOR);
		createEReference(anchorEClass, ANCHOR__TYPE);

		anchorTypeEClass = createEClass(ANCHOR_TYPE);

		anchorPredefiniedEClass = createEClass(ANCHOR_PREDEFINIED);
		createEAttribute(anchorPredefiniedEClass, ANCHOR_PREDEFINIED__VALUE);

		anchorManualEClass = createEClass(ANCHOR_MANUAL);
		createEReference(anchorManualEClass, ANCHOR_MANUAL__POSITION);

		anchorPositionEClass = createEClass(ANCHOR_POSITION);
		createEReference(anchorPositionEClass, ANCHOR_POSITION__POS);

		anchorPositionPosEClass = createEClass(ANCHOR_POSITION_POS);

		anchorRelativePositionEClass = createEClass(ANCHOR_RELATIVE_POSITION);
		createEAttribute(anchorRelativePositionEClass, ANCHOR_RELATIVE_POSITION__XOFFSET);
		createEAttribute(anchorRelativePositionEClass, ANCHOR_RELATIVE_POSITION__YOFFSET);

		anchorFixPointPositionEClass = createEClass(ANCHOR_FIX_POINT_POSITION);
		createEAttribute(anchorFixPointPositionEClass, ANCHOR_FIX_POINT_POSITION__XCOR);
		createEAttribute(anchorFixPointPositionEClass, ANCHOR_FIX_POINT_POSITION__YCOR);

		shapeEClass = createEClass(SHAPE);
		createEReference(shapeEClass, SHAPE__STYLE);

		shapeConnectionEClass = createEClass(SHAPE_CONNECTION);
		createEReference(shapeConnectionEClass, SHAPE_CONNECTION__STYLE);

		cdLineEClass = createEClass(CD_LINE);
		createEReference(cdLineEClass, CD_LINE__LAYOUT);

		cdPolylineEClass = createEClass(CD_POLYLINE);
		createEReference(cdPolylineEClass, CD_POLYLINE__LAYOUT);

		cdRectangleEClass = createEClass(CD_RECTANGLE);
		createEReference(cdRectangleEClass, CD_RECTANGLE__LAYOUT);

		cdRoundedRectangleEClass = createEClass(CD_ROUNDED_RECTANGLE);
		createEReference(cdRoundedRectangleEClass, CD_ROUNDED_RECTANGLE__LAYOUT);

		cdPolygonEClass = createEClass(CD_POLYGON);
		createEReference(cdPolygonEClass, CD_POLYGON__LAYOUT);

		cdEllipseEClass = createEClass(CD_ELLIPSE);
		createEReference(cdEllipseEClass, CD_ELLIPSE__LAYOUT);

		cdTextEClass = createEClass(CD_TEXT);
		createEAttribute(cdTextEClass, CD_TEXT__TEXTTYPE);
		createEReference(cdTextEClass, CD_TEXT__LAYOUT);
		createEReference(cdTextEClass, CD_TEXT__BODY);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__LAYOUT);

		polylineEClass = createEClass(POLYLINE);
		createEReference(polylineEClass, POLYLINE__LAYOUT);

		rectangleEClass = createEClass(RECTANGLE);
		createEReference(rectangleEClass, RECTANGLE__COMPARTMENT_INFO);
		createEReference(rectangleEClass, RECTANGLE__LAYOUT);
		createEReference(rectangleEClass, RECTANGLE__SHAPE);

		roundedRectangleEClass = createEClass(ROUNDED_RECTANGLE);
		createEReference(roundedRectangleEClass, ROUNDED_RECTANGLE__LAYOUT);
		createEReference(roundedRectangleEClass, ROUNDED_RECTANGLE__SHAPE);

		polygonEClass = createEClass(POLYGON);
		createEReference(polygonEClass, POLYGON__LAYOUT);
		createEReference(polygonEClass, POLYGON__SHAPE);

		ellipseEClass = createEClass(ELLIPSE);
		createEReference(ellipseEClass, ELLIPSE__COMPARTMENT_INFO);
		createEReference(ellipseEClass, ELLIPSE__LAYOUT);
		createEReference(ellipseEClass, ELLIPSE__SHAPE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXTTYPE);
		createEReference(textEClass, TEXT__LAYOUT);
		createEReference(textEClass, TEXT__BODY);

		compartmentInfoEClass = createEClass(COMPARTMENT_INFO);
		createEAttribute(compartmentInfoEClass, COMPARTMENT_INFO__COMPARTMENT_LAYOUT);
		createEAttribute(compartmentInfoEClass, COMPARTMENT_INFO__STRETCH_H);
		createEAttribute(compartmentInfoEClass, COMPARTMENT_INFO__STRETCH_V);
		createEAttribute(compartmentInfoEClass, COMPARTMENT_INFO__SPACING);
		createEAttribute(compartmentInfoEClass, COMPARTMENT_INFO__MARGIN);
		createEAttribute(compartmentInfoEClass, COMPARTMENT_INFO__INVISIBLE);
		createEReference(compartmentInfoEClass, COMPARTMENT_INFO__ID);

		compartmentEClass = createEClass(COMPARTMENT);
		createEAttribute(compartmentEClass, COMPARTMENT__COMPARTMENT_LAYOUT);
		createEReference(compartmentEClass, COMPARTMENT__SHAPE);

		compartmentShapeEClass = createEClass(COMPARTMENT_SHAPE);
		createEReference(compartmentShapeEClass, COMPARTMENT_SHAPE__LAYOUT);
		createEReference(compartmentShapeEClass, COMPARTMENT_SHAPE__ID);

		compartmentRectangleEClass = createEClass(COMPARTMENT_RECTANGLE);

		compartmentRoundedRectangleEClass = createEClass(COMPARTMENT_ROUNDED_RECTANGLE);
		createEReference(compartmentRoundedRectangleEClass, COMPARTMENT_ROUNDED_RECTANGLE__LAYOUT);
		createEReference(compartmentRoundedRectangleEClass, COMPARTMENT_ROUNDED_RECTANGLE__ID);

		compartmentPolygonEClass = createEClass(COMPARTMENT_POLYGON);
		createEReference(compartmentPolygonEClass, COMPARTMENT_POLYGON__LAYOUT);
		createEReference(compartmentPolygonEClass, COMPARTMENT_POLYGON__ID);

		compartmentEllipseEClass = createEClass(COMPARTMENT_ELLIPSE);

		descriptionEClass = createEClass(DESCRIPTION);
		createEReference(descriptionEClass, DESCRIPTION__STYLE);
		createEAttribute(descriptionEClass, DESCRIPTION__HALIGN);
		createEAttribute(descriptionEClass, DESCRIPTION__VALIGN);
		createEReference(descriptionEClass, DESCRIPTION__BODY);

		shapeLayoutEClass = createEClass(SHAPE_LAYOUT);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__MINWIDTH);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__MINHEIGHT);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__MAXWIDTH);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__MAXHEIGHT);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__STRETCH_H);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__STRETCH_V);
		createEAttribute(shapeLayoutEClass, SHAPE_LAYOUT__PROPORTIONAL);

		rectangleEllipseLayoutEClass = createEClass(RECTANGLE_ELLIPSE_LAYOUT);
		createEReference(rectangleEllipseLayoutEClass, RECTANGLE_ELLIPSE_LAYOUT__COMMON);
		createEReference(rectangleEllipseLayoutEClass, RECTANGLE_ELLIPSE_LAYOUT__LAYOUT);

		lineLayoutEClass = createEClass(LINE_LAYOUT);
		createEReference(lineLayoutEClass, LINE_LAYOUT__POINT);
		createEReference(lineLayoutEClass, LINE_LAYOUT__LAYOUT);

		polyLineLayoutEClass = createEClass(POLY_LINE_LAYOUT);
		createEReference(polyLineLayoutEClass, POLY_LINE_LAYOUT__POINT);
		createEReference(polyLineLayoutEClass, POLY_LINE_LAYOUT__LAYOUT);

		roundedRectangleLayoutEClass = createEClass(ROUNDED_RECTANGLE_LAYOUT);
		createEReference(roundedRectangleLayoutEClass, ROUNDED_RECTANGLE_LAYOUT__COMMON);
		createEAttribute(roundedRectangleLayoutEClass, ROUNDED_RECTANGLE_LAYOUT__CURVE_WIDTH);
		createEAttribute(roundedRectangleLayoutEClass, ROUNDED_RECTANGLE_LAYOUT__CURVE_HEIGHT);
		createEReference(roundedRectangleLayoutEClass, ROUNDED_RECTANGLE_LAYOUT__LAYOUT);

		textLayoutEClass = createEClass(TEXT_LAYOUT);
		createEReference(textLayoutEClass, TEXT_LAYOUT__COMMON);
		createEAttribute(textLayoutEClass, TEXT_LAYOUT__HALIGN);
		createEAttribute(textLayoutEClass, TEXT_LAYOUT__VALIGN);
		createEReference(textLayoutEClass, TEXT_LAYOUT__LAYOUT);

		shapestyleLayoutEClass = createEClass(SHAPESTYLE_LAYOUT);
		createEReference(shapestyleLayoutEClass, SHAPESTYLE_LAYOUT__LAYOUT);

		shapeStyleRefEClass = createEClass(SHAPE_STYLE_REF);
		createEReference(shapeStyleRefEClass, SHAPE_STYLE_REF__JAVA_STYLE);
		createEReference(shapeStyleRefEClass, SHAPE_STYLE_REF__DSL_STYLE);

		commonLayoutEClass = createEClass(COMMON_LAYOUT);
		createEAttribute(commonLayoutEClass, COMMON_LAYOUT__XCOR);
		createEAttribute(commonLayoutEClass, COMMON_LAYOUT__YCOR);
		createEAttribute(commonLayoutEClass, COMMON_LAYOUT__WIDTH);
		createEAttribute(commonLayoutEClass, COMMON_LAYOUT__HEIGTH);

		textBodyEClass = createEClass(TEXT_BODY);
		createEAttribute(textBodyEClass, TEXT_BODY__VALUE);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__XCOR);
		createEAttribute(pointEClass, POINT__YCOR);
		createEAttribute(pointEClass, POINT__CURVE_BEFORE);
		createEAttribute(pointEClass, POINT__CURVE_AFTER);

		// Create enums
		compartmentLayoutEEnum = createEEnum(COMPARTMENT_LAYOUT);
		hAlignEEnum = createEEnum(HALIGN);
		vAlignEEnum = createEEnum(VALIGN);
		connectionStyleEEnum = createEEnum(CONNECTION_STYLE);
		anchorPredefiniedEnumEEnum = createEEnum(ANCHOR_PREDEFINIED_ENUM);
		textTypeEEnum = createEEnum(TEXT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StylesPackage theStylesPackage = (StylesPackage)EPackage.Registry.INSTANCE.getEPackage(StylesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		connectionDefinitionEClass.getESuperTypes().add(this.getShapeContainerElement());
		shapeDefinitionEClass.getESuperTypes().add(this.getShapeContainerElement());
		anchorPredefiniedEClass.getESuperTypes().add(this.getAnchorType());
		anchorManualEClass.getESuperTypes().add(this.getAnchorType());
		anchorRelativePositionEClass.getESuperTypes().add(this.getAnchorPositionPos());
		anchorFixPointPositionEClass.getESuperTypes().add(this.getAnchorPositionPos());
		cdLineEClass.getESuperTypes().add(this.getShapeConnection());
		cdPolylineEClass.getESuperTypes().add(this.getShapeConnection());
		cdRectangleEClass.getESuperTypes().add(this.getShapeConnection());
		cdRoundedRectangleEClass.getESuperTypes().add(this.getShapeConnection());
		cdPolygonEClass.getESuperTypes().add(this.getShapeConnection());
		cdEllipseEClass.getESuperTypes().add(this.getShapeConnection());
		cdTextEClass.getESuperTypes().add(this.getShapeConnection());
		lineEClass.getESuperTypes().add(this.getShape());
		polylineEClass.getESuperTypes().add(this.getShape());
		rectangleEClass.getESuperTypes().add(this.getShape());
		roundedRectangleEClass.getESuperTypes().add(this.getShape());
		polygonEClass.getESuperTypes().add(this.getShape());
		ellipseEClass.getESuperTypes().add(this.getShape());
		textEClass.getESuperTypes().add(this.getShape());
		compartmentRectangleEClass.getESuperTypes().add(this.getCompartmentShape());
		compartmentEllipseEClass.getESuperTypes().add(this.getCompartmentShape());

		// Initialize classes and features; add operations and parameters
		initEClass(shapeContainerEClass, ShapeContainer.class, "ShapeContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeContainer_Imports(), this.getImport(), null, "imports", null, 0, -1, ShapeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeContainer_ShapeContainerElement(), this.getShapeContainerElement(), null, "shapeContainerElement", null, 0, -1, ShapeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeContainerElementEClass, ShapeContainerElement.class, "ShapeContainerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeContainerElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, ShapeContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeContainerElement_Style(), this.getShapeStyleRef(), null, "style", null, 0, 1, ShapeContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionDefinitionEClass, ConnectionDefinition.class, "ConnectionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnectionDefinition_ConnectionStyle(), this.getConnectionStyle(), "connectionStyle", null, 0, 1, ConnectionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionDefinition_Layout(), this.getShapestyleLayout(), null, "layout", null, 0, 1, ConnectionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectionDefinition_Placing(), this.getPlacingDefinition(), null, "placing", null, 0, -1, ConnectionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeDefinitionEClass, ShapeDefinition.class, "ShapeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeDefinition_ShapeLayout(), this.getShapeLayout(), null, "shapeLayout", null, 0, 1, ShapeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeDefinition_Shape(), this.getShape(), null, "shape", null, 0, -1, ShapeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeDefinition_Description(), this.getDescription(), null, "description", null, 0, 1, ShapeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeDefinition_Anchor(), this.getAnchor(), null, "anchor", null, 0, 1, ShapeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placingDefinitionEClass, PlacingDefinition.class, "PlacingDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacingDefinition_Offset(), ecorePackage.getEDouble(), "offset", "4.9E-324", 0, 1, PlacingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacingDefinition_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, PlacingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlacingDefinition_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, PlacingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlacingDefinition_ShapeCon(), this.getShapeConnection(), null, "shapeCon", null, 0, 1, PlacingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anchorEClass, Anchor.class, "Anchor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnchor_Type(), this.getAnchorType(), null, "type", null, 0, 1, Anchor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anchorTypeEClass, AnchorType.class, "AnchorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anchorPredefiniedEClass, AnchorPredefinied.class, "AnchorPredefinied", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnchorPredefinied_Value(), this.getAnchorPredefiniedEnum(), "value", null, 0, 1, AnchorPredefinied.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anchorManualEClass, AnchorManual.class, "AnchorManual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnchorManual_Position(), this.getAnchorPosition(), null, "position", null, 0, -1, AnchorManual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anchorPositionEClass, AnchorPosition.class, "AnchorPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnchorPosition_Pos(), this.getAnchorPositionPos(), null, "pos", null, 0, 1, AnchorPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anchorPositionPosEClass, AnchorPositionPos.class, "AnchorPositionPos", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anchorRelativePositionEClass, AnchorRelativePosition.class, "AnchorRelativePosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnchorRelativePosition_Xoffset(), ecorePackage.getEDouble(), "xoffset", null, 0, 1, AnchorRelativePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnchorRelativePosition_Yoffset(), ecorePackage.getEDouble(), "yoffset", null, 0, 1, AnchorRelativePosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anchorFixPointPositionEClass, AnchorFixPointPosition.class, "AnchorFixPointPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnchorFixPointPosition_Xcor(), ecorePackage.getEInt(), "xcor", null, 0, 1, AnchorFixPointPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnchorFixPointPosition_Ycor(), ecorePackage.getEInt(), "ycor", null, 0, 1, AnchorFixPointPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShape_Style(), this.getShapeStyleRef(), null, "style", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeConnectionEClass, ShapeConnection.class, "ShapeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeConnection_Style(), this.getShapeStyleRef(), null, "style", null, 0, 1, ShapeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdLineEClass, CDLine.class, "CDLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDLine_Layout(), this.getLineLayout(), null, "layout", null, 0, 1, CDLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdPolylineEClass, CDPolyline.class, "CDPolyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDPolyline_Layout(), this.getPolyLineLayout(), null, "layout", null, 0, 1, CDPolyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdRectangleEClass, CDRectangle.class, "CDRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDRectangle_Layout(), this.getRectangleEllipseLayout(), null, "layout", null, 0, 1, CDRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdRoundedRectangleEClass, CDRoundedRectangle.class, "CDRoundedRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDRoundedRectangle_Layout(), this.getRoundedRectangleLayout(), null, "layout", null, 0, 1, CDRoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdPolygonEClass, CDPolygon.class, "CDPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDPolygon_Layout(), this.getPolyLineLayout(), null, "layout", null, 0, 1, CDPolygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdEllipseEClass, CDEllipse.class, "CDEllipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCDEllipse_Layout(), this.getRectangleEllipseLayout(), null, "layout", null, 0, 1, CDEllipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdTextEClass, CDText.class, "CDText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCDText_Texttype(), this.getTextType(), "texttype", null, 0, 1, CDText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDText_Layout(), this.getTextLayout(), null, "layout", null, 0, 1, CDText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCDText_Body(), this.getTextBody(), null, "body", null, 0, 1, CDText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Layout(), this.getLineLayout(), null, "layout", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polylineEClass, Polyline.class, "Polyline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolyline_Layout(), this.getPolyLineLayout(), null, "layout", null, 0, 1, Polyline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEClass, Rectangle.class, "Rectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangle_CompartmentInfo(), this.getCompartmentInfo(), null, "compartmentInfo", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangle_Layout(), this.getRectangleEllipseLayout(), null, "layout", null, 0, 1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangle_Shape(), this.getShape(), null, "shape", null, 0, -1, Rectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundedRectangleEClass, RoundedRectangle.class, "RoundedRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoundedRectangle_Layout(), this.getRoundedRectangleLayout(), null, "layout", null, 0, 1, RoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoundedRectangle_Shape(), this.getShape(), null, "shape", null, 0, -1, RoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonEClass, Polygon.class, "Polygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolygon_Layout(), this.getPolyLineLayout(), null, "layout", null, 0, 1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolygon_Shape(), this.getShape(), null, "shape", null, 0, -1, Polygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEllipse_CompartmentInfo(), this.getCompartmentInfo(), null, "compartmentInfo", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Layout(), this.getRectangleEllipseLayout(), null, "layout", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Shape(), this.getShape(), null, "shape", null, 0, -1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Texttype(), this.getTextType(), "texttype", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getText_Layout(), this.getTextLayout(), null, "layout", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getText_Body(), this.getTextBody(), null, "body", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentInfoEClass, CompartmentInfo.class, "CompartmentInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartmentInfo_CompartmentLayout(), this.getCompartmentLayout(), "compartmentLayout", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartmentInfo_StretchH(), ecorePackage.getEBooleanObject(), "stretchH", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartmentInfo_StretchV(), ecorePackage.getEBooleanObject(), "stretchV", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartmentInfo_Spacing(), ecorePackage.getEInt(), "spacing", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartmentInfo_Margin(), ecorePackage.getEInt(), "margin", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompartmentInfo_Invisible(), ecorePackage.getEBoolean(), "invisible", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentInfo_Id(), this.getTextBody(), null, "id", null, 0, 1, CompartmentInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentEClass, Compartment.class, "Compartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompartment_CompartmentLayout(), this.getCompartmentLayout(), "compartmentLayout", null, 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartment_Shape(), this.getCompartmentShape(), null, "shape", null, 0, 1, Compartment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentShapeEClass, CompartmentShape.class, "CompartmentShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentShape_Layout(), this.getRectangleEllipseLayout(), null, "layout", null, 0, 1, CompartmentShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentShape_Id(), this.getTextBody(), null, "id", null, 0, 1, CompartmentShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentRectangleEClass, CompartmentRectangle.class, "CompartmentRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compartmentRoundedRectangleEClass, CompartmentRoundedRectangle.class, "CompartmentRoundedRectangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentRoundedRectangle_Layout(), this.getRoundedRectangleLayout(), null, "layout", null, 0, 1, CompartmentRoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentRoundedRectangle_Id(), this.getTextBody(), null, "id", null, 0, 1, CompartmentRoundedRectangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentPolygonEClass, CompartmentPolygon.class, "CompartmentPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompartmentPolygon_Layout(), this.getPolyLineLayout(), null, "layout", null, 0, 1, CompartmentPolygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompartmentPolygon_Id(), this.getTextBody(), null, "id", null, 0, 1, CompartmentPolygon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compartmentEllipseEClass, CompartmentEllipse.class, "CompartmentEllipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescription_Style(), this.getShapeStyleRef(), null, "style", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_HAlign(), this.getHAlign(), "hAlign", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_VAlign(), this.getVAlign(), "vAlign", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescription_Body(), this.getTextBody(), null, "body", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeLayoutEClass, ShapeLayout.class, "ShapeLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeLayout_Minwidth(), ecorePackage.getEInt(), "minwidth", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeLayout_Minheight(), ecorePackage.getEInt(), "minheight", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeLayout_Maxwidth(), ecorePackage.getEInt(), "maxwidth", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeLayout_Maxheight(), ecorePackage.getEInt(), "maxheight", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeLayout_StretchH(), ecorePackage.getEBooleanObject(), "stretchH", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeLayout_StretchV(), ecorePackage.getEBooleanObject(), "stretchV", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeLayout_Proportional(), ecorePackage.getEBooleanObject(), "proportional", null, 0, 1, ShapeLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleEllipseLayoutEClass, RectangleEllipseLayout.class, "RectangleEllipseLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangleEllipseLayout_Common(), this.getCommonLayout(), null, "common", null, 0, 1, RectangleEllipseLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangleEllipseLayout_Layout(), this.getShapestyleLayout(), null, "layout", null, 0, 1, RectangleEllipseLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineLayoutEClass, LineLayout.class, "LineLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineLayout_Point(), this.getPoint(), null, "point", null, 0, -1, LineLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineLayout_Layout(), this.getShapestyleLayout(), null, "layout", null, 0, 1, LineLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polyLineLayoutEClass, PolyLineLayout.class, "PolyLineLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPolyLineLayout_Point(), this.getPoint(), null, "point", null, 0, -1, PolyLineLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolyLineLayout_Layout(), this.getShapestyleLayout(), null, "layout", null, 0, 1, PolyLineLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roundedRectangleLayoutEClass, RoundedRectangleLayout.class, "RoundedRectangleLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoundedRectangleLayout_Common(), this.getCommonLayout(), null, "common", null, 0, 1, RoundedRectangleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundedRectangleLayout_CurveWidth(), ecorePackage.getEInt(), "curveWidth", null, 0, 1, RoundedRectangleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoundedRectangleLayout_CurveHeight(), ecorePackage.getEInt(), "curveHeight", null, 0, 1, RoundedRectangleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoundedRectangleLayout_Layout(), this.getShapestyleLayout(), null, "layout", null, 0, 1, RoundedRectangleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textLayoutEClass, TextLayout.class, "TextLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextLayout_Common(), this.getCommonLayout(), null, "common", null, 0, 1, TextLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextLayout_HAlign(), this.getHAlign(), "hAlign", null, 0, 1, TextLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextLayout_VAlign(), this.getVAlign(), "vAlign", null, 0, 1, TextLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextLayout_Layout(), this.getShapestyleLayout(), null, "layout", null, 0, 1, TextLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapestyleLayoutEClass, ShapestyleLayout.class, "ShapestyleLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapestyleLayout_Layout(), theStylesPackage.getStyleLayout(), null, "layout", null, 0, 1, ShapestyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeStyleRefEClass, ShapeStyleRef.class, "ShapeStyleRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShapeStyleRef_JavaStyle(), theTypesPackage.getJvmTypeReference(), null, "javaStyle", null, 0, 1, ShapeStyleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapeStyleRef_DslStyle(), theStylesPackage.getStyle(), null, "dslStyle", null, 0, 1, ShapeStyleRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonLayoutEClass, CommonLayout.class, "CommonLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonLayout_Xcor(), ecorePackage.getEInt(), "xcor", null, 0, 1, CommonLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonLayout_Ycor(), ecorePackage.getEInt(), "ycor", null, 0, 1, CommonLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonLayout_Width(), ecorePackage.getEInt(), "width", null, 0, 1, CommonLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommonLayout_Heigth(), ecorePackage.getEInt(), "heigth", null, 0, 1, CommonLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textBodyEClass, TextBody.class, "TextBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextBody_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_Xcor(), ecorePackage.getEInt(), "xcor", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Ycor(), ecorePackage.getEInt(), "ycor", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_CurveBefore(), ecorePackage.getEInt(), "curveBefore", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_CurveAfter(), ecorePackage.getEInt(), "curveAfter", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(compartmentLayoutEEnum, CompartmentLayout.class, "CompartmentLayout");
		addEEnumLiteral(compartmentLayoutEEnum, CompartmentLayout.FIXED);
		addEEnumLiteral(compartmentLayoutEEnum, CompartmentLayout.VERTICAL);
		addEEnumLiteral(compartmentLayoutEEnum, CompartmentLayout.HORIZONTAL);

		initEEnum(hAlignEEnum, HAlign.class, "HAlign");
		addEEnumLiteral(hAlignEEnum, HAlign.LEFT);
		addEEnumLiteral(hAlignEEnum, HAlign.CENTER);
		addEEnumLiteral(hAlignEEnum, HAlign.RIGHT);

		initEEnum(vAlignEEnum, VAlign.class, "VAlign");
		addEEnumLiteral(vAlignEEnum, VAlign.TOP);
		addEEnumLiteral(vAlignEEnum, VAlign.MIDDLE);
		addEEnumLiteral(vAlignEEnum, VAlign.BOTTOM);

		initEEnum(connectionStyleEEnum, ConnectionStyle.class, "ConnectionStyle");
		addEEnumLiteral(connectionStyleEEnum, ConnectionStyle.FREEFORM);
		addEEnumLiteral(connectionStyleEEnum, ConnectionStyle.MANHATTEN);

		initEEnum(anchorPredefiniedEnumEEnum, AnchorPredefiniedEnum.class, "AnchorPredefiniedEnum");
		addEEnumLiteral(anchorPredefiniedEnumEEnum, AnchorPredefiniedEnum.CENTER);
		addEEnumLiteral(anchorPredefiniedEnumEEnum, AnchorPredefiniedEnum.CORNERS);

		initEEnum(textTypeEEnum, TextType.class, "TextType");
		addEEnumLiteral(textTypeEEnum, TextType.DEFAULT);
		addEEnumLiteral(textTypeEEnum, TextType.MULTILINE);

		// Create resource
		createResource(eNS_URI);
	}

} //ShapesPackageImpl
