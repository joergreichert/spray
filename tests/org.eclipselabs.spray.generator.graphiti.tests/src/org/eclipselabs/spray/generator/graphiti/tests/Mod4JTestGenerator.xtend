package org.eclipselabs.spray.generator.graphiti.tests

import java.io.File
import java.io.FileWriter
import org.eclipse.xtext.junit4.InjectWith
import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest
import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(SprayTestsInjectorProvider))
class Mod4JTestGenerator extends AbstractSprayGeneratorTest {
    private val PREFIX = "DEFAULT_OUTPUT"
    private val PREFIX_LONG = PREFIX + "org/eclipselabs/spray/examples/"
    
    //@Test
    def void test() {
        val fsa = triggerGenerator("mod4j/mod4j-busmod.spray")
        for(key : fsa.files.keySet) {
        	
	    	val packageName = getPackageName(key)
	    	val className = getFileName(key)
	    	val content = fsa.files.get(key)
	    	val path = "src/" + packageName.replace(".", "/") + "/" + className + ".xtend"
	    	val testClassContent = assertionClassContent(packageName, className, key, content)
	    	val file = new File(path)
	    	file.parentFile.mkdirs
	    	val fileWriter = new FileWriter(file)
	    	fileWriter.write(testClassContent.toString)
	    	fileWriter.flush
	    	fileWriter.close
    	}
    }
    
    def private getPackageName(String key) {
    	if(key.contains(PREFIX_LONG)) {
			"org.eclipselabs.spray.generator.graphiti.tests.mod4j." + key.replace(PREFIX_LONG, "").split("/").reverse.tail.toList.reverse.join(".")    	
    	} else {
    		"org.eclipselabs.spray.generator.graphiti.tests.mod4j"
    	}
    }

    def private getFileName(String key) {
    	if(key.endsWith(".java")) {
	    	key.split("/").last.replace(".java", "") + "Test"
    	} else {
    		key.split("/").last.replace(PREFIX, "").replace(".", "").toFirstUpper + "Test"
    	}
	}
    
    def assertionClassContent(String packageName, String className, String key, CharSequence content) '''
	package «packageName»

	import org.eclipse.xtext.junit4.InjectWith
	import org.eclipselabs.spray.generator.graphiti.tests.AbstractSprayGeneratorTest
	import org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider
	import org.eclipselabs.xtext.utils.unittesting.XtextRunner2
	import org.junit.Test
	import org.junit.runner.RunWith
	
	import static org.junit.Assert.*
	
	@RunWith(typeof(XtextRunner2))
	@InjectWith(typeof(SprayTestsInjectorProvider))
	class «className» extends AbstractSprayGeneratorTest {
	
	    @Test
	    def void test() {
	       val fsa = triggerGenerator("mod4j/mod4j-busmod.spray")
	       val keyClass = "«key»"
	       assertTrue(keyClass + " should have been generated", fsa.files.containsKey(keyClass))
	       assertEquals(keyClass + " should have the expected content", fsa.files.get(keyClass).toString, expectedContent.toString)
	    }

	    def private expectedContent() «"'''"»
	        «content»
	    «"'''"»
	}
	'''
}