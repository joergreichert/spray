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
package org.eclipselabs.spray.dev.pde;

import java.net.URL;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipselabs.spray.dev.pde.internal.Activator;
import org.eclipselabs.spray.dev.pde.internal.UpdateTargetPlatform;

import com.google.common.collect.Maps;

/**
 * Parameter:
 * <ul>
 * <li> srcUrl (required): URL of .target file to update
 * <li> targetUrl (optional): URL of .target file to write. If not passed, the srcUrl will be taken.
 * </ul>
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 *
 */
public class UpdateTargetPlatformApp implements IApplication {
    @Inject
    private UpdateTargetPlatform updater;
    
    @Override
    public Object start(IApplicationContext context) throws Exception {
        Activator.getINSTANCE().getInjector().injectMembers(this);

        String[] args = (String[]) context.getArguments().get("application.args");
        Map<String, String> arguments = processArgs(args);
        Object arg;
        URL srcUrl;
        URL targetUrl;
        arg = arguments.get("srcUrl");
        if (arg != null) 
            srcUrl = new URL(arg.toString()); 
        else 
            throw new IllegalArgumentException("Argument 'srcUrl' is missing");
        arg = arguments.get("targetUrl");
        if (arg != null) 
            targetUrl = new URL(arg.toString());
        else 
            targetUrl = srcUrl;

        updater.updateTargetDefinition(srcUrl, targetUrl);
        return null;
    }
    
    private Map<String,String> processArgs (String[] args) {
        Map<String,String> map = Maps.newHashMap();
        for (int i=0; i<args.length; i++) {
            String option = args[i];
            if (!option.startsWith("-")) 
                throw new IllegalArgumentException ("Expected option starting with -, but was "+option);
            String value = null;
            if (args.length>i && !args[i+1].startsWith("-")) {
                value = args[i+1];
                i++;
            }
            map.put(option.substring(1), value);
        }
        return map;
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

}
