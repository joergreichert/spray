package org.eclipselabs.spray.styles.tests;

import org.eclipse.emf.ecore.resource.Resource;
import org.xpect.xtext.lib.setup.FileCtx;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;

public class XtextStandaloneSetupWithoutValidate extends XtextStandaloneSetup {

	protected void validate(FileCtx ctx, Resource resource) {
		// not validation
	}
}
