/**
 */
package org.eclipselabs.spray.shapes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.spray.shapes.Import;
import org.eclipselabs.spray.shapes.ShapeContainer;
import org.eclipselabs.spray.shapes.ShapeContainerElement;
import org.eclipselabs.spray.shapes.ShapesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeContainerImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.eclipselabs.spray.shapes.impl.ShapeContainerImpl#getShapeContainerElement <em>Shape Container Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShapeContainerImpl extends MinimalEObjectImpl.Container implements ShapeContainer
{
	/**
     * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImports()
     * @generated
     * @ordered
     */
	protected EList<Import> imports;

	/**
     * The cached value of the '{@link #getShapeContainerElement() <em>Shape Container Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getShapeContainerElement()
     * @generated
     * @ordered
     */
	protected EList<ShapeContainerElement> shapeContainerElement;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ShapeContainerImpl()
	{
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass()
	{
        return ShapesPackage.Literals.SHAPE_CONTAINER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Import> getImports()
	{
        if (imports == null) {
            imports = new EObjectContainmentEList<Import>(Import.class, this, ShapesPackage.SHAPE_CONTAINER__IMPORTS);
        }
        return imports;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ShapeContainerElement> getShapeContainerElement()
	{
        if (shapeContainerElement == null) {
            shapeContainerElement = new EObjectContainmentEList<ShapeContainerElement>(ShapeContainerElement.class, this, ShapesPackage.SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT);
        }
        return shapeContainerElement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
        switch (featureID) {
            case ShapesPackage.SHAPE_CONTAINER__IMPORTS:
                return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
            case ShapesPackage.SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT:
                return ((InternalEList<?>)getShapeContainerElement()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
        switch (featureID) {
            case ShapesPackage.SHAPE_CONTAINER__IMPORTS:
                return getImports();
            case ShapesPackage.SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT:
                return getShapeContainerElement();
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
	public void eSet(int featureID, Object newValue)
	{
        switch (featureID) {
            case ShapesPackage.SHAPE_CONTAINER__IMPORTS:
                getImports().clear();
                getImports().addAll((Collection<? extends Import>)newValue);
                return;
            case ShapesPackage.SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT:
                getShapeContainerElement().clear();
                getShapeContainerElement().addAll((Collection<? extends ShapeContainerElement>)newValue);
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
	public void eUnset(int featureID)
	{
        switch (featureID) {
            case ShapesPackage.SHAPE_CONTAINER__IMPORTS:
                getImports().clear();
                return;
            case ShapesPackage.SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT:
                getShapeContainerElement().clear();
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
	public boolean eIsSet(int featureID)
	{
        switch (featureID) {
            case ShapesPackage.SHAPE_CONTAINER__IMPORTS:
                return imports != null && !imports.isEmpty();
            case ShapesPackage.SHAPE_CONTAINER__SHAPE_CONTAINER_ELEMENT:
                return shapeContainerElement != null && !shapeContainerElement.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ShapeContainerImpl
