/*
 * generated by Xtext
 */
package org.eclipselabs.spray.styles.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.ColorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FontDialog;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.access.IJvmTypeProvider;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider.Filter;
import org.eclipse.xtext.common.types.xtext.ui.TypeMatchFilters;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayGradient;
import org.eclipselabs.spray.runtime.graphiti.styles.ISprayStyle;
import org.eclipselabs.spray.styles.styles.Gradient;
import org.eclipselabs.spray.styles.styles.Style;
import org.eclipselabs.spray.styles.styles.StyleLayout;
import org.eclipselabs.spray.styles.styles.StylesPackage;

import com.google.inject.Inject;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 */
public class StyleProposalProvider extends AbstractStyleProposalProvider {

    @Inject
    ITypesProposalProvider   proposalProvider;

    @Inject
    IJvmTypeProvider.Factory typeProviderFactory;
    
    @Inject
    private IJvmTypeProvider.Factory      jvmTypeProviderFactory;
    
    @Inject
    private ITypesProposalProvider        typeProposalProvider;

    /**
     * Completes the JvmTypeReference, that matchs just on public, instanceable subtypes
     * of the interface ISprayStyle.
     */
    @Override
    public void complete_JvmTypeReference(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        IJvmTypeProvider typeProvider = typeProviderFactory.findOrCreateTypeProvider(model.eResource().getResourceSet());
        Filter filter = TypeMatchFilters.and(TypeMatchFilters.isPublic(), TypeMatchFilters.canInstantiate());
        if (model instanceof Style) {
            JvmType superType = typeProvider.findTypeByName(ISprayStyle.class.getName());
            proposalProvider.createSubTypeProposals(superType, this, context, StylesPackage.Literals.STYLE__SUPER_STYLE, filter, acceptor);
            proposalProvider.createSubTypeProposals(superType, this, context, StylesPackage.Literals.GRADIENT_REF__GRADIENT_REF, filter, acceptor);
            
        }
        if (model instanceof Gradient) {
            JvmType superType = typeProvider.findTypeByName(ISprayGradient.class.getName());
            proposalProvider.createSubTypeProposals(superType, this, context, StylesPackage.Literals.GRADIENT_REF__GRADIENT_REF, filter, acceptor);
        }
        super.complete_JvmTypeReference(model, ruleCall, context, acceptor);
    }

    /**
     * Completes the Color selection of the user. The ColorDialog of SWT will be
     * used therefore. Returns the content assist value: RGB(RED,GREEN,BLUE).
     */
    @Override
    public void complete_RGBColor(EObject model, RuleCall ruleCall, final ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        ConfigurableCompletionProposal pickColor = (ConfigurableCompletionProposal) createCompletionProposal("Pick RGB color...", context);
        if (pickColor != null) {
            pickColor.setTextApplier(new ReplacementTextApplier() {
                @Override
                public String getActualReplacementString(ConfigurableCompletionProposal proposal) {
                    final Display display = context.getViewer().getTextWidget().getDisplay();
                    final ColorDialog colorDialog = new ColorDialog(display.getActiveShell());
                    RGB newColor = colorDialog.open();
                    if (newColor == null)
                        newColor = new RGB(0, 0, 0);
                    return "RGB(" + newColor.red + "," + newColor.green + "," + newColor.blue + ")";
                }
            });
            pickColor.setPriority(600);
            acceptor.accept(pickColor);
        }
        super.complete_RGBColor(model, ruleCall, context, acceptor);
    }

    /**
     * Completes the User Selection for the Font Name with the usage of the SWT
     * FontDialog. The values for color, style and size will be ignored.
     */
    @Override
    public void complete_STRING(EObject model, RuleCall ruleCall, final ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        if (model instanceof StyleLayout) {
            ConfigurableCompletionProposal pickFont = (ConfigurableCompletionProposal) createCompletionProposal("Pick font name...", context);
            if (pickFont != null) {
                pickFont.setTextApplier(new ReplacementTextApplier() {
                    @Override
                    public String getActualReplacementString(ConfigurableCompletionProposal proposal) {
                        Display display = context.getViewer().getTextWidget().getDisplay();
                        FontDialog fontDialog = new FontDialog(display.getActiveShell());
                        FontData newFont = fontDialog.open();
                        return "\"" + newFont.getName() + "\"";
                    }
                });
                pickFont.setPriority(600);
                acceptor.accept(pickFont);
            }
        }
        super.complete_STRING(model, ruleCall, context, acceptor);
    }

    /**
     * Retrieves the Font Style values according to the selected value in the
     * font dialog.
     * 
     * @param style
     *            the selected value of the font dialog.
     * @return a string representation that accords to the grammar.
     */
    private String getStyle(int style) {
        String styleType = "";
        switch (style) {
        case 1:
            styleType = "bold";
            break;
        case 2:
            styleType = "italic";
            break;
        case 3:
            styleType = "bold italic";
            break;
        default:
            styleType = "";
            break;
        }
        return styleType;
    }
    
    public void completeJvmParameterizedTypeReference_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
   
    	if (EcoreUtil2.getContainerOfType(model, Style.class) != null) {
            final IJvmTypeProvider jvmTypeProvider = jvmTypeProviderFactory.createTypeProvider(model.eResource().getResourceSet());
            // Graphiti specific
            final JvmType interfaceToImplement = jvmTypeProvider.findTypeByName(ISprayGradient.class.getName());
            typeProposalProvider.createSubTypeProposals(interfaceToImplement, this, context, StylesPackage.Literals.GRADIENT_REF__GRADIENT_REF, TypeMatchFilters.canInstantiate(), acceptor);
        } else {
            super.completeJvmParameterizedTypeReference_Type(model, assignment, context, acceptor);
        }
    }


}
