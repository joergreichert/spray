package org.eclipselabs.spray.shapes;

import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipselabs.spray.styles.ISprayStyle;

public interface ISprayConnection {
	public Connection getConnection(Diagram diagram, ISprayStyle sprayStyle, Anchor startAnchor, Anchor endAnchor);
}
