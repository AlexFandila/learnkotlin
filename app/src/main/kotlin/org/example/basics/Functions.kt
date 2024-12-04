package org.example.basics

fun main() {
    fun min(a: Int, b: Int): Int {
        return if(a < b) a else b
    }

    println("Hello world")
    println(max(2, 3))
    println(maxSingle(5, 2))
    println(min(2, 3))
}

// Declaring functions with parameters
fun max(a: Int, b: Int): Int {
    return if(a > b) a else b   // Ternary function
}

// You can declare  at a single line
fun maxSingle(a: Int, b: Int): Int = if(a > b) a else b