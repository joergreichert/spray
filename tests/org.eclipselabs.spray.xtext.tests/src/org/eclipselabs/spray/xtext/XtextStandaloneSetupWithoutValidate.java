package org.eclipselabs.spray.xtext;

import org.eclipse.emf.ecore.resource.Resource;
import org.xpect.xtext.lib.setup.FileCtx;

public class XtextStandaloneSetupWithoutValidate extends EcoreAwareXtextStandaloneSetup {

	protected void validate(FileCtx ctx, Resource resource) {
		// not validation
	}
}
