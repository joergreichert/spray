package org.eclipselabs.spray.examples.one.tests;

import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipselabs.spray.wizard.tests.SprayProjectWizardConfiguration;
import org.eclipselabs.spray.wizard.tests.SprayProjectWizardTestHelper;

public abstract class AbstractWizardTest extends AbstractGraphitiTest {
	
	protected SprayProjectWizardConfiguration defaultSprayConfiguration() {
		return SprayProjectWizardConfiguration
				.init()
				.firstPage()
					.projectName(getProjectName())
					.diagramTypeName(getExpectedDiagramTypeName())
					.browseRegisteredEPackages(true)
					.setGenModel(false)
					.ePackageUriToBrowseInRegisteredEPackages(
						"http://www.mod4j.org/busmod")
					.ePackageUri(
						"platform:/plugin/org.mod4j.dsl.businessdomain.mm/model/BusinessDomainDsl.ecore")
					.genModelUri(
						"platform:/plugin/org.mod4j.dsl.businessdomain.mm/model/BusinessDomainDsl.genmodel")
					.selectType(true)
					.modelEClassToSelect("BusinessDomainModel")
					.modelEClass("BusinessDomainDsl.BusinessDomainModel")
					.setFileExtension(false)
					.fileExtension("businessdomaindsl")
					.wizardConfiguration()
				.secondPage()
					.defaultBasePackage(
						"org.eclipselabs.spray.examples.simpleuitest")
				.wizardConfiguration();
	}

	protected abstract String getExpectedDiagramTypeName();

	@Override
	protected void executeSprayWizard(SWTBotShell shell,
			SprayProjectWizardConfiguration wizardConfiguration) {
		SprayProjectWizardTestHelper wizardTestHelper = new SprayProjectWizardTestHelper(
				bot);
		wizardTestHelper.handleProjectName(wizardConfiguration);
		wizardTestHelper.handleLocation(wizardConfiguration);
		wizardTestHelper.handleDiagramType(wizardConfiguration);
		wizardTestHelper.handleEPackage(wizardConfiguration);
		wizardTestHelper.handleGenModel(wizardConfiguration);
		wizardTestHelper.handleModelRoot(wizardConfiguration);
		wizardTestHelper.handleFileExtension(wizardConfiguration);
		bot.button("Next >").click();
		wizardTestHelper.handleProjectStructure(wizardConfiguration);
		wizardTestHelper.handlePackageNames(wizardConfiguration);
		wizardTestHelper.handleTimestamp(wizardConfiguration);
	}
}
