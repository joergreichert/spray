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
package org.eclipselabs.spray.xtext.generator.importmanager;

import com.google.inject.ImplementedBy;

@ImplementedBy(DefaultCompilationUnitImportManager.class)
public interface CompilationUnitImportManager {

    public String shortName(String qualifiedName);

    public void addImport(String qualifiedName);

    public void addImports(String... qualifiedNames);

}
