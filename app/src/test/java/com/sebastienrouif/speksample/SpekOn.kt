package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

class SpekOn : Spek({
    on("getting a random number") {
        val random = Math.random()
        it("should be less than 1") {
            assertThat(random).isLessThan(1.0)
        }
        it("should be greater than or equal to 0") {
            assertThat(random).isGreaterThanOrEqualTo(0.0)
        }
        it("should be greater than 100") {
            assertThat(random).isGreaterThan(100.0)
        }
    }
})
