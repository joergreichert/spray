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

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaProject;
import org.junit.Test;

public class PackageSelectorTest {
	private final String workspaceURIStr = "/test";
	private final String ecoreURIWorkspaceRelativeStr = "/test_prj/test.ecore";
	private final String ecoreURIStr = workspaceURIStr + ecoreURIWorkspaceRelativeStr;
	private final String genModelURIStr = workspaceURIStr + "/test_prj/test.genmodel";
	private final String ePackageNsURI = "http://www.test.org/test";
	private final String ePackageName = "test_pack";

	@Test
	public void testGetJavaProject() throws Exception {
		final IWorkspaceRoot root = mock(IWorkspaceRoot.class);
		final Path path = new Path("ecoreURIWorkspaceRelativeStr");
		final IProject expectedProject = mock(IProject.class);
		when(expectedProject.getName()).thenReturn("test_prj");
		final IJavaProject expectedJavaProject = mock(IJavaProject.class);
		final JavaProjectHelper sut = getInstrumentedJavaProjectHelper(root, path, expectedProject,
				expectedJavaProject);
		final EObject model = mock(EObject.class);
		final IFile ecoreFile = mock(IFile.class);
		when(root.getFile(path)).thenReturn(ecoreFile);
		
		IFolder modelFolder = mock(IFolder.class);
		when(modelFolder.getParent()).thenReturn(expectedProject);
		when(ecoreFile.getParent()).thenReturn(modelFolder);
		
		IJavaProject javaProject = sut.getJavaProject(model);

		assertEquals("expected Java project", expectedJavaProject, javaProject);
	}

	@Test
	public void testGetGenPackage() throws Exception {
		final ResourceSet rs = mock(ResourceSet.class);
        URI genModelLoc = URI.createFileURI(genModelURIStr);
		final Resource genModelResource = mock(Resource.class);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap(true).put(ePackageNsURI, genModelLoc);
		when(rs.getResource(genModelLoc, true)).thenReturn(genModelResource);
		GenModel genModel = GenModelFactory.eINSTANCE.createGenModel();
		GenPackage genPackage = GenModelFactory.eINSTANCE.createGenPackage();
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setNsURI(ePackageNsURI);
		ePackage.setName(ePackageName);
		genPackage.setEcorePackage(ePackage);
		genModel.getGenPackages().add(genPackage);
		EList<EObject> list = new BasicEList<EObject>();
		list.add(genModel);
		when(genModelResource.getContents()).thenReturn(list);
		PackageSelector sut = new PackageSelector() {
			
			@Override
			protected ResourceSet createResourceSet() {
				return rs;
			}
		};
		
		
		GenPackage foundGenPackage = sut.getGenPackage(ePackageNsURI, ePackageName);
		assertEquals("expected gen model package", genPackage, foundGenPackage);
	}
	
	/**
	 * @param root
	 * @param path
	 * @param expectedProject
	 * @param expectedJavaProject
	 */
	protected JavaProjectHelper getInstrumentedJavaProjectHelper(final IWorkspaceRoot root,
			final Path path, final IProject expectedProject,
			final IJavaProject expectedJavaProject) {
		return new JavaProjectHelper() {
			
			@Override
			protected IWorkspaceRoot getWorkspaceRoot() {
				return root;
			}
			
			@Override
			protected IPath getPathFromOSString(String fileStr) {
				assertEquals("expected file string", ecoreURIStr, fileStr);
				return path;
			}
			
			@Override
			protected IJavaProject createJavaProject(IProject project) {
				assertEquals("expected project", expectedProject, project);
				return expectedJavaProject;
			}
			
			 @Override
			protected String toPlatformURIStr(EObject model) {
				return ecoreURIStr;
			}
		};
	}
}
