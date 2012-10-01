package org.eclipselabs.spray.wizard.tests;

public class SprayProjectWizardConfiguration {
	private SprayProjectWizardFirstPage firstPage;
	private SprayProjectWizardSecondPage secondPage;

	private SprayProjectWizardConfiguration() {
		firstPage = SprayProjectWizardFirstPage.init(this);
		secondPage = SprayProjectWizardSecondPage.init(this);
	}

	public static SprayProjectWizardConfiguration init() {
		return new SprayProjectWizardConfiguration();
	}

	public SprayProjectWizardFirstPage firstPage() {
		return firstPage;
	}

	public SprayProjectWizardSecondPage secondPage() {
		return secondPage;
	}
}
