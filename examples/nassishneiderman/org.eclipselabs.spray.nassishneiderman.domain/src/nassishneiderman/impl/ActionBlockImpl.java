/**
 */
package nassishneiderman.impl;

import nassishneiderman.ActionBlock;
import nassishneiderman.NassishneidermanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nassishneiderman.impl.ActionBlockImpl#getActionName <em>Action Name</em>}</li>
 *   <li>{@link nassishneiderman.impl.ActionBlockImpl#getActionDescription <em>Action Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionBlockImpl extends BlockImpl implements ActionBlock {
	/**
	 * The default value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionName() <em>Action Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionName()
	 * @generated
	 * @ordered
	 */
	protected String actionName = ACTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionDescription() <em>Action Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionDescription() <em>Action Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDescription()
	 * @generated
	 * @ordered
	 */
	protected String actionDescription = ACTION_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NassishneidermanPackage.Literals.ACTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionName(String newActionName) {
		String oldActionName = actionName;
		actionName = newActionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.ACTION_BLOCK__ACTION_NAME, oldActionName, actionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionDescription() {
		return actionDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionDescription(String newActionDescription) {
		String oldActionDescription = actionDescription;
		actionDescription = newActionDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.ACTION_BLOCK__ACTION_DESCRIPTION, oldActionDescription, actionDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_NAME:
				return getActionName();
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_DESCRIPTION:
				return getActionDescription();
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
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_NAME:
				setActionName((String)newValue);
				return;
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_DESCRIPTION:
				setActionDescription((String)newValue);
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
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_NAME:
				setActionName(ACTION_NAME_EDEFAULT);
				return;
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_DESCRIPTION:
				setActionDescription(ACTION_DESCRIPTION_EDEFAULT);
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
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_NAME:
				return ACTION_NAME_EDEFAULT == null ? actionName != null : !ACTION_NAME_EDEFAULT.equals(actionName);
			case NassishneidermanPackage.ACTION_BLOCK__ACTION_DESCRIPTION:
				return ACTION_DESCRIPTION_EDEFAULT == null ? actionDescription != null : !ACTION_DESCRIPTION_EDEFAULT.equals(actionDescription);
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
		result.append(" (actionName: ");
		result.append(actionName);
		result.append(", actionDescription: ");
		result.append(actionDescription);
		result.append(')');
		return result.toString();
	}

} //ActionBlockImpl
