# Introduction #

## Naming ##
  * Use project name prefix `org.eclipselabs.spray`

## Manifest ##
  * Add a `plugin.properties`
```
# /**
#  * <copyright>
#  * Copyright (c) 2011 The Spray Project.
#  * All rights reserved.   This program and the accompanying materials
#  * are made available under the terms of the Eclipse Public License v1.0
#  * which accompanies this distribution, and is available at
#  * http://www.eclipse.org/legal/epl-v10.html
#  *
#  * Contributors:
#  *   Spray Project Team
#  * </copyright>
#  */
# NLS_MESSAGEFORMAT_VAR

pluginName = ADD DESCRIPTION
providerName = Eclipselabs Spray
```
  * Open MANIFEST.MF, change/add entries (exchange 0.3.0 by current development version from other plugins)
```
Bundle-Name: %pluginName
Bundle-Vendor: %providerName
Bundle-Version: 0.3.0.qualifier
Bundle-Localization: plugin
```

## Project Specific Settings ##
To avoid confusion between different platforms and workspaces common settings should be defined as project specific settings. Those settings are checked in and thus shared.

  * _Resource_: Text file encoding: Other / UTF-8
  * _Resource_: New text file delimiter: Other / Unix
  * _Java Code Style -> Formatter_:
    * Check "Enable project specific settings"
    * select Active Profile "`spray_eclipse_formatter`"
  * _Java Editor -> Save Actions_
    * Check "Enable project specific settings"
    * Check "Perform the selected actions on save"
    * Check "Format source code" / "Format all lines"
    * Check "Organize imports"

## Build ##
  * Copy the pom.xml from `org.eclipselabs.spray.generator.graphiti`. Exchange the plugin's name in `<artifactId>org.eclipselabs.spray.generator.graphiti</artifactId>`
  * Open `releng/pom.xml` and add the plugin as additional module