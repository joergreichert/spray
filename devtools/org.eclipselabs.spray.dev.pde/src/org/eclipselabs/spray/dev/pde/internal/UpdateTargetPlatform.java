package org.eclipselabs.spray.dev.pde.internal;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.equinox.internal.p2.director.app.DirectorApplication;
import org.eclipse.equinox.p2.metadata.Version;
import org.eclipselabs.spray.dev.pde.targetdef.InstallableUnit;
import org.eclipselabs.spray.dev.pde.targetdef.Location;
import org.eclipselabs.spray.dev.pde.targetdef.Repository;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefFactory;
import org.eclipselabs.spray.dev.pde.targetdef.TargetDefinition;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

// TODO: Increment 'sequenceNumber' when something has changed
public class UpdateTargetPlatform {
    private static final Log LOG = LogFactory.getLog(UpdateTargetPlatform.class);

    public static void main(String[] args) throws Exception {
        UpdateTargetPlatform updater = new UpdateTargetPlatform();
        if (args.length == 0) {
            throw new IllegalArgumentException ("Usage: UpdateTargetPlatform <URL SRC> [<URL TARGET>]");
        }
        URL urlSrc = new URL(args[0]);
        URL urlTarget = args.length > 1 ? new URL(args[1]) : urlSrc;
        
        updater.updateTargetDefinition(urlSrc, urlTarget);
    }
    
    public void updateTargetDefinition (URL urlSrc, URL urlTarget) throws Exception {
        SAXBuilder builder = new SAXBuilder();
        
        // Read Target Definition from URL
        Document doc = builder.build(urlSrc.openStream());

        // Build model of target def
        TargetDefinition target = buildTargetDefinition(doc);
        
        // For each repo: Read the plugins
        for (Location loc: target.getLocations()) {
            Repository repo = loc.getRepository();
            // fetch IUs from remote repo
            List<InstallableUnit> iusFromRepo = readRepositoryContent(new URL(repo.getLocation()));
            updateIUs(loc.getUnits(), iusFromRepo);
        }
        
        // TargetDefinition is updated, now synch into Document
        updateXML(doc, target);
        writeXML(doc, urlTarget);
    }
    
    /**
     * Read XML document and create a TargetDefinition out of it
     * @param doc The .target XML Document
     * @return
     */
    protected TargetDefinition buildTargetDefinition (Document doc) {
        Element root = doc.getRootElement();
        if (!root.getName().equals("target")) {
            throw new IllegalArgumentException("Invalid XML type. No root 'target' found");
        }
        LOG.info("Parsing target definition");
        TargetDefinition target = TargetDefFactory.eINSTANCE.createTargetDefinition();
        for (Object location: root.getChild("locations").getChildren("location")) {
            
            Location loc = TargetDefFactory.eINSTANCE.createLocation();
            target.getLocations().add(loc);
            for (Object unit: ((Element)location).getChildren("unit")) {
                Element unitElem = (Element) unit;
                InstallableUnit iu = TargetDefFactory.eINSTANCE.createInstallableUnit();
                iu.setId(unitElem.getAttributeValue("id"));
                iu.setVersion(unitElem.getAttributeValue("version"));
                loc.getUnits().add(iu);
            }
            Element repoElem = ((Element)location).getChild("repository");
            Repository repo = TargetDefFactory.eINSTANCE.createRepository();
            repo.setLocation(repoElem.getAttributeValue("location"));
            loc.setRepository(repo);
        }
        return target;
    }
    
    protected void updateXML (Document doc, TargetDefinition target) {
        LOG.info("Updating XML document");
        Element root = doc.getRootElement();
        if (!root.getName().equals("target")) {
            throw new IllegalArgumentException("Invalid XML type. No root 'target' found");
        }
        
        int i=0;
        for (Iterator<?> itElem=root.getChild("locations").getChildren("location").iterator(); itElem.hasNext() ; i++) {
            Element locElem = (Element) itElem.next();
            Location loc = target.getLocations().get(i);
            Iterator<InstallableUnit> itIU = loc.getUnits().iterator();
            for (Object unit: locElem.getChildren("unit")) {
                Element unitElem = (Element) unit;
                if (!itIU.hasNext()) throw new IllegalStateException(); 
                InstallableUnit iu = itIU.next();
                if (!iu.getId().equals(unitElem.getAttributeValue("id"))) {
                    throw new IllegalStateException ("IU mismatch: "+iu.getId()+"!="+unitElem.getAttributeValue("id"));
                };
                unitElem.setAttribute("version", iu.getVersion());
            }
        }
    }
    
    protected void writeXML (Document doc, URL url) {
        LOG.info("Writing XML document to "+url);
        XMLOutputter outputter = new XMLOutputter();
        Writer writer = null;
        try {
            writer = new FileWriter(url.getFile());
            outputter.output(doc, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * 
     * @param iusToUpdate The collection of installable units that are subject for update
     * @param iusFromRepo The installable units read from a repository
     */
    protected void updateIUs (List<InstallableUnit> iusToUpdate, List<InstallableUnit> iusFromRepo) {
        LOG.info("Updating IU versions");
        Multimap<String,Version> versionMap = buildVersionMap(iusFromRepo);
        for (InstallableUnit iu: iusToUpdate) {
            String newVersion = pickVersion(iu.getId(), versionMap);
            if (newVersion != null && !iu.getVersion().equals(newVersion)) {
                LOG.info("Found newer version for IU "+iu.getId()+". Updating from "+iu.getVersion()+" to "+newVersion);
                iu.setVersion(newVersion);
            }
        }
    }
    
    /**
     * Selects the most recent version
     * @param iuId Installable Unit Id
     * @param versionMap Map with the available versions for a IU
     * @return The IU
     */
    protected String pickVersion (String iuId, Multimap<String,Version> versionMap) {
        Version selectedVersion = null;
        for (Version v: versionMap.get(iuId)) {
            if (selectedVersion == null || v.compareTo(selectedVersion)>0) {
                selectedVersion = v;
            }
        }
        if (selectedVersion == null) {
            LOG.warn("No version for Installable Unit "+iuId+" picked.");
            return null;
        } else {
            return selectedVersion.toString();
        }
    }
    
    /**
     * Create a multimap with mapping from IU Id to list of Version
     * @param ius A collection of {@link InstallableUnit}
     * @return Key: IU Id, Value: Available versions from the given list
     */
    private Multimap<String,Version> buildVersionMap (Iterable<InstallableUnit> ius) {
        Multimap<String,Version> map = ArrayListMultimap.create();
        for (InstallableUnit iu: ius) {
            map.put(iu.getId(), Version.create(iu.getVersion()));
        }
        return map;
    }
    
    protected List<InstallableUnit> readRepositoryContent (URL repositoryURL) {
        LOG.info("Reading repository "+repositoryURL);
        
        List<InstallableUnit> ius = Lists.newArrayList();
        
        DirectorApplication director = new DirectorApplication();
        String[] args = new String[] {"-l", "-r", repositoryURL.toString()};
        PrintStream ps = System.out;
        try {
            // redirect stdout to bytearray
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(bos));
            
            // call director
            Object result = director.run(args);
            
            // read stdout output from bytearray
            BufferedReader br = new BufferedReader(new StringReader(bos.toString()));
            for (String line=br.readLine(); line!=null; line=br.readLine()) {
                LOG.debug("[DIRECTOR] "+line);
                InstallableUnit iu = fromString(line);
                if (iu != null) {
                    ius.add(iu);
                }
            }
            if (result instanceof Integer) {
                Integer rc = (Integer) result;
                if (rc != 0) {
                    LOG.warn("Director aborted with error. Ignoring repository "+repositoryURL);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.setOut(ps);
        }
        return ius;
    }
    
    protected InstallableUnit fromString (String line) {
        String [] splitted = line.split("=");
        if (splitted.length==2) {
            InstallableUnit iu = TargetDefFactory.eINSTANCE.createInstallableUnit();
            iu.setId(splitted[0]);
            try {
                Version.create(splitted[1]);
                iu.setVersion(splitted[1]);
            } catch (IllegalArgumentException e) {
                // line contains '=', but no valid version string, so this is no IU description
                return null;
            }
            return iu;
        }
        return null;
    }
}
