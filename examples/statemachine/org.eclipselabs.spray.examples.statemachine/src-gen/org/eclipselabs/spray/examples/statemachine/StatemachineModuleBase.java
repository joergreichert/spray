/*************************************************************************************
 *
 * Generated on Sun Mar 25 15:23:33 CEST 2012 by Spray GuiceModule.xtend
 *
 * This file contains generated and should not be changed.
 * Use the extension point class (the direct subclass of this class) to add manual code
 *
 *************************************************************************************/
package org.eclipselabs.spray.examples.statemachine;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;
import org.eclipse.xtext.ui.editor.IURIEditorOpener;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.eclipse.xtext.ui.resource.Storage2UriMapperImpl;
import com.google.inject.Binder;

public class StatemachineModuleBase extends AbstractGenericModule {
    public Class<? extends IURIEditorOpener> bindIURIEditorOpener() {
        return GlobalURIEditorOpener.class;
    }

    @Override
    public void configure(Binder binder) {
        binder.bind(IStorage2UriMapper.class).to(Storage2UriMapperImpl.class);
        binder.bind(IWorkbench.class).toInstance(PlatformUI.getWorkbench());
    }
}
