package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipselabs.spray.mm.spray.Shape;

public class SprayElementNameProvider {
    class ShapeQNProvider extends DefaultDeclarativeQualifiedNameProvider {
        QualifiedName qualifiedName(Shape shape) {
            if (shape.getAlias() != null) {
                return QualifiedName.create(shape.getAlias());
            } else {
                int i = shape.eContainer().eContents().indexOf(shape);
                String localName = shape.eClass().getName() + i;
                QualifiedName qn = apply(shape.eContainer());
                if (qn != null) {
                    return qn.append(localName);
                } else {
                    return QualifiedName.create(localName);
                }
            }
        }
    }

    private IQualifiedNameProvider qnProvider = new ShapeQNProvider();

    public String getShapeName(Shape shape) {
        QualifiedName qn = qnProvider.getFullyQualifiedName(shape);
        return qn.toString().replace(".", "_");
    }
}
