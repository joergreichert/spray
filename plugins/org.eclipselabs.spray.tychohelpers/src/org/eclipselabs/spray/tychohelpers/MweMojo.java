package org.eclipselabs.spray.tychohelpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;
import org.eclipse.tycho.classpath.ClasspathEntry;
import org.eclipse.tycho.core.BundleProject;
import org.eclipse.tycho.core.TychoProject;

/**
 * Invoke MWE generation
 * see http://software.2206966.n2.nabble.com/Accessing-the-classpath-td4758543.html
 * 
 * @goal run-workflow
 */
public class MweMojo extends AbstractMojo {

	/**
	 * @parameter expression="${project}"
	 */
	private MavenProject project;

	/**
	 * @component role="org.codehaus.tycho.TychoProject"
	 */
	private Map<String, TychoProject> projectTypes;

	/**
	 * Location of the workflow file.
	 * 
	 * @parameter expression="${workflowFile}"
	 * @required
	 */
	private String workflowFile;

	/**
	 * The base working directory where the MWE generation should be run from.
	 * 
	 * @parameter default-value="${project.basedir}"
	 */
	private File workingDirectory;

	/**
	 * Names of artifacts containing genmodel dependencies. These will be
	 * exposed to the workflow runner as parameters of the form: -p
	 * artifact.name=file:/path/to/artifact.jar
	 * 
	 * @parameter
	 */
	private List<String> genmodelDependencies;

	private Map<String, List<File>> genmodelArtifacts = new HashMap<String, List<File>>();

	public void execute() throws MojoExecutionException {
		List<String> command = new ArrayList<String>();
		command.add(System.getProperty("java.home") + File.separator + "bin"
				+ File.separator + "java");

		TychoProject projectType = projectTypes.get(project.getPackaging());
		if (!(projectType instanceof BundleProject)) {
			throw new MojoExecutionException("Not a bundle project "
					+ project.toString());
		}

		File srcDir = new File(project.getBasedir(), "src");

		StringBuilder classpathBuilder = new StringBuilder(
				srcDir.getAbsolutePath());
		for (ClasspathEntry classpathEntry : ((BundleProject) projectType)
				.getClasspath(project)) {
			String artifactId = classpathEntry.getArtifactKey().getId();
			List<File> classpathLocations = classpathEntry.getLocations();

			if (genmodelDependencies != null
					&& genmodelDependencies.contains(artifactId)) {
				genmodelArtifacts.put(artifactId, classpathLocations);
			}

			for (File location : classpathLocations) {
				classpathBuilder.append(File.pathSeparator);
				classpathBuilder.append(location.getAbsolutePath());
			}
		}
		command.add("-classpath");
		command.add(classpathBuilder.toString());

		command.add("org.eclipse.emf.mwe.core.WorkflowRunner");

		command.add(workflowFile);

		if (genmodelArtifacts.size() > 0) {
			for (String key : genmodelArtifacts.keySet()) {
				List<File> locations = genmodelArtifacts.get(key);
				try {
					command.add("-p");
					command.add(key + "=" + locations.get(0).toURI().toURL());
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		}

		ProcessBuilder processBuilder = new ProcessBuilder(command);
		processBuilder.directory(workingDirectory);
		processBuilder.redirectErrorStream(true);
		try {
			StringBuilder commandStringBuilder = new StringBuilder();
			for (String commandElement : command) {
				commandStringBuilder.append(" ");
				commandStringBuilder.append(commandElement);
			}
			getLog().info("invoking:" + commandStringBuilder.toString());
			Process process = processBuilder.start();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					process.getInputStream()));
			String line;
			while ((line = reader.readLine()) != null) {
				getLog().info(line);
			}

			int exitValue = process.waitFor();
			getLog().info(
					"WorkflowRunner completed with exit value " + exitValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}