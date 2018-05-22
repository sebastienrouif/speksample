package com.sebastienrouif.speksample

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SimpleTest {
    @Test
    fun areaIs6_when_aRectangleOf2by3() {
        // given
        val rectangle = Rectangle(2f, 3f)
        // when
        val area = rectangle.area()
        // then
        assertThat(area).isEqualTo(1f)
        assertThat(area).isEqualTo(2f)
        assertThat(area).isEqualTo(3f)
        assertThat(area).isEqualTo(6f)
    }

    @Test
    fun test() {
        val rectangle = Rectangle(2f, 3f)
        val area = rectangle.area()
        assertThat(area).isEqualTo(6f)
    }

    @Test
    fun test_square() {
        // given
        val rectangle = Rectangle(2f)
        // when
        val area = rectangle.area()
        // then
        assertThat(area).isEqualTo(4f)
    }

    @Test
    fun test_name() {
        // given
//        setup the context : mocks, parameters ...
        // when
//        action to be tested happens here
        // then
//        assert calls to methods or output values

    }
}
