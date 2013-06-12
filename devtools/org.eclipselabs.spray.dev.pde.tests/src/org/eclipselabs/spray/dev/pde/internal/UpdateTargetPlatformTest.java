package org.eclipselabs.spray.dev.pde.internal;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.eclipselabs.spray.dev.pde.internal.UpdateTargetPlatform;
import org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit;
import org.eclipselabs.spray.dev.pde.targetdef.Location;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefFactory;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.filter.ElementFilter;
import org.jdom.input.SAXBuilder;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.common.collect.Lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class UpdateTargetPlatformTest {
    private UpdateTargetPlatform updater = new UpdateTargetPlatform();

    private Document doc;
    
    @Before
    public void setUp () {
        URL url = getClass().getResource("/orbit.target");
        assertNotNull(url);
        SAXBuilder builder = new SAXBuilder();
        try {
            doc = builder.build(url.openStream());
        } catch (JDOMException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Test
    public void test_buildTargetDefinition () {
        TargetDefinition target = updater.buildTargetDefinition(doc);
        assertNotNull(target);
        
        assertEquals(1, target.getLocations().size());

        Location loc = target.getLocations().get(0);
        assertEquals(2, loc.getUnits().size());
        assertNotNull(loc.getUnits().get(0).getId());
        assertNotNull(loc.getUnits().get(0).getVersion());
        
        assertNotNull(loc.getRepository());
        assertNotNull(loc.getRepository().getLocation());
    }
    
    @Test
    public void test_updateIUs () {
        URL url = getClass().getResource("/orbit.target");
        assertNotNull(url);
        InstallableUnit iu;

        List<InstallableUnit> iusToUpdate = Lists.newArrayList();
        iu = TargetDefFactory.eINSTANCE.createInstallableUnit();
        iu.setId("org.jdom");
        iu.setVersion("1.1.1.v201101151400");
        iusToUpdate.add(iu);
        iu = TargetDefFactory.eINSTANCE.createInstallableUnit();
        iu.setId("org.mockito");
        iu.setVersion("1.8.4.v201303031500");
        iusToUpdate.add(iu);

        List<InstallableUnit> iusFromRepo = Lists.newArrayList();
        iu = TargetDefFactory.eINSTANCE.createInstallableUnit();
        iu.setId("org.jdom");
        iu.setVersion("1.1.1.v201101151401"); // greater than in .target
        iusFromRepo.add(iu);
        iu = TargetDefFactory.eINSTANCE.createInstallableUnit();
        iu.setId("org.jdom");
        iu.setVersion("1.1.1.v201101151402"); // greater than in the one before
        iusFromRepo.add(iu);
        
        updater.updateIUs(iusToUpdate, iusFromRepo);
        assertEquals("IU org.jdom must be updated", "1.1.1.v201101151402", iusToUpdate.get(0).getVersion());
        assertEquals("IU org.mockito must be updated", "1.8.4.v201303031500", iusToUpdate.get(1).getVersion());
    }
    
    @Test
    public void testUpdateXML () {
        TargetDefinition target = updater.buildTargetDefinition(doc);
        target.getLocations().get(0).getUnits().get(0).setVersion("1.2.0");
        
        updater.updateXML(doc, target);
        
        Element updatedElem = (Element) doc.getDescendants(new ElementFilter("unit") {
            @Override
            public boolean matches(Object obj) {
                if (super.matches(obj)) {
                    return ((Element)obj).getAttributeValue("id").equals("org.jdom");
                }
                return false;
            }
        }).next();
        assertEquals("1.2.0", updatedElem.getAttributeValue("version"));
    }
    
    @Test
    @Ignore
    public void test_readRepositoryContent () throws Exception {
        List<InstallableUnit> ius = updater.readRepositoryContent(new URL("http://download.eclipse.org/tools/orbit/downloads/drops/R20130517111416/repository/"));
        assertNotNull(ius);
    }
}
