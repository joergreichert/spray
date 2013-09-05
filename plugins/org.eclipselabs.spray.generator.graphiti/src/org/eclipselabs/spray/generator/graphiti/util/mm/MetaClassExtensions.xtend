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

/**
 * Extension methods for type MetaClass
 */
import org.eclipselabs.spray.mm.spray.MetaClass
import javax.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.ConnectionInSpray
import org.eclipselabs.spray.mm.spray.CustomBehavior
import java.util.Set
import java.util.TreeSet
import org.eclipselabs.spray.mm.spray.Behavior
import java.util.LinkedList

class MetaClassExtensions {
    @Inject extension NamingExtensions 
    def getCreateFeatureLabel (MetaClass metaClass) {
        val createBehavior = metaClass.createBehavior
        if (createBehavior != null && createBehavior.label != null && createBehavior.label.length > 0) {
            createBehavior.label
        } else {
            metaClass.visibleName
        }
    }
    
    def getCreateFeatureDescription (MetaClass metaClass) {
        "Create new "+metaClass.createFeatureLabel
    }
    
    def getCreateBehavior (MetaClass metaClass) {
        metaClass.behaviorsList.filter(typeof(CreateBehavior)).head
    }
    
    def boolean hasCreateBehavior (MetaClass mc) {
        !mc.behaviors.filter(typeof(CreateBehavior)).empty
    }
    
    /**
     * @return <code>true</code> when the MetaClass is represented by a Container Shape
     */
//    def boolean isRepresentedByContainer (MetaClass mc) {
//        mc.representedBy instanceof ContainerInSpray
//    }
    /**
     * @return <code>true</code> when the MetaClass is represented by a Connection Shape
     */
    def boolean isRepresentedByConnection (MetaClass mc) {
        mc.representedBy instanceof ConnectionInSpray
    }
    
    /**
     * Returns the ICustomFeature instances for a MetaClass
     */
    def Set<String> getCustomFeatureClassNames (MetaClass mc) {
        val result = new TreeSet<String>()
        for (b: mc.allBehaviors.filter(typeof(CustomBehavior))) {
            result += b.customFeatureClassName.shortName
        }
        result
    }
    
    /**
     * Combines the direct Behaviors with those from the referred BehaviorGroups. 
     */
    def Iterable<Behavior> getAllBehaviors (MetaClass mc) {
        val result = new LinkedList<Behavior> (mc.behaviorsList)
        for (g: mc.behaviorGroups) {
            result += g.behaviors
        }
        result
    }
}