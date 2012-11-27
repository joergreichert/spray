package org.eclipselabs.spray.shapes.tests;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.shapes.tests.util.ShapeTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(ShapeTestsInjectorProvider.class)
public class ConnectionModelTest extends XtextTest {

    @Test
    public void test_01_DefaultConnection() {
        testFile("testcases/connections/01_DefaultConnection.shape");
    }

    @Test
    public void test_02_DefaultConnection_FF() {
        testFile("testcases/connections/02_DefaultConnection_FF.shape");
    }

    @Test
    public void test_03_DefaultConnection_MH() {
        testFile("testcases/connections/03_DefaultConnection_MH.shape");
    }

    @Test
    public void test_04_DefaultConnection_PL_Ellipse() {
        testFile("testcases/connections/04_DefaultConnection_PL_Ellipse.shape");
    }

    @Test
    public void test_05_DefaultConnection_PL_Rectangle() {
        testFile("testcases/connections/05_DefaultConnection_PL_Rectangle.shape");
    }

    @Test
    public void test_06_DefaultConnection_PL_RoundedRectangle() {
        testFile("testcases/connections/06_DefaultConnection_PL_RoundedRectangle.shape");
    }

    @Test
    public void test_07_DefaultConnection_PL_Line() {
        testFile("testcases/connections/07_DefaultConnection_PL_Line.shape");
    }

    @Test
    public void test_08_DefaultConnection_PL_PolyLine() {
        testFile("testcases/connections/08_DefaultConnection_PL_PolyLine.shape");
    }

    @Test
    public void test_09_DefaultConnection_PL_Polygon() {
        testFile("testcases/connections/09_DefaultConnection_PL_Polygon.shape");
    }

    //	@Test
    //	public void test_10_DefaultConnection_PL_Text() {
    //		testFile("testcases/connections/10_DefaultConnection_PL_Text.shape");
    //	}

    @Test
    public void test_11_DefaultConnection_TwoPL() {
        // TODO Fix serialization problem
        suppressSerialization();
        testFile("testcases/connections/11_DefaultConnection_TwoPL.shape");
    }

    @Test
    public void test_12_DefaultConnection_DefaultStyle() {
        // TODO Fix serialization problem
        suppressSerialization();
        testFile("testcases/connections/12_DefaultConnection_DefaultStyle.shape");
    }

    @Test
    public void test_13_DefaultConnection_OwnStyle() {
        // TODO Fix serialization problem
        suppressSerialization();
        testFile("testcases/connections/13_DefaultConnection_OwnStyle.shape");
    }

    @Test
    public void test_14_DefaultConnection_OverrideDEfaultWithOwnStyle() {
        // TODO Fix serialization problem
        suppressSerialization();
        testFile("testcases/connections/14_DefaultConnection_OverrideDEfaultWithOwnStyle.shape");
    }

    @Test
    public void test_15_DefaultConnection_OverrideDefaultInEllipse() {
        // TODO Fix serialization problem
        suppressSerialization();
        testFile("testcases/connections/15_DefaultConnection_OverrideDefaultInEllipse.shape");
    }

}
