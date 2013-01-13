/**
 */
package ca.uwaterloo.gp.fmp.impl;

import ca.uwaterloo.gp.fmp.Clonable;
import ca.uwaterloo.gp.fmp.ConfigState;
import ca.uwaterloo.gp.fmp.FmpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clonable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.ClonableImpl#getState <em>State</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.ClonableImpl#getClones <em>Clones</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.ClonableImpl#getPrototype <em>Prototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClonableImpl extends NodeImpl implements Clonable {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final ConfigState STATE_EDEFAULT = ConfigState.UNDECIDED_LITERAL;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ConfigState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClones() <em>Clones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClones()
	 * @generated
	 * @ordered
	 */
	protected EList clones;

	/**
	 * The cached value of the '{@link #getPrototype() <em>Prototype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrototype()
	 * @generated
	 * @ordered
	 */
	protected Clonable prototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClonableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FmpPackage.Literals.CLONABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ConfigState newState) {
		ConfigState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.CLONABLE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getClones() {
		if (clones == null) {
			clones = new EObjectWithInverseResolvingEList(Clonable.class, this, FmpPackage.CLONABLE__CLONES, FmpPackage.CLONABLE__PROTOTYPE);
		}
		return clones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clonable getPrototype() {
		if (prototype != null && prototype.eIsProxy()) {
			InternalEObject oldPrototype = (InternalEObject)prototype;
			prototype = (Clonable)eResolveProxy(oldPrototype);
			if (prototype != oldPrototype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FmpPackage.CLONABLE__PROTOTYPE, oldPrototype, prototype));
			}
		}
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clonable basicGetPrototype() {
		return prototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrototype(Clonable newPrototype, NotificationChain msgs) {
		Clonable oldPrototype = prototype;
		prototype = newPrototype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmpPackage.CLONABLE__PROTOTYPE, oldPrototype, newPrototype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototype(Clonable newPrototype) {
		if (newPrototype != prototype) {
			NotificationChain msgs = null;
			if (prototype != null)
				msgs = ((InternalEObject)prototype).eInverseRemove(this, FmpPackage.CLONABLE__CLONES, Clonable.class, msgs);
			if (newPrototype != null)
				msgs = ((InternalEObject)newPrototype).eInverseAdd(this, FmpPackage.CLONABLE__CLONES, Clonable.class, msgs);
			msgs = basicSetPrototype(newPrototype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.CLONABLE__PROTOTYPE, newPrototype, newPrototype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmpPackage.CLONABLE__CLONES:
				return ((InternalEList)getClones()).basicAdd(otherEnd, msgs);
			case FmpPackage.CLONABLE__PROTOTYPE:
				if (prototype != null)
					msgs = ((InternalEObject)prototype).eInverseRemove(this, FmpPackage.CLONABLE__CLONES, Clonable.class, msgs);
				return basicSetPrototype((Clonable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmpPackage.CLONABLE__CLONES:
				return ((InternalEList)getClones()).basicRemove(otherEnd, msgs);
			case FmpPackage.CLONABLE__PROTOTYPE:
				return basicSetPrototype(null, msgs);
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
			case FmpPackage.CLONABLE__STATE:
				return getState();
			case FmpPackage.CLONABLE__CLONES:
				return getClones();
			case FmpPackage.CLONABLE__PROTOTYPE:
				if (resolve) return getPrototype();
				return basicGetPrototype();
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
			case FmpPackage.CLONABLE__STATE:
				setState((ConfigState)newValue);
				return;
			case FmpPackage.CLONABLE__CLONES:
				getClones().clear();
				getClones().addAll((Collection)newValue);
				return;
			case FmpPackage.CLONABLE__PROTOTYPE:
				setPrototype((Clonable)newValue);
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
			case FmpPackage.CLONABLE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case FmpPackage.CLONABLE__CLONES:
				getClones().clear();
				return;
			case FmpPackage.CLONABLE__PROTOTYPE:
				setPrototype((Clonable)null);
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
			case FmpPackage.CLONABLE__STATE:
				return state != STATE_EDEFAULT;
			case FmpPackage.CLONABLE__CLONES:
				return clones != null && !clones.isEmpty();
			case FmpPackage.CLONABLE__PROTOTYPE:
				return prototype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //ClonableImpl
