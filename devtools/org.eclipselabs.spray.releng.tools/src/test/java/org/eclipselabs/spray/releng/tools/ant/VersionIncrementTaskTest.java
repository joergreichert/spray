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
import java.io.FileWriter;
import java.util.Properties;

import org.apache.tools.ant.Project;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VersionIncrementTaskTest {
    private VersionIncrementTask task = new VersionIncrementTask();
    
    @Test
    public void test_increment () throws Exception {
        Properties p = new Properties();
        p.setProperty("version_main", "0.5.0");
        p.setProperty("version_mvn", "0.5.0-SNAPSHOT");
        p.setProperty("version_osgi", "0.5.0.qualifier");
        p.setProperty("version_next", "0.6.0");
        File f = File.createTempFile("release", ".properties");
        f.deleteOnExit();
        p.store(new FileWriter(f), "");
        
        
        Project project = new Project();
        task.setProject(project);
        
        task.setReleasePropertiesFile(f);
        task.execute();
        
        p = new Properties();
        p.load(new FileReader(f));
        
        assertEquals("0.6.0", p.getProperty("version_main"));
        assertEquals("0.6.0-SNAPSHOT", p.getProperty("version_mvn"));
        assertEquals("0.6.0.qualifier", p.getProperty("version_osgi"));
        assertEquals("0.7.0", p.getProperty("version_next"));
    }
}
