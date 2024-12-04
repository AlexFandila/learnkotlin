package org.example.basics


// Declaring a mutable property (isStudent) in a class
class Person(
    // When a property is declared, the corresponding accessors are declared too
    val name: String,
    var isStudent: Boolean
)

// Custom accesors
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val p = Person("Alex", false)
    val r = Rectangle(2, 3)

    println("Is ${p.name} student? ")
    val response = readln()

    if(response.lowercase() == "yes") {
        p.isStudent = true
    }


    println("My name is ${p.name} I'm ${if(!p.isStudent) "not " else ""}a student")
    println("${r.isSquare}")
}