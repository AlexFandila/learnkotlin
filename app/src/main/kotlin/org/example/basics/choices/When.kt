package org.example.basics.choices

import com.google.common.collect.Collections2

/**
 * When is the equivalent to switch in Java
 */
fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

/**
 * Combining options in one when branch
 */
fun measureColor() = Color.BLUE

fun getWarmthFromSensor(): String {
    return when(val color = measureColor()) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm (red = ${color.r})"
        Color.GREEN -> "neutral(green = ${color.g})"
        Color.BLUE, Color.VIOLET, Color.INDIGO -> "cold (blue = ${color.b})"
    }
}

/**
 * Using the when expression with arbitrary objects
 */
fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty color")
    }

/**
 * Using the when expression without an argument
 */
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
                (c1 == Color.YELLOW && c2 == Color.RED) ->
                    Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                (c1 == Color.BLUE && c2 == Color.YELLOW) ->
                    Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
                (c1 == Color.VIOLET && c2 == Color.BLUE) ->
                    Color.INDIGO

        else -> throw Exception("Dirty")
    }

fun main() {
    println(getMnemonic(Color.BLUE))
    println(getWarmthFromSensor())
    println(mix(Color.BLUE, Color.VIOLET))
    println(mixOptimized(Color.BLUE, Color.YELLOW))
}