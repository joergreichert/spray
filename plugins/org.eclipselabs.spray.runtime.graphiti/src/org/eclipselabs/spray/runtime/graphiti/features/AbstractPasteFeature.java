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
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractPasteFeature extends org.eclipse.graphiti.ui.features.AbstractPasteFeature implements ISprayConstants {

    public AbstractPasteFeature(IFeatureProvider fp) {
        super(fp);
    }
}
