package org.eclipselabs.spray.runtime.graphiti.wizard;

import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.IColorConstant;

import com.google.inject.ImplementedBy;

/**
 * This type is used to initialize diagrams with the New Diagram Wizard.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
@ImplementedBy(IDiagramInitializer.DefaultDiagramInitializer.class)
public interface IDiagramInitializer {
    void initialize(Diagram diagram);

    /**
     * Initializes the diagram with the defaults that also Graphiti's diagram wizard uses.
     * 
     * @author Karsten Thoms (karsten.thoms@itemis.de)
     */
    public class DefaultDiagramInitializer implements IDiagramInitializer {

        @Override
        public void initialize(Diagram diagram) {
            diagram.setGridUnit(10);
            diagram.setSnapToGrid(true);
            diagram.setVisible(true);
            Color c1 = Graphiti.getGaService().manageColor(diagram, 249, 238, 227);
            Color c2 = Graphiti.getGaService().manageColor(diagram, IColorConstant.WHITE);
            Rectangle r = Graphiti.getGaService().createRectangle(diagram);
            r.setBackground(c2);
            r.setForeground(c1);
            r.setFilled(true);
            r.setHeight(1000);
            r.setWidth(1000);
            r.setLineStyle(LineStyle.SOLID);
            r.setLineVisible(true);
            r.setLineWidth(1);
            r.setX(0);
            r.setY(0);
        }

    }
}
