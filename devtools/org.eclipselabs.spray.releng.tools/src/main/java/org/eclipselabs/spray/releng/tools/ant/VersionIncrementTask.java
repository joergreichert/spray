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
package org.eclipselabs.spray.releng.tools.ant;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.taskdefs.optional.PropertyFile;
import org.apache.tools.ant.taskdefs.optional.PropertyFile.Entry;

public class VersionIncrementTask extends Task {
    private static final String VERSION_NEXT = "version_next";
    private static final String VERSION_OSGI = "version_osgi";
    private static final String VERSION_MVN = "version_mvn";
    private static final String VERSION_MAIN = "version_main";
    private static final Pattern VERSION_PATTERN = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)");
    private File releasePropertiesFile;
    
    public void setReleasePropertiesFile(File releasePropertiesFile) {
        this.releasePropertiesFile = releasePropertiesFile;
    }
    
    @Override
    public void execute() throws BuildException {
        if (releasePropertiesFile == null) {
            throw new BuildException("releasePropertiesFile attribute is required", getLocation());
        }
        Properties props = new Properties();
        try {
            props.load(new FileReader(releasePropertiesFile));
            
            if (props.getProperty(VERSION_MAIN) == null) {
                throw new BuildException("Property 'version_main' not defined", getLocation());
            }
            if (props.getProperty(VERSION_MVN) == null) {
                throw new BuildException("Property 'version_mvn' not defined", getLocation());
            }
            if (props.getProperty(VERSION_OSGI) == null) {
                throw new BuildException("Property 'version_osgi' not defined", getLocation());
            }
            if (props.getProperty(VERSION_NEXT) == null) {
                throw new BuildException("Property 'version_next' not defined", getLocation());
            }
            String versionNext = props.getProperty(VERSION_NEXT);
            Matcher m = VERSION_PATTERN.matcher(versionNext);
            if (!m.matches()) {
                throw new BuildException("Property 'version_next' has wrong format", getLocation());
            }
            
            Integer major = Integer.parseInt(m.group(1));
            Integer minor = Integer.parseInt(m.group(2));
            Integer micro = Integer.parseInt(m.group(3));
            
            minor++;
            String versionNextNew = major+"."+minor+"."+micro;
            
            String versionMain = props.getProperty(VERSION_MAIN);
            String versionMvn = props.getProperty(VERSION_MVN);
            String versionOsgi = props.getProperty(VERSION_OSGI);
            String versionMainNew = versionMain.replace(versionMain, versionNext);
            String versionMvnNew = versionMvn.replace(versionMain, versionNext);
            String versionOsgiNew = versionOsgi.replace(versionMain, versionNext);
            
            
            PropertyFile pf = new PropertyFile();
            pf.setProject(getProject());
            pf.setFile(releasePropertiesFile);
            Entry e;
            e = pf.createEntry();
            e.setKey(VERSION_MAIN);
            e.setValue(versionMainNew);
            e = pf.createEntry();
            e.setKey(VERSION_MVN);
            e.setValue(versionMvnNew);
            e = pf.createEntry();
            e.setKey(VERSION_OSGI);
            e.setValue(versionOsgiNew);
            e = pf.createEntry();
            e.setKey(VERSION_NEXT);
            e.setValue(versionNextNew);
            
            pf.execute();
        } catch (Exception e) {
            throw new BuildException(e);
        }
    }
}
