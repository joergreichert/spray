package org.eclipselabs.spray.shapes.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class ShapeHighlightingConfiguration implements IHighlightingConfiguration {

	private static final RGB   RGB_DARKGREEN 		= 	new RGB(46,  139, 87);
    private static final RGB   RGB_ORANGE 			= 	new RGB(255, 140, 000);
    private static final RGB   RGB_RED 				= 	new RGB(178, 34,  34);
    
    public static final String KEYWORDSHAPEDEF_ID 	= 	"KeywordsShapeDefinition";
    public static final String KEYWORD_ID  			= 	"KeywordsShapes";
    public static final String KEYWORDATTRIB_ID 	= 	"KeywordsAttribShapes";

    @Override
    public void configure(IHighlightingConfigurationAcceptor acceptor) {
    	acceptor.acceptDefaultHighlighting(KEYWORDSHAPEDEF_ID, "keywordsShapeDef", keywordShapeDefTextStyle());
    	acceptor.acceptDefaultHighlighting(KEYWORD_ID, "keywordsShape", keywordTextStyle());
        acceptor.acceptDefaultHighlighting(KEYWORDATTRIB_ID, "keywordsAttributes", keywordAttribTextStyle());
    }

    public TextStyle keywordShapeDefTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_DARKGREEN);
        return textStyle;
    }
    
    public TextStyle keywordTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_ORANGE);
        return textStyle;
    }
    
    public TextStyle keywordAttribTextStyle() {
        TextStyle textStyle = new TextStyle();
        textStyle.setStyle(SWT.BOLD);
        textStyle.setColor(RGB_RED);
        return textStyle;
    }
}