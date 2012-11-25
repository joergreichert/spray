/**
 */
package org.eclipselabs.spray.styles.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipselabs.spray.styles.*;

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
 * @see org.eclipselabs.spray.styles.StylesPackage
 * @generated
 */
public class StylesSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static StylesPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StylesSwitch() {
        if (modelPackage == null) {
            modelPackage = StylesPackage.eINSTANCE;
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
    protected boolean isSwitchFor(EPackage ePackage) {
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
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case StylesPackage.STYLE_CONTAINER: {
                StyleContainer styleContainer = (StyleContainer)theEObject;
                T result = caseStyleContainer(styleContainer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.STYLE_CONTAINER_ELEMENT: {
                StyleContainerElement styleContainerElement = (StyleContainerElement)theEObject;
                T result = caseStyleContainerElement(styleContainerElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.STYLE: {
                Style style = (Style)theEObject;
                T result = caseStyle(style);
                if (result == null) result = caseStyleContainerElement(style);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.GRADIENT: {
                Gradient gradient = (Gradient)theEObject;
                T result = caseGradient(gradient);
                if (result == null) result = caseStyleContainerElement(gradient);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.STYLE_LAYOUT: {
                StyleLayout styleLayout = (StyleLayout)theEObject;
                T result = caseStyleLayout(styleLayout);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.GRADIENT_LAYOUT: {
                GradientLayout gradientLayout = (GradientLayout)theEObject;
                T result = caseGradientLayout(gradientLayout);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.HIGHLIGHTING_VALUES: {
                HighlightingValues highlightingValues = (HighlightingValues)theEObject;
                T result = caseHighlightingValues(highlightingValues);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.GRADIENT_COLOR_AREA: {
                GradientColorArea gradientColorArea = (GradientColorArea)theEObject;
                T result = caseGradientColorArea(gradientColorArea);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.COLOR_OR_GRADIENT: {
                ColorOrGradient colorOrGradient = (ColorOrGradient)theEObject;
                T result = caseColorOrGradient(colorOrGradient);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.COLOR_WITH_TRANSPARENCY: {
                ColorWithTransparency colorWithTransparency = (ColorWithTransparency)theEObject;
                T result = caseColorWithTransparency(colorWithTransparency);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.COLOR: {
                Color color = (Color)theEObject;
                T result = caseColor(color);
                if (result == null) result = caseColorOrGradient(color);
                if (result == null) result = caseColorWithTransparency(color);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.RGB_COLOR: {
                RGBColor rgbColor = (RGBColor)theEObject;
                T result = caseRGBColor(rgbColor);
                if (result == null) result = caseColor(rgbColor);
                if (result == null) result = caseColorOrGradient(rgbColor);
                if (result == null) result = caseColorWithTransparency(rgbColor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.GRADIENT_REF: {
                GradientRef gradientRef = (GradientRef)theEObject;
                T result = caseGradientRef(gradientRef);
                if (result == null) result = caseColorOrGradient(gradientRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.COLOR_CONSTANT_REF: {
                ColorConstantRef colorConstantRef = (ColorConstantRef)theEObject;
                T result = caseColorConstantRef(colorConstantRef);
                if (result == null) result = caseColor(colorConstantRef);
                if (result == null) result = caseColorOrGradient(colorConstantRef);
                if (result == null) result = caseColorWithTransparency(colorConstantRef);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case StylesPackage.TRANSPARENT: {
                Transparent transparent = (Transparent)theEObject;
                T result = caseTransparent(transparent);
                if (result == null) result = caseColorOrGradient(transparent);
                if (result == null) result = caseColorWithTransparency(transparent);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style Container</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style Container</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyleContainer(StyleContainer object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style Container Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style Container Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyleContainerElement(StyleContainerElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyle(Style object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gradient</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gradient</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradient(Gradient object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Style Layout</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Style Layout</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStyleLayout(StyleLayout object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gradient Layout</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gradient Layout</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradientLayout(GradientLayout object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Highlighting Values</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Highlighting Values</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseHighlightingValues(HighlightingValues object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gradient Color Area</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gradient Color Area</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradientColorArea(GradientColorArea object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Color Or Gradient</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Color Or Gradient</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColorOrGradient(ColorOrGradient object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Color With Transparency</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Color With Transparency</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColorWithTransparency(ColorWithTransparency object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Color</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColor(Color object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RGB Color</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RGB Color</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRGBColor(RGBColor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Gradient Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Gradient Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGradientRef(GradientRef object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Color Constant Ref</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Color Constant Ref</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColorConstantRef(ColorConstantRef object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Transparent</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Transparent</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTransparent(Transparent object) {
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
    public T defaultCase(EObject object) {
        return null;
    }

} //StylesSwitch
