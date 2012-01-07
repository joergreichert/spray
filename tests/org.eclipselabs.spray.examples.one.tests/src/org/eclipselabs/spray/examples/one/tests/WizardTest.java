package org.eclipselabs.spray.examples.one.tests;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.keyboard.Keystrokes;
import org.eclipse.swtbot.swt.finder.waits.DefaultCondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipselabs.spray.wizard.tests.ProjectWizardTestHelper;
import org.eclipselabs.spray.wizard.tests.SprayProjectWizardConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class WizardTest extends AbstractWizardTest {
	private final String packageName = "org.eclipselabs.spray.examples";
	private final String diagramProjectName = packageName + ".Statechart";
	private final String expectedDiagramTypeName = "Statechart";
	private final String xtextProjectName = packageName + ".statemachine";
	private final String languageName = "Statemachine";
	private final String languageFileExtension = "states";
	private final String uri = "http://www.eclipselabs.com/spray/examples/" + languageName; 

	@Before
	public void setUp() throws Exception {
		super.setUp();
		final String perspective = "Java";
		bot.perspectiveByLabel(perspective).activate();
	}

	@Override
	protected String getProjectName() {
		return diagramProjectName;
	}

	@Override
	protected String getExpectedDiagramTypeName() {
		return expectedDiagramTypeName;
	}

	@Test
	public void testCreateNewGraphitiProject__WhenMetamodelFromDevelopmentWorkspaceAndDefaultConfiguration()
			throws Exception {
		SprayProjectWizardConfiguration wizardConfiguration = defaultSprayConfiguration();
		createNewSprayProject(wizardConfiguration);
	}

	@Test
	public void testCreateNewGraphitiProject__WhenMetamodelFromRuntimeWorkspaceAndDefaultConfiguration()
			throws Exception {
		createXtextProject(xtextProjectName, packageName + "." + languageName,
				languageFileExtension);
		setXtextGrammar(packageName, xtextProjectName, languageName,
				getStatemachineGrammar());
		generateXtextArtifacts(packageName, xtextProjectName, languageName);
		String modelRoot = "Statemachine";
		SprayProjectWizardConfiguration wizardConfiguration = SprayProjectWizardConfiguration
				.init()
				.firstPage()
				.projectName(getProjectName())
				.diagramTypeName(getExpectedDiagramTypeName())
				.browseRegisteredEPackages(true)
				.setGenModel(false)
				.ePackageUriToBrowseInRegisteredEPackages(
						uri)
				.ePackageUri("platform:/resource/" + xtextProjectName)
				.genModelUri(
						"platform:/resource/" + xtextProjectName + "/src-gen/"
								+ packageName.replaceAll("\\.", "/") + "/"
								+ languageName + ".genmodel")
				.selectType(true)
				.modelEClassToSelect(modelRoot)
				.modelEClass(packageName + "." + toFirstLower(modelRoot) + "." + modelRoot)
				.setFileExtension(true)
				.fileExtension(languageFileExtension)
				.wizardConfiguration()
				.secondPage()
				.defaultBasePackage(
						packageName + ".statechart")
				.wizardConfiguration();

		createNewSprayProject(wizardConfiguration);
		System.out.println();
	}

	private void createXtextProject(String projectName, String language,
			String extension) {
		startCreateNewProject("Xtext", "Xtext Project");
		ProjectWizardTestHelper projectWizardHelper = new ProjectWizardTestHelper(
				bot);
		projectWizardHelper.setText(0, projectName);
		projectWizardHelper.setText(2, language);
		projectWizardHelper.setText(3, extension);
		finishWizard(bot.activeShell());
	}

	private SWTBotShell activeShell = null;

	private void setXtextGrammar(String packageName, String xtextProjectName,
			String languageName, String grammar) {
		selectFolderNode(xtextProjectName, "src", packageName,
				languageName + ".xtext").doubleClick();
		final SWTBotShell workbenchShell = bot.activeShell();
		SWTBotEclipseEditor textEditor = bot.activeEditor().toTextEditor();
		textEditor.selectRange(0, 0, textEditor.getText().length());
		textEditor.pressShortcut(Keystrokes.DELETE);
		textEditor.setText(grammar);
		textEditor.saveAndClose();
		bot.waitUntil(new DefaultCondition() {
			
			@Override
			public boolean test() throws Exception {
				boolean shellChanged = bot.activeShell() != workbenchShell;
				if(shellChanged) {
					activeShell = bot.activeShell();
				}
				return shellChanged;
			}
			
			@Override
			public String getFailureMessage() {
				return "No working dialog has shown up.";
			}
		}, 120 * 1000);
		bot.waitUntil(new DefaultCondition() {
			
			@Override
			public boolean test() throws Exception {
				return bot.activeShell() != activeShell;
			}
			
			@Override
			public String getFailureMessage() {
				return "Working dialog not closed.";
			}
		}, 120 * 1000);
	}

	private void generateXtextArtifacts(String packageName,
			String xtextProjectName, String languageName) {
		selectFolderNode(xtextProjectName, "src", packageName,
				"Generate" + languageName + ".mwe2").select();
		bot.menu("Run").menu("Run As").menu("1 MWE2 Workflow").click();
		final SWTBotTreeItem srcgenFolder = selectFolderNode(xtextProjectName,
				"src-gen").select();
		bot.waitUntil(new DefaultCondition() {
			public String getFailureMessage() {
				return "src-gen has no contents "; //$NON-NLS-1$
			}

			public boolean test() throws Exception {
				return srcgenFolder.getNodes().size() > 0;
			}
		}, 120 * 1000);
	}

	private String getStatemachineGrammar() {
		return getString(
				"grammar " + packageName + "." + languageName + " with org.eclipse.xtext.common.Terminals",
				"", "generate " + toFirstLower(languageName) + " \"" + uri + "\"", "",
				"Statemachine:", "{Statemachine}", "'states'",
				"states+=State*", "'end'", "'transitions'",
				"transitions+=Transition*", "'end'", ";", "", "State:",
				"'state' name=ID", "('actions' '{' actions+=Command* '}')?",
				"'end'", ";", "", "Command:", "name=ID code=ID", ";", "",
				"Transition:", "{Transition}", "'from' fromState=[State]",
				"'to' toState=[State]", "'triggeredBy' event=ID", ";");
	}

	private String toFirstLower(String string) {
		return string.length() > 0 ?  string.substring(0,1).toLowerCase() + string.substring(1) : string;
	}
}
