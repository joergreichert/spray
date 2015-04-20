
```
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.eclipse.xtext.util.Modules2;
import org.eclipselabs.spray.generator.graphiti.GraphitiGeneratorModule;
import org.eclipselabs.spray.runtime.graphiti.GraphitiRuntimeModule;
import org.eclipselabs.spray.xtext.SprayRuntimeModule;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.grapher.GrapherModule;
import com.google.inject.grapher.InjectorGrapher;
import com.google.inject.grapher.graphviz.GraphvizModule;
import com.google.inject.grapher.graphviz.GraphvizRenderer;

public class Grapher {
	public static void main(String[] args) throws IOException {
		graph("test.dot", Guice.createInjector(Modules2.mixin(new GraphitiGeneratorModule(), new GraphitiRuntimeModule(), new SprayRuntimeModule())));
	}
	
  private static void graph(String filename, Injector demoInjector) throws IOException {
    PrintWriter out = new PrintWriter(new File(filename), "UTF-8");

    Injector injector = Guice.createInjector(new GrapherModule(), new GraphvizModule());
    GraphvizRenderer renderer = injector.getInstance(GraphvizRenderer.class);
    renderer.setOut(out);

    injector.getInstance(InjectorGrapher.class)
        .of(demoInjector)
        .graph();
  }
}
```

[9.6 MB big png file](http://spray.eclipselabs.org.codespot.com/git.wiki/images/misc/Modules2_mixin_GraphitiGeneratorModule_GraphitiRuntimeModule_SprayRuntimeModule.png)

see [Grapher](http://code.google.com/p/google-guice/wiki/Grapher)

guice-grapher-3.0.jar is contained in guice-3.0.zip that can be downloaded from [here](http://code.google.com/p/google-guice/downloads/list)

Please not to use Graphviz 2.20 (can be found [here](http://graphviz.org/pub/graphviz/stable/windows/)) instead of the current version, as the current version do not render some of the nodes.