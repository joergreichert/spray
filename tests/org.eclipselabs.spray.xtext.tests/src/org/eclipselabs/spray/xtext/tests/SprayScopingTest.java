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
package org.eclipselabs.spray.xtext.tests;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;
import org.xpect.xtext.lib.tests.ScopingTest;

@RunWith(XpectRunner.class)
@XpectTestFiles(relativeTo = FileRoot.PROJECT, baseDir = "model/testcases/scoping", fileExtensions = { "spray" })
@Ignore("Doesn't work with referenced ecore yet")
public class SprayScopingTest extends ScopingTest {
}
