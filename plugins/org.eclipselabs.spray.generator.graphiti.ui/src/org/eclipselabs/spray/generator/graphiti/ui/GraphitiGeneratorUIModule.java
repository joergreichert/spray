/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.generator.graphiti.ui;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;
import org.eclipselabs.spray.runtime.xtext.ui.filesystem.EclipseFileSystemAccessUtil;
import org.eclipselabs.spray.runtime.xtext.ui.filesystem.EclipseResourceFileSystemAccessExt;
import org.eclipselabs.spray.xtext.generator.filesystem.IFileSystemAccessUtil;
import org.eclipselabs.spray.xtext.generator.outputconfig.SprayOutputConfigurationProvider;

import com.google.inject.Binder;

public class GraphitiGeneratorUIModule extends AbstractGenericModule {
    private final AbstractUIPlugin plugin;

    public GraphitiGeneratorUIModule(AbstractUIPlugin plugin) {
        this.plugin = plugin;
    }

    public Class<? extends org.eclipse.xtext.generator.IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
        return SprayOutputConfigurationProvider.class;
    }

    @Override
    public void configure(Binder binder) {
        super.configure(binder);
        binder.bind(AbstractUIPlugin.class).toInstance(plugin);
        binder.bind(IDialogSettings.class).toInstance(plugin.getDialogSettings());
    }

    /**
     * Bind the JavaProjectBasedBuilderParticipant in order to invoke the generator during the build.
     */
    //    public Class<? extends org.eclipse.xtext.builder.IXtextBuilderParticipant> bindIXtextBuilderParticipant() {
    //        return SprayBuilderParticipant.class;
    //    }

    public Class<? extends IFileSystemAccess> bindIFileSystemAccess() {
        return EclipseResourceFileSystemAccessExt.class;
    }

    public Class<? extends EclipseResourceFileSystemAccess2> bindEclipseResourceFileSystemAccess2() {
        return EclipseResourceFileSystemAccessExt.class;
    }

    @SuppressWarnings("restriction")
    public Class<? extends org.eclipse.xtext.common.types.access.IJvmTypeProvider.Factory> bindIJvmTypeProvider$Factory() {
        return org.eclipse.xtext.common.types.access.jdt.JdtTypeProviderFactory.class;
    }

    public Class<? extends IFileSystemAccessUtil> bindIFileSystemAccessUtil() {
        return EclipseFileSystemAccessUtil.class;
    }

}
