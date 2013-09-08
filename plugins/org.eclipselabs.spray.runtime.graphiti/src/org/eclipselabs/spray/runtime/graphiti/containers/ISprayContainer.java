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
package org.eclipselabs.spray.runtime.graphiti.containers;

import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;

public interface ISprayContainer {

    public static final String RIGHT             = "right";

    public static final String TEXT              = "text";

    public static final String LINE              = "line";

    public static final String CONCEPT_SHAPE_KEY = "CONCEPT_SHAPE";

    public static final String LEFT              = "left";

    public static final String DOWN              = "down";

    public static final String TEXTBOX           = "textbox";

    public static final String TOP_CONTAINER     = "TopContainer";

    public static final String ROLESPEC          = "RoleSpec";

    public static final String ID                = "ID";

    public static int          DEFAULT_WIDTH     = 150;

    public static int          DEFAULT_HEIGHT    = 50;

    public static int          TEXT_LINE_HEIGHT  = 16;

    public abstract ContainerShape createContainer(IAddContext context, Object addedModelElement);

    public abstract boolean layoutContainer(ILayoutContext context);

}
