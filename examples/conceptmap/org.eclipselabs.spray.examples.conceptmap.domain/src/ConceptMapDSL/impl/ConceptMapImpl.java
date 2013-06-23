/**
 */
package ConceptMapDSL.impl;

import ConceptMapDSL.ConceptMap;
import ConceptMapDSL.ConceptMapDSLPackage;
import ConceptMapDSL.MapElements;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ConceptMapDSL.impl.ConceptMapImpl#getMapelements <em>Mapelements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConceptMapImpl extends NamedElementImpl implements ConceptMap {
	/**
	 * The cached value of the '{@link #getMapelements() <em>Mapelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapelements()
	 * @generated
	 * @ordered
	 */
	protected EList<MapElements> mapelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConceptMapDSLPackage.Literals.CONCEPT_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapElements> getMapelements() {
		if (mapelements == null) {
			mapelements = new EObjectContainmentEList<MapElements>(MapElements.class, this, ConceptMapDSLPackage.CONCEPT_MAP__MAPELEMENTS);
		}
		return mapelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConceptMapDSLPackage.CONCEPT_MAP__MAPELEMENTS:
				return ((InternalEList<?>)getMapelements()).basicRemove(otherEnd, msgs);
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
			case ConceptMapDSLPackage.CONCEPT_MAP__MAPELEMENTS:
				return getMapelements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConceptMapDSLPackage.CONCEPT_MAP__MAPELEMENTS:
				getMapelements().clear();
				getMapelements().addAll((Collection<? extends MapElements>)newValue);
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
			case ConceptMapDSLPackage.CONCEPT_MAP__MAPELEMENTS:
				getMapelements().clear();
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
			case ConceptMapDSLPackage.CONCEPT_MAP__MAPELEMENTS:
				return mapelements != null && !mapelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapImpl
