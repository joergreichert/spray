package org.eclipselabs.spray;

import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public interface ISprayStyle {
	public Style getStyle(Diagram diagram);
	public Color getFontColor(Diagram diagram);
}