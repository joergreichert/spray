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
import org.eclipse.xtext.example.fowlerdsl.statemachine.NormalState;


public class NormalStateCheckSectionBase extends GFPropertySection implements ITabbedPropertyConstants {
 
    protected NormalState bc = null;
    protected CCombo checkWidget;
 
    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
        super.createControls(parent, tabbedPropertySheetPage);
 
        TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
        Composite composite = factory.createFlatFormComposite(parent);
        FormData data;

    checkWidget = factory.createCCombo(composite);
        data = new FormData();
        data.left = new FormAttachment(0, STANDARD_LABEL_WIDTH);
        data.right = new FormAttachment(100, 0);
        data.top = new FormAttachment(0, VSPACE);
        checkWidget.setLayoutData(data);
 
        CLabel valueLabel = factory.createCLabel(composite, "Check");
        data = new FormData();
        data.left = new FormAttachment(0, 0);
        data.right = new FormAttachment(checkWidget, -HSPACE);
        data.top = new FormAttachment(checkWidget, 0, SWT.CENTER);
        valueLabel.setLayoutData(data);
}
 


    @Override
    public void refresh() {
        checkWidget.removeSelectionListener(nameListener);
        checkWidget.setItems(getEnumerationFeatureValues());
        checkWidget.setText(getFeatureAsText());
        checkWidget.addSelectionListener(nameListener);
    }
    
   /**
     * 
     * @return An Array of all the String representations of Multiplicity enumeration values
     */
    protected String[] getEnumerationFeatureValues() {
    String[] ret = new String[] {"false", "true"};
        return ret;
    }
//        value = ( bc.isCheck() ? "true" : "false" );

    /**
     * 
     * @return The string representation of the current value of 'sourceMultiplicity' of the selected Association
     */
    protected String getFeatureAsText() {
        PictogramElement pe = getSelectedPictogramElement();
        if (pe != null) {
            EObject bo = (EObject) Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
            // the filter assured, that it is a NormalState
            if (bo == null) {
                return "unknown ";
            }
            bc = (NormalState) bo;
    return ( bc.isCheck() ? "true" : "false" );
        }
        return "unknown ";
    }


     
    private SelectionListener nameListener = new SelectionAdapter() {
        public void widgetSelected(SelectionEvent event) {
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
        int index = checkWidget.getSelectionIndex();
       boolean newValue = (index == 0 ? false : true);
    if( newValue != bc.isCheck() ) { 
        bc.setCheck(newValue );
    }
    }
}
