package org.eclipselabs.spray.wizard.tests;

import junit.framework.Assert;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.matchers.WidgetOfType;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotText;
import org.eclipse.ui.dialogs.FilteredList;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class SprayProjectWizardTestHelper {
	private SWTBot bot;

	public SprayProjectWizardTestHelper(SWTBot bot) {
		this.bot = bot;
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
			bot.checkBox(0).select();
			Assert.assertFalse("Location field should not be enabled", bot
					.text(1).isEnabled());
			String projectName = wizardConfiguration.firstPage().projectName();
			Assert.assertTrue("Expected location ending",
					bot.text(1).getText() != null
							&& bot.text(1).getText().endsWith((projectName)));
		} else {
			bot.checkBox(0).deselect();
			Assert.assertTrue("Location field should be enabled", bot.text(1)
					.isEnabled());
			setText(1, wizardConfiguration.firstPage().location());
		}
	}

	public void handleDiagramType(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isDiagramTypeNameFromProjectName()) {
			bot.checkBox(1).select();
			Assert.assertFalse("Diagram type field should not be enabled", bot
					.text(2).isEnabled());
			Assert.assertEquals("Expected diagram type", wizardConfiguration
					.firstPage().diagramTypeName(), bot.text(2).getText());
		} else {
			bot.checkBox(1).deselect();
			Assert.assertTrue("Diagram type field should be enabled",
					bot.text(2).isEnabled());
			setText(2, wizardConfiguration.firstPage().diagramTypeName());
		}
	}

	public void handleEPackage(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isBrowseRegisteredEPackages()
				|| wizardConfiguration.firstPage()
						.isBrowseWorkspaceForEPackages()) {
			SWTBotShell outerShell = bot.activeShell();
			String messageEpackage = "";
			String messageGenModel = "";
			if (wizardConfiguration.firstPage().isBrowseRegisteredEPackages()) {
				bot.button(1).click();
				messageEpackage = "Expected EPackage URI after chosen by registered EPackages";
				messageGenModel = "Expected GenModel URI after chosen by registered EPackages";
				SWTBotShell shell = bot.activeShell();
				SWTBotText text = bot.text();
				text.setText(wizardConfiguration.firstPage()
						.ePackageUriToBrowseInRegisteredEPackages());
				final FilteredList list = bot.widget(WidgetOfType
						.widgetOfType(FilteredList.class));
				Display.getDefault().syncExec(new Runnable() {

					@Override
					public void run() {
						list.setSelection(new int[] { 0 });
					}
				});
				bot.button("OK").click();
				bot.waitUntil(Conditions.shellCloses(shell));
			} else if (wizardConfiguration.firstPage()
					.isBrowseWorkspaceForEPackages()) {
				bot.button(2).click();
				SWTBotShell shell = bot.activeShell();
				messageEpackage = "Expected EPackage URI after chosen by workspace";
				messageGenModel = "Expected GenModel URI after chosen by workspace";
				bot.tree()
						.expandNode(
								wizardConfiguration
										.firstPage()
										.ePackageUriSegmentsToBrowseInWorkspace())
						.select();
				bot.button("OK").click();
				bot.waitUntil(Conditions.shellCloses(shell));
			}
			bot.waitUntil(Conditions.shellIsActive(outerShell.getText()));
			bot = outerShell.bot();
			Assert.assertEquals(messageEpackage, wizardConfiguration
					.firstPage().ePackageUri(), bot.text(3).getText());
			Assert.assertEquals(messageGenModel, wizardConfiguration
					.firstPage().genModelUri(), bot.text(4).getText());
		} else if (wizardConfiguration.firstPage().isSetEPackage()) {
			setText(3, wizardConfiguration.firstPage().ePackageUri());
		}
	}

	public void handleGenModel(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isBrowseWorkspaceForGenModels()) {
			bot.button(3).click();
			bot.tree()
					.expandNode(
							wizardConfiguration.firstPage()
									.genModelUriSegmentsToBrowseInWorkspace())
					.select();
			bot.button("OK").click();
			Assert.assertEquals(
					"Expected GenModel URI after chosen by workspace GenModel",
					wizardConfiguration.firstPage().genModelUri(), bot.text(4)
							.getText());
		} else if (wizardConfiguration.firstPage().isSetGenModel()) {
			String genModelUriToSet = wizardConfiguration.firstPage()
					.genModelUri();
			if (genModelUriToSet != null) {
				setText(4, wizardConfiguration.firstPage().genModelUri());
			} else {
				Assert.assertEquals(
						"Expected GenModel URI after doing nothing",
						wizardConfiguration.firstPage().genModelUri(), bot
								.text(4).getText());
			}
		}
	}

	public void handleModelRoot(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.firstPage().isSelectType()) {
			SWTBotShell outerShell = bot.activeShell();
			bot.button(4).click();
			SWTBotShell shell = bot.activeShell();
			bot = bot.activeShell().bot();
			SWTBotText text = bot.text();
			text.setText(wizardConfiguration.firstPage().modelEClassToSelect());
			final FilteredList list = bot.widget(WidgetOfType
					.widgetOfType(FilteredList.class));
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					list.setSelection(new int[] { 0 });
				}
			});
			bot.button("OK").click();
			bot.waitUntil(Conditions.shellCloses(shell));
			bot.waitUntil(Conditions.shellIsActive(outerShell.getText()));
			bot = bot.activeShell().bot();
			Assert.assertEquals("Expected model root after chosen by type",
					wizardConfiguration.firstPage().modelEClass(), bot.text(5)
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
					.firstPage().fileExtension(), bot.text(6).getText());
		}
	}

	private void setText(int pos, String text, String... defaultText) {
		if (text != null) {
			bot.text(pos).setText(text);
		} else if (defaultText.length == 2) {
			Assert.assertEquals(defaultText[0], defaultText[1], bot.text(pos)
					.getText());
		}
	}

	public void handleProjectStructure(
			SprayProjectWizardConfiguration wizardConfiguration) {
		if (wizardConfiguration.secondPage().isUseProjectDefaultStructure()) {
			bot.checkBox(0).select();
			Assert.assertEquals("Expected model folder", wizardConfiguration
					.secondPage().defaultModelFolder(), bot.text(0).getText());
			Assert.assertEquals("Expected src folder", wizardConfiguration
					.secondPage().defaultSrcFolder(), bot.text(1).getText());
			Assert.assertEquals("Expected src-gen folder", wizardConfiguration
					.secondPage().defaultSrcGenFolder(), bot.text(2).getText());
			Assert.assertEquals("Expected resource folder", wizardConfiguration
					.secondPage().defaultResourceFolder(), bot.text(3)
					.getText());
			Assert.assertEquals(
					"Expected resource-gen folder",
					wizardConfiguration.secondPage().defaultResourceGenFolder(),
					bot.text(4).getText());
		} else {
			bot.checkBox(0).deselect();
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
			bot.checkBox(1).select();
			Assert.assertEquals("Expected base package", wizardConfiguration
					.secondPage().defaultBasePackage(), bot.text(5).getText());
			Assert.assertEquals("Expected diagram package", wizardConfiguration
					.secondPage().defaultDiagramPackage(), bot.text(6)
					.getText());
			Assert.assertEquals("Expected feature package", wizardConfiguration
					.secondPage().defaultFeaturePackage(), bot.text(7)
					.getText());
			Assert.assertEquals("Expected property package",
					wizardConfiguration.secondPage().defaultPropertyPackage(),
					bot.text(8).getText());
		} else {
			bot.checkBox(1).deselect();
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
			bot.checkBox(2).select();
		} else {
			bot.checkBox(2).deselect();
		}
	}
}
