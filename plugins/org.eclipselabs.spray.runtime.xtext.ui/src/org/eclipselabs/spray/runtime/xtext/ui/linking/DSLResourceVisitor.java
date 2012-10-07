package org.eclipselabs.spray.runtime.xtext.ui.linking;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;

public abstract class DSLResourceVisitor<T> implements IResourceVisitor {
	private final Map<IResource, List<T>> fileToEObjects;
	private final ResourceSet rs;

	public DSLResourceVisitor(ResourceSet rs) {
		this.rs = rs;
		fileToEObjects = new HashMap<IResource, List<T>>();
		if (getJavaProjectProvider() != null) {
			IJavaProject javaProject = getJavaProjectProvider().getJavaProject(
					rs);
			try {
				javaProject.getProject().accept(this);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	protected abstract IJavaProjectProvider getJavaProjectProvider();

	@Override
	public boolean visit(IResource resource) throws CoreException {
		boolean visitMembers = false;
		if (getFileExtension().equals(resource.getFileExtension())
				&& noBinOrTargetFolderContent(resource)) {
			fillFileToEObjects(resource, fileToEObjects);
		} else if (resource instanceof IContainer) {
			visitMembers = true;
		}
		return visitMembers;
	}

	protected abstract String getFileExtension();

	private boolean noBinOrTargetFolderContent(IResource resource) {
		return !resource.getFullPath().toPortableString().contains("/bin/")
				&& !resource.getFullPath().toPortableString()
						.contains("/target/");
	}

	public void fillFileToEObjects(IResource resource,
			Map<IResource, List<T>> fileToEObjects) {
		Resource res = getEmfResource(resource);
		try {
			res.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (EObject eo : res.getContents()) {
			fillFileToEObjects(resource, eo, fileToEObjects);
		}
	}

	public abstract void fillFileToEObjects(IResource resource, EObject root,
			Map<IResource, List<T>> fileToEObjects);

	private Resource getEmfResource(IResource resource) {
		URI uri = URI.createURI(resource.getLocationURI().toString());
		return rs.getResource(uri, true);
	}

	public Map<IResource, List<T>> getFileToEObjectsMap() {
		return fileToEObjects;
	}
}
