package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SimpleTest {
    @Test
    fun test() {
        val square = Square(2f)
        val area = square.area()
        assertThat(area).isEqualTo(4f)
    }
}
