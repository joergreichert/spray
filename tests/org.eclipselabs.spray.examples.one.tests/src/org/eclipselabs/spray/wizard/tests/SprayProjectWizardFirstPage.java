package org.eclipselabs.spray.wizard.tests;

public class SprayProjectWizardFirstPage extends
		AbstractBuilder<SprayProjectWizardFirstPage> {
	private SprayProjectWizardConfiguration wizardConfiguration;
	private String defaultProjectName = "org.eclipselabs.spray.examples.mydiagram";
	private String projectName;
	private boolean useDefaultLocation = true;
	private String location;
	private boolean diagramTypeNameFromProjectName = true;
	private String diagramTypeName = "mydiagram";
	private boolean browseRegisteredEPackages = true;
	private boolean browseWorkspaceForEPackages = false;
	private boolean setEPackage = false;
	private String ePackageUriToBrowseInRegisteredEPackages;
	private String[] ePackageUriSegmentsToBrowseInWorkspace;
	private String metamodelEPackageUri;
	private boolean browseWorkspaceForGenModels = false;
	private boolean setGenModel = false;
	private String[] genModelUriSegmentsToBrowseInWorkspace;
	private String metamodelGenModelUri;
	private boolean selectType = true;
	private String modelEClassToSelect;
	private String metamodelModelEClass;
	private boolean setFileExtension = false;
	private String fileExtension;

	private SprayProjectWizardFirstPage(
			SprayProjectWizardConfiguration wizardConfiguration) {
		this.wizardConfiguration = wizardConfiguration;
	}

	public static SprayProjectWizardFirstPage init(
			SprayProjectWizardConfiguration wizardConfiguration) {
		return new SprayProjectWizardFirstPage(wizardConfiguration);
	}

	public SprayProjectWizardFirstPage defaultProjectName(
			String defaultProjectName) {
		return setValue(defaultProjectName, "defaultProjectName");
	}

	public SprayProjectWizardFirstPage projectName(String projectName) {
		return setValue(projectName, "projectName");
	}

	public SprayProjectWizardFirstPage useDefaultLocation(
			boolean useDefaultLocation) {
		return setValue(useDefaultLocation, "useDefaultLocation");
	}

	public SprayProjectWizardFirstPage location(String location) {
		return setValue(location, "location");
	}

	public SprayProjectWizardFirstPage diagramTypeNameFromProjectName(
			boolean diagramTypeNameFromProjectName) {
		return setValue(diagramTypeNameFromProjectName,
				"diagramTypeNameFromProjectName");
	}

	public SprayProjectWizardFirstPage diagramTypeName(String diagramTypeName) {
		return setValue(diagramTypeName, "diagramTypeName");
	}

	public SprayProjectWizardFirstPage browseRegisteredEPackages(
			boolean browseRegisteredEPackages) {
		return setValue(browseRegisteredEPackages, "browseRegisteredEPackages");
	}

	public SprayProjectWizardFirstPage browseWorkspaceForEPackages(
			boolean browseWorkspaceForEPackages) {
		return setValue(browseWorkspaceForEPackages,
				"browseWorkspaceForEPackages");
	}

	public SprayProjectWizardFirstPage setEPackage(boolean setEPackage) {
		return setValue(setEPackage, "setEPackage");
	}

	public SprayProjectWizardFirstPage ePackageUriToBrowseInRegisteredEPackages(
			String ePackageUriToBrowseInRegisteredEPackages) {
		return setValue(ePackageUriToBrowseInRegisteredEPackages,
				"ePackageUriToBrowseInRegisteredEPackages");
	}

	public SprayProjectWizardFirstPage ePackageUriToBrowseInWorkspace(
			String[] ePackageUriSegmentsToBrowseInWorkspace) {
		return setValue(ePackageUriSegmentsToBrowseInWorkspace,
				"ePackageUriSegmentsToBrowseInWorkspace");
	}

	public SprayProjectWizardFirstPage ePackageUri(String metamodelEPackageUri) {
		return setValue(metamodelEPackageUri, "metamodelEPackageUri");
	}

	public SprayProjectWizardFirstPage browseWorkspaceForGenModels(
			boolean browseWorkspaceForGenModels) {
		return setValue(browseWorkspaceForGenModels,
				"browseWorkspaceForGenModels");
	}
	
	public SprayProjectWizardFirstPage setGenModel(boolean setGenModel) {
		return setValue(setGenModel, "setGenModel");
	}

	public SprayProjectWizardFirstPage ePackageUriSegmentsToBrowseInRegisteredEPackages(
			String[] genModelUriSegmentsToBrowseInWorkspace) {
		return setValue(genModelUriSegmentsToBrowseInWorkspace,
				"genModelUriSegmentsToBrowseInWorkspace");
	}

	public SprayProjectWizardFirstPage genModelUri(String metamodelGenModelUri) {
		return setValue(metamodelGenModelUri, "metamodelGenModelUri");
	}

	public SprayProjectWizardFirstPage selectType(boolean selectType) {
		return setValue(selectType, "selectType");
	}

	public SprayProjectWizardFirstPage modelEClassToSelect(
			String modelEClassToSelect) {
		return setValue(modelEClassToSelect, "modelEClassToSelect");
	}

	public SprayProjectWizardFirstPage modelEClass(String metamodelModelEClass) {
		return setValue(metamodelModelEClass, "metamodelModelEClass");
	}
	
	public SprayProjectWizardFirstPage setFileExtension(boolean fileExtension) {
		return setValue(setFileExtension, "setFileExtension");
	}

	public SprayProjectWizardFirstPage fileExtension(String fileExtension) {
		return setValue(fileExtension, "fileExtension");
	}

	public SprayProjectWizardConfiguration wizardConfiguration() {
		return wizardConfiguration;
	}

	public String defaultProjectName() {
		return defaultProjectName;
	}

	public String projectName() {
		return projectName;
	}

	public boolean isUseDefaultLocation() {
		return useDefaultLocation;
	}

	public String location() {
		return location;
	}

	public boolean isDiagramTypeNameFromProjectName() {
		return diagramTypeNameFromProjectName;
	}

	public String diagramTypeName() {
		return diagramTypeName;
	}

	public String ePackageUri() {
		return metamodelEPackageUri;
	}

	public String genModelUri() {
		return metamodelGenModelUri;
	}

	public String modelEClass() {
		return metamodelModelEClass;
	}

	public String fileExtension() {
		return fileExtension;
	}

	public boolean isBrowseRegisteredEPackages() {
		return browseRegisteredEPackages;
	}

	public boolean isBrowseWorkspaceForEPackages() {
		return browseWorkspaceForEPackages;
	}

	public String ePackageUriToBrowseInRegisteredEPackages() {
		return ePackageUriToBrowseInRegisteredEPackages;
	}

	public String[] ePackageUriSegmentsToBrowseInWorkspace() {
		return ePackageUriSegmentsToBrowseInWorkspace;
	}

	public boolean isBrowseWorkspaceForGenModels() {
		return browseWorkspaceForGenModels;
	}

	public String[] genModelUriSegmentsToBrowseInWorkspace() {
		return genModelUriSegmentsToBrowseInWorkspace;
	}

	public boolean isSelectType() {
		return selectType;
	}

	public String modelEClassToSelect() {
		return modelEClassToSelect;
	}
	
	public boolean isSetEPackage() {
		return setEPackage;
	}
	
	public boolean isSetGenModel() {
		return setGenModel;
	}
	
	public boolean isSetFileExtension() {
		return setFileExtension;
	}
}