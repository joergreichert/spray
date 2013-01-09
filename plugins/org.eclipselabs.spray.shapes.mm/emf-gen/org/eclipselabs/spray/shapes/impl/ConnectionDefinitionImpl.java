/**
 */
package org.eclipselabs.spray.shapes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.ConnectionStyle;
import org.eclipselabs.spray.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.shapes.ShapestyleLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl#getConnectionStyle <em>Connection Style</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ConnectionDefinitionImpl#getPlacing <em>Placing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionDefinitionImpl extends ShapeContainerElementImpl implements ConnectionDefinition
{
	/**
     * The default value of the '{@link #getConnectionStyle() <em>Connection Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectionStyle()
     * @generated
     * @ordered
     */
	protected static final ConnectionStyle CONNECTION_STYLE_EDEFAULT = ConnectionStyle.FREEFORM;

	/**
     * The cached value of the '{@link #getConnectionStyle() <em>Connection Style</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConnectionStyle()
     * @generated
     * @ordered
     */
	protected ConnectionStyle connectionStyle = CONNECTION_STYLE_EDEFAULT;

	/**
     * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLayout()
     * @generated
     * @ordered
     */
	protected ShapestyleLayout layout;

	/**
     * The cached value of the '{@link #getPlacing() <em>Placing</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPlacing()
     * @generated
     * @ordered
     */
	protected EList<PlacingDefinition> placing;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConnectionDefinitionImpl()
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
        return ShapesPackage.Literals.CONNECTION_DEFINITION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ConnectionStyle getConnectionStyle()
	{
        return connectionStyle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConnectionStyle(ConnectionStyle newConnectionStyle)
	{
        ConnectionStyle oldConnectionStyle = connectionStyle;
        connectionStyle = newConnectionStyle == null ? CONNECTION_STYLE_EDEFAULT : newConnectionStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.CONNECTION_DEFINITION__CONNECTION_STYLE, oldConnectionStyle, connectionStyle));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapestyleLayout getLayout()
	{
        return layout;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetLayout(ShapestyleLayout newLayout, NotificationChain msgs)
	{
        ShapestyleLayout oldLayout = layout;
        layout = newLayout;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.CONNECTION_DEFINITION__LAYOUT, oldLayout, newLayout);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLayout(ShapestyleLayout newLayout)
	{
        if (newLayout != layout) {
            NotificationChain msgs = null;
            if (layout != null)
                msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.CONNECTION_DEFINITION__LAYOUT, null, msgs);
            if (newLayout != null)
                msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.CONNECTION_DEFINITION__LAYOUT, null, msgs);
            msgs = basicSetLayout(newLayout, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.CONNECTION_DEFINITION__LAYOUT, newLayout, newLayout));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PlacingDefinition> getPlacing()
	{
        if (placing == null) {
            placing = new EObjectContainmentEList<PlacingDefinition>(PlacingDefinition.class, this, ShapesPackage.CONNECTION_DEFINITION__PLACING);
        }
        return placing;
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
            case ShapesPackage.CONNECTION_DEFINITION__LAYOUT:
                return basicSetLayout(null, msgs);
            case ShapesPackage.CONNECTION_DEFINITION__PLACING:
                return ((InternalEList<?>)getPlacing()).basicRemove(otherEnd, msgs);
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
            case ShapesPackage.CONNECTION_DEFINITION__CONNECTION_STYLE:
                return getConnectionStyle();
            case ShapesPackage.CONNECTION_DEFINITION__LAYOUT:
                return getLayout();
            case ShapesPackage.CONNECTION_DEFINITION__PLACING:
                return getPlacing();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
        switch (featureID) {
            case ShapesPackage.CONNECTION_DEFINITION__CONNECTION_STYLE:
                setConnectionStyle((ConnectionStyle)newValue);
                return;
            case ShapesPackage.CONNECTION_DEFINITION__LAYOUT:
                setLayout((ShapestyleLayout)newValue);
                return;
            case ShapesPackage.CONNECTION_DEFINITION__PLACING:
                getPlacing().clear();
                getPlacing().addAll((Collection<? extends PlacingDefinition>)newValue);
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
            case ShapesPackage.CONNECTION_DEFINITION__CONNECTION_STYLE:
                setConnectionStyle(CONNECTION_STYLE_EDEFAULT);
                return;
            case ShapesPackage.CONNECTION_DEFINITION__LAYOUT:
                setLayout((ShapestyleLayout)null);
                return;
            case ShapesPackage.CONNECTION_DEFINITION__PLACING:
                getPlacing().clear();
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
            case ShapesPackage.CONNECTION_DEFINITION__CONNECTION_STYLE:
                return connectionStyle != CONNECTION_STYLE_EDEFAULT;
            case ShapesPackage.CONNECTION_DEFINITION__LAYOUT:
                return layout != null;
            case ShapesPackage.CONNECTION_DEFINITION__PLACING:
                return placing != null && !placing.isEmpty();
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
        result.append(" (connectionStyle: ");
        result.append(connectionStyle);
        result.append(')');
        return result.toString();
    }

} //ConnectionDefinitionImpl
