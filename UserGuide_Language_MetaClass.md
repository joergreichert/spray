# Introduction #

TODO: Describe concept here

# Referencing Ecore Classes #

The `class` keyword is followed by the (qualified) name of an EClass. You can either fully qualify the name of the EClass, or you can import the EClass with an `import` statement before and then just use its simple name.

```
class BusinessDomainDsl.BusinessClass : // full qualified name
```

```
import BusinessDomainDsl.* // wildcard import
import BusinessDomainDsl.BusinessClass // single import

class BusinessClass : // simple name
```

The content assist will propose the names of all known EClasses:

![http://spray.eclipselabs.org.codespot.com/git.wiki/images/userguide/metaclass_eclass.png](http://spray.eclipselabs.org.codespot.com/git.wiki/images/userguide/metaclass_eclass.png)

# Icon #
Following the referenced EClass name an icon representing the class can be defined with the `icon` keyword. The path to the icon is quoted as a string.

```
class BusinessClass icon "ecore/EClass.gif"
```

The specified path is relative to a folder named `icons` in your project. It is checked that the folder `icons` exists in your project. If the specified relative path of the icon file does not exist, a warning will be raised.

The content assist can help you entering the known icon paths. It will also show the icons.

![http://spray.eclipselabs.org.codespot.com/git.wiki/images/userguide/metaclass_image.png](http://spray.eclipselabs.org.codespot.com/git.wiki/images/userguide/metaclass_image.png)

The `icon` folder must be added to the `bin.includes` property of the `build.properties`.
```
...
bin.includes = META-INF/,\
               .,\
               plugin.xml,\
               model/,\
               plugin.properties,\
               icons/
```