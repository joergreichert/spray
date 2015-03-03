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
package org.eclipselabs.spray.generator.graphiti;

import javax.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipselabs.spray.generator.graphiti.SprayGraphitiGenerator;

@SuppressWarnings("all")
public class SprayGenerator implements IGenerator {
  @Inject
  private SprayGraphitiGenerator graphitiGenerator;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.graphitiGenerator.doGenerate(resource, fsa);
  }
}
