package org.eclipselabs.spray2.xtext.util;

import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.IEObjectDescription;

import com.google.common.base.Predicate;

public class CustomFeatureRestrictor implements Predicate<IEObjectDescription> {

    private final String CUSTOMFEATURE_INTERFACE = ICustomFeature.class.getName();

    @Override
    public boolean apply(IEObjectDescription input) {
        if (input.getEObjectOrProxy() instanceof JvmGenericType) {
            return isStyle((JvmGenericType) input.getEObjectOrProxy());
        } else {
            return false;
        }
    }

    private boolean isStyle(JvmGenericType type) {
        for (JvmTypeReference itfRef : type.getExtendedInterfaces()) {
            if (isStyle(itfRef)) {
                return true;
            }
        }
        for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
            if (isStyle(superTypeRef)) {
                return true;
            }
        }
        return false;
    }

    private boolean isStyle(JvmTypeReference typeRef) {
        if (CUSTOMFEATURE_INTERFACE.equals(typeRef.getIdentifier())) {
            return true;
        }
        JvmGenericType type = (JvmGenericType) typeRef.getType();
        for (JvmTypeReference itfRef : type.getExtendedInterfaces()) {
            if (CUSTOMFEATURE_INTERFACE.equals(itfRef.getIdentifier())) {
                return true;
            }
        }
        for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
            if (isStyle(superTypeRef)) {
                return true;
            }
        }
        return false;
    }

}

