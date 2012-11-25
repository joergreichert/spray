/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.spray.styles.StylesFactory
 * @model kind="package"
 * @generated
 */
public interface StylesPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "styles";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.eclipselabs.org/spray/styles/Style";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "styles";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    StylesPackage eINSTANCE = org.eclipselabs.spray.styles.impl.StylesPackageImpl.init();

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.StyleContainerImpl <em>Style Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.StyleContainerImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyleContainer()
     * @generated
     */
    int STYLE_CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Style Container Element</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT = 0;

    /**
     * The number of structural features of the '<em>Style Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_CONTAINER_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.StyleContainerElementImpl <em>Style Container Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.StyleContainerElementImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyleContainerElement()
     * @generated
     */
    int STYLE_CONTAINER_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_CONTAINER_ELEMENT__NAME = 0;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_CONTAINER_ELEMENT__DESCRIPTION = 1;

    /**
     * The number of structural features of the '<em>Style Container Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_CONTAINER_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.StyleImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyle()
     * @generated
     */
    int STYLE = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__NAME = STYLE_CONTAINER_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__DESCRIPTION = STYLE_CONTAINER_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Super Style</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__SUPER_STYLE = STYLE_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Super Style From Dsl</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__SUPER_STYLE_FROM_DSL = STYLE_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Layout</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE__LAYOUT = STYLE_CONTAINER_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Style</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_FEATURE_COUNT = STYLE_CONTAINER_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.GradientImpl <em>Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.GradientImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradient()
     * @generated
     */
    int GRADIENT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT__NAME = STYLE_CONTAINER_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT__DESCRIPTION = STYLE_CONTAINER_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Layout</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT__LAYOUT = STYLE_CONTAINER_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_FEATURE_COUNT = STYLE_CONTAINER_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl <em>Style Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.StyleLayoutImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyleLayout()
     * @generated
     */
    int STYLE_LAYOUT = 4;

    /**
     * The feature id for the '<em><b>Transparency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__TRANSPARENCY = 0;

    /**
     * The feature id for the '<em><b>Background</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__BACKGROUND = 1;

    /**
     * The feature id for the '<em><b>Gradient orientation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__GRADIENT_ORIENTATION = 2;

    /**
     * The feature id for the '<em><b>Highlighting</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__HIGHLIGHTING = 3;

    /**
     * The feature id for the '<em><b>Line Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__LINE_COLOR = 4;

    /**
     * The feature id for the '<em><b>Line Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__LINE_WIDTH = 5;

    /**
     * The feature id for the '<em><b>Line Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__LINE_STYLE = 6;

    /**
     * The feature id for the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__FONT_NAME = 7;

    /**
     * The feature id for the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__FONT_COLOR = 8;

    /**
     * The feature id for the '<em><b>Font Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__FONT_SIZE = 9;

    /**
     * The feature id for the '<em><b>Font Italic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__FONT_ITALIC = 10;

    /**
     * The feature id for the '<em><b>Font Bold</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT__FONT_BOLD = 11;

    /**
     * The number of structural features of the '<em>Style Layout</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STYLE_LAYOUT_FEATURE_COUNT = 12;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.GradientLayoutImpl <em>Gradient Layout</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.GradientLayoutImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientLayout()
     * @generated
     */
    int GRADIENT_LAYOUT = 5;

    /**
     * The feature id for the '<em><b>Area</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_LAYOUT__AREA = 0;

    /**
     * The number of structural features of the '<em>Gradient Layout</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_LAYOUT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.HighlightingValuesImpl <em>Highlighting Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.HighlightingValuesImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getHighlightingValues()
     * @generated
     */
    int HIGHLIGHTING_VALUES = 6;

    /**
     * The feature id for the '<em><b>Selected</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIGHLIGHTING_VALUES__SELECTED = 0;

    /**
     * The feature id for the '<em><b>Multiselected</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIGHLIGHTING_VALUES__MULTISELECTED = 1;

    /**
     * The feature id for the '<em><b>Allowed</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIGHLIGHTING_VALUES__ALLOWED = 2;

    /**
     * The feature id for the '<em><b>Unallowed</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIGHLIGHTING_VALUES__UNALLOWED = 3;

    /**
     * The number of structural features of the '<em>Highlighting Values</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HIGHLIGHTING_VALUES_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.GradientColorAreaImpl <em>Gradient Color Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.GradientColorAreaImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientColorArea()
     * @generated
     */
    int GRADIENT_COLOR_AREA = 7;

    /**
     * The feature id for the '<em><b>Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_COLOR_AREA__COLOR = 0;

    /**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_COLOR_AREA__OFFSET = 1;

    /**
     * The number of structural features of the '<em>Gradient Color Area</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_COLOR_AREA_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.ColorOrGradientImpl <em>Color Or Gradient</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.ColorOrGradientImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorOrGradient()
     * @generated
     */
    int COLOR_OR_GRADIENT = 8;

    /**
     * The number of structural features of the '<em>Color Or Gradient</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_OR_GRADIENT_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.ColorWithTransparencyImpl <em>Color With Transparency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.ColorWithTransparencyImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorWithTransparency()
     * @generated
     */
    int COLOR_WITH_TRANSPARENCY = 9;

    /**
     * The number of structural features of the '<em>Color With Transparency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_WITH_TRANSPARENCY_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.ColorImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColor()
     * @generated
     */
    int COLOR = 10;

    /**
     * The number of structural features of the '<em>Color</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_FEATURE_COUNT = COLOR_OR_GRADIENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.RGBColorImpl <em>RGB Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.RGBColorImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getRGBColor()
     * @generated
     */
    int RGB_COLOR = 11;

    /**
     * The feature id for the '<em><b>Red</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RGB_COLOR__RED = COLOR_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Green</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RGB_COLOR__GREEN = COLOR_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Blue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RGB_COLOR__BLUE = COLOR_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>RGB Color</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RGB_COLOR_FEATURE_COUNT = COLOR_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.GradientRefImpl <em>Gradient Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.GradientRefImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientRef()
     * @generated
     */
    int GRADIENT_REF = 12;

    /**
     * The feature id for the '<em><b>Gradient Ref</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_REF__GRADIENT_REF = COLOR_OR_GRADIENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Gradient Ref From Dsl</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_REF__GRADIENT_REF_FROM_DSL = COLOR_OR_GRADIENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Gradient Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GRADIENT_REF_FEATURE_COUNT = COLOR_OR_GRADIENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.ColorConstantRefImpl <em>Color Constant Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.ColorConstantRefImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorConstantRef()
     * @generated
     */
    int COLOR_CONSTANT_REF = 13;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_CONSTANT_REF__VALUE = COLOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Color Constant Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLOR_CONSTANT_REF_FEATURE_COUNT = COLOR_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.impl.TransparentImpl <em>Transparent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.impl.TransparentImpl
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getTransparent()
     * @generated
     */
    int TRANSPARENT = 14;

    /**
     * The feature id for the '<em><b>Transparent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT__TRANSPARENT = COLOR_OR_GRADIENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Transparent</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSPARENT_FEATURE_COUNT = COLOR_OR_GRADIENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.ColorConstants <em>Color Constants</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.ColorConstants
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorConstants()
     * @generated
     */
    int COLOR_CONSTANTS = 15;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.LineStyle <em>Line Style</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.LineStyle
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getLineStyle()
     * @generated
     */
    int LINE_STYLE = 16;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.YesNoBool <em>Yes No Bool</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.YesNoBool
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getYesNoBool()
     * @generated
     */
    int YES_NO_BOOL = 17;

    /**
     * The meta object id for the '{@link org.eclipselabs.spray.styles.GradientAllignment <em>Gradient Allignment</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipselabs.spray.styles.GradientAllignment
     * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientAllignment()
     * @generated
     */
    int GRADIENT_ALLIGNMENT = 18;


    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.StyleContainer <em>Style Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style Container</em>'.
     * @see org.eclipselabs.spray.styles.StyleContainer
     * @generated
     */
    EClass getStyleContainer();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.styles.StyleContainer#getStyleContainerElement <em>Style Container Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Style Container Element</em>'.
     * @see org.eclipselabs.spray.styles.StyleContainer#getStyleContainerElement()
     * @see #getStyleContainer()
     * @generated
     */
    EReference getStyleContainer_StyleContainerElement();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.StyleContainerElement <em>Style Container Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style Container Element</em>'.
     * @see org.eclipselabs.spray.styles.StyleContainerElement
     * @generated
     */
    EClass getStyleContainerElement();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleContainerElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipselabs.spray.styles.StyleContainerElement#getName()
     * @see #getStyleContainerElement()
     * @generated
     */
    EAttribute getStyleContainerElement_Name();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleContainerElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.eclipselabs.spray.styles.StyleContainerElement#getDescription()
     * @see #getStyleContainerElement()
     * @generated
     */
    EAttribute getStyleContainerElement_Description();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.Style <em>Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style</em>'.
     * @see org.eclipselabs.spray.styles.Style
     * @generated
     */
    EClass getStyle();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.Style#getSuperStyle <em>Super Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Super Style</em>'.
     * @see org.eclipselabs.spray.styles.Style#getSuperStyle()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_SuperStyle();

    /**
     * Returns the meta object for the reference '{@link org.eclipselabs.spray.styles.Style#getSuperStyleFromDsl <em>Super Style From Dsl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Super Style From Dsl</em>'.
     * @see org.eclipselabs.spray.styles.Style#getSuperStyleFromDsl()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_SuperStyleFromDsl();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.Style#getLayout <em>Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Layout</em>'.
     * @see org.eclipselabs.spray.styles.Style#getLayout()
     * @see #getStyle()
     * @generated
     */
    EReference getStyle_Layout();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.Gradient <em>Gradient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gradient</em>'.
     * @see org.eclipselabs.spray.styles.Gradient
     * @generated
     */
    EClass getGradient();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.Gradient#getLayout <em>Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Layout</em>'.
     * @see org.eclipselabs.spray.styles.Gradient#getLayout()
     * @see #getGradient()
     * @generated
     */
    EReference getGradient_Layout();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.StyleLayout <em>Style Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Style Layout</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout
     * @generated
     */
    EClass getStyleLayout();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getTransparency <em>Transparency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transparency</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getTransparency()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_Transparency();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.StyleLayout#getBackground <em>Background</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Background</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getBackground()
     * @see #getStyleLayout()
     * @generated
     */
    EReference getStyleLayout_Background();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getGradient_orientation <em>Gradient orientation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Gradient orientation</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getGradient_orientation()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_Gradient_orientation();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.StyleLayout#getHighlighting <em>Highlighting</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Highlighting</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getHighlighting()
     * @see #getStyleLayout()
     * @generated
     */
    EReference getStyleLayout_Highlighting();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.StyleLayout#getLineColor <em>Line Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Line Color</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getLineColor()
     * @see #getStyleLayout()
     * @generated
     */
    EReference getStyleLayout_LineColor();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getLineWidth <em>Line Width</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Width</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getLineWidth()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_LineWidth();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getLineStyle <em>Line Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Line Style</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getLineStyle()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_LineStyle();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getFontName <em>Font Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Name</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getFontName()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_FontName();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.StyleLayout#getFontColor <em>Font Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Font Color</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getFontColor()
     * @see #getStyleLayout()
     * @generated
     */
    EReference getStyleLayout_FontColor();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getFontSize <em>Font Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Size</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getFontSize()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_FontSize();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getFontItalic <em>Font Italic</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Italic</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getFontItalic()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_FontItalic();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.StyleLayout#getFontBold <em>Font Bold</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Font Bold</em>'.
     * @see org.eclipselabs.spray.styles.StyleLayout#getFontBold()
     * @see #getStyleLayout()
     * @generated
     */
    EAttribute getStyleLayout_FontBold();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.GradientLayout <em>Gradient Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gradient Layout</em>'.
     * @see org.eclipselabs.spray.styles.GradientLayout
     * @generated
     */
    EClass getGradientLayout();

    /**
     * Returns the meta object for the containment reference list '{@link org.eclipselabs.spray.styles.GradientLayout#getArea <em>Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Area</em>'.
     * @see org.eclipselabs.spray.styles.GradientLayout#getArea()
     * @see #getGradientLayout()
     * @generated
     */
    EReference getGradientLayout_Area();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.HighlightingValues <em>Highlighting Values</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Highlighting Values</em>'.
     * @see org.eclipselabs.spray.styles.HighlightingValues
     * @generated
     */
    EClass getHighlightingValues();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.HighlightingValues#getSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Selected</em>'.
     * @see org.eclipselabs.spray.styles.HighlightingValues#getSelected()
     * @see #getHighlightingValues()
     * @generated
     */
    EReference getHighlightingValues_Selected();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.HighlightingValues#getMultiselected <em>Multiselected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Multiselected</em>'.
     * @see org.eclipselabs.spray.styles.HighlightingValues#getMultiselected()
     * @see #getHighlightingValues()
     * @generated
     */
    EReference getHighlightingValues_Multiselected();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.HighlightingValues#getAllowed <em>Allowed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Allowed</em>'.
     * @see org.eclipselabs.spray.styles.HighlightingValues#getAllowed()
     * @see #getHighlightingValues()
     * @generated
     */
    EReference getHighlightingValues_Allowed();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.HighlightingValues#getUnallowed <em>Unallowed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Unallowed</em>'.
     * @see org.eclipselabs.spray.styles.HighlightingValues#getUnallowed()
     * @see #getHighlightingValues()
     * @generated
     */
    EReference getHighlightingValues_Unallowed();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.GradientColorArea <em>Gradient Color Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gradient Color Area</em>'.
     * @see org.eclipselabs.spray.styles.GradientColorArea
     * @generated
     */
    EClass getGradientColorArea();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.GradientColorArea#getColor <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Color</em>'.
     * @see org.eclipselabs.spray.styles.GradientColorArea#getColor()
     * @see #getGradientColorArea()
     * @generated
     */
    EReference getGradientColorArea_Color();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.GradientColorArea#getOffset <em>Offset</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset</em>'.
     * @see org.eclipselabs.spray.styles.GradientColorArea#getOffset()
     * @see #getGradientColorArea()
     * @generated
     */
    EAttribute getGradientColorArea_Offset();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.ColorOrGradient <em>Color Or Gradient</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Color Or Gradient</em>'.
     * @see org.eclipselabs.spray.styles.ColorOrGradient
     * @generated
     */
    EClass getColorOrGradient();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.ColorWithTransparency <em>Color With Transparency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Color With Transparency</em>'.
     * @see org.eclipselabs.spray.styles.ColorWithTransparency
     * @generated
     */
    EClass getColorWithTransparency();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.Color <em>Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Color</em>'.
     * @see org.eclipselabs.spray.styles.Color
     * @generated
     */
    EClass getColor();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.RGBColor <em>RGB Color</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>RGB Color</em>'.
     * @see org.eclipselabs.spray.styles.RGBColor
     * @generated
     */
    EClass getRGBColor();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.RGBColor#getRed <em>Red</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Red</em>'.
     * @see org.eclipselabs.spray.styles.RGBColor#getRed()
     * @see #getRGBColor()
     * @generated
     */
    EAttribute getRGBColor_Red();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.RGBColor#getGreen <em>Green</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Green</em>'.
     * @see org.eclipselabs.spray.styles.RGBColor#getGreen()
     * @see #getRGBColor()
     * @generated
     */
    EAttribute getRGBColor_Green();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.RGBColor#getBlue <em>Blue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Blue</em>'.
     * @see org.eclipselabs.spray.styles.RGBColor#getBlue()
     * @see #getRGBColor()
     * @generated
     */
    EAttribute getRGBColor_Blue();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.GradientRef <em>Gradient Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Gradient Ref</em>'.
     * @see org.eclipselabs.spray.styles.GradientRef
     * @generated
     */
    EClass getGradientRef();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipselabs.spray.styles.GradientRef#getGradientRef <em>Gradient Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Gradient Ref</em>'.
     * @see org.eclipselabs.spray.styles.GradientRef#getGradientRef()
     * @see #getGradientRef()
     * @generated
     */
    EReference getGradientRef_GradientRef();

    /**
     * Returns the meta object for the reference '{@link org.eclipselabs.spray.styles.GradientRef#getGradientRefFromDsl <em>Gradient Ref From Dsl</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Gradient Ref From Dsl</em>'.
     * @see org.eclipselabs.spray.styles.GradientRef#getGradientRefFromDsl()
     * @see #getGradientRef()
     * @generated
     */
    EReference getGradientRef_GradientRefFromDsl();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.ColorConstantRef <em>Color Constant Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Color Constant Ref</em>'.
     * @see org.eclipselabs.spray.styles.ColorConstantRef
     * @generated
     */
    EClass getColorConstantRef();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.ColorConstantRef#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see org.eclipselabs.spray.styles.ColorConstantRef#getValue()
     * @see #getColorConstantRef()
     * @generated
     */
    EAttribute getColorConstantRef_Value();

    /**
     * Returns the meta object for class '{@link org.eclipselabs.spray.styles.Transparent <em>Transparent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transparent</em>'.
     * @see org.eclipselabs.spray.styles.Transparent
     * @generated
     */
    EClass getTransparent();

    /**
     * Returns the meta object for the attribute '{@link org.eclipselabs.spray.styles.Transparent#isTransparent <em>Transparent</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Transparent</em>'.
     * @see org.eclipselabs.spray.styles.Transparent#isTransparent()
     * @see #getTransparent()
     * @generated
     */
    EAttribute getTransparent_Transparent();

    /**
     * Returns the meta object for enum '{@link org.eclipselabs.spray.styles.ColorConstants <em>Color Constants</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Color Constants</em>'.
     * @see org.eclipselabs.spray.styles.ColorConstants
     * @generated
     */
    EEnum getColorConstants();

    /**
     * Returns the meta object for enum '{@link org.eclipselabs.spray.styles.LineStyle <em>Line Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Line Style</em>'.
     * @see org.eclipselabs.spray.styles.LineStyle
     * @generated
     */
    EEnum getLineStyle();

    /**
     * Returns the meta object for enum '{@link org.eclipselabs.spray.styles.YesNoBool <em>Yes No Bool</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Yes No Bool</em>'.
     * @see org.eclipselabs.spray.styles.YesNoBool
     * @generated
     */
    EEnum getYesNoBool();

    /**
     * Returns the meta object for enum '{@link org.eclipselabs.spray.styles.GradientAllignment <em>Gradient Allignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Gradient Allignment</em>'.
     * @see org.eclipselabs.spray.styles.GradientAllignment
     * @generated
     */
    EEnum getGradientAllignment();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    StylesFactory getStylesFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.StyleContainerImpl <em>Style Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.StyleContainerImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyleContainer()
         * @generated
         */
        EClass STYLE_CONTAINER = eINSTANCE.getStyleContainer();

        /**
         * The meta object literal for the '<em><b>Style Container Element</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT = eINSTANCE.getStyleContainer_StyleContainerElement();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.StyleContainerElementImpl <em>Style Container Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.StyleContainerElementImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyleContainerElement()
         * @generated
         */
        EClass STYLE_CONTAINER_ELEMENT = eINSTANCE.getStyleContainerElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_CONTAINER_ELEMENT__NAME = eINSTANCE.getStyleContainerElement_Name();

        /**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_CONTAINER_ELEMENT__DESCRIPTION = eINSTANCE.getStyleContainerElement_Description();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.StyleImpl <em>Style</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.StyleImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyle()
         * @generated
         */
        EClass STYLE = eINSTANCE.getStyle();

        /**
         * The meta object literal for the '<em><b>Super Style</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__SUPER_STYLE = eINSTANCE.getStyle_SuperStyle();

        /**
         * The meta object literal for the '<em><b>Super Style From Dsl</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__SUPER_STYLE_FROM_DSL = eINSTANCE.getStyle_SuperStyleFromDsl();

        /**
         * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE__LAYOUT = eINSTANCE.getStyle_Layout();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.GradientImpl <em>Gradient</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.GradientImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradient()
         * @generated
         */
        EClass GRADIENT = eINSTANCE.getGradient();

        /**
         * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT__LAYOUT = eINSTANCE.getGradient_Layout();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl <em>Style Layout</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.StyleLayoutImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getStyleLayout()
         * @generated
         */
        EClass STYLE_LAYOUT = eINSTANCE.getStyleLayout();

        /**
         * The meta object literal for the '<em><b>Transparency</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__TRANSPARENCY = eINSTANCE.getStyleLayout_Transparency();

        /**
         * The meta object literal for the '<em><b>Background</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE_LAYOUT__BACKGROUND = eINSTANCE.getStyleLayout_Background();

        /**
         * The meta object literal for the '<em><b>Gradient orientation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__GRADIENT_ORIENTATION = eINSTANCE.getStyleLayout_Gradient_orientation();

        /**
         * The meta object literal for the '<em><b>Highlighting</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE_LAYOUT__HIGHLIGHTING = eINSTANCE.getStyleLayout_Highlighting();

        /**
         * The meta object literal for the '<em><b>Line Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE_LAYOUT__LINE_COLOR = eINSTANCE.getStyleLayout_LineColor();

        /**
         * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__LINE_WIDTH = eINSTANCE.getStyleLayout_LineWidth();

        /**
         * The meta object literal for the '<em><b>Line Style</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__LINE_STYLE = eINSTANCE.getStyleLayout_LineStyle();

        /**
         * The meta object literal for the '<em><b>Font Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__FONT_NAME = eINSTANCE.getStyleLayout_FontName();

        /**
         * The meta object literal for the '<em><b>Font Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STYLE_LAYOUT__FONT_COLOR = eINSTANCE.getStyleLayout_FontColor();

        /**
         * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__FONT_SIZE = eINSTANCE.getStyleLayout_FontSize();

        /**
         * The meta object literal for the '<em><b>Font Italic</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__FONT_ITALIC = eINSTANCE.getStyleLayout_FontItalic();

        /**
         * The meta object literal for the '<em><b>Font Bold</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STYLE_LAYOUT__FONT_BOLD = eINSTANCE.getStyleLayout_FontBold();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.GradientLayoutImpl <em>Gradient Layout</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.GradientLayoutImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientLayout()
         * @generated
         */
        EClass GRADIENT_LAYOUT = eINSTANCE.getGradientLayout();

        /**
         * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT_LAYOUT__AREA = eINSTANCE.getGradientLayout_Area();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.HighlightingValuesImpl <em>Highlighting Values</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.HighlightingValuesImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getHighlightingValues()
         * @generated
         */
        EClass HIGHLIGHTING_VALUES = eINSTANCE.getHighlightingValues();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIGHLIGHTING_VALUES__SELECTED = eINSTANCE.getHighlightingValues_Selected();

        /**
         * The meta object literal for the '<em><b>Multiselected</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIGHLIGHTING_VALUES__MULTISELECTED = eINSTANCE.getHighlightingValues_Multiselected();

        /**
         * The meta object literal for the '<em><b>Allowed</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIGHLIGHTING_VALUES__ALLOWED = eINSTANCE.getHighlightingValues_Allowed();

        /**
         * The meta object literal for the '<em><b>Unallowed</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HIGHLIGHTING_VALUES__UNALLOWED = eINSTANCE.getHighlightingValues_Unallowed();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.GradientColorAreaImpl <em>Gradient Color Area</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.GradientColorAreaImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientColorArea()
         * @generated
         */
        EClass GRADIENT_COLOR_AREA = eINSTANCE.getGradientColorArea();

        /**
         * The meta object literal for the '<em><b>Color</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT_COLOR_AREA__COLOR = eINSTANCE.getGradientColorArea_Color();

        /**
         * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute GRADIENT_COLOR_AREA__OFFSET = eINSTANCE.getGradientColorArea_Offset();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.ColorOrGradientImpl <em>Color Or Gradient</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.ColorOrGradientImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorOrGradient()
         * @generated
         */
        EClass COLOR_OR_GRADIENT = eINSTANCE.getColorOrGradient();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.ColorWithTransparencyImpl <em>Color With Transparency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.ColorWithTransparencyImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorWithTransparency()
         * @generated
         */
        EClass COLOR_WITH_TRANSPARENCY = eINSTANCE.getColorWithTransparency();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.ColorImpl <em>Color</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.ColorImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColor()
         * @generated
         */
        EClass COLOR = eINSTANCE.getColor();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.RGBColorImpl <em>RGB Color</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.RGBColorImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getRGBColor()
         * @generated
         */
        EClass RGB_COLOR = eINSTANCE.getRGBColor();

        /**
         * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RGB_COLOR__RED = eINSTANCE.getRGBColor_Red();

        /**
         * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RGB_COLOR__GREEN = eINSTANCE.getRGBColor_Green();

        /**
         * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RGB_COLOR__BLUE = eINSTANCE.getRGBColor_Blue();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.GradientRefImpl <em>Gradient Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.GradientRefImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientRef()
         * @generated
         */
        EClass GRADIENT_REF = eINSTANCE.getGradientRef();

        /**
         * The meta object literal for the '<em><b>Gradient Ref</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT_REF__GRADIENT_REF = eINSTANCE.getGradientRef_GradientRef();

        /**
         * The meta object literal for the '<em><b>Gradient Ref From Dsl</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GRADIENT_REF__GRADIENT_REF_FROM_DSL = eINSTANCE.getGradientRef_GradientRefFromDsl();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.ColorConstantRefImpl <em>Color Constant Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.ColorConstantRefImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorConstantRef()
         * @generated
         */
        EClass COLOR_CONSTANT_REF = eINSTANCE.getColorConstantRef();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLOR_CONSTANT_REF__VALUE = eINSTANCE.getColorConstantRef_Value();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.impl.TransparentImpl <em>Transparent</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.impl.TransparentImpl
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getTransparent()
         * @generated
         */
        EClass TRANSPARENT = eINSTANCE.getTransparent();

        /**
         * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSPARENT__TRANSPARENT = eINSTANCE.getTransparent_Transparent();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.ColorConstants <em>Color Constants</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.ColorConstants
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getColorConstants()
         * @generated
         */
        EEnum COLOR_CONSTANTS = eINSTANCE.getColorConstants();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.LineStyle <em>Line Style</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.LineStyle
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getLineStyle()
         * @generated
         */
        EEnum LINE_STYLE = eINSTANCE.getLineStyle();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.YesNoBool <em>Yes No Bool</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.YesNoBool
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getYesNoBool()
         * @generated
         */
        EEnum YES_NO_BOOL = eINSTANCE.getYesNoBool();

        /**
         * The meta object literal for the '{@link org.eclipselabs.spray.styles.GradientAllignment <em>Gradient Allignment</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipselabs.spray.styles.GradientAllignment
         * @see org.eclipselabs.spray.styles.impl.StylesPackageImpl#getGradientAllignment()
         * @generated
         */
        EEnum GRADIENT_ALLIGNMENT = eINSTANCE.getGradientAllignment();

    }

} //StylesPackage
