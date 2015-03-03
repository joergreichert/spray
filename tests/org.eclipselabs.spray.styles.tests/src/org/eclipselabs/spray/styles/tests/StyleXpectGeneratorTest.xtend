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
package org.eclipselabs.spray.styles.tests

import com.google.inject.Inject
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.resource.XtextResource
import org.eclipselabs.spray.styles.generator.StylesGenerator
import org.junit.Ignore
import org.junit.runner.RunWith
import org.xpect.expectation.IStringExpectation
import org.xpect.expectation.StringExpectation
import org.xpect.parameter.ParameterParser
import org.xpect.runner.Xpect
import org.xpect.runner.XpectRunner
import org.xpect.runner.XpectTestFiles
import org.xpect.runner.XpectTestFiles.FileRoot
import org.xpect.setup.XpectSetup
import org.xpect.xtext.lib.setup.ThisResource
import org.xpect.xtext.lib.setup.XtextStandaloneSetup
import org.xpect.xtext.lib.util.InMemoryFileSystemAccessFormatter

@RunWith(XpectRunner)
@XpectSetup(XtextStandaloneSetup)
@XpectTestFiles(relativeTo = FileRoot.PROJECT, baseDir = "model/generator", fileExtensions = "style")
@Ignore("Not working as there are customization to the output configuration")
class StyleXpectGeneratorTest /*extends GeneratorTest*/ {

	@Inject
	private extension StylesGenerator generator;

	def InMemoryFileSystemAccessFormatter createInMemoryFileSystemAccessFormatter() {
		return new InMemoryFileSystemAccessFormatter();
	}

	@Xpect
	@ParameterParser(syntax = "('file' arg2=TEXT)?")
	def void generated(@StringExpectation IStringExpectation expectation, @ThisResource XtextResource resource, String arg2) {
		val fsa = new InMemoryFileSystemAccess
		resource.doGenerate(fsa)
		val files = createInMemoryFileSystemAccessFormatter().includeOnlyFileNamesEndingWith(arg2).apply(fsa);
		expectation.assertEquals(files);
	}
}
