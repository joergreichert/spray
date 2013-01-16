package test;

import java.util.HashMap;

import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;

import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector i = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
        Mwe2Runner runner = i.getInstance(Mwe2Runner.class);
        runner.run("org.eclipselabs.spray.examples.lwc2012.SprayLwcGenerator", new HashMap<String, String>());
    }

}
