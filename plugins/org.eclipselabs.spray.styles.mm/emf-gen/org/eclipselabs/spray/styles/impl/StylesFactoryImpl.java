/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipselabs.spray.styles.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StylesFactoryImpl extends EFactoryImpl implements StylesFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static StylesFactory init() {
        try {
            StylesFactory theStylesFactory = (StylesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/spray/styles/Style"); 
            if (theStylesFactory != null) {
                return theStylesFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new StylesFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StylesFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case StylesPackage.STYLE_CONTAINER: return createStyleContainer();
            case StylesPackage.STYLE_CONTAINER_ELEMENT: return createStyleContainerElement();
            case StylesPackage.STYLE: return createStyle();
            case StylesPackage.GRADIENT: return createGradient();
            case StylesPackage.STYLE_LAYOUT: return createStyleLayout();
            case StylesPackage.GRADIENT_LAYOUT: return createGradientLayout();
            case StylesPackage.HIGHLIGHTING_VALUES: return createHighlightingValues();
            case StylesPackage.GRADIENT_COLOR_AREA: return createGradientColorArea();
            case StylesPackage.COLOR_OR_GRADIENT: return createColorOrGradient();
            case StylesPackage.COLOR_WITH_TRANSPARENCY: return createColorWithTransparency();
            case StylesPackage.COLOR: return createColor();
            case StylesPackage.RGB_COLOR: return createRGBColor();
            case StylesPackage.GRADIENT_REF: return createGradientRef();
            case StylesPackage.COLOR_CONSTANT_REF: return createColorConstantRef();
            case StylesPackage.TRANSPARENT: return createTransparent();
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
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case StylesPackage.COLOR_CONSTANTS:
                return createColorConstantsFromString(eDataType, initialValue);
            case StylesPackage.LINE_STYLE:
                return createLineStyleFromString(eDataType, initialValue);
            case StylesPackage.YES_NO_BOOL:
                return createYesNoBoolFromString(eDataType, initialValue);
            case StylesPackage.GRADIENT_ALLIGNMENT:
                return createGradientAllignmentFromString(eDataType, initialValue);
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
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case StylesPackage.COLOR_CONSTANTS:
                return convertColorConstantsToString(eDataType, instanceValue);
            case StylesPackage.LINE_STYLE:
                return convertLineStyleToString(eDataType, instanceValue);
            case StylesPackage.YES_NO_BOOL:
                return convertYesNoBoolToString(eDataType, instanceValue);
            case StylesPackage.GRADIENT_ALLIGNMENT:
                return convertGradientAllignmentToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StyleContainer createStyleContainer() {
        StyleContainerImpl styleContainer = new StyleContainerImpl();
        return styleContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StyleContainerElement createStyleContainerElement() {
        StyleContainerElementImpl styleContainerElement = new StyleContainerElementImpl();
        return styleContainerElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Style createStyle() {
        StyleImpl style = new StyleImpl();
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gradient createGradient() {
        GradientImpl gradient = new GradientImpl();
        return gradient;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StyleLayout createStyleLayout() {
        StyleLayoutImpl styleLayout = new StyleLayoutImpl();
        return styleLayout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradientLayout createGradientLayout() {
        GradientLayoutImpl gradientLayout = new GradientLayoutImpl();
        return gradientLayout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HighlightingValues createHighlightingValues() {
        HighlightingValuesImpl highlightingValues = new HighlightingValuesImpl();
        return highlightingValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradientColorArea createGradientColorArea() {
        GradientColorAreaImpl gradientColorArea = new GradientColorAreaImpl();
        return gradientColorArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorOrGradient createColorOrGradient() {
        ColorOrGradientImpl colorOrGradient = new ColorOrGradientImpl();
        return colorOrGradient;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorWithTransparency createColorWithTransparency() {
        ColorWithTransparencyImpl colorWithTransparency = new ColorWithTransparencyImpl();
        return colorWithTransparency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Color createColor() {
        ColorImpl color = new ColorImpl();
        return color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RGBColor createRGBColor() {
        RGBColorImpl rgbColor = new RGBColorImpl();
        return rgbColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradientRef createGradientRef() {
        GradientRefImpl gradientRef = new GradientRefImpl();
        return gradientRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorConstantRef createColorConstantRef() {
        ColorConstantRefImpl colorConstantRef = new ColorConstantRefImpl();
        return colorConstantRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transparent createTransparent() {
        TransparentImpl transparent = new TransparentImpl();
        return transparent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ColorConstants createColorConstantsFromString(EDataType eDataType, String initialValue) {
        ColorConstants result = ColorConstants.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertColorConstantsToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LineStyle createLineStyleFromString(EDataType eDataType, String initialValue) {
        LineStyle result = LineStyle.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLineStyleToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public YesNoBool createYesNoBoolFromString(EDataType eDataType, String initialValue) {
        YesNoBool result = YesNoBool.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertYesNoBoolToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GradientAllignment createGradientAllignmentFromString(EDataType eDataType, String initialValue) {
        GradientAllignment result = GradientAllignment.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertGradientAllignmentToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StylesPackage getStylesPackage() {
        return (StylesPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static StylesPackage getPackage() {
        return StylesPackage.eINSTANCE;
    }

} //StylesFactoryImpl
