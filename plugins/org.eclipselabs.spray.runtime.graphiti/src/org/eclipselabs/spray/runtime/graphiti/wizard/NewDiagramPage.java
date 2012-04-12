package org.eclipselabs.spray.runtime.graphiti.wizard;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.wb.swt.ResourceManager;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class NewDiagramPage extends WizardPage {
    private Text       nameText;
    private Text       locationText;
    private ISelection selection;
    @Inject
    @Named("diagramTypeId")
    private String     diagramTypeId;

    /**
     * Create the wizard.
     */
    public NewDiagramPage() {
        super("wizardPage");
        setImageDescriptor(ResourceManager.getPluginImageDescriptor("org.eclipse.ui", "/icons/full/wizban/new_wiz.png"));
        setTitle("Diagram");
        setDescription("Enter diagram name");
    }

    /**
     * Create contents of the wizard.
     * 
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        setControl(container);
        container.setLayout(new GridLayout(3, false));

        Label lblLocation = new Label(container, SWT.NONE);
        lblLocation.setText("Location");

        locationText = new Text(container, SWT.BORDER);
        GridData gd_locationText = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
        gd_locationText.widthHint = 300;
        locationText.setLayoutData(gd_locationText);

        Button button = new Button(container, SWT.PUSH);
        button.setText("Browse...");
        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
            }
        });

        Label lblDiagramName = new Label(container, SWT.NONE);
        lblDiagramName.setText("Diagram Name");

        nameText = new Text(container, SWT.BORDER);
        GridData gd_nameText = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
        gd_nameText.widthHint = 300;
        nameText.setLayoutData(gd_nameText);

        initializeLocationText();
        nameText.setFocus();
    }

    /**
     * Uses the standard container selection dialog to choose the new value for
     * the container field.
     */

    public void handleBrowse() {
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), ResourcesPlugin.getWorkspace().getRoot(), false, "Select new file container");
        if (dialog.open() == ContainerSelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length == 1) {
                locationText.setText(((Path) result[0]).toString());
            }
        }
    }

    protected void updateStatus(String message) {
        setErrorMessage(message);
        setPageComplete(message == null);
    }

    public String getFileName() {
        return nameText.getText();
    }

    public String getContainerName() {
        return locationText.getText();
    }

    protected void initializeLocationText() {
        if (selection == null || selection.isEmpty() || !(selection instanceof IStructuredSelection))
            return;
        IStructuredSelection ssel = (IStructuredSelection) selection;
        if (ssel.size() > 1)
            return;
        Object obj = ssel.getFirstElement();
        if (!(obj instanceof IAdaptable))
            return;

        IResource resource = null;
        resource = (IResource) ((IAdaptable) obj).getAdapter(IResource.class);
        IContainer container;
        if (resource instanceof IContainer)
            container = (IContainer) resource;
        else
            container = ((IResource) resource).getParent();
        locationText.setText(container.getFullPath().toString());
    }

    protected void CreateLocationText(Composite container) {
        locationText = new Text(container, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        locationText.setLayoutData(gd);
        locationText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                locationValid();
            }
        });

    }

    protected Boolean locationValid() {
        IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));

        if (getContainerName().length() == 0) {
            updateStatus("File container must be specified");
            return false;
        }
        if (container == null || (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
            updateStatus("File container must exist");
            return false;
        }
        if (!container.isAccessible()) {
            updateStatus("Project must be writable");
            return false;
        }
        updateStatus(null);
        return true;
    }

    protected void setNameText(String textToSet) {
        nameText.setText(textToSet);

    }

    protected void CreateFileText(Composite container) {
        nameText = new Text(container, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        nameText.setLayoutData(gd);
        nameText.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                dialogChanged();
            }
        });

    }

    /**
     * Ensures that both text fields are set.
     */
    protected void dialogChanged() {
        String fileName = getFileName();

        if (!locationValid()) {
            return;
        }
        if (fileName.length() == 0) {
            updateStatus("DeviceType must be specified");
            return;
        }
        if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
            updateStatus("DeviceType name must be valid");
            return;
        }
        int dotLoc = fileName.lastIndexOf('.');
        if (dotLoc != -1) {
            updateStatus("DeviceType name should not contain '.' .");
            return;
        }
        updateStatus(null);
    }

    public void setSelection(ISelection selection) {
        this.selection = selection;
    }
}
