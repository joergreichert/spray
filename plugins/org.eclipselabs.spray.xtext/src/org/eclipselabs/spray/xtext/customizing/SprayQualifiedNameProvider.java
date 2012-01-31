package org.eclipselabs.spray.xtext.customizing;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;
import org.eclipselabs.spray.mm.spray.ShapeInSpray;
import org.eclipselabs.spray.mm.spray.SprayPackage;

import com.google.inject.Inject;

public class SprayQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
    @Inject
    private IQualifiedNameConverter converter;

    QualifiedName qualifiedName(JvmGenericType type) {
        return converter.toQualifiedName(type.getQualifiedName());
    }

    public QualifiedName qualifiedName(MetaClass element) {
        if (element.getAlias() == null) {
            List<INode> nodes = NodeModelUtils.findNodesForFeature(element, SprayPackage.Literals.META_CLASS__TYPE);
            String eClassName = NodeModelUtils.getTokenText(nodes.get(0));
            return QualifiedName.create(element.getDiagram().getName(), eClassName);
        } else {
            return QualifiedName.create(element.getDiagram().getName(), element.getAlias());
        }
    }

    public QualifiedName qualifiedName(ShapeInSpray element) {
        EObject parentObject = element.eContainer();
        QualifiedName parent = getFullyQualifiedName(parentObject);
        EObject grandParentObject = null;
        while (parent == null && parentObject != null) {
            grandParentObject = parentObject.eContainer();
            parent = grandParentObject != null ? getFullyQualifiedName(grandParentObject) : null;
        }
        String name = element.getAlias() != null ? element.getAlias() : calculateNameByPositionInParentChildren(element);
        return parent.append(name);
    }

    private String calculateNameByPositionInParentChildren(EObject element) {
        String parentName = "";
        if (element.eContainer() instanceof MetaReference) {
            parentName = calculateNameByPositionInParentChildren(element.eContainer());
            if (parentName == null) {
                parentName = "";
            }
        }
        return parentName + element.eClass().getName() + element.eContainer().eContents().indexOf(element);
    }
}
