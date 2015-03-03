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
package org.eclipselabs.spray.generator.graphiti.util.mm;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaReference;

@SuppressWarnings("all")
public class MetaReferenceExtensions {
  public Diagram getDiagram(final MetaReference reference) {
    return EcoreUtil2.<Diagram>getContainerOfType(reference, Diagram.class);
  }
}
