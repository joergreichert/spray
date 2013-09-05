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

import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.runner.RunWith
import javax.inject.Inject
import org.junit.Test
import org.eclipselabs.spray.mm.spray.MetaReference
import org.eclipselabs.spray.mm.spray.Diagram
import static org.junit.Assert.*
import org.eclipselabs.spray.mm.spray.SprayFactory
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class MetaReferenceExtensionsTest {
    
    @Inject
    MetaReferenceExtensions sut
    
    @Test
    def testGetDiagram() {
        val Diagram diagram = SprayFactory::eINSTANCE.createDiagram
        val MetaClass metaClass = SprayFactory::eINSTANCE.createMetaClass
        val MetaReference reference = SprayFactory::eINSTANCE.createMetaReference
        metaClass.referencesList.add(reference)
        diagram.metaClassesList.add(metaClass)
        val Diagram foundDiagram = sut.getDiagram(reference)
        assertNotNull("found diagram", foundDiagram)
        assertEquals("found expected diagram", foundDiagram, diagram)        
    }
    
    @Test
    def testGetDiagram_WhenReferenceHasNoDiagramInHierarchy__ExpectNoDiagram() {
        val MetaReference reference = SprayFactory::eINSTANCE.createMetaReference
        val Diagram foundDiagram = sut.getDiagram(reference)
        assertNull("found no diagram", foundDiagram)
    }
}
