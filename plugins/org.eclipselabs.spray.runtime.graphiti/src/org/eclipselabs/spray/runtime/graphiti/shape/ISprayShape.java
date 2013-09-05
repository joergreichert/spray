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
package org.eclipselabs.spray.runtime.graphiti.shape;

import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;

public interface ISprayShape {
    public ContainerShape getShape(ContainerShape targetContainer, ISprayStyle sprayStyle);

    public SprayLayoutManager getShapeLayout();
}
