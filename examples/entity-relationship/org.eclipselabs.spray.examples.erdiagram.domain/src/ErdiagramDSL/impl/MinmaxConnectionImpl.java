/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.ErdiagramDSLPackage;
import ErdiagramDSL.MinmaxConnection;
import ErdiagramDSL.MinmaxEntity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minmax Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ErdiagramDSL.impl.MinmaxConnectionImpl#getFromText <em>From Text</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.MinmaxConnectionImpl#getToText <em>To Text</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.MinmaxConnectionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link ErdiagramDSL.impl.MinmaxConnectionImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MinmaxConnectionImpl extends DiagramElementImpl implements MinmaxConnection {
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
	protected MinmaxEntity start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected MinmaxEntity end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinmaxConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErdiagramDSLPackage.Literals.MINMAX_CONNECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MINMAX_CONNECTION__FROM_TEXT, oldFromText, fromText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MINMAX_CONNECTION__TO_TEXT, oldToText, toText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinmaxEntity getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (MinmaxEntity)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramDSLPackage.MINMAX_CONNECTION__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinmaxEntity basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(MinmaxEntity newStart) {
		MinmaxEntity oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MINMAX_CONNECTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinmaxEntity getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (MinmaxEntity)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErdiagramDSLPackage.MINMAX_CONNECTION__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinmaxEntity basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(MinmaxEntity newEnd) {
		MinmaxEntity oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErdiagramDSLPackage.MINMAX_CONNECTION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErdiagramDSLPackage.MINMAX_CONNECTION__FROM_TEXT:
				return getFromText();
			case ErdiagramDSLPackage.MINMAX_CONNECTION__TO_TEXT:
				return getToText();
			case ErdiagramDSLPackage.MINMAX_CONNECTION__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ErdiagramDSLPackage.MINMAX_CONNECTION__END:
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
			case ErdiagramDSLPackage.MINMAX_CONNECTION__FROM_TEXT:
				setFromText((String)newValue);
				return;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__TO_TEXT:
				setToText((String)newValue);
				return;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__START:
				setStart((MinmaxEntity)newValue);
				return;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__END:
				setEnd((MinmaxEntity)newValue);
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
			case ErdiagramDSLPackage.MINMAX_CONNECTION__FROM_TEXT:
				setFromText(FROM_TEXT_EDEFAULT);
				return;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__TO_TEXT:
				setToText(TO_TEXT_EDEFAULT);
				return;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__START:
				setStart((MinmaxEntity)null);
				return;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__END:
				setEnd((MinmaxEntity)null);
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
			case ErdiagramDSLPackage.MINMAX_CONNECTION__FROM_TEXT:
				return FROM_TEXT_EDEFAULT == null ? fromText != null : !FROM_TEXT_EDEFAULT.equals(fromText);
			case ErdiagramDSLPackage.MINMAX_CONNECTION__TO_TEXT:
				return TO_TEXT_EDEFAULT == null ? toText != null : !TO_TEXT_EDEFAULT.equals(toText);
			case ErdiagramDSLPackage.MINMAX_CONNECTION__START:
				return start != null;
			case ErdiagramDSLPackage.MINMAX_CONNECTION__END:
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

} //MinmaxConnectionImpl
