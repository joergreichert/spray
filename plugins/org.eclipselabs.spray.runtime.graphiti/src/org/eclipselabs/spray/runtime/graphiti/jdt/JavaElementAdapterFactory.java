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
package org.eclipselabs.spray.runtime.graphiti.jdt;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jdt.core.IJavaElement;

/**
 * This adapter factory adapts IJavaElement to the following types:
 * <ul>
 * <li>{@link IResource}
 * </ul>
 * 
 * @see http://www.eclipse.org/articles/article.php?file=Article-Adapters/index.html
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 *         TODO: Remove when https://bugs.eclipse.org/bugs/show_bug.cgi?id=376653 is resolved
 */
@SuppressWarnings("rawtypes")
public class JavaElementAdapterFactory implements IAdapterFactory {

    @Override
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        final IJavaElement javaElement = (IJavaElement) adaptableObject;
        if (IResource.class.equals(adapterType)) {
            return javaElement.getResource();
        }
        return null;
    }

    @Override
    public Class[] getAdapterList() {
        return new Class[]{IResource.class};
    }

}
