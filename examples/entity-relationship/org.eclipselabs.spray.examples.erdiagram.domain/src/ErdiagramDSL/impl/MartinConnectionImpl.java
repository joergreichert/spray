/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.ErdiagramDSLPackage;
import ErdiagramDSL.MartinConnection;
import ErdiagramDSL.MartinEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Martin Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ErdiagramDSL.impl.MartinConnectionImpl#getFromText <em>From Text</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.MartinConnectionImpl#getToText <em>To Text</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.MartinConnectionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.MartinConnectionImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MartinConnectionImpl extends DiagramElementImpl implements MartinConnection {
	/**
	 * The default value of the '{@link #getFromText() <em>From Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromText()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromText() <em>From Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromText()
	 * @generated
	 * @ordered
	 */
	protected String fromText = FROM_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getToText() <em>To Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToText()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToText() <em>To Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToText()
	 * @generated
	 * @ordered
	 */
	protected String toText = TO_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected MartinEntity start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected MartinEntity end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MartinConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdiagramDSLPackage.Literals.MARTIN_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromText() {
		return fromText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromText(String newFromText) {
		String oldFromText = fromText;
		fromText = newFromText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MARTIN_CONNECTION__FROM_TEXT, oldFromText, fromText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToText() {
		return toText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToText(String newToText) {
		String oldToText = toText;
		toText = newToText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MARTIN_CONNECTION__TO_TEXT, oldToText, toText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinEntity getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (MartinEntity)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramDSLPackage.MARTIN_CONNECTION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinEntity basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(MartinEntity newStart) {
		MartinEntity oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MARTIN_CONNECTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinEntity getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (MartinEntity)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramDSLPackage.MARTIN_CONNECTION__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinEntity basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(MartinEntity newEnd) {
		MartinEntity oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MARTIN_CONNECTION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErdiagramDSLPackage.MARTIN_CONNECTION__FROM_TEXT:
				return getFromText();
			case ErdiagramDSLPackage.MARTIN_CONNECTION__TO_TEXT:
				return getToText();
			case ErdiagramDSLPackage.MARTIN_CONNECTION__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ErdiagramDSLPackage.MARTIN_CONNECTION__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case ErdiagramDSLPackage.MARTIN_CONNECTION__FROM_TEXT:
				setFromText((String)newValue);
				return;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__TO_TEXT:
				setToText((String)newValue);
				return;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__START:
				setStart((MartinEntity)newValue);
				return;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__END:
				setEnd((MartinEntity)newValue);
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
			case ErdiagramDSLPackage.MARTIN_CONNECTION__FROM_TEXT:
				setFromText(FROM_TEXT_EDEFAULT);
				return;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__TO_TEXT:
				setToText(TO_TEXT_EDEFAULT);
				return;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__START:
				setStart((MartinEntity)null);
				return;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__END:
				setEnd((MartinEntity)null);
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
			case ErdiagramDSLPackage.MARTIN_CONNECTION__FROM_TEXT:
				return FROM_TEXT_EDEFAULT == null ? fromText != null : !FROM_TEXT_EDEFAULT.equals(fromText);
			case ErdiagramDSLPackage.MARTIN_CONNECTION__TO_TEXT:
				return TO_TEXT_EDEFAULT == null ? toText != null : !TO_TEXT_EDEFAULT.equals(toText);
			case ErdiagramDSLPackage.MARTIN_CONNECTION__START:
				return start != null;
			case ErdiagramDSLPackage.MARTIN_CONNECTION__END:
				return end != null;
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
		result.append(" (fromText: ");
		result.append(fromText);
		result.append(", toText: ");
		result.append(toText);
		result.append(')');
		return result.toString();
	}

} //MartinConnectionImpl
