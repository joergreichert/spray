package org.eclipselabs.spray.xtext;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xpect.parameter.ParameterProvider;
import org.xpect.xtext.lib.setup.FileCtx;
import org.xpect.xtext.lib.setup.ISetupFile;
import org.xpect.xtext.lib.setup.ThisFile;
import org.xpect.xtext.lib.setup.ThisModel;
import org.xpect.xtext.lib.setup.ThisOffset;
import org.xpect.xtext.lib.setup.ThisOffset.ThisOffsetProvider;
import org.xpect.xtext.lib.setup.ThisResource;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;

import BusinessDomainDsl.BusinessDomainDslPackage;

import com.google.inject.Injector;

public class EcoreAwareXtextStandaloneSetup extends XtextStandaloneSetup {

	@Override
	public ClassCtx beforeClass(IClassSetupContext frameworkCtx) {
		//EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eINSTANCE.getNsURI(), BusinessDomainDslPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap(true).put(BusinessDomainDslPackage.eNS_URI, URI.createURI("model/testcases/referenced/BusinessDomainDsl.genmodel"));        
		return super.beforeClass(frameworkCtx);
	}
	
	@Override
	public TestCtx beforeTest(ITestSetupContext frameworkCtx, FileCtx userCtx) throws IOException {
		Injector injector = frameworkCtx.getInjector();
		injector.injectMembers(frameworkCtx.getTestInstance());
		Resource res = loadThisResource(injector, frameworkCtx, userCtx);
		frameworkCtx.installParameterValue(ThisResource.class, new ParameterProvider(res));
		if(res instanceof XtextResource) {
			frameworkCtx.installParameterValue(ThisOffset.class, new ThisOffsetProvider(frameworkCtx.getXpectInvocation(), (XtextResource) res));
		}
		if (!res.getContents().isEmpty())
			frameworkCtx.installParameterValue(ThisModel.class, new ParameterProvider(res.getContents().get(0)));
		return null;
	}

	@Override
	public XtextResource loadThisResource(Injector injector, IFileSetupContext frameworkCtx, FileCtx userCtx) throws IOException {
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = injector.getInstance(org.eclipse.emf.ecore.resource.ResourceSet.class);
		if (resourceSet instanceof XtextResourceSet) {
			((XtextResourceSet) resourceSet).setClasspathURIContext(frameworkCtx.getTestClass());
		}
		if (userCtx.getResourceSet() != null) {
			Resource result = null;
			for (ISetupFile file : userCtx.getResourceSet().getFiles()) {
				Injector langInjector = frameworkCtx.getInjector(file.getURI(frameworkCtx));
				Resource res = langInjector.getInstance(IResourceFactory.class).createResource(file.getURI(frameworkCtx));
				resourceSet.getResources().add(res);
				res.load(file.createInputStream(frameworkCtx), null);
				if (file instanceof ThisFile)
					result = res;
			}
			return (XtextResource) result;
		} else {
			URI thisURI = frameworkCtx.getXpectFile().eResource().getURI();
			Resource res = injector.getInstance(IResourceFactory.class).createResource(thisURI);
			resourceSet.getResources().add(res);
			res.load(resourceSet.getURIConverter().createInputStream(thisURI), null);
			return (XtextResource) res;
		}
	}
}
