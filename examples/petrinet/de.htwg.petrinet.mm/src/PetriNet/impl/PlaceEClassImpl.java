<<<<<<< HEAD
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import PetriNet.PetriNetPackage;
import PetriNet.PlaceEClass;
import PetriNet.TokenEClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.PlaceEClassImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceEClassImpl extends PetriNodeImpl implements PlaceEClass {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected TokenEClass token;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenEClass getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToken(TokenEClass newToken, NotificationChain msgs) {
		TokenEClass oldToken = token;
		token = newToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_ECLASS__TOKEN, oldToken, newToken);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(TokenEClass newToken) {
		if (newToken != token) {
			NotificationChain msgs = null;
			if (token != null)
				msgs = ((InternalEObject)token).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetriNetPackage.PLACE_ECLASS__TOKEN, null, msgs);
			if (newToken != null)
				msgs = ((InternalEObject)newToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetriNetPackage.PLACE_ECLASS__TOKEN, null, msgs);
			msgs = basicSetToken(newToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_ECLASS__TOKEN, newToken, newToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				return basicSetToken(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				return getToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				setToken((TokenEClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				setToken((TokenEClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				return token != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceEClassImpl
=======
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import PetriNet.PetriNetPackage;
import PetriNet.PlaceEClass;
import PetriNet.TokenEClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.PlaceEClassImpl#getToken <em>Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceEClassImpl extends PetriNodeImpl implements PlaceEClass {
	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected TokenEClass token;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenEClass getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToken(TokenEClass newToken, NotificationChain msgs) {
		TokenEClass oldToken = token;
		token = newToken;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_ECLASS__TOKEN, oldToken, newToken);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(TokenEClass newToken) {
		if (newToken != token) {
			NotificationChain msgs = null;
			if (token != null)
				msgs = ((InternalEObject)token).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PetriNetPackage.PLACE_ECLASS__TOKEN, null, msgs);
			if (newToken != null)
				msgs = ((InternalEObject)newToken).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PetriNetPackage.PLACE_ECLASS__TOKEN, null, msgs);
			msgs = basicSetToken(newToken, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_ECLASS__TOKEN, newToken, newToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				return basicSetToken(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				return getToken();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				setToken((TokenEClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				setToken((TokenEClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PLACE_ECLASS__TOKEN:
				return token != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceEClassImpl
>>>>>>> eclipse_juno
