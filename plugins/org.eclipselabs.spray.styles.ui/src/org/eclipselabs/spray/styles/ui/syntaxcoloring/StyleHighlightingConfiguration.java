package org.eclipselabs.spray.styles.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class StyleHighlightingConfiguration implements IHighlightingConfiguration {

	private static final RGB   RGB_DARKGREEN 		= 	new RGB(46,  139, 87);
    private static final RGB   RGB_ORANGE 			= 	new RGB(255, 140, 000);
    
    public static final String KEYWORDSTYLEDEF_ID 	= 	"KeywordsStyleDefinition";
    public static final String KEYWORDATTRIB_ID 	= 	"KeywordsAttribShapes";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
    	acceptor.acceptDefaultHighlighting(KEYWORDSTYLEDEF_ID, "keywordsShapeDef", keywordShapeDefTextStyle());
        acceptor.acceptDefaultHighlighting(KEYWORDATTRIB_ID, "keywordsAttributes", keywordAttribTextStyle());
    }

    public TextStyle keywordShapeDefTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_DARKGREEN);
        return textStyle;
    }
    
    public TextStyle keywordAttribTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_ORANGE);
        return textStyle;
    }
}