package org.eclipselabs.spray.runtime.graphiti.xtext.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractCustomFeature;

/**
 * A feature that opens and selects an model object in an Xtext editor, if the context
 * pictogram is linked to an object contained in an Xtext resource.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class OpenModelElementFeature extends AbstractCustomFeature {

    public OpenModelElementFeature(IFeatureProvider fp) {
        super(fp);
    }

    @Override
    public boolean canExecute(ICustomContext context) {
        EObject bo = getBusinessObjectForPictogramElement(context.getInnerPictogramElement());
        return bo != null && bo.eResource() != null && bo.eResource() instanceof XtextResource;
    }

    @Override
    public void execute(ICustomContext context) {
        EObject object = getBusinessObjectForPictogramElement(context.getInnerPictogramElement());
        IURIEditorOpener opener = ((XtextResource) object.eResource()).getResourceServiceProvider().get(IURIEditorOpener.class);
        opener.open(EcoreUtil.getURI(object), true);
    }

    @Override
    public String getName() {
        return "Open Model Element";
    }
}
