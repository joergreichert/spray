package org.eclipselabs.spray.wizard.tests;


public class SprayProjectWizardSecondPage extends AbstractBuilder<SprayProjectWizardSecondPage> {
	private SprayProjectWizardConfiguration wizardConfiguration;
	private boolean useProjectDefaultStructure = true;
	private String modelFolder;
	private String srcFolder;
	private String srcGenFolder;
	private String resourceFolder;
	private String resourceGenFolder;
	private String defaultModelFolder = "model";
	private String defaultSrcFolder = "src";
	private String defaultSrcGenFolder = "src-gen";
	private String defaultResourceFolder = "resource";
	private String defaultResourceGenFolder = "resource-gen";
	private boolean useDefaultNaming = true;
	private String basePackage;
	private String diagramPackage;
	private String featurePackage;
	private String propertyPackage;
	private String defaultBasePackage;
	private String defaultDiagramPackage = "diagram";
	private String defaultFeaturePackage = "features";
	private String defaultPropertyPackage = "property";
	private boolean generateTimestamp = true;
	
	private SprayProjectWizardSecondPage(SprayProjectWizardConfiguration wizardConfiguration) {
		this.wizardConfiguration = wizardConfiguration;
		setInstance(this);
	}
	
	public static SprayProjectWizardSecondPage init(SprayProjectWizardConfiguration wizardConfiguration) {
		return new SprayProjectWizardSecondPage(wizardConfiguration);
	}

	public SprayProjectWizardSecondPage useProjectDefaultStructure(boolean useProjectDefaultStructure) {
		return setValue(useProjectDefaultStructure, "useProjectDefaultStructure");
	}

	public SprayProjectWizardSecondPage modelFolder(String modelFolder) {
		return setValue(modelFolder, "modelFolder");
	}

	public SprayProjectWizardSecondPage defaultModelFolder(String defaultModelFolder) {
		return setValue(defaultModelFolder, "defaultModelFolder");
	}

	public SprayProjectWizardSecondPage srcFolder(String srcFolder) {
		return setValue(srcFolder, "srcFolder");
	}

	public SprayProjectWizardSecondPage defaultSrcFolder(String defaultSrcFolder) {
		return setValue(defaultSrcFolder, "defaultSrcFolder");
	}

	public SprayProjectWizardSecondPage srcGenFolder(String srcGenFolder) {
		return setValue(srcGenFolder, "srcGenFolder");
	}

	public SprayProjectWizardSecondPage defaultSrcGenFolder(String defaultSrcGenFolder) {
		return setValue(defaultSrcGenFolder, "defaultSrcGenFolder");
	}

	public SprayProjectWizardSecondPage resourceFolder(String resourceFolder) {
		return setValue(resourceFolder, "resourceFolder");
	}

	public SprayProjectWizardSecondPage defaultResourceFolder(String defaultResourceFolder) {
		return setValue(defaultResourceFolder, "defaultResourceFolder");
	}

	public SprayProjectWizardSecondPage resourceGenFolder(String resourceGenFolder) {
		return setValue(resourceGenFolder, "resourceGenFolder");
	}
	
	public SprayProjectWizardSecondPage defaultResourceGenFolder(String defaultResourceGenFolder) {
		return setValue(defaultResourceGenFolder, "defaultResourceGenFolder");
	}

	public SprayProjectWizardSecondPage useDefaultNaming(boolean useDefaultNaming) {
		return setValue(useDefaultNaming, "useDefaultNaming");
	}

	public SprayProjectWizardSecondPage basePackage(String basePackage) {
		return setValue(basePackage, "basePackage");
	}

	public SprayProjectWizardSecondPage defaultBasePackage(String defaultBasePackage) {
		return setValue(defaultBasePackage, "defaultBasePackage");
	}

	public SprayProjectWizardSecondPage diagramPackage(String diagramPackage) {
		return setValue(diagramPackage, "diagramPackage");
	}

	public SprayProjectWizardSecondPage defaultDiagramPackage(String defaultDiagramPackage) {
		return setValue(defaultDiagramPackage, "defaultDiagramPackage");
	}

	public SprayProjectWizardSecondPage featurePackage(String featurePackage) {
		return setValue(featurePackage, "featurePackage");
	}

	public SprayProjectWizardSecondPage defaultFeaturePackage(String defaultFeaturePackage) {
		return setValue(defaultFeaturePackage, "defaultFeaturePackage");
	}

	public SprayProjectWizardSecondPage propertyPackage(String propertyPackage) {
		return setValue(propertyPackage, "propertyPackage");
	}

	public SprayProjectWizardSecondPage defaultPropertyPackage(String defaultPropertyPackage) {
		return setValue(defaultPropertyPackage, "defaultPropertyPackage");
	}

	public SprayProjectWizardSecondPage generateTimestamp(boolean generateTimestamp) {
		return setValue(generateTimestamp, "generateTimestamp");
	}
	
	public SprayProjectWizardConfiguration wizardConfiguration() {
		return wizardConfiguration;
	}

	public boolean isUseProjectDefaultStructure() {
		return useProjectDefaultStructure;
	}

	public String modelFolder() {
		return modelFolder;
	}

	public String defaultModelFolder() {
		return defaultModelFolder;
	}

	public String srcFolder() {
		return srcFolder;
	}

	public String defaultSrcFolder() {
		return defaultSrcFolder;
	}

	public String srcGenFolder() {
		return srcGenFolder;
	}

	public String defaultSrcGenFolder() {
		return defaultSrcGenFolder;
	}

	public String resourceFolder() {
		return resourceFolder;
	}

	public String defaultResourceFolder() {
		return defaultResourceFolder;
	}

	public String resourceGenFolder() {
		return resourceGenFolder;
	}

	public String defaultResourceGenFolder() {
		return defaultResourceGenFolder;
	}

	public boolean isUseDefaultNaming() {
		return useDefaultNaming;
	}

	public String basePackage() {
		return basePackage;
	}

	public String defaultBasePackage() {
		return defaultBasePackage;
	}

	public String diagramPackage() {
		return diagramPackage;
	}

	public String defaultDiagramPackage() {
		return defaultDiagramPackage;
	}

	public String featurePackage() {
		return featurePackage;
	}

	public String defaultFeaturePackage() {
		return defaultFeaturePackage;
	}

	public String propertyPackage() {
		return propertyPackage;
	}

	public String defaultPropertyPackage() {
		return defaultPropertyPackage;
	}

	public boolean isGenerateTimestamp() {
		return generateTimestamp;
	}
}