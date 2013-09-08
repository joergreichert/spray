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
package org.eclipselabs.spray.xtext.validation;

/**
 * Constants for validation issues.
 */
public interface IssueCodes {
    String PREFIX                           = "spray.";

    String MISSING_GENMODEL                 = PREFIX + "MISSING_GENMODEL";
    String DUPLICATE_ALIAS_NAME             = PREFIX + "DUPLICATE_ALIAS_NAME";
    String DUPLICATE_CONNECTION_REFERENCE   = PREFIX + "DUPLICATE_CONNECTION_REFERENCE";

    String CONTAINMENT_CONNECTION_REFERENCE = PREFIX + "CONTAINMENT_CONNECTION_REFERENCE";
    String NO_CREATE_BEHAVIOR               = PREFIX + "NO_CREATE_BEHAVIOR";

    /**
     * Marks that a non-wildcard import cannot be resolved to a type
     */
    String IMPORT_NOTEXISTS                 = PREFIX + "IMPORT_NOT_EXISTS";
}
