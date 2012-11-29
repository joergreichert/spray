package org.eclipselabs.spray.generator.graphiti.templates;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.xtext.generator.IFileSystemAccessUtil;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

@RunWith(XtextRunner2.class)
@InjectWith(org.eclipselabs.spray.generator.graphiti.tests.SprayTestsInjectorProvider.class)
public class JavaGenFileTest {
    @Inject
    private IFileSystemAccessUtil fsaUtil;

    private JavaGenFile           fixture;

    @Before
    public void setUp() {
        fixture = new JavaGenFile(fsaUtil);
    }

    @Test
    public void test_setPackageAndClass_String() {
        fixture.setPackageAndClass(BigDecimal.class.getName());
        assertEquals("java.math", fixture.getPackageName());
        assertEquals("BigDecimal", fixture.getClassName());
    }

}
