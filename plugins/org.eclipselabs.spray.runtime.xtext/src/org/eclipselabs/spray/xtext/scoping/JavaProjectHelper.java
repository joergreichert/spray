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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class JavaProjectHelper {

	public IJavaProject getJavaProject(EObject model) {
		IJavaProject javaProject = null;
		IContainer container = getProject(model);
		if (container instanceof IProject) {
			IProject project = (IProject) container;
			javaProject = createJavaProject(project);
		}
		return javaProject;
	}

	/**
	 * @param project
	 * @return
	 */
	protected IJavaProject createJavaProject(IProject project) {
		return JavaCore.create(project);
	}

	private IContainer getProject(EObject model) {
		IContainer project = null;
		IWorkspaceRoot wsRoot = getWorkspaceRoot();
		if (wsRoot != null) {
			String platformStr = toPlatformURIStr(model);
			if (platformStr != null) {
				IFile file = wsRoot.getFile(getPathFromOSString(platformStr));
				return getProject(file);
			} else {
				String fileStr = toFileStr(model);
				if (fileStr != null) {
					IFile file = wsRoot.getFileForLocation(getPathFromOSString(fileStr));
					return getProject(file);
				}
			}
		}
		return project;
	}

	/**
	 * @param model
	 * @return
	 */
	protected String toPlatformURIStr(EObject model) {
		String platformStr = null;
		if (model.eResource() != null) {
			platformStr = model.eResource().getURI().toPlatformString(true);
		}
		return platformStr;
	}

	/**
	 * @param model
	 * @return
	 */
	protected String toFileStr(EObject model) {
		String fileStr = null;
		if (model.eResource() != null) {
			URI uri = model.eResource().getURI();
			fileStr = uri.toFileString();
		}
		return fileStr;
	}

	/**
	 * @param fileStr
	 * @return
	 */
	protected IPath getPathFromOSString(String fileStr) {
		return Path.fromOSString(fileStr);
	}

	protected IWorkspaceRoot getWorkspaceRoot() {
		IWorkspaceRoot wsRoot = null;
		if (isPlatformRunning()) {
			IWorkspace ws = getWorkspace();
			if (ws != null) {
				wsRoot = ws.getRoot();
			}
		}
		return wsRoot;
	}

	/**
	 * @return
	 */
	protected IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * @return
	 */
	protected boolean isPlatformRunning() {
		return Platform.isRunning();
	}

	public IContainer getProject(IResource res) {
		IContainer parent = res != null ? res.getParent() : null;
		if (parent != null && !(parent instanceof IProject)) {
			parent = getProject(parent);
		}
		return parent;
	}
}
