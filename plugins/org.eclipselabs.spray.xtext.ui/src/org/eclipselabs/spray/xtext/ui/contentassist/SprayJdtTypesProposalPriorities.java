/** ****************************************************************************
 * Copyright (c)  The Spray Project.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Spray Dev Team - initial API and implementation
 **************************************************************************** */
package org.eclipselabs.spray.xtext.ui.contentassist;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentProposalPriorities;

public class SprayJdtTypesProposalPriorities extends ContentProposalPriorities {

    @Override
    protected void adjustPriority(ICompletionProposal proposal, String prefix, int priority) {
        if (proposal != null && proposal.getDisplayString() != null && !proposal.getDisplayString().contains(".")) {
            super.adjustPriority(proposal, prefix, priority * proposalWithPrefixMultiplier);
        }
        super.adjustPriority(proposal, prefix, priority);
    }
}
