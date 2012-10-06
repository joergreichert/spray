package org.eclipselabs.spray.styles.generator.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipselabs.spray.styles.styles.Style;

public class StyleQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	protected QualifiedName qualifiedName(Object ele){
		if(ele instanceof Style) {
			return QualifiedName.create("org.eclipselabs.spray.styles", ((Style) ele).getName());
		}
		return super.qualifiedName(ele);
	}
}
