package org.eclipselabs.spray.generator.graphiti.util.mm

/**
 * Extension methods for type MetaClass
 */
import org.eclipselabs.spray.mm.spray.MetaClass
import com.google.inject.Inject
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions
import org.eclipselabs.spray.mm.spray.CreateBehavior

class MetaClassExtensions {
    @Inject extension NamingExtensions 
	def getCreateFeatureLabel (MetaClass metaClass) {
	    val createBehavior = metaClass.createBehavior
	    if (createBehavior != null && createBehavior.label != null) {
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
}