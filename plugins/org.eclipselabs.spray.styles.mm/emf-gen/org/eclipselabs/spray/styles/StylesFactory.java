/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.styles.StylesPackage
 * @generated
 */
public interface StylesFactory extends EFactory
{
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	StylesFactory eINSTANCE = org.eclipselabs.spray.styles.impl.StylesFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Style Container</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Style Container</em>'.
     * @generated
     */
	StyleContainer createStyleContainer();

	/**
     * Returns a new object of class '<em>Style Container Element</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Style Container Element</em>'.
     * @generated
     */
	StyleContainerElement createStyleContainerElement();

	/**
     * Returns a new object of class '<em>Style</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Style</em>'.
     * @generated
     */
	Style createStyle();

	/**
     * Returns a new object of class '<em>Gradient</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gradient</em>'.
     * @generated
     */
	Gradient createGradient();

	/**
     * Returns a new object of class '<em>Style Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Style Layout</em>'.
     * @generated
     */
	StyleLayout createStyleLayout();

	/**
     * Returns a new object of class '<em>Gradient Layout</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gradient Layout</em>'.
     * @generated
     */
	GradientLayout createGradientLayout();

	/**
     * Returns a new object of class '<em>Highlighting Values</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Highlighting Values</em>'.
     * @generated
     */
	HighlightingValues createHighlightingValues();

	/**
     * Returns a new object of class '<em>Gradient Color Area</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gradient Color Area</em>'.
     * @generated
     */
	GradientColorArea createGradientColorArea();

	/**
     * Returns a new object of class '<em>Color Or Gradient</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Color Or Gradient</em>'.
     * @generated
     */
	ColorOrGradient createColorOrGradient();

	/**
     * Returns a new object of class '<em>Color With Transparency</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Color With Transparency</em>'.
     * @generated
     */
	ColorWithTransparency createColorWithTransparency();

	/**
     * Returns a new object of class '<em>Color</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Color</em>'.
     * @generated
     */
	Color createColor();

	/**
     * Returns a new object of class '<em>RGB Color</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>RGB Color</em>'.
     * @generated
     */
	RGBColor createRGBColor();

	/**
     * Returns a new object of class '<em>Gradient Ref</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Gradient Ref</em>'.
     * @generated
     */
	GradientRef createGradientRef();

	/**
     * Returns a new object of class '<em>Color Constant Ref</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Color Constant Ref</em>'.
     * @generated
     */
	ColorConstantRef createColorConstantRef();

	/**
     * Returns a new object of class '<em>Transparent</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Transparent</em>'.
     * @generated
     */
	Transparent createTransparent();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	StylesPackage getStylesPackage();

} //StylesFactory
