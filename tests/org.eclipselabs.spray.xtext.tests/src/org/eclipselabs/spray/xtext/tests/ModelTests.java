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

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.shapes.ShapeStandaloneSetup;
import org.eclipselabs.spray.shapes.ShapesPackage;
import org.eclipselabs.spray.styles.StyleStandaloneSetup;
import org.eclipselabs.spray.styles.StylesPackage;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

import com.google.inject.Inject;
import com.google.inject.Injector;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class ModelTests extends XtextTest {
	private static String mod4jXcore = "model/BusinessDomainDsl.xcore";
	
	@Inject
	private Injector injector;

	public ModelTests() {
		super("classpath:/");
	}

	@Before
	public void before() {

        resourceSet.getPackageRegistry().put(StylesPackage.eNS_URI, StylesPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);

		Injector styleInjector = new StyleStandaloneSetup().createInjectorAndDoEMFRegistration();
		org.eclipse.xtext.resource.IResourceFactory styleResourceFactory = styleInjector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("style", styleResourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider styleServiceProvider = styleInjector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("style", styleServiceProvider);
		
		Injector shapeInjector = new ShapeStandaloneSetup().createInjectorAndDoEMFRegistration();
		org.eclipse.xtext.resource.IResourceFactory shapeResourceFactory = shapeInjector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("shape", shapeResourceFactory);
		org.eclipse.xtext.resource.IResourceServiceProvider shapeServiceProvider = shapeInjector.getInstance(org.eclipse.xtext.resource.IResourceServiceProvider.class);
		org.eclipse.xtext.resource.IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("shape", shapeServiceProvider);
		
		EPackage.Registry packageRegistry = injector.getInstance(EPackage.Registry.class);
	    packageRegistry.put(BusinessDomainDslPackage.eNS_URI,
				BusinessDomainDslPackage.eINSTANCE);
		
		suppressSerialization();
	}

	/**
	 * Those models without create behavior rise a warning that is asserted by
	 * calling this method from tests.
	 */
	private void withoutCreateBehaviorWarnings() {
		assertConstraints(issues.allOfThemContain("no create behavior"));
	}

	@Test
	public void test_01_minimal() {
		testFile("/testcases/01-minimal.spray", mod4jXcore);
	}

	@Test
	public void test_10_scoping() {
		testFile("/testcases/scoping/10-scoping.spray", mod4jXcore);
	}

	@Test
	public void test_11_scoping() {
		testFile("/testcases/scoping/11-scoping.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_12_scoping() {
		testFile("/testcases/scoping/12-scoping.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
	}

	@Test
	public void test_13_scoping() {
		testFile("testcases/scoping/13-scoping.spray", mod4jXcore,
				"testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_30_expression_text() {
		testFile("/testcases/30-expression_text.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_31_expression_text() {
		testFile("/testcases/31-expression_text.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_40_alias() {
		testFile("/testcases/40-alias.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_43_alias() {
		testFile("/testcases/43-alias.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}

	@Test
	public void test_50_alias() {
		testFile("/testcases/50-connection.spray", mod4jXcore,
				"/testcases/referenced/test.shape");
		withoutCreateBehaviorWarnings();
	}
}
