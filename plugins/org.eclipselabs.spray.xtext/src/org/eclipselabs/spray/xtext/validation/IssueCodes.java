package org.eclipselabs.spray.xtext.validation;

/**
 * Constants for validation issues.
 */
public interface IssueCodes {
    String PREFIX               = "spray.";

    String MISSING_GENMODEL     = PREFIX + "MISSING_GENMODEL";
    String DUPLICATE_ALIAS_NAME = PREFIX + "DUPLICATE_ALIAS_NAME";
}
