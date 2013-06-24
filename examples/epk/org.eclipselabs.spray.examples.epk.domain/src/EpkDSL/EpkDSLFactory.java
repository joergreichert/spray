/**
 */
package EpkDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see EpkDSL.EpkDSLPackage
 * @generated
 */
public interface EpkDSLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EpkDSLFactory eINSTANCE = EpkDSL.impl.EpkDSLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Epk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epk</em>'.
	 * @generated
	 */
	Epk createEpk();

	/**
	 * Returns a new object of class '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge</em>'.
	 * @generated
	 */
	Edge createEdge();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>In Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Output</em>'.
	 * @generated
	 */
	InOutput createInOutput();

	/**
	 * Returns a new object of class '<em>Org Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Org Unit</em>'.
	 * @generated
	 */
	OrgUnit createOrgUnit();

	/**
	 * Returns a new object of class '<em>Proc Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proc Path</em>'.
	 * @generated
	 */
	ProcPath createProcPath();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>EConnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EConnector</em>'.
	 * @generated
	 */
	EConnector createEConnector();

	/**
	 * Returns a new object of class '<em>FConnector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FConnector</em>'.
	 * @generated
	 */
	FConnector createFConnector();

	/**
	 * Returns a new object of class '<em>Default Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Connection</em>'.
	 * @generated
	 */
	DefaultConnection createDefaultConnection();

	/**
	 * Returns a new object of class '<em>Ev To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ev To Fu Connection</em>'.
	 * @generated
	 */
	EvToFuConnection createEvToFuConnection();

	/**
	 * Returns a new object of class '<em>Fu To Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fu To Ev Connection</em>'.
	 * @generated
	 */
	FuToEvConnection createFuToEvConnection();

	/**
	 * Returns a new object of class '<em>Ev To ECon Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ev To ECon Connection</em>'.
	 * @generated
	 */
	EvToEConConnection createEvToEConConnection();

	/**
	 * Returns a new object of class '<em>ECon To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECon To Fu Connection</em>'.
	 * @generated
	 */
	EConToFuConnection createEConToFuConnection();

	/**
	 * Returns a new object of class '<em>Fu To FCon Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fu To FCon Connection</em>'.
	 * @generated
	 */
	FuToFConConnection createFuToFConConnection();

	/**
	 * Returns a new object of class '<em>FCon To Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FCon To Ev Connection</em>'.
	 * @generated
	 */
	FConToEvConnection createFConToEvConnection();

	/**
	 * Returns a new object of class '<em>Ou To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ou To Fu Connection</em>'.
	 * @generated
	 */
	OuToFuConnection createOuToFuConnection();

	/**
	 * Returns a new object of class '<em>Io To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Io To Fu Connection</em>'.
	 * @generated
	 */
	IoToFuConnection createIoToFuConnection();

	/**
	 * Returns a new object of class '<em>Node To Pp Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node To Pp Connection</em>'.
	 * @generated
	 */
	NodeToPpConnection createNodeToPpConnection();

	/**
	 * Returns a new object of class '<em>Pp To Node Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pp To Node Connection</em>'.
	 * @generated
	 */
	PpToNodeConnection createPpToNodeConnection();

	/**
	 * Returns a new object of class '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event</em>'.
	 * @generated
	 */
	StartEvent createStartEvent();

	/**
	 * Returns a new object of class '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event</em>'.
	 * @generated
	 */
	EndEvent createEndEvent();

	/**
	 * Returns a new object of class '<em>Start Ev To Fu Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Ev To Fu Connection</em>'.
	 * @generated
	 */
	StartEvToFuConnection createStartEvToFuConnection();

	/**
	 * Returns a new object of class '<em>Start Ev To ECon Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Ev To ECon Connection</em>'.
	 * @generated
	 */
	StartEvToEConConnection createStartEvToEConConnection();

	/**
	 * Returns a new object of class '<em>Fu To End Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fu To End Ev Connection</em>'.
	 * @generated
	 */
	FuToEndEvConnection createFuToEndEvConnection();

	/**
	 * Returns a new object of class '<em>FCon To End Ev Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FCon To End Ev Connection</em>'.
	 * @generated
	 */
	FConToEndEvConnection createFConToEndEvConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EpkDSLPackage getEpkDSLPackage();

} //EpkDSLFactory
