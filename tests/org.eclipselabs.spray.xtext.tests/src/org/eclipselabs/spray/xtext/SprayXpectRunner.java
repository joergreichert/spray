package org.eclipselabs.spray.xtext;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.junit.runners.model.InitializationError;
import org.xpect.runner.XpectFileRunner;
import org.xpect.runner.XpectRunner;

import com.google.common.collect.Lists;

public class SprayXpectRunner extends XpectRunner {

	public SprayXpectRunner(Class<?> testClass) throws InitializationError {
		super(testClass);
	}

	protected List<XpectFileRunner> createChildren(Class<?> clazz) {
		List<XpectFileRunner> result = Lists.newArrayList();
		for (URI uri : getFiles()) {
			if(!uri.toString().endsWith(".ecore") && !uri.toString().endsWith(".genmodel")) {
				result.add(createChild(clazz, uri));
			}
		}
		return result;
	}
}
