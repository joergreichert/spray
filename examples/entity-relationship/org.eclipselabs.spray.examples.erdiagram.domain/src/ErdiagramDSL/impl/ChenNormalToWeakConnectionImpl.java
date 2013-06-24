/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.ChenEntity;
import ErdiagramDSL.ChenNormalToWeakConnection;
import ErdiagramDSL.ChenWeakRelationship;
import ErdiagramDSL.ErdiagramDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chen Normal To Weak Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl#getFromEntity <em>From Entity</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl#getToRelationship <em>To Relationship</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.ChenNormalToWeakConnectionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChenNormalToWeakConnectionImpl extends DiagramElementImpl implements ChenNormalToWeakConnection {
	/**
	 * The cached value of the '{@link #getFromEntity() <em>From Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromEntity()
	 * @generated
	 * @ordered
	 */
	protected ChenEntity fromEntity;

	/**
	 * The cached value of the '{@link #getToRelationship() <em>To Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRelationship()
	 * @generated
	 * @ordered
	 */
	protected ChenWeakRelationship toRelationship;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChenNormalToWeakConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdiagramDSLPackage.Literals.CHEN_NORMAL_TO_WEAK_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenEntity getFromEntity() {
		if (fromEntity != null && fromEntity.eIsProxy()) {
			InternalEObject oldFromEntity = (InternalEObject)fromEntity;
			fromEntity = (ChenEntity)eResolveProxy(oldFromEntity);
			if (fromEntity != oldFromEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY, oldFromEntity, fromEntity));
			}
		}
		return fromEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenEntity basicGetFromEntity() {
		return fromEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromEntity(ChenEntity newFromEntity) {
		ChenEntity oldFromEntity = fromEntity;
		fromEntity = newFromEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY, oldFromEntity, fromEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakRelationship getToRelationship() {
		if (toRelationship != null && toRelationship.eIsProxy()) {
			InternalEObject oldToRelationship = (InternalEObject)toRelationship;
			toRelationship = (ChenWeakRelationship)eResolveProxy(oldToRelationship);
			if (toRelationship != oldToRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP, oldToRelationship, toRelationship));
			}
		}
		return toRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakRelationship basicGetToRelationship() {
		return toRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRelationship(ChenWeakRelationship newToRelationship) {
		ChenWeakRelationship oldToRelationship = toRelationship;
		toRelationship = newToRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP, oldToRelationship, toRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY:
				if (resolve) return getFromEntity();
				return basicGetFromEntity();
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP:
				if (resolve) return getToRelationship();
				return basicGetToRelationship();
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY:
				setFromEntity((ChenEntity)newValue);
				return;
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP:
				setToRelationship((ChenWeakRelationship)newValue);
				return;
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE:
				setValue((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY:
				setFromEntity((ChenEntity)null);
				return;
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP:
				setToRelationship((ChenWeakRelationship)null);
				return;
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE:
				setValue(VALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__FROM_ENTITY:
				return fromEntity != null;
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__TO_RELATIONSHIP:
				return toRelationship != null;
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ChenNormalToWeakConnectionImpl
