package org.eclipselabs.spray.shapes.ui.outline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.util.DisplayRunHelper;
import org.eclipselabs.spray.shapes.ui.internal.ShapeActivator;

import com.google.common.collect.Iterables;

public class ShapeOutlinePage extends OutlinePage {
    private static final Logger LOG = Logger.getLogger(ShapeOutlinePage.class);
    private Browser             browser;
    private IPath               stateLocation;

    @Override
    public void createControl(Composite parent) {
        browser = new Browser(parent, SWT.NORMAL);
        stateLocation = ShapeActivator.getInstance().getStateLocation().append("preview.svg");
        if (!stateLocation.toFile().exists()) {
            try {
                FileWriter fw = new FileWriter(stateLocation.toFile());
                fw.append("");
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        super.createControl(parent);
    }

    protected void refreshViewer(final IOutlineNode rootNode, final Collection<IOutlineNode> nodesToBeExpanded, final Collection<IOutlineNode> selectedNodes) {
        DisplayRunHelper.runAsyncInDisplayThread(new Runnable() {
            public void run() {
                try {
                    TreeViewer treeViewer = getTreeViewer();
                    if (!treeViewer.getTree().isDisposed()) {
                        treeViewer.setInput(rootNode);
                        treeViewer.expandToLevel(1);
                        treeViewer.setExpandedElements(Iterables.toArray(nodesToBeExpanded, IOutlineNode.class));
                        treeViewer.setSelection(new StructuredSelection(Iterables.toArray(selectedNodes, IOutlineNode.class)));
                        treeUpdated();
                    }
                    browser.setUrl(stateLocation.toFile().toURL().toString());
                } catch (Throwable t) {
                    LOG.error("Error refreshing outline", t);
                }
            }
        });
    }

}
