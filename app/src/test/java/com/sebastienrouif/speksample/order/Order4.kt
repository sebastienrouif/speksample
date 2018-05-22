package com.sebastienrouif.speksample.order

import com.sebastienrouif.speksample.AnObject
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

class Order4 : Spek({
    val anObject by memoized { AnObject() }
    given("given 1") {
        println("group 1: $anObject")
        it("checks the object instance") {
            println("Instance: $anObject")
        }
    }
    given("given 2") {
        println("group 2: $anObject")
        it("checks the object instance again") {
            println("Instance again: $anObject")
        }
    }
})
