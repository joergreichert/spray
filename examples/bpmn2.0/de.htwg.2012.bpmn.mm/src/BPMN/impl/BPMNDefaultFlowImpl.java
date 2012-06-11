/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package BPMN.impl;

import BPMN.BPMNDefaultFlow;
import BPMN.BPMNModelElement;
import BPMN.BPMNPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link BPMN.impl.BPMNDefaultFlowImpl#getFormElement <em>Form Element</em>}</li>
 *   <li>{@link BPMN.impl.BPMNDefaultFlowImpl#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNDefaultFlowImpl extends BPMNModelElementImpl implements BPMNDefaultFlow {
	/**
	 * The cached value of the '{@link #getFormElement() <em>Form Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormElement()
	 * @generated
	 * @ordered
	 */
	protected BPMNModelElement formElement;

	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected BPMNModelElement toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNDefaultFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return BPMNPackage.Literals.BPMN_DEFAULT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNModelElement getFormElement() {
		if (formElement != null && formElement.eIsProxy()) {
			InternalEObject oldFormElement = (InternalEObject)formElement;
			formElement = (BPMNModelElement)eResolveProxy(oldFormElement);
			if (formElement != oldFormElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.BPMN_DEFAULT_FLOW__FORM_ELEMENT, oldFormElement, formElement));
			}
		}
		return formElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNModelElement basicGetFormElement() {
		return formElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormElement(BPMNModelElement newFormElement) {
		BPMNModelElement oldFormElement = formElement;
		formElement = newFormElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.BPMN_DEFAULT_FLOW__FORM_ELEMENT, oldFormElement, formElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNModelElement getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (BPMNModelElement)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BPMNPackage.BPMN_DEFAULT_FLOW__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNModelElement basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(BPMNModelElement newToElement) {
		BPMNModelElement oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.BPMN_DEFAULT_FLOW__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.BPMN_DEFAULT_FLOW__FORM_ELEMENT:
				if (resolve) return getFormElement();
				return basicGetFormElement();
			case BPMNPackage.BPMN_DEFAULT_FLOW__TO_ELEMENT:
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
			case BPMNPackage.BPMN_DEFAULT_FLOW__FORM_ELEMENT:
				setFormElement((BPMNModelElement)newValue);
				return;
			case BPMNPackage.BPMN_DEFAULT_FLOW__TO_ELEMENT:
				setToElement((BPMNModelElement)newValue);
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
			case BPMNPackage.BPMN_DEFAULT_FLOW__FORM_ELEMENT:
				setFormElement((BPMNModelElement)null);
				return;
			case BPMNPackage.BPMN_DEFAULT_FLOW__TO_ELEMENT:
				setToElement((BPMNModelElement)null);
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
			case BPMNPackage.BPMN_DEFAULT_FLOW__FORM_ELEMENT:
				return formElement != null;
			case BPMNPackage.BPMN_DEFAULT_FLOW__TO_ELEMENT:
				return toElement != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMNDefaultFlowImpl
