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

public interface IColorConstantTypeProvider {
    /**
     * Runtime specific type of color.
     * For example, for Graphiti this is org.eclipse.graphiti.util.IColorConstant.
     */
    Class<?> getColorType();

    /**
     * Provides the class names that contain fields for color constants.
     * For example, for Graphiti this is org.eclipse.graphiti.util.IColorConstant.
     * These fields will be available as implicit colors.
     * This indirection is used to keep the language independent from the runtime.
     */
    Class<?>[] getColorConstantTypes();
}
