package org.eclipselabs.spray.generator.graphiti.ext

import org.eclipselabs.spray.generator.graphiti.templates.diagram.FeatureProvider
import org.eclipselabs.spray.mm.spray.Diagram

class FeatureProviderExt extends FeatureProvider { 
	
    override generate_additionalMethods(Diagram context) '''
        // this has been added by a derived template from org.eclipselabs.spray.generator.graphiti.extension
    '''
    
} 