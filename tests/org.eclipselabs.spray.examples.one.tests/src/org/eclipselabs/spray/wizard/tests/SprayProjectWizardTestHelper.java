package org.eclipselabs.spray.wizard.tests;

import junit.framework.Assert;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.matchers.WidgetOfType;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.ui.dialogs.FilteredList;

public class SprayProjectWizardTestHelper extends ProjectWizardTestHelper {

	public SprayProjectWizardTestHelper(SWTBot bot) {
		super(bot);
	}

	public void handleProjectName(
			SprayProjectWizardConfiguration wizardConfiguration) {
		setText(0, wizardConfiguration.firstPage().projectName(),
				"Expected default project name", wizardConfiguration
						.firstPage().defaultProjectName());
	}

	public void handleLocation(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isUseDefaultLocation()) {
			getBot().checkBox(0).select();
			Assert.assertFalse("Location field should not be enabled", getBot()
					.text(1).isEnabled());
			String projectName = wizardConfiguration.firstPage().projectName();
			Assert.assertTrue("Expected location ending",
					getBot().text(1).getText() != null
							&& getBot().text(1).getText().endsWith((projectName)));
		} else {
			getBot().checkBox(0).deselect();
			Assert.assertTrue("Location field should be enabled", getBot().text(1)
					.isEnabled());
			setText(1, wizardConfiguration.firstPage().location());
		}
	}

	public void handleDiagramType(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isDiagramTypeNameFromProjectName()) {
			getBot().checkBox(1).select();
			Assert.assertFalse("Diagram type field should not be enabled", getBot()
					.text(2).isEnabled());
			Assert.assertEquals("Expected diagram type", wizardConfiguration
					.firstPage().diagramTypeName(), getBot().text(2).getText());
		} else {
			getBot().checkBox(1).deselect();
			Assert.assertTrue("Diagram type field should be enabled",
					getBot().text(2).isEnabled());
			setText(2, wizardConfiguration.firstPage().diagramTypeName());
		}
	}

	public void handleEPackage(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isBrowseRegisteredEPackages()
				|| wizardConfiguration.firstPage()
						.isBrowseWorkspaceForEPackages()) {
			SWTBotShell outerShell = getBot().activeShell();
			String messageEpackage = "";
			String messageGenModel = "";
			if (wizardConfiguration.firstPage().isBrowseRegisteredEPackages()) {
				getBot().button(1).click();
				messageEpackage = "Expected EPackage URI after chosen by registered EPackages";
				messageGenModel = "Expected GenModel URI after chosen by registered EPackages";
				SWTBotShell shell = getBot().activeShell();
				SWTBotText text = getBot().text();
				text.setText(wizardConfiguration.firstPage()
						.ePackageUriToBrowseInRegisteredEPackages());
				final FilteredList list = getBot().widget(WidgetOfType
						.widgetOfType(FilteredList.class));
				Display.getDefault().syncExec(new Runnable() {

					@Override
					public void run() {
						list.setSelection(new int[] { 0 });
					}
				});
				getBot().button("OK").click();
				getBot().waitUntil(Conditions.shellCloses(shell));
			} else if (wizardConfiguration.firstPage()
					.isBrowseWorkspaceForEPackages()) {
				getBot().button(2).click();
				SWTBotShell shell = getBot().activeShell();
				messageEpackage = "Expected EPackage URI after chosen by workspace";
				messageGenModel = "Expected GenModel URI after chosen by workspace";
				getBot().tree()
						.expandNode(
								wizardConfiguration
										.firstPage()
										.ePackageUriSegmentsToBrowseInWorkspace())
						.select();
				getBot().button("OK").click();
				getBot().waitUntil(Conditions.shellCloses(shell));
			}
			getBot().waitUntil(Conditions.shellIsActive(outerShell.getText()));
			setBot(outerShell.bot());
			handleBinCase(wizardConfiguration);
			if(wizardConfiguration
					.firstPage().modelUri() != null) {
				Assert.assertEquals(messageEpackage, wizardConfiguration
						.firstPage().modelUri(), getBot().text(3).getText());
			} else {
				Assert.assertEquals(messageEpackage, wizardConfiguration
						.firstPage().ePackageUri(), getBot().text(3).getText());
			}
			Assert.assertEquals(messageGenModel, wizardConfiguration
					.firstPage().genModelUri(), getBot().text(4).getText());
		} else if (wizardConfiguration.firstPage().isSetEPackage()) {
			setText(3, wizardConfiguration.firstPage().ePackageUri());
		}
	}

	public void handleGenModel(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isBrowseWorkspaceForGenModels()) {
			getBot().button(3).click();
			getBot().tree()
					.expandNode(
							wizardConfiguration.firstPage()
									.genModelUriSegmentsToBrowseInWorkspace())
					.select();
			getBot().button("OK").click();
			Assert.assertEquals(
					"Expected GenModel URI after chosen by workspace GenModel",
					wizardConfiguration.firstPage().genModelUri(), getBot().text(4)
							.getText());
		} else if (wizardConfiguration.firstPage().isSetGenModel()) {
			String genModelUriToSet = wizardConfiguration.firstPage()
					.genModelUri();
			if (genModelUriToSet != null) {
				setText(4, wizardConfiguration.firstPage().genModelUri());
			} else {
				Assert.assertEquals(
						"Expected GenModel URI after doing nothing",
						wizardConfiguration.firstPage().genModelUri(), getBot()
								.text(4).getText());
			}
		}
	}

	public void handleModelRoot(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isSelectType()) {
			SWTBotShell outerShell = getBot().activeShell();
			getBot().button(4).click();
			SWTBotShell shell = getBot().activeShell();
			setBot(getBot().activeShell().bot());
			SWTBotText text = getBot().text();
			text.setText(wizardConfiguration.firstPage().modelEClassToSelect());
			final FilteredList list = getBot().widget(WidgetOfType
					.widgetOfType(FilteredList.class));
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					list.setSelection(new int[] { 0 });
				}
			});
			getBot().button("OK").click();
			getBot().waitUntil(Conditions.shellCloses(shell));
			getBot().waitUntil(Conditions.shellIsActive(outerShell.getText()));
			setBot(getBot().activeShell().bot());
			Assert.assertEquals("Expected model root after chosen by type",
					wizardConfiguration.firstPage().modelEClass(), getBot().text(5)
							.getText());
		} else {
			setText(5, wizardConfiguration.firstPage().modelEClass());
		}
	}

	public void handleFileExtension(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isSetFileExtension()) {
			setText(6, wizardConfiguration.firstPage().fileExtension());
		} else {
			Assert.assertEquals("Expected file extension", wizardConfiguration
					.firstPage().fileExtension(), getBot().text(6).getText());
		}
	}

	public void handleProjectStructure(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.secondPage().isUseProjectDefaultStructure()) {
			getBot().checkBox(0).select();
			Assert.assertEquals("Expected model folder", wizardConfiguration
					.secondPage().defaultModelFolder(), getBot().text(0).getText());
			Assert.assertEquals("Expected src folder", wizardConfiguration
					.secondPage().defaultSrcFolder(), getBot().text(1).getText());
			Assert.assertEquals("Expected src-gen folder", wizardConfiguration
					.secondPage().defaultSrcGenFolder(), getBot().text(2).getText());
			Assert.assertEquals("Expected resource folder", wizardConfiguration
					.secondPage().defaultResourceFolder(), getBot().text(3)
					.getText());
			Assert.assertEquals(
					"Expected resource-gen folder",
					wizardConfiguration.secondPage().defaultResourceGenFolder(),
					getBot().text(4).getText());
		} else {
			getBot().checkBox(0).deselect();
			setText(0, wizardConfiguration.secondPage().modelFolder(),
					"Expected default model folder", wizardConfiguration
							.secondPage().defaultModelFolder());
			setText(1, wizardConfiguration.secondPage().srcFolder(),
					"Expected default src folder", wizardConfiguration
							.secondPage().defaultSrcFolder());
			setText(2, wizardConfiguration.secondPage().srcGenFolder(),
					"Expected default src gen folder", wizardConfiguration
							.secondPage().defaultSrcGenFolder());
			setText(3, wizardConfiguration.secondPage().resourceFolder(),
					"Expected default resource folder", wizardConfiguration
							.secondPage().defaultResourceFolder());
			setText(4, wizardConfiguration.secondPage().resourceGenFolder(),
					"Expected default resource gen folder", wizardConfiguration
							.secondPage().defaultResourceGenFolder());
		}
	}

	public void handlePackageNames(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.secondPage().isUseDefaultNaming()) {
			getBot().checkBox(1).select();
			Assert.assertEquals("Expected base package", wizardConfiguration
					.secondPage().defaultBasePackage(), getBot().text(5).getText());
			Assert.assertEquals("Expected diagram package", wizardConfiguration
					.secondPage().defaultDiagramPackage(), getBot().text(6)
					.getText());
			Assert.assertEquals("Expected feature package", wizardConfiguration
					.secondPage().defaultFeaturePackage(), getBot().text(7)
					.getText());
			Assert.assertEquals("Expected property package",
					wizardConfiguration.secondPage().defaultPropertyPackage(),
					getBot().text(8).getText());
		} else {
			getBot().checkBox(1).deselect();
			setText(5, wizardConfiguration.secondPage().basePackage(),
					"Expected default base package", wizardConfiguration
							.secondPage().defaultBasePackage());
			setText(6, wizardConfiguration.secondPage().diagramPackage(),
					"Expected default diagram package", wizardConfiguration
							.secondPage().defaultDiagramPackage());
			setText(7, wizardConfiguration.secondPage().featurePackage(),
					"Expected default feature package", wizardConfiguration
							.secondPage().defaultFeaturePackage());
			setText(8, wizardConfiguration.secondPage().propertyPackage(),
					"Expected default property package", wizardConfiguration
							.secondPage().defaultPropertyPackage());
		}
	}

	public void handleTimestamp(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.secondPage().isGenerateTimestamp()) {
			getBot().checkBox(2).select();
		} else {
			getBot().checkBox(2).deselect();
		}
	}

	private void handleBinCase(
			SprayProjectWizardConfiguration wizardConfiguration) {
		SWTBotText ePackageText = getBot().text(3);
		String ePackageStr = ePackageText.getText();
		ePackageStr = replaceBin(ePackageText);
		getBot().text(3).setText(ePackageStr);
		if(ePackageStr.endsWith(".ecore")) {
			wizardConfiguration.firstPage().setModelUri(ePackageStr);
		}
		SWTBotText genModelText = getBot().text(4);
		String genModelStr = replaceBin(genModelText);
		getBot().text(4).setText(genModelStr);
	}

	private String replaceBin(SWTBotText text) {
		String string = text.getText();
		if(string != null && string.contains("/bin/")) {
			string = string.replaceAll("/bin/", "/src-gen/");
		}
		return string;
	}
}
