package com.sebastienrouif.speksample.order

import com.sebastienrouif.speksample.AnObject
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

class Order1 : Spek({
    val anObject = AnObject()
    it("checks the object instance") {
        println("Instance: $anObject")
    }
    it("checks the object instance again") {
        println("Instance again: $anObject")
    }
})

