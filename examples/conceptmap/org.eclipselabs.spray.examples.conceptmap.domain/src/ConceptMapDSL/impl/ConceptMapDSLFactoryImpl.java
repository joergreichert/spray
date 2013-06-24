/**
 */
package ConceptMapDSL.impl;

import ConceptMapDSL.*;

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
public class ConceptMapDSLFactoryImpl extends EFactoryImpl implements ConceptMapDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConceptMapDSLFactory init() {
		try {
			ConceptMapDSLFactory theConceptMapDSLFactory = (ConceptMapDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Conceptmap"); 
			if (theConceptMapDSLFactory != null) {
				return theConceptMapDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConceptMapDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDSLFactoryImpl() {
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
			case ConceptMapDSLPackage.NAMED_ELEMENT: return createNamedElement();
			case ConceptMapDSLPackage.CONCEPT_MAP: return createConceptMap();
			case ConceptMapDSLPackage.MAP_ELEMENTS: return createMapElements();
			case ConceptMapDSLPackage.ELEMENT: return createElement();
			case ConceptMapDSLPackage.ARROW_CONNECTION: return createArrowConnection();
			case ConceptMapDSLPackage.DOUBLE_ARROW_CONNECTION: return createDoubleArrowConnection();
			case ConceptMapDSLPackage.DEFAULT_CONNECTION: return createDefaultConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap createConceptMap() {
		ConceptMapImpl conceptMap = new ConceptMapImpl();
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapElements createMapElements() {
		MapElementsImpl mapElements = new MapElementsImpl();
		return mapElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrowConnection createArrowConnection() {
		ArrowConnectionImpl arrowConnection = new ArrowConnectionImpl();
		return arrowConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoubleArrowConnection createDoubleArrowConnection() {
		DoubleArrowConnectionImpl doubleArrowConnection = new DoubleArrowConnectionImpl();
		return doubleArrowConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultConnection createDefaultConnection() {
		DefaultConnectionImpl defaultConnection = new DefaultConnectionImpl();
		return defaultConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapDSLPackage getConceptMapDSLPackage() {
		return (ConceptMapDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConceptMapDSLPackage getPackage() {
		return ConceptMapDSLPackage.eINSTANCE;
	}

} //ConceptMapDSLFactoryImpl
