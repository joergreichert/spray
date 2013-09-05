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
package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

public class DefaultRemoveFeature extends org.eclipse.graphiti.features.impl.DefaultRemoveFeature {
    protected IPeService peService;

    public DefaultRemoveFeature(IFeatureProvider fp) {
        super(fp);
        peService = Graphiti.getPeService();
    }

    public boolean canRemove(IRemoveContext context) {
        if (!super.canRemove(context))
            return false;

        if (Boolean.valueOf(peService.getPropertyValue(context.getPictogramElement(), ISprayConstants.PROPERTY_STATIC)) == true) {
            return false;
        }
        return true;
    };

}
