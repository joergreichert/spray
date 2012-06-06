package org.eclipselabs.spray.styles.scoping;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;
import org.eclipselabs.spray.styles.styles.StylesPackage;

import com.google.common.base.Predicate;

public class GradientScopeRestrictor implements Predicate<IEObjectDescription> {

    private final String GRADIENT_INTERFACE = ISprayGradient.class.getName();

    @Override
    public boolean apply(IEObjectDescription input) {
        if (input.getEObjectOrProxy() instanceof JvmGenericType) {
            return isGradient((JvmGenericType) input.getEObjectOrProxy());
        } else {
            return false;
        }
    }

    private boolean isGradient(JvmGenericType type) {
        for (JvmTypeReference itfRef : type.getExtendedInterfaces()) {
            if (isGradient(itfRef)) {
                return true;
            }
        }
        for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
            if (isGradient(superTypeRef)) {
                return true;
            }
        }
        return false;
    }

    private boolean isGradient(JvmTypeReference typeRef) {
        if (GRADIENT_INTERFACE.equals(typeRef.getIdentifier())) {
            return true;
        }
        JvmGenericType type = (JvmGenericType) typeRef.getType();
        for (JvmTypeReference itfRef : type.getExtendedInterfaces()) {
            if (GRADIENT_INTERFACE.equals(itfRef.getIdentifier())) {
                return true;
            }
        }
        for (JvmTypeReference superTypeRef : type.getSuperTypes()) {
            if (isGradient(superTypeRef)) {
                return true;
            }
        }
        return false;
    }

}
