/**
 */
package org.eclipselabs.spray.styles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.styles.Color;
import org.eclipselabs.spray.styles.ColorOrGradient;
import org.eclipselabs.spray.styles.ColorWithTransparency;
import org.eclipselabs.spray.styles.GradientAllignment;
import org.eclipselabs.spray.styles.HighlightingValues;
import org.eclipselabs.spray.styles.LineStyle;
import org.eclipselabs.spray.styles.StyleLayout;
import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.spray.styles.YesNoBool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getGradient_orientation <em>Gradient orientation</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getHighlighting <em>Highlighting</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getLineColor <em>Line Color</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getFontColor <em>Font Color</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getFontItalic <em>Font Italic</em>}</li>
 *   <li>{@link org.eclipselabs.spray.styles.impl.StyleLayoutImpl#getFontBold <em>Font Bold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleLayoutImpl extends MinimalEObjectImpl.Container implements StyleLayout
{
	/**
     * The default value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTransparency()
     * @generated
     * @ordered
     */
	protected static final double TRANSPARENCY_EDEFAULT = 4.9E-324;

	/**
     * The cached value of the '{@link #getTransparency() <em>Transparency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTransparency()
     * @generated
     * @ordered
     */
	protected double transparency = TRANSPARENCY_EDEFAULT;

	/**
     * The cached value of the '{@link #getBackground() <em>Background</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBackground()
     * @generated
     * @ordered
     */
	protected ColorOrGradient background;

	/**
     * The default value of the '{@link #getGradient_orientation() <em>Gradient orientation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGradient_orientation()
     * @generated
     * @ordered
     */
	protected static final GradientAllignment GRADIENT_ORIENTATION_EDEFAULT = GradientAllignment.HORIZONTAL;

	/**
     * The cached value of the '{@link #getGradient_orientation() <em>Gradient orientation</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGradient_orientation()
     * @generated
     * @ordered
     */
	protected GradientAllignment gradient_orientation = GRADIENT_ORIENTATION_EDEFAULT;

	/**
     * The cached value of the '{@link #getHighlighting() <em>Highlighting</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHighlighting()
     * @generated
     * @ordered
     */
	protected HighlightingValues highlighting;

	/**
     * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLineColor()
     * @generated
     * @ordered
     */
	protected ColorWithTransparency lineColor;

	/**
     * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLineWidth()
     * @generated
     * @ordered
     */
	protected static final int LINE_WIDTH_EDEFAULT = -2147483648;

	/**
     * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLineWidth()
     * @generated
     * @ordered
     */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
     * The default value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLineStyle()
     * @generated
     * @ordered
     */
	protected static final LineStyle LINE_STYLE_EDEFAULT = LineStyle.NULL;

	/**
     * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLineStyle()
     * @generated
     * @ordered
     */
	protected LineStyle lineStyle = LINE_STYLE_EDEFAULT;

	/**
     * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontName()
     * @generated
     * @ordered
     */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontName()
     * @generated
     * @ordered
     */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
     * The cached value of the '{@link #getFontColor() <em>Font Color</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontColor()
     * @generated
     * @ordered
     */
	protected Color fontColor;

	/**
     * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontSize()
     * @generated
     * @ordered
     */
	protected static final int FONT_SIZE_EDEFAULT = -2147483648;

	/**
     * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontSize()
     * @generated
     * @ordered
     */
	protected int fontSize = FONT_SIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getFontItalic() <em>Font Italic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontItalic()
     * @generated
     * @ordered
     */
	protected static final YesNoBool FONT_ITALIC_EDEFAULT = YesNoBool.NULL;

	/**
     * The cached value of the '{@link #getFontItalic() <em>Font Italic</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontItalic()
     * @generated
     * @ordered
     */
	protected YesNoBool fontItalic = FONT_ITALIC_EDEFAULT;

	/**
     * The default value of the '{@link #getFontBold() <em>Font Bold</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontBold()
     * @generated
     * @ordered
     */
	protected static final YesNoBool FONT_BOLD_EDEFAULT = YesNoBool.NULL;

	/**
     * The cached value of the '{@link #getFontBold() <em>Font Bold</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFontBold()
     * @generated
     * @ordered
     */
	protected YesNoBool fontBold = FONT_BOLD_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected StyleLayoutImpl()
	{
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass()
	{
        return StylesPackage.Literals.STYLE_LAYOUT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public double getTransparency()
	{
        return transparency;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTransparency(double newTransparency)
	{
        double oldTransparency = transparency;
        transparency = newTransparency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__TRANSPARENCY, oldTransparency, transparency));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ColorOrGradient getBackground()
	{
        return background;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetBackground(ColorOrGradient newBackground, NotificationChain msgs)
	{
        ColorOrGradient oldBackground = background;
        background = newBackground;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__BACKGROUND, oldBackground, newBackground);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBackground(ColorOrGradient newBackground)
	{
        if (newBackground != background) {
            NotificationChain msgs = null;
            if (background != null)
                msgs = ((InternalEObject)background).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__BACKGROUND, null, msgs);
            if (newBackground != null)
                msgs = ((InternalEObject)newBackground).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__BACKGROUND, null, msgs);
            msgs = basicSetBackground(newBackground, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__BACKGROUND, newBackground, newBackground));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public GradientAllignment getGradient_orientation()
	{
        return gradient_orientation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGradient_orientation(GradientAllignment newGradient_orientation)
	{
        GradientAllignment oldGradient_orientation = gradient_orientation;
        gradient_orientation = newGradient_orientation == null ? GRADIENT_ORIENTATION_EDEFAULT : newGradient_orientation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__GRADIENT_ORIENTATION, oldGradient_orientation, gradient_orientation));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public HighlightingValues getHighlighting()
	{
        return highlighting;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetHighlighting(HighlightingValues newHighlighting, NotificationChain msgs)
	{
        HighlightingValues oldHighlighting = highlighting;
        highlighting = newHighlighting;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__HIGHLIGHTING, oldHighlighting, newHighlighting);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHighlighting(HighlightingValues newHighlighting)
	{
        if (newHighlighting != highlighting) {
            NotificationChain msgs = null;
            if (highlighting != null)
                msgs = ((InternalEObject)highlighting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__HIGHLIGHTING, null, msgs);
            if (newHighlighting != null)
                msgs = ((InternalEObject)newHighlighting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__HIGHLIGHTING, null, msgs);
            msgs = basicSetHighlighting(newHighlighting, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__HIGHLIGHTING, newHighlighting, newHighlighting));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ColorWithTransparency getLineColor()
	{
        return lineColor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLineColor(ColorWithTransparency newLineColor, NotificationChain msgs)
	{
        ColorWithTransparency oldLineColor = lineColor;
        lineColor = newLineColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__LINE_COLOR, oldLineColor, newLineColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLineColor(ColorWithTransparency newLineColor)
	{
        if (newLineColor != lineColor) {
            NotificationChain msgs = null;
            if (lineColor != null)
                msgs = ((InternalEObject)lineColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__LINE_COLOR, null, msgs);
            if (newLineColor != null)
                msgs = ((InternalEObject)newLineColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__LINE_COLOR, null, msgs);
            msgs = basicSetLineColor(newLineColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__LINE_COLOR, newLineColor, newLineColor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getLineWidth()
	{
        return lineWidth;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLineWidth(int newLineWidth)
	{
        int oldLineWidth = lineWidth;
        lineWidth = newLineWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__LINE_WIDTH, oldLineWidth, lineWidth));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LineStyle getLineStyle()
	{
        return lineStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLineStyle(LineStyle newLineStyle)
	{
        LineStyle oldLineStyle = lineStyle;
        lineStyle = newLineStyle == null ? LINE_STYLE_EDEFAULT : newLineStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__LINE_STYLE, oldLineStyle, lineStyle));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getFontName()
	{
        return fontName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontName(String newFontName)
	{
        String oldFontName = fontName;
        fontName = newFontName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__FONT_NAME, oldFontName, fontName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Color getFontColor()
	{
        return fontColor;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetFontColor(Color newFontColor, NotificationChain msgs)
	{
        Color oldFontColor = fontColor;
        fontColor = newFontColor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__FONT_COLOR, oldFontColor, newFontColor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontColor(Color newFontColor)
	{
        if (newFontColor != fontColor) {
            NotificationChain msgs = null;
            if (fontColor != null)
                msgs = ((InternalEObject)fontColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__FONT_COLOR, null, msgs);
            if (newFontColor != null)
                msgs = ((InternalEObject)newFontColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StylesPackage.STYLE_LAYOUT__FONT_COLOR, null, msgs);
            msgs = basicSetFontColor(newFontColor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__FONT_COLOR, newFontColor, newFontColor));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getFontSize()
	{
        return fontSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontSize(int newFontSize)
	{
        int oldFontSize = fontSize;
        fontSize = newFontSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__FONT_SIZE, oldFontSize, fontSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public YesNoBool getFontItalic()
	{
        return fontItalic;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontItalic(YesNoBool newFontItalic)
	{
        YesNoBool oldFontItalic = fontItalic;
        fontItalic = newFontItalic == null ? FONT_ITALIC_EDEFAULT : newFontItalic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__FONT_ITALIC, oldFontItalic, fontItalic));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public YesNoBool getFontBold()
	{
        return fontBold;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFontBold(YesNoBool newFontBold)
	{
        YesNoBool oldFontBold = fontBold;
        fontBold = newFontBold == null ? FONT_BOLD_EDEFAULT : newFontBold;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, StylesPackage.STYLE_LAYOUT__FONT_BOLD, oldFontBold, fontBold));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
        switch (featureID) {
            case StylesPackage.STYLE_LAYOUT__BACKGROUND:
                return basicSetBackground(null, msgs);
            case StylesPackage.STYLE_LAYOUT__HIGHLIGHTING:
                return basicSetHighlighting(null, msgs);
            case StylesPackage.STYLE_LAYOUT__LINE_COLOR:
                return basicSetLineColor(null, msgs);
            case StylesPackage.STYLE_LAYOUT__FONT_COLOR:
                return basicSetFontColor(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
        switch (featureID) {
            case StylesPackage.STYLE_LAYOUT__TRANSPARENCY:
                return getTransparency();
            case StylesPackage.STYLE_LAYOUT__BACKGROUND:
                return getBackground();
            case StylesPackage.STYLE_LAYOUT__GRADIENT_ORIENTATION:
                return getGradient_orientation();
            case StylesPackage.STYLE_LAYOUT__HIGHLIGHTING:
                return getHighlighting();
            case StylesPackage.STYLE_LAYOUT__LINE_COLOR:
                return getLineColor();
            case StylesPackage.STYLE_LAYOUT__LINE_WIDTH:
                return getLineWidth();
            case StylesPackage.STYLE_LAYOUT__LINE_STYLE:
                return getLineStyle();
            case StylesPackage.STYLE_LAYOUT__FONT_NAME:
                return getFontName();
            case StylesPackage.STYLE_LAYOUT__FONT_COLOR:
                return getFontColor();
            case StylesPackage.STYLE_LAYOUT__FONT_SIZE:
                return getFontSize();
            case StylesPackage.STYLE_LAYOUT__FONT_ITALIC:
                return getFontItalic();
            case StylesPackage.STYLE_LAYOUT__FONT_BOLD:
                return getFontBold();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue)
	{
        switch (featureID) {
            case StylesPackage.STYLE_LAYOUT__TRANSPARENCY:
                setTransparency((Double)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__BACKGROUND:
                setBackground((ColorOrGradient)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__GRADIENT_ORIENTATION:
                setGradient_orientation((GradientAllignment)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__HIGHLIGHTING:
                setHighlighting((HighlightingValues)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__LINE_COLOR:
                setLineColor((ColorWithTransparency)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__LINE_WIDTH:
                setLineWidth((Integer)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__LINE_STYLE:
                setLineStyle((LineStyle)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_NAME:
                setFontName((String)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_COLOR:
                setFontColor((Color)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_SIZE:
                setFontSize((Integer)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_ITALIC:
                setFontItalic((YesNoBool)newValue);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_BOLD:
                setFontBold((YesNoBool)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID)
	{
        switch (featureID) {
            case StylesPackage.STYLE_LAYOUT__TRANSPARENCY:
                setTransparency(TRANSPARENCY_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__BACKGROUND:
                setBackground((ColorOrGradient)null);
                return;
            case StylesPackage.STYLE_LAYOUT__GRADIENT_ORIENTATION:
                setGradient_orientation(GRADIENT_ORIENTATION_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__HIGHLIGHTING:
                setHighlighting((HighlightingValues)null);
                return;
            case StylesPackage.STYLE_LAYOUT__LINE_COLOR:
                setLineColor((ColorWithTransparency)null);
                return;
            case StylesPackage.STYLE_LAYOUT__LINE_WIDTH:
                setLineWidth(LINE_WIDTH_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__LINE_STYLE:
                setLineStyle(LINE_STYLE_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_NAME:
                setFontName(FONT_NAME_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_COLOR:
                setFontColor((Color)null);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_SIZE:
                setFontSize(FONT_SIZE_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_ITALIC:
                setFontItalic(FONT_ITALIC_EDEFAULT);
                return;
            case StylesPackage.STYLE_LAYOUT__FONT_BOLD:
                setFontBold(FONT_BOLD_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID)
	{
        switch (featureID) {
            case StylesPackage.STYLE_LAYOUT__TRANSPARENCY:
                return transparency != TRANSPARENCY_EDEFAULT;
            case StylesPackage.STYLE_LAYOUT__BACKGROUND:
                return background != null;
            case StylesPackage.STYLE_LAYOUT__GRADIENT_ORIENTATION:
                return gradient_orientation != GRADIENT_ORIENTATION_EDEFAULT;
            case StylesPackage.STYLE_LAYOUT__HIGHLIGHTING:
                return highlighting != null;
            case StylesPackage.STYLE_LAYOUT__LINE_COLOR:
                return lineColor != null;
            case StylesPackage.STYLE_LAYOUT__LINE_WIDTH:
                return lineWidth != LINE_WIDTH_EDEFAULT;
            case StylesPackage.STYLE_LAYOUT__LINE_STYLE:
                return lineStyle != LINE_STYLE_EDEFAULT;
            case StylesPackage.STYLE_LAYOUT__FONT_NAME:
                return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
            case StylesPackage.STYLE_LAYOUT__FONT_COLOR:
                return fontColor != null;
            case StylesPackage.STYLE_LAYOUT__FONT_SIZE:
                return fontSize != FONT_SIZE_EDEFAULT;
            case StylesPackage.STYLE_LAYOUT__FONT_ITALIC:
                return fontItalic != FONT_ITALIC_EDEFAULT;
            case StylesPackage.STYLE_LAYOUT__FONT_BOLD:
                return fontBold != FONT_BOLD_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString()
	{
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (transparency: ");
        result.append(transparency);
        result.append(", gradient_orientation: ");
        result.append(gradient_orientation);
        result.append(", lineWidth: ");
        result.append(lineWidth);
        result.append(", lineStyle: ");
        result.append(lineStyle);
        result.append(", fontName: ");
        result.append(fontName);
        result.append(", fontSize: ");
        result.append(fontSize);
        result.append(", fontItalic: ");
        result.append(fontItalic);
        result.append(", fontBold: ");
        result.append(fontBold);
        result.append(')');
        return result.toString();
    }

} //StyleLayoutImpl
