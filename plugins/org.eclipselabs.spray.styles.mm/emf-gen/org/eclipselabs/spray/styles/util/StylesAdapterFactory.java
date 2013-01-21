/**
 */
package org.eclipselabs.spray.styles.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipselabs.spray.styles.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.styles.StylesPackage
 * @generated
 */
public class StylesAdapterFactory extends AdapterFactoryImpl
{
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static StylesPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StylesAdapterFactory()
	{
        if (modelPackage == null) {
            modelPackage = StylesPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object)
	{
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StylesSwitch<Adapter> modelSwitch =
		new StylesSwitch<Adapter>() {
            @Override
            public Adapter caseStyleContainer(StyleContainer object) {
                return createStyleContainerAdapter();
            }
            @Override
            public Adapter caseStyleContainerElement(StyleContainerElement object) {
                return createStyleContainerElementAdapter();
            }
            @Override
            public Adapter caseStyle(Style object) {
                return createStyleAdapter();
            }
            @Override
            public Adapter caseGradient(Gradient object) {
                return createGradientAdapter();
            }
            @Override
            public Adapter caseStyleLayout(StyleLayout object) {
                return createStyleLayoutAdapter();
            }
            @Override
            public Adapter caseGradientLayout(GradientLayout object) {
                return createGradientLayoutAdapter();
            }
            @Override
            public Adapter caseHighlightingValues(HighlightingValues object) {
                return createHighlightingValuesAdapter();
            }
            @Override
            public Adapter caseGradientColorArea(GradientColorArea object) {
                return createGradientColorAreaAdapter();
            }
            @Override
            public Adapter caseColorOrGradient(ColorOrGradient object) {
                return createColorOrGradientAdapter();
            }
            @Override
            public Adapter caseColorWithTransparency(ColorWithTransparency object) {
                return createColorWithTransparencyAdapter();
            }
            @Override
            public Adapter caseColor(Color object) {
                return createColorAdapter();
            }
            @Override
            public Adapter caseRGBColor(RGBColor object) {
                return createRGBColorAdapter();
            }
            @Override
            public Adapter caseGradientRef(GradientRef object) {
                return createGradientRefAdapter();
            }
            @Override
            public Adapter caseColorConstantRef(ColorConstantRef object) {
                return createColorConstantRefAdapter();
            }
            @Override
            public Adapter caseTransparent(Transparent object) {
                return createTransparentAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target)
	{
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.StyleContainer <em>Style Container</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.StyleContainer
     * @generated
     */
	public Adapter createStyleContainerAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.StyleContainerElement <em>Style Container Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.StyleContainerElement
     * @generated
     */
	public Adapter createStyleContainerElementAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.Style
     * @generated
     */
	public Adapter createStyleAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.Gradient <em>Gradient</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.Gradient
     * @generated
     */
	public Adapter createGradientAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.StyleLayout <em>Style Layout</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.StyleLayout
     * @generated
     */
	public Adapter createStyleLayoutAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.GradientLayout <em>Gradient Layout</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.GradientLayout
     * @generated
     */
	public Adapter createGradientLayoutAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.HighlightingValues <em>Highlighting Values</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.HighlightingValues
     * @generated
     */
	public Adapter createHighlightingValuesAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.GradientColorArea <em>Gradient Color Area</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.GradientColorArea
     * @generated
     */
	public Adapter createGradientColorAreaAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.ColorOrGradient <em>Color Or Gradient</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.ColorOrGradient
     * @generated
     */
	public Adapter createColorOrGradientAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.ColorWithTransparency <em>Color With Transparency</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.ColorWithTransparency
     * @generated
     */
	public Adapter createColorWithTransparencyAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.Color <em>Color</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.Color
     * @generated
     */
	public Adapter createColorAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.RGBColor <em>RGB Color</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.RGBColor
     * @generated
     */
	public Adapter createRGBColorAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.GradientRef <em>Gradient Ref</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.GradientRef
     * @generated
     */
	public Adapter createGradientRefAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.ColorConstantRef <em>Color Constant Ref</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.ColorConstantRef
     * @generated
     */
	public Adapter createColorConstantRefAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipselabs.spray.styles.Transparent <em>Transparent</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipselabs.spray.styles.Transparent
     * @generated
     */
	public Adapter createTransparentAdapter()
	{
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter()
	{
        return null;
    }

} //StylesAdapterFactory
