package org.eclipselabs.spray.generator.graphiti.util;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.SprayElement;

public class SprayElementNameProvider {
    class ShapeQNProvider extends DefaultDeclarativeQualifiedNameProvider {
        QualifiedName qualifiedName(ShapeInSpray shape) {
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

        QualifiedName qualifiedName(MetaReference ref) {
            return QualifiedName.create(ref.getTarget().getName());
        }
    }

    private IQualifiedNameProvider qnProvider = new ShapeQNProvider();

    public String getShapeName(SprayElement shape) {
        QualifiedName qn = qnProvider.getFullyQualifiedName(shape);
        return StringExtensions.toFirstUpper(qn.toString().replace(".", "_").replace("InSray", ""));
    }
}
