/**
 */
package PetrinetDSL.impl;

import PetrinetDSL.PetrinetDSLPackage;
import PetrinetDSL.Place;
import PetrinetDSL.TPEdge;
import PetrinetDSL.Transition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TP Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetrinetDSL.impl.TPEdgeImpl#getFromTransition <em>From Transition</em>}</li>
 *   <li>{@link PetrinetDSL.impl.TPEdgeImpl#getToPlace <em>To Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TPEdgeImpl extends EdgeImpl implements TPEdge {
	/**
	 * The cached value of the '{@link #getFromTransition() <em>From Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition fromTransition;

	/**
	 * The cached value of the '{@link #getToPlace() <em>To Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPlace()
	 * @generated
	 * @ordered
	 */
	protected Place toPlace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetDSLPackage.Literals.TP_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getFromTransition() {
		if (fromTransition != null && fromTransition.eIsProxy()) {
			InternalEObject oldFromTransition = (InternalEObject)fromTransition;
			fromTransition = (Transition)eResolveProxy(oldFromTransition);
			if (fromTransition != oldFromTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.TP_EDGE__FROM_TRANSITION, oldFromTransition, fromTransition));
			}
		}
		return fromTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetFromTransition() {
		return fromTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTransition(Transition newFromTransition) {
		Transition oldFromTransition = fromTransition;
		fromTransition = newFromTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.TP_EDGE__FROM_TRANSITION, oldFromTransition, fromTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getToPlace() {
		if (toPlace != null && toPlace.eIsProxy()) {
			InternalEObject oldToPlace = (InternalEObject)toPlace;
			toPlace = (Place)eResolveProxy(oldToPlace);
			if (toPlace != oldToPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetrinetDSLPackage.TP_EDGE__TO_PLACE, oldToPlace, toPlace));
			}
		}
		return toPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetToPlace() {
		return toPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPlace(Place newToPlace) {
		Place oldToPlace = toPlace;
		toPlace = newToPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetDSLPackage.TP_EDGE__TO_PLACE, oldToPlace, toPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetrinetDSLPackage.TP_EDGE__FROM_TRANSITION:
				if (resolve) return getFromTransition();
				return basicGetFromTransition();
			case PetrinetDSLPackage.TP_EDGE__TO_PLACE:
				if (resolve) return getToPlace();
				return basicGetToPlace();
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
			case PetrinetDSLPackage.TP_EDGE__FROM_TRANSITION:
				setFromTransition((Transition)newValue);
				return;
			case PetrinetDSLPackage.TP_EDGE__TO_PLACE:
				setToPlace((Place)newValue);
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
			case PetrinetDSLPackage.TP_EDGE__FROM_TRANSITION:
				setFromTransition((Transition)null);
				return;
			case PetrinetDSLPackage.TP_EDGE__TO_PLACE:
				setToPlace((Place)null);
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
			case PetrinetDSLPackage.TP_EDGE__FROM_TRANSITION:
				return fromTransition != null;
			case PetrinetDSLPackage.TP_EDGE__TO_PLACE:
				return toPlace != null;
		}
		return super.eIsSet(featureID);
	}

} //TPEdgeImpl
