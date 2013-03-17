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
