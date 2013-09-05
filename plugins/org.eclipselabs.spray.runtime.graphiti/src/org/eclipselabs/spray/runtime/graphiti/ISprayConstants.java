/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.runtime.graphiti;

/**
 * The ISprayConstants define constants used by Spray framework classes and generated code.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public interface ISprayConstants {
    // KEYS used for IPeService#setPropertyValue()
    final static String PROPERTY_MODEL_TYPE                       = "MODEL_TYPE";
    final static String PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL = "FROM_LABEL";
    final static String PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL   = "TO_LABEL";
    final static String PROPERTY_MODEL_TYPE_CONNECTION_LABEL      = "CONNECTION_LABEL";
    final static String PROPERTY_STATIC                           = "STATIC";
    final static String PROPERTY_REFERENCE                        = "REFERENCE";
    final static String PROPERTY_TARGETOBJECT                     = "TARGETOBJECT";
    final static String PROPERTY_ALIAS                            = "ALIAS";
    /**
     * Property stores an URI string
     */
    final static String PROPERTY_URI                              = "URI";
    final static String PROPERTY_CAN_MOVE                         = "CAN_MOVE";

    // CONSTANTS used by shapes
    final static String TEXT_ID                                   = "SHAPEDSL_TEXT_ID";
    final static String IS_SHAPE_FROM_DSL                         = "IS_SHAPE_FROM_DSL";
    final static String IS_COMPARTMENT                            = "IS_COMPARFTMENT";
    final static String WIDTH_KEY                                 = "current-width-shape";
    final static String HEIGHT_KEY                                = "current-height-shape";

}
