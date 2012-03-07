package org.eclipselabs.spray.runtime.graphiti.features.custom;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.UpdateContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.features.AbstractCustomFeature;

/**
 * Updates a pictogram element and all its children.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class UpdateElementsFeature extends AbstractCustomFeature {
    public UpdateElementsFeature(IFeatureProvider fp) {
        super(fp);

    }

    @Override
    public boolean canExecute(ICustomContext context) {
        return true;
    }

    @Override
    public void execute(ICustomContext context) {
        if (context.getPictogramElements().length > 0) {
            for (PictogramElement pe : context.getPictogramElements())
                update(context, pe);
        }
    }

    protected void update(ICustomContext context, PictogramElement pe) {
        if (pe instanceof ContainerShape) {
            final ContainerShape container = (ContainerShape) pe;
            for (Shape child : container.getChildren()) {
                update(context, child);
            }
        }
        UpdateContext ctx = new UpdateContext(pe);
        IUpdateFeature updateFeature = getFeatureProvider().getUpdateFeature(ctx);
        if (updateFeature != null && updateFeature.canUpdate(ctx)) {
            updateFeature.update(ctx);
        }
    }

    @Override
    public String getName() {
        return "Update all elements";
    }

}
