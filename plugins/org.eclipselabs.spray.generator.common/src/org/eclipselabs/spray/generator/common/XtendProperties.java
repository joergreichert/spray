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
package org.eclipselabs.spray.generator.common;

import java.util.HashMap;
import java.util.Map;

public class XtendProperties {
    static protected Map<String, String> properties = new HashMap<String, String>();

    static public void setValue(String key, String value) {
        properties.put(key, value);
    }

    static public String getValue(String key) {
        return properties.get(key);
    }
}
