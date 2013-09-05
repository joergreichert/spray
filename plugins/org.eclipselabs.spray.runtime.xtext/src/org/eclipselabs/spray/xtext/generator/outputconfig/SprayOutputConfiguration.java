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
package org.eclipselabs.spray.xtext.generator.outputconfig;

import org.eclipse.core.resources.IResource;
import org.eclipse.xtext.generator.OutputConfiguration;

public class SprayOutputConfiguration extends OutputConfiguration {
    private int depth = IResource.DEPTH_INFINITE;

    public SprayOutputConfiguration(String name) {
        super(name);
    }

    public int getRefreshDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

}
