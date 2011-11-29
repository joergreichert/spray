package org.eclipselabs.spray.runtime.graphiti.tb;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.tb.IDecorator;

/**
 * Graphiti allows to draw so called "Rendering Decorators" on top of active pictogram elements.
 * Implementors of this interface provide such decorators for a given pictogram element.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public interface IRenderingDecoratorProvider {
    /**
     * @param pe
     *            The pictogram element to get decorators for
     * @return Decorators for the given pictogram element. May return <code>null</code>.
     */
    IDecorator[] getDecorators(PictogramElement pe);
}
