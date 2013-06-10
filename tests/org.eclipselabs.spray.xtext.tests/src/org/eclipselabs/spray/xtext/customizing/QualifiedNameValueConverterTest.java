package org.eclipselabs.spray.xtext.customizing;

import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipselabs.spray.xtext.SprayTestsInjectorProvider;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(XtextRunner.class)
@InjectWith(SprayTestsInjectorProvider.class)
public class QualifiedNameValueConverterTest {
    @Inject
    private QualifiedNameValueConverter converter;

    @Test
    public void test_toString() {
        assertEquals("foo", converter.toString("foo"));
        assertEquals("foo.bar", converter.toString("foo.bar"));
        // conflict with Spray keyword
        assertEquals("foo.^custom.bar", converter.toString("foo.custom.bar"));
    }

    @Test
    public void test_toValue() {
        assertEquals("foo", converter.toValue("foo", null));
    }

}
