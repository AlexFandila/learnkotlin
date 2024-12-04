package org.example.basics.choices

/**
 * enum is a soft keyword
 * Soft Keyword: You can use it as a regular name (e.g., for a function, variable name, or parameter)
 */
enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    val rgb = (r * 256 + g) * 256 + b
    fun printColor() = println("$this is $rgb")
}

fun main() {
    println(Color.BLUE.rgb)
    Color.RED.printColor()
    Color.ORANGE.printColor()
    Color.YELLOW.printColor()
    Color.BLUE.printColor()
    Color.INDIGO.printColor()
    Color.VIOLET.printColor()
    Color.GREEN.printColor()

}