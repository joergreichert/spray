package org.eclipselabs.spray.shapes.tests;

import org.junit.runner.RunWith;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;
import org.xpect.xtext.lib.tests.ScopingTest;

@RunWith(XpectRunner.class)
@XpectTestFiles(relativeTo = FileRoot.CURRENT, baseDir = "model/testcases/scoping", fileExtensions = { "shape" })
public class ShapeScopingTest extends ScopingTest {
}