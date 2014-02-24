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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class Mod4jTest extends AbstractSprayXtextTest {

	@Test
	public void test_mod4j_busmod() {
		EcorePlugin.getEPackageNsURIToGenModelLocationMap(false).put(BusinessDomainDslPackage.eNS_URI, URI.createURI("classpath://" + MOD4J_XCORE));
		
		testFile("/mod4j/mod4j-busmod.spray", MOD4J_XCORE,
				"/mod4j/mod4j-busmod.shape", "/mod4j/mod4j-busmod.style");
	}
}
