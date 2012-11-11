package org.eclipselabs.spray.xtext.ui.builder;

import java.util.Collection;

import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;

public class SprayResourceDescriptionManager extends DefaultResourceDescriptionManager {

    public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate, IResourceDescriptions context) {
    	return super.isAffected(deltas, candidate, context);
    }
}
