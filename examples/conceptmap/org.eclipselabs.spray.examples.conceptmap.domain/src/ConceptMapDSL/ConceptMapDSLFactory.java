/**
 */
package ConceptMapDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ConceptMapDSL.ConceptMapDSLPackage
 * @generated
 */
public interface ConceptMapDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConceptMapDSLFactory eINSTANCE = ConceptMapDSL.impl.ConceptMapDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Concept Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Map</em>'.
	 * @generated
	 */
	ConceptMap createConceptMap();

	/**
	 * Returns a new object of class '<em>Map Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Elements</em>'.
	 * @generated
	 */
	MapElements createMapElements();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Arrow Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arrow Connection</em>'.
	 * @generated
	 */
	ArrowConnection createArrowConnection();

	/**
	 * Returns a new object of class '<em>Double Arrow Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Arrow Connection</em>'.
	 * @generated
	 */
	DoubleArrowConnection createDoubleArrowConnection();

	/**
	 * Returns a new object of class '<em>Default Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Connection</em>'.
	 * @generated
	 */
	DefaultConnection createDefaultConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConceptMapDSLPackage getConceptMapDSLPackage();

} //ConceptMapDSLFactory
