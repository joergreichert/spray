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
package org.eclipselabs.spray.xtext;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    org.eclipselabs.spray.xtext.customizing.QualifiedNameValueConverterTest.class, 
    org.eclipselabs.spray.xtext.scoping.ModelResourceVisitorTest.class, 
    org.eclipselabs.spray.xtext.scoping.PackageSelectorTest.class, 
    org.eclipselabs.spray.xtext.tests.Mod4jTest.class, 
    org.eclipselabs.spray.xtext.tests.ModelTests.class, 
    org.eclipselabs.spray.xtext.tests.SprayFormatterTest.class,
    org.eclipselabs.spray.xtext.tests.ValidationRulesTest.class, 
    org.eclipselabs.spray.xtext.util.GenModelHelperTest.class})
public class AllUnitTests {

}
