package org.eclipselabs.spray.generator.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.mwe.PathTraverser;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Injector;

/**
 * A reader that allows to parse Xcore files and use the contained EPackages.
 * 
 * @author Christan Dietrich <christian.dietrich@itemis.de> - Initial contribution and API
 */
// TODO is to be back-ported to Xtext or Xcore
public class XcoreReader extends AbstractWorkflowComponent2 {
	private static final String XCORE_FILE_EXT = "xcore";

	private static final Logger logger = Logger.getLogger(XcoreReader.class);

	private final List<String> pathes = Lists.newArrayList();

	/**
	 * <p>
	 * A path pointing to a folder, jar or zip which contains Xcore resources.
	 * </p>
	 * <p>
	 * Example use:
	 * </p>
	 * <code>
	 * &lt;path value="./foo/bar.jar"/&gt;
	 * </code>
	 */
	public void addPath(String path) {
		this.pathes.add(path);
	}

	/**
	 * @return all configured pathes.
	 */
	public List<String> getPathes() {
		return pathes;
	}

	private String slot;

	/**
	 * @return the name of the slot that is used to store the parsed Xcore packages.
	 */
	public String getSlot() {
		return slot;
	}

	/**
	 * @param slot
	 *            the name that will be used to associate the parsed Xcore package
	 */
	public void setSlot(String slot) {
		this.slot = slot;
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		ResourceSet resourceSet = getResourceSet();
		Multimap<String, URI> uris = getPathTraverser().resolvePathes(pathes,
				new Predicate<URI>() {
					@Override
					public boolean apply(URI input) {
						return input.fileExtension().equals(XCORE_FILE_EXT);
					}
				});
		int counter = 0;
		List<Resource> resources = new ArrayList<Resource>();
		for (URI uri : uris.values()) {
			String path = uri.toFileString();
			Resource r;
			logger.info(path);
			try {
				r = parse(new FileInputStream(path),
						URI.createURI(counter + "." + XCORE_FILE_EXT), null, resourceSet);
				resources.add(r);
				counter++;
			} catch (FileNotFoundException e) {
				issues.addError("Encounter problem while reading", e);
				e.printStackTrace();
			}
		}
		EcoreUtil.resolveAll(resourceSet);
		for (Resource r : resources) {
			for (Diagnostic x : r.getErrors()) {
				issues.addError(x.getMessage(), x);
			}

		}
		ctx.set(slot, resources);
	}

	private Resource parse(InputStream in, URI uriToUse, Map<?, ?> options,
			ResourceSet resourceSet) {

		Resource resource = resourceSet.createResource(uriToUse);
		resourceSet.getResources().add(resource);
		try {
			resource.load(in, options);
			return resource;
		} catch (IOException e) {
			throw new WrappedException(e);
		}
	}

	private PathTraverser getPathTraverser() {
		return new PathTraverser();
	}

	private ResourceSet getResourceSet() {
		if (!injectors.isEmpty()) {
			ResourceSet instance = injectors.get(0).getInstance(
					ResourceSet.class);
			return instance;
		}
		return new ResourceSetImpl();
	}

	private final List<Injector> injectors = Lists.newArrayList();

	/**
	 * Registers a language initializer.
	 */
	public void addRegister(ISetup setup) {
		injectors.add(setup.createInjectorAndDoEMFRegistration());
	}

}
