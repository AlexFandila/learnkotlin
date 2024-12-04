package org.example.introduction

// Data class
data class Person(
        val name: String, // Read-Only property (val)
        val age: Int? = null // Nullable type (Int?) - the default value for the argument
)

// Top level function
fun main() {
    // Variable declaration
    val x: Int = 1
    val y = 2

    val persons =
            listOf(
                    Person("Alice", age = 29), // Named argument
                    Person(name = "Bob")
            )

    val oldest =
            persons.maxBy { // Lambda expression
                it.age ?: 0 // Null-coalescing Elvis operator
            }
    println("The oldest is: $oldest") // String template
}

