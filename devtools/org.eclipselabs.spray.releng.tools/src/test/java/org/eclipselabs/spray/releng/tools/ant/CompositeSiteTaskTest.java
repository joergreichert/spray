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
        
        String content = FileUtils.readFully(new FileReader(f));
        assertTrue (content.contains("0.5.0"));
    }
     
}
