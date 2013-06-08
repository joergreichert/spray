package org.eclipselabs.spray.runtime.xtext.ui.linking;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;
import org.eclipselabs.spray.xtext.scoping.JavaProjectHelper;

public abstract class DSLResourceVisitor<T> implements IResourceVisitor {
	private Map<IResource, List<T>> fileToEObjects = new HashMap<IResource, List<T>>();
	private ResourceSet rs = null;
	private JavaProjectHelper javaProjectHelper = new JavaProjectHelper();

	public void setResourceSet(ResourceSet rs) {
		this.rs = rs;
		fileToEObjects.clear();
		if (getJavaProjectProvider() != null) {
			IJavaProject javaProject = getJavaProjectProvider().getJavaProject(
					rs);
			if (javaProject == null && rs != null) {
				if (rs.getResources().size() > 0) {
					Resource res = rs.getResources().get(0);
					EList<EObject> contents = res.getContents();
					if (contents.size() > 0) {
						javaProject = javaProjectHelper.getJavaProject(contents.get(0));
					}
				}
			}
			if (javaProject != null) {
				try {
					IProject project = javaProject.getProject();
					project.accept(this);
					for(IProject referencedProject : project.getReferencedProjects()) {
						referencedProject.accept(this);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected abstract IJavaProjectProvider getJavaProjectProvider();

	@Override
	public boolean visit(IResource resource) throws CoreException {
		boolean visitMembers = false;
		if (rs != null) {
			if (getFileExtension().equals(resource.getFileExtension())
					&& noBinOrTargetFolderContent(resource)) {
				fillFileToEObjects(resource, fileToEObjects);
			} else if (resource instanceof IContainer) {
				visitMembers = true;
			}

		}
		return visitMembers;
	}

	protected abstract String getFileExtension();

	private boolean noBinOrTargetFolderContent(IResource resource) {
		return !resource.getFullPath().toPortableString().contains("/bin/")
				&& !resource.getFullPath().toPortableString()
						.contains("/target/");
	}

	private void fillFileToEObjects(IResource resource,
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

	protected abstract void fillFileToEObjects(IResource resource,
			EObject root, Map<IResource, List<T>> fileToEObjects);

	private Resource getEmfResource(IResource resource) {
		URI uri = URI.createURI(resource.getLocationURI().toString());
		return rs.getResource(uri, true);
	}

	public Map<IResource, List<T>> getFileToEObjectsMap() {
		return fileToEObjects;
	}
}
