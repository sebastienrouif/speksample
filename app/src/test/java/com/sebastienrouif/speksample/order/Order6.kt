package com.sebastienrouif.speksample.order

import com.sebastienrouif.speksample.AnObject
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it

class Order6 : Spek({
    val anObject by memoized { AnObject() }
    given("given 2") {
        beforeEachTest { println("group 2: $anObject") }
        it("checks the object instance") {
            println("Instance: $anObject")
        }
        it("checks the object instance again") {
            println("Instance again: $anObject")
        }
    }
})
