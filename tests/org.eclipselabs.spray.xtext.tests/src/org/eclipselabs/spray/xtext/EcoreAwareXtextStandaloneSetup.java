package org.eclipselabs.spray.xtext;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;

import BusinessDomainDsl.BusinessDomainDslPackage;

public class EcoreAwareXtextStandaloneSetup extends XtextStandaloneSetup {

	@Override
	public ClassCtx beforeClass(IClassSetupContext frameworkCtx) {
		//EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eINSTANCE.getNsURI(), BusinessDomainDslPackage.eINSTANCE);
        EcorePlugin.getEPackageNsURIToGenModelLocationMap(true).put(BusinessDomainDslPackage.eNS_URI, URI.createURI("model/testcases/referenced/BusinessDomainDsl.genmodel"));        
		return super.beforeClass(frameworkCtx);
	}
}
