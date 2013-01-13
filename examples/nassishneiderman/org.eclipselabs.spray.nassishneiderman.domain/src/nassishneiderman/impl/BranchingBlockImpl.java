/**
 */
package nassishneiderman.impl;

import nassishneiderman.BranchingBlock;
import nassishneiderman.NassishneidermanPackage;
import nassishneiderman.Sequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branching Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nassishneiderman.impl.BranchingBlockImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link nassishneiderman.impl.BranchingBlockImpl#getTrueSequence <em>True Sequence</em>}</li>
 *   <li>{@link nassishneiderman.impl.BranchingBlockImpl#getFalseSequence <em>False Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchingBlockImpl extends BlockImpl implements BranchingBlock {
	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTrueSequence() <em>True Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence trueSequence;

	/**
	 * The cached value of the '{@link #getFalseSequence() <em>False Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseSequence()
	 * @generated
	 * @ordered
	 */
	protected Sequence falseSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchingBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NassishneidermanPackage.Literals.BRANCHING_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.BRANCHING_BLOCK__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getTrueSequence() {
		return trueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrueSequence(Sequence newTrueSequence, NotificationChain msgs) {
		Sequence oldTrueSequence = trueSequence;
		trueSequence = newTrueSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE, oldTrueSequence, newTrueSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueSequence(Sequence newTrueSequence) {
		if (newTrueSequence != trueSequence) {
			NotificationChain msgs = null;
			if (trueSequence != null)
				msgs = ((InternalEObject)trueSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE, null, msgs);
			if (newTrueSequence != null)
				msgs = ((InternalEObject)newTrueSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE, null, msgs);
			msgs = basicSetTrueSequence(newTrueSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE, newTrueSequence, newTrueSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence getFalseSequence() {
		return falseSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFalseSequence(Sequence newFalseSequence, NotificationChain msgs) {
		Sequence oldFalseSequence = falseSequence;
		falseSequence = newFalseSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE, oldFalseSequence, newFalseSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseSequence(Sequence newFalseSequence) {
		if (newFalseSequence != falseSequence) {
			NotificationChain msgs = null;
			if (falseSequence != null)
				msgs = ((InternalEObject)falseSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE, null, msgs);
			if (newFalseSequence != null)
				msgs = ((InternalEObject)newFalseSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE, null, msgs);
			msgs = basicSetFalseSequence(newFalseSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE, newFalseSequence, newFalseSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE:
				return basicSetTrueSequence(null, msgs);
			case NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE:
				return basicSetFalseSequence(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NassishneidermanPackage.BRANCHING_BLOCK__CONDITION:
				return getCondition();
			case NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE:
				return getTrueSequence();
			case NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE:
				return getFalseSequence();
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
			case NassishneidermanPackage.BRANCHING_BLOCK__CONDITION:
				setCondition((String)newValue);
				return;
			case NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE:
				setTrueSequence((Sequence)newValue);
				return;
			case NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE:
				setFalseSequence((Sequence)newValue);
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
			case NassishneidermanPackage.BRANCHING_BLOCK__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE:
				setTrueSequence((Sequence)null);
				return;
			case NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE:
				setFalseSequence((Sequence)null);
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
			case NassishneidermanPackage.BRANCHING_BLOCK__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case NassishneidermanPackage.BRANCHING_BLOCK__TRUE_SEQUENCE:
				return trueSequence != null;
			case NassishneidermanPackage.BRANCHING_BLOCK__FALSE_SEQUENCE:
				return falseSequence != null;
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
		result.append(" (condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //BranchingBlockImpl
