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
package org.eclipselabs.spray.generator.graphiti.util.mm

import javax.inject.Inject
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class MetaClassExtensionsTest {
    @Inject
    MetaClassExtensions ext

    @Before
    def void setUp() {
        // ext = new MetaClassExtensions()
    }

    @Test
    def testGetCreateFeatureLabel_WhenMetaClassHasNoCreateBehaviorAndHasNoName__ExpectEClassName () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        val label = ext.getCreateFeatureLabel(metaClass)
        assertEquals("EClass",label)
    }

    @Test
    def testGetCreateFeatureLabel_WhenMetaClassHasNoCreateBehaviorAndHasEmptyName__ExpectEmptyName () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        metaClass.alias = ""
        val label = ext.getCreateFeatureLabel(metaClass)
        assertEquals("EClass",label)
    }

    @Test
    def testGetCreateFeatureLabel_WhenMetaClassHasCreateBehaviorThatHasName__ExpectBehaviorLabel () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        metaClass.alias = "testName"
        val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
        createBehavior.label = "testBehaviorName"
        metaClass.behaviorsList.add(createBehavior)
        val label = ext.getCreateFeatureLabel(metaClass)
        assertEquals("testBehaviorName", label)
    }

    @Test
    def testGetCreateFeatureLabel_WhenMetaClassHasCreateBehaviorThatHasNoName__ExpectMetaClassName () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        metaClass.alias = "testName"
        val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
        metaClass.behaviorsList.add(createBehavior)
        val label = ext.getCreateFeatureLabel(metaClass)
        assertEquals("testName", label)
    }

    @Test
    def testGetCreateFeatureLabel_WhenMetaClassHasCreateBehaviorThatHasEmptyName__ExpectMetaClassName () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        metaClass.alias = "testName"
        val createBehavior = SprayFactory::eINSTANCE.createCreateBehavior
        createBehavior.label = ""
        metaClass.behaviorsList.add(createBehavior)
        val label = ext.getCreateFeatureLabel(metaClass)
        assertEquals("testName", label)
    }

    @Test
    def testGetCreateFeatureLabel_WhenMetaClassHasNoCreateBehaviorAndHasName__ExpectLabel () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        metaClass.alias = "testName"
        val label = ext.getCreateFeatureLabel(metaClass)
        assertEquals("testName", label)
    }
    
    @Test
    def getCreateFeatureDescription () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        val description = ext.getCreateFeatureDescription(metaClass)
        assertEquals("Create new EClass", description)
    }
    
    @Test
    def getCreateBehavior () {
        val metaClass = SprayFactory::eINSTANCE.createMetaClass
        metaClass.type = EcorePackage::eINSTANCE.EClass
        val behavior = ext.getCreateBehavior(metaClass)
        assertNull(behavior)
    }
}