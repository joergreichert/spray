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
package org.eclipselabs.spray.xtext.ui.wizard.codegen

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.util.Collections
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage

class PackageHelper {
    
    def String getPackage(String modelURI, String element) {
        try {
            val rs = new ResourceSetImpl()
            val resource = rs.createResource(URI::createURI(modelURI))
            resource.load(Collections::EMPTY_MAP)
            val index = element.lastIndexOf(".")
            var String foundPackageName = null
            if(index > 0 && index < element.length) {
                val packageName = element.substring(0, index)
                val className = element.substring(index+1)
                var EPackage ePackage = null
                for(EClass clazz : resource.allContents.toIterable.filter(typeof(EClass))) {
                    ePackage = if (clazz.eContainer != null) clazz.eContainer as EPackage else null
                    // TODO handle case when class with same name in multiple packages
                    // better use gen model?: how does the FQN of the selected element map to the package
                    if(ePackage != null && clazz.name.matches(className)) {
                        return ePackage.name
                    } 
                }
            }
        } catch (Exception e) {
            e.printStackTrace
        }
        return element
    }
}