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
package org.eclipselabs.spray.xtext;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipselabs.spray.xtext.generator.outputconfig.SprayOutputConfigurationProvider;

/**
 * Redirects output to System Temp folder
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class SprayTestsOutputConfigurationProvider extends SprayOutputConfigurationProvider {
    @Override
    public Set<OutputConfiguration> getOutputConfigurations() {
        Set<OutputConfiguration> configs = super.getOutputConfigurations();

        return configs;
    }
}
