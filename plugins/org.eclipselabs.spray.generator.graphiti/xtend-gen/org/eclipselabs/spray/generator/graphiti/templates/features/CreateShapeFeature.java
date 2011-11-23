package org.eclipselabs.spray.generator.graphiti.templates.features;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.MetaClassExtensions;
import org.eclipselabs.spray.mm.spray.Behavior;
import org.eclipselabs.spray.mm.spray.CreateBehavior;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;

@SuppressWarnings("all")
public class CreateShapeFeature extends FileGenerator {
  @Inject
  private NamingExtensions _namingExtensions;
  
  @Inject
  private MetaClassExtensions _metaClassExtensions;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((MetaClass) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((MetaClass) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _extensionHeader = this.extensionHeader(this);
    _builder.append(_extensionHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends ");
    _builder.append(className, "");
    _builder.append("Base {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final MetaClass metaClass, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    Diagram _diagram = metaClass.getDiagram();
    final Diagram diagram = _diagram;
    _builder.newLineIfNotEmpty();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.ICreateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.containers.SampleUtil;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractCreateFeature;");
    _builder.newLine();
    _builder.append("import ");
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(metaClass);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractCreateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected static String TITLE = \"Create ");
    String _visibleName = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected static String USER_QUESTION = \"Enter new ");
    String _visibleName_1 = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName_1, "    ");
    _builder.append(" name\";");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected ");
    String _modelServiceClassName = this._namingExtensions.getModelServiceClassName(diagram);
    String _shortName = this._namingExtensions.shortName(_modelServiceClassName);
    _builder.append(_shortName, "    ");
    _builder.append(" modelService;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("protected ");
    String _name = this._namingExtensions.getName(metaClass);
    _builder.append(_name, "    ");
    _builder.append(" newClass = null;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_additionalFields = this.generate_additionalFields(metaClass);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append(" (IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("// set name and description of the creation feature");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super(fp, \"");
    String _createFeatureLabel = this._metaClassExtensions.getCreateFeatureLabel(metaClass);
    _builder.append(_createFeatureLabel, "        ");
    _builder.append("\", \"");
    String _createFeatureDescription = this._metaClassExtensions.getCreateFeatureDescription(metaClass);
    _builder.append(_createFeatureDescription, "        ");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("modelService = new ");
    String _modelServiceClassName_1 = this._namingExtensions.getModelServiceClassName(diagram);
    String _shortName_1 = this._namingExtensions.shortName(_modelServiceClassName_1);
    _builder.append(_shortName_1, "        ");
    _builder.append("(fp.getDiagramTypeProvider());");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    StringConcatenation _generate_canCreate = this.generate_canCreate(metaClass);
    _builder.append(_generate_canCreate, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_create = this.generate_create(metaClass);
    _builder.append(_generate_create, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_createModelElement = this.generate_createModelElement(metaClass);
    _builder.append(_generate_createModelElement, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_getCreateImageId = this.generate_getCreateImageId(metaClass);
    _builder.append(_generate_getCreateImageId, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_additionalFields_1 = this.generate_additionalFields(metaClass);
    _builder.append(_generate_additionalFields_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_canCreate(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canCreate(ICreateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// TODO: Respect the cardinality of the containment reference");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return context.getTargetContainer() instanceof Diagram;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_create(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public Object[] create(final ICreateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("newClass = create");
    String _visibleName = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName, "    ");
    _builder.append("(context);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (newClass == null ) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return EMPTY;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// do the add");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("addGraphicalRepresentation(context, newClass);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return newly created business object(s)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return new Object[] { newClass };");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_createModelElement(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    Diagram _diagram = metaClass.getDiagram();
    final Diagram diagram = _diagram;
    _builder.newLineIfNotEmpty();
    EClass _modelType = diagram.getModelType();
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(_modelType);
    String _shortName = this._namingExtensions.shortName(_javaInterfaceName);
    final String modelClassName = _shortName;
    _builder.newLineIfNotEmpty();
    EList<Behavior> _behaviorsList = metaClass.getBehaviorsList();
    Iterable<CreateBehavior> _filter = IterableExtensions.<CreateBehavior>filter(_behaviorsList, org.eclipselabs.spray.mm.spray.CreateBehavior.class);
    CreateBehavior _head = IterableExtensions.<CreateBehavior>head(_filter);
    EReference _containmentReference = _head.getContainmentReference();
    final EReference containmentRef = _containmentReference;
    _builder.newLineIfNotEmpty();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Creates a new {@link ");
    String _name = this._namingExtensions.getName(metaClass);
    _builder.append(_name, " ");
    _builder.append("} instance and adds it to the containing type.");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("protected ");
    String _name_1 = this._namingExtensions.getName(metaClass);
    _builder.append(_name_1, "");
    _builder.append(" create");
    String _visibleName = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName, "");
    _builder.append("(ICreateContext context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("// ask user for ");
    String _visibleName_1 = this._namingExtensions.getVisibleName(metaClass);
    _builder.append(_visibleName_1, "    ");
    _builder.append(" name");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("String newName = SampleUtil.askString(TITLE, USER_QUESTION, \"\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (newName == null || newName.trim().length() == 0) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("// create ");
    String _name_2 = this._namingExtensions.getName(metaClass);
    _builder.append(_name_2, "     ");
    _builder.append(" instance");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _name_3 = this._namingExtensions.getName(metaClass);
    _builder.append(_name_3, "    ");
    _builder.append(" newClass = ");
    String _eFactoryInterfaceName = this._namingExtensions.getEFactoryInterfaceName(metaClass);
    String _shortName_1 = this._namingExtensions.shortName(_eFactoryInterfaceName);
    _builder.append(_shortName_1, "    ");
    _builder.append(".eINSTANCE.create");
    String _name_4 = this._namingExtensions.getName(metaClass);
    _builder.append(_name_4, "    ");
    _builder.append("();    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("newClass.setName(newName);");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// add the element to containment reference");
    _builder.newLine();
    _builder.append("    ");
    _builder.append(modelClassName, "    ");
    _builder.append(" model = modelService.getModel();");
    _builder.newLineIfNotEmpty();
    {
      boolean _isMany = containmentRef.isMany();
      if (_isMany) {
        _builder.append("    ");
        _builder.append("model.get");
        String _name_5 = containmentRef.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_5);
        _builder.append(_firstUpper, "    ");
        _builder.append("().add(newClass);");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("    ");
        _builder.append("model.set");
        String _name_6 = containmentRef.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_6);
        _builder.append(_firstUpper_1, "    ");
        _builder.append("(newClass);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("setDoneChanges(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return newClass;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_getCreateImageId(final MetaClass metaClass) {
    StringConcatenation _builder = new StringConcatenation();
    Diagram _diagram = metaClass.getDiagram();
    final Diagram diagram = _diagram;
    _builder.newLineIfNotEmpty();
    {
      String _icon = metaClass.getIcon();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_icon, null);
      if (_operator_notEquals) {
        StringConcatenation _overrideHeader = this.overrideHeader();
        _builder.append(_overrideHeader, "");
        _builder.newLineIfNotEmpty();
        _builder.append("public String getCreateImageId() {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return ");
        String _imageProviderClassName = this._namingExtensions.getImageProviderClassName(diagram);
        String _shortName = this._namingExtensions.shortName(_imageProviderClassName);
        _builder.append(_shortName, "    ");
        _builder.append(".");
        String _icon_1 = metaClass.getIcon();
        String _imageIdentifier = this._namingExtensions.getImageIdentifier(diagram, _icon_1);
        _builder.append(_imageIdentifier, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    return _builder;
  }
}
