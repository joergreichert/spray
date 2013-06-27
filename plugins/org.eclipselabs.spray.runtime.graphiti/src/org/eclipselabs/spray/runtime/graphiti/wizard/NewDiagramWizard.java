package org.eclipselabs.spray.runtime.graphiti.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import javax.inject.Inject;
import com.google.inject.name.Named;

public class NewDiagramWizard extends Wizard implements INewWizard {
    @Inject
    private NewDiagramPage      newDiagramPage;
    @Inject
    @Named("diagramTypeId")
    private String              diagramTypeId;
    @Inject
    private IDiagramInitializer diagramInitializer;
    @Inject
    private FileOpener          fileOpener;
    @Inject
    private IWorkspace          workspace;

    public NewDiagramWizard() {
        setWindowTitle("New Diagram");
    }

    @Override
    public void addPages() {
        addPage(newDiagramPage);
    }

    @Override
    public boolean performFinish() {
        return performFinish(newDiagramPage);
    }

    /**
     * This method is called when 'Finish' button is pressed in
     * the wizard. We will create an operation and run it
     * using wizard as execution context.
     */
    public boolean performFinish(NewDiagramPage page) {
        final String containerName = page.getContainerName();
        final String fileName = page.getFileName();
        final ResourceSet rs = new ResourceSetImpl();
        final URI uri = URI.createPlatformResourceURI(containerName + "/" + fileName + ".diagram", true);
        final Resource resource = rs.createResource(uri);
        Diagram diagram = PictogramsFactory.eINSTANCE.createDiagram();
        diagram.setDiagramTypeId(diagramTypeId);
        diagram.setName(fileName);
        diagramInitializer.initialize(diagram);
        resource.getContents().add(diagram);
        IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                try {
                    resource.save(Collections.emptyMap());
                    IFile file = workspace.getRoot().getFile(new Path(uri.toPlatformString(true)));
                    fileOpener.selectAndReveal(file);
                    fileOpener.openFileToEdit(getShell(), file);
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    monitor.done();
                }
            }
        };
        try {
            getContainer().run(true, false, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), "Error", realException.getMessage());
            return false;
        }
        return true;
    }

    /**
     * The worker method. It will find the container, create the
     * file if missing or just replace its contents, and open
     * the editor on the newly created file.
     */

    //    public void doFinish(String containerName, String fileName, IProgressMonitor monitor, InputStream inputStream) throws CoreException {
    //        // create a sample file which has a hmm type
    //        String fileNameWithType = fileName + ".diagram";
    //        monitor.beginTask("Creating " + fileNameWithType, 2);
    //        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
    //        IResource resource = root.findMember(new Path(containerName));
    //        if (!resource.exists() || !(resource instanceof IContainer)) {
    //            throwCoreException("Container \"" + containerName + "\" does not exist.");
    //        }
    //        IContainer container = (IContainer) resource;
    //        final IFile file = container.getFile(new Path(fileNameWithType));
    //        try {
    //            InputStream stream = inputStream;
    //            if (file.exists()) {
    //                file.setContents(stream, true, true, monitor);
    //            } else {
    //                file.create(stream, true, monitor);
    //            }
    //            stream.close();
    //        } catch (IOException e) {
    //        }
    //        monitor.worked(1);
    //        monitor.setTaskName("Opening file for editing...");
    //        getShell().getDisplay().asyncExec(new Runnable() {
    //            public void run() {
    //                IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    //                try {
    //                    IDE.openEditor(page, file, true);
    //                } catch (PartInitException e) {
    //                }
    //            }
    //        });
    //        monitor.worked(1);
    //    }

    private void throwCoreException(String message) throws CoreException {
        IStatus status = new Status(IStatus.ERROR, "org.eclipselabs.spray.runtime.graphiti", IStatus.OK, message, null);
        throw new CoreException(status);
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection selection) {
        newDiagramPage.setSelection(selection);
    }
}
