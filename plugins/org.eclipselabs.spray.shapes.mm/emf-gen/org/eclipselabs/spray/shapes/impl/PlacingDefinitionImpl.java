/**
 */
package org.eclipselabs.spray.shapes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipselabs.spray.shapes.PlacingDefinition;
import org.eclipselabs.spray.shapes.ShapeConnection;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placing Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.PlacingDefinitionImpl#getShapeCon <em>Shape Con</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlacingDefinitionImpl extends MinimalEObjectImpl.Container implements PlacingDefinition
{
	/**
     * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
	protected static final double OFFSET_EDEFAULT = 4.9E-324;

	/**
     * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOffset()
     * @generated
     * @ordered
     */
	protected double offset = OFFSET_EDEFAULT;

	/**
     * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDistance()
     * @generated
     * @ordered
     */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDistance()
     * @generated
     * @ordered
     */
	protected int distance = DISTANCE_EDEFAULT;

	/**
     * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
	protected static final int ANGLE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
	protected int angle = ANGLE_EDEFAULT;

	/**
     * The cached value of the '{@link #getShapeCon() <em>Shape Con</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getShapeCon()
     * @generated
     * @ordered
     */
	protected ShapeConnection shapeCon;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PlacingDefinitionImpl()
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
        return ShapesPackage.Literals.PLACING_DEFINITION;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public double getOffset()
	{
        return offset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setOffset(double newOffset)
	{
        double oldOffset = offset;
        offset = newOffset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.PLACING_DEFINITION__OFFSET, oldOffset, offset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getDistance()
	{
        return distance;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDistance(int newDistance)
	{
        int oldDistance = distance;
        distance = newDistance;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.PLACING_DEFINITION__DISTANCE, oldDistance, distance));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getAngle()
	{
        return angle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAngle(int newAngle)
	{
        int oldAngle = angle;
        angle = newAngle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.PLACING_DEFINITION__ANGLE, oldAngle, angle));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ShapeConnection getShapeCon()
	{
        return shapeCon;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public NotificationChain basicSetShapeCon(ShapeConnection newShapeCon, NotificationChain msgs)
	{
        ShapeConnection oldShapeCon = shapeCon;
        shapeCon = newShapeCon;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.PLACING_DEFINITION__SHAPE_CON, oldShapeCon, newShapeCon);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setShapeCon(ShapeConnection newShapeCon)
	{
        if (newShapeCon != shapeCon) {
            NotificationChain msgs = null;
            if (shapeCon != null)
                msgs = ((InternalEObject)shapeCon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.PLACING_DEFINITION__SHAPE_CON, null, msgs);
            if (newShapeCon != null)
                msgs = ((InternalEObject)newShapeCon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.PLACING_DEFINITION__SHAPE_CON, null, msgs);
            msgs = basicSetShapeCon(newShapeCon, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.PLACING_DEFINITION__SHAPE_CON, newShapeCon, newShapeCon));
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
            case ShapesPackage.PLACING_DEFINITION__SHAPE_CON:
                return basicSetShapeCon(null, msgs);
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
            case ShapesPackage.PLACING_DEFINITION__OFFSET:
                return getOffset();
            case ShapesPackage.PLACING_DEFINITION__DISTANCE:
                return getDistance();
            case ShapesPackage.PLACING_DEFINITION__ANGLE:
                return getAngle();
            case ShapesPackage.PLACING_DEFINITION__SHAPE_CON:
                return getShapeCon();
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
            case ShapesPackage.PLACING_DEFINITION__OFFSET:
                setOffset((Double)newValue);
                return;
            case ShapesPackage.PLACING_DEFINITION__DISTANCE:
                setDistance((Integer)newValue);
                return;
            case ShapesPackage.PLACING_DEFINITION__ANGLE:
                setAngle((Integer)newValue);
                return;
            case ShapesPackage.PLACING_DEFINITION__SHAPE_CON:
                setShapeCon((ShapeConnection)newValue);
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
            case ShapesPackage.PLACING_DEFINITION__OFFSET:
                setOffset(OFFSET_EDEFAULT);
                return;
            case ShapesPackage.PLACING_DEFINITION__DISTANCE:
                setDistance(DISTANCE_EDEFAULT);
                return;
            case ShapesPackage.PLACING_DEFINITION__ANGLE:
                setAngle(ANGLE_EDEFAULT);
                return;
            case ShapesPackage.PLACING_DEFINITION__SHAPE_CON:
                setShapeCon((ShapeConnection)null);
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
            case ShapesPackage.PLACING_DEFINITION__OFFSET:
                return offset != OFFSET_EDEFAULT;
            case ShapesPackage.PLACING_DEFINITION__DISTANCE:
                return distance != DISTANCE_EDEFAULT;
            case ShapesPackage.PLACING_DEFINITION__ANGLE:
                return angle != ANGLE_EDEFAULT;
            case ShapesPackage.PLACING_DEFINITION__SHAPE_CON:
                return shapeCon != null;
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
        result.append(" (offset: ");
        result.append(offset);
        result.append(", distance: ");
        result.append(distance);
        result.append(", angle: ");
        result.append(angle);
        result.append(')');
        return result.toString();
    }

} //PlacingDefinitionImpl
