/**
 */
package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.shapes.ShapesPackage
 * @generated
 */
public interface ShapesFactory extends EFactory
{
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	ShapesFactory eINSTANCE = org.eclipselabs.spray.shapes.impl.ShapesFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Shape Container</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Container</em>'.
     * @generated
     */
	ShapeContainer createShapeContainer();

	/**
     * Returns a new object of class '<em>Import</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Import</em>'.
     * @generated
     */
	Import createImport();

	/**
     * Returns a new object of class '<em>Shape Container Element</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Container Element</em>'.
     * @generated
     */
	ShapeContainerElement createShapeContainerElement();

	/**
     * Returns a new object of class '<em>Connection Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection Definition</em>'.
     * @generated
     */
	ConnectionDefinition createConnectionDefinition();

	/**
     * Returns a new object of class '<em>Shape Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Definition</em>'.
     * @generated
     */
	ShapeDefinition createShapeDefinition();

	/**
     * Returns a new object of class '<em>Placing Definition</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Placing Definition</em>'.
     * @generated
     */
	PlacingDefinition createPlacingDefinition();

	/**
     * Returns a new object of class '<em>Anchor</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor</em>'.
     * @generated
     */
	Anchor createAnchor();

	/**
     * Returns a new object of class '<em>Anchor Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Type</em>'.
     * @generated
     */
	AnchorType createAnchorType();

	/**
     * Returns a new object of class '<em>Anchor Predefinied</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Predefinied</em>'.
     * @generated
     */
	AnchorPredefinied createAnchorPredefinied();

	/**
     * Returns a new object of class '<em>Anchor Manual</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Manual</em>'.
     * @generated
     */
	AnchorManual createAnchorManual();

	/**
     * Returns a new object of class '<em>Anchor Position</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Position</em>'.
     * @generated
     */
	AnchorPosition createAnchorPosition();

	/**
     * Returns a new object of class '<em>Anchor Position Pos</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Position Pos</em>'.
     * @generated
     */
	AnchorPositionPos createAnchorPositionPos();

	/**
     * Returns a new object of class '<em>Anchor Relative Position</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Relative Position</em>'.
     * @generated
     */
	AnchorRelativePosition createAnchorRelativePosition();

	/**
     * Returns a new object of class '<em>Anchor Fix Point Position</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Anchor Fix Point Position</em>'.
     * @generated
     */
	AnchorFixPointPosition createAnchorFixPointPosition();

	/**
     * Returns a new object of class '<em>Shape</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape</em>'.
     * @generated
     */
	Shape createShape();

	/**
     * Returns a new object of class '<em>Shape Connection</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Connection</em>'.
     * @generated
     */
	ShapeConnection createShapeConnection();

	/**
     * Returns a new object of class '<em>CD Line</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Line</em>'.
     * @generated
     */
	CDLine createCDLine();

	/**
     * Returns a new object of class '<em>CD Polyline</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Polyline</em>'.
     * @generated
     */
	CDPolyline createCDPolyline();

	/**
     * Returns a new object of class '<em>CD Rectangle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Rectangle</em>'.
     * @generated
     */
	CDRectangle createCDRectangle();

	/**
     * Returns a new object of class '<em>CD Rounded Rectangle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Rounded Rectangle</em>'.
     * @generated
     */
	CDRoundedRectangle createCDRoundedRectangle();

	/**
     * Returns a new object of class '<em>CD Polygon</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Polygon</em>'.
     * @generated
     */
	CDPolygon createCDPolygon();

	/**
     * Returns a new object of class '<em>CD Ellipse</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Ellipse</em>'.
     * @generated
     */
	CDEllipse createCDEllipse();

	/**
     * Returns a new object of class '<em>CD Text</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>CD Text</em>'.
     * @generated
     */
	CDText createCDText();

	/**
     * Returns a new object of class '<em>Line</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Line</em>'.
     * @generated
     */
	Line createLine();

	/**
     * Returns a new object of class '<em>Polyline</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Polyline</em>'.
     * @generated
     */
	Polyline createPolyline();

	/**
     * Returns a new object of class '<em>Rectangle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Rectangle</em>'.
     * @generated
     */
	Rectangle createRectangle();

	/**
     * Returns a new object of class '<em>Rounded Rectangle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Rounded Rectangle</em>'.
     * @generated
     */
	RoundedRectangle createRoundedRectangle();

	/**
     * Returns a new object of class '<em>Polygon</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Polygon</em>'.
     * @generated
     */
	Polygon createPolygon();

	/**
     * Returns a new object of class '<em>Ellipse</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Ellipse</em>'.
     * @generated
     */
	Ellipse createEllipse();

	/**
     * Returns a new object of class '<em>Text</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Text</em>'.
     * @generated
     */
	Text createText();

	/**
     * Returns a new object of class '<em>Compartment Info</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment Info</em>'.
     * @generated
     */
	CompartmentInfo createCompartmentInfo();

	/**
     * Returns a new object of class '<em>Compartment</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment</em>'.
     * @generated
     */
	Compartment createCompartment();

	/**
     * Returns a new object of class '<em>Compartment Shape</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment Shape</em>'.
     * @generated
     */
	CompartmentShape createCompartmentShape();

	/**
     * Returns a new object of class '<em>Compartment Rectangle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment Rectangle</em>'.
     * @generated
     */
	CompartmentRectangle createCompartmentRectangle();

	/**
     * Returns a new object of class '<em>Compartment Rounded Rectangle</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment Rounded Rectangle</em>'.
     * @generated
     */
	CompartmentRoundedRectangle createCompartmentRoundedRectangle();

	/**
     * Returns a new object of class '<em>Compartment Polygon</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment Polygon</em>'.
     * @generated
     */
	CompartmentPolygon createCompartmentPolygon();

	/**
     * Returns a new object of class '<em>Compartment Ellipse</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Compartment Ellipse</em>'.
     * @generated
     */
	CompartmentEllipse createCompartmentEllipse();

	/**
     * Returns a new object of class '<em>Description</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Description</em>'.
     * @generated
     */
	Description createDescription();

	/**
     * Returns a new object of class '<em>Shape Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Layout</em>'.
     * @generated
     */
	ShapeLayout createShapeLayout();

	/**
     * Returns a new object of class '<em>Rectangle Ellipse Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Rectangle Ellipse Layout</em>'.
     * @generated
     */
	RectangleEllipseLayout createRectangleEllipseLayout();

	/**
     * Returns a new object of class '<em>Line Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Line Layout</em>'.
     * @generated
     */
	LineLayout createLineLayout();

	/**
     * Returns a new object of class '<em>Poly Line Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Poly Line Layout</em>'.
     * @generated
     */
	PolyLineLayout createPolyLineLayout();

	/**
     * Returns a new object of class '<em>Rounded Rectangle Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Rounded Rectangle Layout</em>'.
     * @generated
     */
	RoundedRectangleLayout createRoundedRectangleLayout();

	/**
     * Returns a new object of class '<em>Text Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Layout</em>'.
     * @generated
     */
	TextLayout createTextLayout();

	/**
     * Returns a new object of class '<em>Shapestyle Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shapestyle Layout</em>'.
     * @generated
     */
	ShapestyleLayout createShapestyleLayout();

	/**
     * Returns a new object of class '<em>Shape Style Ref</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Shape Style Ref</em>'.
     * @generated
     */
	ShapeStyleRef createShapeStyleRef();

	/**
     * Returns a new object of class '<em>Common Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Common Layout</em>'.
     * @generated
     */
	CommonLayout createCommonLayout();

	/**
     * Returns a new object of class '<em>Text Body</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Text Body</em>'.
     * @generated
     */
	TextBody createTextBody();

	/**
     * Returns a new object of class '<em>Point</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Point</em>'.
     * @generated
     */
	Point createPoint();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	ShapesPackage getShapesPackage();

} //ShapesFactory
