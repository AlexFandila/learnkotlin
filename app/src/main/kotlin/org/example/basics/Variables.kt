package org.example.basics

fun main () {
    // val (VALUE): read-only reference. Can be assigned only once.
    // var (VARIABLE): reassignable reference.

    // Declare VALUE specifying type
    val question: String = "Is this a question?"
    val answer: Int = 12

    // Declare variables VALUE specifying the type.
    val q = "Hello?"
    val a = 12

    var c = 0
    c += 1
    // ERROR a += 1

    // We can add because the objects it points is mutable
    val languages = mutableListOf("Java")
    languages.add("Kotlin")

    println(c)
    hello()
}

fun hello() {
    val input = readln()
    val name = if(input.isNotBlank()) input else "Kotlin" // If input is blank print kotlin
    println("Hello, $name!")
}
