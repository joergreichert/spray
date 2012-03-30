/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray ImageProvider.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.diagram;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class StatemachineImageProviderBase extends AbstractImageProvider {
    // The prefix for all identifiers of this image provider
    public static final String PREFIX = "org.eclipselabs.spray.examples.statemachine.diagram.";

    // The image identifier for an EReference.
    public static final String STATEMACHINE__START  = PREFIX + "start";
    // The image identifier for an EReference.
    public static final String STATEMACHINE__END  = PREFIX + "end";
    // The image identifier for an EReference.
    public static final String STATEMACHINE__STATE  = PREFIX + "state";
    // The image identifier for an EReference.
    public static final String STATEMACHINE__CONNECTION  = PREFIX + "connection";

    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
    addImageFilePath(STATEMACHINE__START, "icons/start.gif");
    addImageFilePath(STATEMACHINE__END, "icons/end.gif");
    addImageFilePath(STATEMACHINE__STATE, "icons/state.gif");
    addImageFilePath(STATEMACHINE__CONNECTION, "icons/connection.gif");
    }
}
