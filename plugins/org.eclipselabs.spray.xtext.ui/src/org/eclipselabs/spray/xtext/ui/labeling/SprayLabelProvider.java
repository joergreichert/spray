package org.eclipselabs.spray.xtext.ui.labeling;

import javax.inject.Inject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.Import;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.MetaReference;

/**
 * Provides labels for a EObjects.
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class SprayLabelProvider extends DefaultEObjectLabelProvider {

    @Inject
    public SprayLabelProvider(AdapterFactoryLabelProvider delegate) {
        super(delegate);
    }

    public String image(Diagram element) {
        return "Diagram.gif";
    }

    public String image(Import element) {
        return "Import.gif";
    }

    public String text(MetaClass element) {
        if (element.getAlias() != null) {
            return String.format("%s alias %s", element.getType().getName(), element.getAlias());
        } else {
            return element.getType() != null ? element.getType().getName() : "";
        }
    }

    public String image(MetaClass element) {
        return "EClass.gif";
    }

    public String text(MetaReference element) {
        if (element.getTarget() != null && !element.getTarget().eIsProxy() && !element.getTarget().getEReferenceType().eIsProxy()) {
            return String.format("%s/%s::%s", element.getTarget().getName(), element.getTarget().getEReferenceType().getName(), getLabelPropertyName(element));
        } else {
            return getLabelPropertyName(element);
        }
    }

    // TODO: calculate correct name
    private String getLabelPropertyName(MetaReference ref) {
        //      if (ref.labelProperty != null)
        //         ref.labelProperty.name
        //      else
        return "name";
    }

    public String image(MetaReference element) {
        return "EReference.gif";
    }

    public String text(Behavior element) {
        if (element.getPaletteCompartment() != null) {
            return element.getPaletteCompartment();
        } else if (element.getLabel() != null) {
            return element.getLabel();
        } else {
            return null;
        }
    }

    public String image(Behavior element) {
        if (element.getPaletteCompartment() != null) {
            return "Palette.gif";
        } else {
            return null;
        }
    }

    //    public String text(TextInSpray element) {
    //        StringBuilder b = new StringBuilder();
    //        ICompositeNode node = NodeModelUtils.getNode(element);
    //        for (INode child : node.getChildren()) {
    //            if (child.getGrammarElement() == grammar.getTextInSprayAccess().getValueXExpressionParserRuleCall_4_0()) {
    //                b.append(child.getText());
    //            }
    //        }
    //        return b.toString().trim();
    //    }
    //
    //    public String image(TextInSpray element) {
    //        return "Text.gif";
    //    }
}
