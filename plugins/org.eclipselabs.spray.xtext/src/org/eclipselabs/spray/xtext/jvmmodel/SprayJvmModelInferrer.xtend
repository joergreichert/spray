/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.xtext.jvmmodel

import javax.inject.Inject
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipselabs.spray.mm.spray.MetaClass
import org.eclipselabs.spray.xtext.util.GenModelHelper

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
        if(instanceClassName.nullOrEmpty) {
        	return
        }
        val eClassJvmType = typeReferences.getTypeForName(instanceClassName, clazz, null)
        if (eClassJvmType==null || eClassJvmType.eIsProxy) {
            return;
        }
        
        val clazzName = if (clazz.alias == null) clazz.type.name else clazz.alias
		
		acceptor.accept(clazz.toClass(converter.toQualifiedName("org.eclipselabs.spray."+clazz.type.EPackage.name+"."+clazzName)))
		.initializeLater [
				val field = toField("ecoreClass", eClassJvmType)
//				field.annotations += toAnnotation(Extension)
                members += field
                members += toGetter("ecoreClass", eClassJvmType)
            ]
    }

}

