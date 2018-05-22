package com.sebastienrouif.speksample.order

import com.sebastienrouif.speksample.AnObject
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class Order3 : Spek({
    val anObject by memoized { AnObject() }
    on("action 1") {
        println("On action 1: $anObject")
        it("checks the object instance") {
            println("Instance: $anObject")
        }
    }
    on("action 2") {
        println("On action 2: $anObject")
        it("checks the object instance again") {
            println("Instance again: $anObject")
        }
    }
})
