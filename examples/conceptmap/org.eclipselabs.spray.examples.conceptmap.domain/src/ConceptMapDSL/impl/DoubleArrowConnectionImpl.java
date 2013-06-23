/**
 */
package ConceptMapDSL.impl;

import ConceptMapDSL.ConceptMapDSLPackage;
import ConceptMapDSL.DoubleArrowConnection;
import ConceptMapDSL.Element;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Arrow Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptMapDSL.impl.DoubleArrowConnectionImpl#getFromElement <em>From Element</em>}</li>
 *   <li>{@link ConceptMapDSL.impl.DoubleArrowConnectionImpl#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DoubleArrowConnectionImpl extends MapElementsImpl implements DoubleArrowConnection {
	/**
	 * The cached value of the '{@link #getFromElement() <em>From Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromElement()
	 * @generated
	 * @ordered
	 */
	protected Element fromElement;

	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected Element toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleArrowConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptMapDSLPackage.Literals.DOUBLE_ARROW_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getFromElement() {
		if (fromElement != null && fromElement.eIsProxy()) {
			InternalEObject oldFromElement = (InternalEObject)fromElement;
			fromElement = (Element)eResolveProxy(oldFromElement);
			if (fromElement != oldFromElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__FROM_ELEMENT, oldFromElement, fromElement));
			}
		}
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetFromElement() {
		return fromElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromElement(Element newFromElement) {
		Element oldFromElement = fromElement;
		fromElement = newFromElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__FROM_ELEMENT, oldFromElement, fromElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (Element)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(Element newToElement) {
		Element oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__FROM_ELEMENT:
				if (resolve) return getFromElement();
				return basicGetFromElement();
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__TO_ELEMENT:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__FROM_ELEMENT:
				setFromElement((Element)newValue);
				return;
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__TO_ELEMENT:
				setToElement((Element)newValue);
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
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__FROM_ELEMENT:
				setFromElement((Element)null);
				return;
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__TO_ELEMENT:
				setToElement((Element)null);
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
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__FROM_ELEMENT:
				return fromElement != null;
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION__TO_ELEMENT:
				return toElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DoubleArrowConnectionImpl
