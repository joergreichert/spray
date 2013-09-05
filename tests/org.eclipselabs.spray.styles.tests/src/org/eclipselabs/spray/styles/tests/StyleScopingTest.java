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
package org.eclipselabs.spray.styles.tests;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.Offset;
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.XpectCommaSeparatedValues;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Pair;
import org.eclipselabs.spray.styles.scoping.StyleScopeProvider;
import org.eclipselabs.spray.styles.tests.util.StyleTestsInjectorProvider;
import org.junit.runner.RunWith;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import javax.inject.Inject;

@RunWith(ParameterizedXtextRunner.class)
@InjectWith(StyleTestsInjectorProvider.class)
@ResourceURIs(files={"model/scoping/a.style", "model/scoping/b.style"})
public class StyleScopingTest {

	@InjectParameter
	private Offset offset;
	
	@Inject
	private StyleScopeProvider styleScopeProvider;

	@ParameterSyntax("('at' offset=OFFSET)?")
	@XpectCommaSeparatedValues
	public Iterable<String> elementsInScope() {
		Pair<EObject, EStructuralFeature> pair = offset.getEStructuralFeatureByParent();
		
		IScope scope = styleScopeProvider.getScope(pair.getFirst(), (EReference) pair.getSecond());
		
		Function<IEObjectDescription, String> transformer = new Function<IEObjectDescription, String>() {
			
			public String apply(IEObjectDescription eoDesc) {
				return eoDesc.getName().toString();
			}
		};
		
		return Iterables.transform(scope.getAllElements(), transformer);
	}
	
}
