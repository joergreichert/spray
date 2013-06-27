package org.eclipselabs.spray.shapes.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.parameterized.InjectParameter;
import org.eclipse.xtext.junit4.parameterized.Offset;
import org.eclipse.xtext.junit4.parameterized.ParameterSyntax;
import org.eclipse.xtext.junit4.parameterized.ParameterizedXtextRunner;
import org.eclipse.xtext.junit4.parameterized.ResourceURIs;
import org.eclipse.xtext.junit4.parameterized.Xpect;
import org.eclipse.xtext.junit4.parameterized.XpectLines;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.junit4.validation.ValidatorTester;
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider;
import org.eclipselabs.spray.shapes.validation.ShapeJavaValidator;
import org.junit.runner.RunWith;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import javax.inject.Inject;
import com.google.inject.Injector;

@RunWith(ParameterizedXtextRunner.class)
@ResourceURIs(baseDir = "model/testcases/validation", fileExtensions = "shape")
@InjectWith(ShapeTestsInjectorProvider.class)
public class ShapeValidationTest {

	@Inject
	private Injector injector;

	@InjectParameter
	private Offset offset;
	
	@Inject
	private ShapeJavaValidator shapeJavaValidator;
	
	private ValidatorTester<ShapeJavaValidator> validatorTester = null;

	private ValidatorTester<ShapeJavaValidator> getValidatorTester() {
		if(validatorTester == null) {
			validatorTester = new ValidatorTester<ShapeJavaValidator>(shapeJavaValidator, injector);
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