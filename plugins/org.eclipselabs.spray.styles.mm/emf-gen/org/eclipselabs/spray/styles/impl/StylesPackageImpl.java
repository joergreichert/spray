/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorConstantRef;
import org.eclipselabs.spray.styles.ColorConstants;
import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.Gradient;
import org.eclipselabs.spray.styles.GradientAllignment;
import org.eclipselabs.spray.styles.GradientColorArea;
import org.eclipselabs.spray.styles.GradientLayout;
import org.eclipselabs.spray.styles.GradientRef;
import org.eclipselabs.spray.styles.HighlightingValues;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.RGBColor;
import org.eclipselabs.spray.styles.Style;
import org.eclipselabs.spray.styles.StyleContainer;
import org.eclipselabs.spray.styles.StyleContainerElement;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesFactory;
import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.spray.styles.Transparent;
import org.eclipselabs.spray.styles.YesNoBool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StylesPackageImpl extends EPackageImpl implements StylesPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleContainerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highlightingValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientColorAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorOrGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorWithTransparencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorConstantRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transparentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorConstantsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yesNoBoolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gradientAllignmentEEnum = null;

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
	 * @see org.eclipselabs.spray.styles.StylesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StylesPackageImpl()
	{
		super(eNS_URI, StylesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StylesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StylesPackage init()
	{
		if (isInited) return (StylesPackage)EPackage.Registry.INSTANCE.getEPackage(StylesPackage.eNS_URI);

		// Obtain or create and register package
		StylesPackageImpl theStylesPackage = (StylesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StylesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StylesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theStylesPackage.createPackageContents();

		// Initialize created meta-data
		theStylesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStylesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StylesPackage.eNS_URI, theStylesPackage);
		return theStylesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleContainer()
	{
		return styleContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleContainer_StyleContainerElement()
	{
		return (EReference)styleContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleContainerElement()
	{
		return styleContainerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleContainerElement_Name()
	{
		return (EAttribute)styleContainerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleContainerElement_Description()
	{
		return (EAttribute)styleContainerElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyle()
	{
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyle_SuperStyle()
	{
		return (EReference)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyle_SuperStyleFromDsl()
	{
		return (EReference)styleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyle_Layout()
	{
		return (EReference)styleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradient()
	{
		return gradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradient_Layout()
	{
		return (EReference)gradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleLayout()
	{
		return styleLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_Transparency()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleLayout_Background()
	{
		return (EReference)styleLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_Gradient_orientation()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleLayout_Highlighting()
	{
		return (EReference)styleLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleLayout_LineColor()
	{
		return (EReference)styleLayoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_LineWidth()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_LineStyle()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_FontName()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleLayout_FontColor()
	{
		return (EReference)styleLayoutEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_FontSize()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_FontItalic()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleLayout_FontBold()
	{
		return (EAttribute)styleLayoutEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientLayout()
	{
		return gradientLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradientLayout_Area()
	{
		return (EReference)gradientLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHighlightingValues()
	{
		return highlightingValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighlightingValues_Selected()
	{
		return (EReference)highlightingValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighlightingValues_Multiselected()
	{
		return (EReference)highlightingValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighlightingValues_Allowed()
	{
		return (EReference)highlightingValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHighlightingValues_Unallowed()
	{
		return (EReference)highlightingValuesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientColorArea()
	{
		return gradientColorAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradientColorArea_Color()
	{
		return (EReference)gradientColorAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientColorArea_Offset()
	{
		return (EAttribute)gradientColorAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorOrGradient()
	{
		return colorOrGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorWithTransparency()
	{
		return colorWithTransparencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColor()
	{
		return colorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBColor()
	{
		return rgbColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Red()
	{
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Green()
	{
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBColor_Blue()
	{
		return (EAttribute)rgbColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientRef()
	{
		return gradientRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradientRef_GradientRef()
	{
		return (EReference)gradientRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGradientRef_GradientRefFromDsl()
	{
		return (EReference)gradientRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorConstantRef()
	{
		return colorConstantRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorConstantRef_Value()
	{
		return (EAttribute)colorConstantRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransparent()
	{
		return transparentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransparent_Transparent()
	{
		return (EAttribute)transparentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorConstants()
	{
		return colorConstantsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineStyle()
	{
		return lineStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYesNoBool()
	{
		return yesNoBoolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGradientAllignment()
	{
		return gradientAllignmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylesFactory getStylesFactory()
	{
		return (StylesFactory)getEFactoryInstance();
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
		styleContainerEClass = createEClass(STYLE_CONTAINER);
		createEReference(styleContainerEClass, STYLE_CONTAINER__STYLE_CONTAINER_ELEMENT);

		styleContainerElementEClass = createEClass(STYLE_CONTAINER_ELEMENT);
		createEAttribute(styleContainerElementEClass, STYLE_CONTAINER_ELEMENT__NAME);
		createEAttribute(styleContainerElementEClass, STYLE_CONTAINER_ELEMENT__DESCRIPTION);

		styleEClass = createEClass(STYLE);
		createEReference(styleEClass, STYLE__SUPER_STYLE);
		createEReference(styleEClass, STYLE__SUPER_STYLE_FROM_DSL);
		createEReference(styleEClass, STYLE__LAYOUT);

		gradientEClass = createEClass(GRADIENT);
		createEReference(gradientEClass, GRADIENT__LAYOUT);

		styleLayoutEClass = createEClass(STYLE_LAYOUT);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__TRANSPARENCY);
		createEReference(styleLayoutEClass, STYLE_LAYOUT__BACKGROUND);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__GRADIENT_ORIENTATION);
		createEReference(styleLayoutEClass, STYLE_LAYOUT__HIGHLIGHTING);
		createEReference(styleLayoutEClass, STYLE_LAYOUT__LINE_COLOR);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__LINE_WIDTH);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__LINE_STYLE);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__FONT_NAME);
		createEReference(styleLayoutEClass, STYLE_LAYOUT__FONT_COLOR);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__FONT_SIZE);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__FONT_ITALIC);
		createEAttribute(styleLayoutEClass, STYLE_LAYOUT__FONT_BOLD);

		gradientLayoutEClass = createEClass(GRADIENT_LAYOUT);
		createEReference(gradientLayoutEClass, GRADIENT_LAYOUT__AREA);

		highlightingValuesEClass = createEClass(HIGHLIGHTING_VALUES);
		createEReference(highlightingValuesEClass, HIGHLIGHTING_VALUES__SELECTED);
		createEReference(highlightingValuesEClass, HIGHLIGHTING_VALUES__MULTISELECTED);
		createEReference(highlightingValuesEClass, HIGHLIGHTING_VALUES__ALLOWED);
		createEReference(highlightingValuesEClass, HIGHLIGHTING_VALUES__UNALLOWED);

		gradientColorAreaEClass = createEClass(GRADIENT_COLOR_AREA);
		createEReference(gradientColorAreaEClass, GRADIENT_COLOR_AREA__COLOR);
		createEAttribute(gradientColorAreaEClass, GRADIENT_COLOR_AREA__OFFSET);

		colorOrGradientEClass = createEClass(COLOR_OR_GRADIENT);

		colorWithTransparencyEClass = createEClass(COLOR_WITH_TRANSPARENCY);

		colorEClass = createEClass(COLOR);

		rgbColorEClass = createEClass(RGB_COLOR);
		createEAttribute(rgbColorEClass, RGB_COLOR__RED);
		createEAttribute(rgbColorEClass, RGB_COLOR__GREEN);
		createEAttribute(rgbColorEClass, RGB_COLOR__BLUE);

		gradientRefEClass = createEClass(GRADIENT_REF);
		createEReference(gradientRefEClass, GRADIENT_REF__GRADIENT_REF);
		createEReference(gradientRefEClass, GRADIENT_REF__GRADIENT_REF_FROM_DSL);

		colorConstantRefEClass = createEClass(COLOR_CONSTANT_REF);
		createEAttribute(colorConstantRefEClass, COLOR_CONSTANT_REF__VALUE);

		transparentEClass = createEClass(TRANSPARENT);
		createEAttribute(transparentEClass, TRANSPARENT__TRANSPARENT);

		// Create enums
		colorConstantsEEnum = createEEnum(COLOR_CONSTANTS);
		lineStyleEEnum = createEEnum(LINE_STYLE);
		yesNoBoolEEnum = createEEnum(YES_NO_BOOL);
		gradientAllignmentEEnum = createEEnum(GRADIENT_ALLIGNMENT);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		styleEClass.getESuperTypes().add(this.getStyleContainerElement());
		gradientEClass.getESuperTypes().add(this.getStyleContainerElement());
		colorEClass.getESuperTypes().add(this.getColorOrGradient());
		colorEClass.getESuperTypes().add(this.getColorWithTransparency());
		rgbColorEClass.getESuperTypes().add(this.getColor());
		gradientRefEClass.getESuperTypes().add(this.getColorOrGradient());
		colorConstantRefEClass.getESuperTypes().add(this.getColor());
		transparentEClass.getESuperTypes().add(this.getColorOrGradient());
		transparentEClass.getESuperTypes().add(this.getColorWithTransparency());

		// Initialize classes and features; add operations and parameters
		initEClass(styleContainerEClass, StyleContainer.class, "StyleContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleContainer_StyleContainerElement(), this.getStyleContainerElement(), null, "styleContainerElement", null, 0, -1, StyleContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleContainerElementEClass, StyleContainerElement.class, "StyleContainerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleContainerElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, StyleContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleContainerElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, StyleContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyle_SuperStyle(), theTypesPackage.getJvmTypeReference(), null, "superStyle", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyle_SuperStyleFromDsl(), this.getStyle(), null, "superStyleFromDsl", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyle_Layout(), this.getStyleLayout(), null, "layout", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientEClass, Gradient.class, "Gradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradient_Layout(), this.getGradientLayout(), null, "layout", null, 0, 1, Gradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleLayoutEClass, StyleLayout.class, "StyleLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleLayout_Transparency(), ecorePackage.getEDouble(), "transparency", "4.9E-324", 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleLayout_Background(), this.getColorOrGradient(), null, "background", null, 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_Gradient_orientation(), this.getGradientAllignment(), "gradient_orientation", null, 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleLayout_Highlighting(), this.getHighlightingValues(), null, "highlighting", null, 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleLayout_LineColor(), this.getColorWithTransparency(), null, "lineColor", null, 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_LineWidth(), ecorePackage.getEInt(), "lineWidth", "-2147483648", 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_LineStyle(), this.getLineStyle(), "lineStyle", "null", 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_FontName(), ecorePackage.getEString(), "fontName", null, 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleLayout_FontColor(), this.getColor(), null, "fontColor", null, 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_FontSize(), ecorePackage.getEInt(), "fontSize", "-2147483648", 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_FontItalic(), this.getYesNoBool(), "fontItalic", "null", 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleLayout_FontBold(), this.getYesNoBool(), "fontBold", "null", 0, 1, StyleLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientLayoutEClass, GradientLayout.class, "GradientLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradientLayout_Area(), this.getGradientColorArea(), null, "area", null, 0, -1, GradientLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highlightingValuesEClass, HighlightingValues.class, "HighlightingValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHighlightingValues_Selected(), this.getColorOrGradient(), null, "selected", null, 0, 1, HighlightingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighlightingValues_Multiselected(), this.getColorOrGradient(), null, "multiselected", null, 0, 1, HighlightingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighlightingValues_Allowed(), this.getColorOrGradient(), null, "allowed", null, 0, 1, HighlightingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighlightingValues_Unallowed(), this.getColorOrGradient(), null, "unallowed", null, 0, 1, HighlightingValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientColorAreaEClass, GradientColorArea.class, "GradientColorArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradientColorArea_Color(), this.getColor(), null, "color", null, 0, 1, GradientColorArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientColorArea_Offset(), ecorePackage.getEDouble(), "offset", null, 0, 1, GradientColorArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorOrGradientEClass, ColorOrGradient.class, "ColorOrGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorWithTransparencyEClass, ColorWithTransparency.class, "ColorWithTransparency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rgbColorEClass, RGBColor.class, "RGBColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBColor_Red(), ecorePackage.getEInt(), "red", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Green(), ecorePackage.getEInt(), "green", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBColor_Blue(), ecorePackage.getEInt(), "blue", null, 0, 1, RGBColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientRefEClass, GradientRef.class, "GradientRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGradientRef_GradientRef(), theTypesPackage.getJvmTypeReference(), null, "gradientRef", null, 0, 1, GradientRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGradientRef_GradientRefFromDsl(), this.getGradient(), null, "gradientRefFromDsl", null, 0, 1, GradientRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorConstantRefEClass, ColorConstantRef.class, "ColorConstantRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorConstantRef_Value(), this.getColorConstants(), "value", null, 0, 1, ColorConstantRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transparentEClass, Transparent.class, "Transparent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransparent_Transparent(), ecorePackage.getEBoolean(), "transparent", null, 0, 1, Transparent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorConstantsEEnum, ColorConstants.class, "ColorConstants");
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.WHITE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.LIGHT_LIGHT_GRAY);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.LIGHT_GRAY);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.GRAY);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.DARK_GRAY);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.BLACK);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.RED);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.LIGHT_ORANGE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.ORANGE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.DARK_ORANGE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.YELLOW);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.GREEN);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.LIGHT_GREEN);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.DARK_GREEN);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.CYAN);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.LIGHT_BLUE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.BLUE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.DARK_BLUE);
		addEEnumLiteral(colorConstantsEEnum, ColorConstants.NULL);

		initEEnum(lineStyleEEnum, LineStyle.class, "LineStyle");
		addEEnumLiteral(lineStyleEEnum, LineStyle.SOLID);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASH);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHDOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.DASHDOTDOT);
		addEEnumLiteral(lineStyleEEnum, LineStyle.NULL);

		initEEnum(yesNoBoolEEnum, YesNoBool.class, "YesNoBool");
		addEEnumLiteral(yesNoBoolEEnum, YesNoBool.YES);
		addEEnumLiteral(yesNoBoolEEnum, YesNoBool.NO);
		addEEnumLiteral(yesNoBoolEEnum, YesNoBool.NULL);

		initEEnum(gradientAllignmentEEnum, GradientAllignment.class, "GradientAllignment");
		addEEnumLiteral(gradientAllignmentEEnum, GradientAllignment.HORIZONTAL);
		addEEnumLiteral(gradientAllignmentEEnum, GradientAllignment.VERTICAL);
		addEEnumLiteral(gradientAllignmentEEnum, GradientAllignment.NULL);

		// Create resource
		createResource(eNS_URI);
	}

} //StylesPackageImpl
