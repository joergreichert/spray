# Scope of the DSL(s) #

## What should be described in the DSL? ##
There are some obvious things like mapping notation elements to (EMF) domain objects, containment dependencies, references, tool palette. What else?

## DSL building blocks ##
Into which logical parts can the DSL be devided (like node mapping, shapes, style, ...).

## Language Modularization ##
Do you see the need for several DSLs describing each a single building block, or would it be better to have just one DSL?
Is there a need for a "Core" language and a Runtime Framework specific extension, to enable other runtimes later?

## Additional Requirements ##
  * It should work together with Sphinx (see Sphinx project in Eclipse).
  * Nodes / Edges of the Metamodel should arbitrarily map to a node / edge in the diagram. An example would be a bus topology diagram, where a bus is drawn as a line / polyline but actually maps to a node/Object in the meta-model.

## Target Runtimes ##
  * Graphiti is primary target runtime for first iteration(s)
  * Other target runtimes may be addressed later: Poseidon, GMF, Web, .NET
  * Keep core concepts abstract to be extensible, but pragmatic to realize them


# Loose Requirements / Wish list #

## 1:n mapping for node to domain object ##
  * You have different symbols in UML for a class in a class diagram and in a composite structure diagram. Property representations change for both as well.

  * In AUTOSAR, the graphical representation of a port depends on the
actual meta-type of its associated interface (could be SenderReceiver-
or ClientServer- Interface) (Though this could be done in the shape
drawing).

  * But: "80%"-case is 1:1 mapping

## Map elements from different ecore models to a diagram ##
(Andreas Graf)

Use Case:
Systems Design is done with Sysml -> MetaModel A
SW-Design is done with Autosar -> MM B
Meta-Model to Create References between both -> MM R

Diagram editor to allocate SysML models to Autosar SW-Components:
References three meta-models.

## Xtext Integration for direct editing ##
  * Enable entering detail data with embedded Xtext editors
  * Take Papyrus as example (see [http://5ise.quanxinquanyi.de/2010/06/04/xtext-and-papyrus-uml/ Andreas' blog & screencast)