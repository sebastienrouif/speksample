package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class SimpleSpek2 : Spek({
    given("a rectangle of 3 by 2") {
        //BLOCK BODY
        val rectangle = Rectangle(3f, 2f)
        on("measuring the area") {
            val area = rectangle.area()

            on("measuring the area") {
                val area = rectangle.area()
                it("should be of 6") {
                    Assertions.assertThat(area).isEqualTo(6f)
                }
            }
        }
    }
})
