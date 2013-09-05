/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.shapes.generator.util;

public class ShapeAnchorCalculator {

	public int calculateCorrection(int sizeShape, int sizeAnchor, double offset) {
		int position = (int) (sizeShape * offset);
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
