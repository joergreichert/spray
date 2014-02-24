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
package org.eclipselabs.spray.xtext.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import BusinessDomainDsl.BusinessDomainDslPackage;

@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class GenModelHelperTest {
    @Inject
    private GenModelHelper fixture;

    @Before
    public void before() {
		EcorePlugin.getEPackageNsURIToGenModelLocationMap(false).put(BusinessDomainDslPackage.eNS_URI, URI.createURI("../../examples/one/org.mod4j.dsl.businessdomain.mm/model/BusinessDomainDsl.xcore"));
    }

    @Test
    public void test_getGenModel() {
        GenModel genModel = fixture.getGenModel(BusinessDomainDslPackage.Literals.BUSINESS_CLASS);
        assertNotNull(genModel);
    }

    @Test
    public void test_getFileExtension() {
        assertEquals("businessdomaindsl", fixture.getFileExtension(BusinessDomainDslPackage.Literals.BUSINESS_CLASS));
    }

    @Test
    public void test_getEPackageClassName() {
        assertEquals("BusinessDomainDsl.BusinessDomainDslPackage", fixture.getEPackageClassName(BusinessDomainDslPackage.Literals.BUSINESS_CLASS));
    }

    @Test
    public void test_getEFactoryInterfaceName() {
        assertEquals("BusinessDomainDsl.BusinessDomainDslFactory", fixture.getEFactoryInterfaceName(BusinessDomainDslPackage.Literals.BUSINESS_CLASS));
    }

    /**
     * Try to compute the Java Interface name for {@link EClassifier}. Register the Ecore GenModel before.
     */
    @Test
    public void test_getJavaInterfaceName() {
        assertEquals("BusinessDomainDsl.BusinessClass", fixture.getJavaInterfaceName(BusinessDomainDslPackage.Literals.BUSINESS_CLASS));
    }

    @Test
    public void test_getLiteralConstant() {
        assertEquals("BUSINESS_CLASS", fixture.getLiteralConstant(BusinessDomainDslPackage.Literals.BUSINESS_CLASS));
    }
}
