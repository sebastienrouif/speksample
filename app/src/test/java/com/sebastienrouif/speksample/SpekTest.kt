package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class SimpleSpek : Spek({
    given("a rectangle of 2 by 3") {
        //BLOCK BODY
        val rectangle = Rectangle(2f, 3f)
        on("measuring the area") {
            val area = rectangle.area()
            it("should have an area of 6") {
               Assertions.assertThat(area).isEqualTo(6f)
            }
        }
    }
})
