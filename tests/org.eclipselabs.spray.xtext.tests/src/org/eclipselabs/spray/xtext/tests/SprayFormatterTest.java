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

import org.eclipselabs.spray.xtext.tests.xpect.AbstractXpectFormatterTest;
import org.junit.runner.RunWith;
import org.xpect.runner.XpectRunner;
import org.xpect.runner.XpectTestFiles;
import org.xpect.runner.XpectTestFiles.FileRoot;

@RunWith(XpectRunner.class)
@XpectTestFiles(relativeTo = FileRoot.PROJECT, baseDir = "model/testcases/formatter", fileExtensions = "spray")
public class SprayFormatterTest extends AbstractXpectFormatterTest {

}