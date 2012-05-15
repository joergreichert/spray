package org.eclipselabs.spray.runtime.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipselabs.spray.runtime.graphiti.ISprayConstants;

/**
 * Spray specific feature base class.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public abstract class AbstractDirectEditingFeature extends org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature implements ISprayConstants {

    public AbstractDirectEditingFeature(IFeatureProvider fp) {
        super(fp);
    }
}
