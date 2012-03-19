package org.eclipselabs.spray.shapes;

import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.graphiti.features.IFeatureProvider;

//TODO: Remove EObject (just for tests)
public abstract class DefaultSprayConnection extends EReferenceImpl implements
		ISprayConnection {
	private IFeatureProvider featureProvider;

	public DefaultSprayConnection(IFeatureProvider featureProvider) {
		this.featureProvider = featureProvider;
	}

	public IFeatureProvider getFeatureProvider() {
		return featureProvider;
	}
}
