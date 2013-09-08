/*******************************************************************************
 * Copyright (c) 2013 The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipselabs.spray.dev.pde.targetdef;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getTargetDefinition()
 * @model
 * @generated
 */
public interface TargetDefinition extends EObject {
    /**
     * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipselabs.spray.dev.pde.targetdef.Location}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Locations</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locations</em>' containment reference list.
     * @see org.eclipselabs.spray.dev.pde.targetdef.TargetDefPackage#getTargetDefinition_Locations()
     * @model containment="true"
     * @generated
     */
    EList<Location> getLocations();

} // TargetDefinition
