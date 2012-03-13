package org.eclipselabs.spray.xtext.customizing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.eclipselabs.spray.mm.spray.ShapePropertyAssignment;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import com.google.inject.Singleton;

@SuppressWarnings("restriction")
@Singleton
public class SprayTypeProvider extends XbaseTypeProvider {
    @Override
    protected JvmTypeReference _expectedType(EObject obj, EReference reference, int index, boolean rawType) {
        if (reference == SprayPackage.Literals.TEXT_IN_SPRAY__VALUE) {
            // The expected type of the 'value' expression of type Text is String
            return getTypeReferences().getTypeForName(String.class, obj, (JvmTypeReference[]) null);
        } else if (reference == SprayPackage.Literals.SHAPE_PROPERTY_ASSIGNMENT__VALUE) {
            // The expected type of the 'value' expression of type ShapePropertyAssignment is the type of the Key
            final ShapePropertyAssignment assignment = (ShapePropertyAssignment) obj;
            final JvmFormalParameter param = (JvmFormalParameter) assignment.getKey();
            return param.getParameterType();
            //            return getTypeReferences().getTypeForName(String.class, obj, (JvmTypeReference[]) null);
        }
        return super._expectedType(obj, reference, index, rawType);
    }

}
