package org.eclipselabs.spray.shapes.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipselabs.spray.shapes.generator.GeneratorConnectionDefinition;
import org.eclipselabs.spray.shapes.generator.GeneratorShapeDefinition;
import org.eclipselabs.spray.shapes.shapes.ConnectionDefinition;
import org.eclipselabs.spray.shapes.shapes.ShapeDefinition;

import com.google.inject.Inject;

public class ShapesQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    @Inject GeneratorShapeDefinition shapeGenerator;
    @Inject GeneratorConnectionDefinition connectionGenerator;
	
	protected QualifiedName qualifiedName(ShapeDefinition shape){
		return QualifiedName.create(shapeGenerator.packageName(), shape.getName());
	}
	
	protected QualifiedName qualifiedName(ConnectionDefinition connection){
		return QualifiedName.create(connectionGenerator.packageName(), connection.getName());
	}
}
