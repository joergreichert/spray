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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.Import;

import com.google.common.collect.Iterables;
import com.google.inject.Singleton;

@Singleton
public class PackageSelector {
    private static final Logger               LOGGER                 = Logger.getLogger(PackageSelector.class);
    private Map<IContainer, Boolean>          projectToChanged       = new HashMap<IContainer, Boolean>();
    private Map<IProject, Iterable<EPackage>> javaProjectToEPackages = new HashMap<IProject, Iterable<EPackage>>();
    private JavaProjectHelper                 javaProjectHelper      = new JavaProjectHelper();
    private boolean                           workspaceChanged       = true;

    public Iterable<EPackage> getFilteredEPackages(EObject modelElement) {
        IJavaProject project = javaProjectHelper.getJavaProject(modelElement);
        Iterable<EPackage> ePackages = null;
        if (project != null && !projectsHasChangedSinceLastRun(project) && !workspaceChanged) {
            ePackages = javaProjectToEPackages.get(project.getProject());
        }
        if (ePackages == null) {
            ePackages = getEPackages();
            if (project != null) {
                ePackages = filterAccessibleEPackages(project, ePackages);
                javaProjectToEPackages.put(project.getProject(), ePackages);
            }
            workspaceChanged = false;
        }
        return ePackages;
    }

    /**
     * @return
     */
    private boolean projectsHasChangedSinceLastRun(IJavaProject project) {
        if (projectToChanged.size() == 0) {
            return true;
        }
        try {
            for (Map.Entry<IContainer, Boolean> entry : projectToChanged.entrySet()) {
                for (String requiredProjectName : project.getRequiredProjectNames()) {
                    if (requiredProjectName.equals(entry.getKey().getName()) && entry.getValue() == Boolean.TRUE) {
                        return true;
                    }
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
        return false;
    }

    private List<EPackage> getEPackages() {
        registerWorkspaceEPackagesAndGenModels();

        Set<Entry<String, Object>> packages = new HashSet<Entry<String, Object>>();
        packages.addAll(EPackage.Registry.INSTANCE.entrySet());
        List<EPackage> ePackages = new ArrayList<EPackage>();
        try {
            Object packageObj = null;
            EPackage.Descriptor ePackageDescriptor = null;
            EPackage ePackage = null;
            for (Entry<String, Object> entry : packages) {
                packageObj = entry.getValue();
                if (packageObj instanceof EPackage) {
                    ePackages.add((EPackage) packageObj);
                } else if (packageObj instanceof EPackage.Descriptor) {
                    ePackageDescriptor = (EPackage.Descriptor) packageObj;
                    try {
                        ePackage = ePackageDescriptor.getEPackage();
                        if (ePackage != null) {
                            ePackages.add(ePackage);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return ePackages;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ePackages;
    }

    public void registerWorkspaceEPackagesAndGenModels() {
        if (isPlatformRunning()) {
            IWorkspace ws = getWorkspace();
            if (ws != null) {
                final IWorkspaceRoot wsRoot = ws.getRoot();
                if (wsRoot != null) {
                    for (IProject project : wsRoot.getProjects()) {
                        registerProjectChangeListener(ws, project);
                        try {
                            if (project.isOpen() && project.hasNature("org.eclipse.pde.PluginNature") && projectHasChangedSinceLastRun(project)) {
                                project.accept(new ModelResourceVisitor(wsRoot));
                            }
                        } catch (CoreException e) {
                            e.printStackTrace();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            recomputeResourceAndURIMaps();
        }
    }

    /**
     * 
     */
    protected void recomputeResourceAndURIMaps() {
        EcorePlugin.computePlatformPluginToPlatformResourceMap();
        EcorePlugin.computePlatformURIMap();
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

    /**
     * @param project
     * @return
     */
    private boolean projectHasChangedSinceLastRun(IProject project) {
        if (!projectToChanged.containsKey(project)) {
            projectToChanged.put(project, Boolean.TRUE);
        }
        Boolean changed = projectToChanged.get(project);
        if (changed) {
            projectToChanged.put(project, Boolean.FALSE);
        }
        return workspaceChanged | changed;
    }

    private void registerProjectChangeListener(final IWorkspace ws, final IProject project) {
        if (project != null && !projectToChanged.containsKey(project)) {
            projectToChanged.put(project, Boolean.TRUE);
            ws.addResourceChangeListener(new IResourceChangeListener() {

                @Override
                public void resourceChanged(IResourceChangeEvent event) {
                    IResource resource = event.getResource();
                    if (resource != null) {
                        IContainer projectContainingChange = javaProjectHelper.getProject(resource);
                        if (projectContainingChange != null) {
                            projectToChanged.put(projectContainingChange, true);
                        }
                        if (resource.equals(project) && (event.getBuildKind() == IResourceChangeEvent.PRE_DELETE || event.getBuildKind() == IResourceChangeEvent.PRE_CLOSE)) {
                            projectToChanged.remove(project);
                            javaProjectToEPackages.remove(project);
                        }
                    } else {
                        workspaceChanged = true;
                    }
                }

            });
        }
    }

    public List<String> getAlreadyImportedForElement(EObject modelElement) {
        EObject container = null;
        if (modelElement instanceof Diagram) {
            container = modelElement;
        } else {
            container = EcoreUtil2.getContainerOfType(modelElement, Diagram.class);
        }
        return getAlreadyImported(container);
    }

    public List<String> getAlreadyImported(EObject container) {
        Import ni;
        List<String> alreadyImported = new ArrayList<String>();
        if (container != null) {
            for (EObject child : container.eContents()) {
                if (child instanceof Import) {
                    ni = (Import) child;
                    alreadyImported.add(ni.getImportedNamespace());
                }
            }
        }
        return alreadyImported;
    }

    public Iterable<EPackage> filterAccessibleEPackages(IJavaProject javaProject, Iterable<EPackage> ePackages) {
        List<EPackage> filteredEPackages = new ArrayList<EPackage>();
        try {
            GenPackage genPackage = null;
            String fullqualifiedPackageClassName = null;
            IType type = null;
            for (EPackage ePackage : ePackages) {
                genPackage = getGenPackage(ePackage);
                if (genPackage != null) {
                    fullqualifiedPackageClassName = genPackage.getClassPackageName() + "." + genPackage.getPackageClassName();
                    type = javaProject.findType(fullqualifiedPackageClassName);
                    if (type != null) {
                        filteredEPackages.add(ePackage);
                    }
                }
            }
        } catch (JavaModelException e) {
            e.printStackTrace();
        }
        return filteredEPackages;
    }

    private GenPackage getGenPackage(EPackage pack) {
        return getGenPackage(pack.getNsURI(), pack.getName());
    }

    public GenPackage getGenPackage(String uri, String packageName) {
        URI genModelLoc = EcorePlugin.getEPackageNsURIToGenModelLocationMap().get(uri);
        if (genModelLoc == null) {
            LOGGER.error("No genmodel found for package URI " + uri + ". If you are running in stanalone mode make sure register the genmodel file.");
            return null;
        }
        ResourceSet rs = createResourceSet();
        Resource genModelResource;
        try {
            genModelResource = rs.getResource(genModelLoc, true);
            if (genModelResource != null) {
                for (GenModel g : Iterables.filter(genModelResource.getContents(), GenModel.class)) {
                    for (GenPackage genPack : g.getGenPackages()) {
                        if (genPack.getEcorePackage().getNsURI().equals(uri) && genPack.getEcorePackage().getName().equals(packageName)) {
                            return genPack;
                        }
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof java.io.FileNotFoundException) {
                System.err.println(e.getMessage());
            } else if (e instanceof Diagnostic) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * @return
     */
    protected ResourceSet createResourceSet() {
        return new ResourceSetImpl();
    }

    /**
     * @param model
     * @return
     */
    public IJavaProject getJavaProject(EObject model) {
        return javaProjectHelper.getJavaProject(model);
    }
}
