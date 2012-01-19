package org.eclipselabs.spray.shapes.generator.shapes;

import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
import org.eclipse.graphiti.services.IGaCreateService;
import org.eclipse.graphiti.services.IPeCreateService;

public class ShapeAnchorCalculator {

	public int calculateCorrection(int sizeShape, int sizeAnchor, double offset) {
		int position = (int) (sizeShape*offset);
		return calculateCorrection(position, sizeShape, sizeAnchor);
	}
		
	public int calculateCorrection(int position, int sizeShape, int sizeAnchor) {
		int correction = 0;
		if (position + sizeAnchor > sizeShape) {
			// Correction for right side or bottom
			correction = (int) ((position + sizeAnchor) - sizeShape) * -1;
		} else if ((position) < (sizeAnchor / 2)) {
			// Correction for Left side or top
			correction = (int) (position) * -1;
		} else if (position >= sizeAnchor / 2) {
			// Correction for middle points
			correction = (sizeAnchor / 2) * -1;
		}
		return correction;
	}

}
