/**
 */
package ErdiagramDSL.util;

import ErdiagramDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ErdiagramDSL.ErdiagramDSLPackage
 * @generated
 */
public class ErdiagramDSLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErdiagramDSLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ErdiagramDSLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErdiagramDSLSwitch<Adapter> modelSwitch =
		new ErdiagramDSLSwitch<Adapter>() {
			@Override
			public Adapter caseErdiagram(Erdiagram object) {
				return createErdiagramAdapter();
			}
			@Override
			public Adapter caseDiagramElement(DiagramElement object) {
				return createDiagramElementAdapter();
			}
			@Override
			public Adapter caseChenElement(ChenElement object) {
				return createChenElementAdapter();
			}
			@Override
			public Adapter caseChenEntity(ChenEntity object) {
				return createChenEntityAdapter();
			}
			@Override
			public Adapter caseChenRelationship(ChenRelationship object) {
				return createChenRelationshipAdapter();
			}
			@Override
			public Adapter caseChenAttribute(ChenAttribute object) {
				return createChenAttributeAdapter();
			}
			@Override
			public Adapter caseChenConnection(ChenConnection object) {
				return createChenConnectionAdapter();
			}
			@Override
			public Adapter caseChenNormalToWeakConnection(ChenNormalToWeakConnection object) {
				return createChenNormalToWeakConnectionAdapter();
			}
			@Override
			public Adapter caseChenWeakElement(ChenWeakElement object) {
				return createChenWeakElementAdapter();
			}
			@Override
			public Adapter caseChenWeakEntity(ChenWeakEntity object) {
				return createChenWeakEntityAdapter();
			}
			@Override
			public Adapter caseChenWeakRelationship(ChenWeakRelationship object) {
				return createChenWeakRelationshipAdapter();
			}
			@Override
			public Adapter caseChenWeakAttribute(ChenWeakAttribute object) {
				return createChenWeakAttributeAdapter();
			}
			@Override
			public Adapter caseChenWeakConnection(ChenWeakConnection object) {
				return createChenWeakConnectionAdapter();
			}
			@Override
			public Adapter caseMartinElement(MartinElement object) {
				return createMartinElementAdapter();
			}
			@Override
			public Adapter caseMartinEntity(MartinEntity object) {
				return createMartinEntityAdapter();
			}
			@Override
			public Adapter caseMartinConnection(MartinConnection object) {
				return createMartinConnectionAdapter();
			}
			@Override
			public Adapter caseMinmaxEntity(MinmaxEntity object) {
				return createMinmaxEntityAdapter();
			}
			@Override
			public Adapter caseMinmaxConnection(MinmaxConnection object) {
				return createMinmaxConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.Erdiagram <em>Erdiagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.Erdiagram
	 * @generated
	 */
	public Adapter createErdiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.DiagramElement <em>Diagram Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.DiagramElement
	 * @generated
	 */
	public Adapter createDiagramElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenElement <em>Chen Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenElement
	 * @generated
	 */
	public Adapter createChenElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenEntity <em>Chen Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenEntity
	 * @generated
	 */
	public Adapter createChenEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenRelationship <em>Chen Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenRelationship
	 * @generated
	 */
	public Adapter createChenRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenAttribute <em>Chen Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenAttribute
	 * @generated
	 */
	public Adapter createChenAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenConnection <em>Chen Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenConnection
	 * @generated
	 */
	public Adapter createChenConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenNormalToWeakConnection <em>Chen Normal To Weak Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenNormalToWeakConnection
	 * @generated
	 */
	public Adapter createChenNormalToWeakConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenWeakElement <em>Chen Weak Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenWeakElement
	 * @generated
	 */
	public Adapter createChenWeakElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenWeakEntity <em>Chen Weak Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenWeakEntity
	 * @generated
	 */
	public Adapter createChenWeakEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenWeakRelationship <em>Chen Weak Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenWeakRelationship
	 * @generated
	 */
	public Adapter createChenWeakRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenWeakAttribute <em>Chen Weak Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenWeakAttribute
	 * @generated
	 */
	public Adapter createChenWeakAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.ChenWeakConnection <em>Chen Weak Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.ChenWeakConnection
	 * @generated
	 */
	public Adapter createChenWeakConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.MartinElement <em>Martin Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.MartinElement
	 * @generated
	 */
	public Adapter createMartinElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.MartinEntity <em>Martin Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.MartinEntity
	 * @generated
	 */
	public Adapter createMartinEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.MartinConnection <em>Martin Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.MartinConnection
	 * @generated
	 */
	public Adapter createMartinConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.MinmaxEntity <em>Minmax Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.MinmaxEntity
	 * @generated
	 */
	public Adapter createMinmaxEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ErdiagramDSL.MinmaxConnection <em>Minmax Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ErdiagramDSL.MinmaxConnection
	 * @generated
	 */
	public Adapter createMinmaxConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ErdiagramDSLAdapterFactory
