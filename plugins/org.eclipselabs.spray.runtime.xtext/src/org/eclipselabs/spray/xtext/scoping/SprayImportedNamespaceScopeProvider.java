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
package org.eclipselabs.spray.xtext.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;

/**
 * Adds implicit imports for namespaces java.lang.*, org.eclipselabs.spray.styles.*
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class SprayImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {
    private final List<ImportNormalizer> implicitImports_ignoreCase    = new ArrayList<ImportNormalizer>(2);
    private final List<ImportNormalizer> implicitImports_notignoreCase = new ArrayList<ImportNormalizer>(2);

    public SprayImportedNamespaceScopeProvider() {
//        implicitImports_ignoreCase.addAll(super.getImplicitImports(true));
//        implicitImports_ignoreCase.add(new ImportNormalizer(QualifiedName.create("org", "eclipselabs", "spray", "styles"), true, true));
//        implicitImports_ignoreCase.add(new ImportNormalizer(QualifiedName.create("org", "eclipselabs", "spray", "styles", "gradients"), true, true));
//        implicitImports_ignoreCase.add(new ImportNormalizer(QualifiedName.create("org", "eclipselabs", "spray", "shapes"), true, true));
        implicitImports_notignoreCase.addAll(super.getImplicitImports(false));
        implicitImports_notignoreCase.add(new ImportNormalizer(QualifiedName.create("org", "eclipselabs", "spray", "styles"), true, false));
        implicitImports_notignoreCase.add(new ImportNormalizer(QualifiedName.create("org", "eclipselabs", "spray", "styles", "gradients"), true, true));
        implicitImports_notignoreCase.add(new ImportNormalizer(QualifiedName.create("org", "eclipselabs", "spray", "shapes"), true, false));
    }

    @Override
    protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
        return ignoreCase ? implicitImports_ignoreCase : implicitImports_notignoreCase;
    }
}
