package org.eclipselabs.spray.styles.tests;

import org.junit.runner.RunWith;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;
import org.xpect.xtext.lib.tests.ScopingTest;

@RunWith(XpectRunner.class)
@XpectTestFiles(relativeTo = FileRoot.CURRENT, baseDir = "model/scoping", fileExtensions = { "style" })
public class StyleScopingTest extends ScopingTest {
}
