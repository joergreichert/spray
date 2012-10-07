package org.eclipselabs.spray.runtime.xtext.ui.linking;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider;

public abstract class DSLResourceVisitor<T> implements IResourceVisitor {
	private Map<IResource, List<T>> fileToEObjects = new HashMap<IResource, List<T>>();
	private ResourceSet rs = null;

	public void setResourceSet(ResourceSet rs) {
		this.rs = rs;
		fileToEObjects.clear();
		if (getJavaProjectProvider() != null) {
			IJavaProject javaProject = getJavaProjectProvider().getJavaProject(
					rs);
			if (javaProject == null) {
				if(rs.getResources().size() > 0) {
					Resource res = rs.getResources().get(0);
					EList<EObject> contents = res.getContents();
					if(contents.size() > 0) {
						javaProject = getJavaProject(contents.get(0));
					}
				}
			}
			if (javaProject != null) {
				try {
					javaProject.getProject().accept(this);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
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
        String fileStr = toPlatformURIStr(model);
        if (fileStr != null) {
            IWorkspaceRoot wsRoot = getWorkspaceRoot();
            if (wsRoot != null) {
                IFile file = wsRoot.getFileForLocation(getPathFromOSString(fileStr));
                return getProject(file);
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
        	URI uri = model.eResource().getURI();
            platformStr = uri.toFileString();
        }
        return platformStr;
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

    private IContainer getProject(IResource res) {
        IContainer parent = res != null ? res.getParent() : null;
        if (parent != null && !(parent instanceof IProject)) {
            parent = getProject(parent);
        }
        return parent;
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
