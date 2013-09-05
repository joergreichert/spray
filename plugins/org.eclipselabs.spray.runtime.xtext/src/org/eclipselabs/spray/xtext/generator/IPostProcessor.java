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
package org.eclipselabs.spray.xtext.generator;

public interface IPostProcessor {
	/**
	 * @param fileName The path of the file that would be postprocessed
	 * @return <code>true</code> when this postprocessor handles this file
	 */
	public boolean accepts (String fileName);
	/**
	 * Processes the file content
	 * @param fileName The path of the file that would be postprocessed
	 * @param contents
	 * @return Potentially modified content
	 */
	public CharSequence process (String fileName, CharSequence contents);
}
