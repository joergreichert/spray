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

import org.apache.commons.io.IOUtils;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.util.FileUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CompositeSiteTaskTest {
    private CompositeSiteTask task = new CompositeSiteTask();
    
    @Test
    public void test_addRelease () throws Exception {
        File testFile = new File("src/test/resources/compositeArtifacts.xml");
        assertTrue(testFile.exists());
        File f = File.createTempFile("compositeArtifacts", ".xml");
        f.deleteOnExit();
        FileReader reader = new FileReader(testFile);
        FileWriter writer = new FileWriter(f);
        
        IOUtils.copy(reader, writer);
        reader.close();
        writer.close();
        
        Project project = new Project();
        task.setProject(project);

        task.setCompositeArtifactsXml(f);
        task.setVersionToAdd("0.5.0");
        task.execute();
        
        reader = new FileReader(f);
        String content = FileUtils.readFully(reader);
        reader.close();
        assertTrue (content.contains("0.5.0"));
    }
     
}
