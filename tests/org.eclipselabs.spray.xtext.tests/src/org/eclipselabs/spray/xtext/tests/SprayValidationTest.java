package org.eclipselabs.spray.xtext.tests;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.Offset;
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.Xpect;
import org.eclipse.xtext.junit4.parameterized.XpectCommaSeparatedValues;
import org.eclipse.xtext.junit4.parameterized.XpectLines;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.ValidatorTester;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Pair;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.eclipselabs.spray.xtext.scoping.SprayScopeProvider;
import org.eclipselabs.spray.xtext.validation.SprayJavaValidator;
import org.junit.runner.RunWith;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Injector;

@RunWith(ParameterizedXtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
@ResourceURIs(baseDir="model/testcases/validation", fileExtensions={"spray","shape"})
public class SprayValidationTest {

	@Inject
	private Injector injector;

	@InjectParameter
	private Offset offset;
	
	@Inject
	private SprayJavaValidator sprayJavaValidator;
	
	@Inject
	private SprayScopeProvider scopeProvider;
	
	private ValidatorTester<SprayJavaValidator> validatorTester = null;

	private ValidatorTester<SprayJavaValidator> getValidatorTester() {
		if(validatorTester == null) {
			validatorTester = new ValidatorTester<SprayJavaValidator>(sprayJavaValidator, injector);
		}
		return validatorTester;
	}
	
	@ParameterSyntax("('at' offset=OFFSET)")
	@XpectLines
	public Iterable<String> validationIssues() throws Exception {
		 AssertableDiagnostics diagnostic = getValidatorTester().validate(offset.getEObject());
		 Function<Diagnostic, String> transform = new Function<Diagnostic, String>() {
			
			 public String apply(Diagnostic diagnostic) {
				 return format(diagnostic.getSeverity(), diagnostic.getMessage());
			 }
		 };
		 return Iterables.transform(diagnostic.getAllDiagnostics(), transform);
	}
	
	/**
	 * @see http://de.slideshare.net/meysholdt/testdriven-development-of-xtext-dsls?nomobile=true
	 */
    @ParameterSyntax("('at' offset=OFFSET)")
    @XpectCommaSeparatedValues
    public Iterable<String> elementsInScope() throws Exception {
        Pair<EObject, EStructuralFeature> pair = offset.getEStructuralFeatureByParent();
        
        IScope scope = scopeProvider.getScope(pair.getFirst(), (EReference) pair.getSecond());
        
        List<String> actualList = Lists.newArrayList();
        for (IEObjectDescription desc: scope.getAllElements()) {
            actualList.add(desc.getName().toString());
        }
        return actualList;
    }
	
	private String format(int severity, String message) {
		String severityStr = "";
		switch (severity) {
		case Diagnostic.WARNING: severityStr = "warning"; break;
		case Diagnostic.ERROR: severityStr = "error"; break;
		case Diagnostic.INFO: severityStr = "info"; break;
		default: severityStr = "<unknown>"; break;
		}
		return severityStr + " \"" + message + "\"";
	}

	@ParameterSyntax("('at' offset=OFFSET)")
	@Xpect
	public void noValidationIssues() {
		getValidatorTester().validate(offset.getEObject()).assertDiagnosticsCount(0);
	}
}