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
package org.eclipselabs.spray.runtime.graphiti.tb;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.tb.IDecorator;

/**
 * Graphiti allows to draw so called "Rendering Decorators" on top of active pictogram elements.
 * Implementors of this interface provide such decorators for a given pictogram element.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public interface IRenderingDecoratorProvider {
    /**
     * @param pe
     *            The pictogram element to get decorators for
     * @return Decorators for the given pictogram element. May return <code>null</code>.
     */
    IDecorator[] getDecorators(PictogramElement pe);
}
