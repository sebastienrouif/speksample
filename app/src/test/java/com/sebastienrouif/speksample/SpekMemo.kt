package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class SpekMemo : Spek({
    val mockContentProvider by memoized {  }
    given("x is 6") {
        val x = 6

        given("y is 7") {
            val y = 7
            on("multiplying x and y") {
                val result = multiply(x, y)
                it("should be 42") {
                    assertThat(result).isEqualTo(42)
                }
            }
        }
    }
})
