package org.eclipselabs.spray.generator.graphiti.util.mm

/**
 * Extension methods for type MetaClass
 */
import org.eclipselabs.spray.mm.spray.MetaClass
import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.CreateBehavior
import org.eclipselabs.spray.mm.spray.ContainerInSpray
import org.eclipselabs.spray.mm.spray.ConnectionInSpray

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
    def boolean isRepresentedByContainer (MetaClass mc) {
        mc.representedBy instanceof ContainerInSpray
    }
    /**
     * @return <code>true</code> when the MetaClass is represented by a Connection Shape
     */
    def boolean isRepresentedByConnection (MetaClass mc) {
        mc.representedBy instanceof ConnectionInSpray
    }
}