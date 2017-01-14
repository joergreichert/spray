This project has been imported from [Google Code](https://code.google.com/archive/a/eclipselabs.org/p/spray/)

![Spray logo](https://cloud.githubusercontent.com/assets/994131/21954906/20f7c4f6-da5f-11e6-9946-5777ae8222dc.png)

A quick way of creating Graphiti

#Introduction
The Graphiti framework is a new approach to create highly sophisticated visual editors on top of the GEF framework. Graphiti can easily be integrated with EMF as the domain modeling framework. The creation of visual editors is done in Java, programming against the Graphiti framework API. It is fairly simple, but yet repetitive, which makes it a candidate to be supported by the means of model-driven development.

Spray aims to provide Domain Specific Languages (DSL) (implemented with Xtext) to describe Visual DSL Editors against the Graphiti runtime, and provide code generation (implemented with Xtend) to create the boilerplate code for realizing the implementation against the Graphiti framework. Potentially the Spray DSL can be used to generate code for other graphical editor frameworks as well, although it is not the primary focus of the project now.

The generated code is structured in such a way that one can always extend/overwrite the generated code with handwritten Java to add advanced Graphiti features that are not supported directly by the Spray DSL. Therefore Spray makes use of the "Generation Gap Pattern".

With the help of the tools created with Spray, Graphiti based diagram editors can be created much faster and reliable than doing it purely by hand.

#Releases
##Spray 0.5.0 (June 2013)
 * [Download](https://storage.googleapis.com/google-code-archive-downloads/v2/eclipselabs.org/spray/spray-0.5.0.zip)
 * [User Guide](https://storage.googleapis.com/google-code-archive-downloads/v2/eclipselabs.org/spray/SprayUserGuide-0.5.0.pdf)
 * [Developer Guide](https://storage.googleapis.com/google-code-archive-downloads/v2/eclipselabs.org/spray/SprayDeveloperGuide-0.5.0.pdf)

Find more documentation [here](https://code.google.com/archive/a/eclipselabs.org/p/spray/downloads).

Note that another open project is also called Spray. Follow the link to get to the https://github.com/spray/spray/wiki'>Spray lightweigt Scala framework for RESTful web services.
