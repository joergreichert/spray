package org.eclipselabs.spray.xtext.ui.wizard;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.XtextPackage;
import org.eclipselabs.spray.mm.spray.SprayPackage;
import org.eclipselabs.spray.shapes.shapes.ShapesPackage;
import org.eclipselabs.spray.styles.styles.StylesPackage;

import com.google.common.base.Predicate;
import com.google.inject.ImplementedBy;

/**
 * Filter for the "Browse EPackage" dialog in Spray Project Wizard.
 * apply() must return true when the EPackage URI must be filtered out
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
@ImplementedBy(ISprayWizardEPackageFilter.Default.class)
public interface ISprayWizardEPackageFilter extends Predicate<String> {
    static class Default implements ISprayWizardEPackageFilter {
        @Override
        public boolean apply(String input) {
            if (input.startsWith("http://www.eclipse.org/emf") && !input.equals(EcorePackage.eNS_URI))
                return true;
            if (input.equals(XtextPackage.eNS_URI) || input.startsWith("http://www.eclipse.org/Xtext") || input.startsWith("http://www.eclipse.org/xtext"))
                return true;
            if (input.startsWith("http://eclipse.org/graphiti"))
                return true;
            if (input.startsWith("http://www.eclipse.org/xtext"))
                return true;
            if (input.equals(SprayPackage.eNS_URI) || input.equals(ShapesPackage.eNS_URI) || input.equals(StylesPackage.eNS_URI))
                return true;
            if (input.equals("http://www.w3.org/XML/1998/namespace"))
                return true;
            return false;
        }
    }
}
