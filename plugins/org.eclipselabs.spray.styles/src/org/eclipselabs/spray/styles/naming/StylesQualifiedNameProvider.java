package org.eclipselabs.spray.styles.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipselabs.spray.styles.generator.GradientGenerator;
import org.eclipselabs.spray.styles.generator.StyleGenerator;
import org.eclipselabs.spray.styles.styles.Gradient;
import org.eclipselabs.spray.styles.styles.Style;

import com.google.inject.Inject;

public class StylesQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    @Inject StyleGenerator styleGenerator;
    @Inject GradientGenerator gradientGenerator;
	
	protected QualifiedName qualifiedName(Style style){
		return QualifiedName.create(styleGenerator.packageName(style), style.getName());
	}
	
	protected QualifiedName qualifiedName(Gradient gradient){
		return QualifiedName.create(gradientGenerator.packageName(gradient), gradient.getName());
	}
}
