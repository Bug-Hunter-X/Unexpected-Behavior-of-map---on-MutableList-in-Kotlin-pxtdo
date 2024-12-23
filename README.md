# Unexpected Behavior of map() on MutableList in Kotlin

This example demonstrates a common point of confusion for Kotlin developers familiar with languages where `map` operates in place.  In Kotlin, `map` creates a *new* list containing the transformed elements, leaving the original list unchanged.

The `bug.kt` file contains code that showcases this behavior.  The `bugSolution.kt` provides a corrected approach using `map` with an explicit assignment to modify the original mutable list. 