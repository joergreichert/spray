/**
 */
package MindmapDSL.impl;

import MindmapDSL.*;

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
public class MindmapDSLFactoryImpl extends EFactoryImpl implements MindmapDSLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MindmapDSLFactory init() {
		try {
			MindmapDSLFactory theMindmapDSLFactory = (MindmapDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://spray.eclipselabs.org/examples/Mindmap"); 
			if (theMindmapDSLFactory != null) {
				return theMindmapDSLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MindmapDSLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindmapDSLFactoryImpl() {
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
			case MindmapDSLPackage.NAMED_ELEMENT: return createNamedElement();
			case MindmapDSLPackage.MINDMAP: return createMindmap();
			case MindmapDSLPackage.MAP_ELEMENTS: return createMapElements();
			case MindmapDSLPackage.START_ELEMENT: return createStartElement();
			case MindmapDSLPackage.ELEMENT: return createElement();
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
	public Mindmap createMindmap() {
		MindmapImpl mindmap = new MindmapImpl();
		return mindmap;
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
	public StartElement createStartElement() {
		StartElementImpl startElement = new StartElementImpl();
		return startElement;
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
	public MindmapDSLPackage getMindmapDSLPackage() {
		return (MindmapDSLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MindmapDSLPackage getPackage() {
		return MindmapDSLPackage.eINSTANCE;
	}

} //MindmapDSLFactoryImpl
