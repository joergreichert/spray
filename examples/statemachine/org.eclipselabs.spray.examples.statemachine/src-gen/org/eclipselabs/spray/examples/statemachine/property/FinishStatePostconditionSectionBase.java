/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray PropertySection.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;
import java.util.List;
import org.eclipse.xtext.example.fowlerdsl.statemachine.FinishState;


public class FinishStatePostconditionSectionBase extends GFPropertySection implements ITabbedPropertyConstants {
 
    protected FinishState bc = null;
    protected Text postconditionWidget;
 
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
 
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

    postconditionWidget = factory.createText(composite, "");
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        postconditionWidget.setLayoutData(data);
 
        CLabel valueLabel = factory.createCLabel(composite, "Postcondition");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(postconditionWidget, -HSPACE);
        data.top = new FormAttachment(postconditionWidget, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
}
 
@Override
public void refresh() {
    postconditionWidget.removeModifyListener(nameListener);

    PictogramElement pe = getSelectedPictogramElement();
    if (pe != null) {
        EObject bo = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
       // the filter assured, that it is a FinishState
        if (bo == null)
            return;
        bc = (FinishState)bo;
        String value = "";
value = bc.getPostcondition();
        postconditionWidget.setText(value == null ? "" : value);
        postconditionWidget.addModifyListener(nameListener);
    }
}

private ModifyListener nameListener = new ModifyListener() {
    public void modifyText(ModifyEvent arg0) {
        TransactionalEditingDomain editingDomain = getDiagramEditor().getEditingDomain();
        editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {
            @Override
            protected void doExecute() {
                changePropertyValue();
            }
        });
    }
};

protected void changePropertyValue(){
    String newValue = postconditionWidget.getText();
if( ! newValue.equals(bc.getPostcondition() ) ) { 
    bc.setPostcondition(newValue);
}
}

}
