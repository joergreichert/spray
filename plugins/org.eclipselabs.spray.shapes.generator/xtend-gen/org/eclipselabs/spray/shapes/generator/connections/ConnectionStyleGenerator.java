/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.shapes.generator.connections;

import javax.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.shapes.ShapestyleLayout;
import org.eclipselabs.spray.shapes.generator.shapes.ShapeTypeStyleGenerator;

@SuppressWarnings("all")
public class ConnectionStyleGenerator {
  @Inject
  @Extension
  private ShapeTypeStyleGenerator _shapeTypeStyleGenerator;
  
  public CharSequence generateStyleForConnection(final String attName, final ShapestyleLayout csl) {
    return this._shapeTypeStyleGenerator.generateStyleForElement(attName, csl);
  }
}
