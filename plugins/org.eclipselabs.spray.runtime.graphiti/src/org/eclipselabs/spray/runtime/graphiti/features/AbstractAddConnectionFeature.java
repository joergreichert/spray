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
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

public abstract class AbstractAddConnectionFeature extends AbstractAddFeature implements ISprayConstants {
    public AbstractAddConnectionFeature(IFeatureProvider fp) {
        super(fp);
    }

    protected void decorateConnection(IAddConnectionContext context, Connection connection) {
        createConnectionFromLabel(context, connection);
        createConnectionToLabel(context, connection);
        createConnectionLabel(context, connection);
        createConnectionStartDecorator(context, connection);
        createConnectionEndDecorator(context, connection);
        createConnectionDynamicDecorators(context, connection);
    }

    protected Connection createConnectionLine(IAddConnectionContext context) {
        throw new UnsupportedOperationException("Not implemented, override in subclass");
    }

    protected GraphicsAlgorithm createConnectionFromLabel(IAddConnectionContext context, Connection connection) {
        return null;
    }

    protected GraphicsAlgorithm createConnectionToLabel(IAddConnectionContext context, Connection connection) {
        return null;
    }

    protected GraphicsAlgorithm createConnectionLabel(IAddConnectionContext context, Connection connection) {
        return null;
    }

    protected GraphicsAlgorithm createConnectionDynamicDecorators(IAddConnectionContext context, Connection connection) {
        return null;
    }

    protected GraphicsAlgorithm createConnectionEndDecorator(IAddConnectionContext context, Connection connection) {
        return null;
    }

    protected GraphicsAlgorithm createConnectionStartDecorator(IAddConnectionContext context, Connection connection) {
        return null;
    }

}
