/**
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 */
package org.eclipselabs.spray.styles.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipselabs.spray.styles.generator.StylesGenerator;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.xpect.expectation.IStringExpectation;
import org.xpect.expectation.StringExpectation;
import org.xpect.parameter.ParameterParser;
import org.xpect.runner.Xpect;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.setup.XpectSetup;
import org.xpect.xtext.lib.setup.ThisResource;
import org.xpect.xtext.lib.setup.XtextStandaloneSetup;
import org.xpect.xtext.lib.util.InMemoryFileSystemAccessFormatter;

@RunWith(XpectRunner.class)
@XpectSetup(XtextStandaloneSetup.class)
@XpectTestFiles(relativeTo = XpectTestFiles.FileRoot.PROJECT, baseDir = "model/generator", fileExtensions = "style")
@Ignore("Not working as there are customization to the output configuration")
@SuppressWarnings("all")
public class StyleXpectGeneratorTest {
  @Inject
  @Extension
  private StylesGenerator generator;
  
  public InMemoryFileSystemAccessFormatter createInMemoryFileSystemAccessFormatter() {
    return new InMemoryFileSystemAccessFormatter();
  }
  
  @Xpect
  @ParameterParser(syntax = "(\'file\' arg2=TEXT)?")
  public void generated(@StringExpectation final IStringExpectation expectation, @ThisResource final XtextResource resource, final String arg2) {
    final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
    this.generator.doGenerate(resource, fsa);
    InMemoryFileSystemAccessFormatter _createInMemoryFileSystemAccessFormatter = this.createInMemoryFileSystemAccessFormatter();
    InMemoryFileSystemAccessFormatter _includeOnlyFileNamesEndingWith = _createInMemoryFileSystemAccessFormatter.includeOnlyFileNamesEndingWith(arg2);
    final String files = _includeOnlyFileNamesEndingWith.apply(fsa);
    expectation.assertEquals(files);
  }
}
