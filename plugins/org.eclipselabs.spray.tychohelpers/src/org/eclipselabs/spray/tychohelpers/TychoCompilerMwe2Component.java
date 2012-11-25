package org.eclipselabs.spray.tychohelpers;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class TychoCompilerMwe2Component implements IWorkflowComponent {

	@Override
	public void preInvoke() {
	}

	@Override
	public void invoke(IWorkflowContext ctx) {
		File srcgen = new File("src-gen");
		System.err.println(srcgen.getAbsolutePath());
		List<File> fileList = new ArrayList<File>();
		collectFiles(srcgen, fileList);

		if (fileList.size() > 0) {
			File[] javaFiles = new File[fileList.size()];
			fileList.toArray(javaFiles);

			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

			DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();
			StandardJavaFileManager fileManager = compiler
					.getStandardFileManager(diagnostics, null, null);

			Iterable<? extends JavaFileObject> compilationUnits = fileManager
					.getJavaFileObjectsFromFiles(Arrays.asList(javaFiles));

			List<String> optionList = new ArrayList<String>();
			optionList.addAll(Arrays.asList("-classpath",
					System.getProperty("java.class.path")));
			optionList.add("-d");
			File targetClasses = new File("target/classes");
			targetClasses.mkdirs();
			System.err.println(targetClasses.getAbsolutePath());
			optionList.add(targetClasses.getAbsolutePath());
			JavaCompiler.CompilationTask task = compiler.getTask(null,
					fileManager, diagnostics, optionList, null,
					compilationUnits);

			Boolean result = task.call();

			System.err.println("Compile result code = " + result);
		}
	}

	private void collectFiles(File dir, List<File> files) {
		for (File file : dir.listFiles()) {
			if (file.isDirectory()) {
				collectFiles(file, files);
			} else {
				if (file.getAbsolutePath().endsWith(".java")) {
					System.err.println(file.getAbsolutePath());
					files.add(file);
				}
			}
		}
	}

	@Override
	public void postInvoke() {
	}
}
