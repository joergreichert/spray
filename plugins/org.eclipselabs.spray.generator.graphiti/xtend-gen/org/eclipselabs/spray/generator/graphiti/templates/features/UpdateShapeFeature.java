package org.eclipselabs.spray.generator.graphiti.templates.features;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.FileGenerator;
import org.eclipselabs.spray.generator.graphiti.templates.JavaGenFile;
import org.eclipselabs.spray.generator.graphiti.util.GeneratorUtil;
import org.eclipselabs.spray.generator.graphiti.util.NamingExtensions;
import org.eclipselabs.spray.generator.graphiti.util.mm.DiagramExtensions;
import org.eclipselabs.spray.mm.spray.Container;
import org.eclipselabs.spray.mm.spray.Diagram;
import org.eclipselabs.spray.mm.spray.MetaClass;
import org.eclipselabs.spray.mm.spray.SprayElement;
import org.eclipselabs.spray.mm.spray.Text;

/**
 * Template for generating Graphiti Update feature for a Container representing a MetaClass
 */
@SuppressWarnings("all")
public class UpdateShapeFeature extends FileGenerator {
  @Inject
  private NamingExtensions _namingExtensions;
  
  @Inject
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private DiagramExtensions _diagramExtensions;
  
  public StringConcatenation generateBaseFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _baseClassName = _javaGenFile.getBaseClassName();
    StringConcatenation _mainFile = this.mainFile(((Container) modelElement), _baseClassName);
    return _mainFile;
  }
  
  public StringConcatenation generateExtensionFile(final EObject modelElement) {
    JavaGenFile _javaGenFile = this.getJavaGenFile();
    String _className = _javaGenFile.getClassName();
    StringConcatenation _mainExtensionPointFile = this.mainExtensionPointFile(((Container) modelElement), _className);
    return _mainExtensionPointFile;
  }
  
  public StringConcatenation mainExtensionPointFile(final Container container, final String className) {
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
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation mainFile(final Container container, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _header = this.header(this);
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _feature_package = GeneratorUtil.feature_package();
    _builder.append(_feature_package, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.util.HashMap;");
    _builder.newLine();
    _builder.append("import java.util.Map;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.emf.ecore.EObject;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IFeatureProvider;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.IReason;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.context.IUpdateContext;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.features.impl.Reason;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.algorithms.Text;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.ContainerShape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Diagram;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.PictogramElement;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.mm.pictograms.Shape;");
    _builder.newLine();
    _builder.append("import org.eclipse.graphiti.services.IGaService;");
    _builder.newLine();
    _builder.append("import org.eclipselabs.spray.runtime.graphiti.features.AbstractUpdateFeature;");
    _builder.newLine();
    _builder.append("import ");
    String _util_package = GeneratorUtil.util_package();
    _builder.append(_util_package, "");
    _builder.append(".SprayContainerService;");
    _builder.newLineIfNotEmpty();
    _builder.append("import ");
    MetaClass _represents = container.getRepresents();
    String _javaInterfaceName = this._namingExtensions.getJavaInterfaceName(_represents);
    _builder.append(_javaInterfaceName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("// MARKER_IMPORT");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    _builder.append(className, "");
    _builder.append(" extends AbstractUpdateFeature {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_additionalFields = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("public ");
    _builder.append(className, "    ");
    _builder.append("(IFeatureProvider fp) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("super(fp);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("gaService = ");
    Diagram _diagram = this._diagramExtensions.getDiagram(container);
    String _activatorClassName = this._namingExtensions.getActivatorClassName(_diagram);
    String _shortName = this.shortName(_activatorClassName);
    _builder.append(_shortName, "        ");
    _builder.append(".get(IGaService.class);");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("    ");
    StringConcatenation _generate_canUpdate = this.generate_canUpdate(container);
    _builder.append(_generate_canUpdate, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_updateNeeded = this.generate_updateNeeded(container);
    _builder.append(_generate_updateNeeded, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_update = this.generate_update(container);
    _builder.append(_generate_update, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_valueMapping = this.generate_valueMapping(container);
    _builder.append(_generate_valueMapping, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    StringConcatenation _generate_additionalFields_1 = this.generate_additionalFields(container);
    _builder.append(_generate_additionalFields_1, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_canUpdate(final Container container) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean canUpdate(IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// return true, if linked business object is a EClass");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject bo =  getBusinessObjectForPictogramElement(context.getPictogramElement());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return (bo instanceof ");
    MetaClass _represents = container.getRepresents();
    String _name = this._namingExtensions.getName(_represents);
    _builder.append(_name, "    ");
    _builder.append(")&& (!(pictogramElement instanceof Diagram));");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_updateNeeded(final Container container) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public IReason updateNeeded(IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if ( ! (bo instanceof ");
    MetaClass _represents = container.getRepresents();
    String _name = this._namingExtensions.getName(_represents);
    _builder.append(_name, "    ");
    _builder.append(")) {");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("return Reason.createFalseReason(); ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("       ");
    MetaClass _represents_1 = container.getRepresents();
    String _name_1 = this._namingExtensions.getName(_represents_1);
    _builder.append(_name_1, "       ");
    _builder.append(" eClass = (");
    MetaClass _represents_2 = container.getRepresents();
    String _name_2 = this._namingExtensions.getName(_represents_2);
    _builder.append(_name_2, "       ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// retrieve name from pictogram model");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if (pictogramElement instanceof ContainerShape) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape cs = (ContainerShape) pictogramElement;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("ContainerShape textBox = SprayContainerService.findTextShape(cs);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for (Shape shape : textBox.getChildren()) {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if (shape.getGraphicsAlgorithm() instanceof Text) {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("Text text = (Text) shape.getGraphicsAlgorithm();");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("String type = peService.getPropertyValue(shape, \"MODEL_TYPE\");");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("String value = getValues(eClass).get(type);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if( value != null){");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append("String pictogramName = text.getValue();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("                     ");
    _builder.append("// update needed, if names are different");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("boolean updateNameNeeded =((pictogramName == null && value != null) || (pictogramName != null && !pictogramName.equals(value)));");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("if (updateNameNeeded) {");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("return Reason.createTrueReason(\"Name [\" + pictogramName + \"] is out of date\");");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return Reason.createFalseReason();");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_update(final Container container) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _overrideHeader = this.overrideHeader();
    _builder.append(_overrideHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("public boolean update(IUpdateContext context) {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PictogramElement pictogramElement = context.getPictogramElement();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("EObject bo = getBusinessObjectForPictogramElement(pictogramElement);");
    _builder.newLine();
    _builder.append("      ");
    MetaClass _represents = container.getRepresents();
    String _name = this._namingExtensions.getName(_represents);
    _builder.append(_name, "      ");
    _builder.append(" eClass = (");
    MetaClass _represents_1 = container.getRepresents();
    String _name_1 = this._namingExtensions.getName(_represents_1);
    _builder.append(_name_1, "      ");
    _builder.append(") bo;");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("return SprayContainerService.update(pictogramElement, getValues(eClass));");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generate_valueMapping(final Container container) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Map<String, String> values = null; ");
    _builder.newLine();
    _builder.append("protected Map<String, String> getValues(");
    MetaClass _represents = container.getRepresents();
    String _name = this._namingExtensions.getName(_represents);
    _builder.append(_name, "");
    _builder.append(" eClass) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("if (values == null) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("values = new HashMap<String, String>();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("fillValues(eClass);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("return values;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("protected void fillValues(");
    MetaClass _represents_1 = container.getRepresents();
    String _name_1 = this._namingExtensions.getName(_represents_1);
    _builder.append(_name_1, "");
    _builder.append(" eClass) {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("String type, value;");
    _builder.newLine();
    {
      SprayElement[] _parts = container.getParts();
      for(final SprayElement part : _parts) {
        {
          if ((part instanceof Text)) {
            _builder.append("    ");
            Text text = ((Text) part);
            _builder.newLineIfNotEmpty();
            _builder.append("type = \"");
            QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(text);
            _builder.append(_fullyQualifiedName, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("value = getValue(type, eClass);");
            _builder.newLine();
            _builder.append("values.put(type, value);");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("protected String getValue (String type, ");
    MetaClass _represents_2 = container.getRepresents();
    String _name_2 = this._namingExtensions.getName(_represents_2);
    _builder.append(_name_2, "");
    _builder.append(" eClass) {");
    _builder.newLineIfNotEmpty();
    {
      SprayElement[] _parts_1 = container.getParts();
      for(final SprayElement part_1 : _parts_1) {
        {
          if ((part_1 instanceof Text)) {
            Text text_1 = ((Text) part_1);
            _builder.newLineIfNotEmpty();
            _builder.append("if (\"");
            QualifiedName _fullyQualifiedName_1 = this._iQualifiedNameProvider.getFullyQualifiedName(text_1);
            _builder.append(_fullyQualifiedName_1, "");
            _builder.append("\".equals(type)) {");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            StringConcatenation _valueGenerator = this.valueGenerator(text_1, "eClass");
            _builder.append(_valueGenerator, "    ");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("throw new IllegalArgumentException(type);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
