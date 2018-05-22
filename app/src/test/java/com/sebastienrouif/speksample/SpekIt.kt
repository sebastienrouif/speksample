package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.it

class SpekIt : Spek({
    it("test the truth") {
        Assertions.assertThat(true).isEqualTo(true)
    }
})
