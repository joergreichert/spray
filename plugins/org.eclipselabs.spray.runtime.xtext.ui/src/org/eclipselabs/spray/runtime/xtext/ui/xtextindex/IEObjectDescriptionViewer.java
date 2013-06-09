package org.eclipselabs.spray.runtime.xtext.ui.xtextindex;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.layout.TreeColumnLayout;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

public class IEObjectDescriptionViewer extends ViewPart {

    public static final String ID = "org.eclipselabs.spray.runtime.xtext.ui.xtextindex.IEObjectDescriptionViewer"; //$NON-NLS-1$
    private TreeViewer         treeViewer;

    public IEObjectDescriptionViewer() {
    }

    /**
     * Create contents of the view part.
     * 
     * @param parent
     */
    public void createPartControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NONE);
        container.setLayout(new FormLayout());

        Composite composite = new Composite(container, SWT.NONE);
        composite.setBounds(10, 21, 200, 64);
        FormData fd_composite = new FormData();
        fd_composite.left = new FormAttachment(0, 10);
        fd_composite.bottom = new FormAttachment(0, 458);
        fd_composite.top = new FormAttachment(0, 21);
        composite.setLayoutData(fd_composite);
        TreeColumnLayout tcl_composite = new TreeColumnLayout();
        composite.setLayout(tcl_composite);

        treeViewer = new TreeViewer(composite, SWT.BORDER);
        Tree tree = treeViewer.getTree();
        tree.setHeaderVisible(true);
        tree.setLinesVisible(true);

        TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        TreeColumn trclmnName = treeViewerColumn.getColumn();
        tcl_composite.setColumnData(trclmnName, new ColumnPixelData(150, true, true));
        trclmnName.setText("Name");

        TreeViewerColumn treeViewerColumn_1 = new TreeViewerColumn(treeViewer, SWT.NONE);
        TreeColumn trclmnType = treeViewerColumn_1.getColumn();
        tcl_composite.setColumnData(trclmnType, new ColumnPixelData(150, true, true));
        trclmnType.setText("Type");

        TreeViewerColumn treeViewerUserDataColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
        TreeColumn trclmnUserData = treeViewerUserDataColumn.getColumn();
        tcl_composite.setColumnData(trclmnUserData, new ColumnPixelData(150, true, true));
        trclmnUserData.setText("User Data");

        Button btnRefresh = new Button(container, SWT.NONE);
        fd_composite.right = new FormAttachment(btnRefresh, -35);
        btnRefresh.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseUp(MouseEvent e) {
                initializeInput();
            }
        });
        FormData fd_btnRefresh = new FormData();
        fd_btnRefresh.top = new FormAttachment(composite, 0, SWT.TOP);
        fd_btnRefresh.right = new FormAttachment(100, -10);
        btnRefresh.setLayoutData(fd_btnRefresh);
        btnRefresh.setText("Refresh");
        treeViewer.setLabelProvider(new IEObjectDescriptionLabelProvider());
        treeViewer.setContentProvider(new IEObjectDescriptionContentProvider());
        treeViewerColumn.setLabelProvider(new EObjectDescriptionNameColumnLabelProvider());
        treeViewerColumn_1.setLabelProvider(new EObjectDescriptionTypeColumnLabelProvider());
        treeViewerUserDataColumn.setLabelProvider(new EObjectDescriptionUserDataColumnLabelProvider());

        createActions();
        initializeToolBar();
        initializeMenu();
        initializeInput();
    }

    private void initializeInput() {
        //        IResourceDescriptions rr = AppInjectedAccess.getit().createResourceDescriptions();
        treeViewer.setInput("test");
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
        IToolBarManager toolbarManager = getViewSite().getActionBars().getToolBarManager();
    }

    /**
     * Initialize the menu.
     */
    private void initializeMenu() {
        IMenuManager menuManager = getViewSite().getActionBars().getMenuManager();
    }

    @Override
    public void setFocus() {
        // Set the focus
    }

}
