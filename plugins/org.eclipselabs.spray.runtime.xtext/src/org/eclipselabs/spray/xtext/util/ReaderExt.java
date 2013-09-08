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
package org.eclipselabs.spray.xtext.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.mwe.Reader;
import org.eclipse.xtext.resource.containers.IAllContainersState;

import com.google.common.base.Predicate;
import com.google.common.collect.Multimap;

/**
 * Required due to Bug#356750
 * 
 * @author thoms
 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=356750
 */
public class ReaderExt extends Reader {
	private String validate = "true";

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		ResourceSet resourceSet = getResourceSet();
		Multimap<String, URI> uris = getPathTraverser().resolvePathes(pathes,
				new Predicate<URI>() {
					public boolean apply(URI input) {
						boolean result = true;
						if (getUriFilter() != null)
							result = getUriFilter().matches(input);
						if (result)
							result = getRegistry().getResourceServiceProvider(
									input) != null;
						return result;
					}
				});
		IAllContainersState containersState = getContainersStateFactory()
				.getContainersState(pathes, uris);
		installAsAdapter(resourceSet, containersState);
		populateResourceSet(resourceSet, uris);
		if (Boolean.valueOf(validate)) {
			getValidator().validate(resourceSet, getRegistry(), issues);
		}
		addModelElementsToContext(ctx, resourceSet);
	}

	@Override
	public void addPath(String path) {
		for (String p : path.split(",")) {
			super.addPath(p.trim());
		}
	}

	public String isValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}
}
