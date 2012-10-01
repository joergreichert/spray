package org.eclipselabs.spray.xtext.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.xtext.util.GenModelHelper

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. 
 * Other Xtend models link against the JVM model rather than the source model. The JVM
 * model elements should be associated with their source element by means of the
 * {@link IJvmModelAssociator}.</p>     
 */
class SprayJvmModelInferrer extends AbstractModelInferrer {
    @Inject TypeReferences typeReferences
    @Inject extension GenModelHelper
    @Inject extension JvmTypesBuilder
    @Inject IQualifiedNameConverter converter

    def dispatch void infer(MetaClass clazz, IJvmDeclaredTypeAcceptor acceptor, boolean prelinkingPhase) {
        if (clazz.type==null || clazz.type.eIsProxy) return;
        try {
            clazz.type.javaInterfaceName
        } catch (IllegalStateException e) {
            return;
        }
        
        val instanceClassName = clazz.type.javaInterfaceName
        val eClassJvmType = typeReferences.getTypeForName(instanceClassName, clazz, null)
        if (eClassJvmType==null || eClassJvmType.eIsProxy) {
            return;
        }
        
        val clazzName = if (clazz.alias == null) clazz.type.name else clazz.alias
        val infered = clazz.toClass(converter.toQualifiedName("org.eclipselabs.spray."+clazz.type.EPackage.name+"."+clazzName)) [
                members += toField("ecoreClass", eClassJvmType)
                members += toGetter("ecoreClass", eClassJvmType)
            ]
        acceptor.accept(infered);
    }

}

