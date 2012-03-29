package org.eclipselabs.spray.generator.graphiti.ext;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipselabs.spray.generator.graphiti.templates.diagram.FeatureProvider;
import org.eclipselabs.spray.mm.spray.Diagram;

@SuppressWarnings("all")
public class FeatureProviderExt extends FeatureProvider {
  public CharSequence generate_additionalMethods(final Diagram context) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// this has been added by a derived template from org.eclipselabs.spray.generator.graphiti.extension");
    _builder.newLine();
    return _builder;
  }
}
