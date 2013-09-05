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

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.services.IPeService;

public abstract class DefaultSprayConnection implements ISprayConnection {

    private IFeatureProvider         featureProvider;
    protected final IGaService       gaService       = Graphiti.getGaService();
    protected final IPeService       peService       = Graphiti.getPeService();
    protected final IPeCreateService peCreateService = Graphiti.getPeCreateService();

    public DefaultSprayConnection(IFeatureProvider featureProvider) {
        this.featureProvider = featureProvider;
    }

    public IFeatureProvider getFeatureProvider() {
        return featureProvider;
    }
}
