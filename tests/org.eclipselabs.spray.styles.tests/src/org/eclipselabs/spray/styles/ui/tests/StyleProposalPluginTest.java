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
package org.eclipselabs.spray.styles.ui.tests;

import org.eclipse.xtext.junit4.IInjectorProvider;
import org.eclipselabs.spray.styles.StyleUiInjectorProvider;
import org.eclipselabs.spray.testhelper.xpect.AbstractProposalTest;
import org.junit.runner.RunWith;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;

import com.google.inject.Inject;

@RunWith(XpectRunner.class)
@XpectTestFiles(relativeTo = FileRoot.PROJECT, baseDir = "model/contentassist", fileExtensions = "xt")
public class StyleProposalPluginTest extends AbstractProposalTest {
	@Inject
	private StyleUiInjectorProvider injectorProvider;

	@Override
	public IInjectorProvider getInjectorProvider() {
		return injectorProvider;
	}
}
