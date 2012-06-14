/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import PetriNet.ArcEClass;
import PetriNet.PetriNetPackage;
import PetriNet.PetriNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.ArcEClassImpl#getPetriFrom <em>Petri From</em>}</li>
 *   <li>{@link PetriNet.impl.ArcEClassImpl#getPetriTo <em>Petri To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArcEClassImpl extends PetriEdgeImpl implements ArcEClass {
	/**
	 * The cached value of the '{@link #getPetriFrom() <em>Petri From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriFrom()
	 * @generated
	 * @ordered
	 */
	protected PetriNode petriFrom;

	/**
	 * The cached value of the '{@link #getPetriTo() <em>Petri To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetriTo()
	 * @generated
	 * @ordered
	 */
	protected PetriNode petriTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcEClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.ARC_ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNode getPetriFrom() {
		if (petriFrom != null && petriFrom.eIsProxy()) {
			InternalEObject oldPetriFrom = (InternalEObject)petriFrom;
			petriFrom = (PetriNode)eResolveProxy(oldPetriFrom);
			if (petriFrom != oldPetriFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC_ECLASS__PETRI_FROM, oldPetriFrom, petriFrom));
			}
		}
		return petriFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNode basicGetPetriFrom() {
		return petriFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetriFrom(PetriNode newPetriFrom) {
		PetriNode oldPetriFrom = petriFrom;
		petriFrom = newPetriFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC_ECLASS__PETRI_FROM, oldPetriFrom, petriFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNode getPetriTo() {
		if (petriTo != null && petriTo.eIsProxy()) {
			InternalEObject oldPetriTo = (InternalEObject)petriTo;
			petriTo = (PetriNode)eResolveProxy(oldPetriTo);
			if (petriTo != oldPetriTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC_ECLASS__PETRI_TO, oldPetriTo, petriTo));
			}
		}
		return petriTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNode basicGetPetriTo() {
		return petriTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetriTo(PetriNode newPetriTo) {
		PetriNode oldPetriTo = petriTo;
		petriTo = newPetriTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC_ECLASS__PETRI_TO, oldPetriTo, petriTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.ARC_ECLASS__PETRI_FROM:
				if (resolve) return getPetriFrom();
				return basicGetPetriFrom();
			case PetriNetPackage.ARC_ECLASS__PETRI_TO:
				if (resolve) return getPetriTo();
				return basicGetPetriTo();
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
			case PetriNetPackage.ARC_ECLASS__PETRI_FROM:
				setPetriFrom((PetriNode)newValue);
				return;
			case PetriNetPackage.ARC_ECLASS__PETRI_TO:
				setPetriTo((PetriNode)newValue);
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
			case PetriNetPackage.ARC_ECLASS__PETRI_FROM:
				setPetriFrom((PetriNode)null);
				return;
			case PetriNetPackage.ARC_ECLASS__PETRI_TO:
				setPetriTo((PetriNode)null);
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
			case PetriNetPackage.ARC_ECLASS__PETRI_FROM:
				return petriFrom != null;
			case PetriNetPackage.ARC_ECLASS__PETRI_TO:
				return petriTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ArcEClassImpl
