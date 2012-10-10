package org.eclipselabs.spray.xtext.scoping;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

public class ModelResourceVisitorTest {
	private final String workspaceURIStr = "C:/test/";
	private final String ecoreURIStr = workspaceURIStr + "test_prj/test.ecore";
	private final String genModelURIStr = workspaceURIStr + "test_prj/test.genmodel";
	private final String ecoreEMFURIStr = "file:///" + ecoreURIStr;
	private final String genModelEMFURIStr = "file:///" + genModelURIStr;
	private final String genModelWorkspaceRelativeURIStr = "/test_prj/test.genmodel";
	private final String ePackageNsURI = "http://www.test.org/test";
	private final String ePackageName = "test_pack";
	
	@Test
	public void testVisitFile_WhenEcoreBeforeGenModelFile() {
		final Map<String, URI> ePackageToGenModelMap = new HashMap<String, URI>();
		final Map<String, Object> ePackageMap = new HashMap<String, Object>();
		final URI ecoreURI = URI.createURI(ecoreEMFURIStr);
		final URI genModelURI = URI.createURI(genModelEMFURIStr);

		final Resource ecoreResource = mock(Resource.class);
		final IWorkspaceRoot wsRoot = mock(IWorkspaceRoot.class);
		ModelResourceVisitor sut = createInstrumentedModelResourceVisitor(
				ePackageToGenModelMap, ePackageMap, ecoreURI, genModelURI,
				ecoreResource, wsRoot);
		EPackage pack = EcoreFactory.eINSTANCE.createEPackage();
		IFile ecoreFile = mockEcoreFile(wsRoot, ecoreResource, pack);
		
		sut.visitFile(ecoreFile);
		
		assertEquals("EPackages size", 1, ePackageMap.size());
		assertEquals("EPackage registered", pack, ePackageMap.get(ePackageNsURI));
		assertEquals("No GenModel registered yet", 0, ePackageToGenModelMap.size());
		
		IFile genModelFile = modelGenModelFile(wsRoot);

		sut.visitFile(genModelFile);
		
		assertEquals("EPackages size", 1, ePackageMap.size());
		assertEquals("EPackage registered", pack, ePackageMap.get(ePackageNsURI));
		assertEquals("GenModels size", 1, ePackageToGenModelMap.size());
		assertEquals("GenModel registered", genModelURI, ePackageToGenModelMap.get(ePackageNsURI));
	}

	@Test
	public void testVisitFile_WhenGenModelBeforeEcoreFile() {
		final Map<String, URI> ePackageToGenModelMap = new HashMap<String, URI>();
		final Map<String, Object> ePackageMap = new HashMap<String, Object>();
		final URI ecoreURI = URI.createURI(ecoreEMFURIStr);
		final URI genModelURI = URI.createURI(genModelEMFURIStr);
		
		final IWorkspaceRoot wsRoot = mock(IWorkspaceRoot.class);

		IFile genModelFile = modelGenModelFile(wsRoot);

		final Resource ecoreResource = mock(Resource.class);
		ModelResourceVisitor sut = createInstrumentedModelResourceVisitor(
				ePackageToGenModelMap, ePackageMap, ecoreURI, genModelURI,
				ecoreResource, wsRoot);
		sut.visitFile(genModelFile);
		
		assertEquals("No EPackages registered", 0, ePackageMap.size());
		assertEquals("No GenModels registered", 0, ePackageToGenModelMap.size());
		
		EPackage pack = EcoreFactory.eINSTANCE.createEPackage();
		IFile ecoreFile = mockEcoreFile(wsRoot, ecoreResource, pack);
		
		sut.visitFile(ecoreFile);
		
		assertEquals("EPackages size", 1, ePackageMap.size());
		assertEquals("EPackage registered", pack, ePackageMap.get(ePackageNsURI));
		assertEquals("GenModels size", 1, ePackageToGenModelMap.size());
		assertEquals("GenModel registered", genModelURI, ePackageToGenModelMap.get(ePackageNsURI));
	}
	

	@Test
	public void testVisit() throws Exception{
		final Map<String, URI> ePackageToGenModelMap = new HashMap<String, URI>();
		final Map<String, Object> ePackageMap = new HashMap<String, Object>();
		final URI ecoreURI = URI.createURI(ecoreEMFURIStr);
		final URI genModelURI = URI.createURI(genModelEMFURIStr);
		
		final IWorkspaceRoot wsRoot = mock(IWorkspaceRoot.class);
		EPackage pack = EcoreFactory.eINSTANCE.createEPackage();
		final Resource ecoreResource = mock(Resource.class);
		IFile ecoreFile = mockEcoreFile(wsRoot, ecoreResource, pack);
		IFile genModelFile = modelGenModelFile(wsRoot);

		ModelResourceVisitor sut = createInstrumentedModelResourceVisitor(
				ePackageToGenModelMap, ePackageMap, ecoreURI, genModelURI,
				ecoreResource, wsRoot);
		
		IContainer project = mock(IContainer.class);
		when(project.getName()).thenReturn("test_prj");
		IContainer binFolder = mock(IContainer.class);
		when(binFolder.getName()).thenReturn("bin");
		IContainer targetFolder = mock(IContainer.class);
		when(targetFolder.getName()).thenReturn("target");
		IContainer modelFolder = mock(IContainer.class);
		when(modelFolder.getName()).thenReturn("model");
		when(project.members()).thenReturn(new IResource[] { binFolder, targetFolder, modelFolder });
		when(modelFolder.members()).thenReturn(new IResource[] { ecoreFile, genModelFile });
		
		sut.visit(project);
		
		assertEquals("EPackages size", 1, ePackageMap.size());
		assertEquals("EPackage registered", pack, ePackageMap.get(ePackageNsURI));
		assertEquals("GenModels size", 1, ePackageToGenModelMap.size());
		assertEquals("GenModel registered", genModelURI, ePackageToGenModelMap.get(ePackageNsURI));
	}
	
	/**
	 * @param wsRoot
	 * @return
	 */
	private IFile modelGenModelFile(final IWorkspaceRoot wsRoot) {
		IFile genModelFile = mock(IFile.class);
		when(genModelFile.getName()).thenReturn("test");
		when(genModelFile.getFileExtension()).thenReturn("genmodel");
		when(genModelFile.getLocationURI()).thenReturn(java.net.URI.create(genModelURIStr));
		when(wsRoot.getLocation()).thenReturn(new Path(workspaceURIStr));
		when(genModelFile.getLocation()).thenReturn(new Path(genModelURIStr));
		return genModelFile;
	}

	/**
	 * @param wsRoot
	 * @param pack 
	 * @return
	 */
	private IFile mockEcoreFile(final IWorkspaceRoot wsRoot, Resource ecoreResource, EPackage pack) {
		IFile ecoreFile = mock(IFile.class);
		when(ecoreFile.getName()).thenReturn("test");
		when(ecoreFile.getFileExtension()).thenReturn("ecore");
		when(ecoreFile.getLocationURI()).thenReturn(java.net.URI.create(ecoreURIStr));
		when(wsRoot.getLocation()).thenReturn(new Path(workspaceURIStr));
		when(ecoreFile.getLocation()).thenReturn(new Path(ecoreURIStr));
		
		pack.setNsURI(ePackageNsURI);
		pack.setName(ePackageName);
		EList<EObject> list = new BasicEList<EObject>();
		list.add(pack);
		when(ecoreResource.getContents()).thenReturn(list);

		return ecoreFile;
	}

	/**
	 * @param ePackageToGenModelMap
	 * @param ePackageMap
	 * @param ecoreURI
	 * @param genModelURI
	 * @param ecoreResource
	 * @param wsRoot
	 * @return
	 */
	private ModelResourceVisitor createInstrumentedModelResourceVisitor(
			final Map<String, URI> ePackageToGenModelMap,
			final Map<String, Object> ePackageMap, final URI ecoreURI,
			final URI genModelURI, final Resource ecoreResource,
			final IWorkspaceRoot wsRoot) {
		ModelResourceVisitor sut = new ModelResourceVisitor(wsRoot) {
			
			@Override
			protected ResourceSet createResourceSet() {
				ResourceSet rs = mock(ResourceSet.class);
				when(rs.createResource(ecoreURI)).thenReturn(ecoreResource);
				return rs;
			}
			
			@Override
			protected Map<String, URI> getEPackageNsURIToGenModelLocationMap() {
				return ePackageToGenModelMap;
			}
			
			@Override
			protected Map<String, Object> getEPackageRegistry() {
				return ePackageMap;
			}
			
			@Override
			protected URI createURI(String locationURI) {
				assertEquals(ecoreURIStr, locationURI);
				return ecoreURI;
			}
			
			@Override
			protected URI createPlatformResourceURI(String location) {
				assertEquals(genModelWorkspaceRelativeURIStr, location);
				return genModelURI;
			}
		};
		return sut;
	}
}