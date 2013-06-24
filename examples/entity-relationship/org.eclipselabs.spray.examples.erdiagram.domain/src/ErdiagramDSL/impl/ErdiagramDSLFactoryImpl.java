/**
 */
package ErdiagramDSL.impl;

import ErdiagramDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErdiagramDSLFactoryImpl extends EFactoryImpl implements ErdiagramDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErdiagramDSLFactory init() {
		try {
			ErdiagramDSLFactory theErdiagramDSLFactory = (ErdiagramDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Erdiagram"); 
			if (theErdiagramDSLFactory != null) {
				return theErdiagramDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErdiagramDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ErdiagramDSLPackage.ERDIAGRAM: return createErdiagram();
			case ErdiagramDSLPackage.DIAGRAM_ELEMENT: return createDiagramElement();
			case ErdiagramDSLPackage.CHEN_ELEMENT: return createChenElement();
			case ErdiagramDSLPackage.CHEN_ENTITY: return createChenEntity();
			case ErdiagramDSLPackage.CHEN_RELATIONSHIP: return createChenRelationship();
			case ErdiagramDSLPackage.CHEN_ATTRIBUTE: return createChenAttribute();
			case ErdiagramDSLPackage.CHEN_CONNECTION: return createChenConnection();
			case ErdiagramDSLPackage.CHEN_NORMAL_TO_WEAK_CONNECTION: return createChenNormalToWeakConnection();
			case ErdiagramDSLPackage.CHEN_WEAK_ELEMENT: return createChenWeakElement();
			case ErdiagramDSLPackage.CHEN_WEAK_ENTITY: return createChenWeakEntity();
			case ErdiagramDSLPackage.CHEN_WEAK_RELATIONSHIP: return createChenWeakRelationship();
			case ErdiagramDSLPackage.CHEN_WEAK_ATTRIBUTE: return createChenWeakAttribute();
			case ErdiagramDSLPackage.CHEN_WEAK_CONNECTION: return createChenWeakConnection();
			case ErdiagramDSLPackage.MARTIN_ELEMENT: return createMartinElement();
			case ErdiagramDSLPackage.MARTIN_ENTITY: return createMartinEntity();
			case ErdiagramDSLPackage.MARTIN_CONNECTION: return createMartinConnection();
			case ErdiagramDSLPackage.MINMAX_ENTITY: return createMinmaxEntity();
			case ErdiagramDSLPackage.MINMAX_CONNECTION: return createMinmaxConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Erdiagram createErdiagram() {
		ErdiagramImpl erdiagram = new ErdiagramImpl();
		return erdiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramElement createDiagramElement() {
		DiagramElementImpl diagramElement = new DiagramElementImpl();
		return diagramElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenElement createChenElement() {
		ChenElementImpl chenElement = new ChenElementImpl();
		return chenElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenEntity createChenEntity() {
		ChenEntityImpl chenEntity = new ChenEntityImpl();
		return chenEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenRelationship createChenRelationship() {
		ChenRelationshipImpl chenRelationship = new ChenRelationshipImpl();
		return chenRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenAttribute createChenAttribute() {
		ChenAttributeImpl chenAttribute = new ChenAttributeImpl();
		return chenAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenConnection createChenConnection() {
		ChenConnectionImpl chenConnection = new ChenConnectionImpl();
		return chenConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenNormalToWeakConnection createChenNormalToWeakConnection() {
		ChenNormalToWeakConnectionImpl chenNormalToWeakConnection = new ChenNormalToWeakConnectionImpl();
		return chenNormalToWeakConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakElement createChenWeakElement() {
		ChenWeakElementImpl chenWeakElement = new ChenWeakElementImpl();
		return chenWeakElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakEntity createChenWeakEntity() {
		ChenWeakEntityImpl chenWeakEntity = new ChenWeakEntityImpl();
		return chenWeakEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakRelationship createChenWeakRelationship() {
		ChenWeakRelationshipImpl chenWeakRelationship = new ChenWeakRelationshipImpl();
		return chenWeakRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakAttribute createChenWeakAttribute() {
		ChenWeakAttributeImpl chenWeakAttribute = new ChenWeakAttributeImpl();
		return chenWeakAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChenWeakConnection createChenWeakConnection() {
		ChenWeakConnectionImpl chenWeakConnection = new ChenWeakConnectionImpl();
		return chenWeakConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinElement createMartinElement() {
		MartinElementImpl martinElement = new MartinElementImpl();
		return martinElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinEntity createMartinEntity() {
		MartinEntityImpl martinEntity = new MartinEntityImpl();
		return martinEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MartinConnection createMartinConnection() {
		MartinConnectionImpl martinConnection = new MartinConnectionImpl();
		return martinConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinmaxEntity createMinmaxEntity() {
		MinmaxEntityImpl minmaxEntity = new MinmaxEntityImpl();
		return minmaxEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinmaxConnection createMinmaxConnection() {
		MinmaxConnectionImpl minmaxConnection = new MinmaxConnectionImpl();
		return minmaxConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErdiagramDSLPackage getErdiagramDSLPackage() {
		return (ErdiagramDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErdiagramDSLPackage getPackage() {
		return ErdiagramDSLPackage.eINSTANCE;
	}

} //ErdiagramDSLFactoryImpl
