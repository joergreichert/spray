package org.eclipselabs.spray.generator.graphiti.util

import com.google.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipselabs.spray.mm.spray.MetaClass

class AskForHandler {
	@Inject extension NamingExtensions
	
	def handleAskFor(MetaClass metaClass, String instanceName, EAttribute attribute) '''
        «IF attribute != null»
           // ask user for «metaClass.visibleName» «attribute.name»
           «IF (attribute.EType as EDataType).instanceClassName.matches('java.lang.String')»
              String new«attribute.name.toFirstUpper» = SampleUtil.askString(TITLE, USER_QUESTION, "", null);
              if (new«attribute.name.toFirstUpper» == null || new«attribute.name.toFirstUpper».trim().length() == 0) {
                 return null;
              } else {
                 «instanceName».set«attribute.name.toFirstUpper»(new«attribute.name.toFirstUpper»);
              }
           «ELSE»
              «val type = (attribute.EType as EDataType).instanceClassName» 
              «val typeName = if("double".matches(type)) "Double" else if("int".matches(type)) "Integer" else "Object"»
              final «"org.eclipse.jface.dialogs.IInputValidator".shortName» validator = new IInputValidator() {
                 public String isValid(final String _newText) {
                    String message = null;
                    try {
                       «typeName».valueOf(_newText);
                    } catch(Exception nfe) {
                       message = _newText + " cannot be cast to «typeName»";
                    }
                    return message;
                 }
              };
              final String new«attribute.name.toFirstUpper»String = SampleUtil.askString(TITLE, USER_QUESTION, "", validator);
              final «typeName» new«attribute.name.toFirstUpper» = «typeName».valueOf(new«attribute.name.toFirstUpper»String);    
              «instanceName».set«attribute.name.toFirstUpper»(new«attribute.name.toFirstUpper»);
           «ENDIF»
        «ENDIF»
    '''	
}