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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IPeService;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class DefaultDeleteFeature extends org.eclipse.graphiti.ui.features.DefaultDeleteFeature implements ISprayConstants {
    protected IPeService peService;
    private boolean      doneChanges = false;

    public DefaultDeleteFeature(IFeatureProvider fp) {
        super(fp);
        peService = Graphiti.getPeService();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected EObject getBusinessObjectForPictogramElement(PictogramElement pe) {
        return (EObject) super.getBusinessObjectForPictogramElement(pe);
    }

    protected void setDoneChanges(boolean doneChanges) {
        this.doneChanges = doneChanges;
    }

    @Override
    public boolean hasDoneChanges() {
        return super.hasDoneChanges() || doneChanges;
    }

}
