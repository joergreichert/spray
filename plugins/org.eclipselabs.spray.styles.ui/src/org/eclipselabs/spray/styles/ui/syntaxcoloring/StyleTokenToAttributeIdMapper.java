package org.eclipselabs.spray.styles.ui.syntaxcoloring;

import java.util.HashSet;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

public class StyleTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	private HashSet<String> layoutStyleDefinition 		= new HashSet<String>();
    private HashSet<String> layoutStyleAttribKeywords 	= new HashSet<String>();

    public StyleTokenToAttributeIdMapper() {
        layoutStyleDefinition.add("'style'");
        layoutStyleDefinition.add("'extends'");
        layoutStyleAttribKeywords.add("'description'");
        layoutStyleAttribKeywords.add("'background-color'");
        layoutStyleAttribKeywords.add("'transparency'");
        layoutStyleAttribKeywords.add("'line-style'");
        layoutStyleAttribKeywords.add("'line-width'");
        layoutStyleAttribKeywords.add("'line-color'");
        layoutStyleAttribKeywords.add("'font-italic'");
        layoutStyleAttribKeywords.add("'font-name'");
        layoutStyleAttribKeywords.add("'font-color'");
        layoutStyleAttribKeywords.add("'font-size'");
        layoutStyleAttribKeywords.add("'font-bold'");
    }

    @Override
    protected String calculateId(String tokenName, int tokenType) {
    	if (layoutStyleDefinition.contains(tokenName)) {
            return StyleHighlightingConfiguration.KEYWORDSTYLEDEF_ID;
        }
        if (layoutStyleAttribKeywords.contains(tokenName)) {
            return StyleHighlightingConfiguration.KEYWORDATTRIB_ID;
        }
        return super.calculateId(tokenName, tokenType);
    }

    public String getId(int tokenType) {
        return getMappedValue(tokenType);
    }
}