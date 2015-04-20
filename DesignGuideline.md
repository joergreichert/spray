# Target Runtime Framework #

The target graphical modeling framework of Spray is Graphiti. Though other runtimes might be possible to describe with the DSLs, this is not the primary goal.

# Reference Implementation #

All proposed features that should be covered by code generation must be also covered by Reference Implementation code. This reference code must be developed in a way that it can be fully generated from Reference Models.

The quality of this reference code is crucial.

# Framework Development #

Although Graphiti has already a strong API it will be necessary to create framework classes also for Spray. The Spray framework API should be developed in a way that it will be potentially proposed to Graphiti as enhancement requests.

The framework layer of Spray should be as small as possible and as large as required.

# Language Development #

The DSLs developed in Spray should follow best practices in Language Design.
  * Keep it simple: creating a simple Graphiti editor should be straightforward and quick to do
  * More advanced features may not break the previous rule.  They should be additive in the sense that you won't see them if yo don't need them.
  * The Spray DSL does not need to enable everything possible with Graphiti. For advanced features, users will always be able to directly use the Graphiti API and combine such handwritten code with generated code.
  * If a language is hard to parse it is also likely hard to understand.
  * Separation of concerns: If different concerns must be described in a DSL, it might require different DSLs

# Code Generation #

  * Code generator is designed to enable mixing generated code with handwritten code without losing the possibility for code generation.
  * Code generator uses the generation gap pattern to give maximum flexibility to mix handwritten code with generated code.

# Testing #

All features of the DSLs will be covered by models that will be tested by unit tests.

# Source Management #

  * Generated sources are **not checked in**
  * The following resources must be added to .gitignore for each plugin
    * src-gen
    * xtend-gen
    * target
    * bin
    * plugin.xml\_gen
  * Experimental features must be added on a branch until stabilized

TO BE CONTINUED