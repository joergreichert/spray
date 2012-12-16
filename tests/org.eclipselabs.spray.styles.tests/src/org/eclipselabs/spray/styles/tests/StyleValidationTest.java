package org.eclipselabs.spray.styles.tests;

import static org.junit.Assert.assertEquals;

import org.eclipse.xtext.junit4.InjectWith;
import org.eclipselabs.spray.styles.tests.util.StyleTestsInjectorProvider;
import org.eclipselabs.xtext.utils.unittesting.XtextRunner2;
import org.eclipselabs.xtext.utils.unittesting.XtextTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner2.class)
@InjectWith(StyleTestsInjectorProvider.class)
public class StyleValidationTest extends XtextTest {

    @Before
    public void before() {
        suppressSerialization();
    }
    
    @Test
    public void testCheckGradientDefintion__WhenOffsetsOk() {
    	testFileNoSerializer("validation/GradientDefintion__WhenOffsetsOk.style");
    	assertConstraints(issues.sizeIs(0));
    }
    
    @Test
    public void testCheckGradientDefintion__WhenStartOffsetNotZero() {
    	testFileNoSerializer("validation/GradientDefintion__WhenStartOffsetNotZero.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("A gradient should always start with an offset of 0.0.", issues.warningsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckGradientDefintion__WhenEndOffsetNotOne() {
    	testFileNoSerializer("validation/GradientDefintion__WhenEndOffsetNotOne.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("A gradient should always end with an offset of 1.0.", issues.warningsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckGradientRange__WhenEndOffsetNotSet() {
    	testFileNoSerializer("validation/GradientRange__WhenEndOffsetNotSet.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("A gradient should always end with an offset of 1.0.", issues.warningsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckGradientRange__WhenEndOffsetHigherOne() {
    	testFileNoSerializer("validation/GradientRange__WhenEndOffsetHigherOne.style");
    	assertConstraints(issues.sizeIs(2));
    	assertEquals("A gradient should always end with an offset of 1.0.", issues.warningsOnly().getIssues().get(0).getMessage());
    	assertEquals("The range for the offset should be defined between 0.0 and 1.0.", issues.errorsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckGradientSortage__WhenGradientsOverlap() {
    	testFileNoSerializer("validation/GradientSortage__WhenGradientsOverlap.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("This offset should be bigger than 0.4. Please take care about the sortage of the gradient areas.", issues.errorsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckGradientSortage__WhenGradientsStartAtTheSameOffset() {
    	testFileNoSerializer("validation/GradientSortage__WhenGradientsStartAtTheSameOffset.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("This offset should be bigger than 0.4. Please take care about the sortage of the gradient areas.", issues.errorsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckGradientSortage__WhenGradientsDoNotOverlap() {
    	testFileNoSerializer("validation/GradientSortage__WhenGradientsDoNotOverlap.style");
    	assertConstraints(issues.sizeIs(0));
    }

    @Test
    public void testCheckTransparency__WhenHigherOne() {
    	testFileNoSerializer("validation/Transparency__WhenHigherOne.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("The tranparency should be between 0.0 and 1.0.", issues.errorsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckFontName__WhenNotAvailable() {
    	testFileNoSerializer("validation/FontName__WhenNotAvailable.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("The selected font is not installed on the system (default 'Arial' will be taken).", issues.warningsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckLineAttributes__WhenLineColorTransparentAndLineWidthNotZero() {
    	testFileNoSerializer("validation/LineAttributes__WhenLineColorTransparentAndLineWidthNotZero.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("If the line-color is transparent, the line-width is deprecated.", issues.warningsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckLineAttributes__WhenLineColorTransparentAndLineStyleIsSet() {
    	testFileNoSerializer("validation/LineAttributes__WhenLineColorTransparentAndLineStyleIsSet.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("If the line-color is transparent, the line-style is deprecated.", issues.warningsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckLineAttributes__WhenLineWidthIsZeroAndLineStyleIsSet() {
    	testFileNoSerializer("validation/LineAttributes__WhenLineWidthIsZeroAndLineStyleIsSet.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("If the line-width is 0, the line is invisible (line-style is deprecated).", issues.warningsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckRGBColorRange__WhenBlueHigher255() {
    	testFileNoSerializer("validation/RGBColorRange__WhenBlueHigher255.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("The blue color should be defined between 0 and 255.", issues.errorsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckRGBColorRange__WhenRedHigher255() {
    	testFileNoSerializer("validation/RGBColorRange__WhenRedHigher255.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("The red color should be defined between 0 and 255.", issues.errorsOnly().getIssues().get(0).getMessage());
    }
    
    @Test
    public void testCheckRGBColorRange__WhenGreenHigher255() {
    	testFileNoSerializer("validation/RGBColorRange__WhenGreenHigher255.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("The green color should be defined between 0 and 255.", issues.errorsOnly().getIssues().get(0).getMessage());
    }

    @Test
    public void testCheckShortDescription__WhenDescriptionLessThan20Characters() {
    	testFileNoSerializer("validation/ShortDescription__WhenDescriptionLessThan20Characters.style");
    	assertConstraints(issues.sizeIs(1));
    	assertEquals("The description should have more than 20 characters.", issues.warningsOnly().getIssues().get(0).getMessage());
    }
}