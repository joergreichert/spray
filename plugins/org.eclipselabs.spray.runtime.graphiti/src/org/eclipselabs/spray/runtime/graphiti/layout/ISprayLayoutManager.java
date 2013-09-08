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
package org.eclipselabs.spray.runtime.graphiti.layout;

import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.ILayoutService;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService.SprayAlignment;

/**
 * @author Jos Warmer (jos.warmer@openmodeling.nl)
 */
public interface ISprayLayoutManager {

    static final public ILayoutService layoutService = Graphiti.getLayoutService();

    /**
     * layout the shape connected to this layout manager. Will recursively go
     * into subshapes if needed.
     */
    public void layout();

    /**
     * Change the height of the corresponding shape equal to 'newHeight'. Will
     * recursively go into subshapes and strethc them as well.
     * 
     * @param newHeight
     */
    //    public void stretchHeightTo(int newHeight);

    /**
     * Get the margin for this layout manager. The margin is additional space at
     * the top. bottom, left and right.
     */
    public int getMargin();

    /**
     * Sets the margin for this layout manager. The margin is additional space
     * at the top. bottom, left and right.
     */
    public void setMargin(int margin);

    public int getSpacing();

    public void setSpacing(int spacing);

    /**
     * Sets the alignment that the children should have TODO As we only need the
     * CENTER alignment in Logan, this is the only option that is implemented,
     * other alignment options are ignored.
     * <p>
     * For horizontal layout default alignment is BEGINNING
     * <p>
     * For vertical layout default alignment is FILL
     * 
     * @param alignment
     */
    public void setAlignment(SprayAlignment alignment);

    public SprayAlignment getAlignment();

    public boolean isFlexible();
}
