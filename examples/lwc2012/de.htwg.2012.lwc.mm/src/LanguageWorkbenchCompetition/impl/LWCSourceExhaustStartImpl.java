/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package LanguageWorkbenchCompetition.impl;

import LanguageWorkbenchCompetition.LWCModelElement;
import LanguageWorkbenchCompetition.LWCSourceExhaustStart;
import LanguageWorkbenchCompetition.LWCSystemEnd;
import LanguageWorkbenchCompetition.LanguageWorkbenchCompetitionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LWC Source Exhaust Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link LanguageWorkbenchCompetition.impl.LWCSourceExhaustStartImpl#getFromElement <em>From Element</em>}</li>
 *   <li>{@link LanguageWorkbenchCompetition.impl.LWCSourceExhaustStartImpl#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LWCSourceExhaustStartImpl extends LWCModelElementImpl implements LWCSourceExhaustStart {
	/**
	 * The cached value of the '{@link #getFromElement() <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected LWCSystemEnd fromElement;

	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected LWCModelElement toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LWCSourceExhaustStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return LanguageWorkbenchCompetitionPackage.Literals.LWC_SOURCE_EXHAUST_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCSystemEnd getFromElement() {
		if (fromElement != null && fromElement.eIsProxy()) {
			InternalEObject oldFromElement = (InternalEObject)fromElement;
			fromElement = (LWCSystemEnd)eResolveProxy(oldFromElement);
			if (fromElement != oldFromElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__FROM_ELEMENT, oldFromElement, fromElement));
			}
		}
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCSystemEnd basicGetFromElement() {
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElement(LWCSystemEnd newFromElement) {
		LWCSystemEnd oldFromElement = fromElement;
		fromElement = newFromElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__FROM_ELEMENT, oldFromElement, fromElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCModelElement getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (LWCModelElement)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LWCModelElement basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(LWCModelElement newToElement) {
		LWCModelElement oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__FROM_ELEMENT:
				if (resolve) return getFromElement();
				return basicGetFromElement();
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__TO_ELEMENT:
				if (resolve) return getToElement();
				return basicGetToElement();
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
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__FROM_ELEMENT:
				setFromElement((LWCSystemEnd)newValue);
				return;
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__TO_ELEMENT:
				setToElement((LWCModelElement)newValue);
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
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__FROM_ELEMENT:
				setFromElement((LWCSystemEnd)null);
				return;
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__TO_ELEMENT:
				setToElement((LWCModelElement)null);
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
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__FROM_ELEMENT:
				return fromElement != null;
			case LanguageWorkbenchCompetitionPackage.LWC_SOURCE_EXHAUST_START__TO_ELEMENT:
				return toElement != null;
		}
		return super.eIsSet(featureID);
	}

} //LWCSourceExhaustStartImpl
