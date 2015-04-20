# Mapping Semantic / Graphical model #

### Spray 0.1 ###
```
class EClass :
  container (figure="EClassFigure") [...] [...]
```

Discussion:
  * No explicit node
  * 1:1 mapping

### Poseidon: ###
```
node EClassNode {
  metaclass_element: EClass
}
```

Discussion:
  * Explicit node
  * n:1 (node/domain) mapping
  * requirement for: Poseidon, UML, Autosar
  * high repetiveness for the typical 1:1 mappings
  * verbose to map the domain type

### Proposal#1: ###
```
node for EClass [...] // simple mapping for 1:1

node EClassNode1 for EClass [...]
node EClassNode2 for EClass [...] // 1:n mapping, explicit node names

```
Discussion:
  * short when node name is derived from domain object type
  * explicit naming for 1:n case
  * different nodes for same domain object possible



# Connections #
### Spray 0.1 ###
```
connection
[
   from	part
   to	concept
   toText multiplicity
]
```

Discussion:
  * Each connection is owned by the mapped class
  * `from` and `to` are pointing to EReferences of the domain type
  * `toText` is text for `to` side, also text for from side and middle are available
  * Since this is text it should be quoted

### Poseidon: ###
```
edge Arc {
   sources: Place Transition
   targets: Place Transition
   default_name: "An Edge"
}
```

Discussion:
  * Edges are owned in the model and only referenced by nodes
  * source and target are the possible types, not references within the types
  * Only names for the edge, not at the edge ends


### Proposal#1: ###
  * Inlining connections and referencing more abstract connections both make sense.
  * Inlined connections should refer specific EReferences of the given domain object
  * If having multiple nodes for the same domain object it is possible to have a different set of possible connections this way
  * names should be expressions, e.g. it makes sense that the names are computed from the EReference name



# Mapping to shapes / figures #

### Spray 0.1: ###
```
class EClass:
    container (figure = "EClassRectangle")
```
Discussion:
  * figures referenced by name
  * String quotes seem noisy
  * linked to Java types
  * just strings? content assist?

### Poseidon: ###
```
node EClassNode {
  shape: RECTANGLE
} 
```
Discussion:
  * Just discrete types
  * extension difficult

### Proposal#1 ###
```
    container (figure = Rectangle) // library figure
    container (figure = org.eclipselabs.spray.graphiti.example.ecore.shapes.EClassFigure) // qualified name

```
Discussion:
  * use JVM Type References to classes that implement a figure
  * provide Library with common shapes as Spray module project, manual implementation
  * Don't require imports/qualified names for Library figures
  * Classes to scan for shape implementation vary dependent on the runtime. Add lookup hook (for Scoping?) in Spray core and implementation must be added in runtime specific part


# Tool Binding #


# Styles #