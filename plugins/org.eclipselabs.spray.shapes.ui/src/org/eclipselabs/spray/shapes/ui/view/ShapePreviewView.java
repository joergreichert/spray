package org.eclipselabs.spray.shapes.ui.view;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.part.ViewPart;

public class ShapePreviewView extends ViewPart {

    public static final String ID      = "org.eclipselabs.spray.shapes.ui.view.ShapePreviewView"; //$NON-NLS-1$
    private final FormToolkit  toolkit = new FormToolkit(Display.getCurrent());

    public ShapePreviewView() {

    }

    /**
     * Create contents of the view part.
     * 
     * @param parent
     */
    @Override
    public void createPartControl(Composite parent) {
        Composite container = toolkit.createComposite(parent, SWT.NONE);
        toolkit.paintBordersFor(container);
        container.setLayout(new FillLayout(SWT.HORIZONTAL));

        Browser browser = new Browser(container, SWT.NONE);
        toolkit.adapt(browser);
        toolkit.paintBordersFor(browser);

        createActions();
        initializeToolBar();
        initializeMenu();
    }

    public void dispose() {
        toolkit.dispose();
        super.dispose();
    }

    /**
     * Create the actions.
     */
    private void createActions() {
        // Create the actions
    }

    /**
     * Initialize the toolbar.
     */
    private void initializeToolBar() {
        IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();
    }

    /**
     * Initialize the menu.
     */
    private void initializeMenu() {
        IMenuManager manager = getViewSite().getActionBars().getMenuManager();
    }

    @Override
    public void setFocus() {
        // Set the focus
    }
}
