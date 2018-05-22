package com.sebastienrouif.speksample

class Square(val sideSize: Float) {
    fun area(): Float {
        return sideSize * sideSize
    }
}

class Rectangle(val side1: Float, val side2: Float) {
    constructor(side: Float) : this(side1 = side, side2 = side)
    fun area(): Float {
        return side1 * side2
    }
}
