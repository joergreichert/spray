/*
 * <copyright>
 * Copyright (c) 2012 The Spray Project.
 * http://code.google.com/a/eclipselabs.org/p/spray
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * </copyright>
 */
package org.eclipselabs.spray.xtext.scoping;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author Joerg Reichert (joerg.reichert@itemis.de)
 */
public class ModelResourceVisitor implements IResourceVisitor {

    private Map<String, String> nameToEPackageNsURI = new HashMap<String, String>();
    private Map<String, URI>    nameToGenModelURI   = new HashMap<String, URI>();
    private IWorkspaceRoot      wsRoot;

    /**
     * 
     */
    public ModelResourceVisitor(IWorkspaceRoot root) {
        wsRoot = root;
    }

    @Override
    public boolean visit(IResource resource) throws CoreException {
        if (resource instanceof IContainer) {
            IContainer folder = (IContainer) resource;
            if ("bin".equals(folder.getName()) || "target".equals(folder.getName())) {
                return false;
            }
            for (IResource member : folder.members()) {
                visit(member);
            }
        } else if (resource instanceof IFile) {
            visitFile((IFile) resource);
        }
        return false;
    }

    public void visitFile(IFile resource) {
        boolean nameTOGenModelURIChanged = false;
        boolean nameToEPackageNsURIChanged = false;
        String name = resource.getName();
        name = name.replace("." + resource.getFileExtension(), "");
        String locationURI = resource.getLocationURI().toString();
        URI genModelURI;
        if (locationURI.endsWith(".genmodel")) {
            String location = getLocationRelativeToWorkspace(resource);
            genModelURI = createPlatformResourceURI("/" + location);
            if (isNotRegisteredYet(nameToGenModelURI, name, genModelURI)) {
                nameToGenModelURI.put(name, genModelURI);
                nameTOGenModelURIChanged = true;
            }
        } else if (locationURI.endsWith(".ecore")) {
            ResourceSet rs = createResourceSet();
            Resource r = rs.createResource(createURI(locationURI));
            try {
                r.load(Collections.EMPTY_MAP);
                EList<EObject> contents = r.getContents();
                for (EObject content : contents) {
                    if (content instanceof EPackage) {
                        EPackage pack = (EPackage) content;
                        registerEPackageUnderItsURI(pack);
                        if (isNotRegisteredYet(nameToEPackageNsURI, name, pack.getNsURI())) {
                            nameToEPackageNsURI.put(name, pack.getNsURI());
                            nameToEPackageNsURIChanged = true;
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (nameTOGenModelURIChanged | nameToEPackageNsURIChanged) {
            String ePackageNsURI;
            for (String resourceName : nameToEPackageNsURI.keySet()) {
                if ((ePackageNsURI = nameToEPackageNsURI.get(resourceName)) != null && (genModelURI = nameToGenModelURI.get(resourceName)) != null) {
                    registerGenModelForEPackage(ePackageNsURI, genModelURI);
                }
            }
        }
    }

    private String getLocationRelativeToWorkspace(IFile resource) {
        IProject project = resource.getProject();
        return project.getName() + "/" + resource.getProjectRelativePath().toString();
    }

    /**
     * @param location
     * @return
     */
    protected URI createPlatformResourceURI(String location) {
        return URI.createPlatformResourceURI(location, true);
    }

    /**
     * @param locationURI
     * @return
     */
    protected URI createURI(String locationURI) {
        return URI.createURI(locationURI);
    }

    /**
     * @return
     */
    protected ResourceSet createResourceSet() {
        return new ResourceSetImpl();
    }

    /**
     * @param pack
     */
    private void registerEPackageUnderItsURI(EPackage pack) {
        if (isNotRegisteredYet(getEPackageRegistry(), pack.getNsURI(), pack)) {
            getEPackageRegistry().put(pack.getNsURI(), pack);
        }
    }

    /**
     * @return
     */
    protected Map<String, Object> getEPackageRegistry() {
        return EPackage.Registry.INSTANCE;
    }

    /**
     * @param ePackageNsURI
     * @param genModelURI
     */
    private void registerGenModelForEPackage(String ePackageNsURI, URI genModelURI) {
        if (isNotRegisteredYet(getEPackageNsURIToGenModelLocationMap(), ePackageNsURI, genModelURI)) {
            getEPackageNsURIToGenModelLocationMap().put(ePackageNsURI, genModelURI);
        }
    }

    private boolean isNotRegisteredYet(Map<String, ? extends Object> map, String key, Object value) {
        Object existingValue = map.get(key);
        return (existingValue == null || !existingValue.equals(value));
    }

    /**
     * @return
     */
    protected Map<String, URI> getEPackageNsURIToGenModelLocationMap() {
        return EcorePlugin.getEPackageNsURIToGenModelLocationMap();
    }
}
