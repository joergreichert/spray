package org.eclipselabs.spray.runtime.graphiti.features.custom;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipselabs.spray.runtime.graphiti.layout.ISprayLayoutManager;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutData;
import org.eclipselabs.spray.runtime.graphiti.layout.SprayLayoutService;

/**
 */
public class RefreshDiagramFeature extends AbstractCustomFeature {
    /**
     * Constructor
     */
    public RefreshDiagramFeature(IFeatureProvider fp) {
        super(fp);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.graphiti.features.custom.AbstractCustomFeature#getDescription
     * ()
     */
    @Override
    public String getDescription() {
        return "Refreash Diagram "; //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.graphiti.features.impl.AbstractFeature#getName()
     */
    @Override
    public String getName() {
        return "&Refresh Diagram"; //$NON-NLS-1$
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.graphiti.features.custom.AbstractCustomFeature#canExecute
     * (org.eclipse.graphiti.features.context.ICustomContext)
     */
    @Override
    public boolean canExecute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1 && pes[0] instanceof Diagram) {
            return true;
        }
        return false;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.graphiti.features.custom.ICustomFeature#execute(org.eclipse
     * .graphiti.features.context.ICustomContext)
     */
    @Override
    public void execute(ICustomContext context) {
        final Diagram diagram = this.getDiagram();
        ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(diagram);
        // System.out.println("layout");
        // printLayout(diagram, 0);
        System.out.println("before");
        print(diagram, 0);
        mgr.layout();
        System.out.println("after");
        print(diagram, 0);
    }

    public PictogramElement[] dirtyPes(Diagram diagram) {
        List<PictogramElement> result = new ArrayList<PictogramElement>();
        TreeIterator<EObject> all = diagram.eAllContents();
        Object o = null;
        ;
        while (all.hasNext()) {
            o = all.next();
            if (o instanceof PictogramElement) {
                result.add((PictogramElement) o);
            }
        }
        return (PictogramElement[]) (result.toArray());
    }

    public void print(Shape expressionShape, int level) {
        // expressionShape.setActive(false);
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        GraphicsAlgorithm ga = expressionShape.getGraphicsAlgorithm();
        System.out.println(SprayLayoutService.getId(expressionShape) + " ==> " + ga.getClass() + " X : " + ga.getX() + " Y : " + ga.getY() + " W : " + ga.getWidth() + " H : " + ga.getHeight());
        if (expressionShape instanceof ContainerShape) {
            for (Shape child : ((ContainerShape) expressionShape).getChildren()) {
                print(child, level + 1);
            }
        }
    }

    public void printLayout(Shape expressionShape, int level) {
        // expressionShape.setActive(false);
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }
        GraphicsAlgorithm ga = expressionShape.getGraphicsAlgorithm();
        ISprayLayoutManager mgr = SprayLayoutService.getLayoutManager(expressionShape);
        SprayLayoutData data = SprayLayoutService.getLayoutData(expressionShape);
        System.out.println(SprayLayoutService.getId(expressionShape) + " ==> " + ga.getClass() + " Layout : " + mgr.getClass().getSimpleName() + " margin : " + mgr.getMargin() + " spacing: " + mgr.getSpacing() + " MinW : " + data.getMinimumWidth() + " MinH : " + data.getMinimumHeight());
        if (expressionShape instanceof ContainerShape) {
            for (Shape child : ((ContainerShape) expressionShape).getChildren()) {
                printLayout(child, level + 1);
            }
        }
    }

}
