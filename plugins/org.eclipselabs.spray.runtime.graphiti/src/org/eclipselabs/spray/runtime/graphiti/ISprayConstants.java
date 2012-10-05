package org.eclipselabs.spray.runtime.graphiti;

/**
 * The ISprayConstants define constants used by Spray framework classes and generated code.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public interface ISprayConstants {
    // KEYS used for IPeService#setPropertyValue()
    String PROPERTY_MODEL_TYPE                       = "MODEL_TYPE";
    String PROPERTY_MODEL_TYPE_CONNECTION_FROM_LABEL = "FROM_LABEL";
    String PROPERTY_MODEL_TYPE_CONNECTION_TO_LABEL   = "TO_LABEL";
    String PROPERTY_MODEL_TYPE_CONNECTION_LABEL      = "CONNECTION_LABEL";
    String PROPERTY_STATIC                           = "STATIC";
    String PROPERTY_REFERENCE                        = "REFERENCE";
    String PROPERTY_TARGETOBJECT                     = "TARGETOBJECT";
    String PROPERTY_ALIAS                            = "ALIAS";
    /**
     * Property stores an URI string
     */
    String PROPERTY_URI                              = "URI";
    String PROPERTY_CAN_MOVE                         = "CAN_MOVE";

    // CONSTANTS used by shapes
    String TEXT_ID                                   = "SHAPEDSL_TEXT_ID";
    String IS_SHAPE_FROM_DSL                         = "IS_SHAPE_FROM_DSL";
    String IS_COMPARTMENT                            = "IS_COMPARFTMENT";
    String WIDTH_KEY                                 = "current-width-shape";
    String HEIGHT_KEY                                = "current-height-shape";

}
