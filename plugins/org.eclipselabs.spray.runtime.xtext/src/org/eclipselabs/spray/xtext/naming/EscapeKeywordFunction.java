package org.eclipselabs.spray.xtext.naming;

import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.naming.QualifiedName;

import com.google.common.base.Function;
import javax.inject.Inject;

/**
 * This function replaces identifiers of a qualified name that matches a language keyword by prefixing it with the ^ character.
 * 
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class EscapeKeywordFunction implements Function<QualifiedName, QualifiedName> {
    @Inject
    private IGrammarAccess grammar;

    @Override
    public QualifiedName apply(final QualifiedName qn) {
        final String[] segments = qn.getSegments().toArray(new String[0]);
        for (Keyword kw : grammar.findKeywords(segments)) {
            // keyword found in QN
            for (int i = 0; i < qn.getSegmentCount(); i++) {
                if (qn.getSegment(i).equals(kw.getValue())) {
                    segments[i] = "^" + segments[i]; // escape segment string
                }
            }
        }
        return QualifiedName.create(segments);
    }
}
