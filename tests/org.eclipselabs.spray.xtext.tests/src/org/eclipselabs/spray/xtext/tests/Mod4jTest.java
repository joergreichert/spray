package org.eclipselabs.spray.xtext.tests;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner2.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class Mod4jTest extends XtextTest {

	@Before
	public void before() {
		suppressSerialization();
		EPackage.Registry.INSTANCE.put(BusinessDomainDslPackage.eNS_URI,
				BusinessDomainDslPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI,
				GenModelPackage.eINSTANCE);
	}

	@Test
	public void test_mod4j_busmod() {
		testFile("mod4j/mod4j-busmod.spray", "mod4j/BusinessDomainDsl.ecore",
				"mod4j/mod4j-busmod.shape", "mod4j/mod4j-busmod.style");
	}
}
