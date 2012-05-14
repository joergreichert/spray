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
