/**
 */
package org.eclipselabs.spray.styles;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getGradient_orientation <em>Gradient orientation</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getHighlighting <em>Highlighting</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.StyleLayout#getFontBold <em>Font Bold</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout()
 * @model
 * @generated
 */
public interface StyleLayout extends EObject {
    /**
     * Returns the value of the '<em><b>Transparency</b></em>' attribute.
     * The default value is <code>"4.9E-324"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transparency</em>' attribute.
     * @see #setTransparency(double)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_Transparency()
     * @model default="4.9E-324"
     * @generated
     */
    double getTransparency();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getTransparency <em>Transparency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transparency</em>' attribute.
     * @see #getTransparency()
     * @generated
     */
    void setTransparency(double value);

    /**
     * Returns the value of the '<em><b>Background</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Background</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Background</em>' containment reference.
     * @see #setBackground(ColorOrGradient)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_Background()
     * @model containment="true"
     * @generated
     */
    ColorOrGradient getBackground();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getBackground <em>Background</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Background</em>' containment reference.
     * @see #getBackground()
     * @generated
     */
    void setBackground(ColorOrGradient value);

    /**
     * Returns the value of the '<em><b>Gradient orientation</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipselabs.spray.styles.GradientAllignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gradient orientation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gradient orientation</em>' attribute.
     * @see org.eclipselabs.spray.styles.GradientAllignment
     * @see #setGradient_orientation(GradientAllignment)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_Gradient_orientation()
     * @model
     * @generated
     */
    GradientAllignment getGradient_orientation();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getGradient_orientation <em>Gradient orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gradient orientation</em>' attribute.
     * @see org.eclipselabs.spray.styles.GradientAllignment
     * @see #getGradient_orientation()
     * @generated
     */
    void setGradient_orientation(GradientAllignment value);

    /**
     * Returns the value of the '<em><b>Highlighting</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Highlighting</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Highlighting</em>' containment reference.
     * @see #setHighlighting(HighlightingValues)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_Highlighting()
     * @model containment="true"
     * @generated
     */
    HighlightingValues getHighlighting();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getHighlighting <em>Highlighting</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Highlighting</em>' containment reference.
     * @see #getHighlighting()
     * @generated
     */
    void setHighlighting(HighlightingValues value);

    /**
     * Returns the value of the '<em><b>Line Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Color</em>' containment reference.
     * @see #setLineColor(ColorWithTransparency)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_LineColor()
     * @model containment="true"
     * @generated
     */
    ColorWithTransparency getLineColor();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getLineColor <em>Line Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Color</em>' containment reference.
     * @see #getLineColor()
     * @generated
     */
    void setLineColor(ColorWithTransparency value);

    /**
     * Returns the value of the '<em><b>Line Width</b></em>' attribute.
     * The default value is <code>"-2147483648"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Width</em>' attribute.
     * @see #setLineWidth(int)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_LineWidth()
     * @model default="-2147483648"
     * @generated
     */
    int getLineWidth();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getLineWidth <em>Line Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Width</em>' attribute.
     * @see #getLineWidth()
     * @generated
     */
    void setLineWidth(int value);

    /**
     * Returns the value of the '<em><b>Line Style</b></em>' attribute.
     * The default value is <code>"null"</code>.
     * The literals are from the enumeration {@link org.eclipselabs.spray.styles.LineStyle}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Line Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Line Style</em>' attribute.
     * @see org.eclipselabs.spray.styles.LineStyle
     * @see #setLineStyle(LineStyle)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_LineStyle()
     * @model default="null"
     * @generated
     */
    LineStyle getLineStyle();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getLineStyle <em>Line Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Line Style</em>' attribute.
     * @see org.eclipselabs.spray.styles.LineStyle
     * @see #getLineStyle()
     * @generated
     */
    void setLineStyle(LineStyle value);

    /**
     * Returns the value of the '<em><b>Font Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Name</em>' attribute.
     * @see #setFontName(String)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_FontName()
     * @model
     * @generated
     */
    String getFontName();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getFontName <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Name</em>' attribute.
     * @see #getFontName()
     * @generated
     */
    void setFontName(String value);

    /**
     * Returns the value of the '<em><b>Font Color</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Color</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Color</em>' containment reference.
     * @see #setFontColor(Color)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_FontColor()
     * @model containment="true"
     * @generated
     */
    Color getFontColor();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getFontColor <em>Font Color</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Color</em>' containment reference.
     * @see #getFontColor()
     * @generated
     */
    void setFontColor(Color value);

    /**
     * Returns the value of the '<em><b>Font Size</b></em>' attribute.
     * The default value is <code>"-2147483648"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Size</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Size</em>' attribute.
     * @see #setFontSize(int)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_FontSize()
     * @model default="-2147483648"
     * @generated
     */
    int getFontSize();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getFontSize <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Size</em>' attribute.
     * @see #getFontSize()
     * @generated
     */
    void setFontSize(int value);

    /**
     * Returns the value of the '<em><b>Font Italic</b></em>' attribute.
     * The default value is <code>"null"</code>.
     * The literals are from the enumeration {@link org.eclipselabs.spray.styles.YesNoBool}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Italic</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Italic</em>' attribute.
     * @see org.eclipselabs.spray.styles.YesNoBool
     * @see #setFontItalic(YesNoBool)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_FontItalic()
     * @model default="null"
     * @generated
     */
    YesNoBool getFontItalic();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getFontItalic <em>Font Italic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Italic</em>' attribute.
     * @see org.eclipselabs.spray.styles.YesNoBool
     * @see #getFontItalic()
     * @generated
     */
    void setFontItalic(YesNoBool value);

    /**
     * Returns the value of the '<em><b>Font Bold</b></em>' attribute.
     * The default value is <code>"null"</code>.
     * The literals are from the enumeration {@link org.eclipselabs.spray.styles.YesNoBool}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Font Bold</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Font Bold</em>' attribute.
     * @see org.eclipselabs.spray.styles.YesNoBool
     * @see #setFontBold(YesNoBool)
     * @see org.eclipselabs.spray.styles.StylesPackage#getStyleLayout_FontBold()
     * @model default="null"
     * @generated
     */
    YesNoBool getFontBold();

    /**
     * Sets the value of the '{@link org.eclipselabs.spray.styles.StyleLayout#getFontBold <em>Font Bold</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Bold</em>' attribute.
     * @see org.eclipselabs.spray.styles.YesNoBool
     * @see #getFontBold()
     * @generated
     */
    void setFontBold(YesNoBool value);

} // StyleLayout
