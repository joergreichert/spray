/**
 */
package ca.uwaterloo.gp.fmp.impl;

import ca.uwaterloo.gp.fmp.Featur;
import ca.uwaterloo.gp.fmp.Feature;
import ca.uwaterloo.gp.fmp.FmpPackage;
import ca.uwaterloo.gp.fmp.Project;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.ProjectImpl#getModel <em>Model</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.ProjectImpl#getMetaModel <em>Meta Model</em>}</li>
 *   <li>{@link ca.uwaterloo.gp.fmp.impl.ProjectImpl#getMetaMetaModel <em>Meta Meta Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends EObjectImpl implements Project {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Feature model;

	/**
	 * The cached value of the '{@link #getMetaModel() <em>Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaModel()
	 * @generated
	 * @ordered
	 */
	protected Feature metaModel;

	/**
	 * The cached value of the '{@link #getMetaMetaModel() <em>Meta Meta Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaMetaModel()
	 * @generated
	 * @ordered
	 */
	protected Feature metaMetaModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FmpPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Feature newModel, NotificationChain msgs) {
		Feature oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmpPackage.PROJECT__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Feature newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmpPackage.PROJECT__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmpPackage.PROJECT__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.PROJECT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getMetaModel() {
		return metaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaModel(Feature newMetaModel, NotificationChain msgs) {
		Feature oldMetaModel = metaModel;
		metaModel = newMetaModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmpPackage.PROJECT__META_MODEL, oldMetaModel, newMetaModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModel(Feature newMetaModel) {
		if (newMetaModel != metaModel) {
			NotificationChain msgs = null;
			if (metaModel != null)
				msgs = ((InternalEObject)metaModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmpPackage.PROJECT__META_MODEL, null, msgs);
			if (newMetaModel != null)
				msgs = ((InternalEObject)newMetaModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmpPackage.PROJECT__META_MODEL, null, msgs);
			msgs = basicSetMetaModel(newMetaModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.PROJECT__META_MODEL, newMetaModel, newMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getMetaMetaModel() {
		return metaMetaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaMetaModel(Feature newMetaMetaModel, NotificationChain msgs) {
		Feature oldMetaMetaModel = metaMetaModel;
		metaMetaModel = newMetaMetaModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FmpPackage.PROJECT__META_META_MODEL, oldMetaMetaModel, newMetaMetaModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaMetaModel(Feature newMetaMetaModel) {
		if (newMetaMetaModel != metaMetaModel) {
			NotificationChain msgs = null;
			if (metaMetaModel != null)
				msgs = ((InternalEObject)metaMetaModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FmpPackage.PROJECT__META_META_MODEL, null, msgs);
			if (newMetaMetaModel != null)
				msgs = ((InternalEObject)newMetaMetaModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FmpPackage.PROJECT__META_META_MODEL, null, msgs);
			msgs = basicSetMetaMetaModel(newMetaMetaModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmpPackage.PROJECT__META_META_MODEL, newMetaMetaModel, newMetaMetaModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmpPackage.PROJECT__MODEL:
				return basicSetModel(null, msgs);
			case FmpPackage.PROJECT__META_MODEL:
				return basicSetMetaModel(null, msgs);
			case FmpPackage.PROJECT__META_META_MODEL:
				return basicSetMetaMetaModel(null, msgs);
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
			case FmpPackage.PROJECT__MODEL:
				return getModel();
			case FmpPackage.PROJECT__META_MODEL:
				return getMetaModel();
			case FmpPackage.PROJECT__META_META_MODEL:
				return getMetaMetaModel();
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
			case FmpPackage.PROJECT__MODEL:
				setModel((Feature)newValue);
				return;
			case FmpPackage.PROJECT__META_MODEL:
				setMetaModel((Feature)newValue);
				return;
			case FmpPackage.PROJECT__META_META_MODEL:
				setMetaMetaModel((Feature)newValue);
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
			case FmpPackage.PROJECT__MODEL:
				setModel((Feature)null);
				return;
			case FmpPackage.PROJECT__META_MODEL:
				setMetaModel((Feature)null);
				return;
			case FmpPackage.PROJECT__META_META_MODEL:
				setMetaMetaModel((Feature)null);
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
			case FmpPackage.PROJECT__MODEL:
				return model != null;
			case FmpPackage.PROJECT__META_MODEL:
				return metaModel != null;
			case FmpPackage.PROJECT__META_META_MODEL:
				return metaMetaModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
